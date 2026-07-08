package ch;

import ah.h;
import android.net.Uri;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4890a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f4891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f4892c;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f4891b = (int) timeUnit.toMillis(15L);
        f4892c = (int) timeUnit.toMillis(10L);
    }

    private b() {
    }

    @Override // ch.a
    public HttpURLConnection a(Uri uri) {
        h.e(uri, "url must not be null");
        h.a("https".equals(uri.getScheme()), "only https connections are permitted");
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(uri.toString()).openConnection();
        httpURLConnection.setConnectTimeout(f4891b);
        httpURLConnection.setReadTimeout(f4892c);
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }
}
