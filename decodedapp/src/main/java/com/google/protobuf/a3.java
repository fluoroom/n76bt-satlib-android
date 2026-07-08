package com.google.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int f8843a = c(1, 3);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final int f8844b = c(1, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final int f8845c = c(2, 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final int f8846d = c(3, 2);

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f8847a;

        static {
            int[] iArr = new int[b.values().length];
            f8847a = iArr;
            try {
                iArr[b.f8848c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8847a[b.f8849d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8847a[b.f8850e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8847a[b.f8851f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8847a[b.f8852g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8847a[b.f8853h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f8847a[b.f8854r.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f8847a[b.f8855s.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f8847a[b.f8859w.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f8847a[b.f8860x.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f8847a[b.f8862z.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f8847a[b.A.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f8847a[b.B.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f8847a[b.C.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f8847a[b.f8856t.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f8847a[b.f8857u.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f8847a[b.f8858v.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f8847a[b.f8861y.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
        }
    }

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
        public static final b f8848c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f8849d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f8850e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f8851f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f8852g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final b f8853h;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final b f8854r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final b f8855s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final b f8856t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final b f8857u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final b f8858v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final b f8859w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f8860x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final b f8861y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final b f8862z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f8863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f8864b;

        enum a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.a3.b
            public boolean e() {
                return false;
            }
        }

        /* JADX INFO: renamed from: com.google.protobuf.a3$b$b, reason: collision with other inner class name */
        enum C0132b extends b {
            C0132b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.a3.b
            public boolean e() {
                return false;
            }
        }

        enum c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.a3.b
            public boolean e() {
                return false;
            }
        }

        enum d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11, null);
            }

            @Override // com.google.protobuf.a3.b
            public boolean e() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f8848c = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f8849d = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f8850e = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            f8851f = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            f8852g = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            f8853h = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            f8854r = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            f8855s = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            f8856t = aVar;
            c cVar3 = c.MESSAGE;
            C0132b c0132b = new C0132b("GROUP", 9, cVar3, 3);
            f8857u = c0132b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f8858v = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f8859w = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f8860x = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f8861y = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f8862z = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            A = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            B = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            C = bVar14;
            D = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0132b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        /* synthetic */ b(String str, int i10, c cVar, int i11, a aVar) {
            this(str, i10, cVar, i11);
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) D.clone();
        }

        public c a() {
            return this.f8863a;
        }

        public int d() {
            return this.f8864b;
        }

        public boolean e() {
            return true;
        }

        private b(String str, int i10, c cVar, int i11) {
            this.f8863a = cVar;
            this.f8864b = i11;
        }
    }

    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(""),
        BYTE_STRING(l.f9119b),
        ENUM(null),
        MESSAGE(null);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f8875a;

        c(Object obj) {
            this.f8875a = obj;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    static abstract class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f8876a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f8877b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f8878c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ d[] f8879d;

        enum a extends d {
            a(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.protobuf.a3.d
            Object a(m mVar) {
                return mVar.I();
            }
        }

        enum b extends d {
            b(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.protobuf.a3.d
            Object a(m mVar) {
                return mVar.J();
            }
        }

        enum c extends d {
            c(String str, int i10) {
                super(str, i10, null);
            }

            @Override // com.google.protobuf.a3.d
            Object a(m mVar) {
                return mVar.r();
            }
        }

        static {
            a aVar = new a("LOOSE", 0);
            f8876a = aVar;
            b bVar = new b("STRICT", 1);
            f8877b = bVar;
            c cVar = new c("LAZY", 2);
            f8878c = cVar;
            f8879d = new d[]{aVar, bVar, cVar};
        }

        private d(String str, int i10) {
        }

        public static d valueOf(String str) {
            return (d) Enum.valueOf(d.class, str);
        }

        public static d[] values() {
            return (d[]) f8879d.clone();
        }

        abstract Object a(m mVar);

        /* synthetic */ d(String str, int i10, a aVar) {
            this(str, i10);
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }

    static Object d(m mVar, b bVar, d dVar) {
        switch (a.f8847a[bVar.ordinal()]) {
            case 1:
                return Double.valueOf(mVar.s());
            case 2:
                return Float.valueOf(mVar.w());
            case 3:
                return Long.valueOf(mVar.z());
            case 4:
                return Long.valueOf(mVar.M());
            case 5:
                return Integer.valueOf(mVar.y());
            case 6:
                return Long.valueOf(mVar.v());
            case 7:
                return Integer.valueOf(mVar.u());
            case 8:
                return Boolean.valueOf(mVar.q());
            case 9:
                return mVar.r();
            case 10:
                return Integer.valueOf(mVar.L());
            case 11:
                return Integer.valueOf(mVar.E());
            case 12:
                return Long.valueOf(mVar.F());
            case 13:
                return Integer.valueOf(mVar.G());
            case 14:
                return Long.valueOf(mVar.H());
            case 15:
                return dVar.a(mVar);
            case 16:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle nested groups.");
            case 17:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle embedded messages.");
            case 18:
                throw new IllegalArgumentException("readPrimitiveField() cannot handle enums.");
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }
}
