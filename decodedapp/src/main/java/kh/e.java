package kh;

import eh.h0;
import eh.n;
import eh.o;
import eh.y;
import eh.z;
import fh.p;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.List;
import rd.m;
import rg.q;
import vh.h;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final vh.h f19938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final vh.h f19939b;

    static {
        h.a aVar = vh.h.f30792d;
        f19938a = aVar.d("\"\\");
        f19939b = aVar.d("\t ,=");
    }

    public static final List a(y yVar, String str) {
        m.e(yVar, "<this>");
        m.e(str, "headerName");
        ArrayList arrayList = new ArrayList();
        int size = yVar.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (q.x(str, yVar.d(i10), true)) {
                try {
                    c(new vh.e().J(yVar.g(i10)), arrayList);
                } catch (EOFException e10) {
                    okhttp3.internal.platform.c.f23684a.e().m("Unable to parse challenge", 5, e10);
                }
            }
        }
        return arrayList;
    }

    public static final boolean b(h0 h0Var) {
        m.e(h0Var, "<this>");
        if (m.a(h0Var.p0().i(), "HEAD")) {
            return false;
        }
        int iN = h0Var.n();
        return (((iN >= 100 && iN < 200) || iN == 204 || iN == 304) && p.k(h0Var) == -1 && !q.x("chunked", h0.w(h0Var, "Transfer-Encoding", null, 2, null), true)) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00bc, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void c(vh.e r7, java.util.List r8) throws java.io.EOFException {
        /*
            r0 = 0
        L1:
            r1 = r0
        L2:
            if (r1 != 0) goto Lf
            g(r7)
            java.lang.String r1 = e(r7)
            if (r1 != 0) goto Lf
            goto Lb9
        Lf:
            boolean r2 = g(r7)
            java.lang.String r3 = e(r7)
            if (r3 != 0) goto L2e
            boolean r7 = r7.z()
            if (r7 != 0) goto L21
            goto Lb9
        L21:
            eh.i r7 = new eh.i
            java.util.Map r0 = ed.k0.i()
            r7.<init>(r1, r0)
            r8.add(r7)
            return
        L2e:
            r4 = 61
            int r5 = fh.m.B(r7, r4)
            boolean r6 = g(r7)
            if (r2 != 0) goto L69
            if (r6 != 0) goto L42
            boolean r2 = r7.z()
            if (r2 == 0) goto L69
        L42:
            eh.i r2 = new eh.i
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r3)
            java.lang.String r3 = "="
            java.lang.String r3 = rg.q.B(r3, r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.util.Map r3 = java.util.Collections.singletonMap(r0, r3)
            java.lang.String r4 = "singletonMap(...)"
            rd.m.d(r3, r4)
            r2.<init>(r1, r3)
            r8.add(r2)
            goto L1
        L69:
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            int r6 = fh.m.B(r7, r4)
            int r5 = r5 + r6
        L73:
            if (r3 != 0) goto L83
            java.lang.String r3 = e(r7)
            boolean r5 = g(r7)
            if (r5 != 0) goto Lbc
            int r5 = fh.m.B(r7, r4)
        L83:
            if (r5 == 0) goto Lbc
            r6 = 1
            if (r5 <= r6) goto L89
            goto Lb9
        L89:
            boolean r6 = g(r7)
            if (r6 == 0) goto L90
            goto Lb9
        L90:
            r6 = 34
            boolean r6 = h(r7, r6)
            if (r6 == 0) goto L9d
            java.lang.String r6 = d(r7)
            goto La1
        L9d:
            java.lang.String r6 = e(r7)
        La1:
            if (r6 != 0) goto La4
            goto Lb9
        La4:
            java.lang.Object r3 = r2.put(r3, r6)
            java.lang.String r3 = (java.lang.String) r3
            if (r3 == 0) goto Lad
            goto Lb9
        Lad:
            boolean r3 = g(r7)
            if (r3 != 0) goto Lba
            boolean r3 = r7.z()
            if (r3 != 0) goto Lba
        Lb9:
            return
        Lba:
            r3 = r0
            goto L73
        Lbc:
            eh.i r4 = new eh.i
            r4.<init>(r1, r2)
            r8.add(r4)
            r1 = r3
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.e.c(vh.e, java.util.List):void");
    }

    private static final String d(vh.e eVar) throws EOFException {
        if (eVar.readByte() != 34) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        vh.e eVar2 = new vh.e();
        while (true) {
            long jT = eVar.T(f19938a);
            if (jT == -1) {
                return null;
            }
            if (eVar.G(jT) == 34) {
                eVar2.C(eVar, jT);
                eVar.readByte();
                return eVar2.w0();
            }
            if (eVar.size() == jT + 1) {
                return null;
            }
            eVar2.C(eVar, jT);
            eVar.readByte();
            eVar2.C(eVar, 1L);
        }
    }

    private static final String e(vh.e eVar) {
        long jT = eVar.T(f19939b);
        if (jT == -1) {
            jT = eVar.size();
        }
        if (jT != 0) {
            return eVar.o(jT);
        }
        return null;
    }

    public static final void f(o oVar, z zVar, y yVar) {
        m.e(oVar, "<this>");
        m.e(zVar, "url");
        m.e(yVar, "headers");
        if (oVar == o.f12585b) {
            return;
        }
        List listE = n.f12569k.e(zVar, yVar);
        if (listE.isEmpty()) {
            return;
        }
        oVar.a(zVar, listE);
    }

    private static final boolean g(vh.e eVar) throws EOFException {
        boolean z10 = false;
        while (!eVar.z()) {
            byte bG = eVar.G(0L);
            if (bG != 44) {
                if (bG != 32 && bG != 9) {
                    break;
                }
                eVar.readByte();
            } else {
                eVar.readByte();
                z10 = true;
            }
        }
        return z10;
    }

    private static final boolean h(vh.e eVar, byte b10) {
        return !eVar.z() && eVar.G(0L) == b10;
    }
}
