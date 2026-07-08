package d0;

import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f10514a = new ThreadLocal();

    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean a(Paint paint, String str) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.a(paint, str);
        }
        int length = str.length();
        if (length == 1 && Character.isWhitespace(str.charAt(0))) {
            return true;
        }
        float fMeasureText = paint.measureText("\udfffd");
        float fMeasureText2 = paint.measureText("m");
        float fMeasureText3 = paint.measureText(str);
        float fMeasureText4 = 0.0f;
        if (fMeasureText3 == 0.0f) {
            return false;
        }
        if (str.codePointCount(0, str.length()) > 1) {
            if (fMeasureText3 > fMeasureText2 * 2.0f) {
                return false;
            }
            int i10 = 0;
            while (i10 < length) {
                int iCharCount = Character.charCount(str.codePointAt(i10)) + i10;
                fMeasureText4 += paint.measureText(str, i10, iCharCount);
                i10 = iCharCount;
            }
            if (fMeasureText3 >= fMeasureText4) {
                return false;
            }
        }
        if (fMeasureText3 != fMeasureText) {
            return true;
        }
        l0.c cVarB = b();
        paint.getTextBounds("\udfffd", 0, 2, (Rect) cVarB.f20316a);
        paint.getTextBounds(str, 0, length, (Rect) cVarB.f20317b);
        return !((Rect) cVarB.f20316a).equals(cVarB.f20317b);
    }

    private static l0.c b() {
        ThreadLocal threadLocal = f10514a;
        l0.c cVar = (l0.c) threadLocal.get();
        if (cVar == null) {
            l0.c cVar2 = new l0.c(new Rect(), new Rect());
            threadLocal.set(cVar2);
            return cVar2;
        }
        ((Rect) cVar.f20316a).setEmpty();
        ((Rect) cVar.f20317b).setEmpty();
        return cVar;
    }
}
