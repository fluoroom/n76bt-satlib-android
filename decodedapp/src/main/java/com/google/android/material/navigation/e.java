package com.google.android.material.navigation;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends androidx.appcompat.view.menu.h {
    private final Class B;
    private final int C;
    private final boolean D;

    public e(Context context, Class cls, int i10, boolean z10) {
        super(context);
        this.B = cls;
        this.C = i10;
        this.D = z10;
    }

    @Override // androidx.appcompat.view.menu.h
    protected MenuItem a(int i10, int i11, int i12, CharSequence charSequence) {
        if (size() + 1 <= this.C) {
            i0();
            MenuItem menuItemA = super.a(i10, i11, i12, charSequence);
            h0();
            return menuItemA;
        }
        String simpleName = this.B.getSimpleName();
        throw new IllegalArgumentException("Maximum number of items supported by " + simpleName + " is " + this.C + ". Limit can be checked with " + simpleName + "#getMaxItemCount()");
    }

    @Override // androidx.appcompat.view.menu.h, android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        if (this.D) {
            androidx.appcompat.view.menu.j jVar = (androidx.appcompat.view.menu.j) a(i10, i11, i12, charSequence);
            j jVar2 = new j(w(), this, jVar);
            jVar.x(jVar2);
            return jVar2;
        }
        throw new UnsupportedOperationException(this.B.getSimpleName() + " does not support submenus");
    }
}
