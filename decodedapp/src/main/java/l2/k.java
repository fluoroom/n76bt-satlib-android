package l2;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class k implements d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Bitmap.Config f20347k = Bitmap.Config.ARGB_8888;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l f20348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f20349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f20350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f20351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f20352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f20353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f20354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f20355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f20356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f20357j;

    private interface a {
        void a(Bitmap bitmap);

        void b(Bitmap bitmap);
    }

    k(long j10, l lVar, Set set) {
        this.f20350c = j10;
        this.f20352e = j10;
        this.f20348a = lVar;
        this.f20349b = set;
        this.f20351d = new b();
    }

    private static void f(Bitmap.Config config) {
        if (Build.VERSION.SDK_INT >= 26 && config == Bitmap.Config.HARDWARE) {
            throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
        }
    }

    private static Bitmap g(int i10, int i11, Bitmap.Config config) {
        if (config == null) {
            config = f20347k;
        }
        return Bitmap.createBitmap(i10, i11, config);
    }

    private void h() {
        if (Log.isLoggable("LruBitmapPool", 2)) {
            i();
        }
    }

    private void i() {
        Log.v("LruBitmapPool", "Hits=" + this.f20354g + ", misses=" + this.f20355h + ", puts=" + this.f20356i + ", evictions=" + this.f20357j + ", currentSize=" + this.f20353f + ", maxSize=" + this.f20352e + "\nStrategy=" + this.f20348a);
    }

    private void j() {
        q(this.f20352e);
    }

    private static Set k() {
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i10 = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i10 >= 26) {
            hashSet.remove(Bitmap.Config.HARDWARE);
        }
        return DesugarCollections.unmodifiableSet(hashSet);
    }

    private static l l() {
        return new o();
    }

    private synchronized Bitmap m(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapD;
        try {
            f(config);
            bitmapD = this.f20348a.d(i10, i11, config != null ? config : f20347k);
            if (bitmapD == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Missing bitmap=" + this.f20348a.a(i10, i11, config));
                }
                this.f20355h++;
            } else {
                this.f20354g++;
                this.f20353f -= (long) this.f20348a.b(bitmapD);
                this.f20351d.a(bitmapD);
                p(bitmapD);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Get bitmap=" + this.f20348a.a(i10, i11, config));
            }
            h();
        } catch (Throwable th2) {
            throw th2;
        }
        return bitmapD;
    }

    private static void o(Bitmap bitmap) {
        bitmap.setPremultiplied(true);
    }

    private static void p(Bitmap bitmap) {
        bitmap.setHasAlpha(true);
        o(bitmap);
    }

    private synchronized void q(long j10) {
        while (this.f20353f > j10) {
            try {
                Bitmap bitmapRemoveLast = this.f20348a.removeLast();
                if (bitmapRemoveLast == null) {
                    if (Log.isLoggable("LruBitmapPool", 5)) {
                        Log.w("LruBitmapPool", "Size mismatch, resetting");
                        i();
                    }
                    this.f20353f = 0L;
                    return;
                }
                this.f20351d.a(bitmapRemoveLast);
                this.f20353f -= (long) this.f20348a.b(bitmapRemoveLast);
                this.f20357j++;
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    Log.d("LruBitmapPool", "Evicting bitmap=" + this.f20348a.e(bitmapRemoveLast));
                }
                h();
                bitmapRemoveLast.recycle();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // l2.d
    public void a(int i10) {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "trimMemory, level=" + i10);
        }
        if (i10 >= 40 || (Build.VERSION.SDK_INT >= 23 && i10 >= 20)) {
            b();
        } else if (i10 >= 20 || i10 == 15) {
            q(n() / 2);
        }
    }

    @Override // l2.d
    public void b() {
        if (Log.isLoggable("LruBitmapPool", 3)) {
            Log.d("LruBitmapPool", "clearMemory");
        }
        q(0L);
    }

    @Override // l2.d
    public synchronized void c(Bitmap bitmap) {
        try {
            if (bitmap == null) {
                throw new NullPointerException("Bitmap must not be null");
            }
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            if (bitmap.isMutable() && this.f20348a.b(bitmap) <= this.f20352e && this.f20349b.contains(bitmap.getConfig())) {
                int iB = this.f20348a.b(bitmap);
                this.f20348a.c(bitmap);
                this.f20351d.b(bitmap);
                this.f20356i++;
                this.f20353f += (long) iB;
                if (Log.isLoggable("LruBitmapPool", 2)) {
                    Log.v("LruBitmapPool", "Put bitmap in pool=" + this.f20348a.e(bitmap));
                }
                h();
                j();
                return;
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Log.v("LruBitmapPool", "Reject bitmap from pool, bitmap: " + this.f20348a.e(bitmap) + ", is mutable: " + bitmap.isMutable() + ", is allowed config: " + this.f20349b.contains(bitmap.getConfig()));
            }
            bitmap.recycle();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // l2.d
    public Bitmap d(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        if (bitmapM == null) {
            return g(i10, i11, config);
        }
        bitmapM.eraseColor(0);
        return bitmapM;
    }

    @Override // l2.d
    public Bitmap e(int i10, int i11, Bitmap.Config config) {
        Bitmap bitmapM = m(i10, i11, config);
        return bitmapM == null ? g(i10, i11, config) : bitmapM;
    }

    public long n() {
        return this.f20352e;
    }

    public k(long j10) {
        this(j10, l(), k());
    }

    private static final class b implements a {
        b() {
        }

        @Override // l2.k.a
        public void a(Bitmap bitmap) {
        }

        @Override // l2.k.a
        public void b(Bitmap bitmap) {
        }
    }
}
