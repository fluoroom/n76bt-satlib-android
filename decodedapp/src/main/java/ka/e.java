package ka;

import com.google.android.gms.maps.model.LatLngBounds;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f19555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q8.h f19556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LatLngBounds f19558d;

    e(String str, LatLngBounds latLngBounds, float f10, int i10, HashMap map, float f11) {
        q8.h hVar = new q8.h();
        this.f19556b = hVar;
        this.f19557c = str;
        this.f19555a = map;
        if (latLngBounds == null) {
            throw new IllegalArgumentException("No LatLonBox given");
        }
        this.f19558d = latLngBounds;
        hVar.p(latLngBounds);
        hVar.b(f11);
        hVar.r(f10);
        hVar.q(i10 != 0);
    }

    q8.h a() {
        return this.f19556b;
    }

    public String b() {
        return this.f19557c;
    }

    public LatLngBounds c() {
        return this.f19558d;
    }

    public String toString() {
        return "GroundOverlay{\n properties=" + this.f19555a + ",\n image url=" + this.f19557c + ",\n LatLngBox=" + this.f19558d + "\n}\n";
    }
}
