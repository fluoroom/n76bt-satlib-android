package u3;

import android.database.DataSetObserver;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import com.dw.android.widget.TowLineTextView;

/* JADX INFO: loaded from: classes.dex */
class d implements ListAdapter {
    d() {
    }

    @Override // android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return true;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return 24;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return String.valueOf(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public int getItemViewType(int i10) {
        return 0;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TowLineTextView towLineTextView;
        if (view == null) {
            towLineTextView = new TowLineTextView(viewGroup.getContext());
            int iB = a6.k.b(viewGroup.getContext(), 3.0f);
            towLineTextView.setPadding(iB, iB, iB, iB);
        } else {
            towLineTextView = (TowLineTextView) view;
        }
        towLineTextView.setTitle(String.format("Item %d", Integer.valueOf(i10)));
        towLineTextView.setSummary(String.format("Sub Item %d", Integer.valueOf(i10)));
        return towLineTextView;
    }

    @Override // android.widget.Adapter
    public int getViewTypeCount() {
        return 1;
    }

    @Override // android.widget.Adapter
    public boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.Adapter
    public boolean isEmpty() {
        return false;
    }

    @Override // android.widget.ListAdapter
    public boolean isEnabled(int i10) {
        return true;
    }

    @Override // android.widget.Adapter
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.widget.Adapter
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
