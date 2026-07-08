package j$.time.format;

import j$.time.Instant;
import j$.time.y;

/* JADX INFO: loaded from: classes2.dex */
public final class p implements j$.time.temporal.n {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ j$.time.chrono.b f17558a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Instant f17559b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ j$.time.chrono.m f17560c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ y f17561d;

    @Override // j$.time.temporal.n
    public final /* synthetic */ int i(j$.time.temporal.q qVar) {
        return j$.time.temporal.r.a(this, qVar);
    }

    public p(j$.time.chrono.b bVar, Instant instant, j$.time.chrono.m mVar, y yVar) {
        this.f17558a = bVar;
        this.f17559b = instant;
        this.f17560c = mVar;
        this.f17561d = yVar;
    }

    @Override // j$.time.temporal.n
    public final boolean e(j$.time.temporal.q qVar) {
        j$.time.chrono.b bVar = this.f17558a;
        if (bVar != null && qVar.isDateBased()) {
            return bVar.e(qVar);
        }
        return this.f17559b.e(qVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.u k(j$.time.temporal.q qVar) {
        j$.time.chrono.b bVar = this.f17558a;
        if (bVar != null && qVar.isDateBased()) {
            return bVar.k(qVar);
        }
        return j$.time.temporal.r.d(this.f17559b, qVar);
    }

    @Override // j$.time.temporal.n
    public final long w(j$.time.temporal.q qVar) {
        j$.time.chrono.b bVar = this.f17558a;
        if (bVar != null && qVar.isDateBased()) {
            return bVar.w(qVar);
        }
        return this.f17559b.w(qVar);
    }

    @Override // j$.time.temporal.n
    public final Object l(b bVar) {
        if (bVar == j$.time.temporal.r.f17631b) {
            return this.f17560c;
        }
        if (bVar == j$.time.temporal.r.f17630a) {
            return this.f17561d;
        }
        if (bVar == j$.time.temporal.r.f17632c) {
            return this.f17559b.l(bVar);
        }
        return bVar.a(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.f17560c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        y yVar = this.f17561d;
        if (yVar != null) {
            str2 = " with zone " + yVar;
        }
        return this.f17559b + str + str2;
    }
}
