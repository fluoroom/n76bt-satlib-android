package com.google.protobuf;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public interface z1 {
    Object parseDelimitedFrom(InputStream inputStream);

    Object parseDelimitedFrom(InputStream inputStream, y yVar);

    Object parseFrom(l lVar);

    Object parseFrom(l lVar, y yVar);

    Object parseFrom(m mVar);

    Object parseFrom(m mVar, y yVar);

    Object parseFrom(InputStream inputStream);

    Object parseFrom(InputStream inputStream, y yVar);

    Object parseFrom(ByteBuffer byteBuffer);

    Object parseFrom(ByteBuffer byteBuffer, y yVar);

    Object parseFrom(byte[] bArr);

    Object parseFrom(byte[] bArr, y yVar);

    Object parsePartialFrom(m mVar, y yVar);
}
