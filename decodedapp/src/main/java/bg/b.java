package bg;

import ag.b0;
import ag.f;
import ag.o;
import ag.q;
import ag.w;
import ag.x;
import dg.n;
import ee.o;
import he.h0;
import he.m0;
import he.o0;
import he.r0;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import pe.c;
import rd.l;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements ee.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d f4042b = new d();

    static final /* synthetic */ class a extends l implements qd.l {
        a(Object obj) {
            super(1, obj, d.class, "loadResource", "loadResource(Ljava/lang/String;)Ljava/io/InputStream;", 0);
        }

        @Override // qd.l
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final InputStream l(String str) {
            m.e(str, "p0");
            return ((d) this.f25940b).a(str);
        }
    }

    @Override // ee.b
    public o0 a(n nVar, h0 h0Var, Iterable iterable, je.c cVar, je.a aVar, boolean z10) {
        m.e(nVar, "storageManager");
        m.e(h0Var, "builtInsModule");
        m.e(iterable, "classDescriptorFactories");
        m.e(cVar, "platformDependentDeclarationFilter");
        m.e(aVar, "additionalClassPartsProvider");
        return b(nVar, h0Var, o.K, iterable, cVar, aVar, z10, new a(this.f4042b));
    }

    public final o0 b(n nVar, h0 h0Var, Set set, Iterable iterable, je.c cVar, je.a aVar, boolean z10, qd.l lVar) throws IOException {
        c cVarA;
        n nVar2 = nVar;
        h0 h0Var2 = h0Var;
        m.e(nVar2, "storageManager");
        m.e(h0Var2, "module");
        m.e(set, "packageFqNames");
        m.e(iterable, "classDescriptorFactories");
        m.e(cVar, "platformDependentDeclarationFilter");
        m.e(aVar, "additionalClassPartsProvider");
        m.e(lVar, "loadResource");
        ArrayList arrayList = new ArrayList();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            mf.c cVar2 = (mf.c) it.next();
            InputStream inputStream = (InputStream) lVar.l(bg.a.f4041r.r(cVar2));
            if (inputStream != null) {
                h0 h0Var3 = h0Var2;
                cVarA = c.f4043x.a(cVar2, nVar, h0Var3, inputStream, z10);
                nVar2 = nVar;
                h0Var2 = h0Var3;
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        r0 r0Var = new r0(arrayList);
        m0 m0Var = new m0(nVar2, h0Var2);
        o.a aVar2 = o.a.f556a;
        q qVar = new q(r0Var);
        bg.a aVar3 = bg.a.f4041r;
        f fVar = new f(h0Var2, m0Var, aVar3);
        b0.a aVar4 = b0.a.f463a;
        w wVar = w.f597a;
        m.d(wVar, "DO_NOTHING");
        ag.n nVar3 = new ag.n(nVar2, h0Var, aVar2, qVar, fVar, r0Var, aVar4, wVar, c.a.f24112a, x.a.f606a, iterable, m0Var, ag.m.f518a.a(), aVar, cVar, aVar3.e(), null, new wf.b(nVar2, ed.q.k()), null, null, 851968, null);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((c) it2.next()).L0(nVar3);
        }
        return r0Var;
    }
}
