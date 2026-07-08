package com.google.android.material.navigation;

import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.n;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.appcompat.view.menu.h f8089a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f8091c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f8092d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f8093e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f8090b = new ArrayList();

    f(androidx.appcompat.view.menu.h hVar) {
        this.f8089a = hVar;
        f();
    }

    public int a() {
        return this.f8091c;
    }

    public MenuItem b(int i10) {
        return (MenuItem) this.f8090b.get(i10);
    }

    public int c() {
        return this.f8092d;
    }

    public int d() {
        return this.f8093e;
    }

    public boolean e(MenuItem menuItem, n nVar, int i10) {
        return this.f8089a.P(menuItem, nVar, i10);
    }

    public void f() {
        this.f8090b.clear();
        this.f8091c = 0;
        this.f8092d = 0;
        this.f8093e = 0;
        for (int i10 = 0; i10 < this.f8089a.size(); i10++) {
            MenuItem item = this.f8089a.getItem(i10);
            if (item.hasSubMenu()) {
                if (!this.f8090b.isEmpty()) {
                    if (!(this.f8090b.get(r3.size() - 1) instanceof a) && item.isVisible()) {
                        this.f8090b.add(new a());
                    }
                }
                this.f8090b.add(item);
                SubMenu subMenu = item.getSubMenu();
                for (int i11 = 0; i11 < subMenu.size(); i11++) {
                    MenuItem item2 = subMenu.getItem(i11);
                    if (!item.isVisible()) {
                        item2.setVisible(false);
                    }
                    this.f8090b.add(item2);
                    this.f8091c++;
                    if (item2.isVisible()) {
                        this.f8092d++;
                    }
                }
                this.f8090b.add(new a());
            } else {
                this.f8090b.add(item);
                this.f8091c++;
                if (item.isVisible()) {
                    this.f8092d++;
                    this.f8093e++;
                }
            }
        }
        if (this.f8090b.isEmpty()) {
            return;
        }
        if (this.f8090b.get(r0.size() - 1) instanceof a) {
            this.f8090b.remove(r0.size() - 1);
        }
    }

    public int g() {
        return this.f8090b.size();
    }
}
