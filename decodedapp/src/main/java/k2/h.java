package k2;

import android.os.Build;
import android.os.Process;
import android.util.Log;
import com.bumptech.glide.d;
import com.bumptech.glide.j;
import f3.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import k2.f;
import k2.i;

/* JADX INFO: loaded from: classes.dex */
class h implements f.a, Runnable, Comparable, a.f {
    public static final i2.g R = i2.g.e("glide_thread_priority_override");
    private EnumC0251h A;
    private g B;
    private long C;
    private boolean D;
    private Object E;
    private com.bumptech.glide.f F;
    private Supplier G;
    private Thread H;
    private i2.f I;
    private i2.f J;
    private Object K;
    private i2.a L;
    private com.bumptech.glide.load.data.d M;
    private volatile k2.f N;
    private volatile boolean O;
    private volatile boolean P;
    private boolean Q;

    /* JADX INFO: renamed from: d */
    private final e f18984d;

    /* JADX INFO: renamed from: e */
    private final l0.d f18985e;

    /* JADX INFO: renamed from: h */
    private com.bumptech.glide.e f18988h;

    /* JADX INFO: renamed from: r */
    private i2.f f18989r;

    /* JADX INFO: renamed from: s */
    private com.bumptech.glide.h f18990s;

    /* JADX INFO: renamed from: t */
    private n f18991t;

    /* JADX INFO: renamed from: u */
    private int f18992u;

    /* JADX INFO: renamed from: v */
    private int f18993v;

    /* JADX INFO: renamed from: w */
    private j f18994w;

    /* JADX INFO: renamed from: x */
    private i2.h f18995x;

    /* JADX INFO: renamed from: y */
    private b f18996y;

    /* JADX INFO: renamed from: z */
    private int f18997z;

    /* JADX INFO: renamed from: a */
    private final k2.g f18981a = new k2.g();

    /* JADX INFO: renamed from: b */
    private final List f18982b = new ArrayList();

    /* JADX INFO: renamed from: c */
    private final f3.c f18983c = f3.c.a();

    /* JADX INFO: renamed from: f */
    private final d f18986f = new d();

    /* JADX INFO: renamed from: g */
    private final f f18987g = new f();

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f18998a;

        /* JADX INFO: renamed from: b */
        static final /* synthetic */ int[] f18999b;

        /* JADX INFO: renamed from: c */
        static final /* synthetic */ int[] f19000c;

