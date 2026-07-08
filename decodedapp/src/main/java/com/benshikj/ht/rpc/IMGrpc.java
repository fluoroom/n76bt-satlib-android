package com.benshikj.ht.rpc;

import com.benshikj.ht.rpc.Im;
import com.google.protobuf.r;
import io.grpc.stub.d;
import io.grpc.stub.i;
import qb.a1;

/* JADX INFO: loaded from: classes.dex */
public final class IMGrpc {
    private static final int METHODID_RECEIVE_MESSAGE = 1;
    private static final int METHODID_SEND_MESSAGE = 0;
    public static final String SERVICE_NAME = "benshikj.IM";
    private static volatile qb.a1 getReceiveMessageMethod;
    private static volatile qb.a1 getSendMessageMethod;
    private static volatile qb.s1 serviceDescriptor;

    public interface AsyncService {
        io.grpc.stub.j receiveMessage(io.grpc.stub.j jVar);

        void sendMessage(Im.SendMessageRequest sendMessageRequest, io.grpc.stub.j jVar);
    }

    private static abstract class IMBaseDescriptorSupplier {
        IMBaseDescriptorSupplier() {
        }

        public r.h getFileDescriptor() {
            return Im.getDescriptor();
        }

        public r.m getServiceDescriptor() {
            return getFileDescriptor().j("IM");
        }
    }

    public static final class IMBlockingStub extends io.grpc.stub.b {
        public Im.SendMessageResult sendMessage(Im.SendMessageRequest sendMessageRequest) {
            return (Im.SendMessageResult) io.grpc.stub.h.g(getChannel(), IMGrpc.getSendMessageMethod(), getCallOptions(), sendMessageRequest);
        }

        private IMBlockingStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public IMBlockingStub build(qb.d dVar, qb.c cVar) {
            return new IMBlockingStub(dVar, cVar);
        }
    }

    public static final class IMBlockingV2Stub extends io.grpc.stub.b {
        public io.grpc.stub.e receiveMessage() {
            return io.grpc.stub.h.f(getChannel(), IMGrpc.getReceiveMessageMethod(), getCallOptions());
        }

        public Im.SendMessageResult sendMessage(Im.SendMessageRequest sendMessageRequest) throws qb.v1 {
            return (Im.SendMessageResult) io.grpc.stub.h.h(getChannel(), IMGrpc.getSendMessageMethod(), getCallOptions(), sendMessageRequest);
        }

        private IMBlockingV2Stub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public IMBlockingV2Stub build(qb.d dVar, qb.c cVar) {
            return new IMBlockingV2Stub(dVar, cVar);
        }
    }

    private static final class IMFileDescriptorSupplier extends IMBaseDescriptorSupplier {
        IMFileDescriptorSupplier() {
        }
    }

    public static final class IMFutureStub extends io.grpc.stub.c {
        public com.google.common.util.concurrent.g sendMessage(Im.SendMessageRequest sendMessageRequest) {
            return io.grpc.stub.h.j(getChannel().d(IMGrpc.getSendMessageMethod(), getCallOptions()), sendMessageRequest);
        }

        private IMFutureStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public IMFutureStub build(qb.d dVar, qb.c cVar) {
            return new IMFutureStub(dVar, cVar);
        }
    }

    public static abstract class IMImplBase implements AsyncService {
        public final qb.r1 bindService() {
            return IMGrpc.bindService(this);
        }

        @Override // com.benshikj.ht.rpc.IMGrpc.AsyncService
        public /* synthetic */ io.grpc.stub.j receiveMessage(io.grpc.stub.j jVar) {
            return p.a(this, jVar);
        }

        @Override // com.benshikj.ht.rpc.IMGrpc.AsyncService
        public /* synthetic */ void sendMessage(Im.SendMessageRequest sendMessageRequest, io.grpc.stub.j jVar) {
            p.b(this, sendMessageRequest, jVar);
        }
    }

    private static final class IMMethodDescriptorSupplier extends IMBaseDescriptorSupplier {
        private final String methodName;

        IMMethodDescriptorSupplier(String str) {
            this.methodName = str;
        }

        public r.j getMethodDescriptor() {
            return getServiceDescriptor().i(this.methodName);
        }
    }

    public static final class IMStub extends io.grpc.stub.a {
        public io.grpc.stub.j receiveMessage(io.grpc.stub.j jVar) {
            return io.grpc.stub.h.a(getChannel().d(IMGrpc.getReceiveMessageMethod(), getCallOptions()), jVar);
        }

