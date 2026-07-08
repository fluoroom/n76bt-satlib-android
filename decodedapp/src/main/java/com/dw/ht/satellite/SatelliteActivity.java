package com.dw.ht.satellite;

import android.os.Bundle;
import androidx.appcompat.app.d;
import androidx.fragment.app.d0;
import androidx.fragment.app.w;
import c5.a0;
import c5.b0;
import c5.x;
import com.benshikj.ht.R;
import com.dw.ht.fragments.j;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import j5.f;
import kotlin.Metadata;
import m4.g;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\n\u0010\u0004J)\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lcom/dw/ht/satellite/SatelliteActivity;", "Landroidx/appcompat/app/d;", "Lc5/a0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "", "sender", "Lc5/b0;", "overlay", "", "byUser", "h", "(Ljava/lang/Object;Lc5/b0;Z)Z", "Lcom/dw/ht/fragments/j;", "M", "Lcom/dw/ht/fragments/j;", "mapFragment", "N", "sMapFragment", "Lm4/g;", "O", "Lm4/g;", "_binding", "m1", "()Lm4/g;", "binding", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SatelliteActivity extends d implements a0 {

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private j mapFragment;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private j sMapFragment;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private g _binding;

    private final g m1() {
        g gVar = this._binding;
        m.b(gVar);
        return gVar;
    }

    @Override // c5.a0
    public boolean h(Object sender, b0 overlay, boolean byUser) {
        g gVar;
        m.e(sender, "sender");
        if (!m.a(sender, this.mapFragment) || overlay == null || (gVar = this._binding) == null) {
            return true;
        }
        a aVarB = b.B(-((int) overlay.f()));
        ((SatelliteInfoFragment) gVar.f21144d.getFragment()).U3(aVarB);
        gVar.f21145e.setVisibility(aVarB == null ? 8 : 0);
        return true;
    }

    @Override // androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        k1(10);
        getWindow().setFlags(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT);
        super.onCreate(savedInstanceState);
        this._binding = g.c(getLayoutInflater());
        setContentView(m1().b());
        w wVarN0 = N0();
        m.d(wVarN0, "getSupportFragmentManager(...)");
        f.f18431b.d();
        j jVar = (j) wVarN0.i0(R.id.map);
        this.mapFragment = jVar;
        if (jVar == null) {
            this.mapFragment = new c5.a().l(x.DISABLE).t(1.0f).r(false).m(false).c();
            d0 d0VarO = wVarN0.o();
            j jVar2 = this.mapFragment;
            m.b(jVar2);
            d0VarO.b(R.id.map, jVar2).h();
        }
        j jVar3 = (j) wVarN0.i0(R.id.smap);
        this.sMapFragment = jVar3;
        if (jVar3 == null) {
            this.sMapFragment = new c5.a().l(x.DISABLE).t(1.0f).o(1.0d).r(false).n(z4.j.f32938b).m(false).c();
            d0 d0VarO2 = wVarN0.o();
            j jVar4 = this.sMapFragment;
            m.b(jVar4);
            d0VarO2.b(R.id.smap, jVar4).h();
        }
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        this._binding = null;
        super.onDestroy();
    }
}
