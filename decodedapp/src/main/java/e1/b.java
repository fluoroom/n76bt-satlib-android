package e1;

import e1.a;
import java.util.Map;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a {
    public b() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // e1.a
    public Object a(a.c cVar) {
        m.e(cVar, "key");
        return b().get(cVar);
    }

    public final void c(a.c cVar, Object obj) {
        m.e(cVar, "key");
        b().put(cVar, obj);
    }

    public b(Map map) {
        m.e(map, "initialExtras");
        b().putAll(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(a aVar) {
        this(aVar.b());
        m.e(aVar, "initialExtras");
    }

    public /* synthetic */ b(a aVar, int i10, h hVar) {
        this((i10 & 1) != 0 ? a.b.f11336c : aVar);
    }
}
