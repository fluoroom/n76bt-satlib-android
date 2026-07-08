package hb;

import android.os.Build;
import com.facebook.stetho.common.Utf8Charset;
import java.net.URLEncoder;
import java.util.Map;
import kb.h;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: c */
    private static f f15222c;

    /* JADX INFO: renamed from: a */
    private h f15223a;

    /* JADX INFO: renamed from: b */
    private a f15224b;

    protected f() {
        g();
    }

    public static f a() {
        if (f15222c == null) {
            synchronized (f.class) {
                try {
                    if (f15222c == null) {
                        f15222c = new f();
                    }
                } finally {
                }
            }
        }
        f15222c.h();
        return f15222c;
    }

    private void g() {
        String str = "AndroidSDK_" + Build.VERSION.SDK + "_" + kb.e.a().d(kb.f.a()) + "_" + Build.VERSION.RELEASE;
        try {
            this.f15224b = new e(str);
        } catch (NoClassDefFoundError unused) {
            jb.a.i("openSDK_LOG.OpenHttpService", "initClient okHttp fail NoClassDefFoundError");
        } catch (Throwable th2) {
            jb.a.g("openSDK_LOG.OpenHttpService", "initClient okHttp catch throwable", th2);
        }
        if (this.f15224b == null) {
            this.f15224b = new b(str);
        }
    }

    private void h() {
        h hVar = this.f15223a;
        if (hVar == null) {
            return;
        }
        int iA = hVar.a("Common_HttpConnectionTimeout");
        if (iA == 0) {
            iA = 15000;
        }
        int iA2 = this.f15223a.a("Common_SocketConnectionTimeout");
        if (iA2 == 0) {
            iA2 = 30000;
        }
        d(iA, iA2);
    }

    public g b(String str, String str2) {
        return this.f15224b.b(str, str2);
    }

    public g c(String str, Map map) {
        if (map == null || map.isEmpty()) {
            return b(str, "");
        }
        StringBuilder sb2 = new StringBuilder("");
        for (String str2 : map.keySet()) {
            String str3 = (String) map.get(str2);
            if (str3 != null) {
                sb2.append(URLEncoder.encode(str2, Utf8Charset.NAME));
                sb2.append("=");
                sb2.append(URLEncoder.encode(str3, Utf8Charset.NAME));
                sb2.append("&");
            }
        }
        if (sb2.length() > 0) {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return b(str, sb2.toString());
    }

    public void d(long j10, long j11) {
        a aVar = this.f15224b;
        if (aVar != null) {
            aVar.c(j10, j11);
        }
    }

    public void e(h hVar) {
        this.f15223a = hVar;
        h();
    }

    public g f(String str, Map map) {
        return this.f15224b.a(str, map);
    }
}
