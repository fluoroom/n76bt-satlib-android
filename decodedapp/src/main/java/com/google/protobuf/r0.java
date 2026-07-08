package com.google.protobuf;

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
/* JADX INFO: loaded from: classes3.dex */
public final class r0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final r0 f10068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final r0 f10069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final r0 f10070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final r0 f10071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final r0 f10072h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final r0 f10073r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final r0 f10074s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final r0 f10075t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final r0 f10076u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final r0 f10077v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final /* synthetic */ r0[] f10078w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f10079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Class f10080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10081c;

    static {
        r0 r0Var = new r0("VOID", 0, Void.class, Void.class, null);
        f10068d = r0Var;
        Class cls = Integer.TYPE;
        r0 r0Var2 = new r0("INT", 1, cls, Integer.class, 0);
        f10069e = r0Var2;
        r0 r0Var3 = new r0("LONG", 2, Long.TYPE, Long.class, 0L);
        f10070f = r0Var3;
        r0 r0Var4 = new r0("FLOAT", 3, Float.TYPE, Float.class, Float.valueOf(0.0f));
        f10071g = r0Var4;
        r0 r0Var5 = new r0("DOUBLE", 4, Double.TYPE, Double.class, Double.valueOf(0.0d));
        f10072h = r0Var5;
        r0 r0Var6 = new r0("BOOLEAN", 5, Boolean.TYPE, Boolean.class, Boolean.FALSE);
        f10073r = r0Var6;
        r0 r0Var7 = new r0("STRING", 6, String.class, String.class, "");
        f10074s = r0Var7;
        r0 r0Var8 = new r0("BYTE_STRING", 7, l.class, l.class, l.f9119b);
        f10075t = r0Var8;
        r0 r0Var9 = new r0("ENUM", 8, cls, Integer.class, null);
        f10076u = r0Var9;
        r0 r0Var10 = new r0("MESSAGE", 9, Object.class, Object.class, null);
        f10077v = r0Var10;
        f10078w = new r0[]{r0Var, r0Var2, r0Var3, r0Var4, r0Var5, r0Var6, r0Var7, r0Var8, r0Var9, r0Var10};
    }

    private r0(String str, int i10, Class cls, Class cls2, Object obj) {
        this.f10079a = cls;
        this.f10080b = cls2;
        this.f10081c = obj;
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) f10078w.clone();
    }

    public Class a() {
        return this.f10080b;
    }
}
