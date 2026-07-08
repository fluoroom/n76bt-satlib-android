package j$.time.chrono;

import com.facebook.stetho.websocket.CloseCodes;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public abstract class d implements b, j$.time.temporal.m, j$.time.temporal.o, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: A */
    public final /* synthetic */ int compareTo(b bVar) {
        return j$.com.android.tools.r8.a.e(this, bVar);
    }

    public abstract b F(long j10);

    public abstract b G(long j10);

    public abstract b H(long j10);

    @Override // j$.time.chrono.b, j$.time.temporal.n
    public /* synthetic */ boolean e(j$.time.temporal.q qVar) {
        return j$.com.android.tools.r8.a.k(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ int i(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.a(this, qVar);
    }

    @Override // j$.time.temporal.n
    public /* synthetic */ j$.time.temporal.u k(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.d(this, qVar);
    }

    @Override // j$.time.temporal.n
    public final /* synthetic */ Object l(j$.time.format.b bVar) {
        return j$.com.android.tools.r8.a.m(this, bVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ j$.time.temporal.m o(j$.time.temporal.m mVar) {
        return j$.com.android.tools.r8.a.a(this, mVar);
    }

    public static b C(m mVar, j$.time.temporal.m mVar2) {
        b bVar = (b) mVar2;
        if (mVar.equals(bVar.a())) {
            return bVar;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + mVar.h() + ", actual: " + bVar.a().h());
    }

    @Override // j$.time.chrono.b
    public e y(j$.time.k kVar) {
        return new g(this, kVar);
    }

    @Override // j$.time.temporal.m
    public b d(long j10, j$.time.temporal.s sVar) {
        boolean z10 = sVar instanceof j$.time.temporal.b;
        if (!z10) {
            if (!z10) {
                return C(a(), sVar.i(this, j10));
            }
            throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
        switch (c.f17460a[((j$.time.temporal.b) sVar).ordinal()]) {
            case 1:
                return F(j10);
            case 2:
                return F(j$.com.android.tools.r8.a.y(j10, 7));
            case 3:
                return G(j10);
            case 4:
                return H(j10);
            case 5:
                return H(j$.com.android.tools.r8.a.y(j10, 10));
            case 6:
                return H(j$.com.android.tools.r8.a.y(j10, 100));
            case 7:
                return H(j$.com.android.tools.r8.a.y(j10, CloseCodes.NORMAL_CLOSURE));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return c(j$.com.android.tools.r8.a.t(w(aVar), j10), (j$.time.temporal.q) aVar);
            default:
                throw new j$.time.temporal.t("Unsupported unit: " + sVar);
        }
    }

    public n D() {
        return a().q(j$.time.temporal.r.a(this, j$.time.temporal.a.ERA));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && j$.com.android.tools.r8.a.e(this, (b) obj) == 0;
    }

    @Override // j$.time.chrono.b
    public int hashCode() {
        long jX = x();
        return a().hashCode() ^ ((int) (jX ^ (jX >>> 32)));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public b j(j$.time.temporal.o oVar) {
        return C(a(), oVar.o(this));
    }

    @Override // j$.time.chrono.b
    public final String toString() {
        long jW = w(j$.time.temporal.a.YEAR_OF_ERA);
        long jW2 = w(j$.time.temporal.a.MONTH_OF_YEAR);
        long jW3 = w(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb2 = new StringBuilder(30);
        sb2.append(a().toString());
        sb2.append(" ");
        sb2.append(D());
        sb2.append(" ");
        sb2.append(jW);
        sb2.append(jW2 < 10 ? "-0" : "-");
        sb2.append(jW2);
        sb2.append(jW3 < 10 ? "-0" : "-");
        sb2.append(jW3);
        return sb2.toString();
    }

    @Override // j$.time.temporal.m
    public b c(long j10, j$.time.temporal.q qVar) {
        if (qVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.t(j$.time.c.a("Unsupported field: ", qVar));
        }
        return C(a(), qVar.o(this, j10));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public b s(long j10, j$.time.temporal.s sVar) {
        return C(a(), j$.time.temporal.r.b(this, j10, sVar));
    }

    @Override // j$.time.chrono.b
    public long x() {
        return w(j$.time.temporal.a.EPOCH_DAY);
    }
}
