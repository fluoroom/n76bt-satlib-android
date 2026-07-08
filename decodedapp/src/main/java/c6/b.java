package c6;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.Filter;
import android.widget.Filterable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends n implements Filterable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected List f4391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f4392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected Context f4393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList f4394h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected LayoutInflater f4395r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f4396s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected CharSequence f4397t;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private a f4402y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f4403z;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final Object f4390d = new Object();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private HashSet f4398u = new HashSet();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private ArrayList f4399v = new ArrayList();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f4400w = 0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f4401x = true;

    protected class a extends Filter {
        protected a() {
        }

        protected boolean a(Object obj, String str) {
            return obj.toString().toLowerCase().contains(str);
        }

        @Override // android.widget.Filter
        protected Filter.FilterResults performFiltering(CharSequence charSequence) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Filter.FilterResults filterResults = new Filter.FilterResults();
            b bVar = b.this;
            if (bVar.f4394h == null) {
                synchronized (bVar.f4390d) {
                    b.this.f4394h = new ArrayList(b.this.f4391e);
                }
            }
            if (charSequence == null || charSequence.length() == 0) {
                b.this.P();
                synchronized (b.this.f4390d) {
                    arrayList = new ArrayList(b.this.f4394h);
                }
                filterResults.values = arrayList;
                filterResults.count = arrayList.size();
                return filterResults;
            }
            String lowerCase = charSequence.toString().toLowerCase();
            b.this.P();
            synchronized (b.this.f4390d) {
                arrayList2 = new ArrayList(b.this.f4394h);
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
            if (b.this.P()) {
                filter(charSequence);
                return;
            }
            List list = (List) filterResults.values;
            if (list == null) {
                b.this.f4391e = a6.o.a();
            } else {
                b.this.f4391e = list;
            }
            b bVar = b.this;
            bVar.f4397t = charSequence;
            bVar.f4396s = !TextUtils.isEmpty(charSequence);
            b.this.k();
        }
    }

    public b(Context context, int i10) {
        K(context, i10, 0, new ArrayList());
    }

    private void K(Context context, int i10, int i11, List list) {
        this.f4393g = context;
        this.f4395r = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f4392f = i10;
        this.f4391e = list;
        this.f4400w = i11;
    }

    public void D(Object obj) {
        synchronized (this.f4390d) {
            try {
                ArrayList arrayList = this.f4394h;
                if (arrayList != null) {
                    arrayList.add(obj);
                } else {
                    this.f4391e.add(obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f4401x) {
            m(f() - 1);
        }
    }

    public void E(Collection collection) {
        int iF = f();
        synchronized (this.f4390d) {
            try {
                ArrayList arrayList = this.f4394h;
                if (arrayList != null) {
                    arrayList.addAll(collection);
                } else {
                    this.f4391e.addAll(collection);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f4401x) {
            o(iF, collection.size());
        }
    }

    public void F(List list) {
        synchronized (this.f4390d) {
            try {
                ArrayList arrayList = this.f4394h;
                if (arrayList != null) {
                    arrayList.clear();
                    if (this.f4398u.isEmpty()) {
                        this.f4394h.addAll(list);
                    } else {
                        for (Object obj : list) {
                            if (!this.f4398u.contains(Long.valueOf(I(obj)))) {
                                this.f4394h.add(obj);
                            }
                        }
                    }
                    if (this.f4396s) {
                        getFilter().filter(this.f4397t);
                    } else if (this.f4398u.isEmpty()) {
                        this.f4391e = list;
                    } else {
                        this.f4391e = (List) this.f4394h.clone();
                    }
                } else if (this.f4398u.isEmpty()) {
                    this.f4391e = list;
                } else {
                    this.f4391e.clear();
                    for (Object obj2 : list) {
                        if (!this.f4398u.contains(Long.valueOf(I(obj2)))) {
                            this.f4391e.add(obj2);
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        O();
        if (this.f4401x) {
            k();
        }
    }

    public void G() {
        synchronized (this.f4390d) {
            try {
                ArrayList arrayList = this.f4394h;
                if (arrayList != null) {
                    arrayList.clear();
                } else {
                    this.f4391e.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f4401x) {
            k();
        }
    }

    public Context H() {
        return this.f4393g;
    }

    protected long I(Object obj) {
        return 0L;
    }

    public Object J(int i10) {
        return this.f4391e.get(i10);
    }

    public void L(Object obj, int i10) {
        synchronized (this.f4390d) {
            try {
                ArrayList arrayList = this.f4394h;
                if (arrayList != null) {
                    arrayList.add(i10, obj);
                } else {
                    this.f4391e.add(i10, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f4401x) {
            m(i10);
        }
    }

    public void M(int i10) {
        synchronized (this.f4390d) {
            try {
                ArrayList arrayList = this.f4394h;
                if (arrayList != null) {
                    arrayList.remove(i10);
                } else {
                    this.f4391e.remove(i10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f4401x) {
            q(i10);
        }
    }

    public Object N(int i10, Object obj) {
        Object objRemove;
        synchronized (this.f4390d) {
            try {
                ArrayList arrayList = this.f4394h;
                if (arrayList != null) {
                    objRemove = arrayList.remove(i10);
                    this.f4394h.add(i10, obj);
                } else {
                    objRemove = this.f4391e.remove(i10);
                    this.f4391e.add(i10, obj);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (this.f4401x) {
            l(i10);
        }
        return objRemove;
    }

    protected void O() {
        synchronized (this.f4390d) {
            this.f4403z = true;
        }
    }

    protected boolean P() {
        boolean z10 = this.f4403z;
        synchronized (this.f4390d) {
            this.f4403z = false;
        }
        return z10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.f4391e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i10) {
        return i10;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f4402y == null) {
            this.f4402y = new a();
        }
        return this.f4402y;
    }
}
