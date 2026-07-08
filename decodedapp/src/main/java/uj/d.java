package uj;

import j$.util.Collection;
import j$.util.function.Predicate$CC;
import java.util.ArrayList;
import java.util.function.Predicate;
import uj.d;
import yj.f0;
import yj.g0;

/* JADX INFO: loaded from: classes3.dex */
public class d extends uj.a implements g0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f29259d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private yj.b f29260e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ArrayList f29261f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f29262g;

    /* JADX INFO: Access modifiers changed from: private */
    static class a implements g0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final yj.b f29263a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f29264b;

        a(yj.b bVar, boolean z10) {
            this.f29263a = bVar;
            this.f29264b = z10;
        }

        public boolean a() {
            return this.f29264b;
        }

        @Override // yj.g0
        public /* synthetic */ double e(g0 g0Var) {
            return f0.a(this, g0Var);
        }

        @Override // yj.g0
        public yj.b getDate() {
            return this.f29263a;
        }
    }

    public d(g0... g0VarArr) {
        this(new f(wj.g.c(g0VarArr), 1.0E-10d, 100), new vj.e(), 1.0d, g0VarArr);
    }

    private a A(yj.b bVar) {
        double dX = bVar.X(((a) this.f29261f.get(this.f29262g)).getDate());
        boolean z10 = false;
        if (dX < 0.0d && this.f29262g > 0) {
            while (true) {
                int i10 = this.f29262g;
                if (i10 <= 0 || z10) {
                    break;
                }
                if (bVar.X(((a) this.f29261f.get(i10 - 1)).getDate()) < ((a) this.f29261f.get(this.f29262g)).getDate().X(bVar)) {
                    this.f29262g--;
                } else {
                    z10 = true;
                }
            }
        } else if (dX > 0.0d && this.f29262g < this.f29261f.size() - 1) {
            int size = this.f29261f.size() - 1;
            while (true) {
                int i11 = this.f29262g;
                if (i11 >= size || z10) {
                    break;
                }
                if (bVar.X(((a) this.f29261f.get(i11 + 1)).getDate()) > ((a) this.f29261f.get(this.f29262g)).getDate().X(bVar)) {
                    this.f29262g++;
                } else {
                    z10 = true;
                }
            }
        }
        return (a) this.f29261f.get(this.f29262g);
    }

    public d B(double d10) {
        return new d(h(), getHandler(), d10, (g0[]) this.f29261f.toArray(new a[0]));
    }

    @Override // yj.g0
    public /* synthetic */ double e(g0 g0Var) {
        return f0.a(this, g0Var);
    }

    @Override // yj.g0
    public yj.b getDate() {
        int i10 = this.f29262g;
        if (i10 < 0) {
            return null;
        }
        return ((a) this.f29261f.get(i10)).getDate();
    }

    @Override // uj.h
    public double i(pj.d dVar) {
        yj.b date = dVar.getDate();
        this.f29260e = date;
        if (this.f29262g < 0) {
            return -1.0d;
        }
        a aVarA = A(date);
        return aVarA.a() ? this.f29260e.X(aVarA.getDate()) : aVarA.getDate().X(this.f29260e);
    }

    public void y(yj.b bVar) {
        boolean z10 = true;
        if (this.f29262g < 0) {
            yj.b bVar2 = this.f29260e;
            if (bVar2 != null && bVar.X(bVar2) <= 0.0d) {
                z10 = false;
            }
            this.f29262g = 0;
            this.f29261f.add(new a(bVar, z10));
            return;
        }
        int size = this.f29261f.size() - 1;
        yj.b date = ((a) this.f29261f.get(0)).getDate();
        yj.b date2 = ((a) this.f29261f.get(size)).getDate();
        if (date.X(bVar) > this.f29259d) {
            this.f29261f.add(0, new a(bVar, !((a) this.f29261f.get(0)).a()));
            this.f29262g++;
        } else {
            if (bVar.X(date2) <= this.f29259d) {
                throw new hj.c(hj.f.EVENT_DATE_TOO_CLOSE, bVar, date, date2, Double.valueOf(this.f29259d), Double.valueOf(date.X(bVar)), Double.valueOf(bVar.X(date2)));
            }
            this.f29261f.add(new a(bVar, !((a) this.f29261f.get(size)).a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // uj.a
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public d p(f fVar, vj.b bVar) {
        return new d(fVar, bVar, this.f29259d, (g0[]) this.f29261f.toArray(new a[0]));
    }

    protected d(f fVar, vj.b bVar, double d10, g0... g0VarArr) {
        super(fVar, bVar);
        this.f29262g = -1;
        this.f29260e = null;
        this.f29261f = new ArrayList();
        this.f29259d = d10;
        for (g0 g0Var : g0VarArr) {
            final yj.b date = g0Var.getDate();
            if (Collection.EL.stream(this.f29261f).noneMatch(new Predicate() { // from class: uj.c
                public /* synthetic */ Predicate and(Predicate predicate) {
                    return Predicate$CC.$default$and(this, predicate);
                }

                public /* synthetic */ Predicate negate() {
                    return Predicate$CC.$default$negate(this);
                }

                public /* synthetic */ Predicate or(Predicate predicate) {
                    return Predicate$CC.$default$or(this, predicate);
                }

                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((d.a) obj).getDate().c0(date);
                }
            })) {
                y(date);
            }
        }
    }
}
