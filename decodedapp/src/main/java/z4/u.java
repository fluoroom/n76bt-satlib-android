package z4;

import android.content.Context;
import android.text.TextUtils;
import com.dw.ht.Cfg;
import com.dw.ht.d0;
import eh.i0;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import rd.g0;

/* JADX INFO: loaded from: classes.dex */
public class u implements com.dw.ht.map.b {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f32962n = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f32963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f32964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f32965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f32966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private File f32967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f32968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final dk.a0 f32969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32970j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f32971k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f32972l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f32973m;

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

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J3\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\tJ=\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lz4/u$b;", "", "", "x", "y", "zoom", "Ldk/d;", "Leh/i0;", "a", "(III)Ldk/d;", "", "eTag", "b", "(IIILjava/lang/String;)Ldk/d;", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {
        @ek.f("/{z}/{x}/{y}.png")
        dk.d<i0> a(@ek.s("x") int x10, @ek.s("y") int y10, @ek.s("z") int zoom);

        @ek.f("/{z}/{x}/{y}.png")
        dk.d<i0> b(@ek.s("x") int x10, @ek.s("y") int y10, @ek.s("z") int zoom, @ek.i("If-None-Match") String eTag);
    }

    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32974a;

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
            f32974a = iArr;
        }
    }

    private u(i iVar, float f10, Locale locale) {
        this.f32963c = iVar;
        this.f32964d = f10;
        this.f32965e = 256;
        Locale locale2 = Locale.CHINESE;
        i iVar2 = i.f32931b;
        this.f32963c = iVar2;
        this.f32964d = 1.0f;
        int i10 = c.f32974a[iVar2.ordinal()];
        if (i10 == 1) {
            this.f32968h = "t";
        } else if (i10 == 2) {
            this.f32968h = "p";
        } else if (i10 == 3) {
            this.f32968h = "y";
        } else {
            if (i10 != 4) {
                throw new dd.o();
            }
            this.f32968h = "s";
        }
        a aVar = f32962n;
        rd.m.b(locale2);
        this.f32966f = aVar.b(locale2);
        int iRandom = ((int) (Math.random() * ((double) 100))) % 3;
        g0 g0Var = g0.f25951a;
        String str = String.format(Locale.ENGLISH, "https://%s.tile.opentopomap.org/", Arrays.copyOf(new Object[]{new String[]{"a", "b", "c"}[iRandom]}, 1));
        rd.m.d(str, "format(...)");
        this.f32973m = str;
        dk.a0 a0VarC = d0.f5647a.c(str);
        this.f32969i = a0VarC;
        Object objB = a0VarC.b(b.class);
        rd.m.d(objB, "create(...)");
        this.f32972l = (b) objB;
    }

    private final dk.d i(int i10, int i11, int i12) {
        return this.f32972l.a(i10, i11, i12);
    }

    private final void j(File file) {
        if (file == null) {
            this.f32967g = null;
            return;
        }
        g0 g0Var = g0.f25951a;
        String str = String.format(Locale.ENGLISH, "%s/%s/%.1f", Arrays.copyOf(new Object[]{this.f32968h, this.f32966f, Float.valueOf(this.f32964d)}, 3));
        rd.m.d(str, "format(...)");
        File file2 = new File(file, str);
        this.f32967g = file2;
        rd.m.b(file2);
        if (file2.isDirectory()) {
            return;
        }
        File file3 = this.f32967g;
        rd.m.b(file3);
        if (file3.mkdirs()) {
            return;
        }
        this.f32967g = null;
    }

    @Override // com.dw.ht.map.b
    public int b() {
        return this.f32970j;
    }

    @Override // com.dw.ht.map.b
    public int c(int i10, int i11, int i12) {
        File fileH = h(i10, i11, i12);
        if (fileH == null) {
            return -1;
        }
        fileH.delete();
        return 1;
    }

    @Override // com.dw.ht.map.b
    public int d(int i10, int i11, int i12, boolean z10) {
        dk.z zVarL;
        i0 i0Var;
        InputStream inputStreamByteStream;
        File fileH = h(i10, i11, i12);
        if (fileH == null) {
            return -1;
        }
        try {
            zVarL = null;
        } catch (IOException unused) {
        }
        if (fileH.isFile()) {
            if (!z10) {
                return 0;
            }
            try {
                String strF = a6.n.f(a6.n.c(fileH));
                rd.m.d(strF, "md5str(...)");
                zVarL = this.f32972l.b(i10, i11, i12, '\"' + strF + '\"').l();
                if (zVarL.b() == 304) {
                    return 0;
                }
            } catch (NoSuchAlgorithmException e10) {
                e10.printStackTrace();
            }
            return -1;
        }
        File parentFile = fileH.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        if (zVarL == null) {
            zVarL = this.f32972l.a(i10, i11, i12).l();
        }
        if (zVarL != null && (i0Var = (i0) zVarL.a()) != null && (inputStreamByteStream = i0Var.byteStream()) != null) {
            int iD = a6.m.d(inputStreamByteStream, new FileOutputStream(fileH));
            if (iD == 0) {
                fileH.delete();
            }
            return iD;
        }
        return -1;
    }

    public long e() {
        return this.f32971k;
    }

    public byte[] f(int i10, int i11, int i12) {
        i0 i0Var = (i0) i(i10, i11, i12).l().a();
        if (i0Var != null) {
            return i0Var.bytes();
        }
        return null;
    }

    public final int g() {
        return this.f32965e;
    }

    public File h(int i10, int i11, int i12) {
        File file = this.f32967g;
        if (file == null) {
            return null;
        }
        rd.m.b(file);
        return new File(a6.m.a(a6.m.a(a6.m.a(file, "", i12), "x", i10), "y", i11).getPath() + ".t");
    }

    public void k(int i10) {
        this.f32970j = i10;
    }

    public void l(long j10) {
        this.f32971k = j10;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public u(i iVar, Context context) {
        rd.m.e(iVar, "layer");
        rd.m.e(context, "context");
        float f10 = context.getResources().getDisplayMetrics().density;
        Locale locale = Locale.getDefault();
        rd.m.d(locale, "getDefault(...)");
        this(iVar, f10, locale);
        if (Cfg.f5507q != null) {
            j(new File(Cfg.f5507q, "opentopomap/tile"));
        }
    }
}
