package bk;

/* JADX INFO: loaded from: classes3.dex */
enum f {
    YOTTA("Y", 1.0E24d),
    ZETTA("Z", 1.0E21d),
    EXA("E", 1.0E18d),
    PETA("P", 1.0E15d),
    TERA("T", 1.0E12d),
    GIGA("G", 1.0E9d),
    MEGA("M", 1000000.0d),
    KILO("k", 1000.0d),
    HECTO("h", 100.0d),
    DECA("da", 10.0d),
    DECI("d", 0.1d),
    CENTI("c", 0.01d),
    MILLI("m", 0.001d),
    MICRO("µ", 1.0E-6d),
    MICRO_ALTERNATE("μ", 1.0E-6d),
    NANO("n", 1.0E-9d),
    PICO("p", 1.0E-12d),
    FEMTO("f", 1.0E-15d),
    ATTO("a", 1.0E-18d),
    ZEPTO("z", 1.0E-21d),
    YOCTO("y", 1.0E-24d);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f4146b;

    f(String str, double d10) {
        this.f4145a = str;
        this.f4146b = d10;
    }

    public double a() {
        return this.f4146b;
    }

    public String d() {
        return this.f4145a;
    }
}
