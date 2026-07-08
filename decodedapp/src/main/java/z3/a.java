package z3;

import w3.c;
import w3.e;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32885d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f32886e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private double f32887f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f32888g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f32889h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private short f32890i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32891j;

    public a(int i10, double d10, short s10) {
        super(null);
        this.f32885d = i10;
        this.f32886e = d10;
        this.f32890i = s10;
        this.f32887f = (6.283185307179586d / ((double) i10)) * d10;
    }

    @Override // w3.c
    public int b(int i10) {
        int i11 = this.f32891j + i10;
        this.f32891j = i11;
        this.f32888g = (this.f32887f * ((double) i11)) % 6.283185307179586d;
        return i10;
    }

    @Override // w3.c
    public int e(short[] sArr, int i10, int i11) {
        int i12 = i10 + i11;
        double d10 = this.f32888g + this.f32889h;
        while (i10 < i12) {
            sArr[i10] = e.a(Math.sin(d10) * ((double) this.f32890i));
            d10 += this.f32887f;
            i10++;
        }
        this.f32888g = d10 % 6.283185307179586d;
        this.f32891j += i11;
        return i11;
    }

    @Override // w3.c
    public int f(int i10) {
        b(i10 - this.f32891j);
        return this.f32891j;
    }

    public double g() {
        return this.f32886e;
    }

    public void h() {
        this.f32888g = 0.0d;
    }

    public void i(double d10) {
        if (this.f32886e == d10) {
            return;
        }
        this.f32886e = d10;
        this.f32887f = (6.283185307179586d / ((double) this.f32885d)) * d10;
    }

    public void j(short s10) {
        this.f32890i = s10;
    }

    public void k(double d10) {
        this.f32889h = d10;
    }
}
