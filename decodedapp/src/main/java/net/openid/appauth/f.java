package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class f implements ah.b {

    /* JADX INFO: renamed from: s */
    private static final Set f22773s = net.openid.appauth.a.a("client_id", "code_challenge", "code_challenge_method", "display", "login_hint", "prompt", "ui_locales", "redirect_uri", "response_mode", "response_type", "scope", "state", "claims", "claims_locales");

    /* JADX INFO: renamed from: a */
    public final i f22774a;

    /* JADX INFO: renamed from: b */
    public final String f22775b;

    /* JADX INFO: renamed from: c */
    public final String f22776c;

    /* JADX INFO: renamed from: d */
    public final String f22777d;

    /* JADX INFO: renamed from: e */
    public final String f22778e;

    /* JADX INFO: renamed from: f */
    public final String f22779f;

    /* JADX INFO: renamed from: g */
    public final String f22780g;

    /* JADX INFO: renamed from: h */
    public final Uri f22781h;

    /* JADX INFO: renamed from: i */
    public final String f22782i;

    /* JADX INFO: renamed from: j */
    public final String f22783j;

    /* JADX INFO: renamed from: k */
    public final String f22784k;

    /* JADX INFO: renamed from: l */
    public final String f22785l;

    /* JADX INFO: renamed from: m */
    public final String f22786m;

    /* JADX INFO: renamed from: n */
    public final String f22787n;

    /* JADX INFO: renamed from: o */
    public final String f22788o;

    /* JADX INFO: renamed from: p */
    public final JSONObject f22789p;

    /* JADX INFO: renamed from: q */
    public final String f22790q;

    /* JADX INFO: renamed from: r */
    public final Map f22791r;

    public static final class b {

        /* JADX INFO: renamed from: a */
        private i f22792a;

        /* JADX INFO: renamed from: b */
        private String f22793b;

        /* JADX INFO: renamed from: c */
        private String f22794c;

        /* JADX INFO: renamed from: d */
        private String f22795d;

        /* JADX INFO: renamed from: e */
        private String f22796e;

        /* JADX INFO: renamed from: f */
        private String f22797f;

        /* JADX INFO: renamed from: g */
        private String f22798g;

        /* JADX INFO: renamed from: h */
        private Uri f22799h;

        /* JADX INFO: renamed from: i */
        private String f22800i;

        /* JADX INFO: renamed from: j */
        private String f22801j;

        /* JADX INFO: renamed from: k */
        private String f22802k;

        /* JADX INFO: renamed from: l */
        private String f22803l;

        /* JADX INFO: renamed from: m */
        private String f22804m;

        /* JADX INFO: renamed from: n */
        private String f22805n;

        /* JADX INFO: renamed from: o */
        private String f22806o;

        /* JADX INFO: renamed from: p */
        private JSONObject f22807p;

        /* JADX INFO: renamed from: q */
        private String f22808q;

        /* JADX INFO: renamed from: r */
        private Map f22809r = new HashMap();

        public b(i iVar, String str, String str2, Uri uri) {
            b(iVar);
            c(str);
            g(str2);
            f(uri);
            k(e.a());
            e(e.a());
            d(ah.f.c());
        }

        public f a() {
            return new f(this.f22792a, this.f22793b, this.f22798g, this.f22799h, this.f22794c, this.f22795d, this.f22796e, this.f22797f, this.f22800i, this.f22801j, this.f22802k, this.f22803l, this.f22804m, this.f22805n, this.f22806o, this.f22807p, this.f22808q, DesugarCollections.unmodifiableMap(new HashMap(this.f22809r)));
        }

        public b b(i iVar) {
            this.f22792a = (i) ah.h.e(iVar, "configuration cannot be null");
            return this;
        }

        public b c(String str) {
            this.f22793b = ah.h.c(str, "client ID cannot be null or empty");
            return this;
        }

        public b d(String str) {
            if (str == null) {
                this.f22803l = null;
                this.f22804m = null;
                this.f22805n = null;
                return this;
            }
            ah.f.a(str);
            this.f22803l = str;
            this.f22804m = ah.f.b(str);
            this.f22805n = ah.f.e();
            return this;
        }

        public b e(String str) {
            this.f22802k = ah.h.f(str, "nonce cannot be empty if defined");
            return this;
        }

        public b f(Uri uri) {
            this.f22799h = (Uri) ah.h.e(uri, "redirect URI cannot be null or empty");
            return this;
        }

        public b g(String str) {
            this.f22798g = ah.h.c(str, "expected response type cannot be null or empty");
            return this;
        }

        public b h(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f22800i = null;
                return this;
            }
            j(str.split(" +"));
            return this;
        }

        public b i(Iterable iterable) {
            this.f22800i = net.openid.appauth.b.a(iterable);
            return this;
        }

        public b j(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            i(Arrays.asList(strArr));
            return this;
        }

        public b k(String str) {
            this.f22801j = ah.h.f(str, "state cannot be empty if defined");
            return this;
        }
    }

    /* synthetic */ f(i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, JSONObject jSONObject, String str14, Map map, a aVar) {
        this(iVar, str, str2, uri, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12, str13, jSONObject, str14, map);
    }

    public static f b(JSONObject jSONObject) {
        ah.h.e(jSONObject, "json cannot be null");
        return new f(i.a(jSONObject.getJSONObject("configuration")), o.d(jSONObject, "clientId"), o.d(jSONObject, "responseType"), o.i(jSONObject, "redirectUri"), o.e(jSONObject, "display"), o.e(jSONObject, "login_hint"), o.e(jSONObject, "prompt"), o.e(jSONObject, "ui_locales"), o.e(jSONObject, "scope"), o.e(jSONObject, "state"), o.e(jSONObject, "nonce"), o.e(jSONObject, "codeVerifier"), o.e(jSONObject, "codeVerifierChallenge"), o.e(jSONObject, "codeVerifierChallengeMethod"), o.e(jSONObject, "responseMode"), o.b(jSONObject, "claims"), o.e(jSONObject, "claimsLocales"), o.h(jSONObject, "additionalParameters"));
    }

    @Override // ah.b
    public String a() {
        return c().toString();
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        o.p(jSONObject, "configuration", this.f22774a.b());
        o.n(jSONObject, "clientId", this.f22775b);
        o.n(jSONObject, "responseType", this.f22780g);
        o.n(jSONObject, "redirectUri", this.f22781h.toString());
        o.s(jSONObject, "display", this.f22776c);
        o.s(jSONObject, "login_hint", this.f22777d);
        o.s(jSONObject, "scope", this.f22782i);
        o.s(jSONObject, "prompt", this.f22778e);
        o.s(jSONObject, "ui_locales", this.f22779f);
        o.s(jSONObject, "state", this.f22783j);
        o.s(jSONObject, "nonce", this.f22784k);
        o.s(jSONObject, "codeVerifier", this.f22785l);
        o.s(jSONObject, "codeVerifierChallenge", this.f22786m);
        o.s(jSONObject, "codeVerifierChallengeMethod", this.f22787n);
        o.s(jSONObject, "responseMode", this.f22788o);
        o.t(jSONObject, "claims", this.f22789p);
        o.s(jSONObject, "claimsLocales", this.f22790q);
        o.p(jSONObject, "additionalParameters", o.l(this.f22791r));
        return jSONObject;
    }

    @Override // ah.b
    public String getState() {
        return this.f22783j;
    }

    private f(i iVar, String str, String str2, Uri uri, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, JSONObject jSONObject, String str14, Map map) {
        this.f22774a = iVar;
        this.f22775b = str;
        this.f22780g = str2;
        this.f22781h = uri;
        this.f22791r = map;
        this.f22776c = str3;
        this.f22777d = str4;
        this.f22778e = str5;
        this.f22779f = str6;
        this.f22782i = str7;
        this.f22783j = str8;
        this.f22784k = str9;
        this.f22785l = str10;
        this.f22786m = str11;
        this.f22787n = str12;
        this.f22788o = str13;
        this.f22789p = jSONObject;
        this.f22790q = str14;
    }
}
