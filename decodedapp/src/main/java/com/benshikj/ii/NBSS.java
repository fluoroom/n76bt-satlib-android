package com.benshikj.ii;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class NBSS {
    public int CallPriority;
    public String From;
    public boolean InForward;
    public Double Latitude;
    public Double Longitude;
    public long Uid;

    public static NBSS unpack(byte[] bArr, int i10, int i11) {
        return (NBSS) a2.c.f165a.c(bArr, i10, i11, NBSS.class);
    }

    public byte[] pack() {
        return a2.c.f165a.a(this);
    }
}
