package com.benshikj.ii;

/* JADX INFO: loaded from: classes.dex */
public interface ReceiveDataProcessor {
    void finish();

    boolean needMute();

    void onReceiveAudio(short[] sArr, int i10, int i11);

    void onReceiveData(byte[] bArr, int i10, int i11);

    void onReceiveExtensionData(byte[] bArr);
}
