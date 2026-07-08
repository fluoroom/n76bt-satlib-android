package ve;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final df.l f30709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection f30710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f30711c;

    public w(df.l lVar, Collection collection, boolean z10) {
        rd.m.e(lVar, "nullabilityQualifier");
        rd.m.e(collection, "qualifierApplicabilityTypes");
        this.f30709a = lVar;
        this.f30710b = collection;
        this.f30711c = z10;
    }

    public static /* synthetic */ w b(w wVar, df.l lVar, Collection collection, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = wVar.f30709a;
        }
        if ((i10 & 2) != 0) {
            collection = wVar.f30710b;
        }
        if ((i10 & 4) != 0) {
            z10 = wVar.f30711c;
        }
        return wVar.a(lVar, collection, z10);
    }

    public final w a(df.l lVar, Collection collection, boolean z10) {
        rd.m.e(lVar, "nullabilityQualifier");
        rd.m.e(collection, "qualifierApplicabilityTypes");
        return new w(lVar, collection, z10);
    }

    public final boolean c() {
        return this.f30711c;
    }

    public final df.l d() {
        return this.f30709a;
    }

    public final Collection e() {
        return this.f30710b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return rd.m.a(this.f30709a, wVar.f30709a) && rd.m.a(this.f30710b, wVar.f30710b) && this.f30711c == wVar.f30711c;
    }

    public int hashCode() {
        return (((this.f30709a.hashCode() * 31) + this.f30710b.hashCode()) * 31) + o4.b.a(this.f30711c);
    }

    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f30709a + ", qualifierApplicabilityTypes=" + this.f30710b + ", definitelyNotNull=" + this.f30711c + ')';
    }

    public /* synthetic */ w(df.l lVar, Collection collection, boolean z10, int i10, rd.h hVar) {
        this(lVar, collection, (i10 & 4) != 0 ? lVar.c() == df.k.f10999c : z10);
    }
}
