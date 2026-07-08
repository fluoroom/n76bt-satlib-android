package aj;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static StringBuffer a(double d10, NumberFormat numberFormat, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            numberFormat.format(d10, stringBuffer, fieldPosition);
            return stringBuffer;
        }
        stringBuffer.append('(');
        stringBuffer.append(d10);
        stringBuffer.append(')');
        return stringBuffer;
    }

    public static NumberFormat b() {
        return c(Locale.getDefault());
    }

    public static NumberFormat c(Locale locale) {
        NumberFormat numberFormat = NumberFormat.getInstance(locale);
        numberFormat.setMaximumFractionDigits(10);
        return numberFormat;
    }
}
