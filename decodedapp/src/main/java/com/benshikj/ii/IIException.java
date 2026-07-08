package com.benshikj.ii;

/* JADX INFO: loaded from: classes.dex */
public class IIException extends RuntimeException {
    public final Error error;

    public enum Error {
        RPCCoreError
    }

    public IIException(Error error, String str) {
        super(str);
        this.error = error;
    }
}
