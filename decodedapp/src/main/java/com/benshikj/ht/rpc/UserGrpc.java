package com.benshikj.ht.rpc;

import com.benshikj.ht.rpc.Um;
import com.google.protobuf.r;
import io.grpc.stub.d;
import io.grpc.stub.i;
import qb.a1;

/* JADX INFO: loaded from: classes.dex */
public final class UserGrpc {
    private static final int METHODID_DELETE_USERS = 9;
    private static final int METHODID_DO_ACTION_FOR_USERS = 11;
    private static final int METHODID_FRESH_ACCESS_TOKEN = 4;
    private static final int METHODID_GET_PUBLIC_PROFILE = 0;
    private static final int METHODID_GET_PUSH_MESSAGE = 12;
    private static final int METHODID_GET_STATUS = 10;
    private static final int METHODID_GET_USER_IDS = 7;
    private static final int METHODID_GET_USER_INFOS = 8;
    private static final int METHODID_LOAD_PROFILE = 5;
    private static final int METHODID_LOGIN = 1;
    private static final int METHODID_LOGOUT = 3;
    private static final int METHODID_OPEN_IDLOGIN = 2;
    private static final int METHODID_UPDATE_PROFILE = 6;
    public static final String SERVICE_NAME = "benshikj.User";
    private static volatile qb.a1 getDeleteUsersMethod;
    private static volatile qb.a1 getDoActionForUsersMethod;
    private static volatile qb.a1 getFreshAccessTokenMethod;
    private static volatile qb.a1 getGetPublicProfileMethod;
    private static volatile qb.a1 getGetPushMessageMethod;
    private static volatile qb.a1 getGetStatusMethod;
    private static volatile qb.a1 getGetUserIDsMethod;
    private static volatile qb.a1 getGetUserInfosMethod;
    private static volatile qb.a1 getLoadProfileMethod;
    private static volatile qb.a1 getLoginMethod;
    private static volatile qb.a1 getLogoutMethod;
    private static volatile qb.a1 getOpenIDLoginMethod;
    private static volatile qb.a1 getUpdateProfileMethod;
    private static volatile qb.s1 serviceDescriptor;

    public interface AsyncService {
        void deleteUsers(Um.DeleteUserRequest deleteUserRequest, io.grpc.stub.j jVar);

        void doActionForUsers(Um.DoActionForUsersRequest doActionForUsersRequest, io.grpc.stub.j jVar);

        void freshAccessToken(Um.FreshAccessTokenRequest freshAccessTokenRequest, io.grpc.stub.j jVar);

        void getPublicProfile(Um.UserPublicProfileRequest userPublicProfileRequest, io.grpc.stub.j jVar);

        void getPushMessage(Um.GetPushMessageRequest getPushMessageRequest, io.grpc.stub.j jVar);

        void getStatus(Um.GetStatusRequest getStatusRequest, io.grpc.stub.j jVar);

        void getUserIDs(Um.GetUserIDsRequest getUserIDsRequest, io.grpc.stub.j jVar);

        void getUserInfos(Um.GetUserInfosRequest getUserInfosRequest, io.grpc.stub.j jVar);

        void loadProfile(Um.LoadProfileRequest loadProfileRequest, io.grpc.stub.j jVar);

        void login(Um.LoginRequest loginRequest, io.grpc.stub.j jVar);

        void logout(Um.LogoutRequest logoutRequest, io.grpc.stub.j jVar);

        void openIDLogin(Um.OpenIDLoginRequest openIDLoginRequest, io.grpc.stub.j jVar);

        void updateProfile(Um.UpdateProfileRequest updateProfileRequest, io.grpc.stub.j jVar);
    }

    private static abstract class UserBaseDescriptorSupplier {
        UserBaseDescriptorSupplier() {
        }

        public r.h getFileDescriptor() {
            return Um.getDescriptor();
        }

        public r.m getServiceDescriptor() {
            return getFileDescriptor().j("User");
        }
    }

    public static final class UserBlockingStub extends io.grpc.stub.b {
        public Um.DeleteUserResult deleteUsers(Um.DeleteUserRequest deleteUserRequest) {
            return (Um.DeleteUserResult) io.grpc.stub.h.g(getChannel(), UserGrpc.getDeleteUsersMethod(), getCallOptions(), deleteUserRequest);
        }

