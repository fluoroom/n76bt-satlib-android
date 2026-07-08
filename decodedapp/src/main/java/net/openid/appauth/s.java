package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class s {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set f22921k = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("client_id", "code", "code_verifier", "grant_type", "redirect_uri", "refresh_token", "scope")));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f22922a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22923b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22924c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22925d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Uri f22926e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22928g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22929h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f22930i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f22931j;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private i f22932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f22933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f22934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f22935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Uri f22936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f22937f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f22938g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private String f22939h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f22940i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Map f22941j;

        public b(i iVar, String str) {
            g(iVar);
            e(str);
            this.f22941j = new LinkedHashMap();
        }

        private String b() {
            String str = this.f22935d;
            if (str != null) {
                return str;
            }
            if (this.f22938g != null) {
                return "authorization_code";
            }
            if (this.f22939h != null) {
                return "refresh_token";
            }
            throw new IllegalStateException("grant type not specified and cannot be inferred");
        }

        public s a() {
            String strB = b();
            if ("authorization_code".equals(strB)) {
                ah.h.e(this.f22938g, "authorization code must be specified for grant_type = authorization_code");
            }
            if ("refresh_token".equals(strB)) {
                ah.h.e(this.f22939h, "refresh token must be specified for grant_type = refresh_token");
            }
            if (strB.equals("authorization_code") && this.f22936e == null) {
                throw new IllegalStateException("no redirect URI specified on token request for code exchange");
            }
            return new s(this.f22932a, this.f22933b, this.f22934c, strB, this.f22936e, this.f22937f, this.f22938g, this.f22939h, this.f22940i, DesugarCollections.unmodifiableMap(this.f22941j));
        }

        public b c(Map map) {
            this.f22941j = net.openid.appauth.a.b(map, s.f22921k);
            return this;
        }

        public b d(String str) {
            ah.h.f(str, "authorization code must not be empty");
            this.f22938g = str;
            return this;
        }

        public b e(String str) {
            this.f22933b = ah.h.c(str, "clientId cannot be null or empty");
            return this;
        }

        public b f(String str) {
            if (str != null) {
                ah.f.a(str);
            }
            this.f22940i = str;
            return this;
        }

        public b g(i iVar) {
            this.f22932a = (i) ah.h.d(iVar);
            return this;
        }

        public b h(String str) {
            this.f22935d = ah.h.c(str, "grantType cannot be null or empty");
            return this;
        }

        public b i(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f22934c = null;
                return this;
            }
            this.f22934c = str;
            return this;
        }

        public b j(Uri uri) {
            if (uri != null) {
                ah.h.e(uri.getScheme(), "redirectUri must have a scheme");
            }
            this.f22936e = uri;
            return this;
        }

        public b k(String str) {
            if (str != null) {
                ah.h.c(str, "refresh token cannot be empty if defined");
            }
            this.f22939h = str;
            return this;
        }

        public b l(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f22937f = null;
                return this;
            }
            n(str.split(" +"));
            return this;
        }

        public b m(Iterable iterable) {
            this.f22937f = net.openid.appauth.b.a(iterable);
            return this;
        }

        public b n(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            m(Arrays.asList(strArr));
            return this;
        }
    }

    public static s c(JSONObject jSONObject) {
        ah.h.e(jSONObject, "json object cannot be null");
        return new s(i.a(jSONObject.getJSONObject("configuration")), o.d(jSONObject, "clientId"), o.e(jSONObject, "nonce"), o.d(jSONObject, "grantType"), o.j(jSONObject, "redirectUri"), o.e(jSONObject, "scope"), o.e(jSONObject, "authorizationCode"), o.e(jSONObject, "refreshToken"), o.e(jSONObject, "codeVerifier"), o.h(jSONObject, "additionalParameters"));
    }

    private void e(Map map, String str, Object obj) {
        if (obj != null) {
            map.put(str, obj.toString());
        }
    }

    public Map b() {
        HashMap map = new HashMap();
        map.put("grant_type", this.f22925d);
        e(map, "redirect_uri", this.f22926e);
        e(map, "code", this.f22927f);
        e(map, "refresh_token", this.f22929h);
        e(map, "code_verifier", this.f22930i);
        e(map, "scope", this.f22928g);
        for (Map.Entry entry : this.f22931j.entrySet()) {
            map.put((String) entry.getKey(), (String) entry.getValue());
        }
        return map;
    }

    public JSONObject d() {
        JSONObject jSONObject = new JSONObject();
        o.p(jSONObject, "configuration", this.f22922a.b());
        o.n(jSONObject, "clientId", this.f22924c);
        o.s(jSONObject, "nonce", this.f22923b);
        o.n(jSONObject, "grantType", this.f22925d);
        o.q(jSONObject, "redirectUri", this.f22926e);
        o.s(jSONObject, "scope", this.f22928g);
        o.s(jSONObject, "authorizationCode", this.f22927f);
        o.s(jSONObject, "refreshToken", this.f22929h);
        o.s(jSONObject, "codeVerifier", this.f22930i);
        o.p(jSONObject, "additionalParameters", o.l(this.f22931j));
        return jSONObject;
    }

    private s(i iVar, String str, String str2, String str3, Uri uri, String str4, String str5, String str6, String str7, Map map) {
        this.f22922a = iVar;
        this.f22924c = str;
        this.f22923b = str2;
        this.f22925d = str3;
        this.f22926e = uri;
        this.f22928g = str4;
        this.f22927f = str5;
        this.f22929h = str6;
        this.f22930i = str7;
        this.f22931j = map;
    }
}
