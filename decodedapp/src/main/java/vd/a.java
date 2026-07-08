package vd;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends c {
    @Override // vd.c
    public int b(int i10) {
        return d().nextInt(i10);
    }

    @Override // vd.c
    public long c() {
        return d().nextLong();
    }

    public abstract Random d();
}
