package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import m0.o0;

/* JADX INFO: loaded from: classes.dex */
class AppCompatCheckedTextViewHelper {
    private ColorStateList mCheckMarkTintList = null;
    private PorterDuff.Mode mCheckMarkTintMode = null;
    private boolean mHasCheckMarkTint = false;
    private boolean mHasCheckMarkTintMode = false;
    private boolean mSkipNextApply;
    private final CheckedTextView mView;

    AppCompatCheckedTextViewHelper(CheckedTextView checkedTextView) {
        this.mView = checkedTextView;
    }

    void applyCheckMarkTint() {
        Drawable drawableA = androidx.core.widget.b.a(this.mView);
        if (drawableA != null) {
            if (this.mHasCheckMarkTint || this.mHasCheckMarkTintMode) {
                Drawable drawableMutate = e0.a.r(drawableA).mutate();
                if (this.mHasCheckMarkTint) {
                    e0.a.o(drawableMutate, this.mCheckMarkTintList);
                }
                if (this.mHasCheckMarkTintMode) {
                    e0.a.p(drawableMutate, this.mCheckMarkTintMode);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.mView.getDrawableState());
                }
                this.mView.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    ColorStateList getSupportCheckMarkTintList() {
        return this.mCheckMarkTintList;
    }

    PorterDuff.Mode getSupportCheckMarkTintMode() {
        return this.mCheckMarkTintMode;
    }

    void loadFromAttributes(AttributeSet attributeSet, int i10) {
        int i11;
        int resourceId;
        int resourceId2;
        Context context = this.mView.getContext();
        int[] iArr = h.j.R0;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        CheckedTextView checkedTextView = this.mView;
        o0.l0(checkedTextView, checkedTextView.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        try {
            int i12 = h.j.T0;
            if (!tintTypedArrayObtainStyledAttributes.hasValue(i12) || (resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(i12, 0)) == 0) {
                i11 = h.j.S0;
                if (tintTypedArrayObtainStyledAttributes.hasValue(i11) && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(i11, 0)) != 0) {
                    CheckedTextView checkedTextView2 = this.mView;
                    checkedTextView2.setCheckMarkDrawable(i.a.b(checkedTextView2.getContext(), resourceId));
                }
            } else {
                try {
                    CheckedTextView checkedTextView3 = this.mView;
                    checkedTextView3.setCheckMarkDrawable(i.a.b(checkedTextView3.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    i11 = h.j.S0;
                    if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
                        CheckedTextView checkedTextView22 = this.mView;
                        checkedTextView22.setCheckMarkDrawable(i.a.b(checkedTextView22.getContext(), resourceId));
                    }
                }
            }
            int i13 = h.j.U0;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i13)) {
                androidx.core.widget.b.b(this.mView, tintTypedArrayObtainStyledAttributes.getColorStateList(i13));
            }
            int i14 = h.j.V0;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i14)) {
                androidx.core.widget.b.c(this.mView, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i14, -1), null));
            }
            tintTypedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            tintTypedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    void onSetCheckMarkDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
        } else {
            this.mSkipNextApply = true;
            applyCheckMarkTint();
        }
    }

    void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        this.mCheckMarkTintList = colorStateList;
        this.mHasCheckMarkTint = true;
        applyCheckMarkTint();
    }

    void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        this.mCheckMarkTintMode = mode;
        this.mHasCheckMarkTintMode = true;
        applyCheckMarkTint();
    }
}
