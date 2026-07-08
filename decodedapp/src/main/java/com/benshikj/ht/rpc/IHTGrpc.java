package com.benshikj.ht.rpc;

import com.benshikj.ht.rpc.Im;
import com.google.protobuf.r;
import io.grpc.stub.d;
import io.grpc.stub.i;
import qb.a1;

/* JADX INFO: loaded from: classes.dex */
public final class IHTGrpc {
    private static final int METHODID_DELETE_CHANNEL = 5;
    private static final int METHODID_GET_CHANNEL = 8;
    private static final int METHODID_GET_CHANNELS = 0;
    private static final int METHODID_GET_CHANNEL_CONNECTION_PARM = 2;
    private static final int METHODID_GET_CHANNEL_MEMBERS = 10;
    private static final int METHODID_GET_CHANNEL_STATUS = 9;
    private static final int METHODID_GET_IM_URL = 14;
    private static final int METHODID_GET_SERVER_LOCATIONS = 13;
    private static final int METHODID_GET_USER_CHANNELS = 1;
    private static final int METHODID_JOIN_CHANNEL = 6;
    private static final int METHODID_QUIT_CHANNEL = 7;
    private static final int METHODID_REMOVE_USER_FROM_CHANNEL = 12;
    private static final int METHODID_SAVE_CHANNEL = 3;
    private static final int METHODID_SET_CHANNEL_MEMBER_AUTH = 11;
    private static final int METHODID_SET_CHANNEL_SPEAK_LEVEL = 4;
    public static final String SERVICE_NAME = "benshikj.IHT";
    private static volatile qb.a1 getDeleteChannelMethod;
    private static volatile qb.a1 getGetChannelConnectionParmMethod;
    private static volatile qb.a1 getGetChannelMembersMethod;
    private static volatile qb.a1 getGetChannelMethod;
    private static volatile qb.a1 getGetChannelStatusMethod;
    private static volatile qb.a1 getGetChannelsMethod;
    private static volatile qb.a1 getGetImUrlMethod;
    private static volatile qb.a1 getGetServerLocationsMethod;
    private static volatile qb.a1 getGetUserChannelsMethod;
    private static volatile qb.a1 getJoinChannelMethod;
    private static volatile qb.a1 getQuitChannelMethod;
    private static volatile qb.a1 getRemoveUserFromChannelMethod;
    private static volatile qb.a1 getSaveChannelMethod;
    private static volatile qb.a1 getSetChannelMemberAuthMethod;
    private static volatile qb.a1 getSetChannelSpeakLevelMethod;
    private static volatile qb.s1 serviceDescriptor;

    public interface AsyncService {
        void deleteChannel(Im.DeleteChannelRequest deleteChannelRequest, io.grpc.stub.j jVar);

        void getChannel(Im.GetChannelRequest getChannelRequest, io.grpc.stub.j jVar);

        void getChannelConnectionParm(Im.GetChannelConnectionParmRequest getChannelConnectionParmRequest, io.grpc.stub.j jVar);

        void getChannelMembers(Im.GetChannelMembersRequest getChannelMembersRequest, io.grpc.stub.j jVar);

        void getChannelStatus(Im.GetChannelStatusRequest getChannelStatusRequest, io.grpc.stub.j jVar);

        void getChannels(Im.GetChannelsRequest getChannelsRequest, io.grpc.stub.j jVar);

        void getImUrl(Im.GetImUrlRequest getImUrlRequest, io.grpc.stub.j jVar);

        void getServerLocations(Im.GetServerLocationsRequest getServerLocationsRequest, io.grpc.stub.j jVar);

        void getUserChannels(Im.GetUserChannelsRequest getUserChannelsRequest, io.grpc.stub.j jVar);

        void joinChannel(Im.JoinChannelRequest joinChannelRequest, io.grpc.stub.j jVar);

        void quitChannel(Im.QuitChannelRequest quitChannelRequest, io.grpc.stub.j jVar);

        void removeUserFromChannel(Im.RemoveUserFromChannelRequest removeUserFromChannelRequest, io.grpc.stub.j jVar);

        void saveChannel(Im.SaveChannelRequest saveChannelRequest, io.grpc.stub.j jVar);

