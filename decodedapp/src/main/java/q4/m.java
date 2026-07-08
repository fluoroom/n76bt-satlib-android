package q4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f24307a = new m("WriteDeviceID", 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f24308b = new m("WriteDID", 1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ m[] f24309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ kd.a f24310d;

    static {
        m[] mVarArrA = a();
        f24309c = mVarArrA;
        f24310d = kd.b.a(mVarArrA);
    }

    private m(String str, int i10) {
    }

    private static final /* synthetic */ m[] a() {
        return new m[]{f24307a, f24308b};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f24309c.clone();
    }
}
