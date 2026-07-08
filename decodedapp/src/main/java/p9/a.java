package p9;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import j9.b;
import j9.c;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AppCompatTextView {
    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private void a(Resources.Theme theme, int i10) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(i10, l.W3);
        int iF = f(getContext(), typedArrayObtainStyledAttributes, l.Z3, l.f28766b4);
        typedArrayObtainStyledAttributes.recycle();
        if (iF >= 0) {
            setLineHeight(iF);
        }
    }

    private static boolean c(Context context) {
        return b.b(context, u8.b.Z, true);
    }

    private static int d(Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f28775c4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(l.f28784d4, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private void e(AttributeSet attributeSet, int i10, int i11) {
        int iD;
        Context context = getContext();
        if (c(context)) {
            Resources.Theme theme = context.getTheme();
            if (g(context, theme, attributeSet, i10, i11) || (iD = d(theme, attributeSet, i10, i11)) == -1) {
                return;
            }
            a(theme, iD);
        }
    }

    private static int f(Context context, TypedArray typedArray, int... iArr) {
        int iD = -1;
        for (int i10 = 0; i10 < iArr.length && iD < 0; i10++) {
            iD = c.d(context, typedArray, iArr[i10], -1);
        }
        return iD;
    }

    private static boolean g(Context context, Resources.Theme theme, AttributeSet attributeSet, int i10, int i11) {
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, l.f28775c4, i10, i11);
        int iF = f(context, typedArrayObtainStyledAttributes, l.f28793e4, l.f28802f4);
        typedArrayObtainStyledAttributes.recycle();
        return iF != -1;
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        if (c(context)) {
            a(context.getTheme(), i10);
        }
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(q9.a.d(context, attributeSet, i10, 0), attributeSet, i10);
        e(attributeSet, i10, 0);
    }
}
