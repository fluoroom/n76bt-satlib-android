package net.openid.appauth;

import android.net.Uri;
import android.util.Base64;
import java.security.SecureRandom;
import net.openid.appauth.g;
import net.openid.appauth.m;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
abstract class e {
    static String a() {
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }

    static ah.b b(String str, String str2) {
        ah.h.e(str, "jsonStr can not be null");
        JSONObject jSONObject = new JSONObject(str);
        if ("authorization".equals(str2)) {
            return f.b(jSONObject);
        }
        if ("end_session".equals(str2)) {
            return l.b(jSONObject);
        }
        throw new IllegalArgumentException("No AuthorizationManagementRequest found matching to this json schema");
    }

    static String c(ah.b bVar) {
        if (bVar instanceof f) {
            return "authorization";
        }
        if (bVar instanceof l) {
            return "end_session";
        }
        return null;
    }

    static ah.c d(ah.b bVar, Uri uri) {
        if (bVar instanceof f) {
            return new g.b((f) bVar).b(uri).a();
        }
        if (bVar instanceof l) {
            return new m.b((l) bVar).b(uri).a();
        }
        throw new IllegalArgumentException("Malformed request or uri");
    }
}
