package com.dw.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import c6.q;
import com.dw.widget.LinearLayoutEx;
import com.dw.widget.c;

/* JADX INFO: loaded from: classes.dex */
public class ListViewEx extends u3.f {

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private static final boolean f6961f0 = false;
    private int A;
    private int B;
    private View C;
    private boolean D;
    private int E;
    private int F;
    private boolean G;
    private int H;
    private ListAdapter I;
    private int J;
    private com.dw.widget.c K;
    private boolean L;
    private int M;
    private Runnable N;
    private d O;
    private boolean P;
    private View Q;
    public boolean R;
    public boolean S;
    private g T;
    private int U;
    private int V;
    private LinearLayoutEx.d W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private com.dw.widget.a f6962a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private int f6963b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private Runnable f6964c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private int f6965d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f6966e0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    f f6967u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f6968v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private com.dw.widget.b f6969w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private AbsListView.OnScrollListener f6970x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private AbsListView.OnScrollListener f6971y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private View.OnTouchListener f6972z;

    class a implements AbsListView.OnScrollListener {
        a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            ListViewEx.this.p(i10);
            if (ListViewEx.this.f6970x != null) {
                ListViewEx.this.f6970x.onScroll(absListView, i10, i11, i12);
            }
            if (ListViewEx.this.f6969w != null) {
                ListViewEx.this.f6969w.i(absListView, i10, ListViewEx.this.getChildCount(), i12);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (ListViewEx.this.f6970x != null) {
                ListViewEx.this.f6970x.onScrollStateChanged(absListView, i10);
            }
            ListViewEx.this.A = i10;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListViewEx.this.L = false;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ListViewEx.this.r();
            ListViewEx.this.f6962a0.q();
        }
    }

    private class d extends DataSetObserver {
        @Override // android.database.DataSetObserver
        public void onChanged() {
            ListViewEx.this.t();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ListViewEx.this.t();
        }

        private d() {
        }
    }

    public interface e {
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6977a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6978b;

        public f(int i10, int i11) {
            this.f6977a = i10;
            this.f6978b = i11;
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f6979a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private float f6980b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f6981c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f6982d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f6983e;

        public float f() {
            return this.f6981c - this.f6979a;
        }

        public float g() {
            return this.f6982d - this.f6980b;
        }
    }

    public ListViewEx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6967u = new f(-1, 0);
        this.T = new g();
        this.f6963b0 = -1;
        this.f6964c0 = new c();
        g();
    }

    private void g() {
        if (com.dw.widget.d.f7060a) {
            Integer num = com.dw.widget.d.f7061b;
            if (num != null) {
                setCacheColorHint(num.intValue());
            }
        } else {
            setCacheColorHint(0);
        }
        this.B = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (!isInEditMode()) {
            this.M = ViewConfiguration.getLongPressTimeout();
        }
        a aVar = new a();
        this.f6971y = aVar;
        super.setOnScrollListener(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(int i10) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r() {
        if (this.f6962a0 != null) {
            return;
        }
        com.dw.widget.a aVar = new com.dw.widget.a(this);
        this.f6962a0 = aVar;
        aVar.n(this.I);
    }

    private boolean u(MotionEvent motionEvent) {
        if (this.P) {
            int action = motionEvent.getAction();
            if (action == 0) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                int iPointToPosition = pointToPosition((int) x10, (int) y10);
                if (f6961f0) {
                    Log.d("ListViewEx", "TOUCH:ACTION_DOWN:" + x10 + "," + y10 + " item:" + iPointToPosition);
                }
                if (iPointToPosition != -1) {
                    this.Q = getChildAt(iPointToPosition - getFirstVisiblePosition());
                    this.T.f6979a = x10;
                    this.T.f6980b = y10;
                    this.S = true;
                }
            } else if (action == 1) {
                v(3);
            } else if (action == 2) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                this.T.f6981c = x11;
                this.T.f6982d = y11;
                float fAbs = Math.abs(this.T.f());
                float fAbs2 = Math.abs(this.T.g());
                if (f6961f0) {
                    Log.d("ListViewEx", "TOUCH:ACTION_MOVE:" + fAbs + "," + fAbs2);
                }
                if (this.R) {
                    if (w(2)) {
                        return true;
                    }
                } else if (this.S) {
                    int i10 = this.B;
                    if (fAbs >= i10 && fAbs > fAbs2) {
                        this.R = true;
                        w(1);
                        return true;
                    }
                    if (fAbs2 > i10) {
                        this.S = false;
                    }
                }
            } else if (action == 3) {
                v(0);
            }
        }
        return false;
    }

