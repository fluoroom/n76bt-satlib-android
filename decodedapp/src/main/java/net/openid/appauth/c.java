package net.openid.appauth;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.openid.appauth.d;
import net.openid.appauth.h;
import net.openid.appauth.s;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f22727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f22728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private i f22729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g f22730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private t f22731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q f22732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f22733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object f22734h = new Object();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f22735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f22736j;

    class a implements h.b {
        a() {
        }

        @Override // net.openid.appauth.h.b
        public void a(t tVar, d dVar) {
            String strH;
            d dVar2;
            String strF;
            List list;
            c.this.w(tVar, dVar);
            if (dVar == null) {
                c.this.f22736j = false;
                strF = c.this.f();
                strH = c.this.h();
                dVar2 = null;
            } else {
                strH = null;
                dVar2 = dVar;
                strF = null;
            }
            synchronized (c.this.f22734h) {
                list = c.this.f22735i;
                c.this.f22735i = null;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((b) it.next()).a(strF, strH, dVar2);
            }
        }
    }

    public interface b {
        void a(String str, String str2, d dVar);
    }

    public static c o(String str) {
        ah.h.c(str, "jsonStr cannot be null or empty");
        return p(new JSONObject(str));
    }

    public static c p(JSONObject jSONObject) {
        ah.h.e(jSONObject, "json cannot be null");
        c cVar = new c();
        cVar.f22727a = o.e(jSONObject, "refreshToken");
        cVar.f22728b = o.e(jSONObject, "scope");
        if (jSONObject.has("config")) {
            cVar.f22729c = i.a(jSONObject.getJSONObject("config"));
        }
        if (jSONObject.has("mAuthorizationException")) {
            cVar.f22733g = d.i(jSONObject.getJSONObject("mAuthorizationException"));
        }
        if (jSONObject.has("lastAuthorizationResponse")) {
            cVar.f22730d = g.j(jSONObject.getJSONObject("lastAuthorizationResponse"));
        }
        if (jSONObject.has("mLastTokenResponse")) {
            cVar.f22731e = t.b(jSONObject.getJSONObject("mLastTokenResponse"));
        }
        if (jSONObject.has("lastRegistrationResponse")) {
            cVar.f22732f = q.a(jSONObject.getJSONObject("lastRegistrationResponse"));
        }
        return cVar;
    }

    public s e(Map map) {
        if (this.f22727a == null) {
            throw new IllegalStateException("No refresh token available for refresh request");
        }
        g gVar = this.f22730d;
        if (gVar == null) {
            throw new IllegalStateException("No authorization configuration available for refresh request");
        }
        f fVar = gVar.f22811a;
        return new s.b(fVar.f22774a, fVar.f22775b).h("refresh_token").l(null).k(this.f22727a).c(map).a();
    }

    public String f() {
        String str;
        if (this.f22733g != null) {
            return null;
        }
        t tVar = this.f22731e;
        if (tVar != null && (str = tVar.f22945c) != null) {
            return str;
        }
        g gVar = this.f22730d;
        if (gVar != null) {
            return gVar.f22815e;
        }
        return null;
    }

    public Long g() {
        if (this.f22733g != null) {
            return null;
        }
        t tVar = this.f22731e;
        if (tVar != null && tVar.f22945c != null) {
            return tVar.f22946d;
        }
        g gVar = this.f22730d;
        if (gVar == null || gVar.f22815e == null) {
            return null;
        }
        return gVar.f22816f;
    }

    public String h() {
        String str;
        if (this.f22733g != null) {
            return null;
        }
        t tVar = this.f22731e;
        if (tVar != null && (str = tVar.f22947e) != null) {
            return str;
        }
        g gVar = this.f22730d;
        if (gVar != null) {
            return gVar.f22817g;
        }
        return null;
    }

    public g i() {
        return this.f22730d;
    }

    public t j() {
        return this.f22731e;
    }

    public boolean k() {
        return l(r.f22920a);
    }

    boolean l(k kVar) {
        if (this.f22736j) {
            return true;
        }
        return g() == null ? f() == null : g().longValue() <= kVar.a() + 60000;
    }

    public String m() {
        return this.f22727a;
    }

    public boolean n() {
        if (this.f22733g == null) {
            return (f() == null && h() == null) ? false : true;
        }
        return false;
    }

    public JSONObject q() {
        JSONObject jSONObject = new JSONObject();
        o.s(jSONObject, "refreshToken", this.f22727a);
        o.s(jSONObject, "scope", this.f22728b);
        i iVar = this.f22729c;
        if (iVar != null) {
            o.p(jSONObject, "config", iVar.b());
        }
        d dVar = this.f22733g;
        if (dVar != null) {
            o.p(jSONObject, "mAuthorizationException", dVar.p());
        }
        g gVar = this.f22730d;
        if (gVar != null) {
            o.p(jSONObject, "lastAuthorizationResponse", gVar.b());
        }
        t tVar = this.f22731e;
        if (tVar != null) {
            o.p(jSONObject, "mLastTokenResponse", tVar.c());
        }
        q qVar = this.f22732f;
        if (qVar != null) {
            o.p(jSONObject, "lastRegistrationResponse", qVar.b());
        }
        return jSONObject;
    }

    public String r() {
        return q().toString();
    }

    void s(h hVar, ah.d dVar, Map map, k kVar, b bVar) {
        ah.h.e(hVar, "service cannot be null");
        ah.h.e(dVar, "client authentication cannot be null");
        ah.h.e(map, "additional params cannot be null");
        ah.h.e(kVar, "clock cannot be null");
        ah.h.e(bVar, "action cannot be null");
        if (!l(kVar)) {
            bVar.a(f(), h(), null);
            return;
        }
        if (this.f22727a == null) {
            bVar.a(null, null, d.l(d.a.f22750h, new IllegalStateException("No refresh token available and token have expired")));
            return;
        }
        ah.h.e(this.f22734h, "pending actions sync object cannot be null");
        synchronized (this.f22734h) {
            try {
                List list = this.f22735i;
                if (list != null) {
                    list.add(bVar);
                    return;
                }
                ArrayList arrayList = new ArrayList();
                this.f22735i = arrayList;
                arrayList.add(bVar);
                hVar.c(e(map), dVar, new a());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void t(h hVar, ah.d dVar, b bVar) {
        s(hVar, dVar, Collections.EMPTY_MAP, r.f22920a, bVar);
    }

    public void u(boolean z10) {
        this.f22736j = z10;
    }

    public void v(g gVar, d dVar) {
        ah.h.a((dVar != null) ^ (gVar != null), "exactly one of authResponse or authException should be non-null");
        if (dVar != null) {
            if (dVar.f22738a == 1) {
                this.f22733g = dVar;
                return;
            }
            return;
        }
        this.f22730d = gVar;
        this.f22729c = null;
        this.f22731e = null;
        this.f22727a = null;
        this.f22733g = null;
        String str = gVar.f22818h;
        if (str == null) {
            str = gVar.f22811a.f22782i;
        }
        this.f22728b = str;
    }

    public void w(t tVar, d dVar) {
        ah.h.a((tVar != null) ^ (dVar != null), "exactly one of tokenResponse or authException should be non-null");
        d dVar2 = this.f22733g;
        if (dVar2 != null) {
            dh.a.g("AuthState.update should not be called in an error state (%s), call updatewith the result of the fresh authorization response first", dVar2);
            this.f22733g = null;
        }
        if (dVar != null) {
            if (dVar.f22738a == 2) {
                this.f22733g = dVar;
                return;
            }
            return;
        }
        this.f22731e = tVar;
        String str = tVar.f22949g;
        if (str != null) {
            this.f22728b = str;
        }
        String str2 = tVar.f22948f;
        if (str2 != null) {
            this.f22727a = str2;
        }
    }
}
