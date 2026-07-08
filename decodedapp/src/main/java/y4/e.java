package y4;

import rd.h;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f32418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e f32419b = new e("STEP_5K", 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e f32420c = new e("STEP_6K25", 1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e f32421d = new e("STEP_10K", 2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e f32422e = new e("STEP_12K5", 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f32423f = new e("STEP_15K", 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f32424g = new e("STEP_25K", 5);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ e[] f32425h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ kd.a f32426r;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final e a(int i10) {
            return (i10 < 0 || i10 >= e.values().length) ? e.f32424g : e.values()[i10];
        }

        private a() {
        }
    }

    static {
        e[] eVarArrA = a();
        f32425h = eVarArrA;
        f32426r = kd.b.a(eVarArrA);
        f32418a = new a(null);
    }

    private e(String str, int i10) {
    }

    private static final /* synthetic */ e[] a() {
        return new e[]{f32419b, f32420c, f32421d, f32422e, f32423f, f32424g};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f32425h.clone();
    }
}
