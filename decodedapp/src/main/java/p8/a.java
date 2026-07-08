package p8;

import android.os.IInterface;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {
    c8.b B(LatLngBounds latLngBounds, int i10);

    c8.b T0(CameraPosition cameraPosition);

    c8.b Z(LatLng latLng);

    c8.b j1(LatLng latLng, float f10);
}
