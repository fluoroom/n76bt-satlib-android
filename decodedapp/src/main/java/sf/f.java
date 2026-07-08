package sf;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final mf.b f27331a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f27332b;

    public f(mf.b bVar, int i10) {
        rd.m.e(bVar, "classId");
        this.f27331a = bVar;
        this.f27332b = i10;
    }

    public final mf.b a() {
        return this.f27331a;
    }

    public final int b() {
        return this.f27332b;
    }

    public final int c() {
        return this.f27332b;
    }

    public final mf.b d() {
        return this.f27331a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return rd.m.a(this.f27331a, fVar.f27331a) && this.f27332b == fVar.f27332b;
    }

    public int hashCode() {
        return (this.f27331a.hashCode() * 31) + this.f27332b;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i10 = this.f27332b;
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f27331a);
        int i12 = this.f27332b;
        for (int i13 = 0; i13 < i12; i13++) {
            sb2.append(">");
        }
        return sb2.toString();
    }
}
