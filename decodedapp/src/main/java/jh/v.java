package jh;

import eh.j0;
import eh.z;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f18857i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final eh.a f18858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f18859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f18860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f18861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f18862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f18863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List f18864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f18865h;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final String a(InetSocketAddress inetSocketAddress) {
            rd.m.e(inetSocketAddress, "<this>");
            InetAddress address = inetSocketAddress.getAddress();
            if (address == null) {
                String hostName = inetSocketAddress.getHostName();
                rd.m.d(hostName, "getHostName(...)");
                return hostName;
            }
            String hostAddress = address.getHostAddress();
            rd.m.d(hostAddress, "getHostAddress(...)");
            return hostAddress;
        }

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f18866a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f18867b;

        public b(List list) {
            rd.m.e(list, "routes");
            this.f18866a = list;
        }

        public final List a() {
            return this.f18866a;
        }

        public final boolean b() {
            return this.f18867b < this.f18866a.size();
        }

        public final j0 c() {
            if (!b()) {
                throw new NoSuchElementException();
            }
            List list = this.f18866a;
            int i10 = this.f18867b;
            this.f18867b = i10 + 1;
            return (j0) list.get(i10);
        }
    }

    public v(eh.a aVar, s sVar, m mVar, boolean z10) {
        rd.m.e(aVar, "address");
        rd.m.e(sVar, "routeDatabase");
        rd.m.e(mVar, "call");
        this.f18858a = aVar;
        this.f18859b = sVar;
        this.f18860c = mVar;
        this.f18861d = z10;
        this.f18862e = ed.q.k();
        this.f18864g = ed.q.k();
        this.f18865h = new ArrayList();
        f(aVar.l(), aVar.g());
    }

    private final boolean b() {
        return this.f18863f < this.f18862e.size();
    }

    private final Proxy d() throws SocketException, UnknownHostException {
        if (b()) {
            List list = this.f18862e;
            int i10 = this.f18863f;
            this.f18863f = i10 + 1;
            Proxy proxy = (Proxy) list.get(i10);
            e(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.f18858a.l().h() + "; exhausted proxy configurations: " + this.f18862e);
    }

    private final void e(Proxy proxy) throws SocketException, UnknownHostException {
        String strH;
        int iM;
        List listA;
        ArrayList arrayList = new ArrayList();
        this.f18864g = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strH = this.f18858a.l().h();
            iM = this.f18858a.l().m();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strH = f18857i.a(inetSocketAddress);
            iM = inetSocketAddress.getPort();
        }
        if (1 > iM || iM >= 65536) {
            throw new SocketException("No route to " + strH + ':' + iM + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(strH, iM));
            return;
        }
        if (fh.k.a(strH)) {
            listA = ed.q.e(InetAddress.getByName(strH));
        } else {
            this.f18860c.n().p(this.f18860c, strH);
            listA = this.f18858a.c().a(strH);
            if (listA.isEmpty()) {
                throw new UnknownHostException(this.f18858a.c() + " returned no addresses for " + strH);
            }
            this.f18860c.n().o(this.f18860c, strH, listA);
        }
        if (this.f18861d) {
            listA = l.a(listA);
        }
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress((InetAddress) it.next(), iM));
        }
    }

    private final void f(z zVar, Proxy proxy) {
        this.f18860c.n().s(this.f18860c, zVar);
        this.f18862e = g(proxy, zVar, this);
        this.f18863f = 0;
        this.f18860c.n().r(this.f18860c, zVar, this.f18862e);
    }

    private static final List g(Proxy proxy, z zVar, v vVar) {
        if (proxy != null) {
            return ed.q.e(proxy);
        }
        URI uriR = zVar.r();
        if (uriR.getHost() == null) {
            return fh.p.l(Proxy.NO_PROXY);
        }
        List<Proxy> listSelect = vVar.f18858a.i().select(uriR);
        return (listSelect == null || listSelect.isEmpty()) ? fh.p.l(Proxy.NO_PROXY) : fh.p.v(listSelect);
    }

    public final boolean a() {
        return b() || !this.f18865h.isEmpty();
    }

    public final b c() {
        if (!a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (b()) {
            Proxy proxyD = d();
            Iterator it = this.f18864g.iterator();
            while (it.hasNext()) {
                j0 j0Var = new j0(this.f18858a, proxyD, (InetSocketAddress) it.next());
                if (this.f18859b.c(j0Var)) {
                    this.f18865h.add(j0Var);
                } else {
                    arrayList.add(j0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            ed.q.A(arrayList, this.f18865h);
            this.f18865h.clear();
        }
        return new b(arrayList);
    }
}
