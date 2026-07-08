package j$.time.temporal;

import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class r {

    /* JADX INFO: renamed from: a */
    public static final j$.time.format.b f17630a = new j$.time.format.b(1);

    /* JADX INFO: renamed from: b */
    public static final j$.time.format.b f17631b = new j$.time.format.b(2);

    /* JADX INFO: renamed from: c */
    public static final j$.time.format.b f17632c = new j$.time.format.b(3);

    /* JADX INFO: renamed from: d */
    public static final j$.time.format.b f17633d = new j$.time.format.b(4);

    /* JADX INFO: renamed from: e */
    public static final j$.time.format.b f17634e = new j$.time.format.b(5);

    /* JADX INFO: renamed from: f */
    public static final j$.time.format.b f17635f = new j$.time.format.b(6);

    /* JADX INFO: renamed from: g */
    public static final j$.time.format.b f17636g = new j$.time.format.b(7);

    public static u d(n nVar, q qVar) {
        if (!(qVar instanceof a)) {
            Objects.requireNonNull(qVar, "field");
            return qVar.j(nVar);
        }
        if (nVar.e(qVar)) {
            return ((a) qVar).f17612b;
        }
        throw new t(j$.time.c.a("Unsupported field: ", qVar));
    }

    public static int a(n nVar, q qVar) {
        u uVarK = nVar.k(qVar);
        if (uVarK.f17637a < -2147483648L || uVarK.f17640d > 2147483647L) {
            throw new t("Invalid field " + qVar + " for get() method, use getLong() instead");
        }
        long jW = nVar.w(qVar);
        if (uVarK.d(jW)) {
            return (int) jW;
        }
        throw new j$.time.b("Invalid value for " + qVar + " (valid values " + uVarK + "): " + jW);
    }

    public static Object c(n nVar, j$.time.format.b bVar) {
        if (bVar == f17630a || bVar == f17631b || bVar == f17632c) {
            return null;
        }
        return bVar.a(nVar);
    }

    public static m b(m mVar, long j10, s sVar) {
        long j11;
        if (j10 == Long.MIN_VALUE) {
            mVar = mVar.d(Long.MAX_VALUE, sVar);
            j11 = 1;
        } else {
            j11 = -j10;
        }
        return mVar.d(j11, sVar);
    }
}
