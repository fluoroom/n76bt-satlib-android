package e6;

/* JADX INFO: loaded from: classes.dex */
public enum m {
    NOT_AVAILABLE(null, -1),
    START_OBJECT("{", 1),
    END_OBJECT("}", 2),
    START_ARRAY("[", 3),
    END_ARRAY("]", 4),
    FIELD_NAME(null, 5),
    VALUE_EMBEDDED_OBJECT(null, 12),
    VALUE_STRING(null, 6),
    VALUE_NUMBER_INT(null, 7),
    VALUE_NUMBER_FLOAT(null, 8),
    VALUE_TRUE("true", 9),
    VALUE_FALSE("false", 10),
    VALUE_NULL("null", 11);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f11569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final char[] f11570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final byte[] f11571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f11572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final boolean f11573e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final boolean f11574f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final boolean f11575g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f11576h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final boolean f11577r;

    m(String str, int i10) {
        boolean z10 = false;
        if (str == null) {
            this.f11569a = null;
            this.f11570b = null;
            this.f11571c = null;
        } else {
            this.f11569a = str;
            char[] charArray = str.toCharArray();
            this.f11570b = charArray;
            int length = charArray.length;
            this.f11571c = new byte[length];
            for (int i11 = 0; i11 < length; i11++) {
                this.f11571c[i11] = (byte) this.f11570b[i11];
            }
        }
        this.f11572d = i10;
        this.f11576h = i10 == 10 || i10 == 9;
        this.f11575g = i10 == 7 || i10 == 8;
        boolean z11 = i10 == 1 || i10 == 3;
        this.f11573e = z11;
        boolean z12 = i10 == 2 || i10 == 4;
        this.f11574f = z12;
        if (!z11 && !z12 && i10 != 5 && i10 != -1) {
            z10 = true;
        }
        this.f11577r = z10;
    }

    public final char[] a() {
        return this.f11570b;
    }

    public final String d() {
        return this.f11569a;
    }

    public final int e() {
        return this.f11572d;
    }

    public final boolean f() {
        return this.f11575g;
    }

    public final boolean g() {
        return this.f11577r;
    }

    public final boolean h() {
        return this.f11574f;
    }

    public final boolean i() {
        return this.f11573e;
    }
}
