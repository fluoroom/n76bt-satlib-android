package wa;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import rd.h;
import rd.m;
import va.g;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends Fragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f31373a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static g f31374b;

    public static final class a {
        public /* synthetic */ a(h hVar) {
            this();
        }

        public final void a(Activity activity, g gVar) {
            m.e(activity, "activity");
            m.e(gVar, "onPermissionResult");
            b.f31374b = gVar;
            activity.getFragmentManager().beginTransaction().add(new b(), activity.getLocalClassName()).commitAllowingStateLoss();
        }

        private a() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(b bVar) {
        Activity activity = bVar.getActivity();
        if (activity == null) {
            return;
        }
        boolean zA = c.a(activity);
        ya.g.f32466a.d("PermissionFragment onActivityResult: " + zA);
        g gVar = f31374b;
        if (gVar != null) {
            gVar.a(zA);
        }
        f31374b = null;
        bVar.getFragmentManager().beginTransaction().remove(bVar).commitAllowingStateLoss();
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        c.f31375a.k(this);
        ya.g.f32466a.d("PermissionFragment：requestPermission");
    }

    @Override // android.app.Fragment
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 199) {
            new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: wa.a
                @Override // java.lang.Runnable
                public final void run() {
                    b.c(this.f31372a);
                }
            }, 500L);
        }
    }
}
