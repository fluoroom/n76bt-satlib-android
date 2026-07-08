package yj;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class j implements Serializable, Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final j f32681c = new j(i.f32660d, w.f32744f);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ak.a f32682d = new ak.a(4, true);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ak.a f32683e = new ak.a(2, true);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f32684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f32685b;

    public j(i iVar, w wVar) {
        this.f32684a = iVar;
        this.f32685b = wVar;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        int iCompareTo = this.f32684a.compareTo(jVar.f32684a);
        if (iCompareTo < 0) {
            return -1;
        }
        if (iCompareTo > 0) {
            return 1;
        }
        return this.f32685b.compareTo(jVar.f32685b);
    }

    public i d() {
        return this.f32684a;
    }

    public w e() {
        return this.f32685b;
    }

    public boolean equals(Object obj) {
        try {
            j jVar = (j) obj;
            if (jVar != null && this.f32684a.equals(jVar.f32684a)) {
                if (this.f32685b.equals(jVar.f32685b)) {
                    return true;
                }
            }
        } catch (ClassCastException unused) {
        }
        return false;
    }

    public double f(j jVar) {
        return (((double) (this.f32684a.f() - jVar.f32684a.f())) * 86400.0d) + this.f32685b.j().O(jVar.f32685b.j()).Q();
    }

    public String g() {
        return this.f32684a.toString() + 'T' + this.f32685b.k();
    }

    public int hashCode() {
        return (this.f32684a.hashCode() << 16) ^ this.f32685b.hashCode();
    }

    public String toString() {
        return this.f32684a.toString() + 'T' + this.f32685b.toString();
    }
}
