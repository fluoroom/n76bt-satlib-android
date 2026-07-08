package io.grpc.internal;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.Collection;
import java.util.Collections;
import qb.g1;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 extends qb.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f16619a = qb.l0.a(i0.class.getClassLoader());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f16620b = 0;

    @Override // qb.g1.c
    public String a() {
        return "dns";
    }

    @Override // qb.g1.c
    public qb.g1 b(URI uri, g1.a aVar) {
        if (!"dns".equals(uri.getScheme())) {
            return null;
        }
        String str = (String) r9.l.o(uri.getPath(), "targetPath");
        r9.l.k(str.startsWith("/"), "the path component (%s) of the target (%s) must start with '/'", str, uri);
        return new e0(uri.getAuthority(), str.substring(1), aVar, w0.f17203u, r9.o.c(), f16619a);
    }

    @Override // qb.h1
    public Collection c() {
        return Collections.singleton(InetSocketAddress.class);
    }

    @Override // qb.h1
    protected boolean e() {
        return true;
    }

    @Override // qb.h1
    public int f() {
        return 5;
    }
}
