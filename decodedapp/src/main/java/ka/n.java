package ka;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import ia.h;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class n extends ia.h {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Set f19571t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f19572u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f19573v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private ArrayList f19574w;

    private class a extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19575a;

        public a(String str) {
            this.f19575a = str;
            n.this.q();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(String... strArr) {
            try {
                return n.this.t0(this.f19575a);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.f19575a);
            } catch (IOException e10) {
                Log.e("KmlRenderer", "Image [" + this.f19575a + "] download issue", e10);
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e("KmlRenderer", "Image at this URL could not be found " + this.f19575a);
            } else {
                n.this.l(this.f19575a, bitmap);
                if (n.this.B()) {
                    n nVar = n.this;
                    nVar.i0(this.f19575a, nVar.v(), true);
                    n nVar2 = n.this;
                    nVar2.h0(this.f19575a, nVar2.f19574w, true);
                }
            }
            n.this.p();
        }
    }

    private class b extends AsyncTask {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19577a;

        public b(String str) {
            this.f19577a = str;
            n.this.q();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(String... strArr) {
            try {
                return n.this.t0(this.f19577a);
            } catch (MalformedURLException unused) {
                return BitmapFactory.decodeFile(this.f19577a);
            } catch (IOException e10) {
                e10.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap bitmap) {
            if (bitmap == null) {
                Log.e("KmlRenderer", "Image at this URL could not be found " + this.f19577a);
            } else {
                n.this.l(this.f19577a, bitmap);
                if (n.this.B()) {
                    n nVar = n.this;
                    nVar.n0(this.f19577a, nVar.r());
                    n nVar2 = n.this;
                    nVar2.e0(this.f19577a, nVar2.f19574w);
                }
            }
            n.this.p();
        }
    }

    n(o8.c cVar, Context context, ha.c cVar2, ha.d dVar, ha.e eVar, ha.a aVar, h.b bVar) {
        super(cVar, context, cVar2, dVar, eVar, aVar, bVar);
        this.f19571t = new HashSet();
        this.f19572u = false;
        this.f19573v = false;
    }

    private void A0(HashMap map) {
        H(map);
    }

    private void B0(o oVar, q8.i iVar) {
        iVar.h(t(oVar.n(), oVar.m()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(String str, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ka.b bVar = (ka.b) it.next();
            n0(str, bVar.d());
            if (bVar.h()) {
                e0(str, bVar.a());
            }
        }
    }

    private void f0(Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ka.b bVar = (ka.b) it.next();
            boolean zU0 = u0(bVar, z10);
            if (bVar.g() != null) {
                F(bVar.g());
            }
            if (bVar.f() != null) {
                super.j(bVar.f(), A());
            }
            g0(bVar, zU0);
            if (bVar.h()) {
                f0(bVar.a(), zU0);
            }
        }
    }

    private void g0(ka.b bVar, boolean z10) {
        for (ia.b bVar2 : bVar.c()) {
            boolean z11 = z10 && ia.h.y(bVar2);
            if (bVar2.a() != null) {
                k kVar = (k) bVar2;
                Object objD = d(kVar, bVar2.a(), x(bVar2.b()), kVar.f(), z11);
                bVar.j(kVar, objD);
                C(objD, bVar2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String str, Iterable iterable, boolean z10) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ka.b bVar = (ka.b) it.next();
            boolean zU0 = u0(bVar, z10);
            i0(str, bVar.b(), zU0);
            if (bVar.h()) {
                h0(str, bVar.a(), zU0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(String str, HashMap map, boolean z10) {
        q8.b bVarS = s(str);
        for (e eVar : map.keySet()) {
            if (eVar.b().equals(str)) {
                q8.g gVarK = k(eVar.a().m(bVarS));
                if (!z10) {
                    gVarK.b(false);
                }
                map.put(eVar, gVarK);
            }
        }
    }

    private void j0(HashMap map) {
        for (e eVar : map.keySet()) {
            String strB = eVar.b();
            if (strB != null && eVar.c() != null) {
                if (s(strB) != null) {
                    i0(strB, map, true);
                } else {
                    this.f19571t.add(strB);
                }
            }
        }
    }

    private void k0(HashMap map, Iterable iterable) {
        j0(map);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ka.b bVar = (ka.b) it.next();
            k0(bVar.b(), bVar.a());
        }
    }

    private void l0(String str, o oVar, o oVar2, ia.c cVar, Object obj) {
        if (cVar == null) {
            return;
        }
        if ("Point".equals(cVar.a())) {
            m0(str, oVar, oVar2, (q8.i) obj);
        } else if ("MultiGeometry".equals(cVar.a())) {
            o0(str, oVar, oVar2, (ia.f) cVar, (List) obj);
        }
    }

    private void m0(String str, o oVar, o oVar2, q8.i iVar) {
        boolean z10 = false;
        boolean z11 = oVar2 != null && str.equals(oVar2.n());
        if (oVar != null && str.equals(oVar.n())) {
            z10 = true;
        }
        if (z11) {
            B0(oVar2, iVar);
        } else if (z10) {
            B0(oVar, iVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n0(String str, HashMap map) {
        for (ia.b bVar : map.keySet()) {
            l0(str, (o) A().get(bVar.b()), ((k) bVar).f(), bVar.a(), map.get(bVar));
        }
    }

    private void o0(String str, o oVar, o oVar2, ia.f fVar, List list) {
        Iterator it = fVar.d().iterator();
        Iterator it2 = list.iterator();
        while (it.hasNext() && it2.hasNext()) {
            l0(str, oVar, oVar2, (ia.c) it.next(), it2.next());
        }
    }

    private void q0(HashMap map) {
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            b((ia.b) it.next());
        }
    }

    private void r0() {
        this.f19573v = true;
        Iterator it = this.f19571t.iterator();
        while (it.hasNext()) {
            new a((String) it.next()).execute(new String[0]);
            it.remove();
        }
    }

    private void s0() {
        this.f19572u = true;
        Iterator it = w().iterator();
        while (it.hasNext()) {
            new b((String) it.next()).execute(new String[0]);
            it.remove();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bitmap t0(String str) {
        return BitmapFactory.decodeStream(x0(new URL(str).openConnection()));
    }

    static boolean u0(ka.b bVar, boolean z10) {
        return z10 && (!bVar.i("visibility") || Integer.parseInt(bVar.e("visibility")) != 0);
    }

    private InputStream x0(URLConnection uRLConnection) throws IOException {
        InputStream inputStream;
        boolean z10;
        HttpURLConnection httpURLConnection;
        int responseCode;
        int i10 = 0;
        do {
            if (uRLConnection instanceof HttpURLConnection) {
                ((HttpURLConnection) uRLConnection).setInstanceFollowRedirects(false);
            }
            inputStream = uRLConnection.getInputStream();
            if (!(uRLConnection instanceof HttpURLConnection) || (responseCode = (httpURLConnection = (HttpURLConnection) uRLConnection).getResponseCode()) < 300 || responseCode > 307 || responseCode == 306 || responseCode == 304) {
                z10 = false;
            } else {
                URL url = httpURLConnection.getURL();
                String headerField = httpURLConnection.getHeaderField("Location");
                URL url2 = headerField != null ? new URL(url, headerField) : null;
                httpURLConnection.disconnect();
                if (url2 == null || (!(url2.getProtocol().equals("http") || url2.getProtocol().equals("https")) || i10 >= 5)) {
                    throw new SecurityException("illegal URL redirect");
                }
                uRLConnection = url2.openConnection();
                i10++;
                z10 = true;
            }
        } while (z10);
        return inputStream;
    }

    private void y0(Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            ka.b bVar = (ka.b) it.next();
            A0(bVar.d());
            J(bVar.b());
            y0(bVar.a());
        }
    }

    void C0(HashMap map, HashMap map2, HashMap map3, ArrayList arrayList, HashMap map4) {
        Q(map, map2, map3, arrayList, map4);
    }

    void D0(HashMap map, HashMap map2, HashMap map3, ArrayList arrayList, HashMap map4, HashMap map5) {
        Q(map, map2, map3, arrayList, map4);
        for (Map.Entry entry : map5.entrySet()) {
            l((String) entry.getKey(), (Bitmap) entry.getValue());
        }
    }

    public void p0() {
        O(true);
        this.f19574w = u();
        E();
        j(z(), A());
        k0(v(), this.f19574w);
        f0(this.f19574w, true);
        q0(r());
        if (!this.f19573v) {
            r0();
        }
        if (!this.f19572u) {
            s0();
        }
        m();
    }

    public Iterable v0() {
        return this.f19574w;
    }

    public boolean w0() {
        return this.f19574w.size() > 0;
    }

    public void z0() {
        A0(r());
        J(v());
        if (w0()) {
            y0(v0());
        }
        O(false);
        n();
    }
}
