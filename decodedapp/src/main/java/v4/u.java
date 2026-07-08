package v4;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Context;
import android.content.Intent;
import android.os.ParcelUuid;
import android.os.SystemClock;
import android.widget.Toast;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Im;
import com.benshikj.ii.II;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.RadioService;
import com.dw.ht.activitys.NewDeviceActivity;
import com.dw.ht.entitys.ChannelBond;
import com.dw.ht.user.b;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.ThreadMode;
import v4.l1;
import v4.n0;
import w5.d;

/* JADX INFO: loaded from: classes.dex */
public class u implements n0.d, r5.d {

    /* JADX INFO: renamed from: v */
    private static u f30148v;

    /* JADX INFO: renamed from: w */
    private static long f30149w;

    /* JADX INFO: renamed from: b */
    private BluetoothLeScanner f30151b;

    /* JADX INFO: renamed from: c */
    private ScanCallback f30152c;

    /* JADX INFO: renamed from: e */
    private l1 f30154e;

    /* JADX INFO: renamed from: f */
    private c0 f30155f;

    /* JADX INFO: renamed from: g */
    private n1 f30156g;

    /* JADX INFO: renamed from: s */
    private boolean f30159s;

    /* JADX INFO: renamed from: d */
    private final ConcurrentHashMap f30153d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h */
    private final ArrayList f30157h = new ArrayList();

    /* JADX INFO: renamed from: r */
    public final HashMap f30158r = new HashMap();

    /* JADX INFO: renamed from: t */
    private final Object f30160t = new Object();

    /* JADX INFO: renamed from: u */
    boolean f30161u = false;

    /* JADX INFO: renamed from: a */
    private final BluetoothAdapter f30150a = BluetoothAdapter.getDefaultAdapter();

