package xi;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class g extends wi.d {
    public g(NumberFormat numberFormat) {
        super("{", "}", "; ", numberFormat);
    }

    public static g d() {
        return e(Locale.getDefault());
    }

    public static g e(Locale locale) {
        return new g(aj.c.c(locale));
    }

    @Override // wi.d
    public StringBuffer c(wi.c cVar, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        f fVar = (f) cVar;
        return b(stringBuffer, fieldPosition, fVar.j(), fVar.k(), fVar.l());
    }
}
