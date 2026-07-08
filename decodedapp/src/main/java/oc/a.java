package oc;

import java.util.Comparator;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final mc.d f23402a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Runnable f23403b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final mc.a f23404c = new C0316a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final mc.c f23405d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final mc.c f23406e = new e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final mc.c f23407f = new k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final mc.e f23408g = new c();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final mc.f f23409h = new l();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final mc.f f23410i = new f();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final Callable f23411j = new j();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Comparator f23412k = new i();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final mc.c f23413l = new h();

    static final class c implements mc.e {
        c() {
        }
    }

    static final class e implements mc.c {
        e() {
        }

        @Override // mc.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            yc.a.n(th2);
        }
    }

    static final class f implements mc.f {
        f() {
        }
    }

    static final class h implements mc.c {
        h() {
        }

        @Override // mc.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(ck.c cVar) {
            cVar.request(Long.MAX_VALUE);
        }
    }

    static final class i implements Comparator {
        i() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return ((Comparable) obj).compareTo(obj2);
        }
    }

    static final class j implements Callable {
        j() {
        }

        @Override // java.util.concurrent.Callable
        public Object call() {
            return null;
        }
    }

    static final class k implements mc.c {
        k() {
        }

        @Override // mc.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void accept(Throwable th2) {
            yc.a.n(new lc.d(th2));
        }
    }

    static final class l implements mc.f {
        l() {
        }
    }

    public static mc.c a() {
        return f23405d;
    }

    /* JADX INFO: renamed from: oc.a$a, reason: collision with other inner class name */
    static final class C0316a implements mc.a {
        C0316a() {
        }

        public String toString() {
            return "EmptyAction";
        }

        @Override // mc.a
        public void run() {
        }
    }

    static final class d implements Runnable {
        d() {
        }

        public String toString() {
            return "EmptyRunnable";
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static final class b implements mc.c {
        b() {
        }

        public String toString() {
            return "EmptyConsumer";
        }

        @Override // mc.c
        public void accept(Object obj) {
        }
    }

    static final class g implements mc.d {
        g() {
        }

        public String toString() {
            return "IdentityFunction";
        }

        @Override // mc.d
        public Object apply(Object obj) {
            return obj;
        }
    }
}
