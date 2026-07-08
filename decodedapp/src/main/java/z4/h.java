package z4;

import android.content.Context;
import android.net.Uri;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.ekito.simpleKML.Serializer;
import com.ekito.simpleKML.model.Feature;
import com.ekito.simpleKML.model.Kml;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import z4.h;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static h f32918e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private File f32919a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f32921c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f32920b = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile int f32922d = 1;

    public enum b {
        ItemsChanged
    }

    public class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f32925a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f32926b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f32927c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private SoftReference f32928d;

        private File c() {
            return new File(h.this.f32919a, d(this.f32925a));
        }

        private String d(String str) {
            return "." + str + ".hide";
        }

        public File b() {
            return new File(h.this.f32919a, this.f32925a);
        }

        public String e() {
            int iLastIndexOf = this.f32925a.lastIndexOf(46);
            return iLastIndexOf > 0 ? this.f32925a.substring(0, iLastIndexOf) : this.f32925a;
        }

        public boolean f() {
            return Cfg.f5482d ? !c().exists() : c().exists();
        }

        public synchronized Kml g() {
            Kml kml;
            SoftReference softReference = this.f32928d;
            if (softReference != null && (kml = (Kml) softReference.get()) != null) {
                return kml;
            }
            a6.t.d("read kml");
            try {
                Kml kml2 = new Serializer().read(new File(h.this.f32919a, this.f32925a));
                if (kml2 != null) {
                    this.f32928d = new SoftReference(kml2);
                    this.f32927c = false;
                }
                return kml2;
            } catch (Exception e10) {
                this.f32927c = true;
                e10.printStackTrace();
                return null;
            } finally {
                a6.t.c("read kml", "KmlFileManager", " " + this.f32925a);
            }
        }

        public void h() {
            new File(h.this.f32919a, this.f32925a).delete();
            new File(h.this.f32919a, d(this.f32925a)).delete();
            h.this.f32920b.remove(this.f32925a);
            h.this.k();
        }

        public void i(String str) {
            String strM = a6.m.m(str, "_");
            int iLastIndexOf = this.f32925a.lastIndexOf(46);
            if (iLastIndexOf > 0) {
                strM = strM + this.f32925a.substring(iLastIndexOf);
            }
            b().renameTo(new File(h.this.f32919a, strM));
            c().renameTo(new File(h.this.f32919a, d(strM)));
            h.this.f32920b.remove(this.f32925a);
            this.f32925a = strM;
            h.this.f32920b.put(this.f32925a, this);
            h.this.k();
        }

        public void j(boolean z10) {
            if (Cfg.f5482d) {
                z10 = !z10;
            }
            File fileC = c();
            if (z10) {
                if (fileC.delete()) {
                    h.this.k();
                }
            } else {
                if (fileC.exists()) {
                    return;
                }
                try {
                    new FileOutputStream(fileC).close();
                    h.this.k();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
        }

        public void k() {
            File fileC = c();
            if (fileC.exists()) {
                fileC.delete();
            } else {
                try {
                    new FileOutputStream(fileC).close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            h.this.k();
        }

        private c(String str) {
            this.f32925a = str;
        }
    }

    private h() {
        Main main = Main.f5555g;
        this.f32921c = main;
        File file = new File(main.getFilesDir(), "kml/tracks");
        file.mkdirs();
        File file2 = new File(main.getDir("kml", 0), "tracks");
        if (file2.isDirectory()) {
            a6.n.g(file2, file);
            file2.delete();
        }
        m(file);
    }

    public static synchronized h i() {
        try {
            if (f32918e == null) {
                f32918e = new h();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f32918e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k() {
        this.f32922d++;
        mi.c.e().m(b.ItemsChanged);
    }

    public c e(Uri uri) throws Throwable {
        Closeable closeable;
        InputStream inputStreamOpenInputStream;
        FileOutputStream fileOutputStream;
        InputStream inputStream = null;
        byte b10 = 0;
        try {
            if (uri == null) {
                return null;
            }
            try {
                inputStreamOpenInputStream = this.f32921c.getContentResolver().openInputStream(uri);
            } catch (Exception e10) {
                e = e10;
                inputStreamOpenInputStream = null;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                closeable = null;
                a6.m.b(inputStream);
                a6.m.b(closeable);
                throw th;
            }
            if (inputStreamOpenInputStream == null) {
                a6.m.b(inputStreamOpenInputStream);
                a6.m.b(null);
                return null;
            }
            try {
                Kml kml = new Serializer().read(inputStreamOpenInputStream);
                if (kml == null) {
                    a6.m.b(inputStreamOpenInputStream);
                    a6.m.b(null);
                    return null;
                }
                Feature feature = kml.getFeature();
                if (feature == null) {
                    a6.m.b(inputStreamOpenInputStream);
                    a6.m.b(null);
                    return null;
                }
                String name = feature.getName();
                String strP = a6.m.p(a6.m.k(uri, this.f32921c));
                if (!a6.w.b(strP)) {
                    if (a6.w.b(name)) {
                        name = strP;
                    } else {
                        name = strP + "-" + name;
                    }
                }
                if (a6.w.b(name)) {
                    name = a6.m.f();
                }
                if (!name.endsWith(".kml")) {
                    name = name + ".kml";
                }
                String strM = a6.m.m(name, "_");
                fileOutputStream = new FileOutputStream(new File(this.f32919a, strM));
                try {
                    a6.m.b(inputStreamOpenInputStream);
                    inputStreamOpenInputStream = this.f32921c.getContentResolver().openInputStream(uri);
                    a6.m.c(inputStreamOpenInputStream, fileOutputStream);
                    c cVar = new c(strM);
                    cVar.f32928d = new SoftReference(kml);
                    this.f32920b.put(cVar.f32925a, cVar);
                    k();
                    a6.m.b(inputStreamOpenInputStream);
                    a6.m.b(fileOutputStream);
                    return cVar;
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                closeable = null;
                inputStream = inputStreamOpenInputStream;
                a6.m.b(inputStream);
                a6.m.b(closeable);
                throw th;
            }
            e.printStackTrace();
            a6.m.b(inputStreamOpenInputStream);
            a6.m.b(fileOutputStream);
            return null;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0073: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:116), block:B:24:0x0073 */
    public c f(Kml kml) throws Throwable {
        Closeable closeable;
        FileOutputStream fileOutputStream;
        Closeable closeable2 = null;
        byte b10 = 0;
        try {
            if (kml == null) {
                return null;
            }
            try {
                Feature feature = kml.getFeature();
                if (feature == null) {
                    a6.m.b(null);
                    return null;
                }
                String name = feature.getName();
                if (a6.w.b(name)) {
                    name = a6.m.f();
                }
                if (!name.endsWith(".kml")) {
                    name = name + ".kml";
                }
                String strM = a6.m.m(name, "_");
                fileOutputStream = new FileOutputStream(new File(this.f32919a, strM));
                try {
                    new Serializer().write(kml, fileOutputStream);
                    c cVar = new c(strM);
                    cVar.j(true);
                    cVar.f32928d = new SoftReference(kml);
                    this.f32920b.put(cVar.f32925a, cVar);
                    k();
                    a6.m.b(fileOutputStream);
                    return cVar;
                } catch (Exception e10) {
                    e = e10;
                }
            } catch (Exception e11) {
                e = e11;
                fileOutputStream = null;
            } catch (Throwable th2) {
                th = th2;
                a6.m.b(closeable2);
                throw th;
            }
            e.printStackTrace();
            a6.m.b(fileOutputStream);
            return null;
        } catch (Throwable th3) {
            th = th3;
            closeable2 = closeable;
        }
    }

    public c g(String str) {
        return (c) this.f32920b.get(str);
    }

    public Collection h() {
        ArrayList arrayList = new ArrayList(this.f32920b.size() + 5);
        arrayList.addAll(this.f32920b.values());
        Collections.sort(arrayList, new Comparator() { // from class: z4.g
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ((h.c) obj).e().compareTo(((h.c) obj2).e());
            }
        });
        return arrayList;
    }

    public int j() {
        return this.f32922d;
    }

    public void l() {
        this.f32920b.clear();
        String[] list = this.f32919a.list();
        if (list != null) {
            for (String str : list) {
                if (!str.endsWith(".hide")) {
                    c cVar = new c(str);
                    this.f32920b.put(cVar.f32925a, cVar);
                }
            }
            for (String str2 : list) {
                if (str2.endsWith(".hide")) {
                    if (!this.f32920b.containsKey(str2.charAt(0) == '.' ? str2.substring(1, str2.length() - 5) : str2.substring(0, str2.length() - 5))) {
                        new File(this.f32919a, str2).delete();
                    }
                }
            }
        }
        k();
    }

    public boolean m(File file) {
        if (file == null) {
            file = new File(this.f32921c.getFilesDir(), "kml/tracks");
        }
        if (!file.isDirectory() && !file.mkdirs()) {
            return false;
        }
        this.f32919a = file;
        l();
        return true;
    }
}
