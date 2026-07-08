package com.benshikj.ht.rpc;

import com.benshikj.ht.rpc.IHTGrpc;
import com.benshikj.ht.rpc.Im;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class n {
    public static void a(IHTGrpc.AsyncService asyncService, Im.DeleteChannelRequest deleteChannelRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getDeleteChannelMethod(), jVar);
    }

    public static void b(IHTGrpc.AsyncService asyncService, Im.GetChannelRequest getChannelRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getGetChannelMethod(), jVar);
    }

    public static void c(IHTGrpc.AsyncService asyncService, Im.GetChannelConnectionParmRequest getChannelConnectionParmRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getGetChannelConnectionParmMethod(), jVar);
    }

    public static void d(IHTGrpc.AsyncService asyncService, Im.GetChannelMembersRequest getChannelMembersRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getGetChannelMembersMethod(), jVar);
    }

    public static void e(IHTGrpc.AsyncService asyncService, Im.GetChannelStatusRequest getChannelStatusRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getGetChannelStatusMethod(), jVar);
    }

    public static void f(IHTGrpc.AsyncService asyncService, Im.GetChannelsRequest getChannelsRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getGetChannelsMethod(), jVar);
    }

    public static void g(IHTGrpc.AsyncService asyncService, Im.GetImUrlRequest getImUrlRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getGetImUrlMethod(), jVar);
    }

    public static void h(IHTGrpc.AsyncService asyncService, Im.GetServerLocationsRequest getServerLocationsRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getGetServerLocationsMethod(), jVar);
    }

    public static void i(IHTGrpc.AsyncService asyncService, Im.GetUserChannelsRequest getUserChannelsRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getGetUserChannelsMethod(), jVar);
    }

    public static void j(IHTGrpc.AsyncService asyncService, Im.JoinChannelRequest joinChannelRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getJoinChannelMethod(), jVar);
    }

    public static void k(IHTGrpc.AsyncService asyncService, Im.QuitChannelRequest quitChannelRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getQuitChannelMethod(), jVar);
    }

    public static void l(IHTGrpc.AsyncService asyncService, Im.RemoveUserFromChannelRequest removeUserFromChannelRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getRemoveUserFromChannelMethod(), jVar);
    }

    public static void m(IHTGrpc.AsyncService asyncService, Im.SaveChannelRequest saveChannelRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getSaveChannelMethod(), jVar);
    }

    public static void n(IHTGrpc.AsyncService asyncService, Im.SetChannelMemberAuthRequest setChannelMemberAuthRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getSetChannelMemberAuthMethod(), jVar);
    }

    public static void o(IHTGrpc.AsyncService asyncService, Im.SetChannelSpeakLevelRequest setChannelSpeakLevelRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(IHTGrpc.getSetChannelSpeakLevelMethod(), jVar);
    }
}
