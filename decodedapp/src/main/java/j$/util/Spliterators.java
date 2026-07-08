package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public final class Spliterators {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f17697a = new o1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f17698b = new m1();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n1 f17699c = new n1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l1 f17700d = new l1();

    public static void a(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            if (i12 > i10) {
                throw new ArrayIndexOutOfBoundsException(i12);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i11 + ") > fence(" + i12 + ")");
    }

    public static <T> Spliterator<T> spliterator(java.util.Collection<? extends T> collection, int i10) {
        return new q1((java.util.Collection) Objects.requireNonNull(collection), i10);
    }
}
