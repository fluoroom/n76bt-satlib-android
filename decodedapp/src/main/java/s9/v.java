package s9;

import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class v extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final k f27079e = new v(new Object[0], 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f27080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f27081d;

    v(Object[] objArr, int i10) {
        this.f27080c = objArr;
        this.f27081d = i10;
    }

    @Override // s9.k, s9.j
    int c(Object[] objArr, int i10) {
        System.arraycopy(this.f27080c, 0, objArr, i10, this.f27081d);
        return i10 + this.f27081d;
    }

    @Override // s9.j
    Object[] d() {
        return this.f27080c;
    }

    @Override // s9.j
    int e() {
        return this.f27081d;
    }

    @Override // s9.j
    int f() {
        return 0;
    }

    @Override // s9.j
    boolean g() {
        return false;
    }

    @Override // java.util.List
    public Object get(int i10) {
        r9.l.l(i10, this.f27081d);
        Object obj = this.f27080c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f27081d;
    }
}
