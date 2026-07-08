package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import com.facebook.stetho.websocket.CloseCodes;
import j$.util.DesugarCollections;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class d extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f22739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f22742e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f22743a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f22744b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f22745c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f22746d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f22747e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f22748f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f22749g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final d f22750h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f22751i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final d f22752j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Map f22753k;

        static {
            d dVarE = d.e(CloseCodes.NORMAL_CLOSURE, "invalid_request");
            f22743a = dVarE;
            d dVarE2 = d.e(1001, "unauthorized_client");
            f22744b = dVarE2;
            d dVarE3 = d.e(CloseCodes.PROTOCOL_ERROR, "access_denied");
            f22745c = dVarE3;
            d dVarE4 = d.e(1003, "unsupported_response_type");
            f22746d = dVarE4;
            d dVarE5 = d.e(1004, "invalid_scope");
            f22747e = dVarE5;
            d dVarE6 = d.e(1005, "server_error");
            f22748f = dVarE6;
            d dVarE7 = d.e(CloseCodes.CLOSED_ABNORMALLY, "temporarily_unavailable");
            f22749g = dVarE7;
            d dVarE8 = d.e(1007, null);
            f22750h = dVarE8;
            d dVarE9 = d.e(1008, null);
            f22751i = dVarE9;
            f22752j = d.n(9, "Response state param did not match request state");
            f22753k = d.f(dVarE, dVarE2, dVarE3, dVarE4, dVarE5, dVarE6, dVarE7, dVarE8, dVarE9);
        }

        public static d a(String str) {
            d dVar = (d) f22753k.get(str);
            return dVar != null ? dVar : f22751i;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f22754a = d.n(0, "Invalid discovery document");

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f22755b = d.n(1, "User cancelled flow");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f22756c = d.n(2, "Flow cancelled programmatically");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f22757d = d.n(3, "Network error");

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f22758e = d.n(4, "Server error");

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f22759f = d.n(5, "JSON deserialization error");

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f22760g = d.n(6, "Token response construction error");

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final d f22761h = d.n(7, "Invalid registration response");

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final d f22762i = d.n(8, "Unable to parse ID Token");

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final d f22763j = d.n(9, "Invalid ID Token");
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f22764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f22765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final d f22766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f22767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final d f22768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final d f22769f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f22770g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final d f22771h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final Map f22772i;

        static {
            d dVarR = d.r(2000, "invalid_request");
            f22764a = dVarR;
            d dVarR2 = d.r(2001, "invalid_client");
            f22765b = dVarR2;
            d dVarR3 = d.r(2002, "invalid_grant");
            f22766c = dVarR3;
            d dVarR4 = d.r(2003, "unauthorized_client");
            f22767d = dVarR4;
            d dVarR5 = d.r(2004, "unsupported_grant_type");
            f22768e = dVarR5;
            d dVarR6 = d.r(2005, "invalid_scope");
            f22769f = dVarR6;
            d dVarR7 = d.r(2006, null);
            f22770g = dVarR7;
            d dVarR8 = d.r(2007, null);
            f22771h = dVarR8;
            f22772i = d.f(dVarR, dVarR2, dVarR3, dVarR4, dVarR5, dVarR6, dVarR7, dVarR8);
        }

        public static d a(String str) {
            d dVar = (d) f22772i.get(str);
            return dVar != null ? dVar : f22771h;
        }
    }

    public d(int i10, int i11, String str, String str2, Uri uri, Throwable th2) {
        super(str2, th2);
        this.f22738a = i10;
        this.f22739b = i11;
        this.f22740c = str;
        this.f22741d = str2;
        this.f22742e = uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d e(int i10, String str) {
        return new d(1, i10, str, null, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map f(d... dVarArr) {
        androidx.collection.a aVar = new androidx.collection.a(dVarArr != null ? dVarArr.length : 0);
        if (dVarArr != null) {
            for (d dVar : dVarArr) {
                String str = dVar.f22740c;
                if (str != null) {
                    aVar.put(str, dVar);
                }
            }
        }
        return DesugarCollections.unmodifiableMap(aVar);
    }

    public static d g(Intent intent) {
        ah.h.d(intent);
        if (!intent.hasExtra("net.openid.appauth.AuthorizationException")) {
            return null;
        }
        try {
            return h(intent.getStringExtra("net.openid.appauth.AuthorizationException"));
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Intent contains malformed exception data", e10);
        }
    }

    public static d h(String str) {
        ah.h.c(str, "jsonStr cannot be null or empty");
        return i(new JSONObject(str));
    }

    public static d i(JSONObject jSONObject) {
        ah.h.e(jSONObject, "json cannot be null");
        return new d(jSONObject.getInt("type"), jSONObject.getInt("code"), o.e(jSONObject, "error"), o.e(jSONObject, "errorDescription"), o.j(jSONObject, "errorUri"), null);
    }

    public static d j(Uri uri) {
        String queryParameter = uri.getQueryParameter("error");
        String queryParameter2 = uri.getQueryParameter("error_description");
        String queryParameter3 = uri.getQueryParameter("error_uri");
        d dVarA = a.a(queryParameter);
        int i10 = dVarA.f22738a;
        int i11 = dVarA.f22739b;
        if (queryParameter2 == null) {
            queryParameter2 = dVarA.f22741d;
        }
        return new d(i10, i11, queryParameter, queryParameter2, queryParameter3 != null ? Uri.parse(queryParameter3) : dVarA.f22742e, null);
    }

    public static d k(d dVar, String str, String str2, Uri uri) {
        int i10 = dVar.f22738a;
        int i11 = dVar.f22739b;
        if (str == null) {
            str = dVar.f22740c;
        }
        String str3 = str;
        if (str2 == null) {
            str2 = dVar.f22741d;
        }
        String str4 = str2;
        if (uri == null) {
            uri = dVar.f22742e;
        }
        return new d(i10, i11, str3, str4, uri, null);
    }

    public static d l(d dVar, Throwable th2) {
        return new d(dVar.f22738a, dVar.f22739b, dVar.f22740c, dVar.f22741d, dVar.f22742e, th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d n(int i10, String str) {
        return new d(0, i10, null, str, null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d r(int i10, String str) {
        return new d(2, i10, str, null, null, null);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof d)) {
            d dVar = (d) obj;
            if (this.f22738a == dVar.f22738a && this.f22739b == dVar.f22739b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f22738a + 31) * 31) + this.f22739b;
    }

    public Intent o() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationException", q());
        return intent;
    }

    public JSONObject p() {
        JSONObject jSONObject = new JSONObject();
        o.m(jSONObject, "type", this.f22738a);
        o.m(jSONObject, "code", this.f22739b);
        o.s(jSONObject, "error", this.f22740c);
        o.s(jSONObject, "errorDescription", this.f22741d);
        o.q(jSONObject, "errorUri", this.f22742e);
        return jSONObject;
    }

    public String q() {
        return p().toString();
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "AuthorizationException: " + q();
    }
}
