package xb;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import qb.q;
import qb.q0;
import xb.g;

/* JADX INFO: loaded from: classes3.dex */
final class k extends g {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicInteger f31956n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private q0.k f31957o;

    class a extends g.a {

        /* JADX INFO: renamed from: xb.k$a$a, reason: collision with other inner class name */
        class C0432a extends g.a.C0429a {
            C0432a() {
                super();
            }

            @Override // xb.g.a.C0429a, xb.c, qb.q0.e
            public void f(q qVar, q0.k kVar) {
                super.f(qVar, kVar);
                a aVar = a.this;
                if (k.this.f31869i || qVar != q.IDLE) {
                    return;
                }
                aVar.i().c();
            }
        }

        a(Object obj, q0.c cVar) {
            super(obj, cVar);
        }

        @Override // xb.g.a
        protected g.a.C0429a e() {
            return new C0432a();
        }
    }

    static class b extends q0.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f31960a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f31961b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f31962c;

        public b(List list, AtomicInteger atomicInteger) {
            r9.l.e(!list.isEmpty(), "empty list");
            this.f31960a = list;
            this.f31961b = (AtomicInteger) r9.l.o(atomicInteger, "index");
            Iterator it = list.iterator();
            int iHashCode = 0;
            while (it.hasNext()) {
                iHashCode += ((q0.k) it.next()).hashCode();
            }
            this.f31962c = iHashCode;
        }

        private int b() {
            return (this.f31961b.getAndIncrement() & ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED) % this.f31960a.size();
        }

        @Override // qb.q0.k
        public q0.g a(q0.h hVar) {
            return ((q0.k) this.f31960a.get(b())).a(hVar);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (bVar == this) {
                return true;
            }
            return this.f31962c == bVar.f31962c && this.f31961b == bVar.f31961b && this.f31960a.size() == bVar.f31960a.size() && new HashSet(this.f31960a).containsAll(bVar.f31960a);
        }

        public int hashCode() {
            return this.f31962c;
        }

        public String toString() {
            return r9.g.a(b.class).d("subchannelPickers", this.f31960a).toString();
        }
    }

    public k(q0.e eVar) {
        super(eVar);
        this.f31956n = new AtomicInteger(new Random().nextInt());
        this.f31957o = new q0.d(q0.g.i());
    }

    private q0.k o(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((g.a) it.next()).f());
        }
        return new b(arrayList, this.f31956n);
    }

    private void p(q qVar, q0.k kVar) {
        if (qVar == this.f31871k && kVar.equals(this.f31957o)) {
            return;
        }
        j().f(qVar, kVar);
        this.f31871k = qVar;
        this.f31957o = kVar;
    }

    @Override // xb.g
    protected g.a h(Object obj) {
        return new a(obj, this.f31870j);
    }

    @Override // xb.g
    protected void n() {
        List listK = k();
        if (!listK.isEmpty()) {
            p(q.READY, o(listK));
            return;
        }
        Iterator it = i().iterator();
        while (it.hasNext()) {
            q qVarG = ((g.a) it.next()).g();
            q qVar = q.CONNECTING;
            if (qVarG == qVar || qVarG == q.IDLE) {
                p(qVar, new q0.d(q0.g.i()));
                return;
            }
        }
        p(q.TRANSIENT_FAILURE, o(i()));
    }
}
