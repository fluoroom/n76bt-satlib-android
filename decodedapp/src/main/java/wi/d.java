package wi;

import java.text.FieldPosition;
import java.text.NumberFormat;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f31521b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f31522c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31523d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f31524e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f31525f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final NumberFormat f31526g;

    protected d(String str, String str2, String str3, NumberFormat numberFormat) {
        this.f31520a = str;
        this.f31521b = str2;
        this.f31522c = str3;
        this.f31523d = str.trim();
        this.f31524e = str2.trim();
        this.f31525f = str3.trim();
        this.f31526g = numberFormat;
    }

    public String a(c cVar) {
        return c(cVar, new StringBuffer(), new FieldPosition(0)).toString();
    }

    protected StringBuffer b(StringBuffer stringBuffer, FieldPosition fieldPosition, double... dArr) {
        fieldPosition.setBeginIndex(0);
        fieldPosition.setEndIndex(0);
        stringBuffer.append(this.f31520a);
        for (int i10 = 0; i10 < dArr.length; i10++) {
            if (i10 > 0) {
                stringBuffer.append(this.f31522c);
            }
            aj.c.a(dArr[i10], this.f31526g, stringBuffer, fieldPosition);
        }
        stringBuffer.append(this.f31521b);
        return stringBuffer;
    }

    public abstract StringBuffer c(c cVar, StringBuffer stringBuffer, FieldPosition fieldPosition);
}
