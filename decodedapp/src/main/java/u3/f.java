package u3;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import u3.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class f extends ListView implements g.InterfaceC0389g {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected static final boolean f27967t = true;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Thread f27968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f27969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f27970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f27971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    d f27973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ListAdapter f27974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private AbsListView.OnScrollListener f27975h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private AbsListView.OnScrollListener f27976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f27977s;

    class a implements AbsListView.OnScrollListener {
        a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            if (f.this.f27976r != null) {
                f.this.f27976r.onScroll(absListView, i10, i11, i12);
            }
            if (f.this.f27971d != null) {
                f.this.f27971d.J(i10, f.this.getChildCount(), f.this.getCount());
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (f.this.f27976r != null) {
                f.this.f27976r.onScrollStateChanged(absListView, i10);
            }
            f.this.f27977s = i10;
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27979a;

        b(boolean z10) {
            this.f27979a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.setFastScrollerEnabledUiThread(this.f27979a);
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f27981a;

        c(boolean z10) {
            this.f27981a = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            f.this.setFastScrollerAlwaysVisibleUiThread(this.f27981a);
        }
    }

    class d extends DataSetObserver {
        d() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            super.onChanged();
            if (f.this.f27971d != null) {
                f.this.f27971d.K();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            super.onInvalidated();
            if (f.this.f27971d != null) {
                f.this.f27971d.K();
            }
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27968a = Thread.currentThread();
        g();
    }

    private void g() {
        a aVar = new a();
        this.f27975h = aVar;
        super.setOnScrollListener(aVar);
        if (isInEditMode()) {
            setAdapter((ListAdapter) new u3.d());
        }
    }

    private boolean h() {
        return this.f27968a == Thread.currentThread();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFastScrollerAlwaysVisibleUiThread(boolean z10) {
        g gVar = this.f27971d;
        if (gVar != null) {
            gVar.S(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFastScrollerEnabledUiThread(boolean z10) {
        g gVar = this.f27971d;
        if (gVar != null) {
            gVar.T(z10);
        } else if (z10) {
            g gVar2 = new g(this, this.f27972e);
            this.f27971d = gVar2;
            gVar2.T(true);
        }
        v.m(this);
        g gVar3 = this.f27971d;
        if (gVar3 != null) {
            gVar3.j0();
        }
    }

    public void a(int i10) {
        AbsListView.OnScrollListener onScrollListener;
        if (i10 == this.f27977s || (onScrollListener = this.f27976r) == null) {
            return;
        }
        this.f27977s = i10;
        onScrollListener.onScrollStateChanged(this, i10);
    }

    @Override // android.widget.AbsListView, android.view.View
    public int getVerticalScrollbarWidth() {
        g gVar = this.f27971d;
        return (gVar == null || !gVar.v()) ? super.getVerticalScrollbarWidth() : Math.max(super.getVerticalScrollbarWidth(), this.f27971d.s());
    }

    @Override // android.widget.AbsListView
    public boolean isFastScrollAlwaysVisible() {
        g gVar = this.f27971d;
        return gVar == null ? this.f27969b && this.f27970c : gVar.v() && this.f27971d.u();
    }

    @Override // android.widget.AbsListView
    public boolean isFastScrollEnabled() {
        if (!f27967t) {
            return super.isFastScrollEnabled();
        }
        g gVar = this.f27971d;
        return gVar == null ? this.f27969b : gVar.v();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f27974g == null || this.f27973f != null) {
            return;
        }
        d dVar = new d();
        this.f27973f = dVar;
        this.f27974g.registerDataSetObserver(dVar);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        d dVar;
        super.onDetachedFromWindow();
        ListAdapter listAdapter = this.f27974g;
        if (listAdapter == null || (dVar = this.f27973f) == null) {
            return;
        }
        listAdapter.unregisterDataSetObserver(dVar);
        this.f27973f = null;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
        g gVar = this.f27971d;
        if (gVar == null || !gVar.G(motionEvent)) {
            return super.onInterceptHoverEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        g gVar = this.f27971d;
        if (gVar == null || !gVar.H(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        g gVar = this.f27971d;
        if (gVar != null) {
            gVar.I(getChildCount(), getCount());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        g gVar = this.f27971d;
        if (gVar != null) {
            gVar.L(i10, i11, i12, i13);
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return isClickable() || isLongClickable();
        }
        g gVar = this.f27971d;
        if (gVar == null || !gVar.N(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.AbsListView
    public void setFastScrollAlwaysVisible(boolean z10) {
        if (this.f27970c != z10) {
            if (z10 && !this.f27969b) {
                setFastScrollEnabled(true);
            }
            this.f27970c = z10;
            if (h()) {
                setFastScrollerAlwaysVisibleUiThread(z10);
            } else {
                post(new c(z10));
            }
        }
    }

    @Override // android.widget.AbsListView
    public void setFastScrollEnabled(boolean z10) {
        if (!f27967t) {
            super.setFastScrollEnabled(z10);
            return;
        }
        if (this.f27969b != z10) {
            this.f27969b = z10;
            if (h()) {
                setFastScrollerEnabledUiThread(z10);
            } else {
                post(new b(z10));
            }
        }
    }

    @Override // android.widget.AbsListView
    public void setFastScrollStyle(int i10) {
        g gVar = this.f27971d;
        if (gVar == null) {
            this.f27972e = i10;
        } else {
            gVar.Y(i10);
        }
    }

    public void setFastScrollerShowIndex(boolean z10) {
        g gVar = this.f27971d;
        if (gVar != null) {
            gVar.W(z10);
        }
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f27976r = onScrollListener;
        super.setOnScrollListener(this.f27975h);
    }

    @Override // android.widget.AbsListView, android.view.View
    public void setScrollBarStyle(int i10) {
        super.setScrollBarStyle(i10);
        g gVar = this.f27971d;
        if (gVar != null) {
            gVar.U(i10);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        d dVar;
        super.setAdapter(listAdapter);
        ListAdapter listAdapter2 = this.f27974g;
        if (listAdapter2 != null && (dVar = this.f27973f) != null) {
            listAdapter2.unregisterDataSetObserver(dVar);
        }
        this.f27974g = listAdapter;
        if (listAdapter != null) {
            d dVar2 = new d();
            this.f27973f = dVar2;
            this.f27974g.registerDataSetObserver(dVar2);
        }
    }
}
