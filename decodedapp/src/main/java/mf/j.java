package mf;

import dd.w;
import ed.k0;
import ed.q;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public static final b l(String str) {
        c cVarB = i.f22029a.b();
        f fVarH = f.h(str);
        m.d(fVarH, "identifier(...)");
        return new b(cVarB, fVarH);
    }

    public static final b m(String str) {
        c cVarD = i.f22029a.d();
        f fVarH = f.h(str);
        m.d(fVarH, "identifier(...)");
        return new b(cVarD, fVarH);
    }

    public static final b n(String str) {
        c cVarG = i.f22029a.g();
        f fVarH = f.h(str);
        m.d(fVarH, "identifier(...)");
        return new b(cVarG, fVarH);
    }

    public static final b o(String str) {
        c cVarC = i.f22029a.c();
        f fVarH = f.h(str);
        m.d(fVarH, "identifier(...)");
        return new b(cVarC, fVarH);
    }

    public static final b p(String str) {
        c cVarE = i.f22029a.e();
        f fVarH = f.h(str);
        m.d(fVarH, "identifier(...)");
        return new b(cVarE, fVarH);
    }

    public static final b q(String str) {
        c cVarF = i.f22029a.f();
        f fVarH = f.h(str);
        m.d(fVarH, "identifier(...)");
        return new b(cVarF, fVarH);
    }

    public static final Map r(Map map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(xd.d.b(k0.e(q.v(setEntrySet, 10)), 16));
        for (Map.Entry entry : setEntrySet) {
            dd.q qVarA = w.a(entry.getValue(), entry.getKey());
            linkedHashMap.put(qVarA.c(), qVarA.d());
        }
        return linkedHashMap;
    }

    public static final b s(f fVar) {
        i iVar = i.f22029a;
        c cVarF = iVar.a().f();
        f fVarH = f.h(fVar.f() + iVar.a().h().f());
        m.d(fVarH, "identifier(...)");
        return new b(cVarF, fVarH);
    }

    public static final b t(String str) {
        c cVarH = i.f22029a.h();
        f fVarH = f.h(str);
        m.d(fVarH, "identifier(...)");
        return new b(cVarH, fVarH);
    }

    public static final b u(String str) {
        c cVarI = i.f22029a.i();
        f fVarH = f.h(str);
        m.d(fVarH, "identifier(...)");
        return new b(cVarI, fVarH);
    }

    public static final b v(b bVar) {
        c cVarG = i.f22029a.g();
        f fVarH = f.h('U' + bVar.h().f());
        m.d(fVarH, "identifier(...)");
        return new b(cVarG, fVarH);
    }
}
