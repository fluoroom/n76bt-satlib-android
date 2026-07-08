package qf;

import java.util.Collection;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {
    public abstract void a(he.b bVar);

    public abstract void b(he.b bVar, he.b bVar2);

    public abstract void c(he.b bVar, he.b bVar2);

    public void d(he.b bVar, Collection collection) {
        rd.m.e(bVar, "member");
        rd.m.e(collection, "overridden");
        bVar.x0(collection);
    }
}
