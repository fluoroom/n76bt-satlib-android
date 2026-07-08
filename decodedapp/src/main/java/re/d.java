package re;

import jf.b;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f25978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f25979c;

    public d(int i10, int i11, int i12) {
        this.f25977a = i10;
        this.f25978b = i11;
        this.f25979c = i12;
    }

    public final int a() {
        return this.f25978b;
    }

    public final int b() {
        return this.f25977a;
    }

    public final int c() {
        return this.f25979c;
    }

    public final boolean d(int i10) {
        return ((i10 >>> this.f25977a) & ((1 << this.f25978b) - 1)) == this.f25979c;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(b.d dVar, int i10) {
        this(dVar.f18687a, dVar.f18688b, i10);
        m.e(dVar, "field");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(b.C0243b c0243b) {
        this(c0243b, 1);
        m.e(c0243b, "field");
    }
}
