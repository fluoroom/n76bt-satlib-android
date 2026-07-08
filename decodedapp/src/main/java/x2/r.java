package x2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import e3.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import x2.b;

/* JADX INFO: loaded from: classes.dex */
final class r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile r f31572d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f31573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Set f31574b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31575c;

    class a implements f.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f31576a;

        a(Context context) {
            this.f31576a = context;
        }

        @Override // e3.f.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f31576a.getSystemService("connectivity");
        }
    }

    class b implements b.a {
        b() {
        }

        @Override // x2.b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            e3.l.a();
            synchronized (r.this) {
                arrayList = new ArrayList(r.this.f31574b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((b.a) it.next()).a(z10);
            }
        }
    }

    private interface c {
        boolean a();

        void b();
    }

    private static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f31579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b.a f31580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f.b f31581c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f31582d = new a();

        class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: x2.r$d$a$a, reason: collision with other inner class name */
            class RunnableC0423a implements Runnable {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ boolean f31584a;

                RunnableC0423a(boolean z10) {
                    this.f31584a = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f31584a);
                }
            }

            a() {
            }

            private void b(boolean z10) {
                e3.l.v(new RunnableC0423a(z10));
            }

            void a(boolean z10) {
                e3.l.a();
                d dVar = d.this;
                boolean z11 = dVar.f31579a;
                dVar.f31579a = z10;
                if (z11 != z10) {
                    dVar.f31580b.a(z10);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                b(false);
            }
        }

        d(f.b bVar, b.a aVar) {
            this.f31581c = bVar;
            this.f31580b = aVar;
        }

        @Override // x2.r.c
        public boolean a() {
            this.f31579a = ((ConnectivityManager) this.f31581c.get()).getActiveNetwork() != null;
            try {
                ((ConnectivityManager) this.f31581c.get()).registerDefaultNetworkCallback(this.f31582d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }

        @Override // x2.r.c
        public void b() {
            ((ConnectivityManager) this.f31581c.get()).unregisterNetworkCallback(this.f31582d);
        }
    }

    private static final class e implements c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final Executor f31586g = AsyncTask.SERIAL_EXECUTOR;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f31587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final b.a f31588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final f.b f31589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f31590d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f31591e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final BroadcastReceiver f31592f = new a();

        class a extends BroadcastReceiver {
            a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                e.this.e();
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f31590d = eVar.c();
                try {
                    e eVar2 = e.this;
                    eVar2.f31587a.registerReceiver(eVar2.f31592f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    e.this.f31591e = true;
                } catch (SecurityException e10) {
                    if (Log.isLoggable("ConnectivityMonitor", 5)) {
                        Log.w("ConnectivityMonitor", "Failed to register", e10);
                    }
                    e.this.f31591e = false;
                }
            }
        }

        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (e.this.f31591e) {
                    e.this.f31591e = false;
                    e eVar = e.this;
                    eVar.f31587a.unregisterReceiver(eVar.f31592f);
                }
            }
        }

        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10 = e.this.f31590d;
                e eVar = e.this;
                eVar.f31590d = eVar.c();
                if (z10 != e.this.f31590d) {
                    if (Log.isLoggable("ConnectivityMonitor", 3)) {
                        Log.d("ConnectivityMonitor", "connectivity changed, isConnected: " + e.this.f31590d);
                    }
                    e eVar2 = e.this;
                    eVar2.d(eVar2.f31590d);
                }
            }
        }

        /* JADX INFO: renamed from: x2.r$e$e, reason: collision with other inner class name */
        class RunnableC0424e implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ boolean f31597a;

            RunnableC0424e(boolean z10) {
                this.f31597a = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                e.this.f31588b.a(this.f31597a);
            }
        }

        e(Context context, f.b bVar, b.a aVar) {
            this.f31587a = context.getApplicationContext();
            this.f31589c = bVar;
            this.f31588b = aVar;
        }

        @Override // x2.r.c
        public boolean a() {
            f31586g.execute(new b());
            return true;
        }

        @Override // x2.r.c
        public void b() {
            f31586g.execute(new c());
        }

        boolean c() {
            try {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f31589c.get()).getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to determine connectivity status when connectivity changed", e10);
                }
                return true;
            }
        }

        void d(boolean z10) {
            e3.l.v(new RunnableC0424e(z10));
        }

        void e() {
            f31586g.execute(new d());
        }
    }

    private r(Context context) {
        f.b bVarA = e3.f.a(new a(context));
        b bVar = new b();
        this.f31573a = Build.VERSION.SDK_INT >= 24 ? new d(bVarA, bVar) : new e(context, bVarA, bVar);
    }

    static r a(Context context) {
        if (f31572d == null) {
            synchronized (r.class) {
                try {
                    if (f31572d == null) {
                        f31572d = new r(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f31572d;
    }

    private void b() {
        if (this.f31575c || this.f31574b.isEmpty()) {
            return;
        }
        this.f31575c = this.f31573a.a();
    }

    private void c() {
        if (this.f31575c && this.f31574b.isEmpty()) {
            this.f31573a.b();
            this.f31575c = false;
        }
    }

    synchronized void d(b.a aVar) {
        this.f31574b.add(aVar);
        b();
    }

    synchronized void e(b.a aVar) {
        this.f31574b.remove(aVar);
        c();
    }
}
