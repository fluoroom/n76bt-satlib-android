package jj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f18876a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f18877b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f18878c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f18879d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ b[] f18880e;

    enum a extends b {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("IERS_1996", 0);
        f18876a = aVar;
        b bVar = new b("IERS_2003", 1) { // from class: jj.b.b
            {
                a aVar2 = null;
            }
        };
        f18877b = bVar;
        b bVar2 = new b("IERS_2010", 2) { // from class: jj.b.c
            {
                a aVar2 = null;
            }
        };
        f18878c = bVar2;
        b bVar3 = new b("GEGOUT", 3) { // from class: jj.b.d
            {
                a aVar2 = null;
            }
        };
        f18879d = bVar3;
        f18880e = new b[]{aVar, bVar, bVar2, bVar3};
    }

    private b(String str, int i10) {
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f18880e.clone();
    }

    /* synthetic */ b(String str, int i10, a aVar) {
        this(str, i10);
    }
}
