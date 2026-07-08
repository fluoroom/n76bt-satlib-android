package com.simplecityapps.recyclerview_fastscroll.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
public class FastScrollRecyclerView extends RecyclerView implements RecyclerView.t {
    private FastScroller X0;
    private boolean Y0;
    private c Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private int f10226a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    private int f10227b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    private int f10228c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    private SparseIntArray f10229d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    private b f10230e1;

    private class b extends RecyclerView.j {
        private b() {
        }

        private void e() {
            FastScrollRecyclerView.this.f10229d1.clear();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            e();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i10, int i11, Object obj) {
            e();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i10, int i11) {
            e();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i10, int i11) {
            e();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f10232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f10233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f10234c;
    }

    public interface d {
        String a(int i10);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private float Q1(float f10) {
        getAdapter();
        return getAdapter().f() * f10;
    }

    private void S1(c cVar) {
        cVar.f10232a = -1;
        cVar.f10233b = -1;
        cVar.f10234c = -1;
        if (getAdapter().f() == 0 || getChildCount() == 0) {
            return;
        }
        View childAt = getChildAt(0);
        int iM0 = m0(childAt);
        cVar.f10232a = iM0;
        if (iM0 == -1) {
            return;
        }
        if (getLayoutManager() instanceof GridLayoutManager) {
            cVar.f10232a /= ((GridLayoutManager) getLayoutManager()).m3();
        }
        getAdapter();
        cVar.f10233b = getLayoutManager().Z(childAt);
        cVar.f10234c = childAt.getHeight() + getLayoutManager().q0(childAt) + getLayoutManager().M(childAt);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean T1(android.view.MotionEvent r19) {
        /*
            r18 = this;
            r0 = r18
            int r1 = r19.getAction()
            float r2 = r19.getX()
            int r5 = (int) r2
            float r2 = r19.getY()
            int r6 = (int) r2
            if (r1 == 0) goto L3e
            r2 = 1
            if (r1 == r2) goto L2c
            r2 = 2
            if (r1 == r2) goto L1c
            r2 = 3
            if (r1 == r2) goto L2c
            goto L4e
        L1c:
            r0.f10228c1 = r6
            r10 = r6
            com.simplecityapps.recyclerview_fastscroll.views.FastScroller r6 = r0.X0
            int r8 = r0.f10226a1
            int r9 = r0.f10227b1
            r11 = 0
            r7 = r19
            r6.k(r7, r8, r9, r10, r11)
            goto L4e
        L2c:
            com.simplecityapps.recyclerview_fastscroll.views.FastScroller r12 = r0.X0
            int r14 = r0.f10226a1
            int r15 = r0.f10227b1
            int r1 = r0.f10228c1
            r17 = 0
            r13 = r19
            r16 = r1
            r12.k(r13, r14, r15, r16, r17)
            goto L4e
        L3e:
            r10 = r6
            r0.f10226a1 = r5
            r0.f10228c1 = r10
            r0.f10227b1 = r10
            com.simplecityapps.recyclerview_fastscroll.views.FastScroller r3 = r0.X0
            r8 = 0
            r7 = r10
            r4 = r19
            r3.k(r4, r5, r6, r7, r8)
        L4e:
            com.simplecityapps.recyclerview_fastscroll.views.FastScroller r1 = r0.X0
            boolean r1 = r1.l()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView.T1(android.view.MotionEvent):boolean");
    }

    public void P1(boolean z10) {
        this.X0.h(z10);
    }

    protected int R1(int i10, int i11) {
        return (((getPaddingTop() + i11) + i10) + getPaddingBottom()) - getHeight();
    }

    protected boolean U1() {
        if (getLayoutManager() instanceof LinearLayoutManager) {
            return ((LinearLayoutManager) getLayoutManager()).r2();
        }
        return false;
    }

    public void V1() {
        if (getAdapter() == null) {
            return;
        }
        int iF = getAdapter().f();
        if (getLayoutManager() instanceof GridLayoutManager) {
            iF = (int) Math.ceil(((double) iF) / ((double) ((GridLayoutManager) getLayoutManager()).m3()));
        }
        if (iF == 0) {
            this.X0.y(-1, -1);
            return;
        }
        S1(this.Z0);
        c cVar = this.Z0;
        if (cVar.f10232a < 0) {
            this.X0.y(-1, -1);
        } else {
            X1(cVar, iF);
        }
    }

    public String W1(float f10) {
        int iM3;
        int iF = getAdapter().f();
        if (iF == 0) {
            return "";
        }
        if (getLayoutManager() instanceof GridLayoutManager) {
            iM3 = ((GridLayoutManager) getLayoutManager()).m3();
            iF = (int) Math.ceil(((double) iF) / ((double) iM3));
        } else {
            iM3 = 1;
        }
        L1();
        S1(this.Z0);
        getAdapter();
        float fQ1 = Q1(f10);
        int iR1 = (int) (R1(iF * this.Z0.f10234c, 0) * f10);
        int i10 = this.Z0.f10234c;
        ((LinearLayoutManager) getLayoutManager()).E2((iM3 * iR1) / i10, -(iR1 % i10));
        if (!(getAdapter() instanceof d)) {
            return "";
        }
        if (f10 == 1.0f) {
            fQ1 = getAdapter().f() - 1;
        }
        return ((d) getAdapter()).a((int) fQ1);
    }

    protected void X1(c cVar, int i10) {
        getAdapter();
        int iR1 = R1(i10 * cVar.f10234c, 0);
        int i11 = cVar.f10232a * cVar.f10234c;
        int availableScrollBarHeight = getAvailableScrollBarHeight();
        if (iR1 <= 0) {
            this.X0.y(-1, -1);
            return;
        }
        int iMin = Math.min(iR1, getPaddingTop() + i11);
        int i12 = (int) (((U1() ? (iMin + cVar.f10233b) - availableScrollBarHeight : iMin - cVar.f10233b) / iR1) * availableScrollBarHeight);
        this.X0.y(cb.a.a(getResources()) ? 0 : getWidth() - this.X0.j(), U1() ? (availableScrollBarHeight - i12) + getPaddingBottom() : i12 + getPaddingTop());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
        T1(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public boolean b(RecyclerView recyclerView, MotionEvent motionEvent) {
        return T1(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void c(boolean z10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.Y0) {
            V1();
            this.X0.g(canvas);
        }
    }

    protected int getAvailableScrollBarHeight() {
        return ((getHeight() - getPaddingTop()) - getPaddingBottom()) - this.X0.i();
    }

    public int getScrollBarThumbHeight() {
        return this.X0.i();
    }

    public int getScrollBarWidth() {
        return this.X0.j();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        n(this);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setAdapter(RecyclerView.h hVar) {
        if (getAdapter() != null) {
            getAdapter().C(this.f10230e1);
        }
        if (hVar != null) {
            hVar.A(this.f10230e1);
        }
        super.setAdapter(hVar);
    }

    public void setAutoHideDelay(int i10) {
        this.X0.o(i10);
    }

    public void setAutoHideEnabled(boolean z10) {
        this.X0.p(z10);
    }

    public void setFastScrollEnabled(boolean z10) {
        this.Y0 = z10;
    }

    public void setPopUpTypeface(Typeface typeface) {
        this.X0.v(typeface);
    }

    public void setPopupBgColor(int i10) {
        this.X0.r(i10);
    }

    public void setPopupPosition(int i10) {
        this.X0.s(i10);
    }

    public void setPopupTextColor(int i10) {
        this.X0.t(i10);
    }

    public void setPopupTextSize(int i10) {
        this.X0.u(i10);
    }

    @Deprecated
    public void setStateChangeListener(bb.a aVar) {
        setOnFastScrollStateChangeListener(aVar);
    }

    public void setThumbColor(int i10) {
        this.X0.w(i10);
    }

    @Deprecated
    public void setThumbEnabled(boolean z10) {
        setFastScrollEnabled(z10);
    }

    public void setThumbInactiveColor(int i10) {
        this.X0.x(i10);
    }

    public void setTrackColor(int i10) {
        this.X0.z(i10);
    }

    public FastScrollRecyclerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.Y0 = true;
        this.Z0 = new c();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ab.a.f420w, 0, 0);
        try {
            this.Y0 = typedArrayObtainStyledAttributes.getBoolean(ab.a.H, true);
            typedArrayObtainStyledAttributes.recycle();
            this.X0 = new FastScroller(context, this, attributeSet);
            this.f10230e1 = new b();
            this.f10229d1 = new SparseIntArray();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    @Deprecated
    public void setThumbInactiveColor(boolean z10) {
        P1(z10);
    }

    public void setOnFastScrollStateChangeListener(bb.a aVar) {
    }
}
