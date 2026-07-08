package s9;

/* JADX INFO: loaded from: classes3.dex */
final class x extends m {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object[] f27096h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final x f27097r;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final transient Object[] f27098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient int f27099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final transient Object[] f27100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient int f27101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f27102g;

    static {
        Object[] objArr = new Object[0];
        f27096h = objArr;
        f27097r = new x(objArr, 0, objArr, 0, 0);
    }

    x(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f27098c = objArr;
        this.f27099d = i10;
        this.f27100e = objArr2;
        this.f27101f = i11;
        this.f27102g = i12;
    }

    @Override // s9.j
    int c(Object[] objArr, int i10) {
        System.arraycopy(this.f27098c, 0, objArr, i10, this.f27102g);
        return i10 + this.f27102g;
    }

    @Override // s9.j, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f27100e;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iB = i.b(obj);
        while (true) {
            int i10 = iB & this.f27101f;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iB = i10 + 1;
        }
    }

    @Override // s9.j
    Object[] d() {
        return this.f27098c;
    }

    @Override // s9.j
    int e() {
        return this.f27102g;
    }

    @Override // s9.j
    int f() {
        return 0;
    }

    @Override // s9.j
    boolean g() {
        return false;
    }

    @Override // s9.m, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f27099d;
    }

    @Override // s9.m
    k l() {
        return k.i(this.f27098c, this.f27102g);
    }

    @Override // s9.m
    boolean o() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f27102g;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public b0 iterator() {
        return b().iterator();
    }
}
