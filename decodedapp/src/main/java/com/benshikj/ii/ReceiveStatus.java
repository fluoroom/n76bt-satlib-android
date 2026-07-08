package com.benshikj.ii;

import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class ReceiveStatus {
    public byte[] bss;
    public long channelID;
    public long createTime = SystemClock.elapsedRealtime();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public long f5073id;
    public boolean monitor;
    public NBSS nbss;
    public boolean rxing;

    public ReceiveStatus(long j10, long j11, boolean z10, byte[] bArr, NBSS nbss, boolean z11) {
        this.f5073id = j10;
        this.channelID = j11;
        this.rxing = z10;
        this.bss = bArr;
        this.nbss = nbss;
        this.monitor = z11;
    }

    public String getSenderName() {
        NBSS nbss = this.nbss;
        if (nbss == null || TextUtils.isEmpty(nbss.From)) {
            return null;
        }
        NBSS nbss2 = this.nbss;
        if (!nbss2.InForward) {
            return nbss2.From;
        }
        return "(" + this.nbss.From + ")";
    }
}
