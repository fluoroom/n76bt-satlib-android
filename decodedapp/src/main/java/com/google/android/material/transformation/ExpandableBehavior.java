package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f8546a;

    class a implements ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f8547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f8548b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f9.a f8549c;

        a(View view, int i10, f9.a aVar) {
            this.f8547a = view;
            this.f8548b = i10;
            this.f8549c = aVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            this.f8547a.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f8546a == this.f8548b) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                f9.a aVar = this.f8549c;
                expandableBehavior.H((View) aVar, this.f8547a, aVar.a(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
        this.f8546a = 0;
    }

    private boolean F(boolean z10) {
        if (!z10) {
            return this.f8546a == 1;
        }
        int i10 = this.f8546a;
        return i10 == 0 || i10 == 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected f9.a G(CoordinatorLayout coordinatorLayout, View view) {
        List listL = coordinatorLayout.l(view);
        int size = listL.size();
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = (View) listL.get(i10);
            if (e(coordinatorLayout, view, view2)) {
                return (f9.a) view2;
            }
        }
        return null;
    }

    protected abstract boolean H(View view, View view2, boolean z10, boolean z11);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public abstract boolean e(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        f9.a aVar = (f9.a) view2;
        if (!F(aVar.a())) {
            return false;
        }
        this.f8546a = aVar.a() ? 1 : 2;
        return H((View) aVar, view, aVar.a(), true);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        f9.a aVarG;
        if (view.isLaidOut() || (aVarG = G(coordinatorLayout, view)) == null || !F(aVarG.a())) {
            return false;
        }
        int i11 = aVarG.a() ? 1 : 2;
        this.f8546a = i11;
        view.getViewTreeObserver().addOnPreDrawListener(new a(view, i11, aVarG));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8546a = 0;
    }
}
