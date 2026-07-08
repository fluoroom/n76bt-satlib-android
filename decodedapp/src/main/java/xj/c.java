package xj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import pj.d;

/* JADX INFO: loaded from: classes3.dex */
public class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f32245a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private yj.b f32246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private d f32247c;

    @Override // xj.a
    public void a(d dVar) {
        this.f32246b = null;
        this.f32247c = null;
        Iterator it = this.f32245a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a(dVar);
        }
    }

    @Override // xj.a
    public void b(d dVar, yj.b bVar) {
        this.f32246b = bVar;
        this.f32247c = dVar;
        Iterator it = this.f32245a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).b(dVar, bVar);
        }
    }

    @Override // xj.a
    public void c(b bVar) {
        this.f32247c = bVar.j();
        Iterator it = this.f32245a.iterator();
        while (it.hasNext()) {
            ((a) it.next()).c(bVar);
        }
    }
}
