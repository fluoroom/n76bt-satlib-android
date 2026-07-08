package a4;

import a4.a;
import a6.q;
import androidx.appcompat.widget.ActivityChooserView;
import com.facebook.stetho.websocket.CloseCodes;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import d4.e;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class b implements w3.a {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static float f280u = 0.01f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static float f281v = 0.01f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b6.c f282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b6.c f283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a.C0005a f285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f286e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f287f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f288g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private C0006b f289h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f290i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f291j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f292k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f293l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final StringBuffer f294m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f295n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final e f296o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final ok.b f297p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final i4.b f298q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final double[] f299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final c f301t;

    class a implements e.a {
        a() {
        }

        @Override // d4.e.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C0006b newInstance() {
            return new C0006b();
        }
    }

    /* JADX INFO: renamed from: a4.b$b, reason: collision with other inner class name */
    public static class C0006b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f305c;

        public String toString() {
            return String.format("samp:%d,level:%d,dev:%f", Integer.valueOf(this.f303a), Integer.valueOf(this.f305c ? 1 : 0), Float.valueOf(this.f304b));
        }
    }

    public b(int i10) {
        this(i10, false);
    }

    private void b(boolean z10) {
        int iC = this.f283b.c();
        if (iC >= 10 || (z10 && this.f292k == 0)) {
            this.f301t.c();
            int iMin = Math.min(20, iC);
            for (int i10 = 0; i10 < iMin; i10++) {
                C0006b c0006b = (C0006b) this.f283b.k(i10);
                if (c0006b.f305c) {
                    this.f301t.a(c0006b.f303a);
                }
            }
            int iB = this.f301t.b();
            this.f292k = iB;
            this.f293l = iB * 2;
            this.f295n = iB * 5;
        }
    }

    private void c(b6.c cVar, boolean z10) {
        if (this.f288g) {
            cVar.e();
            return;
        }
        b(z10);
        if (this.f292k == 0) {
            return;
        }
        int iC = cVar.c();
        if (!z10) {
            iC--;
        }
        int i10 = 0;
        while (i10 < iC) {
            C0006b c0006b = (C0006b) cVar.k(i10);
            if (c0006b.f305c) {
                try {
                    if (c0006b.f303a < this.f293l) {
                        this.f285d.b();
                    } else {
                        this.f285d.a();
                    }
                } catch (IllegalStateException unused) {
                    this.f285d.g();
                }
            } else if (!this.f285d.f() && c0006b.f303a > this.f293l) {
                String strD = this.f285d.d();
                if (this.f286e && q.d(strD, "\u0004")) {
                    this.f288g = true;
                    return;
                }
                this.f294m.append(strD);
                this.f285d.g();
                if (c0006b.f303a > this.f295n) {
                    this.f294m.append(' ');
                }
            }
            i10++;
        }
        if (z10) {
            if (!this.f285d.f()) {
                this.f294m.append(this.f285d.d());
                this.f294m.append(' ');
                this.f285d.g();
            }
            cVar.e();
        } else {
            cVar.a(i10);
        }
        if (z10) {
            this.f292k = 0;
        }
    }

    private void g() {
        int iMax;
        int iC = this.f282a.c();
        float f10 = 0.0f;
        int i10 = 0;
        for (int i11 = 0; i11 < iC; i11++) {
            f10 += ((C0006b) this.f282a.k(i11)).f304b;
        }
        float f11 = (f10 / iC) / 2.0f;
        int i12 = this.f292k;
        if (i12 > 0) {
            iMax = Math.max(this.f284c, i12 / 2);
        } else {
            int iMax2 = 0;
            for (int i13 = 0; i13 < iC; i13++) {
                C0006b c0006b = (C0006b) this.f282a.k(i13);
                if (c0006b.f305c && c0006b.f304b > f11) {
                    iMax2 = Math.max(iMax2, c0006b.f303a);
                }
            }
            iMax = Math.max(this.f284c, (iMax2 / 3) / 2);
        }
        float f12 = iMax;
        while (i10 < iC) {
            C0006b c0006b2 = (C0006b) this.f282a.k(i10);
            if (c0006b2.f303a >= f12 && (c0006b2.f304b >= f11 || !c0006b2.f305c)) {
                this.f283b.n(c0006b2);
            } else {
                if (i10 >= iC - 1) {
                    break;
                }
                if (this.f283b.c() > 0) {
                    i10++;
                    C0006b c0006b3 = (C0006b) this.f282a.k(i10);
                    ((C0006b) this.f283b.k(r6.c() - 1)).f303a += c0006b2.f303a + c0006b3.f303a;
                }
            }
            i10++;
        }
        this.f282a.a(i10);
    }

    private void h(float f10) {
        this.f291j++;
        double dC = this.f297p.c(Math.abs(f10));
        double dA = this.f298q.a(dC / 2.0d);
        double[] dArr = this.f299r;
        int i10 = this.f300s;
        double d10 = dArr[i10];
        int i11 = i10 + 1;
        this.f300s = i11;
        dArr[i10] = dC;
        if (i11 >= dArr.length) {
            this.f300s = 0;
        }
        boolean z10 = d10 > dA && d10 > ((double) f280u);
        C0006b c0006b = this.f289h;
        boolean z11 = c0006b.f305c;
        if (z10 == z11) {
            return;
        }
        boolean z12 = !z11;
        c0006b.f303a = this.f291j - this.f290i;
        c0006b.f304b = (float) dA;
        if (!this.f282a.n(c0006b)) {
            k();
            this.f282a.n(this.f289h);
        }
        C0006b c0006b2 = (C0006b) this.f296o.a();
        this.f289h = c0006b2;
        c0006b2.f303a = 0;
        c0006b2.f305c = z12;
        c0006b2.f304b = 0.0f;
        this.f290i = this.f291j;
    }

    private void k() {
        boolean z10 = (this.f291j - this.f290i) / this.f287f > 3;
        if (z10 || this.f282a.c() > 20) {
            g();
        }
        if (this.f283b.c() > (z10 ? 0 : 20)) {
            c(this.f283b, z10);
        }
    }

    @Override // w3.a
    public void a(float[] fArr, int i10, int i11) {
        if (this.f288g) {
            return;
        }
        int i12 = i11 + i10;
        while (i10 < i12) {
            h(fArr[i10]);
            i10++;
        }
        k();
    }

    public int d() {
        return this.f294m.length();
    }

    public int e() {
        if (this.f292k == 0) {
            return 0;
        }
        return Math.round(((this.f287f * 60) / r0) / 50.0f);
    }

    public boolean f() {
        return this.f288g;
    }

    @Override // w3.a
    public void finish() {
        g();
        c(this.f283b, true);
    }

    @Override // w3.a
    public String getText() {
        if (this.f294m.length() == 0) {
            return null;
        }
        return this.f294m.toString();
    }

    public void i(short[] sArr, int i10, int i11) {
        if (this.f288g) {
            return;
        }
        int i12 = i11 + i10;
        while (i10 < i12) {
            h(sArr[i10] / 32768.0f);
            i10++;
        }
        k();
    }

    public void j() {
        this.f288g = false;
        this.f292k = 0;
        this.f285d.g();
        this.f294m.setLength(0);
        this.f289h = new C0006b();
        this.f290i = 0;
        this.f283b.e();
        this.f282a.e();
    }

    private static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ArrayList f306a;

        class a implements Comparator {
            a() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compare(C0007b c0007b, C0007b c0007b2) {
                int i10 = c0007b.f308a;
                int i11 = c0007b2.f308a;
                if (i10 > i11) {
                    return -1;
                }
                return i10 == i11 ? 0 : 1;
            }
        }

        /* JADX INFO: renamed from: a4.b$c$b, reason: collision with other inner class name */
        private static class C0007b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f308a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f309b;

            private C0007b() {
            }

            public boolean a(int i10) {
                int i11 = this.f309b;
                if (i11 * 2 <= i10 || i10 <= i11 / 2) {
                    return false;
                }
                int i12 = this.f308a;
                int i13 = (i11 * i12) + i10;
                int i14 = i12 + 1;
                this.f308a = i14;
                this.f309b = i13 / i14;
                return true;
            }

            /* synthetic */ C0007b(a aVar) {
                this();
            }
        }

        private c() {
            this.f306a = new ArrayList(16);
        }

        public void a(int i10) {
            Iterator it = this.f306a.iterator();
            while (it.hasNext()) {
                if (((C0007b) it.next()).a(i10)) {
                    return;
                }
            }
            C0007b c0007b = new C0007b(null);
            c0007b.f308a = 1;
            c0007b.f309b = i10;
            for (int i11 = 0; i11 < this.f306a.size(); i11++) {
                if (((C0007b) this.f306a.get(i11)).f309b > i10) {
                    this.f306a.add(i11, c0007b);
                    return;
                }
            }
            this.f306a.add(c0007b);
        }

        public int b() {
            if (this.f306a.isEmpty()) {
                return ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            if (this.f306a.size() <= 2) {
                return ((C0007b) this.f306a.get(0)).f309b;
            }
            Collections.sort(this.f306a, new a());
            return Math.min(((C0007b) this.f306a.get(0)).f309b, ((C0007b) this.f306a.get(1)).f309b);
        }

        public void c() {
            this.f306a.clear();
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    public b(int i10, boolean z10) {
        this.f285d = new a.C0005a();
        this.f289h = new C0006b();
        this.f290i = 0;
        this.f294m = new StringBuffer();
        this.f296o = new e(new a());
        this.f301t = new c(null);
        this.f286e = z10;
        this.f282a = new b6.c(new C0006b[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT]);
        this.f283b = new b6.c(new C0006b[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT]);
        int i11 = (i10 * 60) / 10000;
        this.f284c = (i11 / 2) + (i11 / 4);
        ok.b bVar = new ok.b();
        this.f297p = bVar;
        bVar.f(2, i10, 100.0d);
        this.f298q = new i4.b(i10, f281v, 1.0d);
        this.f287f = i10;
        this.f299r = new double[(i10 * 100) / CloseCodes.NORMAL_CLOSURE];
    }
}
