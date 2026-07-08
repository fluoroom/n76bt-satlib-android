package com.bumptech.glide.load.data;

import android.text.TextUtils;
import android.util.Log;
import com.bumptech.glide.load.data.d;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j implements d {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final b f5192g = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o2.h f5193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f5194b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f5195c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private HttpURLConnection f5196d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private InputStream f5197e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f5198f;

    private static class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.data.j.b
        public HttpURLConnection a(URL url) {
            return (HttpURLConnection) url.openConnection();
        }
    }

    interface b {
        HttpURLConnection a(URL url);
    }

    public j(o2.h hVar, int i10) {
        this(hVar, i10, f5192g);
    }

    private HttpURLConnection c(URL url, Map map) throws i2.e {
        try {
            HttpURLConnection httpURLConnectionA = this.f5195c.a(url);
            for (Map.Entry entry : map.entrySet()) {
                httpURLConnectionA.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            httpURLConnectionA.setConnectTimeout(this.f5194b);
            httpURLConnectionA.setReadTimeout(this.f5194b);
            httpURLConnectionA.setUseCaches(false);
            httpURLConnectionA.setDoInput(true);
            httpURLConnectionA.setInstanceFollowRedirects(false);
            return httpURLConnectionA;
        } catch (IOException e10) {
            throw new i2.e("URL.openConnection threw", 0, e10);
        }
    }

    private static int f(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        } catch (IOException e10) {
            if (!Log.isLoggable("HttpUrlFetcher", 3)) {
                return -1;
            }
            Log.d("HttpUrlFetcher", "Failed to get a response code", e10);
            return -1;
        }
    }

    private InputStream g(HttpURLConnection httpURLConnection) throws i2.e {
        try {
            if (TextUtils.isEmpty(httpURLConnection.getContentEncoding())) {
                this.f5197e = e3.c.c(httpURLConnection.getInputStream(), httpURLConnection.getContentLength());
            } else {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Got non empty content encoding: " + httpURLConnection.getContentEncoding());
                }
                this.f5197e = httpURLConnection.getInputStream();
            }
            return this.f5197e;
        } catch (IOException e10) {
            throw new i2.e("Failed to obtain InputStream", f(httpURLConnection), e10);
        }
    }

    private static boolean h(int i10) {
        return i10 / 100 == 2;
    }

    private static boolean i(int i10) {
        return i10 / 100 == 3;
    }

    private InputStream j(URL url, int i10, URL url2, Map map) throws i2.e {
        if (i10 >= 5) {
            throw new i2.e("Too many (> 5) redirects!", -1);
        }
        if (url2 != null) {
            try {
                if (url.toURI().equals(url2.toURI())) {
                    throw new i2.e("In re-direct loop", -1);
                }
            } catch (URISyntaxException unused) {
            }
        }
        HttpURLConnection httpURLConnectionC = c(url, map);
        this.f5196d = httpURLConnectionC;
        try {
            httpURLConnectionC.connect();
            this.f5197e = this.f5196d.getInputStream();
            if (this.f5198f) {
                return null;
            }
            int iF = f(this.f5196d);
            if (h(iF)) {
                return g(this.f5196d);
            }
            if (!i(iF)) {
                if (iF == -1) {
                    throw new i2.e(iF);
                }
                try {
                    throw new i2.e(this.f5196d.getResponseMessage(), iF);
                } catch (IOException e10) {
                    throw new i2.e("Failed to get a response message", iF, e10);
                }
            }
            String headerField = this.f5196d.getHeaderField("Location");
            if (TextUtils.isEmpty(headerField)) {
                throw new i2.e("Received empty or null redirect url", iF);
            }
            try {
                URL url3 = new URL(url, headerField);
                b();
                return j(url3, i10 + 1, url, map);
            } catch (MalformedURLException e11) {
                throw new i2.e("Bad redirect url: " + headerField, iF, e11);
            }
        } catch (IOException e12) {
            throw new i2.e("Failed to connect or obtain data", f(this.f5196d), e12);
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public Class a() {
        return InputStream.class;
    }

    @Override // com.bumptech.glide.load.data.d
    public void b() {
        InputStream inputStream = this.f5197e;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
        HttpURLConnection httpURLConnection = this.f5196d;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        this.f5196d = null;
    }

    @Override // com.bumptech.glide.load.data.d
    public void cancel() {
        this.f5198f = true;
    }

    @Override // com.bumptech.glide.load.data.d
    public i2.a d() {
        return i2.a.REMOTE;
    }

    @Override // com.bumptech.glide.load.data.d
    public void e(com.bumptech.glide.h hVar, d.a aVar) {
        long jB = e3.g.b();
        try {
            try {
                aVar.f(j(this.f5193a.h(), 0, null, this.f5193a.e()));
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + e3.g.a(jB));
                }
            } catch (IOException e10) {
                if (Log.isLoggable("HttpUrlFetcher", 3)) {
                    Log.d("HttpUrlFetcher", "Failed to load data for url", e10);
                }
                aVar.c(e10);
                if (Log.isLoggable("HttpUrlFetcher", 2)) {
                    Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + e3.g.a(jB));
                }
            }
        } catch (Throwable th2) {
            if (Log.isLoggable("HttpUrlFetcher", 2)) {
                Log.v("HttpUrlFetcher", "Finished http url fetcher fetch in " + e3.g.a(jB));
            }
            throw th2;
        }
    }

    j(o2.h hVar, int i10, b bVar) {
        this.f5193a = hVar;
        this.f5194b = i10;
        this.f5195c = bVar;
    }
}
