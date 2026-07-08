package wh;

import dd.w;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import vh.e0;
import vh.l0;
import vh.n0;
import vh.z;

/* JADX INFO: loaded from: classes3.dex */
public final class l extends vh.k {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final a f31461h = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final e0 f31462r = e0.a.e(e0.f30784b, "/", false, 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ClassLoader f31463e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final vh.k f31464f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final dd.j f31465g;

    private static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean c(e0 e0Var) {
            return !rg.q.v(e0Var.g(), ".class", true);
        }

        public final e0 b() {
            return l.f31462r;
        }

        public final e0 d(e0 e0Var, e0 e0Var2) {
            rd.m.e(e0Var, "<this>");
            rd.m.e(e0Var2, "base");
            return b().k(rg.q.E(rg.q.v0(e0Var.toString(), e0Var2.toString()), '\\', '/', false, 4, null));
        }

        private a() {
        }
    }

    public l(ClassLoader classLoader, boolean z10, vh.k kVar) {
        rd.m.e(classLoader, "classLoader");
        rd.m.e(kVar, "systemFileSystem");
        this.f31463e = classLoader;
        this.f31464f = kVar;
        this.f31465g = dd.k.b(new qd.a() { // from class: wh.j
            @Override // qd.a
            public final Object a() {
                return l.v0(this.f31460a);
            }
        });
        if (z10) {
            u0().size();
        }
    }

    private final String A0(e0 e0Var) {
        return t0(e0Var).j(f31462r).toString();
    }

    private final e0 t0(e0 e0Var) {
        return f31462r.l(e0Var, true);
    }

