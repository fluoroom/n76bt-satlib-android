package o8;

import android.content.Context;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f23279a = "e";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f23280b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f23281c = a.LEGACY;

    public enum a {
        LEGACY,
        LATEST
    }

    public static synchronized int a(Context context) {
        return b(context, null, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:46|12|13|14|(8:16|(1:(0)(1:20))|48|21|(1:23)|26|29|(1:31))|19|48|21|(0)|26|29|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        android.util.Log.e(o8.e.f23279a, "Failed to retrieve renderer type or log initialization.", r5);
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004f A[Catch: all -> 0x0024, RemoteException -> 0x0054, TryCatch #3 {RemoteException -> 0x0054, blocks: (B:21:0x0049, B:23:0x004f, B:26:0x0056), top: B:48:0x0049, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[Catch: all -> 0x0024, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0003, B:7:0x001e, B:11:0x0026, B:12:0x002a, B:14:0x0039, B:16:0x003e, B:21:0x0049, B:23:0x004f, B:26:0x0056, B:29:0x0065, B:31:0x0078, B:28:0x005e, B:35:0x0080, B:36:0x0085, B:38:0x0087), top: B:45:0x0003, inners: #0, #2, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized int b(android.content.Context r5, o8.e.a r6, o8.g r7) {
        /*
            java.lang.Class<o8.e> r0 = o8.e.class
            monitor-enter(r0)
            java.lang.String r1 = "Context is null"
            v7.q.j(r5, r1)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = o8.e.f23279a     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = "preferredRenderer: "
            java.lang.String r2 = r3.concat(r2)     // Catch: java.lang.Throwable -> L24
            android.util.Log.d(r1, r2)     // Catch: java.lang.Throwable -> L24
            boolean r1 = o8.e.f23280b     // Catch: java.lang.Throwable -> L24
            r2 = 0
            if (r1 == 0) goto L26
            if (r7 == 0) goto L7d
            o8.e$a r5 = o8.e.f23281c     // Catch: java.lang.Throwable -> L24
            r7.a(r5)     // Catch: java.lang.Throwable -> L24
            goto L7d
        L24:
            r5 = move-exception
            goto L8b
        L26:
            p8.d0 r1 = p8.b0.a(r5, r6)     // Catch: java.lang.Throwable -> L24 s7.f -> L86
            p8.a r3 = r1.t()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            o8.b.e(r3)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            l8.u r3 = r1.u()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            q8.c.c(r3)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L7f
            r3 = 1
            o8.e.f23280b = r3     // Catch: java.lang.Throwable -> L24
            r4 = 2
            if (r6 == 0) goto L46
            int r6 = r6.ordinal()     // Catch: java.lang.Throwable -> L24
            if (r6 == 0) goto L49
            if (r6 == r3) goto L48
        L46:
            r3 = 0
            goto L49
        L48:
            r3 = 2
        L49:
            int r6 = r1.p()     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L54
            if (r6 != r4) goto L56
            o8.e$a r6 = o8.e.a.LATEST     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L54
            o8.e.f23281c = r6     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L54
            goto L56
        L54:
            r5 = move-exception
            goto L5e
        L56:
            c8.b r5 = c8.d.v1(r5)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L54
            r1.g1(r5, r3)     // Catch: java.lang.Throwable -> L24 android.os.RemoteException -> L54
            goto L65
        L5e:
            java.lang.String r6 = o8.e.f23279a     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "Failed to retrieve renderer type or log initialization."
            android.util.Log.e(r6, r1, r5)     // Catch: java.lang.Throwable -> L24
        L65:
            java.lang.String r5 = o8.e.f23279a     // Catch: java.lang.Throwable -> L24
            o8.e$a r6 = o8.e.f23281c     // Catch: java.lang.Throwable -> L24
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L24
            java.lang.String r1 = "loadedRenderer: "
            java.lang.String r6 = r1.concat(r6)     // Catch: java.lang.Throwable -> L24
            android.util.Log.d(r5, r6)     // Catch: java.lang.Throwable -> L24
            if (r7 == 0) goto L7d
            o8.e$a r5 = o8.e.f23281c     // Catch: java.lang.Throwable -> L24
            r7.a(r5)     // Catch: java.lang.Throwable -> L24
        L7d:
            monitor-exit(r0)
            return r2
        L7f:
            r5 = move-exception
            q8.q r6 = new q8.q     // Catch: java.lang.Throwable -> L24
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L24
            throw r6     // Catch: java.lang.Throwable -> L24
        L86:
            r5 = move-exception
            int r5 = r5.f26994a     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)
            return r5
        L8b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: o8.e.b(android.content.Context, o8.e$a, o8.g):int");
    }
}
