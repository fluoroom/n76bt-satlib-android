package u6;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.ArrayType;
import d6.k;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class x extends j implements s6.i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final boolean f28367r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final Class f28368s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected p6.l f28369t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected final a7.e f28370u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final Object[] f28371v;

    public x(JavaType javaType, p6.l lVar, a7.e eVar) {
        super(javaType, (s6.r) null, (Boolean) null);
        ArrayType arrayType = (ArrayType) javaType;
        Class clsR = arrayType.k().r();
        this.f28368s = clsR;
        this.f28367r = clsR == Object.class;
        this.f28369t = lVar;
        this.f28370u = eVar;
        this.f28371v = arrayType.p0();
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) {
        p6.l lVar = this.f28369t;
        Boolean boolT0 = T0(hVar, dVar, this.f28256e.r(), k.a.ACCEPT_SINGLE_VALUE_AS_ARRAY);
        p6.l lVarR0 = R0(hVar, dVar, lVar);
        JavaType javaTypeK = this.f28256e.k();
        p6.l lVarQ = lVarR0 == null ? hVar.Q(javaTypeK, dVar) : hVar.p0(lVarR0, dVar, javaTypeK);
        a7.e eVarG = this.f28370u;
        if (eVarG != null) {
            eVarG = eVarG.g(dVar);
        }
        return l1(eVarG, lVarQ, P0(hVar, dVar, lVarQ), boolT0);
    }

    @Override // u6.j
    public p6.l e1() {
        return this.f28369t;
    }

    @Override // p6.l
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public Object[] e(e6.j jVar, p6.h hVar) throws p6.m {
        Object objE;
        int i10;
        if (!jVar.S0()) {
            return k1(jVar, hVar);
        }
        i7.v vVarH0 = hVar.H0();
        Object[] objArrI = vVarH0.i();
        a7.e eVar = this.f28370u;
        int i11 = 0;
        while (true) {
            try {
                e6.m mVarX0 = jVar.X0();
                if (mVarX0 == e6.m.END_ARRAY) {
                    break;
                }
                try {
                    if (mVarX0 != e6.m.VALUE_NULL) {
                        objE = eVar == null ? this.f28369t.e(jVar, hVar) : this.f28369t.g(jVar, hVar, eVar);
                    } else if (!this.f28258g) {
                        objE = this.f28257f.a(hVar);
                    }
                    objArrI[i11] = objE;
                    i11 = i10;
                } catch (Exception e10) {
                    e = e10;
                    i11 = i10;
                    throw p6.m.r(e, objArrI, vVarH0.d() + i11);
                }
                if (i11 >= objArrI.length) {
                    objArrI = vVarH0.c(objArrI);
                    i11 = 0;
                }
                i10 = i11 + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
        Object[] objArrF = this.f28367r ? vVarH0.f(objArrI, i11) : vVarH0.g(objArrI, i11, this.f28368s);
        hVar.a1(vVarH0);
        return objArrF;
    }

    @Override // p6.l
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public Object[] f(e6.j jVar, p6.h hVar, Object[] objArr) throws p6.m {
        Object objE;
        int i10;
        if (!jVar.S0()) {
            Object[] objArrK1 = k1(jVar, hVar);
            if (objArrK1 == null) {
                return objArr;
            }
            int length = objArr.length;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArrK1.length + length);
            System.arraycopy(objArrK1, 0, objArrCopyOf, length, objArrK1.length);
            return objArrCopyOf;
        }
        i7.v vVarH0 = hVar.H0();
        int length2 = objArr.length;
        Object[] objArrJ = vVarH0.j(objArr, length2);
        a7.e eVar = this.f28370u;
        while (true) {
            try {
                e6.m mVarX0 = jVar.X0();
                if (mVarX0 == e6.m.END_ARRAY) {
                    break;
                }
                try {
                    if (mVarX0 != e6.m.VALUE_NULL) {
                        objE = eVar == null ? this.f28369t.e(jVar, hVar) : this.f28369t.g(jVar, hVar, eVar);
                    } else if (!this.f28258g) {
                        objE = this.f28257f.a(hVar);
                    }
                    objArrJ[length2] = objE;
                    length2 = i10;
                } catch (Exception e10) {
                    e = e10;
                    length2 = i10;
                    throw p6.m.r(e, objArrJ, vVarH0.d() + length2);
                }
                if (length2 >= objArrJ.length) {
                    objArrJ = vVarH0.c(objArrJ);
                    length2 = 0;
                }
                i10 = length2 + 1;
            } catch (Exception e11) {
                e = e11;
            }
        }
        Object[] objArrF = this.f28367r ? vVarH0.f(objArrJ, length2) : vVarH0.g(objArrJ, length2, this.f28368s);
        hVar.a1(vVarH0);
        return objArrF;
    }

    protected Byte[] i1(e6.j jVar, p6.h hVar) {
        byte[] bArrV = jVar.v(hVar.b0());
        Byte[] bArr = new Byte[bArrV.length];
        int length = bArrV.length;
        for (int i10 = 0; i10 < length; i10++) {
            bArr[i10] = Byte.valueOf(bArrV[i10]);
        }
        return bArr;
    }

    @Override // u6.j, p6.l
    public i7.a j() {
        return i7.a.CONSTANT;
    }

    @Override // u6.c0, p6.l
    /* JADX INFO: renamed from: j1, reason: merged with bridge method [inline-methods] */
    public Object[] g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return (Object[]) eVar.d(jVar, hVar);
    }

    @Override // u6.j, p6.l
    public Object k(p6.h hVar) {
        return this.f28371v;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object[] k1(e6.j r10, p6.h r11) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.x.k1(e6.j, p6.h):java.lang.Object[]");
    }

    public x l1(a7.e eVar, p6.l lVar, s6.r rVar, Boolean bool) {
        return (Objects.equals(bool, this.f28259h) && rVar == this.f28257f && lVar == this.f28369t && eVar == this.f28370u) ? this : new x(this, lVar, eVar, rVar, bool);
    }

    @Override // p6.l
    public boolean q() {
        return this.f28369t == null && this.f28370u == null;
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.Array;
    }

    protected x(x xVar, p6.l lVar, a7.e eVar, s6.r rVar, Boolean bool) {
        super(xVar, rVar, bool);
        this.f28368s = xVar.f28368s;
        this.f28367r = xVar.f28367r;
        this.f28371v = xVar.f28371v;
        this.f28369t = lVar;
        this.f28370u = eVar;
    }
}
