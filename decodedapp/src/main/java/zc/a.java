package zc;

import hc.j;
import java.util.concurrent.Callable;
import uc.k;
import uc.l;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a */
    static final j f33107a = yc.a.g(new h());

    /* JADX INFO: renamed from: b */
    static final j f33108b = yc.a.d(new b());

    /* JADX INFO: renamed from: c */
    static final j f33109c = yc.a.e(new c());

    /* JADX INFO: renamed from: d */
    static final j f33110d = l.d();

    /* JADX INFO: renamed from: e */
    static final j f33111e = yc.a.f(new f());

    /* JADX INFO: renamed from: zc.a$a */
    static final class C0448a {

        /* JADX INFO: renamed from: a */
        static final j f33112a = new uc.b();
    }

    static final class b implements Callable {
        b() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a */
        public j call() {
            return C0448a.f33112a;
        }
    }

    static final class c implements Callable {
        c() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a */
        public j call() {
            return d.f33113a;
        }
    }

    static final class d {

        /* JADX INFO: renamed from: a */
        static final j f33113a = new uc.c();
    }

    static final class e {

        /* JADX INFO: renamed from: a */
        static final j f33114a = new uc.d();
    }

    static final class f implements Callable {
        f() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a */
        public j call() {
            return e.f33114a;
        }
    }

    static final class g {

        /* JADX INFO: renamed from: a */
        static final j f33115a = new k();
    }

    static final class h implements Callable {
        h() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a */
        public j call() {
            return g.f33115a;
        }
    }

    public static j a() {
        return yc.a.m(f33108b);
    }

    public static j b() {
        return yc.a.o(f33109c);
    }
}
