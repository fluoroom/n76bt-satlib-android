package zd;

import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(IllegalAccessException illegalAccessException) {
        super(illegalAccessException);
        m.e(illegalAccessException, "cause");
    }
}
