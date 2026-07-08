package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends h implements java.util.Set, Set {
    private static final long serialVersionUID = 487447009682186044L;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f17824b) {
            zEquals = this.f17823a.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f17824b) {
            iHashCode = this.f17823a.hashCode();
        }
        return iHashCode;
    }
}
