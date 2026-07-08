package j$.time.chrono;

/* JADX INFO: loaded from: classes2.dex */
public interface b extends j$.time.temporal.m, j$.time.temporal.o, Comparable {
    /* JADX INFO: renamed from: A */
    int compareTo(b bVar);

    m a();

    @Override // j$.time.temporal.m
    b c(long j10, j$.time.temporal.q qVar);

    @Override // j$.time.temporal.m
    b d(long j10, j$.time.temporal.s sVar);

    @Override // j$.time.temporal.n
    boolean e(j$.time.temporal.q qVar);

    int hashCode();

    String toString();

    long x();

    e y(j$.time.k kVar);
}
