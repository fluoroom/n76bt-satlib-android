package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.b;
import androidx.appcompat.app.h;
import androidx.appcompat.view.b;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a */
    static c f849a = new c(new d());

    /* JADX INFO: renamed from: b */
    private static int f850b = -100;

    /* JADX INFO: renamed from: c */
    private static i0.f f851c = null;

    /* JADX INFO: renamed from: d */
    private static i0.f f852d = null;

    /* JADX INFO: renamed from: e */
    private static Boolean f853e = null;

    /* JADX INFO: renamed from: f */
    private static boolean f854f = false;

    /* JADX INFO: renamed from: g */
    private static final androidx.collection.b f855g = new androidx.collection.b();

    /* JADX INFO: renamed from: h */
    private static final Object f856h = new Object();

    /* JADX INFO: renamed from: r */
    private static final Object f857r = new Object();

    static class a {
        static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    static class b {
        static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    static class c implements Executor {

        /* JADX INFO: renamed from: a */
        private final Object f858a = new Object();

        /* JADX INFO: renamed from: b */
        final Queue f859b = new ArrayDeque();

        /* JADX INFO: renamed from: c */
        final Executor f860c;

        /* JADX INFO: renamed from: d */
        Runnable f861d;

        c(Executor executor) {
            this.f860c = executor;
        }

        public static /* synthetic */ void a(c cVar, Runnable runnable) {
            cVar.getClass();
            try {
                runnable.run();
            } finally {
                cVar.b();
            }
        }

        protected void b() {
            synchronized (this.f858a) {
                try {
                    Runnable runnable = (Runnable) this.f859b.poll();
                    this.f861d = runnable;
                    if (runnable != null) {
                        this.f860c.execute(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f858a) {
                try {
                    this.f859b.add(new Runnable() { // from class: androidx.appcompat.app.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            h.c.a(this.f862a, runnable);
                        }
                    });
                    if (this.f861d == null) {
                        b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    static class d implements Executor {
        d() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    h() {
    }

    static void H(h hVar) {
        synchronized (f856h) {
            I(hVar);
        }
    }

    private static void I(h hVar) {
        synchronized (f856h) {
            try {
                Iterator it = f855g.iterator();
                while (it.hasNext()) {
                    h hVar2 = (h) ((WeakReference) it.next()).get();
                    if (hVar2 == hVar || hVar2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void K(i0.f fVar) {
        Objects.requireNonNull(fVar);
        if (Build.VERSION.SDK_INT >= 33) {
            Object objR = r();
            if (objR != null) {
                b.b(objR, a.a(fVar.h()));
                return;
            }
            return;
        }
        if (fVar.equals(f851c)) {
            return;
        }
        synchronized (f856h) {
            f851c = fVar;
            f();
        }
    }

    public static void L(boolean z10) {
        VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(z10);
    }

    static void U(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (m().f()) {
                    String strB = a0.e.b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        b.b(systemService, a.a(strB));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }

    public static void V(final Context context) {
        if (y(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (f854f) {
                    return;
                }
                f849a.execute(new Runnable() { // from class: androidx.appcompat.app.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.a(context);
                    }
                });
                return;
            }
            synchronized (f857r) {
                try {
                    i0.f fVar = f851c;
                    if (fVar == null) {
                        if (f852d == null) {
                            f852d = i0.f.c(a0.e.b(context));
                        }
                        if (f852d.f()) {
                        } else {
                            f851c = f852d;
                        }
                    } else if (!fVar.equals(f852d)) {
                        i0.f fVar2 = f851c;
                        f852d = fVar2;
                        a0.e.a(context, fVar2.h());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public static /* synthetic */ void a(Context context) {
        U(context);
        f854f = true;
    }

    static void c(h hVar) {
        synchronized (f856h) {
            I(hVar);
            f855g.add(new WeakReference(hVar));
        }
    }

    private static void f() {
        Iterator it = f855g.iterator();
        while (it.hasNext()) {
            h hVar = (h) ((WeakReference) it.next()).get();
            if (hVar != null) {
                hVar.e();
            }
        }
    }

    public static h j(Activity activity, e eVar) {
        return new j(activity, eVar);
    }

    public static h k(Dialog dialog, e eVar) {
        return new j(dialog, eVar);
    }

    public static i0.f m() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object objR = r();
            if (objR != null) {
                return i0.f.i(b.a(objR));
            }
        } else {
            i0.f fVar = f851c;
            if (fVar != null) {
                return fVar;
            }
        }
        return i0.f.e();
    }

    public static int o() {
        return f850b;
    }

    static Object r() {
        Context contextN;
        Iterator it = f855g.iterator();
        while (it.hasNext()) {
            h hVar = (h) ((WeakReference) it.next()).get();
            if (hVar != null && (contextN = hVar.n()) != null) {
                return contextN.getSystemService("locale");
            }
        }
        return null;
    }

    static i0.f t() {
        return f851c;
    }

    static i0.f u() {
        return f852d;
    }

    static boolean y(Context context) {
        if (f853e == null) {
            try {
                Bundle bundle = AppLocalesMetadataHolderService.a(context).metaData;
                if (bundle != null) {
                    f853e = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f853e = Boolean.FALSE;
            }
        }
        return f853e.booleanValue();
    }

    public abstract void A(Bundle bundle);

    public abstract void B();

    public abstract void C(Bundle bundle);

    public abstract void D();

    public abstract void E(Bundle bundle);

    public abstract void F();

    public abstract void G();

    public abstract boolean J(int i10);

    public abstract void M(int i10);

    public abstract void N(View view);

    public abstract void O(View view, ViewGroup.LayoutParams layoutParams);

    public void P(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void Q(Toolbar toolbar);

    public abstract void R(int i10);

    public abstract void S(CharSequence charSequence);

    public abstract androidx.appcompat.view.b T(b.a aVar);

    public abstract void d(View view, ViewGroup.LayoutParams layoutParams);

    abstract boolean e();

    void g(final Context context) {
        f849a.execute(new Runnable() { // from class: androidx.appcompat.app.g
            @Override // java.lang.Runnable
            public final void run() {
                h.V(context);
            }
        });
    }

    public void h(Context context) {
    }

    public Context i(Context context) {
        h(context);
        return context;
    }

    public abstract View l(int i10);

    public abstract Context n();

    public abstract b.InterfaceC0016b p();

    public abstract int q();

    public abstract MenuInflater s();

    public abstract androidx.appcompat.app.a v();

    public abstract void w();

    public abstract void x();

    public abstract void z(Configuration configuration);
}
