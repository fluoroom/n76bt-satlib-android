package net.openid.appauth;

import android.net.Uri;
import net.openid.appauth.j;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f22841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Uri f22842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f22843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri f22844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j f22845e;

    public i(Uri uri, Uri uri2) {
        this(uri, uri2, null);
    }

    public static i a(JSONObject jSONObject) throws JSONException {
        ah.h.e(jSONObject, "json object cannot be null");
        if (!jSONObject.has("discoveryDoc")) {
            ah.h.a(jSONObject.has("authorizationEndpoint"), "missing authorizationEndpoint");
            ah.h.a(jSONObject.has("tokenEndpoint"), "missing tokenEndpoint");
            return new i(o.i(jSONObject, "authorizationEndpoint"), o.i(jSONObject, "tokenEndpoint"), o.j(jSONObject, "registrationEndpoint"), o.j(jSONObject, "endSessionEndpoint"));
        }
        try {
            return new i(new j(jSONObject.optJSONObject("discoveryDoc")));
        } catch (j.a e10) {
            throw new JSONException("Missing required field in discovery doc: " + e10.a());
        }
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        o.n(jSONObject, "authorizationEndpoint", this.f22841a.toString());
        o.n(jSONObject, "tokenEndpoint", this.f22842b.toString());
        Uri uri = this.f22844d;
        if (uri != null) {
            o.n(jSONObject, "registrationEndpoint", uri.toString());
        }
        Uri uri2 = this.f22843c;
        if (uri2 != null) {
            o.n(jSONObject, "endSessionEndpoint", uri2.toString());
        }
        j jVar = this.f22845e;
        if (jVar != null) {
            o.p(jSONObject, "discoveryDoc", jVar.f22871a);
        }
        return jSONObject;
    }

    public i(Uri uri, Uri uri2, Uri uri3) {
        this(uri, uri2, uri3, null);
    }

    public i(Uri uri, Uri uri2, Uri uri3, Uri uri4) {
        this.f22841a = (Uri) ah.h.d(uri);
        this.f22842b = (Uri) ah.h.d(uri2);
        this.f22844d = uri3;
        this.f22843c = uri4;
        this.f22845e = null;
    }

    public i(j jVar) {
        ah.h.e(jVar, "docJson cannot be null");
        this.f22845e = jVar;
        this.f22841a = jVar.c();
        this.f22842b = jVar.g();
        this.f22844d = jVar.f();
        this.f22843c = jVar.d();
    }
}
