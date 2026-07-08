package dk;

import dk.i;
import eh.g0;
import eh.i0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
final class b extends i.a {

    static final class a implements i {

        /* JADX INFO: renamed from: a */
        static final a f11129a = new a();

        a() {
        }

        @Override // dk.i
        /* JADX INFO: renamed from: a */
        public i0 convert(i0 i0Var) {
            try {
                return e0.a(i0Var);
            } finally {
                i0Var.close();
            }
        }
    }

    static final class d implements i {

        /* JADX INFO: renamed from: a */
        static final d f11132a = new d();

        d() {
        }

        @Override // dk.i
        /* JADX INFO: renamed from: a */
        public String convert(Object obj) {
            return obj.toString();
        }
    }

    static final class e implements i {

        /* JADX INFO: renamed from: a */
        static final e f11133a = new e();

        e() {
        }

        @Override // dk.i
        /* JADX INFO: renamed from: a */
        public dd.d0 convert(i0 i0Var) {
            i0Var.close();
            return dd.d0.f10897a;
        }
    }

    static final class f implements i {

        /* JADX INFO: renamed from: a */
        static final f f11134a = new f();

        f() {
        }

        @Override // dk.i
        /* JADX INFO: renamed from: a */
        public Void convert(i0 i0Var) {
            i0Var.close();
            return null;
        }
    }

    b() {
    }

    @Override // dk.i.a
    public i c(Type type, Annotation[] annotationArr, Annotation[] annotationArr2, a0 a0Var) {
        if (g0.class.isAssignableFrom(e0.h(type))) {
            return C0150b.f11130a;
        }
        return null;
    }

    @Override // dk.i.a
    public i d(Type type, Annotation[] annotationArr, a0 a0Var) {
        if (type == i0.class) {
            return e0.l(annotationArr, ek.w.class) ? c.f11131a : a.f11129a;
        }
        if (type == Void.class) {
            return f.f11134a;
        }
        if (e0.m(type)) {
            return e.f11133a;
        }
        return null;
    }

    /* JADX INFO: renamed from: dk.b$b */
    static final class C0150b implements i {

        /* JADX INFO: renamed from: a */
        static final C0150b f11130a = new C0150b();

        C0150b() {
        }

        @Override // dk.i
        /* JADX INFO: renamed from: a */
        public g0 convert(g0 g0Var) {
            return g0Var;
        }
    }

    static final class c implements i {

        /* JADX INFO: renamed from: a */
        static final c f11131a = new c();

        c() {
        }

        @Override // dk.i
        /* JADX INFO: renamed from: a */
        public i0 convert(i0 i0Var) {
            return i0Var;
        }
    }
}