        static {
            int[] iArr = new int[i2.c.values().length];
            f19000c = iArr;
            try {
                iArr[i2.c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19000c[i2.c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[EnumC0251h.values().length];
            f18999b = iArr2;
            try {
                iArr2[EnumC0251h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f18999b[EnumC0251h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f18999b[EnumC0251h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f18999b[EnumC0251h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f18999b[EnumC0251h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f18998a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f18998a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f18998a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    interface b {
        void a(h hVar);

        void b(q qVar);

        void c(v vVar, i2.a aVar, boolean z10);
    }

    private final class c implements i.a {

        /* JADX INFO: renamed from: a */
        private final i2.a f19001a;

        c(i2.a aVar) {
            this.f19001a = aVar;
        }

        @Override // k2.i.a
        public v a(v vVar) {
            return h.this.B(this.f19001a, vVar);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a */
        private i2.f f19003a;

        /* JADX INFO: renamed from: b */
        private i2.k f19004b;

        /* JADX INFO: renamed from: c */
        private u f19005c;

        d() {
        }

        void a() {
            this.f19003a = null;
            this.f19004b = null;
            this.f19005c = null;
        }

        void b(e eVar, i2.h hVar) {
            f3.b.a("DecodeJob.encode");
            try {
                eVar.a().b(this.f19003a, new k2.e(this.f19004b, this.f19005c, hVar));
            } finally {
                this.f19005c.h();
                f3.b.e();
            }
        }

        boolean c() {
            return this.f19005c != null;
        }

        void d(i2.f fVar, i2.k kVar, u uVar) {
            this.f19003a = fVar;
            this.f19004b = kVar;
            this.f19005c = uVar;
        }
    }

    interface e {
        m2.a a();
    }

    private static class f {

        /* JADX INFO: renamed from: a */
        private boolean f19006a;

        /* JADX INFO: renamed from: b */
        private boolean f19007b;

        /* JADX INFO: renamed from: c */
        private boolean f19008c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f19008c || z10 || this.f19007b) && this.f19006a;
        }

        synchronized boolean b() {
            this.f19007b = true;
            return a(false);
        }

        synchronized boolean c() {
            this.f19008c = true;
            return a(false);
        }

        synchronized boolean d(boolean z10) {
            this.f19006a = true;
            return a(z10);
        }

        synchronized void e() {
            this.f19007b = false;
            this.f19006a = false;
            this.f19008c = false;
        }
    }

    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: renamed from: k2.h$h */
    private enum EnumC0251h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, l0.d dVar) {
        this.f18984d = eVar;
        this.f18985e = dVar;
    }

    private void A() {
        if (this.f18987g.c()) {
            D();
        }
    }

    private void D() {
        this.f18987g.e();
        this.f18986f.a();
        this.f18981a.a();
        this.O = false;
        this.f18988h = null;
        this.f18989r = null;
        this.f18995x = null;
        this.f18990s = null;
        this.f18991t = null;
        this.f18996y = null;
        this.A = null;
        this.N = null;
        this.H = null;
        this.I = null;
        this.K = null;
        this.L = null;
        this.M = null;
        this.C = 0L;
        this.P = false;
        this.E = null;
        this.f18982b.clear();
        this.f18985e.a(this);
    }

    private void E(g gVar) {
        this.B = gVar;
        this.f18996y.a(this);
    }

    private void F() {
        if (!this.F.a(d.C0077d.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.G;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e10) {
            this.G = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e10);
            }
        }
    }

    private void G() {
        this.H = Thread.currentThread();
        this.C = e3.g.b();
        boolean zB = false;
        while (!this.P && this.N != null && !(zB = this.N.b())) {
            this.A = m(this.A);
            this.N = l();
            if (this.A == EnumC0251h.SOURCE) {
                E(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.A == EnumC0251h.FINISHED || this.P) && !zB) {
            x();
        }
    }

    private v H(Object obj, i2.a aVar, t tVar) {
        i2.h hVarN = n(aVar);
        com.bumptech.glide.load.data.e eVarL = this.f18988h.i().l(obj);
        try {
            return tVar.a(eVarL, hVarN, this.f18992u, this.f18993v, new c(aVar));
        } finally {
            eVarL.b();
        }
    }

    private void I() {
        int i10 = a.f18998a[this.B.ordinal()];
        if (i10 == 1) {
            this.A = m(EnumC0251h.INITIALIZE);
            this.N = l();
            G();
        } else if (i10 == 2) {
            G();
        } else {
            if (i10 == 3) {
                k();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.B);
        }
    }

    private void J() {
        Throwable th2;
        this.f18983c.c();
        if (!this.O) {
            this.O = true;
            return;
        }
        if (this.f18982b.isEmpty()) {
            th2 = null;
        } else {
            List list = this.f18982b;
            th2 = (Throwable) list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th2);
    }

    private v i(com.bumptech.glide.load.data.d dVar, Object obj, i2.a aVar) {
        if (obj == null) {
            dVar.b();
            return null;
        }
        try {
            long jB = e3.g.b();
            v vVarJ = j(obj, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                s("Decoded result " + vVarJ, jB);
            }
            return vVarJ;
        } finally {
            dVar.b();
        }
    }

    private v j(Object obj, i2.a aVar) {
        return H(obj, aVar, this.f18981a.h(obj.getClass()));
    }

    private void k() {
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            u("Retrieved data", this.C, "data: " + this.K + ", cache key: " + this.I + ", fetcher: " + this.M);
        }
        v vVarI = null;
        if (this.F.a(d.C0077d.class) && (supplier = this.G) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.G.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e10) {
                this.G = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e10);
                }
            }
        }
        try {
            vVarI = i(this.M, this.K, this.L);
        } catch (q e11) {
            e11.i(this.J, this.L);
            this.f18982b.add(e11);
        }
        if (vVarI != null) {
            w(vVarI, this.L, this.Q);
        } else {
            G();
        }
    }

    private k2.f l() {
        int i10 = a.f18999b[this.A.ordinal()];
        if (i10 == 1) {
            return new w(this.f18981a, this);
        }
        if (i10 == 2) {
            return new k2.c(this.f18981a, this);
        }
        if (i10 == 3) {
            return new z(this.f18981a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.A);
    }

    private EnumC0251h m(EnumC0251h enumC0251h) {
        int i10 = a.f18999b[enumC0251h.ordinal()];
        if (i10 == 1) {
            return this.f18994w.a() ? EnumC0251h.DATA_CACHE : m(EnumC0251h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.D ? EnumC0251h.FINISHED : EnumC0251h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return EnumC0251h.FINISHED;
        }
        if (i10 == 5) {
            return this.f18994w.b() ? EnumC0251h.RESOURCE_CACHE : m(EnumC0251h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + enumC0251h);
    }

    private i2.h n(i2.a aVar) {
        i2.h hVar = this.f18995x;
        if (Build.VERSION.SDK_INT < 26) {
            return hVar;
        }
        boolean z10 = aVar == i2.a.RESOURCE_DISK_CACHE || this.f18981a.x();
        i2.g gVar = r2.s.f25396j;
        Boolean bool = (Boolean) hVar.c(gVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return hVar;
        }
        i2.h hVar2 = new i2.h();
        hVar2.d(this.f18995x);
        hVar2.e(gVar, Boolean.valueOf(z10));
        return hVar2;
    }

    private int q() {
        return this.f18990s.ordinal();
    }

    private void s(String str, long j10) {
        u(str, j10, null);
    }

    private void u(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(e3.g.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f18991t);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    private void v(v vVar, i2.a aVar, boolean z10) {
        if (this.F.a(d.C0077d.class)) {
            F();
        }
        J();
        this.f18996y.c(vVar, aVar, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void w(v vVar, i2.a aVar, boolean z10) {
        u uVar;
        f3.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (vVar instanceof r) {
                ((r) vVar).b();
            }
            if (this.f18986f.c()) {
                vVar = u.e(vVar);
                uVar = vVar;
            } else {
                uVar = 0;
            }
            v(vVar, aVar, z10);
            this.A = EnumC0251h.ENCODE;
            try {
                if (this.f18986f.c()) {
                    this.f18986f.b(this.f18984d, this.f18995x);
                }
                y();
                f3.b.e();
            } finally {
                if (uVar != 0) {
                    uVar.h();
                }
            }
        } catch (Throwable th2) {
            f3.b.e();
            throw th2;
        }
    }

    private void x() {
        if (this.F.a(d.C0077d.class)) {
            F();
        }
        J();
        this.f18996y.b(new q("Failed to load resource", new ArrayList(this.f18982b)));
        A();
    }

    private void y() {
        if (this.f18987g.b()) {
            D();
        }
    }

    v B(i2.a aVar, v vVar) {
        v vVarB;
        i2.l lVar;
        i2.c cVarA;
        i2.f dVar;
        Class<?> cls = vVar.get().getClass();
        i2.k kVarN = null;
        if (aVar != i2.a.RESOURCE_DISK_CACHE) {
            i2.l lVarS = this.f18981a.s(cls);
            lVar = lVarS;
            vVarB = lVarS.b(this.f18988h, vVar, this.f18992u, this.f18993v);
        } else {
            vVarB = vVar;
            lVar = null;
        }
        if (!vVar.equals(vVarB)) {
            vVar.c();
        }
        if (this.f18981a.w(vVarB)) {
            kVarN = this.f18981a.n(vVarB);
            cVarA = kVarN.a(this.f18995x);
        } else {
            cVarA = i2.c.NONE;
        }
        i2.k kVar = kVarN;
        if (!this.f18994w.d(!this.f18981a.y(this.I), aVar, cVarA)) {
            return vVarB;
        }
        if (kVar == null) {
            throw new j.d(vVarB.get().getClass());
        }
        int i10 = a.f19000c[cVarA.ordinal()];
        if (i10 == 1) {
            dVar = new k2.d(this.I, this.f18989r);
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + cVarA);
            }
            dVar = new x(this.f18981a.b(), this.I, this.f18989r, this.f18992u, this.f18993v, lVar, cls, this.f18995x);
        }
        u uVarE = u.e(vVarB);
        this.f18986f.d(dVar, kVar, uVarE);
        return uVarE;
    }

    void C(boolean z10) {
        if (this.f18987g.d(z10)) {
            D();
        }
    }

    boolean K() {
        EnumC0251h enumC0251hM = m(EnumC0251h.INITIALIZE);
        return enumC0251hM == EnumC0251h.RESOURCE_CACHE || enumC0251hM == EnumC0251h.DATA_CACHE;
    }

    @Override // k2.f.a
    public void a(i2.f fVar, Object obj, com.bumptech.glide.load.data.d dVar, i2.a aVar, i2.f fVar2) {
        this.I = fVar;
        this.K = obj;
        this.M = dVar;
        this.L = aVar;
        this.J = fVar2;
        this.Q = fVar != this.f18981a.c().get(0);
        if (Thread.currentThread() != this.H) {
            E(g.DECODE_DATA);
            return;
        }
        f3.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            k();
        } finally {
            f3.b.e();
        }
    }

    @Override // k2.f.a
    public void d(i2.f fVar, Exception exc, com.bumptech.glide.load.data.d dVar, i2.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", exc);
        qVar.j(fVar, aVar, dVar.a());
        this.f18982b.add(qVar);
        if (Thread.currentThread() != this.H) {
            E(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            G();
        }
    }

    @Override // k2.f.a
    public void e() {
        E(g.SWITCH_TO_SOURCE_SERVICE);
    }

    @Override // f3.a.f
    public f3.c f() {
        return this.f18983c;
    }

    public void g() {
        this.P = true;
        k2.f fVar = this.N;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: h */
    public int compareTo(h hVar) {
        int iQ = q() - hVar.q();
        return iQ == 0 ? this.f18997z - hVar.f18997z : iQ;
    }

    h r(com.bumptech.glide.e eVar, Object obj, n nVar, i2.f fVar, int i10, int i11, Class cls, Class cls2, com.bumptech.glide.h hVar, j jVar, Map map, boolean z10, boolean z11, boolean z12, i2.h hVar2, b bVar, int i12) {
        this.f18981a.v(eVar, obj, fVar, i10, i11, jVar, cls, cls2, hVar, hVar2, map, z10, z11, this.f18984d);
        this.f18988h = eVar;
        this.f18989r = fVar;
        this.f18990s = hVar;
        this.f18991t = nVar;
        this.f18992u = i10;
        this.f18993v = i11;
        this.f18994w = jVar;
        this.D = z12;
        this.f18995x = hVar2;
        this.f18996y = bVar;
        this.f18997z = i12;
        this.B = g.INITIALIZE;
        this.E = obj;
        this.F = eVar.g();
        this.G = (Supplier) hVar2.c(R);
        return this;
    }

    @Override // java.lang.Runnable
    public void run() {
        f3.b.c("DecodeJob#run(reason=%s, model=%s)", this.B, this.E);
        com.bumptech.glide.load.data.d dVar = this.M;
        try {
            try {
                try {
                    if (this.P) {
                        x();
                        if (dVar != null) {
                            dVar.b();
                        }
                        f3.b.e();
                        return;
                    }
                    I();
                    if (dVar != null) {
                        dVar.b();
                    }
                    f3.b.e();
                } catch (Throwable th2) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.P + ", stage: " + this.A, th2);
                    }
                    if (this.A != EnumC0251h.ENCODE) {
                        this.f18982b.add(th2);
                        x();
                    }
                    if (!this.P) {
                        throw th2;
                    }
                    throw th2;
                }
            } catch (k2.b e10) {
                throw e10;
            }
        } catch (Throwable th3) {
            if (dVar != null) {
                dVar.b();
            }
            f3.b.e();
            throw th3;
        }
    }
}
