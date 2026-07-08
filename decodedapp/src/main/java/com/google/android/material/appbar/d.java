package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import java.util.List;
import m0.i1;

/* JADX INFO: loaded from: classes3.dex */
abstract class d extends e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Rect f7390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Rect f7391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f7392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7393g;

    public d() {
        this.f7390d = new Rect();
        this.f7391e = new Rect();
        this.f7392f = 0;
    }

    private static int N(int i10) {
        if (i10 == 0) {
            return 8388659;
        }
        return i10;
    }

    @Override // com.google.android.material.appbar.e
    protected void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        View viewH = H(coordinatorLayout.l(view));
        if (viewH == null) {
            super.F(coordinatorLayout, view, i10);
            this.f7392f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f7390d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, viewH.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((coordinatorLayout.getHeight() + viewH.getBottom()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        i1 lastWindowInsets = coordinatorLayout.getLastWindowInsets();
        if (lastWindowInsets != null && coordinatorLayout.getFitsSystemWindows() && !view.getFitsSystemWindows()) {
            rect.left += lastWindowInsets.j();
            rect.right -= lastWindowInsets.k();
        }
        Rect rect2 = this.f7391e;
        Gravity.apply(N(fVar.f1874c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i10);
        int I = I(viewH);
        view.layout(rect2.left, rect2.top - I, rect2.right, rect2.bottom - I);
        this.f7392f = rect2.top - viewH.getBottom();
    }

    abstract View H(List list);

    final int I(View view) {
        if (this.f7393g == 0) {
            return 0;
        }
        float fJ = J(view);
        int i10 = this.f7393g;
        return h0.a.b((int) (fJ * i10), 0, i10);
    }

    abstract float J(View view);

    public final int K() {
        return this.f7393g;
    }

    int L(View view) {
        return view.getMeasuredHeight();
    }

    final int M() {
        return this.f7392f;
    }

    public final void O(int i10) {
        this.f7393g = i10;
    }

    protected boolean P() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean m(CoordinatorLayout coordinatorLayout, View view, int i10, int i11, int i12, int i13) {
        View viewH;
        i1 lastWindowInsets;
        int i14 = view.getLayoutParams().height;
        if ((i14 != -1 && i14 != -2) || (viewH = H(coordinatorLayout.l(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i12);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (viewH.getFitsSystemWindows() && (lastWindowInsets = coordinatorLayout.getLastWindowInsets()) != null) {
            size += lastWindowInsets.l() + lastWindowInsets.i();
        }
        int iL = size + L(viewH);
        int measuredHeight = viewH.getMeasuredHeight();
        if (P()) {
            view.setTranslationY(-measuredHeight);
        } else {
            view.setTranslationY(0.0f);
            iL -= measuredHeight;
        }
        coordinatorLayout.D(view, i10, i11, View.MeasureSpec.makeMeasureSpec(iL, i14 == -1 ? WXVideoFileObject.FILE_SIZE_LIMIT : RtlSpacingHelper.UNDEFINED), i13);
        return true;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7390d = new Rect();
        this.f7391e = new Rect();
        this.f7392f = 0;
    }
}
