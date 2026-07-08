package c0;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import com.facebook.stetho.server.http.HttpStatus;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d[] f4236a;

        public c(d[] dVarArr) {
            this.f4236a = dVarArr;
        }

        public d[] a() {
            return this.f4236a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f4237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f4238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f4239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f4240d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f4241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f4242f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f4237a = str;
            this.f4238b = i10;
            this.f4239c = z10;
            this.f4240d = str2;
            this.f4241e = i11;
            this.f4242f = i12;
        }

        public String a() {
            return this.f4237a;
        }

        public int b() {
            return this.f4242f;
        }

        public int c() {
            return this.f4241e;
        }

        public String d() {
            return this.f4240d;
        }

        public int e() {
            return this.f4238b;
        }

        public boolean f() {
            return this.f4239c;
        }
    }

    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f4243a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f4244b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f4245c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f4246d;

        public e(List list, int i10, int i11, String str) {
            this.f4243a = list;
            this.f4245c = i10;
            this.f4244b = i11;
            this.f4246d = str;
        }

        public int a() {
            return this.f4245c;
        }

        public List b() {
            return this.f4243a;
        }

        public String c() {
            return this.f4246d;
        }

        public int d() {
            return this.f4244b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return e(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(i(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(i(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static j0.f d(XmlPullParser xmlPullParser, Resources resources, String str, String str2, List list) throws Exception {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), z.c.B);
        try {
            String string = typedArrayObtainAttributes.getString(z.c.C);
            String string2 = typedArrayObtainAttributes.getString(z.c.D);
            String string3 = typedArrayObtainAttributes.getString(z.c.E);
            if (string == null) {
                throw new XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                h(xmlPullParser);
            }
            j0.f fVar = new j0.f(str, str2, string, list, string2, string3);
            c0.e.a(typedArrayObtainAttributes);
            return fVar;
        } catch (Throwable th2) {
            if (typedArrayObtainAttributes == null) {
                throw th2;
            }
            try {
                c0.e.a(typedArrayObtainAttributes);
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return f(xmlPullParser, resources);
        }
        h(xmlPullParser);
        return null;
    }

    private static b f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), z.c.f32815h);
        String string = typedArrayObtainAttributes.getString(z.c.f32816i);
        String string2 = typedArrayObtainAttributes.getString(z.c.f32821n);
        String string3 = typedArrayObtainAttributes.getString(z.c.f32822o);
        String string4 = typedArrayObtainAttributes.getString(z.c.f32818k);
        int resourceId = typedArrayObtainAttributes.getResourceId(z.c.f32817j, 0);
        int integer = typedArrayObtainAttributes.getInteger(z.c.f32819l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(z.c.f32820m, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        String string5 = typedArrayObtainAttributes.getString(z.c.f32823p);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(g(xmlPullParser, resources));
                    } else {
                        h(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        List listC = c(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("fallback")) {
                    arrayList2.add(d(xmlPullParser, resources, string, string2, listC));
                } else {
                    h(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return new e(arrayList2, integer, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new j0.f(string, string2, string3, listC, null, null));
        if (string4 != null) {
            arrayList2.add(new j0.f(string, string2, string4, listC, null, null));
        }
        return new e(arrayList2, integer, integer2, string5);
    }

    private static d g(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), z.c.f32824q);
        int i10 = z.c.f32833z;
        if (!typedArrayObtainAttributes.hasValue(i10)) {
            i10 = z.c.f32826s;
        }
        int i11 = typedArrayObtainAttributes.getInt(i10, 400);
        int i12 = z.c.f32831x;
        if (!typedArrayObtainAttributes.hasValue(i12)) {
            i12 = z.c.f32827t;
        }
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(i12, 0);
        int i13 = z.c.A;
        if (!typedArrayObtainAttributes.hasValue(i13)) {
            i13 = z.c.f32828u;
        }
        int i14 = z.c.f32832y;
        if (!typedArrayObtainAttributes.hasValue(i14)) {
            i14 = z.c.f32829v;
        }
        String string = typedArrayObtainAttributes.getString(i14);
        int i15 = typedArrayObtainAttributes.getInt(i13, 0);
        int i16 = z.c.f32830w;
        if (!typedArrayObtainAttributes.hasValue(i16)) {
            i16 = z.c.f32825r;
        }
        int resourceId = typedArrayObtainAttributes.getResourceId(i16, 0);
        String string2 = typedArrayObtainAttributes.getString(i16);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            h(xmlPullParser);
        }
        return new d(string2, i11, z10, string, i15, resourceId);
    }

    private static void h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
