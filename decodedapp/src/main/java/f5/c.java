package f5;

import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.user.a;
import java.util.Locale;
import java.util.concurrent.Executor;
import qb.b;
import qb.z0;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class c extends qb.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f12788a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final z0.h f12789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final z0.h f12790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z0.h f12791d;

    static {
        z0.d dVar = z0.f24834e;
        f12789b = z0.h.e("hl", dVar);
        f12790c = z0.h.e("access_token", dVar);
        f12791d = z0.h.e("bearer", dVar);
    }

    private c() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(b.a aVar) {
        Object string = Locale.getDefault().getLanguage().toString();
        final z0 z0Var = new z0();
        Cfg.Settings settingsO = Cfg.O();
        z0Var.o(f12789b, string);
        com.dw.ht.user.a.i(Main.f5555g).d(new a.b() { // from class: f5.b
            @Override // com.dw.ht.user.a.b
            public final void a(String str) {
                c.e(z0Var, str);
            }
        });
        String str = settingsO.bearer;
        if (str != null && str.length() > 0) {
            z0Var.o(f12791d, str);
        }
        aVar.a(z0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(z0 z0Var, String str) {
        if (str != null) {
            z0Var.o(f12790c, str);
        }
    }

    @Override // qb.b
    public void a(b.AbstractC0337b abstractC0337b, Executor executor, final b.a aVar) {
        m.e(executor, "executor");
        m.e(aVar, "metadataApplier");
        executor.execute(new Runnable() { // from class: f5.a
            @Override // java.lang.Runnable
            public final void run() {
                c.d(aVar);
            }
        });
    }
}
