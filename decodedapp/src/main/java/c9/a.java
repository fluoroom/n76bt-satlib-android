package c9;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import j9.b;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {
    public static int a(int i10, int i11) {
        return d0.a.k(i10, (Color.alpha(i10) * i11) / 255);
    }

    public static int b(Context context, int i10, int i11) {
        Integer numF = f(context, i10);
        return numF != null ? numF.intValue() : i11;
    }

    public static int c(Context context, int i10, String str) {
        return m(context, b.g(context, i10, str));
    }

    public static int d(View view, int i10) {
        return m(view.getContext(), b.h(view, i10));
    }

    public static int e(View view, int i10, int i11) {
        return b(view.getContext(), i10, i11);
    }

    public static Integer f(Context context, int i10) {
        TypedValue typedValueA = b.a(context, i10);
        if (typedValueA != null) {
            return Integer.valueOf(m(context, typedValueA));
        }
        return null;
    }

    public static ColorStateList g(Context context, int i10, ColorStateList colorStateList) {
        TypedValue typedValueA = b.a(context, i10);
        ColorStateList colorStateListN = typedValueA != null ? n(context, typedValueA) : null;
        return colorStateListN == null ? colorStateList : colorStateListN;
    }

    public static ColorStateList h(Context context, int i10) {
        TypedValue typedValueA = b.a(context, i10);
        if (typedValueA == null) {
            return null;
        }
        int i11 = typedValueA.resourceId;
        if (i11 != 0) {
            return b0.b.c(context, i11);
        }
        int i12 = typedValueA.data;
        if (i12 != 0) {
            return ColorStateList.valueOf(i12);
        }
        return null;
    }

    public static boolean i(int i10) {
        return i10 != 0 && d0.a.d(i10) > 0.5d;
    }

    public static int j(int i10, int i11) {
        return d0.a.g(i11, i10);
    }

    public static int k(int i10, int i11, float f10) {
        return j(i10, d0.a.k(i11, Math.round(Color.alpha(i11) * f10)));
    }

    public static int l(View view, int i10, int i11, float f10) {
        return k(d(view, i10), d(view, i11), f10);
    }

    private static int m(Context context, TypedValue typedValue) {
        int i10 = typedValue.resourceId;
        return i10 != 0 ? b0.b.b(context, i10) : typedValue.data;
    }

    private static ColorStateList n(Context context, TypedValue typedValue) {
        int i10 = typedValue.resourceId;
        return i10 != 0 ? b0.b.c(context, i10) : ColorStateList.valueOf(typedValue.data);
    }
}
