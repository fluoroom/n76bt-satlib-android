package i4;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final double f15763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f15764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f15765c;

    public b(int i10, double d10, double d11) {
        double d12 = i10;
        this.f15763a = d10 * d12;
        this.f15764b = d12 * d11;
    }

    public double a(double d10) {
        double d11 = this.f15765c;
        double d12 = d10 - d11;
        if (d12 >= 0.0d) {
            this.f15765c = d11 + (d12 / this.f15763a);
        } else {
            this.f15765c = d11 + (d12 / this.f15764b);
        }
        return this.f15765c;
    }
}
