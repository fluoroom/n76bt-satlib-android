package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.h;

/* JADX INFO: loaded from: classes.dex */
public class s extends h implements SubMenu {
    private h B;
    private j C;

    public s(Context context, h hVar, j jVar) {
        super(context);
        this.B = hVar;
        this.C = jVar;
    }

    @Override // androidx.appcompat.view.menu.h
    public h F() {
        return this.B.F();
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean I() {
        return this.B.I();
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean J() {
        return this.B.J();
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean K() {
        return this.B.K();
    }

    @Override // androidx.appcompat.view.menu.h
    public void W(h.a aVar) {
        this.B.W(aVar);
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean f(j jVar) {
        return this.B.f(jVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.C;
    }

    @Override // androidx.appcompat.view.menu.h
    boolean h(h hVar, MenuItem menuItem) {
        return super.h(hVar, menuItem) || this.B.h(hVar, menuItem);
    }

    public Menu j0() {
        return this.B;
    }

    @Override // androidx.appcompat.view.menu.h
    public boolean m(j jVar) {
        return this.B.m(jVar);
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.B.setGroupDividerEnabled(z10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.a0(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.d0(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.e0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.B.setQwertyMode(z10);
    }

    @Override // androidx.appcompat.view.menu.h
    public String v() {
        j jVar = this.C;
        int itemId = jVar != null ? jVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.v() + ":" + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i10) {
        return (SubMenu) super.Z(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i10) {
        return (SubMenu) super.c0(i10);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i10) {
        this.C.setIcon(i10);
        return this;
    }
}
