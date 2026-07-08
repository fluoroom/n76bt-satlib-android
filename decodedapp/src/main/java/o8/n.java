package o8;

import android.app.Activity;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.StrictMode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes.dex */
final class n implements c8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final androidx.fragment.app.o f23316a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final p8.d f23317b;

    public n(androidx.fragment.app.o oVar, p8.d dVar) {
        this.f23317b = (p8.d) v7.q.i(dVar);
        this.f23316a = (androidx.fragment.app.o) v7.q.i(oVar);
    }

    public final void a(f fVar) {
        try {
            this.f23317b.I0(new m(this, fVar));
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    @Override // c8.c
    public final void b() {
        try {
            this.f23317b.b();
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    @Override // c8.c
    public final void d() {
        try {
            this.f23317b.d();
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    @Override // c8.c
    public final void f() {
        try {
            this.f23317b.f();
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    @Override // c8.c
    public final void g() {
        try {
            this.f23317b.g();
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    @Override // c8.c
    public final void n() {
        try {
            this.f23317b.n();
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    @Override // c8.c
    public final void o(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            p8.a0.b(bundle, bundle2);
            this.f23317b.o(bundle2);
            p8.a0.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    @Override // c8.c
    public final void onLowMemory() {
        try {
            this.f23317b.onLowMemory();
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    @Override // c8.c
    public final void v() {
        try {
            this.f23317b.v();
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    @Override // c8.c
    public final void w(Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            p8.a0.b(bundle, bundle2);
            Bundle bundleI1 = this.f23316a.i1();
            if (bundleI1 != null && bundleI1.containsKey("MapOptions")) {
                p8.a0.c(bundle2, "MapOptions", bundleI1.getParcelable("MapOptions"));
            }
            this.f23317b.w(bundle2);
            p8.a0.b(bundle2, bundle);
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    @Override // c8.c
    public final void x(Activity activity, Bundle bundle, Bundle bundle2) {
        GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
        try {
            Bundle bundle3 = new Bundle();
            p8.a0.b(bundle2, bundle3);
            this.f23317b.P(c8.d.v1(activity), googleMapOptions, bundle3);
            p8.a0.b(bundle3, bundle2);
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }

    @Override // c8.c
    public final View y(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        try {
            Bundle bundle2 = new Bundle();
            p8.a0.b(bundle, bundle2);
            StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
            try {
                c8.b bVarV0 = this.f23317b.v0(c8.d.v1(layoutInflater), c8.d.v1(viewGroup), bundle2);
                StrictMode.setThreadPolicy(threadPolicy);
                p8.a0.b(bundle2, bundle);
                return (View) c8.d.x(bVarV0);
            } catch (Throwable th2) {
                StrictMode.setThreadPolicy(threadPolicy);
                throw th2;
            }
        } catch (RemoteException e10) {
            throw new q8.q(e10);
        }
    }
}
