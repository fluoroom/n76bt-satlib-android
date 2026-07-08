package net.openid.appauth;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Set f22942i = new HashSet(Arrays.asList("token_type", "access_token", "expires_in", "refresh_token", "id_token", "scope"));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f22943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f22945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f22946d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22947e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22948f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22949g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f22950h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private s f22951a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f22952b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f22953c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Long f22954d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f22955e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f22956f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f22957g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f22958h;

        public a(s sVar) {
            j(sVar);
            this.f22958h = Collections.EMPTY_MAP;
        }

        public t a() {
            return new t(this.f22951a, this.f22952b, this.f22953c, this.f22954d, this.f22955e, this.f22956f, this.f22957g, this.f22958h);
        }

        public a b(JSONObject jSONObject) {
            n(o.d(jSONObject, "token_type"));
            c(o.e(jSONObject, "access_token"));
            d(o.c(jSONObject, "expires_at"));
            if (jSONObject.has("expires_in")) {
                e(Long.valueOf(jSONObject.getLong("expires_in")));
            }
            i(o.e(jSONObject, "refresh_token"));
            h(o.e(jSONObject, "id_token"));
            k(o.e(jSONObject, "scope"));
            g(net.openid.appauth.a.d(jSONObject, t.f22942i));
            return this;
        }

        public a c(String str) {
            this.f22953c = ah.h.f(str, "access token cannot be empty if specified");
            return this;
        }

        public a d(Long l10) {
            this.f22954d = l10;
            return this;
        }

        public a e(Long l10) {
            return f(l10, r.f22920a);
        }

        a f(Long l10, k kVar) {
            if (l10 == null) {
                this.f22954d = null;
                return this;
            }
            this.f22954d = Long.valueOf(kVar.a() + TimeUnit.SECONDS.toMillis(l10.longValue()));
            return this;
        }

        public a g(Map map) {
            this.f22958h = net.openid.appauth.a.b(map, t.f22942i);
            return this;
        }

        public a h(String str) {
            this.f22955e = ah.h.f(str, "id token must not be empty if defined");
            return this;
        }

        public a i(String str) {
            this.f22956f = ah.h.f(str, "refresh token must not be empty if defined");
            return this;
        }

        public a j(s sVar) {
            this.f22951a = (s) ah.h.e(sVar, "request cannot be null");
            return this;
        }

        public a k(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f22957g = null;
                return this;
            }
            m(str.split(" +"));
            return this;
        }

        public a l(Iterable iterable) {
            this.f22957g = b.a(iterable);
            return this;
        }

        public a m(String... strArr) {
            if (strArr == null) {
                strArr = new String[0];
            }
            l(Arrays.asList(strArr));
            return this;
        }

        public a n(String str) {
            this.f22952b = ah.h.f(str, "token type must not be empty if defined");
            return this;
        }
    }

    t(s sVar, String str, String str2, Long l10, String str3, String str4, String str5, Map map) {
        this.f22943a = sVar;
        this.f22944b = str;
        this.f22945c = str2;
        this.f22946d = l10;
        this.f22947e = str3;
        this.f22948f = str4;
        this.f22949g = str5;
        this.f22950h = map;
    }

    public static t b(JSONObject jSONObject) {
        if (jSONObject.has("request")) {
            return new t(s.c(jSONObject.getJSONObject("request")), o.e(jSONObject, "token_type"), o.e(jSONObject, "access_token"), o.c(jSONObject, "expires_at"), o.e(jSONObject, "id_token"), o.e(jSONObject, "refresh_token"), o.e(jSONObject, "scope"), o.h(jSONObject, "additionalParameters"));
        }
        throw new IllegalArgumentException("token request not provided and not found in JSON");
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        o.p(jSONObject, "request", this.f22943a.d());
        o.s(jSONObject, "token_type", this.f22944b);
        o.s(jSONObject, "access_token", this.f22945c);
        o.r(jSONObject, "expires_at", this.f22946d);
        o.s(jSONObject, "id_token", this.f22947e);
        o.s(jSONObject, "refresh_token", this.f22948f);
        o.s(jSONObject, "scope", this.f22949g);
        o.p(jSONObject, "additionalParameters", o.l(this.f22950h));
        return jSONObject;
    }
}
