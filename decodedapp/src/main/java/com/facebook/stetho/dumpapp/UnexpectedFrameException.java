package com.facebook.stetho.dumpapp;

/* JADX INFO: loaded from: classes.dex */
class UnexpectedFrameException extends DumpappFramingException {
    public UnexpectedFrameException(byte b10, byte b11) {
        super("Expected '" + ((int) b10) + "', got: '" + ((int) b11) + "'");
    }
}
