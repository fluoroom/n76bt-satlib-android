package e6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class h implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h f11524g = new h(i6.e.r(), -1, -1, -1, -1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final long f11525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final long f11526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f11527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f11528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final i6.e f11529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected transient String f11530f;

    public h(i6.e eVar, long j10, int i10, int i11) {
        this(eVar, -1L, j10, i10, i11);
    }

    public StringBuilder a(StringBuilder sb2) {
        if (this.f11529e.n()) {
            sb2.append("line: ");
            int i10 = this.f11527c;
            if (i10 >= 0) {
                sb2.append(i10);
            } else {
                sb2.append("UNKNOWN");
            }
            sb2.append(", column: ");
            int i11 = this.f11528d;
            if (i11 >= 0) {
                sb2.append(i11);
                return sb2;
            }
            sb2.append("UNKNOWN");
            return sb2;
        }
        if (this.f11527c > 0) {
            sb2.append("line: ");
            sb2.append(this.f11527c);
            if (this.f11528d > 0) {
                sb2.append(", column: ");
                sb2.append(this.f11528d);
            }
            return sb2;
        }
        sb2.append("byte offset: #");
        long j10 = this.f11525a;
        if (j10 >= 0) {
            sb2.append(j10);
            return sb2;
        }
        sb2.append("UNKNOWN");
        return sb2;
    }

    public String b() {
        if (this.f11530f == null) {
            this.f11530f = this.f11529e.h();
        }
        return this.f11530f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        i6.e eVar = this.f11529e;
        if (eVar == null) {
            if (hVar.f11529e != null) {
                return false;
            }
        } else if (!eVar.equals(hVar.f11529e)) {
            return false;
        }
        return this.f11527c == hVar.f11527c && this.f11528d == hVar.f11528d && this.f11526b == hVar.f11526b && this.f11525a == hVar.f11525a;
    }

    public int hashCode() {
        return ((((this.f11529e == null ? 1 : 2) ^ this.f11527c) + this.f11528d) ^ ((int) this.f11526b)) + ((int) this.f11525a);
    }

    public String toString() {
        String strB = b();
        StringBuilder sb2 = new StringBuilder(strB.length() + 40);
        sb2.append("[Source: ");
        sb2.append(strB);
        sb2.append("; ");
        StringBuilder sbA = a(sb2);
        sbA.append(']');
        return sbA.toString();
    }

    public h(i6.e eVar, long j10, long j11, int i10, int i11) {
        this.f11529e = eVar == null ? i6.e.r() : eVar;
        this.f11525a = j10;
        this.f11526b = j11;
        this.f11527c = i10;
        this.f11528d = i11;
    }
}
