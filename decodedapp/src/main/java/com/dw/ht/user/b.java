package com.dw.ht.user;

import a6.k;
import a6.w;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Um;
import com.dw.ht.Cfg;
import com.dw.ht.LocationShareService;
import com.dw.ht.Main;
import g5.e;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.atomic.AtomicInteger;
import mi.c;
import rd.m;
import v4.l1;
import v4.n1;
import v4.q;
import v4.u;
import y5.d;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a */
    public static final b f6853a;

    /* JADX INFO: renamed from: b */
    private static final SharedPreferences f6854b;

    /* JADX INFO: renamed from: c */
    private static final d f6855c;

    /* JADX INFO: renamed from: d */
    private static boolean f6856d;

    /* JADX INFO: renamed from: e */
    private static AtomicInteger f6857e;

    /* JADX INFO: renamed from: f */
    private static boolean f6858f;

    /* JADX INFO: renamed from: g */
    private static q f6859g;

    /* JADX INFO: renamed from: h */
    private static q f6860h;

    /* JADX INFO: renamed from: i */
    private static String f6861i;

    /* JADX INFO: renamed from: j */
    private static String f6862j;

    /* JADX INFO: renamed from: k */
    private static String f6863k;

    /* JADX INFO: renamed from: l */
    private static long f6864l;

    /* JADX INFO: renamed from: m */
    private static boolean f6865m;

    /* JADX INFO: renamed from: n */
    private static Bitmap f6866n;

    /* JADX INFO: renamed from: o */
    private static String f6867o;

    public static final class a extends Enum {

        /* JADX INFO: renamed from: a */
        public static final a f6868a = new a("Logout", 0);

        /* JADX INFO: renamed from: b */
        public static final a f6869b = new a("Login", 1);

        /* JADX INFO: renamed from: c */
        public static final a f6870c = new a("DisplayNameChanged", 2);

        /* JADX INFO: renamed from: d */
        private static final /* synthetic */ a[] f6871d;

        /* JADX INFO: renamed from: e */
        private static final /* synthetic */ kd.a f6872e;

        static {
            a[] aVarArrA = a();
            f6871d = aVarArrA;
            f6872e = kd.b.a(aVarArrA);
        }

        private a(String str, int i10) {
            super(str, i10);
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f6868a, f6869b, f6870c};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f6871d.clone();
        }
    }

    static {
        b bVar = new b();
        f6853a = bVar;
        SharedPreferences sharedPreferencesK = Cfg.K();
        m.d(sharedPreferencesK, "getPref(...)");
        f6854b = sharedPreferencesK;
        d dVar = new d(Main.f5555g, sharedPreferencesK);
        f6855c = dVar;
        f6857e = new AtomicInteger(0);
        f6859g = new q();
        f6860h = new q();
        bVar.u(sharedPreferencesK.getString("user.name", null));
        f6863k = sharedPreferencesK.getString("user.email", null);
        f6864l = sharedPreferencesK.getLong("user.id", 0L);
        bVar.q(sharedPreferencesK.getString("user.nickname", null));
        byte[] bArrD = dVar.d("user.bss_cfg");
        if (bArrD == null) {
            byte[] bArrD2 = dVar.d("281474976710657.ds.bss_config");
            if (bArrD2 != null) {
                f6859g.J(bArrD2);
                if (f6859g.t() == 0) {
                    f6859g.H(false);
                }
                if (f6859g.t() < 300000) {
                    f6859g.P(300000);
                }
            }
            if (Cfg.f5482d) {
                f6859g.N(true);
                f6859g.F(true);
                f6859g.O(true);
                f6859g.M(true);
            }
        } else {
            f6859g.J(bArrD);
        }
        byte[] bArrD3 = dVar.d("user.ii.bss_cfg");
        if (bArrD3 != null) {
            f6860h.J(bArrD3);
        } else {
            int i10 = sharedPreferencesK.getInt("user.settings.internet_location_share_interval", 0);
            f6860h.J(f6859g.n());
            f6860h.P(i10);
            f6860h.H(i10 != 0);
        }
        f6856d = true;
        com.dw.ht.ii.a.e();
    }

    private b() {
    }

    private final void k() {
        if (f6856d) {
            p(false);
            Collection<l1> collectionA = u.w().A();
            m.d(collectionA, "getLinks(...)");
            for (l1 l1Var : collectionA) {
                if (m.a(l1Var.g0(), Boolean.TRUE)) {
                    if (l1Var instanceof n1) {
                        ((n1) l1Var).b1(f6860h);
                    } else {
                        l1Var.c1(f6859g, true);
                    }
                }
            }
            LocationShareService.p();
        }
    }

    private final void l() {
        f6859g.S(d());
        k();
        c.e().m(a.f6870c);
    }

    private final void p(boolean z10) {
        f6858f = z10;
        if (!z10 || f6857e.get() > 0) {
            return;
        }
        k();
    }

    private final void t(e eVar) {
        u(eVar.f13556b);
        f6863k = eVar.f13558d;
        q(eVar.f13557c);
        long j10 = f6864l;
        long j11 = eVar.f13555a;
        f6864l = j11;
        if (j11 != j10 && j11 > 0) {
            c.e().m(a.f6869b);
            com.dw.ht.ii.a.e();
        }
        f6854b.edit().putString("user.name", f6861i).putString("user.email", f6863k).putString("user.nickname", f6862j).putLong("user.id", f6864l).apply();
        l();
    }

    public final void a() {
        if (f6864l == 0) {
            return;
        }
        t(new e());
        r(null);
        c.e().m(a.f6868a);
    }

    public final q b() {
        return f6859g;
    }

    public final q c() {
        return f6860h;
    }

    public final String d() {
        if (!w.b(f6862j)) {
            String str = f6862j;
            m.b(str);
            return str;
        }
        String str2 = f6861i;
        if (str2 == null) {
            return "";
        }
        m.b(str2);
        return str2;
    }

    public final String e() {
        return f6863k;
    }

    public final String f() {
        return f6862j;
    }

    public final Bitmap g() {
        if (!f6865m) {
            f6865m = true;
            FileInputStream fileInputStream = null;
            try {
                fileInputStream = f6867o != null ? new FileInputStream(f6867o) : Main.f5555g.openFileInput("user.photo.png");
                Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                if (bitmapDecodeStream.getWidth() > 180 || bitmapDecodeStream.getHeight() > 180) {
                    r(k.i(bitmapDecodeStream, 180, 180));
                } else {
                    f6866n = bitmapDecodeStream;
                }
            } catch (IOException unused) {
            } catch (Throwable th2) {
                a6.m.b(null);
                throw th2;
            }
            a6.m.b(fileInputStream);
        }
        return f6866n;
    }

    public final Drawable h(Context context) {
        m.e(context, "context");
        return g() == null ? b0.b.d(context, R.drawable.ic_account_circle_24dp) : new BitmapDrawable(context.getResources(), g());
    }

    public final long i() {
        return f6864l;
    }

    public final String j() {
        return f6861i;
    }

    public final void m() {
        if (f6857e.decrementAndGet() > 0 || !f6858f) {
            return;
        }
        k();
    }

    public final void n(q qVar) {
        m.e(qVar, "value");
        if (Arrays.equals(f6859g.n(), qVar.n())) {
            return;
        }
        f6859g = qVar;
        if (f6856d) {
            f6855c.c().b("user.bss_cfg", qVar.n()).a();
            p(true);
        }
    }

    public final void o(q qVar) {
        m.e(qVar, "value");
        if (Arrays.equals(f6860h.n(), qVar.n())) {
            return;
        }
        f6860h = qVar;
        if (f6856d) {
            f6855c.c().b("user.ii.bss_cfg", qVar.n()).a();
            p(true);
        }
    }

    public final void q(String str) {
        if (m.a(str, f6862j)) {
            return;
        }
        f6862j = str;
        if (f6856d) {
            f6854b.edit().putString("user.nickname", f6862j).apply();
            l();
        }
    }

    public final void r(Bitmap bitmap) {
        f6866n = bitmap;
        Main main = Main.f5555g;
        if (bitmap == null) {
            main.deleteFile("user.photo.png");
            return;
        }
        FileOutputStream fileOutputStreamOpenFileOutput = null;
        try {
            fileOutputStreamOpenFileOutput = main.openFileOutput("user.photo.png", 0);
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, fileOutputStreamOpenFileOutput);
            m.b(fileOutputStreamOpenFileOutput);
            fileOutputStreamOpenFileOutput.flush();
        } catch (IOException e10) {
            e10.printStackTrace();
        } finally {
            a6.m.b(fileOutputStreamOpenFileOutput);
        }
    }

    public final void s(Um.UserProfile userProfile) {
        m.e(userProfile, "profile");
        u(userProfile.getUsername());
        f6863k = userProfile.getEmail();
        q(userProfile.getNickname());
        long j10 = f6864l;
        f6864l = userProfile.getUid();
        if (userProfile.getUid() != j10 && userProfile.getUid() > 0) {
            c.e().m(a.f6869b);
            com.dw.ht.ii.a.e();
        }
        f6854b.edit().putString("user.name", f6861i).putString("user.email", f6863k).putString("user.nickname", f6862j).putLong("user.id", f6864l).apply();
        l();
    }

    public String toString() {
        return "email:" + f6863k + ";username:" + f6861i + ";nickname:" + f6862j;
    }

    public final void u(String str) {
        if (m.a(str, f6861i)) {
            return;
        }
        f6861i = str;
        if (f6856d) {
            l();
        }
    }

    public final void v() {
        f6857e.incrementAndGet();
    }
}
