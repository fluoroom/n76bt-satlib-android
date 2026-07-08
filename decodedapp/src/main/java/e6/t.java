package e6;

/* JADX INFO: loaded from: classes.dex */
public enum t implements o6.h {
    CAN_WRITE_BINARY_NATIVELY(false),
    CAN_WRITE_FORMATTED_NUMBERS(false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11604a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11605b = 1 << ordinal();

    t(boolean z10) {
        this.f11604a = z10;
    }

    @Override // o6.h
    public boolean a() {
        return this.f11604a;
    }

    @Override // o6.h
    public int d() {
        return this.f11605b;
    }
}
