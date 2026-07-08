package zj;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f33391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f33392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h f33393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ h[] f33394d;

    enum a extends h {
        a(String str, int i10) {
            super(str, i10, null);
        }

        @Override // zj.h
        boolean a(yj.b bVar, yj.b bVar2, yj.b bVar3) {
            return true;
        }
    }

    static {
        a aVar = new a("EXPUNGE_EARLIEST", 0);
        f33391a = aVar;
        h hVar = new h("EXPUNGE_LATEST", 1) { // from class: zj.h.b
            {
                a aVar2 = null;
            }

            @Override // zj.h
            boolean a(yj.b bVar, yj.b bVar2, yj.b bVar3) {
                return false;
            }
        };
        f33392b = hVar;
        h hVar2 = new h("EXPUNGE_FARTHEST", 2) { // from class: zj.h.c
            {
                a aVar2 = null;
            }

            @Override // zj.h
            boolean a(yj.b bVar, yj.b bVar2, yj.b bVar3) {
                return bVar.X(bVar2) >= bVar3.X(bVar);
            }
        };
        f33393c = hVar2;
        f33394d = new h[]{aVar, hVar, hVar2};
    }

    private h(String str, int i10) {
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) f33394d.clone();
    }

    abstract boolean a(yj.b bVar, yj.b bVar2, yj.b bVar3);

    /* synthetic */ h(String str, int i10, a aVar) {
        this(str, i10);
    }
}
