package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.internal.m;
import com.google.android.material.internal.n;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import m9.h;
import m9.i;
import u8.k;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f7367f = k.f28750z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ImageView.ScaleType[] f7368g = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f7369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f7370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ImageView.ScaleType f7372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Boolean f7373e;

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, h.a.Q0);
    }

    private Pair a(TextView textView, TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i10 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i10 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i10 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void b(Context context) {
        Drawable background = getBackground();
        ColorStateList colorStateListValueOf = background == null ? ColorStateList.valueOf(0) : com.google.android.material.drawable.c.f(background);
        if (colorStateListValueOf != null) {
            h hVar = new h();
            hVar.c0(colorStateListValueOf);
            hVar.Q(context);
            hVar.b0(getElevation());
            setBackground(hVar);
        }
    }

    private void c(View view, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i10 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i11 = measuredWidth2 + i10;
        int iMax = Math.max(Math.max(((Integer) pair.first).intValue() - i10, 0), Math.max(i11 - ((Integer) pair.second).intValue(), 0));
        if (iMax > 0) {
            i10 += iMax;
            i11 -= iMax;
            view.measure(View.MeasureSpec.makeMeasureSpec(i11 - i10, WXVideoFileObject.FILE_SIZE_LIMIT), view.getMeasuredHeightAndState());
        }
        view.layout(i10, view.getTop(), i11, view.getBottom());
    }

    private void d() {
        if (this.f7370b || this.f7371c) {
            TextView textViewE = n.e(this);
            TextView textViewC = n.c(this);
            if (textViewE == null && textViewC == null) {
                return;
            }
            Pair pairA = a(textViewE, textViewC);
            if (this.f7370b && textViewE != null) {
                c(textViewE, pairA);
            }
            if (!this.f7371c || textViewC == null) {
                return;
            }
            c(textViewC, pairA);
        }
    }

    private Drawable e(Drawable drawable) {
        if (drawable == null || this.f7369a == null) {
            return drawable;
        }
        Drawable drawableR = e0.a.r(drawable.mutate());
        drawableR.setTint(this.f7369a.intValue());
        return drawableR;
    }

    private void f() {
        ImageView imageViewB = n.b(this);
        if (imageViewB != null) {
            Boolean bool = this.f7373e;
            if (bool != null) {
                imageViewB.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f7372d;
            if (scaleType != null) {
                imageViewB.setScaleType(scaleType);
            }
        }
    }

    public ImageView.ScaleType getLogoScaleType() {
        return this.f7372d;
    }

    public Integer getNavigationIconTint() {
        return this.f7369a;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        d();
        f();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        i.d(this, f10);
    }

    public void setLogoAdjustViewBounds(boolean z10) {
        Boolean bool = this.f7373e;
        if (bool == null || bool.booleanValue() != z10) {
            this.f7373e = Boolean.valueOf(z10);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.f7372d != scaleType) {
            this.f7372d = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(e(drawable));
    }

    public void setNavigationIconTint(int i10) {
        this.f7369a = Integer.valueOf(i10);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z10) {
        if (this.f7371c != z10) {
            this.f7371c = z10;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z10) {
        if (this.f7370b != z10) {
            this.f7370b = z10;
            requestLayout();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialToolbar(Context context, AttributeSet attributeSet, int i10) {
        int i11 = f7367f;
        super(q9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        Context context2 = getContext();
        TypedArray typedArrayI = m.i(context2, attributeSet, l.f28820h4, i10, i11, new int[0]);
        int i12 = l.f28847k4;
        if (typedArrayI.hasValue(i12)) {
            setNavigationIconTint(typedArrayI.getColor(i12, -1));
        }
        this.f7370b = typedArrayI.getBoolean(l.f28865m4, false);
        this.f7371c = typedArrayI.getBoolean(l.f28856l4, false);
        int i13 = typedArrayI.getInt(l.f28838j4, -1);
        if (i13 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = f7368g;
            if (i13 < scaleTypeArr.length) {
                this.f7372d = scaleTypeArr[i13];
            }
        }
        int i14 = l.f28829i4;
        if (typedArrayI.hasValue(i14)) {
            this.f7373e = Boolean.valueOf(typedArrayI.getBoolean(i14, false));
        }
        typedArrayI.recycle();
        b(context2);
    }
}
