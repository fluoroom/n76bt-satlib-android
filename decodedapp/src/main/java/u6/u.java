package u6;

import com.fasterxml.jackson.databind.JavaType;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class u extends j implements s6.i {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected final p6.q f28338r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final p6.l f28339s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected final a7.e f28340t;

    public u(JavaType javaType, p6.q qVar, p6.l lVar, a7.e eVar) {
        super(javaType);
        if (javaType.g() == 2) {
            this.f28338r = qVar;
            this.f28339s = lVar;
            this.f28340t = eVar;
        } else {
            throw new IllegalArgumentException("Missing generic type information for " + javaType);
        }
    }

    @Override // s6.i
    public p6.l d(p6.h hVar, p6.d dVar) throws v6.b {
        p6.q qVarS = this.f28338r;
        if (qVarS == null) {
            qVarS = hVar.S(this.f28256e.f(0), dVar);
        }
        p6.l lVarR0 = R0(hVar, dVar, this.f28339s);
        JavaType javaTypeF = this.f28256e.f(1);
        p6.l lVarQ = lVarR0 == null ? hVar.Q(javaTypeF, dVar) : hVar.p0(lVarR0, dVar, javaTypeF);
        a7.e eVarG = this.f28340t;
        if (eVarG != null) {
            eVarG = eVarG.g(dVar);
        }
        return i1(qVarS, eVarG, lVarQ);
    }

    @Override // u6.j
    public p6.l e1() {
        return this.f28339s;
    }

    @Override // u6.c0, p6.l
    public Object g(e6.j jVar, p6.h hVar, a7.e eVar) {
        return eVar.e(jVar, hVar);
    }

    @Override // p6.l
    /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] */
    public Map.Entry e(e6.j jVar, p6.h hVar) throws IOException {
        Object objA;
        e6.m mVarN = jVar.n();
        if (mVarN == e6.m.START_OBJECT) {
            mVarN = jVar.X0();
        } else if (mVarN != e6.m.FIELD_NAME && mVarN != e6.m.END_OBJECT) {
            return mVarN == e6.m.START_ARRAY ? (Map.Entry) W(jVar, hVar) : (Map.Entry) hVar.q0(Y0(hVar), jVar);
        }
        if (mVarN != e6.m.FIELD_NAME) {
            return mVarN == e6.m.END_OBJECT ? (Map.Entry) hVar.S0(this, "Cannot deserialize a Map.Entry out of empty JSON Object", new Object[0]) : (Map.Entry) hVar.s0(p(), jVar);
        }
        p6.q qVar = this.f28338r;
        p6.l lVar = this.f28339s;
        a7.e eVar = this.f28340t;
        String strL = jVar.l();
        Object objA2 = qVar.a(strL, hVar);
        try {
            objA = jVar.X0() == e6.m.VALUE_NULL ? lVar.a(hVar) : eVar == null ? lVar.e(jVar, hVar) : lVar.g(jVar, hVar, eVar);
        } catch (Exception e10) {
            f1(hVar, e10, Map.Entry.class, strL);
            objA = null;
        }
        e6.m mVarX0 = jVar.X0();
        if (mVarX0 == e6.m.END_OBJECT) {
            return new AbstractMap.SimpleEntry(objA2, objA);
        }
        if (mVarX0 == e6.m.FIELD_NAME) {
            hVar.S0(this, "Problem binding JSON into Map.Entry: more than one entry in JSON (second field: '%s')", jVar.l());
        } else {
            hVar.S0(this, "Problem binding JSON into Map.Entry: unexpected content after JSON Object entry: " + mVarX0, new Object[0]);
        }
        return null;
    }

    @Override // p6.l
    /* JADX INFO: renamed from: h1, reason: merged with bridge method [inline-methods] */
    public Map.Entry f(e6.j jVar, p6.h hVar, Map.Entry entry) {
        throw new IllegalStateException("Cannot update Map.Entry values");
    }

    protected u i1(p6.q qVar, a7.e eVar, p6.l lVar) {
        return (this.f28338r == qVar && this.f28339s == lVar && this.f28340t == eVar) ? this : new u(this, qVar, lVar, eVar);
    }

    @Override // p6.l
    public h7.c r() {
        return h7.c.Map;
    }

    protected u(u uVar, p6.q qVar, p6.l lVar, a7.e eVar) {
        super(uVar);
        this.f28338r = qVar;
        this.f28339s = lVar;
        this.f28340t = eVar;
    }
}