        public Um.DoActionForUsersResult doActionForUsers(Um.DoActionForUsersRequest doActionForUsersRequest) {
            return (Um.DoActionForUsersResult) io.grpc.stub.h.g(getChannel(), UserGrpc.getDoActionForUsersMethod(), getCallOptions(), doActionForUsersRequest);
        }

        public Um.FreshAccessTokenResult freshAccessToken(Um.FreshAccessTokenRequest freshAccessTokenRequest) {
            return (Um.FreshAccessTokenResult) io.grpc.stub.h.g(getChannel(), UserGrpc.getFreshAccessTokenMethod(), getCallOptions(), freshAccessTokenRequest);
        }

        public Um.UserPublicProfileResult getPublicProfile(Um.UserPublicProfileRequest userPublicProfileRequest) {
            return (Um.UserPublicProfileResult) io.grpc.stub.h.g(getChannel(), UserGrpc.getGetPublicProfileMethod(), getCallOptions(), userPublicProfileRequest);
        }

        public Um.GetPushMessageResult getPushMessage(Um.GetPushMessageRequest getPushMessageRequest) {
            return (Um.GetPushMessageResult) io.grpc.stub.h.g(getChannel(), UserGrpc.getGetPushMessageMethod(), getCallOptions(), getPushMessageRequest);
        }

        public Um.GetStatusResult getStatus(Um.GetStatusRequest getStatusRequest) {
            return (Um.GetStatusResult) io.grpc.stub.h.g(getChannel(), UserGrpc.getGetStatusMethod(), getCallOptions(), getStatusRequest);
        }

        public Um.GetUserIDsResult getUserIDs(Um.GetUserIDsRequest getUserIDsRequest) {
            return (Um.GetUserIDsResult) io.grpc.stub.h.g(getChannel(), UserGrpc.getGetUserIDsMethod(), getCallOptions(), getUserIDsRequest);
        }

        public Um.GetUserInfosResult getUserInfos(Um.GetUserInfosRequest getUserInfosRequest) {
            return (Um.GetUserInfosResult) io.grpc.stub.h.g(getChannel(), UserGrpc.getGetUserInfosMethod(), getCallOptions(), getUserInfosRequest);
        }

        public Um.LoadProfileResult loadProfile(Um.LoadProfileRequest loadProfileRequest) {
            return (Um.LoadProfileResult) io.grpc.stub.h.g(getChannel(), UserGrpc.getLoadProfileMethod(), getCallOptions(), loadProfileRequest);
        }

        public Um.LoginResult login(Um.LoginRequest loginRequest) {
            return (Um.LoginResult) io.grpc.stub.h.g(getChannel(), UserGrpc.getLoginMethod(), getCallOptions(), loginRequest);
        }

        public Um.LogoutResult logout(Um.LogoutRequest logoutRequest) {
            return (Um.LogoutResult) io.grpc.stub.h.g(getChannel(), UserGrpc.getLogoutMethod(), getCallOptions(), logoutRequest);
        }

        public Um.LoginResult openIDLogin(Um.OpenIDLoginRequest openIDLoginRequest) {
            return (Um.LoginResult) io.grpc.stub.h.g(getChannel(), UserGrpc.getOpenIDLoginMethod(), getCallOptions(), openIDLoginRequest);
        }

        public Um.UpdateProfileResult updateProfile(Um.UpdateProfileRequest updateProfileRequest) {
            return (Um.UpdateProfileResult) io.grpc.stub.h.g(getChannel(), UserGrpc.getUpdateProfileMethod(), getCallOptions(), updateProfileRequest);
        }

        private UserBlockingStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public UserBlockingStub build(qb.d dVar, qb.c cVar) {
            return new UserBlockingStub(dVar, cVar);
        }
    }

    public static final class UserBlockingV2Stub extends io.grpc.stub.b {
        public Um.DeleteUserResult deleteUsers(Um.DeleteUserRequest deleteUserRequest) throws qb.v1 {
            return (Um.DeleteUserResult) io.grpc.stub.h.h(getChannel(), UserGrpc.getDeleteUsersMethod(), getCallOptions(), deleteUserRequest);
        }

