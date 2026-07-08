package mf;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import rd.m;
import rg.b0;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f21997e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final f f21998f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f21999g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f22000a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient c f22001b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient d f22002c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient f f22003d;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final d a(f fVar) {
            m.e(fVar, "shortName");
            String strD = fVar.d();
            m.d(strD, "asString(...)");
            return new d(strD, c.f21994d.i(), fVar, null);
        }

        private a() {
        }
    }

    static {
        f fVarK = f.k("<root>");
        m.d(fVarK, "special(...)");
        f21998f = fVarK;
        Pattern patternCompile = Pattern.compile("\\.");
        m.d(patternCompile, "compile(...)");
        f21999g = patternCompile;
    }

    public /* synthetic */ d(String str, d dVar, f fVar, rd.h hVar) {
        this(str, dVar, fVar);
    }

    private final void c() {
        int iD = d(this.f22000a);
        if (iD < 0) {
            this.f22003d = f.g(this.f22000a);
            this.f22002c = c.f21994d.i();
            return;
        }
        String strSubstring = this.f22000a.substring(iD + 1);
        m.d(strSubstring, "substring(...)");
        this.f22003d = f.g(strSubstring);
        String strSubstring2 = this.f22000a.substring(0, iD);
        m.d(strSubstring2, "substring(...)");
        this.f22002c = new d(strSubstring2);
    }

    private final int d(String str) {
        int length = str.length() - 1;
        boolean z10 = false;
        while (length >= 0) {
            char cCharAt = str.charAt(length);
            if (cCharAt == '.' && !z10) {
                return length;
            }
            if (cCharAt == '`') {
                z10 = !z10;
            } else if (cCharAt == '\\') {
                length--;
            }
            length--;
        }
        return -1;
    }

    private static final List i(d dVar) {
        if (dVar.e()) {
            return new ArrayList();
        }
        List listI = i(dVar.g());
        listI.add(dVar.j());
        return listI;
    }

    public final String a() {
        return this.f22000a;
    }

    public final d b(f fVar) {
        String strD;
        m.e(fVar, "name");
        if (e()) {
            strD = fVar.d();
        } else {
            strD = this.f22000a + '.' + fVar.d();
        }
        m.b(strD);
        return new d(strD, this, fVar);
    }

    public final boolean e() {
        return this.f22000a.length() == 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && m.a(this.f22000a, ((d) obj).f22000a);
    }

    public final boolean f() {
        return this.f22001b != null || q.b0(a(), '<', 0, false, 6, null) < 0;
    }

    public final d g() {
        d dVar = this.f22002c;
        if (dVar != null) {
            return dVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        c();
        d dVar2 = this.f22002c;
        m.b(dVar2);
        return dVar2;
    }

    public final List h() {
        return i(this);
    }

    public int hashCode() {
        return this.f22000a.hashCode();
    }

    public final f j() {
        f fVar = this.f22003d;
        if (fVar != null) {
            return fVar;
        }
        if (e()) {
            throw new IllegalStateException("root");
        }
        c();
        f fVar2 = this.f22003d;
        m.b(fVar2);
        return fVar2;
    }

    public final f k() {
        return e() ? f21998f : j();
    }

    public final boolean l(f fVar) {
        m.e(fVar, "segment");
        if (e()) {
            return false;
        }
        int iB0 = q.b0(this.f22000a, '.', 0, false, 6, null);
        if (iB0 == -1) {
            iB0 = this.f22000a.length();
        }
        int i10 = iB0;
        String strD = fVar.d();
        m.d(strD, "asString(...)");
        return i10 == strD.length() && b0.z(this.f22000a, 0, strD, 0, i10, (16 & 16) != 0 ? false : false);
    }

    public final c m() {
        c cVar = this.f22001b;
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(this);
        this.f22001b = cVar2;
        return cVar2;
    }

    public String toString() {
        if (!e()) {
            return this.f22000a;
        }
        String strD = f21998f.d();
        m.d(strD, "asString(...)");
        return strD;
    }

    public d(String str, c cVar) {
        m.e(str, "fqName");
        m.e(cVar, "safe");
        this.f22000a = str;
        this.f22001b = cVar;
    }

    public d(String str) {
        m.e(str, "fqName");
        this.f22000a = str;
    }

    private d(String str, d dVar, f fVar) {
        this.f22000a = str;
        this.f22002c = dVar;
        this.f22003d = fVar;
    }
}
