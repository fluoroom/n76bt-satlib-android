package dd;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class t implements j, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f10918d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f10919e = AtomicReferenceFieldUpdater.newUpdater(t.class, Object.class, "b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile qd.a f10920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile Object f10921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f10922c;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public t(qd.a aVar) {
        rd.m.e(aVar, "initializer");
        this.f10920a = aVar;
        a0 a0Var = a0.f10894a;
        this.f10921b = a0Var;
        this.f10922c = a0Var;
    }

    public boolean a() {
        return this.f10921b != a0.f10894a;
    }

    @Override // dd.j
    public Object getValue() {
        Object obj = this.f10921b;
        a0 a0Var = a0.f10894a;
        if (obj != a0Var) {
            return obj;
        }
        qd.a aVar = this.f10920a;
        if (aVar != null) {
            Object objA = aVar.a();
            if (androidx.concurrent.futures.b.a(f10919e, this, a0Var, objA)) {
                this.f10920a = null;
                return objA;
            }
        }
        return this.f10921b;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
