package eh;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f12538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Proxy f12539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f12540c;

    public j0(a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        rd.m.e(aVar, "address");
        rd.m.e(proxy, "proxy");
        rd.m.e(inetSocketAddress, "socketAddress");
        this.f12538a = aVar;
        this.f12539b = proxy;
        this.f12540c = inetSocketAddress;
    }

    public final a a() {
        return this.f12538a;
    }

    public final Proxy b() {
        return this.f12539b;
    }

    public final boolean c() {
        if (this.f12539b.type() != Proxy.Type.HTTP) {
            return false;
        }
        return this.f12538a.k() != null || this.f12538a.f().contains(e0.f12391g);
    }

    public final InetSocketAddress d() {
        return this.f12540c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof j0)) {
            return false;
        }
        j0 j0Var = (j0) obj;
        return rd.m.a(j0Var.f12538a, this.f12538a) && rd.m.a(j0Var.f12539b, this.f12539b) && rd.m.a(j0Var.f12540c, this.f12540c);
    }

    public int hashCode() {
        return ((((527 + this.f12538a.hashCode()) * 31) + this.f12539b.hashCode()) * 31) + this.f12540c.hashCode();
    }

    public String toString() {
        String hostAddress;
        StringBuilder sb2 = new StringBuilder();
        String strH = this.f12538a.l().h();
        InetAddress address = this.f12540c.getAddress();
        String strK = (address == null || (hostAddress = address.getHostAddress()) == null) ? null : fh.k.k(hostAddress);
        if (rg.q.O(strH, ':', false, 2, null)) {
            sb2.append("[");
            sb2.append(strH);
            sb2.append("]");
        } else {
            sb2.append(strH);
        }
        if (this.f12538a.l().m() != this.f12540c.getPort() || rd.m.a(strH, strK)) {
            sb2.append(":");
            sb2.append(this.f12538a.l().m());
        }
        if (!rd.m.a(strH, strK)) {
            if (rd.m.a(this.f12539b, Proxy.NO_PROXY)) {
                sb2.append(" at ");
            } else {
                sb2.append(" via proxy ");
            }
            if (strK == null) {
                sb2.append("<unresolved>");
            } else if (rg.q.O(strK, ':', false, 2, null)) {
                sb2.append("[");
                sb2.append(strK);
                sb2.append("]");
            } else {
                sb2.append(strK);
            }
            sb2.append(":");
            sb2.append(this.f12540c.getPort());
        }
        return sb2.toString();
    }
}
