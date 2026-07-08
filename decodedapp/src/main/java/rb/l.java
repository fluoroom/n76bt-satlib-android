package rb;

import io.grpc.internal.w0;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import sb.h;

/* JADX INFO: loaded from: classes3.dex */
class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f25820b = Logger.getLogger(l.class.getName());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final sb.h f25821c = sb.h.e();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static l f25822d = d(l.class.getClassLoader());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final sb.h f25823a;

    static final class a extends l {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final sb.g f25824e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final sb.g f25825f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final sb.g f25826g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final sb.g f25827h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final sb.g f25828i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final sb.g f25829j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final Method f25830k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final Method f25831l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final Method f25832m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final Method f25833n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final Method f25834o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final Method f25835p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Constructor f25836q;

        static {
            Method method;
            Method method2;
            Method method3;
            Method method4;
            Method method5;
            NoSuchMethodException e10;
            ClassNotFoundException e11;
            Method method6;
            Class<?> cls = Boolean.TYPE;
            Constructor<?> constructor = null;
            f25824e = new sb.g(null, "setUseSessionTickets", cls);
            f25825f = new sb.g(null, "setHostname", String.class);
            f25826g = new sb.g(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
            f25827h = new sb.g(null, "setAlpnProtocols", byte[].class);
            f25828i = new sb.g(byte[].class, "getNpnSelectedProtocol", new Class[0]);
            f25829j = new sb.g(null, "setNpnProtocols", byte[].class);
            try {
                method = SSLParameters.class.getMethod("setApplicationProtocols", String[].class);
            } catch (ClassNotFoundException e12) {
                e = e12;
                method = null;
                method2 = null;
            } catch (NoSuchMethodException e13) {
                e = e13;
                method = null;
                method2 = null;
            }
            try {
                method2 = SSLParameters.class.getMethod("getApplicationProtocols", null);
            } catch (ClassNotFoundException e14) {
                e = e14;
                method2 = null;
                method3 = method2;
                method4 = method3;
                l.f25820b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f25832m = method;
                f25833n = method2;
                f25834o = method3;
                f25830k = method4;
                f25831l = method5;
                try {
                    method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                } catch (ClassNotFoundException e15) {
                    e11 = e15;
                    method6 = null;
                    l.f25820b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e11);
                    f25835p = method6;
                    f25836q = constructor;
                } catch (NoSuchMethodException e16) {
                    e10 = e16;
                    method6 = null;
                    l.f25820b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e10);
                    f25835p = method6;
                    f25836q = constructor;
                }
                try {
                    constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                } catch (ClassNotFoundException e17) {
                    e11 = e17;
                    l.f25820b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e11);
                } catch (NoSuchMethodException e18) {
                    e10 = e18;
                    l.f25820b.log(Level.FINER, "Failed to find Android 7.0+ APIs", (Throwable) e10);
                }
                f25835p = method6;
                f25836q = constructor;
            } catch (NoSuchMethodException e19) {
                e = e19;
                method2 = null;
                method3 = method2;
                method4 = method3;
                l.f25820b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f25832m = method;
                f25833n = method2;
                f25834o = method3;
                f25830k = method4;
                f25831l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f25835p = method6;
                f25836q = constructor;
            }
            try {
                method3 = SSLSocket.class.getMethod("getApplicationProtocol", null);
                try {
                    Class<?> cls2 = Class.forName("android.net.ssl.SSLSockets");
                    method4 = cls2.getMethod("isSupportedSocket", SSLSocket.class);
                    try {
                        method5 = cls2.getMethod("setUseSessionTickets", SSLSocket.class, cls);
                    } catch (ClassNotFoundException e20) {
                        e = e20;
                        l.f25820b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                    } catch (NoSuchMethodException e21) {
                        e = e21;
                        l.f25820b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                        method5 = null;
                    }
                } catch (ClassNotFoundException e22) {
                    e = e22;
                    method4 = null;
                } catch (NoSuchMethodException e23) {
                    e = e23;
                    method4 = null;
                }
            } catch (ClassNotFoundException e24) {
                e = e24;
                method3 = null;
                method4 = method3;
                l.f25820b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f25832m = method;
                f25833n = method2;
                f25834o = method3;
                f25830k = method4;
                f25831l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f25835p = method6;
                f25836q = constructor;
            } catch (NoSuchMethodException e25) {
                e = e25;
                method3 = null;
                method4 = method3;
                l.f25820b.log(Level.FINER, "Failed to find Android 10.0+ APIs", (Throwable) e);
                method5 = null;
                f25832m = method;
                f25833n = method2;
                f25834o = method3;
                f25830k = method4;
                f25831l = method5;
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
                f25835p = method6;
                f25836q = constructor;
            }
            f25832m = method;
            f25833n = method2;
            f25834o = method3;
            f25830k = method4;
            f25831l = method5;
            try {
                method6 = SSLParameters.class.getMethod("setServerNames", List.class);
                constructor = Class.forName("javax.net.ssl.SNIHostName").getConstructor(String.class);
            } catch (ClassNotFoundException e26) {
                e11 = e26;
            } catch (NoSuchMethodException e27) {
                e10 = e27;
            }
            f25835p = method6;
            f25836q = constructor;
        }

        a(sb.h hVar) {
            super(hVar);
        }

        @Override // rb.l
        protected void c(SSLSocket sSLSocket, String str, List list) {
            Constructor constructor;
            boolean z10;
            Method method;
            String[] strArrI = l.i(list);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            if (str != null) {
                try {
                    try {
                        if (l.g(str)) {
                            Method method2 = f25830k;
                            if (method2 == null || !((Boolean) method2.invoke(null, sSLSocket)).booleanValue()) {
                                f25824e.e(sSLSocket, Boolean.TRUE);
                            } else {
                                f25831l.invoke(null, sSLSocket, Boolean.TRUE);
                            }
                            Method method3 = f25835p;
                            if (method3 == null || (constructor = f25836q) == null || v9.b.f(v9.a.a(str).b())) {
                                f25825f.e(sSLSocket, str);
                            } else {
                                method3.invoke(sSLParameters, Collections.singletonList(constructor.newInstance(str)));
                            }
                        }
                    } catch (IllegalAccessException e10) {
                        throw new RuntimeException(e10);
                    } catch (InstantiationException e11) {
                        throw new RuntimeException(e11);
                    }
                } catch (InvocationTargetException e12) {
                    throw new RuntimeException(e12);
                }
            }
            Method method4 = f25834o;
            if (method4 != null) {
                try {
                    method4.invoke(sSLSocket, null);
                    f25832m.invoke(sSLParameters, strArrI);
                    z10 = true;
                } catch (InvocationTargetException e13) {
                    if (!(e13.getTargetException() instanceof UnsupportedOperationException)) {
                        throw e13;
                    }
                    l.f25820b.log(Level.FINER, "setApplicationProtocol unsupported, will try old methods");
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            sSLSocket.setSSLParameters(sSLParameters);
            if (z10 && (method = f25833n) != null && Arrays.equals(strArrI, (String[]) method.invoke(sSLSocket.getSSLParameters(), null))) {
                return;
            }
            Object[] objArr = {sb.h.b(list)};
            if (this.f25823a.i() == h.f.ALPN_AND_NPN) {
                f25827h.f(sSLSocket, objArr);
            }
            if (this.f25823a.i() == h.f.NONE) {
                throw new RuntimeException("We can not do TLS handshake on this Android version, please install the Google Play Services Dynamic Security Provider to use TLS");
            }
            f25829j.f(sSLSocket, objArr);
        }

        @Override // rb.l
        public String f(SSLSocket sSLSocket) {
            Method method = f25834o;
            if (method != null) {
                try {
                    return (String) method.invoke(sSLSocket, null);
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException(e10);
                } catch (InvocationTargetException e11) {
                    if (!(e11.getTargetException() instanceof UnsupportedOperationException)) {
                        throw new RuntimeException(e11);
                    }
                    l.f25820b.log(Level.FINER, "Socket unsupported for getApplicationProtocol, will try old methods");
                }
            }
            if (this.f25823a.i() == h.f.ALPN_AND_NPN) {
                try {
                    byte[] bArr = (byte[]) f25826g.f(sSLSocket, new Object[0]);
                    if (bArr != null) {
                        return new String(bArr, sb.l.f27277b);
                    }
                } catch (Exception e12) {
                    l.f25820b.log(Level.FINE, "Failed calling getAlpnSelectedProtocol()", (Throwable) e12);
                }
            }
            if (this.f25823a.i() != h.f.NONE) {
                try {
                    byte[] bArr2 = (byte[]) f25828i.f(sSLSocket, new Object[0]);
                    if (bArr2 != null) {
                        return new String(bArr2, sb.l.f27277b);
                    }
                } catch (Exception e13) {
                    l.f25820b.log(Level.FINE, "Failed calling getNpnSelectedProtocol()", (Throwable) e13);
                }
            }
            return null;
        }

        @Override // rb.l
        public String h(SSLSocket sSLSocket, String str, List list) {
            String strF = f(sSLSocket);
            return strF == null ? super.h(sSLSocket, str, list) : strF;
        }
    }

    l(sb.h hVar) {
        this.f25823a = (sb.h) r9.l.o(hVar, "platform");
    }

    static l d(ClassLoader classLoader) {
        try {
            classLoader.loadClass("com.android.org.conscrypt.OpenSSLSocketImpl");
        } catch (ClassNotFoundException e10) {
            f25820b.log(Level.FINE, "Unable to find Conscrypt. Skipping", (Throwable) e10);
            try {
                classLoader.loadClass("org.apache.harmony.xnet.provider.jsse.OpenSSLSocketImpl");
            } catch (ClassNotFoundException e11) {
                f25820b.log(Level.FINE, "Unable to find any OpenSSLSocketImpl. Skipping", (Throwable) e11);
                return new l(f25821c);
            }
        }
        return new a(f25821c);
    }

    public static l e() {
        return f25822d;
    }

    static boolean g(String str) {
        if (str.contains("_")) {
            return false;
        }
        try {
            w0.c(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String[] i(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((sb.i) it.next()).toString());
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    protected void c(SSLSocket sSLSocket, String str, List list) {
        this.f25823a.c(sSLSocket, str, list);
    }

    public String f(SSLSocket sSLSocket) {
        return this.f25823a.h(sSLSocket);
    }

    public String h(SSLSocket sSLSocket, String str, List list) {
        if (list != null) {
            c(sSLSocket, str, list);
        }
        try {
            sSLSocket.startHandshake();
            String strF = f(sSLSocket);
            if (strF != null) {
                return strF;
            }
            throw new RuntimeException("TLS ALPN negotiation failed with protocols: " + list);
        } finally {
            this.f25823a.a(sSLSocket);
        }
    }
}
