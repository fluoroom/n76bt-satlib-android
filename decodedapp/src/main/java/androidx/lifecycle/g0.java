package androidx.lifecycle;

import androidx.lifecycle.d;
import androidx.lifecycle.m;

/* JADX INFO: loaded from: classes.dex */
class g0 implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f2628a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d.a f2629b;

    g0(Object obj) {
        this.f2628a = obj;
        this.f2629b = d.f2607c.c(obj.getClass());
    }

    @Override // androidx.lifecycle.q
    public void k(t tVar, m.a aVar) {
        this.f2629b.a(tVar, aVar, this.f2628a);
    }
}
