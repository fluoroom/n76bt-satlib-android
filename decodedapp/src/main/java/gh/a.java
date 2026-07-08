package gh;

import ed.q;
import eh.b;
import eh.f0;
import eh.h0;
import eh.i;
import eh.j0;
import eh.p;
import eh.r;
import eh.z;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import rd.h;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final r f14508d;

    /* JADX INFO: renamed from: gh.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0204a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14509a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f14509a = iArr;
        }
    }

    public a(r rVar) {
        m.e(rVar, "defaultDns");
        this.f14508d = rVar;
    }

    private final InetAddress b(Proxy proxy, z zVar, r rVar) {
        Proxy.Type type = proxy.type();
        if ((type == null ? -1 : C0204a.f14509a[type.ordinal()]) == 1) {
            return (InetAddress) q.Z(rVar.a(zVar.h()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        m.c(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        m.d(address, "getAddress(...)");
        return address;
    }

    @Override // eh.b
    public f0 a(j0 j0Var, h0 h0Var) {
        Proxy proxyB;
        r rVarC;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        eh.a aVarA;
        m.e(h0Var, "response");
        List<i> listL = h0Var.l();
        f0 f0VarP0 = h0Var.p0();
        z zVarM = f0VarP0.m();
        boolean z10 = h0Var.n() == 407;
        if (j0Var == null || (proxyB = j0Var.b()) == null) {
            proxyB = Proxy.NO_PROXY;
        }
        for (i iVar : listL) {
            if (rg.q.x("Basic", iVar.c(), true)) {
                if (j0Var == null || (aVarA = j0Var.a()) == null || (rVarC = aVarA.c()) == null) {
                    rVarC = this.f14508d;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxyB.address();
                    m.c(socketAddressAddress, "null cannot be cast to non-null type java.net.InetSocketAddress");
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    m.b(proxyB);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, b(proxyB, zVarM, rVarC), inetSocketAddress.getPort(), zVarM.q(), iVar.b(), iVar.c(), zVarM.s(), Authenticator.RequestorType.PROXY);
                } else {
                    String strH = zVarM.h();
                    m.b(proxyB);
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(strH, b(proxyB, zVarM, rVarC), zVarM.m(), zVarM.q(), iVar.b(), iVar.c(), zVarM.s(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? "Proxy-Authorization" : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    m.d(userName, "getUserName(...)");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    m.d(password, "getPassword(...)");
                    return f0VarP0.j().k(str, p.a(userName, new String(password), iVar.a())).a();
                }
            }
        }
        return null;
    }

    public /* synthetic */ a(r rVar, int i10, h hVar) {
        this((i10 & 1) != 0 ? r.f12598b : rVar);
    }
}
