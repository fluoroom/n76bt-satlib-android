package a2;

import android.os.SystemClock;
import android.util.Log;
import androidx.appcompat.widget.RtlSpacingHelper;
import cd.m;
import cd.o;
import com.benshikj.ht.rpc.Im;
import com.benshikj.ii.AudioPlayer;
import com.benshikj.ii.Configuration;
import com.benshikj.ii.GRPC;
import com.benshikj.ii.Heartbeat;
import com.benshikj.ii.II;
import com.benshikj.ii.IILink;
import com.benshikj.ii.NBSS;
import com.benshikj.ii.ReceiveDataProcessor;
import com.benshikj.ii.ReceiveStatus;
import com.benshikj.ii.Saver;
import com.dw.audio.codec.OpusDecoder;
import com.dw.grpc.Error;
import com.facebook.stetho.websocket.CloseCodes;
import dd.d0;
import io.grpc.stub.j;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.net.DatagramSocket;
import java.util.Collection;
import java.util.Hashtable;
import rd.b0;
import rd.y;

/* JADX INFO: loaded from: classes.dex */
public final class e extends com.dw.util.concurrent.a implements m {
    private volatile int A;
    private volatile boolean B;
    private boolean C;
    private b D;
    private cd.e E;
    private Im.GetChannelConnectionParmResult F;
    private boolean G;
    private boolean H;
    private boolean I;
    private boolean J;
    private final Object K;
    private final Hashtable L;
    private int M;
    private int N;
    private long O;
    private boolean P;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final IILink f166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f169h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final byte[] f170r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final NBSS f171s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private a f172t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f173u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f174v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f175w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private volatile long f176x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private volatile long f177y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private volatile long f178z;

    private final class a extends o {
        public a(DatagramSocket datagramSocket, DatagramSocket datagramSocket2) {
            super(datagramSocket, datagramSocket2, "CH" + e.this.F());
        }

        public final void o() {
            this.f4643q.d();
        }

