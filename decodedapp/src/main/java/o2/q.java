package o2;

import com.bumptech.glide.load.data.d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import o2.n;

/* JADX INFO: loaded from: classes.dex */
class q implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final l0.d f23130b;

    static class a implements com.bumptech.glide.load.data.d, d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f23131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final l0.d f23132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f23133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private com.bumptech.glide.h f23134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private d.a f23135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private List f23136f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f23137g;

        a(List list, l0.d dVar) {
            this.f23132b = dVar;
            e3.k.d(list);
            this.f23131a = list;
            this.f23133c = 0;
        }

        private void g() {
            if (this.f23137g) {
                return;
            }
            if (this.f23133c < this.f23131a.size() - 1) {
                this.f23133c++;
                e(this.f23134d, this.f23135e);
            } else {
                e3.k.e(this.f23136f);
                this.f23135e.c(new k2.q("Fetch failed", new ArrayList(this.f23136f)));
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public Class a() {
            return ((com.bumptech.glide.load.data.d) this.f23131a.get(0)).a();
        }

        @Override // com.bumptech.glide.load.data.d
        public void b() {
            List list = this.f23136f;
            if (list != null) {
                this.f23132b.a(list);
            }
            this.f23136f = null;
            Iterator it = this.f23131a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).b();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(Exception exc) {
            ((List) e3.k.e(this.f23136f)).add(exc);
            g();
        }

        @Override // com.bumptech.glide.load.data.d
        public void cancel() {
            this.f23137g = true;
            Iterator it = this.f23131a.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.load.data.d) it.next()).cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d
        public i2.a d() {
            return ((com.bumptech.glide.load.data.d) this.f23131a.get(0)).d();
        }

        @Override // com.bumptech.glide.load.data.d
        public void e(com.bumptech.glide.h hVar, d.a aVar) {
            this.f23134d = hVar;
            this.f23135e = aVar;
            this.f23136f = (List) this.f23132b.b();
            ((com.bumptech.glide.load.data.d) this.f23131a.get(this.f23133c)).e(hVar, this);
            if (this.f23137g) {
                cancel();
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(Object obj) {
            if (obj != null) {
                this.f23135e.f(obj);
            } else {
                g();
            }
        }
    }

    q(List list, l0.d dVar) {
        this.f23129a = list;
        this.f23130b = dVar;
    }

    @Override // o2.n
    public boolean a(Object obj) {
        Iterator it = this.f23129a.iterator();
        while (it.hasNext()) {
            if (((n) it.next()).a(obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // o2.n
    public n.a b(Object obj, int i10, int i11, i2.h hVar) {
        n.a aVarB;
        int size = this.f23129a.size();
        ArrayList arrayList = new ArrayList(size);
        i2.f fVar = null;
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) this.f23129a.get(i12);
            if (nVar.a(obj) && (aVarB = nVar.b(obj, i10, i11, hVar)) != null) {
                fVar = aVarB.f23122a;
                arrayList.add(aVarB.f23124c);
            }
        }
        if (arrayList.isEmpty() || fVar == null) {
            return null;
        }
        return new n.a(fVar, new a(arrayList, this.f23130b));
    }

    public String toString() {
        return "MultiModelLoader{modelLoaders=" + Arrays.toString(this.f23129a.toArray()) + '}';
    }
}
