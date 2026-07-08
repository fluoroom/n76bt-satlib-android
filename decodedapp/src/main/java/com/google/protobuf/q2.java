package com.google.protobuf;

import com.google.protobuf.r;
import java.util.Collections;
import java.util.Map;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public class q2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f9937b = Logger.getLogger(q2.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f9938a;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final q2 f9939a = new q2(Collections.EMPTY_MAP);
    }

    q2(Map map) {
        this.f9938a = map;
    }

    public static q2 c() {
        return a.f9939a;
    }

    private static String d(String str) throws p0 {
        String[] strArrSplit = str.split("/");
        if (strArrSplit.length > 1) {
            return strArrSplit[strArrSplit.length - 1];
        }
        throw new p0("Invalid type url found: " + str);
    }

    public r.b a(String str) {
        return (r.b) this.f9938a.get(str);
    }

    public final r.b b(String str) {
        return a(d(str));
    }
}