        public final void p() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (e.this.f176x == 0) {
                e.this.f176x = jElapsedRealtime;
            }
            e.this.f177y = jElapsedRealtime;
            n(e.this.f170r);
        }
    }

    public interface b {
        void a(IILink.LinkStatus linkStatus, IILink.Reason reason);

        void b();

        void c(e eVar);
    }

    public static final class c extends a2.a implements AudioPlayer {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private final int f179w;

        public c(String str, int i10, int i11) {
            super(str, i10);
            this.f179w = i11;
            x(0);
        }

        @Override // com.benshikj.ii.AudioPlayer
        public void close() {
            cancel();
        }

        @Override // a2.a
        protected int v() {
            return this.f179w;
        }
    }

    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f180a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReceiveDataProcessor f181b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private AudioPlayer f182c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final OpusDecoder f183d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final short[] f184e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f185f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Saver f187h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f188i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f189j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f190k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f191l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f192m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f193n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f194o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private long f195p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private NBSS f196q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private byte[] f197r;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f186g = SystemClock.elapsedRealtime();

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f198s = true;

        public d(long j10, ReceiveDataProcessor receiveDataProcessor) {
            this.f180a = j10;
            this.f181b = receiveDataProcessor;
            this.f183d = new OpusDecoder(e.this.G().SAMPLE_RATE, 0);
            this.f184e = new short[e.this.G().SAMPLE_RATE];
            e.this.f166e.f5065ii.config.callback.onReceiveStatusChanged(new ReceiveStatus(j10, e.this.F(), true, this.f197r, null, e.this.K()));
        }

        private final void f(boolean z10, int i10) {
            if (z10) {
                if (this.f182c == null) {
                    AudioPlayer audioPlayerCreateAudioPlayer = e.this.J().config.callback.createAudioPlayer();
                    this.f182c = audioPlayerCreateAudioPlayer;
                    if (audioPlayerCreateAudioPlayer == null) {
                        c cVar = new c("player:" + this.f180a, e.this.G().SAMPLE_RATE * 2, e.this.G().SAMPLE_RATE);
                        cVar.start();
                        this.f182c = cVar;
                    }
                }
                AudioPlayer audioPlayer = this.f182c;
                if (audioPlayer == null || audioPlayer.write(this.f184e, 0, i10) != i10) {
                    Log.e(e.this.f169h, "音频输出缓存不够");
                }
            }
            if (this.f187h == null) {
                this.f187h = e.this.f166e.createSaver();
                this.f188i = System.currentTimeMillis();
                this.f185f = 0;
            }
            this.f185f += i10;
            this.f186g = SystemClock.elapsedRealtime();
        }

        private final void g() {
            try {
                int i10 = (this.f185f * CloseCodes.NORMAL_CLOSURE) / e.this.G().SAMPLE_RATE;
                Saver saver = this.f187h;
                if (saver != null) {
                    saver.save(e.this.F(), i10, this.f196q);
                }
            } finally {
                Saver saver2 = this.f187h;
                if (saver2 != null) {
                    saver2.discard();
                }
                this.f187h = null;
            }
        }

        public final int a() {
            NBSS nbss = this.f196q;
            if (nbss != null) {
                return nbss.CallPriority;
            }
            return 0;
        }

        public final long b() {
            return this.f180a;
        }

        public final boolean c(long j10) {
            boolean z10 = j10 - this.f186g > 1000;
            Log.d(e.this.f169h, "isNeedStop:" + z10);
            return z10;
        }

        public final boolean d() {
            return this.f189j;
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0120  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final synchronized void e(cd.c r33, boolean r34) {
            /*
                Method dump skipped, instruction units count: 650
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: a2.e.d.e(cd.c, boolean):void");
        }

        public final void h() {
            synchronized (this) {
                if (this.f189j) {
                    return;
                }
                this.f189j = true;
                d0 d0Var = d0.f10897a;
                ReceiveDataProcessor receiveDataProcessor = this.f181b;
                if (receiveDataProcessor != null) {
                    receiveDataProcessor.finish();
                }
                g();
                AudioPlayer audioPlayer = this.f182c;
                if (audioPlayer != null) {
                    audioPlayer.close();
                }
                try {
                    this.f183d.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
                e.this.f166e.f5065ii.config.callback.onReceiveStatusChanged(new ReceiveStatus(this.f180a, e.this.F(), false, this.f197r, this.f196q, e.this.K()));
            }
        }
    }

    /* JADX INFO: renamed from: a2.e$e, reason: collision with other inner class name */
    public static final /* synthetic */ class C0004e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f200a;

        static {
            int[] iArr = new int[Error.Code.values().length];
            try {
                iArr[Error.Code.Unauthenticated.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Error.Code.InvalidArgument.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Error.Code.Unavailable.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f200a = iArr;
        }
    }

    public static final class f implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b0 f201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f203c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0 f204d;

        f(b0 b0Var, y yVar, Object obj, b0 b0Var2) {
            this.f201a = b0Var;
            this.f202b = yVar;
            this.f203c = obj;
            this.f204d = b0Var2;
        }

        @Override // io.grpc.stub.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Im.GetChannelConnectionParmResult getChannelConnectionParmResult) {
            this.f201a.f25935a = getChannelConnectionParmResult;
            this.f202b.f25960a = true;
            Object obj = this.f203c;
            synchronized (obj) {
                obj.notifyAll();
                d0 d0Var = d0.f10897a;
            }
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
            this.f202b.f25960a = true;
            Object obj = this.f203c;
            synchronized (obj) {
                obj.notifyAll();
                d0 d0Var = d0.f10897a;
            }
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
            this.f204d.f25935a = th2;
            this.f202b.f25960a = true;
            Object obj = this.f203c;
            synchronized (obj) {
                obj.notifyAll();
                d0 d0Var = d0.f10897a;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(IILink iILink, long j10, long j11) {
        super("II CH:" + j10);
        rd.m.e(iILink, "link");
        this.f166e = iILink;
        this.f167f = j10;
        this.f168g = j11;
        this.f174v = true;
        this.B = true;
        this.K = new Object();
        this.L = new Hashtable();
        this.M = RtlSpacingHelper.UNDEFINED;
        this.f169h = "II CH:" + j10;
        NBSS nbss = new NBSS();
        this.f171s = nbss;
        nbss.Uid = j11;
        Heartbeat heartbeat = new Heartbeat();
        heartbeat.U = j11;
        heartbeat.I = ((G().heartbeatInterval / CloseCodes.NORMAL_CLOSURE) * 2) + 8;
        byte[] bArrPack = heartbeat.pack();
        rd.m.d(bArrPack, "pack(...)");
        byte[] bArr = new byte[bArrPack.length + 1];
        this.f170r = bArr;
        System.arraycopy(bArrPack, 0, bArr, 1, bArrPack.length);
        start();
    }

    private final int C() {
        Hashtable hashtable = this.L;
        int iMax = RtlSpacingHelper.UNDEFINED;
        for (d dVar : DesugarCollections.bridge_synchronizedCollection(hashtable.values(), hashtable)) {
            rd.m.b(dVar);
            if (!dVar.d()) {
                iMax = Math.max(iMax, dVar.a());
            }
        }
        int i10 = this.M;
        if (i10 != iMax) {
            Log.d(this.f169h, "MaxRxCallPriority:" + i10 + "->" + iMax);
            this.M = iMax;
        }
        return iMax;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Configuration G() {
        Configuration configuration = this.f166e.f5065ii.config;
        rd.m.d(configuration, "config");
        return configuration;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final II J() {
        II ii2 = this.f166e.f5065ii;
        rd.m.d(ii2, "ii");
        return ii2;
    }

    private final void Q() throws InterruptedException {
        Log.d(this.f169h, "link");
        a aVar = this.f172t;
        rd.m.b(aVar);
        aVar.o();
        b0 b0Var = new b0();
        b0 b0Var2 = new b0();
        Object obj = new Object();
        y yVar = new y();
        J().RPC.getIHTStub().getChannelConnectionParm(Im.GetChannelConnectionParmRequest.newBuilder().setChannelID(this.f167f).build(), new f(b0Var, yVar, obj, b0Var2));
        synchronized (obj) {
            obj.wait(60000L);
            d0 d0Var = d0.f10897a;
        }
        if (!yVar.f25960a) {
            b bVar = this.D;
            if (bVar != null) {
                bVar.b();
                return;
            }
            return;
        }
        Throwable th2 = (Throwable) b0Var2.f25935a;
        if (th2 != null) {
            Log.d(this.f169h, "getChannelConnectionParm:" + th2.getLocalizedMessage());
            Error.Info exception = GRPC.parseException(th2);
            if (exception != null) {
                Error.Code code = exception.getCode();
                int i10 = code == null ? -1 : C0004e.f200a[code.ordinal()];
                if (i10 == 1) {
                    cancel();
                    b bVar2 = this.D;
                    if (bVar2 != null) {
                        bVar2.a(IILink.LinkStatus.ConnectionFailed, IILink.Reason.Unauthenticated);
                    }
                } else if (i10 == 2) {
                    cancel();
                    b bVar3 = this.D;
                    if (bVar3 != null) {
                        bVar3.a(IILink.LinkStatus.ConnectionFailed, IILink.Reason.NotInChannel);
                    }
                } else if (i10 != 3) {
                    Thread.sleep(1000L);
                } else {
                    cancel();
                    b bVar4 = this.D;
                    if (bVar4 != null) {
                        bVar4.a(IILink.LinkStatus.ConnectionFailed, IILink.Reason.LinkInterrupted);
                    }
                }
            } else {
                Thread.sleep(1000L);
            }
        }
        Im.GetChannelConnectionParmResult getChannelConnectionParmResult = (Im.GetChannelConnectionParmResult) b0Var.f25935a;
        if (getChannelConnectionParmResult == null) {
            Log.d(this.f169h, this.f166e.name + ":获取连接参数失败");
            return;
        }
        this.F = getChannelConnectionParmResult;
        if (getChannelConnectionParmResult.hasAuth()) {
            this.f171s.CallPriority = getChannelConnectionParmResult.getAuth().getCallPriority();
        } else {
            this.f171s.CallPriority = 0;
        }
        Log.d(this.f169h, getChannelConnectionParmResult.toString());
        this.E = new cd.e(getChannelConnectionParmResult.getIp(), getChannelConnectionParmResult.getPort(), getChannelConnectionParmResult.getPort() + 1);
        a aVar2 = this.f172t;
        rd.m.b(aVar2);
        aVar2.b(this.E);
        a aVar3 = this.f172t;
        rd.m.b(aVar3);
        aVar3.p();
        J().config.callback.onChannelConnectionParmLoaded(this.f167f, getChannelConnectionParmResult);
    }

    private final void X(boolean z10) {
        if (this.C == z10) {
            return;
        }
        this.C = z10;
        b bVar = this.D;
        if (bVar != null) {
            bVar.c(this);
        }
    }

    public final int D() {
        Im.GetChannelConnectionParmResult getChannelConnectionParmResult = this.F;
        if (getChannelConnectionParmResult != null) {
            return getChannelConnectionParmResult.getBitRates();
        }
        return 0;
    }

    public final int E() {
        Im.ChannelMemberAuth auth;
        Im.GetChannelConnectionParmResult getChannelConnectionParmResult = this.F;
        return (getChannelConnectionParmResult == null || (auth = getChannelConnectionParmResult.getAuth()) == null) ? RtlSpacingHelper.UNDEFINED : auth.getCallPriority();
    }

    public final long F() {
        return this.f167f;
    }

    public final Im.GetChannelConnectionParmResult H() {
        return this.F;
    }

    public final long I() {
        return this.f175w;
    }

    public final boolean K() {
        return this.f174v;
    }

    public final boolean L() {
        return !this.L.isEmpty();
    }

    public final boolean M() {
        return this.H;
    }

    public final boolean N() {
        return E() >= this.M;
    }

    public final boolean O() {
        return this.G;
    }

    public final boolean P() {
        return this.C;
    }

    public final void R() {
        if (this.C) {
            X(false);
            this.B = true;
        }
    }

    public final boolean S(int i10) {
        a aVar = this.f172t;
        return (aVar == null || aVar.m(new byte[][]{new byte[0]}, new byte[][]{a2.b.c(i10)}, null, null, 0L, null) == null) ? false : true;
    }

    public final void T(byte[] bArr, long j10) {
        a aVar;
        byte[][] bArr2;
        rd.m.e(bArr, "buf");
        if (N() && (aVar = this.f172t) != null) {
            byte[][] bArr3 = {bArr};
            this.N++;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j11 = jElapsedRealtime - this.O;
            if (this.P || j11 > 1000) {
                NBSS nbss = this.f171s;
                nbss.InForward = this.I;
                this.f166e.configure(nbss);
                if (!this.P || j11 >= 1000) {
                    this.O = jElapsedRealtime;
                    bArr2 = new byte[][]{a2.b.b(this.f171s)};
                    this.P = true;
                } else {
                    bArr2 = new byte[][]{a2.b.d(this.f171s)};
                    this.P = false;
                }
            } else {
                bArr2 = null;
            }
            long[][] jArrM = aVar.m(bArr3, bArr2, null, null, j10, null);
            if (jArrM == null || !this.J) {
                return;
            }
            this.J = false;
            String str = this.f169h;
            long[] jArr = jArrM[0];
            Log.d(str, "start send Timestamp:" + (jArr[0] & 4294967295L) + " Sequence number:" + jArr[1]);
        }
    }

    public final void U() {
        this.B = true;
        synchronized (this.K) {
            this.K.notifyAll();
            d0 d0Var = d0.f10897a;
        }
    }

    public final void V(boolean z10) {
        this.I = z10;
    }

    public final void W(boolean z10) {
        if (!this.f173u && z10) {
            this.J = true;
        }
        this.f173u = z10;
    }

    public final void Y(boolean z10) {
        this.f174v = z10;
    }

    public final void Z(b bVar) {
        this.D = bVar;
    }

    @Override // cd.m
    public void b(int i10, cd.e[] eVarArr) {
        rd.m.e(eVarArr, "participant");
    }

    public final void close() {
        Log.d(this.f169h, "close");
        cancel();
    }

    @Override // com.dw.util.concurrent.a
    protected void doInBackground() {
        while (!isCancelled()) {
            try {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                if (this.B || jElapsedRealtime - this.f177y > G().heartbeatInterval) {
                    this.B = false;
                    if (this.C) {
                        a aVar = this.f172t;
                        rd.m.b(aVar);
                        aVar.p();
                    } else {
                        Q();
                    }
                }
                if (this.f176x > 0 && jElapsedRealtime - this.f176x > 4000 && this.f177y > this.f178z) {
                    this.f176x = 0L;
                    this.A++;
                    if (this.A >= 3) {
                        close();
                    } else if (this.A >= 2) {
                        X(false);
                        this.B = true;
                    } else {
                        a aVar2 = this.f172t;
                        rd.m.b(aVar2);
                        aVar2.p();
                    }
                }
                Hashtable hashtable = this.L;
                Collection collectionBridge_synchronizedCollection = DesugarCollections.bridge_synchronizedCollection(hashtable.values(), hashtable);
                rd.m.d(collectionBridge_synchronizedCollection, "<get-values>(...)");
                for (d dVar : (d[]) collectionBridge_synchronizedCollection.toArray(new d[0])) {
                    if (dVar.c(jElapsedRealtime)) {
                        this.L.remove(Long.valueOf(dVar.b()));
                        dVar.h();
                    }
                }
                C();
                synchronized (this.K) {
                    this.K.wait(1000L);
                    d0 d0Var = d0.f10897a;
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return;
            }
        }
    }

    @Override // cd.m
    public void e(cd.c cVar, cd.e eVar) {
        rd.m.e(cVar, "frame");
        rd.m.e(eVar, "participant");
        long jE = cVar.e();
        a aVar = this.f172t;
        rd.m.b(aVar);
        if (jE != aVar.i()) {
            d dVar = (d) this.L.get(Long.valueOf(jE));
            if (dVar == null || dVar.d()) {
                dVar = new d(jE, this.f166e.createReceiveDataProcessor(this.L.isEmpty()));
                this.L.put(Long.valueOf(jE), dVar);
            }
            C();
            dVar.e(cVar, !this.f173u && this.f174v && G().callback.isCanPlay() && dVar.a() >= this.M);
            return;
        }
        String str = this.f169h;
        a aVar2 = this.f172t;
        rd.m.b(aVar2);
        Log.d(str, "ssrc 需要：" + aVar2.i() + " 得到：" + jE);
    }

    @Override // cd.m
    public int h(int i10) {
        return 0;
    }

    @Override // cd.m
    public void i(Throwable th2) {
        Log.d(this.f169h, "onExit", th2);
        close();
    }

    @Override // cd.m
    public void n(byte[] bArr, int i10) {
        rd.m.e(bArr, "rawPkt");
        this.A = 0;
        this.f178z = SystemClock.elapsedRealtime();
        if (i10 > 1) {
            byte b10 = bArr[1];
            this.G = ((byte) (b10 & 1)) != 0;
            this.H = ((byte) (b10 & 2)) != 0;
        }
        if (i10 > 2 && bArr[2] == 1) {
            close();
        }
        X(true);
        if (this.f176x > 0) {
            long j10 = this.f175w;
            long j11 = this.f178z - this.f176x;
            this.f175w = j11;
            if (j11 != j10) {
                this.f166e.onDelayChanged();
            }
            this.f176x = 0L;
            if (Configuration.DEBUG) {
                Log.d(this.f169h, "Heartbeat 延迟" + this.f175w + "ms");
            }
        }
    }

    @Override // com.dw.util.concurrent.a
    protected boolean onInit() {
        DatagramSocket datagramSocket;
        try {
            datagramSocket = new DatagramSocket(0);
        } catch (Exception unused) {
            Log.d(this.f169h, "RTPSession failed to obtain port");
            datagramSocket = null;
        }
        a aVar = new a(datagramSocket, null);
        this.f172t = aVar;
        rd.m.b(aVar);
        aVar.a(this, null, null);
        a aVar2 = this.f172t;
        rd.m.b(aVar2);
        aVar2.j(true);
        a aVar3 = this.f172t;
        rd.m.b(aVar3);
        aVar3.k(96);
        return super.onInit();
    }

    @Override // com.dw.util.concurrent.a
    protected void onStop() {
        Log.d(this.f169h, "onStop");
        Hashtable hashtable = this.L;
        for (d dVar : DesugarCollections.bridge_synchronizedCollection(hashtable.values(), hashtable)) {
            rd.m.b(dVar);
            dVar.h();
        }
        C();
        a aVar = this.f172t;
        if (aVar != null) {
            rd.m.b(aVar);
            aVar.d();
        }
        super.onStop();
    }
}
