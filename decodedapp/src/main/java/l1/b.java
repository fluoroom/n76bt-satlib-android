package l1;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.q;
import androidx.lifecycle.t;
import dd.w;
import ed.k0;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l1.f;

/* JADX INFO: loaded from: classes.dex */
public final class b implements q {

    /* JADX INFO: renamed from: b */
    public static final a f20322b = new a(null);

    /* JADX INFO: renamed from: a */
    private final i f20323a;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: l1.b$b */
    public static final class C0271b implements f.b {

        /* JADX INFO: renamed from: a */
        private final Set f20324a;

        public C0271b(f fVar) {
            rd.m.e(fVar, "registry");
            this.f20324a = new LinkedHashSet();
            fVar.c("androidx.savedstate.Restarter", this);
        }

        @Override // l1.f.b
        public Bundle a() {
            dd.q[] qVarArr;
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
            j.d(j.a(bundleA), "classes_to_restore", ed.q.H0(this.f20324a));
            return bundleA;
        }

        public final void b(String str) {
            rd.m.e(str, "className");
            this.f20324a.add(str);
        }
    }

    public b(i iVar) {
        rd.m.e(iVar, "owner");
        this.f20323a = iVar;
    }

    private final void a(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, b.class.getClassLoader()).asSubclass(f.a.class);
            rd.m.b(clsAsSubclass);
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    rd.m.b(objNewInstance);
                    ((f.a) objNewInstance).a(this.f20323a);
                } catch (Exception e10) {
                    throw new RuntimeException("Failed to instantiate " + str, e10);
                }
            } catch (NoSuchMethodException e11) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e11);
            }
        } catch (ClassNotFoundException e12) {
            throw new RuntimeException("Class " + str + " wasn't found", e12);
        }
    }

    @Override // androidx.lifecycle.q
    public void k(t tVar, m.a aVar) {
        rd.m.e(tVar, "source");
        rd.m.e(aVar, "event");
        if (aVar != m.a.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        tVar.S0().d(this);
        Bundle bundleA = this.f20323a.e0().a("androidx.savedstate.Restarter");
        if (bundleA == null) {
            return;
        }
        List listE = c.e(c.a(bundleA), "classes_to_restore");
        if (listE == null) {
            throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            a((String) it.next());
        }
    }
}