        void setChannelMemberAuth(Im.SetChannelMemberAuthRequest setChannelMemberAuthRequest, io.grpc.stub.j jVar);

        void setChannelSpeakLevel(Im.SetChannelSpeakLevelRequest setChannelSpeakLevelRequest, io.grpc.stub.j jVar);
    }

    private static abstract class IHTBaseDescriptorSupplier {
        IHTBaseDescriptorSupplier() {
        }

        public r.h getFileDescriptor() {
            return Im.getDescriptor();
        }

        public r.m getServiceDescriptor() {
            return getFileDescriptor().j("IHT");
        }
    }

    public static final class IHTBlockingStub extends io.grpc.stub.b {
        public Im.DeleteChannelResult deleteChannel(Im.DeleteChannelRequest deleteChannelRequest) {
            return (Im.DeleteChannelResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getDeleteChannelMethod(), getCallOptions(), deleteChannelRequest);
        }

        public Im.GetChannelResult getChannel(Im.GetChannelRequest getChannelRequest) {
            return (Im.GetChannelResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getGetChannelMethod(), getCallOptions(), getChannelRequest);
        }

        public Im.GetChannelConnectionParmResult getChannelConnectionParm(Im.GetChannelConnectionParmRequest getChannelConnectionParmRequest) {
            return (Im.GetChannelConnectionParmResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getGetChannelConnectionParmMethod(), getCallOptions(), getChannelConnectionParmRequest);
        }

        public Im.GetChannelMembersResult getChannelMembers(Im.GetChannelMembersRequest getChannelMembersRequest) {
            return (Im.GetChannelMembersResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getGetChannelMembersMethod(), getCallOptions(), getChannelMembersRequest);
        }

        public Im.GetChannelStatusResult getChannelStatus(Im.GetChannelStatusRequest getChannelStatusRequest) {
            return (Im.GetChannelStatusResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getGetChannelStatusMethod(), getCallOptions(), getChannelStatusRequest);
        }

        public Im.GetChannelsResult getChannels(Im.GetChannelsRequest getChannelsRequest) {
            return (Im.GetChannelsResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getGetChannelsMethod(), getCallOptions(), getChannelsRequest);
        }

        public Im.GetImUrlResult getImUrl(Im.GetImUrlRequest getImUrlRequest) {
            return (Im.GetImUrlResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getGetImUrlMethod(), getCallOptions(), getImUrlRequest);
        }

        public Im.GetServerLocationsResult getServerLocations(Im.GetServerLocationsRequest getServerLocationsRequest) {
            return (Im.GetServerLocationsResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getGetServerLocationsMethod(), getCallOptions(), getServerLocationsRequest);
        }

        public Im.GetUserChannelsResult getUserChannels(Im.GetUserChannelsRequest getUserChannelsRequest) {
            return (Im.GetUserChannelsResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getGetUserChannelsMethod(), getCallOptions(), getUserChannelsRequest);
        }

        public Im.JoinChannelResult joinChannel(Im.JoinChannelRequest joinChannelRequest) {
            return (Im.JoinChannelResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getJoinChannelMethod(), getCallOptions(), joinChannelRequest);
        }

        public Im.QuitChannelResult quitChannel(Im.QuitChannelRequest quitChannelRequest) {
            return (Im.QuitChannelResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getQuitChannelMethod(), getCallOptions(), quitChannelRequest);
        }

        public Im.RemoveUserFromChannelResult removeUserFromChannel(Im.RemoveUserFromChannelRequest removeUserFromChannelRequest) {
            return (Im.RemoveUserFromChannelResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getRemoveUserFromChannelMethod(), getCallOptions(), removeUserFromChannelRequest);
        }

        public Im.SaveChannelResult saveChannel(Im.SaveChannelRequest saveChannelRequest) {
            return (Im.SaveChannelResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getSaveChannelMethod(), getCallOptions(), saveChannelRequest);
        }

        public Im.SetChannelMemberAuthResult setChannelMemberAuth(Im.SetChannelMemberAuthRequest setChannelMemberAuthRequest) {
            return (Im.SetChannelMemberAuthResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getSetChannelMemberAuthMethod(), getCallOptions(), setChannelMemberAuthRequest);
        }

