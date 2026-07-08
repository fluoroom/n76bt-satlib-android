package he;

import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final v1 f15323a = new v1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map f15324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h f15325c;

    public static final class a extends w1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a f15326c = new a();

        private a() {
            super("inherited", false);
        }
    }

    public static final class b extends w1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f15327c = new b();

        private b() {
            super("internal", false);
        }
    }

    public static final class c extends w1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f15328c = new c();

        private c() {
            super("invisible_fake", false);
        }
    }

    public static final class d extends w1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f15329c = new d();

        private d() {
            super("local", false);
        }
    }

    public static final class e extends w1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final e f15330c = new e();

        private e() {
            super("private", false);
        }
    }

    public static final class f extends w1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final f f15331c = new f();

        private f() {
            super("private_to_this", false);
        }

        @Override // he.w1
        public String b() {
            return "private/*private to this*/";
        }
    }

    public static final class g extends w1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f15332c = new g();

        private g() {
            super("protected", true);
        }
    }

    public static final class h extends w1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f15333c = new h();

        private h() {
            super("public", true);
        }
    }

    public static final class i extends w1 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f15334c = new i();

        private i() {
            super("unknown", false);
        }
    }

    static {
        Map mapC = ed.k0.c();
        mapC.put(f.f15331c, 0);
        mapC.put(e.f15330c, 0);
        mapC.put(b.f15327c, 1);
        mapC.put(g.f15332c, 1);
        h hVar = h.f15333c;
        mapC.put(hVar, 2);
        f15324b = ed.k0.b(mapC);
        f15325c = hVar;
    }

    private v1() {
    }

    public final Integer a(w1 w1Var, w1 w1Var2) {
        rd.m.e(w1Var, "first");
        rd.m.e(w1Var2, "second");
        if (w1Var == w1Var2) {
            return 0;
        }
        Map map = f15324b;
        Integer num = (Integer) map.get(w1Var);
        Integer num2 = (Integer) map.get(w1Var2);
        if (num == null || num2 == null || rd.m.a(num, num2)) {
            return null;
        }
        return Integer.valueOf(num.intValue() - num2.intValue());
    }

    public final boolean b(w1 w1Var) {
        rd.m.e(w1Var, "visibility");
        return w1Var == e.f15330c || w1Var == f.f15331c;
    }
}
