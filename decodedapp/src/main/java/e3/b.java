package e3;

/* JADX INFO: loaded from: classes.dex */
public final class b extends androidx.collection.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11410g;

    @Override // androidx.collection.i, java.util.Map
    public void clear() {
        this.f11410g = 0;
        super.clear();
    }

    @Override // androidx.collection.i
    public void g(androidx.collection.i iVar) {
        this.f11410g = 0;
        super.g(iVar);
    }

    @Override // androidx.collection.i
    public Object h(int i10) {
        this.f11410g = 0;
        return super.h(i10);
    }

    @Override // androidx.collection.i, java.util.Map
    public int hashCode() {
        if (this.f11410g == 0) {
            this.f11410g = super.hashCode();
        }
        return this.f11410g;
    }

    @Override // androidx.collection.i
    public Object i(int i10, Object obj) {
        this.f11410g = 0;
        return super.i(i10, obj);
    }

    @Override // androidx.collection.i, java.util.Map
    public Object put(Object obj, Object obj2) {
        this.f11410g = 0;
        return super.put(obj, obj2);
    }
}
