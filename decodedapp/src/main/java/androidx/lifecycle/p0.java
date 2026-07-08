package androidx.lifecycle;

import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.v0;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes.dex */
public final class p0 extends v0.e implements v0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Application f2671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v0.c f2672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f2673c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f2674d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l1.f f2675e;

    public p0(Application application, l1.i iVar, Bundle bundle) {
        rd.m.e(iVar, "owner");
        this.f2675e = iVar.e0();
        this.f2674d = iVar.S0();
        this.f2673c = bundle;
        this.f2671a = application;
        this.f2672b = application != null ? v0.a.f2700e.a(application) : new v0.a();
    }

    @Override // androidx.lifecycle.v0.c
    public s0 a(Class cls) {
        rd.m.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.v0.c
    public s0 b(yd.c cVar, e1.a aVar) {
        rd.m.e(cVar, "modelClass");
        rd.m.e(aVar, "extras");
        return c(pd.a.b(cVar), aVar);
    }

    @Override // androidx.lifecycle.v0.c
    public s0 c(Class cls, e1.a aVar) {
        rd.m.e(cls, "modelClass");
        rd.m.e(aVar, "extras");
        String str = (String) aVar.a(v0.f2698c);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (aVar.a(l0.f2645a) == null || aVar.a(l0.f2646b) == null) {
            if (this.f2674d != null) {
                return e(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) aVar.a(v0.a.f2702g);
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorC = (!zIsAssignableFrom || application == null) ? q0.c(cls, q0.f2677b) : q0.c(cls, q0.f2676a);
        return constructorC == null ? this.f2672b.c(cls, aVar) : (!zIsAssignableFrom || application == null) ? q0.d(cls, constructorC, l0.a(aVar)) : q0.d(cls, constructorC, application, l0.a(aVar));
    }

    @Override // androidx.lifecycle.v0.e
    public void d(s0 s0Var) {
        rd.m.e(s0Var, "viewModel");
        if (this.f2674d != null) {
            l1.f fVar = this.f2675e;
            rd.m.b(fVar);
            m mVar = this.f2674d;
            rd.m.b(mVar);
            l.a(s0Var, fVar, mVar);
        }
    }

    public final s0 e(String str, Class cls) {
        s0 s0VarD;
        Application application;
        rd.m.e(str, "key");
        rd.m.e(cls, "modelClass");
        m mVar = this.f2674d;
        if (mVar == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = a.class.isAssignableFrom(cls);
        Constructor constructorC = (!zIsAssignableFrom || this.f2671a == null) ? q0.c(cls, q0.f2677b) : q0.c(cls, q0.f2676a);
        if (constructorC == null) {
            return this.f2671a != null ? this.f2672b.a(cls) : v0.d.f2704a.a().a(cls);
        }
        l1.f fVar = this.f2675e;
        rd.m.b(fVar);
        k0 k0VarB = l.b(fVar, mVar, str, this.f2673c);
        if (!zIsAssignableFrom || (application = this.f2671a) == null) {
            s0VarD = q0.d(cls, constructorC, k0VarB.n());
        } else {
            rd.m.b(application);
            s0VarD = q0.d(cls, constructorC, application, k0VarB.n());
        }
        s0VarD.a("androidx.lifecycle.savedstate.vm.tag", k0VarB);
        return s0VarD;
    }
}
