package eh;

import eh.z;
import j$.util.Objects;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a */
    private final r f12236a;

    /* JADX INFO: renamed from: b */
    private final SocketFactory f12237b;

    /* JADX INFO: renamed from: c */
    private final SSLSocketFactory f12238c;

    /* JADX INFO: renamed from: d */
    private final HostnameVerifier f12239d;

    /* JADX INFO: renamed from: e */
    private final h f12240e;

    /* JADX INFO: renamed from: f */
    private final b f12241f;

    /* JADX INFO: renamed from: g */
    private final Proxy f12242g;

    /* JADX INFO: renamed from: h */
    private final ProxySelector f12243h;

    /* JADX INFO: renamed from: i */
    private final z f12244i;

    /* JADX INFO: renamed from: j */
    private final List f12245j;

    /* JADX INFO: renamed from: k */
    private final List f12246k;

    public a(String str, int i10, r rVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, h hVar, b bVar, Proxy proxy, List list, List list2, ProxySelector proxySelector) {
        rd.m.e(str, "uriHost");
        rd.m.e(rVar, "dns");
        rd.m.e(socketFactory, "socketFactory");
        rd.m.e(bVar, "proxyAuthenticator");
        rd.m.e(list, "protocols");
        rd.m.e(list2, "connectionSpecs");
        rd.m.e(proxySelector, "proxySelector");
        this.f12236a = rVar;
        this.f12237b = socketFactory;
        this.f12238c = sSLSocketFactory;
        this.f12239d = hostnameVerifier;
        this.f12240e = hVar;
        this.f12241f = bVar;
        this.f12242g = proxy;
        this.f12243h = proxySelector;
        this.f12244i = new z.a().s(sSLSocketFactory != null ? "https" : "http").g(str).n(i10).c();
        this.f12245j = fh.p.v(list);
        this.f12246k = fh.p.v(list2);
    }

    public final h a() {
        return this.f12240e;
    }

    public final List b() {
        return this.f12246k;
    }

    public final r c() {
        return this.f12236a;
    }

    public final boolean d(a aVar) {
        rd.m.e(aVar, "that");
        return rd.m.a(this.f12236a, aVar.f12236a) && rd.m.a(this.f12241f, aVar.f12241f) && rd.m.a(this.f12245j, aVar.f12245j) && rd.m.a(this.f12246k, aVar.f12246k) && rd.m.a(this.f12243h, aVar.f12243h) && rd.m.a(this.f12242g, aVar.f12242g) && rd.m.a(this.f12238c, aVar.f12238c) && rd.m.a(this.f12239d, aVar.f12239d) && rd.m.a(this.f12240e, aVar.f12240e) && this.f12244i.m() == aVar.f12244i.m();
    }

    public final HostnameVerifier e() {
        return this.f12239d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return rd.m.a(this.f12244i, aVar.f12244i) && d(aVar);
    }

    public final List f() {
        return this.f12245j;
    }

    public final Proxy g() {
        return this.f12242g;
    }

    public final b h() {
        return this.f12241f;
    }

    public int hashCode() {
        return ((((((((((((((((((527 + this.f12244i.hashCode()) * 31) + this.f12236a.hashCode()) * 31) + this.f12241f.hashCode()) * 31) + this.f12245j.hashCode()) * 31) + this.f12246k.hashCode()) * 31) + this.f12243h.hashCode()) * 31) + Objects.hashCode(this.f12242g)) * 31) + Objects.hashCode(this.f12238c)) * 31) + Objects.hashCode(this.f12239d)) * 31) + Objects.hashCode(this.f12240e);
    }

    public final ProxySelector i() {
        return this.f12243h;
    }

    public final SocketFactory j() {
        return this.f12237b;
    }

    public final SSLSocketFactory k() {
        return this.f12238c;
    }

    public final z l() {
        return this.f12244i;
    }

    public String toString() {
        StringBuilder sb2;
        Object obj;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Address{");
        sb3.append(this.f12244i.h());
        sb3.append(':');
        sb3.append(this.f12244i.m());
        sb3.append(", ");
        if (this.f12242g != null) {
            sb2 = new StringBuilder();
            sb2.append("proxy=");
            obj = this.f12242g;
        } else {
            sb2 = new StringBuilder();
            sb2.append("proxySelector=");
            obj = this.f12243h;
        }
        sb2.append(obj);
        sb3.append(sb2.toString());
        sb3.append('}');
        return sb3.toString();
    }
}
