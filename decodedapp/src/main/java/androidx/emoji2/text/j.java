package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.emoji2.text.e;
import j0.j;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes.dex */
public class j extends e.c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final a f2102k = new a();

    public static class a {
        public Typeface a(Context context, j.b bVar) {
            return j0.j.a(context, null, new j.b[]{bVar});
        }

        public j.a b(Context context, j0.f fVar) {
            return j0.j.b(context, null, fVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f2103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final j0.f f2104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final a f2105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f2106d = new Object();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Handler f2107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Executor f2108f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private ThreadPoolExecutor f2109g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        e.i f2110h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ContentObserver f2111i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private Runnable f2112j;

        b(Context context, j0.f fVar, a aVar) {
            l0.g.h(context, "Context cannot be null");
            l0.g.h(fVar, "FontRequest cannot be null");
            this.f2103a = context.getApplicationContext();
            this.f2104b = fVar;
            this.f2105c = aVar;
        }

        private void b() {
            synchronized (this.f2106d) {
                try {
                    this.f2110h = null;
                    ContentObserver contentObserver = this.f2111i;
                    if (contentObserver != null) {
                        this.f2105c.c(this.f2103a, contentObserver);
                        this.f2111i = null;
                    }
                    Handler handler = this.f2107e;
                    if (handler != null) {
                        handler.removeCallbacks(this.f2112j);
                    }
                    this.f2107e = null;
                    ThreadPoolExecutor threadPoolExecutor = this.f2109g;
                    if (threadPoolExecutor != null) {
                        threadPoolExecutor.shutdown();
                    }
                    this.f2108f = null;
                    this.f2109g = null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        private j.b e() {
            try {
                j.a aVarB = this.f2105c.b(this.f2103a, this.f2104b);
                if (aVarB.e() == 0) {
                    j.b[] bVarArrC = aVarB.c();
                    if (bVarArrC == null || bVarArrC.length == 0) {
                        throw new RuntimeException("fetchFonts failed (empty result)");
                    }
                    return bVarArrC[0];
                }
                throw new RuntimeException("fetchFonts failed (" + aVarB.e() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.e.h
        public void a(e.i iVar) {
            l0.g.h(iVar, "LoaderCallback cannot be null");
            synchronized (this.f2106d) {
                this.f2110h = iVar;
            }
            d();
        }

        void c() {
            synchronized (this.f2106d) {
                try {
                    if (this.f2110h == null) {
                        return;
                    }
                    try {
                        j.b bVarE = e();
                        int iB = bVarE.b();
                        if (iB == 2) {
                            synchronized (this.f2106d) {
                            }
                        }
                        if (iB != 0) {
                            throw new RuntimeException("fetchFonts result is not OK. (" + iB + ")");
                        }
                        try {
                            i0.l.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                            Typeface typefaceA = this.f2105c.a(this.f2103a, bVarE);
                            ByteBuffer byteBufferF = d0.r.f(this.f2103a, null, bVarE.e());
                            if (byteBufferF == null || typefaceA == null) {
                                throw new RuntimeException("Unable to open file.");
                            }
                            m mVarB = m.b(typefaceA, byteBufferF);
                            i0.l.b();
                            synchronized (this.f2106d) {
                                try {
                                    e.i iVar = this.f2110h;
                                    if (iVar != null) {
                                        iVar.b(mVarB);
                                    }
                                } finally {
                                }
                            }
                            b();
                        } catch (Throwable th2) {
                            i0.l.b();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        synchronized (this.f2106d) {
                            try {
                                e.i iVar2 = this.f2110h;
                                if (iVar2 != null) {
                                    iVar2.a(th3);
                                }
                                b();
                            } finally {
                            }
                        }
                    }
                } finally {
                }
            }
        }

        void d() {
            synchronized (this.f2106d) {
                try {
                    if (this.f2110h == null) {
                        return;
                    }
                    if (this.f2108f == null) {
                        ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("emojiCompat");
                        this.f2109g = threadPoolExecutorB;
                        this.f2108f = threadPoolExecutorB;
                    }
                    this.f2108f.execute(new Runnable() { // from class: androidx.emoji2.text.k
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f2113a.c();
                        }
                    });
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void f(Executor executor) {
            synchronized (this.f2106d) {
                this.f2108f = executor;
            }
        }
    }

    public j(Context context, j0.f fVar) {
        super(new b(context, fVar, f2102k));
    }

    public j c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
