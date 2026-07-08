package com.google.android.material.button;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.internal.m;
import com.google.android.material.internal.p;
import java.util.Iterator;
import java.util.LinkedHashSet;
import m9.h;
import m9.l;
import m9.o;
import m9.q;
import m9.r;
import t0.f;
import t0.i;
import t0.j;
import u8.k;

/* JADX INFO: loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, o {
    private static final int[] L = {R.attr.state_checkable};
    private static final int[] M = {R.attr.state_checked};
    private static final int N = k.f28740p;
    private static final int O = u8.b.f28565u;
    private static final f P = new a("widthIncrease");
    private int A;
    private LinearLayout.LayoutParams B;
    private boolean C;
    private int D;
    private boolean E;
    int F;
    r G;
    int H;
    private float I;
    private float J;
    private i K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f7536a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LinkedHashSet f7537b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f7538c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PorterDuff.Mode f7539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ColorStateList f7540e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f7541f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f7542g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f7543h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f7544r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f7545s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f7546t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f7547u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f7548v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f7549w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f7550x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f7551y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f7552z;

    class a extends f {
        a(String str) {
            super(str);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(MaterialButton materialButton) {
            return materialButton.getDisplayedWidthIncrease();
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MaterialButton materialButton, float f10) {
            materialButton.setDisplayedWidthIncrease(f10);
        }
    }

    interface b {
        void a(MaterialButton materialButton, boolean z10);
    }

    static class c extends q0.a {
        public static final Parcelable.Creator<c> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f7553a;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel) {
                return new c(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public c[] newArray(int i10) {
                return new c[i10];
            }
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel) {
            this.f7553a = parcel.readInt() == 1;
        }

        @Override // q0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f7553a ? 1 : 0);
        }

        public c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                getClass().getClassLoader();
            }
            b(parcel);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u8.b.f28560p);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.D = materialButton.getOpticalCenterShift();
        materialButton.s();
        materialButton.invalidate();
    }

    public static /* synthetic */ void b(MaterialButton materialButton, float f10) {
        int i10 = (int) (f10 * 0.11f);
        if (materialButton.D != i10) {
            materialButton.D = i10;
            materialButton.s();
            materialButton.invalidate();
        }
    }

    private j e() {
        return h9.d.h(getContext(), u8.b.K, k.f28725a);
    }

    private void f() {
        i iVar = new i(this, P);
        this.K = iVar;
        iVar.x(e());
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.I;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        h hVarG;
        if (this.C && this.E && (hVarG = this.f7536a.g()) != null) {
            return (int) (hVarG.z() * 0.11f);
        }
        return 0;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String string = getText().toString();
        if (getTransformationMethod() != null) {
            string = getTransformationMethod().getTransformation(string, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(string, 0, string.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float fMax = 0.0f;
        for (int i10 = 0; i10 < lineCount; i10++) {
            fMax = Math.max(fMax, getLayout().getLineWidth(i10));
        }
        return (int) Math.ceil(fMax);
    }

    private boolean h() {
        int i10 = this.f7549w;
        return i10 == 3 || i10 == 4;
    }

    private boolean i() {
        int i10 = this.f7549w;
        return i10 == 1 || i10 == 2;
    }

    private boolean j() {
        int i10 = this.f7549w;
        return i10 == 16 || i10 == 32;
    }

    private boolean k() {
        return (getParent() instanceof d) && ((d) getParent()).getOrientation() == 0;
    }

    private boolean l() {
        return getLayoutDirection() == 1;
    }

    private boolean m() {
        e eVar = this.f7536a;
        return (eVar == null || eVar.q()) ? false : true;
    }

    private void n(boolean z10) {
        if (this.G == null) {
            return;
        }
        if (this.K == null) {
            f();
        }
        if (this.E) {
            this.K.t(Math.min(this.H, this.G.e(getDrawableState()).f21950a.a(getWidth())));
            if (z10) {
                this.K.y();
            }
        }
    }

    private void p() {
        if (i()) {
            setCompoundDrawablesRelative(this.f7541f, null, null, null);
        } else if (h()) {
            setCompoundDrawablesRelative(null, null, this.f7541f, null);
        } else if (j()) {
            setCompoundDrawablesRelative(null, this.f7541f, null, null);
        }
    }

    private void q(boolean z10) {
        Drawable drawable = this.f7541f;
        if (drawable != null) {
            Drawable drawableMutate = e0.a.r(drawable).mutate();
            this.f7541f = drawableMutate;
            drawableMutate.setTintList(this.f7540e);
            PorterDuff.Mode mode = this.f7539d;
            if (mode != null) {
                this.f7541f.setTintMode(mode);
            }
            int intrinsicWidth = this.f7543h;
            if (intrinsicWidth == 0) {
                intrinsicWidth = this.f7541f.getIntrinsicWidth();
            }
            int intrinsicHeight = this.f7543h;
            if (intrinsicHeight == 0) {
                intrinsicHeight = this.f7541f.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f7541f;
            int i10 = this.f7544r;
            int i11 = this.f7545s;
            drawable2.setBounds(i10, i11, intrinsicWidth + i10, intrinsicHeight + i11);
            this.f7541f.setVisible(true, z10);
        }
        if (z10) {
            p();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        if ((!i() || drawable3 == this.f7541f) && ((!h() || drawable5 == this.f7541f) && (!j() || drawable4 == this.f7541f))) {
            return;
        }
        p();
    }

    private void r(int i10, int i11) {
        if (this.f7541f == null || getLayout() == null) {
            return;
        }
        if (!i() && !h()) {
            if (j()) {
                this.f7544r = 0;
                if (this.f7549w == 16) {
                    this.f7545s = 0;
                    q(false);
                    return;
                }
                int intrinsicHeight = this.f7543h;
                if (intrinsicHeight == 0) {
                    intrinsicHeight = this.f7541f.getIntrinsicHeight();
                }
                int iMax = Math.max(0, (((((i11 - getTextHeight()) - getPaddingTop()) - intrinsicHeight) - this.f7546t) - getPaddingBottom()) / 2);
                if (this.f7545s != iMax) {
                    this.f7545s = iMax;
                    q(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f7545s = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i12 = this.f7549w;
        if (i12 == 1 || i12 == 3 || ((i12 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i12 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f7544r = 0;
            q(false);
            return;
        }
        int intrinsicWidth = this.f7543h;
        if (intrinsicWidth == 0) {
            intrinsicWidth = this.f7541f.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i10 - getTextLayoutWidth()) - getPaddingEnd()) - intrinsicWidth) - this.f7546t) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if (l() != (this.f7549w == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.f7544r != textLayoutWidth) {
            this.f7544r = textLayoutWidth;
            q(false);
        }
    }

    private void s() {
        int i10 = (int) (this.I - this.J);
        int i11 = (i10 / 2) + this.D;
        getLayoutParams().width = (int) (this.f7551y + i10);
        setPaddingRelative(this.f7552z + i11, getPaddingTop(), (this.A + i10) - i11, getPaddingBottom());
    }

    private void setCheckedInternal(boolean z10) {
        if (!g() || this.f7547u == z10) {
            return;
        }
        this.f7547u = z10;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            ((MaterialButtonToggleGroup) getParent()).w(this, this.f7547u);
        }
        if (this.f7548v) {
            return;
        }
        this.f7548v = true;
        Iterator it = this.f7537b.iterator();
        if (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            throw null;
        }
        this.f7548v = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f10) {
        if (this.I != f10) {
            this.I = f10;
            s();
            invalidate();
            if (getParent() instanceof d) {
                ((d) getParent()).k(this, (int) this.I);
            }
        }
    }

    public boolean g() {
        e eVar = this.f7536a;
        return eVar != null && eVar.r();
    }

    String getA11yClassName() {
        if (TextUtils.isEmpty(this.f7542g)) {
            return (g() ? CompoundButton.class : Button.class).getName();
        }
        return this.f7542g;
    }

    int getAllowedWidthDecrease() {
        return this.F;
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (m()) {
            return this.f7536a.b();
        }
        return 0;
    }

    public j getCornerSpringForce() {
        return this.f7536a.c();
    }

    public Drawable getIcon() {
        return this.f7541f;
    }

    public int getIconGravity() {
        return this.f7549w;
    }

    public int getIconPadding() {
        return this.f7546t;
    }

    public int getIconSize() {
        return this.f7543h;
    }

    public ColorStateList getIconTint() {
        return this.f7540e;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f7539d;
    }

    public int getInsetBottom() {
        return this.f7536a.d();
    }

    public int getInsetTop() {
        return this.f7536a.e();
    }

    public ColorStateList getRippleColor() {
        if (m()) {
            return this.f7536a.i();
        }
        return null;
    }

    public l getShapeAppearanceModel() {
        if (m()) {
            return this.f7536a.j();
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public q getStateListShapeAppearanceModel() {
        if (m()) {
            return this.f7536a.k();
        }
        throw new IllegalStateException("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (m()) {
            return this.f7536a.l();
        }
        return null;
    }

    public int getStrokeWidth() {
        if (m()) {
            return this.f7536a.m();
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return m() ? this.f7536a.n() : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return m() ? this.f7536a.o() : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f7547u;
    }

    void o() {
        LinearLayout.LayoutParams layoutParams = this.B;
        if (layoutParams != null) {
            setLayoutParams(layoutParams);
            this.B = null;
            this.f7551y = -1.0f;
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (m()) {
            m9.i.f(this, this.f7536a.g());
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 2);
        if (g()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, L);
        }
        if (isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, M);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(isChecked());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(g());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        e eVar;
        super.onLayout(z10, i10, i11, i12, i13);
        if (Build.VERSION.SDK_INT == 21 && (eVar = this.f7536a) != null) {
            eVar.O(i13 - i11, i12 - i10);
        }
        r(getMeasuredWidth(), getMeasuredHeight());
        int i15 = getResources().getConfiguration().orientation;
        if (this.f7550x != i15) {
            this.f7550x = i15;
            this.f7551y = -1.0f;
        }
        if (this.f7551y == -1.0f) {
            this.f7551y = getMeasuredWidth();
            if (this.B == null && (getParent() instanceof d) && ((d) getParent()).getButtonSizeChange() != null) {
                this.B = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.B);
                layoutParams.width = (int) this.f7551y;
                setLayoutParams(layoutParams);
            }
        }
        if (this.F == -1) {
            if (this.f7541f == null) {
                i14 = 0;
            } else {
                int iconPadding = getIconPadding();
                int intrinsicWidth = this.f7543h;
                if (intrinsicWidth == 0) {
                    intrinsicWidth = this.f7541f.getIntrinsicWidth();
                }
                i14 = iconPadding + intrinsicWidth;
            }
            this.F = (getMeasuredWidth() - getTextLayoutWidth()) - i14;
        }
        if (this.f7552z == -1) {
            this.f7552z = getPaddingStart();
        }
        if (this.A == -1) {
            this.A = getPaddingEnd();
        }
        this.E = k();
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.getSuperState());
        setChecked(cVar.f7553a);
    }

    @Override // android.widget.TextView, android.view.View
    public Parcelable onSaveInstanceState() {
        c cVar = new c(super.onSaveInstanceState());
        cVar.f7553a = this.f7547u;
        return cVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        super.onTextChanged(charSequence, i10, i11, i12);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public boolean performClick() {
        if (isEnabled() && this.f7536a.s()) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f7541f != null) {
            if (this.f7541f.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f7542g = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        if (m()) {
            this.f7536a.u(i10);
        } else {
            super.setBackgroundColor(i10);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!m()) {
            super.setBackgroundDrawable(drawable);
        } else {
            if (drawable == getBackground()) {
                getBackground().setState(drawable.getState());
                return;
            }
            Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
            this.f7536a.v();
            super.setBackgroundDrawable(drawable);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i10) {
        setBackgroundDrawable(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z10) {
        if (m()) {
            this.f7536a.w(z10);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z10) {
        setCheckedInternal(z10);
    }

    public void setCornerRadius(int i10) {
        if (m()) {
            this.f7536a.x(i10);
        }
    }

    public void setCornerRadiusResource(int i10) {
        if (m()) {
            setCornerRadius(getResources().getDimensionPixelSize(i10));
        }
    }

    public void setCornerSpringForce(j jVar) {
        this.f7536a.z(jVar);
    }

    void setDisplayedWidthDecrease(int i10) {
        this.J = Math.min(i10, this.F);
        s();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        if (m()) {
            this.f7536a.g().b0(f10);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f7541f != drawable) {
            this.f7541f = drawable;
            q(true);
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i10) {
        if (this.f7549w != i10) {
            this.f7549w = i10;
            r(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i10) {
        if (this.f7546t != i10) {
            this.f7546t = i10;
            setCompoundDrawablePadding(i10);
        }
    }

    public void setIconResource(int i10) {
        setIcon(i10 != 0 ? i.a.b(getContext(), i10) : null);
    }

    public void setIconSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f7543h != i10) {
            this.f7543h = i10;
            q(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f7540e != colorStateList) {
            this.f7540e = colorStateList;
            q(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f7539d != mode) {
            this.f7539d = mode;
            q(false);
        }
    }

    public void setIconTintResource(int i10) {
        setIconTint(i.a.a(getContext(), i10));
    }

    public void setInsetBottom(int i10) {
        this.f7536a.A(i10);
    }

    public void setInsetTop(int i10) {
        this.f7536a.B(i10);
    }

    void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    void setOnPressedChangeListenerInternal(b bVar) {
        this.f7538c = bVar;
    }

    public void setOpticalCenterEnabled(boolean z10) {
        if (this.C != z10) {
            this.C = z10;
            if (z10) {
                this.f7536a.y(new h.d() { // from class: com.google.android.material.button.a
                    @Override // m9.h.d
                    public final void a(float f10) {
                        MaterialButton.b(this.f7561a, f10);
                    }
                });
            } else {
                this.f7536a.y(null);
            }
            post(new Runnable() { // from class: com.google.android.material.button.b
                @Override // java.lang.Runnable
                public final void run() {
                    MaterialButton.a(this.f7562a);
                }
            });
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        b bVar = this.f7538c;
        if (bVar != null) {
            bVar.a(this, z10);
        }
        super.setPressed(z10);
        n(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (m()) {
            this.f7536a.C(colorStateList);
        }
    }

    public void setRippleColorResource(int i10) {
        if (m()) {
            setRippleColor(i.a.a(getContext(), i10));
        }
    }

    @Override // m9.o
    public void setShapeAppearanceModel(l lVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f7536a.D(lVar);
    }

    void setShouldDrawSurfaceColorStroke(boolean z10) {
        if (m()) {
            this.f7536a.E(z10);
        }
    }

    void setSizeChange(r rVar) {
        if (this.G != rVar) {
            this.G = rVar;
            n(true);
        }
    }

    public void setStateListShapeAppearanceModel(q qVar) {
        if (!m()) {
            throw new IllegalStateException("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        if (this.f7536a.c() == null && qVar.f()) {
            this.f7536a.z(e());
        }
        this.f7536a.F(qVar);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (m()) {
            this.f7536a.G(colorStateList);
        }
    }

    public void setStrokeColorResource(int i10) {
        if (m()) {
            setStrokeColor(i.a.a(getContext(), i10));
        }
    }

    public void setStrokeWidth(int i10) {
        if (m()) {
            this.f7536a.H(i10);
        }
    }

    public void setStrokeWidthResource(int i10) {
        if (m()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i10));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (m()) {
            this.f7536a.I(colorStateList);
        } else {
            super.setSupportBackgroundTintList(colorStateList);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (m()) {
            this.f7536a.J(mode);
        } else {
            super.setSupportBackgroundTintMode(mode);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i10) {
        super.setTextAlignment(i10);
        r(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z10) {
        this.f7536a.K(z10);
    }

    @Override // android.widget.TextView
    public void setWidth(int i10) {
        this.f7551y = -1.0f;
        super.setWidth(i10);
    }

    void setWidthChangeMax(int i10) {
        if (this.H != i10) {
            this.H = i10;
            n(true);
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f7547u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaterialButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = N;
        super(q9.a.e(context, attributeSet, i10, i11, new int[]{O}), attributeSet, i10);
        this.f7537b = new LinkedHashSet();
        this.f7547u = false;
        this.f7548v = false;
        this.f7550x = -1;
        this.f7551y = -1.0f;
        this.f7552z = -1;
        this.A = -1;
        this.F = -1;
        Context context2 = getContext();
        TypedArray typedArrayI = m.i(context2, attributeSet, u8.l.f28890p2, i10, i11, new int[0]);
        this.f7546t = typedArrayI.getDimensionPixelSize(u8.l.D2, 0);
        this.f7539d = p.h(typedArrayI.getInt(u8.l.G2, -1), PorterDuff.Mode.SRC_IN);
        this.f7540e = j9.c.a(getContext(), typedArrayI, u8.l.F2);
        this.f7541f = j9.c.e(getContext(), typedArrayI, u8.l.B2);
        this.f7549w = typedArrayI.getInteger(u8.l.C2, 1);
        this.f7543h = typedArrayI.getDimensionPixelSize(u8.l.E2, 0);
        q qVarB = q.b(context2, typedArrayI, u8.l.J2);
        l lVarC = qVarB != null ? qVarB.c(true) : l.e(context2, attributeSet, i10, i11).m();
        boolean z10 = typedArrayI.getBoolean(u8.l.H2, false);
        e eVar = new e(this, lVarC);
        this.f7536a = eVar;
        eVar.t(typedArrayI);
        setCheckedInternal(typedArrayI.getBoolean(u8.l.f28908r2, false));
        if (qVarB != null) {
            eVar.z(e());
            eVar.F(qVarB);
        }
        setOpticalCenterEnabled(z10);
        typedArrayI.recycle();
        setCompoundDrawablePadding(this.f7546t);
        q(this.f7541f != null);
    }
}
