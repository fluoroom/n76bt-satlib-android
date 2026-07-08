package g2;

import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f13383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f13384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f13385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f13386d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f13387e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f13388f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f13389g;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Writer f13391r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f13393t;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f13390h = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final LinkedHashMap f13392s = new LinkedHashMap(0, 0.75f, true);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f13394u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ThreadPoolExecutor f13395v = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new b(null));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Callable f13396w = new CallableC0193a();

    /* JADX INFO: renamed from: g2.a$a, reason: collision with other inner class name */
    class CallableC0193a implements Callable {
        CallableC0193a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            synchronized (a.this) {
                try {
                    if (a.this.f13391r == null) {
                        return null;
                    }
                    a.this.y0();
                    if (a.this.X()) {
                        a.this.v0();
                        a.this.f13393t = 0;
                    }
                    return null;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private static final class b implements ThreadFactory {
        private b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        /* synthetic */ b(CallableC0193a callableC0193a) {
            this();
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f13398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f13399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f13400c;

        /* synthetic */ c(a aVar, d dVar, CallableC0193a callableC0193a) {
            this(dVar);
        }

        public void a() {
            a.this.w(this, false);
        }

        public void b() {
            if (this.f13400c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() {
            a.this.w(this, true);
            this.f13400c = true;
        }

        public File f(int i10) {
            File fileK;
            synchronized (a.this) {
                try {
                    if (this.f13398a.f13407f != this) {
                        throw new IllegalStateException();
                    }
                    if (!this.f13398a.f13406e) {
                        this.f13399b[i10] = true;
                    }
                    fileK = this.f13398a.k(i10);
                    a.this.f13383a.mkdirs();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return fileK;
        }

        private c(d dVar) {
            this.f13398a = dVar;
            this.f13399b = dVar.f13406e ? null : new boolean[a.this.f13389g];
        }
    }

    private final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f13402a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f13403b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File[] f13404c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        File[] f13405d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f13406e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f13407f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f13408g;

        /* synthetic */ d(a aVar, String str, CallableC0193a callableC0193a) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != a.this.f13389g) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f13403b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i10) {
            return this.f13404c[i10];
        }

        public File k(int i10) {
            return this.f13405d[i10];
        }

        public String l() {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f13403b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }

        private d(String str) {
            this.f13402a = str;
            this.f13403b = new long[a.this.f13389g];
            this.f13404c = new File[a.this.f13389g];
            this.f13405d = new File[a.this.f13389g];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            for (int i10 = 0; i10 < a.this.f13389g; i10++) {
                sb2.append(i10);
                this.f13404c[i10] = new File(a.this.f13383a, sb2.toString());
                sb2.append(".tmp");
                this.f13405d[i10] = new File(a.this.f13383a, sb2.toString());
                sb2.setLength(length);
            }
        }
    }

    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f13410a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f13411b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f13412c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File[] f13413d;

        /* synthetic */ e(a aVar, String str, long j10, File[] fileArr, long[] jArr, CallableC0193a callableC0193a) {
            this(str, j10, fileArr, jArr);
        }

        public File a(int i10) {
            return this.f13413d[i10];
        }

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f13410a = str;
            this.f13411b = j10;
            this.f13413d = fileArr;
            this.f13412c = jArr;
        }
    }

    private a(File file, int i10, int i11, long j10) {
        this.f13383a = file;
        this.f13387e = i10;
        this.f13384b = new File(file, "journal");
        this.f13385c = new File(file, "journal.tmp");
        this.f13386d = new File(file, "journal.bkp");
        this.f13389g = i11;
        this.f13388f = j10;
    }

    private static void G(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    private synchronized c S(String str, long j10) {
        s();
        d dVar = (d) this.f13392s.get(str);
        CallableC0193a callableC0193a = null;
        if (j10 != -1 && (dVar == null || dVar.f13408g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, callableC0193a);
            this.f13392s.put(str, dVar);
        } else if (dVar.f13407f != null) {
            return null;
        }
        c cVar = new c(this, dVar, callableC0193a);
        dVar.f13407f = cVar;
        this.f13391r.append((CharSequence) "DIRTY");
        this.f13391r.append(' ');
        this.f13391r.append((CharSequence) str);
        this.f13391r.append('\n');
        T(this.f13391r);
        return cVar;
    }

    private static void T(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean X() {
        int i10 = this.f13393t;
        return i10 >= 2000 && i10 >= this.f13392s.size();
    }

    public static a h0(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                x0(file2, file3, false);
            }
        }
        a aVar = new a(file, i10, i11, j10);
        if (aVar.f13384b.exists()) {
            try {
                aVar.t0();
                aVar.p0();
                return aVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                aVar.x();
            }
        }
        file.mkdirs();
        a aVar2 = new a(file, i10, i11, j10);
        aVar2.v0();
        return aVar2;
    }

    private void p0() throws IOException {
        G(this.f13385c);
        Iterator it = this.f13392s.values().iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            int i10 = 0;
            if (dVar.f13407f == null) {
                while (i10 < this.f13389g) {
                    this.f13390h += dVar.f13403b[i10];
                    i10++;
                }
            } else {
                dVar.f13407f = null;
                while (i10 < this.f13389g) {
                    G(dVar.j(i10));
                    G(dVar.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void s() {
        if (this.f13391r == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    private void t0() {
        g2.b bVar = new g2.b(new FileInputStream(this.f13384b), g2.c.f13421a);
        try {
            String strK = bVar.k();
            String strK2 = bVar.k();
            String strK3 = bVar.k();
            String strK4 = bVar.k();
            String strK5 = bVar.k();
            if (!"libcore.io.DiskLruCache".equals(strK) || !"1".equals(strK2) || !Integer.toString(this.f13387e).equals(strK3) || !Integer.toString(this.f13389g).equals(strK4) || !"".equals(strK5)) {
                throw new IOException("unexpected journal header: [" + strK + ", " + strK2 + ", " + strK4 + ", " + strK5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    u0(bVar.k());
                    i10++;
                } catch (EOFException unused) {
                    this.f13393t = i10 - this.f13392s.size();
                    if (bVar.e()) {
                        v0();
                    } else {
                        this.f13391r = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13384b, true), g2.c.f13421a));
                    }
                    g2.c.a(bVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            g2.c.a(bVar);
            throw th2;
        }
    }

    private void u0(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith("REMOVE")) {
                this.f13392s.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = (d) this.f13392s.get(strSubstring);
        CallableC0193a callableC0193a = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, callableC0193a);
            this.f13392s.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith("CLEAN")) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f13406e = true;
            dVar.f13407f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith("DIRTY")) {
            dVar.f13407f = new c(this, dVar, callableC0193a);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith("READ")) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    private static void v(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void v0() {
        try {
            Writer writer = this.f13391r;
            if (writer != null) {
                v(writer);
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13385c), g2.c.f13421a));
            try {
                bufferedWriter.write("libcore.io.DiskLruCache");
                bufferedWriter.write("\n");
                bufferedWriter.write("1");
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f13387e));
                bufferedWriter.write("\n");
                bufferedWriter.write(Integer.toString(this.f13389g));
                bufferedWriter.write("\n");
                bufferedWriter.write("\n");
                for (d dVar : this.f13392s.values()) {
                    if (dVar.f13407f != null) {
                        bufferedWriter.write("DIRTY " + dVar.f13402a + '\n');
                    } else {
                        bufferedWriter.write("CLEAN " + dVar.f13402a + dVar.l() + '\n');
                    }
                }
                v(bufferedWriter);
                if (this.f13384b.exists()) {
                    x0(this.f13384b, this.f13386d, true);
                }
                x0(this.f13385c, this.f13384b, false);
                this.f13386d.delete();
                this.f13391r = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f13384b, true), g2.c.f13421a));
            } catch (Throwable th2) {
                v(bufferedWriter);
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void w(c cVar, boolean z10) {
        d dVar = cVar.f13398a;
        if (dVar.f13407f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f13406e) {
            for (int i10 = 0; i10 < this.f13389g; i10++) {
                if (!cVar.f13399b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f13389g; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                G(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f13403b[i11];
                long length = fileJ.length();
                dVar.f13403b[i11] = length;
                this.f13390h = (this.f13390h - j10) + length;
            }
        }
        this.f13393t++;
        dVar.f13407f = null;
        if (dVar.f13406e || z10) {
            dVar.f13406e = true;
            this.f13391r.append((CharSequence) "CLEAN");
            this.f13391r.append(' ');
            this.f13391r.append((CharSequence) dVar.f13402a);
            this.f13391r.append((CharSequence) dVar.l());
            this.f13391r.append('\n');
            if (z10) {
                long j11 = this.f13394u;
                this.f13394u = 1 + j11;
                dVar.f13408g = j11;
            }
        } else {
            this.f13392s.remove(dVar.f13402a);
            this.f13391r.append((CharSequence) "REMOVE");
            this.f13391r.append(' ');
            this.f13391r.append((CharSequence) dVar.f13402a);
            this.f13391r.append('\n');
        }
        T(this.f13391r);
        if (this.f13390h > this.f13388f || X()) {
            this.f13395v.submit(this.f13396w);
        }
    }

    private static void x0(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            G(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0() {
        while (this.f13390h > this.f13388f) {
            w0((String) ((Map.Entry) this.f13392s.entrySet().iterator().next()).getKey());
        }
    }

    public c H(String str) {
        return S(str, -1L);
    }

    public synchronized e W(String str) throws Throwable {
        Throwable th2;
        try {
            try {
                s();
                d dVar = (d) this.f13392s.get(str);
                if (dVar == null) {
                    return null;
                }
                if (!dVar.f13406e) {
                    return null;
                }
                for (File file : dVar.f13404c) {
                    try {
                        if (!file.exists()) {
                            return null;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                }
                this.f13393t++;
                this.f13391r.append((CharSequence) "READ");
                this.f13391r.append(' ');
                this.f13391r.append((CharSequence) str);
                this.f13391r.append('\n');
                if (X()) {
                    this.f13395v.submit(this.f13396w);
                }
                return new e(this, str, dVar.f13408g, dVar.f13404c, dVar.f13403b, null);
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th2 = th;
        throw th2;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        try {
            if (this.f13391r == null) {
                return;
            }
            for (d dVar : new ArrayList(this.f13392s.values())) {
                if (dVar.f13407f != null) {
                    dVar.f13407f.a();
                }
            }
            y0();
            v(this.f13391r);
            this.f13391r = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean w0(String str) {
        try {
            s();
            d dVar = (d) this.f13392s.get(str);
            if (dVar != null && dVar.f13407f == null) {
                for (int i10 = 0; i10 < this.f13389g; i10++) {
                    File fileJ = dVar.j(i10);
                    if (fileJ.exists() && !fileJ.delete()) {
                        throw new IOException("failed to delete " + fileJ);
                    }
                    this.f13390h -= dVar.f13403b[i10];
                    dVar.f13403b[i10] = 0;
                }
                this.f13393t++;
                this.f13391r.append((CharSequence) "REMOVE");
                this.f13391r.append(' ');
                this.f13391r.append((CharSequence) str);
                this.f13391r.append('\n');
                this.f13392s.remove(str);
                if (X()) {
                    this.f13395v.submit(this.f13396w);
                }
                return true;
            }
            return false;
        } finally {
        }
    }

    public void x() throws IOException {
        close();
        g2.c.b(this.f13383a);
    }
}
