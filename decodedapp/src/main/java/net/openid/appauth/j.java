package net.openid.appauth;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import net.openid.appauth.o;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class j {
    static final o.e A;
    static final o.e B;
    static final o.f C;
    static final o.e D;
    static final o.e E;
    static final o.a F;
    static final o.a G;
    static final o.a H;
    static final o.a I;
    static final o.f J;
    static final o.f K;
    private static final List L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final o.d f22846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final o.f f22847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final o.f f22848d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final o.f f22849e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final o.f f22850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final o.f f22851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final o.f f22852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final o.e f22853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final o.e f22854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final o.e f22855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final o.e f22856l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final o.e f22857m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final o.e f22858n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final o.e f22859o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final o.e f22860p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final o.e f22861q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final o.e f22862r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final o.e f22863s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final o.e f22864t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final o.e f22865u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    static final o.e f22866v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    static final o.e f22867w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final o.e f22868x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final o.e f22869y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    static final o.e f22870z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f22871a;

    public static class a extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f22872a;

        public a(String str) {
            super("Missing mandatory configuration field: " + str);
            this.f22872a = str;
        }

        public String a() {
            return this.f22872a;
        }
    }

    static {
        o.d dVarH = h("issuer");
        f22846b = dVarH;
        o.f fVarK = k("authorization_endpoint");
        f22847c = fVarK;
        f22848d = k("token_endpoint");
        f22849e = k("end_session_endpoint");
        f22850f = k("userinfo_endpoint");
        o.f fVarK2 = k("jwks_uri");
        f22851g = fVarK2;
        f22852h = k("registration_endpoint");
        f22853i = i("scopes_supported");
        o.e eVarI = i("response_types_supported");
        f22854j = eVarI;
        f22855k = i("response_modes_supported");
        f22856l = j("grant_types_supported", Arrays.asList("authorization_code", "implicit"));
        f22857m = i("acr_values_supported");
        o.e eVarI2 = i("subject_types_supported");
        f22858n = eVarI2;
        o.e eVarI3 = i("id_token_signing_alg_values_supported");
        f22859o = eVarI3;
        f22860p = i("id_token_encryption_enc_values_supported");
        f22861q = i("id_token_encryption_enc_values_supported");
        f22862r = i("userinfo_signing_alg_values_supported");
        f22863s = i("userinfo_encryption_alg_values_supported");
        f22864t = i("userinfo_encryption_enc_values_supported");
        f22865u = i("request_object_signing_alg_values_supported");
        f22866v = i("request_object_encryption_alg_values_supported");
        f22867w = i("request_object_encryption_enc_values_supported");
        f22868x = j("token_endpoint_auth_methods_supported", Collections.singletonList("client_secret_basic"));
        f22869y = i("token_endpoint_auth_signing_alg_values_supported");
        f22870z = i("display_values_supported");
        A = j("claim_types_supported", Collections.singletonList("normal"));
        B = i("claims_supported");
        C = k("service_documentation");
        D = i("claims_locales_supported");
        E = i("ui_locales_supported");
        F = a("claims_parameter_supported", false);
        G = a("request_parameter_supported", false);
        H = a("request_uri_parameter_supported", true);
        I = a("require_request_uri_registration", false);
        J = k("op_policy_uri");
        K = k("op_tos_uri");
        L = Arrays.asList(dVarH.f22895a, fVarK.f22895a, fVarK2.f22895a, eVarI.f22897a, eVarI2.f22897a, eVarI3.f22897a);
    }

    public j(JSONObject jSONObject) throws a {
        this.f22871a = (JSONObject) ah.h.d(jSONObject);
        for (String str : L) {
            if (!this.f22871a.has(str) || this.f22871a.get(str) == null) {
                throw new a(str);
            }
        }
    }

    private static o.a a(String str, boolean z10) {
        return new o.a(str, z10);
    }

    private Object b(o.b bVar) {
        return o.a(this.f22871a, bVar);
    }

    private static o.d h(String str) {
        return new o.d(str);
    }

    private static o.e i(String str) {
        return new o.e(str);
    }

    private static o.e j(String str, List list) {
        return new o.e(str, list);
    }

    private static o.f k(String str) {
        return new o.f(str);
    }

    public Uri c() {
        return (Uri) b(f22847c);
    }

    public Uri d() {
        return (Uri) b(f22849e);
    }

    public String e() {
        return (String) b(f22846b);
    }

    public Uri f() {
        return (Uri) b(f22852h);
    }

    public Uri g() {
        return (Uri) b(f22848d);
    }
}
