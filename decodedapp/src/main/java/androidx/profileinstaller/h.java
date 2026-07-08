package androidx.profileinstaller;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import j$.util.Objects;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final androidx.concurrent.futures.c f2816a = androidx.concurrent.futures.c.o();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object f2817b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static c f2818c = null;

    private static class a {
        static PackageInfo a(PackageManager packageManager, Context context) {
            return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
        }
    }

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f2819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f2820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final long f2821c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final long f2822d;

        b(int i10, int i11, long j10, long j11) {
            this.f2819a = i10;
            this.f2820b = i11;
            this.f2821c = j10;
            this.f2822d = j11;
        }

        static b a(File file) throws IOException {
            DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
            try {
                b bVar = new b(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
                dataInputStream.close();
                return bVar;
            } finally {
            }
        }

        void b(File file) throws IOException {
            file.delete();
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
            try {
                dataOutputStream.writeInt(this.f2819a);
                dataOutputStream.writeInt(this.f2820b);
                dataOutputStream.writeLong(this.f2821c);
                dataOutputStream.writeLong(this.f2822d);
                dataOutputStream.close();
            } catch (Throwable th2) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof b)) {
                b bVar = (b) obj;
                if (this.f2820b == bVar.f2820b && this.f2821c == bVar.f2821c && this.f2819a == bVar.f2819a && this.f2822d == bVar.f2822d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f2820b), Long.valueOf(this.f2821c), Integer.valueOf(this.f2819a), Long.valueOf(this.f2822d));
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f2823a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f2824b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f2825c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f2826d;

        c(int i10, boolean z10, boolean z11, boolean z12) {
            this.f2823a = i10;
            this.f2825c = z11;
            this.f2824b = z10;
            this.f2826d = z12;
        }
    }

    private static long a(Context context) {
        PackageManager packageManager = context.getApplicationContext().getPackageManager();
        return Build.VERSION.SDK_INT >= 33 ? a.a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
    }

    private static c b(int i10, boolean z10, boolean z11, boolean z12) {
        c cVar = new c(i10, z10, z11, z12);
        f2818c = cVar;
        f2816a.m(cVar);
        return f2818c;
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x00f8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.profileinstaller.h.c c(android.content.Context r19, boolean r20) {
        /*
            Method dump skipped, instruction units count: 278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.profileinstaller.h.c(android.content.Context, boolean):androidx.profileinstaller.h$c");
    }
}
