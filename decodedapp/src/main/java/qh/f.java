package qh;

import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import qh.i;
import rd.m;
import rg.q;

/* JADX INFO: loaded from: classes3.dex */
public class f implements j {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f25228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final i.a f25229g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class f25230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Method f25231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Method f25232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Method f25233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Method f25234e;

    public static final class a {

        /* JADX INFO: renamed from: qh.f$a$a, reason: collision with other inner class name */
        public static final class C0345a implements i.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f25235a;

            C0345a(String str) {
                this.f25235a = str;
            }

            @Override // qh.i.a
            public boolean a(SSLSocket sSLSocket) {
                m.e(sSLSocket, "sslSocket");
                String name = sSLSocket.getClass().getName();
                m.d(name, "getName(...)");
                return q.J(name, this.f25235a + '.', false, 2, null);
            }

            @Override // qh.i.a
            public j b(SSLSocket sSLSocket) {
                m.e(sSLSocket, "sslSocket");
                return f.f25228f.b(sSLSocket.getClass());
            }
        }

        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final f b(Class cls) {
            Class superclass = cls;
            while (superclass != null && !m.a(superclass.getSimpleName(), "OpenSSLSocketImpl")) {
                superclass = superclass.getSuperclass();
                if (superclass == null) {
                    throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
                }
            }
            m.b(superclass);
            return new f(superclass);
        }

        public final i.a c(String str) {
            m.e(str, "packageName");
            return new C0345a(str);
        }

        public final i.a d() {
            return f.f25229g;
        }

        private a() {
        }
    }

    static {
        a aVar = new a(null);
        f25228f = aVar;
        f25229g = aVar.c("com.google.android.gms.org.conscrypt");
    }

    public f(Class cls) throws NoSuchMethodException {
        m.e(cls, "sslSocketClass");
        this.f25230a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        m.d(declaredMethod, "getDeclaredMethod(...)");
        this.f25231b = declaredMethod;
        this.f25232c = cls.getMethod("setHostname", String.class);
        this.f25233d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f25234e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // qh.j
    public boolean a(SSLSocket sSLSocket) {
        m.e(sSLSocket, "sslSocket");
        return this.f25230a.isInstance(sSLSocket);
    }

    @Override // qh.j
    public boolean b() {
        return okhttp3.internal.platform.b.f23677f.c();
    }

    @Override // qh.j
    public String c(SSLSocket sSLSocket) {
        m.e(sSLSocket, "sslSocket");
        if (!a(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.f25233d.invoke(sSLSocket, null);
            if (bArr != null) {
                return new String(bArr, rg.d.f26007b);
            }
            return null;
        } catch (IllegalAccessException e10) {
            throw new AssertionError(e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if ((cause instanceof NullPointerException) && m.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                return null;
            }
            throw new AssertionError(e11);
        }
    }

    @Override // qh.j
    public void d(SSLSocket sSLSocket, String str, List list) {
        m.e(sSLSocket, "sslSocket");
        m.e(list, "protocols");
        if (a(sSLSocket)) {
            try {
                this.f25231b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null && Build.VERSION.SDK_INT <= 23) {
                    this.f25232c.invoke(sSLSocket, str);
                }
                this.f25234e.invoke(sSLSocket, okhttp3.internal.platform.c.f23684a.c(list));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }
}
