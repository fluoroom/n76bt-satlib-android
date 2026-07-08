package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import m0.o0;

/* JADX INFO: loaded from: classes.dex */
public class CActionBarContextView extends ActionBarContextView {
    boolean initForModeSuper;

    public CActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (this.initForModeSuper && this.mMenuView == view) {
            return;
        }
        super.addView(view, layoutParams);
    }

    @Override // androidx.appcompat.widget.ActionBarContextView
    public void initForMode(final androidx.appcompat.view.b bVar) {
        this.initForModeSuper = true;
        super.initForMode(new androidx.appcompat.view.b() { // from class: androidx.appcompat.widget.CActionBarContextView.1
            @Override // androidx.appcompat.view.b
            public void finish() {
                bVar.finish();
            }

            @Override // androidx.appcompat.view.b
            public View getCustomView() {
                return null;
            }

            @Override // androidx.appcompat.view.b
            public Menu getMenu() {
                return new androidx.appcompat.view.menu.h(CActionBarContextView.this.getContext());
            }

            @Override // androidx.appcompat.view.b
            public MenuInflater getMenuInflater() {
                return null;
            }

            @Override // androidx.appcompat.view.b
            public CharSequence getSubtitle() {
                return null;
            }

            @Override // androidx.appcompat.view.b
            public CharSequence getTitle() {
                return null;
            }

            @Override // androidx.appcompat.view.b
            public void invalidate() {
            }

            @Override // androidx.appcompat.view.b
            public void setCustomView(View view) {
            }

            @Override // androidx.appcompat.view.b
            public void setSubtitle(int i10) {
            }

            @Override // androidx.appcompat.view.b
            public void setTitle(int i10) {
            }

            @Override // androidx.appcompat.view.b
            public void setSubtitle(CharSequence charSequence) {
            }

            @Override // androidx.appcompat.view.b
            public void setTitle(CharSequence charSequence) {
            }
        });
        this.initForModeSuper = false;
        androidx.appcompat.view.menu.h hVar = (androidx.appcompat.view.menu.h) bVar.getMenu();
        ActionMenuPresenter actionMenuPresenter = this.mActionMenuPresenter;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.dismissPopupMenus();
        }
        CActionMenuPresenter cActionMenuPresenter = new CActionMenuPresenter(getContext());
        this.mActionMenuPresenter = cActionMenuPresenter;
        cActionMenuPresenter.setReserveOverflow(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        hVar.c(this.mActionMenuPresenter, this.mPopupContext);
        ActionMenuView actionMenuView = (ActionMenuView) this.mActionMenuPresenter.getMenuView(this);
        this.mMenuView = actionMenuView;
        o0.q0(actionMenuView, null);
        addView(this.mMenuView, layoutParams);
    }

    public CActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, k3.b.f19153a);
    }

    public CActionBarContextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
