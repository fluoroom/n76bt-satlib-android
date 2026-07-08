package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public abstract class l implements q, n, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Rect f1302a;

    l() {
    }

    protected static int d(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i10) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        View view = null;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < count; i13++) {
            int itemViewType = listAdapter.getItemViewType(i13);
            if (itemViewType != i12) {
                view = null;
                i12 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i13, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i10) {
                return i10;
            }
            if (measuredWidth > i11) {
                i11 = measuredWidth;
            }
        }
        return i11;
    }

    protected static boolean m(h hVar) {
        int size = hVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = hVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static g n(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (g) listAdapter;
    }

    public abstract void a(h hVar);

    protected boolean b() {
        return true;
    }

    public Rect c() {
        return this.f1302a;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean collapseItemActionView(h hVar, j jVar) {
        return false;
    }

    public abstract void e(View view);

    @Override // androidx.appcompat.view.menu.n
    public boolean expandItemActionView(h hVar, j jVar) {
        return false;
    }

    public void f(Rect rect) {
        this.f1302a = rect;
    }

    public abstract void g(boolean z10);

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return 0;
    }

    public abstract void h(int i10);

    public abstract void i(int i10);

    @Override // androidx.appcompat.view.menu.n
    public void initForMenu(Context context, h hVar) {
    }

    public abstract void j(PopupWindow.OnDismissListener onDismissListener);

    public abstract void k(boolean z10);

    public abstract void l(int i10);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        n(listAdapter).f1229a.P((MenuItem) listAdapter.getItem(i10), this, b() ? 0 : 4);
    }
}
