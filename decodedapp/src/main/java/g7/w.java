package g7;

import d6.k;
import e6.j;
import java.math.BigDecimal;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13647a;

        static {
            int[] iArr = new int[k.c.values().length];
            f13647a = iArr;
            try {
                iArr[k.c.STRING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public static abstract class b extends h0 implements e7.i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final j.b f13648c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final String f13649d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final boolean f13650e;

        protected b(Class cls, j.b bVar, String str) {
            super(cls, false);
            this.f13648c = bVar;
            this.f13649d = str;
            this.f13650e = bVar == j.b.INT || bVar == j.b.LONG || bVar == j.b.BIG_INTEGER;
        }

        @Override // e7.i
        public p6.p a(p6.d0 d0Var, p6.d dVar) {
            k.d dVarQ = q(d0Var, dVar, c());
            return (dVarQ == null || a.f13647a[dVarQ.i().ordinal()] != 1) ? this : c() == BigDecimal.class ? v.x() : m0.f13613c;
        }
    }

    public static class c extends b {
        public c(Class cls) {
            super(cls, j.b.DOUBLE, "number");
        }

        @Override // g7.i0, p6.p
        public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
            gVar.F0(((Double) obj).doubleValue());
        }

        @Override // g7.h0, p6.p
        public void g(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
            Double d10 = (Double) obj;
            if (!i6.j.h(d10.doubleValue())) {
                gVar.F0(d10.doubleValue());
                return;
            }
            n6.c cVarG = hVar.g(gVar, hVar.d(obj, e6.m.VALUE_NUMBER_FLOAT));
            gVar.F0(d10.doubleValue());
            hVar.h(gVar, cVarG);
        }
    }

    public static class d extends b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final d f13651f = new d();

        public d() {
            super(Float.class, j.b.FLOAT, "number");
        }

        @Override // g7.i0, p6.p
        public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
            gVar.G0(((Float) obj).floatValue());
        }
    }

    public static class e extends b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final e f13652f = new e();

        public e() {
            super(Number.class, j.b.INT, "integer");
        }

        @Override // g7.i0, p6.p
        public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
            gVar.H0(((Number) obj).intValue());
        }
    }

    public static class f extends b {
        public f(Class cls) {
            super(cls, j.b.INT, "integer");
        }

        @Override // g7.i0, p6.p
        public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
            gVar.H0(((Integer) obj).intValue());
        }

        @Override // g7.h0, p6.p
        public void g(Object obj, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
            f(obj, gVar, d0Var);
        }
    }

    public static class g extends b {
        public g(Class cls) {
            super(cls, j.b.LONG, "integer");
        }

        @Override // g7.i0, p6.p
        public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
            gVar.I0(((Long) obj).longValue());
        }
    }

    public static class h extends b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final h f13653f = new h();

        public h() {
            super(Short.class, j.b.INT, "integer");
        }

        @Override // g7.i0, p6.p
        public void f(Object obj, e6.g gVar, p6.d0 d0Var) {
            gVar.M0(((Short) obj).shortValue());
        }
    }

    public static void a(Map map) {
        map.put(Integer.class.getName(), new f(Integer.class));
        Class cls = Integer.TYPE;
        map.put(cls.getName(), new f(cls));
        map.put(Long.class.getName(), new g(Long.class));
        Class cls2 = Long.TYPE;
        map.put(cls2.getName(), new g(cls2));
        String name = Byte.class.getName();
        e eVar = e.f13652f;
        map.put(name, eVar);
        map.put(Byte.TYPE.getName(), eVar);
        String name2 = Short.class.getName();
        h hVar = h.f13653f;
        map.put(name2, hVar);
        map.put(Short.TYPE.getName(), hVar);
        map.put(Double.class.getName(), new c(Double.class));
        Class cls3 = Double.TYPE;
        map.put(cls3.getName(), new c(cls3));
        String name3 = Float.class.getName();
        d dVar = d.f13651f;
        map.put(name3, dVar);
        map.put(Float.TYPE.getName(), dVar);
    }
}
