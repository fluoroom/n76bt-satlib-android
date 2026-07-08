package gj;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f14586a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final n f14587b = new n();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f14588c = new LinkedHashSet();

    private class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f14589a;

        a(e eVar) {
            this.f14589a = eVar;
        }

        @Override // gj.e
        public void a(InputStream inputStream, String str) {
            this.f14589a.a(inputStream, str);
            g.this.f14588c.add(str);
        }

        @Override // gj.e
        public boolean c() {
            return this.f14589a.c();
        }
    }

    public g() {
        f();
    }

    public void b() {
        String property = System.getProperty("orekit.data.path");
        if (property == null || "".equals(property)) {
            return;
        }
        for (String str : property.split(System.getProperty("path.separator"))) {
            if (!"".equals(str)) {
                File file = new File(str);
                if (!file.exists()) {
                    if (!f.f14563a.matcher(str).matches()) {
                        throw new hj.a(hj.f.DATA_ROOT_DIRECTORY_DOES_NOT_EXIST, str);
                    }
                    throw new hj.a(hj.f.UNABLE_TO_FIND_FILE, str);
                }
                if (file.isDirectory()) {
                    c(new m(file));
                } else {
                    if (!f.f14563a.matcher(str).matches()) {
                        throw new hj.a(hj.f.NEITHER_DIRECTORY_NOR_ZIP_OR_JAR, str);
                    }
                    c(new h0(file));
                }
            }
        }
    }

    public void c(f fVar) {
        this.f14586a.add(fVar);
    }

    public boolean d(String str, e eVar) {
        Pattern patternCompile = Pattern.compile(str);
        if (this.f14586a.isEmpty()) {
            b();
        }
        a aVar = new a(eVar);
        Iterator it = this.f14586a.iterator();
        hj.a e10 = null;
        while (it.hasNext()) {
            try {
            } catch (hj.a e11) {
                e10 = e11;
            }
            if (((f) it.next()).a(patternCompile, aVar, this)) {
                return true;
            }
        }
        if (e10 == null) {
            return false;
        }
        throw e10;
    }

    public n e() {
        return this.f14587b;
    }

    public void f() {
        this.f14587b.c();
        this.f14587b.a(new r());
        this.f14587b.a(new f0());
        this.f14587b.a(new ij.c());
    }
}
