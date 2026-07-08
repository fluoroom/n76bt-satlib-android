package we;

import ed.k0;
import ee.o;
import java.util.Map;
import rd.c0;
import rd.w;
import sf.x;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final /* synthetic */ yd.j[] f31413h = {c0.f(new w(h.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0))};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dg.i f31414g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(cf.a aVar, ye.k kVar) {
        super(kVar, aVar, o.a.f11909y);
        rd.m.e(kVar, "c");
        this.f31414g = kVar.e().d(g.f31412a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map h() {
        return k0.f(dd.w.a(d.f31403a.b(), new x("Deprecated in Java")));
    }

    @Override // we.c, ie.c
    public Map a() {
        return (Map) dg.m.a(this.f31414g, this, f31413h[0]);
    }
}
