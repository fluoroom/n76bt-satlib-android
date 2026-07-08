package com.benshikj.ht.rpc;

import com.benshikj.ht.rpc.Dm;
import com.google.protobuf.r;
import io.grpc.stub.d;
import io.grpc.stub.i;
import qb.a1;

/* JADX INFO: loaded from: classes.dex */
public final class DeviceManagementGrpc {
    private static final int METHODID_CHECK_FIRMWARE_UPDATE = 2;
    private static final int METHODID_GET_REG_TIMES = 0;
    private static final int METHODID_SET_REG_TIMES = 1;
    public static final String SERVICE_NAME = "benshikj.DeviceManagement";
    private static volatile qb.a1 getCheckFirmwareUpdateMethod;
    private static volatile qb.a1 getGetRegTimesMethod;
    private static volatile qb.a1 getSetRegTimesMethod;
    private static volatile qb.s1 serviceDescriptor;

    /* JADX INFO: renamed from: com.benshikj.ht.rpc.DeviceManagementGrpc$1 */
    class AnonymousClass1 implements d.a {
        AnonymousClass1() {
        }

        @Override // io.grpc.stub.d.a
        public DeviceManagementStub newStub(qb.d dVar, qb.c cVar) {
            return new DeviceManagementStub(dVar, cVar);
        }
    }

    /* JADX INFO: renamed from: com.benshikj.ht.rpc.DeviceManagementGrpc$2 */
    class AnonymousClass2 implements d.a {
        AnonymousClass2() {
        }

        @Override // io.grpc.stub.d.a
        public DeviceManagementBlockingV2Stub newStub(qb.d dVar, qb.c cVar) {
            return new DeviceManagementBlockingV2Stub(dVar, cVar);
        }
    }

    /* JADX INFO: renamed from: com.benshikj.ht.rpc.DeviceManagementGrpc$3 */
    class AnonymousClass3 implements d.a {
        AnonymousClass3() {
        }

        @Override // io.grpc.stub.d.a
        public DeviceManagementBlockingStub newStub(qb.d dVar, qb.c cVar) {
            return new DeviceManagementBlockingStub(dVar, cVar);
        }
    }

    /* JADX INFO: renamed from: com.benshikj.ht.rpc.DeviceManagementGrpc$4 */
    class AnonymousClass4 implements d.a {
        AnonymousClass4() {
        }

        @Override // io.grpc.stub.d.a
        public DeviceManagementFutureStub newStub(qb.d dVar, qb.c cVar) {
            return new DeviceManagementFutureStub(dVar, cVar);
        }
    }

    public interface AsyncService {
        void checkFirmwareUpdate(Dm.CheckFirmwareUpdateRequest checkFirmwareUpdateRequest, io.grpc.stub.j jVar);

        void getRegTimes(Dm.GetDeviceRegTimesRequest getDeviceRegTimesRequest, io.grpc.stub.j jVar);

        void setRegTimes(Dm.SetDeviceRegTimesRequest setDeviceRegTimesRequest, io.grpc.stub.j jVar);
    }

    private static abstract class DeviceManagementBaseDescriptorSupplier {
        DeviceManagementBaseDescriptorSupplier() {
        }

        public r.h getFileDescriptor() {
            return Dm.getDescriptor();
        }

        public r.m getServiceDescriptor() {
            return getFileDescriptor().j("DeviceManagement");
        }
    }

    public static final class DeviceManagementBlockingStub extends io.grpc.stub.b {
        /* synthetic */ DeviceManagementBlockingStub(qb.d dVar, qb.c cVar, AnonymousClass1 anonymousClass1) {
            this(dVar, cVar);
        }

        public Dm.CheckFirmwareUpdateResult checkFirmwareUpdate(Dm.CheckFirmwareUpdateRequest checkFirmwareUpdateRequest) {
            return (Dm.CheckFirmwareUpdateResult) io.grpc.stub.h.g(getChannel(), DeviceManagementGrpc.getCheckFirmwareUpdateMethod(), getCallOptions(), checkFirmwareUpdateRequest);
        }

