package qe;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f25022a;

    public i(Object obj) {
        this.f25022a = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && rd.m.a(this.f25022a, ((i) obj).f25022a);
    }

    public int hashCode() {
        Object obj = this.f25022a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public String toString() {
        return "KmConstantValue(value=" + this.f25022a + ')';
    }
}
