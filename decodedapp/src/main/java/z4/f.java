package z4;

import android.content.Context;
import android.text.TextUtils;
import com.dw.ht.Cfg;
import com.dw.ht.d0;
import com.dw.ht.map.entitys.ETag;
import eh.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import rd.g0;

/* JADX INFO: loaded from: classes.dex */
public class f implements com.dw.ht.map.b {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f32900p = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j f32901c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f32902d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Locale f32903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f32904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f32905g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f32906h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f32907i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private File f32908j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f32909k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final dk.a0 f32910l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f32911m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final c f32912n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f32913o;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String b(Locale locale) {
            String language = locale.getLanguage();
            String country = locale.getCountry();
            if (!TextUtils.isEmpty(country)) {
                language = language + '-' + country;
            }
            rd.m.b(language);
            return language;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f32914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f32915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final File f32916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f32917d;

        public b(String str, float f10, File file, int i10) {
            rd.m.e(str, "hl");
            rd.m.e(file, "dir");
            this.f32914a = str;
            this.f32915b = f10;
            this.f32916c = file;
            this.f32917d = i10;
        }

        public final File a() {
            return this.f32916c;
        }

        public final int b() {
            return this.f32917d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return rd.m.a(this.f32914a, bVar.f32914a) && Float.compare(this.f32915b, bVar.f32915b) == 0 && rd.m.a(this.f32916c, bVar.f32916c) && this.f32917d == bVar.f32917d;
        }

        public int hashCode() {
            return (((((this.f32914a.hashCode() * 31) + Float.floatToIntBits(this.f32915b)) * 31) + this.f32916c.hashCode()) * 31) + this.f32917d;
        }

        public String toString() {
            return "D(hl=" + this.f32914a + ", scale=" + this.f32915b + ", dir=" + this.f32916c + ", src=" + this.f32917d + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J[\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\bH'¢\u0006\u0004\b\u000e\u0010\u000fJe\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u0002H'¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lz4/f$c;", "", "", "lyrs", "hl", "gl", "", "scale", "", "x", "y", "zoom", "Ldk/d;", "Leh/i0;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIII)Ldk/d;", "eTag", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FIIILjava/lang/String;)Ldk/d;", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface c {
        @ek.f("vt/")
        dk.d<i0> a(@ek.t("lyrs") String lyrs, @ek.t("hl") String hl, @ek.t("gl") String gl, @ek.t("scale") float scale, @ek.t("x") int x10, @ek.t("y") int y10, @ek.t("z") int zoom, @ek.i("If-None-Match") String eTag);

        @ek.f("vt/")
        dk.d<i0> b(@ek.t("lyrs") String lyrs, @ek.t("hl") String hl, @ek.t("gl") String gl, @ek.t("scale") float scale, @ek.t("x") int x10, @ek.t("y") int y10, @ek.t("z") int zoom);
    }

    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return gd.a.d(Integer.valueOf(((b) obj2).b()), Integer.valueOf(((b) obj).b()));
        }
    }

    private f(j jVar, float f10, Locale locale) {
        this.f32901c = jVar;
        this.f32902d = f10;
        this.f32903e = locale;
        this.f32905g = 256;
        this.f32909k = jVar.d().d();
        this.f32906h = f32900p.b(locale);
        String country = locale.getCountry();
        rd.m.d(country, "getCountry(...)");
        this.f32907i = country;
        int iRandom = ((int) (Math.random() * ((double) 100))) % 4;
        g0 g0Var = g0.f25951a;
        String str = String.format(Locale.ENGLISH, "https://mt%d.google.com/", Arrays.copyOf(new Object[]{Integer.valueOf(iRandom)}, 1));
        rd.m.d(str, "format(...)");
        this.f32913o = str;
        dk.a0 a0VarC = d0.f5647a.c(str);
        this.f32910l = a0VarC;
        Object objB = a0VarC.b(c.class);
        rd.m.d(objB, "create(...)");
        this.f32912n = (c) objB;
    }

