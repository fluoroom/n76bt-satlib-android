package e6;

/* JADX INFO: loaded from: classes.dex */
public enum q implements o6.h {
    DUPLICATE_PROPERTIES(false),
    SCALARS_AS_OBJECTS(false),
    UNTYPED_SCALARS(false),
    EXACT_FLOATS(false);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11586b = 1 << ordinal();

    q(boolean z10) {
        this.f11585a = z10;
    }

    @Override // o6.h
    public boolean a() {
        return this.f11585a;
    }

    @Override // o6.h
    public int d() {
        return this.f11586b;
    }
}
