package be;

import java.util.Comparator;

/* JADX INFO: loaded from: classes3.dex */
class a1 implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final qd.p f3797a;

    public a1(qd.p pVar) {
        this.f3797a = pVar;
    }

    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return d1.v(this.f3797a, obj, obj2);
    }
}
