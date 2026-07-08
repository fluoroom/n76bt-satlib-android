package k8;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.location.LocationRequest;
import t7.a;
import t7.f;

/* JADX INFO: loaded from: classes.dex */
public final class g extends t7.f implements n8.b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final a.g f19496k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final t7.a f19497l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final Object f19498m;

    static {
        a.g gVar = new a.g();
        f19496k = gVar;
        f19497l = new t7.a("LocationServices.API", new d(), gVar);
        f19498m = new Object();
    }

    public g(Context context) {
        super(context, f19497l, a.d.f27572o, f.a.f27596c);
    }

    private final t8.g w(final LocationRequest locationRequest, u7.j jVar) {
        final f fVar = new f(this, jVar, j.f19502a);
        return j(u7.o.a().b(new u7.p() { // from class: k8.h
            @Override // u7.p
            public final /* synthetic */ void accept(Object obj, Object obj2) {
                t7.a aVar = g.f19497l;
                ((x) obj).l0(fVar, locationRequest, (t8.h) obj2);
            }
        }).d(fVar).e(jVar).c(2436).a());
    }

    @Override // n8.b
    public final t8.g a(LocationRequest locationRequest, n8.d dVar, Looper looper) {
        if (looper == null) {
            looper = Looper.myLooper();
            v7.q.j(looper, "invalid null looper");
        }
        return w(locationRequest, u7.k.a(dVar, looper, n8.d.class.getSimpleName()));
    }

    @Override // n8.b
    public final t8.g e(n8.d dVar) {
        return k(u7.k.b(dVar, n8.d.class.getSimpleName()), 2418).e(l.f19506a, i.f19501a);
    }

    @Override // t7.f
    protected final String m(Context context) {
        return null;
    }
}
