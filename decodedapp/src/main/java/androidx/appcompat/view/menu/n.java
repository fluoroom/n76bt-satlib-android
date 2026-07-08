package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface n {

    public interface a {
        void onCloseMenu(h hVar, boolean z10);

        boolean onOpenSubMenu(h hVar);
    }

    boolean collapseItemActionView(h hVar, j jVar);

    boolean expandItemActionView(h hVar, j jVar);

    boolean flagActionItems();

    int getId();

    void initForMenu(Context context, h hVar);

    void onCloseMenu(h hVar, boolean z10);

    void onRestoreInstanceState(Parcelable parcelable);

    Parcelable onSaveInstanceState();

    boolean onSubMenuSelected(s sVar);

    void setCallback(a aVar);

    void updateMenuView(boolean z10);
}
