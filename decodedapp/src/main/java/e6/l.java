package e6;

/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f11558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f11559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f11560c;

    protected l() {
    }

    public final int a() {
        int i10 = this.f11559b;
        if (i10 < 0) {
            return 0;
        }
        return i10;
    }

    public abstract String b();

    public abstract Object c();

    public final int d() {
        return this.f11559b + 1;
    }

    public final int e() {
        return this.f11560c;
    }

    public abstract l f();

    public boolean g() {
        return this.f11559b >= 0;
    }

    public final boolean h() {
        return this.f11558a == 1;
    }

    public final boolean i() {
        return this.f11558a == 2;
    }

    public final boolean j() {
        return this.f11558a == 0;
    }

    public abstract void k(Object obj);

    public String l() {
        int i10 = this.f11558a;
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? "?" : "Object" : "Array" : "root";
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        int i10 = this.f11558a;
        if (i10 == 0) {
            sb2.append("/");
        } else if (i10 != 1) {
            sb2.append('{');
            String strB = b();
            if (strB != null) {
                sb2.append('\"');
                i6.c.a(sb2, strB);
                sb2.append('\"');
            } else {
                sb2.append('?');
            }
            sb2.append('}');
        } else {
            sb2.append('[');
            sb2.append(a());
            sb2.append(']');
        }
        return sb2.toString();
    }

    protected l(l lVar) {
        this.f11558a = lVar.f11558a;
        this.f11559b = lVar.f11559b;
    }

    protected l(int i10, int i11) {
        this.f11558a = i10;
        this.f11559b = i11;
    }
}
