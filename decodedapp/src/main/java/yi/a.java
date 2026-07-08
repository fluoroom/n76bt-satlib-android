package yi;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final k f32606a;

    /* JADX INFO: renamed from: yi.a$a, reason: collision with other inner class name */
    class C0440a extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j f32607a;

        C0440a(j jVar) {
            this.f32607a = jVar;
        }

        @Override // yi.l
        public void a(int i10, int i11, double d10) {
            this.f32607a.d(i11, i10, d10);
        }
    }

    static {
        k kVarE = k.e(Locale.US);
        f32606a = kVarE;
        kVarE.c().setMinimumFractionDigits(1);
    }

    protected a() {
    }

    @Override // yi.b
    public abstract int a();

    @Override // yi.b
    public abstract int b();

    @Override // yi.j
    public abstract double c(int i10, int i11);

    @Override // yi.j
    public abstract void d(int i10, int i11, double d10);

    @Override // yi.j
    public j e() {
        j jVarF = f(a(), b());
        h(new C0440a(jVarF));
        return jVarF;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        int iB = b();
        int iA = a();
        if (jVar.a() != iA || jVar.b() != iB) {
            return false;
        }
        for (int i10 = 0; i10 < iB; i10++) {
            for (int i11 = 0; i11 < iA; i11++) {
                if (c(i10, i11) != jVar.c(i10, i11)) {
                    return false;
                }
            }
        }
        return true;
    }

    public abstract j f(int i10, int i11);

    public void g(double[][] dArr, int i10, int i11) {
        aj.j.b(dArr);
        int length = dArr.length;
        if (length == 0) {
            throw new ui.e(ui.d.AT_LEAST_ONE_ROW, new Object[0]);
        }
        int length2 = dArr[0].length;
        if (length2 == 0) {
            throw new ui.e(ui.d.AT_LEAST_ONE_COLUMN, new Object[0]);
        }
        for (int i12 = 1; i12 < length; i12++) {
            if (dArr[i12].length != length2) {
                throw new ui.e(ui.d.DIMENSIONS_MISMATCH, Integer.valueOf(length2), Integer.valueOf(dArr[i12].length));
            }
        }
        h.c(this, i10);
        h.a(this, i11);
        h.c(this, (length + i10) - 1);
        h.a(this, (length2 + i11) - 1);
        for (int i13 = 0; i13 < length; i13++) {
            for (int i14 = 0; i14 < length2; i14++) {
                d(i10 + i13, i11 + i14, dArr[i13][i14]);
            }
        }
    }

    public double h(l lVar) {
        return i(lVar);
    }

    public int hashCode() {
        int iB = b();
        int iA = a();
        int iD = ((217 + iB) * 31) + iA;
        for (int i10 = 0; i10 < iB; i10++) {
            int i11 = 0;
            while (i11 < iA) {
                int i12 = i11 + 1;
                iD = (iD * 31) + ((((i10 + 1) * 11) + (i12 * 17)) * aj.j.d(c(i10, i11)));
                i11 = i12;
            }
        }
        return iD;
    }

    public abstract double i(l lVar);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        String name = getClass().getName();
        sb2.append(name.substring(name.lastIndexOf(46) + 1));
        sb2.append(f32606a.a(this));
        return sb2.toString();
    }

    protected a(int i10, int i11) {
        if (i10 < 1) {
            throw new ui.e(ui.d.AT_LEAST_ONE_ROW, new Object[0]);
        }
        if (i11 < 1) {
            throw new ui.e(ui.d.AT_LEAST_ONE_COLUMN, new Object[0]);
        }
    }
}
