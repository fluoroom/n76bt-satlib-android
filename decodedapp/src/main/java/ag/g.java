package ag;

import eg.c1;
import gf.b;
import he.g1;
import he.s1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final he.h0 f487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final he.m0 f488b;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f489a;

        static {
            int[] iArr = new int[b.C0197b.c.EnumC0200c.values().length];
            try {
                iArr[b.C0197b.c.EnumC0200c.BYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.CHAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.SHORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.FLOAT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.DOUBLE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.STRING.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.CLASS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.ENUM.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.ANNOTATION.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[b.C0197b.c.EnumC0200c.ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f489a = iArr;
        }
    }

    public g(he.h0 h0Var, he.m0 m0Var) {
        rd.m.e(h0Var, "module");
        rd.m.e(m0Var, "notFoundClasses");
        this.f487a = h0Var;
        this.f488b = m0Var;
    }

    private final boolean b(sf.g gVar, eg.r0 r0Var, b.C0197b.c cVar) {
        b.C0197b.c.EnumC0200c enumC0200cZ = cVar.Z();
        int i10 = enumC0200cZ == null ? -1 : a.f489a[enumC0200cZ.ordinal()];
        if (i10 == 10) {
            he.h hVarQ = r0Var.N0().q();
            he.e eVar = hVarQ instanceof he.e ? (he.e) hVarQ : null;
            return eVar == null || ee.i.m0(eVar);
        }
        if (i10 != 13) {
            return rd.m.a(gVar.a(this.f487a), r0Var);
        }
        if (!(gVar instanceof sf.b) || ((List) ((sf.b) gVar).b()).size() != cVar.L().size()) {
            throw new IllegalStateException(("Deserialized ArrayValue should have the same number of elements as the original array value: " + gVar).toString());
        }
        eg.r0 r0VarL = c().l(r0Var);
        if (r0VarL == null) {
            return false;
        }
        sf.b bVar = (sf.b) gVar;
        Iterable iterableL = ed.q.l((Collection) bVar.b());
        if ((iterableL instanceof Collection) && ((Collection) iterableL).isEmpty()) {
            return true;
        }
        Iterator it = iterableL.iterator();
        while (it.hasNext()) {
            int iNextInt = ((ed.j0) it).nextInt();
            sf.g gVar2 = (sf.g) ((List) bVar.b()).get(iNextInt);
            b.C0197b.c cVarH = cVar.H(iNextInt);
            rd.m.d(cVarH, "getArrayElement(...)");
            if (!b(gVar2, r0VarL, cVarH)) {
                return false;
            }
        }
        return true;
    }

    private final ee.i c() {
        return this.f487a.o();
    }

    private final dd.q d(b.C0197b c0197b, Map map, jf.d dVar) {
        s1 s1Var = (s1) map.get(l0.b(dVar, c0197b.r()));
        if (s1Var == null) {
            return null;
        }
        mf.f fVarB = l0.b(dVar, c0197b.r());
        eg.r0 type = s1Var.getType();
        rd.m.d(type, "getType(...)");
        b.C0197b.c cVarS = c0197b.s();
        rd.m.d(cVarS, "getValue(...)");
        return new dd.q(fVarB, g(type, cVarS, dVar));
    }

    private final he.e e(mf.b bVar) {
        return he.y.d(this.f487a, bVar, this.f488b);
    }

    private final sf.g g(eg.r0 r0Var, b.C0197b.c cVar, jf.d dVar) {
        sf.g gVarF = f(r0Var, cVar, dVar);
        if (!b(gVarF, r0Var, cVar)) {
            gVarF = null;
        }
        if (gVarF != null) {
            return gVarF;
        }
        return sf.l.f27338b.a("Unexpected argument value: actual type " + cVar.Z() + " != expected type " + r0Var);
    }

    public final ie.c a(gf.b bVar, jf.d dVar) {
        rd.m.e(bVar, "proto");
        rd.m.e(dVar, "nameResolver");
        he.e eVarE = e(l0.a(dVar, bVar.w()));
        Map mapI = ed.k0.i();
        if (bVar.s() != 0 && !gg.l.m(eVarE) && qf.i.t(eVarE)) {
            Collection constructors = eVarE.getConstructors();
            rd.m.d(constructors, "getConstructors(...)");
            he.d dVar2 = (he.d) ed.q.x0(constructors);
            if (dVar2 != null) {
                List listI = dVar2.i();
                rd.m.d(listI, "getValueParameters(...)");
                LinkedHashMap linkedHashMap = new LinkedHashMap(xd.d.b(ed.k0.e(ed.q.v(listI, 10)), 16));
                for (Object obj : listI) {
                    linkedHashMap.put(((s1) obj).getName(), obj);
                }
                List<b.C0197b> listT = bVar.t();
                rd.m.d(listT, "getArgumentList(...)");
                ArrayList arrayList = new ArrayList();
                for (b.C0197b c0197b : listT) {
                    rd.m.b(c0197b);
                    dd.q qVarD = d(c0197b, linkedHashMap, dVar);
                    if (qVarD != null) {
                        arrayList.add(qVarD);
                    }
                }
                mapI = ed.k0.r(arrayList);
            }
        }
        return new ie.d(eVarE.s(), mapI, g1.f15281a);
    }

    public final sf.g f(eg.r0 r0Var, b.C0197b.c cVar, jf.d dVar) {
        rd.m.e(r0Var, "expectedType");
        rd.m.e(cVar, "value");
        rd.m.e(dVar, "nameResolver");
        Boolean boolD = jf.b.P.d(cVar.T());
        rd.m.d(boolD, "get(...)");
        boolean zBooleanValue = boolD.booleanValue();
        b.C0197b.c.EnumC0200c enumC0200cZ = cVar.Z();
        switch (enumC0200cZ == null ? -1 : a.f489a[enumC0200cZ.ordinal()]) {
            case 1:
                byte bX = (byte) cVar.X();
                return zBooleanValue ? new sf.a0(bX) : new sf.d(bX);
            case 2:
                return new sf.e((char) cVar.X());
            case 3:
                short sX = (short) cVar.X();
                return zBooleanValue ? new sf.d0(sX) : new sf.w(sX);
            case 4:
                int iX = (int) cVar.X();
                return zBooleanValue ? new sf.b0(iX) : new sf.n(iX);
            case 5:
                long jX = cVar.X();
                return zBooleanValue ? new sf.c0(jX) : new sf.t(jX);
            case 6:
                return new sf.m(cVar.W());
            case 7:
                return new sf.j(cVar.Q());
            case 8:
                return new sf.c(cVar.X() != 0);
            case 9:
                return new sf.x(dVar.getString(cVar.Y()));
            case 10:
                return new sf.s(l0.a(dVar, cVar.N()), cVar.G());
            case 11:
                return new sf.k(l0.a(dVar, cVar.N()), l0.b(dVar, cVar.R()));
            case 12:
                gf.b bVarD = cVar.D();
                rd.m.d(bVarD, "getAnnotation(...)");
                return new sf.a(a(bVarD, dVar));
            case 13:
                sf.i iVar = sf.i.f27335a;
                List<b.C0197b.c> listL = cVar.L();
                rd.m.d(listL, "getArrayElementList(...)");
                ArrayList arrayList = new ArrayList(ed.q.v(listL, 10));
                for (b.C0197b.c cVar2 : listL) {
                    c1 c1VarI = c().i();
                    rd.m.d(c1VarI, "getAnyType(...)");
                    rd.m.b(cVar2);
                    arrayList.add(f(c1VarI, cVar2, dVar));
                }
                return iVar.b(arrayList, r0Var);
            default:
                throw new IllegalStateException(("Unsupported annotation argument type: " + cVar.Z() + " (expected " + r0Var + ')').toString());
        }
    }
}