        public Dm.DeviceRegTimes getRegTimes(Dm.GetDeviceRegTimesRequest getDeviceRegTimesRequest) {
            return (Dm.DeviceRegTimes) io.grpc.stub.h.g(getChannel(), DeviceManagementGrpc.getGetRegTimesMethod(), getCallOptions(), getDeviceRegTimesRequest);
        }

        public Dm.DeviceRegTimes setRegTimes(Dm.SetDeviceRegTimesRequest setDeviceRegTimesRequest) {
            return (Dm.DeviceRegTimes) io.grpc.stub.h.g(getChannel(), DeviceManagementGrpc.getSetRegTimesMethod(), getCallOptions(), setDeviceRegTimesRequest);
        }

        private DeviceManagementBlockingStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        @Override // io.grpc.stub.d
        public DeviceManagementBlockingStub build(qb.d dVar, qb.c cVar) {
            return new DeviceManagementBlockingStub(dVar, cVar);
        }
    }

    public static final class DeviceManagementBlockingV2Stub extends io.grpc.stub.b {
        /* synthetic */ DeviceManagementBlockingV2Stub(qb.d dVar, qb.c cVar, AnonymousClass1 anonymousClass1) {
            this(dVar, cVar);
        }

        public Dm.CheckFirmwareUpdateResult checkFirmwareUpdate(Dm.CheckFirmwareUpdateRequest checkFirmwareUpdateRequest) throws qb.v1 {
            return (Dm.CheckFirmwareUpdateResult) io.grpc.stub.h.h(getChannel(), DeviceManagementGrpc.getCheckFirmwareUpdateMethod(), getCallOptions(), checkFirmwareUpdateRequest);
        }

        public Dm.DeviceRegTimes getRegTimes(Dm.GetDeviceRegTimesRequest getDeviceRegTimesRequest) throws qb.v1 {
            return (Dm.DeviceRegTimes) io.grpc.stub.h.h(getChannel(), DeviceManagementGrpc.getGetRegTimesMethod(), getCallOptions(), getDeviceRegTimesRequest);
        }

        public Dm.DeviceRegTimes setRegTimes(Dm.SetDeviceRegTimesRequest setDeviceRegTimesRequest) throws qb.v1 {
            return (Dm.DeviceRegTimes) io.grpc.stub.h.h(getChannel(), DeviceManagementGrpc.getSetRegTimesMethod(), getCallOptions(), setDeviceRegTimesRequest);
        }

        private DeviceManagementBlockingV2Stub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        @Override // io.grpc.stub.d
        public DeviceManagementBlockingV2Stub build(qb.d dVar, qb.c cVar) {
            return new DeviceManagementBlockingV2Stub(dVar, cVar);
        }
    }

    private static final class DeviceManagementFileDescriptorSupplier extends DeviceManagementBaseDescriptorSupplier {
        DeviceManagementFileDescriptorSupplier() {
        }
    }

    public static final class DeviceManagementFutureStub extends io.grpc.stub.c {
        /* synthetic */ DeviceManagementFutureStub(qb.d dVar, qb.c cVar, AnonymousClass1 anonymousClass1) {
            this(dVar, cVar);
        }

        public com.google.common.util.concurrent.g checkFirmwareUpdate(Dm.CheckFirmwareUpdateRequest checkFirmwareUpdateRequest) {
            return io.grpc.stub.h.j(getChannel().d(DeviceManagementGrpc.getCheckFirmwareUpdateMethod(), getCallOptions()), checkFirmwareUpdateRequest);
        }

        public com.google.common.util.concurrent.g getRegTimes(Dm.GetDeviceRegTimesRequest getDeviceRegTimesRequest) {
            return io.grpc.stub.h.j(getChannel().d(DeviceManagementGrpc.getGetRegTimesMethod(), getCallOptions()), getDeviceRegTimesRequest);
        }

        public com.google.common.util.concurrent.g setRegTimes(Dm.SetDeviceRegTimesRequest setDeviceRegTimesRequest) {
            return io.grpc.stub.h.j(getChannel().d(DeviceManagementGrpc.getSetRegTimesMethod(), getCallOptions()), setDeviceRegTimesRequest);
        }

