package tg;

/* JADX INFO: loaded from: classes3.dex */
final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f27859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f27860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qd.q f27861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f27862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f27863e;

    public r(Object obj, h hVar, qd.q qVar, Object obj2, Throwable th2) {
        this.f27859a = obj;
        this.f27860b = hVar;
        this.f27861c = qVar;
        this.f27862d = obj2;
        this.f27863e = th2;
    }

    public static /* synthetic */ r b(r rVar, Object obj, h hVar, qd.q qVar, Object obj2, Throwable th2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = rVar.f27859a;
        }
        if ((i10 & 2) != 0) {
            hVar = rVar.f27860b;
        }
        if ((i10 & 4) != 0) {
            qVar = rVar.f27861c;
        }
        if ((i10 & 8) != 0) {
            obj2 = rVar.f27862d;
        }
        if ((i10 & 16) != 0) {
            th2 = rVar.f27863e;
        }
        Throwable th3 = th2;
        qd.q qVar2 = qVar;
        return rVar.a(obj, hVar, qVar2, obj2, th3);
    }

    public final r a(Object obj, h hVar, qd.q qVar, Object obj2, Throwable th2) {
        return new r(obj, hVar, qVar, obj2, th2);
    }

    public final boolean c() {
        return this.f27863e != null;
    }

    public final void d(j jVar, Throwable th2) {
        h hVar = this.f27860b;
        if (hVar != null) {
            jVar.k(hVar, th2);
        }
        qd.q qVar = this.f27861c;
        if (qVar != null) {
            jVar.l(qVar, th2, this.f27859a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return rd.m.a(this.f27859a, rVar.f27859a) && rd.m.a(this.f27860b, rVar.f27860b) && rd.m.a(this.f27861c, rVar.f27861c) && rd.m.a(this.f27862d, rVar.f27862d) && rd.m.a(this.f27863e, rVar.f27863e);
    }

    public int hashCode() {
        Object obj = this.f27859a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        h hVar = this.f27860b;
        int iHashCode2 = (iHashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        qd.q qVar = this.f27861c;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj2 = this.f27862d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f27863e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f27859a + ", cancelHandler=" + this.f27860b + ", onCancellation=" + this.f27861c + ", idempotentResume=" + this.f27862d + ", cancelCause=" + this.f27863e + ')';
    }

    public /* synthetic */ r(Object obj, h hVar, qd.q qVar, Object obj2, Throwable th2, int i10, rd.h hVar2) {
        this(obj, (i10 & 2) != 0 ? null : hVar, (i10 & 4) != 0 ? null : qVar, (i10 & 8) != 0 ? null : obj2, (i10 & 16) != 0 ? null : th2);
    }
}