        public Im.SetChannelSpeakLevelResult setChannelSpeakLevel(Im.SetChannelSpeakLevelRequest setChannelSpeakLevelRequest) {
            return (Im.SetChannelSpeakLevelResult) io.grpc.stub.h.g(getChannel(), IHTGrpc.getSetChannelSpeakLevelMethod(), getCallOptions(), setChannelSpeakLevelRequest);
        }

        private IHTBlockingStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public IHTBlockingStub build(qb.d dVar, qb.c cVar) {
            return new IHTBlockingStub(dVar, cVar);
        }
    }

    public static final class IHTBlockingV2Stub extends io.grpc.stub.b {
        public Im.DeleteChannelResult deleteChannel(Im.DeleteChannelRequest deleteChannelRequest) throws qb.v1 {
            return (Im.DeleteChannelResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getDeleteChannelMethod(), getCallOptions(), deleteChannelRequest);
        }

        public Im.GetChannelResult getChannel(Im.GetChannelRequest getChannelRequest) throws qb.v1 {
            return (Im.GetChannelResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getGetChannelMethod(), getCallOptions(), getChannelRequest);
        }

        public Im.GetChannelConnectionParmResult getChannelConnectionParm(Im.GetChannelConnectionParmRequest getChannelConnectionParmRequest) throws qb.v1 {
            return (Im.GetChannelConnectionParmResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getGetChannelConnectionParmMethod(), getCallOptions(), getChannelConnectionParmRequest);
        }

        public Im.GetChannelMembersResult getChannelMembers(Im.GetChannelMembersRequest getChannelMembersRequest) throws qb.v1 {
            return (Im.GetChannelMembersResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getGetChannelMembersMethod(), getCallOptions(), getChannelMembersRequest);
        }

        public Im.GetChannelStatusResult getChannelStatus(Im.GetChannelStatusRequest getChannelStatusRequest) throws qb.v1 {
            return (Im.GetChannelStatusResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getGetChannelStatusMethod(), getCallOptions(), getChannelStatusRequest);
        }

        public Im.GetChannelsResult getChannels(Im.GetChannelsRequest getChannelsRequest) throws qb.v1 {
            return (Im.GetChannelsResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getGetChannelsMethod(), getCallOptions(), getChannelsRequest);
        }

        public Im.GetImUrlResult getImUrl(Im.GetImUrlRequest getImUrlRequest) throws qb.v1 {
            return (Im.GetImUrlResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getGetImUrlMethod(), getCallOptions(), getImUrlRequest);
        }

        public Im.GetServerLocationsResult getServerLocations(Im.GetServerLocationsRequest getServerLocationsRequest) throws qb.v1 {
            return (Im.GetServerLocationsResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getGetServerLocationsMethod(), getCallOptions(), getServerLocationsRequest);
        }

        public Im.GetUserChannelsResult getUserChannels(Im.GetUserChannelsRequest getUserChannelsRequest) throws qb.v1 {
            return (Im.GetUserChannelsResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getGetUserChannelsMethod(), getCallOptions(), getUserChannelsRequest);
        }

        public Im.JoinChannelResult joinChannel(Im.JoinChannelRequest joinChannelRequest) throws qb.v1 {
            return (Im.JoinChannelResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getJoinChannelMethod(), getCallOptions(), joinChannelRequest);
        }

        public Im.QuitChannelResult quitChannel(Im.QuitChannelRequest quitChannelRequest) throws qb.v1 {
            return (Im.QuitChannelResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getQuitChannelMethod(), getCallOptions(), quitChannelRequest);
        }

        public Im.RemoveUserFromChannelResult removeUserFromChannel(Im.RemoveUserFromChannelRequest removeUserFromChannelRequest) throws qb.v1 {
            return (Im.RemoveUserFromChannelResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getRemoveUserFromChannelMethod(), getCallOptions(), removeUserFromChannelRequest);
        }

        public Im.SaveChannelResult saveChannel(Im.SaveChannelRequest saveChannelRequest) throws qb.v1 {
            return (Im.SaveChannelResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getSaveChannelMethod(), getCallOptions(), saveChannelRequest);
        }