        private DeviceManagementFutureStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        @Override // io.grpc.stub.d
        public DeviceManagementFutureStub build(qb.d dVar, qb.c cVar) {
            return new DeviceManagementFutureStub(dVar, cVar);
        }
    }

    public static abstract class DeviceManagementImplBase implements AsyncService {
        public final qb.r1 bindService() {
            return DeviceManagementGrpc.bindService(this);
        }

        @Override // com.benshikj.ht.rpc.DeviceManagementGrpc.AsyncService
        public /* synthetic */ void checkFirmwareUpdate(Dm.CheckFirmwareUpdateRequest checkFirmwareUpdateRequest, io.grpc.stub.j jVar) {
            d.a(this, checkFirmwareUpdateRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.DeviceManagementGrpc.AsyncService
        public /* synthetic */ void getRegTimes(Dm.GetDeviceRegTimesRequest getDeviceRegTimesRequest, io.grpc.stub.j jVar) {
            d.b(this, getDeviceRegTimesRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.DeviceManagementGrpc.AsyncService
        public /* synthetic */ void setRegTimes(Dm.SetDeviceRegTimesRequest setDeviceRegTimesRequest, io.grpc.stub.j jVar) {
            d.c(this, setDeviceRegTimesRequest, jVar);
        }
    }

    private static final class DeviceManagementMethodDescriptorSupplier extends DeviceManagementBaseDescriptorSupplier {
        private final String methodName;

        DeviceManagementMethodDescriptorSupplier(String str) {
            this.methodName = str;
        }

        public r.j getMethodDescriptor() {
            return getServiceDescriptor().i(this.methodName);
        }
    }

    public static final class DeviceManagementStub extends io.grpc.stub.a {
        /* synthetic */ DeviceManagementStub(qb.d dVar, qb.c cVar, AnonymousClass1 anonymousClass1) {
            this(dVar, cVar);
        }

        public void checkFirmwareUpdate(Dm.CheckFirmwareUpdateRequest checkFirmwareUpdateRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(DeviceManagementGrpc.getCheckFirmwareUpdateMethod(), getCallOptions()), checkFirmwareUpdateRequest, jVar);
        }

        public void getRegTimes(Dm.GetDeviceRegTimesRequest getDeviceRegTimesRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(DeviceManagementGrpc.getGetRegTimesMethod(), getCallOptions()), getDeviceRegTimesRequest, jVar);
        }

        public void setRegTimes(Dm.SetDeviceRegTimesRequest setDeviceRegTimesRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(DeviceManagementGrpc.getSetRegTimesMethod(), getCallOptions()), setDeviceRegTimesRequest, jVar);
        }

        private DeviceManagementStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        @Override // io.grpc.stub.d
        public DeviceManagementStub build(qb.d dVar, qb.c cVar) {
            return new DeviceManagementStub(dVar, cVar);
        }
    }

    private DeviceManagementGrpc() {
    }

