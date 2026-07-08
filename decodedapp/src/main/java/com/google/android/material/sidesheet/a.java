package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* JADX INFO: loaded from: classes3.dex */
final class a extends c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final SideSheetBehavior f8172a;

    a(SideSheetBehavior sideSheetBehavior) {
        this.f8172a = sideSheetBehavior;
    }

    @Override // com.google.android.material.sidesheet.c
    int a(ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    @Override // com.google.android.material.sidesheet.c
    float b(int i10) {
        float fD = d();
        return (i10 - fD) / (c() - fD);
    }

    @Override // com.google.android.material.sidesheet.c
    int c() {
        return Math.max(0, this.f8172a.f0() + this.f8172a.d0());
    }

    @Override // com.google.android.material.sidesheet.c
    int d() {
        return (-this.f8172a.Y()) - this.f8172a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    int e() {
        return this.f8172a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    int f() {
        return -this.f8172a.Y();
    }

    @Override // com.google.android.material.sidesheet.c
    int g(View view) {
        return view.getRight() + this.f8172a.d0();
    }

    @Override // com.google.android.material.sidesheet.c
    public int h(CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    @Override // com.google.android.material.sidesheet.c
    int i() {
        return 1;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean j(float f10) {
        return f10 > 0.0f;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean k(View view) {
        return view.getRight() < (c() - d()) / 2;
    }

    @Override // com.google.android.material.sidesheet.c
    boolean l(float f10, float f11) {
        return d.a(f10, f11) && Math.abs(f10) > ((float) this.f8172a.h0());
    }

    @Override // com.google.android.material.sidesheet.c
    boolean m(View view, float f10) {
        return Math.abs(((float) view.getLeft()) + (f10 * this.f8172a.b0())) > this.f8172a.c0();
    }

    @Override // com.google.android.material.sidesheet.c
    void n(ViewGroup.MarginLayoutParams marginLayoutParams, int i10, int i11) {
        if (i10 <= this.f8172a.g0()) {
            marginLayoutParams.leftMargin = i11;
        }
    }
}
