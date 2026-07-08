package gi;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static void a(Object obj) {
        if (obj == null) {
            throw new ei.b();
        }
    }

    public static boolean b(double d10, double d11) {
        return new Double(d10).equals(new Double(d11));
    }

    public static int c(double d10) {
        return new Double(d10).hashCode();
    }
}
