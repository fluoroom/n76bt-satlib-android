package m9;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f21926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f21927b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int[][] f21928c = new int[10][];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    d[] f21929d = new d[10];

    private void a(int[] iArr, d dVar) {
        int i10 = this.f21926a;
        if (i10 == 0 || iArr.length == 0) {
            this.f21927b = dVar;
        }
        if (i10 >= this.f21928c.length) {
            f(i10, i10 + 10);
        }
        int[][] iArr2 = this.f21928c;
        int i11 = this.f21926a;
        iArr2[i11] = iArr;
        this.f21929d[i11] = dVar;
        this.f21926a = i11 + 1;
    }

    public static p b(Context context, TypedArray typedArray, int i10, d dVar) {
        int next;
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId == 0) {
            return c(l.m(typedArray, i10, dVar));
        }
        if (!context.getResources().getResourceTypeName(resourceId).equals("xml")) {
            return c(l.m(typedArray, i10, dVar));
        }
        try {
            XmlResourceParser xml = context.getResources().getXml(resourceId);
            try {
                p pVar = new p();
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (xml.getName().equals("selector")) {
                    pVar.i(context, xml, attributeSetAsAttributeSet, context.getTheme());
                }
                xml.close();
                return pVar;
            } catch (Throwable th2) {
                if (xml != null) {
                    try {
                        xml.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (Resources.NotFoundException | IOException | XmlPullParserException unused) {
            return c(dVar);
        }
    }

    public static p c(d dVar) {
        p pVar = new p();
        pVar.a(StateSet.WILD_CARD, dVar);
        return pVar;
    }

    private void f(int i10, int i11) {
        int[][] iArr = new int[i11][];
        System.arraycopy(this.f21928c, 0, iArr, 0, i10);
        this.f21928c = iArr;
        d[] dVarArr = new d[i11];
        System.arraycopy(this.f21929d, 0, dVarArr, 0, i10);
        this.f21929d = dVarArr;
    }

    private int g(int[] iArr) {
        int[][] iArr2 = this.f21928c;
        for (int i10 = 0; i10 < this.f21926a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    private void i(Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, u8.l.f28839j5) : theme.obtainStyledAttributes(attributeSet, u8.l.f28839j5, 0, 0);
                d dVarM = l.m(typedArrayObtainAttributes, u8.l.f28893p5, new a(0.0f));
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != u8.b.f28553i) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                a(StateSet.trimStateSet(iArr, i10), dVarM);
            }
        }
    }

    public d d(int[] iArr) {
        int iG = g(iArr);
        if (iG < 0) {
            iG = g(StateSet.WILD_CARD);
        }
        return iG < 0 ? this.f21927b : this.f21929d[iG];
    }

    public d e() {
        return this.f21927b;
    }

    public boolean h() {
        return this.f21926a > 1;
    }
}
