package androidx.lifecycle;

import androidx.lifecycle.v0;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class w0 {
    public static s0 a(v0.c cVar, Class cls) {
        rd.m.e(cls, "modelClass");
        return f1.h.f12772a.d();
    }

    public static s0 b(v0.c cVar, Class cls, e1.a aVar) {
        rd.m.e(cls, "modelClass");
        rd.m.e(aVar, "extras");
        return cVar.a(cls);
    }

    public static s0 c(v0.c cVar, yd.c cVar2, e1.a aVar) {
        rd.m.e(cVar2, "modelClass");
        rd.m.e(aVar, "extras");
        return cVar.c(pd.a.b(cVar2), aVar);
    }
}
