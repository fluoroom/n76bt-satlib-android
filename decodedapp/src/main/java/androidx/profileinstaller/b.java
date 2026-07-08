package androidx.profileinstaller;

import android.content.res.AssetManager;
import android.os.Build;
import androidx.profileinstaller.f;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AssetManager f2785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f2786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f.c f2787c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f2789e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f2790f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f2791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f2792h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c[] f2794j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private byte[] f2795k;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f2793i = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f2788d = d();

    public b(AssetManager assetManager, Executor executor, f.c cVar, String str, String str2, String str3, File file) {
        this.f2785a = assetManager;
        this.f2786b = executor;
        this.f2787c = cVar;
        this.f2790f = str;
        this.f2791g = str2;
        this.f2792h = str3;
        this.f2789e = file;
    }

    private b b(c[] cVarArr, byte[] bArr) {
        InputStream inputStreamG;
        try {
            inputStreamG = g(this.f2785a, this.f2792h);
        } catch (FileNotFoundException e10) {
            this.f2787c.b(9, e10);
        } catch (IOException e11) {
            this.f2787c.b(7, e11);
        } catch (IllegalStateException e12) {
            this.f2794j = null;
            this.f2787c.b(8, e12);
        }
        if (inputStreamG == null) {
            if (inputStreamG != null) {
                inputStreamG.close();
            }
            return null;
        }
        try {
            this.f2794j = g.r(inputStreamG, g.p(inputStreamG, g.f2815b), bArr, cVarArr);
            inputStreamG.close();
            return this;
        } catch (Throwable th2) {
            try {
                inputStreamG.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    private void c() {
        if (!this.f2793i) {
            throw new IllegalStateException("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
        }
    }

    private static byte[] d() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24) {
            return null;
        }
        if (i10 >= 31) {
            return i.f2827a;
        }
        switch (i10) {
            case 24:
            case 25:
                return i.f2831e;
            case 26:
                return i.f2830d;
            case 27:
                return i.f2829c;
            case 28:
            case 29:
            case 30:
                return i.f2828b;
            default:
                return null;
        }
    }

    private InputStream f(AssetManager assetManager) {
        try {
            return g(assetManager, this.f2791g);
        } catch (FileNotFoundException e10) {
            this.f2787c.b(6, e10);
            return null;
        } catch (IOException e11) {
            this.f2787c.b(7, e11);
            return null;
        }
    }

    private InputStream g(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e10) {
            String message = e10.getMessage();
            if (message != null && message.contains("compressed")) {
                this.f2787c.a(5, null);
            }
            return null;
        }
    }

    private c[] i(InputStream inputStream) {
        try {
            try {
                try {
                    c[] cVarArrX = g.x(inputStream, g.p(inputStream, g.f2814a), this.f2790f);
                    try {
                        inputStream.close();
                        return cVarArrX;
                    } catch (IOException e10) {
                        this.f2787c.b(7, e10);
                        return cVarArrX;
                    }
                } catch (IOException e11) {
                    this.f2787c.b(7, e11);
                    return null;
                }
            } catch (IllegalStateException e12) {
                this.f2787c.b(8, e12);
                return null;
            }
        } finally {
            try {
                inputStream.close();
            } catch (IOException e13) {
                this.f2787c.b(7, e13);
            }
        }
    }

    private static boolean j() {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 24) {
            return false;
        }
        return i10 >= 31 || i10 == 24 || i10 == 25;
    }

    private void k(final int i10, final Object obj) {
        this.f2786b.execute(new Runnable() { // from class: j1.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f18383a.f2787c.b(i10, obj);
            }
        });
    }

    public boolean e() {
        if (this.f2788d == null) {
            k(3, Integer.valueOf(Build.VERSION.SDK_INT));
            return false;
        }
        if (!this.f2789e.exists()) {
            try {
                if (!this.f2789e.createNewFile()) {
                    k(4, null);
                    return false;
                }
            } catch (IOException unused) {
                k(4, null);
                return false;
            }
        } else if (!this.f2789e.canWrite()) {
            k(4, null);
            return false;
        }
        this.f2793i = true;
        return true;
    }

    public b h() {
        b bVarB;
        c();
        if (this.f2788d != null) {
            InputStream inputStreamF = f(this.f2785a);
            if (inputStreamF != null) {
                this.f2794j = i(inputStreamF);
            }
            c[] cVarArr = this.f2794j;
            if (cVarArr != null && j() && (bVarB = b(cVarArr, this.f2788d)) != null) {
                return bVarB;
            }
        }
        return this;
    }

    public b l() {
        ByteArrayOutputStream byteArrayOutputStream;
        c[] cVarArr = this.f2794j;
        byte[] bArr = this.f2788d;
        if (cVarArr != null && bArr != null) {
            c();
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
            } catch (IOException e10) {
                this.f2787c.b(7, e10);
            } catch (IllegalStateException e11) {
                this.f2787c.b(8, e11);
            }
            try {
                g.F(byteArrayOutputStream, bArr);
                if (!g.C(byteArrayOutputStream, bArr, cVarArr)) {
                    this.f2787c.b(5, null);
                    this.f2794j = null;
                    byteArrayOutputStream.close();
                    return this;
                }
                this.f2795k = byteArrayOutputStream.toByteArray();
                byteArrayOutputStream.close();
                this.f2794j = null;
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return this;
    }

    public boolean m() {
        byte[] bArr = this.f2795k;
        if (bArr == null) {
            return false;
        }
        c();
        try {
            try {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(this.f2789e);
                    try {
                        FileChannel channel = fileOutputStream.getChannel();
                        try {
                            FileLock fileLockTryLock = channel.tryLock();
                            try {
                                d.l(byteArrayInputStream, fileOutputStream, fileLockTryLock);
                                k(1, null);
                                if (fileLockTryLock != null) {
                                    fileLockTryLock.close();
                                }
                                channel.close();
                                fileOutputStream.close();
                                byteArrayInputStream.close();
                                return true;
                            } finally {
                            }
                        } finally {
                        }
                    } finally {
                    }
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (FileNotFoundException e10) {
                k(6, e10);
                return false;
            } catch (IOException e11) {
                k(7, e11);
                return false;
            }
        } finally {
            this.f2795k = null;
            this.f2794j = null;
        }
    }
}
