package v4;

import android.content.ContentUris;
import android.graphics.Bitmap;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import com.dw.ht.Cfg;
import com.dw.ht.HTService;
import com.dw.ht.entitys.ChannelBond;
import com.dw.ht.entitys.IIChannel;
import com.dw.sbc.SbcDecoder;
import com.dw.util.concurrent.a;
import com.facebook.stetho.websocket.CloseCodes;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.IOException;
import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import org.msgpack.core.MessagePack;
import v4.d;
import v4.l1;
import v4.s0;
import x5.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class s0 extends Thread implements r0 {
    private static final boolean K = false;
    private static final AtomicInteger L = new AtomicInteger();
    private long A;
    long B;
    private long C;
    private long D;
    private boolean E;
    private e F;
    private d G;
    private final Handler H;
    private long I;
    private final Runnable J;

    /* JADX INFO: renamed from: a */
    protected final c0 f30106a;

    /* JADX INFO: renamed from: b */
    private final byte[] f30107b;

    /* JADX INFO: renamed from: c */
    private final x5.a f30108c;

    /* JADX INFO: renamed from: d */
    private final a.C0426a f30109d;

    /* JADX INFO: renamed from: e */
    private final byte[] f30110e;

    /* JADX INFO: renamed from: f */
    private final short[] f30111f;

    /* JADX INFO: renamed from: g */
    private final short[] f30112g;

    /* JADX INFO: renamed from: h */
    private final l1.d f30113h;

    /* JADX INFO: renamed from: r */
    private int f30114r;

    /* JADX INFO: renamed from: s */
    private m5.d f30115s;

    /* JADX INFO: renamed from: t */
    private int f30116t;

    /* JADX INFO: renamed from: u */
    private boolean f30117u;

    /* JADX INFO: renamed from: v */
    private SbcDecoder f30118v;

    /* JADX INFO: renamed from: w */
    private v4.d f30119w;

    /* JADX INFO: renamed from: x */
    private c f30120x;

    /* JADX INFO: renamed from: y */
    private boolean f30121y;

    /* JADX INFO: renamed from: z */
    private volatile int f30122z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!s0.this.isAlive()) {
                if (s0.K) {
                    s3.b.h("IHT", "发送:心跳-退出");
                }
            } else {
                if (s0.this.G == null && s0.this.F == null) {
                    if (s0.K) {
                        s3.b.h("IHT", "发送:心跳-取消");
                        return;
                    }
                    return;
                }
                s0.this.I = System.currentTimeMillis();
                boolean zV0 = s0.this.f30106a.V0((short) 5);
                if (s0.K) {
                    if (zV0) {
                        s3.b.h("IHT", "发送:心跳-成功");
                    } else {
                        s3.b.n("IHT", "发送:心跳-失败");
                    }
                }
                s0.this.H.postDelayed(s0.this.J, 1000L);
            }
        }
    }

    static class b {

        /* JADX INFO: renamed from: b */
        final c0 f30125b;

        /* JADX INFO: renamed from: d */
        boolean f30127d;

        /* JADX INFO: renamed from: e */
        m5.h f30128e;

        /* JADX INFO: renamed from: f */
        m5.b f30129f;

        /* JADX INFO: renamed from: i */
        private boolean f30132i;

        /* JADX INFO: renamed from: g */
        b6.d f30130g = new b6.d(32000);

        /* JADX INFO: renamed from: h */
        final Object f30131h = new Object();

        /* JADX INFO: renamed from: a */
        final long f30124a = System.currentTimeMillis();

        /* JADX INFO: renamed from: c */
        volatile int f30126c = 0;

        b(c0 c0Var) {
            this.f30125b = c0Var;
            if (!Cfg.h0()) {
                this.f30128e = null;
                return;
            }
            m5.h hVar = new m5.h();
            this.f30128e = hVar;
            hVar.start();
        }

        public void a() {
            this.f30127d = true;
            m5.h hVar = this.f30128e;
            if (hVar != null) {
                hVar.discard();
            }
            this.f30128e = null;
            m5.b bVar = this.f30129f;
            if (bVar != null) {
                bVar.T();
            }
        }

        void b() {
            synchronized (this.f30131h) {
                this.f30132i = true;
                this.f30131h.wait();
            }
        }

        public void c(short[] sArr, int i10, int i11) {
            this.f30126c += i11;
            if (this.f30132i) {
                synchronized (this.f30131h) {
                    this.f30131h.notifyAll();
                    this.f30132i = false;
                }
            }
            m5.h hVar = this.f30128e;
            if (hVar != null) {
                hVar.write(sArr, i10, i11);
            }
            m5.b bVar = this.f30129f;
            if (bVar != null) {
                bVar.S(sArr, i10, i11);
                return;
            }
            b6.d dVar = this.f30130g;
            if (dVar == null || dVar.o(sArr, i10, i11) == i11) {
                return;
            }
            s3.b.n("IHT", "转发送缓存满");
        }
    }

    private static class c extends l {
        short[] H;
        int I;
        int J;

        public c(l1 l1Var) {
            super(l1Var, "AudioRelay");
            this.H = new short[960000];
        }

        @Override // v4.l
        protected boolean L() {
            return true;
        }

        public void O(short[] sArr, int i10, int i11) {
            int i12 = this.I;
            int i13 = i12 + i11;
            short[] sArr2 = this.H;
            if (i13 > sArr2.length) {
                return;
            }
            System.arraycopy(sArr, i10, sArr2, i12, i11);
            this.I += i11;
        }

        @Override // v4.l
        protected int read(short[] sArr, int i10, int i11) {
            int i12 = this.I - this.J;
            if (i12 <= 0) {
                return -1;
            }
            int iMin = Math.min(i12, i11);
            if (iMin == 0) {
                return 0;
            }
            System.arraycopy(this.H, this.J, sArr, i10, iMin);
            this.J += iMin;
            return iMin;
        }
    }

    static class d extends b {

        /* JADX INFO: renamed from: j */
        private Bitmap f30133j;

        /* JADX INFO: renamed from: k */
        private boolean f30134k;

        /* JADX INFO: renamed from: l */
        final kc.b f30135l;

        d(final c0 c0Var) {
            super(c0Var);
            this.f30135l = hc.g.c(c0Var).e(jc.a.a()).d(new mc.d() { // from class: v4.t0
                @Override // mc.d
                public final Object apply(Object obj) {
                    return s0.d.e((c0) obj);
                }
            }).e(zc.a.b()).d(new mc.d() { // from class: v4.u0
                @Override // mc.d
                public final Object apply(Object obj) {
                    return s0.d.f(this.f30171a, c0Var, (c0) obj);
                }
            }).e(jc.a.a()).i(new mc.c() { // from class: v4.v0
                @Override // mc.c
                public final void accept(Object obj) {
                    s0.d.d(this.f30218a, c0Var, (n1) obj);
                }
            }, new mc.c() { // from class: v4.w0
                @Override // mc.c
                public final void accept(Object obj) {
                    s0.d.g(this.f30227a, (Throwable) obj);
                }
            });
        }

        public static /* synthetic */ void d(d dVar, c0 c0Var, n1 n1Var) {
            if (dVar.f30127d) {
                return;
            }
            m5.b bVar = new m5.b(n1Var, c0Var.getName() + "->" + n1Var.getName(), 0);
            dVar.f30130g = null;
            if (!n1Var.B1(bVar)) {
                bVar.cancel();
                bVar = null;
            }
            dVar.f30129f = bVar;
            if (!dVar.f30127d || bVar == null) {
                return;
            }
            bVar.cancel();
        }

        public static /* synthetic */ c0 e(c0 c0Var) {
            if (!c0Var.n()) {
                c0Var.v(false);
            }
            return c0Var;
        }

        public static /* synthetic */ n1 f(d dVar, c0 c0Var, c0 c0Var2) {
            dVar.getClass();
            do {
                int iB2 = c0Var2.b2();
                if (iB2 >= 0) {
                    ChannelBond channelBondK1 = c0Var2.K1(iB2);
                    if (channelBondK1 == null || !channelBondK1.getRouting()) {
                        throw new IllegalStateException("信道" + iB2 + "没有绑定网络信道或者绑定没有配置为中继模式");
                    }
                    IIChannel iIChannelK = u4.d0.k(channelBondK1.getNetworkChannelId());
                    if (iIChannelK == null || !(iIChannelK.getIsAdmin() || com.dw.ht.user.b.f6853a.i() == iIChannelK.l())) {
                        throw new IllegalStateException("用户不是此网络信道的管理员或所有者");
                    }
                    n1 n1VarA2 = c0Var2.a2();
                    if (n1VarA2 == null) {
                        throw new IllegalStateException("用户应该已经退出此网络信道");
                    }
                    n1VarA2.L(false);
                    while (!n1VarA2.i()) {
                        n1VarA2.r1(10L);
                        if (dVar.f30127d) {
                            throw new IllegalStateException("等待网络信道连接时已经退出");
                        }
                    }
                    int i10 = c0Var.f29760k0;
                    r rVarQ1 = c0Var.Q1(i10);
                    if (i10 == c0Var.Y().f29919h && rVarQ1 != null && !rVarQ1.f30073r && rVarQ1.f30066b != rVarQ1.f30065a && SystemClock.elapsedRealtime() - c0Var.f29759j0 < 1000) {
                        while ((dVar.f30126c * CloseCodes.NORMAL_CLOSURE) / 32000 < 2000) {
                            dVar.b();
                        }
                    }
                    return n1VarA2;
                }
                c0Var2.r1(10L);
            } while (!dVar.f30127d);
            throw new IllegalStateException("等待设备控制连接时已经退出");
        }

        public static /* synthetic */ void g(d dVar, Throwable th2) {
            dVar.f30130g = null;
            if (s0.K) {
                if (th2 instanceof IllegalStateException) {
                    s3.b.b("IHT", th2.getLocalizedMessage());
                } else {
                    th2.printStackTrace();
                }
            }
        }

        @Override // v4.s0.b
        public void a() {
            if (s0.K) {
                s3.b.b("IHT", String.format(Locale.getDefault(), "丢弃数据:音频%ds", Integer.valueOf((this.f30126c * CloseCodes.NORMAL_CLOSURE) / 32000)));
            }
            this.f30135l.dispose();
            super.a();
        }

        boolean k(d.a aVar) {
            int i10 = (this.f30126c * CloseCodes.NORMAL_CLOSURE) / 32000;
            c0 c0Var = this.f30125b;
            int i11 = c0Var.f29760k0;
            r rVarQ1 = c0Var.Q1(i11);
            return i10 < 1000 && aVar.b().length == 0 && aVar.a().length == 0 && i11 == this.f30125b.Y().f29919h && rVarQ1 != null && !rVarQ1.f30073r && rVarQ1.f30066b != rVarQ1.f30065a && SystemClock.elapsedRealtime() - this.f30125b.f29759j0 < 1000;
        }

        public void l(d.a aVar, boolean z10) {
            this.f30127d = true;
            this.f30135l.dispose();
            m5.b bVar = this.f30129f;
            if (bVar != null) {
                bVar.T();
            }
            if (k(aVar)) {
                if (s0.K) {
                    s3.b.b("IHT", "丢弃中继回输");
                }
                m5.h hVar = this.f30128e;
                if (hVar != null) {
                    hVar.discard();
                    return;
                }
                return;
            }
            r rVarV1 = this.f30125b.V1();
            if (rVarV1 != null && rVarV1.A && Cfg.O().isMuteNoSave()) {
                m5.h hVar2 = this.f30128e;
                if (hVar2 != null) {
                    hVar2.discard();
                }
                this.f30128e = null;
            }
            c0 c0Var = this.f30125b;
            new y(c0Var, c0Var.c0(), this.f30128e, (int) ((((long) this.f30126c) * 1000) / 32000), (this.f30134k || z10) ? System.currentTimeMillis() : this.f30124a, this.f30125b.q(), 0L, this.f30133j, aVar.b(), aVar.c(), aVar.a()).execute(new Void[0]);
            if (s0.K) {
                s3.b.b("IHT", String.format(Locale.getDefault(), "保存数据:音频%dms", Integer.valueOf((this.f30126c * CloseCodes.NORMAL_CLOSURE) / 32000)));
            }
        }
    }

    static class e extends b {

        /* JADX INFO: renamed from: j */
        private final kc.b f30136j;

        /* JADX INFO: renamed from: k */
        private boolean f30137k;

        e(final c0 c0Var) {
            super(c0Var);
            this.f30136j = hc.g.c(c0Var).e(jc.a.a()).d(new mc.d() { // from class: v4.x0
                @Override // mc.d
                public final Object apply(Object obj) {
                    return s0.e.f((c0) obj);
                }
            }).e(zc.a.b()).d(new mc.d() { // from class: v4.y0
                @Override // mc.d
                public final Object apply(Object obj) {
                    return s0.e.e(this.f30261a, (c0) obj);
                }
            }).e(jc.a.a()).i(new mc.c() { // from class: v4.z0
                @Override // mc.c
                public final void accept(Object obj) {
                    s0.e.h(this.f30293a, c0Var, (n1) obj);
                }
            }, new mc.c() { // from class: v4.a1
                @Override // mc.c
                public final void accept(Object obj) {
                    s0.e.d(this.f29685a, (Throwable) obj);
                }
            });
        }

        public static /* synthetic */ void d(e eVar, Throwable th2) {
            eVar.f30130g = null;
            if (s0.K) {
                s3.b.b("IHT", th2.getLocalizedMessage());
            }
        }

        public static /* synthetic */ n1 e(e eVar, c0 c0Var) {
            eVar.getClass();
            do {
                int iF2 = c0Var.f2(false);
                if (iF2 >= 0) {
                    n1 n1VarE2 = c0Var.e2();
                    if (n1VarE2 == null) {
                        throw new IllegalStateException("发射信道(" + iF2 + ")没有绑定网络信道");
                    }
                    n1VarE2.L(false);
                    while (!n1VarE2.i()) {
                        n1VarE2.r1(10L);
                        if (eVar.f30137k) {
                            throw new IllegalStateException("等待网络信道连接时已经退出");
                        }
                    }
                    return n1VarE2;
                }
                c0Var.r1(10L);
            } while (!eVar.f30137k);
            throw new IllegalStateException("等待设备控制连接时已经退出");
        }

        public static /* synthetic */ c0 f(c0 c0Var) {
            if (!c0Var.n()) {
                c0Var.v(false);
            }
            return c0Var;
        }

        public static /* synthetic */ void h(e eVar, c0 c0Var, final n1 n1Var) {
            if (eVar.f30137k) {
                return;
            }
            m5.b bVar = new m5.b(n1Var, c0Var.getName() + "->" + n1Var.getName(), 0);
            eVar.f30130g = null;
            if (n1Var.n1(bVar, true)) {
                mi.c.e().m(new l0(n1Var, 0));
                bVar.addOnStopListener(new a.InterfaceC0105a() { // from class: v4.b1
                    @Override // com.dw.util.concurrent.a.InterfaceC0105a
                    public final void i(com.dw.util.concurrent.a aVar) {
                        mi.c.e().m(new l0(n1Var, 1));
                    }
                });
            } else {
                bVar.cancel();
                bVar = null;
            }
            eVar.f30129f = bVar;
            if (!eVar.f30137k || bVar == null) {
                return;
            }
            bVar.cancel();
        }

        @Override // v4.s0.b
        public void a() {
            this.f30136j.dispose();
            super.a();
        }

        public void i(c0 c0Var) {
            this.f30137k = true;
            this.f30136j.dispose();
            m5.b bVar = this.f30129f;
            if (bVar != null) {
                bVar.T();
            }
            r rVarX1 = c0Var.X1();
            Uri uriO = d5.g.o(c0Var.q(), rVarX1 != null ? rVarX1.A() : 0, 3, this.f30124a, (this.f30126c * CloseCodes.NORMAL_CLOSURE) / 32000, null, null, null);
            m5.h hVar = this.f30128e;
            if (hVar != null) {
                if (uriO != null) {
                    hVar.r(ContentUris.parseId(uriO));
                } else {
                    hVar.discard();
                }
                this.f30128e = null;
            }
        }
    }

    public s0(c0 c0Var) {
        super("IHT:" + L.incrementAndGet() + ":" + c0Var.getName());
        byte[] bArr = new byte[4096];
        this.f30107b = bArr;
        this.f30108c = new x5.a(bArr.length * 2);
        this.f30109d = new a.C0426a();
        this.f30110e = new byte[2048];
        this.f30111f = new short[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
        this.f30112g = new short[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
        this.B = 0L;
        this.H = new Handler(Looper.getMainLooper());
        this.J = new a();
        if (K) {
            s3.b.b("IHT", "new : " + getName());
        }
        this.f30106a = c0Var;
        this.f30114r = c0Var.f29946d.l();
        this.f30113h = c0Var.e0();
    }

    private void h(boolean z10) {
        if (this.E == z10) {
            return;
        }
        this.E = z10;
        if (K) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("mute:");
            sb2.append(z10 ? 1 : 0);
            sb2.append(" isCanPlay:");
            sb2.append(com.dw.ht.k0.e() ? 1 : 0);
            sb2.append(" isRadioEnable:");
            sb2.append(com.dw.ht.o.d().k() ? 1 : 0);
            sb2.append(" isImmediatelyPlay:");
            sb2.append(this.f30106a.p0() ? 1 : 0);
            sb2.append(" isSSTVDetected:");
            sb2.append((this.f30106a.u() == null && this.f30106a.u().l()) ? 1 : 0);
            sb2.append(" lastMuteTime:");
            sb2.append(SystemClock.elapsedRealtime() - this.C);
            s3.b.b("IHT", sb2.toString());
        }
    }

    private boolean j() {
        a.C0426a c0426a = this.f30109d;
        int i10 = c0426a.f31651c ? 2 : 0;
        if (c0426a.f31650b - i10 < 2) {
            if (K) {
                s3.b.d("IHT", "最短的数据应该有2字节(短消息)");
            }
            return false;
        }
        byte[] bArr = c0426a.f31652d;
        int i11 = (bArr[i10 + 1] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i10] & MessagePack.Code.EXT_TIMESTAMP) << 8);
        if (i11 == 1) {
            s();
        } else if (i11 == 4) {
            if (K) {
                s3.b.h("IHT", "COM: TX_STOP");
            }
            this.f30116t = 0;
            if (this.F != null) {
                if (Cfg.h0()) {
                    this.F.i(this.f30106a);
                } else {
                    this.F.a();
                }
                this.F = null;
            }
        } else {
            if (i11 == 6) {
                if (K) {
                    s3.b.h("IHT", "COM: PONG 心跳延迟:" + (System.currentTimeMillis() - this.I) + "ms");
                }
                return false;
            }
            s3.b.b("IHT", "COM: " + i11);
        }
        return true;
    }

    private boolean k(boolean z10) {
        a.C0426a c0426a = this.f30109d;
        int i10 = c0426a.f31650b;
        if (i10 <= 2) {
            return false;
        }
        int i11 = c0426a.f31651c ? 2 : 0;
        int iB = this.f30118v.b(c0426a.f31652d, i11, i10 - i11, this.f30110e);
        if (iB == 0) {
            return false;
        }
        if (K && this.f30116t != iB) {
            int i12 = iB / 2;
            s3.b.b("IHT", String.format(Locale.getDefault(), "SBC数据:%d,PCM数据:%d,PCM样本:%d,音频时长:%.1fms，压缩比%d%%", Integer.valueOf(this.f30109d.f31650b - i11), Integer.valueOf(iB), Integer.valueOf(i12), Float.valueOf((i12 * 1000.0f) / 32000.0f), Integer.valueOf(((this.f30109d.f31650b - i11) * 100) / iB)));
            this.f30116t = iB;
        }
        p(this.f30111f, 0, w3.b.g(this.f30110e, 0, iB, this.f30111f, 0, w3.d.PCM_16BIT_BE), z10);
        this.D += (long) (this.f30109d.f31650b - i11);
        return true;
    }

    private boolean l() {
        a.C0426a c0426a = this.f30109d;
        if (c0426a.f31650b <= 2) {
            return false;
        }
        int i10 = c0426a.f31651c ? 2 : 0;
        if (this.F == null) {
            this.F = new e(this.f30106a);
            t();
        }
        SbcDecoder sbcDecoder = this.f30118v;
        a.C0426a c0426a2 = this.f30109d;
        int iB = sbcDecoder.b(c0426a2.f31652d, i10, c0426a2.f31650b - i10, this.f30110e);
        if (iB == 0) {
            return false;
        }
        if (K && this.f30116t != iB) {
            int i11 = iB / 2;
            s3.b.b("IHT", String.format(Locale.getDefault(), "SBC数据:%d,PCM数据:%d,PCM样本:%d,音频时长:%.1fms，压缩比%d%%", Integer.valueOf(this.f30109d.f31650b - i10), Integer.valueOf(iB), Integer.valueOf(i11), Float.valueOf((i11 * 1000.0f) / 32000.0f), Integer.valueOf(((this.f30109d.f31650b - i10) * 100) / iB)));
            this.f30116t = iB;
        }
        this.F.c(this.f30111f, 0, w3.b.g(this.f30110e, 0, iB, this.f30111f, 0, w3.d.PCM_16BIT_BE));
        return true;
    }

    private boolean q() {
        a.C0426a c0426a;
        int i10;
        boolean zK;
        boolean z10 = K;
        if (z10) {
            this.B = SystemClock.elapsedRealtime();
        }
        int iR = r(this.f30107b);
        if (iR <= 0) {
            return false;
        }
        if (z10) {
            s3.b.h("IHT", "接收:" + iR + "字节\t等待时间:" + (SystemClock.elapsedRealtime() - this.B) + "ms");
        }
        if (z10 && iR == this.f30107b.length) {
            s3.b.d("IHT", "接收受阻" + iR);
        }
        if (this.f30108c.f(this.f30107b, 0, iR) != iR && z10) {
            s3.b.d("IHT", "缓冲不够大");
        }
        boolean z11 = false;
        while (true) {
            int iA = this.f30108c.a();
            if (!this.f30108c.e(this.f30109d) || (i10 = (c0426a = this.f30109d).f31650b) == 0) {
                break;
            }
            int i11 = c0426a.f31649a;
            if (c0426a.f31651c) {
                if (i10 >= 2) {
                    byte[] bArr = c0426a.f31652d;
                    i11 = (bArr[1] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[0] & MessagePack.Code.EXT_TIMESTAMP) << 8);
                } else if (K) {
                    s3.b.d("IHT", "无数据头:" + i10 + " 丢弃数据:" + (iA - this.f30108c.a()));
                }
            }
            if (i11 != 0) {
                if (i11 == 1) {
                    zK = j();
                } else if (i11 != 2) {
                    if (i11 != 3) {
                        if (i11 != 7) {
                            if (i11 == 9) {
                                if (K) {
                                    s3.b.b("IHT", "MSG: AUDIO_TX");
                                }
                                zK = l();
                            } else if (K) {
                                s3.b.d("IHT", "未知数据:" + i11 + " 丢弃数据:" + (iA - this.f30108c.a()));
                            }
                        } else if (K && i10 >= 6) {
                            byte[] bArr2 = c0426a.f31652d;
                            if (((bArr2[3] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr2[2] & MessagePack.Code.EXT_TIMESTAMP) << 8)) != 0) {
                                s3.b.b("IHT", "未知调试信息");
                            } else {
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append("RX:");
                                byte[] bArr3 = this.f30109d.f31652d;
                                sb2.append((bArr3[5] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr3[4] & MessagePack.Code.EXT_TIMESTAMP) << 8));
                                sb2.append("(byte)");
                                s3.b.b("IHT", sb2.toString());
                            }
                        }
                    }
                } else if (K) {
                    s3.b.b("IHT", "MSG: RESPONSE");
                }
                z11 |= zK;
            }
            if (K) {
                s3.b.b("IHT", "MSG: AUDIO");
            }
            zK = k(i11 == 3);
            z11 |= zK;
        }
        if (z11) {
            boolean zD2 = this.f30106a.D2();
            if (K) {
                if (zD2) {
                    s3.b.h("IHT", "发送:响应-成功");
                } else {
                    s3.b.n("IHT", "发送:响应-失败");
                }
            }
        }
        return true;
    }

    @Override // v4.r0
    public void f() {
        this.f30117u = true;
    }

    protected void i() {
        while (q()) {
        }
    }

    @Override // v4.r0
    public boolean m(w5.h hVar) {
        v4.d dVar;
        if (this.G == null || (dVar = this.f30119w) == null) {
            return false;
        }
        dVar.f(hVar);
        return true;
    }

    public boolean n() {
        return (this.F == null && this.G == null) ? false : true;
    }

    @Override // v4.r0
    public void o() throws Throwable {
        d dVar = this.G;
        if (dVar == null || dVar.f30133j == null) {
            return;
        }
        d5.g.t(this.f30106a.q(), this.f30106a.c0(), 1, dVar.f30133j);
        dVar.f30133j = null;
        dVar.f30134k = true;
    }

    protected void p(short[] sArr, int i10, int i11, boolean z10) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z11 = false;
        if (this.G == null) {
            if (!com.dw.ht.o.d().k() || !com.dw.ht.o.d().f()) {
                com.dw.ht.o.d().h().k(this.f30106a);
            }
            this.C = 0L;
            this.D = 0L;
            this.A = jElapsedRealtime;
            this.G = new d(this.f30106a);
            t();
            this.f30114r = this.f30106a.f29946d.l();
            if (HTService.g()) {
                mi.c.e().m(new p4.b(this.f30106a.D, 1));
            }
            c cVar = this.f30120x;
            if (cVar != null) {
                cVar.I = 0;
            } else if (this.f30106a.c2().f29694i) {
                this.f30120x = new c(this.f30106a);
            }
        }
        if (z10) {
            this.C = jElapsedRealtime;
        }
        this.G.c(sArr, i10, i11);
        c cVar2 = this.f30120x;
        if (cVar2 != null) {
            cVar2.O(sArr, i10, i11);
        }
        if (this.f30121y) {
            int i12 = this.f30122z;
            for (int i13 = i10; i13 < i11 + i10; i13++) {
                short s10 = sArr[i13];
                if (i12 < s10) {
                    i12 = s10;
                }
            }
            this.f30122z = i12;
        }
        if (HTService.g()) {
            mi.c.e().m(new p4.b(this.f30106a.D, Arrays.copyOfRange(sArr, i10, i11)));
        }
        l1.d dVar = this.f30113h;
        if (dVar != null && dVar.a(sArr, i10, i11) != i11) {
            s3.b.d("IHT", "sstv 解码缓存满");
        }
        this.f30119w.b(sArr, i10, i11);
        if (!com.dw.ht.k0.e() || !com.dw.ht.o.d().k() || !this.f30106a.p0()) {
            h(true);
            return;
        }
        long j10 = jElapsedRealtime - this.C;
        if (z10 || jElapsedRealtime - this.A < 30 || j10 < 150 || (this.f30106a.n0() && this.f30106a.t0())) {
            z11 = true;
        }
        m5.d dVar2 = this.f30115s;
        if (z11) {
            sArr = this.f30112g;
        }
        if (dVar2.write(sArr, i10, i11) != i11) {
            s3.b.d("IHT", "音频输出缓存不够");
        }
        h(z11);
    }

    protected abstract int r(byte[] bArr);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [v4.s0$e] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        String string = "exit: ";
        this.f30106a.z0();
        Process.setThreadPriority(-16);
        Thread.currentThread().setPriority(10);
        if (AudioTrack.getMinBufferSize(32000, 4, 2) <= 0) {
            return;
        }
        boolean z10 = K;
        if (z10) {
            s3.b.b("IHT", "start: " + getName());
        }
        m5.d dVar = new m5.d(getName(), 64000);
        this.f30115s = dVar;
        dVar.z(1);
        this.f30115s.start();
        this.f30119w = new v4.d(32000);
        this.f30118v = new SbcDecoder(true);
        boolean z11 = 0;
        z11 = 0;
        z11 = 0;
        try {
            try {
                i();
                this.f30119w.g();
                this.f30118v.e();
                this.f30115s.cancel();
                this.f30106a.O(false);
                d dVar2 = this.G;
                if (dVar2 != null) {
                    dVar2.a();
                    this.G = null;
                }
                z11 = this.F;
                if (z11 != 0) {
                    z11.a();
                    this.F = null;
                }
                if (z10) {
                    s3.b.b("IHT", "exit: " + getName());
                }
            } catch (IOException | InterruptedException e10) {
                e10.printStackTrace();
            }
        } finally {
            this.f30119w.g();
            this.f30118v.e();
            this.f30115s.cancel();
            this.f30106a.O(z11);
            d dVar3 = this.G;
            if (dVar3 != null) {
                dVar3.a();
                this.G = null;
            }
            e eVar = this.F;
            if (eVar != null) {
                eVar.a();
                this.F = null;
            }
            if (K) {
                s3.b.b("IHT", string + getName());
            }
        }
    }

    protected void s() {
        c cVar;
        if (HTService.g()) {
            mi.c.e().m(new p4.b(this.f30106a.D, 2));
        }
        if (this.f30106a.u() != null) {
            this.f30106a.u().m();
        }
        boolean z10 = K;
        if (z10) {
            s3.b.h("IHT", "COM:STOP");
            s3.b.h("IHT", "音频带宽：" + ((int) (this.D / ((SystemClock.elapsedRealtime() - this.A) / 1000.0d))) + "bytes/s");
        }
        this.f30116t = 0;
        this.f30115s.v();
        if (this.G != null) {
            d.a aVarI = this.f30119w.i();
            int iL = this.f30106a.f29946d.l();
            if (this.f30117u || iL == this.f30114r || Cfg.u() != 0) {
                this.G.l(aVarI, this.f30117u);
            } else {
                this.G.a();
            }
            this.f30117u = false;
            if (this.f30106a.c2().f29694i && (cVar = this.f30120x) != null && cVar.I > 32000 && !this.G.k(aVarI)) {
                c cVar2 = this.f30120x;
                cVar2.J = 0;
                this.f30106a.n1(cVar2, true);
            }
            this.G = null;
        }
        this.f30120x = null;
        if (z10) {
            s3.b.h("IHT", "COM:STOP_EXIT");
        }
    }

    @Override // p3.b.a
    public int w() {
        m5.d dVar;
        if (Cfg.f5482d && (dVar = this.f30115s) != null) {
            return dVar.w();
        }
        this.f30121y = true;
        int i10 = this.f30122z;
        this.f30122z = 0;
        return i10;
    }

    private void t() {
    }
}
