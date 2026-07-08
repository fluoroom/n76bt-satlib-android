package kj;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kj.d0;

/* JADX INFO: loaded from: classes3.dex */
class e0 implements gj.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d0.a f20069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f20070b = new ArrayList();

    e0(d0.a aVar) {
        this.f20069a = aVar;
    }

    @Override // gj.e
    public void a(InputStream inputStream, String str) {
        this.f20070b.addAll(this.f20069a.a(inputStream, str));
    }

    public Collection b() {
        return this.f20070b;
    }

    @Override // gj.e
    public boolean c() {
        return true;
    }
}
