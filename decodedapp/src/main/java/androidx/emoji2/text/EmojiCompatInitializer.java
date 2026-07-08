package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.e;
import androidx.lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class EmojiCompatInitializer implements n1.a {

    class a implements androidx.lifecycle.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.lifecycle.m f2034a;

        a(androidx.lifecycle.m mVar) {
            this.f2034a = mVar;
        }

        @Override // androidx.lifecycle.g
        public void c(androidx.lifecycle.t tVar) {
            EmojiCompatInitializer.this.e();
            this.f2034a.d(this);
        }

        @Override // androidx.lifecycle.g
        public /* synthetic */ void e(androidx.lifecycle.t tVar) {
            androidx.lifecycle.f.a(this, tVar);
        }

        @Override // androidx.lifecycle.g
        public /* synthetic */ void l(androidx.lifecycle.t tVar) {
            androidx.lifecycle.f.c(this, tVar);
        }

        @Override // androidx.lifecycle.g
        public /* synthetic */ void onDestroy(androidx.lifecycle.t tVar) {
            androidx.lifecycle.f.b(this, tVar);
        }

        @Override // androidx.lifecycle.g
        public /* synthetic */ void onStart(androidx.lifecycle.t tVar) {
            androidx.lifecycle.f.d(this, tVar);
        }

        @Override // androidx.lifecycle.g
        public /* synthetic */ void onStop(androidx.lifecycle.t tVar) {
            androidx.lifecycle.f.e(this, tVar);
        }
    }

    static class b extends e.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f2036a;

        class a extends e.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.i f2037a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f2038b;

            a(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f2037a = iVar;
                this.f2038b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th2) {
                try {
                    this.f2037a.a(th2);
                } finally {
                    this.f2038b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.i
            public void b(m mVar) {
                try {
                    this.f2037a.b(mVar);
                } finally {
                    this.f2038b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f2036a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.h
        public void a(final e.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2078a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                j jVarA = androidx.emoji2.text.c.a(this.f2036a);
                if (jVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                jVarA.c(threadPoolExecutor);
                jVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th2) {
                iVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                i0.l.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.i()) {
                    e.c().l();
                }
            } finally {
                i0.l.b();
            }
        }
    }

    @Override // n1.a
    public List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // n1.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        e.h(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        androidx.lifecycle.m mVarS0 = ((androidx.lifecycle.t) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).S0();
        mVarS0.a(new a(mVarS0));
    }

    void e() {
        androidx.emoji2.text.b.c().postDelayed(new d(), 500L);
    }
}
