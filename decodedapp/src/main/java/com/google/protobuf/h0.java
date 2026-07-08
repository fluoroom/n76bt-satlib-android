package com.google.protobuf;

import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h0 extends a implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f9032a = Logger.getLogger(h0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static boolean f9033b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f9034c = DesugarCollections.synchronizedSet(new HashSet());

    static void g(Class cls) {
        if (System.getProperty("com.google.protobuf.use_unsafe_pre22_gencode") != null) {
            return;
        }
        String name = cls.getName();
        String str = "Vulnerable protobuf generated type in use: " + name + "\nAs of 2022/09/29 (release 21.7) makeExtensionsImmutable should not be called from protobuf gencode. If you are seeing this message, your gencode is vulnerable to a denial of service attack. You should regenerate your code using protobuf 25.6 or later. Use the latest version that meets your needs. However, if you understand the risks and wish to continue with vulnerable gencode, you can set the system property `-Dcom.google.protobuf.use_unsafe_pre22_gencode` on the command line to silence this warning. You also can set `-Dcom.google.protobuf.error_on_unsafe_pre22_gencode` to throw an error instead. See security vulnerability: https://github.com/protocolbuffers/protobuf/security/advisories/GHSA-h4h5-3hr4-j3g2";
        if (System.getProperty("com.google.protobuf.error_on_unsafe_pre22_gencode") != null) {
            throw new UnsupportedOperationException(str);
        }
        if (f9034c.add(name)) {
            f9032a.warning(str);
        }
    }
}
