package eg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements u1, ig.h {

    /* JADX INFO: renamed from: a */
    private r0 f12163a;

    /* JADX INFO: renamed from: b */
    private final LinkedHashSet f12164b;

    /* JADX INFO: renamed from: c */
    private final int f12165c;

    public static final class a implements Comparator {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ qd.l f12166a;

        public a(qd.l lVar) {
            this.f12166a = lVar;
        }

        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            r0 r0Var = (r0) obj;
            qd.l lVar = this.f12166a;
            rd.m.b(r0Var);
            String string = lVar.l(r0Var).toString();
            r0 r0Var2 = (r0) obj2;
            qd.l lVar2 = this.f12166a;
            rd.m.b(r0Var2);
            return gd.a.d(string, lVar2.l(r0Var2).toString());
        }
    }

    public q0(Collection collection) {
        rd.m.e(collection, "typesToIntersect");
        collection.isEmpty();
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        this.f12164b = linkedHashSet;
        this.f12165c = linkedHashSet.hashCode();
    }

    public static final c1 g(q0 q0Var, fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        return q0Var.p(gVar).f();
    }

    public static /* synthetic */ String j(q0 q0Var, qd.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = o0.f12154a;
        }
        return q0Var.i(lVar);
    }

    public static final String k(r0 r0Var) {
        rd.m.e(r0Var, "it");
        return r0Var.toString();
    }

    public static final CharSequence l(qd.l lVar, r0 r0Var) {
        rd.m.b(r0Var);
        return lVar.l(r0Var).toString();
    }

    public final xf.k d() {
        return xf.x.f32097d.a("member scope for intersection type", this.f12164b);
    }

    @Override // eg.u1
    public Collection e() {
        return this.f12164b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            return rd.m.a(this.f12164b, ((q0) obj).f12164b);
        }
        return false;
    }

    public final c1 f() {
        return u0.n(q1.f12167b.k(), this, ed.q.k(), false, d(), new p0(this));
    }

    @Override // eg.u1
    public List getParameters() {
        return ed.q.k();
    }

    public final r0 h() {
        return this.f12163a;
    }

    public int hashCode() {
        return this.f12165c;
    }

    public final String i(qd.l lVar) {
        rd.m.e(lVar, "getProperTypeRelatedToStringify");
        return ed.q.i0(ed.q.B0(this.f12164b, new a(lVar)), " & ", "{", "}", 0, null, new n0(lVar), 24, null);
    }

    @Override // eg.u1
    /* JADX INFO: renamed from: m */
    public q0 p(fg.g gVar) {
        rd.m.e(gVar, "kotlinTypeRefiner");
        Collection collectionE = e();
        ArrayList arrayList = new ArrayList(ed.q.v(collectionE, 10));
        Iterator it = collectionE.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            arrayList.add(((r0) it.next()).X0(gVar));
            z10 = true;
        }
        q0 q0VarN = null;
        if (z10) {
            r0 r0VarH = h();
            q0VarN = new q0(arrayList).n(r0VarH != null ? r0VarH.X0(gVar) : null);
        }
        return q0VarN == null ? this : q0VarN;
    }

    public final q0 n(r0 r0Var) {
        return new q0(this.f12164b, r0Var);
    }

    @Override // eg.u1
    public ee.i o() {
        ee.i iVarO = ((r0) this.f12164b.iterator().next()).N0().o();
        rd.m.d(iVarO, "getBuiltIns(...)");
        return iVarO;
    }

    @Override // eg.u1
    public he.h q() {
        return null;
    }

    @Override // eg.u1
    public boolean r() {
        return false;
    }

    public String toString() {
        return j(this, null, 1, null);
    }

    private q0(Collection collection, r0 r0Var) {
        this(collection);
        this.f12163a = r0Var;
    }
}
