package net.openid.appauth;

import android.net.Uri;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class l implements ah.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set f22873g = a.a("id_token_hint", "post_logout_redirect_uri", "state", "ui_locales");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f22874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f22876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f22877d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f22879f;

    private l(i iVar, String str, Uri uri, String str2, String str3, Map map) {
        this.f22874a = iVar;
        this.f22875b = str;
        this.f22876c = uri;
        this.f22877d = str2;
        this.f22878e = str3;
        this.f22879f = map;
    }

    public static l b(JSONObject jSONObject) {
        ah.h.e(jSONObject, "json cannot be null");
        return new l(i.a(jSONObject.getJSONObject("configuration")), o.e(jSONObject, "id_token_hint"), o.j(jSONObject, "post_logout_redirect_uri"), o.e(jSONObject, "state"), o.e(jSONObject, "ui_locales"), o.h(jSONObject, "additionalParameters"));
    }

    @Override // ah.b
    public String a() {
        return c().toString();
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        o.p(jSONObject, "configuration", this.f22874a.b());
        o.s(jSONObject, "id_token_hint", this.f22875b);
        o.q(jSONObject, "post_logout_redirect_uri", this.f22876c);
        o.s(jSONObject, "state", this.f22877d);
        o.s(jSONObject, "ui_locales", this.f22878e);
        o.p(jSONObject, "additionalParameters", o.l(this.f22879f));
        return jSONObject;
    }

    @Override // ah.b
    public String getState() {
        return this.f22877d;
    }
}
