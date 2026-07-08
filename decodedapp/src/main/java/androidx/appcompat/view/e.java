package androidx.appcompat.view;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.b;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements h.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f1094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ActionBarContextView f1095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b.a f1096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private WeakReference f1097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f1098e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f1099f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private androidx.appcompat.view.menu.h f1100g;

    public e(Context context, ActionBarContextView actionBarContextView, b.a aVar, boolean z10) {
        this.f1094a = context;
        this.f1095b = actionBarContextView;
        this.f1096c = aVar;
        androidx.appcompat.view.menu.h hVarX = new androidx.appcompat.view.menu.h(actionBarContextView.getContext()).X(1);
        this.f1100g = hVarX;
        hVarX.W(this);
        this.f1099f = z10;
    }

    @Override // androidx.appcompat.view.b
    public void finish() {
        if (this.f1098e) {
            return;
        }
        this.f1098e = true;
        this.f1096c.a(this);
    }

    @Override // androidx.appcompat.view.b
    public View getCustomView() {
        WeakReference weakReference = this.f1097d;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // androidx.appcompat.view.b
    public Menu getMenu() {
        return this.f1100g;
    }

    @Override // androidx.appcompat.view.b
    public MenuInflater getMenuInflater() {
        return new g(this.f1095b.getContext());
    }

    @Override // androidx.appcompat.view.b
    public CharSequence getSubtitle() {
        return this.f1095b.getSubtitle();
    }

    @Override // androidx.appcompat.view.b
    public CharSequence getTitle() {
        return this.f1095b.getTitle();
    }

    @Override // androidx.appcompat.view.b
    public void invalidate() {
        this.f1096c.c(this, this.f1100g);
    }

    @Override // androidx.appcompat.view.b
    public boolean isTitleOptional() {
        return this.f1095b.isTitleOptional();
    }

    @Override // androidx.appcompat.view.b
    public boolean isUiFocusable() {
        return this.f1099f;
    }

    @Override // androidx.appcompat.view.menu.h.a
    public boolean onMenuItemSelected(androidx.appcompat.view.menu.h hVar, MenuItem menuItem) {
        return this.f1096c.d(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.h.a
    public void onMenuModeChange(androidx.appcompat.view.menu.h hVar) {
        invalidate();
        this.f1095b.showOverflowMenu();
    }

    @Override // androidx.appcompat.view.b
    public void setCustomView(View view) {
        this.f1095b.setCustomView(view);
        this.f1097d = view != null ? new WeakReference(view) : null;
    }

    @Override // androidx.appcompat.view.b
    public void setSubtitle(CharSequence charSequence) {
        this.f1095b.setSubtitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void setTitle(CharSequence charSequence) {
        this.f1095b.setTitle(charSequence);
    }

    @Override // androidx.appcompat.view.b
    public void setTitleOptionalHint(boolean z10) {
        super.setTitleOptionalHint(z10);
        this.f1095b.setTitleOptional(z10);
    }

    @Override // androidx.appcompat.view.b
    public void setSubtitle(int i10) {
        setSubtitle(this.f1094a.getString(i10));
    }

    @Override // androidx.appcompat.view.b
    public void setTitle(int i10) {
        setTitle(this.f1094a.getString(i10));
    }
}
