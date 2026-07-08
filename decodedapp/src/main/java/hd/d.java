package hd;

import hd.i;
import java.io.Serializable;
import qd.p;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements i, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i f15239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i.b f15240b;

    public d(i iVar, i.b bVar) {
        m.e(iVar, "left");
        m.e(bVar, "element");
        this.f15239a = iVar;
        this.f15240b = bVar;
    }

    private final boolean d(i.b bVar) {
        return m.a(a(bVar.getKey()), bVar);
    }

    private final boolean e(d dVar) {
        while (d(dVar.f15240b)) {
            i iVar = dVar.f15239a;
            if (!(iVar instanceof d)) {
                m.c(iVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return d((i.b) iVar);
            }
            dVar = (d) iVar;
        }
        return false;
    }

    private final int f() {
        int i10 = 2;
        d dVar = this;
        while (true) {
            i iVar = dVar.f15239a;
            dVar = iVar instanceof d ? (d) iVar : null;
            if (dVar == null) {
                return i10;
            }
            i10++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(String str, i.b bVar) {
        m.e(str, "acc");
        m.e(bVar, "element");
        if (str.length() == 0) {
            return bVar.toString();
        }
        return str + ", " + bVar;
    }

    @Override // hd.i
    public i.b a(i.c cVar) {
        m.e(cVar, "key");
        d dVar = this;
        while (true) {
            i.b bVarA = dVar.f15240b.a(cVar);
            if (bVarA != null) {
                return bVarA;
            }
            i iVar = dVar.f15239a;
            if (!(iVar instanceof d)) {
                return iVar.a(cVar);
            }
            dVar = (d) iVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f() == f() && dVar.e(this);
    }

    public int hashCode() {
        return this.f15239a.hashCode() + this.f15240b.hashCode();
    }

    @Override // hd.i
    public i k(i.c cVar) {
        m.e(cVar, "key");
        if (this.f15240b.a(cVar) != null) {
            return this.f15239a;
        }
        i iVarK = this.f15239a.k(cVar);
        return iVarK == this.f15239a ? this : iVarK == j.f15243a ? this.f15240b : new d(iVarK, this.f15240b);
    }

    @Override // hd.i
    public /* bridge */ i l(i iVar) {
        return i.a.b(this, iVar);
    }

    @Override // hd.i
    public Object r(Object obj, p pVar) {
        m.e(pVar, "operation");
        return pVar.s(this.f15239a.r(obj, pVar), this.f15240b);
    }

    public String toString() {
        return '[' + ((String) r("", new p() { // from class: hd.c
            @Override // qd.p
            public final Object s(Object obj, Object obj2) {
                return d.g((String) obj, (i.b) obj2);
            }
        })) + ']';
    }
}
