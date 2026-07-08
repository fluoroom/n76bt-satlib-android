package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public enum k implements q {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient String f17624a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final transient u f17625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final transient long f17626c;

    @Override // j$.time.temporal.q
    public final boolean isDateBased() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j10) {
        this.f17624a = str;
        this.f17625b = u.e((-365243219162L) + j10, 365241780471L + j10);
        this.f17626c = j10;
    }

    @Override // j$.time.temporal.q
    public final u k() {
        return this.f17625b;
    }

    @Override // j$.time.temporal.q
    public final m o(m mVar, long j10) {
        if (!this.f17625b.d(j10)) {
            throw new j$.time.b("Invalid value: " + this.f17624a + " " + j10);
        }
        return mVar.c(j$.com.android.tools.r8.a.z(j10, this.f17626c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final boolean i(n nVar) {
        return nVar.e(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.q
    public final u j(n nVar) {
        if (nVar.e(a.EPOCH_DAY)) {
            return this.f17625b;
        }
        throw new j$.time.b("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.q
    public final long l(n nVar) {
        return nVar.w(a.EPOCH_DAY) + this.f17626c;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f17624a;
    }
}
