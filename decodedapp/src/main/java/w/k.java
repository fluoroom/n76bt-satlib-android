package w;

import java.util.Iterator;
import w.f;

/* JADX INFO: loaded from: classes.dex */
class k extends p {
    k(v.e eVar) {
        super(eVar);
    }

    private void q(f fVar) {
        this.f30966h.f30917k.add(fVar);
        fVar.f30918l.add(this.f30966h);
    }

    @Override // w.p, w.d
    public void a(d dVar) {
        v.a aVar = (v.a) this.f30960b;
        int iW1 = aVar.w1();
        Iterator it = this.f30966h.f30918l.iterator();
        int i10 = 0;
        int i11 = -1;
        while (it.hasNext()) {
            int i12 = ((f) it.next()).f30913g;
            if (i11 == -1 || i12 < i11) {
                i11 = i12;
            }
            if (i10 < i12) {
                i10 = i12;
            }
        }
        if (iW1 == 0 || iW1 == 2) {
            this.f30966h.d(i11 + aVar.x1());
        } else {
            this.f30966h.d(i10 + aVar.x1());
        }
    }

    @Override // w.p
    void d() {
        v.e eVar = this.f30960b;
        if (eVar instanceof v.a) {
            this.f30966h.f30908b = true;
            v.a aVar = (v.a) eVar;
            int iW1 = aVar.w1();
            boolean zV1 = aVar.v1();
            int i10 = 0;
            if (iW1 == 0) {
                this.f30966h.f30911e = f.a.LEFT;
                while (i10 < aVar.M0) {
                    v.e eVar2 = aVar.L0[i10];
                    if (zV1 || eVar2.V() != 8) {
                        f fVar = eVar2.f29344e.f30966h;
                        fVar.f30917k.add(this.f30966h);
                        this.f30966h.f30918l.add(fVar);
                    }
                    i10++;
                }
                q(this.f30960b.f29344e.f30966h);
                q(this.f30960b.f29344e.f30967i);
                return;
            }
            if (iW1 == 1) {
                this.f30966h.f30911e = f.a.RIGHT;
                while (i10 < aVar.M0) {
                    v.e eVar3 = aVar.L0[i10];
                    if (zV1 || eVar3.V() != 8) {
                        f fVar2 = eVar3.f29344e.f30967i;
                        fVar2.f30917k.add(this.f30966h);
                        this.f30966h.f30918l.add(fVar2);
                    }
                    i10++;
                }
                q(this.f30960b.f29344e.f30966h);
                q(this.f30960b.f29344e.f30967i);
                return;
            }
            if (iW1 == 2) {
                this.f30966h.f30911e = f.a.TOP;
                while (i10 < aVar.M0) {
                    v.e eVar4 = aVar.L0[i10];
                    if (zV1 || eVar4.V() != 8) {
                        f fVar3 = eVar4.f29346f.f30966h;
                        fVar3.f30917k.add(this.f30966h);
                        this.f30966h.f30918l.add(fVar3);
                    }
                    i10++;
                }
                q(this.f30960b.f29346f.f30966h);
                q(this.f30960b.f29346f.f30967i);
                return;
            }
            if (iW1 != 3) {
                return;
            }
            this.f30966h.f30911e = f.a.BOTTOM;
            while (i10 < aVar.M0) {
                v.e eVar5 = aVar.L0[i10];
                if (zV1 || eVar5.V() != 8) {
                    f fVar4 = eVar5.f29346f.f30967i;
                    fVar4.f30917k.add(this.f30966h);
                    this.f30966h.f30918l.add(fVar4);
                }
                i10++;
            }
            q(this.f30960b.f29346f.f30966h);
            q(this.f30960b.f29346f.f30967i);
        }
    }

    @Override // w.p
    public void e() {
        v.e eVar = this.f30960b;
        if (eVar instanceof v.a) {
            int iW1 = ((v.a) eVar).w1();
            if (iW1 == 0 || iW1 == 1) {
                this.f30960b.n1(this.f30966h.f30913g);
            } else {
                this.f30960b.o1(this.f30966h.f30913g);
            }
        }
    }

    @Override // w.p
    void f() {
        this.f30961c = null;
        this.f30966h.c();
    }

    @Override // w.p
    boolean m() {
        return false;
    }
}
