package fg;

import eg.a2;
import eg.c1;
import eg.i0;
import eg.k2;
import eg.l2;
import eg.m2;
import eg.q0;
import eg.r0;
import eg.u0;
import eg.u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f extends eg.q {

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f13058a = new a();

        private a() {
        }
    }

    static final /* synthetic */ class b extends rd.l implements qd.l {
        b(Object obj) {
            super(1, obj, f.class, "prepareType", "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final l2 l(ig.i iVar) {
            rd.m.e(iVar, "p0");
            return ((f) this.f25940b).a(iVar);
        }
    }

    private final c1 c(c1 c1Var) {
        r0 type;
        u1 u1VarN0 = c1Var.N0();
        q0 q0VarN = null;
        l2VarQ0 = null;
        l2 l2VarQ0 = null;
        if (!(u1VarN0 instanceof rf.c)) {
            if (!(u1VarN0 instanceof q0) || !c1Var.O0()) {
                return c1Var;
            }
            q0 q0Var = (q0) u1VarN0;
            Collection collectionE = q0Var.e();
            ArrayList arrayList = new ArrayList(ed.q.v(collectionE, 10));
            Iterator it = collectionE.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                arrayList.add(jg.d.B((r0) it.next()));
                z10 = true;
            }
            if (z10) {
                r0 r0VarH = q0Var.h();
                q0VarN = new q0(arrayList).n(r0VarH != null ? jg.d.B(r0VarH) : null);
            }
            if (q0VarN != null) {
                q0Var = q0VarN;
            }
            return q0Var.f();
        }
        rf.c cVar = (rf.c) u1VarN0;
        a2 a2VarS = cVar.s();
        if (a2VarS.a() != m2.f12141f) {
            a2VarS = null;
        }
        if (a2VarS != null && (type = a2VarS.getType()) != null) {
            l2VarQ0 = type.Q0();
        }
        l2 l2Var = l2VarQ0;
        if (cVar.b() == null) {
            a2 a2VarS2 = cVar.s();
            Collection collectionE2 = cVar.e();
            ArrayList arrayList2 = new ArrayList(ed.q.v(collectionE2, 10));
            Iterator it2 = collectionE2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((r0) it2.next()).Q0());
            }
            cVar.d(new n(a2VarS2, arrayList2, null, 4, null));
        }
        ig.b bVar = ig.b.f16113a;
        n nVarB = cVar.b();
        rd.m.b(nVarB);
        return new i(bVar, nVarB, l2Var, c1Var.M0(), c1Var.O0(), false, 32, null);
    }

    @Override // eg.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l2 a(ig.i iVar) {
        l2 l2VarE;
        rd.m.e(iVar, "type");
        if (!(iVar instanceof r0)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        l2 l2VarQ0 = ((r0) iVar).Q0();
        if (l2VarQ0 instanceof c1) {
            l2VarE = c((c1) l2VarQ0);
        } else {
            if (!(l2VarQ0 instanceof i0)) {
                throw new dd.o();
            }
            i0 i0Var = (i0) l2VarQ0;
            c1 c1VarC = c(i0Var.V0());
            c1 c1VarC2 = c(i0Var.W0());
            l2VarE = (c1VarC == i0Var.V0() && c1VarC2 == i0Var.W0()) ? l2VarQ0 : u0.e(c1VarC, c1VarC2);
        }
        return k2.c(l2VarE, l2VarQ0, new b(this));
    }
}
