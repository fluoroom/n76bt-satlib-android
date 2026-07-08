package j$.time.format;

import j$.time.Instant;
import j$.time.y;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.n f17562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f17563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17564c;

    public q(Instant instant, a aVar) {
        j$.time.chrono.m mVar = aVar.f17525d;
        j$.time.temporal.n pVar = instant;
        if (mVar != null) {
            j$.time.chrono.m mVar2 = (j$.time.chrono.m) instant.l(j$.time.temporal.r.f17631b);
            y yVar = (y) instant.l(j$.time.temporal.r.f17630a);
            j$.time.chrono.b bVarT = null;
            mVar = Objects.equals(mVar, mVar2) ? null : mVar;
            Objects.equals(null, yVar);
            pVar = instant;
            if (mVar != null) {
                j$.time.chrono.m mVar3 = mVar != null ? mVar : mVar2;
                if (mVar != null) {
                    if (instant.e(j$.time.temporal.a.EPOCH_DAY)) {
                        bVarT = mVar3.t(instant);
                    } else if (mVar != j$.time.chrono.t.f17501c || mVar2 != null) {
                        for (j$.time.temporal.a aVar2 : j$.time.temporal.a.values()) {
                            if (aVar2.isDateBased() && instant.e(aVar2)) {
                                throw new j$.time.b("Unable to apply override chronology '" + mVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + instant);
                            }
                        }
                    }
                }
                pVar = new p(bVarT, instant, mVar3, yVar);
            }
        }
        this.f17562a = pVar;
        this.f17563b = aVar;
    }

    public final Long a(j$.time.temporal.q qVar) {
        int i10 = this.f17564c;
        j$.time.temporal.n nVar = this.f17562a;
        if (i10 <= 0 || nVar.e(qVar)) {
            return Long.valueOf(nVar.w(qVar));
        }
        return null;
    }

    public final String toString() {
        return this.f17562a.toString();
    }
}
