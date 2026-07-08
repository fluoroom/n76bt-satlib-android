package xd;

import rd.h;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends xd.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f31979e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final c f31980f = new c(1, 0);

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final c a() {
            return c.f31980f;
        }

        private a() {
        }
    }

    public c(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // xd.a
    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        if (isEmpty() && ((c) obj).isEmpty()) {
            return true;
        }
        c cVar = (c) obj;
        return b() == cVar.b() && c() == cVar.c();
    }

    public Integer g() {
        return Integer.valueOf(c());
    }

    public Integer h() {
        return Integer.valueOf(b());
    }

    @Override // xd.a
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (b() * 31) + c();
    }

    @Override // xd.a
    public boolean isEmpty() {
        return b() > c();
    }

    @Override // xd.a
    public String toString() {
        return b() + ".." + c();
    }
}
