package bh;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final k f4064c = new k(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private j f4065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private j f4066b;

    public k(j jVar, j jVar2) {
        this.f4065a = jVar;
        this.f4066b = jVar2;
    }

    public static k a(j jVar) {
        return new k(jVar, null);
    }

    public boolean b(j jVar) {
        j jVar2 = this.f4065a;
        if (jVar2 != null && jVar2.compareTo(jVar) > 0) {
            return false;
        }
        j jVar3 = this.f4066b;
        return jVar3 == null || jVar3.compareTo(jVar) >= 0;
    }

    public boolean c(String str) {
        return b(j.e(str));
    }

    public String toString() {
        if (this.f4065a == null) {
            if (this.f4066b == null) {
                return "any version";
            }
            return this.f4066b.toString() + " or lower";
        }
        if (this.f4066b == null) {
            return this.f4065a.toString() + " or higher";
        }
        return "between " + this.f4065a + " and " + this.f4066b;
    }
}
