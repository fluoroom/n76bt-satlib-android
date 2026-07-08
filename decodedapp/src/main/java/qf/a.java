package qf;

import he.e0;
import he.k1;
import he.n0;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import xf.n;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f25119a = new a();

    /* JADX INFO: renamed from: qf.a$a, reason: collision with other inner class name */
    public static final class C0343a implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return gd.a.d(uf.e.o((he.e) obj).a(), uf.e.o((he.e) obj2).a());
        }
    }

    private a() {
    }

    private static final void b(he.e eVar, LinkedHashSet linkedHashSet, xf.k kVar, boolean z10) {
        for (he.m mVar : n.a.a(kVar, xf.d.f32055t, null, 2, null)) {
            if (mVar instanceof he.e) {
                he.e eVarR = (he.e) mVar;
                if (eVarR.M()) {
                    mf.f name = eVarR.getName();
                    rd.m.d(name, "getName(...)");
                    he.h hVarG = kVar.g(name, pe.d.f24125v);
                    eVarR = hVarG instanceof he.e ? (he.e) hVarG : hVarG instanceof k1 ? ((k1) hVarG).r() : null;
                }
                if (eVarR != null) {
                    if (i.z(eVarR, eVar)) {
                        linkedHashSet.add(eVarR);
                    }
                    if (z10) {
                        xf.k kVarY0 = eVarR.y0();
                        rd.m.d(kVarY0, "getUnsubstitutedInnerClassesScope(...)");
                        b(eVar, linkedHashSet, kVarY0, z10);
                    }
                }
            }
        }
    }

    public Collection a(he.e eVar, boolean z10) {
        Object next;
        he.m mVarB;
        rd.m.e(eVar, "sealedClass");
        if (eVar.l() != e0.f15260c) {
            return ed.q.k();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (z10) {
            Iterator it = uf.e.u(eVar).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((he.m) next) instanceof n0) {
                    break;
                }
            }
            mVarB = (he.m) next;
        } else {
            mVarB = eVar.b();
        }
        if (mVarB instanceof n0) {
            b(eVar, linkedHashSet, ((n0) mVarB).p(), z10);
        }
        xf.k kVarY0 = eVar.y0();
        rd.m.d(kVarY0, "getUnsubstitutedInnerClassesScope(...)");
        b(eVar, linkedHashSet, kVarY0, true);
        return ed.q.B0(linkedHashSet, new C0343a());
    }
}
