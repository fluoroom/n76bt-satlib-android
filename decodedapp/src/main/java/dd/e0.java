package dd;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 implements j, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private qd.a f10899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f10900b;

    public e0(qd.a aVar) {
        rd.m.e(aVar, "initializer");
        this.f10899a = aVar;
        this.f10900b = a0.f10894a;
    }

    public boolean a() {
        return this.f10900b != a0.f10894a;
    }

    @Override // dd.j
    public Object getValue() {
        if (this.f10900b == a0.f10894a) {
            qd.a aVar = this.f10899a;
            rd.m.b(aVar);
            this.f10900b = aVar.a();
            this.f10899a = null;
        }
        return this.f10900b;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
