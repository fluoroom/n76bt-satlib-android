package d6;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface s {

    public static class a implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected static final a f10797b = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Set f10798a;

        protected a(Set set) {
            this.f10798a = set;
        }

        private static Set a(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return Collections.EMPTY_SET;
            }
            HashSet hashSet = new HashSet(strArr.length);
            for (String str : strArr) {
                hashSet.add(str);
            }
            return hashSet;
        }

        private static boolean b(Set set, Set set2) {
            return set == null ? set2 == null : set.equals(set2);
        }

        public static a c() {
            return f10797b;
        }

        public static a d(s sVar) {
            return sVar == null ? f10797b : new a(a(sVar.value()));
        }

        public Set e() {
            return this.f10798a;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && obj.getClass() == getClass() && b(this.f10798a, ((a) obj).f10798a);
        }

        public int hashCode() {
            Set set = this.f10798a;
            if (set == null) {
                return 0;
            }
            return set.size();
        }

        public String toString() {
            return String.format("JsonIncludeProperties.Value(included=%s)", this.f10798a);
        }
    }

    String[] value() default {};
}
