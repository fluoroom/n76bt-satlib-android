package fa;

import com.google.android.gms.maps.model.LatLng;
import java.util.Collection;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes3.dex */
public class h implements ea.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LatLng f12912a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Collection f12913b = new LinkedHashSet();

    public h(LatLng latLng) {
        this.f12912a = latLng;
    }

    @Override // ea.a
    public int a() {
        return this.f12913b.size();
    }

    public boolean b(ea.b bVar) {
        return this.f12913b.add(bVar);
    }

    @Override // ea.a
    public Collection c() {
        return this.f12913b;
    }

    public boolean d(ea.b bVar) {
        return this.f12913b.remove(bVar);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return hVar.f12912a.equals(this.f12912a) && hVar.f12913b.equals(this.f12913b);
    }

    @Override // ea.a
    public LatLng getPosition() {
        return this.f12912a;
    }

    public int hashCode() {
        return this.f12912a.hashCode() + this.f12913b.hashCode();
    }

    public String toString() {
        return "StaticCluster{mCenter=" + this.f12912a + ", mItems.size=" + this.f12913b.size() + '}';
    }
}
