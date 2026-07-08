package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.m;
import java.util.Iterator;
import l1.f;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: a */
    public static final l f2642a = new l();

    public static final class a implements f.a {
        @Override // l1.f.a
        public void a(l1.i iVar) {
            rd.m.e(iVar, "owner");
            if (!(iVar instanceof y0)) {
                throw new IllegalStateException(("Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: " + iVar).toString());
            }
            x0 x0VarU = ((y0) iVar).U();
            l1.f fVarE0 = iVar.e0();
            Iterator it = x0VarU.c().iterator();
            while (it.hasNext()) {
                s0 s0VarB = x0VarU.b((String) it.next());
                if (s0VarB != null) {
                    l.a(s0VarB, fVarE0, iVar.S0());
                }
            }
            if (x0VarU.c().isEmpty()) {
                return;
            }
            fVarE0.d(a.class);
        }
    }

    public static final class b implements q {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ m f2643a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ l1.f f2644b;

        b(m mVar, l1.f fVar) {
            this.f2643a = mVar;
            this.f2644b = fVar;
        }

        @Override // androidx.lifecycle.q
        public void k(t tVar, m.a aVar) {
            rd.m.e(tVar, "source");
            rd.m.e(aVar, "event");
            if (aVar == m.a.ON_START) {
                this.f2643a.d(this);
                this.f2644b.d(a.class);
            }
        }
    }

    private l() {
    }

    public static final void a(s0 s0Var, l1.f fVar, m mVar) {
        rd.m.e(s0Var, "viewModel");
        rd.m.e(fVar, "registry");
        rd.m.e(mVar, "lifecycle");
        k0 k0Var = (k0) s0Var.c("androidx.lifecycle.savedstate.vm.tag");
        if (k0Var == null || k0Var.q()) {
            return;
        }
        k0Var.a(fVar, mVar);
        f2642a.c(fVar, mVar);
    }

    public static final k0 b(l1.f fVar, m mVar, String str, Bundle bundle) {
        rd.m.e(fVar, "registry");
        rd.m.e(mVar, "lifecycle");
        rd.m.b(str);
        k0 k0Var = new k0(str, i0.f2635c.a(fVar.a(str), bundle));
        k0Var.a(fVar, mVar);
        f2642a.c(fVar, mVar);
        return k0Var;
    }

    private final void c(l1.f fVar, m mVar) {
        m.b bVarB = mVar.b();
        if (bVarB == m.b.f2652b || bVarB.d(m.b.f2654d)) {
            fVar.d(a.class);
        } else {
            mVar.a(new b(mVar, fVar));
        }
    }
}
