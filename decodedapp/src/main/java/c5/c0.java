package c5;

import android.location.Location;
import com.dw.ht.satellite.a;
import com.google.android.gms.maps.model.LatLng;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kj.t1;

/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f4317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f4318b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f4319c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f4320d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final yj.b f4321e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final t1 f4322f;

    public c0(boolean z10) {
        this.f4317a = z10;
        ArrayList arrayListA = a6.o.a();
        rd.m.d(arrayListA, "newArrayList(...)");
        this.f4318b = arrayListA;
        ArrayList arrayListA2 = a6.o.a();
        rd.m.d(arrayListA2, "newArrayList(...)");
        this.f4319c = arrayListA2;
        this.f4320d = new HashMap();
        yj.b bVar = new yj.b(new Date(System.currentTimeMillis()), gj.c.a().d().e());
        this.f4321e = bVar;
        t1 t1VarU = null;
        Location locationB = o5.g.f23195s.b(null);
        if (locationB != null) {
            j5.c cVar = j5.c.f18427a;
            t1VarU = cVar.f().u(cVar.h(locationB), bVar);
        }
        this.f4322f = t1VarU;
    }

    private final void a(int i10) {
        a.C0097a c0097aH;
        t1 t1Var;
        com.dw.ht.satellite.a aVarB = com.dw.ht.satellite.b.B(i10);
        if (aVarB == null || (c0097aH = aVarB.h(System.currentTimeMillis())) == null) {
            return;
        }
        Location location = new Location("o");
        LatLng latLngD = c0097aH.d();
        location.setLatitude(latLngD.f7320a);
        location.setLongitude(latLngD.f7321b);
        b0 b0Var = new b0(location, aVarB.k(), "\\S", -aVarB.f(), 0L);
        if (this.f4317a && (t1Var = this.f4322f) != null) {
            xi.f fVarQ = t1Var.q(c0097aH.c().t());
            rd.m.b(fVarQ);
            b0Var.s(j5.d.b(j5.d.d(fVarQ)) < 5.0d);
        }
        this.f4318b.add(b0Var);
        String str = "satellite-" + aVarB.f() + '-';
        if (!com.dw.ht.satellite.b.F(i10)) {
            this.f4319c.add(str);
            return;
        }
        ArrayList arrayListL = aVarB.l(System.currentTimeMillis(), 1.0d);
        if (arrayListL == null) {
            return;
        }
        d5.h hVar = new d5.h();
        hVar.H(Float.valueOf(1.0f));
        List listSubList = arrayListL.subList(0, arrayListL.size() / 2);
        rd.m.d(listSubList, "subList(...)");
        hVar.c(listSubList);
        hVar.v(Integer.valueOf(aVarB.e()));
        f(hVar, str + 1);
        d5.h hVar2 = new d5.h();
        hVar2.H(Float.valueOf(1.0f));
        List listSubList2 = arrayListL.subList((arrayListL.size() / 2) - 1, arrayListL.size());
        rd.m.d(listSubList2, "subList(...)");
        hVar2.c(listSubList2);
        hVar2.v(Integer.valueOf(aVarB.e()));
        f(hVar2, str + 2);
        ArrayList arrayListL2 = aVarB.l(System.currentTimeMillis(), -0.2d);
        if (arrayListL2 == null) {
            return;
        }
        d5.h hVar3 = new d5.h();
        hVar3.H(Float.valueOf(1.0f));
        hVar3.c(arrayListL2);
        hVar3.a(latLngD);
        hVar3.v(Integer.valueOf(aVarB.e() & (-1996488705)));
        f(hVar3, str + 3);
    }

    private final void f(d5.h hVar, String str) {
        this.f4320d.put(str, hVar);
    }

    public final void b(int[] iArr) {
        rd.m.e(iArr, "ids");
        for (int i10 : iArr) {
            a(i10);
        }
    }

    public final ArrayList c() {
        return this.f4319c;
    }

    public final ArrayList d() {
        return this.f4318b;
    }

    public final HashMap e() {
        return this.f4320d;
    }
}
