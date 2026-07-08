package uf;

import og.b;

/* JADX INFO: loaded from: classes3.dex */
class c implements b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f29142a;

    public c(boolean z10) {
        this.f29142a = z10;
    }

    @Override // og.b.c
    public Iterable a(Object obj) {
        return e.j(this.f29142a, (he.b) obj);
    }
}
