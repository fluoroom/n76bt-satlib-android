package o8;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes.dex */
public class j extends androidx.fragment.app.o {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final o f23312o0 = new o(this);

    @Override // androidx.fragment.app.o
    public void C2(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.C2(activity, attributeSet, bundle);
            o oVar = this.f23312o0;
            o.v(oVar, activity);
            GoogleMapOptions googleMapOptionsG = GoogleMapOptions.g(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsG);
            oVar.h(activity, bundle2, bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.o
    public void E3(Bundle bundle) {
        super.E3(bundle);
    }

    @Override // androidx.fragment.app.o
    public void H2() {
        this.f23312o0.j();
        super.H2();
    }

    @Override // androidx.fragment.app.o
    public void M2() {
        super.M2();
        this.f23312o0.k();
    }

    @Override // androidx.fragment.app.o
    public void N2(Bundle bundle) {
        ClassLoader classLoader = j.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.N2(bundle);
        this.f23312o0.l(bundle);
    }

    @Override // androidx.fragment.app.o
    public void O2() {
        super.O2();
        this.f23312o0.m();
    }

    @Override // androidx.fragment.app.o
    public void P2() {
        this.f23312o0.n();
        super.P2();
    }

    public void S3(f fVar) {
        v7.q.e("getMapAsync must be called on the main thread.");
        v7.q.j(fVar, "callback must not be null.");
        this.f23312o0.w(fVar);
    }

    @Override // androidx.fragment.app.o
    public void l2(Bundle bundle) {
        ClassLoader classLoader = j.class.getClassLoader();
        if (bundle != null && classLoader != null) {
            bundle.setClassLoader(classLoader);
        }
        super.l2(bundle);
    }

    @Override // androidx.fragment.app.o
    public void n2(Activity activity) {
        super.n2(activity);
        o.v(this.f23312o0, activity);
    }

    @Override // androidx.fragment.app.o, android.content.ComponentCallbacks
    public void onLowMemory() {
        this.f23312o0.i();
        super.onLowMemory();
    }

    @Override // androidx.fragment.app.o
    public void r2(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.r2(bundle);
            this.f23312o0.d(bundle);
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewE = this.f23312o0.e(layoutInflater, viewGroup, bundle);
        viewE.setClickable(true);
        return viewE;
    }

    @Override // androidx.fragment.app.o
    public void w2() {
        this.f23312o0.f();
        super.w2();
    }

    @Override // androidx.fragment.app.o
    public void y2() {
        this.f23312o0.g();
        super.y2();
    }
}
