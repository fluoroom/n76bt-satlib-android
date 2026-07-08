package e6;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class x implements Comparable, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final x f11606g = new x(0, 0, 0, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f11607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final int f11608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f11609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final String f11610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final String f11611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final String f11612f;

    public x(int i10, int i11, int i12, String str, String str2, String str3) {
        this.f11607a = i10;
        this.f11608b = i11;
        this.f11609c = i12;
        this.f11612f = str;
        this.f11610d = str2 == null ? "" : str2;
        this.f11611e = str3 == null ? "" : str3;
    }

    public static x e() {
        return f11606g;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(x xVar) {
        if (xVar == this) {
            return 0;
        }
        int iCompareTo = this.f11610d.compareTo(xVar.f11610d);
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iCompareTo2 = this.f11611e.compareTo(xVar.f11611e);
        if (iCompareTo2 != 0) {
            return iCompareTo2;
        }
        int i10 = this.f11607a - xVar.f11607a;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f11608b - xVar.f11608b;
        return i11 == 0 ? this.f11609c - xVar.f11609c : i11;
    }

    public boolean d() {
        String str = this.f11612f;
        return str != null && str.length() > 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        x xVar = (x) obj;
        return xVar.f11607a == this.f11607a && xVar.f11608b == this.f11608b && xVar.f11609c == this.f11609c && xVar.f11611e.equals(this.f11611e) && xVar.f11610d.equals(this.f11610d);
    }

    public int hashCode() {
        return this.f11611e.hashCode() ^ (((this.f11610d.hashCode() + this.f11607a) - this.f11608b) + this.f11609c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f11607a);
        sb2.append('.');
        sb2.append(this.f11608b);
        sb2.append('.');
        sb2.append(this.f11609c);
        if (d()) {
            sb2.append('-');
            sb2.append(this.f11612f);
        }
        return sb2.toString();
    }
}
