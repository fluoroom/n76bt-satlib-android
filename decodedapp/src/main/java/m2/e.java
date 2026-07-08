package m2;

import android.util.Log;
import g2.a;
import java.io.File;
import java.io.IOException;
import m2.a;

/* JADX INFO: loaded from: classes.dex */
public class e implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f20933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f20934c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g2.a f20936e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f20935d = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j f20932a = new j();

    protected e(File file, long j10) {
        this.f20933b = file;
        this.f20934c = j10;
    }

    public static a c(File file, long j10) {
        return new e(file, j10);
    }

    private synchronized g2.a d() {
        try {
            if (this.f20936e == null) {
                this.f20936e = g2.a.h0(this.f20933b, 1, 1, this.f20934c);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f20936e;
    }

    @Override // m2.a
    public File a(i2.f fVar) throws Throwable {
        String strB = this.f20932a.b(fVar);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Log.v("DiskLruCacheWrapper", "Get: Obtained: " + strB + " for for Key: " + fVar);
        }
        try {
            a.e eVarW = d().W(strB);
            if (eVarW != null) {
                return eVarW.a(0);
            }
            return null;
        } catch (IOException e10) {
            if (!Log.isLoggable("DiskLruCacheWrapper", 5)) {
                return null;
            }
            Log.w("DiskLruCacheWrapper", "Unable to get from disk cache", e10);
            return null;
        }
    }

    @Override // m2.a
    public void b(i2.f fVar, a.b bVar) {
        String strB = this.f20932a.b(fVar);
        this.f20935d.a(strB);
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Log.v("DiskLruCacheWrapper", "Put: Obtained: " + strB + " for for Key: " + fVar);
            }
            try {
                g2.a aVarD = d();
                if (aVarD.W(strB) == null) {
                    a.c cVarH = aVarD.H(strB);
                    if (cVarH == null) {
                        throw new IllegalStateException("Had two simultaneous puts for: " + strB);
                    }
                    try {
                        if (bVar.a(cVarH.f(0))) {
                            cVarH.e();
                        }
                        cVarH.b();
                    } catch (Throwable th2) {
                        cVarH.b();
                        throw th2;
                    }
                }
            } catch (IOException e10) {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e10);
                }
            }
        } finally {
            this.f20935d.b(strB);
        }
    }
}
