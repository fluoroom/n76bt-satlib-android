package ed;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class h0 implements Iterable, sd.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.a f11764a;

    public h0(qd.a aVar) {
        rd.m.e(aVar, "iteratorFactory");
        this.f11764a = aVar;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new i0((Iterator) this.f11764a.a());
    }
}
