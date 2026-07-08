package u7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class t1 extends androidx.fragment.app.o implements i {

    /* JADX INFO: renamed from: p0 */
    private static final WeakHashMap f28521p0 = new WeakHashMap();

    /* JADX INFO: renamed from: o0 */
    private final s1 f28522o0 = new s1();

    public static t1 S3(androidx.fragment.app.p pVar) {
        t1 t1Var;
        WeakHashMap weakHashMap = f28521p0;
        WeakReference weakReference = (WeakReference) weakHashMap.get(pVar);
        if (weakReference != null && (t1Var = (t1) weakReference.get()) != null) {
            return t1Var;
        }
        try {
            t1 t1Var2 = (t1) pVar.N0().j0("SLifecycleFragmentImpl");
            if (t1Var2 == null || t1Var2.g2()) {
                t1Var2 = new t1();
                pVar.N0().o().e(t1Var2, "SLifecycleFragmentImpl").i();
            }
            weakHashMap.put(pVar, new WeakReference(t1Var2));
            return t1Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e10);
        }
    }

    @Override // androidx.fragment.app.o
    public final void M2() {
        super.M2();
        this.f28522o0.i();
    }

    @Override // androidx.fragment.app.o
    public final void N2(Bundle bundle) {
        super.N2(bundle);
        this.f28522o0.j(bundle);
    }

    @Override // androidx.fragment.app.o
    public final void O2() {
        super.O2();
        this.f28522o0.k();
    }

    @Override // androidx.fragment.app.o
    public final void P2() {
        super.P2();
        this.f28522o0.l();
    }

    @Override // u7.i
    public final h V(String str, Class cls) {
        return this.f28522o0.c(str, cls);
    }

    @Override // u7.i
    public final Activity W() {
        return e1();
    }

    @Override // androidx.fragment.app.o
    public final void a1(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a1(str, fileDescriptor, printWriter, strArr);
        this.f28522o0.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.fragment.app.o
    public final void m2(int i10, int i11, Intent intent) {
        super.m2(i10, i11, intent);
        this.f28522o0.f(i10, i11, intent);
    }

    @Override // androidx.fragment.app.o
    public final void r2(Bundle bundle) {
        super.r2(bundle);
        this.f28522o0.g(bundle);
    }

    @Override // u7.i
    public final void u0(String str, h hVar) {
        this.f28522o0.d(str, hVar);
    }

    @Override // androidx.fragment.app.o
    public final void w2() {
        super.w2();
        this.f28522o0.h();
    }
}
