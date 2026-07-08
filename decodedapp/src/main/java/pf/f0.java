package pf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f24162a = new f0("PLAIN", 0) { // from class: pf.f0.b
        {
            rd.h hVar = null;
        }

        @Override // pf.f0
        public String d(String str) {
            rd.m.e(str, "string");
            return str;
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f0 f24163b = new f0("HTML", 1) { // from class: pf.f0.a
        {
            rd.h hVar = null;
        }

        @Override // pf.f0
        public String d(String str) {
            rd.m.e(str, "string");
            return rg.q.F(rg.q.F(str, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ f0[] f24164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ kd.a f24165d;

    static {
        f0[] f0VarArrA = a();
        f24164c = f0VarArrA;
        f24165d = kd.b.a(f0VarArrA);
    }

    public /* synthetic */ f0(String str, int i10, rd.h hVar) {
        this(str, i10);
    }

    private static final /* synthetic */ f0[] a() {
        return new f0[]{f24162a, f24163b};
    }

    public static f0 valueOf(String str) {
        return (f0) Enum.valueOf(f0.class, str);
    }

    public static f0[] values() {
        return (f0[]) f24164c.clone();
    }

    public abstract String d(String str);

    private f0(String str, int i10) {
    }
}
