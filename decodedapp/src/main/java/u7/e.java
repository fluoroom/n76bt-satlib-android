package u7;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import u7.j;

/* JADX INFO: loaded from: classes.dex */
public class e implements Handler.Callback {
    private static e B;

    /* JADX INFO: renamed from: c */
    private v7.t f28409c;

    /* JADX INFO: renamed from: d */
    private v7.v f28410d;

    /* JADX INFO: renamed from: e */
    private final Context f28411e;

    /* JADX INFO: renamed from: f */
    private final s7.d f28412f;

    /* JADX INFO: renamed from: g */
    private final v7.h0 f28413g;

    /* JADX INFO: renamed from: w */
    private final Handler f28420w;

    /* JADX INFO: renamed from: x */
    private volatile boolean f28421x;

    /* JADX INFO: renamed from: y */
    public static final Status f28405y = new Status(4, "Sign-out occurred while this API call was in progress.");

    /* JADX INFO: renamed from: z */
    private static final Status f28406z = new Status(4, "The user must be signed in to make this API call.");
    private static final Object A = new Object();

    /* JADX INFO: renamed from: a */
    private long f28407a = 10000;

    /* JADX INFO: renamed from: b */
    private boolean f28408b = false;

    /* JADX INFO: renamed from: h */
    private final AtomicInteger f28414h = new AtomicInteger(1);

    /* JADX INFO: renamed from: r */
    private final AtomicInteger f28415r = new AtomicInteger(0);

    /* JADX INFO: renamed from: s */
    private final Map f28416s = new ConcurrentHashMap(5, 0.75f, 1);

    /* JADX INFO: renamed from: t */
    private z f28417t = null;

    /* JADX INFO: renamed from: u */
    private final Set f28418u = new androidx.collection.b();

    /* JADX INFO: renamed from: v */
    private final Set f28419v = new androidx.collection.b();

    private e(Context context, Looper looper, s7.d dVar) {
        this.f28421x = true;
        this.f28411e = context;
        h8.h hVar = new h8.h(looper, this);
        this.f28420w = hVar;
        this.f28412f = dVar;
        this.f28413g = new v7.h0(dVar);
        if (com.google.android.gms.common.util.e.a(context)) {
            this.f28421x = false;
        }
        hVar.sendMessage(hVar.obtainMessage(6));
    }

