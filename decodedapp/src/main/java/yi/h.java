package yi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a */
    public static final k f32617a = k.d();

    /* JADX INFO: renamed from: b */
    public static final k f32618b = new k("[", "]", "", "", "; ", ", ");

    /* JADX INFO: renamed from: c */
    private static final double[] f32619c = {120.0d, 60.0d, 12.0d, 1.0d};

    /* JADX INFO: renamed from: d */
    private static final double[] f32620d = {30240.0d, 15120.0d, 3360.0d, 420.0d, 30.0d, 1.0d};

    /* JADX INFO: renamed from: e */
    private static final double[] f32621e = {1.729728E7d, 8648640.0d, 1995840.0d, 277200.0d, 25200.0d, 1512.0d, 56.0d, 1.0d};

    /* JADX INFO: renamed from: f */
    private static final double[] f32622f = {1.76432256E10d, 8.8216128E9d, 2.0756736E9d, 3.027024E8d, 3.027024E7d, 2162160.0d, 110880.0d, 3960.0d, 90.0d, 1.0d};

    /* JADX INFO: renamed from: g */
    private static final double[] f32623g = {6.476475253248E16d, 3.238237626624E16d, 7.7717703038976E15d, 1.1873537964288E15d, 1.29060195264E14d, 1.05594705216E13d, 6.704425728E11d, 3.352212864E10d, 1.32324192E9d, 4.08408E7d, 960960.0d, 16380.0d, 182.0d, 1.0d};

    public static void a(b bVar, int i10) {
        if (i10 < 0 || i10 >= bVar.a()) {
            throw new ui.e(ui.d.COLUMN_INDEX, Integer.valueOf(i10), 0, Integer.valueOf(bVar.a() - 1));
        }
    }

    public static void b(b bVar, int i10, int i11) {
        c(bVar, i10);
        a(bVar, i11);
    }

    public static void c(b bVar, int i10) {
        if (i10 < 0 || i10 >= bVar.b()) {
            throw new ui.e(ui.d.ROW_INDEX, Integer.valueOf(i10), 0, Integer.valueOf(bVar.b() - 1));
        }
    }

    public static j d(int i10) {
        j jVarE = e(i10, i10);
        for (int i11 = 0; i11 < i10; i11++) {
            jVarE.d(i11, i11, 1.0d);
        }
        return jVarE;
    }

    public static j e(int i10, int i11) {
        return i10 * i11 <= 4096 ? new c(i10, i11) : new e(i10, i11);
    }

    public static j f(double[][] dArr) {
        double[] dArr2;
        if (dArr == null || (dArr2 = dArr[0]) == null) {
            throw new ui.h();
        }
        return dArr.length * dArr2.length <= 4096 ? new c(dArr) : new e(dArr);
    }

    public static m g(double[] dArr) {
        if (dArr != null) {
            return new d(dArr, true);
        }
        throw new ui.h();
    }
}
