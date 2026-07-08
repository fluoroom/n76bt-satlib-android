package sc;

import hc.h;
import hc.i;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends sc.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final mc.d f27280b;

    static final class a extends qc.a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final mc.d f27281f;

        a(i iVar, mc.d dVar) {
            super(iVar);
            this.f27281f = dVar;
        }

        @Override // pc.c
        public int e(int i10) {
            return g(i10);
        }

        @Override // hc.i
        public void onNext(Object obj) {
            if (this.f24866d) {
                return;
            }
            if (this.f24867e != 0) {
                this.f24863a.onNext(null);
                return;
            }
            try {
                this.f24863a.onNext(oc.b.c(this.f27281f.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                f(th2);
            }
        }

        @Override // pc.g
        public Object poll() {
            Object objPoll = this.f24865c.poll();
            if (objPoll != null) {
                return oc.b.c(this.f27281f.apply(objPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public c(h hVar, mc.d dVar) {
        super(hVar);
        this.f27280b = dVar;
    }

    @Override // hc.g
    public void k(i iVar) {
        this.f27278a.a(new a(iVar, this.f27280b));
    }
}
