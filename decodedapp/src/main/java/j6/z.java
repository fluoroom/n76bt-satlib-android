package j6;

/* JADX INFO: loaded from: classes.dex */
public abstract class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final w f18468a = new w();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final x f18469b = new x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final y f18470c = new y();

    public static double a(CharSequence charSequence) {
        return b(charSequence, 0, charSequence.length());
    }

    public static double b(CharSequence charSequence, int i10, int i11) {
        return Double.longBitsToDouble(f18470c.g(charSequence, i10, i11));
    }
}
