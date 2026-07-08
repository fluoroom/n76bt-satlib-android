package com.dw.ht.satellite;

import a6.w;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import com.dw.ht.satellite.SatelliteInfoFragment;
import com.dw.ht.satellite.a;
import java.util.ArrayList;
import kotlin.Metadata;
import m4.g1;
import o5.h;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0003R.\u0010\u001a\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/dw/ht/satellite/SatelliteInfoFragment;", "Landroidx/fragment/app/o;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "V3", "y2", "Lcom/dw/ht/satellite/a;", "value", "o0", "Lcom/dw/ht/satellite/a;", "getSatellite", "()Lcom/dw/ht/satellite/a;", "U3", "(Lcom/dw/ht/satellite/a;)V", "satellite", "Lm4/g1;", "p0", "Lm4/g1;", "_binding", "Ljava/lang/Runnable;", "q0", "Ljava/lang/Runnable;", "update", "T3", "()Lm4/g1;", "binding", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SatelliteInfoFragment extends o {

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private a satellite;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    private g1 _binding;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private final Runnable update = new Runnable() { // from class: j5.g
        @Override // java.lang.Runnable
        public final void run() {
            SatelliteInfoFragment.W3(this.f18436a);
        }
    };

    private final g1 T3() {
        g1 g1Var = this._binding;
        m.b(g1Var);
        return g1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W3(SatelliteInfoFragment satelliteInfoFragment) {
        satelliteInfoFragment.V3();
    }

    public final void U3(a aVar) {
        if (m.a(this.satellite, aVar)) {
            return;
        }
        this.satellite = aVar;
        V3();
    }

    public final void V3() {
        a aVar;
        g1 g1Var = this._binding;
        if (g1Var == null || (aVar = this.satellite) == null) {
            return;
        }
        g1Var.f21166d.setText(aVar.k());
        ArrayList arrayList = new ArrayList();
        a.C0097a c0097aJ = a.j(aVar, 0L, 1, null);
        if (c0097aJ != null) {
            arrayList.add("坐标：" + h.q(c0097aJ.d(), 2));
            arrayList.add("高度：" + h.d(c0097aJ.a()) + j5.h.a(c0097aJ.b()));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("速度：");
            sb2.append(h.o(c0097aJ.i(), null, 2, null));
            arrayList.add(sb2.toString());
        }
        g1Var.f21164b.setText(w.c("\n", arrayList));
        g1Var.b().removeCallbacks(this.update);
        g1Var.b().postDelayed(this.update, 1000L);
    }

    @Override // androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.e(inflater, "inflater");
        this._binding = g1.c(inflater, container, false);
        ConstraintLayout constraintLayoutB = T3().b();
        m.d(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.o
    public void y2() {
        super.y2();
        this._binding = null;
    }
}
