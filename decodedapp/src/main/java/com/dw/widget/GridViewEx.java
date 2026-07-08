package com.dw.widget;

import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import com.dw.widget.c;

/* JADX INFO: loaded from: classes.dex */
public class GridViewEx extends c6.c {
    f V;
    private boolean W;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private com.dw.widget.b f6922a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private AbsListView.OnScrollListener f6923b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    private AbsListView.OnScrollListener f6924c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private View.OnTouchListener f6925d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private int f6926e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private int f6927f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private View f6928g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private boolean f6929h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private int f6930i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    private int f6931j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    private boolean f6932k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private int f6933l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private ListAdapter f6934m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private int f6935n0;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private com.dw.widget.c f6936o0;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private c f6937p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private com.dw.widget.a f6938q0;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private int f6939r0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private Runnable f6940s0;

    class a implements AbsListView.OnScrollListener {
        a() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            if (GridViewEx.this.f6923b0 != null) {
                GridViewEx.this.f6923b0.onScroll(absListView, i10, i11, i12);
            }
            if (GridViewEx.this.f6922a0 != null) {
                GridViewEx.this.f6922a0.i(absListView, i10, GridViewEx.this.getChildCount(), i12);
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (GridViewEx.this.f6923b0 != null) {
                GridViewEx.this.f6923b0.onScrollStateChanged(absListView, i10);
            }
            GridViewEx.this.f6926e0 = i10;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            GridViewEx.this.O();
            GridViewEx.this.f6938q0.q();
        }
    }

    private class c extends DataSetObserver {
        @Override // android.database.DataSetObserver
        public void onChanged() {
            GridViewEx.this.P();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            GridViewEx.this.P();
        }

        private c() {
        }
    }

    public interface d {
    }

    public interface e {
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f6945b;

        public f(int i10, int i11) {
            this.f6944a = i10;
            this.f6945b = i11;
        }
    }

    public GridViewEx(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.V = new f(-1, 0);
        this.f6939r0 = -1;
        this.f6940s0 = new b();
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void O() {
        if (this.f6938q0 != null) {
            return;
        }
        com.dw.widget.a aVar = new com.dw.widget.a(this);
        this.f6938q0 = aVar;
        aVar.n(this.f6934m0);
    }

    private boolean Q(MotionEvent motionEvent) {
        return false;
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
        this.f6927f0 = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        a aVar = new a();
        this.f6924c0 = aVar;
        super.setOnScrollListener(aVar);
    }

    public void N(int i10) {
    }

    public void P() {
        this.V.f6944a = -1;
    }

    public void R() {
        O();
        this.f6938q0.p();
    }

    @Override // u3.e, u3.g.InterfaceC0389g
    public void a(int i10) {
        AbsListView.OnScrollListener onScrollListener;
        super.a(i10);
        if (i10 == this.f6926e0 || (onScrollListener = this.f6923b0) == null) {
            return;
        }
        onScrollListener.onScrollStateChanged(this, i10);
        this.f6926e0 = i10;
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f6929h0) {
            drawChild(canvas, this.f6928g0, getDrawingTime());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            if (this.f6932k0) {
                this.f6936o0.m(motionEvent);
                int action = motionEvent.getAction();
                if (action != 1 && action == 2) {
                    z = motionEvent.getPointerCount() > 1;
                    if (this.f6932k0 && (-this.f6936o0.c()) > this.f6933l0) {
                        R();
                    }
                }
            }
            View.OnTouchListener onTouchListener = this.f6925d0;
            if (onTouchListener != null && onTouchListener.onTouch(this, motionEvent)) {
                return true;
            }
            if (z) {
                motionEvent.setAction(3);
            }
            return super.dispatchTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException e10) {
            Log.w("GridViewEx", e10);
            e10.printStackTrace();
            return true;
        }
    }

