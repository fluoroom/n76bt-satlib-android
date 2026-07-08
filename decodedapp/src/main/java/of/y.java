package of;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f23525a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f23526b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f23527c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f23528d = c(3, 2);

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'e' uses external variables
    	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
    	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
    	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static class b {
        public static final b A;
        public static final b B;
        public static final b C;
        private static final /* synthetic */ b[] D;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f23529c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f23530d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f23531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f23532f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f23533g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f23534h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f23535r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f23536s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f23537t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f23538u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f23539v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f23540w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f23541x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final b f23542y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final b f23543z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f23544a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f23545b;

        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // of.y.b
            public boolean e() {
                return false;
            }
        }

        /* JADX INFO: renamed from: of.y$b$b, reason: collision with other inner class name */
        enum C0320b extends b {
            C0320b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // of.y.b
            public boolean e() {
                return false;
            }
        }

        enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // of.y.b
            public boolean e() {
                return false;
            }
        }

        enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // of.y.b
            public boolean e() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f23529c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f23530d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f23531e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f23532f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f23533g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f23534h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f23535r = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f23536s = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f23537t = aVar;
            c cVar3 = c.MESSAGE;
            C0320b c0320b = new C0320b("GROUP", 9, cVar3, 3);
            f23538u = c0320b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f23539v = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f23540w = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f23541x = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f23542y = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f23543z = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            A = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            B = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            C = bVar14;
            D = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0320b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) D.clone();
        }

        public c a() {
            return this.f23544a;
        }

        public int d() {
            return this.f23545b;
        }

        public boolean e() {
            return true;
        }

        private b(String str, int i10, c cVar, int i11) {
            this.f23544a = cVar;
            this.f23545b = i11;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(d.f23423a),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f23556a;

        c(Object obj) {
            this.f23556a = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
