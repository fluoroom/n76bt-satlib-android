package he;

import org.simpleframework.xml.strategy.Name;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final f f15271b = new f("CLASS", 0, Name.LABEL);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final f f15272c = new f("INTERFACE", 1, "interface");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f15273d = new f("ENUM_CLASS", 2, "enum class");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final f f15274e = new f("ENUM_ENTRY", 3, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final f f15275f = new f("ANNOTATION_CLASS", 4, "annotation class");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f15276g = new f("OBJECT", 5, "object");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ f[] f15277h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final /* synthetic */ kd.a f15278r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f15279a;

    static {
        f[] fVarArrA = a();
        f15277h = fVarArrA;
        f15278r = kd.b.a(fVarArrA);
    }

    private f(String str, int i10, String str2) {
        this.f15279a = str2;
    }

    private static final /* synthetic */ f[] a() {
        return new f[]{f15271b, f15272c, f15273d, f15274e, f15275f, f15276g};
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) f15277h.clone();
    }

    public final boolean d() {
        return this == f15276g || this == f15274e;
    }
}
