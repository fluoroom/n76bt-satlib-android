package i7;

/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Object f15931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected a f15932b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected a f15933c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f15934d;

    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f15935a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f15936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        a f15937c;

        public a(Object obj, int i10) {
            this.f15935a = obj;
            this.f15936b = i10;
        }

        public int a(Object obj, int i10) {
            System.arraycopy(this.f15935a, 0, obj, i10, this.f15936b);
            return i10 + this.f15936b;
        }

        public Object b() {
            return this.f15935a;
        }

        public void c(a aVar) {
            if (this.f15937c != null) {
                throw new IllegalStateException();
            }
            this.f15937c = aVar;
        }

        public a d() {
            return this.f15937c;
        }
    }

    protected w() {
    }

    protected abstract Object a(int i10);

    protected void b() {
        a aVar = this.f15933c;
        if (aVar != null) {
            this.f15931a = aVar.b();
        }
        this.f15933c = null;
        this.f15932b = null;
        this.f15934d = 0;
    }

    public final Object c(Object obj, int i10) {
        a aVar = new a(obj, i10);
        if (this.f15932b == null) {
            this.f15933c = aVar;
            this.f15932b = aVar;
        } else {
            this.f15933c.c(aVar);
            this.f15933c = aVar;
        }
        this.f15934d += i10;
        return a(i10 < 16384 ? i10 + i10 : i10 + (i10 >> 2));
    }

    public int d() {
        return this.f15934d;
    }

    public Object e(Object obj, int i10) {
        int i11 = this.f15934d + i10;
        Object objA = a(i11);
        int iA = 0;
        for (a aVarD = this.f15932b; aVarD != null; aVarD = aVarD.d()) {
            iA = aVarD.a(objA, iA);
        }
        System.arraycopy(obj, 0, objA, iA, i10);
        int i12 = iA + i10;
        if (i12 == i11) {
            return objA;
        }
        throw new IllegalStateException("Should have gotten " + i11 + " entries, got " + i12);
    }

    public Object f() {
        b();
        Object obj = this.f15931a;
        return obj == null ? a(12) : obj;
    }
}
