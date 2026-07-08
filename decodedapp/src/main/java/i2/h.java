package i2;

import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class h implements f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.collection.a f15756b = new e3.b();

    private static void f(g gVar, Object obj, MessageDigest messageDigest) {
        gVar.g(obj, messageDigest);
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        for (int i10 = 0; i10 < this.f15756b.size(); i10++) {
            f((g) this.f15756b.f(i10), this.f15756b.j(i10), messageDigest);
        }
    }

    public Object c(g gVar) {
        return this.f15756b.containsKey(gVar) ? this.f15756b.get(gVar) : gVar.c();
    }

    public void d(h hVar) {
        this.f15756b.g(hVar.f15756b);
    }

    public h e(g gVar, Object obj) {
        this.f15756b.put(gVar, obj);
        return this;
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f15756b.equals(((h) obj).f15756b);
        }
        return false;
    }

    @Override // i2.f
    public int hashCode() {
        return this.f15756b.hashCode();
    }

    public String toString() {
        return "Options{values=" + this.f15756b + '}';
    }
}
