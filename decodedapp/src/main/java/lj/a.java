package lj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f20690c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f20691d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f20692e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f20693f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ a[] f20694g;

    /* JADX INFO: renamed from: lj.a$a, reason: collision with other inner class name */
    enum C0277a extends a {
        C0277a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        C0277a c0277a = new C0277a("GPS", 0);
        f20688a = c0277a;
        a aVar = new a("GAL", 1) { // from class: lj.a.b
            {
                C0277a c0277a2 = null;
            }
        };
        f20689b = aVar;
        a aVar2 = new a("GLO", 2) { // from class: lj.a.c
            {
                C0277a c0277a2 = null;
            }
        };
        f20690c = aVar2;
        a aVar3 = new a("QZS", 3) { // from class: lj.a.d
            {
                C0277a c0277a2 = null;
            }
        };
        f20691d = aVar3;
        a aVar4 = new a("BDT", 4) { // from class: lj.a.e
            {
                C0277a c0277a2 = null;
            }
        };
        f20692e = aVar4;
        a aVar5 = new a("IRN", 5) { // from class: lj.a.f
            {
                C0277a c0277a2 = null;
            }
        };
        f20693f = aVar5;
        f20694g = new a[]{c0277a, aVar, aVar2, aVar3, aVar4, aVar5};
    }

    private a(String str, int i10) {
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f20694g.clone();
    }

    /* synthetic */ a(String str, int i10, C0277a c0277a) {
        this(str, i10);
    }
}
