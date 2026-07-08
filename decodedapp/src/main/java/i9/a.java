package i9;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.c;
import com.google.android.material.internal.m;
import u8.b;
import u8.k;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AppCompatRadioButton {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f15949c = k.f28743s;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[][] f15950d = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ColorStateList f15951a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f15952b;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.f14773r0);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f15951a == null) {
            int iD = c9.a.d(this, h.a.I);
            int iD2 = c9.a.d(this, b.f28550f);
            int iD3 = c9.a.d(this, b.f28552h);
            int[][] iArr = f15950d;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = c9.a.k(iD3, iD, 1.0f);
            iArr2[1] = c9.a.k(iD3, iD2, 0.54f);
            iArr2[2] = c9.a.k(iD3, iD2, 0.38f);
            iArr2[3] = c9.a.k(iD3, iD2, 0.38f);
            this.f15951a = new ColorStateList(iArr, iArr2);
        }
        return this.f15951a;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f15952b && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f15952b = z10;
        if (z10) {
            c.d(this, getMaterialThemeColorsTintList());
        } else {
            c.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f15949c;
        super(q9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = m.i(context2, attributeSet, l.M3, i10, i11, new int[0]);
        int i12 = l.N3;
        if (typedArrayI.hasValue(i12)) {
            c.d(this, j9.c.a(context2, typedArrayI, i12));
        }
        this.f15952b = typedArrayI.getBoolean(l.O3, false);
        typedArrayI.recycle();
    }
}
