package d5;

import android.location.Location;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f10651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f10652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Location f10653c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f10654d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Float f10655e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final LatLngBounds.a f10656f = new LatLngBounds.a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f10657g = new ArrayList();

    public final void G(long j10) {
        this.f10651a = j10;
    }

    public final void H(Float f10) {
        this.f10655e = f10;
    }

    public final void a(LatLng latLng) {
        rd.m.e(latLng, "loc");
        this.f10657g.add(latLng);
        this.f10656f.b(latLng);
    }

    public final void c(List list) {
        rd.m.e(list, "locs");
        this.f10657g.addAll(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.f10656f.b((LatLng) it.next());
        }
    }

    public final LatLngBounds.a e() {
        return this.f10656f;
    }

    public final Integer k() {
        return this.f10654d;
    }

    public final Location l() {
        return this.f10653c;
    }

    public final ArrayList n() {
        return this.f10657g;
    }

    public final String q() {
        return this.f10652b;
    }

    public final long r() {
        return this.f10651a;
    }

    public final Float s() {
        return this.f10655e;
    }

    public final void v(Integer num) {
        this.f10654d = num;
    }

    public final void w(Location location) {
        this.f10653c = location;
    }

    public final void x(String str) {
        this.f10652b = str;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
