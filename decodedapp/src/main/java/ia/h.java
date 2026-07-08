package ia;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import ha.a;
import ha.c;
import ha.d;
import ha.e;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import ka.k;
import ka.r;
import o8.c;
import q8.j;
import q8.l;
import q8.m;
import q8.n;
import q8.o;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Object f15961r = null;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final DecimalFormat f15962s = new DecimalFormat("#.####");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private o8.c f15963a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ja.a f15964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap f15965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HashMap f15966d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HashMap f15967e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ja.a f15968f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HashMap f15969g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Set f15970h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private b f15971i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f15972j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f15973k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Context f15974l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ArrayList f15975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c.a f15976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final d.a f15977o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final e.a f15978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final a.C0212a f15979q;

    class a implements c.a {
        a() {
        }

        @Override // o8.c.a
        public View c(q8.i iVar) {
            return null;
        }

        @Override // o8.c.a
        public View j(q8.i iVar) {
            String strC = iVar.c();
            if (strC == null) {
                return null;
            }
            View viewInflate = LayoutInflater.from(h.this.f15974l).inflate(da.c.f10877a, (ViewGroup) null);
            TextView textView = (TextView) viewInflate.findViewById(da.b.f10876b);
            StringBuilder sb2 = new StringBuilder(strC);
            String strB = iVar.b();
            if (strB != null) {
                sb2.append("<br>");
                sb2.append(strB);
            }
            textView.setText(Html.fromHtml(sb2.toString()));
            return viewInflate;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f15981a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f15982b = new HashMap();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map f15983c = new HashMap();
    }

    public h(o8.c cVar, Context context, ha.c cVar2, ha.d dVar, ha.e eVar, ha.a aVar, b bVar) {
        this(cVar, new HashSet(), null, null, null, new ja.a(), cVar2, dVar, eVar, aVar);
        this.f15974l = context;
        this.f15966d = new HashMap();
        this.f15971i = bVar == null ? new b() : bVar;
    }

    private void D(String str, String str2, q8.b bVar) {
        Map map = (Map) this.f15971i.f15981a.get(str);
        if (map == null) {
            map = new HashMap();
            this.f15971i.f15981a.put(str, map);
        }
        map.put(str2, bVar);
    }

    private void G(Collection collection) {
        for (Object obj : collection) {
            if (obj instanceof Collection) {
                G((Collection) obj);
            } else if (obj instanceof q8.i) {
                this.f15976n.l((q8.i) obj);
            } else if (obj instanceof n) {
                this.f15978p.h((n) obj);
            } else if (obj instanceof l) {
                this.f15977o.g((l) obj);
            }
        }
    }

    private q8.b K(Bitmap bitmap, double d10) {
        int i10;
        int i11 = (int) (((double) (this.f15974l.getResources().getDisplayMetrics().density * 32.0f)) * d10);
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width < height) {
            i10 = (int) ((height * i11) / width);
        } else if (width > height) {
            int i12 = (int) ((width * i11) / height);
            i10 = i11;
            i11 = i12;
        } else {
            i10 = i11;
        }
        return q8.c.b(Bitmap.createScaledBitmap(bitmap, i11, i10, false));
    }

    private void L(o oVar, ka.o oVar2) {
        o oVarQ = oVar2.q();
        if (oVar2.y("outlineColor")) {
            oVar.f(oVarQ.h());
        }
        if (oVar2.y("width")) {
            oVar.t(oVarQ.n());
        }
        if (oVar2.w()) {
            oVar.f(ka.o.f(oVarQ.h()));
        }
    }

    private void M(j jVar, ka.o oVar, ka.o oVar2) {
        j jVarO = oVar.o();
        if (oVar.y("heading")) {
            jVar.u(jVarO.l());
        }
        if (oVar.y("hotSpot")) {
            jVar.b(jVarO.f(), jVarO.g());
        }
        if (oVar.y("markerColor")) {
            jVar.p(jVarO.h());
        }
        double dM = oVar.y("iconScale") ? oVar.m() : oVar2.y("iconScale") ? oVar2.m() : 1.0d;
        if (oVar.y("iconUrl")) {
            f(oVar.n(), dM, jVar);
        } else if (oVar2.n() != null) {
            f(oVar2.n(), dM, jVar);
        }
    }

    private void N(m mVar, ka.o oVar) {
        m mVarP = oVar.p();
        if (oVar.t() && oVar.y("fillColor")) {
            mVar.g(mVarP.h());
        }
        if (oVar.u()) {
            if (oVar.y("outlineColor")) {
                mVar.r(mVarP.j());
            }
            if (oVar.y("width")) {
                mVar.s(mVarP.m());
            }
        }
        if (oVar.x()) {
            mVar.g(ka.o.f(mVarP.h()));
        }
    }

    private void P(ka.o oVar, q8.i iVar, k kVar) {
        boolean zE = kVar.e("name");
        boolean zE2 = kVar.e("description");
        boolean zS = oVar.s();
        boolean zContainsKey = oVar.k().containsKey("text");
        if (zS && zContainsKey) {
            iVar.k(r.a((String) oVar.k().get("text"), kVar));
            o();
            return;
        }
        if (zS && zE) {
            iVar.k(kVar.c("name"));
            o();
            return;
        }
        if (zE && zE2) {
            iVar.k(kVar.c("name"));
            iVar.j(kVar.c("description"));
            o();
        } else if (zE2) {
            iVar.k(kVar.c("description"));
            o();
        } else if (zE) {
            iVar.k(kVar.c("name"));
            o();
        }
    }

    private n e(o oVar, e eVar) {
        oVar.c(eVar.d());
        n nVarF = this.f15978p.f(oVar);
        nVarF.b(oVar.p());
        return nVarF;
    }

    private void f(String str, double d10, j jVar) {
        q8.b bVarT = t(str, d10);
        if (bVarT != null) {
            jVar.p(bVarT);
        } else {
            this.f15970h.add(str);
        }
    }

    private ArrayList g(k kVar, ka.h hVar, ka.o oVar, ka.o oVar2, boolean z10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = hVar.d().iterator();
        while (it.hasNext()) {
            k kVar2 = kVar;
            arrayList.add(d(kVar2, (c) it.next(), oVar, oVar2, z10));
            kVar = kVar2;
        }
        return arrayList;
    }

    private q8.i h(j jVar, g gVar) {
        jVar.t(gVar.d());
        return this.f15976n.j(jVar);
    }

    private l i(m mVar, ia.a aVar) {
        mVar.c(aVar.b());
        Iterator it = aVar.c().iterator();
        while (it.hasNext()) {
            mVar.e((List) it.next());
        }
        l lVarF = this.f15977o.f(mVar);
        lVarF.b(mVar.o());
        return lVarF;
    }

    private void o() {
        this.f15976n.m(new a());
    }

    protected static boolean y(ia.b bVar) {
        return (bVar.e("visibility") && Integer.parseInt(bVar.c("visibility")) == 0) ? false : true;
    }

    protected HashMap A() {
        return this.f15966d;
    }

    public boolean B() {
        return this.f15973k;
    }

    protected void C(Object obj, ia.b bVar) {
        this.f15968f.put(bVar, obj);
    }

    protected void E() {
        this.f15966d.putAll(this.f15965c);
    }

    protected void F(HashMap map) {
        this.f15966d.putAll(map);
    }

    protected void H(HashMap map) {
        G(map.values());
    }

    protected void I(Object obj) {
        if (obj instanceof q8.i) {
            this.f15976n.l((q8.i) obj);
            return;
        }
        if (obj instanceof n) {
            this.f15978p.h((n) obj);
            return;
        }
        if (obj instanceof l) {
            this.f15977o.g((l) obj);
            return;
        }
        if (obj instanceof q8.g) {
            this.f15979q.g((q8.g) obj);
        } else if (obj instanceof ArrayList) {
            Iterator it = ((ArrayList) obj).iterator();
            while (it.hasNext()) {
                I(it.next());
            }
        }
    }

    protected void J(HashMap map) {
        for (q8.g gVar : map.values()) {
            if (gVar != null) {
                this.f15979q.g(gVar);
            }
        }
    }

    protected void O(boolean z10) {
        this.f15973k = z10;
    }

    protected void Q(HashMap map, HashMap map2, HashMap map3, ArrayList arrayList, HashMap map4) {
        this.f15965c = map;
        this.f15967e = map2;
        this.f15964b.putAll(map3);
        this.f15975m = arrayList;
        this.f15969g = map4;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void b(ia.b r8) {
        /*
            r7 = this;
            java.lang.Object r0 = ia.h.f15961r
            boolean r1 = r7.f15973k
            if (r1 == 0) goto L48
            ja.a r1 = r7.f15964b
            boolean r1 = r1.containsKey(r8)
            if (r1 == 0) goto L17
            ja.a r1 = r7.f15964b
            java.lang.Object r1 = r1.get(r8)
            r7.I(r1)
        L17:
            boolean r1 = r8.d()
            if (r1 == 0) goto L48
            boolean r0 = r8 instanceof ka.k
            if (r0 == 0) goto L3e
            boolean r6 = y(r8)
            java.lang.String r0 = r8.b()
            ia.c r3 = r8.a()
            ka.o r4 = r7.x(r0)
            r2 = r8
            ka.k r2 = (ka.k) r2
            ka.o r5 = r2.f()
            r1 = r7
            java.lang.Object r0 = r1.d(r2, r3, r4, r5, r6)
            goto L49
        L3e:
            r1 = r7
            ia.c r0 = r8.a()
            java.lang.Object r0 = r7.c(r8, r0)
            goto L49
        L48:
            r1 = r7
        L49:
            ja.a r2 = r1.f15964b
            r2.put(r8, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.h.b(ia.b):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    protected Object c(ia.b bVar, c cVar) {
        String strA = cVar.a();
        strA.getClass();
        byte b10 = -1;
        switch (strA.hashCode()) {
            case -2116761119:
                if (strA.equals("MultiPolygon")) {
                    b10 = 0;
                }
                break;
            case -1065891849:
                if (strA.equals("MultiPoint")) {
                    b10 = 1;
                }
                break;
            case -627102946:
                if (strA.equals("MultiLineString")) {
                    b10 = 2;
                }
                break;
            case 77292912:
                if (strA.equals("Point")) {
                    b10 = 3;
                }
                break;
            case 1267133722:
                if (strA.equals("Polygon")) {
                    b10 = 4;
                }
                break;
            case 1806700869:
                if (strA.equals("LineString")) {
                    b10 = 5;
                }
                break;
            case 1950410960:
                if (strA.equals("GeometryCollection")) {
                    b10 = 6;
                }
                break;
        }
        switch (b10) {
            case 0:
                android.support.v4.media.session.b.a(bVar);
                throw null;
            case 1:
                android.support.v4.media.session.b.a(bVar);
                throw null;
            case 2:
                android.support.v4.media.session.b.a(bVar);
                throw null;
            case 3:
                j jVarG = bVar instanceof k ? ((k) bVar).g() : null;
                android.support.v4.media.session.b.a(cVar);
                return h(jVarG, null);
            case 4:
                return i(bVar instanceof k ? ((k) bVar).h() : null, (ia.a) cVar);
            case 5:
                o oVarI = bVar instanceof k ? ((k) bVar).i() : null;
                android.support.v4.media.session.b.a(cVar);
                return e(oVarI, null);
            case 6:
                android.support.v4.media.session.b.a(bVar);
                android.support.v4.media.session.b.a(cVar);
                throw null;
            default:
                return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object d(ka.k r11, ia.c r12, ka.o r13, ka.o r14, boolean r15) {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.h.d(ka.k, ia.c, ka.o, ka.o, boolean):java.lang.Object");
    }

    public void j(HashMap map, HashMap map2) {
        for (String str : map.keySet()) {
            String str2 = (String) map.get(str);
            if (map2.containsKey(str2)) {
                map2.put(str, (ka.o) map2.get(str2));
            }
        }
    }

    protected q8.g k(q8.h hVar) {
        return this.f15979q.f(hVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void l(String str, Bitmap bitmap) {
        this.f15971i.f15983c.put(str, bitmap);
    }

    protected void m() {
        b bVar;
        if (this.f15972j != 0 || (bVar = this.f15971i) == null || bVar.f15983c.isEmpty()) {
            return;
        }
        this.f15971i.f15983c.clear();
    }

    protected void n() {
        this.f15966d.clear();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p() {
        this.f15972j--;
        m();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void q() {
        this.f15972j++;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public HashMap r() {
        return this.f15964b;
    }

    protected q8.b s(String str) {
        Bitmap bitmap;
        q8.b bVar = (q8.b) this.f15971i.f15982b.get(str);
        if (bVar != null || (bitmap = (Bitmap) this.f15971i.f15983c.get(str)) == null) {
            return bVar;
        }
        q8.b bVarB = q8.c.b(bitmap);
        this.f15971i.f15982b.put(str, bVarB);
        return bVarB;
    }

    protected q8.b t(String str, double d10) {
        Bitmap bitmap;
        String str2 = f15962s.format(d10);
        Map map = (Map) this.f15971i.f15981a.get(str);
        q8.b bVar = map != null ? (q8.b) map.get(str2) : null;
        if (bVar != null || (bitmap = (Bitmap) this.f15971i.f15983c.get(str)) == null) {
            return bVar;
        }
        q8.b bVarK = K(bitmap, d10);
        D(str, str2, bVarK);
        return bVarK;
    }

    protected ArrayList u() {
        return this.f15975m;
    }

    public HashMap v() {
        return this.f15969g;
    }

    protected Set w() {
        return this.f15970h;
    }

    protected ka.o x(String str) {
        return this.f15966d.get(str) != null ? (ka.o) this.f15966d.get(str) : (ka.o) this.f15966d.get(null);
    }

    protected HashMap z() {
        return this.f15967e;
    }

    private h(o8.c cVar, Set set, ja.c cVar2, ja.b bVar, ja.d dVar, ja.a aVar, ha.c cVar3, ha.d dVar2, ha.e eVar, ha.a aVar2) {
        this.f15964b = new ja.a();
        this.f15972j = 0;
        this.f15963a = cVar;
        this.f15973k = false;
        this.f15970h = set;
        this.f15968f = aVar;
        if (cVar != null) {
            this.f15976n = (cVar3 == null ? new ha.c(cVar) : cVar3).o();
            this.f15977o = (dVar2 == null ? new ha.d(cVar) : dVar2).o();
            this.f15978p = (eVar == null ? new ha.e(cVar) : eVar).o();
            this.f15979q = (aVar2 == null ? new ha.a(cVar) : aVar2).o();
            return;
        }
        this.f15976n = null;
        this.f15977o = null;
        this.f15978p = null;
        this.f15979q = null;
    }
}
