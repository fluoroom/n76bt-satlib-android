package j$.util.stream;

import java.util.Comparator;

/* JADX INFO: loaded from: classes2.dex */
public abstract class z5 extends h5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Comparator f18287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f18288c;

    public z5(l5 l5Var, Comparator comparator) {
        super(l5Var);
        this.f18287b = comparator;
    }

    @Override // j$.util.stream.h5, j$.util.stream.l5
    public final boolean e() {
        this.f18288c = true;
        return false;
    }
}
