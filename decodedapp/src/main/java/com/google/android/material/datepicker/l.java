package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class l<S> extends q {

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f7799p0;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private com.google.android.material.datepicker.a f7800q0;

    class a extends p {
        a() {
        }
    }

    static l U3(d dVar, int i10, com.google.android.material.datepicker.a aVar) {
        l lVar = new l();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        lVar.E3(bundle);
        return lVar;
    }

    @Override // androidx.fragment.app.o
    public void N2(Bundle bundle) {
        super.N2(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f7799p0);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f7800q0);
    }

    @Override // androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        if (bundle == null) {
            bundle = i1();
        }
        this.f7799p0 = bundle.getInt("THEME_RES_ID_KEY");
        android.support.v4.media.session.b.a(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.f7800q0 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(k1(), this.f7799p0));
        new a();
        throw null;
    }
}