    @Override // android.widget.AbsListView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        com.dw.widget.b bVar = this.f6922a0;
        if (bVar != null) {
            bVar.c(canvas);
        }
    }

    public com.dw.widget.a getAlphabetIndexShow() {
        O();
        return this.f6938q0;
    }

    public com.dw.widget.b getFastScroller() {
        return this.f6922a0;
    }

    public View.OnTouchListener getOnInterceptTouchListener() {
        return this.f6925d0;
    }

    @Override // u3.e, android.widget.AbsListView
    public boolean isFastScrollEnabled() {
        return u3.e.f27950t ? super.isFastScrollEnabled() : this.W;
    }

    @Override // c6.c, u3.e, android.widget.AbsListView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        com.dw.widget.a aVar = this.f6938q0;
        if (aVar != null) {
            aVar.h();
        }
        com.dw.widget.b bVar = this.f6922a0;
        if (bVar == null || !bVar.h(motionEvent)) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // u3.e, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f6928g0;
        if (view != null) {
            view.layout(0, 0, this.f6930i0, this.f6931j0);
            N(getFirstVisiblePosition());
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int i10, int i11) {
        getMeasuredWidth();
        getMeasuredHeight();
        super.onMeasure(i10, i11);
        if (this.f6939r0 != -1 && getMeasuredHeight() > this.f6939r0) {
            setMeasuredDimension(getMeasuredWidth(), this.f6939r0);
        }
        View view = this.f6928g0;
        if (view != null) {
            measureChild(view, i10, i11);
            this.f6930i0 = this.f6928g0.getMeasuredWidth();
            this.f6931j0 = this.f6928g0.getMeasuredHeight();
        }
        getMeasuredWidth();
        getMeasuredHeight();
    }

    @Override // u3.e, android.widget.AbsListView, android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        com.dw.widget.b bVar = this.f6922a0;
        if (bVar != null) {
            bVar.j(i10, i11, i12, i13);
        }
    }

    @Override // c6.c, u3.e, android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return isClickable() || isLongClickable();
        }
        com.dw.widget.b bVar = this.f6922a0;
        if ((bVar == null || !bVar.k(motionEvent)) && !Q(motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // u3.e, android.widget.AbsListView
    public void setFastScrollEnabled(boolean z10) {
        if (u3.e.f27950t) {
            super.setFastScrollEnabled(z10);
            return;
        }
        this.W = z10;
        if (z10) {
            if (this.f6922a0 == null) {
                com.dw.widget.b bVar = new com.dw.widget.b(getContext(), this);
                this.f6922a0 = bVar;
                bVar.j(getWidth(), getHeight(), 0, 0);
                return;
            }
            return;
        }
        com.dw.widget.b bVar2 = this.f6922a0;
        if (bVar2 != null) {
            bVar2.r();
            this.f6922a0 = null;
        }
    }

    public void setMaxHeight(int i10) {
        if (this.f6939r0 == i10) {
            return;
        }
        this.f6939r0 = i10;
        requestLayout();
    }

    public void setOnInterceptTouchListener(View.OnTouchListener onTouchListener) {
        this.f6925d0 = onTouchListener;
    }

    public void setOnMeasuredSizeChangedListener(d dVar) {
    }

    public void setOnMultiTouchListener(c.a aVar) {
        if (aVar == null || this.f6936o0 != null) {
            return;
        }
        this.f6936o0 = new com.dw.widget.c(2);
    }

    @Override // u3.e, android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener onScrollListener) {
        this.f6923b0 = onScrollListener;
        super.setOnScrollListener(this.f6924c0);
    }

    public void setOnSlideListener(e eVar) {
    }

    public void setPinnedHeaderView(View view) {
        if (view == null) {
            this.f6929h0 = false;
        }
        this.f6928g0 = view;
        if (view != null) {
            if (this.f6935n0 == 0) {
                this.f6935n0 = getVerticalFadingEdgeLength();
            }
            setFadingEdgeLength(0);
        } else {
            int i10 = this.f6935n0;
            if (i10 != 0) {
                setFadingEdgeLength(i10);
            }
        }
        requestLayout();
    }

    @Override // c6.c, u3.e, android.widget.AdapterView
    public void setAdapter(ListAdapter listAdapter) {
        c cVar;
        super.setAdapter(listAdapter);
        ListAdapter listAdapter2 = this.f6934m0;
        if (listAdapter2 != null && (cVar = this.f6937p0) != null) {
            listAdapter2.unregisterDataSetObserver(cVar);
        }
        if (listAdapter != null) {
            c cVar2 = new c();
            this.f6937p0 = cVar2;
            listAdapter.registerDataSetObserver(cVar2);
        }
        this.f6934m0 = listAdapter;
        com.dw.widget.a aVar = this.f6938q0;
        if (aVar != null) {
            aVar.n(listAdapter);
        }
        P();
    }
}
