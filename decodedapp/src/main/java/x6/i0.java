package x6;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import x6.v;

/* JADX INFO: loaded from: classes.dex */
public class i0 implements v.a, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final v.a f31754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Map f31755b;

    public i0(v.a aVar) {
        this.f31754a = aVar;
    }

    @Override // x6.v.a
    public Class a(Class cls) {
        Map map;
        v.a aVar = this.f31754a;
        Class clsA = aVar == null ? null : aVar.a(cls);
        return (clsA != null || (map = this.f31755b) == null) ? clsA : (Class) map.get(new h7.a(cls));
    }

    public void b(Class cls, Class cls2) {
        if (this.f31755b == null) {
            this.f31755b = new HashMap();
        }
        this.f31755b.put(new h7.a(cls), cls2);
    }

    public boolean c() {
        if (this.f31755b != null) {
            return true;
        }
        v.a aVar = this.f31754a;
        if (aVar == null) {
            return false;
        }
        if (aVar instanceof i0) {
            return ((i0) aVar).c();
        }
        return true;
    }
}
