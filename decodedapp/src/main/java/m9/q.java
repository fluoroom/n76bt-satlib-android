package m9;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.Xml;
import j$.util.Objects;
import java.io.IOException;
import m9.l;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f21930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final l f21931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[][] f21932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final l[] f21933d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final p f21934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final p f21935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final p f21936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final p f21937h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f21938a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private l f21939b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[][] f21940c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private l[] f21941d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private p f21942e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private p f21943f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private p f21944g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private p f21945h;

        private boolean k(int i10, int i11) {
            return (i11 | i10) == i10;
        }

        private void l(int i10, int i11) {
            int[][] iArr = new int[i11][];
            System.arraycopy(this.f21940c, 0, iArr, 0, i10);
            this.f21940c = iArr;
            l[] lVarArr = new l[i11];
            System.arraycopy(this.f21941d, 0, lVarArr, 0, i10);
            this.f21941d = lVarArr;
        }

        private void m() {
            this.f21939b = new l();
            this.f21940c = new int[10][];
            this.f21941d = new l[10];
        }

        public b i(int[] iArr, l lVar) {
            int i10 = this.f21938a;
            if (i10 == 0 || iArr.length == 0) {
                this.f21939b = lVar;
            }
            if (i10 >= this.f21940c.length) {
                l(i10, i10 + 10);
            }
            int[][] iArr2 = this.f21940c;
            int i11 = this.f21938a;
            iArr2[i11] = iArr;
            this.f21941d[i11] = lVar;
            this.f21938a = i11 + 1;
            return this;
        }

        public q j() {
            if (this.f21938a == 0) {
                return null;
            }
            return new q(this);
        }

        public b n(p pVar, int i10) {
            if (k(i10, 1)) {
                this.f21942e = pVar;
            }
            if (k(i10, 2)) {
                this.f21943f = pVar;
            }
            if (k(i10, 4)) {
                this.f21944g = pVar;
            }
            if (k(i10, 8)) {
                this.f21945h = pVar;
            }
            return this;
        }

        public b(q qVar) {
            int i10 = qVar.f21930a;
            this.f21938a = i10;
            this.f21939b = qVar.f21931b;
            int[][] iArr = qVar.f21932c;
            int[][] iArr2 = new int[iArr.length][];
            this.f21940c = iArr2;
            this.f21941d = new l[qVar.f21933d.length];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(qVar.f21933d, 0, this.f21941d, 0, this.f21938a);
            this.f21942e = qVar.f21934e;
            this.f21943f = qVar.f21935f;
            this.f21944g = qVar.f21936g;
            this.f21945h = qVar.f21937h;
        }

        public b(l lVar) {
            m();
            i(StateSet.WILD_CARD, lVar);
        }

        private b(Context context, int i10) {
            int next;
            m();
            try {
                XmlResourceParser xml = context.getResources().getXml(i10);
                try {
                    AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
                    do {
                        next = xml.next();
                        if (next == 2) {
                            break;
                        }
                    } while (next != 1);
                    if (next == 2) {
                        if (xml.getName().equals("selector")) {
                            q.g(this, context, xml, attributeSetAsAttributeSet, context.getTheme());
                        }
                        xml.close();
                        return;
                    }
                    throw new XmlPullParserException("No start tag found");
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
                m();
            }
        }
    }

    public static q b(Context context, TypedArray typedArray, int i10) {
        int resourceId = typedArray.getResourceId(i10, 0);
        if (resourceId != 0 && Objects.equals(context.getResources().getResourceTypeName(resourceId), "xml")) {
            return new b(context, resourceId).j();
        }
        return null;
    }

    private int e(int[] iArr) {
        int[][] iArr2 = this.f21932c;
        for (int i10 = 0; i10 < this.f21930a; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(b bVar, Context context, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
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
                TypedArray typedArrayObtainAttributes = theme == null ? context.getResources().obtainAttributes(attributeSet, u8.l.P3) : theme.obtainStyledAttributes(attributeSet, u8.l.P3, 0, 0);
                l lVarM = l.b(context, typedArrayObtainAttributes.getResourceId(u8.l.Q3, 0), typedArrayObtainAttributes.getResourceId(u8.l.R3, 0)).m();
                typedArrayObtainAttributes.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != u8.b.M && attributeNameResource != u8.b.N) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                bVar.i(StateSet.trimStateSet(iArr, i10), lVarM);
            }
        }
    }

    public static int h(int i10) {
        int i11 = i10 & 5;
        return ((i10 & 10) >> 1) | (i11 << 1);
    }

    public l c(boolean z10) {
        if (!z10 || (this.f21934e == null && this.f21935f == null && this.f21936g == null && this.f21937h == null)) {
            return this.f21931b;
        }
        l.b bVarW = this.f21931b.w();
        p pVar = this.f21934e;
        if (pVar != null) {
            bVarW.D(pVar.e());
        }
        p pVar2 = this.f21935f;
        if (pVar2 != null) {
            bVarW.H(pVar2.e());
        }
        p pVar3 = this.f21936g;
        if (pVar3 != null) {
            bVarW.v(pVar3.e());
        }
        p pVar4 = this.f21937h;
        if (pVar4 != null) {
            bVarW.z(pVar4.e());
        }
        return bVarW.m();
    }

    protected l d(int[] iArr) {
        int iE = e(iArr);
        if (iE < 0) {
            iE = e(StateSet.WILD_CARD);
        }
        if (this.f21934e == null && this.f21935f == null && this.f21936g == null && this.f21937h == null) {
            return this.f21933d[iE];
        }
        l.b bVarW = this.f21933d[iE].w();
        p pVar = this.f21934e;
        if (pVar != null) {
            bVarW.D(pVar.d(iArr));
        }
        p pVar2 = this.f21935f;
        if (pVar2 != null) {
            bVarW.H(pVar2.d(iArr));
        }
        p pVar3 = this.f21936g;
        if (pVar3 != null) {
            bVarW.v(pVar3.d(iArr));
        }
        p pVar4 = this.f21937h;
        if (pVar4 != null) {
            bVarW.z(pVar4.d(iArr));
        }
        return bVarW.m();
    }

    public boolean f() {
        p pVar;
        p pVar2;
        p pVar3;
        p pVar4;
        return this.f21930a > 1 || ((pVar = this.f21934e) != null && pVar.h()) || (((pVar2 = this.f21935f) != null && pVar2.h()) || (((pVar3 = this.f21936g) != null && pVar3.h()) || ((pVar4 = this.f21937h) != null && pVar4.h())));
    }

    public b i() {
        return new b(this);
    }

    private q(b bVar) {
        this.f21930a = bVar.f21938a;
        this.f21931b = bVar.f21939b;
        this.f21932c = bVar.f21940c;
        this.f21933d = bVar.f21941d;
        this.f21934e = bVar.f21942e;
        this.f21935f = bVar.f21943f;
        this.f21936g = bVar.f21944g;
        this.f21937h = bVar.f21945h;
    }
}
