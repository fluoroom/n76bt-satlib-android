package vh;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements Comparable {

    /* JADX INFO: renamed from: b */
    public static final a f30784b = new a(null);

    /* JADX INFO: renamed from: c */
    public static final String f30785c;

    /* JADX INFO: renamed from: a */
    private final h f30786a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public static /* synthetic */ e0 d(a aVar, File file, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.a(file, z10);
        }

        public static /* synthetic */ e0 e(a aVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.b(str, z10);
        }

        public static /* synthetic */ e0 f(a aVar, Path path, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                z10 = false;
            }
            return aVar.c(path, z10);
        }

        public final e0 a(File file, boolean z10) {
            rd.m.e(file, "<this>");
            String string = file.toString();
            rd.m.d(string, "toString(...)");
            return b(string, z10);
        }

        public final e0 b(String str, boolean z10) {
            rd.m.e(str, "<this>");
            return wh.e.k(str, z10);
        }

        public final e0 c(Path path, boolean z10) {
            rd.m.e(path, "<this>");
            return b(path.toString(), z10);
        }

        private a() {
        }
    }

    static {
        String str = File.separator;
        rd.m.d(str, "separator");
        f30785c = str;
    }

    public e0(h hVar) {
        rd.m.e(hVar, "bytes");
        this.f30786a = hVar;
    }

    public static /* synthetic */ e0 m(e0 e0Var, e0 e0Var2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return e0Var.l(e0Var2, z10);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a */
    public int compareTo(e0 e0Var) {
        rd.m.e(e0Var, "other");
        return d().compareTo(e0Var.d());
    }

    public final h d() {
        return this.f30786a;
    }

    public final e0 e() {
        int iO = wh.e.o(this);
        if (iO == -1) {
            return null;
        }
        return new e0(d().T(0, iO));
    }

    public boolean equals(Object obj) {
        return (obj instanceof e0) && rd.m.a(((e0) obj).d(), d());
    }

    public final List f() {
        ArrayList arrayList = new ArrayList();
        int iO = wh.e.o(this);
        if (iO == -1) {
            iO = 0;
        } else if (iO < d().Q() && d().h(iO) == 92) {
            iO++;
        }
        int iQ = d().Q();
        int i10 = iO;
        while (iO < iQ) {
            if (d().h(iO) == 47 || d().h(iO) == 92) {
                arrayList.add(d().T(i10, iO));
                i10 = iO + 1;
            }
            iO++;
        }
        if (i10 < d().Q()) {
            arrayList.add(d().T(i10, d().Q()));
        }
        return arrayList;
    }

    public final String g() {
        return h().Z();
    }

    public final h h() {
        int iL = wh.e.l(this);
        return iL != -1 ? h.W(d(), iL + 1, 0, 2, null) : (q() == null || d().Q() != 2) ? d() : h.f30793e;
    }

    public int hashCode() {
        return d().hashCode();
    }

    public final e0 i() {
        if (rd.m.a(d(), wh.e.f31442d) || rd.m.a(d(), wh.e.f31439a) || rd.m.a(d(), wh.e.f31440b) || wh.e.n(this)) {
            return null;
        }
        int iL = wh.e.l(this);
        if (iL == 2 && q() != null) {
            if (d().Q() == 3) {
                return null;
            }
            return new e0(h.W(d(), 0, 3, 1, null));
        }
        if (iL == 1 && d().R(wh.e.f31440b)) {
            return null;
        }
        if (iL != -1 || q() == null) {
            return iL == -1 ? new e0(wh.e.f31442d) : iL == 0 ? new e0(h.W(d(), 0, 1, 1, null)) : new e0(h.W(d(), 0, iL, 1, null));
        }
        if (d().Q() == 2) {
            return null;
        }
        return new e0(h.W(d(), 0, 2, 1, null));
    }

    public final boolean isAbsolute() {
        return wh.e.o(this) != -1;
    }

    public final e0 j(e0 e0Var) {
        rd.m.e(e0Var, "other");
        if (!rd.m.a(e(), e0Var.e())) {
            throw new IllegalArgumentException(("Paths of different roots cannot be relative to each other: " + this + " and " + e0Var).toString());
        }
        List listF = f();
        List listF2 = e0Var.f();
        int iMin = Math.min(listF.size(), listF2.size());
        int i10 = 0;
        while (i10 < iMin && rd.m.a(listF.get(i10), listF2.get(i10))) {
            i10++;
        }
        if (i10 == iMin && d().Q() == e0Var.d().Q()) {
            return a.e(f30784b, ".", false, 1, null);
        }
        if (listF2.subList(i10, listF2.size()).indexOf(wh.e.f31443e) != -1) {
            throw new IllegalArgumentException(("Impossible relative path to resolve: " + this + " and " + e0Var).toString());
        }
        if (rd.m.a(e0Var.d(), wh.e.f31442d)) {
            return this;
        }
        e eVar = new e();
        h hVarM = wh.e.m(e0Var);
        if (hVarM == null && (hVarM = wh.e.m(this)) == null) {
            hVarM = wh.e.s(f30785c);
        }
        int size = listF2.size();
        for (int i11 = i10; i11 < size; i11++) {
            eVar.Z(wh.e.f31443e);
            eVar.Z(hVarM);
        }
        int size2 = listF.size();
        while (i10 < size2) {
            eVar.Z((h) listF.get(i10));
            eVar.Z(hVarM);
            i10++;
        }
        return wh.e.q(eVar, false);
    }

    public final e0 k(String str) {
        rd.m.e(str, "child");
        return wh.e.j(this, wh.e.q(new e().J(str), false), false);
    }

    public final e0 l(e0 e0Var, boolean z10) {
        rd.m.e(e0Var, "child");
        return wh.e.j(this, e0Var, z10);
    }

    public final Path n() {
        Path path = Paths.get(toString(), new String[0]);
        rd.m.d(path, "get(...)");
        return path;
    }

    public final Character q() {
        if (h.s(d(), wh.e.f31439a, 0, 2, null) != -1 || d().Q() < 2 || d().h(1) != 58) {
            return null;
        }
        char cH = (char) d().h(0);
        if (('a' > cH || cH >= '{') && ('A' > cH || cH >= '[')) {
            return null;
        }
        return Character.valueOf(cH);
    }

    public final File toFile() {
        return new File(toString());
    }

    public String toString() {
        return d().Z();
    }
}
