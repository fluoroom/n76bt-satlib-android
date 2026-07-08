package fh;

import com.facebook.stetho.server.http.HttpHeaders;
import ed.j0;
import eh.d0;
import eh.h0;
import eh.s;
import eh.y;
import eh.z;
import j$.util.DesugarCollections;
import j$.util.DesugarTimeZone;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import rd.g0;
import rg.q;
import vh.n0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a */
    public static final TimeZone f13108a;

    /* JADX INFO: renamed from: b */
    public static final boolean f13109b;

    /* JADX INFO: renamed from: c */
    public static final String f13110c;

    static {
        TimeZone timeZone = DesugarTimeZone.getTimeZone("GMT");
        rd.m.b(timeZone);
        f13108a = timeZone;
        f13109b = false;
        String name = d0.class.getName();
        rd.m.d(name, "getName(...)");
        f13110c = q.w0(q.v0(name, "okhttp3."), "Client");
    }

    public static final s.c c(final s sVar) {
        rd.m.e(sVar, "<this>");
        return new s.c() { // from class: fh.n
            @Override // eh.s.c
            public final s a(eh.e eVar) {
                return p.d(sVar, eVar);
            }
        };
    }

    public static final s d(s sVar, eh.e eVar) {
        rd.m.e(eVar, "it");
        return sVar;
    }

    public static final void e(eh.q qVar) {
        rd.m.e(qVar, "<this>");
        if (f13109b && Thread.holdsLock(qVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + qVar);
        }
    }

    public static final boolean f(z zVar, z zVar2) {
        rd.m.e(zVar, "<this>");
        rd.m.e(zVar2, "other");
        return rd.m.a(zVar.h(), zVar2.h()) && zVar.m() == zVar2.m() && rd.m.a(zVar.q(), zVar2.q());
    }

    public static final int g(String str, long j10, TimeUnit timeUnit) {
        rd.m.e(str, "name");
        rd.m.e(timeUnit, "unit");
        if (j10 < 0) {
            throw new IllegalStateException((str + " < 0").toString());
        }
        long millis = timeUnit.toMillis(j10);
        if (millis > 2147483647L) {
            throw new IllegalArgumentException((str + " too large").toString());
        }
        if (millis != 0 || j10 <= 0) {
            return (int) millis;
        }
        throw new IllegalArgumentException((str + " too small").toString());
    }

    public static final void h(Socket socket) {
        rd.m.e(socket, "<this>");
        try {
            socket.close();
        } catch (AssertionError e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (!rd.m.a(e11.getMessage(), "bio == null")) {
                throw e11;
            }
        } catch (Exception unused) {
        }
    }

    public static final boolean i(n0 n0Var, int i10, TimeUnit timeUnit) {
        rd.m.e(n0Var, "<this>");
        rd.m.e(timeUnit, "timeUnit");
        try {
            return o(n0Var, i10, timeUnit);
        } catch (IOException unused) {
            return false;
        }
    }

    public static final String j(String str, Object... objArr) {
        rd.m.e(str, "format");
        rd.m.e(objArr, "args");
        g0 g0Var = g0.f25951a;
        Locale locale = Locale.US;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(locale, str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        rd.m.d(str2, "format(...)");
        return str2;
    }

    public static final long k(h0 h0Var) {
        rd.m.e(h0Var, "<this>");
        String strB = h0Var.x().b(HttpHeaders.CONTENT_LENGTH);
        if (strB != null) {
            return m.C(strB, -1L);
        }
        return -1L;
    }

    public static final List l(Object... objArr) {
        rd.m.e(objArr, "elements");
        return w(objArr);
    }

    public static final boolean m(Socket socket, vh.g gVar) {
        rd.m.e(socket, "<this>");
        rd.m.e(gVar, "source");
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !gVar.z();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public static final Charset n(vh.g gVar, Charset charset) {
        rd.m.e(gVar, "<this>");
        rd.m.e(charset, "default");
        int iO0 = gVar.o0(m.m());
        if (iO0 == -1) {
            return charset;
        }
        if (iO0 == 0) {
            return rg.d.f26007b;
        }
        if (iO0 == 1) {
            return rg.d.f26009d;
        }
        if (iO0 == 2) {
            return rg.d.f26006a.b();
        }
        if (iO0 == 3) {
            return rg.d.f26010e;
        }
        if (iO0 == 4) {
            return rg.d.f26006a.a();
        }
        throw new AssertionError();
    }

    public static final boolean o(n0 n0Var, int i10, TimeUnit timeUnit) {
        rd.m.e(n0Var, "<this>");
        rd.m.e(timeUnit, "timeUnit");
        long jNanoTime = System.nanoTime();
        long jC = n0Var.i().e() ? n0Var.i().c() - jNanoTime : Long.MAX_VALUE;
        n0Var.i().d(Math.min(jC, timeUnit.toNanos(i10)) + jNanoTime);
        try {
            vh.e eVar = new vh.e();
            while (n0Var.N(eVar, 8192L) != -1) {
                eVar.k();
            }
            if (jC == Long.MAX_VALUE) {
                n0Var.i().a();
                return true;
            }
            n0Var.i().d(jNanoTime + jC);
            return true;
        } catch (InterruptedIOException unused) {
            if (jC == Long.MAX_VALUE) {
                n0Var.i().a();
                return false;
            }
            n0Var.i().d(jNanoTime + jC);
            return false;
        } catch (Throwable th2) {
            if (jC == Long.MAX_VALUE) {
                n0Var.i().a();
            } else {
                n0Var.i().d(jNanoTime + jC);
            }
            throw th2;
        }
    }

    public static final ThreadFactory p(final String str, final boolean z10) {
        rd.m.e(str, "name");
        return new ThreadFactory() { // from class: fh.o
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return p.q(str, z10, runnable);
            }
        };
    }

    public static final Thread q(String str, boolean z10, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z10);
        return thread;
    }

    public static final List r(y yVar) {
        rd.m.e(yVar, "<this>");
        xd.c cVarI = xd.d.i(0, yVar.size());
        ArrayList arrayList = new ArrayList(ed.q.v(cVarI, 10));
        Iterator it = cVarI.iterator();
        while (it.hasNext()) {
            int iNextInt = ((j0) it).nextInt();
            arrayList.add(new mh.d(yVar.d(iNextInt), yVar.g(iNextInt)));
        }
        return arrayList;
    }

    public static final y s(List list) {
        rd.m.e(list, "<this>");
        y.a aVar = new y.a();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mh.d dVar = (mh.d) it.next();
            aVar.d(dVar.a().Z(), dVar.b().Z());
        }
        return aVar.f();
    }

    public static final String t(z zVar, boolean z10) {
        String strH;
        rd.m.e(zVar, "<this>");
        if (q.P(zVar.h(), ":", false, 2, null)) {
            strH = '[' + zVar.h() + ']';
        } else {
            strH = zVar.h();
        }
        if (!z10 && zVar.m() == z.f12621j.b(zVar.q())) {
            return strH;
        }
        return strH + ':' + zVar.m();
    }

    public static /* synthetic */ String u(z zVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return t(zVar, z10);
    }

    public static final List v(List list) {
        rd.m.e(list, "<this>");
        if (list.isEmpty()) {
            return ed.q.k();
        }
        if (list.size() == 1) {
            List listSingletonList = Collections.singletonList(list.get(0));
            rd.m.d(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        Object[] array = list.toArray();
        rd.m.d(array, "toArray(...)");
        List listUnmodifiableList = DesugarCollections.unmodifiableList(ed.j.d(array));
        rd.m.d(listUnmodifiableList, "unmodifiableList(...)");
        rd.m.c(listUnmodifiableList, "null cannot be cast to non-null type kotlin.collections.List<T of okhttp3.internal._UtilJvmKt.toImmutableList>");
        return listUnmodifiableList;
    }

    public static final List w(Object[] objArr) {
        if (objArr == null || objArr.length == 0) {
            return ed.q.k();
        }
        if (objArr.length == 1) {
            List listSingletonList = Collections.singletonList(objArr[0]);
            rd.m.d(listSingletonList, "singletonList(...)");
            return listSingletonList;
        }
        List listUnmodifiableList = DesugarCollections.unmodifiableList(ed.j.d((Object[]) objArr.clone()));
        rd.m.d(listUnmodifiableList, "unmodifiableList(...)");
        return listUnmodifiableList;
    }
}
