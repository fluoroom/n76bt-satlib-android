package com.benshikj.ht.rpc;

import com.benshikj.ht.rpc.Um;
import com.benshikj.ht.rpc.UserGrpc;

/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class s2 {
    public static void a(UserGrpc.AsyncService asyncService, Um.DeleteUserRequest deleteUserRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(UserGrpc.getDeleteUsersMethod(), jVar);
    }

    public static void b(UserGrpc.AsyncService asyncService, Um.DoActionForUsersRequest doActionForUsersRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(UserGrpc.getDoActionForUsersMethod(), jVar);
    }

    public static void c(UserGrpc.AsyncService asyncService, Um.FreshAccessTokenRequest freshAccessTokenRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(UserGrpc.getFreshAccessTokenMethod(), jVar);
    }

    public static void d(UserGrpc.AsyncService asyncService, Um.UserPublicProfileRequest userPublicProfileRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(UserGrpc.getGetPublicProfileMethod(), jVar);
    }

    public static void e(UserGrpc.AsyncService asyncService, Um.GetPushMessageRequest getPushMessageRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(UserGrpc.getGetPushMessageMethod(), jVar);
    }

    public static void f(UserGrpc.AsyncService asyncService, Um.GetStatusRequest getStatusRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(UserGrpc.getGetStatusMethod(), jVar);
    }

    public static void g(UserGrpc.AsyncService asyncService, Um.GetUserIDsRequest getUserIDsRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(UserGrpc.getGetUserIDsMethod(), jVar);
    }

    public static void h(UserGrpc.AsyncService asyncService, Um.GetUserInfosRequest getUserInfosRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(UserGrpc.getGetUserInfosMethod(), jVar);
    }

    public static void i(UserGrpc.AsyncService asyncService, Um.LoadProfileRequest loadProfileRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(UserGrpc.getLoadProfileMethod(), jVar);
    }

    public static void j(UserGrpc.AsyncService asyncService, Um.LoginRequest loginRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(UserGrpc.getLoginMethod(), jVar);
    }

    public static void k(UserGrpc.AsyncService asyncService, Um.LogoutRequest logoutRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(UserGrpc.getLogoutMethod(), jVar);
    }

    public static void l(UserGrpc.AsyncService asyncService, Um.OpenIDLoginRequest openIDLoginRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(UserGrpc.getOpenIDLoginMethod(), jVar);
    }

    public static void m(UserGrpc.AsyncService asyncService, Um.UpdateProfileRequest updateProfileRequest, io.grpc.stub.j jVar) {
        io.grpc.stub.i.d(UserGrpc.getUpdateProfileMethod(), jVar);
    }
}
