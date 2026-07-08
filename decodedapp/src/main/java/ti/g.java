package ti;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static void a(double d10, double d11) {
        if (d10 >= d11) {
            throw new ui.e(ui.d.ENDPOINTS_NOT_AN_INTERVAL, Double.valueOf(d10), Double.valueOf(d11), Boolean.FALSE);
        }
    }
}
