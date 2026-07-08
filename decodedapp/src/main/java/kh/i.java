package kh;

import eh.f0;
import eh.z;
import java.net.Proxy;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f19953a = new i();

    private i() {
    }

    private final boolean b(f0 f0Var, Proxy.Type type) {
        return !f0Var.h() && type == Proxy.Type.HTTP;
    }

    public final String a(f0 f0Var, Proxy.Type type) {
        m.e(f0Var, "request");
        m.e(type, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f0Var.i());
        sb2.append(' ');
        i iVar = f19953a;
        if (iVar.b(f0Var, type)) {
            sb2.append(f0Var.m());
        } else {
            sb2.append(iVar.c(f0Var.m()));
        }
        sb2.append(" HTTP/1.1");
        return sb2.toString();
    }

    public final String c(z zVar) {
        m.e(zVar, "url");
        String strC = zVar.c();
        String strE = zVar.e();
        if (strE == null) {
            return strC;
        }
        return strC + '?' + strE;
    }
}
