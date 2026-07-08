package z3;

import w3.c;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f32893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f32894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f32895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private short f32896h;

    public b(int i10, double d10, short s10) {
        super(null);
        this.f32892d = i10;
        this.f32896h = s10;
        g(d10);
    }

    @Override // w3.c
    public int e(short[] sArr, int i10, int i11) {
        int i12 = i10 + i11;
        while (i10 < i12) {
            double d10 = this.f32895g;
            short s10 = this.f32896h;
            if (d10 < 1.0d) {
                s10 = (short) (-s10);
            }
            sArr[i10] = s10;
            this.f32895g = (d10 + this.f32894f) % 2.0d;
            i10++;
        }
        return i11;
    }

    public void g(double d10) {
        if (this.f32893e == d10) {
            return;
        }
        this.f32893e = d10;
        this.f32894f = (2.0d / ((double) this.f32892d)) * d10;
    }

    public void h(short s10) {
        this.f32896h = s10;
    }
}
