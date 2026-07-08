package o2;

import android.net.Uri;
import android.text.TextUtils;
import java.net.URL;
import java.security.MessageDigest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class h implements i2.f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final i f23094b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final URL f23095c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f23096d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f23097e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private URL f23098f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile byte[] f23099g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23100h;

    public h(URL url) {
        this(url, i.f23102b);
    }

    private byte[] d() {
        if (this.f23099g == null) {
            this.f23099g = c().getBytes(i2.f.f15750a);
        }
        return this.f23099g;
    }

    private String f() {
        if (TextUtils.isEmpty(this.f23097e)) {
            String string = this.f23096d;
            if (TextUtils.isEmpty(string)) {
                string = ((URL) e3.k.e(this.f23095c)).toString();
            }
            this.f23097e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$[]");
        }
        return this.f23097e;
    }

    private URL g() {
        if (this.f23098f == null) {
            this.f23098f = new URL(f());
        }
        return this.f23098f;
    }

    @Override // i2.f
    public void a(MessageDigest messageDigest) {
        messageDigest.update(d());
    }

    public String c() {
        String str = this.f23096d;
        return str != null ? str : ((URL) e3.k.e(this.f23095c)).toString();
    }

    public Map e() {
        return this.f23094b.a();
    }

    @Override // i2.f
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (c().equals(hVar.c()) && this.f23094b.equals(hVar.f23094b)) {
                return true;
            }
        }
        return false;
    }

    public URL h() {
        return g();
    }

    @Override // i2.f
    public int hashCode() {
        if (this.f23100h == 0) {
            int iHashCode = c().hashCode();
            this.f23100h = iHashCode;
            this.f23100h = (iHashCode * 31) + this.f23094b.hashCode();
        }
        return this.f23100h;
    }

    public String toString() {
        return c();
    }

    public h(String str) {
        this(str, i.f23102b);
    }

    public h(URL url, i iVar) {
        this.f23095c = (URL) e3.k.e(url);
        this.f23096d = null;
        this.f23094b = (i) e3.k.e(iVar);
    }

    public h(String str, i iVar) {
        this.f23095c = null;
        this.f23096d = e3.k.c(str);
        this.f23094b = (i) e3.k.e(iVar);
    }
}
