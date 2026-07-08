package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Log;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a */
    private final ConstraintLayout f1516a;

    /* JADX INFO: renamed from: b */
    int f1517b = -1;

    /* JADX INFO: renamed from: c */
    int f1518c = -1;

    /* JADX INFO: renamed from: d */
    private SparseArray f1519d = new SparseArray();

    /* JADX INFO: renamed from: e */
    private SparseArray f1520e = new SparseArray();

    static class a {

        /* JADX INFO: renamed from: a */
        int f1521a;

        /* JADX INFO: renamed from: b */
        ArrayList f1522b = new ArrayList();

        /* JADX INFO: renamed from: c */
        int f1523c;

        /* JADX INFO: renamed from: d */
        d f1524d;

        a(Context context, XmlPullParser xmlPullParser) {
            this.f1523c = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.B6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.C6) {
                    this.f1521a = typedArrayObtainStyledAttributes.getResourceId(index, this.f1521a);
                } else if (index == g.D6) {
                    this.f1523c = typedArrayObtainStyledAttributes.getResourceId(index, this.f1523c);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1523c);
                    context.getResources().getResourceName(this.f1523c);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1524d = dVar;
                        dVar.e(context, this.f1523c);
                    }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        void a(b bVar) {
            this.f1522b.add(bVar);
        }
    }

    static class b {

        /* JADX INFO: renamed from: a */
        float f1525a;

        /* JADX INFO: renamed from: b */
        float f1526b;

        /* JADX INFO: renamed from: c */
        float f1527c;

        /* JADX INFO: renamed from: d */
        float f1528d;

        /* JADX INFO: renamed from: e */
        int f1529e;

        /* JADX INFO: renamed from: f */
        d f1530f;

        b(Context context, XmlPullParser xmlPullParser) {
            this.f1525a = Float.NaN;
            this.f1526b = Float.NaN;
            this.f1527c = Float.NaN;
            this.f1528d = Float.NaN;
            this.f1529e = -1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), g.U6);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.V6) {
                    this.f1529e = typedArrayObtainStyledAttributes.getResourceId(index, this.f1529e);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.f1529e);
                    context.getResources().getResourceName(this.f1529e);
                    if ("layout".equals(resourceTypeName)) {
                        d dVar = new d();
                        this.f1530f = dVar;
                        dVar.e(context, this.f1529e);
                    }
                } else if (index == g.W6) {
                    this.f1528d = typedArrayObtainStyledAttributes.getDimension(index, this.f1528d);
                } else if (index == g.X6) {
                    this.f1526b = typedArrayObtainStyledAttributes.getDimension(index, this.f1526b);
                } else if (index == g.Y6) {
                    this.f1527c = typedArrayObtainStyledAttributes.getDimension(index, this.f1527c);
                } else if (index == g.Z6) {
                    this.f1525a = typedArrayObtainStyledAttributes.getDimension(index, this.f1525a);
                } else {
                    Log.v("ConstraintLayoutStates", "Unknown tag");
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    c(Context context, ConstraintLayout constraintLayout, int i10) {
        this.f1516a = constraintLayout;
        a(context, i10);
    }

    private void a(Context context, int i10) {
        String str;
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            a aVar = null;
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                b(context, xml);
                            }
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                a aVar2 = new a(context, xml);
                                this.f1519d.put(aVar2.f1521a, aVar2);
                                aVar = aVar2;
                            }
                            break;
                        case 1382829617:
                            str = "StateSet";
                            name.equals(str);
                            break;
                        case 1657696882:
                            str = "layoutDescription";
                            name.equals(str);
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                b bVar = new b(context, xml);
                                if (aVar != null) {
                                    aVar.a(bVar);
                                }
                            }
                            break;
                    }
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintLayoutStates", "Error parsing resource: " + i10, e11);
        }
    }

    private void b(Context context, XmlPullParser xmlPullParser) {
        d dVar = new d();
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            String attributeName = xmlPullParser.getAttributeName(i10);
            String attributeValue = xmlPullParser.getAttributeValue(i10);
            if (attributeName != null && attributeValue != null && Name.MARK.equals(attributeName)) {
                int identifier = attributeValue.contains("/") ? context.getResources().getIdentifier(attributeValue.substring(attributeValue.indexOf(47) + 1), Name.MARK, context.getPackageName()) : -1;
                if (identifier == -1) {
                    if (attributeValue.length() > 1) {
                        identifier = Integer.parseInt(attributeValue.substring(1));
                    } else {
                        Log.e("ConstraintLayoutStates", "error in parsing id");
                    }
                }
                dVar.l(context, xmlPullParser);
                this.f1520e.put(identifier, dVar);
                return;
            }
        }
    }

    public void c(e eVar) {
    }
}
