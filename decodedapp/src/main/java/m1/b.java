package m1;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import dd.d0;
import dd.w;
import ed.k0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import l1.f;
import l1.i;
import l1.j;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: i */
    private static final a f20916i = new a(null);

    /* JADX INFO: renamed from: a */
    private final i f20917a;

    /* JADX INFO: renamed from: b */
    private final qd.a f20918b;

    /* JADX INFO: renamed from: c */
    private final c f20919c;

    /* JADX INFO: renamed from: d */
    private final Map f20920d;

    /* JADX INFO: renamed from: e */
    private boolean f20921e;

    /* JADX INFO: renamed from: f */
    private Bundle f20922f;

    /* JADX INFO: renamed from: g */
    private boolean f20923g;

    /* JADX INFO: renamed from: h */
    private boolean f20924h;

    private static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        private a() {
        }
    }

    public b(i iVar, qd.a aVar) {
        m.e(iVar, "owner");
        m.e(aVar, "onAttach");
        this.f20917a = iVar;
        this.f20918b = aVar;
        this.f20919c = new c();
        this.f20920d = new LinkedHashMap();
        this.f20924h = true;
    }

    public static final void g(b bVar, t tVar, m.a aVar) {
        rd.m.e(tVar, "<unused var>");
        rd.m.e(aVar, "event");
        if (aVar == m.a.ON_START) {
            bVar.f20924h = true;
        } else if (aVar == m.a.ON_STOP) {
            bVar.f20924h = false;
        }
    }

    public final Bundle c(String str) {
        rd.m.e(str, "key");
        if (!this.f20923g) {
            throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
        }
        Bundle bundle = this.f20922f;
        if (bundle == null) {
            return null;
        }
        Bundle bundleA = l1.c.a(bundle);
        Bundle bundleC = l1.c.b(bundleA, str) ? l1.c.c(bundleA, str) : null;
        j.e(j.a(bundle), str);
        if (l1.c.f(l1.c.a(bundle))) {
            this.f20922f = null;
        }
        return bundleC;
    }

    public final f.b d(String str) {
        f.b bVar;
        rd.m.e(str, "key");
        synchronized (this.f20919c) {
            Iterator it = this.f20920d.entrySet().iterator();
            do {
                bVar = null;
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                String str2 = (String) entry.getKey();
                f.b bVar2 = (f.b) entry.getValue();
                if (rd.m.a(str2, str)) {
                    bVar = bVar2;
                }
            } while (bVar == null);
        }
        return bVar;
    }

    public final boolean e() {
        return this.f20924h;
    }

    public final void f() {
        if (this.f20917a.S0().b() != m.b.f2652b) {
            throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
        }
        if (this.f20921e) {
            throw new IllegalStateException("SavedStateRegistry was already attached.");
        }
        this.f20918b.a();
        this.f20917a.S0().a(new q() { // from class: m1.a
            @Override // androidx.lifecycle.q
            public final void k(t tVar, m.a aVar) {
                b.g(this.f20915a, tVar, aVar);
            }
        });
        this.f20921e = true;
    }

    public final void h(Bundle bundle) {
        if (!this.f20921e) {
            f();
        }
        if (this.f20917a.S0().b().d(m.b.f2654d)) {
            throw new IllegalStateException(("performRestore cannot be called when owner is " + this.f20917a.S0().b()).toString());
        }
        if (this.f20923g) {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
        }
        Bundle bundleC = null;
        if (bundle != null) {
            Bundle bundleA = l1.c.a(bundle);
            if (l1.c.b(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                bundleC = l1.c.c(bundleA, "androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
        }
        this.f20922f = bundleC;
        this.f20923g = true;
    }

    public final void i(Bundle bundle) {
        dd.q[] qVarArr;
        rd.m.e(bundle, "outBundle");
        Map mapI = k0.i();
        if (mapI.isEmpty()) {
            qVarArr = new dd.q[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(w.a((String) entry.getKey(), entry.getValue()));
            }
            qVarArr = (dd.q[]) arrayList.toArray(new dd.q[0]);
        }
        Bundle bundleA = i0.c.a((dd.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        Bundle bundleA2 = j.a(bundleA);
        Bundle bundle2 = this.f20922f;
        if (bundle2 != null) {
            j.b(bundleA2, bundle2);
        }
        synchronized (this.f20919c) {
            try {
                for (Map.Entry entry2 : this.f20920d.entrySet()) {
                    j.c(bundleA2, (String) entry2.getKey(), ((f.b) entry2.getValue()).a());
                }
                d0 d0Var = d0.f10897a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (l1.c.f(l1.c.a(bundleA))) {
            return;
        }
        j.c(j.a(bundle), "androidx.lifecycle.BundlableSavedStateRegistry.key", bundleA);
    }

    public final void j(String str, f.b bVar) {
        rd.m.e(str, "key");
        rd.m.e(bVar, "provider");
        synchronized (this.f20919c) {
            if (this.f20920d.containsKey(str)) {
                throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
            }
            this.f20920d.put(str, bVar);
            d0 d0Var = d0.f10897a;
        }
    }
}
