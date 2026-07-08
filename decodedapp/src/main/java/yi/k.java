package yi;

import java.text.FieldPosition;
import java.text.NumberFormat;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f32632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f32633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f32634c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f32635d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f32636e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32637f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final NumberFormat f32638g;

    public k(NumberFormat numberFormat) {
        this("{", "}", "{", "}", ",", ",", numberFormat);
    }

    public static k d() {
        return e(Locale.getDefault());
    }

    public static k e(Locale locale) {
        return new k(aj.c.c(locale));
    }

    public String a(j jVar) {
        return b(jVar, new StringBuffer(), new FieldPosition(0)).toString();
    }

    public StringBuffer b(j jVar, StringBuffer stringBuffer, FieldPosition fieldPosition) {
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        stringBuffer.append(this.f32632a);
        int iB = jVar.b();
        for (int i10 = 0; i10 < iB; i10++) {
            stringBuffer.append(this.f32634c);
            for (int i11 = 0; i11 < jVar.a(); i11++) {
                if (i11 > 0) {
                    stringBuffer.append(this.f32637f);
                }
                aj.c.a(jVar.c(i10, i11), this.f32638g, stringBuffer, fieldPosition);
            }
            stringBuffer.append(this.f32635d);
            if (i10 < iB - 1) {
                stringBuffer.append(this.f32636e);
            }
        }
        stringBuffer.append(this.f32633b);
        return stringBuffer;
    }

    public NumberFormat c() {
        return this.f32638g;
    }

    public k(String str, String str2, String str3, String str4, String str5, String str6) {
        this(str, str2, str3, str4, str5, str6, aj.c.b());
    }

    public k(String str, String str2, String str3, String str4, String str5, String str6, NumberFormat numberFormat) {
        this.f32632a = str;
        this.f32633b = str2;
        this.f32634c = str3;
        this.f32635d = str4;
        this.f32636e = str5;
        this.f32637f = str6;
        this.f32638g = numberFormat;
        numberFormat.setGroupingUsed(false);
    }
}
