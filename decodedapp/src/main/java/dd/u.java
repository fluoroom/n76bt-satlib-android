package dd;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
final class u implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qd.a f10923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f10924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10925c;

    public u(qd.a aVar, Object obj) {
        rd.m.e(aVar, "initializer");
        this.f10923a = aVar;
        this.f10924b = a0.f10894a;
        this.f10925c = obj == null ? this : obj;
    }

    public boolean a() {
        return this.f10924b != a0.f10894a;
    }

    @Override // dd.j
    public Object getValue() {
        Object objA;
        Object obj = this.f10924b;
        a0 a0Var = a0.f10894a;
        if (obj != a0Var) {
            return obj;
        }
        synchronized (this.f10925c) {
            objA = this.f10924b;
            if (objA == a0Var) {
                qd.a aVar = this.f10923a;
                rd.m.b(aVar);
                objA = aVar.a();
                this.f10924b = objA;
                this.f10923a = null;
            }
        }
        return objA;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ u(qd.a aVar, Object obj, int i10, rd.h hVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
