package jd;

import dd.r;
import dd.s;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a implements hd.e, e, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final hd.e f18638a;

    public a(hd.e eVar) {
        this.f18638a = eVar;
    }

    @Override // jd.e
    public e b() {
        hd.e eVar = this.f18638a;
        if (eVar instanceof e) {
            return (e) eVar;
        }
        return null;
    }

    @Override // hd.e
    public final void d(Object obj) {
        Object objO;
        hd.e eVar = this;
        while (true) {
            h.b(eVar);
            a aVar = (a) eVar;
            hd.e eVar2 = aVar.f18638a;
            rd.m.b(eVar2);
            try {
                objO = aVar.o(obj);
            } catch (Throwable th2) {
                r.a aVar2 = r.f10916a;
                obj = r.a(s.a(th2));
            }
            if (objO == id.b.e()) {
                return;
            }
            obj = r.a(objO);
            aVar.p();
            if (!(eVar2 instanceof a)) {
                eVar2.d(obj);
                return;
            }
            eVar = eVar2;
        }
    }

    public hd.e g(Object obj, hd.e eVar) {
        rd.m.e(eVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public final hd.e i() {
        return this.f18638a;
    }

    public StackTraceElement n() {
        return g.c(this);
    }

    protected abstract Object o(Object obj);

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Continuation at ");
        Object objN = n();
        if (objN == null) {
            objN = getClass().getName();
        }
        sb2.append(objN);
        return sb2.toString();
    }

    protected void p() {
    }
}
