package b5;

import com.ekito.simpleKML.model.Coordinate;
import com.ekito.simpleKML.model.Coordinates;
import com.ekito.simpleKML.model.Document;
import com.ekito.simpleKML.model.Feature;
import com.ekito.simpleKML.model.Folder;
import com.ekito.simpleKML.model.Geometry;
import com.ekito.simpleKML.model.Kml;
import com.ekito.simpleKML.model.LineString;
import com.ekito.simpleKML.model.Placemark;
import com.ekito.simpleKML.model.Point;
import com.ekito.simpleKML.model.Track;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static LatLngBounds a(Kml kml) {
        LatLngBounds.a aVar = new LatLngBounds.a();
        b(aVar, kml.getFeature());
        try {
            return aVar.a();
        } catch (IllegalStateException e10) {
            e10.printStackTrace();
            return null;
        }
    }

    private static void b(LatLngBounds.a aVar, Feature feature) {
        Geometry geometry;
        Coordinate coordinates;
        ArrayList<Coordinate> list;
        if (feature == null) {
            return;
        }
        if (feature instanceof Document) {
            c(aVar, ((Document) feature).getFeatureList());
            return;
        }
        if (feature instanceof Folder) {
            c(aVar, ((Folder) feature).getFeatureList());
            return;
        }
        if (!(feature instanceof Placemark) || (geometry = ((Placemark) feature).getGeometry()) == null) {
            return;
        }
        if (geometry instanceof LineString) {
            Coordinates coordinates2 = ((LineString) geometry).getCoordinates();
            if (coordinates2 == null || (list = coordinates2.getList()) == null) {
                return;
            }
            for (Coordinate coordinate : list) {
                aVar.b(new LatLng(coordinate.getLatitude().doubleValue(), coordinate.getLongitude().doubleValue()));
            }
            return;
        }
        if (!(geometry instanceof Track)) {
            if (!(geometry instanceof Point) || (coordinates = ((Point) geometry).getCoordinates()) == null) {
                return;
            }
            aVar.b(new LatLng(coordinates.getLatitude().doubleValue(), coordinates.getLongitude().doubleValue()));
            return;
        }
        List<String> coordList = ((Track) geometry).getCoordList();
        if (coordList == null) {
            return;
        }
        Iterator<String> it = coordList.iterator();
        while (it.hasNext()) {
            Coordinate coordinate2 = new Coordinate(it.next());
            aVar.b(new LatLng(coordinate2.getLatitude().doubleValue(), coordinate2.getLongitude().doubleValue()));
        }
    }

    private static void c(LatLngBounds.a aVar, List list) {
        if (list == null) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            b(aVar, (Feature) it.next());
        }
    }
}
