package com.benshikj.ht.rpc;

import com.benshikj.ht.rpc.IMGrpc;
import com.benshikj.ht.rpc.Im;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class p {
    public static io.grpc.stub.j a(IMGrpc.AsyncService asyncService, io.grpc.stub.j jVar) {
        return io.grpc.stub.i.c(IMGrpc.getReceiveMessageMethod(), jVar);
    }

    public static void b(IMGrpc.AsyncService asyncService, Im.SendMessageRequest sendMessageRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IMGrpc.getSendMessageMethod(), jVar);
    }
}
