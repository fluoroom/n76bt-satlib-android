package s;

import java.util.ArrayList;
import s.d;
import s.i;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f26225e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f26221a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f26222b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f26223c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList f26224d = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f26226f = false;

    public interface a {
        void a(i iVar, float f10);

        int b();

        float c(b bVar, boolean z10);

        void clear();

        float d(i iVar, boolean z10);

        i e(int i10);

        float f(i iVar);

        void g();

        float h(int i10);

        boolean i(i iVar);

        void j(float f10);

        void k(i iVar, float f10, boolean z10);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f26280v <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iB = this.f26225e.b();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < iB; i10++) {
            float fH = this.f26225e.h(i10);
            if (fH < 0.0f) {
                i iVarE = this.f26225e.e(i10);
                if ((zArr == null || !zArr[iVarE.f26270c]) && iVarE != iVar && (((aVar = iVarE.f26277s) == i.a.SLACK || aVar == i.a.ERROR) && fH < f10)) {
                    f10 = fH;
                    iVar2 = iVarE;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f26274g) {
            return;
        }
        this.f26222b += iVar.f26273f * this.f26225e.f(iVar);
        this.f26225e.d(iVar, z10);
        if (z10) {
            iVar.f(this);
        }
        if (d.f26233u && this.f26225e.b() == 0) {
            this.f26226f = true;
            dVar.f26239b = true;
        }
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f26222b += bVar.f26222b * this.f26225e.c(bVar, z10);
        if (z10) {
            bVar.f26221a.f(this);
        }
        if (d.f26233u && this.f26221a != null && this.f26225e.b() == 0) {
            this.f26226f = true;
            dVar.f26239b = true;
        }
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f26281w) {
            return;
        }
        float f10 = this.f26225e.f(iVar);
        this.f26222b += iVar.f26283y * f10;
        this.f26225e.d(iVar, z10);
        if (z10) {
            iVar.f(this);
        }
        this.f26225e.k(dVar.f26252o.f26230d[iVar.f26282x], f10, z10);
        if (d.f26233u && this.f26225e.b() == 0) {
            this.f26226f = true;
            dVar.f26239b = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f26245h.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int iB = this.f26225e.b();
            for (int i10 = 0; i10 < iB; i10++) {
                i iVarE = this.f26225e.e(i10);
                if (iVarE.f26271d != -1 || iVarE.f26274g || iVarE.f26281w) {
                    this.f26224d.add(iVarE);
                }
            }
            int size = this.f26224d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = (i) this.f26224d.get(i11);
                    if (iVar.f26274g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f26281w) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f26245h[iVar.f26271d], true);
                    }
                }
                this.f26224d.clear();
            } else {
                z10 = true;
            }
        }
        if (d.f26233u && this.f26221a != null && this.f26225e.b() == 0) {
            this.f26226f = true;
            dVar.f26239b = true;
        }
    }

    @Override // s.d.a
    public void a(i iVar) {
        int i10 = iVar.f26272e;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f26225e.a(iVar, f10);
    }

    @Override // s.d.a
    public i b(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // s.d.a
    public void c(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f26221a = null;
            this.f26225e.clear();
            for (int i10 = 0; i10 < bVar.f26225e.b(); i10++) {
                this.f26225e.k(bVar.f26225e.e(i10), bVar.f26225e.h(i10), true);
            }
        }
    }

    @Override // s.d.a
    public void clear() {
        this.f26225e.clear();
        this.f26221a = null;
        this.f26222b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f26225e.a(dVar.o(i10, "ep"), 1.0f);
        this.f26225e.a(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i10) {
        this.f26225e.a(iVar, i10);
        return this;
    }

    boolean f(d dVar) {
        boolean z10;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z10 = true;
        } else {
            x(iVarG);
            z10 = false;
        }
        if (this.f26225e.b() == 0) {
            this.f26226f = true;
        }
        return z10;
    }

    i g(d dVar) {
        int iB = this.f26225e.b();
        i iVar = null;
        i iVar2 = null;
        boolean z10 = false;
        boolean z11 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        for (int i10 = 0; i10 < iB; i10++) {
            float fH = this.f26225e.h(i10);
            i iVarE = this.f26225e.e(i10);
            if (iVarE.f26277s == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > fH) {
                    boolean zU = u(iVarE, dVar);
                    z10 = zU;
                    f10 = fH;
                    iVar = iVarE;
                } else if (!z10 && u(iVarE, dVar)) {
                    f10 = fH;
                    iVar = iVarE;
                    z10 = true;
                }
            } else if (iVar == null && fH < 0.0f) {
                if (iVar2 == null || f11 > fH) {
                    boolean zU2 = u(iVarE, dVar);
                    z11 = zU2;
                    f11 = fH;
                    iVar2 = iVarE;
                } else if (!z11 && u(iVarE, dVar)) {
                    f11 = fH;
                    iVar2 = iVarE;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // s.d.a
    public i getKey() {
        return this.f26221a;
    }

    b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        if (iVar2 == iVar3) {
            this.f26225e.a(iVar, 1.0f);
            this.f26225e.a(iVar4, 1.0f);
            this.f26225e.a(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f26225e.a(iVar, 1.0f);
            this.f26225e.a(iVar2, -1.0f);
            this.f26225e.a(iVar3, -1.0f);
            this.f26225e.a(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                this.f26222b = (-i10) + i11;
                return this;
            }
        } else {
            if (f10 <= 0.0f) {
                this.f26225e.a(iVar, -1.0f);
                this.f26225e.a(iVar2, 1.0f);
                this.f26222b = i10;
                return this;
            }
            if (f10 >= 1.0f) {
                this.f26225e.a(iVar4, -1.0f);
                this.f26225e.a(iVar3, 1.0f);
                this.f26222b = -i11;
                return this;
            }
            float f11 = 1.0f - f10;
            this.f26225e.a(iVar, f11 * 1.0f);
            this.f26225e.a(iVar2, f11 * (-1.0f));
            this.f26225e.a(iVar3, (-1.0f) * f10);
            this.f26225e.a(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                this.f26222b = ((-i10) * f11) + (i11 * f10);
                return this;
            }
        }
        return this;
    }

    b i(i iVar, int i10) {
        this.f26221a = iVar;
        float f10 = i10;
        iVar.f26273f = f10;
        this.f26222b = f10;
        this.f26226f = true;
        return this;
    }

    @Override // s.d.a
    public boolean isEmpty() {
        return this.f26221a == null && this.f26222b == 0.0f && this.f26225e.b() == 0;
    }

    b j(i iVar, i iVar2, float f10) {
        this.f26225e.a(iVar, -1.0f);
        this.f26225e.a(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f26225e.a(iVar, -1.0f);
        this.f26225e.a(iVar2, 1.0f);
        this.f26225e.a(iVar3, f10);
        this.f26225e.a(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f26222b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f26225e.a(iVar, 1.0f);
            this.f26225e.a(iVar2, -1.0f);
            this.f26225e.a(iVar4, 1.0f);
            this.f26225e.a(iVar3, -1.0f);
            return this;
        }
        if (f10 == 0.0f) {
            this.f26225e.a(iVar, 1.0f);
            this.f26225e.a(iVar2, -1.0f);
            return this;
        }
        if (f12 == 0.0f) {
            this.f26225e.a(iVar3, 1.0f);
            this.f26225e.a(iVar4, -1.0f);
            return this;
        }
        float f13 = (f10 / f11) / (f12 / f11);
        this.f26225e.a(iVar, 1.0f);
        this.f26225e.a(iVar2, -1.0f);
        this.f26225e.a(iVar4, f13);
        this.f26225e.a(iVar3, -f13);
        return this;
    }

    public b m(i iVar, int i10) {
        if (i10 < 0) {
            this.f26222b = i10 * (-1);
            this.f26225e.a(iVar, 1.0f);
            return this;
        }
        this.f26222b = i10;
        this.f26225e.a(iVar, -1.0f);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f26222b = i10;
        }
        if (z10) {
            this.f26225e.a(iVar, 1.0f);
            this.f26225e.a(iVar2, -1.0f);
            return this;
        }
        this.f26225e.a(iVar, -1.0f);
        this.f26225e.a(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f26222b = i10;
        }
        if (z10) {
            this.f26225e.a(iVar, 1.0f);
            this.f26225e.a(iVar2, -1.0f);
            this.f26225e.a(iVar3, -1.0f);
            return this;
        }
        this.f26225e.a(iVar, -1.0f);
        this.f26225e.a(iVar2, 1.0f);
        this.f26225e.a(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f26222b = i10;
        }
        if (z10) {
            this.f26225e.a(iVar, 1.0f);
            this.f26225e.a(iVar2, -1.0f);
            this.f26225e.a(iVar3, 1.0f);
            return this;
        }
        this.f26225e.a(iVar, -1.0f);
        this.f26225e.a(iVar2, 1.0f);
        this.f26225e.a(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f26225e.a(iVar3, 0.5f);
        this.f26225e.a(iVar4, 0.5f);
        this.f26225e.a(iVar, -0.5f);
        this.f26225e.a(iVar2, -0.5f);
        this.f26222b = -f10;
        return this;
    }

    void r() {
        float f10 = this.f26222b;
        if (f10 < 0.0f) {
            this.f26222b = f10 * (-1.0f);
            this.f26225e.g();
        }
    }

    boolean s() {
        i iVar = this.f26221a;
        if (iVar != null) {
            return iVar.f26277s == i.a.UNRESTRICTED || this.f26222b >= 0.0f;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.f26225e.i(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f26221a;
        if (iVar2 != null) {
            this.f26225e.a(iVar2, -1.0f);
            this.f26221a.f26271d = -1;
            this.f26221a = null;
        }
        float fD = this.f26225e.d(iVar, true) * (-1.0f);
        this.f26221a = iVar;
        if (fD == 1.0f) {
            return;
        }
        this.f26222b /= fD;
        this.f26225e.j(fD);
    }

    public void y() {
        this.f26221a = null;
        this.f26225e.clear();
        this.f26222b = 0.0f;
        this.f26226f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    java.lang.String z() {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s.b.z():java.lang.String");
    }

    public b(c cVar) {
        this.f26225e = new s.a(this, cVar);
    }
}
