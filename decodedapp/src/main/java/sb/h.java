package sb;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.Socket;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: classes3.dex */
public class h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Logger f27235b = Logger.getLogger(h.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f27236c = {"com.google.android.gms.org.conscrypt.OpenSSLProvider", "org.conscrypt.OpenSSLProvider", "com.android.org.conscrypt.OpenSSLProvider", "org.apache.harmony.xnet.provider.jsse.OpenSSLProvider", "com.google.android.libraries.stitch.sslguard.SslGuardProvider"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h f27237d = d();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Provider f27238a;

    private static class b extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final g f27239e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final g f27240f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Method f27241g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Method f27242h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final g f27243i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final g f27244j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final f f27245k;

        public b(g gVar, g gVar2, Method method, Method method2, g gVar3, g gVar4, Provider provider, f fVar) {
            super(provider);
            this.f27239e = gVar;
            this.f27240f = gVar2;
            this.f27241g = method;
            this.f27242h = method2;
            this.f27243i = gVar3;
            this.f27244j = gVar4;
            this.f27245k = fVar;
        }

        @Override // sb.h
        public void c(SSLSocket sSLSocket, String str, List list) {
            if (str != null) {
                this.f27239e.e(sSLSocket, Boolean.TRUE);
                this.f27240f.e(sSLSocket, str);
            }
            if (this.f27244j.g(sSLSocket)) {
                this.f27244j.f(sSLSocket, h.b(list));
            }
        }

        @Override // sb.h
        public String h(SSLSocket sSLSocket) {
            byte[] bArr;
            if (this.f27243i.g(sSLSocket) && (bArr = (byte[]) this.f27243i.f(sSLSocket, new Object[0])) != null) {
                return new String(bArr, l.f27277b);
            }
            return null;
        }

        @Override // sb.h
        public f i() {
            return this.f27245k;
        }
    }

    private static class c extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Method f27246e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Method f27247f;

        @Override // sb.h
        public void c(SSLSocket sSLSocket, String str, List list) {
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            ArrayList arrayList = new ArrayList(list.size());
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f27246e.invoke(sSLParameters, arrayList.toArray(new String[arrayList.size()]));
                sSLSocket.setSSLParameters(sSLParameters);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // sb.h
        public String h(SSLSocket sSLSocket) {
            try {
                return (String) this.f27247f.invoke(sSLSocket, null);
            } catch (IllegalAccessException e10) {
                throw new RuntimeException(e10);
            } catch (InvocationTargetException e11) {
                throw new RuntimeException(e11);
            }
        }

        @Override // sb.h
        public f i() {
            return f.ALPN_AND_NPN;
        }

        private c(Provider provider, Method method, Method method2) {
            super(provider);
            this.f27246e = method;
            this.f27247f = method2;
        }
    }

    private static class d extends h {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Method f27248e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Method f27249f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Method f27250g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Class f27251h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Class f27252i;

        public d(Method method, Method method2, Method method3, Class cls, Class cls2, Provider provider) {
            super(provider);
            this.f27248e = method;
            this.f27249f = method2;
            this.f27250g = method3;
            this.f27251h = cls;
            this.f27252i = cls2;
        }

        @Override // sb.h
        public void a(SSLSocket sSLSocket) {
            try {
                this.f27250g.invoke(null, sSLSocket);
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException e10) {
                h.f27235b.log(Level.FINE, "Failed to remove SSLSocket from Jetty ALPN", (Throwable) e10);
            }
        }

        @Override // sb.h
        public void c(SSLSocket sSLSocket, String str, List list) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = (i) list.get(i10);
                if (iVar != i.HTTP_1_0) {
                    arrayList.add(iVar.toString());
                }
            }
            try {
                this.f27248e.invoke(null, sSLSocket, Proxy.newProxyInstance(h.class.getClassLoader(), new Class[]{this.f27251h, this.f27252i}, new e(arrayList)));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }

        @Override // sb.h
        public String h(SSLSocket sSLSocket) {
            try {
                e eVar = (e) Proxy.getInvocationHandler(this.f27249f.invoke(null, sSLSocket));
                if (!eVar.f27254b && eVar.f27255c == null) {
                    h.f27235b.log(Level.INFO, "ALPN callback dropped: SPDY and HTTP/2 are disabled. Is alpn-boot on the boot class path?");
                    return null;
                }
                if (eVar.f27254b) {
                    return null;
                }
                return eVar.f27255c;
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            } catch (InvocationTargetException unused2) {
                throw new AssertionError();
            }
        }

        @Override // sb.h
        public f i() {
            return f.ALPN_AND_NPN;
        }
    }

    private static class e implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f27253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f27254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f27255c;

        public e(List list) {
            this.f27253a = list;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            String name = method.getName();
            Class<?> returnType = method.getReturnType();
            if (objArr == null) {
                objArr = l.f27276a;
            }
            if (name.equals("supports") && Boolean.TYPE == returnType) {
                return Boolean.TRUE;
            }
            if (name.equals("unsupported") && Void.TYPE == returnType) {
                this.f27254b = true;
                return null;
            }
            if (name.equals("protocols") && objArr.length == 0) {
                return this.f27253a;
            }
            if ((name.equals("selectProtocol") || name.equals("select")) && String.class == returnType && objArr.length == 1) {
                Object obj2 = objArr[0];
                if (obj2 instanceof List) {
                    List list = (List) obj2;
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        if (this.f27253a.contains(list.get(i10))) {
                            String str = (String) list.get(i10);
                            this.f27255c = str;
                            return str;
                        }
                    }
                    String str2 = (String) this.f27253a.get(0);
                    this.f27255c = str2;
                    return str2;
                }
            }
            if ((!name.equals("protocolSelected") && !name.equals("selected")) || objArr.length != 1) {
                return method.invoke(this, objArr);
            }
            this.f27255c = (String) objArr[0];
            return null;
        }
    }

    public enum f {
        ALPN_AND_NPN,
        NPN,
        NONE
    }

    public h(Provider provider) {
        this.f27238a = provider;
    }

    public static byte[] b(List list) {
        vh.e eVar = new vh.e();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            i iVar = (i) list.get(i10);
            if (iVar != i.HTTP_1_0) {
                eVar.writeByte(iVar.toString().length());
                eVar.J(iVar.toString());
            }
        }
        return eVar.y();
    }

    private static h d() throws NoSuchMethodException {
        Method method;
        Provider providerF = f();
        if (providerF != null) {
            g gVar = new g(null, "setUseSessionTickets", Boolean.TYPE);
            Method method2 = null;
            g gVar2 = new g(null, "setHostname", String.class);
            g gVar3 = new g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            g gVar4 = new g(null, "setAlpnProtocols", byte[].class);
            try {
                Class<?> cls = Class.forName("android.net.TrafficStats");
                method = cls.getMethod("tagSocket", Socket.class);
                try {
                    method2 = cls.getMethod("untagSocket", Socket.class);
                } catch (ClassNotFoundException | NoSuchMethodException unused) {
                }
            } catch (ClassNotFoundException unused2) {
                method = null;
            } catch (NoSuchMethodException unused3) {
                method = null;
            }
            Method method3 = method;
            f fVar = (providerF.getName().equals("GmsCore_OpenSSL") || providerF.getName().equals("Conscrypt") || providerF.getName().equals("Ssl_Guard") || k()) ? f.ALPN_AND_NPN : j() ? f.NPN : f.NONE;
            return new b(gVar, gVar2, method3, method2, gVar3, gVar4, providerF, fVar);
        }
        try {
            Provider provider = SSLContext.getDefault().getProvider();
            try {
                try {
                    SSLContext sSLContext = SSLContext.getInstance("TLS", provider);
                    sSLContext.init(null, null, null);
                    SSLEngine.class.getMethod("getApplicationProtocol", null).invoke(sSLContext.createSSLEngine(), null);
                    return new c(provider, SSLParameters.class.getMethod("setApplicationProtocols", String[].class), SSLSocket.class.getMethod("getApplicationProtocol", null));
                } catch (ClassNotFoundException | NoSuchMethodException unused4) {
                    return new h(provider);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException | KeyManagementException | NoSuchAlgorithmException unused5) {
                Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN");
                Class<?> cls3 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider");
                return new d(cls2.getMethod("put", SSLSocket.class, cls3), cls2.getMethod("get", SSLSocket.class), cls2.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider"), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider"), provider);
            }
        } catch (NoSuchAlgorithmException e10) {
            throw new RuntimeException(e10);
        }
    }

    public static h e() {
        return f27237d;
    }

    private static Provider f() {
        for (Provider provider : Security.getProviders()) {
            for (String str : f27236c) {
                if (str.equals(provider.getClass().getName())) {
                    f27235b.log(Level.FINE, "Found registered provider {0}", str);
                    return provider;
                }
            }
        }
        return null;
    }

    private static boolean j() {
        try {
            h.class.getClassLoader().loadClass("android.app.ActivityOptions");
            return true;
        } catch (ClassNotFoundException e10) {
            f27235b.log(Level.FINE, "Can't find class", (Throwable) e10);
            return false;
        }
    }

    private static boolean k() {
        try {
            h.class.getClassLoader().loadClass("android.net.Network");
            return true;
        } catch (ClassNotFoundException e10) {
            f27235b.log(Level.FINE, "Can't find class", (Throwable) e10);
            return false;
        }
    }

    public Provider g() {
        return this.f27238a;
    }

    public String h(SSLSocket sSLSocket) {
        return null;
    }

    public f i() {
        return f.NONE;
    }

    public void a(SSLSocket sSLSocket) {
    }

    public void c(SSLSocket sSLSocket, String str, List list) {
    }
}
