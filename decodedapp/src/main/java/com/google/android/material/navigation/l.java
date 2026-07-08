package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l extends FrameLayout {

    /* JADX INFO: renamed from: a */
    private final e f8132a;

    /* JADX INFO: renamed from: b */
    private final h f8133b;

    /* JADX INFO: renamed from: c */
    private final i f8134c;

    /* JADX INFO: renamed from: d */
    private MenuInflater f8135d;

    /* JADX INFO: renamed from: e */
    private c f8136e;

    class a implements h.a {
        a() {
        }

        @Override // androidx.appcompat.view.menu.h.a
        public boolean onMenuItemSelected(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
            l.a(l.this);
            return (l.this.f8136e == null || l.this.f8136e.a(menuItem)) ? false : true;
        }

        @Override // androidx.appcompat.view.menu.h.a
        public void onMenuModeChange(androidx.appcompat.view.menu.h hVar) {
        }
    }

    public interface b {
    }

    public interface c {
        boolean a(MenuItem menuItem);
    }

    static class d extends q0.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* JADX INFO: renamed from: a */
        Bundle f8138a;

        class a implements Parcelable.ClassLoaderCreator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b */
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        private void b(Parcel parcel, ClassLoader classLoader) {
            this.f8138a = parcel.readBundle(classLoader);
        }

        @Override // q0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f8138a);
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            b(parcel, classLoader == null ? getClass().getClassLoader() : classLoader);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public l(android.content.Context r11, android.util.AttributeSet r12, int r13, int r14) {
        /*
            Method dump skipped, instruction units count: 647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.l.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    static /* synthetic */ b a(l lVar) {
        lVar.getClass();
        return null;
    }

    private MenuInflater getMenuInflater() {
        if (this.f8135d == null) {
            this.f8135d = new androidx.appcompat.view.g(getContext());
        }
        return this.f8135d;
    }

    private void setMeasureBottomPaddingFromLabelBaseline(boolean z10) {
        this.f8133b.setMeasurePaddingFromLabelBaseline(z10);
    }

    protected abstract h c(Context context);

    public void d(int i10) {
        this.f8134c.c(true);
        getMenuInflater().inflate(i10, this.f8132a);
        this.f8134c.c(false);
        this.f8134c.updateMenuView(true);
    }

    protected boolean e() {
        return false;
    }

    public void f(int i10, int i11, int i12, int i13) {
        this.f8133b.n(i10, i11, i12, i13);
    }

    public boolean g() {
        return false;
    }

    public int getActiveIndicatorLabelPadding() {
        return this.f8133b.getActiveIndicatorLabelPadding();
    }

    public int getCollapsedMaxItemCount() {
        return getMaxItemCount();
    }

    public int getHorizontalItemTextAppearanceActive() {
        return this.f8133b.getHorizontalItemTextAppearanceActive();
    }

    public int getHorizontalItemTextAppearanceInactive() {
        return this.f8133b.getHorizontalItemTextAppearanceInactive();
    }

    public int getIconLabelHorizontalSpacing() {
        return this.f8133b.getIconLabelHorizontalSpacing();
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.f8133b.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorExpandedHeight() {
        return this.f8133b.getItemActiveIndicatorExpandedHeight();
    }

    public int getItemActiveIndicatorExpandedMarginHorizontal() {
        return this.f8133b.getItemActiveIndicatorExpandedMarginHorizontal();
    }

    public int getItemActiveIndicatorExpandedWidth() {
        return this.f8133b.getItemActiveIndicatorExpandedWidth();
    }

    public int getItemActiveIndicatorHeight() {
        return this.f8133b.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.f8133b.getItemActiveIndicatorMarginHorizontal();
    }

    public m9.l getItemActiveIndicatorShapeAppearance() {
        return this.f8133b.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.f8133b.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.f8133b.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f8133b.getItemBackgroundRes();
    }

    public int getItemGravity() {
        return this.f8133b.getItemGravity();
    }

    public int getItemIconGravity() {
        return this.f8133b.getItemIconGravity();
    }

    public int getItemIconSize() {
        return this.f8133b.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f8133b.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.f8133b.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.f8133b.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.f8133b.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.f8133b.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f8133b.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f8133b.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f8133b.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    public Menu getMenu() {
        return this.f8132a;
    }

    public o getMenuView() {
        return this.f8133b;
    }

    public ViewGroup getMenuViewGroup() {
        return this.f8133b;
    }

    public i getPresenter() {
        return this.f8134c;
    }

    public boolean getScaleLabelTextWithFont() {
        return this.f8133b.getScaleLabelTextWithFont();
    }

    public int getSelectedItemId() {
        return this.f8133b.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        m9.i.e(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.getSuperState());
        this.f8132a.T(dVar.f8138a);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f8138a = bundle;
        this.f8132a.V(bundle);
        return dVar;
    }

    public void setActiveIndicatorLabelPadding(int i10) {
        this.f8133b.setActiveIndicatorLabelPadding(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        m9.i.d(this, f10);
    }

    public void setHorizontalItemTextAppearanceActive(int i10) {
        this.f8133b.setHorizontalItemTextAppearanceActive(i10);
    }

    public void setHorizontalItemTextAppearanceInactive(int i10) {
        this.f8133b.setHorizontalItemTextAppearanceInactive(i10);
    }

    public void setIconLabelHorizontalSpacing(int i10) {
        this.f8133b.setIconLabelHorizontalSpacing(i10);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.f8133b.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z10) {
        this.f8133b.setItemActiveIndicatorEnabled(z10);
    }

    public void setItemActiveIndicatorExpandedHeight(int i10) {
        this.f8133b.setItemActiveIndicatorExpandedHeight(i10);
    }

    public void setItemActiveIndicatorExpandedMarginHorizontal(int i10) {
        this.f8133b.setItemActiveIndicatorExpandedMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorExpandedWidth(int i10) {
        this.f8133b.setItemActiveIndicatorExpandedWidth(i10);
    }

    public void setItemActiveIndicatorHeight(int i10) {
        this.f8133b.setItemActiveIndicatorHeight(i10);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i10) {
        this.f8133b.setItemActiveIndicatorMarginHorizontal(i10);
    }

    public void setItemActiveIndicatorShapeAppearance(m9.l lVar) {
        this.f8133b.setItemActiveIndicatorShapeAppearance(lVar);
    }

    public void setItemActiveIndicatorWidth(int i10) {
        this.f8133b.setItemActiveIndicatorWidth(i10);
    }

    public void setItemBackground(Drawable drawable) {
        this.f8133b.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i10) {
        this.f8133b.setItemBackgroundRes(i10);
    }

    public void setItemGravity(int i10) {
        if (this.f8133b.getItemGravity() != i10) {
            this.f8133b.setItemGravity(i10);
            this.f8134c.updateMenuView(false);
        }
    }

    public void setItemIconGravity(int i10) {
        if (this.f8133b.getItemIconGravity() != i10) {
            this.f8133b.setItemIconGravity(i10);
            this.f8134c.updateMenuView(false);
        }
    }

    public void setItemIconSize(int i10) {
        this.f8133b.setItemIconSize(i10);
    }

    public void setItemIconSizeRes(int i10) {
        setItemIconSize(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f8133b.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i10) {
        this.f8133b.setItemPaddingBottom(i10);
    }

    public void setItemPaddingTop(int i10) {
        this.f8133b.setItemPaddingTop(i10);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.f8133b.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i10) {
        this.f8133b.setItemTextAppearanceActive(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f8133b.setItemTextAppearanceActiveBoldEnabled(z10);
    }

    public void setItemTextAppearanceInactive(int i10) {
        this.f8133b.setItemTextAppearanceInactive(i10);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f8133b.setItemTextColor(colorStateList);
    }

    public void setLabelFontScalingEnabled(boolean z10) {
        this.f8133b.setLabelFontScalingEnabled(z10);
    }

    public void setLabelMaxLines(int i10) {
        this.f8133b.setLabelMaxLines(i10);
    }

    public void setLabelVisibilityMode(int i10) {
        if (this.f8133b.getLabelVisibilityMode() != i10) {
            this.f8133b.setLabelVisibilityMode(i10);
            this.f8134c.updateMenuView(false);
        }
    }

    public void setOnItemReselectedListener(b bVar) {
    }

    public void setOnItemSelectedListener(c cVar) {
        this.f8136e = cVar;
    }

    public void setSelectedItemId(int i10) {
        MenuItem menuItemFindItem = this.f8132a.findItem(i10);
        if (menuItemFindItem != null) {
            boolean zP = this.f8132a.P(menuItemFindItem, this.f8134c, 0);
            if (menuItemFindItem.isCheckable()) {
                if (!zP || menuItemFindItem.isChecked()) {
                    this.f8133b.setCheckedItem(menuItemFindItem);
                }
            }
        }
    }
}
