package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import t7.a;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class GoogleSignInOptions extends w7.a implements a.d, ReflectedParcelable {
    public static final Scope A;
    private static final Comparator B;
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final GoogleSignInOptions f7153u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final GoogleSignInOptions f7154v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Scope f7155w = new Scope("profile");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Scope f7156x = new Scope("email");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final Scope f7157y = new Scope("openid");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final Scope f7158z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f7159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f7160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Account f7161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f7162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f7163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f7164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f7165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f7166h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private ArrayList f7167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f7168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map f7169t;

    static {
        Scope scope = new Scope("https://www.googleapis.com/auth/games_lite");
        f7158z = scope;
        A = new Scope("https://www.googleapis.com/auth/games");
        a aVar = new a();
        aVar.b();
        aVar.c();
        f7153u = aVar.a();
        a aVar2 = new a();
        aVar2.d(scope, new Scope[0]);
        f7154v = aVar2.a();
        CREATOR = new e();
        B = new d();
    }

    public static GoogleSignInOptions l(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            hashSet.add(new Scope(jSONArray.getString(i10)));
        }
        String strOptString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        return new GoogleSignInOptions(3, new ArrayList(hashSet), !TextUtils.isEmpty(strOptString) ? new Account(strOptString, "com.google") : null, jSONObject.getBoolean("idTokenRequested"), jSONObject.getBoolean("serverAuthRequested"), jSONObject.getBoolean("forceCodeForRefreshToken"), jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null, jSONObject.has("hostedDomain") ? jSONObject.optString("hostedDomain") : null, new HashMap(), (String) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map w(List list) {
        HashMap map = new HashMap();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                q7.a aVar = (q7.a) it.next();
                map.put(Integer.valueOf(aVar.b()), aVar);
            }
        }
        return map;
    }

    public Account b() {
        return this.f7161c;
    }

    public ArrayList c() {
        return this.f7167r;
    }

    public String e() {
        return this.f7168s;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0052 A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005d A[Catch: ClassCastException -> 0x0090, TryCatch #0 {ClassCastException -> 0x0090, blocks: (B:5:0x0004, B:7:0x000e, B:10:0x0018, B:12:0x0028, B:15:0x0035, B:17:0x0039, B:22:0x004a, B:24:0x0052, B:30:0x006a, B:32:0x0072, B:34:0x007a, B:36:0x0082, B:27:0x005d, B:20:0x0040), top: B:42:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r1 = r3.f7167r     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            java.util.ArrayList r1 = r4.f7167r     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.isEmpty()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L18
            goto L90
        L18:
            java.util.ArrayList r1 = r3.f7160b     // Catch: java.lang.ClassCastException -> L90
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.f()     // Catch: java.lang.ClassCastException -> L90
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.util.ArrayList r1 = r3.f7160b     // Catch: java.lang.ClassCastException -> L90
            java.util.ArrayList r2 = r4.f()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L35
            goto L90
        L35:
            android.accounts.Account r1 = r3.f7161c     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L40
            android.accounts.Account r1 = r4.b()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L90
            goto L4a
        L40:
            android.accounts.Account r2 = r4.b()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
        L4a:
            java.lang.String r1 = r3.f7165g     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L5d
            java.lang.String r1 = r4.g()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L90
            if (r1 == 0) goto L90
            goto L6a
        L5d:
            java.lang.String r1 = r3.f7165g     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r2 = r4.g()     // Catch: java.lang.ClassCastException -> L90
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L90
            if (r1 != 0) goto L6a
            goto L90
        L6a:
            boolean r1 = r3.f7164f     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.h()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f7162d     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.i()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            boolean r1 = r3.f7163e     // Catch: java.lang.ClassCastException -> L90
            boolean r2 = r4.j()     // Catch: java.lang.ClassCastException -> L90
            if (r1 != r2) goto L90
            java.lang.String r1 = r3.f7168s     // Catch: java.lang.ClassCastException -> L90
            java.lang.String r4 = r4.e()     // Catch: java.lang.ClassCastException -> L90
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L90
            if (r4 == 0) goto L90
            r4 = 1
            return r4
        L90:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public ArrayList f() {
        return new ArrayList(this.f7160b);
    }

    public String g() {
        return this.f7165g;
    }

    public boolean h() {
        return this.f7164f;
    }

    public int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f7160b;
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(((Scope) arrayList2.get(i10)).b());
        }
        Collections.sort(arrayList);
        q7.b bVar = new q7.b();
        bVar.a(arrayList);
        bVar.a(this.f7161c);
        bVar.a(this.f7165g);
        bVar.c(this.f7164f);
        bVar.c(this.f7162d);
        bVar.c(this.f7163e);
        bVar.a(this.f7168s);
        return bVar.b();
    }

    public boolean i() {
        return this.f7162d;
    }

    public boolean j() {
        return this.f7163e;
    }

    public final String p() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            Collections.sort(this.f7160b, B);
            Iterator it = this.f7160b.iterator();
            while (it.hasNext()) {
                jSONArray.put(((Scope) it.next()).b());
            }
            jSONObject.put("scopes", jSONArray);
            Account account = this.f7161c;
            if (account != null) {
                jSONObject.put("accountName", account.name);
            }
            jSONObject.put("idTokenRequested", this.f7162d);
            jSONObject.put("forceCodeForRefreshToken", this.f7164f);
            jSONObject.put("serverAuthRequested", this.f7163e);
            if (!TextUtils.isEmpty(this.f7165g)) {
                jSONObject.put("serverClientId", this.f7165g);
            }
            if (!TextUtils.isEmpty(this.f7166h)) {
                jSONObject.put("hostedDomain", this.f7166h);
            }
            return jSONObject.toString();
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f7159a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, i11);
        w7.c.v(parcel, 2, f(), false);
        w7.c.p(parcel, 3, b(), i10, false);
        w7.c.c(parcel, 4, i());
        w7.c.c(parcel, 5, j());
        w7.c.c(parcel, 6, h());
        w7.c.r(parcel, 7, g(), false);
        w7.c.r(parcel, 8, this.f7166h, false);
        w7.c.v(parcel, 9, c(), false);
        w7.c.r(parcel, 10, e(), false);
        w7.c.b(parcel, iA);
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Set f7170a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f7171b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f7172c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f7173d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f7174e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Account f7175f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f7176g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Map f7177h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private String f7178i;

        public a() {
            this.f7170a = new HashSet();
            this.f7177h = new HashMap();
        }

        public GoogleSignInOptions a() {
            if (this.f7170a.contains(GoogleSignInOptions.A)) {
                Set set = this.f7170a;
                Scope scope = GoogleSignInOptions.f7158z;
                if (set.contains(scope)) {
                    this.f7170a.remove(scope);
                }
            }
            if (this.f7173d && (this.f7175f == null || !this.f7170a.isEmpty())) {
                b();
            }
            return new GoogleSignInOptions(new ArrayList(this.f7170a), this.f7175f, this.f7173d, this.f7171b, this.f7172c, this.f7174e, this.f7176g, this.f7177h, this.f7178i);
        }

        public a b() {
            this.f7170a.add(GoogleSignInOptions.f7157y);
            return this;
        }

        public a c() {
            this.f7170a.add(GoogleSignInOptions.f7155w);
            return this;
        }

        public a d(Scope scope, Scope... scopeArr) {
            this.f7170a.add(scope);
            this.f7170a.addAll(Arrays.asList(scopeArr));
            return this;
        }

        public a e(String str) {
            this.f7178i = str;
            return this;
        }

        public a(GoogleSignInOptions googleSignInOptions) {
            this.f7170a = new HashSet();
            this.f7177h = new HashMap();
            q.i(googleSignInOptions);
            this.f7170a = new HashSet(googleSignInOptions.f7160b);
            this.f7171b = googleSignInOptions.f7163e;
            this.f7172c = googleSignInOptions.f7164f;
            this.f7173d = googleSignInOptions.f7162d;
            this.f7174e = googleSignInOptions.f7165g;
            this.f7175f = googleSignInOptions.f7161c;
            this.f7176g = googleSignInOptions.f7166h;
            this.f7177h = GoogleSignInOptions.w(googleSignInOptions.f7167r);
            this.f7178i = googleSignInOptions.f7168s;
        }
    }

    GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, ArrayList arrayList2, String str3) {
        this(i10, arrayList, account, z10, z11, z12, str, str2, w(arrayList2), str3);
    }

    private GoogleSignInOptions(int i10, ArrayList arrayList, Account account, boolean z10, boolean z11, boolean z12, String str, String str2, Map map, String str3) {
        this.f7159a = i10;
        this.f7160b = arrayList;
        this.f7161c = account;
        this.f7162d = z10;
        this.f7163e = z11;
        this.f7164f = z12;
        this.f7165g = str;
        this.f7166h = str2;
        this.f7167r = new ArrayList(map.values());
        this.f7169t = map;
        this.f7168s = str3;
    }
}
