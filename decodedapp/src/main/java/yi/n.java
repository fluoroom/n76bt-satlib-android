package yi;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final NumberFormat f32645g;

    public n(NumberFormat numberFormat) {
        this("{", "}", "; ", numberFormat);
    }

    public static n c() {
        return d(Locale.getDefault());
    }

    public static n d(Locale locale) {
        return new n(aj.c.c(locale));
    }

    public String a(m mVar) {
        return b(mVar, new StringBuffer(), new FieldPosition(0)).toString();
    }

    public StringBuffer b(m mVar, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        stringBuffer.append(this.f32639a);
        for (int i10 = 0; i10 < mVar.a(); i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f32641c);
            }
            aj.c.a(mVar.b(i10), this.f32645g, stringBuffer, fieldPosition);
        }
        stringBuffer.append(this.f32640b);
        return stringBuffer;
    }

    public n(String str, String str2, String str3, NumberFormat numberFormat) {
        this.f32639a = str;
        this.f32640b = str2;
        this.f32641c = str3;
        this.f32642d = str.trim();
        this.f32643e = str2.trim();
        this.f32644f = str3.trim();
        this.f32645g = numberFormat;
    }
}