        public Im.SetChannelMemberAuthResult setChannelMemberAuth(Im.SetChannelMemberAuthRequest setChannelMemberAuthRequest) throws qb.v1 {
            return (Im.SetChannelMemberAuthResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getSetChannelMemberAuthMethod(), getCallOptions(), setChannelMemberAuthRequest);
        }

        public Im.SetChannelSpeakLevelResult setChannelSpeakLevel(Im.SetChannelSpeakLevelRequest setChannelSpeakLevelRequest) throws qb.v1 {
            return (Im.SetChannelSpeakLevelResult) io.grpc.stub.h.h(getChannel(), IHTGrpc.getSetChannelSpeakLevelMethod(), getCallOptions(), setChannelSpeakLevelRequest);
        }

        private IHTBlockingV2Stub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public IHTBlockingV2Stub build(qb.d dVar, qb.c cVar) {
            return new IHTBlockingV2Stub(dVar, cVar);
        }
    }

    private static final class IHTFileDescriptorSupplier extends IHTBaseDescriptorSupplier {
        IHTFileDescriptorSupplier() {
        }
    }

    public static final class IHTFutureStub extends io.grpc.stub.c {
        public com.google.common.util.concurrent.g deleteChannel(Im.DeleteChannelRequest deleteChannelRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getDeleteChannelMethod(), getCallOptions()), deleteChannelRequest);
        }

        public com.google.common.util.concurrent.g getChannel(Im.GetChannelRequest getChannelRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getGetChannelMethod(), getCallOptions()), getChannelRequest);
        }

        public com.google.common.util.concurrent.g getChannelConnectionParm(Im.GetChannelConnectionParmRequest getChannelConnectionParmRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getGetChannelConnectionParmMethod(), getCallOptions()), getChannelConnectionParmRequest);
        }

        public com.google.common.util.concurrent.g getChannelMembers(Im.GetChannelMembersRequest getChannelMembersRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getGetChannelMembersMethod(), getCallOptions()), getChannelMembersRequest);
        }

        public com.google.common.util.concurrent.g getChannelStatus(Im.GetChannelStatusRequest getChannelStatusRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getGetChannelStatusMethod(), getCallOptions()), getChannelStatusRequest);
        }

        public com.google.common.util.concurrent.g getChannels(Im.GetChannelsRequest getChannelsRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getGetChannelsMethod(), getCallOptions()), getChannelsRequest);
        }

        public com.google.common.util.concurrent.g getImUrl(Im.GetImUrlRequest getImUrlRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getGetImUrlMethod(), getCallOptions()), getImUrlRequest);
        }

        public com.google.common.util.concurrent.g getServerLocations(Im.GetServerLocationsRequest getServerLocationsRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getGetServerLocationsMethod(), getCallOptions()), getServerLocationsRequest);
        }

        public com.google.common.util.concurrent.g getUserChannels(Im.GetUserChannelsRequest getUserChannelsRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getGetUserChannelsMethod(), getCallOptions()), getUserChannelsRequest);
        }

        public com.google.common.util.concurrent.g joinChannel(Im.JoinChannelRequest joinChannelRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getJoinChannelMethod(), getCallOptions()), joinChannelRequest);
        }

        public com.google.common.util.concurrent.g quitChannel(Im.QuitChannelRequest quitChannelRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getQuitChannelMethod(), getCallOptions()), quitChannelRequest);
        }

        public com.google.common.util.concurrent.g removeUserFromChannel(Im.RemoveUserFromChannelRequest removeUserFromChannelRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getRemoveUserFromChannelMethod(), getCallOptions()), removeUserFromChannelRequest);
        }

        public com.google.common.util.concurrent.g saveChannel(Im.SaveChannelRequest saveChannelRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getSaveChannelMethod(), getCallOptions()), saveChannelRequest);
        }

        public com.google.common.util.concurrent.g setChannelMemberAuth(Im.SetChannelMemberAuthRequest setChannelMemberAuthRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getSetChannelMemberAuthMethod(), getCallOptions()), setChannelMemberAuthRequest);
        }

        public com.google.common.util.concurrent.g setChannelSpeakLevel(Im.SetChannelSpeakLevelRequest setChannelSpeakLevelRequest) {
            return io.grpc.stub.h.j(getChannel().d(IHTGrpc.getSetChannelSpeakLevelMethod(), getCallOptions()), setChannelSpeakLevelRequest);
        }

        private IHTFutureStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public IHTFutureStub build(qb.d dVar, qb.c cVar) {
            return new IHTFutureStub(dVar, cVar);
        }
    }

    public static abstract class IHTImplBase implements AsyncService {
        public final qb.r1 bindService() {
            return IHTGrpc.bindService(this);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void deleteChannel(Im.DeleteChannelRequest deleteChannelRequest, io.grpc.stub.j jVar) {
            n.a(this, deleteChannelRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void getChannel(Im.GetChannelRequest getChannelRequest, io.grpc.stub.j jVar) {
            n.b(this, getChannelRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void getChannelConnectionParm(Im.GetChannelConnectionParmRequest getChannelConnectionParmRequest, io.grpc.stub.j jVar) {
            n.c(this, getChannelConnectionParmRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void getChannelMembers(Im.GetChannelMembersRequest getChannelMembersRequest, io.grpc.stub.j jVar) {
            n.d(this, getChannelMembersRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void getChannelStatus(Im.GetChannelStatusRequest getChannelStatusRequest, io.grpc.stub.j jVar) {
            n.e(this, getChannelStatusRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void getChannels(Im.GetChannelsRequest getChannelsRequest, io.grpc.stub.j jVar) {
            n.f(this, getChannelsRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void getImUrl(Im.GetImUrlRequest getImUrlRequest, io.grpc.stub.j jVar) {
            n.g(this, getImUrlRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void getServerLocations(Im.GetServerLocationsRequest getServerLocationsRequest, io.grpc.stub.j jVar) {
            n.h(this, getServerLocationsRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void getUserChannels(Im.GetUserChannelsRequest getUserChannelsRequest, io.grpc.stub.j jVar) {
            n.i(this, getUserChannelsRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void joinChannel(Im.JoinChannelRequest joinChannelRequest, io.grpc.stub.j jVar) {
            n.j(this, joinChannelRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void quitChannel(Im.QuitChannelRequest quitChannelRequest, io.grpc.stub.j jVar) {
            n.k(this, quitChannelRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void removeUserFromChannel(Im.RemoveUserFromChannelRequest removeUserFromChannelRequest, io.grpc.stub.j jVar) {
            n.l(this, removeUserFromChannelRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void saveChannel(Im.SaveChannelRequest saveChannelRequest, io.grpc.stub.j jVar) {
            n.m(this, saveChannelRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void setChannelMemberAuth(Im.SetChannelMemberAuthRequest setChannelMemberAuthRequest, io.grpc.stub.j jVar) {
            n.n(this, setChannelMemberAuthRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.IHTGrpc.AsyncService
        public /* synthetic */ void setChannelSpeakLevel(Im.SetChannelSpeakLevelRequest setChannelSpeakLevelRequest, io.grpc.stub.j jVar) {
            n.o(this, setChannelSpeakLevelRequest, jVar);
        }
    }

    private static final class IHTMethodDescriptorSupplier extends IHTBaseDescriptorSupplier {
        private final String methodName;

        IHTMethodDescriptorSupplier(String str) {
            this.methodName = str;
        }

        public r.j getMethodDescriptor() {
            return getServiceDescriptor().i(this.methodName);
        }
    }

    public static final class IHTStub extends io.grpc.stub.a {
        public void deleteChannel(Im.DeleteChannelRequest deleteChannelRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getDeleteChannelMethod(), getCallOptions()), deleteChannelRequest, jVar);
        }

        public void getChannel(Im.GetChannelRequest getChannelRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getGetChannelMethod(), getCallOptions()), getChannelRequest, jVar);
        }

        public void getChannelConnectionParm(Im.GetChannelConnectionParmRequest getChannelConnectionParmRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getGetChannelConnectionParmMethod(), getCallOptions()), getChannelConnectionParmRequest, jVar);
        }

        public void getChannelMembers(Im.GetChannelMembersRequest getChannelMembersRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getGetChannelMembersMethod(), getCallOptions()), getChannelMembersRequest, jVar);
        }

        public void getChannelStatus(Im.GetChannelStatusRequest getChannelStatusRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getGetChannelStatusMethod(), getCallOptions()), getChannelStatusRequest, jVar);
        }

        public void getChannels(Im.GetChannelsRequest getChannelsRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getGetChannelsMethod(), getCallOptions()), getChannelsRequest, jVar);
        }

        public void getImUrl(Im.GetImUrlRequest getImUrlRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getGetImUrlMethod(), getCallOptions()), getImUrlRequest, jVar);
        }

        public void getServerLocations(Im.GetServerLocationsRequest getServerLocationsRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getGetServerLocationsMethod(), getCallOptions()), getServerLocationsRequest, jVar);
        }

        public void getUserChannels(Im.GetUserChannelsRequest getUserChannelsRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getGetUserChannelsMethod(), getCallOptions()), getUserChannelsRequest, jVar);
        }

        public void joinChannel(Im.JoinChannelRequest joinChannelRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getJoinChannelMethod(), getCallOptions()), joinChannelRequest, jVar);
        }

        public void quitChannel(Im.QuitChannelRequest quitChannelRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getQuitChannelMethod(), getCallOptions()), quitChannelRequest, jVar);
        }

        public void removeUserFromChannel(Im.RemoveUserFromChannelRequest removeUserFromChannelRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getRemoveUserFromChannelMethod(), getCallOptions()), removeUserFromChannelRequest, jVar);
        }

        public void saveChannel(Im.SaveChannelRequest saveChannelRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getSaveChannelMethod(), getCallOptions()), saveChannelRequest, jVar);
        }

        public void setChannelMemberAuth(Im.SetChannelMemberAuthRequest setChannelMemberAuthRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getSetChannelMemberAuthMethod(), getCallOptions()), setChannelMemberAuthRequest, jVar);
        }

        public void setChannelSpeakLevel(Im.SetChannelSpeakLevelRequest setChannelSpeakLevelRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(IHTGrpc.getSetChannelSpeakLevelMethod(), getCallOptions()), setChannelSpeakLevelRequest, jVar);
        }

        private IHTStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public IHTStub build(qb.d dVar, qb.c cVar) {
            return new IHTStub(dVar, cVar);
        }
    }

    private IHTGrpc() {
    }

    public static final qb.r1 bindService(AsyncService asyncService) {
        return qb.r1.a(getServiceDescriptor()).a(getGetChannelsMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 0))).a(getGetUserChannelsMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 1))).a(getGetChannelConnectionParmMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 2))).a(getSaveChannelMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 3))).a(getSetChannelSpeakLevelMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 4))).a(getDeleteChannelMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 5))).a(getJoinChannelMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 6))).a(getQuitChannelMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 7))).a(getGetChannelMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 8))).a(getGetChannelStatusMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 9))).a(getGetChannelMembersMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 10))).a(getSetChannelMemberAuthMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 11))).a(getRemoveUserFromChannelMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 12))).a(getGetServerLocationsMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 13))).a(getGetImUrlMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 14))).c();
    }

    public static qb.a1 getDeleteChannelMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getDeleteChannelMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getDeleteChannelMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "DeleteChannel")).e(true).c(vb.a.a(Im.DeleteChannelRequest.getDefaultInstance())).d(vb.a.a(Im.DeleteChannelResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("DeleteChannel")).a();
                    getDeleteChannelMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetChannelConnectionParmMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetChannelConnectionParmMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getGetChannelConnectionParmMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetChannelConnectionParm")).e(true).c(vb.a.a(Im.GetChannelConnectionParmRequest.getDefaultInstance())).d(vb.a.a(Im.GetChannelConnectionParmResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("GetChannelConnectionParm")).a();
                    getGetChannelConnectionParmMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetChannelMembersMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetChannelMembersMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getGetChannelMembersMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetChannelMembers")).e(true).c(vb.a.a(Im.GetChannelMembersRequest.getDefaultInstance())).d(vb.a.a(Im.GetChannelMembersResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("GetChannelMembers")).a();
                    getGetChannelMembersMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetChannelMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetChannelMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getGetChannelMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetChannel")).e(true).c(vb.a.a(Im.GetChannelRequest.getDefaultInstance())).d(vb.a.a(Im.GetChannelResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("GetChannel")).a();
                    getGetChannelMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetChannelStatusMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetChannelStatusMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getGetChannelStatusMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetChannelStatus")).e(true).c(vb.a.a(Im.GetChannelStatusRequest.getDefaultInstance())).d(vb.a.a(Im.GetChannelStatusResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("GetChannelStatus")).a();
                    getGetChannelStatusMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetChannelsMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetChannelsMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getGetChannelsMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetChannels")).e(true).c(vb.a.a(Im.GetChannelsRequest.getDefaultInstance())).d(vb.a.a(Im.GetChannelsResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("GetChannels")).a();
                    getGetChannelsMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetImUrlMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetImUrlMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getGetImUrlMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetImUrl")).e(true).c(vb.a.a(Im.GetImUrlRequest.getDefaultInstance())).d(vb.a.a(Im.GetImUrlResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("GetImUrl")).a();
                    getGetImUrlMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetServerLocationsMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetServerLocationsMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getGetServerLocationsMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetServerLocations")).e(true).c(vb.a.a(Im.GetServerLocationsRequest.getDefaultInstance())).d(vb.a.a(Im.GetServerLocationsResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("GetServerLocations")).a();
                    getGetServerLocationsMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetUserChannelsMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetUserChannelsMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getGetUserChannelsMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetUserChannels")).e(true).c(vb.a.a(Im.GetUserChannelsRequest.getDefaultInstance())).d(vb.a.a(Im.GetUserChannelsResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("GetUserChannels")).a();
                    getGetUserChannelsMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getJoinChannelMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getJoinChannelMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getJoinChannelMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "JoinChannel")).e(true).c(vb.a.a(Im.JoinChannelRequest.getDefaultInstance())).d(vb.a.a(Im.JoinChannelResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("JoinChannel")).a();
                    getJoinChannelMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getQuitChannelMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getQuitChannelMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getQuitChannelMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "QuitChannel")).e(true).c(vb.a.a(Im.QuitChannelRequest.getDefaultInstance())).d(vb.a.a(Im.QuitChannelResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("QuitChannel")).a();
                    getQuitChannelMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getRemoveUserFromChannelMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getRemoveUserFromChannelMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getRemoveUserFromChannelMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "RemoveUserFromChannel")).e(true).c(vb.a.a(Im.RemoveUserFromChannelRequest.getDefaultInstance())).d(vb.a.a(Im.RemoveUserFromChannelResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("RemoveUserFromChannel")).a();
                    getRemoveUserFromChannelMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getSaveChannelMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getSaveChannelMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getSaveChannelMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "SaveChannel")).e(true).c(vb.a.a(Im.SaveChannelRequest.getDefaultInstance())).d(vb.a.a(Im.SaveChannelResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("SaveChannel")).a();
                    getSaveChannelMethod = a1VarA;
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
        synchronized (IHTGrpc.class) {
            try {
                s1VarG = serviceDescriptor;
                if (s1VarG == null) {
                    s1VarG = qb.s1.c(SERVICE_NAME).i(new IHTFileDescriptorSupplier()).f(getGetChannelsMethod()).f(getGetUserChannelsMethod()).f(getGetChannelConnectionParmMethod()).f(getSaveChannelMethod()).f(getSetChannelSpeakLevelMethod()).f(getDeleteChannelMethod()).f(getJoinChannelMethod()).f(getQuitChannelMethod()).f(getGetChannelMethod()).f(getGetChannelStatusMethod()).f(getGetChannelMembersMethod()).f(getSetChannelMemberAuthMethod()).f(getRemoveUserFromChannelMethod()).f(getGetServerLocationsMethod()).f(getGetImUrlMethod()).g();
                    serviceDescriptor = s1VarG;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s1VarG;
    }

    public static qb.a1 getSetChannelMemberAuthMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getSetChannelMemberAuthMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getSetChannelMemberAuthMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "SetChannelMemberAuth")).e(true).c(vb.a.a(Im.SetChannelMemberAuthRequest.getDefaultInstance())).d(vb.a.a(Im.SetChannelMemberAuthResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("SetChannelMemberAuth")).a();
                    getSetChannelMemberAuthMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getSetChannelSpeakLevelMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getSetChannelSpeakLevelMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (IHTGrpc.class) {
            try {
                a1VarA = getSetChannelSpeakLevelMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "SetChannelSpeakLevel")).e(true).c(vb.a.a(Im.SetChannelSpeakLevelRequest.getDefaultInstance())).d(vb.a.a(Im.SetChannelSpeakLevelResult.getDefaultInstance())).f(new IHTMethodDescriptorSupplier("SetChannelSpeakLevel")).a();
                    getSetChannelSpeakLevelMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static IHTBlockingStub newBlockingStub(qb.d dVar) {
        return (IHTBlockingStub) io.grpc.stub.b.newStub(new d.a() { // from class: com.benshikj.ht.rpc.IHTGrpc.3
            @Override // io.grpc.stub.d.a
            public IHTBlockingStub newStub(qb.d dVar2, qb.c cVar) {
                return new IHTBlockingStub(dVar2, cVar);
            }
        }, dVar);
    }

    public static IHTBlockingV2Stub newBlockingV2Stub(qb.d dVar) {
        return (IHTBlockingV2Stub) io.grpc.stub.b.newStub(new d.a() { // from class: com.benshikj.ht.rpc.IHTGrpc.2
            @Override // io.grpc.stub.d.a
            public IHTBlockingV2Stub newStub(qb.d dVar2, qb.c cVar) {
                return new IHTBlockingV2Stub(dVar2, cVar);
            }
        }, dVar);
    }

    public static IHTFutureStub newFutureStub(qb.d dVar) {
        return (IHTFutureStub) io.grpc.stub.c.newStub(new d.a() { // from class: com.benshikj.ht.rpc.IHTGrpc.4
            @Override // io.grpc.stub.d.a
            public IHTFutureStub newStub(qb.d dVar2, qb.c cVar) {
                return new IHTFutureStub(dVar2, cVar);
            }
        }, dVar);
    }

    public static IHTStub newStub(qb.d dVar) {
        return (IHTStub) io.grpc.stub.a.newStub(new d.a() { // from class: com.benshikj.ht.rpc.IHTGrpc.1
            @Override // io.grpc.stub.d.a
            public IHTStub newStub(qb.d dVar2, qb.c cVar) {
                return new IHTStub(dVar2, cVar);
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
            switch (this.methodId) {
                case 0:
                    this.serviceImpl.getChannels((Im.GetChannelsRequest) req, jVar);
                    return;
                case 1:
                    this.serviceImpl.getUserChannels((Im.GetUserChannelsRequest) req, jVar);
                    return;
                case 2:
                    this.serviceImpl.getChannelConnectionParm((Im.GetChannelConnectionParmRequest) req, jVar);
                    return;
                case 3:
                    this.serviceImpl.saveChannel((Im.SaveChannelRequest) req, jVar);
                    return;
                case 4:
                    this.serviceImpl.setChannelSpeakLevel((Im.SetChannelSpeakLevelRequest) req, jVar);
                    return;
                case 5:
                    this.serviceImpl.deleteChannel((Im.DeleteChannelRequest) req, jVar);
                    return;
                case 6:
                    this.serviceImpl.joinChannel((Im.JoinChannelRequest) req, jVar);
                    return;
                case 7:
                    this.serviceImpl.quitChannel((Im.QuitChannelRequest) req, jVar);
                    return;
                case 8:
                    this.serviceImpl.getChannel((Im.GetChannelRequest) req, jVar);
                    return;
                case 9:
                    this.serviceImpl.getChannelStatus((Im.GetChannelStatusRequest) req, jVar);
                    return;
                case 10:
                    this.serviceImpl.getChannelMembers((Im.GetChannelMembersRequest) req, jVar);
                    return;
                case 11:
                    this.serviceImpl.setChannelMemberAuth((Im.SetChannelMemberAuthRequest) req, jVar);
                    return;
                case 12:
                    this.serviceImpl.removeUserFromChannel((Im.RemoveUserFromChannelRequest) req, jVar);
                    return;
                case 13:
                    this.serviceImpl.getServerLocations((Im.GetServerLocationsRequest) req, jVar);
                    return;
                case 14:
                    this.serviceImpl.getImUrl((Im.GetImUrlRequest) req, jVar);
                    return;
                default:
                    throw new AssertionError();
            }
        }

        public io.grpc.stub.j invoke(io.grpc.stub.j jVar) {
            throw new AssertionError();
        }
    }
}
