package u7;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends Fragment implements i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final WeakHashMap f28494b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s1 f28495a = new s1();

    public static q1 a(Activity activity) {
        q1 q1Var;
        WeakHashMap weakHashMap = f28494b;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null && (q1Var = (q1) weakReference.get()) != null) {
            return q1Var;
        }
        try {
            q1 q1Var2 = (q1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (q1Var2 == null || q1Var2.isRemoving()) {
                q1Var2 = new q1();
                activity.getFragmentManager().beginTransaction().add(q1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(q1Var2));
            return q1Var2;
        } catch (ClassCastException e10) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
        }
    }

    @Override // u7.i
    public final h V(String str, Class cls) {
        return this.f28495a.c(str, cls);
    }

    @Override // u7.i
    public final Activity W() {
        return getActivity();
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        this.f28495a.e(str, fileDescriptor, printWriter, strArr);
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        this.f28495a.f(i10, i11, intent);
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f28495a.g(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f28495a.h();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        this.f28495a.i();
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.f28495a.j(bundle);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f28495a.k();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f28495a.l();
    }

    @Override // u7.i
    public final void u0(String str, h hVar) {
        this.f28495a.d(str, hVar);
    }
}
