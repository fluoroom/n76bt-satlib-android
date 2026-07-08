package r2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.Log;
import com.facebook.stetho.server.http.HttpStatus;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class a0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f25312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f25313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final File f25314g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static volatile a0 f25315h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f25317b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f25318c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f25319d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25316a = 20000;

    static {
        int i10 = Build.VERSION.SDK_INT;
        f25312e = i10 < 29;
        f25313f = i10 >= 28;
        f25314g = new File("/proc/self/fd");
    }

    a0() {
    }

    private boolean a() {
        return f25312e && !this.f25319d.get();
    }

    public static a0 b() {
        if (f25315h == null) {
            synchronized (a0.class) {
                try {
                    if (f25315h == null) {
                        f25315h = new a0();
                    }
                } finally {
                }
            }
        }
        return f25315h;
    }

    private int c() {
        return e() ? HttpStatus.HTTP_INTERNAL_SERVER_ERROR : this.f25316a;
    }

    private synchronized boolean d() {
        try {
            boolean z10 = true;
            int i10 = this.f25317b + 1;
            this.f25317b = i10;
            if (i10 >= 50) {
                this.f25317b = 0;
                int length = f25314g.list().length;
                long jC = c();
                if (length >= jC) {
                    z10 = false;
                }
                this.f25318c = z10;
                if (!z10 && Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + jC);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f25318c;
    }

    private static boolean e() {
        if (Build.VERSION.SDK_INT != 28) {
            return false;
        }
        Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
        while (it.hasNext()) {
            if (Build.MODEL.startsWith((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public boolean f(int i10, int i11, boolean z10, boolean z11) {
        if (!z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
            }
            return false;
        }
        if (!f25313f) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
            }
            return false;
        }
        if (a()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
            }
            return false;
        }
        if (z11) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
            }
            return false;
        }
        if (i10 < 0 || i11 < 0) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
            }
            return false;
        }
        if (d()) {
            return true;
        }
        if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
        }
        return false;
    }

    boolean g(int i10, int i11, BitmapFactory.Options options, boolean z10, boolean z11) {
        boolean zF = f(i10, i11, z10, z11);
        if (zF) {
            options.inPreferredConfig = Bitmap.Config.HARDWARE;
            options.inMutable = false;
        }
        return zF;
    }

    public void h() {
        e3.l.a();
        this.f25319d.set(true);
    }
}
