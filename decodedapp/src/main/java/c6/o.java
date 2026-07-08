package c6;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class o extends r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final ArrayList f4458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4460e;

    public o(ListAdapter listAdapter) {
        super(listAdapter);
        this.f4459d = -1;
        this.f4460e = true;
        int count = listAdapter == null ? 0 : listAdapter.getCount();
        this.f4458c = new ArrayList(count);
        for (int i10 = 0; i10 < count; i10++) {
            this.f4458c.add(Integer.valueOf(i10));
        }
    }

    @Override // c6.r
    protected void a() {
        int count = getCount();
        int size = this.f4458c.size();
        if (size < count) {
            while (count > size) {
                this.f4458c.add(Integer.valueOf(size));
                size++;
            }
        } else if (size > count) {
            for (int i10 = 0; i10 < size; i10++) {
                while (((Integer) this.f4458c.get(i10)).intValue() >= count) {
                    this.f4458c.remove(i10);
                    size--;
                    if (i10 >= size) {
                        break;
                    }
                }
            }
        }
        if (this.f4460e) {
            notifyDataSetChanged();
        }
    }

    public void c(int i10, int i11, int i12) {
        if (i10 == i11) {
            return;
        }
        if (i12 == 1) {
            Integer num = (Integer) this.f4458c.get(i10);
            num.intValue();
            ArrayList arrayList = this.f4458c;
            arrayList.set(i10, (Integer) arrayList.get(i11));
            this.f4458c.set(i11, num);
        } else {
            Integer num2 = (Integer) this.f4458c.remove(i10);
            num2.intValue();
            this.f4458c.add(i11, num2);
        }
        if (this.f4460e) {
            notifyDataSetChanged();
        }
    }

    public void d(int i10) {
        if (this.f4459d == i10) {
            return;
        }
        this.f4459d = i10;
        if (this.f4460e) {
            notifyDataSetChanged();
        }
    }

    public void e(boolean z10) {
        this.f4460e = z10;
    }

    @Override // c6.r, android.widget.Adapter
    public Object getItem(int i10) {
        if (i10 >= this.f4458c.size()) {
            return null;
        }
        return super.getItem(((Integer) this.f4458c.get(i10)).intValue());
    }

    @Override // c6.r, android.widget.Adapter
    public long getItemId(int i10) {
        if (i10 >= this.f4458c.size()) {
            return 0L;
        }
        return super.getItemId(((Integer) this.f4458c.get(i10)).intValue());
    }

    @Override // c6.r, android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        if (i10 >= this.f4458c.size()) {
            return 0;
        }
        return super.getItemViewType(((Integer) this.f4458c.get(i10)).intValue());
    }

    @Override // c6.r, android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2 = super.getView(((Integer) this.f4458c.get(i10)).intValue(), view, viewGroup);
        if (i10 == this.f4459d) {
            view2.setVisibility(4);
            return view2;
        }
        view2.setVisibility(0);
        return view2;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f4460e = true;
    }
}
