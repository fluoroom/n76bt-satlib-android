package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
abstract class e extends CoordinatorLayout.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f7394a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7395b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7396c;

    public e() {
        this.f7395b = 0;
        this.f7396c = 0;
    }

    public int E() {
        f fVar = this.f7394a;
        if (fVar != null) {
            return fVar.b();
        }
        return 0;
    }

    protected void F(CoordinatorLayout coordinatorLayout, View view, int i10) {
        coordinatorLayout.C(view, i10);
    }

    public boolean G(int i10) {
        f fVar = this.f7394a;
        if (fVar != null) {
            return fVar.e(i10);
        }
        this.f7395b = i10;
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean l(CoordinatorLayout coordinatorLayout, View view, int i10) {
        F(coordinatorLayout, view, i10);
        if (this.f7394a == null) {
            this.f7394a = new f(view);
        }
        this.f7394a.c();
        this.f7394a.a();
        int i11 = this.f7395b;
        if (i11 != 0) {
            this.f7394a.e(i11);
            this.f7395b = 0;
        }
        int i12 = this.f7396c;
        if (i12 == 0) {
            return true;
        }
        this.f7394a.d(i12);
        this.f7396c = 0;
        return true;
    }

    public e(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7395b = 0;
        this.f7396c = 0;
    }
}
