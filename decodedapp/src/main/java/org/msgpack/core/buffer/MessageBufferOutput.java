package org.msgpack.core.buffer;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public interface MessageBufferOutput extends Closeable, Flushable {
    void add(byte[] bArr, int i10, int i11) throws IOException;

    MessageBuffer next(int i10) throws IOException;

    void write(byte[] bArr, int i10, int i11) throws IOException;

    void writeBuffer(int i10) throws IOException;
}
