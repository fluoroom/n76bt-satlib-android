package q8;

/* JADX INFO: loaded from: classes.dex */
public final class f extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final b f24403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f24404f;

    /* JADX WARN: Illegal instructions before constructor call */
    public f(b bVar, float f10) {
        b bVar2 = (b) v7.q.j(bVar, "bitmapDescriptor must not be null");
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("refWidth must be positive");
        }
        super(bVar2, f10);
        this.f24403e = bVar;
        this.f24404f = f10;
    }

    @Override // q8.e
    public String toString() {
        return "[CustomCap: bitmapDescriptor=" + String.valueOf(this.f24403e) + " refWidth=" + this.f24404f + "]";
    }
}
