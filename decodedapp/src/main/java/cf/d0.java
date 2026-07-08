package cf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d0 f4770a = new d0("SOURCE", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d0 f4771b = new d0("BINARY", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ d0[] f4772c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ kd.a f4773d;

    static {
        d0[] d0VarArrA = a();
        f4772c = d0VarArrA;
        f4773d = kd.b.a(d0VarArrA);
    }

    private d0(String str, int i10) {
    }

    private static final /* synthetic */ d0[] a() {
        return new d0[]{f4770a, f4771b};
    }

    public static d0 valueOf(String str) {
        return (d0) Enum.valueOf(d0.class, str);
    }

    public static d0[] values() {
        return (d0[]) f4772c.clone();
    }
}
