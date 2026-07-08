package d6;

import j$.util.DesugarTimeZone;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface k {

    public enum a {
        ACCEPT_SINGLE_VALUE_AS_ARRAY,
        ACCEPT_CASE_INSENSITIVE_PROPERTIES,
        READ_UNKNOWN_ENUM_VALUES_AS_NULL,
        READ_UNKNOWN_ENUM_VALUES_USING_DEFAULT_VALUE,
        READ_DATE_TIMESTAMPS_AS_NANOSECONDS,
        ACCEPT_CASE_INSENSITIVE_VALUES,
        WRITE_DATE_TIMESTAMPS_AS_NANOSECONDS,
        WRITE_DATES_WITH_ZONE_ID,
        WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED,
        WRITE_SORTED_MAP_ENTRIES,
        ADJUST_DATES_TO_CONTEXT_TIME_ZONE
    }

    public static class b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b f10738c = new b(0, 0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f10739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f10740b;

        private b(int i10, int i11) {
            this.f10739a = i10;
            this.f10740b = i11;
        }

        public static b a(k kVar) {
            return b(kVar.with(), kVar.without());
        }

        public static b b(a[] aVarArr, a[] aVarArr2) {
            int iOrdinal = 0;
            for (a aVar : aVarArr) {
                iOrdinal |= 1 << aVar.ordinal();
            }
            int iOrdinal2 = 0;
            for (a aVar2 : aVarArr2) {
                iOrdinal2 |= 1 << aVar2.ordinal();
            }
            return new b(iOrdinal, iOrdinal2);
        }

        public static b c() {
            return f10738c;
        }

        public Boolean d(a aVar) {
            int iOrdinal = 1 << aVar.ordinal();
            if ((this.f10740b & iOrdinal) != 0) {
                return Boolean.FALSE;
            }
            if ((iOrdinal & this.f10739a) != 0) {
                return Boolean.TRUE;
            }
            return null;
        }

        public b e(b bVar) {
            if (bVar != null) {
                int i10 = bVar.f10740b;
                int i11 = bVar.f10739a;
                if (i10 != 0 || i11 != 0) {
                    int i12 = this.f10739a;
                    if (i12 == 0 && this.f10740b == 0) {
                        return bVar;
                    }
                    int i13 = ((~i10) & i12) | i11;
                    int i14 = this.f10740b;
                    int i15 = i10 | ((~i11) & i14);
                    if (i13 != i12 || i15 != i14) {
                        return new b(i13, i15);
                    }
                }
            }
            return this;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            b bVar = (b) obj;
            return bVar.f10739a == this.f10739a && bVar.f10740b == this.f10740b;
        }

        public int hashCode() {
            return this.f10740b + this.f10739a;
        }

        public String toString() {
            return this == f10738c ? "EMPTY" : String.format("(enabled=0x%x,disabled=0x%x)", Integer.valueOf(this.f10739a), Integer.valueOf(this.f10740b));
        }
    }

    public enum c {
        ANY,
        NATURAL,
        SCALAR,
        ARRAY,
        OBJECT,
        NUMBER,
        NUMBER_FLOAT,
        NUMBER_INT,
        STRING,
        BOOLEAN,
        BINARY;

        public boolean a() {
            return this == NUMBER || this == NUMBER_INT || this == NUMBER_FLOAT;
        }
    }

    public static class d implements Serializable {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final d f10753h = new d();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f10755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Locale f10756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f10757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Boolean f10758e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final b f10759f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private transient TimeZone f10760g;

        public d() {
            this("", c.ANY, "", "", b.c(), null);
        }

        private static boolean a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            if (obj2 == null) {
                return false;
            }
            return obj.equals(obj2);
        }

        public static final d b() {
            return f10753h;
        }

        public static d c(boolean z10) {
            return new d("", null, null, null, null, b.c(), Boolean.valueOf(z10));
        }

        public static final d d(k kVar) {
            return kVar == null ? f10753h : new d(kVar);
        }

        public static d q(d dVar, d dVar2) {
            return dVar == null ? dVar2 : dVar.s(dVar2);
        }

        public Boolean e(a aVar) {
            return this.f10759f.d(aVar);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f10755b == dVar.f10755b && this.f10759f.equals(dVar.f10759f) && a(this.f10758e, dVar.f10758e) && a(this.f10757d, dVar.f10757d) && a(this.f10754a, dVar.f10754a) && a(this.f10760g, dVar.f10760g) && a(this.f10756c, dVar.f10756c);
        }

        public Boolean f() {
            return this.f10758e;
        }

        public Locale g() {
            return this.f10756c;
        }

        public String h() {
            return this.f10754a;
        }

        public int hashCode() {
            String str = this.f10757d;
            int iHashCode = str == null ? 1 : str.hashCode();
            String str2 = this.f10754a;
            if (str2 != null) {
                iHashCode ^= str2.hashCode();
            }
            int iHashCode2 = iHashCode + this.f10755b.hashCode();
            Boolean bool = this.f10758e;
            if (bool != null) {
                iHashCode2 ^= bool.hashCode();
            }
            Locale locale = this.f10756c;
            if (locale != null) {
                iHashCode2 += locale.hashCode();
            }
            return iHashCode2 ^ this.f10759f.hashCode();
        }

        public c i() {
            return this.f10755b;
        }

        public TimeZone j() {
            TimeZone timeZone = this.f10760g;
            if (timeZone != null) {
                return timeZone;
            }
            String str = this.f10757d;
            if (str == null) {
                return null;
            }
            TimeZone timeZone2 = DesugarTimeZone.getTimeZone(str);
            this.f10760g = timeZone2;
            return timeZone2;
        }

        public boolean k() {
            return this.f10758e != null;
        }

        public boolean l() {
            return this.f10756c != null;
        }

        public boolean n() {
            String str = this.f10754a;
            return str != null && str.length() > 0;
        }

        public boolean o() {
            return this.f10755b != c.ANY;
        }

        public boolean p() {
            if (this.f10760g != null) {
                return true;
            }
            String str = this.f10757d;
            return (str == null || str.isEmpty()) ? false : true;
        }

        public d r(Boolean bool) {
            return bool == this.f10758e ? this : new d(this.f10754a, this.f10755b, this.f10756c, this.f10757d, this.f10760g, this.f10759f, bool);
        }

        public final d s(d dVar) {
            d dVar2;
            TimeZone timeZone;
            if (dVar == null || dVar == (dVar2 = f10753h) || dVar == this) {
                return this;
            }
            if (this == dVar2) {
                return dVar;
            }
            String str = dVar.f10754a;
            if (str == null || str.isEmpty()) {
                str = this.f10754a;
            }
            String str2 = str;
            c cVar = dVar.f10755b;
            if (cVar == c.ANY) {
                cVar = this.f10755b;
            }
            c cVar2 = cVar;
            Locale locale = dVar.f10756c;
            if (locale == null) {
                locale = this.f10756c;
            }
            Locale locale2 = locale;
            b bVar = this.f10759f;
            b bVarE = bVar == null ? dVar.f10759f : bVar.e(dVar.f10759f);
            Boolean bool = dVar.f10758e;
            if (bool == null) {
                bool = this.f10758e;
            }
            Boolean bool2 = bool;
            String str3 = dVar.f10757d;
            if (str3 == null || str3.isEmpty()) {
                str3 = this.f10757d;
                timeZone = this.f10760g;
            } else {
                timeZone = dVar.f10760g;
            }
            return new d(str2, cVar2, locale2, str3, timeZone, bVarE, bool2);
        }

        public String toString() {
            return String.format("JsonFormat.Value(pattern=%s,shape=%s,lenient=%s,locale=%s,timezone=%s,features=%s)", this.f10754a, this.f10755b, this.f10758e, this.f10756c, this.f10757d, this.f10759f);
        }

        public d(k kVar) {
            this(kVar.pattern(), kVar.shape(), kVar.locale(), kVar.timezone(), b.a(kVar), kVar.lenient().a());
        }

        public d(String str, c cVar, String str2, String str3, b bVar, Boolean bool) {
            this(str, cVar, (str2 == null || str2.length() == 0 || "##default".equals(str2)) ? null : new Locale(str2), (str3 == null || str3.length() == 0 || "##default".equals(str3)) ? null : str3, null, bVar, bool);
        }

        public d(String str, c cVar, Locale locale, String str2, TimeZone timeZone, b bVar, Boolean bool) {
            this.f10754a = str == null ? "" : str;
            this.f10755b = cVar == null ? c.ANY : cVar;
            this.f10756c = locale;
            this.f10760g = timeZone;
            this.f10757d = str2;
            this.f10759f = bVar == null ? b.c() : bVar;
            this.f10758e = bool;
        }
    }

    p0 lenient() default p0.DEFAULT;

    String locale() default "##default";

    String pattern() default "";

    c shape() default c.ANY;

    String timezone() default "##default";

    a[] with() default {};

    a[] without() default {};
}
