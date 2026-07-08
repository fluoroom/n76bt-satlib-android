package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.simpleframework.xml.strategy.Name;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: g */
    private static final int[] f1531g = {0, 4, 8};

    /* JADX INFO: renamed from: h */
    private static SparseIntArray f1532h = new SparseIntArray();

    /* JADX INFO: renamed from: i */
    private static SparseIntArray f1533i = new SparseIntArray();

    /* JADX INFO: renamed from: a */
    public String f1534a = "";

    /* JADX INFO: renamed from: b */
    private String[] f1535b = new String[0];

    /* JADX INFO: renamed from: c */
    public int f1536c = 0;

    /* JADX INFO: renamed from: d */
    private HashMap f1537d = new HashMap();

    /* JADX INFO: renamed from: e */
    private boolean f1538e = true;

    /* JADX INFO: renamed from: f */
    private HashMap f1539f = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a */
        int f1540a;

        /* JADX INFO: renamed from: b */
        String f1541b;

        /* JADX INFO: renamed from: c */
        public final C0025d f1542c = new C0025d();

        /* JADX INFO: renamed from: d */
        public final c f1543d = new c();

        /* JADX INFO: renamed from: e */
        public final b f1544e = new b();

        /* JADX INFO: renamed from: f */
        public final e f1545f = new e();

        /* JADX INFO: renamed from: g */
        public HashMap f1546g = new HashMap();

        /* JADX INFO: renamed from: h */
        C0024a f1547h;

        /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$a$a */
        static class C0024a {

            /* JADX INFO: renamed from: a */
            int[] f1548a = new int[10];

            /* JADX INFO: renamed from: b */
            int[] f1549b = new int[10];

            /* JADX INFO: renamed from: c */
            int f1550c = 0;

            /* JADX INFO: renamed from: d */
            int[] f1551d = new int[10];

            /* JADX INFO: renamed from: e */
            float[] f1552e = new float[10];

            /* JADX INFO: renamed from: f */
            int f1553f = 0;

            /* JADX INFO: renamed from: g */
            int[] f1554g = new int[5];

            /* JADX INFO: renamed from: h */
            String[] f1555h = new String[5];

            /* JADX INFO: renamed from: i */
            int f1556i = 0;

            /* JADX INFO: renamed from: j */
            int[] f1557j = new int[4];

            /* JADX INFO: renamed from: k */
            boolean[] f1558k = new boolean[4];

            /* JADX INFO: renamed from: l */
            int f1559l = 0;

            C0024a() {
            }

            void a(int i10, float f10) {
                int i11 = this.f1553f;
                int[] iArr = this.f1551d;
                if (i11 >= iArr.length) {
                    this.f1551d = Arrays.copyOf(iArr, iArr.length * 2);
                    float[] fArr = this.f1552e;
                    this.f1552e = Arrays.copyOf(fArr, fArr.length * 2);
                }
                int[] iArr2 = this.f1551d;
                int i12 = this.f1553f;
                iArr2[i12] = i10;
                float[] fArr2 = this.f1552e;
                this.f1553f = i12 + 1;
                fArr2[i12] = f10;
            }

            void b(int i10, int i11) {
                int i12 = this.f1550c;
                int[] iArr = this.f1548a;
                if (i12 >= iArr.length) {
                    this.f1548a = Arrays.copyOf(iArr, iArr.length * 2);
                    int[] iArr2 = this.f1549b;
                    this.f1549b = Arrays.copyOf(iArr2, iArr2.length * 2);
                }
                int[] iArr3 = this.f1548a;
                int i13 = this.f1550c;
                iArr3[i13] = i10;
                int[] iArr4 = this.f1549b;
                this.f1550c = i13 + 1;
                iArr4[i13] = i11;
            }

            void c(int i10, String str) {
                int i11 = this.f1556i;
                int[] iArr = this.f1554g;
                if (i11 >= iArr.length) {
                    this.f1554g = Arrays.copyOf(iArr, iArr.length * 2);
                    String[] strArr = this.f1555h;
                    this.f1555h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
                }
                int[] iArr2 = this.f1554g;
                int i12 = this.f1556i;
                iArr2[i12] = i10;
                String[] strArr2 = this.f1555h;
                this.f1556i = i12 + 1;
                strArr2[i12] = str;
            }

            void d(int i10, boolean z10) {
                int i11 = this.f1559l;
                int[] iArr = this.f1557j;
                if (i11 >= iArr.length) {
                    this.f1557j = Arrays.copyOf(iArr, iArr.length * 2);
                    boolean[] zArr = this.f1558k;
                    this.f1558k = Arrays.copyOf(zArr, zArr.length * 2);
                }
                int[] iArr2 = this.f1557j;
                int i12 = this.f1559l;
                iArr2[i12] = i10;
                boolean[] zArr2 = this.f1558k;
                this.f1559l = i12 + 1;
                zArr2[i12] = z10;
            }
        }

        public void d(int i10, ConstraintLayout.b bVar) {
            this.f1540a = i10;
            b bVar2 = this.f1544e;
            bVar2.f1579j = bVar.f1439e;
            bVar2.f1581k = bVar.f1441f;
            bVar2.f1583l = bVar.f1443g;
            bVar2.f1585m = bVar.f1445h;
            bVar2.f1587n = bVar.f1447i;
            bVar2.f1589o = bVar.f1449j;
            bVar2.f1591p = bVar.f1451k;
            bVar2.f1593q = bVar.f1453l;
            bVar2.f1595r = bVar.f1455m;
            bVar2.f1596s = bVar.f1457n;
            bVar2.f1597t = bVar.f1459o;
            bVar2.f1598u = bVar.f1467s;
            bVar2.f1599v = bVar.f1469t;
            bVar2.f1600w = bVar.f1471u;
            bVar2.f1601x = bVar.f1473v;
            bVar2.f1602y = bVar.G;
            bVar2.f1603z = bVar.H;
            bVar2.A = bVar.I;
            bVar2.B = bVar.f1461p;
            bVar2.C = bVar.f1463q;
            bVar2.D = bVar.f1465r;
            bVar2.E = bVar.X;
            bVar2.F = bVar.Y;
            bVar2.G = bVar.Z;
            bVar2.f1575h = bVar.f1435c;
            bVar2.f1571f = bVar.f1431a;
            bVar2.f1573g = bVar.f1433b;
            bVar2.f1567d = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f1569e = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.H = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.I = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.J = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.K = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.N = bVar.D;
            bVar2.V = bVar.M;
            bVar2.W = bVar.L;
            bVar2.Y = bVar.O;
            bVar2.X = bVar.N;
            bVar2.f1588n0 = bVar.f1432a0;
            bVar2.f1590o0 = bVar.f1434b0;
            bVar2.Z = bVar.P;
            bVar2.f1562a0 = bVar.Q;
            bVar2.f1564b0 = bVar.T;
            bVar2.f1566c0 = bVar.U;
            bVar2.f1568d0 = bVar.R;
            bVar2.f1570e0 = bVar.S;
            bVar2.f1572f0 = bVar.V;
            bVar2.f1574g0 = bVar.W;
            bVar2.f1586m0 = bVar.f1436c0;
            bVar2.P = bVar.f1477x;
            bVar2.R = bVar.f1479z;
            bVar2.O = bVar.f1475w;
            bVar2.Q = bVar.f1478y;
            bVar2.T = bVar.A;
            bVar2.S = bVar.B;
            bVar2.U = bVar.C;
            bVar2.f1594q0 = bVar.f1438d0;
            bVar2.L = bVar.getMarginEnd();
            this.f1544e.M = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f1544e;
            bVar.f1439e = bVar2.f1579j;
            bVar.f1441f = bVar2.f1581k;
            bVar.f1443g = bVar2.f1583l;
            bVar.f1445h = bVar2.f1585m;
            bVar.f1447i = bVar2.f1587n;
            bVar.f1449j = bVar2.f1589o;
            bVar.f1451k = bVar2.f1591p;
            bVar.f1453l = bVar2.f1593q;
            bVar.f1455m = bVar2.f1595r;
            bVar.f1457n = bVar2.f1596s;
            bVar.f1459o = bVar2.f1597t;
            bVar.f1467s = bVar2.f1598u;
            bVar.f1469t = bVar2.f1599v;
            bVar.f1471u = bVar2.f1600w;
            bVar.f1473v = bVar2.f1601x;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.H;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.I;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.J;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.K;
            bVar.A = bVar2.T;
            bVar.B = bVar2.S;
            bVar.f1477x = bVar2.P;
            bVar.f1479z = bVar2.R;
            bVar.G = bVar2.f1602y;
            bVar.H = bVar2.f1603z;
            bVar.f1461p = bVar2.B;
            bVar.f1463q = bVar2.C;
            bVar.f1465r = bVar2.D;
            bVar.I = bVar2.A;
            bVar.X = bVar2.E;
            bVar.Y = bVar2.F;
            bVar.M = bVar2.V;
            bVar.L = bVar2.W;
            bVar.O = bVar2.Y;
            bVar.N = bVar2.X;
            bVar.f1432a0 = bVar2.f1588n0;
            bVar.f1434b0 = bVar2.f1590o0;
            bVar.P = bVar2.Z;
            bVar.Q = bVar2.f1562a0;
            bVar.T = bVar2.f1564b0;
            bVar.U = bVar2.f1566c0;
            bVar.R = bVar2.f1568d0;
            bVar.S = bVar2.f1570e0;
            bVar.V = bVar2.f1572f0;
            bVar.W = bVar2.f1574g0;
            bVar.Z = bVar2.G;
            bVar.f1435c = bVar2.f1575h;
            bVar.f1431a = bVar2.f1571f;
            bVar.f1433b = bVar2.f1573g;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f1567d;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f1569e;
            String str = bVar2.f1586m0;
            if (str != null) {
                bVar.f1436c0 = str;
            }
            bVar.f1438d0 = bVar2.f1594q0;
            bVar.setMarginStart(bVar2.M);
            bVar.setMarginEnd(this.f1544e.L);
            bVar.a();
        }

        /* JADX INFO: renamed from: c */
        public a clone() {
            a aVar = new a();
            aVar.f1544e.a(this.f1544e);
            aVar.f1543d.a(this.f1543d);
            aVar.f1542c.a(this.f1542c);
            aVar.f1545f.a(this.f1545f);
            aVar.f1540a = this.f1540a;
            aVar.f1547h = this.f1547h;
            return aVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: r0 */
        private static SparseIntArray f1560r0;

        /* JADX INFO: renamed from: d */
        public int f1567d;

        /* JADX INFO: renamed from: e */
        public int f1569e;

        /* JADX INFO: renamed from: k0 */
        public int[] f1582k0;

        /* JADX INFO: renamed from: l0 */
        public String f1584l0;

        /* JADX INFO: renamed from: m0 */
        public String f1586m0;

        /* JADX INFO: renamed from: a */
        public boolean f1561a = false;

        /* JADX INFO: renamed from: b */
        public boolean f1563b = false;

        /* JADX INFO: renamed from: c */
        public boolean f1565c = false;

        /* JADX INFO: renamed from: f */
        public int f1571f = -1;

        /* JADX INFO: renamed from: g */
        public int f1573g = -1;

        /* JADX INFO: renamed from: h */
        public float f1575h = -1.0f;

        /* JADX INFO: renamed from: i */
        public boolean f1577i = true;

        /* JADX INFO: renamed from: j */
        public int f1579j = -1;

        /* JADX INFO: renamed from: k */
        public int f1581k = -1;

        /* JADX INFO: renamed from: l */
        public int f1583l = -1;

        /* JADX INFO: renamed from: m */
        public int f1585m = -1;

        /* JADX INFO: renamed from: n */
        public int f1587n = -1;

        /* JADX INFO: renamed from: o */
        public int f1589o = -1;

        /* JADX INFO: renamed from: p */
        public int f1591p = -1;

        /* JADX INFO: renamed from: q */
        public int f1593q = -1;

        /* JADX INFO: renamed from: r */
        public int f1595r = -1;

        /* JADX INFO: renamed from: s */
        public int f1596s = -1;

        /* JADX INFO: renamed from: t */
        public int f1597t = -1;

        /* JADX INFO: renamed from: u */
        public int f1598u = -1;

        /* JADX INFO: renamed from: v */
        public int f1599v = -1;

        /* JADX INFO: renamed from: w */
        public int f1600w = -1;

        /* JADX INFO: renamed from: x */
        public int f1601x = -1;

        /* JADX INFO: renamed from: y */
        public float f1602y = 0.5f;

        /* JADX INFO: renamed from: z */
        public float f1603z = 0.5f;
        public String A = null;
        public int B = -1;
        public int C = 0;
        public float D = 0.0f;
        public int E = -1;
        public int F = -1;
        public int G = -1;
        public int H = 0;
        public int I = 0;
        public int J = 0;
        public int K = 0;
        public int L = 0;
        public int M = 0;
        public int N = 0;
        public int O = RtlSpacingHelper.UNDEFINED;
        public int P = RtlSpacingHelper.UNDEFINED;
        public int Q = RtlSpacingHelper.UNDEFINED;
        public int R = RtlSpacingHelper.UNDEFINED;
        public int S = RtlSpacingHelper.UNDEFINED;
        public int T = RtlSpacingHelper.UNDEFINED;
        public int U = RtlSpacingHelper.UNDEFINED;
        public float V = -1.0f;
        public float W = -1.0f;
        public int X = 0;
        public int Y = 0;
        public int Z = 0;

        /* JADX INFO: renamed from: a0 */
        public int f1562a0 = 0;

        /* JADX INFO: renamed from: b0 */
        public int f1564b0 = 0;

        /* JADX INFO: renamed from: c0 */
        public int f1566c0 = 0;

        /* JADX INFO: renamed from: d0 */
        public int f1568d0 = 0;

        /* JADX INFO: renamed from: e0 */
        public int f1570e0 = 0;

        /* JADX INFO: renamed from: f0 */
        public float f1572f0 = 1.0f;

        /* JADX INFO: renamed from: g0 */
        public float f1574g0 = 1.0f;

        /* JADX INFO: renamed from: h0 */
        public int f1576h0 = -1;

        /* JADX INFO: renamed from: i0 */
        public int f1578i0 = 0;

        /* JADX INFO: renamed from: j0 */
        public int f1580j0 = -1;

        /* JADX INFO: renamed from: n0 */
        public boolean f1588n0 = false;

        /* JADX INFO: renamed from: o0 */
        public boolean f1590o0 = false;

        /* JADX INFO: renamed from: p0 */
        public boolean f1592p0 = true;

        /* JADX INFO: renamed from: q0 */
        public int f1594q0 = 0;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1560r0 = sparseIntArray;
            sparseIntArray.append(g.C5, 24);
            f1560r0.append(g.D5, 25);
            f1560r0.append(g.F5, 28);
            f1560r0.append(g.G5, 29);
            f1560r0.append(g.L5, 35);
            f1560r0.append(g.K5, 34);
            f1560r0.append(g.f1735l5, 4);
            f1560r0.append(g.f1727k5, 3);
            f1560r0.append(g.f1711i5, 1);
            f1560r0.append(g.T5, 6);
            f1560r0.append(g.U5, 7);
            f1560r0.append(g.f1791s5, 17);
            f1560r0.append(g.f1799t5, 18);
            f1560r0.append(g.f1807u5, 19);
            SparseIntArray sparseIntArray2 = f1560r0;
            int i10 = g.f1679e5;
            sparseIntArray2.append(i10, 90);
            f1560r0.append(g.Q4, 26);
            f1560r0.append(g.H5, 31);
            f1560r0.append(g.I5, 32);
            f1560r0.append(g.f1783r5, 10);
            f1560r0.append(g.f1775q5, 9);
            f1560r0.append(g.X5, 13);
            f1560r0.append(g.f1646a6, 16);
            f1560r0.append(g.Y5, 14);
            f1560r0.append(g.V5, 11);
            f1560r0.append(g.Z5, 15);
            f1560r0.append(g.W5, 12);
            f1560r0.append(g.O5, 38);
            f1560r0.append(g.A5, 37);
            f1560r0.append(g.f1847z5, 39);
            f1560r0.append(g.N5, 40);
            f1560r0.append(g.f1839y5, 20);
            f1560r0.append(g.M5, 36);
            f1560r0.append(g.f1767p5, 5);
            f1560r0.append(g.B5, 91);
            f1560r0.append(g.J5, 91);
            f1560r0.append(g.E5, 91);
            f1560r0.append(g.f1719j5, 91);
            f1560r0.append(g.f1703h5, 91);
            f1560r0.append(g.T4, 23);
            f1560r0.append(g.V4, 27);
            f1560r0.append(g.X4, 30);
            f1560r0.append(g.Y4, 8);
            f1560r0.append(g.U4, 33);
            f1560r0.append(g.W4, 2);
            f1560r0.append(g.R4, 22);
            f1560r0.append(g.S4, 21);
            SparseIntArray sparseIntArray3 = f1560r0;
            int i11 = g.P5;
            sparseIntArray3.append(i11, 41);
            SparseIntArray sparseIntArray4 = f1560r0;
            int i12 = g.f1815v5;
            sparseIntArray4.append(i12, 42);
            f1560r0.append(g.f1695g5, 87);
            f1560r0.append(g.f1687f5, 88);
            f1560r0.append(g.f1655b6, 76);
            f1560r0.append(g.f1743m5, 61);
            f1560r0.append(g.f1759o5, 62);
            f1560r0.append(g.f1751n5, 63);
            f1560r0.append(g.S5, 69);
            f1560r0.append(g.f1831x5, 70);
            f1560r0.append(g.f1663c5, 71);
            f1560r0.append(g.f1645a5, 72);
            f1560r0.append(g.f1654b5, 73);
            f1560r0.append(g.f1671d5, 74);
            f1560r0.append(g.Z4, 75);
            SparseIntArray sparseIntArray5 = f1560r0;
            int i13 = g.Q5;
            sparseIntArray5.append(i13, 84);
            f1560r0.append(g.R5, 86);
            f1560r0.append(i13, 83);
            f1560r0.append(g.f1823w5, 85);
            f1560r0.append(i11, 87);
            f1560r0.append(i12, 88);
            f1560r0.append(g.f1788s2, 89);
            f1560r0.append(i10, 90);
        }

        public void a(b bVar) {
            this.f1561a = bVar.f1561a;
            this.f1567d = bVar.f1567d;
            this.f1563b = bVar.f1563b;
            this.f1569e = bVar.f1569e;
            this.f1571f = bVar.f1571f;
            this.f1573g = bVar.f1573g;
            this.f1575h = bVar.f1575h;
            this.f1577i = bVar.f1577i;
            this.f1579j = bVar.f1579j;
            this.f1581k = bVar.f1581k;
            this.f1583l = bVar.f1583l;
            this.f1585m = bVar.f1585m;
            this.f1587n = bVar.f1587n;
            this.f1589o = bVar.f1589o;
            this.f1591p = bVar.f1591p;
            this.f1593q = bVar.f1593q;
            this.f1595r = bVar.f1595r;
            this.f1596s = bVar.f1596s;
            this.f1597t = bVar.f1597t;
            this.f1598u = bVar.f1598u;
            this.f1599v = bVar.f1599v;
            this.f1600w = bVar.f1600w;
            this.f1601x = bVar.f1601x;
            this.f1602y = bVar.f1602y;
            this.f1603z = bVar.f1603z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            this.H = bVar.H;
            this.I = bVar.I;
            this.J = bVar.J;
            this.K = bVar.K;
            this.L = bVar.L;
            this.M = bVar.M;
            this.N = bVar.N;
            this.O = bVar.O;
            this.P = bVar.P;
            this.Q = bVar.Q;
            this.R = bVar.R;
            this.S = bVar.S;
            this.T = bVar.T;
            this.U = bVar.U;
            this.V = bVar.V;
            this.W = bVar.W;
            this.X = bVar.X;
            this.Y = bVar.Y;
            this.Z = bVar.Z;
            this.f1562a0 = bVar.f1562a0;
            this.f1564b0 = bVar.f1564b0;
            this.f1566c0 = bVar.f1566c0;
            this.f1568d0 = bVar.f1568d0;
            this.f1570e0 = bVar.f1570e0;
            this.f1572f0 = bVar.f1572f0;
            this.f1574g0 = bVar.f1574g0;
            this.f1576h0 = bVar.f1576h0;
            this.f1578i0 = bVar.f1578i0;
            this.f1580j0 = bVar.f1580j0;
            this.f1586m0 = bVar.f1586m0;
            int[] iArr = bVar.f1582k0;
            if (iArr == null || bVar.f1584l0 != null) {
                this.f1582k0 = null;
            } else {
                this.f1582k0 = Arrays.copyOf(iArr, iArr.length);
            }
            this.f1584l0 = bVar.f1584l0;
            this.f1588n0 = bVar.f1588n0;
            this.f1590o0 = bVar.f1590o0;
            this.f1592p0 = bVar.f1592p0;
            this.f1594q0 = bVar.f1594q0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.P4);
            this.f1563b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f1560r0.get(index);
                switch (i11) {
                    case 1:
                        this.f1595r = d.m(typedArrayObtainStyledAttributes, index, this.f1595r);
                        break;
                    case 2:
                        this.K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.K);
                        break;
                    case 3:
                        this.f1593q = d.m(typedArrayObtainStyledAttributes, index, this.f1593q);
                        break;
                    case 4:
                        this.f1591p = d.m(typedArrayObtainStyledAttributes, index, this.f1591p);
                        break;
                    case 5:
                        this.A = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.E = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.E);
                        break;
                    case 7:
                        this.F = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.F);
                        break;
                    case 8:
                        this.L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.L);
                        break;
                    case 9:
                        this.f1601x = d.m(typedArrayObtainStyledAttributes, index, this.f1601x);
                        break;
                    case 10:
                        this.f1600w = d.m(typedArrayObtainStyledAttributes, index, this.f1600w);
                        break;
                    case 11:
                        this.R = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.R);
                        break;
                    case 12:
                        this.S = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.S);
                        break;
                    case 13:
                        this.O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.O);
                        break;
                    case 14:
                        this.Q = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                        break;
                    case 15:
                        this.T = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.T);
                        break;
                    case 16:
                        this.P = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.P);
                        break;
                    case 17:
                        this.f1571f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1571f);
                        break;
                    case 18:
                        this.f1573g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f1573g);
                        break;
                    case 19:
                        this.f1575h = typedArrayObtainStyledAttributes.getFloat(index, this.f1575h);
                        break;
                    case 20:
                        this.f1602y = typedArrayObtainStyledAttributes.getFloat(index, this.f1602y);
                        break;
                    case 21:
                        this.f1569e = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1569e);
                        break;
                    case 22:
                        this.f1567d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f1567d);
                        break;
                    case 23:
                        this.H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.H);
                        break;
                    case 24:
                        this.f1579j = d.m(typedArrayObtainStyledAttributes, index, this.f1579j);
                        break;
                    case 25:
                        this.f1581k = d.m(typedArrayObtainStyledAttributes, index, this.f1581k);
                        break;
                    case 26:
                        this.G = typedArrayObtainStyledAttributes.getInt(index, this.G);
                        break;
                    case 27:
                        this.I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.I);
                        break;
                    case 28:
                        this.f1583l = d.m(typedArrayObtainStyledAttributes, index, this.f1583l);
                        break;
                    case 29:
                        this.f1585m = d.m(typedArrayObtainStyledAttributes, index, this.f1585m);
                        break;
                    case 30:
                        this.M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.M);
                        break;
                    case 31:
                        this.f1598u = d.m(typedArrayObtainStyledAttributes, index, this.f1598u);
                        break;
                    case 32:
                        this.f1599v = d.m(typedArrayObtainStyledAttributes, index, this.f1599v);
                        break;
                    case 33:
                        this.J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.J);
                        break;
                    case 34:
                        this.f1589o = d.m(typedArrayObtainStyledAttributes, index, this.f1589o);
                        break;
                    case 35:
                        this.f1587n = d.m(typedArrayObtainStyledAttributes, index, this.f1587n);
                        break;
                    case 36:
                        this.f1603z = typedArrayObtainStyledAttributes.getFloat(index, this.f1603z);
                        break;
                    case 37:
                        this.W = typedArrayObtainStyledAttributes.getFloat(index, this.W);
                        break;
                    case 38:
                        this.V = typedArrayObtainStyledAttributes.getFloat(index, this.V);
                        break;
                    case 39:
                        this.X = typedArrayObtainStyledAttributes.getInt(index, this.X);
                        break;
                    case 40:
                        this.Y = typedArrayObtainStyledAttributes.getInt(index, this.Y);
                        break;
                    case 41:
                        d.n(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        d.n(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i11) {
                            case 61:
                                this.B = d.m(typedArrayObtainStyledAttributes, index, this.B);
                                break;
                            case 62:
                                this.C = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.C);
                                break;
                            case 63:
                                this.D = typedArrayObtainStyledAttributes.getFloat(index, this.D);
                                break;
                            default:
                                switch (i11) {
                                    case 69:
                                        this.f1572f0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.f1574g0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.f1576h0 = typedArrayObtainStyledAttributes.getInt(index, this.f1576h0);
                                        break;
                                    case 73:
                                        this.f1578i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1578i0);
                                        break;
                                    case 74:
                                        this.f1584l0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.f1592p0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1592p0);
                                        break;
                                    case 76:
                                        this.f1594q0 = typedArrayObtainStyledAttributes.getInt(index, this.f1594q0);
                                        break;
                                    case 77:
                                        this.f1596s = d.m(typedArrayObtainStyledAttributes, index, this.f1596s);
                                        break;
                                    case 78:
                                        this.f1597t = d.m(typedArrayObtainStyledAttributes, index, this.f1597t);
                                        break;
                                    case 79:
                                        this.U = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.U);
                                        break;
                                    case 80:
                                        this.N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.N);
                                        break;
                                    case 81:
                                        this.Z = typedArrayObtainStyledAttributes.getInt(index, this.Z);
                                        break;
                                    case 82:
                                        this.f1562a0 = typedArrayObtainStyledAttributes.getInt(index, this.f1562a0);
                                        break;
                                    case 83:
                                        this.f1566c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1566c0);
                                        break;
                                    case 84:
                                        this.f1564b0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1564b0);
                                        break;
                                    case 85:
                                        this.f1570e0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1570e0);
                                        break;
                                    case 86:
                                        this.f1568d0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f1568d0);
                                        break;
                                    case 87:
                                        this.f1588n0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1588n0);
                                        break;
                                    case 88:
                                        this.f1590o0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f1590o0);
                                        break;
                                    case 89:
                                        this.f1586m0 = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.f1577i = typedArrayObtainStyledAttributes.getBoolean(index, this.f1577i);
                                        break;
                                    case 91:
                                        Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1560r0.get(index));
                                        break;
                                    default:
                                        Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1560r0.get(index));
                                        break;
                                }
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: o */
        private static SparseIntArray f1604o;

        /* JADX INFO: renamed from: a */
        public boolean f1605a = false;

        /* JADX INFO: renamed from: b */
        public int f1606b = -1;

        /* JADX INFO: renamed from: c */
        public int f1607c = 0;

        /* JADX INFO: renamed from: d */
        public String f1608d = null;

        /* JADX INFO: renamed from: e */
        public int f1609e = -1;

        /* JADX INFO: renamed from: f */
        public int f1610f = 0;

        /* JADX INFO: renamed from: g */
        public float f1611g = Float.NaN;

        /* JADX INFO: renamed from: h */
        public int f1612h = -1;

        /* JADX INFO: renamed from: i */
        public float f1613i = Float.NaN;

        /* JADX INFO: renamed from: j */
        public float f1614j = Float.NaN;

        /* JADX INFO: renamed from: k */
        public int f1615k = -1;

        /* JADX INFO: renamed from: l */
        public String f1616l = null;

        /* JADX INFO: renamed from: m */
        public int f1617m = -3;

        /* JADX INFO: renamed from: n */
        public int f1618n = -1;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1604o = sparseIntArray;
            sparseIntArray.append(g.f1704h6, 1);
            f1604o.append(g.f1720j6, 2);
            f1604o.append(g.f1752n6, 3);
            f1604o.append(g.f1696g6, 4);
            f1604o.append(g.f1688f6, 5);
            f1604o.append(g.f1680e6, 6);
            f1604o.append(g.f1712i6, 7);
            f1604o.append(g.f1744m6, 8);
            f1604o.append(g.f1736l6, 9);
            f1604o.append(g.f1728k6, 10);
        }

        public void a(c cVar) {
            this.f1605a = cVar.f1605a;
            this.f1606b = cVar.f1606b;
            this.f1608d = cVar.f1608d;
            this.f1609e = cVar.f1609e;
            this.f1610f = cVar.f1610f;
            this.f1613i = cVar.f1613i;
            this.f1611g = cVar.f1611g;
            this.f1612h = cVar.f1612h;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f1672d6);
            this.f1605a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f1604o.get(index)) {
                    case 1:
                        this.f1613i = typedArrayObtainStyledAttributes.getFloat(index, this.f1613i);
                        break;
                    case 2:
                        this.f1609e = typedArrayObtainStyledAttributes.getInt(index, this.f1609e);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f1608d = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f1608d = t.a.f27388c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f1610f = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f1606b = d.m(typedArrayObtainStyledAttributes, index, this.f1606b);
                        break;
                    case 6:
                        this.f1607c = typedArrayObtainStyledAttributes.getInteger(index, this.f1607c);
                        break;
                    case 7:
                        this.f1611g = typedArrayObtainStyledAttributes.getFloat(index, this.f1611g);
                        break;
                    case 8:
                        this.f1615k = typedArrayObtainStyledAttributes.getInteger(index, this.f1615k);
                        break;
                    case 9:
                        this.f1614j = typedArrayObtainStyledAttributes.getFloat(index, this.f1614j);
                        break;
                    case 10:
                        int i11 = typedArrayObtainStyledAttributes.peekValue(index).type;
                        if (i11 == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.f1618n = resourceId;
                            if (resourceId != -1) {
                                this.f1617m = -2;
                            }
                        } else if (i11 == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.f1616l = string;
                            if (string.indexOf("/") > 0) {
                                this.f1618n = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.f1617m = -2;
                            } else {
                                this.f1617m = -1;
                            }
                        } else {
                            this.f1617m = typedArrayObtainStyledAttributes.getInteger(index, this.f1618n);
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.d$d */
    public static class C0025d {

        /* JADX INFO: renamed from: a */
        public boolean f1619a = false;

        /* JADX INFO: renamed from: b */
        public int f1620b = 0;

        /* JADX INFO: renamed from: c */
        public int f1621c = 0;

        /* JADX INFO: renamed from: d */
        public float f1622d = 1.0f;

        /* JADX INFO: renamed from: e */
        public float f1623e = Float.NaN;

        public void a(C0025d c0025d) {
            this.f1619a = c0025d.f1619a;
            this.f1620b = c0025d.f1620b;
            this.f1622d = c0025d.f1622d;
            this.f1623e = c0025d.f1623e;
            this.f1621c = c0025d.f1621c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.f1824w6);
            this.f1619a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == g.f1840y6) {
                    this.f1622d = typedArrayObtainStyledAttributes.getFloat(index, this.f1622d);
                } else if (index == g.f1832x6) {
                    this.f1620b = typedArrayObtainStyledAttributes.getInt(index, this.f1620b);
                    this.f1620b = d.f1531g[this.f1620b];
                } else if (index == g.A6) {
                    this.f1621c = typedArrayObtainStyledAttributes.getInt(index, this.f1621c);
                } else if (index == g.f1848z6) {
                    this.f1623e = typedArrayObtainStyledAttributes.getFloat(index, this.f1623e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: o */
        private static SparseIntArray f1624o;

        /* JADX INFO: renamed from: a */
        public boolean f1625a = false;

        /* JADX INFO: renamed from: b */
        public float f1626b = 0.0f;

        /* JADX INFO: renamed from: c */
        public float f1627c = 0.0f;

        /* JADX INFO: renamed from: d */
        public float f1628d = 0.0f;

        /* JADX INFO: renamed from: e */
        public float f1629e = 1.0f;

        /* JADX INFO: renamed from: f */
        public float f1630f = 1.0f;

        /* JADX INFO: renamed from: g */
        public float f1631g = Float.NaN;

        /* JADX INFO: renamed from: h */
        public float f1632h = Float.NaN;

        /* JADX INFO: renamed from: i */
        public int f1633i = -1;

        /* JADX INFO: renamed from: j */
        public float f1634j = 0.0f;

        /* JADX INFO: renamed from: k */
        public float f1635k = 0.0f;

        /* JADX INFO: renamed from: l */
        public float f1636l = 0.0f;

        /* JADX INFO: renamed from: m */
        public boolean f1637m = false;

        /* JADX INFO: renamed from: n */
        public float f1638n = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f1624o = sparseIntArray;
            sparseIntArray.append(g.N6, 1);
            f1624o.append(g.O6, 2);
            f1624o.append(g.P6, 3);
            f1624o.append(g.L6, 4);
            f1624o.append(g.M6, 5);
            f1624o.append(g.H6, 6);
            f1624o.append(g.I6, 7);
            f1624o.append(g.J6, 8);
            f1624o.append(g.K6, 9);
            f1624o.append(g.Q6, 10);
            f1624o.append(g.R6, 11);
            f1624o.append(g.S6, 12);
        }

        public void a(e eVar) {
            this.f1625a = eVar.f1625a;
            this.f1626b = eVar.f1626b;
            this.f1627c = eVar.f1627c;
            this.f1628d = eVar.f1628d;
            this.f1629e = eVar.f1629e;
            this.f1630f = eVar.f1630f;
            this.f1631g = eVar.f1631g;
            this.f1632h = eVar.f1632h;
            this.f1633i = eVar.f1633i;
            this.f1634j = eVar.f1634j;
            this.f1635k = eVar.f1635k;
            this.f1636l = eVar.f1636l;
            this.f1637m = eVar.f1637m;
            this.f1638n = eVar.f1638n;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.G6);
            this.f1625a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f1624o.get(index)) {
                    case 1:
                        this.f1626b = typedArrayObtainStyledAttributes.getFloat(index, this.f1626b);
                        break;
                    case 2:
                        this.f1627c = typedArrayObtainStyledAttributes.getFloat(index, this.f1627c);
                        break;
                    case 3:
                        this.f1628d = typedArrayObtainStyledAttributes.getFloat(index, this.f1628d);
                        break;
                    case 4:
                        this.f1629e = typedArrayObtainStyledAttributes.getFloat(index, this.f1629e);
                        break;
                    case 5:
                        this.f1630f = typedArrayObtainStyledAttributes.getFloat(index, this.f1630f);
                        break;
                    case 6:
                        this.f1631g = typedArrayObtainStyledAttributes.getDimension(index, this.f1631g);
                        break;
                    case 7:
                        this.f1632h = typedArrayObtainStyledAttributes.getDimension(index, this.f1632h);
                        break;
                    case 8:
                        this.f1634j = typedArrayObtainStyledAttributes.getDimension(index, this.f1634j);
                        break;
                    case 9:
                        this.f1635k = typedArrayObtainStyledAttributes.getDimension(index, this.f1635k);
                        break;
                    case 10:
                        this.f1636l = typedArrayObtainStyledAttributes.getDimension(index, this.f1636l);
                        break;
                    case 11:
                        this.f1637m = true;
                        this.f1638n = typedArrayObtainStyledAttributes.getDimension(index, this.f1638n);
                        break;
                    case 12:
                        this.f1633i = d.m(typedArrayObtainStyledAttributes, index, this.f1633i);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        f1532h.append(g.f1706i0, 25);
        f1532h.append(g.f1714j0, 26);
        f1532h.append(g.f1730l0, 29);
        f1532h.append(g.f1738m0, 30);
        f1532h.append(g.f1786s0, 36);
        f1532h.append(g.f1778r0, 35);
        f1532h.append(g.P, 4);
        f1532h.append(g.O, 3);
        f1532h.append(g.K, 1);
        f1532h.append(g.M, 91);
        f1532h.append(g.L, 92);
        f1532h.append(g.B0, 6);
        f1532h.append(g.C0, 7);
        f1532h.append(g.W, 17);
        f1532h.append(g.X, 18);
        f1532h.append(g.Y, 19);
        f1532h.append(g.G, 99);
        f1532h.append(g.f1657c, 27);
        f1532h.append(g.f1746n0, 32);
        f1532h.append(g.f1754o0, 33);
        f1532h.append(g.V, 10);
        f1532h.append(g.U, 9);
        f1532h.append(g.F0, 13);
        f1532h.append(g.I0, 16);
        f1532h.append(g.G0, 14);
        f1532h.append(g.D0, 11);
        f1532h.append(g.H0, 15);
        f1532h.append(g.E0, 12);
        f1532h.append(g.f1810v0, 40);
        f1532h.append(g.f1690g0, 39);
        f1532h.append(g.f1682f0, 41);
        f1532h.append(g.f1802u0, 42);
        f1532h.append(g.f1674e0, 20);
        f1532h.append(g.f1794t0, 37);
        f1532h.append(g.T, 5);
        f1532h.append(g.f1698h0, 87);
        f1532h.append(g.f1770q0, 87);
        f1532h.append(g.f1722k0, 87);
        f1532h.append(g.N, 87);
        f1532h.append(g.J, 87);
        f1532h.append(g.f1697h, 24);
        f1532h.append(g.f1713j, 28);
        f1532h.append(g.f1809v, 31);
        f1532h.append(g.f1817w, 8);
        f1532h.append(g.f1705i, 34);
        f1532h.append(g.f1721k, 2);
        f1532h.append(g.f1681f, 23);
        f1532h.append(g.f1689g, 21);
        f1532h.append(g.f1818w0, 95);
        f1532h.append(g.Z, 96);
        f1532h.append(g.f1673e, 22);
        f1532h.append(g.f1729l, 43);
        f1532h.append(g.f1833y, 44);
        f1532h.append(g.f1793t, 45);
        f1532h.append(g.f1801u, 46);
        f1532h.append(g.f1785s, 60);
        f1532h.append(g.f1769q, 47);
        f1532h.append(g.f1777r, 48);
        f1532h.append(g.f1737m, 49);
        f1532h.append(g.f1745n, 50);
        f1532h.append(g.f1753o, 51);
        f1532h.append(g.f1761p, 52);
        f1532h.append(g.f1825x, 53);
        f1532h.append(g.f1826x0, 54);
        f1532h.append(g.f1640a0, 55);
        f1532h.append(g.f1834y0, 56);
        f1532h.append(g.f1649b0, 57);
        f1532h.append(g.f1842z0, 58);
        f1532h.append(g.f1658c0, 59);
        f1532h.append(g.Q, 61);
        f1532h.append(g.S, 62);
        f1532h.append(g.R, 63);
        f1532h.append(g.f1841z, 64);
        f1532h.append(g.S0, 65);
        f1532h.append(g.F, 66);
        f1532h.append(g.T0, 67);
        f1532h.append(g.L0, 79);
        f1532h.append(g.f1665d, 38);
        f1532h.append(g.K0, 68);
        f1532h.append(g.A0, 69);
        f1532h.append(g.f1666d0, 70);
        f1532h.append(g.J0, 97);
        f1532h.append(g.D, 71);
        f1532h.append(g.B, 72);
        f1532h.append(g.C, 73);
        f1532h.append(g.E, 74);
        f1532h.append(g.A, 75);
        f1532h.append(g.M0, 76);
        f1532h.append(g.f1762p0, 77);
        f1532h.append(g.U0, 78);
        f1532h.append(g.I, 80);
        f1532h.append(g.H, 81);
        f1532h.append(g.N0, 82);
        f1532h.append(g.R0, 83);
        f1532h.append(g.Q0, 84);
        f1532h.append(g.P0, 85);
        f1532h.append(g.O0, 86);
        SparseIntArray sparseIntArray = f1533i;
        int i10 = g.Y3;
        sparseIntArray.append(i10, 6);
        f1533i.append(i10, 7);
        f1533i.append(g.T2, 27);
        f1533i.append(g.f1653b4, 13);
        f1533i.append(g.f1678e4, 16);
        f1533i.append(g.f1662c4, 14);
        f1533i.append(g.Z3, 11);
        f1533i.append(g.f1670d4, 15);
        f1533i.append(g.f1644a4, 12);
        f1533i.append(g.S3, 40);
        f1533i.append(g.L3, 39);
        f1533i.append(g.K3, 41);
        f1533i.append(g.R3, 42);
        f1533i.append(g.J3, 20);
        f1533i.append(g.Q3, 37);
        f1533i.append(g.D3, 5);
        f1533i.append(g.M3, 87);
        f1533i.append(g.P3, 87);
        f1533i.append(g.N3, 87);
        f1533i.append(g.A3, 87);
        f1533i.append(g.f1845z3, 87);
        f1533i.append(g.Y2, 24);
        f1533i.append(g.f1643a3, 28);
        f1533i.append(g.f1741m3, 31);
        f1533i.append(g.f1749n3, 8);
        f1533i.append(g.Z2, 34);
        f1533i.append(g.f1652b3, 2);
        f1533i.append(g.W2, 23);
        f1533i.append(g.X2, 21);
        f1533i.append(g.T3, 95);
        f1533i.append(g.E3, 96);
        f1533i.append(g.V2, 22);
        f1533i.append(g.f1661c3, 43);
        f1533i.append(g.f1765p3, 44);
        f1533i.append(g.f1725k3, 45);
        f1533i.append(g.f1733l3, 46);
        f1533i.append(g.f1717j3, 60);
        f1533i.append(g.f1701h3, 47);
        f1533i.append(g.f1709i3, 48);
        f1533i.append(g.f1669d3, 49);
        f1533i.append(g.f1677e3, 50);
        f1533i.append(g.f1685f3, 51);
        f1533i.append(g.f1693g3, 52);
        f1533i.append(g.f1757o3, 53);
        f1533i.append(g.U3, 54);
        f1533i.append(g.F3, 55);
        f1533i.append(g.V3, 56);
        f1533i.append(g.G3, 57);
        f1533i.append(g.W3, 58);
        f1533i.append(g.H3, 59);
        f1533i.append(g.C3, 62);
        f1533i.append(g.B3, 63);
        f1533i.append(g.f1773q3, 64);
        f1533i.append(g.f1766p4, 65);
        f1533i.append(g.f1821w3, 66);
        f1533i.append(g.f1774q4, 67);
        f1533i.append(g.f1702h4, 79);
        f1533i.append(g.U2, 38);
        f1533i.append(g.f1710i4, 98);
        f1533i.append(g.f1694g4, 68);
        f1533i.append(g.X3, 69);
        f1533i.append(g.I3, 70);
        f1533i.append(g.f1805u3, 71);
        f1533i.append(g.f1789s3, 72);
        f1533i.append(g.f1797t3, 73);
        f1533i.append(g.f1813v3, 74);
        f1533i.append(g.f1781r3, 75);
        f1533i.append(g.f1718j4, 76);
        f1533i.append(g.O3, 77);
        f1533i.append(g.f1782r4, 78);
        f1533i.append(g.f1837y3, 80);
        f1533i.append(g.f1829x3, 81);
        f1533i.append(g.f1726k4, 82);
        f1533i.append(g.f1758o4, 83);
        f1533i.append(g.f1750n4, 84);
        f1533i.append(g.f1742m4, 85);
        f1533i.append(g.f1734l4, 86);
        f1533i.append(g.f1686f4, 97);
    }

    private int[] h(View view, String str) {
        int iIntValue;
        Object objI;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = f.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, Name.MARK, context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objI = ((ConstraintLayout) view.getParent()).i(0, strTrim)) != null && (objI instanceof Integer)) {
                iIntValue = ((Integer) objI).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet, boolean z10) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z10 ? g.S2 : g.f1648b);
        q(aVar, typedArrayObtainStyledAttributes, z10);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a j(int i10) {
        if (!this.f1539f.containsKey(Integer.valueOf(i10))) {
            this.f1539f.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f1539f.get(Integer.valueOf(i10));
    }

    public static int m(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static void n(java.lang.Object r3, android.content.res.TypedArray r4, int r5, int r6) {
        /*
            if (r3 != 0) goto L4
            goto L6f
        L4:
            android.util.TypedValue r0 = r4.peekValue(r5)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L70
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L29
            int r4 = r4.getInt(r5, r2)
            r5 = -4
            r0 = -2
            if (r4 == r5) goto L25
            r5 = -3
            if (r4 == r5) goto L21
            if (r4 == r0) goto L23
            r5 = -1
            if (r4 == r5) goto L23
        L21:
            r4 = 0
            goto L2e
        L23:
            r2 = r4
            goto L21
        L25:
            r2 = 1
            r4 = 1
            r2 = -2
            goto L2e
        L29:
            int r4 = r4.getDimensionPixelSize(r5, r2)
            goto L23
        L2e:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.ConstraintLayout.b
            if (r5 == 0) goto L40
            androidx.constraintlayout.widget.ConstraintLayout$b r3 = (androidx.constraintlayout.widget.ConstraintLayout.b) r3
            if (r6 != 0) goto L3b
            r3.width = r2
            r3.f1432a0 = r4
            return
        L3b:
            r3.height = r2
            r3.f1434b0 = r4
            return
        L40:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.d.b
            if (r5 == 0) goto L52
            androidx.constraintlayout.widget.d$b r3 = (androidx.constraintlayout.widget.d.b) r3
            if (r6 != 0) goto L4d
            r3.f1567d = r2
            r3.f1588n0 = r4
            return
        L4d:
            r3.f1569e = r2
            r3.f1590o0 = r4
            return
        L52:
            boolean r5 = r3 instanceof androidx.constraintlayout.widget.d.a.C0024a
            if (r5 == 0) goto L6f
            androidx.constraintlayout.widget.d$a$a r3 = (androidx.constraintlayout.widget.d.a.C0024a) r3
            if (r6 != 0) goto L65
            r5 = 23
            r3.b(r5, r2)
            r5 = 80
            r3.d(r5, r4)
            return
        L65:
            r5 = 21
            r3.b(r5, r2)
            r5 = 81
            r3.d(r5, r4)
        L6f:
            return
        L70:
            java.lang.String r4 = r4.getString(r5)
            o(r3, r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.n(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void o(Object obj, String str, int i10) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(61);
        int length = str.length();
        if (iIndexOf <= 0 || iIndexOf >= length - 1) {
            return;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring2.length() > 0) {
            String strTrim = strSubstring.trim();
            String strTrim2 = strSubstring2.trim();
            if ("ratio".equalsIgnoreCase(strTrim)) {
                if (obj instanceof ConstraintLayout.b) {
                    ConstraintLayout.b bVar = (ConstraintLayout.b) obj;
                    if (i10 == 0) {
                        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
                    } else {
                        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
                    }
                    p(bVar, strTrim2);
                    return;
                }
                if (obj instanceof b) {
                    ((b) obj).A = strTrim2;
                    return;
                } else {
                    if (obj instanceof a.C0024a) {
                        ((a.C0024a) obj).c(5, strTrim2);
                        return;
                    }
                    return;
                }
            }
            try {
                if ("weight".equalsIgnoreCase(strTrim)) {
                    float f10 = Float.parseFloat(strTrim2);
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar2).width = 0;
                            bVar2.L = f10;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar2).height = 0;
                            bVar2.M = f10;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar3 = (b) obj;
                        if (i10 == 0) {
                            bVar3.f1567d = 0;
                            bVar3.W = f10;
                            return;
                        } else {
                            bVar3.f1569e = 0;
                            bVar3.V = f10;
                            return;
                        }
                    }
                    if (obj instanceof a.C0024a) {
                        a.C0024a c0024a = (a.C0024a) obj;
                        if (i10 == 0) {
                            c0024a.b(23, 0);
                            c0024a.a(39, f10);
                            return;
                        } else {
                            c0024a.b(21, 0);
                            c0024a.a(40, f10);
                            return;
                        }
                    }
                    return;
                }
                if ("parent".equalsIgnoreCase(strTrim)) {
                    float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                    if (obj instanceof ConstraintLayout.b) {
                        ConstraintLayout.b bVar4 = (ConstraintLayout.b) obj;
                        if (i10 == 0) {
                            ((ViewGroup.MarginLayoutParams) bVar4).width = 0;
                            bVar4.V = fMax;
                            bVar4.P = 2;
                            return;
                        } else {
                            ((ViewGroup.MarginLayoutParams) bVar4).height = 0;
                            bVar4.W = fMax;
                            bVar4.Q = 2;
                            return;
                        }
                    }
                    if (obj instanceof b) {
                        b bVar5 = (b) obj;
                        if (i10 == 0) {
                            bVar5.f1567d = 0;
                            bVar5.f1572f0 = fMax;
                            bVar5.Z = 2;
                            return;
                        } else {
                            bVar5.f1569e = 0;
                            bVar5.f1574g0 = fMax;
                            bVar5.f1562a0 = 2;
                            return;
                        }
                    }
                    if (obj instanceof a.C0024a) {
                        a.C0024a c0024a2 = (a.C0024a) obj;
                        if (i10 == 0) {
                            c0024a2.b(23, 0);
                            c0024a2.b(54, 2);
                        } else {
                            c0024a2.b(21, 0);
                            c0024a2.b(55, 2);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
    }

    static void p(ConstraintLayout.b bVar, String str) {
        float fAbs = Float.NaN;
        int i10 = -1;
        if (str != null) {
            int length = str.length();
            int iIndexOf = str.indexOf(44);
            int i11 = 0;
            if (iIndexOf > 0 && iIndexOf < length - 1) {
                String strSubstring = str.substring(0, iIndexOf);
                if (strSubstring.equalsIgnoreCase("W")) {
                    i10 = 0;
                } else if (strSubstring.equalsIgnoreCase("H")) {
                    i10 = 1;
                }
                i11 = iIndexOf + 1;
            }
            int iIndexOf2 = str.indexOf(58);
            try {
                if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                    String strSubstring2 = str.substring(i11);
                    if (strSubstring2.length() > 0) {
                        fAbs = Float.parseFloat(strSubstring2);
                    }
                } else {
                    String strSubstring3 = str.substring(i11, iIndexOf2);
                    String strSubstring4 = str.substring(iIndexOf2 + 1);
                    if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                        float f10 = Float.parseFloat(strSubstring3);
                        float f11 = Float.parseFloat(strSubstring4);
                        if (f10 > 0.0f && f11 > 0.0f) {
                            fAbs = i10 == 1 ? Math.abs(f11 / f10) : Math.abs(f10 / f11);
                        }
                    }
                }
            } catch (NumberFormatException unused) {
            }
        }
        bVar.I = str;
        bVar.J = fAbs;
        bVar.K = i10;
    }

    private void q(a aVar, TypedArray typedArray, boolean z10) {
        if (z10) {
            r(aVar, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != g.f1665d && g.f1809v != index && g.f1817w != index) {
                aVar.f1543d.f1605a = true;
                aVar.f1544e.f1563b = true;
                aVar.f1542c.f1619a = true;
                aVar.f1545f.f1625a = true;
            }
            switch (f1532h.get(index)) {
                case 1:
                    b bVar = aVar.f1544e;
                    bVar.f1595r = m(typedArray, index, bVar.f1595r);
                    break;
                case 2:
                    b bVar2 = aVar.f1544e;
                    bVar2.K = typedArray.getDimensionPixelSize(index, bVar2.K);
                    break;
                case 3:
                    b bVar3 = aVar.f1544e;
                    bVar3.f1593q = m(typedArray, index, bVar3.f1593q);
                    break;
                case 4:
                    b bVar4 = aVar.f1544e;
                    bVar4.f1591p = m(typedArray, index, bVar4.f1591p);
                    break;
                case 5:
                    aVar.f1544e.A = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f1544e;
                    bVar5.E = typedArray.getDimensionPixelOffset(index, bVar5.E);
                    break;
                case 7:
                    b bVar6 = aVar.f1544e;
                    bVar6.F = typedArray.getDimensionPixelOffset(index, bVar6.F);
                    break;
                case 8:
                    b bVar7 = aVar.f1544e;
                    bVar7.L = typedArray.getDimensionPixelSize(index, bVar7.L);
                    break;
                case 9:
                    b bVar8 = aVar.f1544e;
                    bVar8.f1601x = m(typedArray, index, bVar8.f1601x);
                    break;
                case 10:
                    b bVar9 = aVar.f1544e;
                    bVar9.f1600w = m(typedArray, index, bVar9.f1600w);
                    break;
                case 11:
                    b bVar10 = aVar.f1544e;
                    bVar10.R = typedArray.getDimensionPixelSize(index, bVar10.R);
                    break;
                case 12:
                    b bVar11 = aVar.f1544e;
                    bVar11.S = typedArray.getDimensionPixelSize(index, bVar11.S);
                    break;
                case 13:
                    b bVar12 = aVar.f1544e;
                    bVar12.O = typedArray.getDimensionPixelSize(index, bVar12.O);
                    break;
                case 14:
                    b bVar13 = aVar.f1544e;
                    bVar13.Q = typedArray.getDimensionPixelSize(index, bVar13.Q);
                    break;
                case 15:
                    b bVar14 = aVar.f1544e;
                    bVar14.T = typedArray.getDimensionPixelSize(index, bVar14.T);
                    break;
                case 16:
                    b bVar15 = aVar.f1544e;
                    bVar15.P = typedArray.getDimensionPixelSize(index, bVar15.P);
                    break;
                case 17:
                    b bVar16 = aVar.f1544e;
                    bVar16.f1571f = typedArray.getDimensionPixelOffset(index, bVar16.f1571f);
                    break;
                case 18:
                    b bVar17 = aVar.f1544e;
                    bVar17.f1573g = typedArray.getDimensionPixelOffset(index, bVar17.f1573g);
                    break;
                case 19:
                    b bVar18 = aVar.f1544e;
                    bVar18.f1575h = typedArray.getFloat(index, bVar18.f1575h);
                    break;
                case 20:
                    b bVar19 = aVar.f1544e;
                    bVar19.f1602y = typedArray.getFloat(index, bVar19.f1602y);
                    break;
                case 21:
                    b bVar20 = aVar.f1544e;
                    bVar20.f1569e = typedArray.getLayoutDimension(index, bVar20.f1569e);
                    break;
                case 22:
                    C0025d c0025d = aVar.f1542c;
                    c0025d.f1620b = typedArray.getInt(index, c0025d.f1620b);
                    C0025d c0025d2 = aVar.f1542c;
                    c0025d2.f1620b = f1531g[c0025d2.f1620b];
                    break;
                case 23:
                    b bVar21 = aVar.f1544e;
                    bVar21.f1567d = typedArray.getLayoutDimension(index, bVar21.f1567d);
                    break;
                case 24:
                    b bVar22 = aVar.f1544e;
                    bVar22.H = typedArray.getDimensionPixelSize(index, bVar22.H);
                    break;
                case 25:
                    b bVar23 = aVar.f1544e;
                    bVar23.f1579j = m(typedArray, index, bVar23.f1579j);
                    break;
                case 26:
                    b bVar24 = aVar.f1544e;
                    bVar24.f1581k = m(typedArray, index, bVar24.f1581k);
                    break;
                case 27:
                    b bVar25 = aVar.f1544e;
                    bVar25.G = typedArray.getInt(index, bVar25.G);
                    break;
                case 28:
                    b bVar26 = aVar.f1544e;
                    bVar26.I = typedArray.getDimensionPixelSize(index, bVar26.I);
                    break;
                case 29:
                    b bVar27 = aVar.f1544e;
                    bVar27.f1583l = m(typedArray, index, bVar27.f1583l);
                    break;
                case 30:
                    b bVar28 = aVar.f1544e;
                    bVar28.f1585m = m(typedArray, index, bVar28.f1585m);
                    break;
                case 31:
                    b bVar29 = aVar.f1544e;
                    bVar29.M = typedArray.getDimensionPixelSize(index, bVar29.M);
                    break;
                case 32:
                    b bVar30 = aVar.f1544e;
                    bVar30.f1598u = m(typedArray, index, bVar30.f1598u);
                    break;
                case 33:
                    b bVar31 = aVar.f1544e;
                    bVar31.f1599v = m(typedArray, index, bVar31.f1599v);
                    break;
                case 34:
                    b bVar32 = aVar.f1544e;
                    bVar32.J = typedArray.getDimensionPixelSize(index, bVar32.J);
                    break;
                case 35:
                    b bVar33 = aVar.f1544e;
                    bVar33.f1589o = m(typedArray, index, bVar33.f1589o);
                    break;
                case 36:
                    b bVar34 = aVar.f1544e;
                    bVar34.f1587n = m(typedArray, index, bVar34.f1587n);
                    break;
                case 37:
                    b bVar35 = aVar.f1544e;
                    bVar35.f1603z = typedArray.getFloat(index, bVar35.f1603z);
                    break;
                case 38:
                    aVar.f1540a = typedArray.getResourceId(index, aVar.f1540a);
                    break;
                case 39:
                    b bVar36 = aVar.f1544e;
                    bVar36.W = typedArray.getFloat(index, bVar36.W);
                    break;
                case 40:
                    b bVar37 = aVar.f1544e;
                    bVar37.V = typedArray.getFloat(index, bVar37.V);
                    break;
                case 41:
                    b bVar38 = aVar.f1544e;
                    bVar38.X = typedArray.getInt(index, bVar38.X);
                    break;
                case 42:
                    b bVar39 = aVar.f1544e;
                    bVar39.Y = typedArray.getInt(index, bVar39.Y);
                    break;
                case 43:
                    C0025d c0025d3 = aVar.f1542c;
                    c0025d3.f1622d = typedArray.getFloat(index, c0025d3.f1622d);
                    break;
                case 44:
                    e eVar = aVar.f1545f;
                    eVar.f1637m = true;
                    eVar.f1638n = typedArray.getDimension(index, eVar.f1638n);
                    break;
                case 45:
                    e eVar2 = aVar.f1545f;
                    eVar2.f1627c = typedArray.getFloat(index, eVar2.f1627c);
                    break;
                case 46:
                    e eVar3 = aVar.f1545f;
                    eVar3.f1628d = typedArray.getFloat(index, eVar3.f1628d);
                    break;
                case 47:
                    e eVar4 = aVar.f1545f;
                    eVar4.f1629e = typedArray.getFloat(index, eVar4.f1629e);
                    break;
                case 48:
                    e eVar5 = aVar.f1545f;
                    eVar5.f1630f = typedArray.getFloat(index, eVar5.f1630f);
                    break;
                case 49:
                    e eVar6 = aVar.f1545f;
                    eVar6.f1631g = typedArray.getDimension(index, eVar6.f1631g);
                    break;
                case 50:
                    e eVar7 = aVar.f1545f;
                    eVar7.f1632h = typedArray.getDimension(index, eVar7.f1632h);
                    break;
                case 51:
                    e eVar8 = aVar.f1545f;
                    eVar8.f1634j = typedArray.getDimension(index, eVar8.f1634j);
                    break;
                case 52:
                    e eVar9 = aVar.f1545f;
                    eVar9.f1635k = typedArray.getDimension(index, eVar9.f1635k);
                    break;
                case 53:
                    e eVar10 = aVar.f1545f;
                    eVar10.f1636l = typedArray.getDimension(index, eVar10.f1636l);
                    break;
                case 54:
                    b bVar40 = aVar.f1544e;
                    bVar40.Z = typedArray.getInt(index, bVar40.Z);
                    break;
                case 55:
                    b bVar41 = aVar.f1544e;
                    bVar41.f1562a0 = typedArray.getInt(index, bVar41.f1562a0);
                    break;
                case 56:
                    b bVar42 = aVar.f1544e;
                    bVar42.f1564b0 = typedArray.getDimensionPixelSize(index, bVar42.f1564b0);
                    break;
                case 57:
                    b bVar43 = aVar.f1544e;
                    bVar43.f1566c0 = typedArray.getDimensionPixelSize(index, bVar43.f1566c0);
                    break;
                case 58:
                    b bVar44 = aVar.f1544e;
                    bVar44.f1568d0 = typedArray.getDimensionPixelSize(index, bVar44.f1568d0);
                    break;
                case 59:
                    b bVar45 = aVar.f1544e;
                    bVar45.f1570e0 = typedArray.getDimensionPixelSize(index, bVar45.f1570e0);
                    break;
                case 60:
                    e eVar11 = aVar.f1545f;
                    eVar11.f1626b = typedArray.getFloat(index, eVar11.f1626b);
                    break;
                case 61:
                    b bVar46 = aVar.f1544e;
                    bVar46.B = m(typedArray, index, bVar46.B);
                    break;
                case 62:
                    b bVar47 = aVar.f1544e;
                    bVar47.C = typedArray.getDimensionPixelSize(index, bVar47.C);
                    break;
                case 63:
                    b bVar48 = aVar.f1544e;
                    bVar48.D = typedArray.getFloat(index, bVar48.D);
                    break;
                case 64:
                    c cVar = aVar.f1543d;
                    cVar.f1606b = m(typedArray, index, cVar.f1606b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f1543d.f1608d = typedArray.getString(index);
                    } else {
                        aVar.f1543d.f1608d = t.a.f27388c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f1543d.f1610f = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f1543d;
                    cVar2.f1613i = typedArray.getFloat(index, cVar2.f1613i);
                    break;
                case 68:
                    C0025d c0025d4 = aVar.f1542c;
                    c0025d4.f1623e = typedArray.getFloat(index, c0025d4.f1623e);
                    break;
                case 69:
                    aVar.f1544e.f1572f0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f1544e.f1574g0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f1544e;
                    bVar49.f1576h0 = typedArray.getInt(index, bVar49.f1576h0);
                    break;
                case 73:
                    b bVar50 = aVar.f1544e;
                    bVar50.f1578i0 = typedArray.getDimensionPixelSize(index, bVar50.f1578i0);
                    break;
                case 74:
                    aVar.f1544e.f1584l0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f1544e;
                    bVar51.f1592p0 = typedArray.getBoolean(index, bVar51.f1592p0);
                    break;
                case 76:
                    c cVar3 = aVar.f1543d;
                    cVar3.f1609e = typedArray.getInt(index, cVar3.f1609e);
                    break;
                case 77:
                    aVar.f1544e.f1586m0 = typedArray.getString(index);
                    break;
                case 78:
                    C0025d c0025d5 = aVar.f1542c;
                    c0025d5.f1621c = typedArray.getInt(index, c0025d5.f1621c);
                    break;
                case 79:
                    c cVar4 = aVar.f1543d;
                    cVar4.f1611g = typedArray.getFloat(index, cVar4.f1611g);
                    break;
                case 80:
                    b bVar52 = aVar.f1544e;
                    bVar52.f1588n0 = typedArray.getBoolean(index, bVar52.f1588n0);
                    break;
                case 81:
                    b bVar53 = aVar.f1544e;
                    bVar53.f1590o0 = typedArray.getBoolean(index, bVar53.f1590o0);
                    break;
                case 82:
                    c cVar5 = aVar.f1543d;
                    cVar5.f1607c = typedArray.getInteger(index, cVar5.f1607c);
                    break;
                case 83:
                    e eVar12 = aVar.f1545f;
                    eVar12.f1633i = m(typedArray, index, eVar12.f1633i);
                    break;
                case 84:
                    c cVar6 = aVar.f1543d;
                    cVar6.f1615k = typedArray.getInteger(index, cVar6.f1615k);
                    break;
                case 85:
                    c cVar7 = aVar.f1543d;
                    cVar7.f1614j = typedArray.getFloat(index, cVar7.f1614j);
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f1543d.f1618n = typedArray.getResourceId(index, -1);
                        c cVar8 = aVar.f1543d;
                        if (cVar8.f1618n != -1) {
                            cVar8.f1617m = -2;
                        }
                    } else if (i11 == 3) {
                        aVar.f1543d.f1616l = typedArray.getString(index);
                        if (aVar.f1543d.f1616l.indexOf("/") > 0) {
                            aVar.f1543d.f1618n = typedArray.getResourceId(index, -1);
                            aVar.f1543d.f1617m = -2;
                        } else {
                            aVar.f1543d.f1617m = -1;
                        }
                    } else {
                        c cVar9 = aVar.f1543d;
                        cVar9.f1617m = typedArray.getInteger(index, cVar9.f1618n);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1532h.get(index));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1532h.get(index));
                    break;
                case 91:
                    b bVar54 = aVar.f1544e;
                    bVar54.f1596s = m(typedArray, index, bVar54.f1596s);
                    break;
                case 92:
                    b bVar55 = aVar.f1544e;
                    bVar55.f1597t = m(typedArray, index, bVar55.f1597t);
                    break;
                case 93:
                    b bVar56 = aVar.f1544e;
                    bVar56.N = typedArray.getDimensionPixelSize(index, bVar56.N);
                    break;
                case 94:
                    b bVar57 = aVar.f1544e;
                    bVar57.U = typedArray.getDimensionPixelSize(index, bVar57.U);
                    break;
                case 95:
                    n(aVar.f1544e, typedArray, index, 0);
                    break;
                case 96:
                    n(aVar.f1544e, typedArray, index, 1);
                    break;
                case 97:
                    b bVar58 = aVar.f1544e;
                    bVar58.f1594q0 = typedArray.getInt(index, bVar58.f1594q0);
                    break;
            }
        }
        b bVar59 = aVar.f1544e;
        if (bVar59.f1584l0 != null) {
            bVar59.f1582k0 = null;
        }
    }

    private static void r(a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        a.C0024a c0024a = new a.C0024a();
        aVar.f1547h = c0024a;
        aVar.f1543d.f1605a = false;
        aVar.f1544e.f1563b = false;
        aVar.f1542c.f1619a = false;
        aVar.f1545f.f1625a = false;
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            switch (f1533i.get(index)) {
                case 2:
                    c0024a.b(2, typedArray.getDimensionPixelSize(index, aVar.f1544e.K));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f1532h.get(index));
                    break;
                case 5:
                    c0024a.c(5, typedArray.getString(index));
                    break;
                case 6:
                    c0024a.b(6, typedArray.getDimensionPixelOffset(index, aVar.f1544e.E));
                    break;
                case 7:
                    c0024a.b(7, typedArray.getDimensionPixelOffset(index, aVar.f1544e.F));
                    break;
                case 8:
                    c0024a.b(8, typedArray.getDimensionPixelSize(index, aVar.f1544e.L));
                    break;
                case 11:
                    c0024a.b(11, typedArray.getDimensionPixelSize(index, aVar.f1544e.R));
                    break;
                case 12:
                    c0024a.b(12, typedArray.getDimensionPixelSize(index, aVar.f1544e.S));
                    break;
                case 13:
                    c0024a.b(13, typedArray.getDimensionPixelSize(index, aVar.f1544e.O));
                    break;
                case 14:
                    c0024a.b(14, typedArray.getDimensionPixelSize(index, aVar.f1544e.Q));
                    break;
                case 15:
                    c0024a.b(15, typedArray.getDimensionPixelSize(index, aVar.f1544e.T));
                    break;
                case 16:
                    c0024a.b(16, typedArray.getDimensionPixelSize(index, aVar.f1544e.P));
                    break;
                case 17:
                    c0024a.b(17, typedArray.getDimensionPixelOffset(index, aVar.f1544e.f1571f));
                    break;
                case 18:
                    c0024a.b(18, typedArray.getDimensionPixelOffset(index, aVar.f1544e.f1573g));
                    break;
                case 19:
                    c0024a.a(19, typedArray.getFloat(index, aVar.f1544e.f1575h));
                    break;
                case 20:
                    c0024a.a(20, typedArray.getFloat(index, aVar.f1544e.f1602y));
                    break;
                case 21:
                    c0024a.b(21, typedArray.getLayoutDimension(index, aVar.f1544e.f1569e));
                    break;
                case 22:
                    c0024a.b(22, f1531g[typedArray.getInt(index, aVar.f1542c.f1620b)]);
                    break;
                case 23:
                    c0024a.b(23, typedArray.getLayoutDimension(index, aVar.f1544e.f1567d));
                    break;
                case 24:
                    c0024a.b(24, typedArray.getDimensionPixelSize(index, aVar.f1544e.H));
                    break;
                case 27:
                    c0024a.b(27, typedArray.getInt(index, aVar.f1544e.G));
                    break;
                case 28:
                    c0024a.b(28, typedArray.getDimensionPixelSize(index, aVar.f1544e.I));
                    break;
                case 31:
                    c0024a.b(31, typedArray.getDimensionPixelSize(index, aVar.f1544e.M));
                    break;
                case 34:
                    c0024a.b(34, typedArray.getDimensionPixelSize(index, aVar.f1544e.J));
                    break;
                case 37:
                    c0024a.a(37, typedArray.getFloat(index, aVar.f1544e.f1603z));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, aVar.f1540a);
                    aVar.f1540a = resourceId;
                    c0024a.b(38, resourceId);
                    break;
                case 39:
                    c0024a.a(39, typedArray.getFloat(index, aVar.f1544e.W));
                    break;
                case 40:
                    c0024a.a(40, typedArray.getFloat(index, aVar.f1544e.V));
                    break;
                case 41:
                    c0024a.b(41, typedArray.getInt(index, aVar.f1544e.X));
                    break;
                case 42:
                    c0024a.b(42, typedArray.getInt(index, aVar.f1544e.Y));
                    break;
                case 43:
                    c0024a.a(43, typedArray.getFloat(index, aVar.f1542c.f1622d));
                    break;
                case 44:
                    c0024a.d(44, true);
                    c0024a.a(44, typedArray.getDimension(index, aVar.f1545f.f1638n));
                    break;
                case 45:
                    c0024a.a(45, typedArray.getFloat(index, aVar.f1545f.f1627c));
                    break;
                case 46:
                    c0024a.a(46, typedArray.getFloat(index, aVar.f1545f.f1628d));
                    break;
                case 47:
                    c0024a.a(47, typedArray.getFloat(index, aVar.f1545f.f1629e));
                    break;
                case 48:
                    c0024a.a(48, typedArray.getFloat(index, aVar.f1545f.f1630f));
                    break;
                case 49:
                    c0024a.a(49, typedArray.getDimension(index, aVar.f1545f.f1631g));
                    break;
                case 50:
                    c0024a.a(50, typedArray.getDimension(index, aVar.f1545f.f1632h));
                    break;
                case 51:
                    c0024a.a(51, typedArray.getDimension(index, aVar.f1545f.f1634j));
                    break;
                case 52:
                    c0024a.a(52, typedArray.getDimension(index, aVar.f1545f.f1635k));
                    break;
                case 53:
                    c0024a.a(53, typedArray.getDimension(index, aVar.f1545f.f1636l));
                    break;
                case 54:
                    c0024a.b(54, typedArray.getInt(index, aVar.f1544e.Z));
                    break;
                case 55:
                    c0024a.b(55, typedArray.getInt(index, aVar.f1544e.f1562a0));
                    break;
                case 56:
                    c0024a.b(56, typedArray.getDimensionPixelSize(index, aVar.f1544e.f1564b0));
                    break;
                case 57:
                    c0024a.b(57, typedArray.getDimensionPixelSize(index, aVar.f1544e.f1566c0));
                    break;
                case 58:
                    c0024a.b(58, typedArray.getDimensionPixelSize(index, aVar.f1544e.f1568d0));
                    break;
                case 59:
                    c0024a.b(59, typedArray.getDimensionPixelSize(index, aVar.f1544e.f1570e0));
                    break;
                case 60:
                    c0024a.a(60, typedArray.getFloat(index, aVar.f1545f.f1626b));
                    break;
                case 62:
                    c0024a.b(62, typedArray.getDimensionPixelSize(index, aVar.f1544e.C));
                    break;
                case 63:
                    c0024a.a(63, typedArray.getFloat(index, aVar.f1544e.D));
                    break;
                case 64:
                    c0024a.b(64, m(typedArray, index, aVar.f1543d.f1606b));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        c0024a.c(65, typedArray.getString(index));
                    } else {
                        c0024a.c(65, t.a.f27388c[typedArray.getInteger(index, 0)]);
                    }
                    break;
                case 66:
                    c0024a.b(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    c0024a.a(67, typedArray.getFloat(index, aVar.f1543d.f1613i));
                    break;
                case 68:
                    c0024a.a(68, typedArray.getFloat(index, aVar.f1542c.f1623e));
                    break;
                case 69:
                    c0024a.a(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    c0024a.a(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    c0024a.b(72, typedArray.getInt(index, aVar.f1544e.f1576h0));
                    break;
                case 73:
                    c0024a.b(73, typedArray.getDimensionPixelSize(index, aVar.f1544e.f1578i0));
                    break;
                case 74:
                    c0024a.c(74, typedArray.getString(index));
                    break;
                case 75:
                    c0024a.d(75, typedArray.getBoolean(index, aVar.f1544e.f1592p0));
                    break;
                case 76:
                    c0024a.b(76, typedArray.getInt(index, aVar.f1543d.f1609e));
                    break;
                case 77:
                    c0024a.c(77, typedArray.getString(index));
                    break;
                case 78:
                    c0024a.b(78, typedArray.getInt(index, aVar.f1542c.f1621c));
                    break;
                case 79:
                    c0024a.a(79, typedArray.getFloat(index, aVar.f1543d.f1611g));
                    break;
                case 80:
                    c0024a.d(80, typedArray.getBoolean(index, aVar.f1544e.f1588n0));
                    break;
                case 81:
                    c0024a.d(81, typedArray.getBoolean(index, aVar.f1544e.f1590o0));
                    break;
                case 82:
                    c0024a.b(82, typedArray.getInteger(index, aVar.f1543d.f1607c));
                    break;
                case 83:
                    c0024a.b(83, m(typedArray, index, aVar.f1545f.f1633i));
                    break;
                case 84:
                    c0024a.b(84, typedArray.getInteger(index, aVar.f1543d.f1615k));
                    break;
                case 85:
                    c0024a.a(85, typedArray.getFloat(index, aVar.f1543d.f1614j));
                    break;
                case 86:
                    int i11 = typedArray.peekValue(index).type;
                    if (i11 == 1) {
                        aVar.f1543d.f1618n = typedArray.getResourceId(index, -1);
                        c0024a.b(89, aVar.f1543d.f1618n);
                        c cVar = aVar.f1543d;
                        if (cVar.f1618n != -1) {
                            cVar.f1617m = -2;
                            c0024a.b(88, -2);
                        }
                    } else if (i11 == 3) {
                        aVar.f1543d.f1616l = typedArray.getString(index);
                        c0024a.c(90, aVar.f1543d.f1616l);
                        if (aVar.f1543d.f1616l.indexOf("/") > 0) {
                            aVar.f1543d.f1618n = typedArray.getResourceId(index, -1);
                            c0024a.b(89, aVar.f1543d.f1618n);
                            aVar.f1543d.f1617m = -2;
                            c0024a.b(88, -2);
                        } else {
                            aVar.f1543d.f1617m = -1;
                            c0024a.b(88, -1);
                        }
                    } else {
                        c cVar2 = aVar.f1543d;
                        cVar2.f1617m = typedArray.getInteger(index, cVar2.f1618n);
                        c0024a.b(88, aVar.f1543d.f1617m);
                    }
                    break;
                case 87:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f1532h.get(index));
                    break;
                case 93:
                    c0024a.b(93, typedArray.getDimensionPixelSize(index, aVar.f1544e.N));
                    break;
                case 94:
                    c0024a.b(94, typedArray.getDimensionPixelSize(index, aVar.f1544e.U));
                    break;
                case 95:
                    n(c0024a, typedArray, index, 0);
                    break;
                case 96:
                    n(c0024a, typedArray, index, 1);
                    break;
                case 97:
                    c0024a.b(97, typedArray.getInt(index, aVar.f1544e.f1594q0));
                    break;
                case 98:
                    if (x.b.I) {
                        int resourceId2 = typedArray.getResourceId(index, aVar.f1540a);
                        aVar.f1540a = resourceId2;
                        if (resourceId2 == -1) {
                            aVar.f1541b = typedArray.getString(index);
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        aVar.f1541b = typedArray.getString(index);
                    } else {
                        aVar.f1540a = typedArray.getResourceId(index, aVar.f1540a);
                    }
                    break;
                case 99:
                    c0024a.d(99, typedArray.getBoolean(index, aVar.f1544e.f1577i));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f1539f.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f1539f.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + x.a.a(childAt));
            } else {
                if (this.f1538e && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f1539f.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = (a) this.f1539f.get(Integer.valueOf(id2));
                        if (aVar != null) {
                            if (childAt instanceof Barrier) {
                                aVar.f1544e.f1580j0 = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id2);
                                barrier.setType(aVar.f1544e.f1576h0);
                                barrier.setMargin(aVar.f1544e.f1578i0);
                                barrier.setAllowsGoneWidget(aVar.f1544e.f1592p0);
                                b bVar = aVar.f1544e;
                                int[] iArr = bVar.f1582k0;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = bVar.f1584l0;
                                    if (str != null) {
                                        bVar.f1582k0 = h(barrier, str);
                                        barrier.setReferencedIds(aVar.f1544e.f1582k0);
                                    }
                                }
                            }
                            ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                            bVar2.a();
                            aVar.b(bVar2);
                            if (z10) {
                                androidx.constraintlayout.widget.a.c(childAt, aVar.f1546g);
                            }
                            childAt.setLayoutParams(bVar2);
                            C0025d c0025d = aVar.f1542c;
                            if (c0025d.f1621c == 0) {
                                childAt.setVisibility(c0025d.f1620b);
                            }
                            childAt.setAlpha(aVar.f1542c.f1622d);
                            childAt.setRotation(aVar.f1545f.f1626b);
                            childAt.setRotationX(aVar.f1545f.f1627c);
                            childAt.setRotationY(aVar.f1545f.f1628d);
                            childAt.setScaleX(aVar.f1545f.f1629e);
                            childAt.setScaleY(aVar.f1545f.f1630f);
                            e eVar = aVar.f1545f;
                            if (eVar.f1633i != -1) {
                                if (((View) childAt.getParent()).findViewById(aVar.f1545f.f1633i) != null) {
                                    float top = (r4.getTop() + r4.getBottom()) / 2.0f;
                                    float left = (r4.getLeft() + r4.getRight()) / 2.0f;
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        childAt.setPivotX(left - childAt.getLeft());
                                        childAt.setPivotY(top - childAt.getTop());
                                    }
                                }
                            } else {
                                if (!Float.isNaN(eVar.f1631g)) {
                                    childAt.setPivotX(aVar.f1545f.f1631g);
                                }
                                if (!Float.isNaN(aVar.f1545f.f1632h)) {
                                    childAt.setPivotY(aVar.f1545f.f1632h);
                                }
                            }
                            childAt.setTranslationX(aVar.f1545f.f1634j);
                            childAt.setTranslationY(aVar.f1545f.f1635k);
                            childAt.setTranslationZ(aVar.f1545f.f1636l);
                            e eVar2 = aVar.f1545f;
                            if (eVar2.f1637m) {
                                childAt.setElevation(eVar2.f1638n);
                            }
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar2 = (a) this.f1539f.get(num);
            if (aVar2 != null) {
                if (aVar2.f1544e.f1580j0 == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    b bVar3 = aVar2.f1544e;
                    int[] iArr2 = bVar3.f1582k0;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = bVar3.f1584l0;
                        if (str2 != null) {
                            bVar3.f1582k0 = h(barrier2, str2);
                            barrier2.setReferencedIds(aVar2.f1544e.f1582k0);
                        }
                    }
                    barrier2.setType(aVar2.f1544e.f1576h0);
                    barrier2.setMargin(aVar2.f1544e.f1578i0);
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.o();
                    aVar2.b(bVarGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, bVarGenerateDefaultLayoutParams);
                }
                if (aVar2.f1544e.f1561a) {
                    View guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    aVar2.b(bVarGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, bVarGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = constraintLayout.getChildAt(i11);
            if (childAt2 instanceof androidx.constraintlayout.widget.b) {
                ((androidx.constraintlayout.widget.b) childAt2).f(constraintLayout);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f1539f.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f1538e && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f1539f.containsKey(Integer.valueOf(id2))) {
                this.f1539f.put(Integer.valueOf(id2), new a());
            }
            a aVar = (a) this.f1539f.get(Integer.valueOf(id2));
            if (aVar != null) {
                aVar.f1546g = androidx.constraintlayout.widget.a.a(this.f1537d, childAt);
                aVar.d(id2, bVar);
                aVar.f1542c.f1620b = childAt.getVisibility();
                aVar.f1542c.f1622d = childAt.getAlpha();
                aVar.f1545f.f1626b = childAt.getRotation();
                aVar.f1545f.f1627c = childAt.getRotationX();
                aVar.f1545f.f1628d = childAt.getRotationY();
                aVar.f1545f.f1629e = childAt.getScaleX();
                aVar.f1545f.f1630f = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != 0.0d || pivotY != 0.0d) {
                    e eVar = aVar.f1545f;
                    eVar.f1631g = pivotX;
                    eVar.f1632h = pivotY;
                }
                aVar.f1545f.f1634j = childAt.getTranslationX();
                aVar.f1545f.f1635k = childAt.getTranslationY();
                aVar.f1545f.f1636l = childAt.getTranslationZ();
                e eVar2 = aVar.f1545f;
                if (eVar2.f1637m) {
                    eVar2.f1638n = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    aVar.f1544e.f1592p0 = barrier.getAllowsGoneWidget();
                    aVar.f1544e.f1582k0 = barrier.getReferencedIds();
                    aVar.f1544e.f1576h0 = barrier.getType();
                    aVar.f1544e.f1578i0 = barrier.getMargin();
                }
            }
        }
    }

    public void g(int i10, int i11, int i12, float f10) {
        b bVar = j(i10).f1544e;
        bVar.B = i11;
        bVar.C = i12;
        bVar.D = f10;
    }

    public void k(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    a aVarI = i(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarI.f1544e.f1561a = true;
                    }
                    this.f1539f.put(Integer.valueOf(aVarI.f1540a), aVarI);
                }
            }
        } catch (IOException e10) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e10);
        } catch (XmlPullParserException e11) {
            Log.e("ConstraintSet", "Error parsing resource: " + i10, e11);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:245:0x01ae, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void l(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.d.l(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }
}
