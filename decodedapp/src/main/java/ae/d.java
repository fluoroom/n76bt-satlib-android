package ae;

import ag.k0;
import be.i1;
import be.k;
import be.l3;
import dd.q;
import gf.j;
import gf.u;
import he.f1;
import kotlin.Metadata;
import lf.e;
import lf.h;
import qd.p;
import rd.l;
import rd.m;
import yd.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d {

    static final /* synthetic */ class a extends l implements p {

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f427s = new a();

        a() {
            super(2, k0.class, "loadFunction", "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;", 0);
        }

        @Override // qd.p
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final f1 s(k0 k0Var, j jVar) {
            m.e(k0Var, "p0");
            m.e(jVar, "p1");
            return k0Var.s(jVar);
        }
    }

    public static final f a(dd.d dVar) {
        m.e(dVar, "<this>");
        Metadata metadata = (Metadata) dVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] strArrD1 = metadata.d1();
        if (strArrD1.length == 0) {
            strArrD1 = null;
        }
        if (strArrD1 == null) {
            return null;
        }
        q qVarJ = h.j(strArrD1, metadata.d2());
        e eVar = (e) qVarJ.a();
        j jVar = (j) qVarJ.b();
        jf.c cVar = new jf.c(metadata.mv(), (metadata.xi() & 8) != 0);
        Class<?> cls = dVar.getClass();
        u uVarL0 = jVar.L0();
        m.d(uVarL0, "getTypeTable(...)");
        return new i1(k.f3901d, (f1) l3.h(cls, jVar, eVar, new jf.h(uVarL0), cVar, a.f427s));
    }
}
