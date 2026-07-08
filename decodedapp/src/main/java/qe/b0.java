package qe;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f24934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24936c;

    public b0(int i10, int i11, int i12) {
        this.f24934a = i10;
        this.f24935b = i11;
        this.f24936c = i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return this.f24934a == b0Var.f24934a && this.f24935b == b0Var.f24935b && this.f24936c == b0Var.f24936c;
    }

    public int hashCode() {
        return (((this.f24934a * 31) + this.f24935b) * 31) + this.f24936c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f24934a);
        sb2.append('.');
        sb2.append(this.f24935b);
        sb2.append('.');
        sb2.append(this.f24936c);
        return sb2.toString();
    }
}
