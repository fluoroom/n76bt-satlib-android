package we;

import ed.k0;
import ed.q;
import ee.o;
import java.util.Map;
import rd.c0;
import rd.w;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f31421h = {c0.f(new w(n.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dg.i f31422g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(cf.a aVar, ye.k kVar) {
        super(kVar, aVar, o.a.H);
        rd.m.e(aVar, "annotation");
        rd.m.e(kVar, "c");
        this.f31422g = kVar.e().d(new m(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map h(n nVar) {
        cf.b bVarC = nVar.c();
        sf.g gVarD = bVarC instanceof cf.e ? f.f31409a.d(((cf.e) nVar.c()).getElements()) : bVarC instanceof cf.m ? f.f31409a.d(q.e(nVar.c())) : null;
        Map mapF = gVarD != null ? k0.f(dd.w.a(d.f31403a.d(), gVarD)) : null;
        return mapF == null ? k0.i() : mapF;
    }

    @Override // we.c, ie.c
    public Map a() {
        return (Map) dg.m.a(this.f31422g, this, f31421h[0]);
    }
}
