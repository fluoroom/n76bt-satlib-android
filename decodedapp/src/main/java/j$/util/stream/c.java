package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f17934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f17937d;

    public abstract void clear();

    public c() {
        this.f17934a = 4;
    }

    public c(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Illegal Capacity: " + i10);
        }
        this.f17934a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i10 - 1));
    }

    public final long count() {
        int i10 = this.f17936c;
        if (i10 == 0) {
            return this.f17935b;
        }
        return this.f17937d[i10] + ((long) this.f17935b);
    }
}
