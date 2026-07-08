package com.benshikj.ii;

import a2.e;
import android.text.TextUtils;
import android.util.Log;
import com.benshikj.ht.rpc.Im;
import com.dw.util.concurrent.a;
import j$.util.Objects;
import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class IILink {

    /* JADX INFO: renamed from: b */
    private Reason f5057b;
    public final long channelID;

    /* JADX INFO: renamed from: d */
    private int f5059d;

    /* JADX INFO: renamed from: f */
    a2.e f5061f;

    /* JADX INFO: renamed from: g */
    private boolean f5062g;

    /* JADX INFO: renamed from: i */
    private long f5064i;

    /* JADX INFO: renamed from: ii */
    public final II f5065ii;

    /* JADX INFO: renamed from: j */
    private Im.GetChannelMembersResult f5066j;

    /* JADX INFO: renamed from: k */
    private AudioSendThread f5067k;
    public final String name;

    /* JADX INFO: renamed from: a */
    private boolean f5056a = true;

    /* JADX INFO: renamed from: c */
    private LinkStatus f5058c = LinkStatus.Idle;

    /* JADX INFO: renamed from: e */
    private boolean f5060e = true;

    /* JADX INFO: renamed from: h */
    private final HashSet f5063h = new HashSet(0);

    public enum LinkStatus {
        Idle,
        Interrupted,
        Connecting,
        ConnectionFailed,
        Connected,
        Sending;

        public boolean isConnected() {
            return this == Connected || this == Sending;
        }
    }

    public enum Reason {
        UnableToRecord,
        TxTimeout,
        NotInChannel,
        LinkInterrupted,
        ChannelIsOccupied,
        Unauthenticated,
        Unknown
    }

    class a implements e.b {
        a() {
        }

        @Override // a2.e.b
        public void a(LinkStatus linkStatus, Reason reason) {
            IILink.this.m(linkStatus, reason);
        }

        @Override // a2.e.b
        public void b() {
            IILink.this.f5065ii.c();
        }

        @Override // a2.e.b
        public void c(a2.e eVar) {
            if (eVar != IILink.this.f5061f) {
                return;
            }
            if (!eVar.P()) {
                IILink.this.l(LinkStatus.Connecting);
                return;
            }
            IILink.this.reloadOnlineUser();
            IILink.this.l(LinkStatus.Connected);
            IILink.this.f5059d = eVar.D();
        }
    }

    class b implements io.grpc.stub.j {
        b() {
        }

        @Override // io.grpc.stub.j
        /* JADX INFO: renamed from: a */
        public void onNext(Im.GetChannelStatusResult getChannelStatusResult) {
            if (getChannelStatusResult == null || getChannelStatusResult.getUpdateAt() <= 0) {
                return;
            }
            IILink.this.f5064i = getChannelStatusResult.getUpdateAt();
            synchronized (IILink.this.f5063h) {
                IILink.this.f5063h.clear();
                IILink.this.f5063h.addAll(getChannelStatusResult.getOnlineUserList());
            }
            Log.d("IILink", IILink.this.name + ":在线用户[" + TextUtils.join(",", getChannelStatusResult.getOnlineUserList()) + "]");
            IILink iILink = IILink.this;
            iILink.f5065ii.config.callback.onOnlineUserChanged(iILink);
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
            IILink.this.f5065ii.config.callback.onError(th2);
        }
    }

    class c implements io.grpc.stub.j {
        c() {
        }

        @Override // io.grpc.stub.j
        /* JADX INFO: renamed from: a */
        public void onNext(Im.GetChannelMembersResult getChannelMembersResult) {
            IILink.this.f5066j = getChannelMembersResult;
            Log.d("IILink", IILink.this.name + ":loadChannelMembers " + getChannelMembersResult.getMembersList());
            IILink iILink = IILink.this;
            iILink.f5065ii.config.callback.onChannelMembersChanged(iILink);
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
            IILink.this.f5065ii.config.callback.onError(th2);
        }
    }

    public IILink(II ii2, long j10, String str) {
        this.f5065ii = ii2;
        this.channelID = j10;
        Objects.requireNonNull(ii2.config);
        this.f5059d = 32000;
        if (str == null) {
            this.name = String.valueOf(j10);
        } else {
            this.name = str;
        }
    }

    public static /* synthetic */ void a(IILink iILink, com.dw.util.concurrent.a aVar) {
        synchronized (iILink) {
            try {
                if (aVar == iILink.f5061f) {
                    iILink.f5061f = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (iILink.f5062g || iILink.f5065ii.channelManager.get(iILink.channelID) == null || !iILink.getAutoConnect()) {
            return;
        }
        iILink.connect();
    }

    public static /* synthetic */ void b(IILink iILink, com.dw.util.concurrent.a aVar) {
        synchronized (iILink) {
            try {
                if (iILink.f5067k == aVar) {
                    iILink.f5067k = null;
                    if (iILink.f5058c == LinkStatus.Sending) {
                        iILink.f5057b = ((AudioSendThread) aVar).getStopReason();
                    }
                    iILink.l(LinkStatus.Connected);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l(LinkStatus linkStatus) {
        m(linkStatus, null);
    }

    public void m(LinkStatus linkStatus, Reason reason) {
        LinkStatus linkStatus2 = this.f5058c;
        if (linkStatus == linkStatus2 && reason == this.f5057b) {
            return;
        }
        if (reason == null) {
            int iOrdinal = linkStatus2.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 3 || iOrdinal == 4) {
                reason = this.f5057b;
            }
        } else {
            int iOrdinal2 = reason.ordinal();
            if (iOrdinal2 == 2) {
                this.f5060e = false;
                this.f5065ii.channelManager.g(this.channelID);
            } else if (iOrdinal2 == 3 || iOrdinal2 == 5) {
                this.f5060e = false;
            }
        }
        this.f5058c = linkStatus;
        this.f5057b = reason;
        this.f5065ii.config.callback.onLinkStatusChanged(this);
        onLinkStatusChanged(linkStatus2, linkStatus);
    }

    public void configure(NBSS nbss) {
    }

    public void connect() {
        this.f5060e = true;
        a2.e eVar = this.f5061f;
        if (eVar == null || eVar.isCancelled()) {
            a2.e eVar2 = new a2.e(this, this.channelID, this.f5065ii.config.userID);
            this.f5061f = eVar2;
            eVar2.W(this.f5058c == LinkStatus.Sending);
            this.f5061f.Z(new a());
            this.f5061f.addOnStopListener(new a.InterfaceC0105a() { // from class: com.benshikj.ii.k
                @Override // com.dw.util.concurrent.a.InterfaceC0105a
                public final void i(com.dw.util.concurrent.a aVar) {
                    IILink.a(this.f5084a, aVar);
                }
            });
            this.f5061f.Y(this.f5056a);
        }
    }

    public ReceiveDataProcessor createReceiveDataProcessor(boolean z10) {
        return null;
    }

    public Saver createSaver() {
        return null;
    }

    protected void destroy() {
        this.f5062g = true;
        disconnect();
    }

    public void disconnect() {
        a2.e eVar = this.f5061f;
        if (eVar != null) {
            eVar.Z(null);
            this.f5061f.interrupt();
        }
        this.f5061f = null;
        l(LinkStatus.Idle);
    }

    public boolean getAutoConnect() {
        return this.f5060e;
    }

    public int getBitRates() {
        return this.f5059d;
    }

    public Im.GetChannelMembersResult getChannelMembers(boolean z10) {
        if (z10 || this.f5066j == null) {
            Log.d("IILink", this.name + ":start loadChannelMembers");
            this.f5065ii.RPC.getIHTStub().getChannelMembers(Im.GetChannelMembersRequest.newBuilder().setChannelID(this.channelID).build(), new c());
        }
        return this.f5066j;
    }

    public boolean getConnected() {
        return this.f5058c.isConnected();
    }

    public Im.GetChannelConnectionParmResult getConnectionParm() {
        a2.e eVar = this.f5061f;
        if (eVar != null) {
            return eVar.H();
        }
        return null;
    }

    public long getDelay() {
        a2.e eVar = this.f5061f;
        if (eVar == null) {
            return 0L;
        }
        return eVar.I();
    }

    public boolean getIsOwn() {
        Im.UserChannel userChannel = this.f5065ii.channelManager.get(this.channelID);
        return userChannel != null && userChannel.getOwnUserId() == this.f5065ii.config.userID;
    }

    public LinkStatus getLinkStatus() {
        return this.f5058c;
    }

    public Reason getLinkStatusChangeReason() {
        return this.f5057b;
    }

    public boolean getMonitor() {
        return this.f5056a;
    }

    public Long[] getOnlineUser() {
        Long[] lArr;
        synchronized (this.f5063h) {
            lArr = (Long[]) this.f5063h.toArray(new Long[0]);
        }
        return lArr;
    }

    void i(boolean z10) {
        a2.e eVar;
        if (z10 && (eVar = this.f5061f) != null) {
            eVar.R();
        }
    }

    public boolean inRx() {
        a2.e eVar = this.f5061f;
        return eVar != null && eVar.L();
    }

    public boolean isBanBySpeakLevel() {
        a2.e eVar = this.f5061f;
        return eVar != null && eVar.M();
    }

    public boolean isDestroyed() {
        return this.f5062g;
    }

    public boolean isInBan() {
        a2.e eVar = this.f5061f;
        return eVar != null && eVar.O();
    }

    public boolean isReadyTx() {
        a2.e eVar;
        return this.f5067k == null && (eVar = this.f5061f) != null && eVar.P();
    }

    void j(long j10) {
        synchronized (this.f5063h) {
            try {
                if (this.f5063h.remove(Long.valueOf(j10))) {
                    this.f5065ii.config.callback.onOnlineUserChanged(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    void k(long j10) {
        synchronized (this.f5063h) {
            try {
                if (this.f5063h.add(Long.valueOf(j10))) {
                    this.f5065ii.config.callback.onOnlineUserChanged(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onDelayChanged() {
    }

    protected void onLinkStatusChanged(LinkStatus linkStatus, LinkStatus linkStatus2) {
    }

    public void reloadOnlineUser() {
        this.f5065ii.RPC.getIHTStub().getChannelStatus(Im.GetChannelStatusRequest.newBuilder().setChannelID(this.channelID).setUpdateAt(this.f5064i).build(), new b());
    }

    public boolean sendCom(int i10) {
        a2.e eVar = this.f5061f;
        if (eVar == null) {
            return false;
        }
        return eVar.S(i10);
    }

    public void sendHeartbeat() {
        a2.e eVar = this.f5061f;
        if (eVar == null) {
            return;
        }
        eVar.U();
    }

    public void setInForward(boolean z10) {
        this.f5061f.V(z10);
    }

    public void setMonitor(boolean z10) {
        if (z10 == this.f5056a) {
            return;
        }
        this.f5056a = z10;
        a2.e eVar = this.f5061f;
        if (eVar != null) {
            eVar.Y(z10);
        }
    }

    public boolean startTransmission(AudioSendThread audioSendThread) {
        if (!getConnected()) {
            return false;
        }
        AudioSendThread audioSendThread2 = this.f5067k;
        if (audioSendThread2 != null && audioSendThread2.isAlive() && !audioSendThread2.isCancelled()) {
            return false;
        }
        this.f5067k = audioSendThread;
        audioSendThread.start();
        audioSendThread.addOnStopListener(new a.InterfaceC0105a() { // from class: com.benshikj.ii.l
            @Override // com.dw.util.concurrent.a.InterfaceC0105a
            public final void i(com.dw.util.concurrent.a aVar) {
                IILink.b(this.f5085a, aVar);
            }
        });
        l(LinkStatus.Sending);
        return true;
    }

    public void stopTransmission() {
        AudioSendThread audioSendThread = this.f5067k;
        if (audioSendThread != null) {
            audioSendThread.cancel();
        }
        this.f5067k = null;
        if (this.f5058c == LinkStatus.Sending) {
            l(LinkStatus.Connected);
        }
    }

    public boolean write(byte[] bArr, int i10, int i11, long j10) {
        a2.e eVar = this.f5061f;
        if (eVar == null) {
            return false;
        }
        if (!eVar.N()) {
            if (this.f5058c == LinkStatus.Sending) {
                m(LinkStatus.Connected, Reason.ChannelIsOccupied);
                stopTransmission();
            }
            return false;
        }
        if (i10 == 0 && bArr.length == i11) {
            eVar.T(bArr, j10);
            return true;
        }
        eVar.T(Arrays.copyOfRange(bArr, i10, i11 + i10), j10);
        return true;
    }
}
