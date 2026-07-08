package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
class p {

    /* JADX INFO: renamed from: a */
    final androidx.collection.i f3233a = new androidx.collection.i();

    /* JADX INFO: renamed from: b */
    final androidx.collection.f f3234b = new androidx.collection.f();

    static class a {

        /* JADX INFO: renamed from: d */
        static l0.d f3235d = new l0.e(20);

        /* JADX INFO: renamed from: a */
        int f3236a;

        /* JADX INFO: renamed from: b */
        RecyclerView.n.b f3237b;

        /* JADX INFO: renamed from: c */
        RecyclerView.n.b f3238c;

        private a() {
        }

        static void a() {
            while (f3235d.b() != null) {
            }
        }

        static a b() {
            a aVar = (a) f3235d.b();
            return aVar == null ? new a() : aVar;
        }

        static void c(a aVar) {
            aVar.f3236a = 0;
            aVar.f3237b = null;
            aVar.f3238c = null;
            f3235d.a(aVar);
        }
    }

    interface b {
        void a(RecyclerView.f0 f0Var);

        void b(RecyclerView.f0 f0Var, RecyclerView.n.b bVar, RecyclerView.n.b bVar2);

        void c(RecyclerView.f0 f0Var, RecyclerView.n.b bVar, RecyclerView.n.b bVar2);

        void d(RecyclerView.f0 f0Var, RecyclerView.n.b bVar, RecyclerView.n.b bVar2);
    }

    p() {
    }

    private RecyclerView.n.b l(RecyclerView.f0 f0Var, int i10) {
        a aVar;
        RecyclerView.n.b bVar;
        int iD = this.f3233a.d(f0Var);
        if (iD >= 0 && (aVar = (a) this.f3233a.j(iD)) != null) {
            int i11 = aVar.f3236a;
            if ((i11 & i10) != 0) {
                int i12 = (~i10) & i11;
                aVar.f3236a = i12;
                if (i10 == 4) {
                    bVar = aVar.f3237b;
                } else {
                    if (i10 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    bVar = aVar.f3238c;
                }
                if ((i12 & 12) == 0) {
                    this.f3233a.h(iD);
                    a.c(aVar);
                }
                return bVar;
            }
        }
        return null;
    }

    void a(RecyclerView.f0 f0Var, RecyclerView.n.b bVar) {
        a aVarB = (a) this.f3233a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3233a.put(f0Var, aVarB);
        }
        aVarB.f3236a |= 2;
        aVarB.f3237b = bVar;
    }

    void b(RecyclerView.f0 f0Var) {
        a aVarB = (a) this.f3233a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3233a.put(f0Var, aVarB);
        }
        aVarB.f3236a |= 1;
    }

    void c(long j10, RecyclerView.f0 f0Var) {
        this.f3234b.j(j10, f0Var);
    }

    void d(RecyclerView.f0 f0Var, RecyclerView.n.b bVar) {
        a aVarB = (a) this.f3233a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3233a.put(f0Var, aVarB);
        }
        aVarB.f3238c = bVar;
        aVarB.f3236a |= 8;
    }

    void e(RecyclerView.f0 f0Var, RecyclerView.n.b bVar) {
        a aVarB = (a) this.f3233a.get(f0Var);
        if (aVarB == null) {
            aVarB = a.b();
            this.f3233a.put(f0Var, aVarB);
        }
        aVarB.f3237b = bVar;
        aVarB.f3236a |= 4;
    }

    void f() {
        this.f3233a.clear();
        this.f3234b.b();
    }

    RecyclerView.f0 g(long j10) {
        return (RecyclerView.f0) this.f3234b.f(j10);
    }

    boolean h(RecyclerView.f0 f0Var) {
        a aVar = (a) this.f3233a.get(f0Var);
        return (aVar == null || (aVar.f3236a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.f0 f0Var) {
        a aVar = (a) this.f3233a.get(f0Var);
        return (aVar == null || (aVar.f3236a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.f0 f0Var) {
        p(f0Var);
    }

    RecyclerView.n.b m(RecyclerView.f0 f0Var) {
        return l(f0Var, 8);
    }

    RecyclerView.n.b n(RecyclerView.f0 f0Var) {
        return l(f0Var, 4);
    }

    void o(b bVar) {
        for (int size = this.f3233a.size() - 1; size >= 0; size--) {
            RecyclerView.f0 f0Var = (RecyclerView.f0) this.f3233a.f(size);
            a aVar = (a) this.f3233a.h(size);
            int i10 = aVar.f3236a;
            if ((i10 & 3) == 3) {
                bVar.a(f0Var);
            } else if ((i10 & 1) != 0) {
                RecyclerView.n.b bVar2 = aVar.f3237b;
                if (bVar2 == null) {
                    bVar.a(f0Var);
                } else {
                    bVar.c(f0Var, bVar2, aVar.f3238c);
                }
            } else if ((i10 & 14) == 14) {
                bVar.b(f0Var, aVar.f3237b, aVar.f3238c);
            } else if ((i10 & 12) == 12) {
                bVar.d(f0Var, aVar.f3237b, aVar.f3238c);
            } else if ((i10 & 4) != 0) {
                bVar.c(f0Var, aVar.f3237b, null);
            } else if ((i10 & 8) != 0) {
                bVar.b(f0Var, aVar.f3237b, aVar.f3238c);
            }
            a.c(aVar);
        }
    }

    void p(RecyclerView.f0 f0Var) {
        a aVar = (a) this.f3233a.get(f0Var);
        if (aVar == null) {
            return;
        }
        aVar.f3236a &= -2;
    }

    void q(RecyclerView.f0 f0Var) {
        int iN = this.f3234b.n() - 1;
        while (true) {
            if (iN < 0) {
                break;
            }
            if (f0Var == this.f3234b.o(iN)) {
                this.f3234b.m(iN);
                break;
            }
            iN--;
        }
        a aVar = (a) this.f3233a.remove(f0Var);
        if (aVar != null) {
            a.c(aVar);
        }
    }
}
