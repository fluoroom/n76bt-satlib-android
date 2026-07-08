package rc;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends rc.a {

    /* JADX INFO: renamed from: c */
    final mc.d f25901c;

    static final class a extends vc.a {

        /* JADX INFO: renamed from: f */
        final mc.d f25902f;

        a(pc.a aVar, mc.d dVar) {
            super(aVar);
            this.f25902f = dVar;
        }

        @Override // pc.a
        public boolean b(Object obj) {
            if (this.f30524d) {
                return false;
            }
            try {
                return this.f30521a.b(oc.b.c(this.f25902f.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                f(th2);
                return true;
            }
        }

        @Override // pc.c
        public int e(int i10) {
            return g(i10);
        }

        @Override // ck.b
        public void onNext(Object obj) {
            if (this.f30524d) {
                return;
            }
            if (this.f30525e != 0) {
                this.f30521a.onNext(null);
                return;
            }
            try {
                this.f30521a.onNext(oc.b.c(this.f25902f.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                f(th2);
            }
        }

        @Override // pc.g
        public Object poll() {
            Object objPoll = this.f30523c.poll();
            if (objPoll != null) {
                return oc.b.c(this.f25902f.apply(objPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    static final class b extends vc.b {

        /* JADX INFO: renamed from: f */
        final mc.d f25903f;

        b(ck.b bVar, mc.d dVar) {
            super(bVar);
            this.f25903f = dVar;
        }

        @Override // pc.c
        public int e(int i10) {
            return g(i10);
        }

        @Override // ck.b
        public void onNext(Object obj) {
            if (this.f30529d) {
                return;
            }
            if (this.f30530e != 0) {
                this.f30526a.onNext(null);
                return;
            }
            try {
                this.f30526a.onNext(oc.b.c(this.f25903f.apply(obj), "The mapper function returned a null value."));
            } catch (Throwable th2) {
                f(th2);
            }
        }

        @Override // pc.g
        public Object poll() {
            Object objPoll = this.f30528c.poll();
            if (objPoll != null) {
                return oc.b.c(this.f25903f.apply(objPoll), "The mapper function returned a null value.");
            }
            return null;
        }
    }

    public g(hc.c cVar, mc.d dVar) {
        super(cVar);
        this.f25901c = dVar;
    }

    @Override // hc.c
    protected void m(ck.b bVar) {
        if (bVar instanceof pc.a) {
            this.f25856b.l(new a((pc.a) bVar, this.f25901c));
        } else {
            this.f25856b.l(new b(bVar, this.f25901c));
        }
    }
}
