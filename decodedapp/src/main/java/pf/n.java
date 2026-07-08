package pf;

import ed.r0;
import eg.a2;
import he.k1;
import he.s1;
import org.simpleframework.xml.strategy.Name;
import pf.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a */
    public static final a f24173a;

    /* JADX INFO: renamed from: b */
    public static final n f24174b;

    /* JADX INFO: renamed from: c */
    public static final n f24175c;

    /* JADX INFO: renamed from: d */
    public static final n f24176d;

    /* JADX INFO: renamed from: e */
    public static final n f24177e;

    /* JADX INFO: renamed from: f */
    public static final n f24178f;

    /* JADX INFO: renamed from: g */
    public static final n f24179g;

    /* JADX INFO: renamed from: h */
    public static final n f24180h;

    /* JADX INFO: renamed from: i */
    public static final n f24181i;

    /* JADX INFO: renamed from: j */
    public static final n f24182j;

    /* JADX INFO: renamed from: k */
    public static final n f24183k;

    /* JADX INFO: renamed from: l */
    public static final n f24184l;

    public static final class a {

        /* JADX INFO: renamed from: pf.n$a$a */
        public static final /* synthetic */ class C0332a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f24185a;

            static {
                int[] iArr = new int[he.f.values().length];
                try {
                    iArr[he.f.f15271b.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[he.f.f15272c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[he.f.f15273d.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[he.f.f15276g.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[he.f.f15275f.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[he.f.f15274e.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                f24185a = iArr;
            }
        }

        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final String a(he.i iVar) {
            rd.m.e(iVar, "classifier");
            if (iVar instanceof k1) {
                return "typealias";
            }
            if (!(iVar instanceof he.e)) {
                throw new AssertionError("Unexpected classifier: " + iVar);
            }
            he.e eVar = (he.e) iVar;
            if (eVar.B()) {
                return "companion object";
            }
            switch (C0332a.f24185a[eVar.j().ordinal()]) {
                case 1:
                    return Name.LABEL;
                case 2:
                    return "interface";
                case 3:
                    return "enum class";
                case 4:
                    return "object";
                case 5:
                    return "annotation class";
                case 6:
                    return "enum entry";
                default:
                    throw new dd.o();
            }
        }

        public final n b(qd.l lVar) {
            rd.m.e(lVar, "changeOptions");
            z zVar = new z();
            lVar.l(zVar);
            zVar.q0();
            return new u(zVar);
        }

        private a() {
        }
    }

    public interface b {

        public static final class a implements b {

            /* JADX INFO: renamed from: a */
            public static final a f24186a = new a();

            private a() {
            }

            @Override // pf.n.b
            public void a(s1 s1Var, int i10, int i11, StringBuilder sb2) {
                rd.m.e(s1Var, "parameter");
                rd.m.e(sb2, "builder");
                if (i10 != i11 - 1) {
                    sb2.append(", ");
                }
            }

            @Override // pf.n.b
            public void b(int i10, StringBuilder sb2) {
                rd.m.e(sb2, "builder");
                sb2.append("(");
            }

            @Override // pf.n.b
            public void c(int i10, StringBuilder sb2) {
                rd.m.e(sb2, "builder");
                sb2.append(")");
            }

            @Override // pf.n.b
            public void d(s1 s1Var, int i10, int i11, StringBuilder sb2) {
                rd.m.e(s1Var, "parameter");
                rd.m.e(sb2, "builder");
            }
        }

        void a(s1 s1Var, int i10, int i11, StringBuilder sb2);

        void b(int i10, StringBuilder sb2);

        void c(int i10, StringBuilder sb2);

        void d(s1 s1Var, int i10, int i11, StringBuilder sb2);
    }

    static {
        a aVar = new a(null);
        f24173a = aVar;
        f24174b = aVar.b(c.f24143a);
        f24175c = aVar.b(e.f24155a);
        f24176d = aVar.b(f.f24161a);
        f24177e = aVar.b(g.f24166a);
        f24178f = aVar.b(h.f24167a);
        f24179g = aVar.b(i.f24168a);
        f24180h = aVar.b(j.f24169a);
        f24181i = aVar.b(k.f24170a);
        f24182j = aVar.b(l.f24171a);
        f24183k = aVar.b(m.f24172a);
        f24184l = aVar.b(d.f24149a);
    }

    public static final dd.d0 A(w wVar) {
        rd.m.e(wVar, "$this$withOptions");
        wVar.c(r0.d());
        return dd.d0.f10897a;
    }

    public static /* synthetic */ String O(n nVar, ie.c cVar, ie.e eVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: renderAnnotation");
        }
        if ((i10 & 2) != 0) {
            eVar = null;
        }
        return nVar.N(cVar, eVar);
    }

    public static final dd.d0 q(w wVar) {
        rd.m.e(wVar, "$this$withOptions");
        wVar.d(false);
        wVar.c(r0.d());
        return dd.d0.f10897a;
    }

    public static final dd.d0 r(w wVar) {
        rd.m.e(wVar, "$this$withOptions");
        wVar.d(false);
        wVar.c(r0.d());
        wVar.f(true);
        return dd.d0.f10897a;
    }

    public static final dd.d0 s(w wVar) {
        rd.m.e(wVar, "$this$withOptions");
        wVar.d(false);
        return dd.d0.f10897a;
    }

    public static final dd.d0 t(w wVar) {
        rd.m.e(wVar, "$this$withOptions");
        wVar.c(r0.d());
        wVar.p(b.C0331b.f24140a);
        wVar.j(d0.f24151b);
        return dd.d0.f10897a;
    }

    public static final dd.d0 u(w wVar) {
        rd.m.e(wVar, "$this$withOptions");
        wVar.g(true);
        wVar.p(b.a.f24139a);
        wVar.c(v.f24201d);
        return dd.d0.f10897a;
    }

    public static final dd.d0 v(w wVar) {
        rd.m.e(wVar, "$this$withOptions");
        wVar.c(v.f24200c);
        return dd.d0.f10897a;
    }

    public static final dd.d0 w(w wVar) {
        rd.m.e(wVar, "$this$withOptions");
        wVar.c(v.f24201d);
        return dd.d0.f10897a;
    }

    public static final dd.d0 x(w wVar) {
        rd.m.e(wVar, "$this$withOptions");
        wVar.n(f0.f24163b);
        wVar.c(v.f24201d);
        return dd.d0.f10897a;
    }

    public static final dd.d0 y(w wVar) {
        rd.m.e(wVar, "$this$withOptions");
        wVar.d(false);
        wVar.c(r0.d());
        wVar.p(b.C0331b.f24140a);
        wVar.o(true);
        wVar.j(d0.f24152c);
        wVar.i(true);
        wVar.h(true);
        wVar.f(true);
        wVar.b(true);
        return dd.d0.f10897a;
    }

    public static final dd.d0 z(w wVar) {
        rd.m.e(wVar, "$this$withOptions");
        wVar.p(b.C0331b.f24140a);
        wVar.j(d0.f24151b);
        return dd.d0.f10897a;
    }

    public abstract String M(he.m mVar);

    public abstract String N(ie.c cVar, ie.e eVar);

    public abstract String P(String str, String str2, ee.i iVar);

    public abstract String Q(mf.d dVar);

    public abstract String R(mf.f fVar, boolean z10);

    public abstract String S(eg.r0 r0Var);

    public abstract String T(a2 a2Var);

    public final n U(qd.l lVar) {
        rd.m.e(lVar, "changeOptions");
        rd.m.c(this, "null cannot be cast to non-null type org.jetbrains.kotlin.renderer.DescriptorRendererImpl");
        z zVarS = ((u) this).K0().s();
        lVar.l(zVarS);
        zVarS.q0();
        return new u(zVarS);
    }
}
