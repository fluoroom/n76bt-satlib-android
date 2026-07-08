package w;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
class m {

    /* JADX INFO: renamed from: h */
    public static int f30934h;

    /* JADX INFO: renamed from: c */
    p f30937c;

    /* JADX INFO: renamed from: d */
    p f30938d;

    /* JADX INFO: renamed from: f */
    int f30940f;

    /* JADX INFO: renamed from: g */
    int f30941g;

    /* JADX INFO: renamed from: a */
    public int f30935a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f30936b = false;

    /* JADX INFO: renamed from: e */
    ArrayList f30939e = new ArrayList();

    m(p pVar, int i10) {
        this.f30937c = null;
        this.f30938d = null;
        int i11 = f30934h;
        this.f30940f = i11;
        f30934h = i11 + 1;
        this.f30937c = pVar;
        this.f30938d = pVar;
        this.f30941g = i10;
    }

    private long c(f fVar, long j10) {
        p pVar = fVar.f30910d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f30917k.size();
        long jMin = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f30917k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f30910d != pVar) {
                    jMin = Math.min(jMin, c(fVar2, ((long) fVar2.f30912f) + j10));
                }
            }
        }
        if (fVar != pVar.f30967i) {
            return jMin;
        }
        long j11 = j10 - pVar.j();
        return Math.min(Math.min(jMin, c(pVar.f30966h, j11)), j11 - ((long) pVar.f30966h.f30912f));
    }

    private long d(f fVar, long j10) {
        p pVar = fVar.f30910d;
        if (pVar instanceof k) {
            return j10;
        }
        int size = fVar.f30917k.size();
        long jMax = j10;
        for (int i10 = 0; i10 < size; i10++) {
            d dVar = (d) fVar.f30917k.get(i10);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.f30910d != pVar) {
                    jMax = Math.max(jMax, d(fVar2, ((long) fVar2.f30912f) + j10));
                }
            }
        }
        if (fVar != pVar.f30966h) {
            return jMax;
        }
        long j11 = j10 + pVar.j();
        return Math.max(Math.max(jMax, d(pVar.f30967i, j11)), j11 - ((long) pVar.f30967i.f30912f));
    }

    public void a(p pVar) {
        this.f30939e.add(pVar);
        this.f30938d = pVar;
    }

    public long b(v.f fVar, int i10) {
        long j10;
        int i11;
        p pVar = this.f30937c;
        if (pVar instanceof c) {
            if (((c) pVar).f30964f != i10) {
                return 0L;
            }
        } else if (i10 == 0) {
            if (!(pVar instanceof l)) {
                return 0L;
            }
        } else if (!(pVar instanceof n)) {
            return 0L;
        }
        f fVar2 = (i10 == 0 ? fVar.f29344e : fVar.f29346f).f30966h;
        f fVar3 = (i10 == 0 ? fVar.f29344e : fVar.f29346f).f30967i;
        boolean zContains = pVar.f30966h.f30918l.contains(fVar2);
        boolean zContains2 = this.f30937c.f30967i.f30918l.contains(fVar3);
        long j11 = this.f30937c.j();
        if (zContains && zContains2) {
            long jD = d(this.f30937c.f30966h, 0L);
            long jC = c(this.f30937c.f30967i, 0L);
            long j12 = jD - j11;
            p pVar2 = this.f30937c;
            int i12 = pVar2.f30967i.f30912f;
            if (j12 >= (-i12)) {
                j12 += (long) i12;
            }
            int i13 = pVar2.f30966h.f30912f;
            long j13 = ((-jC) - j11) - ((long) i13);
            if (j13 >= i13) {
                j13 -= (long) i13;
            }
            float fQ = pVar2.f30960b.q(i10);
            float f10 = fQ > 0.0f ? (long) ((j13 / fQ) + (j12 / (1.0f - fQ))) : 0L;
            long j14 = ((long) ((f10 * fQ) + 0.5f)) + j11 + ((long) ((f10 * (1.0f - fQ)) + 0.5f));
            p pVar3 = this.f30937c;
            j10 = ((long) pVar3.f30966h.f30912f) + j14;
            i11 = pVar3.f30967i.f30912f;
        } else {
            if (zContains) {
                return Math.max(d(this.f30937c.f30966h, r13.f30912f), ((long) this.f30937c.f30966h.f30912f) + j11);
            }
            if (zContains2) {
                return Math.max(-c(this.f30937c.f30967i, r13.f30912f), ((long) (-this.f30937c.f30967i.f30912f)) + j11);
            }
            p pVar4 = this.f30937c;
            j10 = ((long) pVar4.f30966h.f30912f) + pVar4.j();
            i11 = this.f30937c.f30967i.f30912f;
        }
        return j10 - ((long) i11);
    }
}
