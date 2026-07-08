package net.openid.appauth;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.facebook.stetho.server.http.HttpHeaders;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URLConnection;
import java.util.Map;
import net.openid.appauth.d;
import net.openid.appauth.n;
import net.openid.appauth.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: a */
    Context f22829a;

    /* JADX INFO: renamed from: b */
    private final ah.a f22830b;

    /* JADX INFO: renamed from: c */
    private final bh.i f22831c;

    /* JADX INFO: renamed from: d */
    private final bh.c f22832d;

    /* JADX INFO: renamed from: e */
    private boolean f22833e;

    private static class a extends AsyncTask {

        /* JADX INFO: renamed from: a */
        private s f22834a;

        /* JADX INFO: renamed from: b */
        private ah.d f22835b;

        /* JADX INFO: renamed from: c */
        private final ch.a f22836c;

        /* JADX INFO: renamed from: d */
        private b f22837d;

        /* JADX INFO: renamed from: e */
        private k f22838e;

        /* JADX INFO: renamed from: f */
        private boolean f22839f;

        /* JADX INFO: renamed from: g */
        private d f22840g;

        a(s sVar, ah.d dVar, ch.a aVar, k kVar, b bVar, Boolean bool) {
            this.f22834a = sVar;
            this.f22835b = dVar;
            this.f22836c = aVar;
            this.f22838e = kVar;
            this.f22837d = bVar;
            this.f22839f = bool.booleanValue();
        }

        private void a(URLConnection uRLConnection) {
            if (TextUtils.isEmpty(uRLConnection.getRequestProperty("Accept"))) {
                uRLConnection.setRequestProperty("Accept", "application/json");
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: b */
        public JSONObject doInBackground(Void... voidArr) throws Throwable {
            InputStream inputStream;
            InputStream inputStream2 = null;
            try {
                try {
                    HttpURLConnection httpURLConnectionA = this.f22836c.a(this.f22834a.f22922a.f22842b);
                    httpURLConnectionA.setRequestMethod("POST");
                    httpURLConnectionA.setRequestProperty(HttpHeaders.CONTENT_TYPE, "application/x-www-form-urlencoded");
                    a(httpURLConnectionA);
                    httpURLConnectionA.setDoOutput(true);
                    Map mapB = this.f22835b.b(this.f22834a.f22924c);
                    if (mapB != null) {
                        for (Map.Entry entry : mapB.entrySet()) {
                            httpURLConnectionA.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                    }
                    Map mapB2 = this.f22834a.b();
                    Map mapA = this.f22835b.a(this.f22834a.f22924c);
                    if (mapA != null) {
                        mapB2.putAll(mapA);
                    }
                    String strA = dh.b.a(mapB2);
                    httpURLConnectionA.setRequestProperty(HttpHeaders.CONTENT_LENGTH, String.valueOf(strA.length()));
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnectionA.getOutputStream());
                    outputStreamWriter.write(strA);
                    outputStreamWriter.flush();
                    InputStream errorStream = (httpURLConnectionA.getResponseCode() < 200 || httpURLConnectionA.getResponseCode() >= 300) ? httpURLConnectionA.getErrorStream() : httpURLConnectionA.getInputStream();
                    try {
                        JSONObject jSONObject = new JSONObject(u.b(errorStream));
                        u.a(errorStream);
                        return jSONObject;
                    } catch (IOException e10) {
                        inputStream = errorStream;
                        e = e10;
                        dh.a.b(e, "Failed to complete exchange request", new Object[0]);
                        this.f22840g = d.l(d.b.f22757d, e);
                        u.a(inputStream);
                        return null;
                    } catch (JSONException e11) {
                        inputStream = errorStream;
                        e = e11;
                        dh.a.b(e, "Failed to complete exchange request", new Object[0]);
                        this.f22840g = d.l(d.b.f22759f, e);
                        u.a(inputStream);
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream2 = errorStream;
                        u.a(inputStream2);
                        throw th;
                    }
                } catch (IOException e12) {
                    e = e12;
                    inputStream = null;
                } catch (JSONException e13) {
                    e = e13;
                    inputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream2 = inputStream;
            }
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: c */
        public void onPostExecute(JSONObject jSONObject) {
            d dVarL;
            d dVar = this.f22840g;
            if (dVar != null) {
                this.f22837d.a(null, dVar);
                return;
            }
            if (jSONObject.has("error")) {
                try {
                    String string = jSONObject.getString("error");
                    dVarL = d.k(d.c.a(string), string, jSONObject.optString("error_description", null), dh.b.d(jSONObject.optString("error_uri")));
                } catch (JSONException e10) {
                    dVarL = d.l(d.b.f22759f, e10);
                }
                this.f22837d.a(null, dVarL);
                return;
            }
            try {
                t tVarA = new t.a(this.f22834a).b(jSONObject).a();
                String str = tVarA.f22947e;
                if (str != null) {
                    try {
                        try {
                            n.a(str).c(this.f22834a, this.f22838e, this.f22839f);
                        } catch (d e11) {
                            this.f22837d.a(null, e11);
                            return;
                        }
                    } catch (n.a | JSONException e12) {
                        this.f22837d.a(null, d.l(d.b.f22762i, e12));
                        return;
                    }
                }
                dh.a.a("Token exchange with %s completed", this.f22834a.f22922a.f22842b);
                this.f22837d.a(tVarA, null);
            } catch (JSONException e13) {
                this.f22837d.a(null, d.l(d.b.f22759f, e13));
            }
        }
    }

    public interface b {
        void a(t tVar, d dVar);
    }

    public h(Context context, ah.a aVar) {
        this(context, aVar, bh.e.d(context, aVar.a()), new bh.i(context));
    }

    private void a() {
        if (this.f22833e) {
            throw new IllegalStateException("Service has been disposed and rendered inoperable");
        }
    }

    public void b() {
        if (this.f22833e) {
            return;
        }
        this.f22831c.d();
        this.f22833e = true;
    }

    public void c(s sVar, ah.d dVar, b bVar) {
        a();
        dh.a.a("Initiating code exchange request to %s", sVar.f22922a.f22842b);
        new a(sVar, dVar, this.f22830b.b(), r.f22920a, bVar, Boolean.valueOf(this.f22830b.c())).execute(new Void[0]);
    }

    public void d(s sVar, b bVar) {
        c(sVar, ah.g.f623a, bVar);
    }

    h(Context context, ah.a aVar, bh.c cVar, bh.i iVar) {
        this.f22833e = false;
        this.f22829a = (Context) ah.h.d(context);
        this.f22830b = aVar;
        this.f22831c = iVar;
        this.f22832d = cVar;
        if (cVar == null || !cVar.f4050d.booleanValue()) {
            return;
        }
        iVar.c(cVar.f4047a);
    }
}
