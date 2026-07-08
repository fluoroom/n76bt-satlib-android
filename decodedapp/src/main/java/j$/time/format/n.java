package j$.time.format;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.q f17548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w f17549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f17550c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile j f17551d;

    public n(j$.time.temporal.q qVar, w wVar, c cVar) {
        this.f17548a = qVar;
        this.f17549b = wVar;
        this.f17550c = cVar;
    }

    @Override // j$.time.format.g
    public final boolean i(q qVar, StringBuilder sb2) {
        String strA;
        Long lA = qVar.a(this.f17548a);
        if (lA == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) qVar.f17562a.l(j$.time.temporal.r.f17631b);
        if (mVar == null || mVar == j$.time.chrono.t.f17501c) {
            c cVar = this.f17550c;
            long jLongValue = lA.longValue();
            w wVar = this.f17549b;
            Locale locale = qVar.f17563b.f17523b;
            strA = cVar.f17528a.a(jLongValue, wVar);
        } else {
            c cVar2 = this.f17550c;
            long jLongValue2 = lA.longValue();
            w wVar2 = this.f17549b;
            Locale locale2 = qVar.f17563b.f17523b;
            strA = cVar2.f17528a.a(jLongValue2, wVar2);
        }
        if (strA != null) {
            sb2.append(strA);
            return true;
        }
        if (this.f17551d == null) {
            this.f17551d = new j(this.f17548a, 1, 19, v.NORMAL);
        }
        return this.f17551d.i(qVar, sb2);
    }

    public final String toString() {
        w wVar = w.FULL;
        j$.time.temporal.q qVar = this.f17548a;
        w wVar2 = this.f17549b;
        if (wVar2 == wVar) {
            return "Text(" + qVar + ")";
        }
        return "Text(" + qVar + "," + wVar2 + ")";
    }
}
