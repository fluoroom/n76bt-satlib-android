package hh;

import dd.d0;
import fh.p;
import hh.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.Flushable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import qd.l;
import rd.m;
import rg.o;
import rg.q;
import vh.e0;
import vh.k;
import vh.l0;
import vh.n;
import vh.n0;
import vh.z;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements Closeable, Flushable {
    public static final a E = new a(null);
    public static final String F = "journal";
    public static final String G = "journal.tmp";
    public static final String H = "journal.bkp";
    public static final String I = "libcore.io.DiskLruCache";
    public static final String J = "1";
    public static final long K = -1;
    public static final o L = new o("[a-z0-9_-]{1,120}");
    public static final String M = "CLEAN";
    public static final String N = "DIRTY";
    public static final String O = "REMOVE";
    public static final String P = "READ";
    private boolean A;
    private long B;
    private final ih.c C;
    private final e D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e0 f15380a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f15381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f15383d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f15384e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e0 f15385f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final e0 f15386g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e0 f15387h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f15388r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private vh.f f15389s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final LinkedHashMap f15390t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f15391u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f15392v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f15393w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f15394x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f15395y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f15396z;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f15397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f15398b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f15399c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f15400d;

        public b(f fVar, c cVar) {
            m.e(cVar, "entry");
            this.f15400d = fVar;
            this.f15397a = cVar;
            this.f15398b = cVar.g() ? null : new boolean[fVar.h0()];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d0 h(f fVar, b bVar, IOException iOException) {
            m.e(iOException, "it");
            synchronized (fVar) {
                bVar.d();
            }
            return d0.f10897a;
        }

        public final void b() {
            f fVar = this.f15400d;
            synchronized (fVar) {
                try {
                    if (this.f15399c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (m.a(this.f15397a.b(), this)) {
                        fVar.w(this, false);
                    }
                    this.f15399c = true;
                    d0 d0Var = d0.f10897a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void c() {
            f fVar = this.f15400d;
            synchronized (fVar) {
                try {
                    if (this.f15399c) {
                        throw new IllegalStateException("Check failed.");
                    }
                    if (m.a(this.f15397a.b(), this)) {
                        fVar.w(this, true);
                    }
                    this.f15399c = true;
                    d0 d0Var = d0.f10897a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final void d() {
            if (m.a(this.f15397a.b(), this)) {
                if (this.f15400d.f15393w) {
                    this.f15400d.w(this, false);
                } else {
                    this.f15397a.q(true);
                }
            }
        }

        public final c e() {
            return this.f15397a;
        }

        public final boolean[] f() {
            return this.f15398b;
        }

        public final l0 g(int i10) {
            final f fVar = this.f15400d;
            synchronized (fVar) {
                if (this.f15399c) {
                    throw new IllegalStateException("Check failed.");
                }
                if (!m.a(this.f15397a.b(), this)) {
                    return z.a();
                }
                if (!this.f15397a.g()) {
                    boolean[] zArr = this.f15398b;
                    m.b(zArr);
                    zArr[i10] = true;
                }
                try {
                    return new h(fVar.X().S((e0) this.f15397a.c().get(i10)), new l() { // from class: hh.g
                        @Override // qd.l
                        public final Object l(Object obj) {
                            return f.b.h(fVar, this, (IOException) obj);
                        }
                    });
                } catch (FileNotFoundException unused) {
                    return z.a();
                }
            }
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f15402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f15403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f15404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f15405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f15406f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private b f15407g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f15408h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private long f15409i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ f f15410j;

        public static final class a extends n {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private boolean f15411b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ f f15412c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ c f15413d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(n0 n0Var, f fVar, c cVar) {
                super(n0Var);
                this.f15412c = fVar;
                this.f15413d = cVar;
            }

            @Override // vh.n, vh.n0, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                super.close();
                if (this.f15411b) {
                    return;
                }
                this.f15411b = true;
                f fVar = this.f15412c;
                c cVar = this.f15413d;
                synchronized (fVar) {
                    try {
                        cVar.n(cVar.f() - 1);
                        if (cVar.f() == 0 && cVar.i()) {
                            fVar.B0(cVar);
                        }
                        d0 d0Var = d0.f10897a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }

        public c(f fVar, String str) {
            m.e(str, "key");
            this.f15410j = fVar;
            this.f15401a = str;
            this.f15402b = new long[fVar.h0()];
            this.f15403c = new ArrayList();
            this.f15404d = new ArrayList();
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append('.');
            int length = sb2.length();
            int iH0 = fVar.h0();
            for (int i10 = 0; i10 < iH0; i10++) {
                sb2.append(i10);
                List list = this.f15403c;
                e0 e0VarW = this.f15410j.W();
                String string = sb2.toString();
                m.d(string, "toString(...)");
                list.add(e0VarW.k(string));
                sb2.append(".tmp");
                List list2 = this.f15404d;
                e0 e0VarW2 = this.f15410j.W();
                String string2 = sb2.toString();
                m.d(string2, "toString(...)");
                list2.add(e0VarW2.k(string2));
                sb2.setLength(length);
            }
        }

        private final Void j(List list) throws IOException {
            throw new IOException("unexpected journal line: " + list);
        }

        private final n0 k(int i10) {
            n0 n0VarW = this.f15410j.X().W((e0) this.f15403c.get(i10));
            if (this.f15410j.f15393w) {
                return n0VarW;
            }
            this.f15408h++;
            return new a(n0VarW, this.f15410j, this);
        }

        public final List a() {
            return this.f15403c;
        }

        public final b b() {
            return this.f15407g;
        }

        public final List c() {
            return this.f15404d;
        }

        public final String d() {
            return this.f15401a;
        }

        public final long[] e() {
            return this.f15402b;
        }

        public final int f() {
            return this.f15408h;
        }

        public final boolean g() {
            return this.f15405e;
        }

        public final long h() {
            return this.f15409i;
        }

        public final boolean i() {
            return this.f15406f;
        }

        public final void l(b bVar) {
            this.f15407g = bVar;
        }

        public final void m(List list) throws IOException {
            m.e(list, "strings");
            if (list.size() != this.f15410j.h0()) {
                j(list);
                throw new dd.f();
            }
            try {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    this.f15402b[i10] = Long.parseLong((String) list.get(i10));
                }
            } catch (NumberFormatException unused) {
                j(list);
                throw new dd.f();
            }
        }

        public final void n(int i10) {
            this.f15408h = i10;
        }

        public final void o(boolean z10) {
            this.f15405e = z10;
        }

        public final void p(long j10) {
            this.f15409i = j10;
        }

        public final void q(boolean z10) {
            this.f15406f = z10;
        }

        public final d r() {
            f fVar = this.f15410j;
            if (p.f13109b && !Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
            }
            if (!this.f15405e) {
                return null;
            }
            if (!this.f15410j.f15393w && (this.f15407g != null || this.f15406f)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            long[] jArr = (long[]) this.f15402b.clone();
            try {
                int iH0 = this.f15410j.h0();
                for (int i10 = 0; i10 < iH0; i10++) {
                    arrayList.add(k(i10));
                }
                return new d(this.f15410j, this.f15401a, this.f15409i, arrayList, jArr);
            } catch (FileNotFoundException unused) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fh.m.f((n0) it.next());
                }
                try {
                    this.f15410j.B0(this);
                } catch (IOException unused2) {
                }
                return null;
            }
        }

        public final void s(vh.f fVar) {
            m.e(fVar, "writer");
            for (long j10 : this.f15402b) {
                fVar.writeByte(32).n0(j10);
            }
        }
    }

    public final class d implements Closeable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f15414a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f15415b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f15416c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long[] f15417d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ f f15418e;

        public d(f fVar, String str, long j10, List list, long[] jArr) {
            m.e(str, "key");
            m.e(list, "sources");
            m.e(jArr, "lengths");
            this.f15418e = fVar;
            this.f15414a = str;
            this.f15415b = j10;
            this.f15416c = list;
            this.f15417d = jArr;
        }

        public final b a() {
            return this.f15418e.G(this.f15414a, this.f15415b);
        }

        public final n0 c(int i10) {
            return (n0) this.f15416c.get(i10);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            Iterator it = this.f15416c.iterator();
            while (it.hasNext()) {
                fh.m.f((n0) it.next());
            }
        }
    }

    public static final class e extends ih.a {
        e(String str) {
            super(str, false, 2, null);
        }

        @Override // ih.a
        public long f() {
            f fVar = f.this;
            synchronized (fVar) {
                if (!fVar.f15394x || fVar.T()) {
                    return -1L;
                }
                try {
                    fVar.D0();
                } catch (IOException unused) {
                    fVar.f15396z = true;
                }
                try {
                    if (fVar.t0()) {
                        fVar.z0();
                        fVar.f15391u = 0;
                    }
                } catch (IOException unused2) {
                    fVar.A = true;
                    vh.f fVar2 = fVar.f15389s;
                    if (fVar2 != null) {
                        fh.m.f(fVar2);
                    }
                    fVar.f15389s = z.b(z.a());
                }
                return -1L;
            }
        }
    }

    /* JADX INFO: renamed from: hh.f$f, reason: collision with other inner class name */
    public static final class C0217f extends vh.l {
        C0217f(k kVar) {
            super(kVar);
        }

        @Override // vh.l, vh.k
        public l0 T(e0 e0Var, boolean z10) {
            m.e(e0Var, "file");
            e0 e0VarI = e0Var.i();
            if (e0VarI != null) {
                k(e0VarI);
            }
            return super.T(e0Var, z10);
        }
    }

    public f(k kVar, e0 e0Var, int i10, int i11, long j10, ih.d dVar) {
        m.e(kVar, "fileSystem");
        m.e(e0Var, "directory");
        m.e(dVar, "taskRunner");
        this.f15380a = e0Var;
        this.f15381b = i10;
        this.f15382c = i11;
        this.f15383d = new C0217f(kVar);
        this.f15384e = j10;
        this.f15390t = new LinkedHashMap(0, 0.75f, true);
        this.C = dVar.k();
        this.D = new e(p.f13110c + " Cache");
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        this.f15385f = e0Var.k(F);
        this.f15386g = e0Var.k(G);
        this.f15387h = e0Var.k(H);
    }

    private final boolean C0() {
        for (Object obj : this.f15390t.values()) {
            m.d(obj, "next(...)");
            c cVar = (c) obj;
            if (!cVar.i()) {
                B0(cVar);
                return true;
            }
        }
        return false;
    }

    private final void E0(String str) {
        if (L.c(str)) {
            return;
        }
        throw new IllegalArgumentException(("keys must match regex [a-z0-9_-]{1,120}: \"" + str + '\"').toString());
    }

    public static /* synthetic */ b H(f fVar, String str, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = K;
        }
        return fVar.G(str, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t0() {
        int i10 = this.f15391u;
        return i10 >= 2000 && i10 >= this.f15390t.size();
    }

    private final vh.f u0() {
        return z.b(new h(this.f15383d.a(this.f15385f), new l() { // from class: hh.e
            @Override // qd.l
            public final Object l(Object obj) {
                return f.v0(this.f15379a, (IOException) obj);
            }
        }));
    }

    private final synchronized void v() {
        if (this.f15395y) {
            throw new IllegalStateException("cache is closed");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0 v0(f fVar, IOException iOException) {
        m.e(iOException, "it");
        if (!p.f13109b || Thread.holdsLock(fVar)) {
            fVar.f15392v = true;
            return d0.f10897a;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
    }

    private final void w0() {
        fh.m.i(this.f15383d, this.f15386g);
        Iterator it = this.f15390t.values().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            m.d(next, "next(...)");
            c cVar = (c) next;
            int i10 = 0;
            if (cVar.b() == null) {
                int i11 = this.f15382c;
                while (i10 < i11) {
                    this.f15388r += cVar.e()[i10];
                    i10++;
                }
            } else {
                cVar.l(null);
                int i12 = this.f15382c;
                while (i10 < i12) {
                    fh.m.i(this.f15383d, (e0) cVar.a().get(i10));
                    fh.m.i(this.f15383d, (e0) cVar.c().get(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private final void x0() throws Throwable {
        vh.g gVarC = z.c(this.f15383d.W(this.f15385f));
        try {
            String strU = gVarC.U();
            String strU2 = gVarC.U();
            String strU3 = gVarC.U();
            String strU4 = gVarC.U();
            String strU5 = gVarC.U();
            if (!m.a(I, strU) || !m.a(J, strU2) || !m.a(String.valueOf(this.f15381b), strU3) || !m.a(String.valueOf(this.f15382c), strU4) || strU5.length() > 0) {
                throw new IOException("unexpected journal header: [" + strU + ", " + strU2 + ", " + strU4 + ", " + strU5 + ']');
            }
            int i10 = 0;
            while (true) {
                try {
                    y0(gVarC.U());
                    i10++;
                } catch (EOFException unused) {
                    this.f15391u = i10 - this.f15390t.size();
                    if (gVarC.z()) {
                        vh.f fVar = this.f15389s;
                        if (fVar != null) {
                            fh.m.f(fVar);
                        }
                        this.f15389s = u0();
                    } else {
                        z0();
                    }
                    d0 d0Var = d0.f10897a;
                    if (gVarC != null) {
                        try {
                            gVarC.close();
                            th = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        th = null;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            if (gVarC != null) {
                try {
                    gVarC.close();
                } catch (Throwable th4) {
                    dd.b.a(th, th4);
                }
            }
        }
        if (th != null) {
            throw th;
        }
    }

    private final void y0(String str) throws IOException {
        String strSubstring;
        int iB0 = q.b0(str, ' ', 0, false, 6, null);
        if (iB0 == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iB0 + 1;
        int iB02 = q.b0(str, ' ', i10, false, 4, null);
        if (iB02 == -1) {
            strSubstring = str.substring(i10);
            m.d(strSubstring, "substring(...)");
            String str2 = O;
            if (iB0 == str2.length() && q.J(str, str2, false, 2, null)) {
                this.f15390t.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iB02);
            m.d(strSubstring, "substring(...)");
        }
        c cVar = (c) this.f15390t.get(strSubstring);
        if (cVar == null) {
            cVar = new c(this, strSubstring);
            this.f15390t.put(strSubstring, cVar);
        }
        if (iB02 != -1) {
            String str3 = M;
            if (iB0 == str3.length() && q.J(str, str3, false, 2, null)) {
                String strSubstring2 = str.substring(iB02 + 1);
                m.d(strSubstring2, "substring(...)");
                List listB0 = q.B0(strSubstring2, new char[]{' '}, false, 0, 6, null);
                cVar.o(true);
                cVar.l(null);
                cVar.m(listB0);
                return;
            }
        }
        if (iB02 == -1) {
            String str4 = N;
            if (iB0 == str4.length() && q.J(str, str4, false, 2, null)) {
                cVar.l(new b(this, cVar));
                return;
            }
        }
        if (iB02 == -1) {
            String str5 = P;
            if (iB0 == str5.length() && q.J(str, str5, false, 2, null)) {
                return;
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public final synchronized boolean A0(String str) {
        m.e(str, "key");
        p0();
        v();
        E0(str);
        c cVar = (c) this.f15390t.get(str);
        if (cVar == null) {
            return false;
        }
        boolean zB0 = B0(cVar);
        if (zB0 && this.f15388r <= this.f15384e) {
            this.f15396z = false;
        }
        return zB0;
    }

    public final boolean B0(c cVar) {
        vh.f fVar;
        m.e(cVar, "entry");
        if (!this.f15393w) {
            if (cVar.f() > 0 && (fVar = this.f15389s) != null) {
                fVar.J(N);
                fVar.writeByte(32);
                fVar.J(cVar.d());
                fVar.writeByte(10);
                fVar.flush();
            }
            if (cVar.f() > 0 || cVar.b() != null) {
                cVar.q(true);
                return true;
            }
        }
        b bVarB = cVar.b();
        if (bVarB != null) {
            bVarB.d();
        }
        int i10 = this.f15382c;
        for (int i11 = 0; i11 < i10; i11++) {
            fh.m.i(this.f15383d, (e0) cVar.a().get(i11));
            this.f15388r -= cVar.e()[i11];
            cVar.e()[i11] = 0;
        }
        this.f15391u++;
        vh.f fVar2 = this.f15389s;
        if (fVar2 != null) {
            fVar2.J(O);
            fVar2.writeByte(32);
            fVar2.J(cVar.d());
            fVar2.writeByte(10);
        }
        this.f15390t.remove(cVar.d());
        if (t0()) {
            ih.c.m(this.C, this.D, 0L, 2, null);
        }
        return true;
    }

    public final void D0() {
        while (this.f15388r > this.f15384e) {
            if (!C0()) {
                return;
            }
        }
        this.f15396z = false;
    }

    public final synchronized b G(String str, long j10) {
        m.e(str, "key");
        p0();
        v();
        E0(str);
        c cVar = (c) this.f15390t.get(str);
        if (j10 != K && (cVar == null || cVar.h() != j10)) {
            return null;
        }
        if ((cVar != null ? cVar.b() : null) != null) {
            return null;
        }
        if (cVar != null && cVar.f() != 0) {
            return null;
        }
        if (!this.f15396z && !this.A) {
            vh.f fVar = this.f15389s;
            m.b(fVar);
            fVar.J(N).writeByte(32).J(str).writeByte(10);
            fVar.flush();
            if (this.f15392v) {
                return null;
            }
            if (cVar == null) {
                cVar = new c(this, str);
                this.f15390t.put(str, cVar);
            }
            b bVar = new b(this, cVar);
            cVar.l(bVar);
            return bVar;
        }
        ih.c.m(this.C, this.D, 0L, 2, null);
        return null;
    }

    public final synchronized d S(String str) {
        m.e(str, "key");
        p0();
        v();
        E0(str);
        c cVar = (c) this.f15390t.get(str);
        if (cVar == null) {
            return null;
        }
        d dVarR = cVar.r();
        if (dVarR == null) {
            return null;
        }
        this.f15391u++;
        vh.f fVar = this.f15389s;
        m.b(fVar);
        fVar.J(P).writeByte(32).J(str).writeByte(10);
        if (t0()) {
            ih.c.m(this.C, this.D, 0L, 2, null);
        }
        return dVarR;
    }

    public final boolean T() {
        return this.f15395y;
    }

    public final e0 W() {
        return this.f15380a;
    }

    public final k X() {
        return this.f15383d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        b bVarB;
        try {
            if (this.f15394x && !this.f15395y) {
                Collection collectionValues = this.f15390t.values();
                m.d(collectionValues, "<get-values>(...)");
                for (c cVar : (c[]) collectionValues.toArray(new c[0])) {
                    m.b(cVar);
                    if (cVar.b() != null && (bVarB = cVar.b()) != null) {
                        bVarB.d();
                    }
                }
                D0();
                vh.f fVar = this.f15389s;
                if (fVar != null) {
                    fh.m.f(fVar);
                }
                this.f15389s = null;
                this.f15395y = true;
                return;
            }
            this.f15395y = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Flushable
    public synchronized void flush() {
        if (this.f15394x) {
            v();
            D0();
            vh.f fVar = this.f15389s;
            m.b(fVar);
            fVar.flush();
        }
    }

    public final int h0() {
        return this.f15382c;
    }

    public final synchronized void p0() {
        try {
            if (p.f13109b && !Thread.holdsLock(this)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
            }
            if (this.f15394x) {
                return;
            }
            if (this.f15383d.v(this.f15387h)) {
                if (this.f15383d.v(this.f15385f)) {
                    this.f15383d.r(this.f15387h);
                } else {
                    this.f15383d.e(this.f15387h, this.f15385f);
                }
            }
            this.f15393w = fh.m.x(this.f15383d, this.f15387h);
            if (this.f15383d.v(this.f15385f)) {
                try {
                    x0();
                    w0();
                    this.f15394x = true;
                    return;
                } catch (IOException e10) {
                    okhttp3.internal.platform.c.f23684a.e().m("DiskLruCache " + this.f15380a + " is corrupt: " + e10.getMessage() + ", removing", 5, e10);
                    try {
                        x();
                        this.f15395y = false;
                        z0();
                        this.f15394x = true;
                    } catch (Throwable th2) {
                        this.f15395y = false;
                        throw th2;
                    }
                }
            }
            z0();
            this.f15394x = true;
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final synchronized void w(b bVar, boolean z10) {
        m.e(bVar, "editor");
        c cVarE = bVar.e();
        if (!m.a(cVarE.b(), bVar)) {
            throw new IllegalStateException("Check failed.");
        }
        if (z10 && !cVarE.g()) {
            int i10 = this.f15382c;
            for (int i11 = 0; i11 < i10; i11++) {
                boolean[] zArrF = bVar.f();
                m.b(zArrF);
                if (!zArrF[i11]) {
                    bVar.b();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i11);
                }
                if (!this.f15383d.v((e0) cVarE.c().get(i11))) {
                    bVar.b();
                    return;
                }
            }
        }
        int i12 = this.f15382c;
        for (int i13 = 0; i13 < i12; i13++) {
            e0 e0Var = (e0) cVarE.c().get(i13);
            if (!z10 || cVarE.i()) {
                fh.m.i(this.f15383d, e0Var);
            } else if (this.f15383d.v(e0Var)) {
                e0 e0Var2 = (e0) cVarE.a().get(i13);
                this.f15383d.e(e0Var, e0Var2);
                long j10 = cVarE.e()[i13];
                Long lC = this.f15383d.x(e0Var2).c();
                long jLongValue = lC != null ? lC.longValue() : 0L;
                cVarE.e()[i13] = jLongValue;
                this.f15388r = (this.f15388r - j10) + jLongValue;
            }
        }
        cVarE.l(null);
        if (cVarE.i()) {
            B0(cVarE);
            return;
        }
        this.f15391u++;
        vh.f fVar = this.f15389s;
        m.b(fVar);
        if (cVarE.g() || z10) {
            cVarE.o(true);
            fVar.J(M).writeByte(32);
            fVar.J(cVarE.d());
            cVarE.s(fVar);
            fVar.writeByte(10);
            if (z10) {
                long j11 = this.B;
                this.B = 1 + j11;
                cVarE.p(j11);
            }
        } else {
            this.f15390t.remove(cVarE.d());
            fVar.J(O).writeByte(32);
            fVar.J(cVarE.d());
            fVar.writeByte(10);
        }
        fVar.flush();
        if (this.f15388r > this.f15384e || t0()) {
            ih.c.m(this.C, this.D, 0L, 2, null);
        }
    }

    public final void x() throws IOException {
        close();
        fh.m.h(this.f15383d, this.f15380a);
    }

    public final synchronized void z0() {
        Throwable th2;
        try {
            vh.f fVar = this.f15389s;
            if (fVar != null) {
                fVar.close();
            }
            vh.f fVarB = z.b(this.f15383d.T(this.f15386g, false));
            try {
                fVarB.J(I).writeByte(10);
                fVarB.J(J).writeByte(10);
                fVarB.n0(this.f15381b).writeByte(10);
                fVarB.n0(this.f15382c).writeByte(10);
                fVarB.writeByte(10);
                for (Object obj : this.f15390t.values()) {
                    m.d(obj, "next(...)");
                    c cVar = (c) obj;
                    if (cVar.b() != null) {
                        fVarB.J(N).writeByte(32);
                        fVarB.J(cVar.d());
                        fVarB.writeByte(10);
                    } else {
                        fVarB.J(M).writeByte(32);
                        fVarB.J(cVar.d());
                        cVar.s(fVarB);
                        fVarB.writeByte(10);
                    }
                }
                d0 d0Var = d0.f10897a;
                if (fVarB != null) {
                    try {
                        fVarB.close();
                        th2 = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                    }
                } else {
                    th2 = null;
                }
            } catch (Throwable th4) {
                if (fVarB != null) {
                    try {
                        fVarB.close();
                    } catch (Throwable th5) {
                        dd.b.a(th4, th5);
                    }
                }
                th2 = th4;
            }
            if (th2 != null) {
                throw th2;
            }
            if (this.f15383d.v(this.f15385f)) {
                this.f15383d.e(this.f15385f, this.f15387h);
                this.f15383d.e(this.f15386g, this.f15385f);
                fh.m.i(this.f15383d, this.f15387h);
            } else {
                this.f15383d.e(this.f15386g, this.f15385f);
            }
            vh.f fVar2 = this.f15389s;
            if (fVar2 != null) {
                fh.m.f(fVar2);
            }
            this.f15389s = u0();
            this.f15392v = false;
            this.A = false;
        } catch (Throwable th6) {
            throw th6;
        }
    }
}
