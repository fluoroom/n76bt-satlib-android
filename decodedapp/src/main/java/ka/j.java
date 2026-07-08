package ka;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final XmlPullParser f19560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f19561b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f19562c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap f19563d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap f19564e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap f19565f = new HashMap();

    j(XmlPullParser xmlPullParser) {
        this.f19560a = xmlPullParser;
    }

    static void g(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getEventType() != 2) {
            throw new IllegalStateException();
        }
        int i10 = 1;
        while (i10 != 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    ArrayList a() {
        return this.f19562c;
    }

    HashMap b() {
        return this.f19565f;
    }

    HashMap c() {
        return this.f19561b;
    }

    HashMap d() {
        return this.f19564e;
    }

    HashMap e() {
        return this.f19563d;
    }

    void f() throws XmlPullParserException, IOException {
        int eventType = this.f19560a.getEventType();
        while (eventType != 1) {
            if (eventType == 2) {
                if (this.f19560a.getName().matches("altitude|altitudeModeGroup|altitudeMode|begin|bottomFov|cookie|displayName|displayMode|end|expires|extrude|flyToView|gridOrigin|httpQuery|leftFov|linkDescription|linkName|linkSnippet|listItemType|maxSnippetLines|maxSessionLength|message|minAltitude|minFadeExtent|minLodPixels|minRefreshPeriod|maxAltitude|maxFadeExtent|maxLodPixels|maxHeight|maxWidth|near|NetworkLink|NetworkLinkControl|overlayXY|range|refreshMode|refreshInterval|refreshVisibility|rightFov|roll|rotationXY|screenXY|shape|sourceHref|state|targetHref|tessellate|tileSize|topFov|viewBoundScale|viewFormat|viewRefreshMode|viewRefreshTime|when")) {
                    g(this.f19560a);
                }
                if (this.f19560a.getName().matches("Folder|Document")) {
                    this.f19562c.add(c.b(this.f19560a));
                }
                if (this.f19560a.getName().equals("Style")) {
                    o oVarE = p.e(this.f19560a);
                    this.f19563d.put(oVarE.r(), oVarE);
                }
                if (this.f19560a.getName().equals("StyleMap")) {
                    this.f19564e.putAll(p.f(this.f19560a));
                }
                if (this.f19560a.getName().equals("Placemark")) {
                    this.f19561b.put(d.k(this.f19560a), null);
                }
                if (this.f19560a.getName().equals("GroundOverlay")) {
                    this.f19565f.put(d.f(this.f19560a), null);
                }
            }
            eventType = this.f19560a.next();
        }
        this.f19563d.put(null, new o());
    }
}
