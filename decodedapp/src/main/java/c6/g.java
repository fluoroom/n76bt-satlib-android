package c6;

import android.content.Context;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: loaded from: classes.dex */
public class g extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c[] f4427a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f4429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f4431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f4432f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f4434h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f4435r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f4436s;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f4433g = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Handler f4428b = new Handler();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BaseAdapter f4437a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f4438b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f4439c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f4440d;

        public a(BaseAdapter baseAdapter, int i10, int i11, int i12) {
            this.f4437a = baseAdapter;
            this.f4438b = i10;
            this.f4439c = i11;
            this.f4440d = i12;
        }
    }

    private class b extends Filter {
        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            return null;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            for (int i10 = 0; i10 < g.this.f4430d; i10++) {
                c cVar = g.this.f4427a[i10];
                if (cVar.f4443b instanceof Filterable) {
                    ((Filterable) cVar.f4443b).getFilter().filter(charSequence);
                }
            }
        }

        private b() {
        }
    }

    public static class c extends DataSetObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g f4442a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private BaseAdapter f4443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f4444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f4445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f4446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f4447f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f4448g;

        public c(BaseAdapter baseAdapter) {
            this.f4443b = baseAdapter;
            baseAdapter.registerDataSetObserver(this);
            this.f4448g = baseAdapter.getCount();
        }

        public boolean e() {
            if (this.f4446e) {
                return this.f4448g > 0 || this.f4445d;
            }
            return false;
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            this.f4444c = false;
            if (this.f4447f) {
                this.f4448g = this.f4443b.getCount();
                g gVar = this.f4442a;
                if (gVar != null) {
                    gVar.h();
                    this.f4442a.notifyDataSetChanged();
                }
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            this.f4444c = true;
            if (this.f4447f) {
                this.f4448g = 0;
                g gVar = this.f4442a;
                if (gVar != null) {
                    gVar.h();
                    if (this.f4442a.i()) {
                        this.f4442a.notifyDataSetInvalidated();
                    } else {
                        this.f4442a.notifyDataSetChanged();
                    }
                }
            }
        }
    }

    public g(BaseAdapter[] baseAdapterArr) {
        this.f4430d = 0;
        this.f4427a = new c[baseAdapterArr.length];
        for (int i10 = 0; i10 < baseAdapterArr.length; i10++) {
            c cVar = new c(baseAdapterArr[i10]);
            cVar.f4442a = this;
            this.f4427a[i10] = cVar;
        }
        this.f4430d = baseAdapterArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        for (int i10 = 0; i10 < this.f4430d; i10++) {
            if (!this.f4427a[i10].f4444c) {
                return false;
            }
        }
        return true;
    }

    protected void e() {
        if (this.f4431e) {
            return;
        }
        this.f4432f = 0;
        for (int i10 = 0; i10 < this.f4430d; i10++) {
            int i11 = this.f4427a[i10].f4448g;
            if (this.f4427a[i10].e()) {
                i11++;
            }
            this.f4432f += i11;
        }
        this.f4431e = true;
    }

    protected a f(int i10) {
        if (this.f4435r) {
            i10 = (getCount() - i10) - 1;
        }
        int viewTypeCount = 0;
        for (int i11 = 0; i11 < this.f4430d; i11++) {
            c cVar = this.f4427a[i11];
            int i12 = cVar.f4448g;
            if (cVar.e()) {
                i12++;
            }
            if (i12 > i10) {
                if (cVar.e()) {
                    i10--;
                }
                return new a(cVar.f4443b, i10, i11, viewTypeCount + cVar.f4443b.getItemViewType(i10));
            }
            viewTypeCount += cVar.f4443b.getViewTypeCount();
            i10 -= i12;
        }
        return null;
    }

    protected View g(int i10, BaseAdapter baseAdapter, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = j(viewGroup.getContext(), i10, baseAdapter, viewGroup);
        }
        d(view, i10, baseAdapter);
        return view;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        e();
        if (i()) {
            return 0;
        }
        return this.f4432f;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f4429c == null) {
            this.f4429c = new b();
        }
        return this.f4429c;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        int i11;
        a aVarF = f(i10);
        if (aVarF == null || (i11 = aVarF.f4438b) < 0) {
            return null;
        }
        return aVarF.f4437a.getItem(i11);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        int i11;
        a aVarF = f(i10);
        if (aVarF == null || (i11 = aVarF.f4438b) < 0) {
            return 0L;
        }
        return aVarF.f4437a.getItemId(i11);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i10) {
        a aVarF = f(i10);
        if (aVarF == null) {
            return 0;
        }
        if (aVarF.f4438b < 0) {
            return -1;
        }
        return aVarF.f4440d;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        View view2;
        a aVarF = f(i10);
        if (aVarF == null) {
            throw new IllegalArgumentException("Can not get view at position " + i10 + ", count is:" + getCount());
        }
        int i11 = aVarF.f4438b;
        if (i11 < 0) {
            int i12 = aVarF.f4439c;
            view2 = g(i12, this.f4427a[i12].f4443b, view, viewGroup);
        } else {
            this.f4436s = i10;
            view2 = aVarF.f4437a.getView(i11, view, viewGroup);
        }
        if (view2 != null) {
            return view2;
        }
        throw new NullPointerException("View should not be null, partition: " + aVarF.f4439c + " position: " + aVarF.f4438b);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        int viewTypeCount = 0;
        for (int i10 = 0; i10 < this.f4430d; i10++) {
            c cVar = this.f4427a[i10];
            viewTypeCount = cVar.f4443b == null ? viewTypeCount + 1 : viewTypeCount + cVar.f4443b.getViewTypeCount();
        }
        if (viewTypeCount == 0) {
            return 1;
        }
        return viewTypeCount;
    }

    protected void h() {
        this.f4431e = false;
    }

    protected View j(Context context, int i10, BaseAdapter baseAdapter, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        this.f4434h = true;
        if (this.f4433g < 0) {
            return;
        }
        super.notifyDataSetChanged();
        this.f4434h = false;
    }

    protected void d(View view, int i10, BaseAdapter baseAdapter) {
    }
}
