package ie;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class p implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final h f16067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final qd.l f16069c;

    public p(h hVar, boolean z10, qd.l lVar) {
        rd.m.e(hVar, "delegate");
        rd.m.e(lVar, "fqNameFilter");
        this.f16067a = hVar;
        this.f16068b = z10;
        this.f16069c = lVar;
    }

    private final boolean b(c cVar) {
        mf.c cVarD = cVar.d();
        return cVarD != null && ((Boolean) this.f16069c.l(cVarD)).booleanValue();
    }

    @Override // ie.h
    public boolean H(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        if (((Boolean) this.f16069c.l(cVar)).booleanValue()) {
            return this.f16067a.H(cVar);
        }
        return false;
    }

    @Override // ie.h
    public c a(mf.c cVar) {
        rd.m.e(cVar, "fqName");
        if (((Boolean) this.f16069c.l(cVar)).booleanValue()) {
            return this.f16067a.a(cVar);
        }
        return null;
    }

    @Override // ie.h
    public boolean isEmpty() {
        boolean z10;
        h hVar = this.f16067a;
        if ((hVar instanceof Collection) && ((Collection) hVar).isEmpty()) {
            z10 = false;
        } else {
            Iterator it = hVar.iterator();
            while (it.hasNext()) {
                if (b((c) it.next())) {
                    z10 = true;
                    break;
                }
            }
            z10 = false;
        }
        return this.f16068b ? !z10 : z10;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        h hVar = this.f16067a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : hVar) {
            if (b((c) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList.iterator();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public p(h hVar, qd.l lVar) {
        this(hVar, false, lVar);
        rd.m.e(hVar, "delegate");
        rd.m.e(lVar, "fqNameFilter");
    }
}
