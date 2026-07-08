package v7;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    private c1 B;
    private final a D;
    private final b E;
    private final int F;
    private final String G;
    private volatile String H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f30333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f30334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f30335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f30337e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    q1 f30339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Context f30340h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Looper f30341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final i f30342s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final s7.e f30343t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final Handler f30344u;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private m f30347x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected InterfaceC0406c f30348y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private IInterface f30349z;
    private static final s7.c[] N = new s7.c[0];
    public static final String[] M = {"service_esmobile", "service_googleme"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile String f30338f = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Object f30345v = new Object();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Object f30346w = new Object();
    private final ArrayList A = new ArrayList();
    private int C = 1;
    private s7.a I = null;
    private boolean J = false;
    private volatile f1 K = null;
    protected AtomicInteger L = new AtomicInteger(0);

    public interface a {
        void q(int i10);

        void x(Bundle bundle);
    }

    public interface b {
        void j(s7.a aVar);
    }

    /* JADX INFO: renamed from: v7.c$c, reason: collision with other inner class name */
    public interface InterfaceC0406c {
        void a(s7.a aVar);
    }

    protected class d implements InterfaceC0406c {
        public d() {
        }

        @Override // v7.c.InterfaceC0406c
        public final void a(s7.a aVar) {
            if (aVar.g()) {
                c cVar = c.this;
                cVar.l(null, cVar.B());
            } else if (c.this.E != null) {
                c.this.E.j(aVar);
            }
        }
    }

    public interface e {
        void a();
    }

    protected c(Context context, Looper looper, i iVar, s7.e eVar, int i10, a aVar, b bVar, String str) {
        q.j(context, "Context must not be null");
        this.f30340h = context;
        q.j(looper, "Looper must not be null");
        this.f30341r = looper;
        q.j(iVar, "Supervisor must not be null");
        this.f30342s = iVar;
        q.j(eVar, "API availability must not be null");
        this.f30343t = eVar;
        this.f30344u = new z0(this, looper);
        this.F = i10;
        this.D = aVar;
        this.E = bVar;
        this.G = str;
    }

    static /* bridge */ /* synthetic */ void a0(c cVar, f1 f1Var) {
        cVar.K = f1Var;
        if (cVar.Q()) {
            f fVar = f1Var.f30388d;
            r.b().c(fVar == null ? null : fVar.h());
        }
    }

    static /* bridge */ /* synthetic */ void b0(c cVar, int i10) {
        int i11;
        int i12;
        synchronized (cVar.f30345v) {
            i11 = cVar.C;
        }
        if (i11 == 3) {
            cVar.J = true;
            i12 = 5;
        } else {
            i12 = 4;
        }
        Handler handler = cVar.f30344u;
        handler.sendMessage(handler.obtainMessage(i12, cVar.L.get(), 16));
    }

    static /* bridge */ /* synthetic */ boolean e0(c cVar, int i10, int i11, IInterface iInterface) {
        synchronized (cVar.f30345v) {
            try {
                if (cVar.C != i10) {
                    return false;
                }
                cVar.g0(i11, iInterface);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    static /* bridge */ /* synthetic */ boolean f0(c cVar) {
        if (cVar.J || TextUtils.isEmpty(cVar.D()) || TextUtils.isEmpty(cVar.A())) {
            return false;
        }
        try {
            Class.forName(cVar.D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g0(int i10, IInterface iInterface) {
        q1 q1Var;
        q.a((i10 == 4) == (iInterface != null));
        synchronized (this.f30345v) {
            try {
                this.C = i10;
                this.f30349z = iInterface;
                Bundle bundle = null;
                if (i10 == 1) {
                    c1 c1Var = this.B;
                    if (c1Var != null) {
                        i iVar = this.f30342s;
                        String strB = this.f30339g.b();
                        q.i(strB);
                        iVar.e(strB, this.f30339g.a(), 4225, c1Var, V(), this.f30339g.c());
                        this.B = null;
                    }
                } else if (i10 == 2 || i10 == 3) {
                    c1 c1Var2 = this.B;
                    if (c1Var2 != null && (q1Var = this.f30339g) != null) {
                        Log.e("GmsClient", "Calling connect() while still connected, missing disconnect() for " + q1Var.b() + " on " + q1Var.a());
                        i iVar2 = this.f30342s;
                        String strB2 = this.f30339g.b();
                        q.i(strB2);
                        iVar2.e(strB2, this.f30339g.a(), 4225, c1Var2, V(), this.f30339g.c());
                        this.L.incrementAndGet();
                    }
                    c1 c1Var3 = new c1(this, this.L.get());
                    this.B = c1Var3;
                    q1 q1Var2 = (this.C != 3 || A() == null) ? new q1(F(), E(), false, 4225, H()) : new q1(x().getPackageName(), A(), true, 4225, false);
                    this.f30339g = q1Var2;
                    if (q1Var2.c() && k() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.f30339g.b())));
                    }
                    i iVar3 = this.f30342s;
                    String strB3 = this.f30339g.b();
                    q.i(strB3);
                    s7.a aVarC = iVar3.c(new j1(strB3, this.f30339g.a(), 4225, this.f30339g.c()), c1Var3, V(), v());
                    if (!aVarC.g()) {
                        Log.w("GmsClient", "unable to connect to service: " + this.f30339g.b() + " on " + this.f30339g.a());
                        int iB = aVarC.b() == -1 ? 16 : aVarC.b();
                        if (aVarC.e() != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", aVarC.e());
                        }
                        c0(iB, bundle, this.L.get());
                    }
                } else if (i10 == 4) {
                    q.i(iInterface);
                    J(iInterface);
                }
            } finally {
            }
        }
    }

    protected String A() {
        return null;
    }

    protected abstract Set B();

    public final IInterface C() {
        IInterface iInterface;
        synchronized (this.f30345v) {
            try {
                if (this.C == 5) {
                    throw new DeadObjectException();
                }
                q();
                iInterface = this.f30349z;
                q.j(iInterface, "Client is connected but service is null");
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iInterface;
    }

    protected abstract String D();

    protected abstract String E();

    protected String F() {
        return "com.google.android.gms";
    }

    public f G() {
        f1 f1Var = this.K;
        if (f1Var == null) {
            return null;
        }
        return f1Var.f30388d;
    }

    protected boolean H() {
        return k() >= 211700000;
    }

    public boolean I() {
        return this.K != null;
    }

    protected void J(IInterface iInterface) {
        this.f30335c = System.currentTimeMillis();
    }

    protected void K(s7.a aVar) {
        this.f30336d = aVar.b();
        this.f30337e = System.currentTimeMillis();
    }

    protected void L(int i10) {
        this.f30333a = i10;
        this.f30334b = System.currentTimeMillis();
    }

    protected void M(int i10, IBinder iBinder, Bundle bundle, int i11) {
        this.f30344u.sendMessage(this.f30344u.obtainMessage(1, i11, -1, new d1(this, i10, iBinder, bundle)));
    }

    public boolean N() {
        return false;
    }

    public void O(String str) {
        this.H = str;
    }

    public void P(int i10) {
        this.f30344u.sendMessage(this.f30344u.obtainMessage(6, this.L.get(), i10));
    }

    public boolean Q() {
        return false;
    }

    protected final String V() {
        String str = this.G;
        return str == null ? this.f30340h.getClass().getName() : str;
    }

    public void a() {
        this.L.incrementAndGet();
        synchronized (this.A) {
            try {
                int size = this.A.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((a1) this.A.get(i10)).d();
                }
                this.A.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        synchronized (this.f30346w) {
            this.f30347x = null;
        }
        g0(1, null);
    }

    public boolean b() {
        boolean z10;
        synchronized (this.f30345v) {
            z10 = this.C == 4;
        }
        return z10;
    }

    protected final void c0(int i10, Bundle bundle, int i11) {
        this.f30344u.sendMessage(this.f30344u.obtainMessage(7, i11, -1, new e1(this, i10, bundle)));
    }

    public void e(e eVar) {
        eVar.a();
    }

    public void f(String str) {
        this.f30338f = str;
        a();
    }

    public void g(InterfaceC0406c interfaceC0406c) {
        q.j(interfaceC0406c, "Connection progress callbacks cannot be null.");
        this.f30348y = interfaceC0406c;
        g0(2, null);
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f30345v) {
            int i10 = this.C;
            z10 = true;
            if (i10 != 2 && i10 != 3) {
                z10 = false;
            }
        }
        return z10;
    }

    public String i() {
        q1 q1Var;
        if (!b() || (q1Var = this.f30339g) == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
        return q1Var.a();
    }

    public boolean j() {
        return true;
    }

    public abstract int k();

    public void l(k kVar, Set set) {
        Bundle bundleZ = z();
        String str = Build.VERSION.SDK_INT < 31 ? this.H : this.H;
        int i10 = this.F;
        int i11 = s7.e.f26992a;
        Scope[] scopeArr = g.f30389x;
        Bundle bundle = new Bundle();
        s7.c[] cVarArr = g.f30390y;
        g gVar = new g(6, i10, i11, null, null, scopeArr, bundle, null, cVarArr, cVarArr, true, 0, false, str);
        gVar.f30394d = this.f30340h.getPackageName();
        gVar.f30397g = bundleZ;
        if (set != null) {
            gVar.f30396f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (o()) {
            Account accountT = t();
            if (accountT == null) {
                accountT = new Account("<<default account>>", "com.google");
            }
            gVar.f30398h = accountT;
            if (kVar != null) {
                gVar.f30395e = kVar.asBinder();
            }
        } else if (N()) {
            gVar.f30398h = t();
        }
        gVar.f30399r = N;
        gVar.f30400s = u();
        if (Q()) {
            gVar.f30403v = true;
        }
        try {
            synchronized (this.f30346w) {
                try {
                    m mVar = this.f30347x;
                    if (mVar != null) {
                        mVar.r0(new b1(this, this.L.get()), gVar);
                    } else {
                        Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } finally {
                }
            }
        } catch (DeadObjectException e10) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e10);
            P(3);
        } catch (RemoteException e11) {
            e = e11;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.L.get());
        } catch (SecurityException e12) {
            throw e12;
        } catch (RuntimeException e13) {
            e = e13;
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            M(8, null, null, this.L.get());
        }
    }

    public final s7.c[] m() {
        f1 f1Var = this.K;
        if (f1Var == null) {
            return null;
        }
        return f1Var.f30386b;
    }

    public String n() {
        return this.f30338f;
    }

    public boolean o() {
        return false;
    }

    protected final void q() {
        if (!b()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    protected abstract IInterface r(IBinder iBinder);

    protected boolean s() {
        return false;
    }

    public abstract Account t();

    public s7.c[] u() {
        return N;
    }

    protected abstract Executor v();

    public Bundle w() {
        return null;
    }

    public final Context x() {
        return this.f30340h;
    }

    public int y() {
        return this.F;
    }

    protected Bundle z() {
        return new Bundle();
    }
}
