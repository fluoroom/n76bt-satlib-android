package p6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class y implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final y f24079d = new y("", null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final y f24080e = new y(new String(""), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final String f24081a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f24082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e6.p f24083c;

    public y(String str) {
        this(str, null);
    }

    public static y a(String str) {
        return (str == null || str.isEmpty()) ? f24079d : new y(o6.g.f23241b.a(str), null);
    }

    public static y b(String str, String str2) {
        if (str == null) {
            str = "";
        }
        return (str2 == null && str.isEmpty()) ? f24079d : new y(o6.g.f23241b.a(str), str2);
    }

    public String c() {
        return this.f24081a;
    }

    public boolean d() {
        return this.f24082b != null;
    }

    public boolean e() {
        return !this.f24081a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        y yVar = (y) obj;
        String str = this.f24081a;
        if (str == null) {
            if (yVar.f24081a != null) {
                return false;
            }
        } else if (!str.equals(yVar.f24081a)) {
            return false;
        }
        String str2 = this.f24082b;
        return str2 == null ? yVar.f24082b == null : str2.equals(yVar.f24082b);
    }

    public boolean f(String str) {
        return this.f24081a.equals(str);
    }

    public y g() {
        String strA;
        return (this.f24081a.isEmpty() || (strA = o6.g.f23241b.a(this.f24081a)) == this.f24081a) ? this : new y(strA, this.f24082b);
    }

    public boolean h() {
        return this.f24082b == null && this.f24081a.isEmpty();
    }

    public int hashCode() {
        String str = this.f24082b;
        return str == null ? this.f24081a.hashCode() : str.hashCode() ^ this.f24081a.hashCode();
    }

    public e6.p i(r6.q qVar) {
        e6.p pVar = this.f24083c;
        if (pVar != null) {
            return pVar;
        }
        e6.p lVar = qVar == null ? new i6.l(this.f24081a) : qVar.d(this.f24081a);
        this.f24083c = lVar;
        return lVar;
    }

    public y j(String str) {
        if (str == null) {
            str = "";
        }
        return str.equals(this.f24081a) ? this : new y(str, this.f24082b);
    }

    public String toString() {
        if (this.f24082b == null) {
            return this.f24081a;
        }
        return "{" + this.f24082b + "}" + this.f24081a;
    }

    public y(String str, String str2) {
        this.f24081a = i7.h.a0(str);
        this.f24082b = str2;
    }
}
