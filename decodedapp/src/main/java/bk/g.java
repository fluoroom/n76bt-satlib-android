package bk;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
class g extends j {
    private static final Map W;

    static {
        j jVar = j.f4168x;
        j jVarA = jVar.a("day");
        j jVar2 = j.f4169y;
        j jVarA2 = jVar2.a("yr");
        j jVar3 = j.G;
        j jVarA3 = jVar3.a("◦");
        j jVarA4 = jVar3.a("deg");
        j jVar4 = j.H;
        j jVarA5 = jVar4.a("'");
        j jVar5 = j.I;
        j jVarA6 = jVar5.a("''");
        j jVarA7 = jVar5.a("\"");
        j jVarA8 = jVar5.a("as");
        j jVar6 = j.T;
        j jVarA9 = jVar6.a("SFU");
        j jVarA10 = jVar6.a("sfu");
        j jVar7 = j.U;
        List<j> listAsList = Arrays.asList(j.f4165u, j.f4166v, j.f4167w, jVar, jVarA, jVar2, jVarA2, j.f4170z, j.A, j.D, j.E, j.F, jVar3, jVarA3, jVarA4, jVar4, jVarA5, jVar5, jVarA6, jVarA7, jVarA8, j.J, j.K, j.L, j.M, j.N, j.O, j.P, j.Q, j.R, j.S, jVar6, jVarA9, jVarA10, jVar7, jVar7.a("tecu"), j.V, j.f4163s);
        W = new HashMap(listAsList.size() * f.values().length);
        for (j jVar8 : listAsList) {
            W.put(jVar8.g(), new g(null, jVar8));
            for (f fVar : f.values()) {
                g gVar = new g(fVar, jVar8);
                W.put(gVar.g(), gVar);
            }
        }
        j jVar9 = j.f4162r;
        for (j jVar10 : Arrays.asList(j.f4164t, jVar9, jVar9.a("#"))) {
            W.put(jVar10.g(), new g(null, jVar10));
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    g(f fVar, j jVar) {
        String strG;
        if (fVar == null) {
            strG = jVar.g();
        } else {
            strG = fVar.d() + jVar.g();
        }
        super(strG, fVar == null ? jVar.h() : fVar.a() * jVar.h(), jVar.f(), jVar.e(), jVar.i(), jVar.d(), jVar.c());
    }

    public static g q(String str) {
        g gVar = (g) W.get(str);
        if (gVar != null) {
            return gVar;
        }
        throw new hj.a(hj.f.UNKNOWN_UNIT, str);
    }
}
