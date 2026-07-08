package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f2183a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f2184b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final HashMap f2185c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private z f2186d;

    c0() {
    }

    void A(z zVar) {
        this.f2186d = zVar;
    }

    Bundle B(String str, Bundle bundle) {
        return bundle != null ? (Bundle) this.f2185c.put(str, bundle) : (Bundle) this.f2185c.remove(str);
    }

    void a(o oVar) {
        if (this.f2183a.contains(oVar)) {
            throw new IllegalStateException("Fragment already added: " + oVar);
        }
        synchronized (this.f2183a) {
            this.f2183a.add(oVar);
        }
        oVar.f2398u = true;
    }

    void b() {
        this.f2184b.values().removeAll(Collections.singleton(null));
    }

    boolean c(String str) {
        return this.f2184b.get(str) != null;
    }

    void d(int i10) {
        for (b0 b0Var : this.f2184b.values()) {
            if (b0Var != null) {
                b0Var.s(i10);
            }
        }
    }

    void e(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2 = str + "    ";
        if (!this.f2184b.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (b0 b0Var : this.f2184b.values()) {
                printWriter.print(str);
                if (b0Var != null) {
                    o oVarK = b0Var.k();
                    printWriter.println(oVarK);
                    oVarK.a1(str2, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size = this.f2183a.size();
        if (size > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) this.f2183a.get(i10);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i10);
                printWriter.print(": ");
                printWriter.println(oVar.toString());
            }
        }
    }

    o f(String str) {
        b0 b0Var = (b0) this.f2184b.get(str);
        if (b0Var != null) {
            return b0Var.k();
        }
        return null;
    }

    o g(int i10) {
        for (int size = this.f2183a.size() - 1; size >= 0; size--) {
            o oVar = (o) this.f2183a.get(size);
            if (oVar != null && oVar.I == i10) {
                return oVar;
            }
        }
        for (b0 b0Var : this.f2184b.values()) {
            if (b0Var != null) {
                o oVarK = b0Var.k();
                if (oVarK.I == i10) {
                    return oVarK;
                }
            }
        }
        return null;
    }

    o h(String str) {
        if (str != null) {
            for (int size = this.f2183a.size() - 1; size >= 0; size--) {
                o oVar = (o) this.f2183a.get(size);
                if (oVar != null && str.equals(oVar.K)) {
                    return oVar;
                }
            }
        }
        if (str == null) {
            return null;
        }
        for (b0 b0Var : this.f2184b.values()) {
            if (b0Var != null) {
                o oVarK = b0Var.k();
                if (str.equals(oVarK.K)) {
                    return oVarK;
                }
            }
        }
        return null;
    }

    o i(String str) {
        o oVarC1;
        for (b0 b0Var : this.f2184b.values()) {
            if (b0Var != null && (oVarC1 = b0Var.k().c1(str)) != null) {
                return oVarC1;
            }
        }
        return null;
    }

    int j(o oVar) {
        View view;
        View view2;
        ViewGroup viewGroup = oVar.S;
        if (viewGroup == null) {
            return -1;
        }
        int iIndexOf = this.f2183a.indexOf(oVar);
        for (int i10 = iIndexOf - 1; i10 >= 0; i10--) {
            o oVar2 = (o) this.f2183a.get(i10);
            if (oVar2.S == viewGroup && (view2 = oVar2.T) != null) {
                return viewGroup.indexOfChild(view2) + 1;
            }
        }
        while (true) {
            iIndexOf++;
            if (iIndexOf >= this.f2183a.size()) {
                return -1;
            }
            o oVar3 = (o) this.f2183a.get(iIndexOf);
            if (oVar3.S == viewGroup && (view = oVar3.T) != null) {
                return viewGroup.indexOfChild(view);
            }
        }
    }

    List k() {
        ArrayList arrayList = new ArrayList();
        for (b0 b0Var : this.f2184b.values()) {
            if (b0Var != null) {
                arrayList.add(b0Var);
            }
        }
        return arrayList;
    }

    List l() {
        ArrayList arrayList = new ArrayList();
        for (b0 b0Var : this.f2184b.values()) {
            if (b0Var != null) {
                arrayList.add(b0Var.k());
            } else {
                arrayList.add(null);
            }
        }
        return arrayList;
    }

    HashMap m() {
        return this.f2185c;
    }

    b0 n(String str) {
        return (b0) this.f2184b.get(str);
    }

    List o() {
        ArrayList arrayList;
        if (this.f2183a.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        synchronized (this.f2183a) {
            arrayList = new ArrayList(this.f2183a);
        }
        return arrayList;
    }

    z p() {
        return this.f2186d;
    }

    Bundle q(String str) {
        return (Bundle) this.f2185c.get(str);
    }

    void r(b0 b0Var) {
        o oVarK = b0Var.k();
        if (c(oVarK.f2384f)) {
            return;
        }
        this.f2184b.put(oVarK.f2384f, b0Var);
        if (oVarK.O) {
            if (oVarK.N) {
                this.f2186d.e(oVarK);
            } else {
                this.f2186d.o(oVarK);
            }
            oVarK.O = false;
        }
        if (w.J0(2)) {
            Log.v("FragmentManager", "Added fragment to active set " + oVarK);
        }
    }

    void s(b0 b0Var) {
        o oVarK = b0Var.k();
        if (oVarK.N) {
            this.f2186d.o(oVarK);
        }
        if (this.f2184b.get(oVarK.f2384f) == b0Var && ((b0) this.f2184b.put(oVarK.f2384f, null)) != null && w.J0(2)) {
            Log.v("FragmentManager", "Removed fragment from active set " + oVarK);
        }
    }

    void t() {
        Iterator it = this.f2183a.iterator();
        while (it.hasNext()) {
            b0 b0Var = (b0) this.f2184b.get(((o) it.next()).f2384f);
            if (b0Var != null) {
                b0Var.m();
            }
        }
        for (b0 b0Var2 : this.f2184b.values()) {
            if (b0Var2 != null) {
                b0Var2.m();
                o oVarK = b0Var2.k();
                if (oVarK.f2399v && !oVarK.d2()) {
                    if (oVarK.f2401x && !this.f2185c.containsKey(oVarK.f2384f)) {
                        B(oVarK.f2384f, b0Var2.q());
                    }
                    s(b0Var2);
                }
            }
        }
    }

    void u(o oVar) {
        synchronized (this.f2183a) {
            this.f2183a.remove(oVar);
        }
        oVar.f2398u = false;
    }

    void v() {
        this.f2184b.clear();
    }

    void w(List list) {
        this.f2183a.clear();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                o oVarF = f(str);
                if (oVarF == null) {
                    throw new IllegalStateException("No instantiated fragment for (" + str + ")");
                }
                if (w.J0(2)) {
                    Log.v("FragmentManager", "restoreSaveState: added (" + str + "): " + oVarF);
                }
                a(oVarF);
            }
        }
    }

    void x(HashMap map) {
        this.f2185c.clear();
        this.f2185c.putAll(map);
    }

    ArrayList y() {
        ArrayList arrayList = new ArrayList(this.f2184b.size());
        for (b0 b0Var : this.f2184b.values()) {
            if (b0Var != null) {
                o oVarK = b0Var.k();
                B(oVarK.f2384f, b0Var.q());
                arrayList.add(oVarK.f2384f);
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Saved state of " + oVarK + ": " + oVarK.f2376b);
                }
            }
        }
        return arrayList;
    }

    ArrayList z() {
        synchronized (this.f2183a) {
            try {
                if (this.f2183a.isEmpty()) {
                    return null;
                }
                ArrayList arrayList = new ArrayList(this.f2183a.size());
                for (o oVar : this.f2183a) {
                    arrayList.add(oVar.f2384f);
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "saveAllState: adding fragment (" + oVar.f2384f + "): " + oVar);
                    }
                }
                return arrayList;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
