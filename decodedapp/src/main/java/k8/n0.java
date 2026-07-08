package k8;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
final class n0 extends o0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient int f19509c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient int f19510d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ o0 f19511e;

    n0(o0 o0Var, int i10, int i11) {
        this.f19511e = o0Var;
        this.f19509c = i10;
        this.f19510d = i11;
    }

    @Override // k8.l0
    final Object[] b() {
        return this.f19511e.b();
    }

    @Override // k8.l0
    final int c() {
        return this.f19511e.c() + this.f19509c;
    }

    @Override // k8.l0
    final int d() {
        return this.f19511e.c() + this.f19509c + this.f19510d;
    }

    @Override // k8.l0
    final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i0.a(i10, this.f19510d, "index");
        return this.f19511e.get(i10 + this.f19509c);
    }

    @Override // k8.o0
    /* JADX INFO: renamed from: h */
    public final o0 subList(int i10, int i11) {
        i0.c(i10, i11, this.f19510d);
        int i12 = this.f19509c;
        return this.f19511e.subList(i10 + i12, i11 + i12);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19510d;
    }

    @Override // k8.o0, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
