package net.openid.appauth;

import android.content.Intent;
import android.net.Uri;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class m extends ah.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f22880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22881b;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private l f22882a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f22883b;

        public b(l lVar) {
            c(lVar);
        }

        public m a() {
            return new m(this.f22882a, this.f22883b);
        }

        b b(Uri uri) {
            d(uri.getQueryParameter("state"));
            return this;
        }

        public b c(l lVar) {
            this.f22882a = (l) ah.h.e(lVar, "request cannot be null");
            return this;
        }

        public b d(String str) {
            this.f22883b = ah.h.f(str, "state must not be empty");
            return this;
        }
    }

    @Override // ah.c
    public String a() {
        return this.f22881b;
    }

    @Override // ah.c
    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        o.p(jSONObject, "request", this.f22880a.c());
        o.s(jSONObject, "state", this.f22881b);
        return jSONObject;
    }

    @Override // ah.c
    public Intent d() {
        Intent intent = new Intent();
        intent.putExtra("net.openid.appauth.EndSessionResponse", c());
        return intent;
    }

    private m(l lVar, String str) {
        this.f22880a = lVar;
        this.f22881b = str;
    }
}
