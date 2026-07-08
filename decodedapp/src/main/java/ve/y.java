package ve;

import he.w1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final he.u f30717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final he.u f30718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final he.u f30719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f30720d;

    static class a extends he.r {
        a(w1 w1Var) {
            super(w1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "from";
            } else if (i10 == 2) {
                objArr[0] = "fromPackage";
            } else if (i10 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i10 == 2 || i10 == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // he.u
        public boolean e(yf.g gVar, he.q qVar, he.m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return y.d(qVar, mVar);
        }
    }

    static class b extends he.r {
        b(w1 w1Var) {
            super(w1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // he.u
        public boolean e(yf.g gVar, he.q qVar, he.m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return y.e(gVar, qVar, mVar);
        }
    }

    static class c extends he.r {
        c(w1 w1Var) {
            super(w1Var);
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // he.u
        public boolean e(yf.g gVar, he.q qVar, he.m mVar, boolean z10) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return y.e(gVar, qVar, mVar);
        }
    }

    static {
        a aVar = new a(le.a.f20547c);
        f30717a = aVar;
        b bVar = new b(le.c.f20549c);
        f30718b = bVar;
        c cVar = new c(le.b.f20548c);
        f30719c = cVar;
        f30720d = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 5 || i10 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 5 || i10 == 6) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i10 == 5 || i10 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i10 == 2 || i10 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i10 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i10 != 5 && i10 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i10 != 5 && i10 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(he.m mVar, he.m mVar2) {
        if (mVar == null) {
            a(2);
        }
        if (mVar2 == null) {
            a(3);
        }
        he.n0 n0Var = (he.n0) qf.i.r(mVar, he.n0.class, false);
        he.n0 n0Var2 = (he.n0) qf.i.r(mVar2, he.n0.class, false);
        return (n0Var2 == null || n0Var == null || !n0Var.d().equals(n0Var2.d())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(yf.g gVar, he.q qVar, he.m mVar) {
        if (qVar == null) {
            a(0);
        }
        if (mVar == null) {
            a(1);
        }
        if (d(qf.i.M(qVar), mVar)) {
            return true;
        }
        return he.t.f15307c.e(gVar, qVar, mVar, false);
    }

    private static void f(he.u uVar) {
        f30720d.put(uVar.b(), uVar);
    }

    public static he.u g(w1 w1Var) {
        if (w1Var == null) {
            a(4);
        }
        he.u uVar = (he.u) f30720d.get(w1Var);
        if (uVar != null) {
            return uVar;
        }
        he.u uVarJ = he.t.j(w1Var);
        if (uVarJ == null) {
            a(5);
        }
        return uVarJ;
    }
}