    public static void a() {
        synchronized (A) {
            try {
                e eVar = B;
                if (eVar != null) {
                    eVar.f28415r.incrementAndGet();
                    Handler handler = eVar.f28420w;
                    handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static Status g(b bVar, s7.a aVar) {
        return new Status(aVar, "API: " + bVar.b() + " is not available on this device. Connection failed with: " + String.valueOf(aVar));
    }

    private final h0 h(t7.f fVar) {
        Map map = this.f28416s;
        b bVarN = fVar.n();
        h0 h0Var = (h0) map.get(bVarN);
        if (h0Var == null) {
            h0Var = new h0(this, fVar);
            this.f28416s.put(bVarN, h0Var);
        }
        if (h0Var.a()) {
            this.f28419v.add(bVarN);
        }
        h0Var.E();
        return h0Var;
    }

    private final v7.v i() {
        if (this.f28410d == null) {
            this.f28410d = v7.u.a(this.f28411e);
        }
        return this.f28410d;
    }

    private final void j() {
        v7.t tVar = this.f28409c;
        if (tVar != null) {
            if (tVar.b() > 0 || e()) {
                i().b(tVar);
            }
            this.f28409c = null;
        }
    }

    private final void k(t8.h hVar, int i10, t7.f fVar) {
        r0 r0VarB;
        if (i10 == 0 || (r0VarB = r0.b(this, i10, fVar.n())) == null) {
            return;
        }
        t8.g gVarA = hVar.a();
        final Handler handler = this.f28420w;
        handler.getClass();
        gVarA.a(new Executor() { // from class: u7.b0
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                handler.post(runnable);
            }
        }, r0VarB);
    }

    public static e u(Context context) {
        e eVar;
        synchronized (A) {
            try {
                if (B == null) {
                    B = new e(context.getApplicationContext(), v7.i.b().getLooper(), s7.d.l());
                }
                eVar = B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public final void C(t7.f fVar, int i10, com.google.android.gms.common.api.internal.a aVar) {
        this.f28420w.sendMessage(this.f28420w.obtainMessage(4, new t0(new h1(i10, aVar), this.f28415r.get(), fVar)));
    }

    public final void D(t7.f fVar, int i10, t tVar, t8.h hVar, r rVar) {
        k(hVar, tVar.d(), fVar);
        this.f28420w.sendMessage(this.f28420w.obtainMessage(4, new t0(new j1(i10, tVar, hVar, rVar), this.f28415r.get(), fVar)));
    }

    final void E(v7.n nVar, int i10, long j10, int i11) {
        this.f28420w.sendMessage(this.f28420w.obtainMessage(18, new s0(nVar, i10, j10, i11)));
    }

    public final void F(s7.a aVar, int i10) {
        if (f(aVar, i10)) {
            return;
        }
        Handler handler = this.f28420w;
        handler.sendMessage(handler.obtainMessage(5, i10, 0, aVar));
    }

    public final void G() {
        Handler handler = this.f28420w;
        handler.sendMessage(handler.obtainMessage(3));
    }

    public final void H(t7.f fVar) {
        Handler handler = this.f28420w;
        handler.sendMessage(handler.obtainMessage(7, fVar));
    }

    public final void b(z zVar) {
        synchronized (A) {
            try {
                if (this.f28417t != zVar) {
                    this.f28417t = zVar;
                    this.f28418u.clear();
                }
                this.f28418u.addAll(zVar.t());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final void c(z zVar) {
        synchronized (A) {
            try {
                if (this.f28417t == zVar) {
                    this.f28417t = null;
                    this.f28418u.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final boolean e() {
        if (this.f28408b) {
            return false;
        }
        v7.s sVarA = v7.r.b().a();
        if (sVarA != null && !sVarA.e()) {
            return false;
        }
        int iA = this.f28413g.a(this.f28411e, 203400000);
        return iA == -1 || iA == 0;
    }

    final boolean f(s7.a aVar, int i10) {
        return this.f28412f.v(this.f28411e, aVar, i10);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        h0 h0Var = null;
        switch (i10) {
            case 1:
                this.f28407a = true == ((Boolean) message.obj).booleanValue() ? 10000L : 300000L;
                this.f28420w.removeMessages(12);
                for (b bVar : this.f28416s.keySet()) {
                    Handler handler = this.f28420w;
                    handler.sendMessageDelayed(handler.obtainMessage(12, bVar), this.f28407a);
                }
                return true;
            case 2:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 3:
                for (h0 h0Var2 : this.f28416s.values()) {
                    h0Var2.D();
                    h0Var2.E();
                }
                return true;
            case 4:
            case 8:
            case 13:
                t0 t0Var = (t0) message.obj;
                h0 h0VarH = (h0) this.f28416s.get(t0Var.f28520c.n());
                if (h0VarH == null) {
                    h0VarH = h(t0Var.f28520c);
                }
                if (!h0VarH.a() || this.f28415r.get() == t0Var.f28519b) {
                    h0VarH.F(t0Var.f28518a);
                } else {
                    t0Var.f28518a.a(f28405y);
                    h0VarH.K();
                }
                return true;
            case 5:
                int i11 = message.arg1;
                s7.a aVar = (s7.a) message.obj;
                Iterator it = this.f28416s.values().iterator();
                while (true) {
                    if (it.hasNext()) {
                        h0 h0Var3 = (h0) it.next();
                        if (h0Var3.r() == i11) {
                            h0Var = h0Var3;
                        }
                    }
                }
                if (h0Var == null) {
                    Log.wtf("GoogleApiManager", "Could not find API instance " + i11 + " while trying to fail enqueued calls.", new Exception());
                } else if (aVar.b() == 13) {
                    h0Var.e(new Status(17, "Error resolution was canceled by the user, original error message: " + this.f28412f.d(aVar.b()) + ": " + aVar.c()));
                } else {
                    h0Var.e(g(h0Var.f28432e, aVar));
                }
                return true;
            case 6:
                if (this.f28411e.getApplicationContext() instanceof Application) {
                    c.c((Application) this.f28411e.getApplicationContext());
                    c.b().a(new c0(this));
                    if (!c.b().e(true)) {
                        this.f28407a = 300000L;
                    }
                }
                return true;
            case 7:
                h((t7.f) message.obj);
                return true;
            case 9:
                if (this.f28416s.containsKey(message.obj)) {
                    ((h0) this.f28416s.get(message.obj)).J();
                }
                return true;
            case 10:
                Iterator it2 = this.f28419v.iterator();
                while (it2.hasNext()) {
                    h0 h0Var4 = (h0) this.f28416s.remove((b) it2.next());
                    if (h0Var4 != null) {
                        h0Var4.K();
                    }
                }
                this.f28419v.clear();
                return true;
            case 11:
                if (this.f28416s.containsKey(message.obj)) {
                    ((h0) this.f28416s.get(message.obj)).L();
                }
                return true;
            case 12:
                if (this.f28416s.containsKey(message.obj)) {
                    ((h0) this.f28416s.get(message.obj)).b();
                }
                return true;
            case 14:
                android.support.v4.media.session.b.a(message.obj);
                throw null;
            case 15:
                j0 j0Var = (j0) message.obj;
                if (this.f28416s.containsKey(j0Var.f28450a)) {
                    h0.B((h0) this.f28416s.get(j0Var.f28450a), j0Var);
                }
                return true;
            case 16:
                j0 j0Var2 = (j0) message.obj;
                if (this.f28416s.containsKey(j0Var2.f28450a)) {
                    h0.C((h0) this.f28416s.get(j0Var2.f28450a), j0Var2);
                }
                return true;
            case 17:
                j();
                return true;
            case 18:
                s0 s0Var = (s0) message.obj;
                if (s0Var.f28506c == 0) {
                    i().b(new v7.t(s0Var.f28505b, Arrays.asList(s0Var.f28504a)));
                } else {
                    v7.t tVar = this.f28409c;
                    if (tVar != null) {
                        List listC = tVar.c();
                        if (tVar.b() != s0Var.f28505b || (listC != null && listC.size() >= s0Var.f28507d)) {
                            this.f28420w.removeMessages(17);
                            j();
                        } else {
                            this.f28409c.e(s0Var.f28504a);
                        }
                    }
                    if (this.f28409c == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(s0Var.f28504a);
                        this.f28409c = new v7.t(s0Var.f28505b, arrayList);
                        Handler handler2 = this.f28420w;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), s0Var.f28506c);
                    }
                }
                return true;
            case 19:
                this.f28408b = false;
                return true;
            default:
                Log.w("GoogleApiManager", "Unknown message id: " + i10);
                return false;
        }
    }

    public final int l() {
        return this.f28414h.getAndIncrement();
    }

    final h0 t(b bVar) {
        return (h0) this.f28416s.get(bVar);
    }

    public final t8.g w(t7.f fVar, n nVar, v vVar, Runnable runnable) {
        t8.h hVar = new t8.h();
        k(hVar, nVar.e(), fVar);
        this.f28420w.sendMessage(this.f28420w.obtainMessage(8, new t0(new i1(new u0(nVar, vVar, runnable), hVar), this.f28415r.get(), fVar)));
        return hVar.a();
    }

    public final t8.g x(t7.f fVar, j.a aVar, int i10) {
        t8.h hVar = new t8.h();
        k(hVar, i10, fVar);
        this.f28420w.sendMessage(this.f28420w.obtainMessage(13, new t0(new k1(aVar, hVar), this.f28415r.get(), fVar)));
        return hVar.a();
    }
}
