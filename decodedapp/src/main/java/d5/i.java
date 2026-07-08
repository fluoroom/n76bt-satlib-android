package d5;

import a6.q;
import android.content.Context;
import android.database.Cursor;
import android.location.Location;
import com.dw.ht.Cfg;
import com.dw.ht.provider.a;
import com.google.android.gms.maps.model.LatLng;
import d5.g;

/* JADX INFO: loaded from: classes.dex */
public class i extends g4.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String[] f10658v = {"latitude", "longitude", "date", "bss_user_id", "symbol"};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final g.b f10659r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final z4.m f10660s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private g4.f f10661t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f10662u;

    public i(Context context, String str, long j10) {
        super(context);
        this.f10659r = new g.b();
        this.f10662u = -1L;
        this.f10660s = z4.m.c(context);
        N(a.d.f6668a);
        Q(str, j10);
    }

    @Override // g1.a
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public h H() {
        g4.f fVar = this.f10661t;
        if (fVar == null) {
            return null;
        }
        Cursor cursorQuery = i().getContentResolver().query(a.d.f6668a, f10658v, fVar.n(), fVar.k(), "date");
        if (cursorQuery != null) {
            try {
                if (cursorQuery.getCount() != 0) {
                    h hVar = new h();
                    cursorQuery.moveToPosition(-1);
                    double d10 = 0.0d;
                    double d11 = 0.0d;
                    while (cursorQuery.moveToNext()) {
                        d10 = cursorQuery.getDouble(0);
                        d11 = cursorQuery.getDouble(1);
                        hVar.a(this.f10660s.a(new LatLng(d10, d11)));
                    }
                    if (cursorQuery.move(-1)) {
                        hVar.x(cursorQuery.getString(4));
                        hVar.G(cursorQuery.getLong(3));
                    }
                    Location location = new Location("gps");
                    location.setLongitude(d11);
                    location.setLatitude(d10);
                    hVar.w(location);
                    cursorQuery.close();
                    return hVar;
                }
            } finally {
            }
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    public void Q(String str, long j10) {
        if (q.d(str, this.f10659r.f10641a) && j10 == this.f10659r.f10647g) {
            return;
        }
        g.b bVar = this.f10659r;
        bVar.f10647g = j10;
        bVar.f10641a = str;
        S();
    }

    public void R(long j10) {
        if (j10 == this.f10662u) {
            return;
        }
        this.f10662u = j10;
        S();
    }

    public void S() {
        g4.f fVarA = this.f10659r.a();
        fVarA.h(new g4.f("latitude IS NOT NULL AND longitude IS NOT NULL"));
        long jQ = this.f10662u;
        if (jQ < 0) {
            jQ = Cfg.Q();
        }
        if (jQ > 0) {
            fVarA.h(new g4.f("date>" + (System.currentTimeMillis() - jQ)));
        }
        this.f10661t = fVarA;
        p();
    }
}