    private final List u0() {
        return (List) this.f31465g.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List v0(l lVar) {
        return lVar.w0(lVar.f31463e);
    }

    private final List w0(ClassLoader classLoader) throws IOException {
        Enumeration<URL> resources = classLoader.getResources("");
        rd.m.d(resources, "getResources(...)");
        ArrayList<URL> list = Collections.list(resources);
        rd.m.d(list, "list(...)");
        ArrayList arrayList = new ArrayList();
        for (URL url : list) {
            rd.m.b(url);
            dd.q qVarX0 = x0(url);
            if (qVarX0 != null) {
                arrayList.add(qVarX0);
            }
        }
        Enumeration<URL> resources2 = classLoader.getResources("META-INF/MANIFEST.MF");
        rd.m.d(resources2, "getResources(...)");
        ArrayList<URL> list2 = Collections.list(resources2);
        rd.m.d(list2, "list(...)");
        ArrayList arrayList2 = new ArrayList();
        for (URL url2 : list2) {
            rd.m.b(url2);
            dd.q qVarY0 = y0(url2);
            if (qVarY0 != null) {
                arrayList2.add(qVarY0);
            }
        }
        return ed.q.s0(arrayList, arrayList2);
    }

    private final dd.q x0(URL url) {
        if (rd.m.a(url.getProtocol(), "file")) {
            return w.a(this.f31464f, e0.a.d(e0.f30784b, new File(url.toURI()), false, 1, null));
        }
        return null;
    }

    private final dd.q y0(URL url) {
        int iI0;
        String string = url.toString();
        rd.m.d(string, "toString(...)");
        if (!rg.q.J(string, "jar:file:", false, 2, null) || (iI0 = rg.q.i0(string, "!", 0, false, 6, null)) == -1) {
            return null;
        }
        e0.a aVar = e0.f30784b;
        String strSubstring = string.substring(4, iI0);
        rd.m.d(strSubstring, "substring(...)");
        return w.a(r.h(e0.a.d(aVar, new File(URI.create(strSubstring)), false, 1, null), this.f31464f, new qd.l() { // from class: wh.k
            @Override // qd.l
            public final Object l(Object obj) {
                return Boolean.valueOf(l.z0((n) obj));
            }
        }), f31462r);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean z0(n nVar) {
        rd.m.e(nVar, "entry");
        return f31461h.c(nVar.b());
    }

    @Override // vh.k
    public vh.j G(e0 e0Var) {
        rd.m.e(e0Var, "path");
        if (!f31461h.c(e0Var)) {
            return null;
        }
        String strA0 = A0(e0Var);
        for (dd.q qVar : u0()) {
            vh.j jVarG = ((vh.k) qVar.a()).G(((e0) qVar.b()).k(strA0));
            if (jVarG != null) {
                return jVarG;
            }
        }
        return null;
    }

    @Override // vh.k
    public vh.i H(e0 e0Var) throws FileNotFoundException {
        rd.m.e(e0Var, "file");
        if (!f31461h.c(e0Var)) {
            throw new FileNotFoundException("file not found: " + e0Var);
        }
        String strA0 = A0(e0Var);
        for (dd.q qVar : u0()) {
            try {
                return ((vh.k) qVar.a()).H(((e0) qVar.b()).k(strA0));
            } catch (FileNotFoundException unused) {
            }
        }
        throw new FileNotFoundException("file not found: " + e0Var);
    }

    @Override // vh.k
    public l0 T(e0 e0Var, boolean z10) throws IOException {
        rd.m.e(e0Var, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // vh.k
    public n0 W(e0 e0Var) throws IOException {
        rd.m.e(e0Var, "file");
        if (!f31461h.c(e0Var)) {
            throw new FileNotFoundException("file not found: " + e0Var);
        }
        e0 e0Var2 = f31462r;
        URL resource = this.f31463e.getResource(e0.m(e0Var2, e0Var, false, 2, null).j(e0Var2).toString());
        if (resource == null) {
            throw new FileNotFoundException("file not found: " + e0Var);
        }
        URLConnection uRLConnectionOpenConnection = resource.openConnection();
        if (uRLConnectionOpenConnection instanceof JarURLConnection) {
            ((JarURLConnection) uRLConnectionOpenConnection).setUseCaches(false);
        }
        InputStream inputStream = uRLConnectionOpenConnection.getInputStream();
        rd.m.d(inputStream, "getInputStream(...)");
        return z.j(inputStream);
    }

    @Override // vh.k
    public l0 c(e0 e0Var, boolean z10) throws IOException {
        rd.m.e(e0Var, "file");
        throw new IOException(this + " is read-only");
    }

    @Override // vh.k
    public void e(e0 e0Var, e0 e0Var2) throws IOException {
        rd.m.e(e0Var, "source");
        rd.m.e(e0Var2, "target");
        throw new IOException(this + " is read-only");
    }

    @Override // vh.k
    public void n(e0 e0Var, boolean z10) throws IOException {
        rd.m.e(e0Var, "dir");
        throw new IOException(this + " is read-only");
    }

    @Override // vh.k
    public void s(e0 e0Var, boolean z10) throws IOException {
        rd.m.e(e0Var, "path");
        throw new IOException(this + " is read-only");
    }

    @Override // vh.k
    public List w(e0 e0Var) throws FileNotFoundException {
        rd.m.e(e0Var, "dir");
        String strA0 = A0(e0Var);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (dd.q qVar : u0()) {
            vh.k kVar = (vh.k) qVar.a();
            e0 e0Var2 = (e0) qVar.b();
            try {
                List listW = kVar.w(e0Var2.k(strA0));
                ArrayList arrayList = new ArrayList();
                for (Object obj : listW) {
                    if (f31461h.c((e0) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ed.q.v(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(f31461h.d((e0) it.next(), e0Var2));
                }
                ed.q.A(linkedHashSet, arrayList2);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return ed.q.H0(linkedHashSet);
        }
        throw new FileNotFoundException("file not found: " + e0Var);
    }

    public /* synthetic */ l(ClassLoader classLoader, boolean z10, vh.k kVar, int i10, rd.h hVar) {
        this(classLoader, z10, (i10 & 4) != 0 ? vh.k.f30830b : kVar);
    }
}
