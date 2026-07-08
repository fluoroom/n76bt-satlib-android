package v4;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.location.Location;
import android.os.Handler;
import android.os.Process;
import com.benshikj.ht.rpc.Dm;
import com.dw.audio.codec.OpusDecoder;
import com.dw.audio.codec.Resample;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.sbc.SbcDecoder;
import com.dw.sbc.SbcEncoder;
import com.facebook.stetho.websocket.CloseCodes;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import e5.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import n4.b;
import org.msgpack.core.MessagePack;
import v4.n0;
import x5.a;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements n0, a.f {
    public static final a F = new a(null);
    private static HashMap G = new HashMap();
    private boolean A;
    private OpusDecoder B;
    private Resample C;
    private final short[] D;
    private final short[] E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BluetoothDevice f29882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BluetoothDevice f29883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f29884c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f29885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final UUID f29886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BluetoothSocket f29887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final mi.c f29888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final y1.a f29889h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f29890r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f29891s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private b6.d f29892t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private b6.d f29893u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private q5.b f29894v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private SbcEncoder f29895w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private short[] f29896x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final byte[] f29897y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final byte[] f29898z;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public static /* synthetic */ i0 g(a aVar, BluetoothDevice bluetoothDevice, BluetoothDevice bluetoothDevice2, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                bluetoothDevice2 = null;
            }
            return aVar.f(bluetoothDevice, bluetoothDevice2);
        }

        public final n0.c a(n4.c cVar) {
            n0.c cVarL;
            rd.m.e(cVar, "device");
            synchronized (h()) {
                i0 i0Var = (i0) i0.F.h().get(cVar.b());
                cVarL = i0Var != null ? i0Var.l() : null;
            }
            return cVarL;
        }

        public final i0 b() {
            synchronized (h()) {
                Collection<i0> collectionValues = i0.F.h().values();
                rd.m.d(collectionValues, "<get-values>(...)");
                for (i0 i0Var : collectionValues) {
                    rd.m.b(i0Var);
                    if (i0Var.f29890r) {
                        return i0Var;
                    }
                }
                Collection<i0> collectionValues2 = i0.F.h().values();
                rd.m.d(collectionValues2, "<get-values>(...)");
                for (i0 i0Var2 : collectionValues2) {
                    if (i0Var2.n()) {
                        return i0Var2;
                    }
                }
                dd.d0 d0Var = dd.d0.f10897a;
                return null;
            }
        }

        public final ArrayList c() {
            ArrayList arrayList = new ArrayList();
            Iterator it = h().entrySet().iterator();
            while (it.hasNext()) {
                i0 i0Var = (i0) ((Map.Entry) it.next()).getValue();
                if (i0Var.G() != null) {
                    Main main = Main.f5555g;
                    rd.m.d(main, "sMain");
                    arrayList.add(new n4.c(main, i0Var.G()));
                }
            }
            return arrayList;
        }

        public final i0 d(long j10) {
            String strK = m0.k(j10);
            if (strK == null) {
                return null;
            }
            synchronized (h()) {
                a aVar = i0.F;
                i0 i0Var = (i0) aVar.h().get(strK);
                if (i0Var != null) {
                    return i0Var;
                }
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter == null) {
                    return null;
                }
                BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice(strK);
                rd.m.b(remoteDevice);
                return g(aVar, remoteDevice, null, 2, null);
            }
        }

        public final i0 e(BluetoothDevice bluetoothDevice) {
            rd.m.e(bluetoothDevice, "device");
            return g(this, bluetoothDevice, null, 2, null);
        }

        public final i0 f(BluetoothDevice bluetoothDevice, BluetoothDevice bluetoothDevice2) {
            i0 i0Var;
            rd.m.e(bluetoothDevice, "device");
            synchronized (h()) {
                try {
                    a aVar = i0.F;
                    i0Var = (i0) aVar.h().get(bluetoothDevice.getAddress());
                    rd.h hVar = null;
                    if (i0Var != null && i0Var.G() == null && bluetoothDevice2 != null) {
                        i0Var.A();
                        i0Var = null;
                    }
                    if (i0Var == null) {
                        i0Var = new i0(bluetoothDevice, bluetoothDevice2, hVar);
                        aVar.h().put(bluetoothDevice.getAddress(), i0Var);
                        if (bluetoothDevice2 != null) {
                            Cfg.c(bluetoothDevice.getAddress(), "dev.bound.hm.ble");
                        }
                        mi.c.e().m(b.a.OnDeviceListChanged);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i0Var;
        }

        public final HashMap h() {
            return i0.G;
        }

        public final void i(n4.c cVar) {
            rd.m.e(cVar, "device");
            synchronized (h()) {
                i0 i0Var = (i0) i0.F.h().remove(cVar.b());
                if (i0Var != null) {
                    i0Var.A();
                    dd.d0 d0Var = dd.d0.f10897a;
                }
            }
            Cfg.l0(cVar.b(), "dev.bound.hm.ble");
            mi.c.e().m(b.a.OnDeviceListChanged);
        }

        private a() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f29899a = new b("LinkStatusChanged", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ b[] f29900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ kd.a f29901c;

        static {
            b[] bVarArrA = a();
            f29900b = bVarArrA;
            f29901c = kd.b.a(bVarArrA);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f29899a};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f29900b.clone();
        }
    }

    public /* synthetic */ i0(BluetoothDevice bluetoothDevice, BluetoothDevice bluetoothDevice2, rd.h hVar) {
        this(bluetoothDevice, bluetoothDevice2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(i0 i0Var) {
        BluetoothSocket bluetoothSocket = i0Var.f29887f;
        i0Var.U(bluetoothSocket != null ? bluetoothSocket.getInputStream() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D() {
        Process.setThreadPriority(-16);
        Thread.currentThread().setPriority(10);
    }

    private final void E(byte[] bArr) {
        OpusDecoder opusDecoderQ = Q();
        if (opusDecoderQ == null) {
            return;
        }
        int iC = opusDecoderQ.c(bArr, bArr.length, this.D);
        if (iC <= 0) {
            s3.b.b(this.f29884c, "Opus decode:(" + iC + ')');
            return;
        }
        Resample resampleS = S();
        if (resampleS == null) {
            this.f29892t.o(this.D, 0, iC);
            return;
        }
        short[] sArr = this.D;
        short[] sArr2 = this.E;
        this.f29892t.o(this.E, 0, resampleS.b(sArr, 0, iC, sArr2, 0, sArr2.length));
    }

    public static final ArrayList H() {
        return F.c();
    }

    public static final i0 N(long j10) {
        return F.d(j10);
    }

    public static final i0 O(BluetoothDevice bluetoothDevice) {
        return F.e(bluetoothDevice);
    }

    public static final i0 P(BluetoothDevice bluetoothDevice, BluetoothDevice bluetoothDevice2) {
        return F.f(bluetoothDevice, bluetoothDevice2);
    }

    private final OpusDecoder Q() {
        if (this.B == null) {
            this.B = new OpusDecoder(48000, 0);
        }
        return this.B;
    }

    private final Resample S() {
        if (this.C == null) {
            this.C = new Resample(48000, 32000);
        }
        return this.C;
    }

    private final void U(InputStream inputStream) {
        try {
            V(inputStream);
        } finally {
            if (this.f29885d) {
                s3.b.b(this.f29884c, "inputHandle exit");
            }
            A();
        }
    }

    private final void V(InputStream inputStream) throws IOException {
        int i10;
        q5.b bVar;
        InputStream inputStream2 = inputStream;
        if (inputStream2 == null) {
            return;
        }
        Process.setThreadPriority(-16);
        Thread.currentThread().setPriority(10);
        int i11 = 1;
        SbcDecoder sbcDecoder = new SbcDecoder(true);
        byte[] bArr = new byte[4096];
        short[] sArr = new short[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
        x5.a aVar = new x5.a(8192);
        a.C0426a c0426a = new a.C0426a();
        byte[] bArr2 = new byte[2048];
        int i12 = 0;
        int i13 = 0;
        while (true) {
            try {
                int i14 = inputStream2.read(bArr);
                if (i14 > 0) {
                    if (aVar.f(bArr, i12, i14) != i14 && this.f29885d) {
                        s3.b.d(this.f29884c, "缓冲不够大");
                    }
                    q5.b bVar2 = this.f29894v;
                    if (bVar2 != null && bVar2.c() == 0 && (bVar = this.f29894v) != null) {
                        bVar.write(i11);
                    }
                }
                while (true) {
                    int iA = aVar.a();
                    if (!aVar.e(c0426a) || c0426a.f31650b == 0) {
                        break;
                    }
                    short s10 = (short) c0426a.f31649a;
                    if (s10 == 9) {
                        if (!this.f29891s || this.f29889h.A()) {
                            s3.b.b(this.f29884c, this.f29889h.A() ? "丢弃音频在播放提示音状态" : "丢弃音频在非录音状态");
                        } else {
                            int iB = sbcDecoder.b(c0426a.f31652d, i12, c0426a.f31650b, bArr2);
                            if (iB > 0) {
                                if (!this.f29885d || i13 == iB) {
                                    i10 = i13;
                                } else {
                                    String str = this.f29884c;
                                    rd.g0 g0Var = rd.g0.f25951a;
                                    int i15 = iB / 2;
                                    String str2 = String.format(Locale.getDefault(), "SBC数据:%d,PCM数据:%d,PCM样本:%d,音频时长:%.1fms，压缩比%d%%", Arrays.copyOf(new Object[]{Integer.valueOf(c0426a.f31650b), Integer.valueOf(iB), Integer.valueOf(i15), Float.valueOf((i15 * 1000.0f) / 32000), Integer.valueOf((c0426a.f31650b * 100) / iB)}, 5));
                                    rd.m.d(str2, "format(...)");
                                    s3.b.b(str, str2);
                                    i10 = iB;
                                }
                                int iG = w3.b.g(bArr2, 0, iB, sArr, 0, w3.d.PCM_16BIT_BE);
                                int iO = this.f29892t.o(sArr, 0, iG);
                                if (iO != iG) {
                                    s3.b.d(this.f29884c, "音频缓存满丢弃：" + (iG - iO));
                                }
                                i13 = i10;
                                i12 = 0;
                            }
                        }
                    } else if (s10 == 1) {
                        if (this.f29885d) {
                            a6.v vVar = new a6.v(c0426a.f31652d);
                            s3.b.b(this.f29884c, "COM:A=" + vVar.i(16) + ",B=" + vVar.i(16) + ",C=" + vVar.i(16) + ",D=" + vVar.i(16));
                        }
                    } else if (this.f29885d) {
                        s3.b.d(this.f29884c, "未知数据: " + c0426a.f31649a + "  丢弃" + (iA - aVar.a()) + " 字节");
                    }
                    i12 = 0;
                }
                inputStream2 = inputStream;
                i11 = 1;
                i12 = 0;
            } catch (IOException e10) {
                if (this.f29885d) {
                    s3.b.e(this.f29884c, "err", e10);
                    return;
                }
                return;
            }
        }
    }

    public static final void b0(n4.c cVar) {
        F.i(cVar);
    }

    public final void A() {
        if (this.f29885d) {
            s3.b.b(this.f29884c, getName() + ":start close");
        }
        this.f29890r = false;
        this.f29889h.j();
        a6.m.b(this.f29887f);
        a6.m.b(this.f29894v);
        SbcEncoder sbcEncoder = this.f29895w;
        if (sbcEncoder != null) {
            sbcEncoder.e();
        }
        f0();
    }

    public final boolean B() {
        if (!this.f29889h.B()) {
            this.f29889h.k();
        }
        if (this.f29890r) {
            return true;
        }
        if (this.f29883b != null) {
            return this.f29889h.B() && this.f29889h.l();
        }
        if (this.A) {
            while (this.A) {
                Thread.sleep(50L);
            }
            return this.f29890r;
        }
        if (this.f29885d) {
            s3.b.b(this.f29884c, getName() + ":start connect");
        }
        try {
            try {
                this.A = true;
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f29887f = this.f29882a.createRfcommSocketToServiceRecord(this.f29886e);
                BluetoothAdapter.getDefaultAdapter().cancelDiscovery();
                BluetoothSocket bluetoothSocket = this.f29887f;
                if (bluetoothSocket != null) {
                    bluetoothSocket.connect();
                }
                new Thread(new Runnable() { // from class: v4.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        i0.C(this.f29866a);
                    }
                }, "HMI-" + m3.a.c(this.f29882a)).start();
                BluetoothSocket bluetoothSocket2 = this.f29887f;
                OutputStream outputStream = bluetoothSocket2 != null ? bluetoothSocket2.getOutputStream() : null;
                rd.m.b(outputStream);
                this.f29894v = new q5.b(outputStream, CloseCodes.NORMAL_CLOSURE, new Runnable() { // from class: v4.h0
                    @Override // java.lang.Runnable
                    public final void run() {
                        i0.D();
                    }
                });
                if (this.f29885d) {
                    s3.b.b(this.f29884c, "连接时间：" + (System.currentTimeMillis() - jCurrentTimeMillis) + " ms");
                }
                SbcEncoder sbcEncoder = new SbcEncoder(32000, 18, true);
                this.f29895w = sbcEncoder;
                rd.m.b(sbcEncoder);
                this.f29896x = new short[sbcEncoder.c() / 2];
                this.f29892t.e();
                this.f29893u.e();
                this.f29890r = true;
                this.A = false;
                return true;
            } catch (Exception e10) {
                BluetoothSocket bluetoothSocket3 = this.f29887f;
                if (bluetoothSocket3 != null) {
                    bluetoothSocket3.close();
                }
                s3.b.e(this.f29884c, "connect", e10);
                e10.printStackTrace();
                this.A = false;
                A();
                return false;
            }
        } catch (Throwable th2) {
            this.A = false;
            throw th2;
        }
    }

    public final y1.a F() {
        return this.f29889h;
    }

    public final BluetoothDevice G() {
        return this.f29883b;
    }

    public final int I() {
        return this.f29889h.n();
    }

    public final BluetoothDevice J() {
        return this.f29882a;
    }

    public final Dm.DeviceID K() {
        return this.f29889h.q();
    }

    public final a.g L() {
        return this.f29889h.s();
    }

    public final g3.c M() {
        return this.f29889h.u().f();
    }

    public final boolean R() {
        return this.f29891s;
    }

    public final boolean T() {
        return this.f29889h.A();
    }

    public final void W(byte[] bArr) {
        rd.m.e(bArr, "data");
        if (!this.f29891s || this.f29889h.A()) {
            s3.b.b(this.f29884c, this.f29889h.A() ? "丢弃音频在播放提示音状态" : "丢弃音频在非录音状态");
            return;
        }
        if (this.f29889h.p().k() <= 46) {
            E(bArr);
            return;
        }
        int iD = 0;
        while (iD < bArr.length) {
            int i10 = iD + 1;
            iD = (dd.x.d(bArr[iD]) & MessagePack.Code.EXT_TIMESTAMP) + i10;
            if (iD > bArr.length) {
                s3.b.d(this.f29884c, "错误的Opus Data");
                return;
            }
            E(ed.j.Z(bArr, new xd.c(i10, iD - 1)));
        }
    }

    public final void X() {
        this.f29889h.J();
    }

    public final void Y() {
        this.f29889h.K();
    }

    public final boolean Z(w wVar) {
        rd.m.e(wVar, "status");
        int iOrdinal = wVar.ordinal();
        return a(v.READ_STATUS, (byte) (iOrdinal >> 8), (byte) iOrdinal);
    }

    @Override // v4.n0, e5.a.f
    public boolean a(v vVar, byte... bArr) {
        rd.m.e(vVar, "com");
        rd.m.e(bArr, "payload");
        return this.f29889h.a(vVar, Arrays.copyOf(bArr, bArr.length));
    }

    public final int a0(short[] sArr, int i10, int i11) {
        rd.m.e(sArr, "data");
        this.f29892t.i(1, 0L);
        return this.f29892t.l(sArr, i10, i11);
    }

    @Override // v4.n0
    public /* synthetic */ boolean b(v vVar, q0 q0Var) {
        return m0.e(this, vVar, q0Var);
    }

    @Override // e5.a.f
    public boolean c(int i10, int i11, byte... bArr) {
        rd.m.e(bArr, "payload");
        return this.f29889h.c(i10, i11, Arrays.copyOf(bArr, bArr.length));
    }

    public void c0(a.e eVar) {
        this.f29889h.W(eVar);
    }

    @Override // v4.n0, e5.a.f
    public a0 d() {
        return this.f29889h.d();
    }

    public final void d0(Handler handler) {
        this.f29889h.Y(handler);
    }

    @Override // v4.n0
    public /* synthetic */ void destroy() {
        m0.a(this);
    }

    @Override // e5.a.f
    public void e(Dm.DeviceID deviceID) {
        this.f29889h.e(deviceID);
    }

    public final boolean e0() {
        if (this.f29889h.C()) {
            y1.a.e0(this.f29889h, null, 1, null);
            return true;
        }
        if (!B()) {
            return false;
        }
        if (this.f29891s) {
            return true;
        }
        this.f29892t.e();
        this.f29891s = true;
        return true;
    }

    public final void f0() {
        this.f29892t.j();
        this.f29893u.j();
        this.f29892t.e();
        this.f29893u.e();
        this.B = null;
        this.C = null;
        this.f29891s = false;
    }

    @Override // v4.n0
    public /* synthetic */ void g(n0.b bVar) {
        m0.g(this, bVar);
    }

    @Override // v4.n0
    public String getName() {
        String strW = Cfg.w(this.f29882a);
        rd.m.d(strW, "getDevName(...)");
        return strW.length() > 0 ? strW : "HMLink";
    }

    @Override // v4.n0
    public void h(boolean z10) {
        this.f29889h.j();
    }

    @Override // v4.n0
    public boolean i() {
        return false;
    }

    @Override // v4.n0
    public boolean isDestroyed() {
        return false;
    }

    @Override // v4.n0
    public w4.c[] j() {
        return this.f29889h.x();
    }

    @Override // v4.n0
    public void k(n0.d dVar) {
        rd.m.e(dVar, "listener");
        this.f29889h.M(dVar);
    }

    @Override // v4.n0
    public n0.c l() {
        return this.f29889h.o();
    }

    @Override // v4.n0
    public boolean n() {
        return this.f29889h.B();
    }

    @Override // v4.n0
    public /* synthetic */ void p(Location location) {
        m0.f(this, location);
    }

    @Override // v4.n0
    public long q() {
        return m0.i(this.f29882a.getAddress());
    }

    @Override // v4.n0
    public void r(n0.d dVar) {
        rd.m.e(dVar, "listener");
        this.f29889h.i0(dVar);
    }

    @Override // v4.n0
    public /* synthetic */ r1 s() {
        return m0.b(this);
    }

    @Override // e5.a.f
    public /* synthetic */ boolean t(int i10) {
        return e5.b.a(this, i10);
    }

    @Override // v4.n0
    public /* synthetic */ xdsopl.robot36.a u() {
        return m0.c(this);
    }

    @Override // v4.n0
    public void v(boolean z10) {
        this.f29889h.k();
    }

    @Override // v4.n0
    public /* synthetic */ void x(n0.b bVar) {
        m0.d(this, bVar);
    }

    @Override // e5.a.f
    public void y() {
        this.f29889h.y();
    }

    @Override // v4.n0
    public mi.c z() {
        mi.c cVar = this.f29888g;
        rd.m.d(cVar, "eventBus");
        return cVar;
    }

    private i0(BluetoothDevice bluetoothDevice, BluetoothDevice bluetoothDevice2) {
        this.f29882a = bluetoothDevice;
        this.f29883b = bluetoothDevice2;
        this.f29884c = "HMLink";
        this.f29885d = Cfg.f5476a;
        this.f29886e = UUID.fromString("00004315-32fa-40db-85ed-fbfeba2d86e6");
        this.f29888g = mi.c.b().a();
        Main main = Main.f5555g;
        rd.m.d(main, "sMain");
        this.f29889h = new y1.a(main, this);
        this.f29892t = new b6.d(16000);
        this.f29893u = new b6.d(32000);
        this.f29897y = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
        this.f29898z = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
        this.D = new short[4096];
        this.E = new short[4096];
    }
}
