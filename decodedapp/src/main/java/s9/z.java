package s9;

/* JADX INFO: loaded from: classes3.dex */
final class z extends m {

    /* JADX INFO: renamed from: c */
    final transient Object f27103c;

    z(Object obj) {
        this.f27103c = r9.l.n(obj);
    }

    @Override // s9.m, s9.j
    public k b() {
        return k.z(this.f27103c);
    }

    @Override // s9.j
    int c(Object[] objArr, int i10) {
        objArr[i10] = this.f27103c;
        return i10 + 1;
    }

    @Override // s9.j, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f27103c.equals(obj);
    }

    @Override // s9.j
    boolean g() {
        return false;
    }

    @Override // s9.m, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f27103c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: t */
    public b0 iterator() {
        return o.g(this.f27103c);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f27103c.toString() + ']';
    }
}
