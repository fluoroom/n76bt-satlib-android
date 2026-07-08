package xd;

import rd.m;

/* JADX INFO: loaded from: classes3.dex */
abstract class e {
    public static final void a(boolean z10, Number number) {
        m.e(number, "step");
        if (z10) {
            return;
        }
        throw new IllegalArgumentException("Step must be positive, was: " + number + '.');
    }
}
