package d6;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface p {

    public static class a implements Serializable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected static final a f10766f = new a(Collections.EMPTY_SET, false, false, false, true);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final Set f10767a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final boolean f10768b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final boolean f10769c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final boolean f10770d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected final boolean f10771e;

        protected a(Set set, boolean z10, boolean z11, boolean z12, boolean z13) {
            if (set == null) {
                this.f10767a = Collections.EMPTY_SET;
            } else {
                this.f10767a = set;
            }
            this.f10768b = z10;
            this.f10769c = z11;
            this.f10770d = z12;
            this.f10771e = z13;
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

        private static boolean b(Set set, boolean z10, boolean z11, boolean z12, boolean z13) {
            a aVar = f10766f;
            if (z10 == aVar.f10768b && z11 == aVar.f10769c && z12 == aVar.f10770d && z13 == aVar.f10771e) {
                return set == null || set.size() == 0;
            }
            return false;
        }

        private static boolean c(a aVar, a aVar2) {
            return aVar.f10768b == aVar2.f10768b && aVar.f10771e == aVar2.f10771e && aVar.f10769c == aVar2.f10769c && aVar.f10770d == aVar2.f10770d && aVar.f10767a.equals(aVar2.f10767a);
        }

        private static Set d(Set set, Set set2) {
            if (set.isEmpty()) {
                return set2;
            }
            if (set2.isEmpty()) {
                return set;
            }
            HashSet hashSet = new HashSet(set.size() + set2.size());
            hashSet.addAll(set);
            hashSet.addAll(set2);
            return hashSet;
        }

        public static a e(Set set, boolean z10, boolean z11, boolean z12, boolean z13) {
            return b(set, z10, z11, z12, z13) ? f10766f : new a(set, z10, z11, z12, z13);
        }

        public static a f() {
            return f10766f;
        }

        public static a i(p pVar) {
            return pVar == null ? f10766f : e(a(pVar.value()), pVar.ignoreUnknown(), pVar.allowGetters(), pVar.allowSetters(), false);
        }

        public static a k(a aVar, a aVar2) {
            return aVar == null ? aVar2 : aVar.l(aVar2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && obj.getClass() == getClass() && c(this, (a) obj);
        }

        public Set g() {
            return this.f10770d ? Collections.EMPTY_SET : this.f10767a;
        }

        public Set h() {
            return this.f10769c ? Collections.EMPTY_SET : this.f10767a;
        }

        public int hashCode() {
            return this.f10767a.size() + (this.f10768b ? 1 : -3) + (this.f10769c ? 3 : -7) + (this.f10770d ? 7 : -11) + (this.f10771e ? 11 : -13);
        }

        public boolean j() {
            return this.f10768b;
        }

        public a l(a aVar) {
            if (aVar != null && aVar != f10766f) {
                if (!aVar.f10771e) {
                    return aVar;
                }
                if (!c(this, aVar)) {
                    return e(d(this.f10767a, aVar.f10767a), this.f10768b || aVar.f10768b, this.f10769c || aVar.f10769c, this.f10770d || aVar.f10770d, true);
                }
            }
            return this;
        }

        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this.f10767a, Boolean.valueOf(this.f10768b), Boolean.valueOf(this.f10769c), Boolean.valueOf(this.f10770d), Boolean.valueOf(this.f10771e));
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}