    private final File g(File file, int i10, int i11, int i12) {
        return new File(a6.m.a(a6.m.a(a6.m.a(file, "", i12), "x", i10), "y", i11).getPath() + ".t");
    }

    private final File h(int i10, int i11, int i12) {
        File file = this.f32908j;
        if (file == null) {
            return null;
        }
        return g(file, i10, i11, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void i(java.io.File r20) {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.f.i(java.io.File):void");
    }

    @Override // com.dw.ht.map.b
    public int b() {
        return this.f32911m;
    }

    @Override // com.dw.ht.map.b
    public int c(int i10, int i11, int i12) {
        File fileF = f(i10, i11, i12);
        if (fileF == null) {
            return -1;
        }
        fileF.delete();
        ETag.Companion aVar = ETag.INSTANCE;
        ETag eTagA = aVar.a(this.f32901c, i10, i11, i12);
        if (eTagA.getId() == 0) {
            return 1;
        }
        aVar.b().v(eTagA.getId());
        return 1;
    }

    @Override // com.dw.ht.map.b
    public int d(int i10, int i11, int i12, boolean z10) {
        ETag eTagA;
        int i13;
        i0 i0Var;
        InputStream inputStreamByteStream;
        File fileH = h(i10, i11, i12);
        if (fileH == null) {
            return -1;
        }
        try {
            dk.z zVarL = null;
            if (!fileH.isFile()) {
                File parentFile = fileH.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                eTagA = null;
            } else {
                if (!z10) {
                    return 0;
                }
                eTagA = ETag.INSTANCE.a(this.f32901c, i10, i11, i12);
                if (eTagA.getTag().length() > 0) {
                    zVarL = this.f32912n.a(this.f32909k, this.f32906h, this.f32907i, this.f32902d, i10, i11, i12, eTagA.getTag()).l();
                    if (zVarL.b() == 304) {
                        return 0;
                    }
                }
            }
            if (zVarL == null) {
                i13 = i12;
                zVarL = this.f32912n.b(this.f32909k, this.f32906h, this.f32907i, this.f32902d, i10, i11, i13).l();
            } else {
                i13 = i12;
            }
            if (zVarL != null && (i0Var = (i0) zVarL.a()) != null && (inputStreamByteStream = i0Var.byteStream()) != null) {
                int iD = a6.m.d(inputStreamByteStream, new FileOutputStream(fileH));
                if (iD == 0) {
                    fileH.delete();
                }
                String strB = zVarL.d().b("etag");
                if (strB != null) {
                    if (eTagA == null) {
                        eTagA = ETag.INSTANCE.a(this.f32901c, i10, i11, i13);
                    }
                    if (eTagA != null) {
                        eTagA.k(strB);
                        ETag.INSTANCE.b().n(eTagA);
                    }
                }
                return iD;
            }
        } catch (IOException unused) {
        }
        return -1;
    }

    public final int e() {
        return this.f32905g;
    }

    public File f(int i10, int i11, int i12) {
        List list;
        File file = this.f32908j;
        if (file == null) {
            return null;
        }
        File fileG = g(file, i10, i11, i12);
        if (!fileG.isFile() && (list = this.f32904f) != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                File fileG2 = g(((b) it.next()).a(), i10, i11, i12);
                if (fileG2.isFile()) {
                    return fileG2;
                }
            }
        }
        return fileG;
    }

    public void j(int i10) {
        this.f32911m = i10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f(j jVar, Context context) {
        rd.m.e(jVar, "layer");
        rd.m.e(context, "context");
        float f10 = context.getResources().getDisplayMetrics().density;
        Locale locale = Locale.getDefault();
        rd.m.d(locale, "getDefault(...)");
        this(jVar, f10, locale);
        if (Cfg.f5507q != null) {
            i(new File(Cfg.f5507q, "google/tile"));
        }
    }
}
