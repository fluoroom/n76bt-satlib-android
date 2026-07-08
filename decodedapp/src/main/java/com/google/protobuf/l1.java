package com.google.protobuf;

import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public interface l1 extends m1 {

    public interface a extends m1, Cloneable {
        l1 build();

        l1 buildPartial();

        a mergeFrom(m mVar, y yVar);
    }

    z1 getParserForType();

    int getSerializedSize();

    a newBuilderForType();

    a toBuilder();

    byte[] toByteArray();

    void writeTo(o oVar);

    void writeTo(OutputStream outputStream);
}
