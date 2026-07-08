package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import m0.o0;

/* JADX INFO: loaded from: classes.dex */
class AppCompatCompoundButtonHelper {
    private ColorStateList mButtonTintList = null;
    private PorterDuff.Mode mButtonTintMode = null;
    private boolean mHasButtonTint = false;
    private boolean mHasButtonTintMode = false;
    private boolean mSkipNextApply;
    private final CompoundButton mView;

    AppCompatCompoundButtonHelper(CompoundButton compoundButton) {
        this.mView = compoundButton;
    }

    void applyButtonTint() {
        Drawable drawableA = androidx.core.widget.c.a(this.mView);
        if (drawableA != null) {
            if (this.mHasButtonTint || this.mHasButtonTintMode) {
                Drawable drawableMutate = e0.a.r(drawableA).mutate();
                if (this.mHasButtonTint) {
                    e0.a.o(drawableMutate, this.mButtonTintList);
                }
                if (this.mHasButtonTintMode) {
                    e0.a.p(drawableMutate, this.mButtonTintMode);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.mView.getDrawableState());
                }
                this.mView.setButtonDrawable(drawableMutate);
            }
        }
    }

    ColorStateList getSupportButtonTintList() {
        return this.mButtonTintList;
    }

    PorterDuff.Mode getSupportButtonTintMode() {
        return this.mButtonTintMode;
    }

    void loadFromAttributes(AttributeSet attributeSet, int i10) {
        int i11;
        int resourceId;
        int resourceId2;
        Context context = this.mView.getContext();
        int[] iArr = h.j.W0;
        TintTypedArray tintTypedArrayObtainStyledAttributes = TintTypedArray.obtainStyledAttributes(context, attributeSet, iArr, i10, 0);
        CompoundButton compoundButton = this.mView;
        o0.l0(compoundButton, compoundButton.getContext(), iArr, attributeSet, tintTypedArrayObtainStyledAttributes.getWrappedTypeArray(), i10, 0);
        try {
            int i12 = h.j.Y0;
            if (!tintTypedArrayObtainStyledAttributes.hasValue(i12) || (resourceId2 = tintTypedArrayObtainStyledAttributes.getResourceId(i12, 0)) == 0) {
                i11 = h.j.X0;
                if (tintTypedArrayObtainStyledAttributes.hasValue(i11) && (resourceId = tintTypedArrayObtainStyledAttributes.getResourceId(i11, 0)) != 0) {
                    CompoundButton compoundButton2 = this.mView;
                    compoundButton2.setButtonDrawable(i.a.b(compoundButton2.getContext(), resourceId));
                }
            } else {
                try {
                    CompoundButton compoundButton3 = this.mView;
                    compoundButton3.setButtonDrawable(i.a.b(compoundButton3.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    i11 = h.j.X0;
                    if (tintTypedArrayObtainStyledAttributes.hasValue(i11)) {
                        CompoundButton compoundButton22 = this.mView;
                        compoundButton22.setButtonDrawable(i.a.b(compoundButton22.getContext(), resourceId));
                    }
                }
            }
            int i13 = h.j.Z0;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i13)) {
                androidx.core.widget.c.d(this.mView, tintTypedArrayObtainStyledAttributes.getColorStateList(i13));
            }
            int i14 = h.j.f14915a1;
            if (tintTypedArrayObtainStyledAttributes.hasValue(i14)) {
                androidx.core.widget.c.e(this.mView, DrawableUtils.parseTintMode(tintTypedArrayObtainStyledAttributes.getInt(i14, -1), null));
            }
            tintTypedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            tintTypedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    void onSetButtonDrawable() {
        if (this.mSkipNextApply) {
            this.mSkipNextApply = false;
        } else {
            this.mSkipNextApply = true;
            applyButtonTint();
        }
    }

    void setSupportButtonTintList(ColorStateList colorStateList) {
        this.mButtonTintList = colorStateList;
        this.mHasButtonTint = true;
        applyButtonTint();
    }

    void setSupportButtonTintMode(PorterDuff.Mode mode) {
        this.mButtonTintMode = mode;
        this.mHasButtonTintMode = true;
        applyButtonTint();
    }
}