        public void sendMessage(Im.SendMessageRequest sendMessageRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IMGrpc.getSendMessageMethod(), getCallOptions()), sendMessageRequest, jVar);
        }

        private IMStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public IMStub build(qb.d dVar, qb.c cVar) {
            return new IMStub(dVar, cVar);
        }
    }

    private IMGrpc() {
    }

    public static final qb.r1 bindService(AsyncService asyncService) {
        return qb.r1.a(getServiceDescriptor()).a(getSendMessageMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 0))).a(getReceiveMessageMethod(), io.grpc.stub.i.a(new MethodHandlers(asyncService, 1))).c();
    }

    public static qb.a1 getReceiveMessageMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getReceiveMessageMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IMGrpc.class) {
            try {
                a1VarA = getReceiveMessageMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.BIDI_STREAMING).b(qb.a1.b(SERVICE_NAME, "ReceiveMessage")).e(true).c(vb.a.a(Im.ReceiveMessageRequest.getDefaultInstance())).d(vb.a.a(Im.ReceiveMessageResult.getDefaultInstance())).f(new IMMethodDescriptorSupplier("ReceiveMessage")).a();
                    getReceiveMessageMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getSendMessageMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getSendMessageMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IMGrpc.class) {
            try {
                a1VarA = getSendMessageMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "SendMessage")).e(true).c(vb.a.a(Im.SendMessageRequest.getDefaultInstance())).d(vb.a.a(Im.SendMessageResult.getDefaultInstance())).f(new IMMethodDescriptorSupplier("SendMessage")).a();
                    getSendMessageMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.s1 getServiceDescriptor() {
        qb.s1 s1VarG;
        qb.s1 s1Var = serviceDescriptor;
        if (s1Var != null) {
            return s1Var;
        }
        synchronized (IMGrpc.class) {
            try {
                s1VarG = serviceDescriptor;
                if (s1VarG == null) {
                    s1VarG = qb.s1.c(SERVICE_NAME).i(new IMFileDescriptorSupplier()).f(getSendMessageMethod()).f(getReceiveMessageMethod()).g();
                    serviceDescriptor = s1VarG;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s1VarG;
    }

    public static IMBlockingStub newBlockingStub(qb.d dVar) {
        return (IMBlockingStub) io.grpc.stub.b.newStub(new d.a() { // from class: com.benshikj.ht.rpc.IMGrpc.3
            @Override // io.grpc.stub.d.a
            public IMBlockingStub newStub(qb.d dVar2, qb.c cVar) {
                return new IMBlockingStub(dVar2, cVar);
            }
        }, dVar);
    }

    public static IMBlockingV2Stub newBlockingV2Stub(qb.d dVar) {
        return (IMBlockingV2Stub) io.grpc.stub.b.newStub(new d.a() { // from class: com.benshikj.ht.rpc.IMGrpc.2
            @Override // io.grpc.stub.d.a
            public IMBlockingV2Stub newStub(qb.d dVar2, qb.c cVar) {
                return new IMBlockingV2Stub(dVar2, cVar);
            }
        }, dVar);
    }

    public static IMFutureStub newFutureStub(qb.d dVar) {
        return (IMFutureStub) io.grpc.stub.c.newStub(new d.a() { // from class: com.benshikj.ht.rpc.IMGrpc.4
            @Override // io.grpc.stub.d.a
            public IMFutureStub newStub(qb.d dVar2, qb.c cVar) {
                return new IMFutureStub(dVar2, cVar);
            }
        }, dVar);
    }

    public static IMStub newStub(qb.d dVar) {
        return (IMStub) io.grpc.stub.a.newStub(new d.a() { // from class: com.benshikj.ht.rpc.IMGrpc.1
            @Override // io.grpc.stub.d.a
            public IMStub newStub(qb.d dVar2, qb.c cVar) {
                return new IMStub(dVar2, cVar);
            }
        }, dVar);
    }

    private static final class MethodHandlers<Req, Resp> implements i.g, i.d, i.b, i.a {
        private final int methodId;
        private final AsyncService serviceImpl;

        MethodHandlers(AsyncService asyncService, int i10) {
            this.serviceImpl = asyncService;
            this.methodId = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void invoke(Req req, io.grpc.stub.j jVar) {
            if (this.methodId != 0) {
                throw new AssertionError();
            }
            this.serviceImpl.sendMessage((Im.SendMessageRequest) req, jVar);
        }

        public io.grpc.stub.j invoke(io.grpc.stub.j jVar) {
            if (this.methodId == 1) {
                return this.serviceImpl.receiveMessage(jVar);
            }
            throw new AssertionError();
        }
    }
}
