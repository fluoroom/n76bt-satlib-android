package u6;

import com.fasterxml.jackson.databind.JavaType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class o0 extends c0 implements s6.s, s6.i {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected static final Object[] f28300u = new Object[0];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected p6.l f28301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected p6.l f28302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected p6.l f28303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected p6.l f28304h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected JavaType f28305r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected JavaType f28306s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final boolean f28307t;

    public o0(JavaType javaType, JavaType javaType2) {
        super(Object.class);
        this.f28305r = javaType;
        this.f28306s = javaType2;
        this.f28307t = false;
    }

    private void h1(Map map, String str, Object obj, Object obj2) {
        if (obj instanceof List) {
            ((List) obj).add(obj2);
            map.put(str, obj);
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(obj);
            arrayList.add(obj2);
            map.put(str, arrayList);
        }
    }

    @Override // s6.s
    public void c(p6.h hVar) {
        JavaType javaTypeG = hVar.G(Object.class);
        JavaType javaTypeG2 = hVar.G(String.class);
        com.fasterxml.jackson.databind.type.c cVarL = hVar.l();
        JavaType javaType = this.f28305r;
        if (javaType == null) {
            this.f28302f = e1(f1(hVar, cVarL.C(List.class, javaTypeG)));
        } else {
            this.f28302f = f1(hVar, javaType);
        }
        JavaType javaType2 = this.f28306s;
        if (javaType2 == null) {
            this.f28301e = e1(f1(hVar, cVarL.K(Map.class, javaTypeG2, javaTypeG)));
        } else {
            this.f28301e = f1(hVar, javaType2);
        }
        this.f28303g = e1(f1(hVar, javaTypeG2));
        this.f28304h = e1(f1(hVar, cVarL.R(Number.class)));
        JavaType javaTypeB0 = com.fasterxml.jackson.databind.type.c.b0();
        this.f28301e = hVar.p0(this.f28301e, null, javaTypeB0);
        this.f28302f = hVar.p0(this.f28302f, null, javaTypeB0);
        this.f28303g = hVar.p0(this.f28303g, null, javaTypeB0);
        this.f28304h = hVar.p0(this.f28304h, null, javaTypeB0);
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) {
        boolean z10 = dVar == null && Boolean.FALSE.equals(hVar.k().a0(Object.class));
        return (this.f28303g == null && this.f28304h == null && this.f28301e == null && this.f28302f == null && getClass() == o0.class) ? p0.h1(z10) : z10 != this.f28307t ? new o0(this, z10) : this;
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) {
        switch (jVar.q()) {
            case 1:
            case 2:
            case 5:
                p6.l lVar = this.f28301e;
                return lVar != null ? lVar.e(jVar, hVar) : l1(jVar, hVar);
            case 3:
                if (hVar.D0(p6.i.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                    return k1(jVar, hVar);
                }
                p6.l lVar2 = this.f28302f;
                return lVar2 != null ? lVar2.e(jVar, hVar) : i1(jVar, hVar);
            case 4:
            default:
                return hVar.s0(Object.class, jVar);
            case 6:
                p6.l lVar3 = this.f28303g;
                return lVar3 != null ? lVar3.e(jVar, hVar) : jVar.C0();
            case 7:
                p6.l lVar4 = this.f28304h;
                return lVar4 != null ? lVar4.e(jVar, hVar) : hVar.A0(c0.f28198c) ? R(jVar, hVar) : jVar.w0();
            case 8:
                p6.l lVar5 = this.f28304h;
                return lVar5 != null ? lVar5.e(jVar, hVar) : hVar.D0(p6.i.USE_BIG_DECIMAL_FOR_FLOATS) ? jVar.W() : jVar.w0();
            case 9:
                return Boolean.TRUE;
            case 10:
                return Boolean.FALSE;
            case 11:
                return null;
            case 12:
                return jVar.h0();
        }
    }

    protected p6.l e1(p6.l lVar) {
        if (i7.h.P(lVar)) {
            return null;
        }
        return lVar;
    }

    @Override // p6.l
    public Object f(e6.j jVar, p6.h hVar, Object obj) {
        if (this.f28307t) {
            return e(jVar, hVar);
        }
        switch (jVar.q()) {
            case 1:
            case 2:
            case 5:
                p6.l lVar = this.f28301e;
                if (lVar == null) {
                    if (!(obj instanceof Map)) {
                    }
                }
                break;
            case 3:
                p6.l lVar2 = this.f28302f;
                if (lVar2 == null) {
                    if (!(obj instanceof Collection)) {
                        if (!hVar.D0(p6.i.USE_JAVA_ARRAY_FOR_JSON_ARRAY)) {
                        }
                    }
                }
                break;
            case 6:
                p6.l lVar3 = this.f28303g;
                if (lVar3 == null) {
                }
                break;
            case 7:
                p6.l lVar4 = this.f28304h;
                if (lVar4 == null) {
                    if (!hVar.A0(c0.f28198c)) {
                    }
                }
                break;
            case 8:
                p6.l lVar5 = this.f28304h;
                if (lVar5 == null) {
                    if (!hVar.D0(p6.i.USE_BIG_DECIMAL_FOR_FLOATS)) {
                    }
                }
                break;
        }
        return e(jVar, hVar);
    }

    protected p6.l f1(p6.h hVar, JavaType javaType) {
        return hVar.T(javaType);
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        int iQ = jVar.q();
        if (iQ != 1 && iQ != 3) {
            switch (iQ) {
                case 5:
                    break;
                case 6:
                    p6.l lVar = this.f28303g;
                    return lVar != null ? lVar.e(jVar, hVar) : jVar.C0();
                case 7:
                    p6.l lVar2 = this.f28304h;
                    return lVar2 != null ? lVar2.e(jVar, hVar) : hVar.A0(c0.f28198c) ? R(jVar, hVar) : jVar.w0();
                case 8:
                    p6.l lVar3 = this.f28304h;
                    return lVar3 != null ? lVar3.e(jVar, hVar) : hVar.D0(p6.i.USE_BIG_DECIMAL_FOR_FLOATS) ? jVar.W() : jVar.w0();
                case 9:
                    return Boolean.TRUE;
                case 10:
                    return Boolean.FALSE;
                case 11:
                    return null;
                case 12:
                    return jVar.h0();
                default:
                    return hVar.s0(Object.class, jVar);
            }
        }
        return eVar.c(jVar, hVar);
    }

    protected Object g1(e6.j jVar, p6.h hVar, Map map, String str, Object obj, Object obj2, String str2) {
        boolean zC0 = hVar.C0(e6.q.DUPLICATE_PROPERTIES);
        if (zC0) {
            h1(map, str, obj, obj2);
        }
        while (str2 != null) {
            jVar.X0();
            Object objE = e(jVar, hVar);
            Object objPut = map.put(str2, objE);
            if (objPut != null && zC0) {
                h1(map, str, objPut, objE);
            }
            str2 = jVar.V0();
        }
        return map;
    }

    protected Object i1(e6.j jVar, p6.h hVar) {
        e6.m mVarX0 = jVar.X0();
        e6.m mVar = e6.m.END_ARRAY;
        int i10 = 2;
        if (mVarX0 == mVar) {
            return new ArrayList(2);
        }
        Object objE = e(jVar, hVar);
        if (jVar.X0() == mVar) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(objE);
            return arrayList;
        }
        Object objE2 = e(jVar, hVar);
        if (jVar.X0() == mVar) {
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(objE);
            arrayList2.add(objE2);
            return arrayList2;
        }
        i7.v vVarH0 = hVar.H0();
        Object[] objArrI = vVarH0.i();
        objArrI[0] = objE;
        objArrI[1] = objE2;
        int i11 = 2;
        while (true) {
            Object objE3 = e(jVar, hVar);
            i10++;
            if (i11 >= objArrI.length) {
                objArrI = vVarH0.c(objArrI);
                i11 = 0;
            }
            int i12 = i11 + 1;
            objArrI[i11] = objE3;
            if (jVar.X0() == e6.m.END_ARRAY) {
                ArrayList arrayList3 = new ArrayList(i10);
                vVarH0.e(objArrI, i12, arrayList3);
                hVar.a1(vVarH0);
                return arrayList3;
            }
            i11 = i12;
        }
    }

    protected Object j1(e6.j jVar, p6.h hVar, Collection collection) {
        while (jVar.X0() != e6.m.END_ARRAY) {
            collection.add(e(jVar, hVar));
        }
        return collection;
    }

    protected Object[] k1(e6.j jVar, p6.h hVar) {
        if (jVar.X0() == e6.m.END_ARRAY) {
            return f28300u;
        }
        i7.v vVarH0 = hVar.H0();
        Object[] objArrI = vVarH0.i();
        int i10 = 0;
        while (true) {
            Object objE = e(jVar, hVar);
            if (i10 >= objArrI.length) {
                objArrI = vVarH0.c(objArrI);
                i10 = 0;
            }
            int i11 = i10 + 1;
            objArrI[i10] = objE;
            if (jVar.X0() == e6.m.END_ARRAY) {
                Object[] objArrF = vVarH0.f(objArrI, i11);
                hVar.a1(vVarH0);
                return objArrF;
            }
            i10 = i11;
        }
    }

    protected Object l1(e6.j jVar, p6.h hVar) {
        String strL;
        e6.m mVarN = jVar.n();
        if (mVarN == e6.m.START_OBJECT) {
            strL = jVar.V0();
        } else if (mVarN == e6.m.FIELD_NAME) {
            strL = jVar.l();
        } else {
            if (mVarN != e6.m.END_OBJECT) {
                return hVar.s0(p(), jVar);
            }
            strL = null;
        }
        String str = strL;
        if (str == null) {
            return new LinkedHashMap(2);
        }
        jVar.X0();
        Object objE = e(jVar, hVar);
        String strV0 = jVar.V0();
        if (strV0 == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(2);
            linkedHashMap.put(str, objE);
            return linkedHashMap;
        }
        jVar.X0();
        Object objE2 = e(jVar, hVar);
        String strV02 = jVar.V0();
        if (strV02 == null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(4);
            linkedHashMap2.put(str, objE);
            return linkedHashMap2.put(strV0, objE2) != null ? g1(jVar, hVar, linkedHashMap2, str, objE, objE2, strV02) : linkedHashMap2;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put(str, objE);
        if (linkedHashMap3.put(strV0, objE2) != null) {
            return g1(jVar, hVar, linkedHashMap3, str, objE, objE2, strV02);
        }
        do {
            jVar.X0();
            Object objE3 = e(jVar, hVar);
            Object objPut = linkedHashMap3.put(strV02, objE3);
            if (objPut != null) {
                return g1(jVar, hVar, linkedHashMap3, strV02, objPut, objE3, jVar.V0());
            }
            strV02 = jVar.V0();
        } while (strV02 != null);
        return linkedHashMap3;
    }

    protected Object m1(e6.j jVar, p6.h hVar, Map map) {
        e6.m mVarN = jVar.n();
        if (mVarN == e6.m.START_OBJECT) {
            mVarN = jVar.X0();
        }
        if (mVarN == e6.m.END_OBJECT) {
            return map;
        }
        String strL = jVar.l();
        do {
            jVar.X0();
            Object obj = map.get(strL);
            Object objF = obj != null ? f(jVar, hVar, obj) : e(jVar, hVar);
            if (objF != obj) {
                map.put(strL, objF);
            }
            strL = jVar.V0();
        } while (strL != null);
        return map;
    }

    @Override // p6.l
    public boolean q() {
        return true;
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.Untyped;
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return null;
    }

    protected o0(o0 o0Var, boolean z10) {
        super(Object.class);
        this.f28301e = o0Var.f28301e;
        this.f28302f = o0Var.f28302f;
        this.f28303g = o0Var.f28303g;
        this.f28304h = o0Var.f28304h;
        this.f28305r = o0Var.f28305r;
        this.f28306s = o0Var.f28306s;
        this.f28307t = z10;
    }
}
