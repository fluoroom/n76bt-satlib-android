package m;

import java.util.HashMap;
import java.util.Map;
import m.b;

/* JADX INFO: loaded from: classes.dex */
public class a extends b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f20712e = new HashMap();

    @Override // m.b
    protected b.c c(Object obj) {
        return (b.c) this.f20712e.get(obj);
    }

    public boolean contains(Object obj) {
        return this.f20712e.containsKey(obj);
    }

    @Override // m.b
    public Object g(Object obj, Object obj2) {
        b.c cVarC = c(obj);
        if (cVarC != null) {
            return cVarC.f20718b;
        }
        this.f20712e.put(obj, f(obj, obj2));
        return null;
    }

    @Override // m.b
    public Object h(Object obj) {
        Object objH = super.h(obj);
        this.f20712e.remove(obj);
        return objH;
    }

    public Map.Entry i(Object obj) {
        if (contains(obj)) {
            return ((b.c) this.f20712e.get(obj)).f20720d;
        }
        return null;
    }
}
