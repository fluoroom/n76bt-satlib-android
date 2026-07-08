package w;

/* JADX INFO: loaded from: classes.dex */
class j extends p {
    j(v.e eVar) {
        super(eVar);
        eVar.f29344e.f();
        eVar.f29346f.f();
        this.f30964f = ((v.h) eVar).t1();
    }

    private void q(f fVar) {
        this.f30966h.f30917k.add(fVar);
        fVar.f30918l.add(this.f30966h);
    }

    @Override // w.p, w.d
    public void a(d dVar) {
        f fVar = this.f30966h;
        if (fVar.f30909c && !fVar.f30916j) {
            this.f30966h.d((int) ((((f) fVar.f30918l.get(0)).f30913g * ((v.h) this.f30960b).w1()) + 0.5f));
        }
    }

    @Override // w.p
    void d() {
        v.h hVar = (v.h) this.f30960b;
        int iU1 = hVar.u1();
        int iV1 = hVar.v1();
        hVar.w1();
        if (hVar.t1() == 1) {
            if (iU1 != -1) {
                this.f30966h.f30918l.add(this.f30960b.f29337a0.f29344e.f30966h);
                this.f30960b.f29337a0.f29344e.f30966h.f30917k.add(this.f30966h);
                this.f30966h.f30912f = iU1;
            } else if (iV1 != -1) {
                this.f30966h.f30918l.add(this.f30960b.f29337a0.f29344e.f30967i);
                this.f30960b.f29337a0.f29344e.f30967i.f30917k.add(this.f30966h);
                this.f30966h.f30912f = -iV1;
            } else {
                f fVar = this.f30966h;
                fVar.f30908b = true;
                fVar.f30918l.add(this.f30960b.f29337a0.f29344e.f30967i);
                this.f30960b.f29337a0.f29344e.f30967i.f30917k.add(this.f30966h);
            }
            q(this.f30960b.f29344e.f30966h);
            q(this.f30960b.f29344e.f30967i);
            return;
        }
        if (iU1 != -1) {
            this.f30966h.f30918l.add(this.f30960b.f29337a0.f29346f.f30966h);
            this.f30960b.f29337a0.f29346f.f30966h.f30917k.add(this.f30966h);
            this.f30966h.f30912f = iU1;
        } else if (iV1 != -1) {
            this.f30966h.f30918l.add(this.f30960b.f29337a0.f29346f.f30967i);
            this.f30960b.f29337a0.f29346f.f30967i.f30917k.add(this.f30966h);
            this.f30966h.f30912f = -iV1;
        } else {
            f fVar2 = this.f30966h;
            fVar2.f30908b = true;
            fVar2.f30918l.add(this.f30960b.f29337a0.f29346f.f30967i);
            this.f30960b.f29337a0.f29346f.f30967i.f30917k.add(this.f30966h);
        }
        q(this.f30960b.f29346f.f30966h);
        q(this.f30960b.f29346f.f30967i);
    }

    @Override // w.p
    public void e() {
        if (((v.h) this.f30960b).t1() == 1) {
            this.f30960b.n1(this.f30966h.f30913g);
        } else {
            this.f30960b.o1(this.f30966h.f30913g);
        }
    }

    @Override // w.p
    void f() {
        this.f30966h.c();
    }

    @Override // w.p
    boolean m() {
        return false;
    }
}
