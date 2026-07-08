package rb;

import io.grpc.internal.d3;
import io.grpc.internal.w0;
import java.util.ArrayList;
import java.util.List;
import qb.k0;
import qb.z0;

/* JADX INFO: loaded from: classes3.dex */
abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final tb.d f25689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final tb.d f25690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final tb.d f25691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final tb.d f25692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final tb.d f25693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final tb.d f25694f;

    static {
        vh.h hVar = tb.d.f27704g;
        f25689a = new tb.d(hVar, "https");
        f25690b = new tb.d(hVar, "http");
        vh.h hVar2 = tb.d.f27702e;
        f25691c = new tb.d(hVar2, "POST");
        f25692d = new tb.d(hVar2, "GET");
        f25693e = new tb.d(w0.f17192j.d(), "application/grpc");
        f25694f = new tb.d("te", "trailers");
    }

    private static List a(List list, z0 z0Var) {
        byte[][] bArrD = d3.d(z0Var);
        for (int i10 = 0; i10 < bArrD.length; i10 += 2) {
            vh.h hVarG = vh.h.G(bArrD[i10]);
            if (hVarG.Q() != 0 && hVarG.h(0) != 58) {
                list.add(new tb.d(hVarG, vh.h.G(bArrD[i10 + 1])));
            }
        }
        return list;
    }

    public static List b(z0 z0Var, String str, String str2, String str3, boolean z10, boolean z11) {
        r9.l.o(z0Var, "headers");
        r9.l.o(str, "defaultPath");
        r9.l.o(str2, "authority");
        c(z0Var);
        ArrayList arrayList = new ArrayList(k0.a(z0Var) + 7);
        if (z11) {
            arrayList.add(f25690b);
        } else {
            arrayList.add(f25689a);
        }
        if (z10) {
            arrayList.add(f25692d);
        } else {
            arrayList.add(f25691c);
        }
        arrayList.add(new tb.d(tb.d.f27705h, str2));
        arrayList.add(new tb.d(tb.d.f27703f, str));
        arrayList.add(new tb.d(w0.f17194l.d(), str3));
        arrayList.add(f25693e);
        arrayList.add(f25694f);
        return a(arrayList, z0Var);
    }

    private static void c(z0 z0Var) {
        z0Var.e(w0.f17192j);
        z0Var.e(w0.f17193k);
        z0Var.e(w0.f17194l);
    }
}
