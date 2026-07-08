package androidx.lifecycle;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import l1.f;

/* JADX INFO: loaded from: classes.dex */
public final class n0 implements f.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l1.f f2659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f2660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Bundle f2661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dd.j f2662d;

    public n0(l1.f fVar, final y0 y0Var) {
        rd.m.e(fVar, "savedStateRegistry");
        rd.m.e(y0Var, "viewModelStoreOwner");
        this.f2659a = fVar;
        this.f2662d = dd.k.b(new qd.a() { // from class: androidx.lifecycle.m0
            @Override // qd.a
            public final Object a() {
                return n0.f(y0Var);
            }
        });
    }

    private final o0 d() {
        return (o0) this.f2662d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o0 f(y0 y0Var) {
        return l0.e(y0Var);
    }

    @Override // l1.f.b
    public Bundle a() {
        dd.q[] qVarArr;
        Map mapI = ed.k0.i();
        if (mapI.isEmpty()) {
            qVarArr = new dd.q[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(dd.w.a((String) entry.getKey(), entry.getValue()));
            }
            qVarArr = (dd.q[]) arrayList.toArray(new dd.q[0]);
        }
        Bundle bundleA = i0.c.a((dd.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        Bundle bundleA2 = l1.j.a(bundleA);
        Bundle bundle = this.f2661c;
        if (bundle != null) {
            l1.j.b(bundleA2, bundle);
        }
        for (Map.Entry entry2 : d().e().entrySet()) {
            String str = (String) entry2.getKey();
            Bundle bundleA3 = ((i0) entry2.getValue()).a().a();
            if (!l1.c.f(l1.c.a(bundleA3))) {
                l1.j.c(bundleA2, str, bundleA3);
            }
        }
        this.f2660b = false;
        return bundleA;
    }

    public final Bundle c(String str) {
        dd.q[] qVarArr;
        rd.m.e(str, "key");
        e();
        Bundle bundle = this.f2661c;
        if (bundle == null || !l1.c.b(l1.c.a(bundle), str)) {
            return null;
        }
        Bundle bundleD = l1.c.d(l1.c.a(bundle), str);
        if (bundleD == null) {
            Map mapI = ed.k0.i();
            if (mapI.isEmpty()) {
                qVarArr = new dd.q[0];
            } else {
                ArrayList arrayList = new ArrayList(mapI.size());
                for (Map.Entry entry : mapI.entrySet()) {
                    arrayList.add(dd.w.a((String) entry.getKey(), entry.getValue()));
                }
                qVarArr = (dd.q[]) arrayList.toArray(new dd.q[0]);
            }
            bundleD = i0.c.a((dd.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
            l1.j.a(bundleD);
        }
        l1.j.e(l1.j.a(bundle), str);
        if (l1.c.f(l1.c.a(bundle))) {
            this.f2661c = null;
        }
        return bundleD;
    }

    public final void e() {
        dd.q[] qVarArr;
        if (this.f2660b) {
            return;
        }
        Bundle bundleA = this.f2659a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Map mapI = ed.k0.i();
        if (mapI.isEmpty()) {
            qVarArr = new dd.q[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(dd.w.a((String) entry.getKey(), entry.getValue()));
            }
            qVarArr = (dd.q[]) arrayList.toArray(new dd.q[0]);
        }
        Bundle bundleA2 = i0.c.a((dd.q[]) Arrays.copyOf(qVarArr, qVarArr.length));
        Bundle bundleA3 = l1.j.a(bundleA2);
        Bundle bundle = this.f2661c;
        if (bundle != null) {
            l1.j.b(bundleA3, bundle);
        }
        if (bundleA != null) {
            l1.j.b(bundleA3, bundleA);
        }
        this.f2661c = bundleA2;
        this.f2660b = true;
        d();
    }
}