        public Um.DoActionForUsersResult doActionForUsers(Um.DoActionForUsersRequest doActionForUsersRequest) throws qb.v1 {
            return (Um.DoActionForUsersResult) io.grpc.stub.h.h(getChannel(), UserGrpc.getDoActionForUsersMethod(), getCallOptions(), doActionForUsersRequest);
        }

        public Um.FreshAccessTokenResult freshAccessToken(Um.FreshAccessTokenRequest freshAccessTokenRequest) throws qb.v1 {
            return (Um.FreshAccessTokenResult) io.grpc.stub.h.h(getChannel(), UserGrpc.getFreshAccessTokenMethod(), getCallOptions(), freshAccessTokenRequest);
        }

        public Um.UserPublicProfileResult getPublicProfile(Um.UserPublicProfileRequest userPublicProfileRequest) throws qb.v1 {
            return (Um.UserPublicProfileResult) io.grpc.stub.h.h(getChannel(), UserGrpc.getGetPublicProfileMethod(), getCallOptions(), userPublicProfileRequest);
        }

        public Um.GetPushMessageResult getPushMessage(Um.GetPushMessageRequest getPushMessageRequest) throws qb.v1 {
            return (Um.GetPushMessageResult) io.grpc.stub.h.h(getChannel(), UserGrpc.getGetPushMessageMethod(), getCallOptions(), getPushMessageRequest);
        }

        public Um.GetStatusResult getStatus(Um.GetStatusRequest getStatusRequest) throws qb.v1 {
            return (Um.GetStatusResult) io.grpc.stub.h.h(getChannel(), UserGrpc.getGetStatusMethod(), getCallOptions(), getStatusRequest);
        }

        public Um.GetUserIDsResult getUserIDs(Um.GetUserIDsRequest getUserIDsRequest) throws qb.v1 {
            return (Um.GetUserIDsResult) io.grpc.stub.h.h(getChannel(), UserGrpc.getGetUserIDsMethod(), getCallOptions(), getUserIDsRequest);
        }

        public Um.GetUserInfosResult getUserInfos(Um.GetUserInfosRequest getUserInfosRequest) throws qb.v1 {
            return (Um.GetUserInfosResult) io.grpc.stub.h.h(getChannel(), UserGrpc.getGetUserInfosMethod(), getCallOptions(), getUserInfosRequest);
        }

        public Um.LoadProfileResult loadProfile(Um.LoadProfileRequest loadProfileRequest) throws qb.v1 {
            return (Um.LoadProfileResult) io.grpc.stub.h.h(getChannel(), UserGrpc.getLoadProfileMethod(), getCallOptions(), loadProfileRequest);
        }

        public Um.LoginResult login(Um.LoginRequest loginRequest) throws qb.v1 {
            return (Um.LoginResult) io.grpc.stub.h.h(getChannel(), UserGrpc.getLoginMethod(), getCallOptions(), loginRequest);
        }

        public Um.LogoutResult logout(Um.LogoutRequest logoutRequest) throws qb.v1 {
            return (Um.LogoutResult) io.grpc.stub.h.h(getChannel(), UserGrpc.getLogoutMethod(), getCallOptions(), logoutRequest);
        }

        public Um.LoginResult openIDLogin(Um.OpenIDLoginRequest openIDLoginRequest) throws qb.v1 {
            return (Um.LoginResult) io.grpc.stub.h.h(getChannel(), UserGrpc.getOpenIDLoginMethod(), getCallOptions(), openIDLoginRequest);
        }

        public Um.UpdateProfileResult updateProfile(Um.UpdateProfileRequest updateProfileRequest) throws qb.v1 {
            return (Um.UpdateProfileResult) io.grpc.stub.h.h(getChannel(), UserGrpc.getUpdateProfileMethod(), getCallOptions(), updateProfileRequest);
        }

        private UserBlockingV2Stub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public UserBlockingV2Stub build(qb.d dVar, qb.c cVar) {
            return new UserBlockingV2Stub(dVar, cVar);
        }
    }

    private static final class UserFileDescriptorSupplier extends UserBaseDescriptorSupplier {
        UserFileDescriptorSupplier() {
        }
    }

