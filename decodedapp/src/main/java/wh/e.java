package wh;

import dd.d0;
import java.io.EOFException;
import java.util.ArrayList;
import vh.e0;
import vh.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a */
    private static final vh.h f31439a;

    /* JADX INFO: renamed from: b */
    private static final vh.h f31440b;

    /* JADX INFO: renamed from: c */
    private static final vh.h f31441c;

    /* JADX INFO: renamed from: d */
    private static final vh.h f31442d;

    /* JADX INFO: renamed from: e */
    private static final vh.h f31443e;

    static {
        h.a aVar = vh.h.f30792d;
        f31439a = aVar.d("/");
        f31440b = aVar.d("\\");
        f31441c = aVar.d("/\\");
        f31442d = aVar.d(".");
        f31443e = aVar.d("..");
    }

    public static final e0 j(e0 e0Var, e0 e0Var2, boolean z10) {
        rd.m.e(e0Var, "<this>");
        rd.m.e(e0Var2, "child");
        if (e0Var2.isAbsolute() || e0Var2.q() != null) {
            return e0Var2;
        }
        vh.h hVarM = m(e0Var);
        if (hVarM == null && (hVarM = m(e0Var2)) == null) {
            hVarM = s(e0.f30785c);
        }
        vh.e eVar = new vh.e();
        eVar.Z(e0Var.d());
        if (eVar.size() > 0) {
            eVar.Z(hVarM);
        }
        eVar.Z(e0Var2.d());
        return q(eVar, z10);
    }

    public static final e0 k(String str, boolean z10) {
        rd.m.e(str, "<this>");
        return q(new vh.e().J(str), z10);
    }

    public static final int l(e0 e0Var) {
        int iC = vh.h.C(e0Var.d(), f31439a, 0, 2, null);
        return iC != -1 ? iC : vh.h.C(e0Var.d(), f31440b, 0, 2, null);
    }

    public static final vh.h m(e0 e0Var) {
        vh.h hVarD = e0Var.d();
        vh.h hVar = f31439a;
        if (vh.h.s(hVarD, hVar, 0, 2, null) != -1) {
            return hVar;
        }
        vh.h hVarD2 = e0Var.d();
        vh.h hVar2 = f31440b;
        if (vh.h.s(hVarD2, hVar2, 0, 2, null) != -1) {
            return hVar2;
        }
        return null;
    }

    public static final boolean n(e0 e0Var) {
        return e0Var.d().g(f31443e) && (e0Var.d().Q() == 2 || e0Var.d().H(e0Var.d().Q() + (-3), f31439a, 0, 1) || e0Var.d().H(e0Var.d().Q() + (-3), f31440b, 0, 1));
    }

    public static final int o(e0 e0Var) {
        if (e0Var.d().Q() == 0) {
            return -1;
        }
        if (e0Var.d().h(0) == 47) {
            return 1;
        }
        if (e0Var.d().h(0) == 92) {
            if (e0Var.d().Q() <= 2 || e0Var.d().h(1) != 92) {
                return 1;
            }
            int iQ = e0Var.d().q(f31440b, 2);
            return iQ == -1 ? e0Var.d().Q() : iQ;
        }
        if (e0Var.d().Q() > 2 && e0Var.d().h(1) == 58 && e0Var.d().h(2) == 92) {
            char cH = (char) e0Var.d().h(0);
            if ('a' <= cH && cH < '{') {
                return 3;
            }
            if ('A' <= cH && cH < '[') {
                return 3;
            }
        }
        return -1;
    }

    private static final boolean p(vh.e eVar, vh.h hVar) {
        if (!rd.m.a(hVar, f31440b) || eVar.size() < 2 || eVar.G(1L) != 58) {
            return false;
        }
        char cG = (char) eVar.G(0L);
        if ('a' > cG || cG >= '{') {
            return 'A' <= cG && cG < '[';
        }
        return true;
    }

    public static final e0 q(vh.e eVar, boolean z10) throws EOFException {
        vh.h hVar;
        vh.h hVarP;
        rd.m.e(eVar, "<this>");
        vh.e eVar2 = new vh.e();
        vh.h hVarR = null;
        int i10 = 0;
        while (true) {
            if (!eVar.h0(0L, f31439a)) {
                hVar = f31440b;
                if (!eVar.h0(0L, hVar)) {
                    break;
                }
            }
            byte b10 = eVar.readByte();
            if (hVarR == null) {
                hVarR = r(b10);
            }
            i10++;
        }
        boolean z11 = i10 >= 2 && rd.m.a(hVarR, hVar);
        if (z11) {
            rd.m.b(hVarR);
            eVar2.Z(hVarR);
            eVar2.Z(hVarR);
        } else if (i10 > 0) {
            rd.m.b(hVarR);
            eVar2.Z(hVarR);
        } else {
            long jT = eVar.T(f31441c);
            if (hVarR == null) {
                hVarR = jT == -1 ? s(e0.f30785c) : r(eVar.G(jT));
            }
            if (p(eVar, hVarR)) {
                if (jT == 2) {
                    eVar2.C(eVar, 3L);
                } else {
                    eVar2.C(eVar, 2L);
                }
            }
            d0 d0Var = d0.f10897a;
        }
        boolean z12 = eVar2.size() > 0;
        ArrayList arrayList = new ArrayList();
        while (!eVar.z()) {
            long jT2 = eVar.T(f31441c);
            if (jT2 == -1) {
                hVarP = eVar.Q();
            } else {
                hVarP = eVar.p(jT2);
                eVar.readByte();
            }
            vh.h hVar2 = f31443e;
            if (rd.m.a(hVarP, hVar2)) {
                if (!z12 || !arrayList.isEmpty()) {
                    if (!z10 || (!z12 && (arrayList.isEmpty() || rd.m.a(ed.q.k0(arrayList), hVar2)))) {
                        arrayList.add(hVarP);
                    } else if (!z11 || arrayList.size() != 1) {
                        ed.q.F(arrayList);
                    }
                }
            } else if (!rd.m.a(hVarP, f31442d) && !rd.m.a(hVarP, vh.h.f30793e)) {
                arrayList.add(hVarP);
            }
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (i11 > 0) {
                eVar2.Z(hVarR);
            }
            eVar2.Z((vh.h) arrayList.get(i11));
        }
        if (eVar2.size() == 0) {
            eVar2.Z(f31442d);
        }
        return new e0(eVar2.Q());
    }

    private static final vh.h r(byte b10) {
        if (b10 == 47) {
            return f31439a;
        }
        if (b10 == 92) {
            return f31440b;
        }
        throw new IllegalArgumentException("not a directory separator: " + ((int) b10));
    }

    public static final vh.h s(String str) {
        if (rd.m.a(str, "/")) {
            return f31439a;
        }
        if (rd.m.a(str, "\\")) {
            return f31440b;
        }
        throw new IllegalArgumentException("not a directory separator: " + str);
    }
}
