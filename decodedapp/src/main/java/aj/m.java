package aj;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f688b;

    m(double d10, double d11) {
        this.f687a = d10;
        this.f688b = d11;
    }

    public static m c(m mVar, m mVar2) {
        return new m(i.d(mVar.f687a, mVar2.f688b, mVar.f688b, mVar2.f687a), i.d(mVar.f688b, mVar2.f688b, -mVar.f687a, mVar2.f687a));
    }

    public double a() {
        return this.f688b;
    }

    public double b() {
        return this.f687a;
    }
}