    public static final qb.r1 bindService(AsyncService asyncService) {
        return qb.r1.a(getServiceDescriptor()).a(getGetRegTimesMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 0))).a(getSetRegTimesMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 1))).a(getCheckFirmwareUpdateMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 2))).c();
    }

    public static qb.a1 getCheckFirmwareUpdateMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getCheckFirmwareUpdateMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (DeviceManagementGrpc.class) {
            try {
                a1VarA = getCheckFirmwareUpdateMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "CheckFirmwareUpdate")).e(true).c(vb.a.a(Dm.CheckFirmwareUpdateRequest.getDefaultInstance())).d(vb.a.a(Dm.CheckFirmwareUpdateResult.getDefaultInstance())).f(new DeviceManagementMethodDescriptorSupplier("CheckFirmwareUpdate")).a();
                    getCheckFirmwareUpdateMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetRegTimesMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetRegTimesMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (DeviceManagementGrpc.class) {
            try {
                a1VarA = getGetRegTimesMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetRegTimes")).e(true).c(vb.a.a(Dm.GetDeviceRegTimesRequest.getDefaultInstance())).d(vb.a.a(Dm.DeviceRegTimes.getDefaultInstance())).f(new DeviceManagementMethodDescriptorSupplier("GetRegTimes")).a();
                    getGetRegTimesMethod = a1VarA;
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
        synchronized (DeviceManagementGrpc.class) {
            try {
                s1VarG = serviceDescriptor;
                if (s1VarG == null) {
                    s1VarG = qb.s1.c(SERVICE_NAME).i(new DeviceManagementFileDescriptorSupplier()).f(getGetRegTimesMethod()).f(getSetRegTimesMethod()).f(getCheckFirmwareUpdateMethod()).g();
                    serviceDescriptor = s1VarG;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s1VarG;
    }

    public static qb.a1 getSetRegTimesMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getSetRegTimesMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (DeviceManagementGrpc.class) {
            try {
                a1VarA = getSetRegTimesMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "SetRegTimes")).e(true).c(vb.a.a(Dm.SetDeviceRegTimesRequest.getDefaultInstance())).d(vb.a.a(Dm.DeviceRegTimes.getDefaultInstance())).f(new DeviceManagementMethodDescriptorSupplier("SetRegTimes")).a();
                    getSetRegTimesMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static DeviceManagementBlockingStub newBlockingStub(qb.d dVar) {
        return (DeviceManagementBlockingStub) io.grpc.stub.b.newStub(new d.a() { // from class: com.benshikj.ht.rpc.DeviceManagementGrpc.3
            AnonymousClass3() {
            }

            @Override // io.grpc.stub.d.a
            public DeviceManagementBlockingStub newStub(qb.d dVar2, qb.c cVar) {
                return new DeviceManagementBlockingStub(dVar2, cVar);
            }
        }, dVar);
    }

    public static DeviceManagementBlockingV2Stub newBlockingV2Stub(qb.d dVar) {
        return (DeviceManagementBlockingV2Stub) io.grpc.stub.b.newStub(new d.a() { // from class: com.benshikj.ht.rpc.DeviceManagementGrpc.2
            AnonymousClass2() {
            }

            @Override // io.grpc.stub.d.a
            public DeviceManagementBlockingV2Stub newStub(qb.d dVar2, qb.c cVar) {
                return new DeviceManagementBlockingV2Stub(dVar2, cVar);
            }
        }, dVar);
    }

    public static DeviceManagementFutureStub newFutureStub(qb.d dVar) {
        return (DeviceManagementFutureStub) io.grpc.stub.c.newStub(new d.a() { // from class: com.benshikj.ht.rpc.DeviceManagementGrpc.4
            AnonymousClass4() {
            }

            @Override // io.grpc.stub.d.a
            public DeviceManagementFutureStub newStub(qb.d dVar2, qb.c cVar) {
                return new DeviceManagementFutureStub(dVar2, cVar);
            }
        }, dVar);
    }

    public static DeviceManagementStub newStub(qb.d dVar) {
        return (DeviceManagementStub) io.grpc.stub.a.newStub(new d.a() { // from class: com.benshikj.ht.rpc.DeviceManagementGrpc.1
            AnonymousClass1() {
            }

            @Override // io.grpc.stub.d.a
            public DeviceManagementStub newStub(qb.d dVar2, qb.c cVar) {
                return new DeviceManagementStub(dVar2, cVar);
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
            int i10 = this.methodId;
            if (i10 == 0) {
                this.serviceImpl.getRegTimes((Dm.GetDeviceRegTimesRequest) req, jVar);
            } else if (i10 == 1) {
                this.serviceImpl.setRegTimes((Dm.SetDeviceRegTimesRequest) req, jVar);
            } else {
                if (i10 != 2) {
                    throw new AssertionError();
                }
                this.serviceImpl.checkFirmwareUpdate((Dm.CheckFirmwareUpdateRequest) req, jVar);
            }
        }

        public io.grpc.stub.j invoke(io.grpc.stub.j jVar) {
            throw new AssertionError();
        }
    }
}
