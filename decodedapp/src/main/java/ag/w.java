package ag;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public interface w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f597a = new a();

    static class a implements w {
        a() {
        }

        private static /* synthetic */ void c(int i10) {
            Object[] objArr = new Object[3];
            if (i10 != 1) {
                objArr[0] = "descriptor";
            } else {
                objArr[0] = "unresolvedSuperClasses";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/serialization/deserialization/ErrorReporter$1";
            if (i10 != 2) {
                objArr[2] = "reportIncompleteHierarchy";
            } else {
                objArr[2] = "reportCannotInferVisibility";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // ag.w
        public void a(he.b bVar) {
            if (bVar == null) {
                c(2);
            }
        }

        @Override // ag.w
        public void b(he.e eVar, List list) {
            if (eVar == null) {
                c(0);
            }
            if (list == null) {
                c(1);
            }
        }
    }

    void a(he.b bVar);

    void b(he.e eVar, List list);
}
