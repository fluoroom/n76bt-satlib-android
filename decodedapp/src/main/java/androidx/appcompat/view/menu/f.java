package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f implements n, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f1217a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LayoutInflater f1218b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    h f1219c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ExpandedMenuView f1220d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f1221e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f1222f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int f1223g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private n.a f1224h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    a f1225r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f1226s;

    private class a extends BaseAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f1227a = -1;

        public a() {
            a();
        }

        void a() {
            j jVarX = f.this.f1219c.x();
            if (jVarX != null) {
                ArrayList arrayListB = f.this.f1219c.B();
                int size = arrayListB.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((j) arrayListB.get(i10)) == jVarX) {
                        this.f1227a = i10;
                        return;
                    }
                }
            }
            this.f1227a = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j getItem(int i10) {
            ArrayList arrayListB = f.this.f1219c.B();
            int i11 = i10 + f.this.f1221e;
            int i12 = this.f1227a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (j) arrayListB.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = f.this.f1219c.B().size() - f.this.f1221e;
            return this.f1227a < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                f fVar = f.this;
                view = fVar.f1218b.inflate(fVar.f1223g, viewGroup, false);
            }
            ((o.a) view).initialize(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public f(Context context, int i10) {
        this(i10, 0);
        this.f1217a = context;
        this.f1218b = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f1225r == null) {
            this.f1225r = new a();
        }
        return this.f1225r;
    }

    public o b(ViewGroup viewGroup) {
        if (this.f1220d == null) {
            this.f1220d = (ExpandedMenuView) this.f1218b.inflate(h.g.f14874i, viewGroup, false);
            if (this.f1225r == null) {
                this.f1225r = new a();
            }
            this.f1220d.setAdapter((ListAdapter) this.f1225r);
            this.f1220d.setOnItemClickListener(this);
        }
        return this.f1220d;
    }

    public void c(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1220d.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean collapseItemActionView(h hVar, j jVar) {
        return false;
    }

    public void d(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1220d;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean expandItemActionView(h hVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f1226s;
    }

    @Override // androidx.appcompat.view.menu.n
    public void initForMenu(Context context, h hVar) {
        if (this.f1222f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1222f);
            this.f1217a = contextThemeWrapper;
            this.f1218b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1217a != null) {
            this.f1217a = context;
            if (this.f1218b == null) {
                this.f1218b = LayoutInflater.from(context);
            }
        }
        this.f1219c = hVar;
        a aVar = this.f1225r;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(h hVar, boolean z10) {
        n.a aVar = this.f1224h;
        if (aVar != null) {
            aVar.onCloseMenu(hVar, z10);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f1219c.P(this.f1225r.getItem(i10), this, 0);
    }

    @Override // androidx.appcompat.view.menu.n
    public void onRestoreInstanceState(Parcelable parcelable) {
        c((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable onSaveInstanceState() {
        if (this.f1220d == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        d(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean onSubMenuSelected(s sVar) {
        if (!sVar.hasVisibleItems()) {
            return false;
        }
        new i(sVar).b(null);
        n.a aVar = this.f1224h;
        if (aVar == null) {
            return true;
        }
        aVar.onOpenSubMenu(sVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public void setCallback(n.a aVar) {
        this.f1224h = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z10) {
        a aVar = this.f1225r;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public f(int i10, int i11) {
        this.f1223g = i10;
        this.f1222f = i11;
    }
}
