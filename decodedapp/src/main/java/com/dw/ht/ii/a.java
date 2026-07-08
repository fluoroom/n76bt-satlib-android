package com.dw.ht.ii;

import a6.q;
import a6.w;
import android.location.Location;
import android.text.TextUtils;
import com.benshikj.ht.rpc.Im;
import com.benshikj.ii.AudioPlayer;
import com.benshikj.ii.CallBack;
import com.benshikj.ii.Configuration;
import com.benshikj.ii.II;
import com.benshikj.ii.IIException;
import com.benshikj.ii.IILink;
import com.benshikj.ii.ReceiveStatus;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.ii.a;
import com.dw.ht.k0;
import com.dw.ht.user.a;
import com.google.protobuf.l;
import d5.g;
import d5.k;
import qb.z0;
import rd.m;
import u4.d0;
import u4.z;
import v4.i0;
import v4.l1;
import v4.r1;
import v4.u;
import w5.d;
import w5.h;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f6328a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static II f6329b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: com.dw.ht.ii.a$a, reason: collision with other inner class name */
    public static final class EnumC0091a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final EnumC0091a f6330a = new EnumC0091a("ChannelChanged", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final EnumC0091a f6331b = new EnumC0091a("CurrentLinkChanged", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final EnumC0091a f6332c = new EnumC0091a("LinkStatusChanged", 2);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final EnumC0091a f6333d = new EnumC0091a("OnlineUserChanged", 3);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final EnumC0091a f6334e = new EnumC0091a("MembersChanged", 4);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final /* synthetic */ EnumC0091a[] f6335f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kd.a f6336g;

        static {
            EnumC0091a[] enumC0091aArrA = a();
            f6335f = enumC0091aArrA;
            f6336g = kd.b.a(enumC0091aArrA);
        }

        private EnumC0091a(String str, int i10) {
        }

        private static final /* synthetic */ EnumC0091a[] a() {
            return new EnumC0091a[]{f6330a, f6331b, f6332c, f6333d, f6334e};
        }

        public static EnumC0091a valueOf(String str) {
            return (EnumC0091a) Enum.valueOf(EnumC0091a.class, str);
        }

        public static EnumC0091a[] values() {
            return (EnumC0091a[]) f6335f.clone();
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IILink f6337a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final EnumC0091a f6338b;

        public b(IILink iILink, EnumC0091a enumC0091a) {
            m.e(iILink, "link");
            m.e(enumC0091a, "event");
            this.f6337a = iILink;
            this.f6338b = enumC0091a;
        }

        public final EnumC0091a a() {
            return this.f6338b;
        }

        public final IILink b() {
            return this.f6337a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return m.a(this.f6337a, bVar.f6337a) && this.f6338b == bVar.f6338b;
        }

        public int hashCode() {
            return (this.f6337a.hashCode() * 31) + this.f6338b.hashCode();
        }

        public String toString() {
            return "LinkEvent(link=" + this.f6337a + ", event=" + this.f6338b + ')';
        }
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6339a;

        static {
            int[] iArr = new int[Im.Message.Type.values().length];
            try {
                iArr[Im.Message.Type.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Im.Message.Type.AFSK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6339a = iArr;
        }
    }

    public static final class d implements CallBack {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final z0.h f6340a = z0.h.e("access_token", z0.f24834e);

        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(z0 z0Var, d dVar, String str) {
            if (str != null) {
                z0Var.o(dVar.f6340a, str);
            }
        }

        @Override // com.benshikj.ii.CallBack
        public void applyRequestMetadata(final z0 z0Var) {
            m.e(z0Var, "headers");
            z0Var.p(this.f6340a);
            com.dw.ht.user.a.i(Main.f5555g).d(new a.b() { // from class: u4.x
                @Override // com.dw.ht.user.a.b
                public final void a(String str) {
                    a.d.b(z0Var, this, str);
                }
            });
        }

        @Override // com.benshikj.ii.CallBack
        public AudioPlayer createAudioPlayer() {
            i0 i0VarB = i0.F.b();
            if (i0VarB != null && i0VarB.F().l()) {
                i0VarB.n();
            }
            return com.benshikj.ii.a.b(this);
        }

        @Override // com.benshikj.ii.CallBack
        public IILink createLink(II ii2, long j10) {
            m.e(ii2, "ii");
            Im.UserChannel userChannel = ii2.channelManager.get(j10);
            if (userChannel == null) {
                return null;
            }
            z zVar = new z(ii2, j10, userChannel.getName());
            u.w().D(zVar.s());
            return zVar;
        }

        @Override // com.benshikj.ii.CallBack
        public boolean isCanPlay() {
            return k0.e();
        }

        @Override // com.benshikj.ii.CallBack
        public void onChannelChanged(II ii2) {
            m.e(ii2, "ii");
            d0.t();
            mi.c.e().m(u.c.CurrentLinkChanged);
        }

        @Override // com.benshikj.ii.CallBack
        public void onChannelConnectionParmLoaded(long j10, Im.GetChannelConnectionParmResult getChannelConnectionParmResult) {
            m.e(getChannelConnectionParmResult, "parm");
            Im.RfChannelFields rfCh = getChannelConnectionParmResult.getRfCh();
            if (rfCh == null || rfCh.getRxFreq() <= 0) {
                return;
            }
            u.w().J(j10, rfCh);
        }

        @Override // com.benshikj.ii.CallBack
        public void onChannelMembersChanged(IILink iILink) {
            m.e(iILink, "link");
            mi.c.e().m(new b(iILink, EnumC0091a.f6334e));
        }

        @Override // com.benshikj.ii.CallBack
        public void onCurrentLinkChanged(II ii2, IILink iILink) {
            m.e(ii2, "ii");
            mi.c.e().m(EnumC0091a.f6331b);
        }

        @Override // com.benshikj.ii.CallBack
        public void onError(Throwable th2) {
            m.e(th2, "t");
            s3.b.e("III", "err", th2);
            IIException iIException = th2 instanceof IIException ? (IIException) th2 : null;
            if (iIException == null || iIException.error != IIException.Error.RPCCoreError) {
                return;
            }
            f5.d.f12792a.k();
        }

        @Override // com.benshikj.ii.CallBack
        public void onLinkCreated(II ii2, IILink iILink) {
            m.e(ii2, "ii");
            m.e(iILink, "link");
        }

        @Override // com.benshikj.ii.CallBack
        public void onLinkStatusChanged(IILink iILink) {
            m.e(iILink, "link");
            mi.c.e().m(new b(iILink, EnumC0091a.f6332c));
            g.s(iILink.name + ':' + iILink.getLinkStatus());
        }

        @Override // com.benshikj.ii.CallBack
        public void onMessageReceived(Im.ReceiveMessageResult receiveMessageResult) {
            m.e(receiveMessageResult, "msg");
            a.f6328a.b(receiveMessageResult);
        }

        @Override // com.benshikj.ii.CallBack
        public void onOnlineUserChanged(IILink iILink) {
            m.e(iILink, "link");
            mi.c.e().m(new b(iILink, EnumC0091a.f6333d));
        }

        @Override // com.benshikj.ii.CallBack
        public void onReceiveStatusChanged(ReceiveStatus receiveStatus) {
            m.e(receiveStatus, "status");
            mi.c.e().m(receiveStatus);
        }
    }

    private a() {
    }

    public static final II a() {
        return f6329b;
    }

    private final void c(l1 l1Var) {
        if (l1Var == null) {
            return;
        }
        Location locationB = o5.g.f23195s.b(Main.f5555g);
        if (locationB != null) {
            l1Var.K0(locationB, 100000, true, true);
            return;
        }
        d.c cVar = new d.c();
        com.dw.ht.user.b bVar = com.dw.ht.user.b.f6853a;
        l1Var.O0(cVar.k(bVar.c().E()).i(bVar.c().w()).c());
    }

    public static final void d(II ii2) {
        if (m.a(f6329b, ii2)) {
            return;
        }
        II ii3 = f6329b;
        f6329b = ii2;
        if (ii3 != null) {
            ii3.destroy();
        }
        IIService.INSTANCE.c();
    }

    public static final synchronized void e() {
        try {
            Configuration.DEBUG = false;
            Configuration.inAndroid = true;
            d(null);
            long jI = com.dw.ht.user.b.f6853a.i();
            if (k.a(jI)) {
                Configuration.Builder channel = new Configuration.Builder().setUrl(Cfg.O().getRPCServerUrl()).setChannel(f5.d.f12792a.b());
                channel.setAccessToken("0", jI).setUserAgent("com.benshikj.ht", "2.9.2.1");
                String str = Cfg.O().bearer;
                if (str != null && str.length() > 0) {
                    channel.setBearer(str);
                }
                if (Cfg.O().testUseLocalServer) {
                    channel.setOverrideAuthority("rpc.benshikj.com");
                }
                channel.setCallBack(new d());
                d(new II(channel.build()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void b(Im.ReceiveMessageResult receiveMessageResult) {
        Im.Message data;
        l raw;
        byte[] bArrC;
        r1 r1Var;
        m.e(receiveMessageResult, "msg");
        s3.b.b("III", "rx msg: " + receiveMessageResult);
        if (receiveMessageResult.getData().hasUserStatus()) {
            l1 l1VarL = u.w().l(receiveMessageResult.getTarget() + 28147497671065500L);
            if (l1VarL == null) {
                return;
            }
            Im.UserStatus userStatus = receiveMessageResult.getData().getUserStatus();
            if (userStatus.getOnline()) {
                l1VarL.G0(userStatus.getUserID());
            } else {
                l1VarL.F0(userStatus.getUserID());
            }
        }
        com.dw.ht.user.b bVar = com.dw.ht.user.b.f6853a;
        if (bVar.i() == receiveMessageResult.getSource() && bVar.i() != 0 && receiveMessageResult.getSourceType() == Im.IdentifyType.UserID) {
            return;
        }
        Im.Message.Type type = receiveMessageResult.getData().getType();
        int i10 = type == null ? -1 : c.f6339a[type.ordinal()];
        if (i10 == 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("rx text: ");
            l raw2 = receiveMessageResult.getData().getRaw();
            sb2.append(raw2 != null ? raw2.N() : null);
            s3.b.b("III", sb2.toString());
            return;
        }
        if (i10 == 2 && (data = receiveMessageResult.getData()) != null && (raw = data.getRaw()) != null && (bArrC = raw.C()) != null && receiveMessageResult.getTargetType() == Im.IdentifyType.GroupID && receiveMessageResult.getSourceType() == Im.IdentifyType.UserID) {
            try {
                l1 l1VarY = u.w().y(receiveMessageResult.getTarget() + 28147497671065500L);
                h hVarJ = h.j(bArrC, 0, bArrC.length);
                if (l1VarY != null && (r1Var = l1VarY.f29946d) != null) {
                    r1Var.j(hVarJ, 0, receiveMessageResult.getSource(), bArrC, null);
                }
                if (bVar.c().h() && (hVarJ instanceof w5.d)) {
                    String strW = bVar.c().w();
                    if (((w5.d) hVarJ).r() == d.a.Check) {
                        if (((w5.d) hVarJ).f31264x > 0) {
                            if (((w5.d) hVarJ).f31264x == bVar.i()) {
                                c(l1VarY);
                            }
                        } else {
                            if (w.b(((w5.d) hVarJ).f31263w) || TextUtils.isEmpty(strW) || !q.d(((w5.d) hVarJ).f31263w, strW)) {
                                return;
                            }
                            c(l1VarY);
                        }
                    }
                }
            } catch (w5.g e10) {
                e10.printStackTrace();
            }
        }
    }
}
