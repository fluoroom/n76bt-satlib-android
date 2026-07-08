package ud;

import rd.m;
import yd.j;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f29111a;

    public b(Object obj) {
        this.f29111a = obj;
    }

    @Override // ud.d, ud.c
    public Object a(Object obj, j jVar) {
        m.e(jVar, "property");
        return this.f29111a;
    }

    @Override // ud.d
    public void b(Object obj, j jVar, Object obj2) {
        m.e(jVar, "property");
        Object obj3 = this.f29111a;
        if (d(jVar, obj3, obj2)) {
            this.f29111a = obj2;
            c(jVar, obj3, obj2);
        }
    }

    protected void c(j jVar, Object obj, Object obj2) {
        m.e(jVar, "property");
    }

    protected abstract boolean d(j jVar, Object obj, Object obj2);

    public String toString() {
        return "ObservableProperty(value=" + this.f29111a + ')';
    }
}
