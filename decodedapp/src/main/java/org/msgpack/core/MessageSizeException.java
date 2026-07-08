package org.msgpack.core;

/* JADX INFO: loaded from: classes3.dex */
public class MessageSizeException extends MessagePackException {
    private final long size;

    public MessageSizeException(long j10) {
        this.size = j10;
    }

    public long getSize() {
        return this.size;
    }

    public MessageSizeException(String str, long j10) {
        super(str);
        this.size = j10;
    }
}
