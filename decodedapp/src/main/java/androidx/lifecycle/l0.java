package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.v0;
import e1.a;
import l1.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a */
    public static final a.c f2645a;

    /* JADX INFO: renamed from: b */
    public static final a.c f2646b;

    /* JADX INFO: renamed from: c */
    public static final a.c f2647c;

    public static final class a implements v0.c {
        a() {
        }

        @Override // androidx.lifecycle.v0.c
        public /* synthetic */ s0 a(Class cls) {
            return w0.a(this, cls);
        }

        @Override // androidx.lifecycle.v0.c
        public s0 b(yd.c cVar, e1.a aVar) {
            rd.m.e(cVar, "modelClass");
            rd.m.e(aVar, "extras");
            return new o0();
        }

        @Override // androidx.lifecycle.v0.c
        public /* synthetic */ s0 c(Class cls, e1.a aVar) {
            return w0.b(this, cls, aVar);
        }
    }

    public static final class b implements a.c {
    }

    public static final class c implements a.c {
    }

    public static final class d implements a.c {
    }

    static {
        a.C0153a c0153a = e1.a.f11334b;
        f2645a = new b();
        f2646b = new c();
        f2647c = new d();
    }

    public static final i0 a(e1.a aVar) {
        rd.m.e(aVar, "<this>");
        l1.i iVar = (l1.i) aVar.a(f2645a);
        if (iVar == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
        }
        y0 y0Var = (y0) aVar.a(f2646b);
        if (y0Var == null) {
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        Bundle bundle = (Bundle) aVar.a(f2647c);
        String str = (String) aVar.a(v0.f2698c);
        if (str != null) {
            return b(iVar, y0Var, str, bundle);
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
    }

    private static final i0 b(l1.i iVar, y0 y0Var, String str, Bundle bundle) {
        n0 n0VarD = d(iVar);
        o0 o0VarE = e(y0Var);
        i0 i0Var = (i0) o0VarE.e().get(str);
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0VarA = i0.f2635c.a(n0VarD.c(str), bundle);
        o0VarE.e().put(str, i0VarA);
        return i0VarA;
    }

    public static final void c(l1.i iVar) {
        rd.m.e(iVar, "<this>");
        m.b bVarB = iVar.S0().b();
        if (bVarB != m.b.f2652b && bVarB != m.b.f2653c) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (iVar.e0().b("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            n0 n0Var = new n0(iVar.e0(), (y0) iVar);
            iVar.e0().c("androidx.lifecycle.internal.SavedStateHandlesProvider", n0Var);
            iVar.S0().a(new j0(n0Var));
        }
    }

    public static final n0 d(l1.i iVar) {
        rd.m.e(iVar, "<this>");
        f.b bVarB = iVar.e0().b("androidx.lifecycle.internal.SavedStateHandlesProvider");
        n0 n0Var = bVarB instanceof n0 ? (n0) bVarB : null;
        if (n0Var != null) {
            return n0Var;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final o0 e(y0 y0Var) {
        rd.m.e(y0Var, "<this>");
        return (o0) v0.b.c(v0.f2697b, y0Var, new a(), null, 4, null).b("androidx.lifecycle.internal.SavedStateHandlesVM", rd.c0.b(o0.class));
    }
}