    class a extends ScanCallback {
        a() {
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List list) {
            s3.b.b("ConnectionManager", "onBatchScanResults:" + list.size());
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i10) {
            s3.b.b("ConnectionManager", "onScanFailed:" + i10);
            u.this.F(false);
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i10, ScanResult scanResult) {
            s3.b.b("ConnectionManager", "onScanResult:" + i10 + ":" + scanResult);
            String address = scanResult.getDevice().getAddress();
            ScanResult scanResult2 = (ScanResult) u.this.f30158r.put(address, scanResult);
            if ((scanResult2 == null || SystemClock.elapsedRealtimeNanos() - scanResult2.getTimestampNanos() > 5000000000L) && !Cfg.p(true).contains(address)) {
                NewDeviceActivity.w1(scanResult.getDevice());
            }
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f30163a;

        static {
            int[] iArr = new int[Cfg.a.values().length];
            f30163a = iArr;
            try {
                iArr[Cfg.a.ImperialUnitsChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30163a[Cfg.a.PTTLockChanged.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum c {
        CurrentLinkChanged,
        CurrentLinkFreqChanged
    }

    public static class d {

        /* JADX INFO: renamed from: a */
        public c0 f30167a;

        /* JADX INFO: renamed from: b */
        public ChannelBond f30168b;

        public d(c0 c0Var, ChannelBond channelBond) {
            this.f30167a = c0Var;
            this.f30168b = channelBond;
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a */
        public final n0 f30169a;

        /* JADX INFO: renamed from: b */
        public final l1.e f30170b;

        public e(n0 n0Var, l1.e eVar) {
            this.f30169a = n0Var;
            this.f30170b = eVar;
        }
    }

    private u() {
        mi.c.e().q(this);
    }

    private void C() {
        Cfg.Settings settingsO = Cfg.O();
        if (settingsO.getSimpleUI()) {
            long j10 = settingsO.lastIIChanelID;
            if (j10 != 0) {
                G(y(j10 + 28147497671065500L));
            }
            long j11 = settingsO.lastDeviceID;
            if (j11 != 0) {
                G(y(j11));
            }
        }
        long jT = Cfg.t();
        if (jT != 0) {
            G(y(jT));
        }
        if (this.f30150a != null) {
            com.dw.ht.i.f6302a.d(Main.f5555g);
        }
        r5.a.n(Main.f5555g, this);
    }

    public static void I() {
        if (f30148v == null) {
            return;
        }
        w().H();
    }

    public static void b() {
        u uVarW = w();
        Iterator it = Cfg.p(true).iterator();
        while (it.hasNext()) {
            uVarW.y(l1.W((String) it.next())).v(false);
        }
    }

    public static void d(Context context, long j10, l1 l1Var) {
        if (SystemClock.elapsedRealtime() - f30149w < 5000) {
            Toast.makeText(context, R.string.toastOperationTooFrequent, 0).show();
            return;
        }
        if (l1Var == null) {
            l1Var = w().r();
        }
        q qVarT = l1Var.T();
        l1Var.O0(new d.c().i(qVarT.w()).k(qVarT.E()).j(qVarT.y()).d(j10).c());
        Toast.makeText(context, R.string.callRequestHasBeenSent, 0).show();
        f30149w = SystemClock.elapsedRealtime();
    }

    public static void e(Context context, String str, l1 l1Var) {
        if (SystemClock.elapsedRealtime() - f30149w < 5000) {
            Toast.makeText(context, R.string.toastOperationTooFrequent, 0).show();
            return;
        }
        if (l1Var == null) {
            l1Var = w().r();
        }
        q qVarT = l1Var.T();
        l1Var.O0(new d.c().i(qVarT.w()).k(qVarT.E()).j(qVarT.y()).e(str).c());
        Toast.makeText(context, R.string.callRequestHasBeenSent, 0).show();
        f30149w = SystemClock.elapsedRealtime();
    }

    public static void f(Context context, long j10, l1 l1Var) {
        if (SystemClock.elapsedRealtime() - f30149w < 5000) {
            Toast.makeText(context, R.string.toastOperationTooFrequent, 0).show();
            return;
        }
        if (l1Var == null) {
            l1Var = w().r();
        }
        q qVarT = l1Var.T();
        l1Var.O0(new d.c().i(qVarT.w()).k(qVarT.E()).j(qVarT.y()).g(j10).c());
        Toast.makeText(context, R.string.locationRequestHasBeenSent, 0).show();
        f30149w = SystemClock.elapsedRealtime();
    }

    public static void g(Context context, String str, l1 l1Var) {
        if (SystemClock.elapsedRealtime() - f30149w < 5000) {
            Toast.makeText(context, R.string.toastOperationTooFrequent, 0).show();
            return;
        }
        if (l1Var == null) {
            l1Var = w().r();
        }
        q qVarT = l1Var.T();
        l1Var.O0(new d.c().i(qVarT.w()).k(qVarT.E()).j(qVarT.y()).h(str).c());
        Toast.makeText(context, R.string.locationRequestHasBeenSent, 0).show();
        f30149w = SystemClock.elapsedRealtime();
    }

    private synchronized void i() {
        BluetoothAdapter bluetoothAdapter = this.f30150a;
        if (bluetoothAdapter != null && this.f30151b == null) {
            BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
            this.f30151b = bluetoothLeScanner;
            if (bluetoothLeScanner == null) {
                return;
            }
            this.f30152c = new a();
        }
    }

    private l1 n() {
        for (l1 l1Var : this.f30153d.values()) {
            if ((l1Var instanceof o) && l1Var.i()) {
                return l1Var;
            }
        }
        for (l1 l1Var2 : this.f30153d.values()) {
            if (l1Var2.i()) {
                return l1Var2;
            }
        }
        return null;
    }

    public static l1 u() {
        return w().o();
    }

    public static u w() {
        if (f30148v == null) {
            synchronized (u.class) {
                try {
                    if (f30148v == null) {
                        u uVar = new u();
                        f30148v = uVar;
                        uVar.C();
                    }
                } finally {
                }
            }
        }
        return f30148v;
    }

    public Collection A() {
        return this.f30153d.values();
    }

    public n1 B(long j10) {
        return (n1) y(j10 + 28147497671065500L);
    }

    public synchronized void D(l1 l1Var) {
        try {
            l1 l1Var2 = (l1) this.f30153d.put(Long.valueOf(l1Var.q()), l1Var);
            if (l1Var == l1Var2) {
                return;
            }
            l1Var.k(this);
            if (l1Var2 != null) {
                l1Var2.r(this);
            }
            if (this.f30154e == null && l1Var.q() == Cfg.t()) {
                G(l1Var);
            }
            K();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public void E(n0.d dVar) {
        this.f30157h.add(dVar);
    }

    public synchronized void F(boolean z10) {
        i();
        if (this.f30151b == null) {
            return;
        }
        if (this.f30159s == z10) {
            return;
        }
        if (this.f30150a.isEnabled()) {
            if (z10) {
                this.f30158r.clear();
                try {
                    this.f30151b.startScan(a6.o.b(new ScanFilter.Builder().setServiceUuid(ParcelUuid.fromString("000088a1-0000-1000-8000-00805f9b34fb")).build()), new ScanSettings.Builder().setScanMode(0).build(), this.f30152c);
                    this.f30159s = true;
                } catch (SecurityException unused) {
                }
            } else {
                this.f30159s = false;
                this.f30151b.stopScan(this.f30152c);
            }
        }
    }

    public void G(l1 l1Var) {
        if (this.f30154e == l1Var) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CurrentLink:");
        l1 l1Var2 = this.f30154e;
        sb2.append(l1Var2 == null ? "null" : l1Var2.getName());
        sb2.append(" -> ");
        sb2.append(l1Var != null ? l1Var.getName() : "null");
        s3.b.b("ConnectionManager", sb2.toString());
        if (l1Var != null) {
            if (l1Var instanceof c0) {
                l1Var.v(false);
                this.f30155f = (c0) l1Var;
                if (Cfg.O().getSimpleUI()) {
                    for (l1 l1Var3 : this.f30153d.values()) {
                        if ((l1Var3 instanceof c0) && l1Var != l1Var3) {
                            l1Var3.h(true);
                        }
                    }
                }
                Cfg.O().lastDeviceID = l1Var.q();
            } else if (l1Var instanceof n1) {
                this.f30156g = (n1) l1Var;
                if (Cfg.O().getSimpleUI()) {
                    for (l1 l1Var4 : this.f30153d.values()) {
                        if ((l1Var4 instanceof n1) && l1Var != l1Var4) {
                            l1Var4.h(true);
                        }
                    }
                }
                Cfg.O().lastIIChanelID = l1Var.q() - 28147497671065500L;
            }
            Cfg.r0(l1Var.q());
        } else {
            Cfg.r0(0L);
            if (this.f30154e == this.f30155f) {
                Cfg.O().lastDeviceID = 0L;
                this.f30155f = null;
            }
            if (this.f30154e == this.f30156g) {
                Cfg.O().lastIIChanelID = 0L;
                this.f30156g = null;
            }
        }
        Cfg.n0();
        this.f30154e = l1Var;
        mi.c.e().m(c.CurrentLinkChanged);
        r4.g.I(Main.f5555g);
    }

    public void J(long j10, Im.RfChannelFields rfChannelFields) {
        for (l1 l1Var : this.f30153d.values()) {
            if (l1Var instanceof c0) {
                ((c0) l1Var).V2(j10, rfChannelFields);
            }
        }
    }

    void K() {
        boolean z10;
        Iterator it = this.f30153d.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                z10 = false;
                break;
            } else if (((l1) it.next()) instanceof c0) {
                z10 = true;
                break;
            }
        }
        if (this.f30161u == z10) {
            return;
        }
        this.f30161u = z10;
        RadioService.INSTANCE.b();
    }

    @Override // v4.n0.d
    public void M(n0 n0Var, g3.d dVar) {
        Iterator it = this.f30157h.iterator();
        while (it.hasNext()) {
            ((n0.d) it.next()).M(n0Var, dVar);
        }
    }

    @Override // v4.n0.d
    public void W0(n0 n0Var) {
        Iterator it = this.f30157h.iterator();
        while (it.hasNext()) {
            ((n0.d) it.next()).W0(n0Var);
        }
        mi.c.e().m(new e(n0Var, l1.e.CONTROL_LINK_STATUS_CHANGED));
    }

    @Override // r5.d
    public void a() {
        boolean z10 = !r5.a.q(Main.f5555g);
        for (l1 l1Var : this.f30153d.values()) {
            if (l1Var instanceof c0) {
                ((c0) l1Var).Y2(z10);
            }
        }
    }

    public void c(n0 n0Var) {
        boolean z10;
        if (n0Var == null) {
            return;
        }
        this.f30153d.remove(Long.valueOf(n0Var.q()));
        n0Var.destroy();
        if (this.f30154e == n0Var) {
            G(null);
        }
        boolean z11 = true;
        if (n0Var == this.f30155f) {
            Cfg.O().lastDeviceID = 0L;
            this.f30155f = null;
            z10 = true;
        } else {
            z10 = false;
        }
        if (n0Var == this.f30156g) {
            Cfg.O().lastIIChanelID = 0L;
            this.f30156g = null;
        } else {
            z11 = z10;
        }
        if (z11) {
            Cfg.n0();
            mi.c.e().m(c.CurrentLinkChanged);
            r4.g.I(Main.f5555g);
        }
        K();
    }

    public void h() {
        Activity activityC;
        BluetoothAdapter bluetoothAdapter = this.f30150a;
        if (bluetoothAdapter == null || bluetoothAdapter.isEnabled() || (activityC = v3.j.c()) == null) {
            return;
        }
        v3.j.g(activityC, new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 3);
    }

    @Override // v4.n0.d
    public /* synthetic */ void h0(n0 n0Var) {
        o0.e(this, n0Var);
    }

    @Override // v4.n0.d
    public void i0(n0 n0Var) {
        Iterator it = this.f30157h.iterator();
        while (it.hasNext()) {
            ((n0.d) it.next()).i0(n0Var);
        }
    }

    public d j(long j10, boolean z10) {
        c0 c0Var;
        ChannelBond channelBondH1;
        ChannelBond channelBondH12;
        l1 l1Var = this.f30154e;
        if ((l1Var instanceof c0) && (channelBondH12 = ((c0) l1Var).H1(j10, z10)) != null) {
            this.f30154e.L(false);
            return new d((c0) this.f30154e, channelBondH12);
        }
        for (l1 l1Var2 : this.f30153d.values()) {
            if ((l1Var2 instanceof c0) && (channelBondH1 = (c0Var = (c0) l1Var2).H1(j10, z10)) != null) {
                l1Var2.L(false);
                return new d(c0Var, channelBondH1);
            }
        }
        return null;
    }

    @Override // v4.n0.d
    public void j0(n0 n0Var, k0 k0Var, k0 k0Var2) {
        Iterator it = this.f30157h.iterator();
        while (it.hasNext()) {
            ((n0.d) it.next()).j0(n0Var, k0Var, k0Var2);
        }
    }

    public o k(String str) {
        return (o) this.f30153d.get(Long.valueOf(l1.W(str)));
    }

    public l1 l(long j10) {
        return (l1) this.f30153d.get(Long.valueOf(j10));
    }

    public n1 m(long j10) {
        l1 l1VarL = l(j10 + 28147497671065500L);
        if (l1VarL instanceof n1) {
            return (n1) l1VarL;
        }
        return null;
    }

    public l1 o() {
        l1 l1Var = this.f30154e;
        if ((l1Var instanceof c0) && l1Var.n()) {
            return this.f30154e;
        }
        c0 c0Var = this.f30155f;
        if (c0Var != null && c0Var.n()) {
            return c0Var;
        }
        for (l1 l1Var2 : this.f30153d.values()) {
            if ((l1Var2 instanceof c0) && l1Var2.n()) {
                return l1Var2;
            }
        }
        n1 n1Var = this.f30156g;
        if (n1Var != null && n1Var.n()) {
            return n1Var;
        }
        for (l1 l1Var3 : this.f30153d.values()) {
            if (l1Var3.n()) {
                return l1Var3;
            }
        }
        return null;
    }

    @Override // v4.n0.d
    public void o0(n0 n0Var) {
        Iterator it = this.f30157h.iterator();
        while (it.hasNext()) {
            ((n0.d) it.next()).o0(n0Var);
        }
        mi.c.e().m(new e(n0Var, l1.e.AUDIO_LINK_STATUS_CHANGED));
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(b.a aVar) {
        if (aVar != b.a.f6868a) {
            return;
        }
        for (l1 l1Var : this.f30153d.values()) {
            if (l1Var instanceof n1) {
                c(l1Var);
            }
        }
        com.dw.ht.ii.a.e();
    }

    public ArrayList p() {
        ArrayList arrayListA = a6.o.a();
        for (l1 l1Var : this.f30153d.values()) {
            if (l1Var.n()) {
                arrayListA.add(l1Var);
            }
        }
        return arrayListA;
    }

    public c0 q() {
        c0 c0Var = this.f30155f;
        if (c0Var != null) {
            return c0Var;
        }
        for (l1 l1Var : this.f30153d.values()) {
            if (l1Var instanceof c0) {
                if (l1Var.i()) {
                    return (c0) l1Var;
                }
                c0Var = (c0) l1Var;
            }
        }
        return c0Var;
    }

    public l1 r() {
        l1 l1VarY = this.f30154e;
        if (l1VarY != null && l1VarY.isDestroyed() && (l1VarY = y(l1VarY.q())) != null) {
            if (l1VarY.isDestroyed()) {
                l1VarY = null;
            } else {
                this.f30154e = l1VarY;
            }
        }
        if (l1VarY != null) {
            return l1VarY;
        }
        l1 l1VarO = o();
        if (l1VarO != null) {
            return l1VarO;
        }
        l1 l1VarN = n();
        if (l1VarN != null) {
            return l1VarN;
        }
        Iterator it = this.f30153d.values().iterator();
        if (it.hasNext()) {
            return (l1) it.next();
        }
        return null;
    }

    public long s() {
        l1 l1VarX = x();
        if (l1VarX != null) {
            return l1VarX.q();
        }
        return 0L;
    }

    public n1 t() {
        n1 n1Var = this.f30156g;
        if (n1Var != null) {
            return n1Var;
        }
        for (l1 l1Var : this.f30153d.values()) {
            if ((l1Var instanceof n1) && l1Var.i()) {
                return (n1) l1Var;
            }
        }
        return null;
    }

    public n0 v(long j10) {
        return (j10 < 562949953421310L || j10 > 844424930131964L) ? y(j10) : i0.N(j10);
    }

    public l1 x() {
        return r();
    }

    public l1 y(long j10) {
        u4.z zVar;
        l1 l1Var = (l1) this.f30153d.get(Long.valueOf(j10));
        if (l1Var != null) {
            return l1Var;
        }
        synchronized (this.f30160t) {
            try {
                l1 oVar = (l1) this.f30153d.get(Long.valueOf(j10));
                if (oVar != null) {
                    return oVar;
                }
                if (j10 >= 28147497671065500L) {
                    II iiA = com.dw.ht.ii.a.a();
                    if (iiA != null && (zVar = (u4.z) iiA.linkManager.getLink(j10 - 28147497671065500L)) != null) {
                        oVar = zVar.s();
                    }
                } else if (j10 >= 281474976710910L && j10 < 281474976711164L) {
                    oVar = new g2(j10);
                } else if (j10 == 281474976710657L) {
                    oVar = new g();
                } else if (j10 > 0 && j10 <= 281474976710655L && this.f30150a != null) {
                    oVar = new o(m0.k(j10));
                }
                if (oVar == null) {
                    return null;
                }
                D(oVar);
                return oVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public l1 z() {
        l1 l1VarO = o();
        if (l1VarO != null) {
            return l1VarO;
        }
        l1 l1VarY = y(281474976710657L);
        if (l1VarY.n()) {
            return l1VarY;
        }
        return null;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(Cfg.a aVar) {
        int i10 = b.f30163a[aVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            Cfg.Settings settingsO = Cfg.O();
            boolean pttLock = settingsO.getPttLock();
            boolean imperialUnits = settingsO.getImperialUnits();
            for (l1 l1Var : this.f30153d.values()) {
                if (l1Var instanceof c0) {
                    c0 c0Var = (c0) l1Var;
                    if (c0Var.n()) {
                        a2 a2VarC2 = c0Var.c2();
                        if (a2VarC2.f29711z != pttLock || a2VarC2.F != imperialUnits) {
                            a2VarC2.f29711z = pttLock;
                            a2VarC2.F = imperialUnits;
                            c0Var.A2();
                        }
                    }
                }
            }
        }
    }

    public void H() {
    }
}
