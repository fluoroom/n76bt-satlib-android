package c6;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a extends BaseAdapter implements Filterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List f4376a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f4378c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f4379d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Context f4382g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList f4383h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Filter f4384r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected LayoutInflater f4385s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f4386t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected CharSequence f4387u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f4388v;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final Object f4377b = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f4380e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f4381f = true;

    /* JADX INFO: renamed from: c6.a$a, reason: collision with other inner class name */
    protected class C0067a extends Filter {
        protected C0067a() {
        }

        protected boolean a(Object obj, String str) {
            return obj.toString().toLowerCase().contains(str);
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            if (a.this.f4384r != this) {
                return filterResults;
            }
            a aVar = a.this;
            if (aVar.f4383h == null) {
                synchronized (aVar.f4377b) {
                    try {
                        if (a.this.f4384r != this) {
                            return filterResults;
                        }
                        a.this.f4383h = new ArrayList(a.this.f4376a);
                    } finally {
                    }
                }
            }
            if (charSequence == null || charSequence.length() == 0) {
                a.this.m();
                synchronized (a.this.f4377b) {
                    arrayList = new ArrayList(a.this.f4383h);
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
                return filterResults;
            }
            String lowerCase = charSequence.toString().toLowerCase();
            a.this.m();
            synchronized (a.this.f4377b) {
                arrayList2 = new ArrayList(a.this.f4383h);
            }
            int size = arrayList2.size();
            ArrayList arrayList3 = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = arrayList2.get(i10);
                if (a(obj, lowerCase)) {
                    arrayList3.add(obj);
                }
            }
            filterResults.values = arrayList3;
            filterResults.count = arrayList3.size();
            return filterResults;
        }

        @Override // android.widget.Filter
        protected void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
            if (a.this.f4384r != this) {
                return;
            }
            if (a.this.m()) {
                filter(charSequence);
                return;
            }
            List list = (List) filterResults.values;
            if (list == null) {
                a.this.f4376a = a6.o.a();
            } else {
                a.this.f4376a = list;
            }
            a aVar = a.this;
            aVar.f4387u = charSequence;
            aVar.f4386t = !TextUtils.isEmpty(charSequence);
            a.this.notifyDataSetChanged();
        }
    }

    public a(Context context, int i10) {
        g(context, i10, 0, new ArrayList());
    }

    private void g(Context context, int i10, int i11, List list) {
        this.f4382g = context;
        this.f4385s = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f4379d = i10;
        this.f4378c = i10;
        this.f4376a = list;
        this.f4380e = i11;
    }

    public void b(Collection collection) {
        synchronized (this.f4377b) {
            try {
                ArrayList arrayList = this.f4383h;
                if (arrayList != null) {
                    arrayList.addAll(collection);
                } else {
                    this.f4376a.addAll(collection);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f4381f) {
            notifyDataSetChanged();
        }
    }

    public void c(List list) {
        synchronized (this.f4377b) {
            try {
                ArrayList arrayList = this.f4383h;
                if (arrayList != null) {
                    arrayList.clear();
                    this.f4383h.addAll(list);
                    if (this.f4386t) {
                        getFilter().filter(this.f4387u);
                    } else {
                        this.f4376a = list;
                    }
                } else {
                    this.f4376a = list;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        k();
        if (this.f4381f) {
            notifyDataSetChanged();
        }
    }

    public void d() {
        synchronized (this.f4377b) {
            try {
                ArrayList arrayList = this.f4383h;
                if (arrayList != null) {
                    arrayList.clear();
                } else {
                    this.f4376a.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f4381f) {
            notifyDataSetChanged();
        }
    }

    protected View e(int i10, View view, ViewGroup viewGroup, int i11) {
        if (view == null) {
            view = this.f4385s.inflate(i11, viewGroup, false);
        }
        try {
            int i12 = this.f4380e;
            TextView textView = i12 == 0 ? (TextView) view : (TextView) view.findViewById(i12);
            Object item = getItem(i10);
            if (item instanceof CharSequence) {
                textView.setText((CharSequence) item);
                return view;
            }
            textView.setText(item.toString());
            return view;
        } catch (ClassCastException e10) {
            Log.e("ArrayAdapter", "You must supply a resource ID for a TextView");
            throw new IllegalStateException("ArrayAdapter requires the resource ID to be a TextView", e10);
        }
    }

    public Context f() {
        return this.f4382g;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f4376a.size();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        return e(i10, view, viewGroup, this.f4379d);
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f4384r == null) {
            this.f4384r = i();
        }
        return this.f4384r;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i10) {
        return this.f4376a.get(i10);
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        return e(i10, view, viewGroup, this.f4378c);
    }

    public void h(Object obj, int i10) {
        synchronized (this.f4377b) {
            try {
                ArrayList arrayList = this.f4383h;
                if (arrayList != null) {
                    arrayList.add(i10, obj);
                } else {
                    this.f4376a.add(i10, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f4381f) {
            notifyDataSetChanged();
        }
    }

    protected Filter i() {
        return new C0067a();
    }

    public void j(int i10) {
        synchronized (this.f4377b) {
            try {
                ArrayList arrayList = this.f4383h;
                if (arrayList != null) {
                    arrayList.remove(i10);
                } else {
                    this.f4376a.remove(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f4381f) {
            notifyDataSetChanged();
        }
    }

    protected void k() {
        synchronized (this.f4377b) {
            this.f4388v = true;
        }
    }

    public void l(int i10) {
        this.f4379d = i10;
    }

    protected boolean m() {
        boolean z10 = this.f4388v;
        synchronized (this.f4377b) {
            this.f4388v = false;
        }
        return z10;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f4381f = true;
    }

    public a(Context context, int i10, int i11, Object[] objArr) {
        g(context, i10, i11, Arrays.asList(objArr));
    }

    public a(Context context, int i10, List list) {
        g(context, i10, 0, list);
    }

    public a(Context context, int i10, int i11, List list) {
        g(context, i10, i11, list);
    }
}
