package we;

import ed.k0;
import ee.o;
import java.util.Map;
import rd.c0;
import rd.w;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f31418h = {c0.f(new w(l.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dg.i f31419g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(cf.a aVar, ye.k kVar) {
        super(kVar, aVar, o.a.L);
        rd.m.e(aVar, "annotation");
        rd.m.e(kVar, "c");
        this.f31419g = kVar.e().d(new k(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map h(l lVar) {
        sf.g gVarB = f.f31409a.b(lVar.c());
        Map mapF = gVarB != null ? k0.f(dd.w.a(d.f31403a.c(), gVarB)) : null;
        return mapF == null ? k0.i() : mapF;
    }

    @Override // we.c, ie.c
    public Map a() {
        return (Map) dg.m.a(this.f31419g, this, f31418h[0]);
    }
}
