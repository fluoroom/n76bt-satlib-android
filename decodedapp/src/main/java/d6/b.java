package d6;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface b {

    public static class a implements Serializable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected static final a f10686c = new a(null, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Object f10687a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final Boolean f10688b;

        protected a(Object obj, Boolean bool) {
            this.f10687a = obj;
            this.f10688b = bool;
        }

        private static boolean a(Object obj, Boolean bool) {
            return obj == null && bool == null;
        }

        public static a b(Object obj, Boolean bool) {
            if ("".equals(obj)) {
                obj = null;
            }
            return a(obj, bool) ? f10686c : new a(obj, bool);
        }

        public static a c(Object obj) {
            return b(obj, null);
        }

        public static a d(b bVar) {
            return bVar == null ? f10686c : b(bVar.value(), bVar.useInput().a());
        }

        public Object e() {
            return this.f10687a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && obj.getClass() == getClass()) {
                a aVar = (a) obj;
                if (p0.d(this.f10688b, aVar.f10688b)) {
                    Object obj2 = this.f10687a;
                    return obj2 == null ? aVar.f10687a == null : obj2.equals(aVar.f10687a);
                }
            }
            return false;
        }

        public boolean f() {
            return this.f10687a != null;
        }

        public boolean g(boolean z10) {
            Boolean bool = this.f10688b;
            return bool == null ? z10 : bool.booleanValue();
        }

        public a h(Object obj) {
            return (obj != null ? !obj.equals(this.f10687a) : this.f10687a != null) ? new a(obj, this.f10688b) : this;
        }

        public int hashCode() {
            Object obj = this.f10687a;
            int iHashCode = obj != null ? 1 + obj.hashCode() : 1;
            Boolean bool = this.f10688b;
            return bool != null ? iHashCode + bool.hashCode() : iHashCode;
        }

        public String toString() {
            return String.format("JacksonInject.Value(id=%s,useInput=%s)", this.f10687a, this.f10688b);
        }
    }

    p0 useInput() default p0.DEFAULT;

    String value() default "";
}
