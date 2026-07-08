package com.dw.ht.entitys;

import a6.q;
import com.benshikj.ht.rpc.Im;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import io.objectbox.annotation.Entity;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\b\b\u0002\u0010\r\u001a\u00020\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016B\u0019\b\u0016\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010\"\u001a\u00020\t2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b(\u0010'J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010*J\u001a\u0010,\u001a\u00020\t2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b,\u0010-R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010%\"\u0004\b0\u00101R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010.\u001a\u0004\b2\u0010%\"\u0004\b3\u00101R\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010.\u001a\u0004\b4\u0010%\"\u0004\b5\u00101R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010.\u001a\u0004\b6\u0010%\"\u0004\b7\u00101R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u00108\u001a\u0004\b9\u0010'\"\u0004\b:\u0010;R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010<\u001a\u0004\bA\u0010>\"\u0004\bB\u0010@R\"\u0010\f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010<\u001a\u0004\bC\u0010>\"\u0004\bD\u0010@R\"\u0010\r\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010<\u001a\u0004\bE\u0010>\"\u0004\bF\u0010@R\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010G\u001a\u0004\bH\u0010*\"\u0004\bI\u0010JR\"\u0010\u0010\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010G\u001a\u0004\bK\u0010*\"\u0004\bL\u0010JR\"\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010G\u001a\u0004\bM\u0010*\"\u0004\bN\u0010JR\"\u0010\u0012\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010G\u001a\u0004\bO\u0010*\"\u0004\bP\u0010JR\"\u0010\u0013\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010G\u001a\u0004\bQ\u0010*\"\u0004\bR\u0010JR\"\u0010\u0014\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010<\u001a\u0004\bS\u0010>\"\u0004\bT\u0010@R\u0013\u0010X\u001a\u0004\u0018\u00010U8F¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0011\u0010Z\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\bY\u0010%¨\u0006["}, d2 = {"Lcom/dw/ht/entitys/IIChannel;", "", "", Name.MARK, "userId", "ownUserId", "channelId", "", "name", "", "monitor", "autoConnect", "ban", "isAdmin", "", "txFreq", "rxFreq", "txSubAudio", "rxSubAudio", "bandwidth", "haveNewMessage", "<init>", "(JJJJLjava/lang/String;ZZZZIIIIIZ)V", "Lcom/benshikj/ht/rpc/Im$UserChannel;", "channel", "(Lcom/benshikj/ht/rpc/Im$UserChannel;J)V", "Lcom/benshikj/ht/rpc/Im$RfChannelFields;", "ch", "x", "(Lcom/benshikj/ht/rpc/Im$RfChannelFields;)Z", "z", "(Lcom/benshikj/ht/rpc/Im$UserChannel;)Z", "Lcom/benshikj/ht/rpc/Im$GetChannelConnectionParmResult;", "ccp", "y", "(Lcom/benshikj/ht/rpc/Im$GetChannelConnectionParmResult;)Z", "a", "()J", "b", "()Ljava/lang/String;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "i", "v", "(J)V", "r", "setUserId", "l", "setOwnUserId", "f", "setChannelId", "Ljava/lang/String;", "k", "setName", "(Ljava/lang/String;)V", "Z", "j", "()Z", "w", "(Z)V", "c", "t", "d", "setBan", "s", "setAdmin", "I", "p", "setTxFreq", "(I)V", "n", "setRxFreq", "q", "setTxSubAudio", "o", "setRxSubAudio", "e", "setBandwidth", "h", "u", "Lg5/d;", "m", "()Lg5/d;", "rfCh", "g", "deviceId", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@Entity
public final /* data */ class IIChannel {
    private boolean autoConnect;
    private boolean ban;
    private int bandwidth;
    private long channelId;
    private boolean haveNewMessage;
    private long id;
    private boolean isAdmin;
    private boolean monitor;
    private String name;
    private long ownUserId;
    private int rxFreq;
    private int rxSubAudio;
    private int txFreq;
    private int txSubAudio;
    private long userId;

    public IIChannel() {
        this(0L, 0L, 0L, 0L, null, false, false, false, false, 0, 0, 0, 0, 0, false, 32767, null);
    }

    private final boolean x(Im.RfChannelFields ch2) {
        if (ch2 == null) {
            z = this.rxFreq > 0;
            this.txFreq = 0;
            this.rxFreq = 0;
            this.txSubAudio = 0;
            this.rxSubAudio = 0;
            this.bandwidth = 0;
            return z;
        }
        if (this.txFreq == ch2.getTxFreq() && this.rxFreq == ch2.getRxFreq() && this.txSubAudio == ch2.getTxSubAudio() && this.rxSubAudio == ch2.getRxSubAudio() && this.bandwidth == ch2.getBandwidth()) {
            z = false;
        }
        this.txFreq = ch2.getTxFreq();
        this.rxFreq = ch2.getRxFreq();
        this.txSubAudio = ch2.getTxSubAudio();
        this.rxSubAudio = ch2.getRxSubAudio();
        this.bandwidth = ch2.getBandwidth();
        return z;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getOwnUserId() {
        return this.ownUserId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAutoConnect() {
        return this.autoConnect;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getBan() {
        return this.ban;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getBandwidth() {
        return this.bandwidth;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IIChannel)) {
            return false;
        }
        IIChannel iIChannel = (IIChannel) other;
        return this.id == iIChannel.id && this.userId == iIChannel.userId && this.ownUserId == iIChannel.ownUserId && this.channelId == iIChannel.channelId && m.a(this.name, iIChannel.name) && this.monitor == iIChannel.monitor && this.autoConnect == iIChannel.autoConnect && this.ban == iIChannel.ban && this.isAdmin == iIChannel.isAdmin && this.txFreq == iIChannel.txFreq && this.rxFreq == iIChannel.rxFreq && this.txSubAudio == iIChannel.txSubAudio && this.rxSubAudio == iIChannel.rxSubAudio && this.bandwidth == iIChannel.bandwidth && this.haveNewMessage == iIChannel.haveNewMessage;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getChannelId() {
        return this.channelId;
    }

    public final long g() {
        return this.channelId + 28147497671065500L;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getHaveNewMessage() {
        return this.haveNewMessage;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((o4.a.a(this.id) * 31) + o4.a.a(this.userId)) * 31) + o4.a.a(this.ownUserId)) * 31) + o4.a.a(this.channelId)) * 31) + this.name.hashCode()) * 31) + o4.b.a(this.monitor)) * 31) + o4.b.a(this.autoConnect)) * 31) + o4.b.a(this.ban)) * 31) + o4.b.a(this.isAdmin)) * 31) + this.txFreq) * 31) + this.rxFreq) * 31) + this.txSubAudio) * 31) + this.rxSubAudio) * 31) + this.bandwidth) * 31) + o4.b.a(this.haveNewMessage);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getMonitor() {
        return this.monitor;
    }

    public final String k() {
        return this.name;
    }

    public final long l() {
        return this.ownUserId;
    }

    public final g5.d m() {
        if (this.rxFreq <= 0) {
            return null;
        }
        g5.d dVar = new g5.d();
        dVar.f13551b = this.rxFreq;
        dVar.f13550a = this.txFreq;
        dVar.f13553d = this.rxSubAudio;
        dVar.f13552c = this.txSubAudio;
        dVar.f13554e = this.bandwidth;
        return dVar;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int getRxFreq() {
        return this.rxFreq;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final int getRxSubAudio() {
        return this.rxSubAudio;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final int getTxFreq() {
        return this.txFreq;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final int getTxSubAudio() {
        return this.txSubAudio;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsAdmin() {
        return this.isAdmin;
    }

    public final void t(boolean z10) {
        this.autoConnect = z10;
    }

    public String toString() {
        return "IIChannel(id=" + this.id + ", userId=" + this.userId + ", ownUserId=" + this.ownUserId + ", channelId=" + this.channelId + ", name=" + this.name + ", monitor=" + this.monitor + ", autoConnect=" + this.autoConnect + ", ban=" + this.ban + ", isAdmin=" + this.isAdmin + ", txFreq=" + this.txFreq + ", rxFreq=" + this.rxFreq + ", txSubAudio=" + this.txSubAudio + ", rxSubAudio=" + this.rxSubAudio + ", bandwidth=" + this.bandwidth + ", haveNewMessage=" + this.haveNewMessage + ')';
    }

    public final void u(boolean z10) {
        this.haveNewMessage = z10;
    }

    public final void v(long j10) {
        this.id = j10;
    }

    public final void w(boolean z10) {
        this.monitor = z10;
    }

    public final boolean y(Im.GetChannelConnectionParmResult ccp) {
        m.e(ccp, "ccp");
        boolean zX = x(ccp.getRfCh());
        if (ccp.getAuth().getIsAdmin() == this.isAdmin) {
            return zX;
        }
        this.isAdmin = ccp.getAuth().getIsAdmin();
        return true;
    }

    public final boolean z(Im.UserChannel channel) {
        boolean z10;
        m.e(channel, "channel");
        if (q.d(this.name, channel.getName())) {
            z10 = false;
        } else {
            String name = channel.getName();
            m.d(name, "getName(...)");
            this.name = name;
            z10 = true;
        }
        if (this.channelId != channel.getChannelId()) {
            this.channelId = channel.getChannelId();
            z10 = true;
        }
        if (this.ownUserId != channel.getOwnUserId()) {
            this.ownUserId = channel.getOwnUserId();
            z10 = true;
        }
        if (this.isAdmin != channel.getAuth().getIsAdmin()) {
            this.isAdmin = channel.getAuth().getIsAdmin();
            z10 = true;
        }
        if (this.ban != channel.getAuth().getBan()) {
            this.ban = channel.getAuth().getBan();
            z10 = true;
        }
        if (x(channel.getRf())) {
            return true;
        }
        return z10;
    }

    public IIChannel(long j10) {
        this(j10, 0L, 0L, 0L, null, false, false, false, false, 0, 0, 0, 0, 0, false, 32766, null);
    }

    public IIChannel(long j10, long j11) {
        this(j10, j11, 0L, 0L, null, false, false, false, false, 0, 0, 0, 0, 0, false, 32764, null);
    }

    public IIChannel(long j10, long j11, long j12) {
        this(j10, j11, j12, 0L, null, false, false, false, false, 0, 0, 0, 0, 0, false, 32760, null);
    }

    public IIChannel(long j10, long j11, long j12, long j13) {
        this(j10, j11, j12, j13, null, false, false, false, false, 0, 0, 0, 0, 0, false, 32752, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IIChannel(long j10, long j11, long j12, long j13, String str) {
        this(j10, j11, j12, j13, str, false, false, false, false, 0, 0, 0, 0, 0, false, 32736, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IIChannel(long j10, long j11, long j12, long j13, String str, boolean z10) {
        this(j10, j11, j12, j13, str, z10, false, false, false, 0, 0, 0, 0, 0, false, 32704, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IIChannel(long j10, long j11, long j12, long j13, String str, boolean z10, boolean z11) {
        this(j10, j11, j12, j13, str, z10, z11, false, false, 0, 0, 0, 0, 0, false, 32640, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IIChannel(long j10, long j11, long j12, long j13, String str, boolean z10, boolean z11, boolean z12) {
        this(j10, j11, j12, j13, str, z10, z11, z12, false, 0, 0, 0, 0, 0, false, 32512, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IIChannel(long j10, long j11, long j12, long j13, String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this(j10, j11, j12, j13, str, z10, z11, z12, z13, 0, 0, 0, 0, 0, false, 32256, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IIChannel(long j10, long j11, long j12, long j13, String str, boolean z10, boolean z11, boolean z12, boolean z13, int i10) {
        this(j10, j11, j12, j13, str, z10, z11, z12, z13, i10, 0, 0, 0, 0, false, 31744, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IIChannel(long j10, long j11, long j12, long j13, String str, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11) {
        this(j10, j11, j12, j13, str, z10, z11, z12, z13, i10, i11, 0, 0, 0, false, 30720, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IIChannel(long j10, long j11, long j12, long j13, String str, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, int i12) {
        this(j10, j11, j12, j13, str, z10, z11, z12, z13, i10, i11, i12, 0, 0, false, 28672, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IIChannel(long j10, long j11, long j12, long j13, String str, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, int i12, int i13) {
        this(j10, j11, j12, j13, str, z10, z11, z12, z13, i10, i11, i12, i13, 0, false, 24576, null);
        m.e(str, "name");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IIChannel(long j10, long j11, long j12, long j13, String str, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, int i12, int i13, int i14) {
        this(j10, j11, j12, j13, str, z10, z11, z12, z13, i10, i11, i12, i13, i14, false, 16384, null);
        m.e(str, "name");
    }

    public IIChannel(long j10, long j11, long j12, long j13, String str, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, int i12, int i13, int i14, boolean z14) {
        m.e(str, "name");
        this.id = j10;
        this.userId = j11;
        this.ownUserId = j12;
        this.channelId = j13;
        this.name = str;
        this.monitor = z10;
        this.autoConnect = z11;
        this.ban = z12;
        this.isAdmin = z13;
        this.txFreq = i10;
        this.rxFreq = i11;
        this.txSubAudio = i12;
        this.rxSubAudio = i13;
        this.bandwidth = i14;
        this.haveNewMessage = z14;
    }

    public /* synthetic */ IIChannel(long j10, long j11, long j12, long j13, String str, boolean z10, boolean z11, boolean z12, boolean z13, int i10, int i11, int i12, int i13, int i14, boolean z14, int i15, rd.h hVar) {
        this((i15 & 1) != 0 ? 0L : j10, (i15 & 2) != 0 ? 0L : j11, (i15 & 4) != 0 ? 0L : j12, (i15 & 8) == 0 ? j13 : 0L, (i15 & 16) != 0 ? "" : str, (i15 & 32) != 0 ? true : z10, (i15 & 64) == 0 ? z11 : true, (i15 & 128) != 0 ? false : z12, (i15 & 256) != 0 ? false : z13, (i15 & WXMediaMessage.TITLE_LENGTH_LIMIT) != 0 ? 0 : i10, (i15 & WXMediaMessage.DESCRIPTION_LENGTH_LIMIT) != 0 ? 0 : i11, (i15 & 2048) != 0 ? 0 : i12, (i15 & 4096) != 0 ? 0 : i13, (i15 & 8192) != 0 ? 0 : i14, (i15 & 16384) != 0 ? false : z14);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public IIChannel(Im.UserChannel userChannel, long j10) {
        this(0L, j10, 0L, 0L, null, false, false, false, false, 0, 0, 0, 0, 0, false, 32764, null);
        m.e(userChannel, "channel");
        z(userChannel);
    }
}
