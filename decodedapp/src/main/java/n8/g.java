package n8;

import android.location.Location;
import android.os.Bundle;
import android.os.SystemClock;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import k8.f0;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final DecimalFormat f22619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final DecimalFormat f22620b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final StringBuilder f22621c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f22622d = 0;

    static {
        Locale locale = Locale.ROOT;
        f22619a = new DecimalFormat(".000000", DecimalFormatSymbols.getInstance(locale));
        DecimalFormat decimalFormat = new DecimalFormat(".##", DecimalFormatSymbols.getInstance(locale));
        f22620b = decimalFormat;
        decimalFormat.setRoundingMode(RoundingMode.DOWN);
        f22621c = new StringBuilder();
    }

    public static StringBuilder a(Location location, StringBuilder sb2) {
        sb2.ensureCapacity(100);
        if (location == null) {
            sb2.append((String) null);
            return sb2;
        }
        sb2.append("{");
        sb2.append(location.getProvider());
        sb2.append(", ");
        if (g0.a.i(location)) {
            sb2.append("mock, ");
        }
        DecimalFormat decimalFormat = f22619a;
        sb2.append(decimalFormat.format(location.getLatitude()));
        sb2.append(",");
        sb2.append(decimalFormat.format(location.getLongitude()));
        if (location.hasAccuracy()) {
            sb2.append("±");
            sb2.append(f22620b.format(location.getAccuracy()));
            sb2.append("m");
        }
        if (location.hasAltitude()) {
            sb2.append(", alt=");
            DecimalFormat decimalFormat2 = f22620b;
            sb2.append(decimalFormat2.format(location.getAltitude()));
            if (g0.a.h(location)) {
                sb2.append("±");
                sb2.append(decimalFormat2.format(g0.a.e(location)));
            }
            sb2.append("m");
        }
        if (location.hasSpeed()) {
            sb2.append(", spd=");
            DecimalFormat decimalFormat3 = f22620b;
            sb2.append(decimalFormat3.format(location.getSpeed()));
            if (g0.a.g(location)) {
                sb2.append("±");
                sb2.append(decimalFormat3.format(g0.a.d(location)));
            }
            sb2.append("m/s");
        }
        if (location.hasBearing()) {
            sb2.append(", brg=");
            DecimalFormat decimalFormat4 = f22620b;
            sb2.append(decimalFormat4.format(location.getBearing()));
            if (g0.a.f(location)) {
                sb2.append("±");
                sb2.append(decimalFormat4.format(g0.a.b(location)));
            }
            sb2.append("°");
        }
        Bundle extras = location.getExtras();
        String string = extras != null ? extras.getString("floorLabel") : null;
        if (string != null) {
            sb2.append(", fl=");
            sb2.append(string);
        }
        Bundle extras2 = location.getExtras();
        String string2 = extras2 != null ? extras2.getString("levelId") : null;
        if (string2 != null) {
            sb2.append(", lv=");
            sb2.append(string2);
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        sb2.append(", ert=");
        sb2.append(f0.a(g0.a.c(location) + jCurrentTimeMillis));
        sb2.append('}');
        return sb2;
    }
}
