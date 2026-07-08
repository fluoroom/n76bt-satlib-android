package r6;

import java.io.Serializable;
import s6.x;
import u6.f0;

/* JADX INFO: loaded from: classes.dex */
public class m implements Serializable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final s6.o[] f25548f = new s6.o[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected static final s6.g[] f25549g = new s6.g[0];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final p6.a[] f25550h = new p6.a[0];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected static final x[] f25551r = new x[0];

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected static final s6.p[] f25552s = {new f0()};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final s6.o[] f25553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final s6.p[] f25554b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final s6.g[] f25555c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final p6.a[] f25556d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final x[] f25557e;

    public m() {
        this(null, null, null, null, null);
    }

    public Iterable a() {
        return new i7.d(this.f25556d);
    }

    public Iterable b() {
        return new i7.d(this.f25555c);
    }

    public Iterable c() {
        return new i7.d(this.f25553a);
    }

    public boolean d() {
        return this.f25556d.length > 0;
    }

    public boolean e() {
        return this.f25555c.length > 0;
    }

    public boolean f() {
        return this.f25554b.length > 0;
    }

    public boolean g() {
        return this.f25557e.length > 0;
    }

    public Iterable h() {
        return new i7.d(this.f25554b);
    }

    public Iterable i() {
        return new i7.d(this.f25557e);
    }

    public m j(s6.o oVar) {
        if (oVar != null) {
            return new m((s6.o[]) i7.c.i(this.f25553a, oVar), this.f25554b, this.f25555c, this.f25556d, this.f25557e);
        }
        throw new IllegalArgumentException("Cannot pass null Deserializers");
    }

    protected m(s6.o[] oVarArr, s6.p[] pVarArr, s6.g[] gVarArr, p6.a[] aVarArr, x[] xVarArr) {
        this.f25553a = oVarArr == null ? f25548f : oVarArr;
        this.f25554b = pVarArr == null ? f25552s : pVarArr;
        this.f25555c = gVarArr == null ? f25549g : gVarArr;
        this.f25556d = aVarArr == null ? f25550h : aVarArr;
        this.f25557e = xVarArr == null ? f25551r : xVarArr;
    }
}
