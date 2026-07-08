package u7;

import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
final class r0 implements t8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f28496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f28497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f28498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f28499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f28500e;

    r0(e eVar, int i10, b bVar, long j10, long j11, String str, String str2) {
        this.f28496a = eVar;
        this.f28497b = i10;
        this.f28498c = bVar;
        this.f28499d = j10;
        this.f28500e = j11;
    }

    static r0 b(e eVar, int i10, b bVar) {
        boolean zF;
        if (!eVar.e()) {
            return null;
        }
        v7.s sVarA = v7.r.b().a();
        if (sVarA == null) {
            zF = true;
        } else {
            if (!sVarA.e()) {
                return null;
            }
            zF = sVarA.f();
            h0 h0VarT = eVar.t(bVar);
            if (h0VarT != null) {
                if (!(h0VarT.u() instanceof v7.c)) {
                    return null;
                }
                v7.c cVar = (v7.c) h0VarT.u();
                if (cVar.I() && !cVar.h()) {
                    v7.f fVarC = c(h0VarT, cVar, i10);
                    if (fVarC == null) {
                        return null;
                    }
                    h0VarT.G();
                    zF = fVarC.g();
                }
            }
        }
        return new r0(eVar, i10, bVar, zF ? System.currentTimeMillis() : 0L, zF ? SystemClock.elapsedRealtime() : 0L, null, null);
    }

    private static v7.f c(h0 h0Var, v7.c cVar, int i10) {
        int[] iArrC;
        int[] iArrE;
        v7.f fVarG = cVar.G();
        if (fVarG == null || !fVarG.f() || ((iArrC = fVarG.c()) != null ? !com.google.android.gms.common.util.a.a(iArrC, i10) : !((iArrE = fVarG.e()) == null || !com.google.android.gms.common.util.a.a(iArrE, i10))) || h0Var.s() >= fVarG.b()) {
            return null;
        }
        return fVarG;
    }

    @Override // t8.c
    public final void a(t8.g gVar) {
        h0 h0VarT;
        int iG;
        int i10;
        int i11;
        int i12;
        int iB;
        long j10;
        long jCurrentTimeMillis;
        int iElapsedRealtime;
        if (this.f28496a.e()) {
            v7.s sVarA = v7.r.b().a();
            if ((sVarA == null || sVarA.e()) && (h0VarT = this.f28496a.t(this.f28498c)) != null && (h0VarT.u() instanceof v7.c)) {
                v7.c cVar = (v7.c) h0VarT.u();
                boolean zF = this.f28499d > 0;
                int iY = cVar.y();
                if (sVarA != null) {
                    zF &= sVarA.f();
                    int iB2 = sVarA.b();
                    int iC = sVarA.c();
                    iG = sVarA.g();
                    if (cVar.I() && !cVar.h()) {
                        v7.f fVarC = c(h0VarT, cVar, this.f28497b);
                        if (fVarC == null) {
                            return;
                        }
                        boolean z10 = fVarC.g() && this.f28499d > 0;
                        iC = fVarC.b();
                        zF = z10;
                    }
                    i10 = iB2;
                    i11 = iC;
                } else {
                    iG = 0;
                    i10 = 5000;
                    i11 = 100;
                }
                e eVar = this.f28496a;
                if (gVar.j()) {
                    i12 = 0;
                    iB = 0;
                } else {
                    if (gVar.h()) {
                        i12 = 100;
                    } else {
                        Exception excF = gVar.f();
                        if (excF instanceof t7.b) {
                            Status statusA = ((t7.b) excF).a();
                            int iC2 = statusA.c();
                            s7.a aVarB = statusA.b();
                            if (aVarB == null) {
                                i12 = iC2;
                            } else {
                                iB = aVarB.b();
                                i12 = iC2;
                            }
                        } else {
                            i12 = 101;
                        }
                    }
                    iB = -1;
                }
                if (zF) {
                    long j11 = this.f28499d;
                    long j12 = this.f28500e;
                    j10 = j11;
                    jCurrentTimeMillis = System.currentTimeMillis();
                    iElapsedRealtime = (int) (SystemClock.elapsedRealtime() - j12);
                } else {
                    j10 = 0;
                    jCurrentTimeMillis = 0;
                    iElapsedRealtime = -1;
                }
                eVar.E(new v7.n(this.f28497b, i12, iB, j10, jCurrentTimeMillis, null, null, iY, iElapsedRealtime), iG, i10, i11);
            }
        }
    }
}
