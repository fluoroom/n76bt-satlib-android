package d6;

import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface r {

    public enum a {
        ALWAYS,
        NON_NULL,
        NON_ABSENT,
        NON_EMPTY,
        NON_DEFAULT,
        CUSTOM,
        USE_DEFAULTS
    }

    public static class b implements Serializable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected static final b f10792e;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected final a f10793a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected final a f10794b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final Class f10795c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final Class f10796d;

        static {
            a aVar = a.USE_DEFAULTS;
            f10792e = new b(aVar, aVar, null, null);
        }

        protected b(a aVar, a aVar2, Class cls, Class cls2) {
            this.f10793a = aVar == null ? a.USE_DEFAULTS : aVar;
            this.f10794b = aVar2 == null ? a.USE_DEFAULTS : aVar2;
            this.f10795c = cls == Void.class ? null : cls;
            this.f10796d = cls2 == Void.class ? null : cls2;
        }

        public static b a(a aVar, a aVar2) {
            a aVar3 = a.USE_DEFAULTS;
            return ((aVar == aVar3 || aVar == null) && (aVar2 == aVar3 || aVar2 == null)) ? f10792e : new b(aVar, aVar2, null, null);
        }

        public static b b(a aVar, a aVar2, Class cls, Class cls2) {
            if (cls == Void.class) {
                cls = null;
            }
            if (cls2 == Void.class) {
                cls2 = null;
            }
            a aVar3 = a.USE_DEFAULTS;
            return ((aVar == aVar3 || aVar == null) && (aVar2 == aVar3 || aVar2 == null) && cls == null && cls2 == null) ? f10792e : new b(aVar, aVar2, cls, cls2);
        }

        public static b c() {
            return f10792e;
        }

        public static b d(r rVar) {
            if (rVar == null) {
                return f10792e;
            }
            a aVarValue = rVar.value();
            a aVarContent = rVar.content();
            a aVar = a.USE_DEFAULTS;
            if (aVarValue == aVar && aVarContent == aVar) {
                return f10792e;
            }
            Class clsValueFilter = rVar.valueFilter();
            if (clsValueFilter == Void.class) {
                clsValueFilter = null;
            }
            Class clsContentFilter = rVar.contentFilter();
            return new b(aVarValue, aVarContent, clsValueFilter, clsContentFilter != Void.class ? clsContentFilter : null);
        }

        public static b i(b bVar, b bVar2) {
            return bVar == null ? bVar2 : bVar.n(bVar2);
        }

        public static b j(b... bVarArr) {
            b bVar = null;
            for (b bVarN : bVarArr) {
                if (bVarN != null) {
                    if (bVar != null) {
                        bVarN = bVar.n(bVarN);
                    }
                    bVar = bVarN;
                }
            }
            return bVar;
        }

        public Class e() {
            return this.f10796d;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f10793a == this.f10793a && bVar.f10794b == this.f10794b && bVar.f10795c == this.f10795c && bVar.f10796d == this.f10796d;
        }

        public a f() {
            return this.f10794b;
        }

        public Class g() {
            return this.f10795c;
        }

        public a h() {
            return this.f10793a;
        }

        public int hashCode() {
            return (this.f10793a.hashCode() << 2) + this.f10794b.hashCode();
        }

        public b k(Class cls) {
            a aVar;
            if (cls == null || cls == Void.class) {
                aVar = a.USE_DEFAULTS;
                cls = null;
            } else {
                aVar = a.CUSTOM;
            }
            return b(this.f10793a, aVar, this.f10795c, cls);
        }

        public b l(a aVar) {
            return aVar == this.f10794b ? this : new b(this.f10793a, aVar, this.f10795c, this.f10796d);
        }

        public b n(b bVar) {
            if (bVar != null && bVar != f10792e) {
                a aVar = bVar.f10793a;
                a aVar2 = bVar.f10794b;
                Class cls = bVar.f10795c;
                Class cls2 = bVar.f10796d;
                a aVar3 = this.f10793a;
                boolean z10 = (aVar == aVar3 || aVar == a.USE_DEFAULTS) ? false : true;
                a aVar4 = this.f10794b;
                boolean z11 = (aVar2 == aVar4 || aVar2 == a.USE_DEFAULTS) ? false : true;
                Class cls3 = this.f10795c;
                boolean z12 = (cls == cls3 && cls2 == cls3) ? false : true;
                if (z10) {
                    return z11 ? new b(aVar, aVar2, cls, cls2) : new b(aVar, aVar4, cls, cls2);
                }
                if (z11) {
                    return new b(aVar3, aVar2, cls, cls2);
                }
                if (z12) {
                    return new b(aVar3, aVar4, cls, cls2);
                }
            }
            return this;
        }

        public b o(a aVar) {
            return aVar == this.f10793a ? this : new b(aVar, this.f10794b, this.f10795c, this.f10796d);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(80);
            sb2.append("JsonInclude.Value(value=");
            sb2.append(this.f10793a);
            sb2.append(",content=");
            sb2.append(this.f10794b);
            if (this.f10795c != null) {
                sb2.append(",valueFilter=");
                sb2.append(this.f10795c.getName());
                sb2.append(".class");
            }
            if (this.f10796d != null) {
                sb2.append(",contentFilter=");
                sb2.append(this.f10796d.getName());
                sb2.append(".class");
            }
            sb2.append(')');
            return sb2.toString();
        }
    }

    a content() default a.ALWAYS;

    Class contentFilter() default Void.class;

    a value() default a.ALWAYS;

    Class valueFilter() default Void.class;
}
