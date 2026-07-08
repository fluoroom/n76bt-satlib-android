package k8;

import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class p0 extends o0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final o0 f19515e = new p0(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f19516c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f19517d;

    p0(Object[] objArr, int i10) {
        this.f19516c = objArr;
        this.f19517d = i10;
    }

    @Override // k8.l0
    final Object[] b() {
        return this.f19516c;
    }

    @Override // k8.l0
    final int c() {
        return 0;
    }

    @Override // k8.l0
    final int d() {
        return this.f19517d;
    }

    @Override // k8.l0
    final boolean f() {
        return false;
    }

    @Override // k8.o0, k8.l0
    final int g(Object[] objArr, int i10) {
        System.arraycopy(this.f19516c, 0, objArr, 0, this.f19517d);
        return this.f19517d;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        i0.a(i10, this.f19517d, "index");
        Object obj = this.f19516c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f19517d;
    }
}
