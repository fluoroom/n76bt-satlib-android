package d5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.widget.ImageView;
import com.benshikj.ht.rpc.Um;
import com.benshikj.ht.rpc.UserGrpc;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import d5.l;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Locale;
import org.simpleframework.xml.strategy.Name;
import s3.c;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: g */
    private static l f10670g;

    /* JADX INFO: renamed from: a */
    private final ConnectivityManager f10671a;

    /* JADX INFO: renamed from: b */
    private boolean f10672b;

    /* JADX INFO: renamed from: c */
    private s3.c f10673c;

    /* JADX INFO: renamed from: d */
    private File f10674d;

    /* JADX INFO: renamed from: e */
    private final androidx.collection.h f10675e;

    /* JADX INFO: renamed from: f */
    private final Handler f10676f = new Handler();

    public interface a {
        void a(long j10, String str);
    }

    class b implements c.f {

        /* JADX INFO: renamed from: a */
        final long f10677a;

        /* JADX INFO: renamed from: b */
        final boolean f10678b;

        /* JADX INFO: renamed from: c */
        final a f10679c;

        public b(l lVar, long j10) {
            this(j10, false, null);
        }

        public static /* synthetic */ Boolean c(b bVar, j jVar, Object obj) {
            bVar.getClass();
            if (Cfg.f5476a) {
                s3.b.b("UserInfoManager", String.format(Locale.getDefault(), "开始异步加载 % 5d，更新时间：%d", Long.valueOf(bVar.f10677a), Long.valueOf(jVar == null ? 0L : jVar.f10667r)));
            }
            Um.UserPublicProfileResult publicProfile = f5.d.f12792a.h().getPublicProfile(Um.UserPublicProfileRequest.newBuilder().setUid(bVar.f10677a).setSyncAt(jVar != null ? jVar.f10667r : 0L).build());
            if (Cfg.f5476a) {
                if (publicProfile.getStatus() == Um.UserPublicProfileResult.Status.unchanged) {
                    s3.b.b("UserInfoManager", String.format(Locale.getDefault(), "完成异步加载 % 5d，数据无更改", Long.valueOf(bVar.f10677a)));
                } else {
                    s3.b.b("UserInfoManager", String.format(Locale.getDefault(), "完成异步加载 % 5d，更新时间：%d 名字：%s", Long.valueOf(bVar.f10677a), Long.valueOf(publicProfile.getData().getUpdateAt()), publicProfile.getData().getUsername()));
                }
            }
            if (publicProfile.hasData()) {
                if (jVar != null) {
                    jVar.o(publicProfile.getData());
                    jVar.n();
                } else {
                    jVar = j.m(publicProfile.getData());
                }
                bVar.i(jVar);
            } else if (jVar != null) {
                jVar.f10668s = System.currentTimeMillis();
                jVar.n();
            }
            return Boolean.TRUE;
        }

        public static /* synthetic */ void d(Throwable th2) {
            if (Cfg.f5476a) {
                th2.printStackTrace();
            }
        }

        public static /* synthetic */ void e(Boolean bool) {
        }

        private void f(final j jVar) {
            hc.g.c(new Object()).e(zc.a.b()).d(new mc.d() { // from class: d5.m
                @Override // mc.d
                public final Object apply(Object obj) {
                    return l.b.c(this.f10682a, jVar, obj);
                }
            }).i(new mc.c() { // from class: d5.n
                @Override // mc.c
                public final void accept(Object obj) {
                    l.b.e((Boolean) obj);
                }
            }, new mc.c() { // from class: d5.o
                @Override // mc.c
                public final void accept(Object obj) {
                    l.b.d((Throwable) obj);
                }
            });
        }

        private j h(long j10) {
            j jVarK = j.k(j10);
            if (jVarK != null && !this.f10678b) {
                if (System.currentTimeMillis() - jVarK.f10668s > (l.this.f10672b ? 86400000L : 432000000L)) {
                    f(jVarK);
                }
            }
            return jVarK;
        }

        private void i(final j jVar) {
            if (this.f10679c != null) {
                l.this.f10676f.post(new Runnable() { // from class: d5.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.b bVar = this.f10684a;
                        bVar.f10679c.a(bVar.f10677a, jVar.j());
                    }
                });
            }
            l.this.f10675e.put(Long.valueOf(this.f10677a), jVar.j());
        }

        @Override // s3.c.f
        public byte[] a() {
            if (k.a(this.f10677a)) {
                return g();
            }
            String strB = k.b(this.f10677a);
            if (strB != null) {
                return l.k(strB);
            }
            return null;
        }

        public byte[] g() {
            byte[] bArr;
            Um.UserPublicProfileResult publicProfile;
            j jVarH = h(this.f10677a);
            if (jVarH != null) {
                bArr = jVarH.f10666h;
                i(jVarH);
                if (Cfg.f5476a) {
                    s3.b.b("UserInfoManager", String.format(Locale.getDefault(), "完成本地加载 % 5d，更新时间：%d 名字：%s", Long.valueOf(this.f10677a), Long.valueOf(jVarH.f10667r), jVarH.j()));
                }
                if (!this.f10678b) {
                    return bArr;
                }
            } else {
                bArr = null;
            }
            try {
                long j10 = 0;
                if (Cfg.f5476a) {
                    s3.b.b("UserInfoManager", String.format(Locale.getDefault(), "开始网络加载 % 5d，更新时间：%d", Long.valueOf(this.f10677a), Long.valueOf(jVarH == null ? 0L : jVarH.f10667r)));
                }
                UserGrpc.UserBlockingStub userBlockingStubH = f5.d.f12792a.h();
                Um.UserPublicProfileRequest.Builder uid = Um.UserPublicProfileRequest.newBuilder().setUid(this.f10677a);
                if (jVarH != null) {
                    j10 = jVarH.f10667r;
                }
                publicProfile = userBlockingStubH.getPublicProfile(uid.setSyncAt(j10).build());
                if (Cfg.f5476a) {
                    if (publicProfile.getStatus() == Um.UserPublicProfileResult.Status.unchanged) {
                        s3.b.b("UserInfoManager", String.format(Locale.getDefault(), "完成网络加载 % 5d，数据无更改", Long.valueOf(this.f10677a)));
                    } else {
                        s3.b.b("UserInfoManager", String.format(Locale.getDefault(), "完成网络加载 % 5d，更新时间：%d 名字：%s", Long.valueOf(this.f10677a), Long.valueOf(publicProfile.getData().getUpdateAt()), publicProfile.getData().getUsername()));
                    }
                }
            } catch (Exception e10) {
                if (Cfg.f5476a) {
                    e10.printStackTrace();
                }
            }
            if (!publicProfile.hasData()) {
                if (jVarH != null) {
                    jVarH.f10668s = System.currentTimeMillis();
                    jVarH.n();
                    return bArr;
                }
                return bArr;
            }
            if (jVarH != null) {
                jVarH.o(publicProfile.getData());
                jVarH.n();
            } else {
                jVarH = j.m(publicProfile.getData());
            }
            i(jVarH);
            return publicProfile.getData().getPhoto().C();
        }

        @Override // s3.c.f
        public String getId() {
            return Name.MARK + this.f10677a;
        }

        public b(long j10, boolean z10, a aVar) {
            this.f10677a = j10;
            this.f10678b = z10;
            this.f10679c = aVar;
        }
    }

    public class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            NetworkInfo networkInfo = l.this.f10671a.getNetworkInfo(1);
            l.this.f10672b = networkInfo != null && networkInfo.isConnected();
        }
    }

    private l(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f10673c = s3.c.g(applicationContext);
        File file = new File(applicationContext.getExternalCacheDir(), "userIcons");
        this.f10674d = file;
        file.mkdirs();
        this.f10675e = new androidx.collection.h(102400);
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        this.f10671a = connectivityManager;
        if (connectivityManager != null) {
            NetworkInfo networkInfo = connectivityManager.getNetworkInfo(1);
            this.f10672b = networkInfo != null && networkInfo.isConnected();
            b0.b.j(applicationContext, new c(), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), 2);
        }
    }

    public static l g() {
        if (f10670g == null) {
            synchronized (l.class) {
                try {
                    if (f10670g == null) {
                        f10670g = new l(Main.f5555g);
                    }
                } finally {
                }
            }
        }
        return f10670g;
    }

    public static byte[] k(String str) throws Throwable {
        FileInputStream fileInputStream;
        File fileC = Cfg.C(str);
        FileInputStream fileInputStream2 = null;
        if (fileC == null) {
            return null;
        }
        try {
            fileInputStream = new FileInputStream(fileC);
        } catch (IOException e10) {
            e = e10;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            a6.m.b(fileInputStream2);
            throw th;
        }
        try {
            try {
                byte[] bArrO = a6.m.o(fileInputStream);
                a6.m.b(fileInputStream);
                return bArrO;
            } catch (Throwable th3) {
                th = th3;
                fileInputStream2 = fileInputStream;
                a6.m.b(fileInputStream2);
                throw th;
            }
        } catch (IOException e11) {
            e = e11;
            e.printStackTrace();
            a6.m.b(fileInputStream);
            return null;
        }
    }

    public String f(long j10) {
        com.dw.ht.user.b bVar = com.dw.ht.user.b.f6853a;
        return j10 == bVar.i() ? bVar.d() : (String) this.f10675e.get(Long.valueOf(j10));
    }

    public void h(long j10, c.d dVar) {
        i(j10, dVar, null);
    }

    public void i(long j10, c.d dVar, a aVar) {
        if (aVar != null) {
            aVar.a(j10, (String) this.f10675e.get(Long.valueOf(j10)));
        }
        this.f10673c.j(new b(j10, false, aVar), dVar);
    }

    public void j(ImageView imageView, long j10) {
        this.f10673c.i(new b(this, j10), imageView);
    }

    public void l(long j10, c.d dVar) {
        this.f10673c.n(new b(j10, true, null), dVar);
    }
}
