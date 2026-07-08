package io.grpc.internal;

import io.grpc.internal.e0;

/* JADX INFO: loaded from: classes3.dex */
abstract class f1 implements e0.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Throwable f16577a = a();

    private static Throwable a() {
        try {
            Class.forName("javax.naming.directory.InitialDirContext");
            Class.forName("com.sun.jndi.dns.DnsContextFactory");
            return null;
        } catch (ClassNotFoundException e10) {
            return e10;
        } catch (Error e11) {
            return e11;
        } catch (RuntimeException e12) {
            return e12;
        }
    }
}
