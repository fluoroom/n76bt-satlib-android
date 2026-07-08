package ka;

import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
abstract class p {
    private static void a(XmlPullParser xmlPullParser, o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("BalloonStyle")) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("text")) {
                oVar.G(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void b(XmlPullParser xmlPullParser, o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("IconStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("heading")) {
                    oVar.B(Float.parseFloat(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("Icon")) {
                    h(xmlPullParser, oVar);
                } else if (xmlPullParser.getName().equals("hotSpot")) {
                    g(xmlPullParser, oVar);
                } else if (xmlPullParser.getName().equals("scale")) {
                    oVar.E(Double.parseDouble(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("color")) {
                    oVar.I(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("colorMode")) {
                    oVar.D(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void c(XmlPullParser xmlPullParser, o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("LineStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("color")) {
                    oVar.K(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("width")) {
                    oVar.N(Float.valueOf(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("colorMode")) {
                    oVar.H(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void d(XmlPullParser xmlPullParser, o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("PolyStyle")) {
                return;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("color")) {
                    oVar.A(xmlPullParser.nextText());
                } else if (xmlPullParser.getName().equals("outline")) {
                    oVar.J(a.a(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("fill")) {
                    oVar.z(a.a(xmlPullParser.nextText()));
                } else if (xmlPullParser.getName().equals("colorMode")) {
                    oVar.L(xmlPullParser.nextText());
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    static o e(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        o oVar = new o();
        i(xmlPullParser.getAttributeValue(null, Name.MARK), oVar);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Style")) {
                return oVar;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("IconStyle")) {
                    b(xmlPullParser, oVar);
                } else if (xmlPullParser.getName().equals("LineStyle")) {
                    c(xmlPullParser, oVar);
                } else if (xmlPullParser.getName().equals("PolyStyle")) {
                    d(xmlPullParser, oVar);
                } else if (xmlPullParser.getName().equals("BalloonStyle")) {
                    a(xmlPullParser, oVar);
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    static HashMap f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        HashMap map = new HashMap();
        String str = "#" + xmlPullParser.getAttributeValue(null, Name.MARK);
        int eventType = xmlPullParser.getEventType();
        boolean z10 = false;
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("StyleMap")) {
                return map;
            }
            if (eventType == 2) {
                if (xmlPullParser.getName().equals("key") && xmlPullParser.nextText().equals("normal")) {
                    z10 = true;
                } else if (xmlPullParser.getName().equals("styleUrl") && z10) {
                    map.put(str, xmlPullParser.nextText());
                    z10 = false;
                }
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void g(XmlPullParser xmlPullParser, o oVar) {
        try {
            oVar.C(Float.parseFloat(xmlPullParser.getAttributeValue(null, "x")), Float.parseFloat(xmlPullParser.getAttributeValue(null, "y")), xmlPullParser.getAttributeValue(null, "xunits"), xmlPullParser.getAttributeValue(null, "yunits"));
        } catch (NullPointerException unused) {
            Log.w("KmlStyleParser", "Missing 'x' or 'y' attributes in hotSpot for style with id: " + oVar.r());
        } catch (NumberFormatException unused2) {
            Log.w("KmlStyleParser", "Invalid number in 'x' or 'y' attributes in hotSpot for style with id: " + oVar.r());
        }
    }

    private static void h(XmlPullParser xmlPullParser, o oVar) throws XmlPullParserException, IOException {
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 3 && xmlPullParser.getName().equals("Icon")) {
                return;
            }
            if (eventType == 2 && xmlPullParser.getName().equals("href")) {
                oVar.F(xmlPullParser.nextText());
            }
            eventType = xmlPullParser.next();
        }
    }

    private static void i(String str, o oVar) {
        if (str != null) {
            oVar.M("#" + str);
        }
    }
}
