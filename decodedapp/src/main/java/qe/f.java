package qe;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final qe.e f24956a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(qe.e eVar) {
            super(null);
            rd.m.e(eVar, "annotation");
            this.f24956a = eVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && rd.m.a(this.f24956a, ((a) obj).f24956a);
        }

        public int hashCode() {
            return this.f24956a.hashCode();
        }

        public String toString() {
            return "AnnotationValue(" + this.f24956a + ')';
        }
    }

    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f24958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final String f24959c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, int i10) {
            super(null);
            rd.m.e(str, "className");
            this.f24957a = str;
            this.f24958b = i10;
            if (i10 <= 0) {
                throw new IllegalArgumentException("ArrayKClassValue must have at least one dimension. For regular X::class argument, use KClassValue.");
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ArrayKClassValue(");
            for (int i11 = 0; i11 < i10; i11++) {
                sb2.append("kotlin/Array<");
            }
            sb2.append(this.f24957a);
            int i12 = this.f24958b;
            for (int i13 = 0; i13 < i12; i13++) {
                sb2.append(">");
            }
            sb2.append(")");
            this.f24959c = sb2.toString();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return rd.m.a(this.f24957a, bVar.f24957a) && this.f24958b == bVar.f24958b;
        }

        public int hashCode() {
            return (this.f24957a.hashCode() * 31) + this.f24958b;
        }

        public String toString() {
            return this.f24959c;
        }
    }

    public static final class c extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f24960a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List list) {
            super(null);
            rd.m.e(list, "elements");
            this.f24960a = list;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && rd.m.a(this.f24960a, ((c) obj).f24960a);
        }

        public int hashCode() {
            return this.f24960a.hashCode();
        }

        public String toString() {
            return "ArrayValue(" + this.f24960a + ')';
        }
    }

    public static final class d extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f24961a;

        public d(boolean z10) {
            super(null);
            this.f24961a = z10;
        }

        @Override // qe.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Boolean a() {
            return Boolean.valueOf(this.f24961a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f24961a == ((d) obj).f24961a;
        }

        public int hashCode() {
            return o4.b.a(this.f24961a);
        }
    }

    public static final class e extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte f24962a;

        public e(byte b10) {
            super(null);
            this.f24962a = b10;
        }

        @Override // qe.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Byte a() {
            return Byte.valueOf(this.f24962a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f24962a == ((e) obj).f24962a;
        }

        public int hashCode() {
            return this.f24962a;
        }
    }

    /* JADX INFO: renamed from: qe.f$f, reason: collision with other inner class name */
    public static final class C0342f extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f24963a;

        public C0342f(char c10) {
            super(null);
            this.f24963a = c10;
        }

        @Override // qe.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Character a() {
            return Character.valueOf(this.f24963a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0342f) && this.f24963a == ((C0342f) obj).f24963a;
        }

        public int hashCode() {
            return this.f24963a;
        }
    }

    public static final class g extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final double f24964a;

        public g(double d10) {
            super(null);
            this.f24964a = d10;
        }

        @Override // qe.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Double a() {
            return Double.valueOf(this.f24964a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && Double.compare(this.f24964a, ((g) obj).f24964a) == 0;
        }

        public int hashCode() {
            return o4.c.a(this.f24964a);
        }
    }

    public static final class h extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24965a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f24966b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, String str2) {
            super(null);
            rd.m.e(str, "enumClassName");
            rd.m.e(str2, "enumEntryName");
            this.f24965a = str;
            this.f24966b = str2;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return rd.m.a(this.f24965a, hVar.f24965a) && rd.m.a(this.f24966b, hVar.f24966b);
        }

        public int hashCode() {
            return (this.f24965a.hashCode() * 31) + this.f24966b.hashCode();
        }

        public String toString() {
            return "EnumValue(" + this.f24965a + '.' + this.f24966b + ')';
        }
    }

    public static final class i extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f24967a;

        public i(float f10) {
            super(null);
            this.f24967a = f10;
        }

        @Override // qe.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Float a() {
            return Float.valueOf(this.f24967a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && Float.compare(this.f24967a, ((i) obj).f24967a) == 0;
        }

        public int hashCode() {
            return Float.floatToIntBits(this.f24967a);
        }
    }

    public static final class j extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24968a;

        public j(int i10) {
            super(null);
            this.f24968a = i10;
        }

        @Override // qe.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Integer a() {
            return Integer.valueOf(this.f24968a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f24968a == ((j) obj).f24968a;
        }

        public int hashCode() {
            return this.f24968a;
        }
    }

    public static final class k extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24969a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(String str) {
            super(null);
            rd.m.e(str, "className");
            this.f24969a = str;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && rd.m.a(this.f24969a, ((k) obj).f24969a);
        }

        public int hashCode() {
            return this.f24969a.hashCode();
        }

        public String toString() {
            return "KClassValue(" + this.f24969a + ')';
        }
    }

    public static abstract class l extends f {
        public /* synthetic */ l(rd.h hVar) {
            this();
        }

        public abstract Object a();

        public final String toString() {
            String string;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(getClass().getSimpleName());
            sb2.append('(');
            if (this instanceof o) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append('\"');
                sb3.append((Object) ((o) this).a());
                sb3.append('\"');
                string = sb3.toString();
            } else {
                string = a().toString();
            }
            sb2.append(string);
            sb2.append(')');
            return sb2.toString();
        }

        private l() {
            super(null);
        }
    }

    public static final class m extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f24970a;

        public m(long j10) {
            super(null);
            this.f24970a = j10;
        }

        @Override // qe.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a() {
            return Long.valueOf(this.f24970a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f24970a == ((m) obj).f24970a;
        }

        public int hashCode() {
            return o4.a.a(this.f24970a);
        }
    }

    public static final class n extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short f24971a;

        public n(short s10) {
            super(null);
            this.f24971a = s10;
        }

        @Override // qe.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Short a() {
            return Short.valueOf(this.f24971a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && this.f24971a == ((n) obj).f24971a;
        }

        public int hashCode() {
            return this.f24971a;
        }
    }

    public static final class o extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f24972a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(String str) {
            super(null);
            rd.m.e(str, "value");
            this.f24972a = str;
        }

        @Override // qe.f.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.f24972a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && rd.m.a(this.f24972a, ((o) obj).f24972a);
        }

        public int hashCode() {
            return this.f24972a.hashCode();
        }
    }

    public static final class p extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte f24973a;

        public /* synthetic */ p(byte b10, rd.h hVar) {
            this(b10);
        }

        @Override // qe.f.l
        public /* bridge */ /* synthetic */ Object a() {
            return dd.x.a(b());
        }

        public byte b() {
            return this.f24973a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && this.f24973a == ((p) obj).f24973a;
        }

        public int hashCode() {
            return dd.x.f(this.f24973a);
        }

        private p(byte b10) {
            super(null);
            this.f24973a = b10;
        }
    }

    public static final class q extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24974a;

        public /* synthetic */ q(int i10, rd.h hVar) {
            this(i10);
        }

        @Override // qe.f.l
        public /* bridge */ /* synthetic */ Object a() {
            return dd.y.a(b());
        }

        public int b() {
            return this.f24974a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && this.f24974a == ((q) obj).f24974a;
        }

        public int hashCode() {
            return dd.y.f(this.f24974a);
        }

        private q(int i10) {
            super(null);
            this.f24974a = i10;
        }
    }

    public static final class r extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f24975a;

        public /* synthetic */ r(long j10, rd.h hVar) {
            this(j10);
        }

        @Override // qe.f.l
        public /* bridge */ /* synthetic */ Object a() {
            return dd.z.a(b());
        }

        public long b() {
            return this.f24975a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && this.f24975a == ((r) obj).f24975a;
        }

        public int hashCode() {
            return dd.z.f(this.f24975a);
        }

        private r(long j10) {
            super(null);
            this.f24975a = j10;
        }
    }

    public static final class s extends l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final short f24976a;

        public /* synthetic */ s(short s10, rd.h hVar) {
            this(s10);
        }

        @Override // qe.f.l
        public /* bridge */ /* synthetic */ Object a() {
            return dd.b0.a(b());
        }

        public short b() {
            return this.f24976a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && this.f24976a == ((s) obj).f24976a;
        }

        public int hashCode() {
            return dd.b0.f(this.f24976a);
        }

        private s(short s10) {
            super(null);
            this.f24976a = s10;
        }
    }

    public /* synthetic */ f(rd.h hVar) {
        this();
    }

    private f() {
    }
}
