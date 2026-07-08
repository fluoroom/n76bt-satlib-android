package qj;

import hj.f;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Function;
import oj.l;
import ui.g;
import uj.h;
import uj.n;
import zj.z0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e extends pj.a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z0 f25249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private yj.b f25250h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private yj.b f25251r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f25252s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f25253t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Collection f25254u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Collection f25255v;

    class a implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f25256a;

        a(int i10) {
            this.f25256a = i10;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(n nVar, n nVar2) {
            return this.f25256a * nVar.i().compareTo(nVar2.i());
        }
    }

    private class b implements xj.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final pj.d f25258a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final pj.d f25259b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f25260c;

        b(boolean z10, pj.d dVar, pj.d dVar2) {
            this.f25260c = z10;
            this.f25258a = dVar;
            this.f25259b = dVar2;
        }

        @Override // xj.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b c(pj.d dVar, pj.d dVar2) {
            return e.this.new b(this.f25260c, dVar, dVar2);
        }

        @Override // xj.b
        public pj.d h(yj.b bVar) {
            return e.this.v(e.this.A(bVar));
        }

        @Override // xj.b
        public boolean i() {
            return this.f25260c;
        }

        @Override // xj.b
        public pj.d j() {
            return this.f25259b;
        }

        @Override // xj.b
        public pj.d m() {
            return this.f25258a;
        }
    }

    private class c implements z0 {
        private c() {
        }

        /* synthetic */ c(e eVar, a aVar) {
            this();
        }
    }

    protected e(dj.c cVar) {
        s(cVar);
        this.f25249g = new c(this, null);
        this.f25250h = yj.b.Q;
        this.f25251r = yj.b.R;
        this.f25252s = false;
        this.f25254u = new ArrayList();
    }

    private void B(yj.b bVar) {
        if (bVar.c0(yj.b.Q) || bVar.c0(yj.b.R)) {
            throw new hj.c(f.CANNOT_START_PROPAGATION_FROM_INFINITY, new Object[0]);
        }
    }

    public pj.d A(yj.b bVar) {
        try {
            l lVarE = E(bVar);
            return new pj.d(lVarE, d().h(this.f25249g, bVar, lVarE.I())).w(D(bVar));
        } catch (hj.a e10) {
            throw new hj.a(e10);
        }
    }

    public void C() {
        this.f25254u.clear();
    }

    protected abstract double D(yj.b bVar);

    public abstract l E(yj.b bVar);

    protected abstract void F(pj.d dVar, boolean z10);

    @Override // pj.c
    public pj.d k(yj.b bVar, yj.b bVar2) {
        B(bVar);
        try {
            p();
            this.f25250h = bVar;
            o(bVar2);
            boolean z10 = bVar2.compareTo(bVar) >= 0;
            pj.d dVarV = v(A(bVar));
            Collection collection = (Collection) d().i().map(new Function() { // from class: qj.c
                public /* synthetic */ Function andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return new n((h) obj);
                }

                public /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            }).collect(Collectors.toList());
            this.f25255v = collection;
            collection.addAll(this.f25254u);
            Iterator it = this.f25255v.iterator();
            while (it.hasNext()) {
                ((n) it.next()).k(dVarV, bVar2);
            }
            f().b(dVarV, bVar2);
            this.f25252s = false;
            this.f25253t = false;
            do {
                dVarV = v(A(y(new b(z10, dVarV, v(A(bVar2))), bVar2).getDate()));
            } while (!this.f25253t);
            Iterator it2 = this.f25255v.iterator();
            while (it2.hasNext()) {
                ((n) it2.next()).g(dVarV);
            }
            this.f25251r = dVarV.getDate();
            t(dVarV.getDate());
            return dVarV;
        } catch (g e10) {
            throw hj.a.c(e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0104, code lost:
    
        r0 = r0.b();
        F(r0, r13.i());
        j$.lang.Iterable$EL.forEach(r12.f25255v, new qj.d(r0, r14));
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0119, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected pj.d y(xj.b r13, final yj.b r14) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qj.e.y(xj.b, yj.b):pj.d");
    }

    public void z(h hVar) {
        this.f25254u.add(new n(hVar));
    }
}
