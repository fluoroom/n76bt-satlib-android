package yi;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class d extends m implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final n f32610b = n.c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double[] f32611a;

    public d(double[] dArr, boolean z10) {
        if (dArr == null) {
            throw new ui.h();
        }
        this.f32611a = z10 ? (double[]) dArr.clone() : dArr;
    }

    @Override // yi.m
    public int a() {
        return this.f32611a.length;
    }

    @Override // yi.m
    public double b(int i10) {
        try {
            return this.f32611a[i10];
        } catch (IndexOutOfBoundsException e10) {
            throw new ui.e(e10, ui.d.INDEX, Integer.valueOf(i10), 0, Integer.valueOf(a() - 1));
        }
    }

    @Override // yi.m
    public boolean c() {
        for (double d10 : this.f32611a) {
            if (Double.isNaN(d10)) {
                return true;
            }
        }
        return false;
    }

    @Override // yi.m
    public double[] d() {
        return (double[]) this.f32611a.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f32611a.length != mVar.a()) {
            return false;
        }
        if (mVar.c()) {
            return c();
        }
        int i10 = 0;
        while (true) {
            double[] dArr = this.f32611a;
            if (i10 >= dArr.length) {
                return true;
            }
            if (dArr[i10] != mVar.b(i10)) {
                return false;
            }
            i10++;
        }
    }

    public int hashCode() {
        if (c()) {
            return 9;
        }
        return aj.j.e(this.f32611a);
    }

    public String toString() {
        return f32610b.a(this);
    }
}