    public static final class UserFutureStub extends io.grpc.stub.c {
        public com.google.common.util.concurrent.g deleteUsers(Um.DeleteUserRequest deleteUserRequest) {
            return io.grpc.stub.h.j(getChannel().d(UserGrpc.getDeleteUsersMethod(), getCallOptions()), deleteUserRequest);
        }

        public com.google.common.util.concurrent.g doActionForUsers(Um.DoActionForUsersRequest doActionForUsersRequest) {
            return io.grpc.stub.h.j(getChannel().d(UserGrpc.getDoActionForUsersMethod(), getCallOptions()), doActionForUsersRequest);
        }

        public com.google.common.util.concurrent.g freshAccessToken(Um.FreshAccessTokenRequest freshAccessTokenRequest) {
            return io.grpc.stub.h.j(getChannel().d(UserGrpc.getFreshAccessTokenMethod(), getCallOptions()), freshAccessTokenRequest);
        }

        public com.google.common.util.concurrent.g getPublicProfile(Um.UserPublicProfileRequest userPublicProfileRequest) {
            return io.grpc.stub.h.j(getChannel().d(UserGrpc.getGetPublicProfileMethod(), getCallOptions()), userPublicProfileRequest);
        }

        public com.google.common.util.concurrent.g getPushMessage(Um.GetPushMessageRequest getPushMessageRequest) {
            return io.grpc.stub.h.j(getChannel().d(UserGrpc.getGetPushMessageMethod(), getCallOptions()), getPushMessageRequest);
        }

        public com.google.common.util.concurrent.g getStatus(Um.GetStatusRequest getStatusRequest) {
            return io.grpc.stub.h.j(getChannel().d(UserGrpc.getGetStatusMethod(), getCallOptions()), getStatusRequest);
        }

        public com.google.common.util.concurrent.g getUserIDs(Um.GetUserIDsRequest getUserIDsRequest) {
            return io.grpc.stub.h.j(getChannel().d(UserGrpc.getGetUserIDsMethod(), getCallOptions()), getUserIDsRequest);
        }

        public com.google.common.util.concurrent.g getUserInfos(Um.GetUserInfosRequest getUserInfosRequest) {
            return io.grpc.stub.h.j(getChannel().d(UserGrpc.getGetUserInfosMethod(), getCallOptions()), getUserInfosRequest);
        }

        public com.google.common.util.concurrent.g loadProfile(Um.LoadProfileRequest loadProfileRequest) {
            return io.grpc.stub.h.j(getChannel().d(UserGrpc.getLoadProfileMethod(), getCallOptions()), loadProfileRequest);
        }

        public com.google.common.util.concurrent.g login(Um.LoginRequest loginRequest) {
            return io.grpc.stub.h.j(getChannel().d(UserGrpc.getLoginMethod(), getCallOptions()), loginRequest);
        }

        public com.google.common.util.concurrent.g logout(Um.LogoutRequest logoutRequest) {
            return io.grpc.stub.h.j(getChannel().d(UserGrpc.getLogoutMethod(), getCallOptions()), logoutRequest);
        }

        public com.google.common.util.concurrent.g openIDLogin(Um.OpenIDLoginRequest openIDLoginRequest) {
            return io.grpc.stub.h.j(getChannel().d(UserGrpc.getOpenIDLoginMethod(), getCallOptions()), openIDLoginRequest);
        }

        public com.google.common.util.concurrent.g updateProfile(Um.UpdateProfileRequest updateProfileRequest) {
            return io.grpc.stub.h.j(getChannel().d(UserGrpc.getUpdateProfileMethod(), getCallOptions()), updateProfileRequest);
        }

        private UserFutureStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public UserFutureStub build(qb.d dVar, qb.c cVar) {
            return new UserFutureStub(dVar, cVar);
        }
    }

    public static abstract class UserImplBase implements AsyncService {
        public final qb.r1 bindService() {
            return UserGrpc.bindService(this);
        }

