package a6;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.TintTypedArray;

/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public static int a(Context context, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getColor(0, i11);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Integer b(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            if (typedArrayObtainStyledAttributes.hasValue(0)) {
                return Integer.valueOf(typedArrayObtainStyledAttributes.getColor(0, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
            return null;
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int c(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static Drawable d(Context context, int i10) {
        return e(context, new int[]{i10})[0];
    }

    public static Drawable[] e(Context context, int[] iArr) {
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, (AttributeSet) null, iArr);
        int length = iArr.length;
        Drawable[] drawableArr = new Drawable[length];
        for (int i10 = 0; i10 < length; i10++) {
            try {
                drawableArr[i10] = tintTypedArrayObtainStyledAttributes.getDrawable(i10);
            } catch (IndexOutOfBoundsException e10) {
                e10.printStackTrace();
                return drawableArr;
            } finally {
                tintTypedArrayObtainStyledAttributes.recycle();
            }
        }
        return drawableArr;
    }

    public static int f(Context context, int i10) {
        return g(context, i10, 0);
    }

    public static int g(Context context, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{i10});
        try {
            return typedArrayObtainStyledAttributes.getResourceId(0, i11);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }
}
