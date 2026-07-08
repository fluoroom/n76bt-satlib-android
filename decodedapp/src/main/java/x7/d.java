package x7;

import android.content.Context;
import t7.a;
import t7.f;
import t8.g;
import t8.h;
import u7.p;
import u7.t;
import v7.t;
import v7.v;
import v7.w;

/* JADX INFO: loaded from: classes.dex */
public final class d extends f implements v {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a.g f31837k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final a.AbstractC0384a f31838l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final t7.a f31839m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f31840n = 0;

    static {
        a.g gVar = new a.g();
        f31837k = gVar;
        c cVar = new c();
        f31838l = cVar;
        f31839m = new t7.a("ClientTelemetry.API", cVar, gVar);
    }

    public d(Context context, w wVar) {
        super(context, f31839m, wVar, f.a.f27596c);
    }

    @Override // v7.v
    public final g b(final t tVar) {
        t.a aVarA = u7.t.a();
        aVarA.d(h8.d.f15174a);
        aVarA.c(false);
        aVarA.b(new p() { // from class: x7.b
            @Override // u7.p
            public final void accept(Object obj, Object obj2) {
                int i10 = d.f31840n;
                ((a) ((e) obj).C()).v1(tVar);
                ((h) obj2).c(null);
            }
        });
        return h(aVarA.a());
    }
}