        @Override // com.benshikj.ht.rpc.UserGrpc.AsyncService
        public /* synthetic */ void deleteUsers(Um.DeleteUserRequest deleteUserRequest, io.grpc.stub.j jVar) {
            s2.a(this, deleteUserRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.UserGrpc.AsyncService
        public /* synthetic */ void doActionForUsers(Um.DoActionForUsersRequest doActionForUsersRequest, io.grpc.stub.j jVar) {
            s2.b(this, doActionForUsersRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.UserGrpc.AsyncService
        public /* synthetic */ void freshAccessToken(Um.FreshAccessTokenRequest freshAccessTokenRequest, io.grpc.stub.j jVar) {
            s2.c(this, freshAccessTokenRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.UserGrpc.AsyncService
        public /* synthetic */ void getPublicProfile(Um.UserPublicProfileRequest userPublicProfileRequest, io.grpc.stub.j jVar) {
            s2.d(this, userPublicProfileRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.UserGrpc.AsyncService
        public /* synthetic */ void getPushMessage(Um.GetPushMessageRequest getPushMessageRequest, io.grpc.stub.j jVar) {
            s2.e(this, getPushMessageRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.UserGrpc.AsyncService
        public /* synthetic */ void getStatus(Um.GetStatusRequest getStatusRequest, io.grpc.stub.j jVar) {
            s2.f(this, getStatusRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.UserGrpc.AsyncService
        public /* synthetic */ void getUserIDs(Um.GetUserIDsRequest getUserIDsRequest, io.grpc.stub.j jVar) {
            s2.g(this, getUserIDsRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.UserGrpc.AsyncService
        public /* synthetic */ void getUserInfos(Um.GetUserInfosRequest getUserInfosRequest, io.grpc.stub.j jVar) {
            s2.h(this, getUserInfosRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.UserGrpc.AsyncService
        public /* synthetic */ void loadProfile(Um.LoadProfileRequest loadProfileRequest, io.grpc.stub.j jVar) {
            s2.i(this, loadProfileRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.UserGrpc.AsyncService
        public /* synthetic */ void login(Um.LoginRequest loginRequest, io.grpc.stub.j jVar) {
            s2.j(this, loginRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.UserGrpc.AsyncService
        public /* synthetic */ void logout(Um.LogoutRequest logoutRequest, io.grpc.stub.j jVar) {
            s2.k(this, logoutRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.UserGrpc.AsyncService
        public /* synthetic */ void openIDLogin(Um.OpenIDLoginRequest openIDLoginRequest, io.grpc.stub.j jVar) {
            s2.l(this, openIDLoginRequest, jVar);
        }

        @Override // com.benshikj.ht.rpc.UserGrpc.AsyncService
        public /* synthetic */ void updateProfile(Um.UpdateProfileRequest updateProfileRequest, io.grpc.stub.j jVar) {
            s2.m(this, updateProfileRequest, jVar);
        }
    }

    private static final class UserMethodDescriptorSupplier extends UserBaseDescriptorSupplier {
        private final String methodName;

        UserMethodDescriptorSupplier(String str) {
            this.methodName = str;
        }

        public r.j getMethodDescriptor() {
            return getServiceDescriptor().i(this.methodName);
        }
    }

    public static final class UserStub extends io.grpc.stub.a {
        public void deleteUsers(Um.DeleteUserRequest deleteUserRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(UserGrpc.getDeleteUsersMethod(), getCallOptions()), deleteUserRequest, jVar);
        }

        public void doActionForUsers(Um.DoActionForUsersRequest doActionForUsersRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(UserGrpc.getDoActionForUsersMethod(), getCallOptions()), doActionForUsersRequest, jVar);
        }

        public void freshAccessToken(Um.FreshAccessTokenRequest freshAccessTokenRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(UserGrpc.getFreshAccessTokenMethod(), getCallOptions()), freshAccessTokenRequest, jVar);
        }

        public void getPublicProfile(Um.UserPublicProfileRequest userPublicProfileRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(UserGrpc.getGetPublicProfileMethod(), getCallOptions()), userPublicProfileRequest, jVar);
        }

        public void getPushMessage(Um.GetPushMessageRequest getPushMessageRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(UserGrpc.getGetPushMessageMethod(), getCallOptions()), getPushMessageRequest, jVar);
        }

        public void getStatus(Um.GetStatusRequest getStatusRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(UserGrpc.getGetStatusMethod(), getCallOptions()), getStatusRequest, jVar);
        }

        public void getUserIDs(Um.GetUserIDsRequest getUserIDsRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(UserGrpc.getGetUserIDsMethod(), getCallOptions()), getUserIDsRequest, jVar);
        }

        public void getUserInfos(Um.GetUserInfosRequest getUserInfosRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(UserGrpc.getGetUserInfosMethod(), getCallOptions()), getUserInfosRequest, jVar);
        }

        public void loadProfile(Um.LoadProfileRequest loadProfileRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(UserGrpc.getLoadProfileMethod(), getCallOptions()), loadProfileRequest, jVar);
        }

        public void login(Um.LoginRequest loginRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(UserGrpc.getLoginMethod(), getCallOptions()), loginRequest, jVar);
        }

        public void logout(Um.LogoutRequest logoutRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(UserGrpc.getLogoutMethod(), getCallOptions()), logoutRequest, jVar);
        }

        public void openIDLogin(Um.OpenIDLoginRequest openIDLoginRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(UserGrpc.getOpenIDLoginMethod(), getCallOptions()), openIDLoginRequest, jVar);
        }

        public void updateProfile(Um.UpdateProfileRequest updateProfileRequest, io.grpc.stub.j jVar) {
            io.grpc.stub.h.c(getChannel().d(UserGrpc.getUpdateProfileMethod(), getCallOptions()), updateProfileRequest, jVar);
        }

        private UserStub(qb.d dVar, qb.c cVar) {
            super(dVar, cVar);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // io.grpc.stub.d
        public UserStub build(qb.d dVar, qb.c cVar) {
            return new UserStub(dVar, cVar);
        }
    }

    private UserGrpc() {
    }

    public static final qb.r1 bindService(AsyncService asyncService) {
        return qb.r1.a(getServiceDescriptor()).a(getGetPublicProfileMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 0))).a(getLoginMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 1))).a(getOpenIDLoginMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 2))).a(getLogoutMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 3))).a(getFreshAccessTokenMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 4))).a(getLoadProfileMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 5))).a(getUpdateProfileMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 6))).a(getGetUserIDsMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 7))).a(getGetUserInfosMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 8))).a(getDeleteUsersMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 9))).a(getGetStatusMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 10))).a(getDoActionForUsersMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 11))).a(getGetPushMessageMethod(), io.grpc.stub.i.b(new MethodHandlers(asyncService, 12))).c();
    }

    public static qb.a1 getDeleteUsersMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getDeleteUsersMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (UserGrpc.class) {
            try {
                a1VarA = getDeleteUsersMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "DeleteUsers")).e(true).c(vb.a.a(Um.DeleteUserRequest.getDefaultInstance())).d(vb.a.a(Um.DeleteUserResult.getDefaultInstance())).f(new UserMethodDescriptorSupplier("DeleteUsers")).a();
                    getDeleteUsersMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getDoActionForUsersMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getDoActionForUsersMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (UserGrpc.class) {
            try {
                a1VarA = getDoActionForUsersMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "DoActionForUsers")).e(true).c(vb.a.a(Um.DoActionForUsersRequest.getDefaultInstance())).d(vb.a.a(Um.DoActionForUsersResult.getDefaultInstance())).f(new UserMethodDescriptorSupplier("DoActionForUsers")).a();
                    getDoActionForUsersMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getFreshAccessTokenMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getFreshAccessTokenMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (UserGrpc.class) {
            try {
                a1VarA = getFreshAccessTokenMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "FreshAccessToken")).e(true).c(vb.a.a(Um.FreshAccessTokenRequest.getDefaultInstance())).d(vb.a.a(Um.FreshAccessTokenResult.getDefaultInstance())).f(new UserMethodDescriptorSupplier("FreshAccessToken")).a();
                    getFreshAccessTokenMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetPublicProfileMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetPublicProfileMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (UserGrpc.class) {
            try {
                a1VarA = getGetPublicProfileMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetPublicProfile")).e(true).c(vb.a.a(Um.UserPublicProfileRequest.getDefaultInstance())).d(vb.a.a(Um.UserPublicProfileResult.getDefaultInstance())).f(new UserMethodDescriptorSupplier("GetPublicProfile")).a();
                    getGetPublicProfileMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetPushMessageMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetPushMessageMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (UserGrpc.class) {
            try {
                a1VarA = getGetPushMessageMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetPushMessage")).e(true).c(vb.a.a(Um.GetPushMessageRequest.getDefaultInstance())).d(vb.a.a(Um.GetPushMessageResult.getDefaultInstance())).f(new UserMethodDescriptorSupplier("GetPushMessage")).a();
                    getGetPushMessageMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetStatusMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetStatusMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (UserGrpc.class) {
            try {
                a1VarA = getGetStatusMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetStatus")).e(true).c(vb.a.a(Um.GetStatusRequest.getDefaultInstance())).d(vb.a.a(Um.GetStatusResult.getDefaultInstance())).f(new UserMethodDescriptorSupplier("GetStatus")).a();
                    getGetStatusMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetUserIDsMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetUserIDsMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (UserGrpc.class) {
            try {
                a1VarA = getGetUserIDsMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetUserIDs")).e(true).c(vb.a.a(Um.GetUserIDsRequest.getDefaultInstance())).d(vb.a.a(Um.GetUserIDsResult.getDefaultInstance())).f(new UserMethodDescriptorSupplier("GetUserIDs")).a();
                    getGetUserIDsMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getGetUserInfosMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getGetUserInfosMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (UserGrpc.class) {
            try {
                a1VarA = getGetUserInfosMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "GetUserInfos")).e(true).c(vb.a.a(Um.GetUserInfosRequest.getDefaultInstance())).d(vb.a.a(Um.GetUserInfosResult.getDefaultInstance())).f(new UserMethodDescriptorSupplier("GetUserInfos")).a();
                    getGetUserInfosMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getLoadProfileMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getLoadProfileMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (UserGrpc.class) {
            try {
                a1VarA = getLoadProfileMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "LoadProfile")).e(true).c(vb.a.a(Um.LoadProfileRequest.getDefaultInstance())).d(vb.a.a(Um.LoadProfileResult.getDefaultInstance())).f(new UserMethodDescriptorSupplier("LoadProfile")).a();
                    getLoadProfileMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getLoginMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getLoginMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (UserGrpc.class) {
            try {
                a1VarA = getLoginMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "Login")).e(true).c(vb.a.a(Um.LoginRequest.getDefaultInstance())).d(vb.a.a(Um.LoginResult.getDefaultInstance())).f(new UserMethodDescriptorSupplier("Login")).a();
                    getLoginMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getLogoutMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getLogoutMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (UserGrpc.class) {
            try {
                a1VarA = getLogoutMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "Logout")).e(true).c(vb.a.a(Um.LogoutRequest.getDefaultInstance())).d(vb.a.a(Um.LogoutResult.getDefaultInstance())).f(new UserMethodDescriptorSupplier("Logout")).a();
                    getLogoutMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static qb.a1 getOpenIDLoginMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getOpenIDLoginMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (UserGrpc.class) {
            try {
                a1VarA = getOpenIDLoginMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "OpenIDLogin")).e(true).c(vb.a.a(Um.OpenIDLoginRequest.getDefaultInstance())).d(vb.a.a(Um.LoginResult.getDefaultInstance())).f(new UserMethodDescriptorSupplier("OpenIDLogin")).a();
                    getOpenIDLoginMethod = a1VarA;
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
        synchronized (UserGrpc.class) {
            try {
                s1VarG = serviceDescriptor;
                if (s1VarG == null) {
                    s1VarG = qb.s1.c(SERVICE_NAME).i(new UserFileDescriptorSupplier()).f(getGetPublicProfileMethod()).f(getLoginMethod()).f(getOpenIDLoginMethod()).f(getLogoutMethod()).f(getFreshAccessTokenMethod()).f(getLoadProfileMethod()).f(getUpdateProfileMethod()).f(getGetUserIDsMethod()).f(getGetUserInfosMethod()).f(getDeleteUsersMethod()).f(getGetStatusMethod()).f(getDoActionForUsersMethod()).f(getGetPushMessageMethod()).g();
                    serviceDescriptor = s1VarG;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return s1VarG;
    }

    public static qb.a1 getUpdateProfileMethod() {
        qb.a1 a1VarA;
        qb.a1 a1Var = getUpdateProfileMethod;
        if (a1Var != null) {
            return a1Var;
        }
        synchronized (UserGrpc.class) {
            try {
                a1VarA = getUpdateProfileMethod;
                if (a1VarA == null) {
                    a1VarA = qb.a1.g().g(a1.d.UNARY).b(qb.a1.b(SERVICE_NAME, "UpdateProfile")).e(true).c(vb.a.a(Um.UpdateProfileRequest.getDefaultInstance())).d(vb.a.a(Um.UpdateProfileResult.getDefaultInstance())).f(new UserMethodDescriptorSupplier("UpdateProfile")).a();
                    getUpdateProfileMethod = a1VarA;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a1VarA;
    }

    public static UserBlockingStub newBlockingStub(qb.d dVar) {
        return (UserBlockingStub) io.grpc.stub.b.newStub(new d.a() { // from class: com.benshikj.ht.rpc.UserGrpc.3
            @Override // io.grpc.stub.d.a
            public UserBlockingStub newStub(qb.d dVar2, qb.c cVar) {
                return new UserBlockingStub(dVar2, cVar);
            }
        }, dVar);
    }

    public static UserBlockingV2Stub newBlockingV2Stub(qb.d dVar) {
        return (UserBlockingV2Stub) io.grpc.stub.b.newStub(new d.a() { // from class: com.benshikj.ht.rpc.UserGrpc.2
            @Override // io.grpc.stub.d.a
            public UserBlockingV2Stub newStub(qb.d dVar2, qb.c cVar) {
                return new UserBlockingV2Stub(dVar2, cVar);
            }
        }, dVar);
    }

    public static UserFutureStub newFutureStub(qb.d dVar) {
        return (UserFutureStub) io.grpc.stub.c.newStub(new d.a() { // from class: com.benshikj.ht.rpc.UserGrpc.4
            @Override // io.grpc.stub.d.a
            public UserFutureStub newStub(qb.d dVar2, qb.c cVar) {
                return new UserFutureStub(dVar2, cVar);
            }
        }, dVar);
    }

    public static UserStub newStub(qb.d dVar) {
        return (UserStub) io.grpc.stub.a.newStub(new d.a() { // from class: com.benshikj.ht.rpc.UserGrpc.1
            @Override // io.grpc.stub.d.a
            public UserStub newStub(qb.d dVar2, qb.c cVar) {
                return new UserStub(dVar2, cVar);
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
                    this.serviceImpl.getPublicProfile((Um.UserPublicProfileRequest) req, jVar);
                    return;
                case 1:
                    this.serviceImpl.login((Um.LoginRequest) req, jVar);
                    return;
                case 2:
                    this.serviceImpl.openIDLogin((Um.OpenIDLoginRequest) req, jVar);
                    return;
                case 3:
                    this.serviceImpl.logout((Um.LogoutRequest) req, jVar);
                    return;
                case 4:
                    this.serviceImpl.freshAccessToken((Um.FreshAccessTokenRequest) req, jVar);
                    return;
                case 5:
                    this.serviceImpl.loadProfile((Um.LoadProfileRequest) req, jVar);
                    return;
                case 6:
                    this.serviceImpl.updateProfile((Um.UpdateProfileRequest) req, jVar);
                    return;
                case 7:
                    this.serviceImpl.getUserIDs((Um.GetUserIDsRequest) req, jVar);
                    return;
                case 8:
                    this.serviceImpl.getUserInfos((Um.GetUserInfosRequest) req, jVar);
                    return;
                case 9:
                    this.serviceImpl.deleteUsers((Um.DeleteUserRequest) req, jVar);
                    return;
                case 10:
                    this.serviceImpl.getStatus((Um.GetStatusRequest) req, jVar);
                    return;
                case 11:
                    this.serviceImpl.doActionForUsers((Um.DoActionForUsersRequest) req, jVar);
                    return;
                case 12:
                    this.serviceImpl.getPushMessage((Um.GetPushMessageRequest) req, jVar);
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
