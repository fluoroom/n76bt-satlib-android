package vf;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f30725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private mf.c f30726b;

    private d(String str) {
        if (str == null) {
            a(7);
        }
        this.f30725a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0018  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ void a(int r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: vf.d.a(int):void");
    }

    public static d b(mf.b bVar) {
        if (bVar == null) {
            a(1);
        }
        return new d(h(bVar));
    }

    public static d c(mf.c cVar) {
        if (cVar == null) {
            a(4);
        }
        d dVar = new d(cVar.a().replace('.', '/'));
        dVar.f30726b = cVar;
        return dVar;
    }

    public static d d(String str) {
        if (str == null) {
            a(0);
        }
        return new d(str);
    }

    public static String h(mf.b bVar) {
        if (bVar == null) {
            a(2);
        }
        mf.c cVarF = bVar.f();
        String strReplace = bVar.g().a().replace('.', '$');
        if (!cVarF.c()) {
            strReplace = cVarF.a().replace('.', '/') + "/" + strReplace;
        }
        if (strReplace == null) {
            a(3);
        }
        return strReplace;
    }

    public mf.c e() {
        return new mf.c(this.f30725a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f30725a.equals(((d) obj).f30725a);
    }

    public String f() {
        String str = this.f30725a;
        if (str == null) {
            a(10);
        }
        return str;
    }

    public mf.c g() {
        int iLastIndexOf = this.f30725a.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new mf.c(this.f30725a.substring(0, iLastIndexOf).replace('/', '.'));
        }
        mf.c cVar = mf.c.f21994d;
        if (cVar == null) {
            a(9);
        }
        return cVar;
    }

    public int hashCode() {
        return this.f30725a.hashCode();
    }

    public String toString() {
        return this.f30725a;
    }
}
