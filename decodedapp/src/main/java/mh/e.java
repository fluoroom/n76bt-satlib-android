package mh;

import androidx.appcompat.widget.ActivityChooserView;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import vh.n0;

/* JADX INFO: loaded from: classes3.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f22118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d[] f22119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map f22120c;

    static {
        e eVar = new e();
        f22118a = eVar;
        d dVar = new d(d.f22114j, "");
        vh.h hVar = d.f22111g;
        d dVar2 = new d(hVar, "GET");
        d dVar3 = new d(hVar, "POST");
        vh.h hVar2 = d.f22112h;
        d dVar4 = new d(hVar2, "/");
        d dVar5 = new d(hVar2, "/index.html");
        vh.h hVar3 = d.f22113i;
        d dVar6 = new d(hVar3, "http");
        d dVar7 = new d(hVar3, "https");
        vh.h hVar4 = d.f22110f;
        f22119b = new d[]{dVar, dVar2, dVar3, dVar4, dVar5, dVar6, dVar7, new d(hVar4, "200"), new d(hVar4, "204"), new d(hVar4, "206"), new d(hVar4, "304"), new d(hVar4, "400"), new d(hVar4, "404"), new d(hVar4, "500"), new d("accept-charset", ""), new d("accept-encoding", "gzip, deflate"), new d("accept-language", ""), new d("accept-ranges", ""), new d("accept", ""), new d("access-control-allow-origin", ""), new d("age", ""), new d("allow", ""), new d("authorization", ""), new d("cache-control", ""), new d("content-disposition", ""), new d("content-encoding", ""), new d("content-language", ""), new d("content-length", ""), new d("content-location", ""), new d("content-range", ""), new d("content-type", ""), new d("cookie", ""), new d("date", ""), new d("etag", ""), new d("expect", ""), new d("expires", ""), new d("from", ""), new d("host", ""), new d("if-match", ""), new d("if-modified-since", ""), new d("if-none-match", ""), new d("if-range", ""), new d("if-unmodified-since", ""), new d("last-modified", ""), new d("link", ""), new d("location", ""), new d("max-forwards", ""), new d("proxy-authenticate", ""), new d("proxy-authorization", ""), new d("range", ""), new d("referer", ""), new d("refresh", ""), new d("retry-after", ""), new d("server", ""), new d("set-cookie", ""), new d("strict-transport-security", ""), new d("transfer-encoding", ""), new d("user-agent", ""), new d("vary", ""), new d("via", ""), new d("www-authenticate", "")};
        f22120c = eVar.d();
    }

    private e() {
    }

    private final Map d() {
        d[] dVarArr = f22119b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(dVarArr.length, 1.0f);
        int length = dVarArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            d[] dVarArr2 = f22119b;
            if (!linkedHashMap.containsKey(dVarArr2[i10].f22115a)) {
                linkedHashMap.put(dVarArr2[i10].f22115a, Integer.valueOf(i10));
            }
        }
        Map mapUnmodifiableMap = DesugarCollections.unmodifiableMap(linkedHashMap);
        rd.m.d(mapUnmodifiableMap, "unmodifiableMap(...)");
        return mapUnmodifiableMap;
    }

    public final vh.h a(vh.h hVar) throws IOException {
        rd.m.e(hVar, "name");
        int iQ = hVar.Q();
        for (int i10 = 0; i10 < iQ; i10++) {
            byte bH = hVar.h(i10);
            if (65 <= bH && bH < 91) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.Z());
            }
        }
        return hVar;
    }

    public final Map b() {
        return f22120c;
    }

    public final d[] c() {
        return f22119b;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f22121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f22122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f22123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final vh.g f22124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public d[] f22125e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f22126f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22127g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22128h;

        public a(n0 n0Var, int i10, int i11) {
            rd.m.e(n0Var, "source");
            this.f22121a = i10;
            this.f22122b = i11;
            this.f22123c = new ArrayList();
            this.f22124d = vh.z.c(n0Var);
            this.f22125e = new d[8];
            this.f22126f = r2.length - 1;
        }

        private final void a() {
            int i10 = this.f22122b;
            int i11 = this.f22128h;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    d(i11 - i10);
                }
            }
        }

        private final void b() {
            ed.j.s(this.f22125e, null, 0, 0, 6, null);
            this.f22126f = this.f22125e.length - 1;
            this.f22127g = 0;
            this.f22128h = 0;
        }

        private final int c(int i10) {
            return this.f22126f + 1 + i10;
        }

        private final int d(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f22125e.length;
                while (true) {
                    length--;
                    i11 = this.f22126f;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    d dVar = this.f22125e[length];
                    rd.m.b(dVar);
                    int i13 = dVar.f22117c;
                    i10 -= i13;
                    this.f22128h -= i13;
                    this.f22127g--;
                    i12++;
                }
                d[] dVarArr = this.f22125e;
                System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f22127g);
                this.f22126f += i12;
            }
            return i12;
        }

        private final vh.h f(int i10) throws IOException {
            if (h(i10)) {
                return e.f22118a.c()[i10].f22115a;
            }
            int iC = c(i10 - e.f22118a.c().length);
            if (iC >= 0) {
                d[] dVarArr = this.f22125e;
                if (iC < dVarArr.length) {
                    d dVar = dVarArr[iC];
                    rd.m.b(dVar);
                    return dVar.f22115a;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void g(int i10, d dVar) {
            this.f22123c.add(dVar);
            int i11 = dVar.f22117c;
            if (i10 != -1) {
                d dVar2 = this.f22125e[c(i10)];
                rd.m.b(dVar2);
                i11 -= dVar2.f22117c;
            }
            int i12 = this.f22122b;
            if (i11 > i12) {
                b();
                return;
            }
            int iD = d((this.f22128h + i11) - i12);
            if (i10 == -1) {
                int i13 = this.f22127g + 1;
                d[] dVarArr = this.f22125e;
                if (i13 > dVarArr.length) {
                    d[] dVarArr2 = new d[dVarArr.length * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f22126f = this.f22125e.length - 1;
                    this.f22125e = dVarArr2;
                }
                int i14 = this.f22126f;
                this.f22126f = i14 - 1;
                this.f22125e[i14] = dVar;
                this.f22127g++;
            } else {
                this.f22125e[i10 + c(i10) + iD] = dVar;
            }
            this.f22128h += i11;
        }

        private final boolean h(int i10) {
            return i10 >= 0 && i10 <= e.f22118a.c().length - 1;
        }

        private final int i() {
            return fh.m.b(this.f22124d.readByte(), 255);
        }

        private final void l(int i10) throws IOException {
            if (h(i10)) {
                this.f22123c.add(e.f22118a.c()[i10]);
                return;
            }
            int iC = c(i10 - e.f22118a.c().length);
            if (iC >= 0) {
                d[] dVarArr = this.f22125e;
                if (iC < dVarArr.length) {
                    List list = this.f22123c;
                    d dVar = dVarArr[iC];
                    rd.m.b(dVar);
                    list.add(dVar);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i10 + 1));
        }

        private final void n(int i10) {
            g(-1, new d(f(i10), j()));
        }

        private final void o() {
            g(-1, new d(e.f22118a.a(j()), j()));
        }

        private final void p(int i10) throws IOException {
            this.f22123c.add(new d(f(i10), j()));
        }

        private final void q() throws IOException {
            this.f22123c.add(new d(e.f22118a.a(j()), j()));
        }

        public final List e() {
            List listH0 = ed.q.H0(this.f22123c);
            this.f22123c.clear();
            return listH0;
        }

        public final vh.h j() {
            int i10 = i();
            boolean z10 = (i10 & 128) == 128;
            long jM = m(i10, 127);
            if (!z10) {
                return this.f22124d.p(jM);
            }
            vh.e eVar = new vh.e();
            x.f22263a.b(this.f22124d, jM, eVar);
            return eVar.Q();
        }

        public final void k() throws IOException {
            while (!this.f22124d.z()) {
                int iB = fh.m.b(this.f22124d.readByte(), 255);
                if (iB == 128) {
                    throw new IOException("index == 0");
                }
                if ((iB & 128) == 128) {
                    l(m(iB, 127) - 1);
                } else if (iB == 64) {
                    o();
                } else if ((iB & 64) == 64) {
                    n(m(iB, 63) - 1);
                } else if ((iB & 32) == 32) {
                    int iM = m(iB, 31);
                    this.f22122b = iM;
                    if (iM < 0 || iM > this.f22121a) {
                        throw new IOException("Invalid dynamic table size update " + this.f22122b);
                    }
                    a();
                } else if (iB == 16 || iB == 0) {
                    q();
                } else {
                    p(m(iB, 15) - 1);
                }
            }
        }

        public final int m(int i10, int i11) {
            int i12 = i10 & i11;
            if (i12 < i11) {
                return i12;
            }
            int i13 = 0;
            while (true) {
                int i14 = i();
                if ((i14 & 128) == 0) {
                    return i11 + (i14 << i13);
                }
                i11 += (i14 & 127) << i13;
                i13 += 7;
            }
        }

        public /* synthetic */ a(n0 n0Var, int i10, int i11, int i12, rd.h hVar) {
            this(n0Var, i10, (i12 & 4) != 0 ? i10 : i11);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f22130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final vh.e f22131c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f22132d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f22133e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22134f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public d[] f22135g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f22136h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f22137i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f22138j;

        public b(int i10, boolean z10, vh.e eVar) {
            rd.m.e(eVar, "out");
            this.f22129a = i10;
            this.f22130b = z10;
            this.f22131c = eVar;
            this.f22132d = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            this.f22134f = i10;
            this.f22135g = new d[8];
            this.f22136h = r2.length - 1;
        }

        private final void a() {
            int i10 = this.f22134f;
            int i11 = this.f22138j;
            if (i10 < i11) {
                if (i10 == 0) {
                    b();
                } else {
                    c(i11 - i10);
                }
            }
        }

        private final void b() {
            ed.j.s(this.f22135g, null, 0, 0, 6, null);
            this.f22136h = this.f22135g.length - 1;
            this.f22137i = 0;
            this.f22138j = 0;
        }

        private final int c(int i10) {
            int i11;
            int i12 = 0;
            if (i10 > 0) {
                int length = this.f22135g.length;
                while (true) {
                    length--;
                    i11 = this.f22136h;
                    if (length < i11 || i10 <= 0) {
                        break;
                    }
                    d dVar = this.f22135g[length];
                    rd.m.b(dVar);
                    i10 -= dVar.f22117c;
                    int i13 = this.f22138j;
                    d dVar2 = this.f22135g[length];
                    rd.m.b(dVar2);
                    this.f22138j = i13 - dVar2.f22117c;
                    this.f22137i--;
                    i12++;
                }
                d[] dVarArr = this.f22135g;
                System.arraycopy(dVarArr, i11 + 1, dVarArr, i11 + 1 + i12, this.f22137i);
                d[] dVarArr2 = this.f22135g;
                int i14 = this.f22136h;
                Arrays.fill(dVarArr2, i14 + 1, i14 + 1 + i12, (Object) null);
                this.f22136h += i12;
            }
            return i12;
        }

        private final void d(d dVar) {
            int i10 = dVar.f22117c;
            int i11 = this.f22134f;
            if (i10 > i11) {
                b();
                return;
            }
            c((this.f22138j + i10) - i11);
            int i12 = this.f22137i + 1;
            d[] dVarArr = this.f22135g;
            if (i12 > dVarArr.length) {
                d[] dVarArr2 = new d[dVarArr.length * 2];
                System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                this.f22136h = this.f22135g.length - 1;
                this.f22135g = dVarArr2;
            }
            int i13 = this.f22136h;
            this.f22136h = i13 - 1;
            this.f22135g[i13] = dVar;
            this.f22137i++;
            this.f22138j += i10;
        }

        public final void e(int i10) {
            this.f22129a = i10;
            int iMin = Math.min(i10, 16384);
            int i11 = this.f22134f;
            if (i11 == iMin) {
                return;
            }
            if (iMin < i11) {
                this.f22132d = Math.min(this.f22132d, iMin);
            }
            this.f22133e = true;
            this.f22134f = iMin;
            a();
        }

        public final void f(vh.h hVar) {
            rd.m.e(hVar, "data");
            if (this.f22130b) {
                x xVar = x.f22263a;
                if (xVar.d(hVar) < hVar.Q()) {
                    vh.e eVar = new vh.e();
                    xVar.c(hVar, eVar);
                    vh.h hVarQ = eVar.Q();
                    h(hVarQ.Q(), 127, 128);
                    this.f22131c.Z(hVarQ);
                    return;
                }
            }
            h(hVar.Q(), 127, 0);
            this.f22131c.Z(hVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00c4  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00cc  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void g(java.util.List r13) {
            /*
                Method dump skipped, instruction units count: 264
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: mh.e.b.g(java.util.List):void");
        }

        public final void h(int i10, int i11, int i12) {
            if (i10 < i11) {
                this.f22131c.writeByte(i10 | i12);
                return;
            }
            this.f22131c.writeByte(i12 | i11);
            int i13 = i10 - i11;
            while (i13 >= 128) {
                this.f22131c.writeByte(128 | (i13 & 127));
                i13 >>>= 7;
            }
            this.f22131c.writeByte(i13);
        }

        public /* synthetic */ b(int i10, boolean z10, vh.e eVar, int i11, rd.h hVar) {
            this((i11 & 1) != 0 ? 4096 : i10, (i11 & 2) != 0 ? true : z10, eVar);
        }
    }
}
