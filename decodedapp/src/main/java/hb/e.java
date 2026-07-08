package hb;

import android.text.TextUtils;
import eh.a0;
import eh.d0;
import eh.f0;
import eh.h0;
import eh.m;
import eh.t;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.Version;

/* JADX INFO: loaded from: classes3.dex */
class e implements hb.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private d0 f15220a;

    private static class a implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15221a;

        public a(String str) {
            this.f15221a = str;
        }

        @Override // eh.a0
        public h0 intercept(a0.a aVar) {
            return aVar.a(aVar.e().j().k("User-Agent", this.f15221a).a());
        }
    }

    public e(String str) {
        e(str);
    }

    private void e(String str) {
        String strUserAgent = Version.userAgent();
        if (strUserAgent == null || !strUserAgent.startsWith("okhttp/3")) {
            throw new NoClassDefFoundError();
        }
        a aVar = new a(str);
        d0.a aVarE = new d0.a().e(Arrays.asList(m.f12558i, m.f12559j));
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        d0.a aVarA = aVarE.d(15000L, timeUnit).M(30000L, timeUnit).O(30000L, timeUnit).c(null).a(aVar);
        d(aVarA);
        this.f15220a = aVarA.b();
    }

    @Override // hb.a
    public g a(String str, Map map) {
        jb.a.j("OkHttpServiceImpl", "post data");
        t.a aVar = new t.a();
        if (map != null && map.size() > 0) {
            for (String str2 : map.keySet()) {
                String str3 = (String) map.get(str2);
                if (str3 != null) {
                    aVar.a(str2, str3);
                }
            }
        }
        t tVarC = aVar.c();
        return new d(this.f15220a.a(new f0.a().s(str).n(tVarC).a()).l(), (int) tVarC.a());
    }

    @Override // hb.a
    public g b(String str, String str2) {
        jb.a.j("OkHttpServiceImpl", "get.");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = str + "?";
            } else if (iIndexOf != str.length() - 1) {
                str = str + "&";
            }
            str = str + str2;
        }
        return new d(this.f15220a.a(new f0.a().s(str).d().a()).l(), str2.length());
    }

    @Override // hb.a
    public void c(long j10, long j11) {
        if (j10 <= 0 || j11 <= 0) {
            return;
        }
        if (this.f15220a.k() == j10 && this.f15220a.G() == j11) {
            return;
        }
        jb.a.i("OkHttpServiceImpl", "setTimeout changed.");
        d0.a aVarA = this.f15220a.A();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f15220a = aVarA.d(j10, timeUnit).M(j11, timeUnit).O(j11, timeUnit).b();
    }

    private void d(d0.a aVar) {
    }
}
