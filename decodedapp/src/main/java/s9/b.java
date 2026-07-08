package s9;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class b extends t implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final r9.e f27029a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final t f27030b;

    b(r9.e eVar, t tVar) {
        this.f27029a = (r9.e) r9.l.n(eVar);
        this.f27030b = (t) r9.l.n(tVar);
    }

    @Override // s9.t, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f27030b.compare(this.f27029a.apply(obj), this.f27029a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f27029a.equals(bVar.f27029a) && this.f27030b.equals(bVar.f27030b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return r9.h.b(this.f27029a, this.f27030b);
    }

    public String toString() {
        return this.f27030b + ".onResultOf(" + this.f27029a + ")";
    }
}
