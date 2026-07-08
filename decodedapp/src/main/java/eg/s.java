package eg;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ie.h f12170a;

    public s(ie.h hVar) {
        rd.m.e(hVar, "annotations");
        this.f12170a = hVar;
    }

    @Override // eg.o1
    public yd.c b() {
        return rd.c0.b(s.class);
    }

    @Override // eg.o1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public s a(s sVar) {
        return sVar == null ? this : new s(ie.j.a(this.f12170a, sVar.f12170a));
    }

    public final ie.h e() {
        return this.f12170a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            return rd.m.a(((s) obj).f12170a, this.f12170a);
        }
        return false;
    }

    @Override // eg.o1
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public s c(s sVar) {
        if (rd.m.a(sVar, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f12170a.hashCode();
    }
}
