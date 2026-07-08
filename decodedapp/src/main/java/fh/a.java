package fh;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13096a = new a();

    private a() {
        super(null);
    }

    @Override // fh.f
    public Object a(yd.c cVar) {
        rd.m.e(cVar, "key");
        return null;
    }

    @Override // fh.f
    public f b(yd.c cVar, Object obj) {
        rd.m.e(cVar, "key");
        return obj != null ? new e(cVar, obj, this) : this;
    }

    public String toString() {
        return "{}";
    }
}
