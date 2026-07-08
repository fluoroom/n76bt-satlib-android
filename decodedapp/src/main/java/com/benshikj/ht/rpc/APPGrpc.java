package com.benshikj.ht.rpc;

import com.benshikj.ht.rpc.App;
import com.google.protobuf.r;
import io.grpc.stub.d;
import io.grpc.stub.i;
import qb.a1;

/* JADX INFO: loaded from: classes.dex */
public final class APPGrpc {
    private static final int METHODID_CHECK_UPDATE = 0;
    public static final String SERVICE_NAME = "benshikj.APP";
    private static volatile qb.a1 getCheckUpdateMethod;
    private static volatile qb.s1 serviceDescriptor;

    private static abstract class APPBaseDescriptorSupplier {
        APPBaseDescriptorSupplier() {
        }

        public r.h getFileDescriptor() {
            return App.getDescriptor();
        }

        public r.m getServiceDescriptor() {
            return getFileDescriptor().j("APP");
        }
    }

    public static final class APPBlockingStub extends io.grpc.stub.b {
        public App.CheckUpdateResult checkUpdate(App.CheckUpdateRequest checkUpdateRequest) {
            return (App.CheckUpdateResult) io.grpc.stub.h.g(getChannel(), APPGrpc.getCheckUpdateMethod(), getCallOptions(), checkUpdateRequest);
        }

        private APPBlockingStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public APPBlockingStub build(qb.d dVar, qb.c cVar) {
            return new APPBlockingStub(dVar, cVar);
        }
    }

    public static final class APPBlockingV2Stub extends io.grpc.stub.b {
        public App.CheckUpdateResult checkUpdate(App.CheckUpdateRequest checkUpdateRequest) throws qb.v1 {
            return (App.CheckUpdateResult) io.grpc.stub.h.h(getChannel(), APPGrpc.getCheckUpdateMethod(), getCallOptions(), checkUpdateRequest);
        }

        private APPBlockingV2Stub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public APPBlockingV2Stub build(qb.d dVar, qb.c cVar) {
            return new APPBlockingV2Stub(dVar, cVar);
        }
    }

    private static final class APPFileDescriptorSupplier extends APPBaseDescriptorSupplier {
        APPFileDescriptorSupplier() {
        }
    }

    public static final class APPFutureStub extends io.grpc.stub.c {
        public com.google.common.util.concurrent.g checkUpdate(App.CheckUpdateRequest checkUpdateRequest) {
            return io.grpc.stub.h.j(getChannel().d(APPGrpc.getCheckUpdateMethod(), getCallOptions()), checkUpdateRequest);
        }

        private APPFutureStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public APPFutureStub build(qb.d dVar, qb.c cVar) {
            return new APPFutureStub(dVar, cVar);
        }
    }

    public static abstract class APPImplBase implements AsyncService {
        public final qb.r1 bindService() {
            return APPGrpc.bindService(this);
        }

        @Override // com.benshikj.ht.rpc.APPGrpc.AsyncService
        public /* synthetic */ void checkUpdate(App.CheckUpdateRequest checkUpdateRequest, io.grpc.stub.j jVar) {
            a.a(this, checkUpdateRequest, jVar);
        }
    }

    private static final class APPMethodDescriptorSupplier extends APPBaseDescriptorSupplier {
        private final String methodName;

        APPMethodDescriptorSupplier(String str) {
            this.methodName = str;
        }

        public r.j getMethodDescriptor() {
            return getServiceDescriptor().i(this.methodName);
        }
    }

    public static final class APPStub extends io.grpc.stub.a {
        public void checkUpdate(App.CheckUpdateRequest checkUpdateRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(APPGrpc.getCheckUpdateMethod(), getCallOptions()), checkUpdateRequest, jVar);
        }

        private APPStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public APPStub build(qb.d dVar, qb.c cVar) {
            return new APPStub(dVar, cVar);
        }
    }

    public interface AsyncService {
        void checkUpdate(App.CheckUpdateRequest checkUpdateRequest, io.grpc.stub.j jVar);
    }

    private APPGrpc() {
    }

    public static final qb.r1 bindService(AsyncService asyncService) {
        return qb.r1.a(getServiceDescriptor()).a(getCheckUpdateMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 0))).c();
    }

    public static qb.a1 getCheckUpdateMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getCheckUpdateMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (APPGrpc.class) {
            try {
                a1VarA = getCheckUpdateMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "CheckUpdate")).e(true).c(vb.a.a(App.CheckUpdateRequest.getDefaultInstance())).d(vb.a.a(App.CheckUpdateResult.getDefaultInstance())).f(new APPMethodDescriptorSupplier("CheckUpdate")).a();
                    getCheckUpdateMethod = a1VarA;
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
        synchronized (APPGrpc.class) {
            try {
                s1VarG = serviceDescriptor;
                if (s1VarG == null) {
                    s1VarG = qb.s1.c(SERVICE_NAME).i(new APPFileDescriptorSupplier()).f(getCheckUpdateMethod()).g();
                    serviceDescriptor = s1VarG;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s1VarG;
    }

    public static APPBlockingStub newBlockingStub(qb.d dVar) {
        return (APPBlockingStub) io.grpc.stub.b.newStub(new d.a() { // from class: com.benshikj.ht.rpc.APPGrpc.3
            @Override // io.grpc.stub.d.a
            public APPBlockingStub newStub(qb.d dVar2, qb.c cVar) {
                return new APPBlockingStub(dVar2, cVar);
            }
        }, dVar);
    }

    public static APPBlockingV2Stub newBlockingV2Stub(qb.d dVar) {
        return (APPBlockingV2Stub) io.grpc.stub.b.newStub(new d.a() { // from class: com.benshikj.ht.rpc.APPGrpc.2
            @Override // io.grpc.stub.d.a
            public APPBlockingV2Stub newStub(qb.d dVar2, qb.c cVar) {
                return new APPBlockingV2Stub(dVar2, cVar);
            }
        }, dVar);
    }

    public static APPFutureStub newFutureStub(qb.d dVar) {
        return (APPFutureStub) io.grpc.stub.c.newStub(new d.a() { // from class: com.benshikj.ht.rpc.APPGrpc.4
            @Override // io.grpc.stub.d.a
            public APPFutureStub newStub(qb.d dVar2, qb.c cVar) {
                return new APPFutureStub(dVar2, cVar);
            }
        }, dVar);
    }

    public static APPStub newStub(qb.d dVar) {
        return (APPStub) io.grpc.stub.a.newStub(new d.a() { // from class: com.benshikj.ht.rpc.APPGrpc.1
            @Override // io.grpc.stub.d.a
            public APPStub newStub(qb.d dVar2, qb.c cVar) {
                return new APPStub(dVar2, cVar);
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
            this.serviceImpl.checkUpdate((App.CheckUpdateRequest) req, jVar);
        }

        public io.grpc.stub.j invoke(io.grpc.stub.j jVar) {
            throw new AssertionError();
        }
    }
}
