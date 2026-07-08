package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInAccount extends w7.a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final com.google.android.gms.common.util.b f7139w = com.google.android.gms.common.util.d.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f7140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f7142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f7143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f7144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f7145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f7146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final long f7147h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final String f7148r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final List f7149s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final String f7150t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final String f7151u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Set f7152v = new HashSet();

    GoogleSignInAccount(int i10, String str, String str2, String str3, String str4, Uri uri, String str5, long j10, String str6, List list, String str7, String str8) {
        this.f7140a = i10;
        this.f7141b = str;
        this.f7142c = str2;
        this.f7143d = str3;
        this.f7144e = str4;
        this.f7145f = uri;
        this.f7146g = str5;
        this.f7147h = j10;
        this.f7148r = str6;
        this.f7149s = list;
        this.f7150t = str7;
        this.f7151u = str8;
    }

    public static GoogleSignInAccount l(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l10, String str7, Set set) {
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, l10.longValue(), q.f(str7), new ArrayList((Collection) q.i(set)), str5, str6);
    }

    public static GoogleSignInAccount m(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String strOptString = jSONObject.optString("photoUrl");
        Uri uri = !TextUtils.isEmpty(strOptString) ? Uri.parse(strOptString) : null;
        long j10 = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        GoogleSignInAccount googleSignInAccountL = l(jSONObject.optString(Name.MARK), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has("email") ? jSONObject.optString("email") : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null, uri, Long.valueOf(j10), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        googleSignInAccountL.f7146g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccountL;
    }

    public String b() {
        return this.f7144e;
    }

    public String c() {
        return this.f7143d;
    }

    public String e() {
        return this.f7151u;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.f7148r.equals(this.f7148r) && googleSignInAccount.j().equals(j());
    }

    public String f() {
        return this.f7150t;
    }

    public String g() {
        return this.f7141b;
    }

    public String h() {
        return this.f7142c;
    }

    public int hashCode() {
        return ((this.f7148r.hashCode() + 527) * 31) + j().hashCode();
    }

    public Uri i() {
        return this.f7145f;
    }

    public Set j() {
        HashSet hashSet = new HashSet(this.f7149s);
        hashSet.addAll(this.f7152v);
        return hashSet;
    }

    public String k() {
        return this.f7146g;
    }

    public final String n() {
        return this.f7148r;
    }

    public final String o() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (g() != null) {
                jSONObject.put(Name.MARK, g());
            }
            if (h() != null) {
                jSONObject.put("tokenId", h());
            }
            if (c() != null) {
                jSONObject.put("email", c());
            }
            if (b() != null) {
                jSONObject.put("displayName", b());
            }
            if (f() != null) {
                jSONObject.put("givenName", f());
            }
            if (e() != null) {
                jSONObject.put("familyName", e());
            }
            Uri uriI = i();
            if (uriI != null) {
                jSONObject.put("photoUrl", uriI.toString());
            }
            if (k() != null) {
                jSONObject.put("serverAuthCode", k());
            }
            jSONObject.put("expirationTime", this.f7147h);
            jSONObject.put("obfuscatedIdentifier", this.f7148r);
            JSONArray jSONArray = new JSONArray();
            List list = this.f7149s;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, new Comparator() { // from class: p7.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    Parcelable.Creator<GoogleSignInAccount> creator = GoogleSignInAccount.CREATOR;
                    return ((Scope) obj).b().compareTo(((Scope) obj2).b());
                }
            });
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.b());
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, this.f7140a);
        w7.c.r(parcel, 2, g(), false);
        w7.c.r(parcel, 3, h(), false);
        w7.c.r(parcel, 4, c(), false);
        w7.c.r(parcel, 5, b(), false);
        w7.c.p(parcel, 6, i(), i10, false);
        w7.c.r(parcel, 7, k(), false);
        w7.c.o(parcel, 8, this.f7147h);
        w7.c.r(parcel, 9, this.f7148r, false);
        w7.c.v(parcel, 10, this.f7149s, false);
        w7.c.r(parcel, 11, f(), false);
        w7.c.r(parcel, 12, e(), false);
        w7.c.b(parcel, iA);
    }
}
