package com.google.android.material.appbar;

import android.view.View;
import m0.o0;

/* JADX INFO: loaded from: classes3.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f7397a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f7398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f7399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7401e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f7402f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f7403g = true;

    public f(View view) {
        this.f7397a = view;
    }

    void a() {
        View view = this.f7397a;
        o0.X(view, this.f7400d - (view.getTop() - this.f7398b));
        View view2 = this.f7397a;
        o0.W(view2, this.f7401e - (view2.getLeft() - this.f7399c));
    }

    public int b() {
        return this.f7400d;
    }

    void c() {
        this.f7398b = this.f7397a.getTop();
        this.f7399c = this.f7397a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f7403g || this.f7401e == i10) {
            return false;
        }
        this.f7401e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f7402f || this.f7400d == i10) {
            return false;
        }
        this.f7400d = i10;
        a();
        return true;
    }
}
