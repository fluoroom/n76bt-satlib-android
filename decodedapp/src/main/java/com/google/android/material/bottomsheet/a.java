package com.google.android.material.bottomsheet;

import android.view.View;
import java.util.Iterator;
import java.util.List;
import m0.d1;
import m0.i1;

/* JADX INFO: loaded from: classes3.dex */
class a extends d1.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f7532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f7533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f7534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f7535f;

    public a(View view) {
        super(0);
        this.f7535f = new int[2];
        this.f7532c = view;
    }

    @Override // m0.d1.b
    public void b(d1 d1Var) {
        this.f7532c.setTranslationY(0.0f);
    }

    @Override // m0.d1.b
    public void c(d1 d1Var) {
        this.f7532c.getLocationOnScreen(this.f7535f);
        this.f7533d = this.f7535f[1];
    }

    @Override // m0.d1.b
    public i1 d(i1 i1Var, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if ((((d1) it.next()).c() & i1.q.a()) != 0) {
                this.f7532c.setTranslationY(v8.a.c(this.f7534e, 0, r0.b()));
                break;
            }
        }
        return i1Var;
    }

    @Override // m0.d1.b
    public d1.a e(d1 d1Var, d1.a aVar) {
        this.f7532c.getLocationOnScreen(this.f7535f);
        int i10 = this.f7533d - this.f7535f[1];
        this.f7534e = i10;
        this.f7532c.setTranslationY(i10);
        return aVar;
    }
}
