package r6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class t implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected static final e7.r[] f25584d = new e7.r[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final e7.g[] f25585e = new e7.g[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final e7.r[] f25586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final e7.r[] f25587b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final e7.g[] f25588c;

    public t() {
        this(null, null, null);
    }

    public boolean a() {
        return this.f25587b.length > 0;
    }

    public boolean b() {
        return this.f25588c.length > 0;
    }

    public Iterable c() {
        return new i7.d(this.f25587b);
    }

    public Iterable d() {
        return new i7.d(this.f25588c);
    }

    public Iterable e() {
        return new i7.d(this.f25586a);
    }

    protected t(e7.r[] rVarArr, e7.r[] rVarArr2, e7.g[] gVarArr) {
        this.f25586a = rVarArr == null ? f25584d : rVarArr;
        this.f25587b = rVarArr2 == null ? f25584d : rVarArr2;
        this.f25588c = gVarArr == null ? f25585e : gVarArr;
    }
}
