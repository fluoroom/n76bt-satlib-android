package s9;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
final class e extends t implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Comparator f27031a;

    e(Comparator comparator) {
        this.f27031a = (Comparator) r9.l.n(comparator);
    }

    @Override // s9.t, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f27031a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            return this.f27031a.equals(((e) obj).f27031a);
        }
        return false;
    }

    public int hashCode() {
        return this.f27031a.hashCode();
    }

    public String toString() {
        return this.f27031a.toString();
    }
}
