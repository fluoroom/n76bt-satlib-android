package r9;

/* JADX INFO: loaded from: classes3.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final s f25652a = new a();

    class a extends s {
        a() {
        }

        @Override // r9.s
        public long a() {
            return System.nanoTime();
        }
    }

    protected s() {
    }

    public static s b() {
        return f25652a;
    }

    public abstract long a();
}
