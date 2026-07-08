package yj;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import yj.n0;

/* JADX INFO: loaded from: classes3.dex */
class o0 implements gj.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0.a f32730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f32731b = new ArrayList();

    o0(n0.a aVar) {
        this.f32730a = aVar;
    }

    @Override // gj.e
    public void a(InputStream inputStream, String str) {
        this.f32731b.clear();
        this.f32731b.addAll(this.f32730a.a(inputStream, str));
    }

    public List b() {
        return this.f32731b;
    }

    @Override // gj.e
    public boolean c() {
        return this.f32731b.isEmpty();
    }
}
