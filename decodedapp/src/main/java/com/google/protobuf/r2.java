package com.google.protobuf;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class r2 extends RuntimeException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f10086a;

    public r2(l1 l1Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
        this.f10086a = null;
    }

    private static String b(List list) {
        StringBuilder sb2 = new StringBuilder("Message missing required fields: ");
        Iterator it = list.iterator();
        boolean z10 = true;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z10) {
                z10 = false;
            } else {
                sb2.append(", ");
            }
            sb2.append(str);
        }
        return sb2.toString();
    }

    public p0 a() {
        return new p0(getMessage());
    }

    public r2(List list) {
        super(b(list));
        this.f10086a = list;
    }
}
