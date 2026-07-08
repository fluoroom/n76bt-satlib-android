package net.openid.appauth;

import android.net.Uri;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class p {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set f22899k = a.a("redirect_uris", "response_types", "grant_types", "application_type", "subject_type", "jwks_uri", "jwks", "token_endpoint_auth_method");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f22900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22902c = "native";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f22903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f22904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Uri f22906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final JSONObject f22907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f22908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Map f22909j;

    private p(i iVar, List list, List list2, List list3, String str, Uri uri, JSONObject jSONObject, String str2, Map map) {
        this.f22900a = iVar;
        this.f22901b = list;
        this.f22903d = list2;
        this.f22904e = list3;
        this.f22905f = str;
        this.f22906g = uri;
        this.f22907h = jSONObject;
        this.f22908i = str2;
        this.f22909j = map;
    }

    public static p a(JSONObject jSONObject) {
        ah.h.e(jSONObject, "json must not be null");
        return new p(i.a(jSONObject.getJSONObject("configuration")), o.k(jSONObject, "redirect_uris"), o.g(jSONObject, "response_types"), o.g(jSONObject, "grant_types"), o.e(jSONObject, "subject_type"), o.j(jSONObject, "jwks_uri"), o.b(jSONObject, "jwks"), o.e(jSONObject, "token_endpoint_auth_method"), o.h(jSONObject, "additionalParameters"));
    }

    private JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        o.o(jSONObject, "redirect_uris", o.u(this.f22901b));
        o.n(jSONObject, "application_type", this.f22902c);
        List list = this.f22903d;
        if (list != null) {
            o.o(jSONObject, "response_types", o.u(list));
        }
        List list2 = this.f22904e;
        if (list2 != null) {
            o.o(jSONObject, "grant_types", o.u(list2));
        }
        o.s(jSONObject, "subject_type", this.f22905f);
        o.q(jSONObject, "jwks_uri", this.f22906g);
        o.t(jSONObject, "jwks", this.f22907h);
        o.s(jSONObject, "token_endpoint_auth_method", this.f22908i);
        return jSONObject;
    }

    public JSONObject b() {
        JSONObject jSONObjectC = c();
        o.p(jSONObjectC, "configuration", this.f22900a.b());
        o.p(jSONObjectC, "additionalParameters", o.l(this.f22909j));
        return jSONObjectC;
    }
}
