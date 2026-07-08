package com.dw.ht.net.rpc.model;

import androidx.annotation.Keep;
import e5.c;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class Heartbeat {
    public long I;
    public long U;
    public int V;

    public byte[] pack() {
        return c.a(this);
    }
}
