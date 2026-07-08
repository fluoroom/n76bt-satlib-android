package l0;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20317b;

    public c(Object obj, Object obj2) {
        this.f20316a = obj;
        this.f20317b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return b.a(cVar.f20316a, this.f20316a) && b.a(cVar.f20317b, this.f20317b);
    }

    public int hashCode() {
        Object obj = this.f20316a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f20317b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f20316a + " " + this.f20317b + "}";
    }
}
