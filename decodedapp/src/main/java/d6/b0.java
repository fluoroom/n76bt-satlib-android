package d6;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface b0 {

    public static class a implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected static final a f10689c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final j0 f10690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j0 f10691b;

        static {
            j0 j0Var = j0.DEFAULT;
            f10689c = new a(j0Var, j0Var);
        }

        protected a(j0 j0Var, j0 j0Var2) {
            this.f10690a = j0Var;
            this.f10691b = j0Var2;
        }

        private static boolean a(j0 j0Var, j0 j0Var2) {
            j0 j0Var3 = j0.DEFAULT;
            return j0Var == j0Var3 && j0Var2 == j0Var3;
        }

        public static a b(j0 j0Var, j0 j0Var2) {
            if (j0Var == null) {
                j0Var = j0.DEFAULT;
            }
            if (j0Var2 == null) {
                j0Var2 = j0.DEFAULT;
            }
            return a(j0Var, j0Var2) ? f10689c : new a(j0Var, j0Var2);
        }

        public static a c() {
            return f10689c;
        }

        public static a d(b0 b0Var) {
            return b0Var == null ? f10689c : b(b0Var.nulls(), b0Var.contentNulls());
        }

        public j0 e() {
            return this.f10691b;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                a aVar = (a) obj;
                if (aVar.f10690a == this.f10690a && aVar.f10691b == this.f10691b) {
                    return true;
                }
            }
            return false;
        }

        public j0 f() {
            j0 j0Var = this.f10691b;
            if (j0Var == j0.DEFAULT) {
                return null;
            }
            return j0Var;
        }

        public j0 g() {
            j0 j0Var = this.f10690a;
            if (j0Var == j0.DEFAULT) {
                return null;
            }
            return j0Var;
        }

        public int hashCode() {
            return this.f10690a.ordinal() + (this.f10691b.ordinal() << 2);
        }

        public String toString() {
            return String.format("JsonSetter.Value(valueNulls=%s,contentNulls=%s)", this.f10690a, this.f10691b);
        }
    }

    j0 contentNulls() default j0.DEFAULT;

    j0 nulls() default j0.DEFAULT;

    String value() default "";
}
