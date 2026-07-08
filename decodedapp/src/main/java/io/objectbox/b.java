package io.objectbox;

import java.io.File;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final byte[] f17354b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    File f17355c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private File f17356d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f17357e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f17358f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    long f17360h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Object f17361i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Object f17362j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f17363k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f17364l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f17365m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f17366n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f17367o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f17368p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    boolean f17369q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    boolean f17370r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    boolean f17371s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    short f17372t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    long f17373u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    short f17374v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    PrintStream f17353a = System.err;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f17359g = 1048576;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final List f17375w = new ArrayList();

    public b(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Model may not be null");
        }
        this.f17354b = Arrays.copyOf(bArr, bArr.length);
    }

    private void d() {
    }

    private static String e(String str) {
        return str != null ? str : "objectbox";
    }

    static File g(Object obj) {
        return new File(h(obj), "objectbox");
    }

    private static File h(Object obj) {
        try {
            Method method = obj.getClass().getMethod("getFilesDir", null);
            File file = (File) method.invoke(obj, null);
            if (file == null) {
                System.err.println("getFilesDir() returned null - retrying once...");
                file = (File) method.invoke(obj, null);
            }
            if (file == null) {
                throw new IllegalStateException("Android files dir is null");
            }
            if (file.exists()) {
                return file;
            }
            throw new IllegalStateException("Android files dir does not exist");
        } catch (Exception e10) {
            throw new RuntimeException("Could not init with given Android context (must be sub class of android.content.Context)", e10);
        }
    }

    private Object i(Object obj) {
        try {
            return obj.getClass().getMethod("getApplicationContext", null).invoke(obj, null);
        } catch (Exception e10) {
            throw new RuntimeException("context must be a valid Android Context", e10);
        }
    }

    static File j(File file, String str) {
        String strE = e(str);
        return file != null ? new File(file, strE) : new File(strE);
    }

    public b a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Context may not be null");
        }
        this.f17361i = i(obj);
        return this;
    }

    public BoxStore b() {
        Object obj;
        if (this.f17358f != null) {
            this.f17355c = new File("memory:" + this.f17358f);
        }
        if (this.f17355c == null && this.f17356d == null && (obj = this.f17361i) != null) {
            File fileG = g(obj);
            if (!fileG.exists()) {
                fileG.mkdir();
                if (!fileG.exists()) {
                    throw new RuntimeException("Could not init Android base dir at " + fileG.getAbsolutePath());
                }
            }
            if (!fileG.isDirectory()) {
                throw new RuntimeException("Android base dir is not a dir: " + fileG.getAbsolutePath());
            }
            this.f17356d = fileG;
        }
        if (this.f17355c == null) {
            this.f17355c = j(this.f17356d, this.f17357e);
        }
        if (this.f17358f == null) {
            d();
        }
        return new BoxStore(this);
    }

    byte[] c(String str) {
        bc.b bVar = new bc.b();
        bVar.u(true);
        int iN = bVar.n(str);
        ac.a.o(bVar);
        ac.a.b(bVar, iN);
        ac.a.e(bVar, this.f17359g);
        ac.a.c(bVar, this.f17365m);
        ac.a.f(bVar, this.f17366n);
        short s10 = this.f17372t;
        if (s10 != 0) {
            ac.a.m(bVar, s10);
            long j10 = this.f17373u;
            if (j10 != 0) {
                ac.a.l(bVar, j10);
            }
        }
        short s11 = this.f17374v;
        if (s11 != 0) {
            ac.a.k(bVar, s11);
        }
        if (this.f17369q) {
            ac.a.i(bVar, true);
        }
        if (this.f17371s) {
            ac.a.j(bVar, true);
        }
        if (this.f17370r) {
            ac.a.h(bVar, true);
        }
        if (this.f17367o) {
            ac.a.g(bVar, true);
        }
        int i10 = this.f17363k;
        if (i10 != 0) {
            ac.a.a(bVar, i10);
        }
        long j11 = this.f17360h;
        if (j11 > 0) {
            ac.a.d(bVar, j11);
        }
        bVar.r(ac.a.n(bVar));
        return bVar.F();
    }

    public void f(yb.b bVar) {
        this.f17375w.add(bVar);
    }
}
