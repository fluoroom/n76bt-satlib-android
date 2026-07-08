package io.objectbox;

import fc.k;
import io.objectbox.BoxStore;
import io.objectbox.converter.PropertyConverter;
import io.objectbox.exception.DbException;
import io.objectbox.exception.DbSchemaException;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class BoxStore implements Closeable {
    private static Object G;
    private static Object H;
    private static final Set I = new HashSet();
    private static volatile Thread J;
    private volatile boolean B;
    volatile int D;
    private int E;
    private final int F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PrintStream f17315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f17316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f17317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile long f17318d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final int[] f17324s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final d f17328w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final boolean f17329x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    final boolean f17330y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    final boolean f17331z;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile boolean f17319e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f17320f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map f17321g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f17322h = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final ki.b f17323r = new ki.b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Map f17325t = new ConcurrentHashMap();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final Set f17326u = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final ExecutorService f17327v = new cc.e(this);
    final ThreadLocal A = new ThreadLocal();
    final Object C = new Object();

    BoxStore(b bVar) {
        G = bVar.f17361i;
        H = bVar.f17362j;
        cc.d.b();
        this.f17315a = bVar.f17353a;
        File file = bVar.f17355c;
        this.f17316b = file;
        String strG = G(file);
        this.f17317c = strG;
        I0(strG);
        try {
            this.f17318d = nativeCreateWithFlatOptions(bVar.c(strG), bVar.f17354b);
            if (this.f17318d == 0) {
                throw new DbException("Could not create native store");
            }
            int i10 = bVar.f17363k;
            if (i10 != 0) {
                this.f17329x = (i10 & 1) != 0;
                this.f17330y = (i10 & 2) != 0;
            } else {
                this.f17330y = false;
                this.f17329x = false;
            }
            this.f17331z = bVar.f17364l;
            for (yb.b bVar2 : bVar.f17375w) {
                try {
                    this.f17320f.put(bVar2.E(), bVar2.J());
                    int iNativeRegisterEntityClass = nativeRegisterEntityClass(this.f17318d, bVar2.J(), bVar2.E());
                    this.f17321g.put(bVar2.E(), Integer.valueOf(iNativeRegisterEntityClass));
                    this.f17323r.c(iNativeRegisterEntityClass, bVar2.E());
                    this.f17322h.put(bVar2.E(), bVar2);
                    for (e eVar : bVar2.B()) {
                        if (eVar.f17391s != null) {
                            if (eVar.f17390r == null) {
                                throw new RuntimeException("No converter class for custom type of " + eVar);
                            }
                            nativeRegisterCustomType(this.f17318d, iNativeRegisterEntityClass, 0, eVar.f17389h, eVar.f17390r, eVar.f17391s);
                        }
                    }
                } catch (RuntimeException e10) {
                    throw new RuntimeException("Could not setup up entity " + bVar2.E(), e10);
                }
            }
            int iE = this.f17323r.e();
            this.f17324s = new int[iE];
            long[] jArrB = this.f17323r.b();
            for (int i11 = 0; i11 < iE; i11++) {
                this.f17324s[i11] = (int) jArrB[i11];
            }
            this.f17328w = new d(this);
            this.F = Math.max(bVar.f17368p, 1);
        } catch (RuntimeException e11) {
            close();
            throw e11;
        }
    }

    static boolean A0(String str, boolean z10) {
        boolean zContains;
        synchronized (I) {
            int i10 = 0;
            while (i10 < 5) {
                try {
                    Set set = I;
                    if (!set.contains(str)) {
                        break;
                    }
                    i10++;
                    System.gc();
                    if (z10 && i10 > 1) {
                        System.runFinalization();
                    }
                    System.gc();
                    if (z10 && i10 > 1) {
                        System.runFinalization();
                    }
                    try {
                        set.wait(100L);
                    } catch (InterruptedException unused) {
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            zContains = I.contains(str);
        }
        return zContains;
    }

    private boolean D0(Thread thread) {
        if (thread.getName().startsWith(cc.e.f4536b)) {
            return true;
        }
        for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
            if (stackTraceElement.getClassName().contains("objectbox")) {
                return true;
            }
        }
        return false;
    }

    static String G(File file) {
        if (file.getPath().startsWith("memory:")) {
            return file.getPath();
        }
        if (file.exists()) {
            if (!file.isDirectory()) {
                throw new DbException("Is not a directory: " + file.getAbsolutePath());
            }
        } else if (!file.mkdirs()) {
            throw new DbException("Could not create directory: " + file.getAbsolutePath());
        }
        try {
            return file.getCanonicalPath();
        } catch (IOException e10) {
            throw new DbException("Could not verify dir", e10);
        }
    }

    public static synchronized Object H() {
        return G;
    }

    static void I0(String str) {
        z0(str);
        Set set = I;
        synchronized (set) {
            try {
                if (!set.add(str)) {
                    throw new DbException("Another BoxStore is still open for this directory (" + str + "). Make sure the existing instance is explicitly closed before creating a new one.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static /* synthetic */ void a(String str) {
        A0(str, true);
        J = null;
    }

    private PrintStream h0() {
        return this.f17315a;
    }

    static native long nativeBeginReadTx(long j10);

    static native long nativeBeginTx(long j10);

    static native int nativeCleanStaleReadTransactions(long j10);

    static native long nativeCreateWithFlatOptions(byte[] bArr, byte[] bArr2);

    static native void nativeDelete(long j10);

    static native String nativeDiagnose(long j10);

    static native void nativeRegisterCustomType(long j10, int i10, int i11, String str, Class<? extends PropertyConverter> cls, Class<?> cls2);

    static native int nativeRegisterEntityClass(long j10, String str, Class<?> cls);

    private native boolean nativeStopObjectBrowser(long j10);

    private void q() {
        if (isClosed()) {
            throw new IllegalStateException("Store is closed");
        }
    }

    private void r() {
        try {
            if (y0().awaitTermination(1L, TimeUnit.SECONDS)) {
                return;
            }
            h0().println("ObjectBox thread pool not terminated in time. Ensure all async calls have completed and subscriptions are cancelled before closing the Store.\nDumping stack traces of threads on the pool and any using ObjectBox APIs:\n=== BEGIN OF DUMP ===");
            Thread[] threadArr = new Thread[Thread.activeCount()];
            int iEnumerate = Thread.enumerate(threadArr);
            for (int i10 = 0; i10 < iEnumerate; i10++) {
                Thread thread = threadArr[i10];
                if (D0(thread)) {
                    h0().println("Thread: " + thread.getName());
                    for (StackTraceElement stackTraceElement : thread.getStackTrace()) {
                        h0().println("\tat " + stackTraceElement);
                    }
                }
            }
            h0().println("=== END OF DUMP ===");
        } catch (InterruptedException e10) {
            e10.printStackTrace(h0());
        }
    }

    private PrintStream t0() {
        return System.out;
    }

    public static synchronized Object u0() {
        return H;
    }

    private boolean v0() {
        Iterator it = this.f17326u.iterator();
        while (it.hasNext()) {
            if (((Transaction) it.next()).q()) {
                return true;
            }
        }
        return false;
    }

    static boolean z0(final String str) {
        boolean zContains;
        Set set = I;
        synchronized (set) {
            try {
                if (!set.contains(str)) {
                    return false;
                }
                Thread thread = J;
                if (thread != null && thread.isAlive()) {
                    return A0(str, false);
                }
                Thread thread2 = new Thread(new Runnable() { // from class: yb.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        BoxStore.a(str);
                    }
                });
                thread2.setDaemon(true);
                J = thread2;
                thread2.start();
                try {
                    thread2.join(500L);
                } catch (InterruptedException e10) {
                    e10.printStackTrace();
                }
                Set set2 = I;
                synchronized (set2) {
                    zContains = set2.contains(str);
                }
                return zContains;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean B0() {
        return this.f17318d == 0;
    }

    public boolean C0() {
        return this.f17319e;
    }

    public synchronized boolean E0() {
        if (this.E == 0) {
            throw new IllegalStateException("ObjectBrowser has not been started before");
        }
        this.E = 0;
        return nativeStopObjectBrowser(p0());
    }

    public k F0(Class cls) {
        q();
        return new k(this.f17328w, cls);
    }

    void G0(Transaction transaction, int[] iArr) {
        synchronized (this.C) {
            try {
                this.D++;
                if (this.f17330y) {
                    PrintStream printStreamT0 = t0();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("TX committed. New commit count: ");
                    sb2.append(this.D);
                    sb2.append(", entity types affected: ");
                    sb2.append(iArr != null ? iArr.length : 0);
                    printStreamT0.println(sb2.toString());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Iterator it = this.f17325t.values().iterator();
        while (it.hasNext()) {
            ((a) it.next()).y(transaction);
        }
        if (iArr != null) {
            this.f17328w.e(iArr);
        }
    }

    public void H0(Transaction transaction) {
        synchronized (this.f17326u) {
            try {
                this.f17326u.remove(transaction);
                if (!v0()) {
                    this.f17326u.notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    String S(Class cls) {
        return (String) this.f17320f.get(cls);
    }

    Class T(int i10) {
        Class cls = (Class) this.f17323r.a(i10);
        if (cls != null) {
            return cls;
        }
        throw new DbSchemaException("No entity registered for type ID " + i10);
    }

    yb.b W(Class cls) {
        return (yb.b) this.f17322h.get(cls);
    }

    public int X(Class cls) {
        Integer num = (Integer) this.f17321g.get(cls);
        if (num != null) {
            return num.intValue();
        }
        throw new DbSchemaException("No entity registered for " + cls);
    }

    public Transaction c() {
        int i10 = this.D;
        if (this.f17329x) {
            t0().println("Begin read TX with commit count " + i10);
        }
        long jNativeBeginReadTx = nativeBeginReadTx(p0());
        if (jNativeBeginReadTx == 0) {
            throw new DbException("Could not create native read transaction");
        }
        Transaction transaction = new Transaction(this, jNativeBeginReadTx, i10);
        synchronized (this.f17326u) {
            this.f17326u.add(transaction);
        }
        return transaction;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        boolean z10;
        ArrayList arrayList;
        synchronized (this) {
            try {
                z10 = this.B;
                if (!this.B) {
                    if (this.E != 0) {
                        try {
                            E0();
                        } catch (Throwable th2) {
                            th2.printStackTrace();
                        }
                    }
                    this.B = true;
                    y0().shutdown();
                    r();
                    synchronized (this.f17326u) {
                        if (v0()) {
                            t0().println("Briefly waiting for active transactions before closing the Store...");
                            try {
                                this.f17326u.wait(1000L);
                            } catch (InterruptedException unused) {
                            }
                            if (v0()) {
                                h0().println("Transactions are still active: ensure that all database operations are finished before closing the Store!");
                            }
                        }
                        arrayList = new ArrayList(this.f17326u);
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((Transaction) it.next()).close();
                    }
                    long j10 = this.f17318d;
                    this.f17318d = 0L;
                    if (j10 != 0) {
                        nativeDelete(j10);
                        this.f17319e = true;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (z10) {
            return;
        }
        Set set = I;
        synchronized (set) {
            set.remove(this.f17317c);
            set.notifyAll();
        }
    }

    public Transaction e() {
        int i10 = this.D;
        if (this.f17330y) {
            t0().println("Begin TX with commit count " + i10);
        }
        long jNativeBeginTx = nativeBeginTx(p0());
        if (jNativeBeginTx == 0) {
            throw new DbException("Could not create native transaction");
        }
        Transaction transaction = new Transaction(this, jNativeBeginTx, i10);
        synchronized (this.f17326u) {
            this.f17326u.add(transaction);
        }
        return transaction;
    }

    protected void finalize() throws Throwable {
        close();
        super.finalize();
    }

    public boolean isClosed() {
        return this.B;
    }

    public a k(Class cls) {
        a aVar;
        a aVar2 = (a) this.f17325t.get(cls);
        if (aVar2 != null) {
            return aVar2;
        }
        if (!this.f17320f.containsKey(cls)) {
            throw new IllegalArgumentException(cls + " is not a known entity. Please add it and trigger generation again.");
        }
        synchronized (this.f17325t) {
            try {
                aVar = (a) this.f17325t.get(cls);
                if (aVar == null) {
                    aVar = new a(this, cls);
                    this.f17325t.put(cls, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public Object l(Callable callable) {
        if (((Transaction) this.A.get()) != null) {
            try {
                return callable.call();
            } catch (Exception e10) {
                throw new RuntimeException("Callable threw exception", e10);
            }
        }
        Transaction transactionC = c();
        this.A.set(transactionC);
        try {
            try {
                return callable.call();
            } catch (RuntimeException e11) {
                throw e11;
            } catch (Exception e12) {
                throw new RuntimeException("Callable threw exception", e12);
            }
        } finally {
            this.A.remove();
            Iterator it = this.f17325t.values().iterator();
            while (it.hasNext()) {
                ((a) it.next()).r(transactionC);
            }
            transactionC.close();
        }
    }

    public Object n(Callable callable, int i10, int i11, boolean z10) {
        if (i10 == 1) {
            return l(callable);
        }
        if (i10 < 1) {
            throw new IllegalArgumentException("Illegal value of attempts: " + i10);
        }
        long j10 = i11;
        DbException e10 = null;
        for (int i12 = 1; i12 <= i10; i12++) {
            try {
                return l(callable);
            } catch (DbException e11) {
                e10 = e11;
                String strW = w();
                String str = i12 + " of " + i10 + " attempts of calling a read TX failed:";
                if (z10) {
                    h0().println(str);
                    e10.printStackTrace();
                    h0().println(strW);
                    h0().flush();
                    System.gc();
                    System.runFinalization();
                    s();
                }
                try {
                    Thread.sleep(j10);
                    j10 *= 2;
                } catch (InterruptedException e12) {
                    e12.printStackTrace();
                    throw e10;
                }
            }
        }
        throw e10;
    }

    public long p0() {
        q();
        return this.f17318d;
    }

    public int s() {
        return nativeCleanStaleReadTransactions(p0());
    }

    public void v() {
        Iterator it = this.f17325t.values().iterator();
        while (it.hasNext()) {
            ((a) it.next()).a();
        }
    }

    public String w() {
        return nativeDiagnose(p0());
    }

    public int w0() {
        return this.F;
    }

    int[] x() {
        return this.f17324s;
    }

    public Future x0(Runnable runnable) {
        return y0().submit(runnable);
    }

    ExecutorService y0() {
        return this.f17327v;
    }
}
