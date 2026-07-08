package wd;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends vd.a {
    @Override // vd.a
    public Random d() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        m.d(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