    private void v(int i10) {
        w(i10);
        this.R = false;
        this.Q = null;
    }

    private boolean w(int i10) {
        this.T.f6983e = i10;
        return false;
    }

    @Override // u3.f, u3.g.InterfaceC0389g
    public void a(int i10) {
        AbsListView.OnScrollListener onScrollListener;
        super.a(i10);
        if (i10 == this.A || (onScrollListener = this.f6970x) == null) {
            return;
        }
        onScrollListener.onScrollStateChanged(this, i10);
        this.A = i10;
    }

    @Override // android.widget.AbsListView
    public boolean canScrollList(int i10) {
        return super.canScrollList(i10);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        String str;
        if (this.D) {
            canvas.save();
            canvas.clipRect(0, this.C.getTop() + this.F, getWidth(), getHeight());
        }
        try {
            super.dispatchDraw(canvas);
            if (this.D) {
                canvas.restore();
                drawChild(canvas, this.C, getDrawingTime());
            }
        } catch (IndexOutOfBoundsException e10) {
            ListAdapter adapter = getAdapter();
            if (adapter != null) {
                str = "adapter count:" + adapter.getCount();
                if (adapter instanceof HeaderViewListAdapter) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str);
                    sb2.append(" HeadersCount:");
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    sb2.append(headerViewListAdapter.getHeadersCount());
                    str = (sb2.toString() + " FootersCount:" + headerViewListAdapter.getFootersCount()) + " WrappedAdapter Class:" + headerViewListAdapter.getWrappedAdapter().getClass();
                }
            } else {
                str = "adapter is null";
            }
            s3.b.c("ListViewEx", str, e10);
            throw new RuntimeException("e", new RuntimeException(str + " " + e10.getMessage(), e10));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0028  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean dispatchTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            int r0 = r10.getAction()
            r0 = r0 & 255(0xff, float:3.57E-43)
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == 0) goto L32
            if (r0 == r4) goto L28
            if (r0 == r3) goto L16
            if (r0 == r2) goto L28
            r5 = 4
            if (r0 == r5) goto L28
            goto L4d
        L16:
            java.lang.Runnable r0 = r9.N
            if (r0 == 0) goto L4d
            r9.removeCallbacks(r0)
            java.lang.Runnable r0 = r9.N
            int r5 = r9.M
            int r5 = r5 * 2
            long r5 = (long) r5
            r9.postDelayed(r0, r5)
            goto L4d
        L28:
            r9.L = r1
            java.lang.Runnable r0 = r9.N
            if (r0 == 0) goto L4d
            r9.removeCallbacks(r0)
            goto L4d
        L32:
            r9.L = r4
            java.lang.Runnable r0 = r9.N
            if (r0 != 0) goto L40
            com.dw.widget.ListViewEx$b r0 = new com.dw.widget.ListViewEx$b
            r0.<init>()
            r9.N = r0
            goto L43
        L40:
            r9.removeCallbacks(r0)
        L43:
            java.lang.Runnable r0 = r9.N
            int r5 = r9.M
            int r5 = r5 * 2
            long r5 = (long) r5
            r9.postDelayed(r0, r5)
        L4d:
            boolean r0 = r9.G     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            if (r0 != 0) goto L52
            goto L7f
        L52:
            com.dw.widget.c r0 = r9.K     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            r0.m(r10)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            int r0 = r10.getAction()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            if (r0 == r4) goto L7f
            if (r0 == r3) goto L60
            goto L7f
        L60:
            int r0 = r10.getPointerCount()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            if (r0 <= r4) goto L67
            r1 = 1
        L67:
            boolean r0 = r9.G     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            if (r0 == 0) goto L7f
            com.dw.widget.c r0 = r9.K     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            double r5 = r0.c()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            double r5 = -r5
            int r0 = r9.H     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            double r7 = (double) r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 <= 0) goto L7f
            r9.x()     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            goto L7f
        L7d:
            r10 = move-exception
            goto L94
        L7f:
            android.view.View$OnTouchListener r0 = r9.f6972z     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            if (r0 == 0) goto L8a
            boolean r0 = r0.onTouch(r9, r10)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            if (r0 == 0) goto L8a
            return r4
        L8a:
            if (r1 == 0) goto L8f
            r10.setAction(r2)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
        L8f:
            boolean r10 = super.dispatchTouchEvent(r10)     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L7d
            return r10
        L94:
            java.lang.String r0 = "ListViewEx"
            android.util.Log.w(r0, r10)
            r10.printStackTrace()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dw.widget.ListViewEx.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.AbsListView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        com.dw.widget.b bVar = this.f6969w;
        if (bVar != null) {
            bVar.c(canvas);
        }
    }

    public com.dw.widget.a getAlphabetIndexShow() {
        r();
        return this.f6962a0;
    }

    public View.OnTouchListener getOnInterceptTouchListener() {
        return this.f6972z;
    }

    @Override // u3.f, android.widget.AbsListView
    public boolean isFastScrollEnabled() {
        return u3.f.f27967t ? super.isFastScrollEnabled() : this.f6968v;
    }

    @Override // u3.f, android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        q();
        super.onDetachedFromWindow();
    }

    @Override // u3.f, android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        com.dw.widget.a aVar = this.f6962a0;
        if (aVar != null) {
            aVar.h();
        }
        if (this.P) {
            int action = motionEvent.getAction();
            if (action == 0) {
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                int iPointToPosition = pointToPosition((int) x10, (int) y10);
                if (f6961f0) {
                    Log.d("ListViewEx", "INTERCEPT_TOUCH:ACTION_DOWN:" + x10 + "," + y10 + " item:" + iPointToPosition);
                }
                if (iPointToPosition != -1) {
                    this.Q = getChildAt(iPointToPosition - getFirstVisiblePosition());
                    this.T.f6979a = x10;
                    this.T.f6980b = y10;
                    this.S = true;
                }
            } else if (action == 1) {
                v(3);
            } else if (action != 2) {
                if (action == 3) {
                    v(0);
                }
            } else if (this.S) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                this.T.f6981c = x11;
                this.T.f6982d = y11;
                float fAbs = Math.abs(this.T.f());
                float fAbs2 = Math.abs(this.T.g());
                if (f6961f0) {
                    Log.d("ListViewEx", "INTERCEPT_TOUCH:ACTION_MOVE:" + fAbs + "," + fAbs2);
                }
                int i10 = this.B;
                if (fAbs >= i10 - 2 && fAbs > fAbs2) {
                    this.R = true;
                    w(1);
                    return true;
                }
                if (fAbs2 > i10) {
                    this.S = false;
                }
            }
        }
        com.dw.widget.b bVar = this.f6969w;
        if (bVar == null || !bVar.h(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // u3.f, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11 = f6961f0;
        if (z11) {
            Log.d("ListViewEx", "onLayout:start");
        }
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.C;
        if (view != null) {
            view.layout(0, 0, this.E, this.F);
            this.f6967u.f6977a = -1;
            p(getFirstVisiblePosition());
        }
        if (z11) {
            Log.d("ListViewEx", "onLayout:end");
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int i10, int i11) {
        boolean z10 = f6961f0;
        if (z10) {
            Log.d("ListViewEx", "onMeasure:start");
        }
        super.onMeasure(i10, i11);
        if (this.f6963b0 != -1 && getMeasuredHeight() > this.f6963b0) {
            setMeasuredDimension(getMeasuredWidth(), this.f6963b0);
        }
        this.U = i10;
        this.V = i11;
        s();
        if (z10) {
            Log.d("ListViewEx", "onMeasure:end");
        }
    }

    @Override // u3.f, android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        ListAdapter adapter;
        super.onSizeChanged(i10, i11, i12, i13);
        com.dw.widget.b bVar = this.f6969w;
        if (bVar != null) {
            bVar.j(i10, i11, i12, i13);
        }
        LinearLayoutEx.d dVar = this.W;
        if (dVar != null) {
            dVar.a(this, i10, i11, i12, i13);
        }
        com.dw.widget.a aVar = this.f6962a0;
        if (aVar != null) {
            aVar.j();
        }
        if (isStackFromBottom() && q.e(this) && (adapter = getAdapter()) != null) {
            setSelection(adapter.getCount() - 1);
        }
    }

    @Override // u3.f, android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return isClickable() || isLongClickable();
        }
        com.dw.widget.b bVar = this.f6969w;
        if (bVar != null && bVar.k(motionEvent)) {
            return true;
        }
        if (u(motionEvent)) {
            motionEvent.setAction(3);
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        com.dw.widget.a aVar = this.f6962a0;
        if (aVar != null) {
            aVar.k(i10);
        }
    }

    public void q() {
        removeCallbacks(this.f6964c0);
        com.dw.widget.a aVar = this.f6962a0;
        if (aVar != null) {
            aVar.h();
        }
    }

    public void s() {
        View view = this.C;
        if (view == null) {
            return;
        }
        measureChild(view, this.U, this.V);
        this.E = this.C.getMeasuredWidth();
        this.F = this.C.getMeasuredHeight();
    }

    @Override // android.widget.AbsListView
    public void scrollListBy(int i10) {
        super.scrollListBy(i10);
    }

    @Override // u3.f, android.widget.AbsListView
    public void setFastScrollEnabled(boolean z10) {
        if (u3.f.f27967t) {
            super.setFastScrollEnabled(z10);
            return;
        }
        this.f6968v = z10;
        if (z10) {
            if (this.f6969w == null) {
                com.dw.widget.b bVar = new com.dw.widget.b(getContext(), this);
                this.f6969w = bVar;
                bVar.j(getWidth(), getHeight(), 0, 0);
                return;
            }
            return;
        }
        com.dw.widget.b bVar2 = this.f6969w;
        if (bVar2 != null) {
            bVar2.r();
            this.f6969w = null;
        }
    }

    public void setFastScrollerOverlayScal(float f10) {
        com.dw.widget.b bVar = this.f6969w;
        if (bVar != null) {
            bVar.n(f10);
        }
    }

    @Override // u3.f
    public void setFastScrollerShowIndex(boolean z10) {
        if (u3.f.f27967t) {
            super.setFastScrollerShowIndex(z10);
            return;
        }
        com.dw.widget.b bVar = this.f6969w;
        if (bVar != null) {
            bVar.p(z10);
        }
    }

    public void setItemSlideEnabled(boolean z10) {
        this.P = z10;
    }

    public void setMaxHeight(int i10) {
        if (this.f6963b0 == i10) {
            return;
        }
        this.f6963b0 = i10;
        requestLayout();
    }

    public void setOnInterceptTouchListener(View.OnTouchListener onTouchListener) {
        this.f6972z = onTouchListener;
    }

    public void setOnMultiTouchListener(c.a aVar) {
        if (aVar == null || this.K != null) {
            return;
        }
        this.K = new com.dw.widget.c(2);
    }

    @Override // u3.f, android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f6970x = onScrollListener;
        super.setOnScrollListener(this.f6971y);
    }

    public void setOnSizeChangingListener(LinearLayoutEx.d dVar) {
        this.W = dVar;
    }

    public void setOnSlideListener(e eVar) {
    }

    public void setPinnedHeaderView(View view) {
        if (view == null) {
            this.D = false;
        }
        this.C = view;
        if (view != null) {
            if (this.J == 0) {
                this.J = getVerticalFadingEdgeLength();
            }
            setFadingEdgeLength(0);
        } else {
            int i10 = this.J;
            if (i10 != 0) {
                setFadingEdgeLength(i10);
            }
        }
        requestLayout();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        super.setSelector(drawable);
        Rect rect = new Rect();
        drawable.getPadding(rect);
        this.f6965d0 = rect.top;
        this.f6966e0 = rect.bottom;
    }

    public void t() {
        this.f6967u.f6977a = -1;
        p(getFirstVisiblePosition());
    }

    public void x() {
        r();
        this.f6962a0.p();
    }

    @Override // u3.f, android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        d dVar;
        super.setAdapter(listAdapter);
        ListAdapter listAdapter2 = this.I;
        if (listAdapter2 != null && (dVar = this.O) != null) {
            listAdapter2.unregisterDataSetObserver(dVar);
        }
        if (listAdapter != null) {
            d dVar2 = new d();
            this.O = dVar2;
            listAdapter.registerDataSetObserver(dVar2);
        }
        this.I = listAdapter;
        com.dw.widget.a aVar = this.f6962a0;
        if (aVar != null) {
            aVar.n(listAdapter);
        }
        t();
    }
}
