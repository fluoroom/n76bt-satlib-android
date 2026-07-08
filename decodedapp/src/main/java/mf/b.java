package mf;

import rd.m;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f21989d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f21990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f21991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f21992c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public static /* synthetic */ b b(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return aVar.a(str, z10);
        }

        public final b a(String str, boolean z10) {
            String strF;
            String str2;
            m.e(str, "string");
            int iB0 = q.b0(str, '`', 0, false, 6, null);
            if (iB0 == -1) {
                iB0 = str.length();
            }
            int iI0 = q.i0(str, "/", iB0, false, 4, null);
            if (iI0 == -1) {
                strF = q.F(str, "`", "", false, 4, null);
                str2 = "";
            } else {
                String strSubstring = str.substring(0, iI0);
                m.d(strSubstring, "substring(...)");
                String strE = q.E(strSubstring, '/', '.', false, 4, null);
                String strSubstring2 = str.substring(iI0 + 1);
                m.d(strSubstring2, "substring(...)");
                strF = q.F(strSubstring2, "`", "", false, 4, null);
                str2 = strE;
            }
            return new b(new c(str2), new c(strF), z10);
        }

        public final b c(c cVar) {
            m.e(cVar, "topLevelFqName");
            return new b(cVar.d(), cVar.f());
        }

        private a() {
        }
    }

    public b(c cVar, c cVar2, boolean z10) {
        m.e(cVar, "packageFqName");
        m.e(cVar2, "relativeClassName");
        this.f21990a = cVar;
        this.f21991b = cVar2;
        this.f21992c = z10;
        cVar2.c();
    }

    private static final String c(c cVar) {
        String strA = cVar.a();
        if (!q.O(strA, '/', false, 2, null)) {
            return strA;
        }
        return '`' + strA + '`';
    }

    public static final b k(c cVar) {
        return f21989d.c(cVar);
    }

    public final c a() {
        if (this.f21990a.c()) {
            return this.f21991b;
        }
        return new c(this.f21990a.a() + '.' + this.f21991b.a());
    }

    public final String b() {
        if (this.f21990a.c()) {
            return c(this.f21991b);
        }
        return q.E(this.f21990a.a(), '.', '/', false, 4, null) + "/" + c(this.f21991b);
    }

    public final b d(f fVar) {
        m.e(fVar, "name");
        return new b(this.f21990a, this.f21991b.b(fVar), this.f21992c);
    }

    public final b e() {
        c cVarD = this.f21991b.d();
        if (cVarD.c()) {
            return null;
        }
        return new b(this.f21990a, cVarD, this.f21992c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return m.a(this.f21990a, bVar.f21990a) && m.a(this.f21991b, bVar.f21991b) && this.f21992c == bVar.f21992c;
    }

    public final c f() {
        return this.f21990a;
    }

    public final c g() {
        return this.f21991b;
    }

    public final f h() {
        return this.f21991b.f();
    }

    public int hashCode() {
        return (((this.f21990a.hashCode() * 31) + this.f21991b.hashCode()) * 31) + o4.b.a(this.f21992c);
    }

    public final boolean i() {
        return this.f21992c;
    }

    public final boolean j() {
        return !this.f21991b.d().c();
    }

    public String toString() {
        if (!this.f21990a.c()) {
            return b();
        }
        return '/' + b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(c cVar, f fVar) {
        this(cVar, c.f21993c.a(fVar), false);
        m.e(cVar, "packageFqName");
        m.e(fVar, "topLevelName");
    }
}
