package kj;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.SortedSet;
import java.util.function.Supplier;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParserFactory;
import kj.x0;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import zj.s;

/* JADX INFO: loaded from: classes3.dex */
class f0 extends kj.a implements d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final bk.j f20074d = bk.j.k("ms");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final bk.j f20075e = bk.j.k("mas");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final bk.j f20076f = bk.j.k("as/day");

    private enum a {
        UNKNOWN,
        BULLETIN_A,
        BULLETIN_B,
        EOP_C04,
        DAILY,
        FINAL
    }

    static class b extends kj.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private List f20084d;

        private class a extends DefaultHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private boolean f20085a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f20086b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f20087c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private int f20088d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private int f20089e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private yj.b f20090f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private double f20091g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private double f20092h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private double f20093i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private double f20094j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            private double f20095k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private double f20096l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            private double f20097m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            private double f20098n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            private double f20099o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            private double f20100p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private final String f20101q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            private final StringBuilder f20102r = new StringBuilder();

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            private a f20103s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            private x0.b f20104t;

            a(String str) {
                this.f20101q = str;
            }

            private void a() {
                if (new yj.i(this.f20086b, this.f20087c, this.f20088d).g() != this.f20089e) {
                    throw new hj.a(hj.f.INCONSISTENT_DATES_IN_IERS_FILE, this.f20101q, Integer.valueOf(this.f20086b), Integer.valueOf(this.f20087c), Integer.valueOf(this.f20088d), Integer.valueOf(this.f20089e));
                }
            }

            private void b(String str) {
                double[] dArrA;
                double[] dArrB;
                if (str.equals("dateYear") && this.f20102r.length() > 0) {
                    this.f20086b = Integer.parseInt(this.f20102r.toString());
                    return;
                }
                if (str.equals("dateMonth") && this.f20102r.length() > 0) {
                    this.f20087c = Integer.parseInt(this.f20102r.toString());
                    return;
                }
                if (str.equals("dateDay") && this.f20102r.length() > 0) {
                    this.f20088d = Integer.parseInt(this.f20102r.toString());
                    return;
                }
                if (str.equals("MJD") && this.f20102r.length() > 0) {
                    this.f20089e = Integer.parseInt(this.f20102r.toString());
                    this.f20090f = new yj.b(new yj.i(yj.i.f32661e, this.f20089e), b.this.d());
                    return;
                }
                if (str.equals("UT1-UTC")) {
                    this.f20091g = d(this.f20091g, bk.j.f4165u);
                    return;
                }
                if (str.equals("LOD")) {
                    this.f20092h = d(this.f20092h, f0.f20074d);
                    return;
                }
                if (str.equals("X")) {
                    this.f20093i = d(this.f20093i, bk.j.I);
                    return;
                }
                if (str.equals("Y")) {
                    this.f20094j = d(this.f20094j, bk.j.I);
                    return;
                }
                if (str.equals("x_rate")) {
                    this.f20095k = d(this.f20095k, f0.f20076f);
                    return;
                }
                if (str.equals("y_rate")) {
                    this.f20096l = d(this.f20096l, f0.f20076f);
                    return;
                }
                if (str.equals("dPsi")) {
                    this.f20097m = d(this.f20097m, f0.f20075e);
                    return;
                }
                if (str.equals("dEpsilon")) {
                    this.f20098n = d(this.f20098n, f0.f20075e);
                    return;
                }
                if (str.equals("dX")) {
                    this.f20099o = d(this.f20099o, f0.f20075e);
                    return;
                }
                if (str.equals("dY")) {
                    this.f20100p = d(this.f20100p, f0.f20075e);
                    return;
                }
                if (str.equals("pole") || str.equals("UT") || str.equals("nutation")) {
                    this.f20085a = false;
                    return;
                }
                if (str.equals("dataEOP")) {
                    a();
                    if (Double.isNaN(this.f20091g) || Double.isNaN(this.f20093i) || Double.isNaN(this.f20094j)) {
                        return;
                    }
                    if (Double.isNaN(this.f20097m)) {
                        dArrB = new double[]{this.f20099o, this.f20100p};
                        dArrA = b.this.b().a(this.f20090f, dArrB[0], dArrB[1]);
                    } else {
                        dArrA = new double[]{this.f20097m, this.f20098n};
                        dArrB = b.this.b().b(this.f20090f, dArrA[0], dArrA[1]);
                    }
                    x0.b bVar = this.f20104t;
                    if (bVar == null || !bVar.c(this.f20089e)) {
                        this.f20104t = b.this.c().a(this.f20101q, this.f20089e);
                    }
                    b.this.f20084d.add(new i(this.f20089e, this.f20091g, this.f20092h, this.f20093i, this.f20094j, Double.NaN, Double.NaN, dArrA[0], dArrA[1], dArrB[0], dArrB[1], this.f20104t.b(), this.f20090f));
                }
            }

            private void c(String str) {
                double[] dArrA;
                double[] dArrB;
                if (str.equals("date") && this.f20102r.length() > 0) {
                    String[] strArrSplit = this.f20102r.toString().split("-");
                    if (strArrSplit.length == 3) {
                        this.f20086b = Integer.parseInt(strArrSplit[0]);
                        this.f20087c = Integer.parseInt(strArrSplit[1]);
                        this.f20088d = Integer.parseInt(strArrSplit[2]);
                        return;
                    }
                    return;
                }
                if (str.equals("MJD") && this.f20102r.length() > 0) {
                    this.f20089e = Integer.parseInt(this.f20102r.toString());
                    this.f20090f = new yj.b(new yj.i(yj.i.f32661e, this.f20089e), b.this.d());
                    return;
                }
                if (str.equals("UT1_UTC")) {
                    this.f20091g = d(this.f20091g, bk.j.f4165u);
                    return;
                }
                if (str.equals("LOD")) {
                    this.f20092h = d(this.f20092h, f0.f20074d);
                    return;
                }
                if (str.equals("X")) {
                    this.f20093i = d(this.f20093i, bk.j.I);
                    return;
                }
                if (str.equals("Y")) {
                    this.f20094j = d(this.f20094j, bk.j.I);
                    return;
                }
                if (str.equals("x_rate")) {
                    this.f20095k = d(this.f20095k, f0.f20076f);
                    return;
                }
                if (str.equals("y_rate")) {
                    this.f20096l = d(this.f20096l, f0.f20076f);
                    return;
                }
                if (str.equals("dPsi")) {
                    this.f20097m = d(this.f20097m, f0.f20075e);
                    return;
                }
                if (str.equals("dEpsilon")) {
                    this.f20098n = d(this.f20098n, f0.f20075e);
                    return;
                }
                if (str.equals("dX")) {
                    this.f20099o = d(this.f20099o, f0.f20075e);
                    return;
                }
                if (str.equals("dY")) {
                    this.f20100p = d(this.f20100p, f0.f20075e);
                    return;
                }
                if (str.equals("bulletinA")) {
                    this.f20085a = false;
                    return;
                }
                if (str.equals("EOPSet")) {
                    a();
                    if (Double.isNaN(this.f20091g) || Double.isNaN(this.f20093i) || Double.isNaN(this.f20094j)) {
                        return;
                    }
                    if (Double.isNaN(this.f20097m)) {
                        dArrB = new double[]{this.f20099o, this.f20100p};
                        dArrA = b.this.b().a(this.f20090f, dArrB[0], dArrB[1]);
                    } else {
                        dArrA = new double[]{this.f20097m, this.f20098n};
                        dArrB = b.this.b().b(this.f20090f, dArrA[0], dArrA[1]);
                    }
                    x0.b bVar = this.f20104t;
                    if (bVar == null || !bVar.c(this.f20089e)) {
                        this.f20104t = b.this.c().a(this.f20101q, this.f20089e);
                    }
                    double[] dArr = dArrB;
                    double[] dArr2 = dArrA;
                    b.this.f20084d.add(new i(this.f20089e, this.f20091g, this.f20092h, this.f20093i, this.f20094j, this.f20095k, this.f20096l, dArr2[0], dArr2[1], dArr[0], dArr[1], this.f20104t.b(), this.f20090f));
                }
            }

            private double d(double d10, bk.j jVar) {
                return (this.f20102r.length() != 0 && (!this.f20085a || Double.isNaN(d10))) ? jVar.p(Double.parseDouble(this.f20102r.toString())) : d10;
            }

            private void e() {
                this.f20085a = false;
                this.f20086b = -1;
                this.f20087c = -1;
                this.f20088d = -1;
                this.f20089e = -1;
                this.f20090f = null;
                this.f20091g = Double.NaN;
                this.f20092h = Double.NaN;
                this.f20093i = Double.NaN;
                this.f20094j = Double.NaN;
                this.f20095k = Double.NaN;
                this.f20096l = Double.NaN;
                this.f20097m = Double.NaN;
                this.f20098n = Double.NaN;
                this.f20099o = Double.NaN;
                this.f20100p = Double.NaN;
            }

            private void f(String str, Attributes attributes) {
                String value;
                if (str.equals("timeSeries")) {
                    e();
                } else if ((str.equals("pole") || str.equals("UT") || str.equals("nutation")) && (value = attributes.getValue("source")) != null) {
                    this.f20085a = value.equals("BulletinA");
                }
            }

            private void g(String str) {
                if (str.equals("EOPSet")) {
                    e();
                } else if (str.equals("bulletinA")) {
                    this.f20085a = true;
                }
            }

            @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
            public void characters(char[] cArr, int i10, int i11) {
                this.f20102r.append(cArr, i10, i11);
            }

            @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
            public void endElement(String str, String str2, String str3) {
                a aVar = this.f20103s;
                if (aVar == a.DAILY || aVar == a.BULLETIN_A || aVar == a.BULLETIN_B || aVar == a.EOP_C04) {
                    b(str3);
                } else if (aVar == a.FINAL) {
                    c(str3);
                }
            }

            @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.EntityResolver
            public InputSource resolveEntity(String str, String str2) {
                return new InputSource();
            }

            @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
            public void startDocument() {
                this.f20103s = a.UNKNOWN;
                this.f20104t = null;
            }

            @Override // org.xml.sax.helpers.DefaultHandler, org.xml.sax.ContentHandler
            public void startElement(String str, String str2, String str3, Attributes attributes) {
                String value;
                StringBuilder sb2 = this.f20102r;
                sb2.delete(0, sb2.length());
                if (this.f20103s == a.UNKNOWN) {
                    if (str3.equals("timeSeries")) {
                        this.f20103s = a.DAILY;
                    } else if (str3.equals("Finals")) {
                        this.f20103s = a.FINAL;
                    } else if (str3.equals("data") && (value = attributes.getValue("product")) != null) {
                        if (value.startsWith("BulletinA")) {
                            this.f20103s = a.BULLETIN_A;
                            this.f20085a = true;
                        } else if (value.startsWith("BulletinB")) {
                            this.f20103s = a.BULLETIN_B;
                        } else if (value.startsWith("EOP") && value.endsWith("C04")) {
                            this.f20103s = a.EOP_C04;
                        }
                    }
                }
                a aVar = this.f20103s;
                if (aVar == a.DAILY || aVar == a.BULLETIN_A || aVar == a.BULLETIN_B || aVar == a.EOP_C04) {
                    f(str3, attributes);
                } else if (aVar == a.FINAL) {
                    g(str3);
                }
            }
        }

        b(s.g gVar, z0 z0Var, yj.b0 b0Var) {
            super(gVar, z0Var, b0Var);
        }

        @Override // kj.d0.a
        public Collection a(InputStream inputStream, String str) {
            try {
                this.f20084d = new ArrayList();
                SAXParserFactory.newInstance().newSAXParser().parse(new InputSource(new InputStreamReader(inputStream, StandardCharsets.UTF_8)), new a(str));
                return this.f20084d;
            } catch (ParserConfigurationException | SAXException e10) {
                throw new hj.a(e10, ui.d.SIMPLE_MESSAGE, e10.getMessage());
            }
        }
    }

    f0(String str, gj.g gVar, Supplier supplier) {
        super(str, gVar, supplier);
    }

    @Override // kj.d0
    public void a(s.g gVar, SortedSet sortedSet) {
        e0 e0Var = new e0(new b(gVar, new x0("itrf-versions.conf", e()), g()));
        d(e0Var);
        sortedSet.addAll(e0Var.b());
    }
}
