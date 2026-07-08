package ia;

import com.google.android.gms.maps.model.LatLng;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LatLng f15960a;

    public g(LatLng latLng) {
        if (latLng == null) {
            throw new IllegalArgumentException("Coordinates cannot be null");
        }
        this.f15960a = latLng;
    }

    @Override // ia.c
    public String a() {
        return "Point";
    }

    public LatLng d() {
        return this.f15960a;
    }

    public String toString() {
        return "Point{\n coordinates=" + this.f15960a + "\n}\n";
    }
}
