package ej;

import ej.j;
import kj.a2;
import kj.b1;
import kj.b2;
import kj.r0;
import kj.s1;
import kj.t1;
import kj.y1;
import zj.k1;

/* JADX INFO: loaded from: classes3.dex */
class i implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f12651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f12652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j.e f12653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient j.f f12654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final double f12655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final double f12656f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f12657g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final r0 f12658h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final r0 f12659r;

    private class a extends r0 {

        /* JADX INFO: renamed from: ej.i$a$a, reason: collision with other inner class name */
        class C0174a implements b2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f12661a;

            C0174a(i iVar) {
                this.f12661a = iVar;
            }

            @Override // kj.b2
            public /* synthetic */ b1 a(yj.b bVar) {
                return a2.a(this, bVar);
            }

            @Override // kj.b2
            public y1 b(yj.b bVar) {
                double dP = this.f12661a.f12657g.P(bVar);
                double dP2 = this.f12661a.f12657g.P(bVar.a(10.0d));
                xi.f fVar = xi.f.f32237r;
                return new y1(bVar, new xi.b(fVar, dP, xi.c.FRAME_TRANSFORM), new xi.f((dP2 - dP) / 10.0d, fVar));
            }

            @Override // kj.b2
            public /* synthetic */ t1 c(yj.b bVar) {
                return a2.b(this, bVar);
            }
        }

        a(String str) {
            r0 r0Var = i.this.f12658h;
            C0174a c0174a = new C0174a(i.this);
            if (str == null) {
                str = i.this.f12651a + "/rotating";
            }
            super(r0Var, (b2) c0174a, str, false);
        }
    }

    private class b extends r0 {

        class a implements b2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ i f12663a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r0 f12664b;

            a(i iVar, r0 r0Var) {
                this.f12663a = iVar;
                this.f12664b = r0Var;
            }

            @Override // kj.b2
            public /* synthetic */ b1 a(yj.b bVar) {
                return a2.a(this, bVar);
            }

            @Override // kj.b2
            public y1 b(yj.b bVar) {
                return new y1(bVar, new y1(bVar, this.f12663a.f(bVar, this.f12664b).u()), new y1(bVar, new xi.b(this.f12663a.f12657g.V(bVar), this.f12663a.f12657g.y(bVar), xi.f.f32237r, xi.f.f32233e)));
            }

            @Override // kj.b2
            public t1 c(yj.b bVar) {
                xi.f fVarG = this.f12663a.g(bVar, this.f12664b);
                return s1.g(bVar, fVarG.o(), new xi.b(this.f12663a.f12657g.V(bVar), this.f12663a.f12657g.y(bVar), xi.f.f32237r, xi.f.f32233e));
            }
        }

        b(r0 r0Var, String str) {
            a aVar = new a(i.this, r0Var);
            if (str == null) {
                str = i.this.f12651a + "/inertial";
            }
            super(r0Var, (b2) aVar, str, true);
        }
    }

    i(String str, String str2, j.e eVar, j.f fVar, double d10, double d11, h hVar, r0 r0Var, String str3, String str4) {
        this.f12651a = str;
        this.f12655e = d10;
        this.f12656f = d11;
        this.f12652b = str2;
        this.f12653c = eVar;
        this.f12654d = fVar;
        this.f12657g = hVar;
        this.f12658h = new b(r0Var, str3);
        this.f12659r = new a(str4);
    }

    public k1 f(yj.b bVar, r0 r0Var) {
        return l().s().x(r0Var, bVar).t(new k1(bVar, this.f12656f, this.f12654d.b(bVar)));
    }

    public xi.f g(yj.b bVar, r0 r0Var) {
        return l().s().u(r0Var, bVar).q(this.f12654d.a(bVar).U(this.f12656f));
    }

    @Override // ej.c
    public r0 l() {
        return this.f12658h;
    }
}
