package j6;

/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final a0 f18438a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b0 f18439b = new b0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final c0 f18440c = new c0();

    public static float a(CharSequence charSequence) {
        return b(charSequence, 0, charSequence.length());
    }

    public static float b(CharSequence charSequence, int i10, int i11) {
        return Float.intBitsToFloat((int) f18440c.g(charSequence, i10, i11));
    }
}
