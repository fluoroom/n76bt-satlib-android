package nh;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f22960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f22961c;

    public a(int i10) {
        this.f22959a = i10;
    }

    public static /* synthetic */ void c(a aVar, long j10, long j11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 0;
        }
        if ((i10 & 2) != 0) {
            j11 = 0;
        }
        aVar.b(j10, j11);
    }

    public final synchronized long a() {
        return this.f22960b - this.f22961c;
    }

    public final synchronized void b(long j10, long j11) {
        try {
            if (j10 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            if (j11 < 0) {
                throw new IllegalStateException("Check failed.");
            }
            long j12 = this.f22960b + j10;
            this.f22960b = j12;
            long j13 = this.f22961c + j11;
            this.f22961c = j13;
            if (j13 > j12) {
                throw new IllegalStateException("Check failed.");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public String toString() {
        return "WindowCounter(streamId=" + this.f22959a + ", total=" + this.f22960b + ", acknowledged=" + this.f22961c + ", unacknowledged=" + a() + ')';
    }
}
