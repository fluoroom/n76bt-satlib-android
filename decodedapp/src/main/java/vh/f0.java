package vh;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c[] f30788b = new c[8];

    private final void c(int i10, c cVar) {
        c cVar2;
        while (true) {
            int i11 = i10 << 1;
            int i12 = i11 + 1;
            int i13 = this.f30787a;
            if (i12 > i13) {
                if (i11 > i13) {
                    break;
                }
                cVar2 = this.f30788b[i11];
                rd.m.b(cVar2);
            } else {
                cVar2 = this.f30788b[i11];
                rd.m.b(cVar2);
                c cVar3 = this.f30788b[i12];
                rd.m.b(cVar3);
                if (rd.m.g(0L, cVar3.u() - cVar2.u()) >= 0) {
                    cVar2 = cVar3;
                }
            }
            if (rd.m.g(0L, cVar2.u() - cVar.u()) <= 0) {
                break;
            }
            int i14 = cVar2.f30763g;
            cVar2.f30763g = i10;
            this.f30788b[i10] = cVar2;
            i10 = i14;
        }
        this.f30788b[i10] = cVar;
        cVar.f30763g = i10;
    }

    private final void d(int i10, c cVar) {
        while (true) {
            int i11 = i10 >> 1;
            if (i11 == 0) {
                break;
            }
            c cVar2 = this.f30788b[i11];
            rd.m.b(cVar2);
            if (rd.m.g(0L, cVar.u() - cVar2.u()) <= 0) {
                break;
            }
            cVar2.f30763g = i10;
            this.f30788b[i10] = cVar2;
            i10 = i11;
        }
        this.f30788b[i10] = cVar;
        cVar.f30763g = i10;
    }

    public final void a(c cVar) {
        rd.m.e(cVar, "node");
        int i10 = this.f30787a + 1;
        this.f30787a = i10;
        c[] cVarArr = this.f30788b;
        if (i10 == cVarArr.length) {
            c[] cVarArr2 = new c[i10 * 2];
            ed.j.m(cVarArr, cVarArr2, 0, 0, 0, 14, null);
            this.f30788b = cVarArr2;
        }
        d(i10, cVar);
    }

    public final c b() {
        return this.f30788b[1];
    }

    public final void e(c cVar) {
        rd.m.e(cVar, "node");
        int i10 = cVar.f30763g;
        if (i10 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i11 = this.f30787a;
        c cVar2 = this.f30788b[i11];
        rd.m.b(cVar2);
        cVar.f30763g = -1;
        this.f30788b[i11] = null;
        this.f30787a = i11 - 1;
        if (cVar == cVar2) {
            return;
        }
        int iG = rd.m.g(0L, cVar2.u() - cVar.u());
        if (iG == 0) {
            this.f30788b[i10] = cVar2;
            cVar2.f30763g = i10;
        } else if (iG < 0) {
            c(i10, cVar2);
        } else {
            d(i10, cVar2);
        }
    }
}
