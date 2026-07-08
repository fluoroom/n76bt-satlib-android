package x6;

import d6.r0;

/* JADX INFO: loaded from: classes.dex */
public class e0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final e0 f31695f = new e0(p6.y.f24080e, Object.class, null, false, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final p6.y f31696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Class f31697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Class f31698c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Class f31699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final boolean f31700e;

    public e0(p6.y yVar, Class cls, Class cls2, Class cls3) {
        this(yVar, cls, cls2, false, cls3);
    }

    public static e0 a() {
        return f31695f;
    }

    public boolean b() {
        return this.f31700e;
    }

    public Class c() {
        return this.f31697b;
    }

    public p6.y d() {
        return this.f31696a;
    }

    public Class e() {
        return this.f31698c;
    }

    public Class f() {
        return this.f31699d;
    }

    public e0 g(boolean z10) {
        return this.f31700e == z10 ? this : new e0(this.f31696a, this.f31699d, this.f31697b, z10, this.f31698c);
    }

    public String toString() {
        return "ObjectIdInfo: propName=" + this.f31696a + ", scope=" + i7.h.Y(this.f31699d) + ", generatorType=" + i7.h.Y(this.f31697b) + ", alwaysAsId=" + this.f31700e;
    }

    protected e0(p6.y yVar, Class cls, Class cls2, boolean z10, Class cls3) {
        this.f31696a = yVar;
        this.f31699d = cls;
        this.f31697b = cls2;
        this.f31700e = z10;
        this.f31698c = cls3 == null ? r0.class : cls3;
    }
}
