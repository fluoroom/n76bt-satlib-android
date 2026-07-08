package xg;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f32149a = Runtime.getRuntime().availableProcessors();

    public static final int a() {
        return f32149a;
    }

    public static final String b(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }
}
