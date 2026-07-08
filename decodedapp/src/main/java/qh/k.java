package qh;

import eh.d0;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends f {

    /* JADX INFO: renamed from: j */
    public static final a f25244j = new a(null);

    /* JADX INFO: renamed from: h */
    private final Class f25245h;

    /* JADX INFO: renamed from: i */
    private final Class f25246i;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public static /* synthetic */ j b(a aVar, String str, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = "com.android.org.conscrypt";
            }
            return aVar.a(str);
        }

        public final j a(String str) {
            m.e(str, "packageName");
            try {
                Class<?> cls = Class.forName(str + ".OpenSSLSocketImpl");
                m.c(cls, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocket>");
                Class<?> cls2 = Class.forName(str + ".OpenSSLSocketFactoryImpl");
                m.c(cls2, "null cannot be cast to non-null type java.lang.Class<in javax.net.ssl.SSLSocketFactory>");
                Class<?> cls3 = Class.forName(str + ".SSLParametersImpl");
                m.b(cls3);
                return new k(cls, cls2, cls3);
            } catch (Exception e10) {
                c cVar = c.f25224a;
                String name = d0.class.getName();
                m.d(name, "getName(...)");
                cVar.a(name, 5, "unable to load android socket classes", e10);
                return null;
            }
        }

        private a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Class cls, Class cls2, Class cls3) {
        super(cls);
        m.e(cls, "sslSocketClass");
        m.e(cls2, "sslSocketFactoryClass");
        m.e(cls3, "paramClass");
        this.f25245h = cls2;
        this.f25246i = cls3;
    }
}
