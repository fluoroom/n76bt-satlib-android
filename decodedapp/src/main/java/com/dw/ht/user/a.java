package com.dw.ht.user;

import a6.o;
import a6.q;
import ah.a;
import ah.e;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.widget.Toast;
import bh.l;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Um;
import com.dw.android.app.FragmentShowActivity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantLock;
import net.openid.appauth.c;
import net.openid.appauth.d;
import net.openid.appauth.f;
import net.openid.appauth.g;
import net.openid.appauth.h;
import net.openid.appauth.i;
import net.openid.appauth.t;
import org.json.JSONException;
import v3.j;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f6839k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SharedPreferences f6841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ReentrantLock f6842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicReference f6843c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f6844d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h f6845e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Handler f6846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ArrayList f6847g = o.a();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f6848h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final AtomicReference f6837i = new AtomicReference(new WeakReference(null));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final AtomicInteger f6838j = new AtomicInteger();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static e f6840l = new e("4820604c4fea");

    /* JADX INFO: renamed from: com.dw.ht.user.a$a, reason: collision with other inner class name */
    public enum EnumC0104a {
        Logout,
        Login
    }

    public interface b {
        void a(String str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static class c extends ContextWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        WeakReference f6852a;

        public c(Context context) {
            super(context);
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public void startActivity(Intent intent) {
            WeakReference weakReference = this.f6852a;
            Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
            if (activity != null) {
                activity.startActivity(intent);
            } else {
                j.e(getBaseContext(), intent);
            }
        }
    }

    private a(Context context) {
        c cVar = new c(context);
        this.f6844d = cVar;
        this.f6845e = new h(cVar, new a.b().b(new bh.b(l.f4067e, bh.a.f4045a)).a());
        this.f6841a = context.getSharedPreferences("AuthState", 0);
        this.f6842b = new ReentrantLock();
        this.f6843c = new AtomicReference();
        this.f6846f = new Handler(Looper.getMainLooper());
    }

    public static /* synthetic */ void b(final a aVar, int i10, String str, net.openid.appauth.c cVar, String str2, String str3, d dVar) {
        aVar.getClass();
        int i11 = 0;
        try {
            if (dVar != null || str2 == null) {
                if (dVar != null) {
                    int i12 = dVar.f22738a;
                    if (i12 == 0 && dVar.f22739b == d.b.f22757d.f22739b) {
                        synchronized (aVar.f6847g) {
                            while (i11 < aVar.f6847g.size()) {
                                try {
                                    try {
                                        ((b) aVar.f6847g.get(i11)).a(str2);
                                    } catch (Throwable th2) {
                                        th2.printStackTrace();
                                    }
                                    i11++;
                                } finally {
                                }
                            }
                            aVar.f6847g.clear();
                        }
                        return;
                    }
                    if (i12 == 0 && dVar.f22739b == d.b.f22759f.f22739b) {
                        synchronized (aVar) {
                            try {
                                if (System.currentTimeMillis() - f6839k > 180000 || aVar.f6848h) {
                                    aVar.f6848h = false;
                                    f6839k = System.currentTimeMillis();
                                    aVar.f6846f.post(new Runnable() { // from class: n5.c
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            Toast.makeText(this.f22505a.f6844d, R.string.needReloginPrompt, 1).show();
                                        }
                                    });
                                    com.dw.ht.user.b.f6853a.a();
                                    aVar.l(new net.openid.appauth.c());
                                    FragmentShowActivity.h2(aVar.f6844d, null, InfoFragment.class);
                                }
                            } finally {
                            }
                        }
                    }
                }
            } else if (f6838j.intValue() == i10 && !q.d(str, cVar.m())) {
                aVar.p(cVar);
            }
            synchronized (aVar.f6847g) {
                while (i11 < aVar.f6847g.size()) {
                    try {
                        try {
                            ((b) aVar.f6847g.get(i11)).a(str2);
                        } catch (Throwable th3) {
                            th3.printStackTrace();
                        }
                        i11++;
                    } finally {
                    }
                }
                aVar.f6847g.clear();
            }
        } catch (Throwable th4) {
            synchronized (aVar.f6847g) {
                while (i11 < aVar.f6847g.size()) {
                    try {
                        try {
                            ((b) aVar.f6847g.get(i11)).a(str2);
                        } catch (Throwable th5) {
                            th5.printStackTrace();
                        }
                        i11++;
                    } finally {
                    }
                }
                aVar.f6847g.clear();
                throw th4;
            }
        }
    }

    public static /* synthetic */ void c(a aVar, t tVar, d dVar) {
        aVar.getClass();
        if (dVar != null) {
            dVar.printStackTrace();
        }
        if (tVar != null) {
            f6838j.incrementAndGet();
            aVar.o(tVar, dVar);
            mi.c.e().m(EnumC0104a.Login);
        }
    }

    private f g() {
        return new f.b(new i(Uri.parse("https://account.benshikj.com/user/security/reauth"), Uri.parse("https://account.benshikj.com/auth/token")), "com.benshikj.ht", "code", Uri.parse("com.benshikj.ht://auth")).h("user").a();
    }

    public static a i(Context context) {
        AtomicReference atomicReference = f6837i;
        a aVar = (a) ((WeakReference) atomicReference.get()).get();
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(context.getApplicationContext());
        atomicReference.set(new WeakReference(aVar2));
        return aVar2;
    }

    private net.openid.appauth.c k() {
        net.openid.appauth.c cVar;
        this.f6842b.lock();
        try {
            String string = this.f6841a.getString("state", null);
            if (string == null) {
                cVar = new net.openid.appauth.c();
            } else {
                try {
                    cVar = net.openid.appauth.c.o(string);
                } catch (JSONException unused) {
                    Log.w("AuthStateManager", "Failed to deserialize stored auth state - discarding");
                    cVar = new net.openid.appauth.c();
                }
            }
            return cVar;
        } finally {
            this.f6842b.unlock();
        }
    }

    private void p(net.openid.appauth.c cVar) {
        this.f6842b.lock();
        try {
            SharedPreferences.Editor editorEdit = this.f6841a.edit();
            if (cVar == null) {
                editorEdit.remove("state");
            } else {
                editorEdit.putString("state", cVar.r());
            }
            if (!editorEdit.commit()) {
                throw new IllegalStateException("Failed to write state to shared prefs");
            }
            this.f6842b.unlock();
        } catch (Throwable th2) {
            this.f6842b.unlock();
            throw th2;
        }
    }

    public void d(b bVar) {
        e(bVar, false);
    }

    public void e(b bVar, boolean z10) {
        final net.openid.appauth.c cVarH = h();
        if (!cVarH.n()) {
            if (z10) {
                FragmentShowActivity.h2(this.f6844d, null, InfoFragment.class);
            }
            bVar.a(null);
            return;
        }
        if (!cVarH.k()) {
            bVar.a(cVarH.f());
            return;
        }
        synchronized (this.f6847g) {
            try {
                if (!this.f6847g.isEmpty()) {
                    this.f6847g.add(bVar);
                    if (z10) {
                        this.f6848h = true;
                    }
                } else {
                    if (z10) {
                        this.f6848h = true;
                    }
                    this.f6847g.add(bVar);
                    final int iIntValue = f6838j.intValue();
                    final String strM = cVarH.m();
                    cVarH.t(this.f6845e, f6840l, new c.b() { // from class: n5.b
                        @Override // net.openid.appauth.c.b
                        public final void a(String str, String str2, net.openid.appauth.d dVar) {
                            com.dw.ht.user.a.b(this.f22500a, iIntValue, strM, cVarH, str, str2, dVar);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void f(b bVar) {
        e(bVar, true);
    }

    protected void finalize() throws Throwable {
        try {
            this.f6845e.b();
        } finally {
            super.finalize();
        }
    }

    public net.openid.appauth.c h() {
        if (this.f6843c.get() != null) {
            return (net.openid.appauth.c) this.f6843c.get();
        }
        net.openid.appauth.c cVarK = k();
        return androidx.lifecycle.b.a(this.f6843c, null, cVarK) ? cVarK : (net.openid.appauth.c) this.f6843c.get();
    }

    public void j(Intent intent) {
        g gVarH = g.h(intent);
        d dVarG = d.g(intent);
        n(gVarH, dVarG);
        if (dVarG != null) {
            dVarG.printStackTrace();
        } else {
            if (gVarH == null) {
                return;
            }
            this.f6845e.d(gVarH.f(), new h.b() { // from class: n5.a
                @Override // net.openid.appauth.h.b
                public final void a(net.openid.appauth.t tVar, net.openid.appauth.d dVar) {
                    com.dw.ht.user.a.c(this.f22498a, tVar, dVar);
                }
            });
        }
    }

    public net.openid.appauth.c l(net.openid.appauth.c cVar) {
        p(cVar);
        this.f6843c.set(cVar);
        return cVar;
    }

    public net.openid.appauth.c m(Um.LoginResult loginResult) {
        net.openid.appauth.c cVarH = h();
        g gVarI = cVarH.i();
        if (gVarI == null) {
            gVarI = new g.b(g()).d(loginResult.getAccessToken()).e(Long.valueOf(loginResult.getAccessTokenExpires() * 1000)).h("null").a();
        }
        t tVarJ = cVarH.j();
        if (tVarJ == null) {
            tVarJ = new t.a(gVarI.f()).c(loginResult.getAccessToken()).d(Long.valueOf(loginResult.getAccessTokenExpires() * 1000)).i(loginResult.getRefreshToken()).a();
        }
        cVarH.v(gVarI, null);
        cVarH.w(tVarJ, null);
        return l(cVarH);
    }

    public net.openid.appauth.c n(g gVar, d dVar) {
        net.openid.appauth.c cVarH = h();
        cVarH.v(gVar, dVar);
        return l(cVarH);
    }

    public net.openid.appauth.c o(t tVar, d dVar) {
        net.openid.appauth.c cVarH = h();
        cVarH.w(tVar, dVar);
        return l(cVarH);
    }
}
