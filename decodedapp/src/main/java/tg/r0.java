package tg;

/* JADX INFO: loaded from: classes3.dex */
final class r0 implements b1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f27864a;

    public r0(boolean z10) {
        this.f27864a = z10;
    }

    @Override // tg.b1
    public boolean c() {
        return this.f27864a;
    }

    @Override // tg.b1
    public p1 d() {
        return null;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Empty{");
        sb2.append(c() ? "Active" : "New");
        sb2.append('}');
        return sb2.toString();
    }
}
