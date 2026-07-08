package we;

import cf.q;
import he.f1;
import he.y0;

/* JADX INFO: loaded from: classes3.dex */
public interface j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f31416a = new a();

    static class a implements j {
        a() {
        }

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            switch (i10) {
                case 1:
                    objArr[0] = "member";
                    break;
                case 2:
                case 4:
                case 6:
                case 8:
                    objArr[0] = "descriptor";
                    break;
                case 3:
                    objArr[0] = "element";
                    break;
                case 5:
                    objArr[0] = "field";
                    break;
                case 7:
                    objArr[0] = "javaClass";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
            switch (i10) {
                case 1:
                case 2:
                    objArr[2] = "recordMethod";
                    break;
                case 3:
                case 4:
                    objArr[2] = "recordConstructor";
                    break;
                case 5:
                case 6:
                    objArr[2] = "recordField";
                    break;
                case 7:
                case 8:
                    objArr[2] = "recordClass";
                    break;
                default:
                    objArr[2] = "getClassResolvedFromSource";
                    break;
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // we.j
        public void a(cf.l lVar, he.l lVar2) {
            if (lVar == null) {
                f(3);
            }
            if (lVar2 == null) {
                f(4);
            }
        }

        @Override // we.j
        public void b(cf.n nVar, y0 y0Var) {
            if (nVar == null) {
                f(5);
            }
            if (y0Var == null) {
                f(6);
            }
        }

        @Override // we.j
        public void c(cf.g gVar, he.e eVar) {
            if (gVar == null) {
                f(7);
            }
            if (eVar == null) {
                f(8);
            }
        }

        @Override // we.j
        public void d(q qVar, f1 f1Var) {
            if (qVar == null) {
                f(1);
            }
            if (f1Var == null) {
                f(2);
            }
        }

        @Override // we.j
        public he.e e(mf.c cVar) {
            if (cVar != null) {
                return null;
            }
            f(0);
            return null;
        }
    }

    void a(cf.l lVar, he.l lVar2);

    void b(cf.n nVar, y0 y0Var);

    void c(cf.g gVar, he.e eVar);

    void d(q qVar, f1 f1Var);

    he.e e(mf.c cVar);
}
