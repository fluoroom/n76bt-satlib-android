package df;

/* JADX INFO: loaded from: classes3.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f11004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f11005b;

    public l(k kVar, boolean z10) {
        rd.m.e(kVar, "qualifier");
        this.f11004a = kVar;
        this.f11005b = z10;
    }

    public static /* synthetic */ l b(l lVar, k kVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            kVar = lVar.f11004a;
        }
        if ((i10 & 2) != 0) {
            z10 = lVar.f11005b;
        }
        return lVar.a(kVar, z10);
    }

    public final l a(k kVar, boolean z10) {
        rd.m.e(kVar, "qualifier");
        return new l(kVar, z10);
    }

    public final k c() {
        return this.f11004a;
    }

    public final boolean d() {
        return this.f11005b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return this.f11004a == lVar.f11004a && this.f11005b == lVar.f11005b;
    }

    public int hashCode() {
        return (this.f11004a.hashCode() * 31) + o4.b.a(this.f11005b);
    }

    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f11004a + ", isForWarningOnly=" + this.f11005b + ')';
    }

    public /* synthetic */ l(k kVar, boolean z10, int i10, rd.h hVar) {
        this(kVar, (i10 & 2) != 0 ? false : z10);
    }
}
