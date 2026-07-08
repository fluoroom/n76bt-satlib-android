package s6;

import com.fasterxml.jackson.databind.JavaType;
import d6.k0;
import d6.n0;
import java.io.Serializable;
import java.util.Map;
import p6.y;
import s6.w;
import t6.z;
import x6.e0;

/* JADX INFO: loaded from: classes.dex */
public class a extends p6.l implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final JavaType f26877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final t6.s f26878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Map f26879c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected transient Map f26880d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final boolean f26881e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final boolean f26882f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final boolean f26883g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final boolean f26884h;

    public a(e eVar, p6.c cVar, Map map, Map map2) {
        JavaType javaTypeZ = cVar.z();
        this.f26877a = javaTypeZ;
        this.f26878b = eVar.t();
        this.f26879c = map;
        this.f26880d = map2;
        Class clsR = javaTypeZ.r();
        this.f26881e = clsR.isAssignableFrom(String.class);
        boolean z10 = true;
        this.f26882f = clsR == Boolean.TYPE || clsR.isAssignableFrom(Boolean.class);
        this.f26883g = clsR == Integer.TYPE || clsR.isAssignableFrom(Integer.class);
        if (clsR != Double.TYPE && !clsR.isAssignableFrom(Double.class)) {
            z10 = false;
        }
        this.f26884h = z10;
    }

    public static a x(p6.c cVar) {
        return new a(cVar);
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) throws v6.b {
        x6.k kVarH;
        e0 e0VarK;
        k0 k0VarO;
        u uVar;
        JavaType javaType;
        p6.b bVarZ = hVar.Z();
        if (dVar == null || bVarZ == null || (kVarH = dVar.h()) == null || (e0VarK = bVarZ.K(kVarH)) == null) {
            return this.f26880d == null ? this : new a(this, this.f26878b, null);
        }
        hVar.p(kVarH, e0VarK);
        e0 e0VarL = bVarZ.L(kVarH, e0VarK);
        Class clsC = e0VarL.c();
        if (clsC == n0.class) {
            y yVarD = e0VarL.d();
            Map map = this.f26880d;
            u uVar2 = map == null ? null : (u) map.get(yVarD.c());
            if (uVar2 == null) {
                hVar.q(this.f26877a, String.format("Invalid Object Id definition for %s: cannot find property with name %s", i7.h.Y(p()), i7.h.W(yVarD)));
            }
            JavaType type = uVar2.getType();
            k0VarO = new t6.w(e0VarL.f());
            javaType = type;
            uVar = uVar2;
        } else {
            hVar.p(kVarH, e0VarL);
            JavaType javaType2 = hVar.l().X(hVar.G(clsC), k0.class)[0];
            k0VarO = hVar.o(kVarH, e0VarL);
            uVar = null;
            javaType = javaType2;
        }
        return new a(this, t6.s.a(javaType, e0VarL.d(), k0VarO, hVar.X(javaType), uVar, null), null);
    }

    @Override // p6.l
    public Object e(e6.j jVar, p6.h hVar) {
        return hVar.m0(this.f26877a.r(), new w.a(this.f26877a), jVar, "abstract types either need to be mapped to concrete types, have custom deserializer, or contain additional type information", new Object[0]);
    }

    @Override // p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        e6.m mVarN;
        if (this.f26878b != null && (mVarN = jVar.n()) != null) {
            if (mVarN.g()) {
                return v(jVar, hVar);
            }
            if (mVarN == e6.m.START_OBJECT) {
                mVarN = jVar.X0();
            }
            if (mVarN == e6.m.FIELD_NAME && this.f26878b.e() && this.f26878b.d(jVar.l(), jVar)) {
                return v(jVar, hVar);
            }
        }
        Object objW = w(jVar, hVar);
        return objW != null ? objW : eVar.e(jVar, hVar);
    }

    @Override // p6.l
    public u i(String str) {
        Map map = this.f26879c;
        if (map == null) {
            return null;
        }
        return (u) map.get(str);
    }

    @Override // p6.l
    public t6.s o() {
        return this.f26878b;
    }

    @Override // p6.l
    public Class p() {
        return this.f26877a.r();
    }

    @Override // p6.l
    public boolean q() {
        return true;
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.POJO;
    }

    @Override // p6.l
    public Boolean s(p6.g gVar) {
        return null;
    }

    protected Object v(e6.j jVar, p6.h hVar) throws v {
        Object objF = this.f26878b.f(jVar, hVar);
        t6.s sVar = this.f26878b;
        k0 k0Var = sVar.f27538c;
        sVar.getClass();
        z zVarW = hVar.W(objF, k0Var, null);
        Object objC = zVarW.c();
        if (objC != null) {
            return objC;
        }
        throw new v(jVar, "Could not resolve Object Id [" + objF + "] -- unresolved forward-reference?", jVar.H(), zVarW);
    }

    protected Object w(e6.j jVar, p6.h hVar) {
        switch (jVar.q()) {
            case 6:
                if (this.f26881e) {
                    return jVar.C0();
                }
                return null;
            case 7:
                if (this.f26883g) {
                    return Integer.valueOf(jVar.t0());
                }
                return null;
            case 8:
                if (this.f26884h) {
                    return Double.valueOf(jVar.X());
                }
                return null;
            case 9:
                if (this.f26882f) {
                    return Boolean.TRUE;
                }
                return null;
            case 10:
                if (this.f26882f) {
                    return Boolean.FALSE;
                }
                return null;
            default:
                return null;
        }
    }

    protected a(p6.c cVar) {
        JavaType javaTypeZ = cVar.z();
        this.f26877a = javaTypeZ;
        this.f26878b = null;
        this.f26879c = null;
        Class clsR = javaTypeZ.r();
        this.f26881e = clsR.isAssignableFrom(String.class);
        boolean z10 = true;
        this.f26882f = clsR == Boolean.TYPE || clsR.isAssignableFrom(Boolean.class);
        this.f26883g = clsR == Integer.TYPE || clsR.isAssignableFrom(Integer.class);
        if (clsR != Double.TYPE && !clsR.isAssignableFrom(Double.class)) {
            z10 = false;
        }
        this.f26884h = z10;
    }

    protected a(a aVar, t6.s sVar, Map map) {
        this.f26877a = aVar.f26877a;
        this.f26879c = aVar.f26879c;
        this.f26881e = aVar.f26881e;
        this.f26882f = aVar.f26882f;
        this.f26883g = aVar.f26883g;
        this.f26884h = aVar.f26884h;
        this.f26878b = sVar;
        this.f26880d = map;
    }
}
