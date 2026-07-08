package com.google.android.material.floatingactionbutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.AppCompatImageHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.floatingactionbutton.c;
import com.google.android.material.internal.m;
import com.google.android.material.internal.p;
import com.google.android.material.internal.q;
import java.util.List;
import l0.g;
import m0.o0;
import m9.l;
import m9.o;
import u8.d;
import u8.k;
import v8.f;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingActionButton extends q implements f9.a, o, CoordinatorLayout.b {
    private static final int A = k.f28732h;

    /* JADX INFO: renamed from: b */
    private ColorStateList f7841b;

    /* JADX INFO: renamed from: c */
    private PorterDuff.Mode f7842c;

    /* JADX INFO: renamed from: d */
    private ColorStateList f7843d;

    /* JADX INFO: renamed from: e */
    private PorterDuff.Mode f7844e;

    /* JADX INFO: renamed from: f */
    private ColorStateList f7845f;

    /* JADX INFO: renamed from: g */
    private int f7846g;

    /* JADX INFO: renamed from: h */
    private int f7847h;

    /* JADX INFO: renamed from: r */
    private int f7848r;

    /* JADX INFO: renamed from: s */
    private int f7849s;

    /* JADX INFO: renamed from: t */
    private int f7850t;

    /* JADX INFO: renamed from: u */
    boolean f7851u;

    /* JADX INFO: renamed from: v */
    final Rect f7852v;

    /* JADX INFO: renamed from: w */
    private final Rect f7853w;

    /* JADX INFO: renamed from: x */
    private final AppCompatImageHelper f7854x;

    /* JADX INFO: renamed from: y */
    private final f9.b f7855y;

    /* JADX INFO: renamed from: z */
    private c f7856z;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: E */
        public /* bridge */ /* synthetic */ boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            return super.b(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: I */
        public /* bridge */ /* synthetic */ boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            return super.h(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: J */
        public /* bridge */ /* synthetic */ boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            return super.l(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void g(CoordinatorLayout.f fVar) {
            super.g(fVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static abstract class a {
    }

    private class b implements l9.b {
        b() {
        }

        @Override // l9.b
        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f7852v.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f7849s, i11 + FloatingActionButton.this.f7849s, i12 + FloatingActionButton.this.f7849s, i13 + FloatingActionButton.this.f7849s);
        }

        @Override // l9.b
        public boolean b() {
            return FloatingActionButton.this.f7851u;
        }

        @Override // l9.b
        public void setBackgroundDrawable(Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, u8.b.f28557m);
    }

    private int f(int i10) {
        int i11 = this.f7848r;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        return i10 != -1 ? i10 != 1 ? resources.getDimensionPixelSize(d.f28601k) : resources.getDimensionPixelSize(d.f28599j) : Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < 470 ? f(1) : f(0);
    }

    private void g(Rect rect) {
        e(rect);
        int i10 = -this.f7856z.u();
        rect.inset(i10, i10);
    }

    private c getImpl() {
        if (this.f7856z == null) {
            this.f7856z = new c(this, new b());
        }
        return this.f7856z;
    }

    private void k(Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f7852v;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void l() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f7843d;
        if (colorStateList == null) {
            e0.a.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f7844e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(colorForState, mode));
    }

    private c.g p(a aVar) {
        return null;
    }

    @Override // f9.a
    public boolean a() {
        return this.f7855y.c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        if (Build.VERSION.SDK_INT == 21) {
            getImpl().D();
        }
    }

    public void e(Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        k(rect);
    }

    @Override // android.widget.ImageButton, android.widget.ImageView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return "com.google.android.material.floatingactionbutton.FloatingActionButton";
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return this.f7841b;
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f7842c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    public CoordinatorLayout.c getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().m();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().p();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().r();
    }

    public Drawable getContentBackground() {
        return getImpl().l();
    }

    public int getCustomSize() {
        return this.f7848r;
    }

    public int getExpandedComponentIdHint() {
        return this.f7855y.b();
    }

    public f getHideMotionSpec() {
        return getImpl().o();
    }

    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f7845f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    public ColorStateList getRippleColorStateList() {
        return this.f7845f;
    }

    public l getShapeAppearanceModel() {
        return (l) g.g(getImpl().s());
    }

    public f getShowMotionSpec() {
        return getImpl().t();
    }

    public int getSize() {
        return this.f7847h;
    }

    int getSizeDimension() {
        return f(this.f7847h);
    }

    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    public ColorStateList getSupportImageTintList() {
        return this.f7843d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f7844e;
    }

    public boolean getUseCompatPadding() {
        return this.f7851u;
    }

    public void h() {
        i(null);
    }

    public void i(a aVar) {
        j(aVar, true);
    }

    void j(a aVar, boolean z10) {
        getImpl().v(p(aVar), z10);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
    }

    public void m() {
        n(null);
    }

    public void n(a aVar) {
        o(aVar, true);
    }

    void o(a aVar, boolean z10) {
        getImpl().Y(p(aVar), z10);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().A();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().C();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f7849s = (sizeDimension - this.f7850t) / 2;
        getImpl().a0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f7852v;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof o9.a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        o9.a aVar = (o9.a) parcelable;
        super.onRestoreInstanceState(aVar.getSuperState());
        this.f7855y.d((Bundle) g.g((Bundle) aVar.f23333a.get("expandableWidgetHelper")));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        o9.a aVar = new o9.a(parcelableOnSaveInstanceState);
        aVar.f23333a.put("expandableWidgetHelper", this.f7855y.e());
        return aVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            g(this.f7853w);
            if (!this.f7853w.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        Log.i("FloatingActionButton", "Setting a custom background is not supported.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        if (this.f7841b != colorStateList) {
            this.f7841b = colorStateList;
            getImpl().I(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        if (this.f7842c != mode) {
            this.f7842c = mode;
            getImpl().J(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().K(f10);
    }

    public void setCompatElevationResource(int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().N(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().R(f10);
    }

    public void setCompatPressedTranslationZResource(int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f7848r) {
            this.f7848r = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().b0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().n()) {
            getImpl().L(z10);
            requestLayout();
        }
    }

    public void setExpandedComponentIdHint(int i10) {
        this.f7855y.f(i10);
    }

    public void setHideMotionSpec(f fVar) {
        getImpl().M(fVar);
    }

    public void setHideMotionSpecResource(int i10) {
        setHideMotionSpec(f.c(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().Z();
            if (this.f7843d != null) {
                l();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        this.f7854x.setImageResource(i10);
        l();
    }

    public void setMaxImageSize(int i10) {
        this.f7850t = i10;
        getImpl().P(i10);
    }

    public void setRippleColor(int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().G();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().G();
    }

    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().T(z10);
    }

    @Override // m9.o
    public void setShapeAppearanceModel(l lVar) {
        getImpl().U(lVar);
    }

    public void setShowMotionSpec(f fVar) {
        getImpl().V(fVar);
    }

    public void setShowMotionSpecResource(int i10) {
        setShowMotionSpec(f.c(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f7848r = 0;
        if (i10 != this.f7847h) {
            this.f7847h = i10;
            requestLayout();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        if (this.f7843d != colorStateList) {
            this.f7843d = colorStateList;
            l();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        if (this.f7844e != mode) {
            this.f7844e = mode;
            l();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().H();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().H();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().H();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f7851u != z10) {
            this.f7851u = z10;
            getImpl().B();
        }
    }

    @Override // com.google.android.material.internal.q, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c {

        /* JADX INFO: renamed from: a */
        private Rect f7857a;

        /* JADX INFO: renamed from: b */
        private boolean f7858b;

        public BaseBehavior() {
            this.f7858b = true;
        }

        private boolean F(View view, FloatingActionButton floatingActionButton) {
            return (this.f7858b && ((CoordinatorLayout.f) floatingActionButton.getLayoutParams()).e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) ? false : true;
        }

        private static boolean G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f) {
                return ((CoordinatorLayout.f) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void H(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton) {
            Rect rect = floatingActionButton.f7852v;
            if (rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.f fVar = (CoordinatorLayout.f) floatingActionButton.getLayoutParams();
            int i10 = 0;
            int i11 = floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) fVar).rightMargin ? rect.right : floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) fVar).leftMargin ? -rect.left : 0;
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin) {
                i10 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) fVar).topMargin) {
                i10 = -rect.top;
            }
            if (i10 != 0) {
                o0.X(floatingActionButton, i10);
            }
            if (i11 != 0) {
                o0.W(floatingActionButton, i11);
            }
        }

        private boolean K(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, FloatingActionButton floatingActionButton) {
            if (F(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f7857a == null) {
                this.f7857a = new Rect();
            }
            Rect rect = this.f7857a;
            com.google.android.material.internal.b.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.j(null, false);
                return true;
            }
            floatingActionButton.o(null, false);
            return true;
        }

        private boolean L(View view, FloatingActionButton floatingActionButton) {
            if (F(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.j(null, false);
                return true;
            }
            floatingActionButton.o(null, false);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: E */
        public boolean b(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, Rect rect) {
            Rect rect2 = floatingActionButton.f7852v;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: I */
        public boolean h(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                K(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!G(view)) {
                return false;
            }
            L(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: J */
        public boolean l(CoordinatorLayout coordinatorLayout, FloatingActionButton floatingActionButton, int i10) {
            List listL = coordinatorLayout.l(floatingActionButton);
            int size = listL.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = (View) listL.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (G(view) && L(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (K(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.C(floatingActionButton, i10);
            H(coordinatorLayout, floatingActionButton);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void g(CoordinatorLayout.f fVar) {
            if (fVar.f1879h == 0) {
                fVar.f1879h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u8.l.U1);
            this.f7858b = typedArrayObtainStyledAttributes.getBoolean(u8.l.V1, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(Context context, AttributeSet attributeSet, int i10) {
        int i11 = A;
        super(q9.a.d(context, attributeSet, i10, i11), attributeSet, i10);
        this.f7852v = new Rect();
        this.f7853w = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayI = m.i(context2, attributeSet, u8.l.E1, i10, i11, new int[0]);
        this.f7841b = j9.c.a(context2, typedArrayI, u8.l.G1);
        this.f7842c = p.h(typedArrayI.getInt(u8.l.H1, -1), null);
        this.f7845f = j9.c.a(context2, typedArrayI, u8.l.R1);
        this.f7847h = typedArrayI.getInt(u8.l.M1, -1);
        this.f7848r = typedArrayI.getDimensionPixelSize(u8.l.L1, 0);
        this.f7846g = typedArrayI.getDimensionPixelSize(u8.l.I1, 0);
        float dimension = typedArrayI.getDimension(u8.l.J1, 0.0f);
        float dimension2 = typedArrayI.getDimension(u8.l.O1, 0.0f);
        float dimension3 = typedArrayI.getDimension(u8.l.Q1, 0.0f);
        this.f7851u = typedArrayI.getBoolean(u8.l.T1, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(d.f28610o0);
        setMaxImageSize(typedArrayI.getDimensionPixelSize(u8.l.P1, 0));
        f fVarB = f.b(context2, typedArrayI, u8.l.S1);
        f fVarB2 = f.b(context2, typedArrayI, u8.l.N1);
        l lVarM = l.g(context2, attributeSet, i10, i11, l.f21855m).m();
        boolean z10 = typedArrayI.getBoolean(u8.l.K1, false);
        setEnabled(typedArrayI.getBoolean(u8.l.F1, true));
        typedArrayI.recycle();
        AppCompatImageHelper appCompatImageHelper = new AppCompatImageHelper(this);
        this.f7854x = appCompatImageHelper;
        appCompatImageHelper.loadFromAttributes(attributeSet, i10);
        this.f7855y = new f9.b(this);
        getImpl().U(lVarM);
        getImpl().x(this.f7841b, this.f7842c, this.f7845f, this.f7846g);
        getImpl().Q(dimensionPixelSize);
        getImpl().K(dimension);
        getImpl().N(dimension2);
        getImpl().R(dimension3);
        getImpl().V(fVarB);
        getImpl().M(fVarB2);
        getImpl().L(z10);
        setScaleType(ImageView.ScaleType.MATRIX);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (this.f7845f != colorStateList) {
            this.f7845f = colorStateList;
            getImpl().S(this.f7845f);
        }
    }
}
