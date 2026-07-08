package net.openid.appauth;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.openid.appauth.d;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class n {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Long f22884i = 1000L;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Long f22885j = 600L;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Set f22886k = net.openid.appauth.a.a("iss", "sub", "aud", "exp", "iat", "nonce", "azp");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f22888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f22889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Long f22890d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Long f22891e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f22892f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f22893g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f22894h;

    static class a extends Exception {
        a(String str) {
            super(str);
        }
    }

    n(String str, String str2, List list, Long l10, Long l11, String str3, String str4, Map map) {
        this.f22887a = str;
        this.f22888b = str2;
        this.f22889c = list;
        this.f22890d = l10;
        this.f22891e = l11;
        this.f22892f = str3;
        this.f22893g = str4;
        this.f22894h = map;
    }

    static n a(String str) throws JSONException, a {
        List listF;
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length <= 1) {
            throw new a("ID token must have both header and claims section");
        }
        b(strArrSplit[0]);
        JSONObject jSONObjectB = b(strArrSplit[1]);
        String strD = o.d(jSONObjectB, "iss");
        String strD2 = o.d(jSONObjectB, "sub");
        try {
            listF = o.f(jSONObjectB, "aud");
        } catch (JSONException unused) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(o.d(jSONObjectB, "aud"));
            listF = arrayList;
        }
        Long lValueOf = Long.valueOf(jSONObjectB.getLong("exp"));
        Long lValueOf2 = Long.valueOf(jSONObjectB.getLong("iat"));
        String strE = o.e(jSONObjectB, "nonce");
        String strE2 = o.e(jSONObjectB, "azp");
        Iterator it = f22886k.iterator();
        while (it.hasNext()) {
            jSONObjectB.remove((String) it.next());
        }
        return new n(strD, strD2, listF, lValueOf, lValueOf2, strE, strE2, o.w(jSONObjectB));
    }

    private static JSONObject b(String str) {
        return new JSONObject(new String(Base64.decode(str, 8)));
    }

    void c(s sVar, k kVar, boolean z10) {
        j jVar = sVar.f22922a.f22845e;
        if (jVar != null) {
            if (!this.f22887a.equals(jVar.e())) {
                throw d.l(d.b.f22763j, new a("Issuer mismatch"));
            }
            Uri uri = Uri.parse(this.f22887a);
            if (!z10 && !uri.getScheme().equals("https")) {
                throw d.l(d.b.f22763j, new a("Issuer must be an https URL"));
            }
            if (TextUtils.isEmpty(uri.getHost())) {
                throw d.l(d.b.f22763j, new a("Issuer host can not be empty"));
            }
            if (uri.getFragment() != null || uri.getQueryParameterNames().size() > 0) {
                throw d.l(d.b.f22763j, new a("Issuer URL should not containt query parameters or fragment components"));
            }
        }
        String str = sVar.f22924c;
        if (!this.f22889c.contains(str) && !str.equals(this.f22893g)) {
            throw d.l(d.b.f22763j, new a("Audience mismatch"));
        }
        long jA = kVar.a() / f22884i.longValue();
        if (jA > this.f22890d.longValue()) {
            throw d.l(d.b.f22763j, new a("ID Token expired"));
        }
        if (Math.abs(jA - this.f22891e.longValue()) > f22885j.longValue()) {
            throw d.l(d.b.f22763j, new a("Issued at time is more than 10 minutes before or after the current time"));
        }
        if ("authorization_code".equals(sVar.f22925d)) {
            if (!TextUtils.equals(this.f22892f, sVar.f22923b)) {
                throw d.l(d.b.f22763j, new a("Nonce mismatch"));
            }
        }
    }
}
