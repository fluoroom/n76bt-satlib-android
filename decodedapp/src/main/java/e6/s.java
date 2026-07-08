package e6;

import e6.j;

/* JADX INFO: loaded from: classes.dex */
public enum s implements o6.h {
    AUTO_CLOSE_SOURCE(j.a.AUTO_CLOSE_SOURCE),
    STRICT_DUPLICATE_DETECTION(j.a.STRICT_DUPLICATE_DETECTION),
    IGNORE_UNDEFINED(j.a.IGNORE_UNDEFINED),
    INCLUDE_SOURCE_IN_LOCATION(j.a.INCLUDE_SOURCE_IN_LOCATION),
    USE_FAST_DOUBLE_PARSER(j.a.USE_FAST_DOUBLE_PARSER),
    USE_FAST_BIG_NUMBER_PARSER(j.a.USE_FAST_BIG_NUMBER_PARSER);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f11598a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11599b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j.a f11600c;

    s(j.a aVar) {
        this.f11600c = aVar;
        this.f11599b = aVar.f();
        this.f11598a = aVar.d();
    }

    @Override // o6.h
    public boolean a() {
        return this.f11598a;
    }

    @Override // o6.h
    public int d() {
        return this.f11599b;
    }

    public j.a g() {
        return this.f11600c;
    }
}
