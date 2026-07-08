package r6;

/* JADX INFO: loaded from: classes.dex */
public enum p implements k {
    READ_NULL_PROPERTIES(true),
    WRITE_NULL_PROPERTIES(true),
    STRIP_TRAILING_BIGDECIMAL_ZEROES(true);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25568b = 1 << ordinal();

    p(boolean z10) {
        this.f25567a = z10;
    }

    @Override // o6.h
    public boolean a() {
        return this.f25567a;
    }

    @Override // o6.h
    public int d() {
        return this.f25568b;
    }

    @Override // o6.h
    public boolean e(int i10) {
        return (i10 & this.f25568b) != 0;
    }

    @Override // r6.k
    public int f() {
        return 1;
    }
}
