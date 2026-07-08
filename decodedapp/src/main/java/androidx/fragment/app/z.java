package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
final class z extends s0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final v0.c f2511i = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f2515e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f2512b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f2513c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f2514d = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f2516f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f2517g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f2518h = false;

    class a implements v0.c {
        a() {
        }

        @Override // androidx.lifecycle.v0.c
        public s0 a(Class cls) {
            return new z(true);
        }

        @Override // androidx.lifecycle.v0.c
        public /* synthetic */ s0 b(yd.c cVar, e1.a aVar) {
            return w0.c(this, cVar, aVar);
        }

        @Override // androidx.lifecycle.v0.c
        public /* synthetic */ s0 c(Class cls, e1.a aVar) {
            return w0.b(this, cls, aVar);
        }
    }

    z(boolean z10) {
        this.f2515e = z10;
    }

    private void h(String str, boolean z10) {
        z zVar = (z) this.f2513c.get(str);
        if (zVar != null) {
            if (z10) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(zVar.f2513c.keySet());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    zVar.g((String) it.next(), true);
                }
            }
            zVar.d();
            this.f2513c.remove(str);
        }
        x0 x0Var = (x0) this.f2514d.get(str);
        if (x0Var != null) {
            x0Var.a();
            this.f2514d.remove(str);
        }
    }

    static z k(x0 x0Var) {
        return (z) new v0(x0Var, f2511i).a(z.class);
    }

    @Override // androidx.lifecycle.s0
    protected void d() {
        if (w.J0(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f2516f = true;
    }

    void e(o oVar) {
        if (this.f2518h) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "Ignoring addRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2512b.containsKey(oVar.f2384f)) {
                return;
            }
            this.f2512b.put(oVar.f2384f, oVar);
            if (w.J0(2)) {
                Log.v("FragmentManager", "Updating retained Fragments: Added " + oVar);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && z.class == obj.getClass()) {
            z zVar = (z) obj;
            if (this.f2512b.equals(zVar.f2512b) && this.f2513c.equals(zVar.f2513c) && this.f2514d.equals(zVar.f2514d)) {
                return true;
            }
        }
        return false;
    }

    void f(o oVar, boolean z10) {
        if (w.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + oVar);
        }
        h(oVar.f2384f, z10);
    }

    void g(String str, boolean z10) {
        if (w.J0(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        h(str, z10);
    }

    public int hashCode() {
        return (((this.f2512b.hashCode() * 31) + this.f2513c.hashCode()) * 31) + this.f2514d.hashCode();
    }

    o i(String str) {
        return (o) this.f2512b.get(str);
    }

    z j(o oVar) {
        z zVar = (z) this.f2513c.get(oVar.f2384f);
        if (zVar != null) {
            return zVar;
        }
        z zVar2 = new z(this.f2515e);
        this.f2513c.put(oVar.f2384f, zVar2);
        return zVar2;
    }

    Collection l() {
        return new ArrayList(this.f2512b.values());
    }

    x0 m(o oVar) {
        x0 x0Var = (x0) this.f2514d.get(oVar.f2384f);
        if (x0Var != null) {
            return x0Var;
        }
        x0 x0Var2 = new x0();
        this.f2514d.put(oVar.f2384f, x0Var2);
        return x0Var2;
    }

    boolean n() {
        return this.f2516f;
    }

    void o(o oVar) {
        if (this.f2518h) {
            if (w.J0(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f2512b.remove(oVar.f2384f) == null || !w.J0(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + oVar);
        }
    }

    void p(boolean z10) {
        this.f2518h = z10;
    }

    boolean q(o oVar) {
        if (this.f2512b.containsKey(oVar.f2384f)) {
            return this.f2515e ? this.f2516f : !this.f2517g;
        }
        return true;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f2512b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f2513c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f2514d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
