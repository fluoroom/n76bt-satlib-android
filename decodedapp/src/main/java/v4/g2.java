package v4;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbDeviceConnection;
import android.hardware.usb.UsbEndpoint;
import android.hardware.usb.UsbInterface;
import android.hardware.usb.UsbManager;
import android.location.Location;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import g3.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import java.util.Locale;
import v4.n0;
import w5.d;

/* JADX INFO: loaded from: classes.dex */
public class g2 extends c0 {
    private boolean J0;
    private boolean K0;
    private boolean L0;
    private final UsbManager M0;
    private final c N0;
    private PendingIntent O0;
    private a P0;
    private a Q0;
    private UsbDevice R0;
    private String S0;
    private final Runnable T0;
    private byte[] U0;

    public static final class a {

        /* JADX INFO: renamed from: a */
        private final UsbDeviceConnection f29868a;

        /* JADX INFO: renamed from: b */
        private final UsbEndpoint f29869b;

        /* JADX INFO: renamed from: c */
        private final UsbEndpoint f29870c;

        /* JADX INFO: renamed from: d */
        private d2 f29871d;

        /* JADX INFO: renamed from: e */
        private h2 f29872e;

        public a(UsbDeviceConnection usbDeviceConnection, UsbEndpoint usbEndpoint, UsbEndpoint usbEndpoint2) {
            rd.m.e(usbDeviceConnection, "connection");
            this.f29868a = usbDeviceConnection;
            this.f29869b = usbEndpoint;
            this.f29870c = usbEndpoint2;
        }

        public final void a() throws IOException {
            d2 d2Var = this.f29871d;
            if (d2Var != null) {
                d2Var.close();
            }
            h2 h2Var = this.f29872e;
            if (h2Var != null) {
                h2Var.close();
            }
            this.f29868a.close();
        }

        public final InputStream b() {
            if (this.f29871d == null && this.f29869b != null) {
                this.f29871d = new d2(this.f29868a, this.f29869b);
            }
            return this.f29871d;
        }

        public final OutputStream c() {
            if (this.f29872e == null && this.f29870c != null) {
                this.f29872e = new h2(this.f29868a, this.f29870c);
            }
            return this.f29872e;
        }

