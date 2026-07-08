package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.o;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.TooltipCompat;
import m0.o0;
import n0.x;

/* JADX INFO: loaded from: classes3.dex */
public class NavigationMenuItemView extends d implements o.a {
    private static final int[] A = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7932g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f7933h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f7934r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f7935s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final CheckedTextView f7936t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private FrameLayout f7937u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private androidx.appcompat.view.menu.j f7938v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ColorStateList f7939w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f7940x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private Drawable f7941y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final m0.a f7942z;

    class a extends m0.a {
        a() {
        }

        @Override // m0.a
        public void g(View view, x xVar) {
            super.g(view, xVar);
            xVar.r0(NavigationMenuItemView.this.f7934r);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void c() {
        if (e()) {
            this.f7936t.setVisibility(8);
            FrameLayout frameLayout = this.f7937u;
            if (frameLayout != null) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) frameLayout.getLayoutParams();
                ((LinearLayout.LayoutParams) layoutParams).width = -1;
                this.f7937u.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        this.f7936t.setVisibility(0);
        FrameLayout frameLayout2 = this.f7937u;
        if (frameLayout2 != null) {
            LinearLayoutCompat.LayoutParams layoutParams2 = (LinearLayoutCompat.LayoutParams) frameLayout2.getLayoutParams();
            ((LinearLayout.LayoutParams) layoutParams2).width = -2;
            this.f7937u.setLayoutParams(layoutParams2);
        }
    }

    private StateListDrawable d() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(h.a.J, typedValue, true)) {
            return null;
        }
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(A, new ColorDrawable(typedValue.data));
        stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
        return stateListDrawable;
    }

    private boolean e() {
        return this.f7938v.getTitle() == null && this.f7938v.getIcon() == null && this.f7938v.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f7937u == null) {
                this.f7937u = (FrameLayout) ((ViewStub) findViewById(u8.f.f28647e)).inflate();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            this.f7937u.removeAllViews();
            this.f7937u.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.o.a
    public androidx.appcompat.view.menu.j getItemData() {
        return this.f7938v;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public void initialize(androidx.appcompat.view.menu.j jVar, int i10) {
        this.f7938v = jVar;
        if (jVar.getItemId() > 0) {
            setId(jVar.getItemId());
        }
        setVisibility(jVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            setBackground(d());
        }
        setCheckable(jVar.isCheckable());
        setChecked(jVar.isChecked());
        setEnabled(jVar.isEnabled());
        setTitle(jVar.getTitle());
        setIcon(jVar.getIcon());
        setActionView(jVar.getActionView());
        setContentDescription(jVar.getContentDescription());
        TooltipCompat.setTooltipText(this, jVar.getTooltipText());
        c();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.j jVar = this.f7938v;
        if (jVar != null && jVar.isCheckable() && this.f7938v.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, A);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // androidx.appcompat.view.menu.o.a
    public boolean prefersCondensedTitle() {
        return false;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f7934r != z10) {
            this.f7934r = z10;
            this.f7942z.l(this.f7936t, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f7936t.setChecked(z10);
        CheckedTextView checkedTextView = this.f7936t;
        checkedTextView.setTypeface(checkedTextView.getTypeface(), (z10 && this.f7935s) ? 1 : 0);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f7940x) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = e0.a.r(drawable).mutate();
                drawable.setTintList(this.f7939w);
            }
            int i10 = this.f7932g;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f7933h) {
            if (this.f7941y == null) {
                Drawable drawableE = c0.k.e(getResources(), u8.e.f28641j, getContext().getTheme());
                this.f7941y = drawableE;
                if (drawableE != null) {
                    int i11 = this.f7932g;
                    drawableE.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f7941y;
        }
        this.f7936t.setCompoundDrawablesRelative(drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f7936t.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f7932g = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f7939w = colorStateList;
        this.f7940x = colorStateList != null;
        androidx.appcompat.view.menu.j jVar = this.f7938v;
        if (jVar != null) {
            setIcon(jVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f7936t.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f7933h = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.j.m(this.f7936t, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f7936t.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f7936t.setText(charSequence);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7935s = true;
        a aVar = new a();
        this.f7942z = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(u8.h.f28677f, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(u8.d.f28603l));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(u8.f.f28648f);
        this.f7936t = checkedTextView;
        o0.n0(checkedTextView, aVar);
    }
}
