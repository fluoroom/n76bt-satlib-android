package c6;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ListAdapter;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ListAdapter f4462a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f4463b;

    class a extends DataSetObserver {
        a() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            r.this.a();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            r.this.b();
        }
    }

    public r(ListAdapter listAdapter) {
        this.f4462a = listAdapter;
        this.f4463b = listAdapter instanceof Filterable;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(new a());
        }
    }

    protected abstract void a();

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        ListAdapter listAdapter = this.f4462a;
        if (listAdapter != null) {
            return listAdapter.areAllItemsEnabled();
        }
        return true;
    }

    protected void b() {
        notifyDataSetInvalidated();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ListAdapter listAdapter = this.f4462a;
        if (listAdapter != null) {
            return listAdapter.getCount();
        }
        return 0;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f4463b) {
            return ((Filterable) this.f4462a).getFilter();
        }
        return null;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        ListAdapter listAdapter = this.f4462a;
        if (listAdapter != null) {
            return listAdapter.getItem(i10);
        }
        return null;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        ListAdapter listAdapter = this.f4462a;
        if (listAdapter != null) {
            return listAdapter.getItemId(i10);
        }
        return 0L;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        ListAdapter listAdapter = this.f4462a;
        if (listAdapter != null) {
            return listAdapter.getItemViewType(i10);
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        return this.f4462a.getView(i10, view, viewGroup);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        ListAdapter listAdapter = this.f4462a;
        if (listAdapter != null) {
            return listAdapter.getViewTypeCount();
        }
        return 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        ListAdapter listAdapter = this.f4462a;
        if (listAdapter != null) {
            return listAdapter.hasStableIds();
        }
        return false;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean isEmpty() {
        ListAdapter listAdapter = this.f4462a;
        return listAdapter == null || listAdapter.isEmpty();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        ListAdapter listAdapter = this.f4462a;
        if (listAdapter != null) {
            return listAdapter.isEnabled(i10);
        }
        return false;
    }
}