        public final boolean d() {
            h2 h2Var;
            d2 d2Var = this.f29871d;
            return (d2Var != null && d2Var.isClosed()) || ((h2Var = this.f29872e) != null && h2Var.isClosed());
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f29873a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f29874b;

        static {
            int[] iArr = new int[n0.c.values().length];
            try {
                iArr[n0.c.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n0.c.ConnectionFailed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[n0.c.Connecting.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[n0.c.Interrupted.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f29873a = iArr;
            int[] iArr2 = new int[v.values().length];
            try {
                iArr2[v.GET_DEV_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f29874b = iArr2;
        }
    }

    public static final class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            rd.m.e(context, "context");
            rd.m.e(intent, "intent");
            if (rd.m.a("com.android.example.USB_PERMISSION", intent.getAction())) {
                UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
                if (intent.getBooleanExtra("permission", false)) {
                    g2.this.v(false);
                    g2.this.L(false);
                } else {
                    s3.b.b("Link", "permission denied for device " + usbDevice);
                }
            }
        }
    }

    public g2(long j10) {
        super(j10);
        this.L0 = true;
        Object systemService = Main.f5555g.getSystemService("usb");
        rd.m.c(systemService, "null cannot be cast to non-null type android.hardware.usb.UsbManager");
        this.M0 = (UsbManager) systemService;
        if (Cfg.f5482d) {
            i1(true);
        }
        this.N0 = new c();
        this.T0 = new Runnable() { // from class: v4.e2
            @Override // java.lang.Runnable
            public final void run() {
                g2.d3(this.f29852a);
            }
        };
    }

    private final void b3(UsbDevice usbDevice) throws IOException {
        a aVar = this.P0;
        if (aVar != null) {
            aVar.a();
        }
        a aVar2 = this.Q0;
        if (aVar2 != null) {
            aVar2.a();
        }
        UsbEndpoint usbEndpoint = null;
        this.P0 = null;
        this.Q0 = null;
        this.R0 = usbDevice;
        if (usbDevice == null) {
            return;
        }
        this.J0 = n4.m.f22489a.f(usbDevice);
        if (!this.M0.hasPermission(usbDevice)) {
            s3.b.b("Link", "has no Permission");
            if (this.O0 == null) {
                this.O0 = PendingIntent.getBroadcast(Main.f5555g, 0, new Intent("com.android.example.USB_PERMISSION"), 67108864);
            }
            b0.b.j(Main.f5555g, this.N0, new IntentFilter("com.android.example.USB_PERMISSION"), 2);
            this.M0.requestPermission(usbDevice, this.O0);
            return;
        }
        int interfaceCount = usbDevice.getInterfaceCount();
        UsbEndpoint usbEndpoint2 = null;
        UsbEndpoint usbEndpoint3 = null;
        UsbEndpoint usbEndpoint4 = null;
        for (int i10 = 0; i10 < interfaceCount; i10++) {
            UsbInterface usbInterface = usbDevice.getInterface(i10);
            rd.m.d(usbInterface, "getInterface(...)");
            if (usbInterface.getInterfaceClass() == 255 && usbInterface.getInterfaceSubclass() == 1 && usbInterface.getInterfaceProtocol() == 1 && usbInterface.getEndpointCount() == 2) {
                for (int i11 = 0; i11 < 2; i11++) {
                    UsbEndpoint endpoint = usbInterface.getEndpoint(i11);
                    if (endpoint.getDirection() == 0) {
                        usbEndpoint = endpoint;
                    } else {
                        usbEndpoint2 = endpoint;
                    }
                }
                UsbDeviceConnection usbDeviceConnectionOpenDevice = this.M0.openDevice(usbDevice);
                if (usbEndpoint == null) {
                    s3.b.b("Link", "have no audio tx Endpoint");
                }
                if (usbEndpoint2 == null) {
                    s3.b.b("Link", "have no audio rx Endpoint");
                }
                if (usbDeviceConnectionOpenDevice != null) {
                    this.P0 = new a(usbDeviceConnectionOpenDevice, usbEndpoint2, usbEndpoint);
                }
            } else if ((usbInterface.getInterfaceClass() == 255 && usbInterface.getInterfaceSubclass() == 1 && usbInterface.getInterfaceProtocol() == 2 && usbInterface.getEndpointCount() == 2) || (usbInterface.getInterfaceClass() == 3 && usbInterface.getInterfaceSubclass() == 0 && usbInterface.getInterfaceProtocol() == 0 && usbInterface.getEndpointCount() == 2)) {
                for (int i12 = 0; i12 < 2; i12++) {
                    UsbEndpoint endpoint2 = usbInterface.getEndpoint(i12);
                    if (endpoint2.getDirection() == 0) {
                        usbEndpoint4 = endpoint2;
                    } else {
                        usbEndpoint3 = endpoint2;
                    }
                }
                UsbDeviceConnection usbDeviceConnectionOpenDevice2 = this.M0.openDevice(usbDevice);
                if (usbEndpoint4 == null) {
                    s3.b.b("Link", "have no control tx Endpoint");
                }
                if (usbEndpoint3 == null) {
                    s3.b.b("Link", "have no control rx Endpoint");
                }
                if (usbDeviceConnectionOpenDevice2 != null) {
                    this.Q0 = new a(usbDeviceConnectionOpenDevice2, usbEndpoint3, usbEndpoint4);
                }
            }
        }
    }

    public static final CharSequence c3(byte b10) {
        rd.g0 g0Var = rd.g0.f25951a;
        String str = String.format(Locale.ENGLISH, "%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b10)}, 1));
        rd.m.d(str, "format(...)");
        return str;
    }

    public static final void d3(g2 g2Var) {
        if (g2Var.Q.k() < 59 || g2Var.Y().f29922k) {
            return;
        }
        s3.b.b("Link", "音频通道没有连接我们重启设备");
        g2Var.t(18319);
    }

    private final void e3() {
        byte[] bArrF;
        Location locationB;
        if (this.J0 && n()) {
            q qVarB = com.dw.ht.user.b.f6853a.b();
            if (qVarB.r() || qVarB.q() || qVarB.s()) {
                d.c cVar = new d.c();
                if (qVarB.s()) {
                    cVar.k(qVarB.E());
                }
                if (qVarB.q()) {
                    cVar.i(qVarB.w());
                }
                w5.d dVarC = cVar.c();
                if (qVarB.r() && (locationB = o5.g.f23195s.b(null)) != null) {
                    dVarC.f31256g = Double.valueOf(locationB.getLatitude());
                    dVarC.f31257h = Double.valueOf(locationB.getLongitude());
                }
                bArrF = dVarC.f();
                rd.m.d(bArrF, "encoding(...)");
            } else {
                bArrF = new byte[0];
            }
            if (!Arrays.equals(bArrF, this.U0) && W0(c1.SET_SIGN_DATA, Arrays.copyOf(bArrF, bArrF.length))) {
                this.U0 = bArrF;
            }
        }
    }

    @Override // v4.c0, v4.l1
    protected void C0() {
        n0.c cVar = this.f29959z;
        int i10 = cVar == null ? -1 : b.f29873a[cVar.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            this.S0 = null;
            this.X = 0;
        }
        super.C0();
    }

    @Override // v4.c0
    public boolean D2() {
        if (this.J0) {
            return false;
        }
        return super.D2();
    }

    @Override // v4.c0
    protected boolean E1(boolean z10) throws IOException {
        a aVar;
        if (this.J0) {
            a aVar2 = this.Q0;
            if (aVar2 == null || (aVar2 != null && aVar2.d())) {
                b3(n4.m.f22489a.b(q()));
            }
        } else {
            a aVar3 = this.P0;
            if (aVar3 == null || this.Q0 == null || ((aVar3 != null && aVar3.d()) || ((aVar = this.Q0) != null && aVar.d()))) {
                b3(n4.m.f22489a.b(q()));
            }
            if (!this.J0 && this.P0 == null) {
                return false;
            }
        }
        return super.E1(z10);
    }

    @Override // v4.c0
    protected void E2(int i10) throws IOException {
        y5.f fVarL;
        SharedPreferences.Editor editorC;
        if (this.X == i10) {
            return;
        }
        this.X = i10;
        if (i10 == 2 && !Cfg.f5482d) {
            h(true);
        }
        String str = this.S0;
        if (str == null || str.length() == 0 || (fVarL = Cfg.L()) == null || (editorC = fVarL.c()) == null) {
            return;
        }
        SharedPreferences.Editor editorPutInt = editorC.putInt(this.S0 + ".rsx", this.X);
        if (editorPutInt != null) {
            editorPutInt.apply();
        }
    }

    @Override // v4.c0
    protected t G1() {
        if (this.J0) {
            a aVar = this.Q0;
            InputStream inputStreamB = aVar != null ? aVar.b() : null;
            a aVar2 = this.Q0;
            OutputStream outputStreamC = aVar2 != null ? aVar2.c() : null;
            if (inputStreamB == null || outputStreamC == null) {
                return null;
            }
            return new e(this, 64);
        }
        a aVar3 = this.P0;
        InputStream inputStreamB2 = aVar3 != null ? aVar3.b() : null;
        a aVar4 = this.P0;
        OutputStream outputStreamC2 = aVar4 != null ? aVar4.c() : null;
        if (inputStreamB2 == null || outputStreamC2 == null) {
            return null;
        }
        return new c2(this, inputStreamB2, outputStreamC2);
    }

    @Override // v4.c0, v4.l1
    public x4.a M(boolean z10) {
        if (this.J0) {
            return new x4.c(8000);
        }
        x4.d dVar = new x4.d(z10);
        dVar.g(1);
        return dVar;
    }

    @Override // v4.c0, v4.l1
    public void O(boolean z10) throws IOException {
        a aVar = this.P0;
        if (aVar != null) {
            aVar.a();
        }
        this.P0 = null;
        super.O(z10);
    }

    @Override // v4.c0
    protected boolean O2() {
        this.f29943a.removeCallbacks(this.H0);
        if (this.J0) {
            this.f29767r0 = true;
            this.f29769t0 = "";
        }
        boolean zO2 = super.O2();
        if (zO2 && this.J0) {
            this.f29943a.postDelayed(this.H0, 3000L);
        }
        return zO2;
    }

    @Override // v4.c0
    protected boolean P2() {
        if (this.S0 != null) {
            return super.P2();
        }
        a(v.GET_DEV_ID, new byte[0]);
        return false;
    }

    @Override // v4.l1
    public boolean V0(short s10) {
        return (this.J0 && s10 == 1) ? W0(c1.TX_AUDIO_STOP, new byte[0]) : super.V0(s10);
    }

    @Override // v4.c0, v4.l1
    public void c1(q qVar, boolean z10) {
        rd.m.e(qVar, "cfg");
        super.c1(qVar, z10);
        e3();
    }

    @Override // v4.c0, v4.l1
    public Boolean g0() {
        return Cfg.f5482d ? Boolean.TRUE : super.g0();
    }

    @Override // v4.l1, v4.n0
    public String getName() {
        return "USB";
    }

    @Override // v4.c0, v4.l1, v4.n0
    public void h(boolean z10) throws IOException {
        a aVar = this.Q0;
        if (aVar != null) {
            aVar.a();
        }
        this.Q0 = null;
        super.h(z10);
    }

    @Override // v4.l1
    public boolean o0() {
        return true;
    }

    @Override // v4.c0
    protected int o2() {
        return 0;
    }

    @Override // v4.l1, v4.n0
    public void p(Location location) {
        rd.m.e(location, "location");
        if (this.J0) {
            e3();
        } else {
            super.p(location);
        }
    }

    @Override // v4.c0
    protected void s2(k0 k0Var) {
        rd.m.e(k0Var, "New");
        super.s2(k0Var);
        if (Cfg.f5482d) {
            if (k0Var.f29922k) {
                this.f29943a.removeCallbacks(this.T0);
            } else {
                this.f29943a.postDelayed(this.T0, 3000L);
            }
        }
    }

    @Override // v4.c0
    protected void t2(g3.d dVar) throws IOException {
        int iD;
        f0 f0Var;
        rd.m.e(dVar, "packet");
        super.t2(dVar);
        if (dVar.m() == 3 && (f0Var = (f0) Z()) != null) {
            f0Var.v(dVar);
        }
        int i10 = 2;
        if (dVar.m() != 2) {
            return;
        }
        v vVarD = v.d(dVar.e());
        rd.m.d(vVarD, "valueOf(...)");
        if (!n2(dVar)) {
            if (b.f29874b[vVarD.ordinal()] != 1) {
                return;
            } else {
                E2(2);
            }
        }
        if (b.f29874b[vVarD.ordinal()] == 1) {
            if (this.S0 == null) {
                this.S0 = "";
                if (this.K0) {
                    this.K0 = false;
                    E2(0);
                } else {
                    if (dVar.i().length >= 16) {
                        byte[] bArrCopyOfRange = Arrays.copyOfRange(dVar.i(), 1, dVar.i().length);
                        rd.m.d(bArrCopyOfRange, "copyOfRange(...)");
                        this.S0 = ed.j.R(bArrCopyOfRange, "", null, null, 0, null, new qd.l() { // from class: v4.f2
                            @Override // qd.l
                            public final Object l(Object obj) {
                                return g2.c3(((Byte) obj).byteValue());
                            }
                        }, 30, null);
                        y5.f fVarL = Cfg.L();
                        if (fVarL != null) {
                            StringBuilder sb2 = new StringBuilder();
                            String str = this.S0;
                            rd.m.b(str);
                            sb2.append(str);
                            sb2.append(".rsx");
                            iD = fVarL.d(sb2.toString(), 0);
                        } else {
                            iD = 0;
                        }
                        if (iD == 2 && this.L0) {
                            this.L0 = false;
                            i10 = 0;
                        } else {
                            i10 = iD;
                        }
                    }
                    E2(i10);
                }
            }
            O2();
        }
    }

    @Override // v4.c0
    protected void u2() {
        super.u2();
        e3();
    }

    @Override // v4.l1, v4.n0
    public void v(boolean z10) {
        synchronized (this) {
            K();
            this.Y = true;
            if (this.f29944b.F()) {
                this.f29944b.O(this.f29758i0);
                return;
            }
            n0.c cVar = this.f29959z;
            n0.c cVar2 = n0.c.Connecting;
            if (cVar == cVar2) {
                return;
            }
            a aVar = this.Q0;
            InputStream inputStreamB = aVar != null ? aVar.b() : null;
            a aVar2 = this.Q0;
            OutputStream outputStreamC = aVar2 != null ? aVar2.c() : null;
            if (inputStreamB != null && outputStreamC != null) {
                if (!E1(z10)) {
                    e1(n0.c.ConnectionFailed);
                    return;
                }
                e1(cVar2);
                this.f29944b.u(inputStreamB, outputStreamC, c.e.USB);
                this.f29944b.O(this.f29758i0);
                dd.d0 d0Var = dd.d0.f10897a;
            }
        }
    }

    @Override // v4.c0
    protected void v2() {
        super.v2();
        this.U0 = null;
    }

    @Override // v4.c0, e5.a.f
    public void y() {
        super.y();
        this.K0 = true;
    }
}
