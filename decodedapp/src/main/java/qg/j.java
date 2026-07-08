package qg;

import dd.d0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class j {
    public abstract Object c(Object obj, hd.e eVar);

    public abstract Object f(Iterator it, hd.e eVar);

    public final Object g(h hVar, hd.e eVar) {
        Object objF = f(hVar.iterator(), eVar);
        return objF == id.b.e() ? objF : d0.f10897a;
    }
}
