package z4;

import android.content.Context;
import android.text.TextUtils;
import com.dw.ht.Cfg;
import com.dw.ht.d0;
import eh.i0;
import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import rd.g0;

/* JADX INFO: loaded from: classes.dex */
public class z implements com.dw.ht.map.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f33005n = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f33006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f33007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f33008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f33009f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private File f33010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f33011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final dk.a0 f33012i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f33013j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f33014k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f33015l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f33016m;

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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001J3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ3\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u000e\u0010\tJ=\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\u000f\u0010\r¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lz4/z$b;", "", "", "x", "y", "zoom", "Ldk/d;", "Leh/i0;", "a", "(III)Ldk/d;", "", "if_modified_since", "b", "(IIILjava/lang/String;)Ldk/d;", "c", "d", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @ek.f("img_w/wmts")
        dk.d<i0> a(@ek.t("TILECOL") int x10, @ek.t("TILEROW") int y10, @ek.t("TILEMATRIX") int zoom);

        @ek.k({"Cache-Control: public, max-age=0"})
        @ek.f("img_w/wmts")
        dk.d<i0> b(@ek.t("TILECOL") int x10, @ek.t("TILEROW") int y10, @ek.t("TILEMATRIX") int zoom, @ek.i("If-Modified-Since") String if_modified_since);

        @ek.f("ter_w/wmts")
        dk.d<i0> c(@ek.t("TILECOL") int x10, @ek.t("TILEROW") int y10, @ek.t("TILEMATRIX") int zoom);

        @ek.k({"Cache-Control: public, max-age=0"})
        @ek.f("ter_w/wmts")
        dk.d<i0> d(@ek.t("TILECOL") int x10, @ek.t("TILEROW") int y10, @ek.t("TILEMATRIX") int zoom, @ek.i("If-Modified-Since") String if_modified_since);
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f33017a;

        static {
            int[] iArr = new int[i.values().length];
            try {
                iArr[i.f32930a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[i.f32931b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[i.f32932c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[i.f32933d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f33017a = iArr;
        }
    }

    private z(i iVar, float f10, Locale locale) {
        this.f33006c = iVar;
        this.f33007d = f10;
        this.f33008e = 256;
        Locale locale2 = Locale.CHINESE;
        i iVar2 = i.f32932c;
        this.f33006c = iVar2;
        this.f33007d = 1.0f;
        int i10 = c.f33017a[iVar2.ordinal()];
        if (i10 == 1) {
            this.f33011h = "t";
        } else if (i10 == 2) {
            this.f33011h = "p";
        } else if (i10 == 3) {
            this.f33011h = "y";
        } else {
            if (i10 != 4) {
                throw new dd.o();
            }
            this.f33011h = "s";
        }
        a aVar = f33005n;
        rd.m.b(locale2);
        this.f33009f = aVar.b(locale2);
        int iRandom = ((int) (Math.random() * ((double) 100))) % 7;
        g0 g0Var = g0.f25951a;
        String str = String.format(Locale.ENGLISH, "https://t%d.tianditu.gov.cn/", Arrays.copyOf(new Object[]{Integer.valueOf(iRandom)}, 1));
        rd.m.d(str, "format(...)");
        this.f33016m = str;
        dk.a0 a0VarC = d0.f5647a.c(str);
        this.f33012i = a0VarC;
        Object objB = a0VarC.b(b.class);
        rd.m.d(objB, "create(...)");
        this.f33015l = (b) objB;
    }

    private final dk.d j(int i10, int i11, int i12) {
        int i13 = c.f33017a[this.f33006c.ordinal()];
        if (i13 == 1 || i13 == 2) {
            return this.f33015l.c(i10, i11, i12);
        }
        if (i13 == 3 || i13 == 4) {
            return this.f33015l.a(i10, i11, i12);
        }
        throw new dd.o();
    }

    private final void k(File file) {
        if (file == null) {
            this.f33010g = null;
            return;
        }
        g0 g0Var = g0.f25951a;
        String str = String.format(Locale.ENGLISH, "%s/%s/%.1f", Arrays.copyOf(new Object[]{this.f33011h, this.f33009f, Float.valueOf(this.f33007d)}, 3));
        rd.m.d(str, "format(...)");
        File file2 = new File(file, str);
        this.f33010g = file2;
        rd.m.b(file2);
        if (file2.isDirectory()) {
            return;
        }
        File file3 = this.f33010g;
        rd.m.b(file3);
        if (file3.mkdirs()) {
            return;
        }
        this.f33010g = null;
    }

    @Override // com.dw.ht.map.b
    public int b() {
        return this.f33013j;
    }

    @Override // com.dw.ht.map.b
    public int c(int i10, int i11, int i12) {
        File fileI = i(i10, i11, i12);
        if (fileI == null) {
            return -1;
        }
        fileI.delete();
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0099, code lost:
    
        if (r7 != null) goto L35;
     */
    @Override // com.dw.ht.map.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int d(int r7, int r8, int r9, boolean r10) {
        /*
            r6 = this;
            java.io.File r0 = r6.i(r7, r8, r9)
            r1 = -1
            if (r0 != 0) goto L8
            return r1
        L8:
            boolean r2 = r0.isFile()     // Catch: java.io.IOException -> Laa
            if (r2 == 0) goto L7c
            r2 = 0
            if (r10 != 0) goto L12
            return r2
        L12:
            z4.a0$a r10 = z4.a0.a()     // Catch: java.io.IOException -> Laa
            java.lang.Object r10 = r10.get()     // Catch: java.io.IOException -> Laa
            rd.m.b(r10)     // Catch: java.io.IOException -> Laa
            java.text.DateFormat r10 = (java.text.DateFormat) r10     // Catch: java.io.IOException -> Laa
            java.util.Date r3 = new java.util.Date     // Catch: java.io.IOException -> Laa
            long r4 = r0.lastModified()     // Catch: java.io.IOException -> Laa
            r3.<init>(r4)     // Catch: java.io.IOException -> Laa
            java.lang.String r10 = r10.format(r3)     // Catch: java.io.IOException -> Laa
            z4.i r3 = r6.f33006c     // Catch: java.io.IOException -> Laa
            int[] r4 = z4.z.c.f33017a     // Catch: java.io.IOException -> Laa
            int r3 = r3.ordinal()     // Catch: java.io.IOException -> Laa
            r3 = r4[r3]     // Catch: java.io.IOException -> Laa
            r4 = 1
            if (r3 == r4) goto L57
            r4 = 2
            if (r3 == r4) goto L57
            r4 = 3
            if (r3 == r4) goto L49
            r4 = 4
            if (r3 != r4) goto L43
            goto L49
        L43:
            dd.o r7 = new dd.o     // Catch: java.io.IOException -> Laa
            r7.<init>()     // Catch: java.io.IOException -> Laa
            throw r7     // Catch: java.io.IOException -> Laa
        L49:
            z4.z$b r3 = r6.f33015l     // Catch: java.io.IOException -> Laa
            rd.m.b(r10)     // Catch: java.io.IOException -> Laa
            dk.d r7 = r3.b(r7, r8, r9, r10)     // Catch: java.io.IOException -> Laa
            dk.z r7 = r7.l()     // Catch: java.io.IOException -> Laa
            goto L64
        L57:
            z4.z$b r3 = r6.f33015l     // Catch: java.io.IOException -> Laa
            rd.m.b(r10)     // Catch: java.io.IOException -> Laa
            dk.d r7 = r3.d(r7, r8, r9, r10)     // Catch: java.io.IOException -> Laa
            dk.z r7 = r7.l()     // Catch: java.io.IOException -> Laa
        L64:
            int r8 = r7.b()     // Catch: java.io.IOException -> Laa
            r9 = 304(0x130, float:4.26E-43)
            if (r8 != r9) goto L6d
            return r2
        L6d:
            java.lang.Object r7 = r7.a()     // Catch: java.io.IOException -> Laa
            eh.i0 r7 = (eh.i0) r7     // Catch: java.io.IOException -> Laa
            if (r7 == 0) goto L7b
            java.io.InputStream r7 = r7.byteStream()     // Catch: java.io.IOException -> Laa
            if (r7 != 0) goto L9b
        L7b:
            return r1
        L7c:
            java.io.File r10 = r0.getParentFile()     // Catch: java.io.IOException -> Laa
            r10.mkdirs()     // Catch: java.io.IOException -> Laa
            z4.z$b r10 = r6.f33015l     // Catch: java.io.IOException -> Laa
            dk.d r7 = r10.a(r7, r8, r9)     // Catch: java.io.IOException -> Laa
            dk.z r7 = r7.l()     // Catch: java.io.IOException -> Laa
            java.lang.Object r7 = r7.a()     // Catch: java.io.IOException -> Laa
            eh.i0 r7 = (eh.i0) r7     // Catch: java.io.IOException -> Laa
            if (r7 == 0) goto Laa
            java.io.InputStream r7 = r7.byteStream()     // Catch: java.io.IOException -> Laa
            if (r7 == 0) goto Laa
        L9b:
            java.io.FileOutputStream r8 = new java.io.FileOutputStream     // Catch: java.io.IOException -> Laa
            r8.<init>(r0)     // Catch: java.io.IOException -> Laa
            int r7 = a6.m.d(r7, r8)     // Catch: java.io.IOException -> Laa
            if (r7 != 0) goto La9
            r0.delete()     // Catch: java.io.IOException -> Laa
        La9:
            return r7
        Laa:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: z4.z.d(int, int, int, boolean):int");
    }

    public /* bridge */ void e(byte[] bArr, File file) {
        b0.a(this, bArr, file);
    }

    public long f() {
        return this.f33014k;
    }

    public byte[] g(int i10, int i11, int i12) {
        i0 i0Var = (i0) j(i10, i11, i12).l().a();
        if (i0Var != null) {
            return i0Var.bytes();
        }
        return null;
    }

    public final int h() {
        return this.f33008e;
    }

    public File i(int i10, int i11, int i12) {
        File file = this.f33010g;
        if (file == null) {
            return null;
        }
        rd.m.b(file);
        return new File(a6.m.a(a6.m.a(a6.m.a(file, "", i12), "x", i10), "y", i11).getPath() + ".t");
    }

    public void l(int i10) {
        this.f33013j = i10;
    }

    public void m(long j10) {
        this.f33014k = j10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public z(i iVar, Context context) {
        rd.m.e(iVar, "layer");
        rd.m.e(context, "context");
        float f10 = context.getResources().getDisplayMetrics().density;
        Locale locale = Locale.getDefault();
        rd.m.d(locale, "getDefault(...)");
        this(iVar, f10, locale);
        if (Cfg.f5507q != null) {
            k(new File(Cfg.f5507q, "tianditu/tile"));
        }
    }
}
