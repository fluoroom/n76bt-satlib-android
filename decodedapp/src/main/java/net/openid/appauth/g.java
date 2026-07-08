package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.openid.appauth.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class g extends ah.c {

    /* JADX INFO: renamed from: j */
    private static final Set f22810j = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList("token_type", "state", "code", "access_token", "expires_in", "id_token", "scope")));

    /* JADX INFO: renamed from: a */
    public final f f22811a;

    /* JADX INFO: renamed from: b */
    public final String f22812b;

    /* JADX INFO: renamed from: c */
    public final String f22813c;

    /* JADX INFO: renamed from: d */
    public final String f22814d;

    /* JADX INFO: renamed from: e */
    public final String f22815e;

    /* JADX INFO: renamed from: f */
    public final Long f22816f;

    /* JADX INFO: renamed from: g */
    public final String f22817g;

    /* JADX INFO: renamed from: h */
    public final String f22818h;

    /* JADX INFO: renamed from: i */
    public final Map f22819i;

    public static final class b {

        /* JADX INFO: renamed from: a */
        private f f22820a;

        /* JADX INFO: renamed from: b */
        private String f22821b;

        /* JADX INFO: renamed from: c */
        private String f22822c;

        /* JADX INFO: renamed from: d */
        private String f22823d;

        /* JADX INFO: renamed from: e */
        private String f22824e;

        /* JADX INFO: renamed from: f */
        private Long f22825f;

        /* JADX INFO: renamed from: g */
        private String f22826g;

        /* JADX INFO: renamed from: h */
        private String f22827h;

        /* JADX INFO: renamed from: i */
        private Map f22828i = new LinkedHashMap();

        public b(f fVar) {
            this.f22820a = (f) ah.h.e(fVar, "authorization request cannot be null");
        }

        public g a() {
            return new g(this.f22820a, this.f22821b, this.f22822c, this.f22823d, this.f22824e, this.f22825f, this.f22826g, this.f22827h, DesugarCollections.unmodifiableMap(this.f22828i));
        }

        public b b(Uri uri) {
            return c(uri, r.f22920a);
        }

        b c(Uri uri, k kVar) {
            m(uri.getQueryParameter("state"));
            n(uri.getQueryParameter("token_type"));
            h(uri.getQueryParameter("code"));
            d(uri.getQueryParameter("access_token"));
            f(dh.b.c(uri, "expires_in"), kVar);
            i(uri.getQueryParameter("id_token"));
            j(uri.getQueryParameter("scope"));
            g(net.openid.appauth.a.c(uri, g.f22810j));
            return this;
        }

        public b d(String str) {
            ah.h.f(str, "accessToken must not be empty");
            this.f22824e = str;
            return this;
        }

        public b e(Long l10) {
            this.f22825f = l10;
            return this;
        }

        public b f(Long l10, k kVar) {
            if (l10 == null) {
                this.f22825f = null;
                return this;
            }
            this.f22825f = Long.valueOf(kVar.a() + TimeUnit.SECONDS.toMillis(l10.longValue()));
            return this;
        }

        public b g(Map map) {
            this.f22828i = net.openid.appauth.a.b(map, g.f22810j);
            return this;
        }

        public b h(String str) {
            ah.h.f(str, "authorizationCode must not be empty");
            this.f22823d = str;
            return this;
        }

        public b i(String str) {
            ah.h.f(str, "idToken cannot be empty");
            this.f22826g = str;
            return this;
        }

        public b j(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f22827h = null;
                return this;
            }
            l(str.split(" +"));
            return this;
        }

        public b k(Iterable iterable) {
            this.f22827h = net.openid.appauth.b.a(iterable);
            return this;
        }

        public b l(String... strArr) {
            if (strArr == null) {
                this.f22827h = null;
                return this;
            }
            k(Arrays.asList(strArr));
            return this;
        }

        public b m(String str) {
            ah.h.f(str, "state must not be empty");
            this.f22821b = str;
            return this;
        }

        public b n(String str) {
            ah.h.f(str, "tokenType must not be empty");
            this.f22822c = str;
            return this;
        }
    }

    /* synthetic */ g(f fVar, String str, String str2, String str3, String str4, Long l10, String str5, String str6, Map map, a aVar) {
        this(fVar, str, str2, str3, str4, l10, str5, str6, map);
    }

    public static g h(Intent intent) {
        ah.h.e(intent, "dataIntent must not be null");
        if (!intent.hasExtra("net.openid.appauth.AuthorizationResponse")) {
            return null;
        }
        try {
            return i(intent.getStringExtra("net.openid.appauth.AuthorizationResponse"));
        } catch (JSONException e10) {
            throw new IllegalArgumentException("Intent contains malformed auth response", e10);
        }
    }

    public static g i(String str) {
        return j(new JSONObject(str));
    }

    public static g j(JSONObject jSONObject) {
        if (jSONObject.has("request")) {
            return new g(f.b(jSONObject.getJSONObject("request")), o.e(jSONObject, "state"), o.e(jSONObject, "token_type"), o.e(jSONObject, "code"), o.e(jSONObject, "access_token"), o.c(jSONObject, "expires_at"), o.e(jSONObject, "id_token"), o.e(jSONObject, "scope"), o.h(jSONObject, "additional_parameters"));
        }
        throw new IllegalArgumentException("authorization request not provided and not found in JSON");
    }

    @Override // ah.c
    public String a() {
        return this.f22812b;
    }

    @Override // ah.c
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        o.p(jSONObject, "request", this.f22811a.c());
        o.s(jSONObject, "state", this.f22812b);
        o.s(jSONObject, "token_type", this.f22813c);
        o.s(jSONObject, "code", this.f22814d);
        o.s(jSONObject, "access_token", this.f22815e);
        o.r(jSONObject, "expires_at", this.f22816f);
        o.s(jSONObject, "id_token", this.f22817g);
        o.s(jSONObject, "scope", this.f22818h);
        o.p(jSONObject, "additional_parameters", o.l(this.f22819i));
        return jSONObject;
    }

    @Override // ah.c
    public Intent d() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.AuthorizationResponse", c());
        return intent;
    }

    public s f() {
        return g(Collections.EMPTY_MAP);
    }

    public s g(Map map) {
        ah.h.e(map, "additionalExchangeParameters cannot be null");
        if (this.f22814d == null) {
            throw new IllegalStateException("authorizationCode not available for exchange request");
        }
        f fVar = this.f22811a;
        return new s.b(fVar.f22774a, fVar.f22775b).h("authorization_code").j(this.f22811a.f22781h).f(this.f22811a.f22785l).d(this.f22814d).c(map).i(this.f22811a.f22784k).a();
    }

    private g(f fVar, String str, String str2, String str3, String str4, Long l10, String str5, String str6, Map map) {
        this.f22811a = fVar;
        this.f22812b = str;
        this.f22813c = str2;
        this.f22814d = str3;
        this.f22815e = str4;
        this.f22816f = l10;
        this.f22817g = str5;
        this.f22818h = str6;
        this.f22819i = map;
    }
}
