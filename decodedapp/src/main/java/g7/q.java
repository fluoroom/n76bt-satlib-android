package g7;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;

/* JADX INFO: loaded from: classes.dex */
public class q extends h0 {
    public q() {
        super(InetSocketAddress.class);
    }

    @Override // g7.i0, p6.p
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public void f(InetSocketAddress inetSocketAddress, e6.g gVar, p6.d0 d0Var) {
        String strSubstring;
        InetAddress address = inetSocketAddress.getAddress();
        String hostName = address == null ? inetSocketAddress.getHostName() : address.toString().trim();
        int iIndexOf = hostName.indexOf(47);
        if (iIndexOf >= 0) {
            if (iIndexOf == 0) {
                if (address instanceof Inet6Address) {
                    strSubstring = "[" + hostName.substring(1) + "]";
                } else {
                    strSubstring = hostName.substring(1);
                }
                hostName = strSubstring;
            } else {
                hostName = hostName.substring(0, iIndexOf);
            }
        }
        gVar.d1(hostName + ":" + inetSocketAddress.getPort());
    }

    @Override // g7.h0, p6.p
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public void g(InetSocketAddress inetSocketAddress, e6.g gVar, p6.d0 d0Var, a7.h hVar) {
        n6.c cVarG = hVar.g(gVar, hVar.f(inetSocketAddress, InetSocketAddress.class, e6.m.VALUE_STRING));
        f(inetSocketAddress, gVar, d0Var);
        hVar.h(gVar, cVarG);
    }
}
