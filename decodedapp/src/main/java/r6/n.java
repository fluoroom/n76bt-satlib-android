package r6;

/* JADX INFO: loaded from: classes.dex */
public enum n implements k {
    READ_ENUM_KEYS_USING_INDEX(false),
    WRITE_ENUMS_TO_LOWERCASE(false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f25561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25562b = 1 << ordinal();

    n(boolean z10) {
        this.f25561a = z10;
    }

    @Override // o6.h
    public boolean a() {
        return this.f25561a;
    }

    @Override // o6.h
    public int d() {
        return this.f25562b;
    }

    @Override // o6.h
    public boolean e(int i10) {
        return (i10 & this.f25562b) != 0;
    }

    @Override // r6.k
    public int f() {
        return 0;
    }
}
