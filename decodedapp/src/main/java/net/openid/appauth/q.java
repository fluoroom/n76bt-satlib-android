package net.openid.appauth;

import android.net.Uri;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class q {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Set f22910j = new HashSet(Arrays.asList("client_id", "client_secret", "client_secret_expires_at", "registration_access_token", "registration_client_uri", "client_id_issued_at", "token_endpoint_auth_method"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f22911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f22913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f22915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f22917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f22918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f22919i;

    private q(p pVar, String str, Long l10, String str2, Long l11, String str3, Uri uri, String str4, Map map) {
        this.f22911a = pVar;
        this.f22912b = str;
        this.f22913c = l10;
        this.f22914d = str2;
        this.f22915e = l11;
        this.f22916f = str3;
        this.f22917g = uri;
        this.f22918h = str4;
        this.f22919i = map;
    }

    public static q a(JSONObject jSONObject) {
        ah.h.e(jSONObject, "json cannot be null");
        if (jSONObject.has("request")) {
            return new q(p.a(jSONObject.getJSONObject("request")), o.d(jSONObject, "client_id"), o.c(jSONObject, "client_id_issued_at"), o.e(jSONObject, "client_secret"), o.c(jSONObject, "client_secret_expires_at"), o.e(jSONObject, "registration_access_token"), o.j(jSONObject, "registration_client_uri"), o.e(jSONObject, "token_endpoint_auth_method"), o.h(jSONObject, "additionalParameters"));
        }
        throw new IllegalArgumentException("registration request not found in JSON");
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        o.p(jSONObject, "request", this.f22911a.b());
        o.n(jSONObject, "client_id", this.f22912b);
        o.r(jSONObject, "client_id_issued_at", this.f22913c);
        o.s(jSONObject, "client_secret", this.f22914d);
        o.r(jSONObject, "client_secret_expires_at", this.f22915e);
        o.s(jSONObject, "registration_access_token", this.f22916f);
        o.q(jSONObject, "registration_client_uri", this.f22917g);
        o.s(jSONObject, "token_endpoint_auth_method", this.f22918h);
        o.p(jSONObject, "additionalParameters", o.l(this.f22919i));
        return jSONObject;
    }
}
