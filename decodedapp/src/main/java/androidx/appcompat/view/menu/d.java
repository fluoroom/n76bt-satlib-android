package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Context f1188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private androidx.collection.i f1189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.collection.i f1190c;

    d(Context context) {
        this.f1188a = context;
    }

    final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof f0.b)) {
            return menuItem;
        }
        f0.b bVar = (f0.b) menuItem;
        if (this.f1189b == null) {
            this.f1189b = new androidx.collection.i();
        }
        MenuItem menuItem2 = (MenuItem) this.f1189b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        k kVar = new k(this.f1188a, bVar);
        this.f1189b.put(bVar, kVar);
        return kVar;
    }

    final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    final void e() {
        androidx.collection.i iVar = this.f1189b;
        if (iVar != null) {
            iVar.clear();
        }
        androidx.collection.i iVar2 = this.f1190c;
        if (iVar2 != null) {
            iVar2.clear();
        }
    }

    final void f(int i10) {
        if (this.f1189b == null) {
            return;
        }
        int i11 = 0;
        while (i11 < this.f1189b.size()) {
            if (((f0.b) this.f1189b.f(i11)).getGroupId() == i10) {
                this.f1189b.h(i11);
                i11--;
            }
            i11++;
        }
    }

    final void g(int i10) {
        if (this.f1189b == null) {
            return;
        }
        for (int i11 = 0; i11 < this.f1189b.size(); i11++) {
            if (((f0.b) this.f1189b.f(i11)).getItemId() == i10) {
                this.f1189b.h(i11);
                return;
            }
        }
    }
}
