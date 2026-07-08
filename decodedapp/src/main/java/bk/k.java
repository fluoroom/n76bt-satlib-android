package bk;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f4178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f4179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f4180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final k f4181g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final k f4182h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final k f4183i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final k f4184j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final k f4185k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final k f4186l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final k f4187m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f4188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f4189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f4190c;

    static {
        j jVar = j.f4162r;
        f4178d = new k(jVar, jVar);
        f4179e = new k(j.f4164t, jVar);
        j jVarK = j.k("as");
        j jVar2 = j.F;
        f4180f = new k(jVarK, jVar2);
        f4181g = new k(j.k("mas"), jVar2);
        j jVarK2 = j.k("ms");
        j jVar3 = j.f4165u;
        f4182h = new k(jVarK2, jVar3);
        f4183i = new k(j.k("nT"), j.S);
        f4184j = new k(j.f4168x, jVar3);
        f4185k = new k(j.B, j.A);
        f4186l = new k(j.k("km²"), j.k("m²"));
        f4187m = new k(j.k("km³/s²"), j.k("m³/s²"));
    }

    public k(j jVar, j jVar2) {
        this.f4188a = jVar;
        this.f4189b = jVar2;
        if (!jVar.n(jVar2)) {
            throw new hj.a(hj.f.INCOMPATIBLE_UNITS, jVar.g(), jVar2.g());
        }
        this.f4190c = jVar.h() / jVar2.h();
    }

    public double a(double d10) {
        return this.f4190c * d10;
    }

    public String toString() {
        return this.f4188a.g() + " → " + this.f4189b.g();
    }
}
