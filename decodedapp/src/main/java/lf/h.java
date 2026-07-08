package lf;

import dd.q;
import gf.j;
import gf.o;
import gf.r;
import gf.v;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jf.b;
import kf.a;
import lf.d;
import of.i;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class h {

    /* JADX INFO: renamed from: a */
    public static final h f20571a = new h();

    /* JADX INFO: renamed from: b */
    private static final of.g f20572b;

    static {
        of.g gVarD = of.g.d();
        kf.a.a(gVarD);
        m.d(gVarD, "apply(...)");
        f20572b = gVarD;
    }

    private h() {
    }

    public static /* synthetic */ d.a d(h hVar, o oVar, jf.d dVar, jf.h hVar2, boolean z10, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            z10 = true;
        }
        return hVar.c(oVar, dVar, hVar2, z10);
    }

    public static final boolean f(o oVar) {
        m.e(oVar, "proto");
        b.C0243b c0243bA = c.f20554a.a();
        Object objP = oVar.p(kf.a.f19837e);
        m.d(objP, "getExtension(...)");
        Boolean boolD = c0243bA.d(((Number) objP).intValue());
        m.d(boolD, "get(...)");
        return boolD.booleanValue();
    }

    private final String g(r rVar, jf.d dVar) {
        if (rVar.s0()) {
            return b.b(dVar.a(rVar.d0()));
        }
        return null;
    }

    public static final q h(byte[] bArr, String[] strArr) {
        m.e(bArr, "bytes");
        m.e(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new q(f20571a.k(byteArrayInputStream, strArr), gf.c.M1(byteArrayInputStream, f20572b));
    }

    public static final q i(String[] strArr, String[] strArr2) {
        m.e(strArr, "data");
        m.e(strArr2, "strings");
        byte[] bArrE = a.e(strArr);
        m.d(bArrE, "decodeBytes(...)");
        return h(bArrE, strArr2);
    }

    public static final q j(String[] strArr, String[] strArr2) {
        m.e(strArr, "data");
        m.e(strArr2, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(a.e(strArr));
        return new q(f20571a.k(byteArrayInputStream, strArr2), j.d1(byteArrayInputStream, f20572b));
    }

    private final e k(InputStream inputStream, String[] strArr) {
        a.e eVarA = a.e.A(inputStream, f20572b);
        m.d(eVarA, "parseDelimitedFrom(...)");
        return new e(eVarA, strArr);
    }

    public static final q l(byte[] bArr, String[] strArr) {
        m.e(bArr, "bytes");
        m.e(strArr, "strings");
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        return new q(f20571a.k(byteArrayInputStream, strArr), gf.m.k0(byteArrayInputStream, f20572b));
    }

    public static final q m(String[] strArr, String[] strArr2) {
        m.e(strArr, "data");
        m.e(strArr2, "strings");
        byte[] bArrE = a.e(strArr);
        m.d(bArrE, "decodeBytes(...)");
        return l(bArrE, strArr2);
    }

    public final of.g a() {
        return f20572b;
    }

    public final d.b b(gf.e eVar, jf.d dVar, jf.h hVar) {
        String strI0;
        m.e(eVar, "proto");
        m.e(dVar, "nameResolver");
        m.e(hVar, "typeTable");
        i.f fVar = kf.a.f19833a;
        m.d(fVar, "constructorSignature");
        a.c cVar = (a.c) jf.f.a(eVar, fVar);
        String string = (cVar == null || !cVar.v()) ? "<init>" : dVar.getString(cVar.s());
        if (cVar == null || !cVar.t()) {
            List<v> listC0 = eVar.c0();
            m.d(listC0, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(ed.q.v(listC0, 10));
            for (v vVar : listC0) {
                h hVar2 = f20571a;
                m.b(vVar);
                String strG = hVar2.g(jf.g.r(vVar, hVar), dVar);
                if (strG == null) {
                    return null;
                }
                arrayList.add(strG);
            }
            strI0 = ed.q.i0(arrayList, "", "(", ")V", 0, null, null, 56, null);
        } else {
            strI0 = dVar.getString(cVar.r());
        }
        return new d.b(string, strI0);
    }

    public final d.a c(o oVar, jf.d dVar, jf.h hVar, boolean z10) {
        String strG;
        m.e(oVar, "proto");
        m.e(dVar, "nameResolver");
        m.e(hVar, "typeTable");
        i.f fVar = kf.a.f19836d;
        m.d(fVar, "propertySignature");
        a.d dVar2 = (a.d) jf.f.a(oVar, fVar);
        if (dVar2 == null) {
            return null;
        }
        a.b bVarW = dVar2.D() ? dVar2.w() : null;
        if (bVarW == null && z10) {
            return null;
        }
        int iS0 = (bVarW == null || !bVarW.v()) ? oVar.S0() : bVarW.s();
        if (bVarW == null || !bVarW.t()) {
            strG = g(jf.g.o(oVar, hVar), dVar);
            if (strG == null) {
                return null;
            }
        } else {
            strG = dVar.getString(bVarW.r());
        }
        return new d.a(dVar.getString(iS0), strG);
    }

    public final d.b e(j jVar, jf.d dVar, jf.h hVar) {
        String string;
        m.e(jVar, "proto");
        m.e(dVar, "nameResolver");
        m.e(hVar, "typeTable");
        i.f fVar = kf.a.f19834b;
        m.d(fVar, "methodSignature");
        a.c cVar = (a.c) jf.f.a(jVar, fVar);
        int iC0 = (cVar == null || !cVar.v()) ? jVar.C0() : cVar.s();
        if (cVar == null || !cVar.t()) {
            List listO = ed.q.o(jf.g.l(jVar, hVar));
            List<v> listO0 = jVar.O0();
            m.d(listO0, "getValueParameterList(...)");
            ArrayList arrayList = new ArrayList(ed.q.v(listO0, 10));
            for (v vVar : listO0) {
                m.b(vVar);
                arrayList.add(jf.g.r(vVar, hVar));
            }
            List listS0 = ed.q.s0(listO, arrayList);
            ArrayList arrayList2 = new ArrayList(ed.q.v(listS0, 10));
            Iterator it = listS0.iterator();
            while (it.hasNext()) {
                String strG = f20571a.g((r) it.next(), dVar);
                if (strG == null) {
                    return null;
                }
                arrayList2.add(strG);
            }
            String strG2 = g(jf.g.n(jVar, hVar), dVar);
            if (strG2 == null) {
                return null;
            }
            string = ed.q.i0(arrayList2, "", "(", ")", 0, null, null, 56, null) + strG2;
        } else {
            string = dVar.getString(cVar.r());
        }
        return new d.b(dVar.getString(iC0), string);
    }
}
