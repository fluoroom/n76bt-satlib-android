package com.benshikj.ht.rpc;

import com.benshikj.ht.rpc.DeviceManagementGrpc;
import com.benshikj.ht.rpc.Dm;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class d {
    public static void a(DeviceManagementGrpc.AsyncService asyncService, Dm.CheckFirmwareUpdateRequest checkFirmwareUpdateRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(DeviceManagementGrpc.getCheckFirmwareUpdateMethod(), jVar);
    }

    public static void b(DeviceManagementGrpc.AsyncService asyncService, Dm.GetDeviceRegTimesRequest getDeviceRegTimesRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(DeviceManagementGrpc.getGetRegTimesMethod(), jVar);
    }

    public static void c(DeviceManagementGrpc.AsyncService asyncService, Dm.SetDeviceRegTimesRequest setDeviceRegTimesRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(DeviceManagementGrpc.getSetRegTimesMethod(), jVar);
    }
}
