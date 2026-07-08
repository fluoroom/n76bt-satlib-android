package com.dw.ht;

import dk.a0;
import eh.a0;
import eh.d0;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public final class d0 {

    /* JADX INFO: renamed from: a */
    public static final d0 f5647a = new d0();

    /* JADX INFO: renamed from: b */
    private static final String f5648b = "7fbe994892a938aaba3785a2f0873450";

    /* JADX INFO: renamed from: c */
    private static final eh.a0 f5649c = new eh.a0() { // from class: com.dw.ht.b0
        @Override // eh.a0
        public final eh.h0 intercept(a0.a aVar) {
            return d0.f(aVar);
        }
    };

    /* JADX INFO: renamed from: d */
    private static final dd.j f5650d = dd.k.b(new qd.a() { // from class: com.dw.ht.c0
        @Override // qd.a
        public final Object a() {
            return d0.e();
        }
    });

    private d0() {
    }

    public static final eh.d0 e() {
        if (Main.f5555g != null) {
            return new d0.a().a(f5649c).c(new eh.c(new File(Main.f5555g.getCacheDir(), "OkHttp"), 209715200L)).b();
        }
        System.out.println((Object) "test mode");
        return new d0.a().a(f5649c).b();
    }

    public static final eh.h0 f(a0.a aVar) {
        rd.m.e(aVar, "chain");
        eh.f0 f0VarE = aVar.e();
        eh.z zVarM = f0VarE.m();
        if (rg.q.w(zVarM.h(), "api.tianditu.gov.cn", false, 2, null)) {
            f0VarE = f0VarE.j().r(zVarM.j().b("tk", f5648b).b("type", "query").c()).a();
        } else if (rg.q.w(zVarM.h(), "tianditu.gov.cn", false, 2, null)) {
            f0VarE = f0VarE.j().r(zVarM.j().b("tk", f5648b).b("SERVICE", "WMTS").b("REQUEST", "GetTile").b("VERSION", "1.0.0").b("LAYER", "img").b("STYLE", "default").b("TILEMATRIXSET", "w").b("FORMAT", "tiles").c()).a();
        }
        return aVar.a(f0VarE);
    }

    public final dk.a0 c(String str) {
        a0.b bVar = new a0.b();
        bVar.b(str).e(d());
        dk.a0 a0VarC = bVar.c();
        rd.m.d(a0VarC, "build(...)");
        return a0VarC;
    }

    public final eh.d0 d() {
        return (eh.d0) f5650d.getValue();
    }
}
