package com.benshikj.ht.rpc;

import com.google.protobuf.a;
import com.google.protobuf.b;
import com.google.protobuf.k0;
import com.google.protobuf.o0;
import com.google.protobuf.r;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class Um {
    private static r.h descriptor = r.h.s(new String[]{"\n\bum.proto\u0012\bbenshikj\"e\n\u0011UserPublicProfile\u0012\u000b\n\u0003uid\u0018\u0001 \u0001(\u0003\u0012\u0010\n\busername\u0018\u0002 \u0001(\t\u0012\u0010\n\bnickname\u0018\u0003 \u0001(\t\u0012\r\n\u0005photo\u0018\u0004 \u0001(\f\u0012\u0010\n\bupdateAt\u0018\u0005 \u0001(\u0003\" \n\u0011DeviceInformation\u0012\u000b\n\u0003did\u0018\u0001 \u0001(\t\"7\n\u0018UserPublicProfileRequest\u0012\u000b\n\u0003uid\u0018\u0001 \u0001(\u0003\u0012\u000e\n\u0006syncAt\u0018\u0002 \u0001(\u0003\"®\u0001\n\u0017UserPublicProfileResult\u0012:\n\u0006status\u0018\u0001 \u0001(\u000e2(.benshikj.UserPublicProfileResult.StatusH\u0000\u0012+\n\u0004data\u0018\u0002 \u0001(\u000b2\u001b.benshikj.UserPublicProfileH\u0000\"\u001f\n\u0006Status\u0012\u0006\n\u0002ok\u0010\u0000\u0012\r\n\tunchanged\u0010\u0001B\t\n\u0007profile\"¯\u0001\n\u0012OpenIDLoginRequest\u0012/\n\u0004type\u0018\u0001 \u0001(\u000e2!.benshikj.OpenIDLoginRequest.Type\u0012\u000e\n\u0006openID\u0018\u0002 \u0001(\t\u0012\u0013\n\u000baccessToken\u0018\u0003 \u0001(\t\u0012\u0010\n\bnickname\u0018\u0004 \u0001(\t\"1\n\u0004Type\u0012\u0006\n\u0002QQ\u0010\u0000\u0012\n\n\u0006WeiXin\u0010\u0001\u0012\t\n\u0005Apple\u0010\u0002\u0012\n\n\u0006Google\u0010\u0003\"9\n\fLoginRequest\u0012\u0017\n\u000fusernameOrEmail\u0018\u0001 \u0001(\t\u0012\u0010\n\bpassword\u0018\u0002 \u0001(\t\"\u0095\u0001\n\u000bLoginResult\u0012\u0013\n\u000baccessToken\u0018\u0001 \u0001(\t\u0012\u001a\n\u0012accessTokenExpires\u0018\u0002 \u0001(\u0003\u0012\u0014\n\frefreshToken\u0018\u0003 \u0001(\t\u0012\u001b\n\u0013refreshTokenExpires\u0018\u0004 \u0001(\u0003\u0012\"\n\u0004code\u0018\u0005 \u0001(\u000e2\u0014.benshikj.StatusCode\"7\n\u0012LoadProfileRequest\u0012\u0011\n\tloadPhoto\u0018\u0001 \u0001(\b\u0012\u000e\n\u0006syncAt\u0018\u0002 \u0001(\u0003\"n\n\u000bUserProfile\u0012\u000b\n\u0003uid\u0018\u0001 \u0001(\u0003\u0012\u0010\n\busername\u0018\u0002 \u0001(\t\u0012\u0010\n\bnickname\u0018\u0003 \u0001(\t\u0012\r\n\u0005email\u0018\u0004 \u0001(\t\u0012\r\n\u0005photo\u0018\u0005 \u0001(\f\u0012\u0010\n\bupdateAt\u0018\u0006 \u0001(\u0003\"\u009c\u0001\n\u0011LoadProfileResult\u00124\n\u0006status\u0018\u0001 \u0001(\u000e2\".benshikj.LoadProfileResult.StatusH\u0000\u0012%\n\u0004data\u0018\u0002 \u0001(\u000b2\u0015.benshikj.UserProfileH\u0000\"\u001f\n\u0006Status\u0012\u0006\n\u0002ok\u0010\u0000\u0012\r\n\tunchanged\u0010\u0001B\t\n\u0007profile\"\u009d\u0001\n\u0014UpdateProfileRequest\u0012#\n\u0004data\u0018\u0001 \u0001(\u000b2\u0015.benshikj.UserProfile\u00125\n\u0006update\u0018\u0002 \u0001(\u000b2%.benshikj.UpdateProfileRequest.Update\u001a)\n\u0006Update\u0012\u0010\n\bnickname\u0018\u0001 \u0001(\b\u0012\r\n\u0005photo\u0018\u0002 \u0001(\b\"\u0015\n\u0013UpdateProfileResult\"$\n\u0013SetUserPhotoRequest\u0012\r\n\u0005photo\u0018\u0001 \u0001(\f\"%\n\u0013GetUserPhotoRequest\u0012\u000e\n\u0006syncAt\u0018\u0001 \u0001(\u0003\"#\n\u0012GetUserPhotoResult\u0012\r\n\u0005photo\u0018\u0001 \u0001(\f\"2\n\fLogoutResult\u0012\"\n\u0004code\u0018\u0001 \u0001(\u000e2\u0014.benshikj.StatusCode\":\n\rLogoutRequest\u0012\u0013\n\u000baccessToken\u0018\u0001 \u0001(\t\u0012\u0014\n\frefreshToken\u0018\u0002 \u0001(\t\"D\n\u0017FreshAccessTokenRequest\u0012\u0013\n\u000baccessToken\u0018\u0001 \u0001(\t\u0012\u0014\n\frefreshToken\u0018\u0002 \u0001(\t\" \u0001\n\u0016FreshAccessTokenResult\u0012\u0013\n\u000baccessToken\u0018\u0001 \u0001(\t\u0012\u001a\n\u0012accessTokenExpires\u0018\u0002 \u0001(\u0003\u0012\u0014\n\frefreshToken\u0018\u0003 \u0001(\t\u0012\u001b\n\u0013refreshTokenExpires\u0018\u0004 \u0001(\u0003\u0012\"\n\u0004code\u0018\u0005 \u0001(\u000e2\u0014.benshikj.StatusCode\"2\n\u0011GetUserIDsRequest\u0012\u000e\n\u0006offset\u0018\u0001 \u0001(\u0005\u0012\r\n\u0005limit\u0018\u0002 \u0001(\u0005\"#\n\u0010GetUserIDsResult\u0012\u000f\n\u0007userIDs\u0018\u0001 \u0003(\u0003\"$\n\u0011DeleteUserRequest\u0012\u000f\n\u0007userIDs\u0018\u0001 \u0003(\u0003\"\u0012\n\u0010DeleteUserResult\"\u0012\n\u0010GetStatusRequest\"$\n\u000fGetStatusResult\u0012\u0011\n\tuserCount\u0018\u0001 \u0001(\u0003\"T\n\u0017DoActionForUsersRequest\u0012(\n\u0007actions\u0018\u0001 \u0003(\u000e2\u0017.benshikj.ActionForUser\u0012\u000f\n\u0007userIDs\u0018\u0002 \u0003(\u0003\"\u0018\n\u0016DoActionForUsersResult\";\n\bUserInfo\u0012\u000b\n\u0003uid\u0018\u0001 \u0001(\u0003\u0012\u0010\n\busername\u0018\u0002 \u0001(\t\u0012\u0010\n\bnickname\u0018\u0003 \u0001(\t\"G\n\u0013GetUserInfosRequest\u0012\u0011\n\tqueryText\u0018\u0001 \u0001(\t\u0012\u000e\n\u0006offset\u0018\u0002 \u0001(\u0005\u0012\r\n\u0005limit\u0018\u0003 \u0001(\u0005\"7\n\u0012GetUserInfosResult\u0012!\n\u0005users\u0018\u0001 \u0003(\u000b2\u0012.benshikj.UserInfo\"9\n\u0015GetPushMessageRequest\u0012\u0011\n\tmessageID\u0018\u0001 \u0001(\u0003\u0012\r\n\u0005limit\u0018\u0002 \u0001(\u0005\"@\n\u000bPushMessage\u0012\u0011\n\tmessageID\u0018\u0001 \u0001(\t\u0012\r\n\u0005title\u0018\u0002 \u0001(\t\u0012\u000f\n\u0007message\u0018\u0003 \u0001(\t\"?\n\u0014GetPushMessageResult\u0012'\n\bmessages\u0018\u0001 \u0003(\u000b2\u0015.benshikj.PushMessage*k\n\nStatusCode\u0012\u0006\n\u0002ok\u0010\u0000\u0012\u0015\n\u0011ErrNameOrPassword\u0010\u0001\u0012\u0019\n\u0015ErrUserHaveNoPassword\u0010\u0002\u0012\u000f\n\u000bErrNotLogin\u0010\u0003\u0012\u0012\n\u000eErrUnconfirmed\u0010\u0004*:\n\rActionForUser\u0012\u0007\n\u0003Nop\u0010\u0000\u0012\n\n\u0006Delete\u0010\u0001\u0012\b\n\u0004Lock\u0010\u0002\u0012\n\n\u0006Logout\u0010\u00032å\u0007\n\u0004User\u0012[\n\u0010GetPublicProfile\u0012\".benshikj.UserPublicProfileRequest\u001a!.benshikj.UserPublicProfileResult\"\u0000\u00128\n\u0005Login\u0012\u0016.benshikj.LoginRequest\u001a\u0015.benshikj.LoginResult\"\u0000\u0012D\n\u000bOpenIDLogin\u0012\u001c.benshikj.OpenIDLoginRequest\u001a\u0015.benshikj.LoginResult\"\u0000\u0012;\n\u0006Logout\u0012\u0017.benshikj.LogoutRequest\u001a\u0016.benshikj.LogoutResult\"\u0000\u0012Y\n\u0010FreshAccessToken\u0012!.benshikj.FreshAccessTokenRequest\u001a .benshikj.FreshAccessTokenResult\"\u0000\u0012J\n\u000bLoadProfile\u0012\u001c.benshikj.LoadProfileRequest\u001a\u001b.benshikj.LoadProfileResult\"\u0000\u0012P\n\rUpdateProfile\u0012\u001e.benshikj.UpdateProfileRequest\u001a\u001d.benshikj.UpdateProfileResult\"\u0000\u0012E\n\nGetUserIDs\u0012\u001b.benshikj.GetUserIDsRequest\u001a\u001a.benshikj.GetUserIDsResult\u0012K\n\fGetUserInfos\u0012\u001d.benshikj.GetUserInfosRequest\u001a\u001c.benshikj.GetUserInfosResult\u0012F\n\u000bDeleteUsers\u0012\u001b.benshikj.DeleteUserRequest\u001a\u001a.benshikj.DeleteUserResult\u0012B\n\tGetStatus\u0012\u001a.benshikj.GetStatusRequest\u001a\u0019.benshikj.GetStatusResult\u0012W\n\u0010DoActionForUsers\u0012!.benshikj.DoActionForUsersRequest\u001a .benshikj.DoActionForUsersResult\u0012Q\n\u000eGetPushMessage\u0012\u001f.benshikj.GetPushMessageRequest\u001a\u001e.benshikj.GetPushMessageResultB!\n\u0013com.benshikj.ht.rpcZ\n./benshikjb\u0006proto3"}, new r.h[0]);
    private static final r.b internal_static_benshikj_DeleteUserRequest_descriptor;
    private static final k0.f internal_static_benshikj_DeleteUserRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_DeleteUserResult_descriptor;
    private static final k0.f internal_static_benshikj_DeleteUserResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_DeviceInformation_descriptor;
    private static final k0.f internal_static_benshikj_DeviceInformation_fieldAccessorTable;
    private static final r.b internal_static_benshikj_DoActionForUsersRequest_descriptor;
    private static final k0.f internal_static_benshikj_DoActionForUsersRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_DoActionForUsersResult_descriptor;
    private static final k0.f internal_static_benshikj_DoActionForUsersResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_FreshAccessTokenRequest_descriptor;
    private static final k0.f internal_static_benshikj_FreshAccessTokenRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_FreshAccessTokenResult_descriptor;
    private static final k0.f internal_static_benshikj_FreshAccessTokenResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_GetPushMessageRequest_descriptor;
    private static final k0.f internal_static_benshikj_GetPushMessageRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_GetPushMessageResult_descriptor;
    private static final k0.f internal_static_benshikj_GetPushMessageResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_GetStatusRequest_descriptor;
    private static final k0.f internal_static_benshikj_GetStatusRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_GetStatusResult_descriptor;
    private static final k0.f internal_static_benshikj_GetStatusResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_GetUserIDsRequest_descriptor;
    private static final k0.f internal_static_benshikj_GetUserIDsRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_GetUserIDsResult_descriptor;
    private static final k0.f internal_static_benshikj_GetUserIDsResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_GetUserInfosRequest_descriptor;
    private static final k0.f internal_static_benshikj_GetUserInfosRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_GetUserInfosResult_descriptor;
    private static final k0.f internal_static_benshikj_GetUserInfosResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_GetUserPhotoRequest_descriptor;
    private static final k0.f internal_static_benshikj_GetUserPhotoRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_GetUserPhotoResult_descriptor;
    private static final k0.f internal_static_benshikj_GetUserPhotoResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_LoadProfileRequest_descriptor;
    private static final k0.f internal_static_benshikj_LoadProfileRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_LoadProfileResult_descriptor;
    private static final k0.f internal_static_benshikj_LoadProfileResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_LoginRequest_descriptor;
    private static final k0.f internal_static_benshikj_LoginRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_LoginResult_descriptor;
    private static final k0.f internal_static_benshikj_LoginResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_LogoutRequest_descriptor;
    private static final k0.f internal_static_benshikj_LogoutRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_LogoutResult_descriptor;
    private static final k0.f internal_static_benshikj_LogoutResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_OpenIDLoginRequest_descriptor;
    private static final k0.f internal_static_benshikj_OpenIDLoginRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_PushMessage_descriptor;
    private static final k0.f internal_static_benshikj_PushMessage_fieldAccessorTable;
    private static final r.b internal_static_benshikj_SetUserPhotoRequest_descriptor;
    private static final k0.f internal_static_benshikj_SetUserPhotoRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_UpdateProfileRequest_Update_descriptor;
    private static final k0.f internal_static_benshikj_UpdateProfileRequest_Update_fieldAccessorTable;
    private static final r.b internal_static_benshikj_UpdateProfileRequest_descriptor;
    private static final k0.f internal_static_benshikj_UpdateProfileRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_UpdateProfileResult_descriptor;
    private static final k0.f internal_static_benshikj_UpdateProfileResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_UserInfo_descriptor;
    private static final k0.f internal_static_benshikj_UserInfo_fieldAccessorTable;
    private static final r.b internal_static_benshikj_UserProfile_descriptor;
    private static final k0.f internal_static_benshikj_UserProfile_fieldAccessorTable;
    private static final r.b internal_static_benshikj_UserPublicProfileRequest_descriptor;
    private static final k0.f internal_static_benshikj_UserPublicProfileRequest_fieldAccessorTable;
    private static final r.b internal_static_benshikj_UserPublicProfileResult_descriptor;
    private static final k0.f internal_static_benshikj_UserPublicProfileResult_fieldAccessorTable;
    private static final r.b internal_static_benshikj_UserPublicProfile_descriptor;
    private static final k0.f internal_static_benshikj_UserPublicProfile_fieldAccessorTable;

    public enum ActionForUser implements o0.c {
        Nop(0),
        Delete(1),
        Lock(2),
        Logout(3),
        UNRECOGNIZED(-1);

        public static final int Delete_VALUE = 1;
        public static final int Lock_VALUE = 2;
        public static final int Logout_VALUE = 3;
        public static final int Nop_VALUE = 0;
        private final int value;
        private static final o0.d internalValueMap = new o0.d() { // from class: com.benshikj.ht.rpc.Um.ActionForUser.1
            /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
            public ActionForUser m704findValueByNumber(int i10) {
                return ActionForUser.forNumber(i10);
            }
        };
        private static final ActionForUser[] VALUES = values();

        ActionForUser(int i10) {
            this.value = i10;
        }

        public static ActionForUser forNumber(int i10) {
            if (i10 == 0) {
                return Nop;
            }
            if (i10 == 1) {
                return Delete;
            }
            if (i10 == 2) {
                return Lock;
            }
            if (i10 != 3) {
                return null;
            }
            return Logout;
        }

        public static final r.e getDescriptor() {
            return (r.e) Um.getDescriptor().k().get(1);
        }

        public static o0.d internalGetValueMap() {
            return internalValueMap;
        }

        public final r.e getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final r.f getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return (r.f) getDescriptor().k().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static ActionForUser valueOf(int i10) {
            return forNumber(i10);
        }

        public static ActionForUser valueOf(r.f fVar) {
            if (fVar.h() == getDescriptor()) {
                if (fVar.g() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[fVar.g()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class DeleteUserRequest extends com.google.protobuf.k0 implements DeleteUserRequestOrBuilder {
        private static final DeleteUserRequest DEFAULT_INSTANCE = new DeleteUserRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.DeleteUserRequest.1
            @Override // com.google.protobuf.z1
            public DeleteUserRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = DeleteUserRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int USERIDS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int userIDsMemoizedSerializedSize;
        private o0.i userIDs_;

        public static DeleteUserRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_DeleteUserRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeleteUserRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeleteUserRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeleteUserRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (DeleteUserRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeleteUserRequest)) {
                return super.equals(obj);
            }
            DeleteUserRequest deleteUserRequest = (DeleteUserRequest) obj;
            return getUserIDsList().equals(deleteUserRequest.getUserIDsList()) && getUnknownFields().equals(deleteUserRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iA = 0;
            for (int i11 = 0; i11 < this.userIDs_.size(); i11++) {
                iA += com.google.protobuf.o.A(this.userIDs_.getLong(i11));
            }
            int iY = !getUserIDsList().isEmpty() ? iA + 1 + com.google.protobuf.o.y(iA) : iA;
            this.userIDsMemoizedSerializedSize = iA;
            int serializedSize = iY + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Um.DeleteUserRequestOrBuilder
        public long getUserIDs(int i10) {
            return this.userIDs_.getLong(i10);
        }

        @Override // com.benshikj.ht.rpc.Um.DeleteUserRequestOrBuilder
        public int getUserIDsCount() {
            return this.userIDs_.size();
        }

        @Override // com.benshikj.ht.rpc.Um.DeleteUserRequestOrBuilder
        public List<Long> getUserIDsList() {
            return this.userIDs_;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getUserIDsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getUserIDsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_DeleteUserRequest_fieldAccessorTable.d(DeleteUserRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new DeleteUserRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            getSerializedSize();
            if (getUserIDsList().size() > 0) {
                oVar.T0(10);
                oVar.T0(this.userIDsMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.userIDs_.size(); i10++) {
                oVar.G0(this.userIDs_.getLong(i10));
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements DeleteUserRequestOrBuilder {
            private int bitField0_;
            private o0.i userIDs_;

            private void buildPartial0(DeleteUserRequest deleteUserRequest) {
            }

            private void buildPartialRepeatedFields(DeleteUserRequest deleteUserRequest) {
                if ((this.bitField0_ & 1) != 0) {
                    this.userIDs_.r();
                    this.bitField0_ &= -2;
                }
                deleteUserRequest.userIDs_ = this.userIDs_;
            }

            private void ensureUserIDsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.userIDs_ = com.google.protobuf.k0.mutableCopy(this.userIDs_);
                    this.bitField0_ |= 1;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_DeleteUserRequest_descriptor;
            }

            public Builder addAllUserIDs(Iterable<? extends Long> iterable) {
                ensureUserIDsIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.userIDs_);
                onChanged();
                return this;
            }

            public Builder addUserIDs(long j10) {
                ensureUserIDsIsMutable();
                this.userIDs_.G(j10);
                onChanged();
                return this;
            }

            public Builder clearUserIDs() {
                this.userIDs_ = com.google.protobuf.k0.emptyLongList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_DeleteUserRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.DeleteUserRequestOrBuilder
            public long getUserIDs(int i10) {
                return this.userIDs_.getLong(i10);
            }

            @Override // com.benshikj.ht.rpc.Um.DeleteUserRequestOrBuilder
            public int getUserIDsCount() {
                return this.userIDs_.size();
            }

            @Override // com.benshikj.ht.rpc.Um.DeleteUserRequestOrBuilder
            public List<Long> getUserIDsList() {
                return (this.bitField0_ & 1) != 0 ? DesugarCollections.unmodifiableList(this.userIDs_) : this.userIDs_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_DeleteUserRequest_fieldAccessorTable.d(DeleteUserRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setUserIDs(int i10, long j10) {
                ensureUserIDsIsMutable();
                this.userIDs_.W(i10, j10);
                onChanged();
                return this;
            }

            private Builder() {
                this.userIDs_ = com.google.protobuf.k0.emptyLongList();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DeleteUserRequest build() {
                DeleteUserRequest deleteUserRequestBuildPartial = buildPartial();
                if (deleteUserRequestBuildPartial.isInitialized()) {
                    return deleteUserRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) deleteUserRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DeleteUserRequest buildPartial() {
                DeleteUserRequest deleteUserRequest = new DeleteUserRequest(this);
                buildPartialRepeatedFields(deleteUserRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(deleteUserRequest);
                }
                onBuilt();
                return deleteUserRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public DeleteUserRequest getDefaultInstanceForType() {
                return DeleteUserRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.userIDs_ = com.google.protobuf.k0.emptyLongList();
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m707clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.userIDs_ = com.google.protobuf.k0.emptyLongList();
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m715clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof DeleteUserRequest) {
                    return mergeFrom((DeleteUserRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(DeleteUserRequest deleteUserRequest) {
                if (deleteUserRequest == DeleteUserRequest.getDefaultInstance()) {
                    return this;
                }
                if (!deleteUserRequest.userIDs_.isEmpty()) {
                    if (this.userIDs_.isEmpty()) {
                        this.userIDs_ = deleteUserRequest.userIDs_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureUserIDsIsMutable();
                        this.userIDs_.addAll(deleteUserRequest.userIDs_);
                    }
                    onChanged();
                }
                m141mergeUnknownFields(deleteUserRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    long jZ = mVar.z();
                                    ensureUserIDsIsMutable();
                                    this.userIDs_.G(jZ);
                                } else if (iK != 10) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    int iP = mVar.p(mVar.C());
                                    ensureUserIDsIsMutable();
                                    while (mVar.e() > 0) {
                                        this.userIDs_.G(mVar.z());
                                    }
                                    mVar.o(iP);
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private DeleteUserRequest(k0.b bVar) {
            super(bVar);
            this.userIDsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(DeleteUserRequest deleteUserRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deleteUserRequest);
        }

        public static DeleteUserRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeleteUserRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static DeleteUserRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DeleteUserRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static DeleteUserRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (DeleteUserRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public DeleteUserRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DeleteUserRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeleteUserRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DeleteUserRequest() {
            this.userIDsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.userIDs_ = com.google.protobuf.k0.emptyLongList();
        }

        public static DeleteUserRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (DeleteUserRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static DeleteUserRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeleteUserRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static DeleteUserRequest parseFrom(InputStream inputStream) throws IOException {
            return (DeleteUserRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static DeleteUserRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DeleteUserRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static DeleteUserRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (DeleteUserRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static DeleteUserRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (DeleteUserRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface DeleteUserRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        long getUserIDs(int i10);

        int getUserIDsCount();

        List<Long> getUserIDsList();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class DeleteUserResult extends com.google.protobuf.k0 implements DeleteUserResultOrBuilder {
        private static final DeleteUserResult DEFAULT_INSTANCE = new DeleteUserResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.DeleteUserResult.1
            @Override // com.google.protobuf.z1
            public DeleteUserResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = DeleteUserResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        public static DeleteUserResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_DeleteUserResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeleteUserResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeleteUserResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeleteUserResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (DeleteUserResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof DeleteUserResult) ? super.equals(obj) : getUnknownFields().equals(((DeleteUserResult) obj).getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((779 + getDescriptor().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_DeleteUserResult_fieldAccessorTable.d(DeleteUserResult.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new DeleteUserResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements DeleteUserResultOrBuilder {
            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_DeleteUserResult_descriptor;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_DeleteUserResult_descriptor;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_DeleteUserResult_fieldAccessorTable.d(DeleteUserResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DeleteUserResult build() {
                DeleteUserResult deleteUserResultBuildPartial = buildPartial();
                if (deleteUserResultBuildPartial.isInitialized()) {
                    return deleteUserResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) deleteUserResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DeleteUserResult buildPartial() {
                DeleteUserResult deleteUserResult = new DeleteUserResult(this);
                onBuilt();
                return deleteUserResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public DeleteUserResult getDefaultInstanceForType() {
                return DeleteUserResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m720clear() {
                super.m132clear();
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m728clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof DeleteUserResult) {
                    return mergeFrom((DeleteUserResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(DeleteUserResult deleteUserResult) {
                if (deleteUserResult == DeleteUserResult.getDefaultInstance()) {
                    return this;
                }
                m141mergeUnknownFields(deleteUserResult.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK == 0 || !super.parseUnknownField(mVar, yVar, iK)) {
                                z10 = true;
                            }
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }
        }

        private DeleteUserResult(k0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(DeleteUserResult deleteUserResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deleteUserResult);
        }

        public static DeleteUserResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeleteUserResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static DeleteUserResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DeleteUserResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static DeleteUserResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (DeleteUserResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public DeleteUserResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private DeleteUserResult() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeleteUserResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeleteUserResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeleteUserResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (DeleteUserResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static DeleteUserResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeleteUserResult) PARSER.parseFrom(bArr, yVar);
        }

        public static DeleteUserResult parseFrom(InputStream inputStream) throws IOException {
            return (DeleteUserResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static DeleteUserResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DeleteUserResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static DeleteUserResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (DeleteUserResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static DeleteUserResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (DeleteUserResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface DeleteUserResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class DeviceInformation extends com.google.protobuf.k0 implements DeviceInformationOrBuilder {
        public static final int DID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object did_;
        private byte memoizedIsInitialized;
        private static final DeviceInformation DEFAULT_INSTANCE = new DeviceInformation();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.DeviceInformation.1
            @Override // com.google.protobuf.z1
            public DeviceInformation parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = DeviceInformation.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public static DeviceInformation getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_DeviceInformation_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeviceInformation parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DeviceInformation) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeviceInformation parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (DeviceInformation) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeviceInformation)) {
                return super.equals(obj);
            }
            DeviceInformation deviceInformation = (DeviceInformation) obj;
            return getDid().equals(deviceInformation.getDid()) && getUnknownFields().equals(deviceInformation.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.DeviceInformationOrBuilder
        public String getDid() {
            Object obj = this.did_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.did_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.DeviceInformationOrBuilder
        public com.google.protobuf.l getDidBytes() {
            Object obj = this.did_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.did_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = (!com.google.protobuf.k0.isStringEmpty(this.did_) ? com.google.protobuf.k0.computeStringSize(1, this.did_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iComputeStringSize;
            return iComputeStringSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getDid().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_DeviceInformation_fieldAccessorTable.d(DeviceInformation.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new DeviceInformation();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!com.google.protobuf.k0.isStringEmpty(this.did_)) {
                com.google.protobuf.k0.writeString(oVar, 1, this.did_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements DeviceInformationOrBuilder {
            private int bitField0_;
            private Object did_;

            private void buildPartial0(DeviceInformation deviceInformation) {
                if ((this.bitField0_ & 1) != 0) {
                    deviceInformation.did_ = this.did_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_DeviceInformation_descriptor;
            }

            public Builder clearDid() {
                this.did_ = DeviceInformation.getDefaultInstance().getDid();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_DeviceInformation_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.DeviceInformationOrBuilder
            public String getDid() {
                Object obj = this.did_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.did_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.DeviceInformationOrBuilder
            public com.google.protobuf.l getDidBytes() {
                Object obj = this.did_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.did_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_DeviceInformation_fieldAccessorTable.d(DeviceInformation.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setDid(String str) {
                str.getClass();
                this.did_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDidBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.did_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.did_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DeviceInformation build() {
                DeviceInformation deviceInformationBuildPartial = buildPartial();
                if (deviceInformationBuildPartial.isInitialized()) {
                    return deviceInformationBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) deviceInformationBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DeviceInformation buildPartial() {
                DeviceInformation deviceInformation = new DeviceInformation(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deviceInformation);
                }
                onBuilt();
                return deviceInformation;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public DeviceInformation getDefaultInstanceForType() {
                return DeviceInformation.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.did_ = "";
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m733clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.did_ = "";
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m741clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof DeviceInformation) {
                    return mergeFrom((DeviceInformation) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(DeviceInformation deviceInformation) {
                if (deviceInformation == DeviceInformation.getDefaultInstance()) {
                    return this;
                }
                if (!deviceInformation.getDid().isEmpty()) {
                    this.did_ = deviceInformation.did_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                m141mergeUnknownFields(deviceInformation.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK != 10) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.did_ = mVar.J();
                                    this.bitField0_ |= 1;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private DeviceInformation(k0.b bVar) {
            super(bVar);
            this.did_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(DeviceInformation deviceInformation) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deviceInformation);
        }

        public static DeviceInformation parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeviceInformation) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static DeviceInformation parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DeviceInformation) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static DeviceInformation parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (DeviceInformation) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public DeviceInformation getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DeviceInformation parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeviceInformation) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DeviceInformation() {
            this.did_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.did_ = "";
        }

        public static DeviceInformation parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (DeviceInformation) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static DeviceInformation parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DeviceInformation) PARSER.parseFrom(bArr, yVar);
        }

        public static DeviceInformation parseFrom(InputStream inputStream) throws IOException {
            return (DeviceInformation) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static DeviceInformation parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DeviceInformation) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static DeviceInformation parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (DeviceInformation) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static DeviceInformation parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (DeviceInformation) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface DeviceInformationOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        String getDid();

        com.google.protobuf.l getDidBytes();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class DoActionForUsersRequest extends com.google.protobuf.k0 implements DoActionForUsersRequestOrBuilder {
        public static final int ACTIONS_FIELD_NUMBER = 1;
        public static final int USERIDS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int actionsMemoizedSerializedSize;
        private List<Integer> actions_;
        private byte memoizedIsInitialized;
        private int userIDsMemoizedSerializedSize;
        private o0.i userIDs_;
        private static final o0.h.a actions_converter_ = new o0.h.a() { // from class: com.benshikj.ht.rpc.Um.DoActionForUsersRequest.1
            @Override // com.google.protobuf.o0.h.a
            public ActionForUser convert(Integer num) {
                ActionForUser actionForUserForNumber = ActionForUser.forNumber(num.intValue());
                return actionForUserForNumber == null ? ActionForUser.UNRECOGNIZED : actionForUserForNumber;
            }
        };
        private static final DoActionForUsersRequest DEFAULT_INSTANCE = new DoActionForUsersRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.DoActionForUsersRequest.2
            @Override // com.google.protobuf.z1
            public DoActionForUsersRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = DoActionForUsersRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public static DoActionForUsersRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_DoActionForUsersRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DoActionForUsersRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DoActionForUsersRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DoActionForUsersRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (DoActionForUsersRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DoActionForUsersRequest)) {
                return super.equals(obj);
            }
            DoActionForUsersRequest doActionForUsersRequest = (DoActionForUsersRequest) obj;
            return this.actions_.equals(doActionForUsersRequest.actions_) && getUserIDsList().equals(doActionForUsersRequest.getUserIDsList()) && getUnknownFields().equals(doActionForUsersRequest.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
        public ActionForUser getActions(int i10) {
            return (ActionForUser) actions_converter_.convert(this.actions_.get(i10));
        }

        @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
        public int getActionsCount() {
            return this.actions_.size();
        }

        @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
        public List<ActionForUser> getActionsList() {
            return new o0.h(this.actions_, actions_converter_);
        }

        @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
        public int getActionsValue(int i10) {
            return this.actions_.get(i10).intValue();
        }

        @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
        public List<Integer> getActionsValueList() {
            return this.actions_;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iM = 0;
            for (int i11 = 0; i11 < this.actions_.size(); i11++) {
                iM += com.google.protobuf.o.m(this.actions_.get(i11).intValue());
            }
            int iY = !getActionsList().isEmpty() ? iM + 1 + com.google.protobuf.o.Y(iM) : iM;
            this.actionsMemoizedSerializedSize = iM;
            int iA = 0;
            for (int i12 = 0; i12 < this.userIDs_.size(); i12++) {
                iA += com.google.protobuf.o.A(this.userIDs_.getLong(i12));
            }
            int iY2 = iY + iA;
            if (!getUserIDsList().isEmpty()) {
                iY2 = iY2 + 1 + com.google.protobuf.o.y(iA);
            }
            this.userIDsMemoizedSerializedSize = iA;
            int serializedSize = iY2 + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
        public long getUserIDs(int i10) {
            return this.userIDs_.getLong(i10);
        }

        @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
        public int getUserIDsCount() {
            return this.userIDs_.size();
        }

        @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
        public List<Long> getUserIDsList() {
            return this.userIDs_;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getActionsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + this.actions_.hashCode();
            }
            if (getUserIDsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getUserIDsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_DoActionForUsersRequest_fieldAccessorTable.d(DoActionForUsersRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new DoActionForUsersRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            getSerializedSize();
            if (getActionsList().size() > 0) {
                oVar.T0(10);
                oVar.T0(this.actionsMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.actions_.size(); i10++) {
                oVar.v0(this.actions_.get(i10).intValue());
            }
            if (getUserIDsList().size() > 0) {
                oVar.T0(18);
                oVar.T0(this.userIDsMemoizedSerializedSize);
            }
            for (int i11 = 0; i11 < this.userIDs_.size(); i11++) {
                oVar.G0(this.userIDs_.getLong(i11));
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements DoActionForUsersRequestOrBuilder {
            private List<Integer> actions_;
            private int bitField0_;
            private o0.i userIDs_;

            private void buildPartial0(DoActionForUsersRequest doActionForUsersRequest) {
            }

            private void buildPartialRepeatedFields(DoActionForUsersRequest doActionForUsersRequest) {
                if ((this.bitField0_ & 1) != 0) {
                    this.actions_ = DesugarCollections.unmodifiableList(this.actions_);
                    this.bitField0_ &= -2;
                }
                doActionForUsersRequest.actions_ = this.actions_;
                if ((this.bitField0_ & 2) != 0) {
                    this.userIDs_.r();
                    this.bitField0_ &= -3;
                }
                doActionForUsersRequest.userIDs_ = this.userIDs_;
            }

            private void ensureActionsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.actions_ = new ArrayList(this.actions_);
                    this.bitField0_ |= 1;
                }
            }

            private void ensureUserIDsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.userIDs_ = com.google.protobuf.k0.mutableCopy(this.userIDs_);
                    this.bitField0_ |= 2;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_DoActionForUsersRequest_descriptor;
            }

            public Builder addActions(ActionForUser actionForUser) {
                actionForUser.getClass();
                ensureActionsIsMutable();
                this.actions_.add(Integer.valueOf(actionForUser.getNumber()));
                onChanged();
                return this;
            }

            public Builder addActionsValue(int i10) {
                ensureActionsIsMutable();
                this.actions_.add(Integer.valueOf(i10));
                onChanged();
                return this;
            }

            public Builder addAllActions(Iterable<? extends ActionForUser> iterable) {
                ensureActionsIsMutable();
                Iterator<? extends ActionForUser> it = iterable.iterator();
                while (it.hasNext()) {
                    this.actions_.add(Integer.valueOf(it.next().getNumber()));
                }
                onChanged();
                return this;
            }

            public Builder addAllActionsValue(Iterable<Integer> iterable) {
                ensureActionsIsMutable();
                for (Integer num : iterable) {
                    num.intValue();
                    this.actions_.add(num);
                }
                onChanged();
                return this;
            }

            public Builder addAllUserIDs(Iterable<? extends Long> iterable) {
                ensureUserIDsIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.userIDs_);
                onChanged();
                return this;
            }

            public Builder addUserIDs(long j10) {
                ensureUserIDsIsMutable();
                this.userIDs_.G(j10);
                onChanged();
                return this;
            }

            public Builder clearActions() {
                this.actions_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearUserIDs() {
                this.userIDs_ = com.google.protobuf.k0.emptyLongList();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
            public ActionForUser getActions(int i10) {
                return (ActionForUser) DoActionForUsersRequest.actions_converter_.convert(this.actions_.get(i10));
            }

            @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
            public int getActionsCount() {
                return this.actions_.size();
            }

            @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
            public List<ActionForUser> getActionsList() {
                return new o0.h(this.actions_, DoActionForUsersRequest.actions_converter_);
            }

            @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
            public int getActionsValue(int i10) {
                return this.actions_.get(i10).intValue();
            }

            @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
            public List<Integer> getActionsValueList() {
                return DesugarCollections.unmodifiableList(this.actions_);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_DoActionForUsersRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
            public long getUserIDs(int i10) {
                return this.userIDs_.getLong(i10);
            }

            @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
            public int getUserIDsCount() {
                return this.userIDs_.size();
            }

            @Override // com.benshikj.ht.rpc.Um.DoActionForUsersRequestOrBuilder
            public List<Long> getUserIDsList() {
                return (this.bitField0_ & 2) != 0 ? DesugarCollections.unmodifiableList(this.userIDs_) : this.userIDs_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_DoActionForUsersRequest_fieldAccessorTable.d(DoActionForUsersRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setActions(int i10, ActionForUser actionForUser) {
                actionForUser.getClass();
                ensureActionsIsMutable();
                this.actions_.set(i10, Integer.valueOf(actionForUser.getNumber()));
                onChanged();
                return this;
            }

            public Builder setActionsValue(int i10, int i11) {
                ensureActionsIsMutable();
                this.actions_.set(i10, Integer.valueOf(i11));
                onChanged();
                return this;
            }

            public Builder setUserIDs(int i10, long j10) {
                ensureUserIDsIsMutable();
                this.userIDs_.W(i10, j10);
                onChanged();
                return this;
            }

            private Builder() {
                this.actions_ = Collections.EMPTY_LIST;
                this.userIDs_ = com.google.protobuf.k0.emptyLongList();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DoActionForUsersRequest build() {
                DoActionForUsersRequest doActionForUsersRequestBuildPartial = buildPartial();
                if (doActionForUsersRequestBuildPartial.isInitialized()) {
                    return doActionForUsersRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) doActionForUsersRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DoActionForUsersRequest buildPartial() {
                DoActionForUsersRequest doActionForUsersRequest = new DoActionForUsersRequest(this);
                buildPartialRepeatedFields(doActionForUsersRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(doActionForUsersRequest);
                }
                onBuilt();
                return doActionForUsersRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public DoActionForUsersRequest getDefaultInstanceForType() {
                return DoActionForUsersRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m746clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.actions_ = Collections.EMPTY_LIST;
                this.bitField0_ = 0;
                this.userIDs_ = com.google.protobuf.k0.emptyLongList();
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.actions_ = Collections.EMPTY_LIST;
                this.userIDs_ = com.google.protobuf.k0.emptyLongList();
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m754clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof DoActionForUsersRequest) {
                    return mergeFrom((DoActionForUsersRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(DoActionForUsersRequest doActionForUsersRequest) {
                if (doActionForUsersRequest == DoActionForUsersRequest.getDefaultInstance()) {
                    return this;
                }
                if (!doActionForUsersRequest.actions_.isEmpty()) {
                    if (this.actions_.isEmpty()) {
                        this.actions_ = doActionForUsersRequest.actions_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureActionsIsMutable();
                        this.actions_.addAll(doActionForUsersRequest.actions_);
                    }
                    onChanged();
                }
                if (!doActionForUsersRequest.userIDs_.isEmpty()) {
                    if (this.userIDs_.isEmpty()) {
                        this.userIDs_ = doActionForUsersRequest.userIDs_;
                        this.bitField0_ &= -3;
                    } else {
                        ensureUserIDsIsMutable();
                        this.userIDs_.addAll(doActionForUsersRequest.userIDs_);
                    }
                    onChanged();
                }
                m141mergeUnknownFields(doActionForUsersRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    int iT = mVar.t();
                                    ensureActionsIsMutable();
                                    this.actions_.add(Integer.valueOf(iT));
                                } else if (iK == 10) {
                                    int iP = mVar.p(mVar.C());
                                    while (mVar.e() > 0) {
                                        int iT2 = mVar.t();
                                        ensureActionsIsMutable();
                                        this.actions_.add(Integer.valueOf(iT2));
                                    }
                                    mVar.o(iP);
                                } else if (iK == 16) {
                                    long jZ = mVar.z();
                                    ensureUserIDsIsMutable();
                                    this.userIDs_.G(jZ);
                                } else if (iK != 18) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    int iP2 = mVar.p(mVar.C());
                                    ensureUserIDsIsMutable();
                                    while (mVar.e() > 0) {
                                        this.userIDs_.G(mVar.z());
                                    }
                                    mVar.o(iP2);
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private DoActionForUsersRequest(k0.b bVar) {
            super(bVar);
            this.userIDsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(DoActionForUsersRequest doActionForUsersRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(doActionForUsersRequest);
        }

        public static DoActionForUsersRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DoActionForUsersRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static DoActionForUsersRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DoActionForUsersRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static DoActionForUsersRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (DoActionForUsersRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public DoActionForUsersRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static DoActionForUsersRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DoActionForUsersRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private DoActionForUsersRequest() {
            this.userIDsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.actions_ = Collections.EMPTY_LIST;
            this.userIDs_ = com.google.protobuf.k0.emptyLongList();
        }

        public static DoActionForUsersRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (DoActionForUsersRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static DoActionForUsersRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DoActionForUsersRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static DoActionForUsersRequest parseFrom(InputStream inputStream) throws IOException {
            return (DoActionForUsersRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static DoActionForUsersRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DoActionForUsersRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static DoActionForUsersRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (DoActionForUsersRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static DoActionForUsersRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (DoActionForUsersRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface DoActionForUsersRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        ActionForUser getActions(int i10);

        int getActionsCount();

        List<ActionForUser> getActionsList();

        int getActionsValue(int i10);

        List<Integer> getActionsValueList();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        long getUserIDs(int i10);

        int getUserIDsCount();

        List<Long> getUserIDsList();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class DoActionForUsersResult extends com.google.protobuf.k0 implements DoActionForUsersResultOrBuilder {
        private static final DoActionForUsersResult DEFAULT_INSTANCE = new DoActionForUsersResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.DoActionForUsersResult.1
            @Override // com.google.protobuf.z1
            public DoActionForUsersResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = DoActionForUsersResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        public static DoActionForUsersResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_DoActionForUsersResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DoActionForUsersResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (DoActionForUsersResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DoActionForUsersResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (DoActionForUsersResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof DoActionForUsersResult) ? super.equals(obj) : getUnknownFields().equals(((DoActionForUsersResult) obj).getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((779 + getDescriptor().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_DoActionForUsersResult_fieldAccessorTable.d(DoActionForUsersResult.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new DoActionForUsersResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements DoActionForUsersResultOrBuilder {
            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_DoActionForUsersResult_descriptor;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_DoActionForUsersResult_descriptor;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_DoActionForUsersResult_fieldAccessorTable.d(DoActionForUsersResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DoActionForUsersResult build() {
                DoActionForUsersResult doActionForUsersResultBuildPartial = buildPartial();
                if (doActionForUsersResultBuildPartial.isInitialized()) {
                    return doActionForUsersResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) doActionForUsersResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public DoActionForUsersResult buildPartial() {
                DoActionForUsersResult doActionForUsersResult = new DoActionForUsersResult(this);
                onBuilt();
                return doActionForUsersResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public DoActionForUsersResult getDefaultInstanceForType() {
                return DoActionForUsersResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m759clear() {
                super.m132clear();
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m767clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof DoActionForUsersResult) {
                    return mergeFrom((DoActionForUsersResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(DoActionForUsersResult doActionForUsersResult) {
                if (doActionForUsersResult == DoActionForUsersResult.getDefaultInstance()) {
                    return this;
                }
                m141mergeUnknownFields(doActionForUsersResult.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK == 0 || !super.parseUnknownField(mVar, yVar, iK)) {
                                z10 = true;
                            }
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }
        }

        private DoActionForUsersResult(k0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(DoActionForUsersResult doActionForUsersResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(doActionForUsersResult);
        }

        public static DoActionForUsersResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DoActionForUsersResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static DoActionForUsersResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DoActionForUsersResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static DoActionForUsersResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (DoActionForUsersResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public DoActionForUsersResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private DoActionForUsersResult() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DoActionForUsersResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DoActionForUsersResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DoActionForUsersResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (DoActionForUsersResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static DoActionForUsersResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (DoActionForUsersResult) PARSER.parseFrom(bArr, yVar);
        }

        public static DoActionForUsersResult parseFrom(InputStream inputStream) throws IOException {
            return (DoActionForUsersResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static DoActionForUsersResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (DoActionForUsersResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static DoActionForUsersResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (DoActionForUsersResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static DoActionForUsersResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (DoActionForUsersResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface DoActionForUsersResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class FreshAccessTokenRequest extends com.google.protobuf.k0 implements FreshAccessTokenRequestOrBuilder {
        public static final int ACCESSTOKEN_FIELD_NUMBER = 1;
        private static final FreshAccessTokenRequest DEFAULT_INSTANCE = new FreshAccessTokenRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.FreshAccessTokenRequest.1
            @Override // com.google.protobuf.z1
            public FreshAccessTokenRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = FreshAccessTokenRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int REFRESHTOKEN_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object accessToken_;
        private byte memoizedIsInitialized;
        private volatile Object refreshToken_;

        public static FreshAccessTokenRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_FreshAccessTokenRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FreshAccessTokenRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FreshAccessTokenRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FreshAccessTokenRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (FreshAccessTokenRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FreshAccessTokenRequest)) {
                return super.equals(obj);
            }
            FreshAccessTokenRequest freshAccessTokenRequest = (FreshAccessTokenRequest) obj;
            return getAccessToken().equals(freshAccessTokenRequest.getAccessToken()) && getRefreshToken().equals(freshAccessTokenRequest.getRefreshToken()) && getUnknownFields().equals(freshAccessTokenRequest.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenRequestOrBuilder
        public String getAccessToken() {
            Object obj = this.accessToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.accessToken_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenRequestOrBuilder
        public com.google.protobuf.l getAccessTokenBytes() {
            Object obj = this.accessToken_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.accessToken_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenRequestOrBuilder
        public String getRefreshToken() {
            Object obj = this.refreshToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.refreshToken_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenRequestOrBuilder
        public com.google.protobuf.l getRefreshTokenBytes() {
            Object obj = this.refreshToken_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.refreshToken_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !com.google.protobuf.k0.isStringEmpty(this.accessToken_) ? com.google.protobuf.k0.computeStringSize(1, this.accessToken_) : 0;
            if (!com.google.protobuf.k0.isStringEmpty(this.refreshToken_)) {
                iComputeStringSize += com.google.protobuf.k0.computeStringSize(2, this.refreshToken_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAccessToken().hashCode()) * 37) + 2) * 53) + getRefreshToken().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_FreshAccessTokenRequest_fieldAccessorTable.d(FreshAccessTokenRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new FreshAccessTokenRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!com.google.protobuf.k0.isStringEmpty(this.accessToken_)) {
                com.google.protobuf.k0.writeString(oVar, 1, this.accessToken_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.refreshToken_)) {
                com.google.protobuf.k0.writeString(oVar, 2, this.refreshToken_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements FreshAccessTokenRequestOrBuilder {
            private Object accessToken_;
            private int bitField0_;
            private Object refreshToken_;

            private void buildPartial0(FreshAccessTokenRequest freshAccessTokenRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    freshAccessTokenRequest.accessToken_ = this.accessToken_;
                }
                if ((i10 & 2) != 0) {
                    freshAccessTokenRequest.refreshToken_ = this.refreshToken_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_FreshAccessTokenRequest_descriptor;
            }

            public Builder clearAccessToken() {
                this.accessToken_ = FreshAccessTokenRequest.getDefaultInstance().getAccessToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearRefreshToken() {
                this.refreshToken_ = FreshAccessTokenRequest.getDefaultInstance().getRefreshToken();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenRequestOrBuilder
            public String getAccessToken() {
                Object obj = this.accessToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.accessToken_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenRequestOrBuilder
            public com.google.protobuf.l getAccessTokenBytes() {
                Object obj = this.accessToken_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.accessToken_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_FreshAccessTokenRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenRequestOrBuilder
            public String getRefreshToken() {
                Object obj = this.refreshToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.refreshToken_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenRequestOrBuilder
            public com.google.protobuf.l getRefreshTokenBytes() {
                Object obj = this.refreshToken_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.refreshToken_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_FreshAccessTokenRequest_fieldAccessorTable.d(FreshAccessTokenRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAccessToken(String str) {
                str.getClass();
                this.accessToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAccessTokenBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.accessToken_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRefreshToken(String str) {
                str.getClass();
                this.refreshToken_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRefreshTokenBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.refreshToken_ = lVar;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.accessToken_ = "";
                this.refreshToken_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public FreshAccessTokenRequest build() {
                FreshAccessTokenRequest freshAccessTokenRequestBuildPartial = buildPartial();
                if (freshAccessTokenRequestBuildPartial.isInitialized()) {
                    return freshAccessTokenRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) freshAccessTokenRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public FreshAccessTokenRequest buildPartial() {
                FreshAccessTokenRequest freshAccessTokenRequest = new FreshAccessTokenRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(freshAccessTokenRequest);
                }
                onBuilt();
                return freshAccessTokenRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public FreshAccessTokenRequest getDefaultInstanceForType() {
                return FreshAccessTokenRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m772clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.accessToken_ = "";
                this.refreshToken_ = "";
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.accessToken_ = "";
                this.refreshToken_ = "";
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m780clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof FreshAccessTokenRequest) {
                    return mergeFrom((FreshAccessTokenRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(FreshAccessTokenRequest freshAccessTokenRequest) {
                if (freshAccessTokenRequest == FreshAccessTokenRequest.getDefaultInstance()) {
                    return this;
                }
                if (!freshAccessTokenRequest.getAccessToken().isEmpty()) {
                    this.accessToken_ = freshAccessTokenRequest.accessToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!freshAccessTokenRequest.getRefreshToken().isEmpty()) {
                    this.refreshToken_ = freshAccessTokenRequest.refreshToken_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                m141mergeUnknownFields(freshAccessTokenRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.accessToken_ = mVar.J();
                                    this.bitField0_ |= 1;
                                } else if (iK != 18) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.refreshToken_ = mVar.J();
                                    this.bitField0_ |= 2;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private FreshAccessTokenRequest(k0.b bVar) {
            super(bVar);
            this.accessToken_ = "";
            this.refreshToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(FreshAccessTokenRequest freshAccessTokenRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(freshAccessTokenRequest);
        }

        public static FreshAccessTokenRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (FreshAccessTokenRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static FreshAccessTokenRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (FreshAccessTokenRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static FreshAccessTokenRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (FreshAccessTokenRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public FreshAccessTokenRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static FreshAccessTokenRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (FreshAccessTokenRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FreshAccessTokenRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (FreshAccessTokenRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        private FreshAccessTokenRequest() {
            this.accessToken_ = "";
            this.refreshToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.accessToken_ = "";
            this.refreshToken_ = "";
        }

        public static FreshAccessTokenRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (FreshAccessTokenRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static FreshAccessTokenRequest parseFrom(InputStream inputStream) throws IOException {
            return (FreshAccessTokenRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static FreshAccessTokenRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (FreshAccessTokenRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static FreshAccessTokenRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (FreshAccessTokenRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static FreshAccessTokenRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (FreshAccessTokenRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface FreshAccessTokenRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        String getAccessToken();

        com.google.protobuf.l getAccessTokenBytes();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        String getRefreshToken();

        com.google.protobuf.l getRefreshTokenBytes();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class FreshAccessTokenResult extends com.google.protobuf.k0 implements FreshAccessTokenResultOrBuilder {
        public static final int ACCESSTOKENEXPIRES_FIELD_NUMBER = 2;
        public static final int ACCESSTOKEN_FIELD_NUMBER = 1;
        public static final int CODE_FIELD_NUMBER = 5;
        private static final FreshAccessTokenResult DEFAULT_INSTANCE = new FreshAccessTokenResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.FreshAccessTokenResult.1
            @Override // com.google.protobuf.z1
            public FreshAccessTokenResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = FreshAccessTokenResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int REFRESHTOKENEXPIRES_FIELD_NUMBER = 4;
        public static final int REFRESHTOKEN_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private long accessTokenExpires_;
        private volatile Object accessToken_;
        private int code_;
        private byte memoizedIsInitialized;
        private long refreshTokenExpires_;
        private volatile Object refreshToken_;

        public static FreshAccessTokenResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_FreshAccessTokenResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FreshAccessTokenResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (FreshAccessTokenResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FreshAccessTokenResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (FreshAccessTokenResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FreshAccessTokenResult)) {
                return super.equals(obj);
            }
            FreshAccessTokenResult freshAccessTokenResult = (FreshAccessTokenResult) obj;
            return getAccessToken().equals(freshAccessTokenResult.getAccessToken()) && getAccessTokenExpires() == freshAccessTokenResult.getAccessTokenExpires() && getRefreshToken().equals(freshAccessTokenResult.getRefreshToken()) && getRefreshTokenExpires() == freshAccessTokenResult.getRefreshTokenExpires() && this.code_ == freshAccessTokenResult.code_ && getUnknownFields().equals(freshAccessTokenResult.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
        public String getAccessToken() {
            Object obj = this.accessToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.accessToken_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
        public com.google.protobuf.l getAccessTokenBytes() {
            Object obj = this.accessToken_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.accessToken_ = lVarI;
            return lVarI;
        }

        @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
        public long getAccessTokenExpires() {
            return this.accessTokenExpires_;
        }

        @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
        public StatusCode getCode() {
            StatusCode statusCodeForNumber = StatusCode.forNumber(this.code_);
            return statusCodeForNumber == null ? StatusCode.UNRECOGNIZED : statusCodeForNumber;
        }

        @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
        public int getCodeValue() {
            return this.code_;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
        public String getRefreshToken() {
            Object obj = this.refreshToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.refreshToken_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
        public com.google.protobuf.l getRefreshTokenBytes() {
            Object obj = this.refreshToken_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.refreshToken_ = lVarI;
            return lVarI;
        }

        @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
        public long getRefreshTokenExpires() {
            return this.refreshTokenExpires_;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !com.google.protobuf.k0.isStringEmpty(this.accessToken_) ? com.google.protobuf.k0.computeStringSize(1, this.accessToken_) : 0;
            long j10 = this.accessTokenExpires_;
            if (j10 != 0) {
                iComputeStringSize += com.google.protobuf.o.z(2, j10);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.refreshToken_)) {
                iComputeStringSize += com.google.protobuf.k0.computeStringSize(3, this.refreshToken_);
            }
            long j11 = this.refreshTokenExpires_;
            if (j11 != 0) {
                iComputeStringSize += com.google.protobuf.o.z(4, j11);
            }
            if (this.code_ != StatusCode.ok.getNumber()) {
                iComputeStringSize += com.google.protobuf.o.l(5, this.code_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAccessToken().hashCode()) * 37) + 2) * 53) + com.google.protobuf.o0.i(getAccessTokenExpires())) * 37) + 3) * 53) + getRefreshToken().hashCode()) * 37) + 4) * 53) + com.google.protobuf.o0.i(getRefreshTokenExpires())) * 37) + 5) * 53) + this.code_) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_FreshAccessTokenResult_fieldAccessorTable.d(FreshAccessTokenResult.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new FreshAccessTokenResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!com.google.protobuf.k0.isStringEmpty(this.accessToken_)) {
                com.google.protobuf.k0.writeString(oVar, 1, this.accessToken_);
            }
            long j10 = this.accessTokenExpires_;
            if (j10 != 0) {
                oVar.F0(2, j10);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.refreshToken_)) {
                com.google.protobuf.k0.writeString(oVar, 3, this.refreshToken_);
            }
            long j11 = this.refreshTokenExpires_;
            if (j11 != 0) {
                oVar.F0(4, j11);
            }
            if (this.code_ != StatusCode.ok.getNumber()) {
                oVar.u0(5, this.code_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements FreshAccessTokenResultOrBuilder {
            private long accessTokenExpires_;
            private Object accessToken_;
            private int bitField0_;
            private int code_;
            private long refreshTokenExpires_;
            private Object refreshToken_;

            private void buildPartial0(FreshAccessTokenResult freshAccessTokenResult) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    freshAccessTokenResult.accessToken_ = this.accessToken_;
                }
                if ((i10 & 2) != 0) {
                    freshAccessTokenResult.accessTokenExpires_ = this.accessTokenExpires_;
                }
                if ((i10 & 4) != 0) {
                    freshAccessTokenResult.refreshToken_ = this.refreshToken_;
                }
                if ((i10 & 8) != 0) {
                    freshAccessTokenResult.refreshTokenExpires_ = this.refreshTokenExpires_;
                }
                if ((i10 & 16) != 0) {
                    freshAccessTokenResult.code_ = this.code_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_FreshAccessTokenResult_descriptor;
            }

            public Builder clearAccessToken() {
                this.accessToken_ = FreshAccessTokenResult.getDefaultInstance().getAccessToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearAccessTokenExpires() {
                this.bitField0_ &= -3;
                this.accessTokenExpires_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearCode() {
                this.bitField0_ &= -17;
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRefreshToken() {
                this.refreshToken_ = FreshAccessTokenResult.getDefaultInstance().getRefreshToken();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearRefreshTokenExpires() {
                this.bitField0_ &= -9;
                this.refreshTokenExpires_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
            public String getAccessToken() {
                Object obj = this.accessToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.accessToken_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
            public com.google.protobuf.l getAccessTokenBytes() {
                Object obj = this.accessToken_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.accessToken_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
            public long getAccessTokenExpires() {
                return this.accessTokenExpires_;
            }

            @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
            public StatusCode getCode() {
                StatusCode statusCodeForNumber = StatusCode.forNumber(this.code_);
                return statusCodeForNumber == null ? StatusCode.UNRECOGNIZED : statusCodeForNumber;
            }

            @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
            public int getCodeValue() {
                return this.code_;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_FreshAccessTokenResult_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
            public String getRefreshToken() {
                Object obj = this.refreshToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.refreshToken_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
            public com.google.protobuf.l getRefreshTokenBytes() {
                Object obj = this.refreshToken_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.refreshToken_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Um.FreshAccessTokenResultOrBuilder
            public long getRefreshTokenExpires() {
                return this.refreshTokenExpires_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_FreshAccessTokenResult_fieldAccessorTable.d(FreshAccessTokenResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAccessToken(String str) {
                str.getClass();
                this.accessToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAccessTokenBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.accessToken_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAccessTokenExpires(long j10) {
                this.accessTokenExpires_ = j10;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCode(StatusCode statusCode) {
                statusCode.getClass();
                this.bitField0_ |= 16;
                this.code_ = statusCode.getNumber();
                onChanged();
                return this;
            }

            public Builder setCodeValue(int i10) {
                this.code_ = i10;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setRefreshToken(String str) {
                str.getClass();
                this.refreshToken_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRefreshTokenBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.refreshToken_ = lVar;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRefreshTokenExpires(long j10) {
                this.refreshTokenExpires_ = j10;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            private Builder() {
                this.accessToken_ = "";
                this.refreshToken_ = "";
                this.code_ = 0;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public FreshAccessTokenResult build() {
                FreshAccessTokenResult freshAccessTokenResultBuildPartial = buildPartial();
                if (freshAccessTokenResultBuildPartial.isInitialized()) {
                    return freshAccessTokenResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) freshAccessTokenResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public FreshAccessTokenResult buildPartial() {
                FreshAccessTokenResult freshAccessTokenResult = new FreshAccessTokenResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(freshAccessTokenResult);
                }
                onBuilt();
                return freshAccessTokenResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public FreshAccessTokenResult getDefaultInstanceForType() {
                return FreshAccessTokenResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m785clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.accessToken_ = "";
                this.accessTokenExpires_ = 0L;
                this.refreshToken_ = "";
                this.refreshTokenExpires_ = 0L;
                this.code_ = 0;
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.accessToken_ = "";
                this.refreshToken_ = "";
                this.code_ = 0;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m793clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof FreshAccessTokenResult) {
                    return mergeFrom((FreshAccessTokenResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(FreshAccessTokenResult freshAccessTokenResult) {
                if (freshAccessTokenResult == FreshAccessTokenResult.getDefaultInstance()) {
                    return this;
                }
                if (!freshAccessTokenResult.getAccessToken().isEmpty()) {
                    this.accessToken_ = freshAccessTokenResult.accessToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (freshAccessTokenResult.getAccessTokenExpires() != 0) {
                    setAccessTokenExpires(freshAccessTokenResult.getAccessTokenExpires());
                }
                if (!freshAccessTokenResult.getRefreshToken().isEmpty()) {
                    this.refreshToken_ = freshAccessTokenResult.refreshToken_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (freshAccessTokenResult.getRefreshTokenExpires() != 0) {
                    setRefreshTokenExpires(freshAccessTokenResult.getRefreshTokenExpires());
                }
                if (freshAccessTokenResult.code_ != 0) {
                    setCodeValue(freshAccessTokenResult.getCodeValue());
                }
                m141mergeUnknownFields(freshAccessTokenResult.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.accessToken_ = mVar.J();
                                    this.bitField0_ |= 1;
                                } else if (iK == 16) {
                                    this.accessTokenExpires_ = mVar.z();
                                    this.bitField0_ |= 2;
                                } else if (iK == 26) {
                                    this.refreshToken_ = mVar.J();
                                    this.bitField0_ |= 4;
                                } else if (iK == 32) {
                                    this.refreshTokenExpires_ = mVar.z();
                                    this.bitField0_ |= 8;
                                } else if (iK != 40) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.code_ = mVar.t();
                                    this.bitField0_ |= 16;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private FreshAccessTokenResult(k0.b bVar) {
            super(bVar);
            this.accessToken_ = "";
            this.accessTokenExpires_ = 0L;
            this.refreshToken_ = "";
            this.refreshTokenExpires_ = 0L;
            this.code_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(FreshAccessTokenResult freshAccessTokenResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(freshAccessTokenResult);
        }

        public static FreshAccessTokenResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (FreshAccessTokenResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static FreshAccessTokenResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (FreshAccessTokenResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static FreshAccessTokenResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (FreshAccessTokenResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public FreshAccessTokenResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static FreshAccessTokenResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (FreshAccessTokenResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FreshAccessTokenResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (FreshAccessTokenResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static FreshAccessTokenResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (FreshAccessTokenResult) PARSER.parseFrom(bArr, yVar);
        }

        public static FreshAccessTokenResult parseFrom(InputStream inputStream) throws IOException {
            return (FreshAccessTokenResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        private FreshAccessTokenResult() {
            this.accessToken_ = "";
            this.accessTokenExpires_ = 0L;
            this.refreshToken_ = "";
            this.refreshTokenExpires_ = 0L;
            this.code_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.accessToken_ = "";
            this.refreshToken_ = "";
            this.code_ = 0;
        }

        public static FreshAccessTokenResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (FreshAccessTokenResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static FreshAccessTokenResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (FreshAccessTokenResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static FreshAccessTokenResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (FreshAccessTokenResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface FreshAccessTokenResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        String getAccessToken();

        com.google.protobuf.l getAccessTokenBytes();

        long getAccessTokenExpires();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        StatusCode getCode();

        int getCodeValue();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        String getRefreshToken();

        com.google.protobuf.l getRefreshTokenBytes();

        long getRefreshTokenExpires();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetPushMessageRequest extends com.google.protobuf.k0 implements GetPushMessageRequestOrBuilder {
        public static final int LIMIT_FIELD_NUMBER = 2;
        public static final int MESSAGEID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int limit_;
        private byte memoizedIsInitialized;
        private long messageID_;
        private static final GetPushMessageRequest DEFAULT_INSTANCE = new GetPushMessageRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.GetPushMessageRequest.1
            @Override // com.google.protobuf.z1
            public GetPushMessageRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = GetPushMessageRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public static GetPushMessageRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_GetPushMessageRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetPushMessageRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetPushMessageRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetPushMessageRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (GetPushMessageRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetPushMessageRequest)) {
                return super.equals(obj);
            }
            GetPushMessageRequest getPushMessageRequest = (GetPushMessageRequest) obj;
            return getMessageID() == getPushMessageRequest.getMessageID() && getLimit() == getPushMessageRequest.getLimit() && getUnknownFields().equals(getPushMessageRequest.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.GetPushMessageRequestOrBuilder
        public int getLimit() {
            return this.limit_;
        }

        @Override // com.benshikj.ht.rpc.Um.GetPushMessageRequestOrBuilder
        public long getMessageID() {
            return this.messageID_;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.messageID_;
            int iZ = j10 != 0 ? com.google.protobuf.o.z(1, j10) : 0;
            int i11 = this.limit_;
            if (i11 != 0) {
                iZ += com.google.protobuf.o.x(2, i11);
            }
            int serializedSize = iZ + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + com.google.protobuf.o0.i(getMessageID())) * 37) + 2) * 53) + getLimit()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_GetPushMessageRequest_fieldAccessorTable.d(GetPushMessageRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new GetPushMessageRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            long j10 = this.messageID_;
            if (j10 != 0) {
                oVar.F0(1, j10);
            }
            int i10 = this.limit_;
            if (i10 != 0) {
                oVar.D0(2, i10);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements GetPushMessageRequestOrBuilder {
            private int bitField0_;
            private int limit_;
            private long messageID_;

            private void buildPartial0(GetPushMessageRequest getPushMessageRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    getPushMessageRequest.messageID_ = this.messageID_;
                }
                if ((i10 & 2) != 0) {
                    getPushMessageRequest.limit_ = this.limit_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_GetPushMessageRequest_descriptor;
            }

            public Builder clearLimit() {
                this.bitField0_ &= -3;
                this.limit_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMessageID() {
                this.bitField0_ &= -2;
                this.messageID_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_GetPushMessageRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.GetPushMessageRequestOrBuilder
            public int getLimit() {
                return this.limit_;
            }

            @Override // com.benshikj.ht.rpc.Um.GetPushMessageRequestOrBuilder
            public long getMessageID() {
                return this.messageID_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_GetPushMessageRequest_fieldAccessorTable.d(GetPushMessageRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setLimit(int i10) {
                this.limit_ = i10;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setMessageID(long j10) {
                this.messageID_ = j10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetPushMessageRequest build() {
                GetPushMessageRequest getPushMessageRequestBuildPartial = buildPartial();
                if (getPushMessageRequestBuildPartial.isInitialized()) {
                    return getPushMessageRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) getPushMessageRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetPushMessageRequest buildPartial() {
                GetPushMessageRequest getPushMessageRequest = new GetPushMessageRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getPushMessageRequest);
                }
                onBuilt();
                return getPushMessageRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public GetPushMessageRequest getDefaultInstanceForType() {
                return GetPushMessageRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m798clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.messageID_ = 0L;
                this.limit_ = 0;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m806clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof GetPushMessageRequest) {
                    return mergeFrom((GetPushMessageRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(GetPushMessageRequest getPushMessageRequest) {
                if (getPushMessageRequest == GetPushMessageRequest.getDefaultInstance()) {
                    return this;
                }
                if (getPushMessageRequest.getMessageID() != 0) {
                    setMessageID(getPushMessageRequest.getMessageID());
                }
                if (getPushMessageRequest.getLimit() != 0) {
                    setLimit(getPushMessageRequest.getLimit());
                }
                m141mergeUnknownFields(getPushMessageRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.messageID_ = mVar.z();
                                    this.bitField0_ |= 1;
                                } else if (iK != 16) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.limit_ = mVar.y();
                                    this.bitField0_ |= 2;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private GetPushMessageRequest(k0.b bVar) {
            super(bVar);
            this.messageID_ = 0L;
            this.limit_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetPushMessageRequest getPushMessageRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getPushMessageRequest);
        }

        public static GetPushMessageRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetPushMessageRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static GetPushMessageRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetPushMessageRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static GetPushMessageRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (GetPushMessageRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public GetPushMessageRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GetPushMessageRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetPushMessageRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetPushMessageRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (GetPushMessageRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        private GetPushMessageRequest() {
            this.messageID_ = 0L;
            this.limit_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetPushMessageRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetPushMessageRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static GetPushMessageRequest parseFrom(InputStream inputStream) throws IOException {
            return (GetPushMessageRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static GetPushMessageRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetPushMessageRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static GetPushMessageRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (GetPushMessageRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static GetPushMessageRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (GetPushMessageRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface GetPushMessageRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        int getLimit();

        long getMessageID();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetPushMessageResult extends com.google.protobuf.k0 implements GetPushMessageResultOrBuilder {
        public static final int MESSAGES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<PushMessage> messages_;
        private static final GetPushMessageResult DEFAULT_INSTANCE = new GetPushMessageResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.GetPushMessageResult.1
            @Override // com.google.protobuf.z1
            public GetPushMessageResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = GetPushMessageResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public static GetPushMessageResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_GetPushMessageResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetPushMessageResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetPushMessageResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetPushMessageResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (GetPushMessageResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetPushMessageResult)) {
                return super.equals(obj);
            }
            GetPushMessageResult getPushMessageResult = (GetPushMessageResult) obj;
            return getMessagesList().equals(getPushMessageResult.getMessagesList()) && getUnknownFields().equals(getPushMessageResult.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.GetPushMessageResultOrBuilder
        public PushMessage getMessages(int i10) {
            return this.messages_.get(i10);
        }

        @Override // com.benshikj.ht.rpc.Um.GetPushMessageResultOrBuilder
        public int getMessagesCount() {
            return this.messages_.size();
        }

        @Override // com.benshikj.ht.rpc.Um.GetPushMessageResultOrBuilder
        public List<PushMessage> getMessagesList() {
            return this.messages_;
        }

        @Override // com.benshikj.ht.rpc.Um.GetPushMessageResultOrBuilder
        public PushMessageOrBuilder getMessagesOrBuilder(int i10) {
            return this.messages_.get(i10);
        }

        @Override // com.benshikj.ht.rpc.Um.GetPushMessageResultOrBuilder
        public List<? extends PushMessageOrBuilder> getMessagesOrBuilderList() {
            return this.messages_;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = 0;
            for (int i11 = 0; i11 < this.messages_.size(); i11++) {
                iG += com.google.protobuf.o.G(1, this.messages_.get(i11));
            }
            int serializedSize = iG + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getMessagesCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getMessagesList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_GetPushMessageResult_fieldAccessorTable.d(GetPushMessageResult.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new GetPushMessageResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            for (int i10 = 0; i10 < this.messages_.size(); i10++) {
                oVar.H0(1, this.messages_.get(i10));
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements GetPushMessageResultOrBuilder {
            private int bitField0_;
            private com.google.protobuf.g2 messagesBuilder_;
            private List<PushMessage> messages_;

            private void buildPartial0(GetPushMessageResult getPushMessageResult) {
            }

            private void buildPartialRepeatedFields(GetPushMessageResult getPushMessageResult) {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                if (g2Var != null) {
                    getPushMessageResult.messages_ = g2Var.g();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.messages_ = DesugarCollections.unmodifiableList(this.messages_);
                    this.bitField0_ &= -2;
                }
                getPushMessageResult.messages_ = this.messages_;
            }

            private void ensureMessagesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.messages_ = new ArrayList(this.messages_);
                    this.bitField0_ |= 1;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_GetPushMessageResult_descriptor;
            }

            private com.google.protobuf.g2 getMessagesFieldBuilder() {
                if (this.messagesBuilder_ == null) {
                    this.messagesBuilder_ = new com.google.protobuf.g2(this.messages_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.messages_ = null;
                }
                return this.messagesBuilder_;
            }

            public Builder addAllMessages(Iterable<? extends PushMessage> iterable) {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                if (g2Var != null) {
                    g2Var.b(iterable);
                    return this;
                }
                ensureMessagesIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.messages_);
                onChanged();
                return this;
            }

            public Builder addMessages(PushMessage pushMessage) {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                if (g2Var != null) {
                    g2Var.f(pushMessage);
                    return this;
                }
                pushMessage.getClass();
                ensureMessagesIsMutable();
                this.messages_.add(pushMessage);
                onChanged();
                return this;
            }

            public PushMessage.Builder addMessagesBuilder() {
                return (PushMessage.Builder) getMessagesFieldBuilder().d(PushMessage.getDefaultInstance());
            }

            public Builder clearMessages() {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                if (g2Var != null) {
                    g2Var.h();
                    return this;
                }
                this.messages_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_GetPushMessageResult_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.GetPushMessageResultOrBuilder
            public PushMessage getMessages(int i10) {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                return g2Var == null ? this.messages_.get(i10) : (PushMessage) g2Var.o(i10);
            }

            public PushMessage.Builder getMessagesBuilder(int i10) {
                return (PushMessage.Builder) getMessagesFieldBuilder().l(i10);
            }

            public List<PushMessage.Builder> getMessagesBuilderList() {
                return getMessagesFieldBuilder().m();
            }

            @Override // com.benshikj.ht.rpc.Um.GetPushMessageResultOrBuilder
            public int getMessagesCount() {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                return g2Var == null ? this.messages_.size() : g2Var.n();
            }

            @Override // com.benshikj.ht.rpc.Um.GetPushMessageResultOrBuilder
            public List<PushMessage> getMessagesList() {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                return g2Var == null ? DesugarCollections.unmodifiableList(this.messages_) : g2Var.q();
            }

            @Override // com.benshikj.ht.rpc.Um.GetPushMessageResultOrBuilder
            public PushMessageOrBuilder getMessagesOrBuilder(int i10) {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                return g2Var == null ? this.messages_.get(i10) : (PushMessageOrBuilder) g2Var.r(i10);
            }

            @Override // com.benshikj.ht.rpc.Um.GetPushMessageResultOrBuilder
            public List<? extends PushMessageOrBuilder> getMessagesOrBuilderList() {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                return g2Var != null ? g2Var.s() : DesugarCollections.unmodifiableList(this.messages_);
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_GetPushMessageResult_fieldAccessorTable.d(GetPushMessageResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeMessages(int i10) {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                if (g2Var != null) {
                    g2Var.w(i10);
                    return this;
                }
                ensureMessagesIsMutable();
                this.messages_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setMessages(int i10, PushMessage pushMessage) {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                if (g2Var != null) {
                    g2Var.x(i10, pushMessage);
                    return this;
                }
                pushMessage.getClass();
                ensureMessagesIsMutable();
                this.messages_.set(i10, pushMessage);
                onChanged();
                return this;
            }

            private Builder() {
                this.messages_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetPushMessageResult build() {
                GetPushMessageResult getPushMessageResultBuildPartial = buildPartial();
                if (getPushMessageResultBuildPartial.isInitialized()) {
                    return getPushMessageResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) getPushMessageResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetPushMessageResult buildPartial() {
                GetPushMessageResult getPushMessageResult = new GetPushMessageResult(this);
                buildPartialRepeatedFields(getPushMessageResult);
                if (this.bitField0_ != 0) {
                    buildPartial0(getPushMessageResult);
                }
                onBuilt();
                return getPushMessageResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public GetPushMessageResult getDefaultInstanceForType() {
                return GetPushMessageResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            public PushMessage.Builder addMessagesBuilder(int i10) {
                return (PushMessage.Builder) getMessagesFieldBuilder().c(i10, PushMessage.getDefaultInstance());
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.messages_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m811clear() {
                super.m132clear();
                this.bitField0_ = 0;
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                if (g2Var == null) {
                    this.messages_ = Collections.EMPTY_LIST;
                } else {
                    this.messages_ = null;
                    g2Var.h();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder addMessages(int i10, PushMessage pushMessage) {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                if (g2Var == null) {
                    pushMessage.getClass();
                    ensureMessagesIsMutable();
                    this.messages_.add(i10, pushMessage);
                    onChanged();
                    return this;
                }
                g2Var.e(i10, pushMessage);
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m819clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof GetPushMessageResult) {
                    return mergeFrom((GetPushMessageResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder setMessages(int i10, PushMessage.Builder builder) {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                if (g2Var == null) {
                    ensureMessagesIsMutable();
                    this.messages_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                g2Var.x(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(GetPushMessageResult getPushMessageResult) {
                if (getPushMessageResult == GetPushMessageResult.getDefaultInstance()) {
                    return this;
                }
                if (this.messagesBuilder_ == null) {
                    if (!getPushMessageResult.messages_.isEmpty()) {
                        if (this.messages_.isEmpty()) {
                            this.messages_ = getPushMessageResult.messages_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureMessagesIsMutable();
                            this.messages_.addAll(getPushMessageResult.messages_);
                        }
                        onChanged();
                    }
                } else if (!getPushMessageResult.messages_.isEmpty()) {
                    if (!this.messagesBuilder_.u()) {
                        this.messagesBuilder_.b(getPushMessageResult.messages_);
                    } else {
                        this.messagesBuilder_.i();
                        this.messagesBuilder_ = null;
                        this.messages_ = getPushMessageResult.messages_;
                        this.bitField0_ &= -2;
                        this.messagesBuilder_ = com.google.protobuf.k0.alwaysUseFieldBuilders ? getMessagesFieldBuilder() : null;
                    }
                }
                m141mergeUnknownFields(getPushMessageResult.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addMessages(PushMessage.Builder builder) {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                if (g2Var == null) {
                    ensureMessagesIsMutable();
                    this.messages_.add(builder.build());
                    onChanged();
                    return this;
                }
                g2Var.f(builder.build());
                return this;
            }

            public Builder addMessages(int i10, PushMessage.Builder builder) {
                com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                if (g2Var == null) {
                    ensureMessagesIsMutable();
                    this.messages_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                g2Var.e(i10, builder.build());
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK != 10) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    PushMessage pushMessage = (PushMessage) mVar.A(PushMessage.parser(), yVar);
                                    com.google.protobuf.g2 g2Var = this.messagesBuilder_;
                                    if (g2Var == null) {
                                        ensureMessagesIsMutable();
                                        this.messages_.add(pushMessage);
                                    } else {
                                        g2Var.f(pushMessage);
                                    }
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private GetPushMessageResult(k0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetPushMessageResult getPushMessageResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getPushMessageResult);
        }

        public static GetPushMessageResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetPushMessageResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static GetPushMessageResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetPushMessageResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static GetPushMessageResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (GetPushMessageResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public GetPushMessageResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private GetPushMessageResult() {
            this.memoizedIsInitialized = (byte) -1;
            this.messages_ = Collections.EMPTY_LIST;
        }

        public static GetPushMessageResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetPushMessageResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetPushMessageResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (GetPushMessageResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static GetPushMessageResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetPushMessageResult) PARSER.parseFrom(bArr, yVar);
        }

        public static GetPushMessageResult parseFrom(InputStream inputStream) throws IOException {
            return (GetPushMessageResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static GetPushMessageResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetPushMessageResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static GetPushMessageResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (GetPushMessageResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static GetPushMessageResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (GetPushMessageResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface GetPushMessageResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        PushMessage getMessages(int i10);

        int getMessagesCount();

        List<PushMessage> getMessagesList();

        PushMessageOrBuilder getMessagesOrBuilder(int i10);

        List<? extends PushMessageOrBuilder> getMessagesOrBuilderList();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetStatusRequest extends com.google.protobuf.k0 implements GetStatusRequestOrBuilder {
        private static final GetStatusRequest DEFAULT_INSTANCE = new GetStatusRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.GetStatusRequest.1
            @Override // com.google.protobuf.z1
            public GetStatusRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = GetStatusRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        public static GetStatusRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_GetStatusRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetStatusRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetStatusRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetStatusRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (GetStatusRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof GetStatusRequest) ? super.equals(obj) : getUnknownFields().equals(((GetStatusRequest) obj).getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((779 + getDescriptor().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_GetStatusRequest_fieldAccessorTable.d(GetStatusRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new GetStatusRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements GetStatusRequestOrBuilder {
            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_GetStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_GetStatusRequest_descriptor;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_GetStatusRequest_fieldAccessorTable.d(GetStatusRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetStatusRequest build() {
                GetStatusRequest getStatusRequestBuildPartial = buildPartial();
                if (getStatusRequestBuildPartial.isInitialized()) {
                    return getStatusRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) getStatusRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetStatusRequest buildPartial() {
                GetStatusRequest getStatusRequest = new GetStatusRequest(this);
                onBuilt();
                return getStatusRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public GetStatusRequest getDefaultInstanceForType() {
                return GetStatusRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m824clear() {
                super.m132clear();
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m832clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof GetStatusRequest) {
                    return mergeFrom((GetStatusRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(GetStatusRequest getStatusRequest) {
                if (getStatusRequest == GetStatusRequest.getDefaultInstance()) {
                    return this;
                }
                m141mergeUnknownFields(getStatusRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK == 0 || !super.parseUnknownField(mVar, yVar, iK)) {
                                z10 = true;
                            }
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }
        }

        private GetStatusRequest(k0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetStatusRequest getStatusRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getStatusRequest);
        }

        public static GetStatusRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetStatusRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static GetStatusRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetStatusRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static GetStatusRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (GetStatusRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public GetStatusRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private GetStatusRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetStatusRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetStatusRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetStatusRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (GetStatusRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static GetStatusRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetStatusRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static GetStatusRequest parseFrom(InputStream inputStream) throws IOException {
            return (GetStatusRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static GetStatusRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetStatusRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static GetStatusRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (GetStatusRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static GetStatusRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (GetStatusRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface GetStatusRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetStatusResult extends com.google.protobuf.k0 implements GetStatusResultOrBuilder {
        private static final GetStatusResult DEFAULT_INSTANCE = new GetStatusResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.GetStatusResult.1
            @Override // com.google.protobuf.z1
            public GetStatusResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = GetStatusResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int USERCOUNT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long userCount_;

        public static GetStatusResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_GetStatusResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetStatusResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetStatusResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetStatusResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (GetStatusResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetStatusResult)) {
                return super.equals(obj);
            }
            GetStatusResult getStatusResult = (GetStatusResult) obj;
            return getUserCount() == getStatusResult.getUserCount() && getUnknownFields().equals(getStatusResult.getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.userCount_;
            int iZ = (j10 != 0 ? com.google.protobuf.o.z(1, j10) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iZ;
            return iZ;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Um.GetStatusResultOrBuilder
        public long getUserCount() {
            return this.userCount_;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + com.google.protobuf.o0.i(getUserCount())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_GetStatusResult_fieldAccessorTable.d(GetStatusResult.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new GetStatusResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            long j10 = this.userCount_;
            if (j10 != 0) {
                oVar.F0(1, j10);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements GetStatusResultOrBuilder {
            private int bitField0_;
            private long userCount_;

            private void buildPartial0(GetStatusResult getStatusResult) {
                if ((this.bitField0_ & 1) != 0) {
                    getStatusResult.userCount_ = this.userCount_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_GetStatusResult_descriptor;
            }

            public Builder clearUserCount() {
                this.bitField0_ &= -2;
                this.userCount_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_GetStatusResult_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.GetStatusResultOrBuilder
            public long getUserCount() {
                return this.userCount_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_GetStatusResult_fieldAccessorTable.d(GetStatusResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setUserCount(long j10) {
                this.userCount_ = j10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetStatusResult build() {
                GetStatusResult getStatusResultBuildPartial = buildPartial();
                if (getStatusResultBuildPartial.isInitialized()) {
                    return getStatusResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) getStatusResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetStatusResult buildPartial() {
                GetStatusResult getStatusResult = new GetStatusResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getStatusResult);
                }
                onBuilt();
                return getStatusResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public GetStatusResult getDefaultInstanceForType() {
                return GetStatusResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m837clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.userCount_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m845clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof GetStatusResult) {
                    return mergeFrom((GetStatusResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(GetStatusResult getStatusResult) {
                if (getStatusResult == GetStatusResult.getDefaultInstance()) {
                    return this;
                }
                if (getStatusResult.getUserCount() != 0) {
                    setUserCount(getStatusResult.getUserCount());
                }
                m141mergeUnknownFields(getStatusResult.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK != 8) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.userCount_ = mVar.z();
                                    this.bitField0_ |= 1;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private GetStatusResult(k0.b bVar) {
            super(bVar);
            this.userCount_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetStatusResult getStatusResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getStatusResult);
        }

        public static GetStatusResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetStatusResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static GetStatusResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetStatusResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static GetStatusResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (GetStatusResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public GetStatusResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GetStatusResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetStatusResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GetStatusResult() {
            this.userCount_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetStatusResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (GetStatusResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static GetStatusResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetStatusResult) PARSER.parseFrom(bArr, yVar);
        }

        public static GetStatusResult parseFrom(InputStream inputStream) throws IOException {
            return (GetStatusResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static GetStatusResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetStatusResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static GetStatusResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (GetStatusResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static GetStatusResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (GetStatusResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface GetStatusResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        long getUserCount();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetUserIDsRequest extends com.google.protobuf.k0 implements GetUserIDsRequestOrBuilder {
        public static final int LIMIT_FIELD_NUMBER = 2;
        public static final int OFFSET_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int limit_;
        private byte memoizedIsInitialized;
        private int offset_;
        private static final GetUserIDsRequest DEFAULT_INSTANCE = new GetUserIDsRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.GetUserIDsRequest.1
            @Override // com.google.protobuf.z1
            public GetUserIDsRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = GetUserIDsRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public static GetUserIDsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_GetUserIDsRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetUserIDsRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetUserIDsRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetUserIDsRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (GetUserIDsRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetUserIDsRequest)) {
                return super.equals(obj);
            }
            GetUserIDsRequest getUserIDsRequest = (GetUserIDsRequest) obj;
            return getOffset() == getUserIDsRequest.getOffset() && getLimit() == getUserIDsRequest.getLimit() && getUnknownFields().equals(getUserIDsRequest.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserIDsRequestOrBuilder
        public int getLimit() {
            return this.limit_;
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserIDsRequestOrBuilder
        public int getOffset() {
            return this.offset_;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int i11 = this.offset_;
            int iX = i11 != 0 ? com.google.protobuf.o.x(1, i11) : 0;
            int i12 = this.limit_;
            if (i12 != 0) {
                iX += com.google.protobuf.o.x(2, i12);
            }
            int serializedSize = iX + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getOffset()) * 37) + 2) * 53) + getLimit()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_GetUserIDsRequest_fieldAccessorTable.d(GetUserIDsRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new GetUserIDsRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            int i10 = this.offset_;
            if (i10 != 0) {
                oVar.D0(1, i10);
            }
            int i11 = this.limit_;
            if (i11 != 0) {
                oVar.D0(2, i11);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements GetUserIDsRequestOrBuilder {
            private int bitField0_;
            private int limit_;
            private int offset_;

            private void buildPartial0(GetUserIDsRequest getUserIDsRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    getUserIDsRequest.offset_ = this.offset_;
                }
                if ((i10 & 2) != 0) {
                    getUserIDsRequest.limit_ = this.limit_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_GetUserIDsRequest_descriptor;
            }

            public Builder clearLimit() {
                this.bitField0_ &= -3;
                this.limit_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOffset() {
                this.bitField0_ &= -2;
                this.offset_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_GetUserIDsRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserIDsRequestOrBuilder
            public int getLimit() {
                return this.limit_;
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserIDsRequestOrBuilder
            public int getOffset() {
                return this.offset_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_GetUserIDsRequest_fieldAccessorTable.d(GetUserIDsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setLimit(int i10) {
                this.limit_ = i10;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOffset(int i10) {
                this.offset_ = i10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetUserIDsRequest build() {
                GetUserIDsRequest getUserIDsRequestBuildPartial = buildPartial();
                if (getUserIDsRequestBuildPartial.isInitialized()) {
                    return getUserIDsRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) getUserIDsRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetUserIDsRequest buildPartial() {
                GetUserIDsRequest getUserIDsRequest = new GetUserIDsRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getUserIDsRequest);
                }
                onBuilt();
                return getUserIDsRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public GetUserIDsRequest getDefaultInstanceForType() {
                return GetUserIDsRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m850clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.offset_ = 0;
                this.limit_ = 0;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m858clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof GetUserIDsRequest) {
                    return mergeFrom((GetUserIDsRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(GetUserIDsRequest getUserIDsRequest) {
                if (getUserIDsRequest == GetUserIDsRequest.getDefaultInstance()) {
                    return this;
                }
                if (getUserIDsRequest.getOffset() != 0) {
                    setOffset(getUserIDsRequest.getOffset());
                }
                if (getUserIDsRequest.getLimit() != 0) {
                    setLimit(getUserIDsRequest.getLimit());
                }
                m141mergeUnknownFields(getUserIDsRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.offset_ = mVar.y();
                                    this.bitField0_ |= 1;
                                } else if (iK != 16) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.limit_ = mVar.y();
                                    this.bitField0_ |= 2;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private GetUserIDsRequest(k0.b bVar) {
            super(bVar);
            this.offset_ = 0;
            this.limit_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetUserIDsRequest getUserIDsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getUserIDsRequest);
        }

        public static GetUserIDsRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserIDsRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static GetUserIDsRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetUserIDsRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static GetUserIDsRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (GetUserIDsRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public GetUserIDsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GetUserIDsRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserIDsRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetUserIDsRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (GetUserIDsRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        private GetUserIDsRequest() {
            this.offset_ = 0;
            this.limit_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetUserIDsRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserIDsRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static GetUserIDsRequest parseFrom(InputStream inputStream) throws IOException {
            return (GetUserIDsRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static GetUserIDsRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetUserIDsRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static GetUserIDsRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (GetUserIDsRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static GetUserIDsRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (GetUserIDsRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface GetUserIDsRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        int getLimit();

        int getOffset();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetUserIDsResult extends com.google.protobuf.k0 implements GetUserIDsResultOrBuilder {
        private static final GetUserIDsResult DEFAULT_INSTANCE = new GetUserIDsResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.GetUserIDsResult.1
            @Override // com.google.protobuf.z1
            public GetUserIDsResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = GetUserIDsResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int USERIDS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int userIDsMemoizedSerializedSize;
        private o0.i userIDs_;

        public static GetUserIDsResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_GetUserIDsResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetUserIDsResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetUserIDsResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetUserIDsResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (GetUserIDsResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetUserIDsResult)) {
                return super.equals(obj);
            }
            GetUserIDsResult getUserIDsResult = (GetUserIDsResult) obj;
            return getUserIDsList().equals(getUserIDsResult.getUserIDsList()) && getUnknownFields().equals(getUserIDsResult.getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iA = 0;
            for (int i11 = 0; i11 < this.userIDs_.size(); i11++) {
                iA += com.google.protobuf.o.A(this.userIDs_.getLong(i11));
            }
            int iY = !getUserIDsList().isEmpty() ? iA + 1 + com.google.protobuf.o.y(iA) : iA;
            this.userIDsMemoizedSerializedSize = iA;
            int serializedSize = iY + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserIDsResultOrBuilder
        public long getUserIDs(int i10) {
            return this.userIDs_.getLong(i10);
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserIDsResultOrBuilder
        public int getUserIDsCount() {
            return this.userIDs_.size();
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserIDsResultOrBuilder
        public List<Long> getUserIDsList() {
            return this.userIDs_;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getUserIDsCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getUserIDsList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_GetUserIDsResult_fieldAccessorTable.d(GetUserIDsResult.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new GetUserIDsResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            getSerializedSize();
            if (getUserIDsList().size() > 0) {
                oVar.T0(10);
                oVar.T0(this.userIDsMemoizedSerializedSize);
            }
            for (int i10 = 0; i10 < this.userIDs_.size(); i10++) {
                oVar.G0(this.userIDs_.getLong(i10));
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements GetUserIDsResultOrBuilder {
            private int bitField0_;
            private o0.i userIDs_;

            private void buildPartial0(GetUserIDsResult getUserIDsResult) {
            }

            private void buildPartialRepeatedFields(GetUserIDsResult getUserIDsResult) {
                if ((this.bitField0_ & 1) != 0) {
                    this.userIDs_.r();
                    this.bitField0_ &= -2;
                }
                getUserIDsResult.userIDs_ = this.userIDs_;
            }

            private void ensureUserIDsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.userIDs_ = com.google.protobuf.k0.mutableCopy(this.userIDs_);
                    this.bitField0_ |= 1;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_GetUserIDsResult_descriptor;
            }

            public Builder addAllUserIDs(Iterable<? extends Long> iterable) {
                ensureUserIDsIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.userIDs_);
                onChanged();
                return this;
            }

            public Builder addUserIDs(long j10) {
                ensureUserIDsIsMutable();
                this.userIDs_.G(j10);
                onChanged();
                return this;
            }

            public Builder clearUserIDs() {
                this.userIDs_ = com.google.protobuf.k0.emptyLongList();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_GetUserIDsResult_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserIDsResultOrBuilder
            public long getUserIDs(int i10) {
                return this.userIDs_.getLong(i10);
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserIDsResultOrBuilder
            public int getUserIDsCount() {
                return this.userIDs_.size();
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserIDsResultOrBuilder
            public List<Long> getUserIDsList() {
                return (this.bitField0_ & 1) != 0 ? DesugarCollections.unmodifiableList(this.userIDs_) : this.userIDs_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_GetUserIDsResult_fieldAccessorTable.d(GetUserIDsResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setUserIDs(int i10, long j10) {
                ensureUserIDsIsMutable();
                this.userIDs_.W(i10, j10);
                onChanged();
                return this;
            }

            private Builder() {
                this.userIDs_ = com.google.protobuf.k0.emptyLongList();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetUserIDsResult build() {
                GetUserIDsResult getUserIDsResultBuildPartial = buildPartial();
                if (getUserIDsResultBuildPartial.isInitialized()) {
                    return getUserIDsResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) getUserIDsResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetUserIDsResult buildPartial() {
                GetUserIDsResult getUserIDsResult = new GetUserIDsResult(this);
                buildPartialRepeatedFields(getUserIDsResult);
                if (this.bitField0_ != 0) {
                    buildPartial0(getUserIDsResult);
                }
                onBuilt();
                return getUserIDsResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public GetUserIDsResult getDefaultInstanceForType() {
                return GetUserIDsResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.userIDs_ = com.google.protobuf.k0.emptyLongList();
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m863clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.userIDs_ = com.google.protobuf.k0.emptyLongList();
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m871clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof GetUserIDsResult) {
                    return mergeFrom((GetUserIDsResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(GetUserIDsResult getUserIDsResult) {
                if (getUserIDsResult == GetUserIDsResult.getDefaultInstance()) {
                    return this;
                }
                if (!getUserIDsResult.userIDs_.isEmpty()) {
                    if (this.userIDs_.isEmpty()) {
                        this.userIDs_ = getUserIDsResult.userIDs_;
                        this.bitField0_ &= -2;
                    } else {
                        ensureUserIDsIsMutable();
                        this.userIDs_.addAll(getUserIDsResult.userIDs_);
                    }
                    onChanged();
                }
                m141mergeUnknownFields(getUserIDsResult.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    long jZ = mVar.z();
                                    ensureUserIDsIsMutable();
                                    this.userIDs_.G(jZ);
                                } else if (iK != 10) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    int iP = mVar.p(mVar.C());
                                    ensureUserIDsIsMutable();
                                    while (mVar.e() > 0) {
                                        this.userIDs_.G(mVar.z());
                                    }
                                    mVar.o(iP);
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private GetUserIDsResult(k0.b bVar) {
            super(bVar);
            this.userIDsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetUserIDsResult getUserIDsResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getUserIDsResult);
        }

        public static GetUserIDsResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserIDsResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static GetUserIDsResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetUserIDsResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static GetUserIDsResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (GetUserIDsResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public GetUserIDsResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GetUserIDsResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserIDsResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GetUserIDsResult() {
            this.userIDsMemoizedSerializedSize = -1;
            this.memoizedIsInitialized = (byte) -1;
            this.userIDs_ = com.google.protobuf.k0.emptyLongList();
        }

        public static GetUserIDsResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (GetUserIDsResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static GetUserIDsResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserIDsResult) PARSER.parseFrom(bArr, yVar);
        }

        public static GetUserIDsResult parseFrom(InputStream inputStream) throws IOException {
            return (GetUserIDsResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static GetUserIDsResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetUserIDsResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static GetUserIDsResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (GetUserIDsResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static GetUserIDsResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (GetUserIDsResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface GetUserIDsResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        long getUserIDs(int i10);

        int getUserIDsCount();

        List<Long> getUserIDsList();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetUserInfosRequest extends com.google.protobuf.k0 implements GetUserInfosRequestOrBuilder {
        public static final int LIMIT_FIELD_NUMBER = 3;
        public static final int OFFSET_FIELD_NUMBER = 2;
        public static final int QUERYTEXT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int limit_;
        private byte memoizedIsInitialized;
        private int offset_;
        private volatile Object queryText_;
        private static final GetUserInfosRequest DEFAULT_INSTANCE = new GetUserInfosRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.GetUserInfosRequest.1
            @Override // com.google.protobuf.z1
            public GetUserInfosRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = GetUserInfosRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public static GetUserInfosRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_GetUserInfosRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetUserInfosRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetUserInfosRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetUserInfosRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (GetUserInfosRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetUserInfosRequest)) {
                return super.equals(obj);
            }
            GetUserInfosRequest getUserInfosRequest = (GetUserInfosRequest) obj;
            return getQueryText().equals(getUserInfosRequest.getQueryText()) && getOffset() == getUserInfosRequest.getOffset() && getLimit() == getUserInfosRequest.getLimit() && getUnknownFields().equals(getUserInfosRequest.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserInfosRequestOrBuilder
        public int getLimit() {
            return this.limit_;
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserInfosRequestOrBuilder
        public int getOffset() {
            return this.offset_;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserInfosRequestOrBuilder
        public String getQueryText() {
            Object obj = this.queryText_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.queryText_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserInfosRequestOrBuilder
        public com.google.protobuf.l getQueryTextBytes() {
            Object obj = this.queryText_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.queryText_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !com.google.protobuf.k0.isStringEmpty(this.queryText_) ? com.google.protobuf.k0.computeStringSize(1, this.queryText_) : 0;
            int i11 = this.offset_;
            if (i11 != 0) {
                iComputeStringSize += com.google.protobuf.o.x(2, i11);
            }
            int i12 = this.limit_;
            if (i12 != 0) {
                iComputeStringSize += com.google.protobuf.o.x(3, i12);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getQueryText().hashCode()) * 37) + 2) * 53) + getOffset()) * 37) + 3) * 53) + getLimit()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_GetUserInfosRequest_fieldAccessorTable.d(GetUserInfosRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new GetUserInfosRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!com.google.protobuf.k0.isStringEmpty(this.queryText_)) {
                com.google.protobuf.k0.writeString(oVar, 1, this.queryText_);
            }
            int i10 = this.offset_;
            if (i10 != 0) {
                oVar.D0(2, i10);
            }
            int i11 = this.limit_;
            if (i11 != 0) {
                oVar.D0(3, i11);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements GetUserInfosRequestOrBuilder {
            private int bitField0_;
            private int limit_;
            private int offset_;
            private Object queryText_;

            private void buildPartial0(GetUserInfosRequest getUserInfosRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    getUserInfosRequest.queryText_ = this.queryText_;
                }
                if ((i10 & 2) != 0) {
                    getUserInfosRequest.offset_ = this.offset_;
                }
                if ((i10 & 4) != 0) {
                    getUserInfosRequest.limit_ = this.limit_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_GetUserInfosRequest_descriptor;
            }

            public Builder clearLimit() {
                this.bitField0_ &= -5;
                this.limit_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOffset() {
                this.bitField0_ &= -3;
                this.offset_ = 0;
                onChanged();
                return this;
            }

            public Builder clearQueryText() {
                this.queryText_ = GetUserInfosRequest.getDefaultInstance().getQueryText();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_GetUserInfosRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserInfosRequestOrBuilder
            public int getLimit() {
                return this.limit_;
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserInfosRequestOrBuilder
            public int getOffset() {
                return this.offset_;
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserInfosRequestOrBuilder
            public String getQueryText() {
                Object obj = this.queryText_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.queryText_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserInfosRequestOrBuilder
            public com.google.protobuf.l getQueryTextBytes() {
                Object obj = this.queryText_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.queryText_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_GetUserInfosRequest_fieldAccessorTable.d(GetUserInfosRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setLimit(int i10) {
                this.limit_ = i10;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setOffset(int i10) {
                this.offset_ = i10;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setQueryText(String str) {
                str.getClass();
                this.queryText_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setQueryTextBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.queryText_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.queryText_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetUserInfosRequest build() {
                GetUserInfosRequest getUserInfosRequestBuildPartial = buildPartial();
                if (getUserInfosRequestBuildPartial.isInitialized()) {
                    return getUserInfosRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) getUserInfosRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetUserInfosRequest buildPartial() {
                GetUserInfosRequest getUserInfosRequest = new GetUserInfosRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getUserInfosRequest);
                }
                onBuilt();
                return getUserInfosRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public GetUserInfosRequest getDefaultInstanceForType() {
                return GetUserInfosRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.queryText_ = "";
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m876clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.queryText_ = "";
                this.offset_ = 0;
                this.limit_ = 0;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m884clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof GetUserInfosRequest) {
                    return mergeFrom((GetUserInfosRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(GetUserInfosRequest getUserInfosRequest) {
                if (getUserInfosRequest == GetUserInfosRequest.getDefaultInstance()) {
                    return this;
                }
                if (!getUserInfosRequest.getQueryText().isEmpty()) {
                    this.queryText_ = getUserInfosRequest.queryText_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (getUserInfosRequest.getOffset() != 0) {
                    setOffset(getUserInfosRequest.getOffset());
                }
                if (getUserInfosRequest.getLimit() != 0) {
                    setLimit(getUserInfosRequest.getLimit());
                }
                m141mergeUnknownFields(getUserInfosRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.queryText_ = mVar.J();
                                    this.bitField0_ |= 1;
                                } else if (iK == 16) {
                                    this.offset_ = mVar.y();
                                    this.bitField0_ |= 2;
                                } else if (iK != 24) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.limit_ = mVar.y();
                                    this.bitField0_ |= 4;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private GetUserInfosRequest(k0.b bVar) {
            super(bVar);
            this.queryText_ = "";
            this.offset_ = 0;
            this.limit_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetUserInfosRequest getUserInfosRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getUserInfosRequest);
        }

        public static GetUserInfosRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserInfosRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static GetUserInfosRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetUserInfosRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static GetUserInfosRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (GetUserInfosRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public GetUserInfosRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GetUserInfosRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserInfosRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetUserInfosRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (GetUserInfosRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static GetUserInfosRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserInfosRequest) PARSER.parseFrom(bArr, yVar);
        }

        private GetUserInfosRequest() {
            this.queryText_ = "";
            this.offset_ = 0;
            this.limit_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.queryText_ = "";
        }

        public static GetUserInfosRequest parseFrom(InputStream inputStream) throws IOException {
            return (GetUserInfosRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static GetUserInfosRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetUserInfosRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static GetUserInfosRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (GetUserInfosRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static GetUserInfosRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (GetUserInfosRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface GetUserInfosRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        int getLimit();

        int getOffset();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        String getQueryText();

        com.google.protobuf.l getQueryTextBytes();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetUserInfosResult extends com.google.protobuf.k0 implements GetUserInfosResultOrBuilder {
        private static final GetUserInfosResult DEFAULT_INSTANCE = new GetUserInfosResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.GetUserInfosResult.1
            @Override // com.google.protobuf.z1
            public GetUserInfosResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = GetUserInfosResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int USERS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<UserInfo> users_;

        public static GetUserInfosResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_GetUserInfosResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetUserInfosResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetUserInfosResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetUserInfosResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (GetUserInfosResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetUserInfosResult)) {
                return super.equals(obj);
            }
            GetUserInfosResult getUserInfosResult = (GetUserInfosResult) obj;
            return getUsersList().equals(getUserInfosResult.getUsersList()) && getUnknownFields().equals(getUserInfosResult.getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = 0;
            for (int i11 = 0; i11 < this.users_.size(); i11++) {
                iG += com.google.protobuf.o.G(1, this.users_.get(i11));
            }
            int serializedSize = iG + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserInfosResultOrBuilder
        public UserInfo getUsers(int i10) {
            return this.users_.get(i10);
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserInfosResultOrBuilder
        public int getUsersCount() {
            return this.users_.size();
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserInfosResultOrBuilder
        public List<UserInfo> getUsersList() {
            return this.users_;
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserInfosResultOrBuilder
        public UserInfoOrBuilder getUsersOrBuilder(int i10) {
            return this.users_.get(i10);
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserInfosResultOrBuilder
        public List<? extends UserInfoOrBuilder> getUsersOrBuilderList() {
            return this.users_;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (getUsersCount() > 0) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getUsersList().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_GetUserInfosResult_fieldAccessorTable.d(GetUserInfosResult.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new GetUserInfosResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            for (int i10 = 0; i10 < this.users_.size(); i10++) {
                oVar.H0(1, this.users_.get(i10));
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements GetUserInfosResultOrBuilder {
            private int bitField0_;
            private com.google.protobuf.g2 usersBuilder_;
            private List<UserInfo> users_;

            private void buildPartial0(GetUserInfosResult getUserInfosResult) {
            }

            private void buildPartialRepeatedFields(GetUserInfosResult getUserInfosResult) {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                if (g2Var != null) {
                    getUserInfosResult.users_ = g2Var.g();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.users_ = DesugarCollections.unmodifiableList(this.users_);
                    this.bitField0_ &= -2;
                }
                getUserInfosResult.users_ = this.users_;
            }

            private void ensureUsersIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.users_ = new ArrayList(this.users_);
                    this.bitField0_ |= 1;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_GetUserInfosResult_descriptor;
            }

            private com.google.protobuf.g2 getUsersFieldBuilder() {
                if (this.usersBuilder_ == null) {
                    this.usersBuilder_ = new com.google.protobuf.g2(this.users_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.users_ = null;
                }
                return this.usersBuilder_;
            }

            public Builder addAllUsers(Iterable<? extends UserInfo> iterable) {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                if (g2Var != null) {
                    g2Var.b(iterable);
                    return this;
                }
                ensureUsersIsMutable();
                b.a.addAll((Iterable) iterable, (List) this.users_);
                onChanged();
                return this;
            }

            public Builder addUsers(UserInfo userInfo) {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                if (g2Var != null) {
                    g2Var.f(userInfo);
                    return this;
                }
                userInfo.getClass();
                ensureUsersIsMutable();
                this.users_.add(userInfo);
                onChanged();
                return this;
            }

            public UserInfo.Builder addUsersBuilder() {
                return (UserInfo.Builder) getUsersFieldBuilder().d(UserInfo.getDefaultInstance());
            }

            public Builder clearUsers() {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                if (g2Var != null) {
                    g2Var.h();
                    return this;
                }
                this.users_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_GetUserInfosResult_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserInfosResultOrBuilder
            public UserInfo getUsers(int i10) {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                return g2Var == null ? this.users_.get(i10) : (UserInfo) g2Var.o(i10);
            }

            public UserInfo.Builder getUsersBuilder(int i10) {
                return (UserInfo.Builder) getUsersFieldBuilder().l(i10);
            }

            public List<UserInfo.Builder> getUsersBuilderList() {
                return getUsersFieldBuilder().m();
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserInfosResultOrBuilder
            public int getUsersCount() {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                return g2Var == null ? this.users_.size() : g2Var.n();
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserInfosResultOrBuilder
            public List<UserInfo> getUsersList() {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                return g2Var == null ? DesugarCollections.unmodifiableList(this.users_) : g2Var.q();
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserInfosResultOrBuilder
            public UserInfoOrBuilder getUsersOrBuilder(int i10) {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                return g2Var == null ? this.users_.get(i10) : (UserInfoOrBuilder) g2Var.r(i10);
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserInfosResultOrBuilder
            public List<? extends UserInfoOrBuilder> getUsersOrBuilderList() {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                return g2Var != null ? g2Var.s() : DesugarCollections.unmodifiableList(this.users_);
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_GetUserInfosResult_fieldAccessorTable.d(GetUserInfosResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder removeUsers(int i10) {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                if (g2Var != null) {
                    g2Var.w(i10);
                    return this;
                }
                ensureUsersIsMutable();
                this.users_.remove(i10);
                onChanged();
                return this;
            }

            public Builder setUsers(int i10, UserInfo userInfo) {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                if (g2Var != null) {
                    g2Var.x(i10, userInfo);
                    return this;
                }
                userInfo.getClass();
                ensureUsersIsMutable();
                this.users_.set(i10, userInfo);
                onChanged();
                return this;
            }

            private Builder() {
                this.users_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetUserInfosResult build() {
                GetUserInfosResult getUserInfosResultBuildPartial = buildPartial();
                if (getUserInfosResultBuildPartial.isInitialized()) {
                    return getUserInfosResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) getUserInfosResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetUserInfosResult buildPartial() {
                GetUserInfosResult getUserInfosResult = new GetUserInfosResult(this);
                buildPartialRepeatedFields(getUserInfosResult);
                if (this.bitField0_ != 0) {
                    buildPartial0(getUserInfosResult);
                }
                onBuilt();
                return getUserInfosResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public GetUserInfosResult getDefaultInstanceForType() {
                return GetUserInfosResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            public UserInfo.Builder addUsersBuilder(int i10) {
                return (UserInfo.Builder) getUsersFieldBuilder().c(i10, UserInfo.getDefaultInstance());
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.users_ = Collections.EMPTY_LIST;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m889clear() {
                super.m132clear();
                this.bitField0_ = 0;
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                if (g2Var == null) {
                    this.users_ = Collections.EMPTY_LIST;
                } else {
                    this.users_ = null;
                    g2Var.h();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder addUsers(int i10, UserInfo userInfo) {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                if (g2Var == null) {
                    userInfo.getClass();
                    ensureUsersIsMutable();
                    this.users_.add(i10, userInfo);
                    onChanged();
                    return this;
                }
                g2Var.e(i10, userInfo);
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m897clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof GetUserInfosResult) {
                    return mergeFrom((GetUserInfosResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder setUsers(int i10, UserInfo.Builder builder) {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                if (g2Var == null) {
                    ensureUsersIsMutable();
                    this.users_.set(i10, builder.build());
                    onChanged();
                    return this;
                }
                g2Var.x(i10, builder.build());
                return this;
            }

            public Builder mergeFrom(GetUserInfosResult getUserInfosResult) {
                if (getUserInfosResult == GetUserInfosResult.getDefaultInstance()) {
                    return this;
                }
                if (this.usersBuilder_ == null) {
                    if (!getUserInfosResult.users_.isEmpty()) {
                        if (this.users_.isEmpty()) {
                            this.users_ = getUserInfosResult.users_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureUsersIsMutable();
                            this.users_.addAll(getUserInfosResult.users_);
                        }
                        onChanged();
                    }
                } else if (!getUserInfosResult.users_.isEmpty()) {
                    if (!this.usersBuilder_.u()) {
                        this.usersBuilder_.b(getUserInfosResult.users_);
                    } else {
                        this.usersBuilder_.i();
                        this.usersBuilder_ = null;
                        this.users_ = getUserInfosResult.users_;
                        this.bitField0_ &= -2;
                        this.usersBuilder_ = com.google.protobuf.k0.alwaysUseFieldBuilders ? getUsersFieldBuilder() : null;
                    }
                }
                m141mergeUnknownFields(getUserInfosResult.getUnknownFields());
                onChanged();
                return this;
            }

            public Builder addUsers(UserInfo.Builder builder) {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                if (g2Var == null) {
                    ensureUsersIsMutable();
                    this.users_.add(builder.build());
                    onChanged();
                    return this;
                }
                g2Var.f(builder.build());
                return this;
            }

            public Builder addUsers(int i10, UserInfo.Builder builder) {
                com.google.protobuf.g2 g2Var = this.usersBuilder_;
                if (g2Var == null) {
                    ensureUsersIsMutable();
                    this.users_.add(i10, builder.build());
                    onChanged();
                    return this;
                }
                g2Var.e(i10, builder.build());
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK != 10) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    UserInfo userInfo = (UserInfo) mVar.A(UserInfo.parser(), yVar);
                                    com.google.protobuf.g2 g2Var = this.usersBuilder_;
                                    if (g2Var == null) {
                                        ensureUsersIsMutable();
                                        this.users_.add(userInfo);
                                    } else {
                                        g2Var.f(userInfo);
                                    }
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private GetUserInfosResult(k0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetUserInfosResult getUserInfosResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getUserInfosResult);
        }

        public static GetUserInfosResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserInfosResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static GetUserInfosResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetUserInfosResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static GetUserInfosResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (GetUserInfosResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public GetUserInfosResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private GetUserInfosResult() {
            this.memoizedIsInitialized = (byte) -1;
            this.users_ = Collections.EMPTY_LIST;
        }

        public static GetUserInfosResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserInfosResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetUserInfosResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (GetUserInfosResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static GetUserInfosResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserInfosResult) PARSER.parseFrom(bArr, yVar);
        }

        public static GetUserInfosResult parseFrom(InputStream inputStream) throws IOException {
            return (GetUserInfosResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static GetUserInfosResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetUserInfosResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static GetUserInfosResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (GetUserInfosResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static GetUserInfosResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (GetUserInfosResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface GetUserInfosResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        UserInfo getUsers(int i10);

        int getUsersCount();

        List<UserInfo> getUsersList();

        UserInfoOrBuilder getUsersOrBuilder(int i10);

        List<? extends UserInfoOrBuilder> getUsersOrBuilderList();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetUserPhotoRequest extends com.google.protobuf.k0 implements GetUserPhotoRequestOrBuilder {
        private static final GetUserPhotoRequest DEFAULT_INSTANCE = new GetUserPhotoRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.GetUserPhotoRequest.1
            @Override // com.google.protobuf.z1
            public GetUserPhotoRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = GetUserPhotoRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int SYNCAT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long syncAt_;

        public static GetUserPhotoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_GetUserPhotoRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetUserPhotoRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetUserPhotoRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetUserPhotoRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (GetUserPhotoRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetUserPhotoRequest)) {
                return super.equals(obj);
            }
            GetUserPhotoRequest getUserPhotoRequest = (GetUserPhotoRequest) obj;
            return getSyncAt() == getUserPhotoRequest.getSyncAt() && getUnknownFields().equals(getUserPhotoRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.syncAt_;
            int iZ = (j10 != 0 ? com.google.protobuf.o.z(1, j10) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iZ;
            return iZ;
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserPhotoRequestOrBuilder
        public long getSyncAt() {
            return this.syncAt_;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + com.google.protobuf.o0.i(getSyncAt())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_GetUserPhotoRequest_fieldAccessorTable.d(GetUserPhotoRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new GetUserPhotoRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            long j10 = this.syncAt_;
            if (j10 != 0) {
                oVar.F0(1, j10);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements GetUserPhotoRequestOrBuilder {
            private int bitField0_;
            private long syncAt_;

            private void buildPartial0(GetUserPhotoRequest getUserPhotoRequest) {
                if ((this.bitField0_ & 1) != 0) {
                    getUserPhotoRequest.syncAt_ = this.syncAt_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_GetUserPhotoRequest_descriptor;
            }

            public Builder clearSyncAt() {
                this.bitField0_ &= -2;
                this.syncAt_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_GetUserPhotoRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserPhotoRequestOrBuilder
            public long getSyncAt() {
                return this.syncAt_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_GetUserPhotoRequest_fieldAccessorTable.d(GetUserPhotoRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setSyncAt(long j10) {
                this.syncAt_ = j10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetUserPhotoRequest build() {
                GetUserPhotoRequest getUserPhotoRequestBuildPartial = buildPartial();
                if (getUserPhotoRequestBuildPartial.isInitialized()) {
                    return getUserPhotoRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) getUserPhotoRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetUserPhotoRequest buildPartial() {
                GetUserPhotoRequest getUserPhotoRequest = new GetUserPhotoRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getUserPhotoRequest);
                }
                onBuilt();
                return getUserPhotoRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public GetUserPhotoRequest getDefaultInstanceForType() {
                return GetUserPhotoRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m902clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.syncAt_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m910clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof GetUserPhotoRequest) {
                    return mergeFrom((GetUserPhotoRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(GetUserPhotoRequest getUserPhotoRequest) {
                if (getUserPhotoRequest == GetUserPhotoRequest.getDefaultInstance()) {
                    return this;
                }
                if (getUserPhotoRequest.getSyncAt() != 0) {
                    setSyncAt(getUserPhotoRequest.getSyncAt());
                }
                m141mergeUnknownFields(getUserPhotoRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK != 8) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.syncAt_ = mVar.z();
                                    this.bitField0_ |= 1;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private GetUserPhotoRequest(k0.b bVar) {
            super(bVar);
            this.syncAt_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetUserPhotoRequest getUserPhotoRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getUserPhotoRequest);
        }

        public static GetUserPhotoRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserPhotoRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static GetUserPhotoRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetUserPhotoRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static GetUserPhotoRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (GetUserPhotoRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public GetUserPhotoRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GetUserPhotoRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserPhotoRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GetUserPhotoRequest() {
            this.syncAt_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetUserPhotoRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (GetUserPhotoRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static GetUserPhotoRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserPhotoRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static GetUserPhotoRequest parseFrom(InputStream inputStream) throws IOException {
            return (GetUserPhotoRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static GetUserPhotoRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetUserPhotoRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static GetUserPhotoRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (GetUserPhotoRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static GetUserPhotoRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (GetUserPhotoRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface GetUserPhotoRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        long getSyncAt();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class GetUserPhotoResult extends com.google.protobuf.k0 implements GetUserPhotoResultOrBuilder {
        private static final GetUserPhotoResult DEFAULT_INSTANCE = new GetUserPhotoResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.GetUserPhotoResult.1
            @Override // com.google.protobuf.z1
            public GetUserPhotoResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = GetUserPhotoResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int PHOTO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private com.google.protobuf.l photo_;

        public static GetUserPhotoResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_GetUserPhotoResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetUserPhotoResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (GetUserPhotoResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetUserPhotoResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (GetUserPhotoResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetUserPhotoResult)) {
                return super.equals(obj);
            }
            GetUserPhotoResult getUserPhotoResult = (GetUserPhotoResult) obj;
            return getPhoto().equals(getUserPhotoResult.getPhoto()) && getUnknownFields().equals(getUserPhotoResult.getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Um.GetUserPhotoResultOrBuilder
        public com.google.protobuf.l getPhoto() {
            return this.photo_;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iH = (!this.photo_.isEmpty() ? com.google.protobuf.o.h(1, this.photo_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iH;
            return iH;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getPhoto().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_GetUserPhotoResult_fieldAccessorTable.d(GetUserPhotoResult.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new GetUserPhotoResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!this.photo_.isEmpty()) {
                oVar.q0(1, this.photo_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements GetUserPhotoResultOrBuilder {
            private int bitField0_;
            private com.google.protobuf.l photo_;

            private void buildPartial0(GetUserPhotoResult getUserPhotoResult) {
                if ((this.bitField0_ & 1) != 0) {
                    getUserPhotoResult.photo_ = this.photo_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_GetUserPhotoResult_descriptor;
            }

            public Builder clearPhoto() {
                this.bitField0_ &= -2;
                this.photo_ = GetUserPhotoResult.getDefaultInstance().getPhoto();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_GetUserPhotoResult_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.GetUserPhotoResultOrBuilder
            public com.google.protobuf.l getPhoto() {
                return this.photo_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_GetUserPhotoResult_fieldAccessorTable.d(GetUserPhotoResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setPhoto(com.google.protobuf.l lVar) {
                lVar.getClass();
                this.photo_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.photo_ = com.google.protobuf.l.f9119b;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetUserPhotoResult build() {
                GetUserPhotoResult getUserPhotoResultBuildPartial = buildPartial();
                if (getUserPhotoResultBuildPartial.isInitialized()) {
                    return getUserPhotoResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) getUserPhotoResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public GetUserPhotoResult buildPartial() {
                GetUserPhotoResult getUserPhotoResult = new GetUserPhotoResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getUserPhotoResult);
                }
                onBuilt();
                return getUserPhotoResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public GetUserPhotoResult getDefaultInstanceForType() {
                return GetUserPhotoResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.photo_ = com.google.protobuf.l.f9119b;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m915clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.photo_ = com.google.protobuf.l.f9119b;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m923clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof GetUserPhotoResult) {
                    return mergeFrom((GetUserPhotoResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(GetUserPhotoResult getUserPhotoResult) {
                if (getUserPhotoResult == GetUserPhotoResult.getDefaultInstance()) {
                    return this;
                }
                if (getUserPhotoResult.getPhoto() != com.google.protobuf.l.f9119b) {
                    setPhoto(getUserPhotoResult.getPhoto());
                }
                m141mergeUnknownFields(getUserPhotoResult.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK != 10) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.photo_ = mVar.r();
                                    this.bitField0_ |= 1;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private GetUserPhotoResult(k0.b bVar) {
            super(bVar);
            this.photo_ = com.google.protobuf.l.f9119b;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(GetUserPhotoResult getUserPhotoResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getUserPhotoResult);
        }

        public static GetUserPhotoResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserPhotoResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static GetUserPhotoResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetUserPhotoResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static GetUserPhotoResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (GetUserPhotoResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public GetUserPhotoResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static GetUserPhotoResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserPhotoResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private GetUserPhotoResult() {
            com.google.protobuf.l lVar = com.google.protobuf.l.f9119b;
            this.memoizedIsInitialized = (byte) -1;
            this.photo_ = lVar;
        }

        public static GetUserPhotoResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (GetUserPhotoResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static GetUserPhotoResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (GetUserPhotoResult) PARSER.parseFrom(bArr, yVar);
        }

        public static GetUserPhotoResult parseFrom(InputStream inputStream) throws IOException {
            return (GetUserPhotoResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static GetUserPhotoResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (GetUserPhotoResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static GetUserPhotoResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (GetUserPhotoResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static GetUserPhotoResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (GetUserPhotoResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface GetUserPhotoResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        com.google.protobuf.l getPhoto();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class LoadProfileRequest extends com.google.protobuf.k0 implements LoadProfileRequestOrBuilder {
        public static final int LOADPHOTO_FIELD_NUMBER = 1;
        public static final int SYNCAT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private boolean loadPhoto_;
        private byte memoizedIsInitialized;
        private long syncAt_;
        private static final LoadProfileRequest DEFAULT_INSTANCE = new LoadProfileRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.LoadProfileRequest.1
            @Override // com.google.protobuf.z1
            public LoadProfileRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = LoadProfileRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public static LoadProfileRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_LoadProfileRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoadProfileRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoadProfileRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LoadProfileRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (LoadProfileRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoadProfileRequest)) {
                return super.equals(obj);
            }
            LoadProfileRequest loadProfileRequest = (LoadProfileRequest) obj;
            return getLoadPhoto() == loadProfileRequest.getLoadPhoto() && getSyncAt() == loadProfileRequest.getSyncAt() && getUnknownFields().equals(loadProfileRequest.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.LoadProfileRequestOrBuilder
        public boolean getLoadPhoto() {
            return this.loadPhoto_;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            boolean z10 = this.loadPhoto_;
            int iE = z10 ? com.google.protobuf.o.e(1, z10) : 0;
            long j10 = this.syncAt_;
            if (j10 != 0) {
                iE += com.google.protobuf.o.z(2, j10);
            }
            int serializedSize = iE + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.benshikj.ht.rpc.Um.LoadProfileRequestOrBuilder
        public long getSyncAt() {
            return this.syncAt_;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + com.google.protobuf.o0.d(getLoadPhoto())) * 37) + 2) * 53) + com.google.protobuf.o0.i(getSyncAt())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_LoadProfileRequest_fieldAccessorTable.d(LoadProfileRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new LoadProfileRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            boolean z10 = this.loadPhoto_;
            if (z10) {
                oVar.m0(1, z10);
            }
            long j10 = this.syncAt_;
            if (j10 != 0) {
                oVar.F0(2, j10);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements LoadProfileRequestOrBuilder {
            private int bitField0_;
            private boolean loadPhoto_;
            private long syncAt_;

            private void buildPartial0(LoadProfileRequest loadProfileRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    loadProfileRequest.loadPhoto_ = this.loadPhoto_;
                }
                if ((i10 & 2) != 0) {
                    loadProfileRequest.syncAt_ = this.syncAt_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_LoadProfileRequest_descriptor;
            }

            public Builder clearLoadPhoto() {
                this.bitField0_ &= -2;
                this.loadPhoto_ = false;
                onChanged();
                return this;
            }

            public Builder clearSyncAt() {
                this.bitField0_ &= -3;
                this.syncAt_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_LoadProfileRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.LoadProfileRequestOrBuilder
            public boolean getLoadPhoto() {
                return this.loadPhoto_;
            }

            @Override // com.benshikj.ht.rpc.Um.LoadProfileRequestOrBuilder
            public long getSyncAt() {
                return this.syncAt_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_LoadProfileRequest_fieldAccessorTable.d(LoadProfileRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setLoadPhoto(boolean z10) {
                this.loadPhoto_ = z10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSyncAt(long j10) {
                this.syncAt_ = j10;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public LoadProfileRequest build() {
                LoadProfileRequest loadProfileRequestBuildPartial = buildPartial();
                if (loadProfileRequestBuildPartial.isInitialized()) {
                    return loadProfileRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) loadProfileRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public LoadProfileRequest buildPartial() {
                LoadProfileRequest loadProfileRequest = new LoadProfileRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(loadProfileRequest);
                }
                onBuilt();
                return loadProfileRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public LoadProfileRequest getDefaultInstanceForType() {
                return LoadProfileRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m928clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.loadPhoto_ = false;
                this.syncAt_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m936clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof LoadProfileRequest) {
                    return mergeFrom((LoadProfileRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(LoadProfileRequest loadProfileRequest) {
                if (loadProfileRequest == LoadProfileRequest.getDefaultInstance()) {
                    return this;
                }
                if (loadProfileRequest.getLoadPhoto()) {
                    setLoadPhoto(loadProfileRequest.getLoadPhoto());
                }
                if (loadProfileRequest.getSyncAt() != 0) {
                    setSyncAt(loadProfileRequest.getSyncAt());
                }
                m141mergeUnknownFields(loadProfileRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.loadPhoto_ = mVar.q();
                                    this.bitField0_ |= 1;
                                } else if (iK != 16) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.syncAt_ = mVar.z();
                                    this.bitField0_ |= 2;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private LoadProfileRequest(k0.b bVar) {
            super(bVar);
            this.loadPhoto_ = false;
            this.syncAt_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LoadProfileRequest loadProfileRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loadProfileRequest);
        }

        public static LoadProfileRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LoadProfileRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static LoadProfileRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (LoadProfileRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static LoadProfileRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (LoadProfileRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public LoadProfileRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static LoadProfileRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LoadProfileRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LoadProfileRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (LoadProfileRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        private LoadProfileRequest() {
            this.loadPhoto_ = false;
            this.syncAt_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LoadProfileRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LoadProfileRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static LoadProfileRequest parseFrom(InputStream inputStream) throws IOException {
            return (LoadProfileRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static LoadProfileRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (LoadProfileRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static LoadProfileRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (LoadProfileRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static LoadProfileRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (LoadProfileRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface LoadProfileRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        boolean getLoadPhoto();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        long getSyncAt();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class LoadProfileResult extends com.google.protobuf.k0 implements LoadProfileResultOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final LoadProfileResult DEFAULT_INSTANCE = new LoadProfileResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.LoadProfileResult.1
            @Override // com.google.protobuf.z1
            public LoadProfileResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = LoadProfileResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int profileCase_;
        private Object profile_;

        public enum ProfileCase implements o0.c {
            STATUS(1),
            DATA(2),
            PROFILE_NOT_SET(0);

            private final int value;

            ProfileCase(int i10) {
                this.value = i10;
            }

            public static ProfileCase forNumber(int i10) {
                if (i10 == 0) {
                    return PROFILE_NOT_SET;
                }
                if (i10 == 1) {
                    return STATUS;
                }
                if (i10 != 2) {
                    return null;
                }
                return DATA;
            }

            @Override // com.google.protobuf.o0.c
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ProfileCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        public enum Status implements o0.c {
            ok(0),
            unchanged(1),
            UNRECOGNIZED(-1);

            public static final int ok_VALUE = 0;
            public static final int unchanged_VALUE = 1;
            private final int value;
            private static final o0.d internalValueMap = new o0.d() { // from class: com.benshikj.ht.rpc.Um.LoadProfileResult.Status.1
                /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
                public Status m952findValueByNumber(int i10) {
                    return Status.forNumber(i10);
                }
            };
            private static final Status[] VALUES = values();

            Status(int i10) {
                this.value = i10;
            }

            public static Status forNumber(int i10) {
                if (i10 == 0) {
                    return ok;
                }
                if (i10 != 1) {
                    return null;
                }
                return unchanged;
            }

            public static final r.e getDescriptor() {
                return (r.e) LoadProfileResult.getDescriptor().k().get(0);
            }

            public static o0.d internalGetValueMap() {
                return internalValueMap;
            }

            public final r.e getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            public final r.f getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return (r.f) getDescriptor().k().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static Status valueOf(int i10) {
                return forNumber(i10);
            }

            public static Status valueOf(r.f fVar) {
                if (fVar.h() == getDescriptor()) {
                    if (fVar.g() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[fVar.g()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static LoadProfileResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_LoadProfileResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoadProfileResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoadProfileResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LoadProfileResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (LoadProfileResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoadProfileResult)) {
                return super.equals(obj);
            }
            LoadProfileResult loadProfileResult = (LoadProfileResult) obj;
            if (!getProfileCase().equals(loadProfileResult.getProfileCase())) {
                return false;
            }
            int i10 = this.profileCase_;
            if (i10 != 1) {
                if (i10 == 2 && !getData().equals(loadProfileResult.getData())) {
                    return false;
                }
            } else if (getStatusValue() != loadProfileResult.getStatusValue()) {
                return false;
            }
            return getUnknownFields().equals(loadProfileResult.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
        public UserProfile getData() {
            return this.profileCase_ == 2 ? (UserProfile) this.profile_ : UserProfile.getDefaultInstance();
        }

        @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
        public UserProfileOrBuilder getDataOrBuilder() {
            return this.profileCase_ == 2 ? (UserProfile) this.profile_ : UserProfile.getDefaultInstance();
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
        public ProfileCase getProfileCase() {
            return ProfileCase.forNumber(this.profileCase_);
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = this.profileCase_ == 1 ? com.google.protobuf.o.l(1, ((Integer) this.profile_).intValue()) : 0;
            if (this.profileCase_ == 2) {
                iL += com.google.protobuf.o.G(2, (UserProfile) this.profile_);
            }
            int serializedSize = iL + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
        public Status getStatus() {
            if (this.profileCase_ != 1) {
                return Status.ok;
            }
            Status statusForNumber = Status.forNumber(((Integer) this.profile_).intValue());
            return statusForNumber == null ? Status.UNRECOGNIZED : statusForNumber;
        }

        @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
        public int getStatusValue() {
            if (this.profileCase_ == 1) {
                return ((Integer) this.profile_).intValue();
            }
            return 0;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
        public boolean hasData() {
            return this.profileCase_ == 2;
        }

        @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
        public boolean hasStatus() {
            return this.profileCase_ == 1;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10;
            int statusValue;
            int i11 = this.memoizedHashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            int i12 = this.profileCase_;
            if (i12 != 1) {
                if (i12 == 2) {
                    i10 = ((iHashCode * 37) + 2) * 53;
                    statusValue = getData().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }
            i10 = ((iHashCode * 37) + 1) * 53;
            statusValue = getStatusValue();
            iHashCode = i10 + statusValue;
            int iHashCode22 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode22;
            return iHashCode22;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_LoadProfileResult_fieldAccessorTable.d(LoadProfileResult.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new LoadProfileResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (this.profileCase_ == 1) {
                oVar.u0(1, ((Integer) this.profile_).intValue());
            }
            if (this.profileCase_ == 2) {
                oVar.H0(2, (UserProfile) this.profile_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements LoadProfileResultOrBuilder {
            private int bitField0_;
            private com.google.protobuf.k2 dataBuilder_;
            private int profileCase_;
            private Object profile_;

            private void buildPartial0(LoadProfileResult loadProfileResult) {
            }

            private void buildPartialOneofs(LoadProfileResult loadProfileResult) {
                com.google.protobuf.k2 k2Var;
                loadProfileResult.profileCase_ = this.profileCase_;
                loadProfileResult.profile_ = this.profile_;
                if (this.profileCase_ != 2 || (k2Var = this.dataBuilder_) == null) {
                    return;
                }
                loadProfileResult.profile_ = k2Var.b();
            }

            private com.google.protobuf.k2 getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    if (this.profileCase_ != 2) {
                        this.profile_ = UserProfile.getDefaultInstance();
                    }
                    this.dataBuilder_ = new com.google.protobuf.k2((UserProfile) this.profile_, getParentForChildren(), isClean());
                    this.profile_ = null;
                }
                this.profileCase_ = 2;
                onChanged();
                return this.dataBuilder_;
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_LoadProfileResult_descriptor;
            }

            public Builder clearData() {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var == null) {
                    if (this.profileCase_ == 2) {
                        this.profileCase_ = 0;
                        this.profile_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.profileCase_ == 2) {
                    this.profileCase_ = 0;
                    this.profile_ = null;
                }
                k2Var.c();
                return this;
            }

            public Builder clearProfile() {
                this.profileCase_ = 0;
                this.profile_ = null;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                if (this.profileCase_ == 1) {
                    this.profileCase_ = 0;
                    this.profile_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
            public UserProfile getData() {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                return k2Var == null ? this.profileCase_ == 2 ? (UserProfile) this.profile_ : UserProfile.getDefaultInstance() : this.profileCase_ == 2 ? (UserProfile) k2Var.f() : UserProfile.getDefaultInstance();
            }

            public UserProfile.Builder getDataBuilder() {
                return (UserProfile.Builder) getDataFieldBuilder().e();
            }

            @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
            public UserProfileOrBuilder getDataOrBuilder() {
                com.google.protobuf.k2 k2Var;
                int i10 = this.profileCase_;
                return (i10 != 2 || (k2Var = this.dataBuilder_) == null) ? i10 == 2 ? (UserProfile) this.profile_ : UserProfile.getDefaultInstance() : (UserProfileOrBuilder) k2Var.g();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_LoadProfileResult_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
            public ProfileCase getProfileCase() {
                return ProfileCase.forNumber(this.profileCase_);
            }

            @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
            public Status getStatus() {
                if (this.profileCase_ != 1) {
                    return Status.ok;
                }
                Status statusForNumber = Status.forNumber(((Integer) this.profile_).intValue());
                return statusForNumber == null ? Status.UNRECOGNIZED : statusForNumber;
            }

            @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
            public int getStatusValue() {
                if (this.profileCase_ == 1) {
                    return ((Integer) this.profile_).intValue();
                }
                return 0;
            }

            @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
            public boolean hasData() {
                return this.profileCase_ == 2;
            }

            @Override // com.benshikj.ht.rpc.Um.LoadProfileResultOrBuilder
            public boolean hasStatus() {
                return this.profileCase_ == 1;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_LoadProfileResult_fieldAccessorTable.d(LoadProfileResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeData(UserProfile userProfile) {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var == null) {
                    if (this.profileCase_ != 2 || this.profile_ == UserProfile.getDefaultInstance()) {
                        this.profile_ = userProfile;
                    } else {
                        this.profile_ = UserProfile.newBuilder((UserProfile) this.profile_).mergeFrom(userProfile).buildPartial();
                    }
                    onChanged();
                } else if (this.profileCase_ == 2) {
                    k2Var.h(userProfile);
                } else {
                    k2Var.j(userProfile);
                }
                this.profileCase_ = 2;
                return this;
            }

            public Builder setData(UserProfile userProfile) {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var == null) {
                    userProfile.getClass();
                    this.profile_ = userProfile;
                    onChanged();
                } else {
                    k2Var.j(userProfile);
                }
                this.profileCase_ = 2;
                return this;
            }

            public Builder setStatus(Status status) {
                status.getClass();
                this.profileCase_ = 1;
                this.profile_ = Integer.valueOf(status.getNumber());
                onChanged();
                return this;
            }

            public Builder setStatusValue(int i10) {
                this.profileCase_ = 1;
                this.profile_ = Integer.valueOf(i10);
                onChanged();
                return this;
            }

            private Builder() {
                this.profileCase_ = 0;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public LoadProfileResult build() {
                LoadProfileResult loadProfileResultBuildPartial = buildPartial();
                if (loadProfileResultBuildPartial.isInitialized()) {
                    return loadProfileResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) loadProfileResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public LoadProfileResult buildPartial() {
                LoadProfileResult loadProfileResult = new LoadProfileResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(loadProfileResult);
                }
                buildPartialOneofs(loadProfileResult);
                onBuilt();
                return loadProfileResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public LoadProfileResult getDefaultInstanceForType() {
                return LoadProfileResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.profileCase_ = 0;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m941clear() {
                super.m132clear();
                this.bitField0_ = 0;
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var != null) {
                    k2Var.c();
                }
                this.profileCase_ = 0;
                this.profile_ = null;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m949clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof LoadProfileResult) {
                    return mergeFrom((LoadProfileResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder setData(UserProfile.Builder builder) {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var == null) {
                    this.profile_ = builder.build();
                    onChanged();
                } else {
                    k2Var.j(builder.build());
                }
                this.profileCase_ = 2;
                return this;
            }

            public Builder mergeFrom(LoadProfileResult loadProfileResult) {
                if (loadProfileResult == LoadProfileResult.getDefaultInstance()) {
                    return this;
                }
                int iOrdinal = loadProfileResult.getProfileCase().ordinal();
                if (iOrdinal == 0) {
                    setStatusValue(loadProfileResult.getStatusValue());
                } else if (iOrdinal == 1) {
                    mergeData(loadProfileResult.getData());
                }
                m141mergeUnknownFields(loadProfileResult.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    int iT = mVar.t();
                                    this.profileCase_ = 1;
                                    this.profile_ = Integer.valueOf(iT);
                                } else if (iK != 18) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    mVar.B(getDataFieldBuilder().e(), yVar);
                                    this.profileCase_ = 2;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private LoadProfileResult(k0.b bVar) {
            super(bVar);
            this.profileCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LoadProfileResult loadProfileResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loadProfileResult);
        }

        public static LoadProfileResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LoadProfileResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static LoadProfileResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (LoadProfileResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static LoadProfileResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (LoadProfileResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public LoadProfileResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static LoadProfileResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LoadProfileResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private LoadProfileResult() {
            this.profileCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static LoadProfileResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (LoadProfileResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static LoadProfileResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LoadProfileResult) PARSER.parseFrom(bArr, yVar);
        }

        public static LoadProfileResult parseFrom(InputStream inputStream) throws IOException {
            return (LoadProfileResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static LoadProfileResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (LoadProfileResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static LoadProfileResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (LoadProfileResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static LoadProfileResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (LoadProfileResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface LoadProfileResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        UserProfile getData();

        UserProfileOrBuilder getDataOrBuilder();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        LoadProfileResult.ProfileCase getProfileCase();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        LoadProfileResult.Status getStatus();

        int getStatusValue();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        boolean hasData();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        boolean hasStatus();

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class LoginRequest extends com.google.protobuf.k0 implements LoginRequestOrBuilder {
        private static final LoginRequest DEFAULT_INSTANCE = new LoginRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.LoginRequest.1
            @Override // com.google.protobuf.z1
            public LoginRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = LoginRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int PASSWORD_FIELD_NUMBER = 2;
        public static final int USERNAMEOREMAIL_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object password_;
        private volatile Object usernameOrEmail_;

        public static LoginRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_LoginRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoginRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoginRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LoginRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (LoginRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoginRequest)) {
                return super.equals(obj);
            }
            LoginRequest loginRequest = (LoginRequest) obj;
            return getUsernameOrEmail().equals(loginRequest.getUsernameOrEmail()) && getPassword().equals(loginRequest.getPassword()) && getUnknownFields().equals(loginRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Um.LoginRequestOrBuilder
        public String getPassword() {
            Object obj = this.password_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.password_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.LoginRequestOrBuilder
        public com.google.protobuf.l getPasswordBytes() {
            Object obj = this.password_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.password_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !com.google.protobuf.k0.isStringEmpty(this.usernameOrEmail_) ? com.google.protobuf.k0.computeStringSize(1, this.usernameOrEmail_) : 0;
            if (!com.google.protobuf.k0.isStringEmpty(this.password_)) {
                iComputeStringSize += com.google.protobuf.k0.computeStringSize(2, this.password_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Um.LoginRequestOrBuilder
        public String getUsernameOrEmail() {
            Object obj = this.usernameOrEmail_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.usernameOrEmail_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.LoginRequestOrBuilder
        public com.google.protobuf.l getUsernameOrEmailBytes() {
            Object obj = this.usernameOrEmail_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.usernameOrEmail_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getUsernameOrEmail().hashCode()) * 37) + 2) * 53) + getPassword().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_LoginRequest_fieldAccessorTable.d(LoginRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new LoginRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!com.google.protobuf.k0.isStringEmpty(this.usernameOrEmail_)) {
                com.google.protobuf.k0.writeString(oVar, 1, this.usernameOrEmail_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.password_)) {
                com.google.protobuf.k0.writeString(oVar, 2, this.password_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements LoginRequestOrBuilder {
            private int bitField0_;
            private Object password_;
            private Object usernameOrEmail_;

            private void buildPartial0(LoginRequest loginRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    loginRequest.usernameOrEmail_ = this.usernameOrEmail_;
                }
                if ((i10 & 2) != 0) {
                    loginRequest.password_ = this.password_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_LoginRequest_descriptor;
            }

            public Builder clearPassword() {
                this.password_ = LoginRequest.getDefaultInstance().getPassword();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearUsernameOrEmail() {
                this.usernameOrEmail_ = LoginRequest.getDefaultInstance().getUsernameOrEmail();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_LoginRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.LoginRequestOrBuilder
            public String getPassword() {
                Object obj = this.password_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.password_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.LoginRequestOrBuilder
            public com.google.protobuf.l getPasswordBytes() {
                Object obj = this.password_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.password_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Um.LoginRequestOrBuilder
            public String getUsernameOrEmail() {
                Object obj = this.usernameOrEmail_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.usernameOrEmail_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.LoginRequestOrBuilder
            public com.google.protobuf.l getUsernameOrEmailBytes() {
                Object obj = this.usernameOrEmail_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.usernameOrEmail_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_LoginRequest_fieldAccessorTable.d(LoginRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setPassword(String str) {
                str.getClass();
                this.password_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPasswordBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.password_ = lVar;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUsernameOrEmail(String str) {
                str.getClass();
                this.usernameOrEmail_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUsernameOrEmailBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.usernameOrEmail_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.usernameOrEmail_ = "";
                this.password_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public LoginRequest build() {
                LoginRequest loginRequestBuildPartial = buildPartial();
                if (loginRequestBuildPartial.isInitialized()) {
                    return loginRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) loginRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public LoginRequest buildPartial() {
                LoginRequest loginRequest = new LoginRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(loginRequest);
                }
                onBuilt();
                return loginRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public LoginRequest getDefaultInstanceForType() {
                return LoginRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m955clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.usernameOrEmail_ = "";
                this.password_ = "";
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.usernameOrEmail_ = "";
                this.password_ = "";
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m963clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof LoginRequest) {
                    return mergeFrom((LoginRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(LoginRequest loginRequest) {
                if (loginRequest == LoginRequest.getDefaultInstance()) {
                    return this;
                }
                if (!loginRequest.getUsernameOrEmail().isEmpty()) {
                    this.usernameOrEmail_ = loginRequest.usernameOrEmail_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!loginRequest.getPassword().isEmpty()) {
                    this.password_ = loginRequest.password_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                m141mergeUnknownFields(loginRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.usernameOrEmail_ = mVar.J();
                                    this.bitField0_ |= 1;
                                } else if (iK != 18) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.password_ = mVar.J();
                                    this.bitField0_ |= 2;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private LoginRequest(k0.b bVar) {
            super(bVar);
            this.usernameOrEmail_ = "";
            this.password_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LoginRequest loginRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loginRequest);
        }

        public static LoginRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LoginRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static LoginRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (LoginRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static LoginRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (LoginRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public LoginRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static LoginRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LoginRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LoginRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (LoginRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        private LoginRequest() {
            this.usernameOrEmail_ = "";
            this.password_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.usernameOrEmail_ = "";
            this.password_ = "";
        }

        public static LoginRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LoginRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static LoginRequest parseFrom(InputStream inputStream) throws IOException {
            return (LoginRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static LoginRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (LoginRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static LoginRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (LoginRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static LoginRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (LoginRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface LoginRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        String getPassword();

        com.google.protobuf.l getPasswordBytes();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        String getUsernameOrEmail();

        com.google.protobuf.l getUsernameOrEmailBytes();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class LoginResult extends com.google.protobuf.k0 implements LoginResultOrBuilder {
        public static final int ACCESSTOKENEXPIRES_FIELD_NUMBER = 2;
        public static final int ACCESSTOKEN_FIELD_NUMBER = 1;
        public static final int CODE_FIELD_NUMBER = 5;
        private static final LoginResult DEFAULT_INSTANCE = new LoginResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.LoginResult.1
            @Override // com.google.protobuf.z1
            public LoginResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = LoginResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int REFRESHTOKENEXPIRES_FIELD_NUMBER = 4;
        public static final int REFRESHTOKEN_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private long accessTokenExpires_;
        private volatile Object accessToken_;
        private int code_;
        private byte memoizedIsInitialized;
        private long refreshTokenExpires_;
        private volatile Object refreshToken_;

        public static LoginResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_LoginResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LoginResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LoginResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LoginResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (LoginResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LoginResult)) {
                return super.equals(obj);
            }
            LoginResult loginResult = (LoginResult) obj;
            return getAccessToken().equals(loginResult.getAccessToken()) && getAccessTokenExpires() == loginResult.getAccessTokenExpires() && getRefreshToken().equals(loginResult.getRefreshToken()) && getRefreshTokenExpires() == loginResult.getRefreshTokenExpires() && this.code_ == loginResult.code_ && getUnknownFields().equals(loginResult.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
        public String getAccessToken() {
            Object obj = this.accessToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.accessToken_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
        public com.google.protobuf.l getAccessTokenBytes() {
            Object obj = this.accessToken_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.accessToken_ = lVarI;
            return lVarI;
        }

        @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
        public long getAccessTokenExpires() {
            return this.accessTokenExpires_;
        }

        @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
        public StatusCode getCode() {
            StatusCode statusCodeForNumber = StatusCode.forNumber(this.code_);
            return statusCodeForNumber == null ? StatusCode.UNRECOGNIZED : statusCodeForNumber;
        }

        @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
        public int getCodeValue() {
            return this.code_;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
        public String getRefreshToken() {
            Object obj = this.refreshToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.refreshToken_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
        public com.google.protobuf.l getRefreshTokenBytes() {
            Object obj = this.refreshToken_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.refreshToken_ = lVarI;
            return lVarI;
        }

        @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
        public long getRefreshTokenExpires() {
            return this.refreshTokenExpires_;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !com.google.protobuf.k0.isStringEmpty(this.accessToken_) ? com.google.protobuf.k0.computeStringSize(1, this.accessToken_) : 0;
            long j10 = this.accessTokenExpires_;
            if (j10 != 0) {
                iComputeStringSize += com.google.protobuf.o.z(2, j10);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.refreshToken_)) {
                iComputeStringSize += com.google.protobuf.k0.computeStringSize(3, this.refreshToken_);
            }
            long j11 = this.refreshTokenExpires_;
            if (j11 != 0) {
                iComputeStringSize += com.google.protobuf.o.z(4, j11);
            }
            if (this.code_ != StatusCode.ok.getNumber()) {
                iComputeStringSize += com.google.protobuf.o.l(5, this.code_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAccessToken().hashCode()) * 37) + 2) * 53) + com.google.protobuf.o0.i(getAccessTokenExpires())) * 37) + 3) * 53) + getRefreshToken().hashCode()) * 37) + 4) * 53) + com.google.protobuf.o0.i(getRefreshTokenExpires())) * 37) + 5) * 53) + this.code_) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_LoginResult_fieldAccessorTable.d(LoginResult.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new LoginResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!com.google.protobuf.k0.isStringEmpty(this.accessToken_)) {
                com.google.protobuf.k0.writeString(oVar, 1, this.accessToken_);
            }
            long j10 = this.accessTokenExpires_;
            if (j10 != 0) {
                oVar.F0(2, j10);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.refreshToken_)) {
                com.google.protobuf.k0.writeString(oVar, 3, this.refreshToken_);
            }
            long j11 = this.refreshTokenExpires_;
            if (j11 != 0) {
                oVar.F0(4, j11);
            }
            if (this.code_ != StatusCode.ok.getNumber()) {
                oVar.u0(5, this.code_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements LoginResultOrBuilder {
            private long accessTokenExpires_;
            private Object accessToken_;
            private int bitField0_;
            private int code_;
            private long refreshTokenExpires_;
            private Object refreshToken_;

            private void buildPartial0(LoginResult loginResult) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    loginResult.accessToken_ = this.accessToken_;
                }
                if ((i10 & 2) != 0) {
                    loginResult.accessTokenExpires_ = this.accessTokenExpires_;
                }
                if ((i10 & 4) != 0) {
                    loginResult.refreshToken_ = this.refreshToken_;
                }
                if ((i10 & 8) != 0) {
                    loginResult.refreshTokenExpires_ = this.refreshTokenExpires_;
                }
                if ((i10 & 16) != 0) {
                    loginResult.code_ = this.code_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_LoginResult_descriptor;
            }

            public Builder clearAccessToken() {
                this.accessToken_ = LoginResult.getDefaultInstance().getAccessToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearAccessTokenExpires() {
                this.bitField0_ &= -3;
                this.accessTokenExpires_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearCode() {
                this.bitField0_ &= -17;
                this.code_ = 0;
                onChanged();
                return this;
            }

            public Builder clearRefreshToken() {
                this.refreshToken_ = LoginResult.getDefaultInstance().getRefreshToken();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearRefreshTokenExpires() {
                this.bitField0_ &= -9;
                this.refreshTokenExpires_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
            public String getAccessToken() {
                Object obj = this.accessToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.accessToken_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
            public com.google.protobuf.l getAccessTokenBytes() {
                Object obj = this.accessToken_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.accessToken_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
            public long getAccessTokenExpires() {
                return this.accessTokenExpires_;
            }

            @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
            public StatusCode getCode() {
                StatusCode statusCodeForNumber = StatusCode.forNumber(this.code_);
                return statusCodeForNumber == null ? StatusCode.UNRECOGNIZED : statusCodeForNumber;
            }

            @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
            public int getCodeValue() {
                return this.code_;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_LoginResult_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
            public String getRefreshToken() {
                Object obj = this.refreshToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.refreshToken_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
            public com.google.protobuf.l getRefreshTokenBytes() {
                Object obj = this.refreshToken_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.refreshToken_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Um.LoginResultOrBuilder
            public long getRefreshTokenExpires() {
                return this.refreshTokenExpires_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_LoginResult_fieldAccessorTable.d(LoginResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAccessToken(String str) {
                str.getClass();
                this.accessToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAccessTokenBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.accessToken_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAccessTokenExpires(long j10) {
                this.accessTokenExpires_ = j10;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCode(StatusCode statusCode) {
                statusCode.getClass();
                this.bitField0_ |= 16;
                this.code_ = statusCode.getNumber();
                onChanged();
                return this;
            }

            public Builder setCodeValue(int i10) {
                this.code_ = i10;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setRefreshToken(String str) {
                str.getClass();
                this.refreshToken_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRefreshTokenBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.refreshToken_ = lVar;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setRefreshTokenExpires(long j10) {
                this.refreshTokenExpires_ = j10;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            private Builder() {
                this.accessToken_ = "";
                this.refreshToken_ = "";
                this.code_ = 0;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public LoginResult build() {
                LoginResult loginResultBuildPartial = buildPartial();
                if (loginResultBuildPartial.isInitialized()) {
                    return loginResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) loginResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public LoginResult buildPartial() {
                LoginResult loginResult = new LoginResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(loginResult);
                }
                onBuilt();
                return loginResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public LoginResult getDefaultInstanceForType() {
                return LoginResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m968clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.accessToken_ = "";
                this.accessTokenExpires_ = 0L;
                this.refreshToken_ = "";
                this.refreshTokenExpires_ = 0L;
                this.code_ = 0;
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.accessToken_ = "";
                this.refreshToken_ = "";
                this.code_ = 0;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m976clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof LoginResult) {
                    return mergeFrom((LoginResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(LoginResult loginResult) {
                if (loginResult == LoginResult.getDefaultInstance()) {
                    return this;
                }
                if (!loginResult.getAccessToken().isEmpty()) {
                    this.accessToken_ = loginResult.accessToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (loginResult.getAccessTokenExpires() != 0) {
                    setAccessTokenExpires(loginResult.getAccessTokenExpires());
                }
                if (!loginResult.getRefreshToken().isEmpty()) {
                    this.refreshToken_ = loginResult.refreshToken_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (loginResult.getRefreshTokenExpires() != 0) {
                    setRefreshTokenExpires(loginResult.getRefreshTokenExpires());
                }
                if (loginResult.code_ != 0) {
                    setCodeValue(loginResult.getCodeValue());
                }
                m141mergeUnknownFields(loginResult.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.accessToken_ = mVar.J();
                                    this.bitField0_ |= 1;
                                } else if (iK == 16) {
                                    this.accessTokenExpires_ = mVar.z();
                                    this.bitField0_ |= 2;
                                } else if (iK == 26) {
                                    this.refreshToken_ = mVar.J();
                                    this.bitField0_ |= 4;
                                } else if (iK == 32) {
                                    this.refreshTokenExpires_ = mVar.z();
                                    this.bitField0_ |= 8;
                                } else if (iK != 40) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.code_ = mVar.t();
                                    this.bitField0_ |= 16;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private LoginResult(k0.b bVar) {
            super(bVar);
            this.accessToken_ = "";
            this.accessTokenExpires_ = 0L;
            this.refreshToken_ = "";
            this.refreshTokenExpires_ = 0L;
            this.code_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LoginResult loginResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(loginResult);
        }

        public static LoginResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LoginResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static LoginResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (LoginResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static LoginResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (LoginResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public LoginResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static LoginResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LoginResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LoginResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (LoginResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static LoginResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LoginResult) PARSER.parseFrom(bArr, yVar);
        }

        public static LoginResult parseFrom(InputStream inputStream) throws IOException {
            return (LoginResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        private LoginResult() {
            this.accessToken_ = "";
            this.accessTokenExpires_ = 0L;
            this.refreshToken_ = "";
            this.refreshTokenExpires_ = 0L;
            this.code_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.accessToken_ = "";
            this.refreshToken_ = "";
            this.code_ = 0;
        }

        public static LoginResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (LoginResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static LoginResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (LoginResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static LoginResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (LoginResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface LoginResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        String getAccessToken();

        com.google.protobuf.l getAccessTokenBytes();

        long getAccessTokenExpires();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        StatusCode getCode();

        int getCodeValue();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        String getRefreshToken();

        com.google.protobuf.l getRefreshTokenBytes();

        long getRefreshTokenExpires();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class LogoutRequest extends com.google.protobuf.k0 implements LogoutRequestOrBuilder {
        public static final int ACCESSTOKEN_FIELD_NUMBER = 1;
        private static final LogoutRequest DEFAULT_INSTANCE = new LogoutRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.LogoutRequest.1
            @Override // com.google.protobuf.z1
            public LogoutRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = LogoutRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int REFRESHTOKEN_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object accessToken_;
        private byte memoizedIsInitialized;
        private volatile Object refreshToken_;

        public static LogoutRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_LogoutRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LogoutRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LogoutRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LogoutRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (LogoutRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LogoutRequest)) {
                return super.equals(obj);
            }
            LogoutRequest logoutRequest = (LogoutRequest) obj;
            return getAccessToken().equals(logoutRequest.getAccessToken()) && getRefreshToken().equals(logoutRequest.getRefreshToken()) && getUnknownFields().equals(logoutRequest.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.LogoutRequestOrBuilder
        public String getAccessToken() {
            Object obj = this.accessToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.accessToken_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.LogoutRequestOrBuilder
        public com.google.protobuf.l getAccessTokenBytes() {
            Object obj = this.accessToken_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.accessToken_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Um.LogoutRequestOrBuilder
        public String getRefreshToken() {
            Object obj = this.refreshToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.refreshToken_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.LogoutRequestOrBuilder
        public com.google.protobuf.l getRefreshTokenBytes() {
            Object obj = this.refreshToken_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.refreshToken_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !com.google.protobuf.k0.isStringEmpty(this.accessToken_) ? com.google.protobuf.k0.computeStringSize(1, this.accessToken_) : 0;
            if (!com.google.protobuf.k0.isStringEmpty(this.refreshToken_)) {
                iComputeStringSize += com.google.protobuf.k0.computeStringSize(2, this.refreshToken_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getAccessToken().hashCode()) * 37) + 2) * 53) + getRefreshToken().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_LogoutRequest_fieldAccessorTable.d(LogoutRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new LogoutRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!com.google.protobuf.k0.isStringEmpty(this.accessToken_)) {
                com.google.protobuf.k0.writeString(oVar, 1, this.accessToken_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.refreshToken_)) {
                com.google.protobuf.k0.writeString(oVar, 2, this.refreshToken_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements LogoutRequestOrBuilder {
            private Object accessToken_;
            private int bitField0_;
            private Object refreshToken_;

            private void buildPartial0(LogoutRequest logoutRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    logoutRequest.accessToken_ = this.accessToken_;
                }
                if ((i10 & 2) != 0) {
                    logoutRequest.refreshToken_ = this.refreshToken_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_LogoutRequest_descriptor;
            }

            public Builder clearAccessToken() {
                this.accessToken_ = LogoutRequest.getDefaultInstance().getAccessToken();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearRefreshToken() {
                this.refreshToken_ = LogoutRequest.getDefaultInstance().getRefreshToken();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.benshikj.ht.rpc.Um.LogoutRequestOrBuilder
            public String getAccessToken() {
                Object obj = this.accessToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.accessToken_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.LogoutRequestOrBuilder
            public com.google.protobuf.l getAccessTokenBytes() {
                Object obj = this.accessToken_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.accessToken_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_LogoutRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.LogoutRequestOrBuilder
            public String getRefreshToken() {
                Object obj = this.refreshToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.refreshToken_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.LogoutRequestOrBuilder
            public com.google.protobuf.l getRefreshTokenBytes() {
                Object obj = this.refreshToken_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.refreshToken_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_LogoutRequest_fieldAccessorTable.d(LogoutRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAccessToken(String str) {
                str.getClass();
                this.accessToken_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setAccessTokenBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.accessToken_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setRefreshToken(String str) {
                str.getClass();
                this.refreshToken_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setRefreshTokenBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.refreshToken_ = lVar;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.accessToken_ = "";
                this.refreshToken_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public LogoutRequest build() {
                LogoutRequest logoutRequestBuildPartial = buildPartial();
                if (logoutRequestBuildPartial.isInitialized()) {
                    return logoutRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) logoutRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public LogoutRequest buildPartial() {
                LogoutRequest logoutRequest = new LogoutRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(logoutRequest);
                }
                onBuilt();
                return logoutRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public LogoutRequest getDefaultInstanceForType() {
                return LogoutRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m981clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.accessToken_ = "";
                this.refreshToken_ = "";
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.accessToken_ = "";
                this.refreshToken_ = "";
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m989clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof LogoutRequest) {
                    return mergeFrom((LogoutRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(LogoutRequest logoutRequest) {
                if (logoutRequest == LogoutRequest.getDefaultInstance()) {
                    return this;
                }
                if (!logoutRequest.getAccessToken().isEmpty()) {
                    this.accessToken_ = logoutRequest.accessToken_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!logoutRequest.getRefreshToken().isEmpty()) {
                    this.refreshToken_ = logoutRequest.refreshToken_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                m141mergeUnknownFields(logoutRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.accessToken_ = mVar.J();
                                    this.bitField0_ |= 1;
                                } else if (iK != 18) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.refreshToken_ = mVar.J();
                                    this.bitField0_ |= 2;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private LogoutRequest(k0.b bVar) {
            super(bVar);
            this.accessToken_ = "";
            this.refreshToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LogoutRequest logoutRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(logoutRequest);
        }

        public static LogoutRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LogoutRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static LogoutRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (LogoutRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static LogoutRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (LogoutRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public LogoutRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static LogoutRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LogoutRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static LogoutRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (LogoutRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        private LogoutRequest() {
            this.accessToken_ = "";
            this.refreshToken_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.accessToken_ = "";
            this.refreshToken_ = "";
        }

        public static LogoutRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LogoutRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static LogoutRequest parseFrom(InputStream inputStream) throws IOException {
            return (LogoutRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static LogoutRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (LogoutRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static LogoutRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (LogoutRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static LogoutRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (LogoutRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface LogoutRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        String getAccessToken();

        com.google.protobuf.l getAccessTokenBytes();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        String getRefreshToken();

        com.google.protobuf.l getRefreshTokenBytes();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class LogoutResult extends com.google.protobuf.k0 implements LogoutResultOrBuilder {
        public static final int CODE_FIELD_NUMBER = 1;
        private static final LogoutResult DEFAULT_INSTANCE = new LogoutResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.LogoutResult.1
            @Override // com.google.protobuf.z1
            public LogoutResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = LogoutResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private int code_;
        private byte memoizedIsInitialized;

        public static LogoutResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_LogoutResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static LogoutResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (LogoutResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static LogoutResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (LogoutResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof LogoutResult)) {
                return super.equals(obj);
            }
            LogoutResult logoutResult = (LogoutResult) obj;
            return this.code_ == logoutResult.code_ && getUnknownFields().equals(logoutResult.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.LogoutResultOrBuilder
        public StatusCode getCode() {
            StatusCode statusCodeForNumber = StatusCode.forNumber(this.code_);
            return statusCodeForNumber == null ? StatusCode.UNRECOGNIZED : statusCodeForNumber;
        }

        @Override // com.benshikj.ht.rpc.Um.LogoutResultOrBuilder
        public int getCodeValue() {
            return this.code_;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = (this.code_ != StatusCode.ok.getNumber() ? com.google.protobuf.o.l(1, this.code_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iL;
            return iL;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.code_) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_LogoutResult_fieldAccessorTable.d(LogoutResult.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new LogoutResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (this.code_ != StatusCode.ok.getNumber()) {
                oVar.u0(1, this.code_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements LogoutResultOrBuilder {
            private int bitField0_;
            private int code_;

            private void buildPartial0(LogoutResult logoutResult) {
                if ((this.bitField0_ & 1) != 0) {
                    logoutResult.code_ = this.code_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_LogoutResult_descriptor;
            }

            public Builder clearCode() {
                this.bitField0_ &= -2;
                this.code_ = 0;
                onChanged();
                return this;
            }

            @Override // com.benshikj.ht.rpc.Um.LogoutResultOrBuilder
            public StatusCode getCode() {
                StatusCode statusCodeForNumber = StatusCode.forNumber(this.code_);
                return statusCodeForNumber == null ? StatusCode.UNRECOGNIZED : statusCodeForNumber;
            }

            @Override // com.benshikj.ht.rpc.Um.LogoutResultOrBuilder
            public int getCodeValue() {
                return this.code_;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_LogoutResult_descriptor;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_LogoutResult_fieldAccessorTable.d(LogoutResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setCode(StatusCode statusCode) {
                statusCode.getClass();
                this.bitField0_ |= 1;
                this.code_ = statusCode.getNumber();
                onChanged();
                return this;
            }

            public Builder setCodeValue(int i10) {
                this.code_ = i10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.code_ = 0;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public LogoutResult build() {
                LogoutResult logoutResultBuildPartial = buildPartial();
                if (logoutResultBuildPartial.isInitialized()) {
                    return logoutResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) logoutResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public LogoutResult buildPartial() {
                LogoutResult logoutResult = new LogoutResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(logoutResult);
                }
                onBuilt();
                return logoutResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public LogoutResult getDefaultInstanceForType() {
                return LogoutResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.code_ = 0;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m994clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.code_ = 0;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1002clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof LogoutResult) {
                    return mergeFrom((LogoutResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(LogoutResult logoutResult) {
                if (logoutResult == LogoutResult.getDefaultInstance()) {
                    return this;
                }
                if (logoutResult.code_ != 0) {
                    setCodeValue(logoutResult.getCodeValue());
                }
                m141mergeUnknownFields(logoutResult.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK != 8) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.code_ = mVar.t();
                                    this.bitField0_ |= 1;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private LogoutResult(k0.b bVar) {
            super(bVar);
            this.code_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(LogoutResult logoutResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(logoutResult);
        }

        public static LogoutResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LogoutResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static LogoutResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (LogoutResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static LogoutResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (LogoutResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public LogoutResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static LogoutResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LogoutResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private LogoutResult() {
            this.memoizedIsInitialized = (byte) -1;
            this.code_ = 0;
        }

        public static LogoutResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (LogoutResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static LogoutResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (LogoutResult) PARSER.parseFrom(bArr, yVar);
        }

        public static LogoutResult parseFrom(InputStream inputStream) throws IOException {
            return (LogoutResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static LogoutResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (LogoutResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static LogoutResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (LogoutResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static LogoutResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (LogoutResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface LogoutResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        StatusCode getCode();

        int getCodeValue();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class OpenIDLoginRequest extends com.google.protobuf.k0 implements OpenIDLoginRequestOrBuilder {
        public static final int ACCESSTOKEN_FIELD_NUMBER = 3;
        public static final int NICKNAME_FIELD_NUMBER = 4;
        public static final int OPENID_FIELD_NUMBER = 2;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private volatile Object accessToken_;
        private byte memoizedIsInitialized;
        private volatile Object nickname_;
        private volatile Object openID_;
        private int type_;
        private static final OpenIDLoginRequest DEFAULT_INSTANCE = new OpenIDLoginRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.OpenIDLoginRequest.1
            @Override // com.google.protobuf.z1
            public OpenIDLoginRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = OpenIDLoginRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public enum Type implements o0.c {
            QQ(0),
            WeiXin(1),
            Apple(2),
            Google(3),
            UNRECOGNIZED(-1);

            public static final int Apple_VALUE = 2;
            public static final int Google_VALUE = 3;
            public static final int QQ_VALUE = 0;
            public static final int WeiXin_VALUE = 1;
            private final int value;
            private static final o0.d internalValueMap = new o0.d() { // from class: com.benshikj.ht.rpc.Um.OpenIDLoginRequest.Type.1
                /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
                public Type m1018findValueByNumber(int i10) {
                    return Type.forNumber(i10);
                }
            };
            private static final Type[] VALUES = values();

            Type(int i10) {
                this.value = i10;
            }

            public static Type forNumber(int i10) {
                if (i10 == 0) {
                    return QQ;
                }
                if (i10 == 1) {
                    return WeiXin;
                }
                if (i10 == 2) {
                    return Apple;
                }
                if (i10 != 3) {
                    return null;
                }
                return Google;
            }

            public static final r.e getDescriptor() {
                return (r.e) OpenIDLoginRequest.getDescriptor().k().get(0);
            }

            public static o0.d internalGetValueMap() {
                return internalValueMap;
            }

            public final r.e getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            public final r.f getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return (r.f) getDescriptor().k().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static Type valueOf(int i10) {
                return forNumber(i10);
            }

            public static Type valueOf(r.f fVar) {
                if (fVar.h() == getDescriptor()) {
                    if (fVar.g() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[fVar.g()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static OpenIDLoginRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_OpenIDLoginRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OpenIDLoginRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (OpenIDLoginRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OpenIDLoginRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (OpenIDLoginRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OpenIDLoginRequest)) {
                return super.equals(obj);
            }
            OpenIDLoginRequest openIDLoginRequest = (OpenIDLoginRequest) obj;
            return this.type_ == openIDLoginRequest.type_ && getOpenID().equals(openIDLoginRequest.getOpenID()) && getAccessToken().equals(openIDLoginRequest.getAccessToken()) && getNickname().equals(openIDLoginRequest.getNickname()) && getUnknownFields().equals(openIDLoginRequest.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
        public String getAccessToken() {
            Object obj = this.accessToken_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.accessToken_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
        public com.google.protobuf.l getAccessTokenBytes() {
            Object obj = this.accessToken_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.accessToken_ = lVarI;
            return lVarI;
        }

        @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.nickname_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
        public com.google.protobuf.l getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.nickname_ = lVarI;
            return lVarI;
        }

        @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
        public String getOpenID() {
            Object obj = this.openID_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.openID_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
        public com.google.protobuf.l getOpenIDBytes() {
            Object obj = this.openID_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.openID_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = this.type_ != Type.QQ.getNumber() ? com.google.protobuf.o.l(1, this.type_) : 0;
            if (!com.google.protobuf.k0.isStringEmpty(this.openID_)) {
                iL += com.google.protobuf.k0.computeStringSize(2, this.openID_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.accessToken_)) {
                iL += com.google.protobuf.k0.computeStringSize(3, this.accessToken_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.nickname_)) {
                iL += com.google.protobuf.k0.computeStringSize(4, this.nickname_);
            }
            int serializedSize = iL + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
        public Type getType() {
            Type typeForNumber = Type.forNumber(this.type_);
            return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
        }

        @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
        public int getTypeValue() {
            return this.type_;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + this.type_) * 37) + 2) * 53) + getOpenID().hashCode()) * 37) + 3) * 53) + getAccessToken().hashCode()) * 37) + 4) * 53) + getNickname().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_OpenIDLoginRequest_fieldAccessorTable.d(OpenIDLoginRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new OpenIDLoginRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (this.type_ != Type.QQ.getNumber()) {
                oVar.u0(1, this.type_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.openID_)) {
                com.google.protobuf.k0.writeString(oVar, 2, this.openID_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.accessToken_)) {
                com.google.protobuf.k0.writeString(oVar, 3, this.accessToken_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.nickname_)) {
                com.google.protobuf.k0.writeString(oVar, 4, this.nickname_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements OpenIDLoginRequestOrBuilder {
            private Object accessToken_;
            private int bitField0_;
            private Object nickname_;
            private Object openID_;
            private int type_;

            private void buildPartial0(OpenIDLoginRequest openIDLoginRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    openIDLoginRequest.type_ = this.type_;
                }
                if ((i10 & 2) != 0) {
                    openIDLoginRequest.openID_ = this.openID_;
                }
                if ((i10 & 4) != 0) {
                    openIDLoginRequest.accessToken_ = this.accessToken_;
                }
                if ((i10 & 8) != 0) {
                    openIDLoginRequest.nickname_ = this.nickname_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_OpenIDLoginRequest_descriptor;
            }

            public Builder clearAccessToken() {
                this.accessToken_ = OpenIDLoginRequest.getDefaultInstance().getAccessToken();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearNickname() {
                this.nickname_ = OpenIDLoginRequest.getDefaultInstance().getNickname();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearOpenID() {
                this.openID_ = OpenIDLoginRequest.getDefaultInstance().getOpenID();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 0;
                onChanged();
                return this;
            }

            @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
            public String getAccessToken() {
                Object obj = this.accessToken_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.accessToken_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
            public com.google.protobuf.l getAccessTokenBytes() {
                Object obj = this.accessToken_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.accessToken_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_OpenIDLoginRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.nickname_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
            public com.google.protobuf.l getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.nickname_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
            public String getOpenID() {
                Object obj = this.openID_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.openID_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
            public com.google.protobuf.l getOpenIDBytes() {
                Object obj = this.openID_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.openID_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
            public Type getType() {
                Type typeForNumber = Type.forNumber(this.type_);
                return typeForNumber == null ? Type.UNRECOGNIZED : typeForNumber;
            }

            @Override // com.benshikj.ht.rpc.Um.OpenIDLoginRequestOrBuilder
            public int getTypeValue() {
                return this.type_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_OpenIDLoginRequest_fieldAccessorTable.d(OpenIDLoginRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setAccessToken(String str) {
                str.getClass();
                this.accessToken_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setAccessTokenBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.accessToken_ = lVar;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setNickname(String str) {
                str.getClass();
                this.nickname_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.nickname_ = lVar;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setOpenID(String str) {
                str.getClass();
                this.openID_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOpenIDBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.openID_ = lVar;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setType(Type type) {
                type.getClass();
                this.bitField0_ |= 1;
                this.type_ = type.getNumber();
                onChanged();
                return this;
            }

            public Builder setTypeValue(int i10) {
                this.type_ = i10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.type_ = 0;
                this.openID_ = "";
                this.accessToken_ = "";
                this.nickname_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public OpenIDLoginRequest build() {
                OpenIDLoginRequest openIDLoginRequestBuildPartial = buildPartial();
                if (openIDLoginRequestBuildPartial.isInitialized()) {
                    return openIDLoginRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) openIDLoginRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public OpenIDLoginRequest buildPartial() {
                OpenIDLoginRequest openIDLoginRequest = new OpenIDLoginRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(openIDLoginRequest);
                }
                onBuilt();
                return openIDLoginRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public OpenIDLoginRequest getDefaultInstanceForType() {
                return OpenIDLoginRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1007clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.type_ = 0;
                this.openID_ = "";
                this.accessToken_ = "";
                this.nickname_ = "";
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1015clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof OpenIDLoginRequest) {
                    return mergeFrom((OpenIDLoginRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.type_ = 0;
                this.openID_ = "";
                this.accessToken_ = "";
                this.nickname_ = "";
            }

            public Builder mergeFrom(OpenIDLoginRequest openIDLoginRequest) {
                if (openIDLoginRequest == OpenIDLoginRequest.getDefaultInstance()) {
                    return this;
                }
                if (openIDLoginRequest.type_ != 0) {
                    setTypeValue(openIDLoginRequest.getTypeValue());
                }
                if (!openIDLoginRequest.getOpenID().isEmpty()) {
                    this.openID_ = openIDLoginRequest.openID_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!openIDLoginRequest.getAccessToken().isEmpty()) {
                    this.accessToken_ = openIDLoginRequest.accessToken_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (!openIDLoginRequest.getNickname().isEmpty()) {
                    this.nickname_ = openIDLoginRequest.nickname_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                m141mergeUnknownFields(openIDLoginRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.type_ = mVar.t();
                                    this.bitField0_ |= 1;
                                } else if (iK == 18) {
                                    this.openID_ = mVar.J();
                                    this.bitField0_ |= 2;
                                } else if (iK == 26) {
                                    this.accessToken_ = mVar.J();
                                    this.bitField0_ |= 4;
                                } else if (iK != 34) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.nickname_ = mVar.J();
                                    this.bitField0_ |= 8;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private OpenIDLoginRequest(k0.b bVar) {
            super(bVar);
            this.type_ = 0;
            this.openID_ = "";
            this.accessToken_ = "";
            this.nickname_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(OpenIDLoginRequest openIDLoginRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(openIDLoginRequest);
        }

        public static OpenIDLoginRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (OpenIDLoginRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static OpenIDLoginRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (OpenIDLoginRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static OpenIDLoginRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (OpenIDLoginRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public OpenIDLoginRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static OpenIDLoginRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (OpenIDLoginRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OpenIDLoginRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (OpenIDLoginRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static OpenIDLoginRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (OpenIDLoginRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static OpenIDLoginRequest parseFrom(InputStream inputStream) throws IOException {
            return (OpenIDLoginRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        private OpenIDLoginRequest() {
            this.type_ = 0;
            this.openID_ = "";
            this.accessToken_ = "";
            this.nickname_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 0;
            this.openID_ = "";
            this.accessToken_ = "";
            this.nickname_ = "";
        }

        public static OpenIDLoginRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (OpenIDLoginRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static OpenIDLoginRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (OpenIDLoginRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static OpenIDLoginRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (OpenIDLoginRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface OpenIDLoginRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        String getAccessToken();

        com.google.protobuf.l getAccessTokenBytes();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        String getNickname();

        com.google.protobuf.l getNicknameBytes();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        String getOpenID();

        com.google.protobuf.l getOpenIDBytes();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        OpenIDLoginRequest.Type getType();

        int getTypeValue();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class PushMessage extends com.google.protobuf.k0 implements PushMessageOrBuilder {
        public static final int MESSAGEID_FIELD_NUMBER = 1;
        public static final int MESSAGE_FIELD_NUMBER = 3;
        public static final int TITLE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object messageID_;
        private volatile Object message_;
        private volatile Object title_;
        private static final PushMessage DEFAULT_INSTANCE = new PushMessage();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.PushMessage.1
            @Override // com.google.protobuf.z1
            public PushMessage parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = PushMessage.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public static PushMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_PushMessage_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static PushMessage parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (PushMessage) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static PushMessage parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (PushMessage) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof PushMessage)) {
                return super.equals(obj);
            }
            PushMessage pushMessage = (PushMessage) obj;
            return getMessageID().equals(pushMessage.getMessageID()) && getTitle().equals(pushMessage.getTitle()) && getMessage().equals(pushMessage.getMessage()) && getUnknownFields().equals(pushMessage.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.PushMessageOrBuilder
        public String getMessage() {
            Object obj = this.message_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.message_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.PushMessageOrBuilder
        public com.google.protobuf.l getMessageBytes() {
            Object obj = this.message_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.message_ = lVarI;
            return lVarI;
        }

        @Override // com.benshikj.ht.rpc.Um.PushMessageOrBuilder
        public String getMessageID() {
            Object obj = this.messageID_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.messageID_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.PushMessageOrBuilder
        public com.google.protobuf.l getMessageIDBytes() {
            Object obj = this.messageID_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.messageID_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iComputeStringSize = !com.google.protobuf.k0.isStringEmpty(this.messageID_) ? com.google.protobuf.k0.computeStringSize(1, this.messageID_) : 0;
            if (!com.google.protobuf.k0.isStringEmpty(this.title_)) {
                iComputeStringSize += com.google.protobuf.k0.computeStringSize(2, this.title_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.message_)) {
                iComputeStringSize += com.google.protobuf.k0.computeStringSize(3, this.message_);
            }
            int serializedSize = iComputeStringSize + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.benshikj.ht.rpc.Um.PushMessageOrBuilder
        public String getTitle() {
            Object obj = this.title_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.title_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.PushMessageOrBuilder
        public com.google.protobuf.l getTitleBytes() {
            Object obj = this.title_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.title_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getMessageID().hashCode()) * 37) + 2) * 53) + getTitle().hashCode()) * 37) + 3) * 53) + getMessage().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_PushMessage_fieldAccessorTable.d(PushMessage.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new PushMessage();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!com.google.protobuf.k0.isStringEmpty(this.messageID_)) {
                com.google.protobuf.k0.writeString(oVar, 1, this.messageID_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.title_)) {
                com.google.protobuf.k0.writeString(oVar, 2, this.title_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.message_)) {
                com.google.protobuf.k0.writeString(oVar, 3, this.message_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements PushMessageOrBuilder {
            private int bitField0_;
            private Object messageID_;
            private Object message_;
            private Object title_;

            private void buildPartial0(PushMessage pushMessage) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    pushMessage.messageID_ = this.messageID_;
                }
                if ((i10 & 2) != 0) {
                    pushMessage.title_ = this.title_;
                }
                if ((i10 & 4) != 0) {
                    pushMessage.message_ = this.message_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_PushMessage_descriptor;
            }

            public Builder clearMessage() {
                this.message_ = PushMessage.getDefaultInstance().getMessage();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearMessageID() {
                this.messageID_ = PushMessage.getDefaultInstance().getMessageID();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            public Builder clearTitle() {
                this.title_ = PushMessage.getDefaultInstance().getTitle();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_PushMessage_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.PushMessageOrBuilder
            public String getMessage() {
                Object obj = this.message_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.message_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.PushMessageOrBuilder
            public com.google.protobuf.l getMessageBytes() {
                Object obj = this.message_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.message_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Um.PushMessageOrBuilder
            public String getMessageID() {
                Object obj = this.messageID_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.messageID_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.PushMessageOrBuilder
            public com.google.protobuf.l getMessageIDBytes() {
                Object obj = this.messageID_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.messageID_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Um.PushMessageOrBuilder
            public String getTitle() {
                Object obj = this.title_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.title_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.PushMessageOrBuilder
            public com.google.protobuf.l getTitleBytes() {
                Object obj = this.title_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.title_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_PushMessage_fieldAccessorTable.d(PushMessage.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setMessage(String str) {
                str.getClass();
                this.message_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMessageBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.message_ = lVar;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMessageID(String str) {
                str.getClass();
                this.messageID_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMessageIDBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.messageID_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTitle(String str) {
                str.getClass();
                this.title_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setTitleBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.title_ = lVar;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.messageID_ = "";
                this.title_ = "";
                this.message_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public PushMessage build() {
                PushMessage pushMessageBuildPartial = buildPartial();
                if (pushMessageBuildPartial.isInitialized()) {
                    return pushMessageBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) pushMessageBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public PushMessage buildPartial() {
                PushMessage pushMessage = new PushMessage(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(pushMessage);
                }
                onBuilt();
                return pushMessage;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public PushMessage getDefaultInstanceForType() {
                return PushMessage.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1021clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.messageID_ = "";
                this.title_ = "";
                this.message_ = "";
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.messageID_ = "";
                this.title_ = "";
                this.message_ = "";
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1029clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof PushMessage) {
                    return mergeFrom((PushMessage) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(PushMessage pushMessage) {
                if (pushMessage == PushMessage.getDefaultInstance()) {
                    return this;
                }
                if (!pushMessage.getMessageID().isEmpty()) {
                    this.messageID_ = pushMessage.messageID_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!pushMessage.getTitle().isEmpty()) {
                    this.title_ = pushMessage.title_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!pushMessage.getMessage().isEmpty()) {
                    this.message_ = pushMessage.message_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                m141mergeUnknownFields(pushMessage.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    this.messageID_ = mVar.J();
                                    this.bitField0_ |= 1;
                                } else if (iK == 18) {
                                    this.title_ = mVar.J();
                                    this.bitField0_ |= 2;
                                } else if (iK != 26) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.message_ = mVar.J();
                                    this.bitField0_ |= 4;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private PushMessage(k0.b bVar) {
            super(bVar);
            this.messageID_ = "";
            this.title_ = "";
            this.message_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(PushMessage pushMessage) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(pushMessage);
        }

        public static PushMessage parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (PushMessage) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static PushMessage parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (PushMessage) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static PushMessage parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (PushMessage) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public PushMessage getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static PushMessage parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (PushMessage) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static PushMessage parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (PushMessage) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static PushMessage parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (PushMessage) PARSER.parseFrom(bArr, yVar);
        }

        private PushMessage() {
            this.messageID_ = "";
            this.title_ = "";
            this.message_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.messageID_ = "";
            this.title_ = "";
            this.message_ = "";
        }

        public static PushMessage parseFrom(InputStream inputStream) throws IOException {
            return (PushMessage) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static PushMessage parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (PushMessage) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static PushMessage parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (PushMessage) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static PushMessage parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (PushMessage) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface PushMessageOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        String getMessage();

        com.google.protobuf.l getMessageBytes();

        String getMessageID();

        com.google.protobuf.l getMessageIDBytes();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        String getTitle();

        com.google.protobuf.l getTitleBytes();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class SetUserPhotoRequest extends com.google.protobuf.k0 implements SetUserPhotoRequestOrBuilder {
        private static final SetUserPhotoRequest DEFAULT_INSTANCE = new SetUserPhotoRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.SetUserPhotoRequest.1
            @Override // com.google.protobuf.z1
            public SetUserPhotoRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = SetUserPhotoRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int PHOTO_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private com.google.protobuf.l photo_;

        public static SetUserPhotoRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_SetUserPhotoRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SetUserPhotoRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (SetUserPhotoRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SetUserPhotoRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (SetUserPhotoRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SetUserPhotoRequest)) {
                return super.equals(obj);
            }
            SetUserPhotoRequest setUserPhotoRequest = (SetUserPhotoRequest) obj;
            return getPhoto().equals(setUserPhotoRequest.getPhoto()) && getUnknownFields().equals(setUserPhotoRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Um.SetUserPhotoRequestOrBuilder
        public com.google.protobuf.l getPhoto() {
            return this.photo_;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iH = (!this.photo_.isEmpty() ? com.google.protobuf.o.h(1, this.photo_) : 0) + getUnknownFields().getSerializedSize();
            this.memoizedSize = iH;
            return iH;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + getPhoto().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_SetUserPhotoRequest_fieldAccessorTable.d(SetUserPhotoRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new SetUserPhotoRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (!this.photo_.isEmpty()) {
                oVar.q0(1, this.photo_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements SetUserPhotoRequestOrBuilder {
            private int bitField0_;
            private com.google.protobuf.l photo_;

            private void buildPartial0(SetUserPhotoRequest setUserPhotoRequest) {
                if ((this.bitField0_ & 1) != 0) {
                    setUserPhotoRequest.photo_ = this.photo_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_SetUserPhotoRequest_descriptor;
            }

            public Builder clearPhoto() {
                this.bitField0_ &= -2;
                this.photo_ = SetUserPhotoRequest.getDefaultInstance().getPhoto();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_SetUserPhotoRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.SetUserPhotoRequestOrBuilder
            public com.google.protobuf.l getPhoto() {
                return this.photo_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_SetUserPhotoRequest_fieldAccessorTable.d(SetUserPhotoRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setPhoto(com.google.protobuf.l lVar) {
                lVar.getClass();
                this.photo_ = lVar;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
                this.photo_ = com.google.protobuf.l.f9119b;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public SetUserPhotoRequest build() {
                SetUserPhotoRequest setUserPhotoRequestBuildPartial = buildPartial();
                if (setUserPhotoRequestBuildPartial.isInitialized()) {
                    return setUserPhotoRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) setUserPhotoRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public SetUserPhotoRequest buildPartial() {
                SetUserPhotoRequest setUserPhotoRequest = new SetUserPhotoRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(setUserPhotoRequest);
                }
                onBuilt();
                return setUserPhotoRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public SetUserPhotoRequest getDefaultInstanceForType() {
                return SetUserPhotoRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.photo_ = com.google.protobuf.l.f9119b;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1034clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.photo_ = com.google.protobuf.l.f9119b;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1042clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof SetUserPhotoRequest) {
                    return mergeFrom((SetUserPhotoRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(SetUserPhotoRequest setUserPhotoRequest) {
                if (setUserPhotoRequest == SetUserPhotoRequest.getDefaultInstance()) {
                    return this;
                }
                if (setUserPhotoRequest.getPhoto() != com.google.protobuf.l.f9119b) {
                    setPhoto(setUserPhotoRequest.getPhoto());
                }
                m141mergeUnknownFields(setUserPhotoRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK != 10) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.photo_ = mVar.r();
                                    this.bitField0_ |= 1;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private SetUserPhotoRequest(k0.b bVar) {
            super(bVar);
            this.photo_ = com.google.protobuf.l.f9119b;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(SetUserPhotoRequest setUserPhotoRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(setUserPhotoRequest);
        }

        public static SetUserPhotoRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (SetUserPhotoRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static SetUserPhotoRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (SetUserPhotoRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static SetUserPhotoRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (SetUserPhotoRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public SetUserPhotoRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static SetUserPhotoRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (SetUserPhotoRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private SetUserPhotoRequest() {
            com.google.protobuf.l lVar = com.google.protobuf.l.f9119b;
            this.memoizedIsInitialized = (byte) -1;
            this.photo_ = lVar;
        }

        public static SetUserPhotoRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (SetUserPhotoRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static SetUserPhotoRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (SetUserPhotoRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static SetUserPhotoRequest parseFrom(InputStream inputStream) throws IOException {
            return (SetUserPhotoRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static SetUserPhotoRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (SetUserPhotoRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static SetUserPhotoRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (SetUserPhotoRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static SetUserPhotoRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (SetUserPhotoRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface SetUserPhotoRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        com.google.protobuf.l getPhoto();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public enum StatusCode implements o0.c {
        ok(0),
        ErrNameOrPassword(1),
        ErrUserHaveNoPassword(2),
        ErrNotLogin(3),
        ErrUnconfirmed(4),
        UNRECOGNIZED(-1);

        public static final int ErrNameOrPassword_VALUE = 1;
        public static final int ErrNotLogin_VALUE = 3;
        public static final int ErrUnconfirmed_VALUE = 4;
        public static final int ErrUserHaveNoPassword_VALUE = 2;
        public static final int ok_VALUE = 0;
        private final int value;
        private static final o0.d internalValueMap = new o0.d() { // from class: com.benshikj.ht.rpc.Um.StatusCode.1
            /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
            public StatusCode m1045findValueByNumber(int i10) {
                return StatusCode.forNumber(i10);
            }
        };
        private static final StatusCode[] VALUES = values();

        StatusCode(int i10) {
            this.value = i10;
        }

        public static StatusCode forNumber(int i10) {
            if (i10 == 0) {
                return ok;
            }
            if (i10 == 1) {
                return ErrNameOrPassword;
            }
            if (i10 == 2) {
                return ErrUserHaveNoPassword;
            }
            if (i10 == 3) {
                return ErrNotLogin;
            }
            if (i10 != 4) {
                return null;
            }
            return ErrUnconfirmed;
        }

        public static final r.e getDescriptor() {
            return (r.e) Um.getDescriptor().k().get(0);
        }

        public static o0.d internalGetValueMap() {
            return internalValueMap;
        }

        public final r.e getDescriptorForType() {
            return getDescriptor();
        }

        @Override // com.google.protobuf.o0.c
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public final r.f getValueDescriptor() {
            if (this != UNRECOGNIZED) {
                return (r.f) getDescriptor().k().get(ordinal());
            }
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }

        @Deprecated
        public static StatusCode valueOf(int i10) {
            return forNumber(i10);
        }

        public static StatusCode valueOf(r.f fVar) {
            if (fVar.h() == getDescriptor()) {
                if (fVar.g() == -1) {
                    return UNRECOGNIZED;
                }
                return VALUES[fVar.g()];
            }
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
    }

    public static final class UpdateProfileRequest extends com.google.protobuf.k0 implements UpdateProfileRequestOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final UpdateProfileRequest DEFAULT_INSTANCE = new UpdateProfileRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.UpdateProfileRequest.1
            @Override // com.google.protobuf.z1
            public UpdateProfileRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = UpdateProfileRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int UPDATE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private UserProfile data_;
        private byte memoizedIsInitialized;
        private Update update_;

        public static final class Update extends com.google.protobuf.k0 implements UpdateOrBuilder {
            public static final int NICKNAME_FIELD_NUMBER = 1;
            public static final int PHOTO_FIELD_NUMBER = 2;
            private static final long serialVersionUID = 0;
            private byte memoizedIsInitialized;
            private boolean nickname_;
            private boolean photo_;
            private static final Update DEFAULT_INSTANCE = new Update();
            private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.UpdateProfileRequest.Update.1
                @Override // com.google.protobuf.z1
                public Update parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                    Builder builderNewBuilder = Update.newBuilder();
                    try {
                        builderNewBuilder.mergeFrom(mVar, yVar);
                        return builderNewBuilder.buildPartial();
                    } catch (com.google.protobuf.p0 e10) {
                        throw e10.j(builderNewBuilder.buildPartial());
                    } catch (com.google.protobuf.r2 e11) {
                        throw e11.a().j(builderNewBuilder.buildPartial());
                    } catch (IOException e12) {
                        throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                    }
                }
            };

            public static Update getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_UpdateProfileRequest_Update_descriptor;
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static Update parseDelimitedFrom(InputStream inputStream) throws IOException {
                return (Update) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static Update parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
                return (Update) PARSER.parseFrom(byteBuffer);
            }

            public static com.google.protobuf.z1 parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.a
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof Update)) {
                    return super.equals(obj);
                }
                Update update = (Update) obj;
                return getNickname() == update.getNickname() && getPhoto() == update.getPhoto() && getUnknownFields().equals(update.getUnknownFields());
            }

            @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequest.UpdateOrBuilder
            public boolean getNickname() {
                return this.nickname_;
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            public com.google.protobuf.z1 getParserForType() {
                return PARSER;
            }

            @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequest.UpdateOrBuilder
            public boolean getPhoto() {
                return this.photo_;
            }

            @Override // com.google.protobuf.l1
            public int getSerializedSize() {
                int i10 = this.memoizedSize;
                if (i10 != -1) {
                    return i10;
                }
                boolean z10 = this.nickname_;
                int iE = z10 ? com.google.protobuf.o.e(1, z10) : 0;
                boolean z11 = this.photo_;
                if (z11) {
                    iE += com.google.protobuf.o.e(2, z11);
                }
                int serializedSize = iE + getUnknownFields().getSerializedSize();
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final com.google.protobuf.t2 getUnknownFields() {
                return this.unknownFields;
            }

            @Override // com.google.protobuf.a
            public int hashCode() {
                int i10 = this.memoizedHashCode;
                if (i10 != 0) {
                    return i10;
                }
                int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + com.google.protobuf.o0.d(getNickname())) * 37) + 2) * 53) + com.google.protobuf.o0.d(getPhoto())) * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode;
                return iHashCode;
            }

            @Override // com.google.protobuf.k0
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_UpdateProfileRequest_Update_fieldAccessorTable.d(Update.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                byte b10 = this.memoizedIsInitialized;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }

            @Override // com.google.protobuf.k0
            protected Object newInstance(k0.g gVar) {
                return new Update();
            }

            @Override // com.google.protobuf.l1
            public void writeTo(com.google.protobuf.o oVar) throws IOException {
                boolean z10 = this.nickname_;
                if (z10) {
                    oVar.m0(1, z10);
                }
                boolean z11 = this.photo_;
                if (z11) {
                    oVar.m0(2, z11);
                }
                getUnknownFields().writeTo(oVar);
            }

            public static final class Builder extends k0.b implements UpdateOrBuilder {
                private int bitField0_;
                private boolean nickname_;
                private boolean photo_;

                private void buildPartial0(Update update) {
                    int i10 = this.bitField0_;
                    if ((i10 & 1) != 0) {
                        update.nickname_ = this.nickname_;
                    }
                    if ((i10 & 2) != 0) {
                        update.photo_ = this.photo_;
                    }
                }

                public static final r.b getDescriptor() {
                    return Um.internal_static_benshikj_UpdateProfileRequest_Update_descriptor;
                }

                public Builder clearNickname() {
                    this.bitField0_ &= -2;
                    this.nickname_ = false;
                    onChanged();
                    return this;
                }

                public Builder clearPhoto() {
                    this.bitField0_ &= -3;
                    this.photo_ = false;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public r.b getDescriptorForType() {
                    return Um.internal_static_benshikj_UpdateProfileRequest_Update_descriptor;
                }

                @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequest.UpdateOrBuilder
                public boolean getNickname() {
                    return this.nickname_;
                }

                @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequest.UpdateOrBuilder
                public boolean getPhoto() {
                    return this.photo_;
                }

                @Override // com.google.protobuf.k0.b
                protected k0.f internalGetFieldAccessorTable() {
                    return Um.internal_static_benshikj_UpdateProfileRequest_Update_fieldAccessorTable.d(Update.class, Builder.class);
                }

                @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public final boolean isInitialized() {
                    return true;
                }

                public Builder setNickname(boolean z10) {
                    this.nickname_ = z10;
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                public Builder setPhoto(boolean z10) {
                    this.photo_ = z10;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                private Builder() {
                }

                @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
                public Builder addRepeatedField(r.g gVar, Object obj) {
                    return (Builder) super.addRepeatedField(gVar, obj);
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                public Update build() {
                    Update updateBuildPartial = buildPartial();
                    if (updateBuildPartial.isInitialized()) {
                        return updateBuildPartial;
                    }
                    throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) updateBuildPartial);
                }

                @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
                public Update buildPartial() {
                    Update update = new Update(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(update);
                    }
                    onBuilt();
                    return update;
                }

                @Override // com.google.protobuf.k0.b
                /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
                public Builder m133clearField(r.g gVar) {
                    return (Builder) super.m133clearField(gVar);
                }

                @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
                public Update getDefaultInstanceForType() {
                    return Update.getDefaultInstance();
                }

                @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
                public Builder setField(r.g gVar, Object obj) {
                    return (Builder) super.setField(gVar, obj);
                }

                @Override // com.google.protobuf.k0.b
                /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
                public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                    return (Builder) super.m142setRepeatedField(gVar, i10, obj);
                }

                @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
                public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                    return (Builder) super.setUnknownFields(t2Var);
                }

                private Builder(k0.c cVar) {
                    super(cVar);
                }

                @Override // com.google.protobuf.k0.b
                /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public Builder m135clearOneof(r.l lVar) {
                    return (Builder) super.m135clearOneof(lVar);
                }

                @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
                /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
                public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                    return (Builder) super.m141mergeUnknownFields(t2Var);
                }

                @Override // com.google.protobuf.k0.b
                /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public Builder m1061clear() {
                    super.m132clear();
                    this.bitField0_ = 0;
                    this.nickname_ = false;
                    this.photo_ = false;
                    return this;
                }

                @Override // com.google.protobuf.k0.b
                /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
                public Builder m1069clone() {
                    return (Builder) super.m140clone();
                }

                @Override // com.google.protobuf.i1.a
                public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                    if (i1Var instanceof Update) {
                        return mergeFrom((Update) i1Var);
                    }
                    super.mergeFrom(i1Var);
                    return this;
                }

                public Builder mergeFrom(Update update) {
                    if (update == Update.getDefaultInstance()) {
                        return this;
                    }
                    if (update.getNickname()) {
                        setNickname(update.getNickname());
                    }
                    if (update.getPhoto()) {
                        setPhoto(update.getPhoto());
                    }
                    m141mergeUnknownFields(update.getUnknownFields());
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
                public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                    yVar.getClass();
                    boolean z10 = false;
                    while (!z10) {
                        try {
                            try {
                                int iK = mVar.K();
                                if (iK != 0) {
                                    if (iK == 8) {
                                        this.nickname_ = mVar.q();
                                        this.bitField0_ |= 1;
                                    } else if (iK != 16) {
                                        if (!super.parseUnknownField(mVar, yVar, iK)) {
                                        }
                                    } else {
                                        this.photo_ = mVar.q();
                                        this.bitField0_ |= 2;
                                    }
                                }
                                z10 = true;
                            } catch (com.google.protobuf.p0 e10) {
                                throw e10.n();
                            }
                        } catch (Throwable th2) {
                            onChanged();
                            throw th2;
                        }
                    }
                    onChanged();
                    return this;
                }
            }

            private Update(k0.b bVar) {
                super(bVar);
                this.nickname_ = false;
                this.photo_ = false;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Builder newBuilder(Update update) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(update);
            }

            public static Update parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                return (Update) PARSER.parseFrom(byteBuffer, yVar);
            }

            public static Update parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
                return (Update) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
            }

            public static Update parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
                return (Update) PARSER.parseFrom(lVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public Update getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            public Builder toBuilder() {
                return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
            }

            public static Update parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                return (Update) PARSER.parseFrom(lVar, yVar);
            }

            @Override // com.google.protobuf.l1, com.google.protobuf.i1
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static Update parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
                return (Update) PARSER.parseFrom(bArr);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.protobuf.k0
            public Builder newBuilderForType(k0.c cVar) {
                return new Builder(cVar);
            }

            private Update() {
                this.nickname_ = false;
                this.photo_ = false;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static Update parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                return (Update) PARSER.parseFrom(bArr, yVar);
            }

            public static Update parseFrom(InputStream inputStream) throws IOException {
                return (Update) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
            }

            public static Update parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
                return (Update) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
            }

            public static Update parseFrom(com.google.protobuf.m mVar) throws IOException {
                return (Update) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
            }

            public static Update parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                return (Update) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
            }
        }

        public interface UpdateOrBuilder extends com.google.protobuf.o1 {
            /* synthetic */ List findInitializationErrors();

            @Override // com.google.protobuf.o1
            /* synthetic */ Map getAllFields();

            @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

            @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* synthetic */ r.b getDescriptorForType();

            @Override // com.google.protobuf.o1
            /* synthetic */ Object getField(r.g gVar);

            /* synthetic */ String getInitializationErrorString();

            boolean getNickname();

            /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

            boolean getPhoto();

            /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

            /* synthetic */ int getRepeatedFieldCount(r.g gVar);

            @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* synthetic */ com.google.protobuf.t2 getUnknownFields();

            @Override // com.google.protobuf.o1
            /* synthetic */ boolean hasField(r.g gVar);

            /* synthetic */ boolean hasOneof(r.l lVar);

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            /* synthetic */ boolean isInitialized();
        }

        public static UpdateProfileRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_UpdateProfileRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateProfileRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UpdateProfileRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateProfileRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (UpdateProfileRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateProfileRequest)) {
                return super.equals(obj);
            }
            UpdateProfileRequest updateProfileRequest = (UpdateProfileRequest) obj;
            if (hasData() != updateProfileRequest.hasData()) {
                return false;
            }
            if ((!hasData() || getData().equals(updateProfileRequest.getData())) && hasUpdate() == updateProfileRequest.hasUpdate()) {
                return (!hasUpdate() || getUpdate().equals(updateProfileRequest.getUpdate())) && getUnknownFields().equals(updateProfileRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequestOrBuilder
        public UserProfile getData() {
            UserProfile userProfile = this.data_;
            return userProfile == null ? UserProfile.getDefaultInstance() : userProfile;
        }

        @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequestOrBuilder
        public UserProfileOrBuilder getDataOrBuilder() {
            UserProfile userProfile = this.data_;
            return userProfile == null ? UserProfile.getDefaultInstance() : userProfile;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iG = this.data_ != null ? com.google.protobuf.o.G(1, getData()) : 0;
            if (this.update_ != null) {
                iG += com.google.protobuf.o.G(2, getUpdate());
            }
            int serializedSize = iG + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequestOrBuilder
        public Update getUpdate() {
            Update update = this.update_;
            return update == null ? Update.getDefaultInstance() : update;
        }

        @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequestOrBuilder
        public UpdateOrBuilder getUpdateOrBuilder() {
            Update update = this.update_;
            return update == null ? Update.getDefaultInstance() : update;
        }

        @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequestOrBuilder
        public boolean hasData() {
            return this.data_ != null;
        }

        @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequestOrBuilder
        public boolean hasUpdate() {
            return this.update_ != null;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            if (hasData()) {
                iHashCode = (((iHashCode * 37) + 1) * 53) + getData().hashCode();
            }
            if (hasUpdate()) {
                iHashCode = (((iHashCode * 37) + 2) * 53) + getUpdate().hashCode();
            }
            int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_UpdateProfileRequest_fieldAccessorTable.d(UpdateProfileRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new UpdateProfileRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (this.data_ != null) {
                oVar.H0(1, getData());
            }
            if (this.update_ != null) {
                oVar.H0(2, getUpdate());
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements UpdateProfileRequestOrBuilder {
            private int bitField0_;
            private com.google.protobuf.k2 dataBuilder_;
            private UserProfile data_;
            private com.google.protobuf.k2 updateBuilder_;
            private Update update_;

            private void buildPartial0(UpdateProfileRequest updateProfileRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    com.google.protobuf.k2 k2Var = this.dataBuilder_;
                    updateProfileRequest.data_ = k2Var == null ? this.data_ : (UserProfile) k2Var.b();
                }
                if ((i10 & 2) != 0) {
                    com.google.protobuf.k2 k2Var2 = this.updateBuilder_;
                    updateProfileRequest.update_ = k2Var2 == null ? this.update_ : (Update) k2Var2.b();
                }
            }

            private com.google.protobuf.k2 getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    this.dataBuilder_ = new com.google.protobuf.k2(getData(), getParentForChildren(), isClean());
                    this.data_ = null;
                }
                return this.dataBuilder_;
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_UpdateProfileRequest_descriptor;
            }

            private com.google.protobuf.k2 getUpdateFieldBuilder() {
                if (this.updateBuilder_ == null) {
                    this.updateBuilder_ = new com.google.protobuf.k2(getUpdate(), getParentForChildren(), isClean());
                    this.update_ = null;
                }
                return this.updateBuilder_;
            }

            public Builder clearData() {
                this.bitField0_ &= -2;
                this.data_ = null;
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var != null) {
                    k2Var.d();
                    this.dataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdate() {
                this.bitField0_ &= -3;
                this.update_ = null;
                com.google.protobuf.k2 k2Var = this.updateBuilder_;
                if (k2Var != null) {
                    k2Var.d();
                    this.updateBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequestOrBuilder
            public UserProfile getData() {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var != null) {
                    return (UserProfile) k2Var.f();
                }
                UserProfile userProfile = this.data_;
                return userProfile == null ? UserProfile.getDefaultInstance() : userProfile;
            }

            public UserProfile.Builder getDataBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (UserProfile.Builder) getDataFieldBuilder().e();
            }

            @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequestOrBuilder
            public UserProfileOrBuilder getDataOrBuilder() {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var != null) {
                    return (UserProfileOrBuilder) k2Var.g();
                }
                UserProfile userProfile = this.data_;
                return userProfile == null ? UserProfile.getDefaultInstance() : userProfile;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_UpdateProfileRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequestOrBuilder
            public Update getUpdate() {
                com.google.protobuf.k2 k2Var = this.updateBuilder_;
                if (k2Var != null) {
                    return (Update) k2Var.f();
                }
                Update update = this.update_;
                return update == null ? Update.getDefaultInstance() : update;
            }

            public Update.Builder getUpdateBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (Update.Builder) getUpdateFieldBuilder().e();
            }

            @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequestOrBuilder
            public UpdateOrBuilder getUpdateOrBuilder() {
                com.google.protobuf.k2 k2Var = this.updateBuilder_;
                if (k2Var != null) {
                    return (UpdateOrBuilder) k2Var.g();
                }
                Update update = this.update_;
                return update == null ? Update.getDefaultInstance() : update;
            }

            @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequestOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.benshikj.ht.rpc.Um.UpdateProfileRequestOrBuilder
            public boolean hasUpdate() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_UpdateProfileRequest_fieldAccessorTable.d(UpdateProfileRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeData(UserProfile userProfile) {
                UserProfile userProfile2;
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var != null) {
                    k2Var.h(userProfile);
                } else if ((this.bitField0_ & 1) == 0 || (userProfile2 = this.data_) == null || userProfile2 == UserProfile.getDefaultInstance()) {
                    this.data_ = userProfile;
                } else {
                    getDataBuilder().mergeFrom(userProfile);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder mergeUpdate(Update update) {
                Update update2;
                com.google.protobuf.k2 k2Var = this.updateBuilder_;
                if (k2Var != null) {
                    k2Var.h(update);
                } else if ((this.bitField0_ & 2) == 0 || (update2 = this.update_) == null || update2 == Update.getDefaultInstance()) {
                    this.update_ = update;
                } else {
                    getUpdateBuilder().mergeFrom(update);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setData(UserProfile userProfile) {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var == null) {
                    userProfile.getClass();
                    this.data_ = userProfile;
                } else {
                    k2Var.j(userProfile);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUpdate(Update update) {
                com.google.protobuf.k2 k2Var = this.updateBuilder_;
                if (k2Var == null) {
                    update.getClass();
                    this.update_ = update;
                } else {
                    k2Var.j(update);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UpdateProfileRequest build() {
                UpdateProfileRequest updateProfileRequestBuildPartial = buildPartial();
                if (updateProfileRequestBuildPartial.isInitialized()) {
                    return updateProfileRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) updateProfileRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UpdateProfileRequest buildPartial() {
                UpdateProfileRequest updateProfileRequest = new UpdateProfileRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateProfileRequest);
                }
                onBuilt();
                return updateProfileRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public UpdateProfileRequest getDefaultInstanceForType() {
                return UpdateProfileRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1048clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.data_ = null;
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var != null) {
                    k2Var.d();
                    this.dataBuilder_ = null;
                }
                this.update_ = null;
                com.google.protobuf.k2 k2Var2 = this.updateBuilder_;
                if (k2Var2 != null) {
                    k2Var2.d();
                    this.updateBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1056clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof UpdateProfileRequest) {
                    return mergeFrom((UpdateProfileRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder setData(UserProfile.Builder builder) {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var == null) {
                    this.data_ = builder.build();
                } else {
                    k2Var.j(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUpdate(Update.Builder builder) {
                com.google.protobuf.k2 k2Var = this.updateBuilder_;
                if (k2Var == null) {
                    this.update_ = builder.build();
                } else {
                    k2Var.j(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder mergeFrom(UpdateProfileRequest updateProfileRequest) {
                if (updateProfileRequest == UpdateProfileRequest.getDefaultInstance()) {
                    return this;
                }
                if (updateProfileRequest.hasData()) {
                    mergeData(updateProfileRequest.getData());
                }
                if (updateProfileRequest.hasUpdate()) {
                    mergeUpdate(updateProfileRequest.getUpdate());
                }
                m141mergeUnknownFields(updateProfileRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 10) {
                                    mVar.B(getDataFieldBuilder().e(), yVar);
                                    this.bitField0_ |= 1;
                                } else if (iK != 18) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    mVar.B(getUpdateFieldBuilder().e(), yVar);
                                    this.bitField0_ |= 2;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private UpdateProfileRequest(k0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(UpdateProfileRequest updateProfileRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateProfileRequest);
        }

        public static UpdateProfileRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UpdateProfileRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static UpdateProfileRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UpdateProfileRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static UpdateProfileRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (UpdateProfileRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public UpdateProfileRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private UpdateProfileRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateProfileRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UpdateProfileRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateProfileRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (UpdateProfileRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static UpdateProfileRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UpdateProfileRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static UpdateProfileRequest parseFrom(InputStream inputStream) throws IOException {
            return (UpdateProfileRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateProfileRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UpdateProfileRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static UpdateProfileRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (UpdateProfileRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static UpdateProfileRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (UpdateProfileRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface UpdateProfileRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        UserProfile getData();

        UserProfileOrBuilder getDataOrBuilder();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        UpdateProfileRequest.Update getUpdate();

        UpdateProfileRequest.UpdateOrBuilder getUpdateOrBuilder();

        boolean hasData();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        boolean hasUpdate();

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class UpdateProfileResult extends com.google.protobuf.k0 implements UpdateProfileResultOrBuilder {
        private static final UpdateProfileResult DEFAULT_INSTANCE = new UpdateProfileResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.UpdateProfileResult.1
            @Override // com.google.protobuf.z1
            public UpdateProfileResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = UpdateProfileResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        public static UpdateProfileResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_UpdateProfileResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateProfileResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UpdateProfileResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateProfileResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (UpdateProfileResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return !(obj instanceof UpdateProfileResult) ? super.equals(obj) : getUnknownFields().equals(((UpdateProfileResult) obj).getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((779 + getDescriptor().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_UpdateProfileResult_fieldAccessorTable.d(UpdateProfileResult.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new UpdateProfileResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements UpdateProfileResultOrBuilder {
            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_UpdateProfileResult_descriptor;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_UpdateProfileResult_descriptor;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_UpdateProfileResult_fieldAccessorTable.d(UpdateProfileResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UpdateProfileResult build() {
                UpdateProfileResult updateProfileResultBuildPartial = buildPartial();
                if (updateProfileResultBuildPartial.isInitialized()) {
                    return updateProfileResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) updateProfileResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UpdateProfileResult buildPartial() {
                UpdateProfileResult updateProfileResult = new UpdateProfileResult(this);
                onBuilt();
                return updateProfileResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public UpdateProfileResult getDefaultInstanceForType() {
                return UpdateProfileResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1074clear() {
                super.m132clear();
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1082clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof UpdateProfileResult) {
                    return mergeFrom((UpdateProfileResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(UpdateProfileResult updateProfileResult) {
                if (updateProfileResult == UpdateProfileResult.getDefaultInstance()) {
                    return this;
                }
                m141mergeUnknownFields(updateProfileResult.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK == 0 || !super.parseUnknownField(mVar, yVar, iK)) {
                                z10 = true;
                            }
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } finally {
                        onChanged();
                    }
                }
                return this;
            }
        }

        private UpdateProfileResult(k0.b bVar) {
            super(bVar);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(UpdateProfileResult updateProfileResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateProfileResult);
        }

        public static UpdateProfileResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UpdateProfileResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static UpdateProfileResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UpdateProfileResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static UpdateProfileResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (UpdateProfileResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public UpdateProfileResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        private UpdateProfileResult() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateProfileResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UpdateProfileResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateProfileResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (UpdateProfileResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static UpdateProfileResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UpdateProfileResult) PARSER.parseFrom(bArr, yVar);
        }

        public static UpdateProfileResult parseFrom(InputStream inputStream) throws IOException {
            return (UpdateProfileResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateProfileResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UpdateProfileResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static UpdateProfileResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (UpdateProfileResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static UpdateProfileResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (UpdateProfileResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface UpdateProfileResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class UserInfo extends com.google.protobuf.k0 implements UserInfoOrBuilder {
        public static final int NICKNAME_FIELD_NUMBER = 3;
        public static final int UID_FIELD_NUMBER = 1;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object nickname_;
        private long uid_;
        private volatile Object username_;
        private static final UserInfo DEFAULT_INSTANCE = new UserInfo();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.UserInfo.1
            @Override // com.google.protobuf.z1
            public UserInfo parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = UserInfo.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public static UserInfo getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_UserInfo_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserInfo parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserInfo) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserInfo parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (UserInfo) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserInfo)) {
                return super.equals(obj);
            }
            UserInfo userInfo = (UserInfo) obj;
            return getUid() == userInfo.getUid() && getUsername().equals(userInfo.getUsername()) && getNickname().equals(userInfo.getNickname()) && getUnknownFields().equals(userInfo.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.UserInfoOrBuilder
        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.nickname_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.UserInfoOrBuilder
        public com.google.protobuf.l getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.nickname_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.uid_;
            int iZ = j10 != 0 ? com.google.protobuf.o.z(1, j10) : 0;
            if (!com.google.protobuf.k0.isStringEmpty(this.username_)) {
                iZ += com.google.protobuf.k0.computeStringSize(2, this.username_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.nickname_)) {
                iZ += com.google.protobuf.k0.computeStringSize(3, this.nickname_);
            }
            int serializedSize = iZ + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.benshikj.ht.rpc.Um.UserInfoOrBuilder
        public long getUid() {
            return this.uid_;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Um.UserInfoOrBuilder
        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.username_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.UserInfoOrBuilder
        public com.google.protobuf.l getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.username_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + com.google.protobuf.o0.i(getUid())) * 37) + 2) * 53) + getUsername().hashCode()) * 37) + 3) * 53) + getNickname().hashCode()) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_UserInfo_fieldAccessorTable.d(UserInfo.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new UserInfo();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            long j10 = this.uid_;
            if (j10 != 0) {
                oVar.F0(1, j10);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.username_)) {
                com.google.protobuf.k0.writeString(oVar, 2, this.username_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.nickname_)) {
                com.google.protobuf.k0.writeString(oVar, 3, this.nickname_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements UserInfoOrBuilder {
            private int bitField0_;
            private Object nickname_;
            private long uid_;
            private Object username_;

            private void buildPartial0(UserInfo userInfo) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    userInfo.uid_ = this.uid_;
                }
                if ((i10 & 2) != 0) {
                    userInfo.username_ = this.username_;
                }
                if ((i10 & 4) != 0) {
                    userInfo.nickname_ = this.nickname_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_UserInfo_descriptor;
            }

            public Builder clearNickname() {
                this.nickname_ = UserInfo.getDefaultInstance().getNickname();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearUid() {
                this.bitField0_ &= -2;
                this.uid_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUsername() {
                this.username_ = UserInfo.getDefaultInstance().getUsername();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_UserInfo_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.UserInfoOrBuilder
            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.nickname_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.UserInfoOrBuilder
            public com.google.protobuf.l getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.nickname_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Um.UserInfoOrBuilder
            public long getUid() {
                return this.uid_;
            }

            @Override // com.benshikj.ht.rpc.Um.UserInfoOrBuilder
            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.username_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.UserInfoOrBuilder
            public com.google.protobuf.l getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.username_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_UserInfo_fieldAccessorTable.d(UserInfo.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setNickname(String str) {
                str.getClass();
                this.nickname_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.nickname_ = lVar;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUid(long j10) {
                this.uid_ = j10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUsername(String str) {
                str.getClass();
                this.username_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.username_ = lVar;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.username_ = "";
                this.nickname_ = "";
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UserInfo build() {
                UserInfo userInfoBuildPartial = buildPartial();
                if (userInfoBuildPartial.isInitialized()) {
                    return userInfoBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) userInfoBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UserInfo buildPartial() {
                UserInfo userInfo = new UserInfo(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(userInfo);
                }
                onBuilt();
                return userInfo;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public UserInfo getDefaultInstanceForType() {
                return UserInfo.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1087clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.uid_ = 0L;
                this.username_ = "";
                this.nickname_ = "";
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.username_ = "";
                this.nickname_ = "";
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1095clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof UserInfo) {
                    return mergeFrom((UserInfo) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(UserInfo userInfo) {
                if (userInfo == UserInfo.getDefaultInstance()) {
                    return this;
                }
                if (userInfo.getUid() != 0) {
                    setUid(userInfo.getUid());
                }
                if (!userInfo.getUsername().isEmpty()) {
                    this.username_ = userInfo.username_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!userInfo.getNickname().isEmpty()) {
                    this.nickname_ = userInfo.nickname_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                m141mergeUnknownFields(userInfo.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.uid_ = mVar.z();
                                    this.bitField0_ |= 1;
                                } else if (iK == 18) {
                                    this.username_ = mVar.J();
                                    this.bitField0_ |= 2;
                                } else if (iK != 26) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.nickname_ = mVar.J();
                                    this.bitField0_ |= 4;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private UserInfo(k0.b bVar) {
            super(bVar);
            this.uid_ = 0L;
            this.username_ = "";
            this.nickname_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(UserInfo userInfo) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userInfo);
        }

        public static UserInfo parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserInfo) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static UserInfo parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UserInfo) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static UserInfo parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (UserInfo) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public UserInfo getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static UserInfo parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserInfo) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UserInfo parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (UserInfo) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static UserInfo parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserInfo) PARSER.parseFrom(bArr, yVar);
        }

        private UserInfo() {
            this.uid_ = 0L;
            this.username_ = "";
            this.nickname_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.username_ = "";
            this.nickname_ = "";
        }

        public static UserInfo parseFrom(InputStream inputStream) throws IOException {
            return (UserInfo) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static UserInfo parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UserInfo) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static UserInfo parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (UserInfo) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static UserInfo parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (UserInfo) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface UserInfoOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        String getNickname();

        com.google.protobuf.l getNicknameBytes();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        long getUid();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        String getUsername();

        com.google.protobuf.l getUsernameBytes();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class UserProfile extends com.google.protobuf.k0 implements UserProfileOrBuilder {
        public static final int EMAIL_FIELD_NUMBER = 4;
        public static final int NICKNAME_FIELD_NUMBER = 3;
        public static final int PHOTO_FIELD_NUMBER = 5;
        public static final int UID_FIELD_NUMBER = 1;
        public static final int UPDATEAT_FIELD_NUMBER = 6;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private volatile Object email_;
        private byte memoizedIsInitialized;
        private volatile Object nickname_;
        private com.google.protobuf.l photo_;
        private long uid_;
        private long updateAt_;
        private volatile Object username_;
        private static final UserProfile DEFAULT_INSTANCE = new UserProfile();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.UserProfile.1
            @Override // com.google.protobuf.z1
            public UserProfile parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = UserProfile.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public static UserProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_UserProfile_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserProfile parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserProfile) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserProfile parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (UserProfile) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserProfile)) {
                return super.equals(obj);
            }
            UserProfile userProfile = (UserProfile) obj;
            return getUid() == userProfile.getUid() && getUsername().equals(userProfile.getUsername()) && getNickname().equals(userProfile.getNickname()) && getEmail().equals(userProfile.getEmail()) && getPhoto().equals(userProfile.getPhoto()) && getUpdateAt() == userProfile.getUpdateAt() && getUnknownFields().equals(userProfile.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
        public String getEmail() {
            Object obj = this.email_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.email_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
        public com.google.protobuf.l getEmailBytes() {
            Object obj = this.email_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.email_ = lVarI;
            return lVarI;
        }

        @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.nickname_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
        public com.google.protobuf.l getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.nickname_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
        public com.google.protobuf.l getPhoto() {
            return this.photo_;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.uid_;
            int iZ = j10 != 0 ? com.google.protobuf.o.z(1, j10) : 0;
            if (!com.google.protobuf.k0.isStringEmpty(this.username_)) {
                iZ += com.google.protobuf.k0.computeStringSize(2, this.username_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.nickname_)) {
                iZ += com.google.protobuf.k0.computeStringSize(3, this.nickname_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.email_)) {
                iZ += com.google.protobuf.k0.computeStringSize(4, this.email_);
            }
            if (!this.photo_.isEmpty()) {
                iZ += com.google.protobuf.o.h(5, this.photo_);
            }
            long j11 = this.updateAt_;
            if (j11 != 0) {
                iZ += com.google.protobuf.o.z(6, j11);
            }
            int serializedSize = iZ + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
        public long getUid() {
            return this.uid_;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
        public long getUpdateAt() {
            return this.updateAt_;
        }

        @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.username_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
        public com.google.protobuf.l getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.username_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + com.google.protobuf.o0.i(getUid())) * 37) + 2) * 53) + getUsername().hashCode()) * 37) + 3) * 53) + getNickname().hashCode()) * 37) + 4) * 53) + getEmail().hashCode()) * 37) + 5) * 53) + getPhoto().hashCode()) * 37) + 6) * 53) + com.google.protobuf.o0.i(getUpdateAt())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_UserProfile_fieldAccessorTable.d(UserProfile.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new UserProfile();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            long j10 = this.uid_;
            if (j10 != 0) {
                oVar.F0(1, j10);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.username_)) {
                com.google.protobuf.k0.writeString(oVar, 2, this.username_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.nickname_)) {
                com.google.protobuf.k0.writeString(oVar, 3, this.nickname_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.email_)) {
                com.google.protobuf.k0.writeString(oVar, 4, this.email_);
            }
            if (!this.photo_.isEmpty()) {
                oVar.q0(5, this.photo_);
            }
            long j11 = this.updateAt_;
            if (j11 != 0) {
                oVar.F0(6, j11);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements UserProfileOrBuilder {
            private int bitField0_;
            private Object email_;
            private Object nickname_;
            private com.google.protobuf.l photo_;
            private long uid_;
            private long updateAt_;
            private Object username_;

            private void buildPartial0(UserProfile userProfile) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    userProfile.uid_ = this.uid_;
                }
                if ((i10 & 2) != 0) {
                    userProfile.username_ = this.username_;
                }
                if ((i10 & 4) != 0) {
                    userProfile.nickname_ = this.nickname_;
                }
                if ((i10 & 8) != 0) {
                    userProfile.email_ = this.email_;
                }
                if ((i10 & 16) != 0) {
                    userProfile.photo_ = this.photo_;
                }
                if ((i10 & 32) != 0) {
                    userProfile.updateAt_ = this.updateAt_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_UserProfile_descriptor;
            }

            public Builder clearEmail() {
                this.email_ = UserProfile.getDefaultInstance().getEmail();
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearNickname() {
                this.nickname_ = UserProfile.getDefaultInstance().getNickname();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearPhoto() {
                this.bitField0_ &= -17;
                this.photo_ = UserProfile.getDefaultInstance().getPhoto();
                onChanged();
                return this;
            }

            public Builder clearUid() {
                this.bitField0_ &= -2;
                this.uid_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUpdateAt() {
                this.bitField0_ &= -33;
                this.updateAt_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUsername() {
                this.username_ = UserProfile.getDefaultInstance().getUsername();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_UserProfile_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
            public String getEmail() {
                Object obj = this.email_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.email_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
            public com.google.protobuf.l getEmailBytes() {
                Object obj = this.email_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.email_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.nickname_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
            public com.google.protobuf.l getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.nickname_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
            public com.google.protobuf.l getPhoto() {
                return this.photo_;
            }

            @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
            public long getUid() {
                return this.uid_;
            }

            @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
            public long getUpdateAt() {
                return this.updateAt_;
            }

            @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.username_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.UserProfileOrBuilder
            public com.google.protobuf.l getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.username_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_UserProfile_fieldAccessorTable.d(UserProfile.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setEmail(String str) {
                str.getClass();
                this.email_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEmailBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.email_ = lVar;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setNickname(String str) {
                str.getClass();
                this.nickname_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.nickname_ = lVar;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPhoto(com.google.protobuf.l lVar) {
                lVar.getClass();
                this.photo_ = lVar;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setUid(long j10) {
                this.uid_ = j10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUpdateAt(long j10) {
                this.updateAt_ = j10;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setUsername(String str) {
                str.getClass();
                this.username_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.username_ = lVar;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.username_ = "";
                this.nickname_ = "";
                this.email_ = "";
                this.photo_ = com.google.protobuf.l.f9119b;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UserProfile build() {
                UserProfile userProfileBuildPartial = buildPartial();
                if (userProfileBuildPartial.isInitialized()) {
                    return userProfileBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) userProfileBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UserProfile buildPartial() {
                UserProfile userProfile = new UserProfile(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(userProfile);
                }
                onBuilt();
                return userProfile;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public UserProfile getDefaultInstanceForType() {
                return UserProfile.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1100clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.uid_ = 0L;
                this.username_ = "";
                this.nickname_ = "";
                this.email_ = "";
                this.photo_ = com.google.protobuf.l.f9119b;
                this.updateAt_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1108clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof UserProfile) {
                    return mergeFrom((UserProfile) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.username_ = "";
                this.nickname_ = "";
                this.email_ = "";
                this.photo_ = com.google.protobuf.l.f9119b;
            }

            public Builder mergeFrom(UserProfile userProfile) {
                if (userProfile == UserProfile.getDefaultInstance()) {
                    return this;
                }
                if (userProfile.getUid() != 0) {
                    setUid(userProfile.getUid());
                }
                if (!userProfile.getUsername().isEmpty()) {
                    this.username_ = userProfile.username_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!userProfile.getNickname().isEmpty()) {
                    this.nickname_ = userProfile.nickname_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (!userProfile.getEmail().isEmpty()) {
                    this.email_ = userProfile.email_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (userProfile.getPhoto() != com.google.protobuf.l.f9119b) {
                    setPhoto(userProfile.getPhoto());
                }
                if (userProfile.getUpdateAt() != 0) {
                    setUpdateAt(userProfile.getUpdateAt());
                }
                m141mergeUnknownFields(userProfile.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.uid_ = mVar.z();
                                    this.bitField0_ |= 1;
                                } else if (iK == 18) {
                                    this.username_ = mVar.J();
                                    this.bitField0_ |= 2;
                                } else if (iK == 26) {
                                    this.nickname_ = mVar.J();
                                    this.bitField0_ |= 4;
                                } else if (iK == 34) {
                                    this.email_ = mVar.J();
                                    this.bitField0_ |= 8;
                                } else if (iK == 42) {
                                    this.photo_ = mVar.r();
                                    this.bitField0_ |= 16;
                                } else if (iK != 48) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.updateAt_ = mVar.z();
                                    this.bitField0_ |= 32;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private UserProfile(k0.b bVar) {
            super(bVar);
            this.uid_ = 0L;
            this.username_ = "";
            this.nickname_ = "";
            this.email_ = "";
            this.photo_ = com.google.protobuf.l.f9119b;
            this.updateAt_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(UserProfile userProfile) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userProfile);
        }

        public static UserProfile parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserProfile) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static UserProfile parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UserProfile) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static UserProfile parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (UserProfile) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public UserProfile getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static UserProfile parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserProfile) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UserProfile parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (UserProfile) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static UserProfile parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserProfile) PARSER.parseFrom(bArr, yVar);
        }

        public static UserProfile parseFrom(InputStream inputStream) throws IOException {
            return (UserProfile) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static UserProfile parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UserProfile) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        private UserProfile() {
            this.uid_ = 0L;
            this.username_ = "";
            this.nickname_ = "";
            this.email_ = "";
            com.google.protobuf.l lVar = com.google.protobuf.l.f9119b;
            this.photo_ = lVar;
            this.updateAt_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.username_ = "";
            this.nickname_ = "";
            this.email_ = "";
            this.photo_ = lVar;
        }

        public static UserProfile parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (UserProfile) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static UserProfile parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (UserProfile) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface UserProfileOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        String getEmail();

        com.google.protobuf.l getEmailBytes();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        String getNickname();

        com.google.protobuf.l getNicknameBytes();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        com.google.protobuf.l getPhoto();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        long getUid();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        long getUpdateAt();

        String getUsername();

        com.google.protobuf.l getUsernameBytes();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class UserPublicProfile extends com.google.protobuf.k0 implements UserPublicProfileOrBuilder {
        public static final int NICKNAME_FIELD_NUMBER = 3;
        public static final int PHOTO_FIELD_NUMBER = 4;
        public static final int UID_FIELD_NUMBER = 1;
        public static final int UPDATEAT_FIELD_NUMBER = 5;
        public static final int USERNAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private volatile Object nickname_;
        private com.google.protobuf.l photo_;
        private long uid_;
        private long updateAt_;
        private volatile Object username_;
        private static final UserPublicProfile DEFAULT_INSTANCE = new UserPublicProfile();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.UserPublicProfile.1
            @Override // com.google.protobuf.z1
            public UserPublicProfile parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = UserPublicProfile.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };

        public static UserPublicProfile getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_UserPublicProfile_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserPublicProfile parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserPublicProfile) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserPublicProfile parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (UserPublicProfile) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserPublicProfile)) {
                return super.equals(obj);
            }
            UserPublicProfile userPublicProfile = (UserPublicProfile) obj;
            return getUid() == userPublicProfile.getUid() && getUsername().equals(userPublicProfile.getUsername()) && getNickname().equals(userPublicProfile.getNickname()) && getPhoto().equals(userPublicProfile.getPhoto()) && getUpdateAt() == userPublicProfile.getUpdateAt() && getUnknownFields().equals(userPublicProfile.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
        public String getNickname() {
            Object obj = this.nickname_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.nickname_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
        public com.google.protobuf.l getNicknameBytes() {
            Object obj = this.nickname_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.nickname_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
        public com.google.protobuf.l getPhoto() {
            return this.photo_;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.uid_;
            int iZ = j10 != 0 ? com.google.protobuf.o.z(1, j10) : 0;
            if (!com.google.protobuf.k0.isStringEmpty(this.username_)) {
                iZ += com.google.protobuf.k0.computeStringSize(2, this.username_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.nickname_)) {
                iZ += com.google.protobuf.k0.computeStringSize(3, this.nickname_);
            }
            if (!this.photo_.isEmpty()) {
                iZ += com.google.protobuf.o.h(4, this.photo_);
            }
            long j11 = this.updateAt_;
            if (j11 != 0) {
                iZ += com.google.protobuf.o.z(5, j11);
            }
            int serializedSize = iZ + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
        public long getUid() {
            return this.uid_;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
        public long getUpdateAt() {
            return this.updateAt_;
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
        public String getUsername() {
            Object obj = this.username_;
            if (obj instanceof String) {
                return (String) obj;
            }
            String strN = ((com.google.protobuf.l) obj).N();
            this.username_ = strN;
            return strN;
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
        public com.google.protobuf.l getUsernameBytes() {
            Object obj = this.username_;
            if (!(obj instanceof String)) {
                return (com.google.protobuf.l) obj;
            }
            com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
            this.username_ = lVarI;
            return lVarI;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((((((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + com.google.protobuf.o0.i(getUid())) * 37) + 2) * 53) + getUsername().hashCode()) * 37) + 3) * 53) + getNickname().hashCode()) * 37) + 4) * 53) + getPhoto().hashCode()) * 37) + 5) * 53) + com.google.protobuf.o0.i(getUpdateAt())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_UserPublicProfile_fieldAccessorTable.d(UserPublicProfile.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new UserPublicProfile();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            long j10 = this.uid_;
            if (j10 != 0) {
                oVar.F0(1, j10);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.username_)) {
                com.google.protobuf.k0.writeString(oVar, 2, this.username_);
            }
            if (!com.google.protobuf.k0.isStringEmpty(this.nickname_)) {
                com.google.protobuf.k0.writeString(oVar, 3, this.nickname_);
            }
            if (!this.photo_.isEmpty()) {
                oVar.q0(4, this.photo_);
            }
            long j11 = this.updateAt_;
            if (j11 != 0) {
                oVar.F0(5, j11);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements UserPublicProfileOrBuilder {
            private int bitField0_;
            private Object nickname_;
            private com.google.protobuf.l photo_;
            private long uid_;
            private long updateAt_;
            private Object username_;

            private void buildPartial0(UserPublicProfile userPublicProfile) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    userPublicProfile.uid_ = this.uid_;
                }
                if ((i10 & 2) != 0) {
                    userPublicProfile.username_ = this.username_;
                }
                if ((i10 & 4) != 0) {
                    userPublicProfile.nickname_ = this.nickname_;
                }
                if ((i10 & 8) != 0) {
                    userPublicProfile.photo_ = this.photo_;
                }
                if ((i10 & 16) != 0) {
                    userPublicProfile.updateAt_ = this.updateAt_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_UserPublicProfile_descriptor;
            }

            public Builder clearNickname() {
                this.nickname_ = UserPublicProfile.getDefaultInstance().getNickname();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearPhoto() {
                this.bitField0_ &= -9;
                this.photo_ = UserPublicProfile.getDefaultInstance().getPhoto();
                onChanged();
                return this;
            }

            public Builder clearUid() {
                this.bitField0_ &= -2;
                this.uid_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUpdateAt() {
                this.bitField0_ &= -17;
                this.updateAt_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUsername() {
                this.username_ = UserPublicProfile.getDefaultInstance().getUsername();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_UserPublicProfile_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
            public String getNickname() {
                Object obj = this.nickname_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.nickname_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
            public com.google.protobuf.l getNicknameBytes() {
                Object obj = this.nickname_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.nickname_ = lVarI;
                return lVarI;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
            public com.google.protobuf.l getPhoto() {
                return this.photo_;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
            public long getUid() {
                return this.uid_;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
            public long getUpdateAt() {
                return this.updateAt_;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
            public String getUsername() {
                Object obj = this.username_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                String strN = ((com.google.protobuf.l) obj).N();
                this.username_ = strN;
                return strN;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileOrBuilder
            public com.google.protobuf.l getUsernameBytes() {
                Object obj = this.username_;
                if (!(obj instanceof String)) {
                    return (com.google.protobuf.l) obj;
                }
                com.google.protobuf.l lVarI = com.google.protobuf.l.i((String) obj);
                this.username_ = lVarI;
                return lVarI;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_UserPublicProfile_fieldAccessorTable.d(UserPublicProfile.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setNickname(String str) {
                str.getClass();
                this.nickname_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setNicknameBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.nickname_ = lVar;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPhoto(com.google.protobuf.l lVar) {
                lVar.getClass();
                this.photo_ = lVar;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setUid(long j10) {
                this.uid_ = j10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setUpdateAt(long j10) {
                this.updateAt_ = j10;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setUsername(String str) {
                str.getClass();
                this.username_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUsernameBytes(com.google.protobuf.l lVar) {
                lVar.getClass();
                com.google.protobuf.b.checkByteStringIsUtf8(lVar);
                this.username_ = lVar;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            private Builder() {
                this.username_ = "";
                this.nickname_ = "";
                this.photo_ = com.google.protobuf.l.f9119b;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UserPublicProfile build() {
                UserPublicProfile userPublicProfileBuildPartial = buildPartial();
                if (userPublicProfileBuildPartial.isInitialized()) {
                    return userPublicProfileBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) userPublicProfileBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UserPublicProfile buildPartial() {
                UserPublicProfile userPublicProfile = new UserPublicProfile(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(userPublicProfile);
                }
                onBuilt();
                return userPublicProfile;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public UserPublicProfile getDefaultInstanceForType() {
                return UserPublicProfile.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1113clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.uid_ = 0L;
                this.username_ = "";
                this.nickname_ = "";
                this.photo_ = com.google.protobuf.l.f9119b;
                this.updateAt_ = 0L;
                return this;
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.username_ = "";
                this.nickname_ = "";
                this.photo_ = com.google.protobuf.l.f9119b;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1121clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof UserPublicProfile) {
                    return mergeFrom((UserPublicProfile) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(UserPublicProfile userPublicProfile) {
                if (userPublicProfile == UserPublicProfile.getDefaultInstance()) {
                    return this;
                }
                if (userPublicProfile.getUid() != 0) {
                    setUid(userPublicProfile.getUid());
                }
                if (!userPublicProfile.getUsername().isEmpty()) {
                    this.username_ = userPublicProfile.username_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (!userPublicProfile.getNickname().isEmpty()) {
                    this.nickname_ = userPublicProfile.nickname_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (userPublicProfile.getPhoto() != com.google.protobuf.l.f9119b) {
                    setPhoto(userPublicProfile.getPhoto());
                }
                if (userPublicProfile.getUpdateAt() != 0) {
                    setUpdateAt(userPublicProfile.getUpdateAt());
                }
                m141mergeUnknownFields(userPublicProfile.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.uid_ = mVar.z();
                                    this.bitField0_ |= 1;
                                } else if (iK == 18) {
                                    this.username_ = mVar.J();
                                    this.bitField0_ |= 2;
                                } else if (iK == 26) {
                                    this.nickname_ = mVar.J();
                                    this.bitField0_ |= 4;
                                } else if (iK == 34) {
                                    this.photo_ = mVar.r();
                                    this.bitField0_ |= 8;
                                } else if (iK != 40) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.updateAt_ = mVar.z();
                                    this.bitField0_ |= 16;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private UserPublicProfile(k0.b bVar) {
            super(bVar);
            this.uid_ = 0L;
            this.username_ = "";
            this.nickname_ = "";
            this.photo_ = com.google.protobuf.l.f9119b;
            this.updateAt_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(UserPublicProfile userPublicProfile) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userPublicProfile);
        }

        public static UserPublicProfile parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserPublicProfile) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static UserPublicProfile parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UserPublicProfile) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static UserPublicProfile parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (UserPublicProfile) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public UserPublicProfile getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static UserPublicProfile parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserPublicProfile) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UserPublicProfile parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (UserPublicProfile) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static UserPublicProfile parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserPublicProfile) PARSER.parseFrom(bArr, yVar);
        }

        public static UserPublicProfile parseFrom(InputStream inputStream) throws IOException {
            return (UserPublicProfile) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        private UserPublicProfile() {
            this.uid_ = 0L;
            this.username_ = "";
            this.nickname_ = "";
            com.google.protobuf.l lVar = com.google.protobuf.l.f9119b;
            this.photo_ = lVar;
            this.updateAt_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
            this.username_ = "";
            this.nickname_ = "";
            this.photo_ = lVar;
        }

        public static UserPublicProfile parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UserPublicProfile) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static UserPublicProfile parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (UserPublicProfile) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static UserPublicProfile parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (UserPublicProfile) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface UserPublicProfileOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        String getNickname();

        com.google.protobuf.l getNicknameBytes();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        com.google.protobuf.l getPhoto();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        long getUid();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        long getUpdateAt();

        String getUsername();

        com.google.protobuf.l getUsernameBytes();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class UserPublicProfileRequest extends com.google.protobuf.k0 implements UserPublicProfileRequestOrBuilder {
        private static final UserPublicProfileRequest DEFAULT_INSTANCE = new UserPublicProfileRequest();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.UserPublicProfileRequest.1
            @Override // com.google.protobuf.z1
            public UserPublicProfileRequest parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = UserPublicProfileRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int SYNCAT_FIELD_NUMBER = 2;
        public static final int UID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private long syncAt_;
        private long uid_;

        public static UserPublicProfileRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_UserPublicProfileRequest_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserPublicProfileRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserPublicProfileRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserPublicProfileRequest parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (UserPublicProfileRequest) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserPublicProfileRequest)) {
                return super.equals(obj);
            }
            UserPublicProfileRequest userPublicProfileRequest = (UserPublicProfileRequest) obj;
            return getUid() == userPublicProfileRequest.getUid() && getSyncAt() == userPublicProfileRequest.getSyncAt() && getUnknownFields().equals(userPublicProfileRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            long j10 = this.uid_;
            int iZ = j10 != 0 ? com.google.protobuf.o.z(1, j10) : 0;
            long j11 = this.syncAt_;
            if (j11 != 0) {
                iZ += com.google.protobuf.o.z(2, j11);
            }
            int serializedSize = iZ + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileRequestOrBuilder
        public long getSyncAt() {
            return this.syncAt_;
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileRequestOrBuilder
        public long getUid() {
            return this.uid_;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10 = this.memoizedHashCode;
            if (i10 != 0) {
                return i10;
            }
            int iHashCode = ((((((((((779 + getDescriptor().hashCode()) * 37) + 1) * 53) + com.google.protobuf.o0.i(getUid())) * 37) + 2) * 53) + com.google.protobuf.o0.i(getSyncAt())) * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_UserPublicProfileRequest_fieldAccessorTable.d(UserPublicProfileRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new UserPublicProfileRequest();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            long j10 = this.uid_;
            if (j10 != 0) {
                oVar.F0(1, j10);
            }
            long j11 = this.syncAt_;
            if (j11 != 0) {
                oVar.F0(2, j11);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements UserPublicProfileRequestOrBuilder {
            private int bitField0_;
            private long syncAt_;
            private long uid_;

            private void buildPartial0(UserPublicProfileRequest userPublicProfileRequest) {
                int i10 = this.bitField0_;
                if ((i10 & 1) != 0) {
                    userPublicProfileRequest.uid_ = this.uid_;
                }
                if ((i10 & 2) != 0) {
                    userPublicProfileRequest.syncAt_ = this.syncAt_;
                }
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_UserPublicProfileRequest_descriptor;
            }

            public Builder clearSyncAt() {
                this.bitField0_ &= -3;
                this.syncAt_ = 0L;
                onChanged();
                return this;
            }

            public Builder clearUid() {
                this.bitField0_ &= -2;
                this.uid_ = 0L;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_UserPublicProfileRequest_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileRequestOrBuilder
            public long getSyncAt() {
                return this.syncAt_;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileRequestOrBuilder
            public long getUid() {
                return this.uid_;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_UserPublicProfileRequest_fieldAccessorTable.d(UserPublicProfileRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder setSyncAt(long j10) {
                this.syncAt_ = j10;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUid(long j10) {
                this.uid_ = j10;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            private Builder() {
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UserPublicProfileRequest build() {
                UserPublicProfileRequest userPublicProfileRequestBuildPartial = buildPartial();
                if (userPublicProfileRequestBuildPartial.isInitialized()) {
                    return userPublicProfileRequestBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) userPublicProfileRequestBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UserPublicProfileRequest buildPartial() {
                UserPublicProfileRequest userPublicProfileRequest = new UserPublicProfileRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(userPublicProfileRequest);
                }
                onBuilt();
                return userPublicProfileRequest;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public UserPublicProfileRequest getDefaultInstanceForType() {
                return UserPublicProfileRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1126clear() {
                super.m132clear();
                this.bitField0_ = 0;
                this.uid_ = 0L;
                this.syncAt_ = 0L;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1134clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof UserPublicProfileRequest) {
                    return mergeFrom((UserPublicProfileRequest) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder mergeFrom(UserPublicProfileRequest userPublicProfileRequest) {
                if (userPublicProfileRequest == UserPublicProfileRequest.getDefaultInstance()) {
                    return this;
                }
                if (userPublicProfileRequest.getUid() != 0) {
                    setUid(userPublicProfileRequest.getUid());
                }
                if (userPublicProfileRequest.getSyncAt() != 0) {
                    setSyncAt(userPublicProfileRequest.getSyncAt());
                }
                m141mergeUnknownFields(userPublicProfileRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    this.uid_ = mVar.z();
                                    this.bitField0_ |= 1;
                                } else if (iK != 16) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    this.syncAt_ = mVar.z();
                                    this.bitField0_ |= 2;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private UserPublicProfileRequest(k0.b bVar) {
            super(bVar);
            this.uid_ = 0L;
            this.syncAt_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(UserPublicProfileRequest userPublicProfileRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userPublicProfileRequest);
        }

        public static UserPublicProfileRequest parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserPublicProfileRequest) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static UserPublicProfileRequest parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UserPublicProfileRequest) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static UserPublicProfileRequest parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (UserPublicProfileRequest) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public UserPublicProfileRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static UserPublicProfileRequest parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserPublicProfileRequest) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UserPublicProfileRequest parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (UserPublicProfileRequest) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        private UserPublicProfileRequest() {
            this.uid_ = 0L;
            this.syncAt_ = 0L;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserPublicProfileRequest parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserPublicProfileRequest) PARSER.parseFrom(bArr, yVar);
        }

        public static UserPublicProfileRequest parseFrom(InputStream inputStream) throws IOException {
            return (UserPublicProfileRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static UserPublicProfileRequest parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UserPublicProfileRequest) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static UserPublicProfileRequest parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (UserPublicProfileRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static UserPublicProfileRequest parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (UserPublicProfileRequest) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface UserPublicProfileRequestOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        long getSyncAt();

        long getUid();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    public static final class UserPublicProfileResult extends com.google.protobuf.k0 implements UserPublicProfileResultOrBuilder {
        public static final int DATA_FIELD_NUMBER = 2;
        private static final UserPublicProfileResult DEFAULT_INSTANCE = new UserPublicProfileResult();
        private static final com.google.protobuf.z1 PARSER = new com.google.protobuf.c() { // from class: com.benshikj.ht.rpc.Um.UserPublicProfileResult.1
            @Override // com.google.protobuf.z1
            public UserPublicProfileResult parsePartialFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
                Builder builderNewBuilder = UserPublicProfileResult.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(mVar, yVar);
                    return builderNewBuilder.buildPartial();
                } catch (com.google.protobuf.p0 e10) {
                    throw e10.j(builderNewBuilder.buildPartial());
                } catch (com.google.protobuf.r2 e11) {
                    throw e11.a().j(builderNewBuilder.buildPartial());
                } catch (IOException e12) {
                    throw new com.google.protobuf.p0(e12).j(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private int profileCase_;
        private Object profile_;

        public enum ProfileCase implements o0.c {
            STATUS(1),
            DATA(2),
            PROFILE_NOT_SET(0);

            private final int value;

            ProfileCase(int i10) {
                this.value = i10;
            }

            public static ProfileCase forNumber(int i10) {
                if (i10 == 0) {
                    return PROFILE_NOT_SET;
                }
                if (i10 == 1) {
                    return STATUS;
                }
                if (i10 != 2) {
                    return null;
                }
                return DATA;
            }

            @Override // com.google.protobuf.o0.c
            public int getNumber() {
                return this.value;
            }

            @Deprecated
            public static ProfileCase valueOf(int i10) {
                return forNumber(i10);
            }
        }

        public enum Status implements o0.c {
            ok(0),
            unchanged(1),
            UNRECOGNIZED(-1);

            public static final int ok_VALUE = 0;
            public static final int unchanged_VALUE = 1;
            private final int value;
            private static final o0.d internalValueMap = new o0.d() { // from class: com.benshikj.ht.rpc.Um.UserPublicProfileResult.Status.1
                /* JADX INFO: renamed from: findValueByNumber, reason: merged with bridge method [inline-methods] */
                public Status m1150findValueByNumber(int i10) {
                    return Status.forNumber(i10);
                }
            };
            private static final Status[] VALUES = values();

            Status(int i10) {
                this.value = i10;
            }

            public static Status forNumber(int i10) {
                if (i10 == 0) {
                    return ok;
                }
                if (i10 != 1) {
                    return null;
                }
                return unchanged;
            }

            public static final r.e getDescriptor() {
                return (r.e) UserPublicProfileResult.getDescriptor().k().get(0);
            }

            public static o0.d internalGetValueMap() {
                return internalValueMap;
            }

            public final r.e getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.o0.c
            public final int getNumber() {
                if (this != UNRECOGNIZED) {
                    return this.value;
                }
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }

            public final r.f getValueDescriptor() {
                if (this != UNRECOGNIZED) {
                    return (r.f) getDescriptor().k().get(ordinal());
                }
                throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
            }

            @Deprecated
            public static Status valueOf(int i10) {
                return forNumber(i10);
            }

            public static Status valueOf(r.f fVar) {
                if (fVar.h() == getDescriptor()) {
                    if (fVar.g() == -1) {
                        return UNRECOGNIZED;
                    }
                    return VALUES[fVar.g()];
                }
                throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
            }
        }

        public static UserPublicProfileResult getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final r.b getDescriptor() {
            return Um.internal_static_benshikj_UserPublicProfileResult_descriptor;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UserPublicProfileResult parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (UserPublicProfileResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UserPublicProfileResult parseFrom(ByteBuffer byteBuffer) throws com.google.protobuf.p0 {
            return (UserPublicProfileResult) PARSER.parseFrom(byteBuffer);
        }

        public static com.google.protobuf.z1 parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.a
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UserPublicProfileResult)) {
                return super.equals(obj);
            }
            UserPublicProfileResult userPublicProfileResult = (UserPublicProfileResult) obj;
            if (!getProfileCase().equals(userPublicProfileResult.getProfileCase())) {
                return false;
            }
            int i10 = this.profileCase_;
            if (i10 != 1) {
                if (i10 == 2 && !getData().equals(userPublicProfileResult.getData())) {
                    return false;
                }
            } else if (getStatusValue() != userPublicProfileResult.getStatusValue()) {
                return false;
            }
            return getUnknownFields().equals(userPublicProfileResult.getUnknownFields());
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
        public UserPublicProfile getData() {
            return this.profileCase_ == 2 ? (UserPublicProfile) this.profile_ : UserPublicProfile.getDefaultInstance();
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
        public UserPublicProfileOrBuilder getDataOrBuilder() {
            return this.profileCase_ == 2 ? (UserPublicProfile) this.profile_ : UserPublicProfile.getDefaultInstance();
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public com.google.protobuf.z1 getParserForType() {
            return PARSER;
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
        public ProfileCase getProfileCase() {
            return ProfileCase.forNumber(this.profileCase_);
        }

        @Override // com.google.protobuf.l1
        public int getSerializedSize() {
            int i10 = this.memoizedSize;
            if (i10 != -1) {
                return i10;
            }
            int iL = this.profileCase_ == 1 ? com.google.protobuf.o.l(1, ((Integer) this.profile_).intValue()) : 0;
            if (this.profileCase_ == 2) {
                iL += com.google.protobuf.o.G(2, (UserPublicProfile) this.profile_);
            }
            int serializedSize = iL + getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
        public Status getStatus() {
            if (this.profileCase_ != 1) {
                return Status.ok;
            }
            Status statusForNumber = Status.forNumber(((Integer) this.profile_).intValue());
            return statusForNumber == null ? Status.UNRECOGNIZED : statusForNumber;
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
        public int getStatusValue() {
            if (this.profileCase_ == 1) {
                return ((Integer) this.profile_).intValue();
            }
            return 0;
        }

        @Override // com.google.protobuf.k0, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final com.google.protobuf.t2 getUnknownFields() {
            return this.unknownFields;
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
        public boolean hasData() {
            return this.profileCase_ == 2;
        }

        @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
        public boolean hasStatus() {
            return this.profileCase_ == 1;
        }

        @Override // com.google.protobuf.a
        public int hashCode() {
            int i10;
            int statusValue;
            int i11 = this.memoizedHashCode;
            if (i11 != 0) {
                return i11;
            }
            int iHashCode = 779 + getDescriptor().hashCode();
            int i12 = this.profileCase_;
            if (i12 != 1) {
                if (i12 == 2) {
                    i10 = ((iHashCode * 37) + 2) * 53;
                    statusValue = getData().hashCode();
                }
                int iHashCode2 = (iHashCode * 29) + getUnknownFields().hashCode();
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }
            i10 = ((iHashCode * 37) + 1) * 53;
            statusValue = getStatusValue();
            iHashCode = i10 + statusValue;
            int iHashCode22 = (iHashCode * 29) + getUnknownFields().hashCode();
            this.memoizedHashCode = iHashCode22;
            return iHashCode22;
        }

        @Override // com.google.protobuf.k0
        protected k0.f internalGetFieldAccessorTable() {
            return Um.internal_static_benshikj_UserPublicProfileResult_fieldAccessorTable.d(UserPublicProfileResult.class, Builder.class);
        }

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public final boolean isInitialized() {
            byte b10 = this.memoizedIsInitialized;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.k0
        protected Object newInstance(k0.g gVar) {
            return new UserPublicProfileResult();
        }

        @Override // com.google.protobuf.l1
        public void writeTo(com.google.protobuf.o oVar) throws IOException {
            if (this.profileCase_ == 1) {
                oVar.u0(1, ((Integer) this.profile_).intValue());
            }
            if (this.profileCase_ == 2) {
                oVar.H0(2, (UserPublicProfile) this.profile_);
            }
            getUnknownFields().writeTo(oVar);
        }

        public static final class Builder extends k0.b implements UserPublicProfileResultOrBuilder {
            private int bitField0_;
            private com.google.protobuf.k2 dataBuilder_;
            private int profileCase_;
            private Object profile_;

            private void buildPartial0(UserPublicProfileResult userPublicProfileResult) {
            }

            private void buildPartialOneofs(UserPublicProfileResult userPublicProfileResult) {
                com.google.protobuf.k2 k2Var;
                userPublicProfileResult.profileCase_ = this.profileCase_;
                userPublicProfileResult.profile_ = this.profile_;
                if (this.profileCase_ != 2 || (k2Var = this.dataBuilder_) == null) {
                    return;
                }
                userPublicProfileResult.profile_ = k2Var.b();
            }

            private com.google.protobuf.k2 getDataFieldBuilder() {
                if (this.dataBuilder_ == null) {
                    if (this.profileCase_ != 2) {
                        this.profile_ = UserPublicProfile.getDefaultInstance();
                    }
                    this.dataBuilder_ = new com.google.protobuf.k2((UserPublicProfile) this.profile_, getParentForChildren(), isClean());
                    this.profile_ = null;
                }
                this.profileCase_ = 2;
                onChanged();
                return this.dataBuilder_;
            }

            public static final r.b getDescriptor() {
                return Um.internal_static_benshikj_UserPublicProfileResult_descriptor;
            }

            public Builder clearData() {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var == null) {
                    if (this.profileCase_ == 2) {
                        this.profileCase_ = 0;
                        this.profile_ = null;
                        onChanged();
                    }
                    return this;
                }
                if (this.profileCase_ == 2) {
                    this.profileCase_ = 0;
                    this.profile_ = null;
                }
                k2Var.c();
                return this;
            }

            public Builder clearProfile() {
                this.profileCase_ = 0;
                this.profile_ = null;
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                if (this.profileCase_ == 1) {
                    this.profileCase_ = 0;
                    this.profile_ = null;
                    onChanged();
                }
                return this;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
            public UserPublicProfile getData() {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                return k2Var == null ? this.profileCase_ == 2 ? (UserPublicProfile) this.profile_ : UserPublicProfile.getDefaultInstance() : this.profileCase_ == 2 ? (UserPublicProfile) k2Var.f() : UserPublicProfile.getDefaultInstance();
            }

            public UserPublicProfile.Builder getDataBuilder() {
                return (UserPublicProfile.Builder) getDataFieldBuilder().e();
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
            public UserPublicProfileOrBuilder getDataOrBuilder() {
                com.google.protobuf.k2 k2Var;
                int i10 = this.profileCase_;
                return (i10 != 2 || (k2Var = this.dataBuilder_) == null) ? i10 == 2 ? (UserPublicProfile) this.profile_ : UserPublicProfile.getDefaultInstance() : (UserPublicProfileOrBuilder) k2Var.g();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public r.b getDescriptorForType() {
                return Um.internal_static_benshikj_UserPublicProfileResult_descriptor;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
            public ProfileCase getProfileCase() {
                return ProfileCase.forNumber(this.profileCase_);
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
            public Status getStatus() {
                if (this.profileCase_ != 1) {
                    return Status.ok;
                }
                Status statusForNumber = Status.forNumber(((Integer) this.profile_).intValue());
                return statusForNumber == null ? Status.UNRECOGNIZED : statusForNumber;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
            public int getStatusValue() {
                if (this.profileCase_ == 1) {
                    return ((Integer) this.profile_).intValue();
                }
                return 0;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
            public boolean hasData() {
                return this.profileCase_ == 2;
            }

            @Override // com.benshikj.ht.rpc.Um.UserPublicProfileResultOrBuilder
            public boolean hasStatus() {
                return this.profileCase_ == 1;
            }

            @Override // com.google.protobuf.k0.b
            protected k0.f internalGetFieldAccessorTable() {
                return Um.internal_static_benshikj_UserPublicProfileResult_fieldAccessorTable.d(UserPublicProfileResult.class, Builder.class);
            }

            @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeData(UserPublicProfile userPublicProfile) {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var == null) {
                    if (this.profileCase_ != 2 || this.profile_ == UserPublicProfile.getDefaultInstance()) {
                        this.profile_ = userPublicProfile;
                    } else {
                        this.profile_ = UserPublicProfile.newBuilder((UserPublicProfile) this.profile_).mergeFrom(userPublicProfile).buildPartial();
                    }
                    onChanged();
                } else if (this.profileCase_ == 2) {
                    k2Var.h(userPublicProfile);
                } else {
                    k2Var.j(userPublicProfile);
                }
                this.profileCase_ = 2;
                return this;
            }

            public Builder setData(UserPublicProfile userPublicProfile) {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var == null) {
                    userPublicProfile.getClass();
                    this.profile_ = userPublicProfile;
                    onChanged();
                } else {
                    k2Var.j(userPublicProfile);
                }
                this.profileCase_ = 2;
                return this;
            }

            public Builder setStatus(Status status) {
                status.getClass();
                this.profileCase_ = 1;
                this.profile_ = Integer.valueOf(status.getNumber());
                onChanged();
                return this;
            }

            public Builder setStatusValue(int i10) {
                this.profileCase_ = 1;
                this.profile_ = Integer.valueOf(i10);
                onChanged();
                return this;
            }

            private Builder() {
                this.profileCase_ = 0;
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder addRepeatedField(r.g gVar, Object obj) {
                return (Builder) super.addRepeatedField(gVar, obj);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UserPublicProfileResult build() {
                UserPublicProfileResult userPublicProfileResultBuildPartial = buildPartial();
                if (userPublicProfileResultBuildPartial.isInitialized()) {
                    return userPublicProfileResultBuildPartial;
                }
                throw a.AbstractC0131a.newUninitializedMessageException((com.google.protobuf.i1) userPublicProfileResultBuildPartial);
            }

            @Override // com.google.protobuf.l1.a, com.google.protobuf.i1.a
            public UserPublicProfileResult buildPartial() {
                UserPublicProfileResult userPublicProfileResult = new UserPublicProfileResult(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(userPublicProfileResult);
                }
                buildPartialOneofs(userPublicProfileResult);
                onBuilt();
                return userPublicProfileResult;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearField, reason: merged with bridge method [inline-methods] */
            public Builder m133clearField(r.g gVar) {
                return (Builder) super.m133clearField(gVar);
            }

            @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
            public UserPublicProfileResult getDefaultInstanceForType() {
                return UserPublicProfileResult.getDefaultInstance();
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public Builder setField(r.g gVar, Object obj) {
                return (Builder) super.setField(gVar, obj);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
            public Builder m142setRepeatedField(r.g gVar, int i10, Object obj) {
                return (Builder) super.m142setRepeatedField(gVar, i10, obj);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.i1.a
            public final Builder setUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.setUnknownFields(t2Var);
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m135clearOneof(r.l lVar) {
                return (Builder) super.m135clearOneof(lVar);
            }

            @Override // com.google.protobuf.k0.b, com.google.protobuf.a.AbstractC0131a
            /* JADX INFO: renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
            public final Builder m141mergeUnknownFields(com.google.protobuf.t2 t2Var) {
                return (Builder) super.m141mergeUnknownFields(t2Var);
            }

            private Builder(k0.c cVar) {
                super(cVar);
                this.profileCase_ = 0;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1139clear() {
                super.m132clear();
                this.bitField0_ = 0;
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var != null) {
                    k2Var.c();
                }
                this.profileCase_ = 0;
                this.profile_ = null;
                return this;
            }

            @Override // com.google.protobuf.k0.b
            /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public Builder m1147clone() {
                return (Builder) super.m140clone();
            }

            @Override // com.google.protobuf.i1.a
            public Builder mergeFrom(com.google.protobuf.i1 i1Var) {
                if (i1Var instanceof UserPublicProfileResult) {
                    return mergeFrom((UserPublicProfileResult) i1Var);
                }
                super.mergeFrom(i1Var);
                return this;
            }

            public Builder setData(UserPublicProfile.Builder builder) {
                com.google.protobuf.k2 k2Var = this.dataBuilder_;
                if (k2Var == null) {
                    this.profile_ = builder.build();
                    onChanged();
                } else {
                    k2Var.j(builder.build());
                }
                this.profileCase_ = 2;
                return this;
            }

            public Builder mergeFrom(UserPublicProfileResult userPublicProfileResult) {
                if (userPublicProfileResult == UserPublicProfileResult.getDefaultInstance()) {
                    return this;
                }
                int iOrdinal = userPublicProfileResult.getProfileCase().ordinal();
                if (iOrdinal == 0) {
                    setStatusValue(userPublicProfileResult.getStatusValue());
                } else if (iOrdinal == 1) {
                    mergeData(userPublicProfileResult.getData());
                }
                m141mergeUnknownFields(userPublicProfileResult.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.a.AbstractC0131a, com.google.protobuf.l1.a
            public Builder mergeFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
                yVar.getClass();
                boolean z10 = false;
                while (!z10) {
                    try {
                        try {
                            int iK = mVar.K();
                            if (iK != 0) {
                                if (iK == 8) {
                                    int iT = mVar.t();
                                    this.profileCase_ = 1;
                                    this.profile_ = Integer.valueOf(iT);
                                } else if (iK != 18) {
                                    if (!super.parseUnknownField(mVar, yVar, iK)) {
                                    }
                                } else {
                                    mVar.B(getDataFieldBuilder().e(), yVar);
                                    this.profileCase_ = 2;
                                }
                            }
                            z10 = true;
                        } catch (com.google.protobuf.p0 e10) {
                            throw e10.n();
                        }
                    } catch (Throwable th2) {
                        onChanged();
                        throw th2;
                    }
                }
                onChanged();
                return this;
            }
        }

        private UserPublicProfileResult(k0.b bVar) {
            super(bVar);
            this.profileCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder(UserPublicProfileResult userPublicProfileResult) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(userPublicProfileResult);
        }

        public static UserPublicProfileResult parseFrom(ByteBuffer byteBuffer, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserPublicProfileResult) PARSER.parseFrom(byteBuffer, yVar);
        }

        public static UserPublicProfileResult parseDelimitedFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UserPublicProfileResult) com.google.protobuf.k0.parseDelimitedWithIOException(PARSER, inputStream, yVar);
        }

        public static UserPublicProfileResult parseFrom(com.google.protobuf.l lVar) throws com.google.protobuf.p0 {
            return (UserPublicProfileResult) PARSER.parseFrom(lVar);
        }

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        public UserPublicProfileResult getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder toBuilder() {
            return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
        }

        public static UserPublicProfileResult parseFrom(com.google.protobuf.l lVar, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserPublicProfileResult) PARSER.parseFrom(lVar, yVar);
        }

        @Override // com.google.protobuf.l1, com.google.protobuf.i1
        public Builder newBuilderForType() {
            return newBuilder();
        }

        private UserPublicProfileResult() {
            this.profileCase_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UserPublicProfileResult parseFrom(byte[] bArr) throws com.google.protobuf.p0 {
            return (UserPublicProfileResult) PARSER.parseFrom(bArr);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.k0
        public Builder newBuilderForType(k0.c cVar) {
            return new Builder(cVar);
        }

        public static UserPublicProfileResult parseFrom(byte[] bArr, com.google.protobuf.y yVar) throws com.google.protobuf.p0 {
            return (UserPublicProfileResult) PARSER.parseFrom(bArr, yVar);
        }

        public static UserPublicProfileResult parseFrom(InputStream inputStream) throws IOException {
            return (UserPublicProfileResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream);
        }

        public static UserPublicProfileResult parseFrom(InputStream inputStream, com.google.protobuf.y yVar) throws IOException {
            return (UserPublicProfileResult) com.google.protobuf.k0.parseWithIOException(PARSER, inputStream, yVar);
        }

        public static UserPublicProfileResult parseFrom(com.google.protobuf.m mVar) throws IOException {
            return (UserPublicProfileResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar);
        }

        public static UserPublicProfileResult parseFrom(com.google.protobuf.m mVar, com.google.protobuf.y yVar) throws IOException {
            return (UserPublicProfileResult) com.google.protobuf.k0.parseWithIOException(PARSER, mVar, yVar);
        }
    }

    public interface UserPublicProfileResultOrBuilder extends com.google.protobuf.o1 {
        /* synthetic */ List findInitializationErrors();

        @Override // com.google.protobuf.o1
        /* synthetic */ Map getAllFields();

        UserPublicProfile getData();

        UserPublicProfileOrBuilder getDataOrBuilder();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.i1 getDefaultInstanceForType();

        @Override // com.google.protobuf.m1, com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* bridge */ /* synthetic */ com.google.protobuf.l1 getDefaultInstanceForType();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ r.b getDescriptorForType();

        @Override // com.google.protobuf.o1
        /* synthetic */ Object getField(r.g gVar);

        /* synthetic */ String getInitializationErrorString();

        /* synthetic */ r.g getOneofFieldDescriptor(r.l lVar);

        UserPublicProfileResult.ProfileCase getProfileCase();

        /* synthetic */ Object getRepeatedField(r.g gVar, int i10);

        /* synthetic */ int getRepeatedFieldCount(r.g gVar);

        UserPublicProfileResult.Status getStatus();

        int getStatusValue();

        @Override // com.google.protobuf.o1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ com.google.protobuf.t2 getUnknownFields();

        boolean hasData();

        @Override // com.google.protobuf.o1
        /* synthetic */ boolean hasField(r.g gVar);

        /* synthetic */ boolean hasOneof(r.l lVar);

        boolean hasStatus();

        @Override // com.google.protobuf.m1, com.benshikj.ht.rpc.App.CheckUpdateRequestOrBuilder
        /* synthetic */ boolean isInitialized();
    }

    static {
        r.b bVar = (r.b) getDescriptor().l().get(0);
        internal_static_benshikj_UserPublicProfile_descriptor = bVar;
        internal_static_benshikj_UserPublicProfile_fieldAccessorTable = new k0.f(bVar, new String[]{"Uid", "Username", "Nickname", "Photo", "UpdateAt"});
        r.b bVar2 = (r.b) getDescriptor().l().get(1);
        internal_static_benshikj_DeviceInformation_descriptor = bVar2;
        internal_static_benshikj_DeviceInformation_fieldAccessorTable = new k0.f(bVar2, new String[]{"Did"});
        r.b bVar3 = (r.b) getDescriptor().l().get(2);
        internal_static_benshikj_UserPublicProfileRequest_descriptor = bVar3;
        internal_static_benshikj_UserPublicProfileRequest_fieldAccessorTable = new k0.f(bVar3, new String[]{"Uid", "SyncAt"});
        r.b bVar4 = (r.b) getDescriptor().l().get(3);
        internal_static_benshikj_UserPublicProfileResult_descriptor = bVar4;
        internal_static_benshikj_UserPublicProfileResult_fieldAccessorTable = new k0.f(bVar4, new String[]{"Status", "Data", "Profile"});
        r.b bVar5 = (r.b) getDescriptor().l().get(4);
        internal_static_benshikj_OpenIDLoginRequest_descriptor = bVar5;
        internal_static_benshikj_OpenIDLoginRequest_fieldAccessorTable = new k0.f(bVar5, new String[]{"Type", "OpenID", "AccessToken", "Nickname"});
        r.b bVar6 = (r.b) getDescriptor().l().get(5);
        internal_static_benshikj_LoginRequest_descriptor = bVar6;
        internal_static_benshikj_LoginRequest_fieldAccessorTable = new k0.f(bVar6, new String[]{"UsernameOrEmail", "Password"});
        r.b bVar7 = (r.b) getDescriptor().l().get(6);
        internal_static_benshikj_LoginResult_descriptor = bVar7;
        internal_static_benshikj_LoginResult_fieldAccessorTable = new k0.f(bVar7, new String[]{"AccessToken", "AccessTokenExpires", "RefreshToken", "RefreshTokenExpires", "Code"});
        r.b bVar8 = (r.b) getDescriptor().l().get(7);
        internal_static_benshikj_LoadProfileRequest_descriptor = bVar8;
        internal_static_benshikj_LoadProfileRequest_fieldAccessorTable = new k0.f(bVar8, new String[]{"LoadPhoto", "SyncAt"});
        r.b bVar9 = (r.b) getDescriptor().l().get(8);
        internal_static_benshikj_UserProfile_descriptor = bVar9;
        internal_static_benshikj_UserProfile_fieldAccessorTable = new k0.f(bVar9, new String[]{"Uid", "Username", "Nickname", "Email", "Photo", "UpdateAt"});
        r.b bVar10 = (r.b) getDescriptor().l().get(9);
        internal_static_benshikj_LoadProfileResult_descriptor = bVar10;
        internal_static_benshikj_LoadProfileResult_fieldAccessorTable = new k0.f(bVar10, new String[]{"Status", "Data", "Profile"});
        r.b bVar11 = (r.b) getDescriptor().l().get(10);
        internal_static_benshikj_UpdateProfileRequest_descriptor = bVar11;
        internal_static_benshikj_UpdateProfileRequest_fieldAccessorTable = new k0.f(bVar11, new String[]{"Data", "Update"});
        r.b bVar12 = (r.b) bVar11.m().get(0);
        internal_static_benshikj_UpdateProfileRequest_Update_descriptor = bVar12;
        internal_static_benshikj_UpdateProfileRequest_Update_fieldAccessorTable = new k0.f(bVar12, new String[]{"Nickname", "Photo"});
        r.b bVar13 = (r.b) getDescriptor().l().get(11);
        internal_static_benshikj_UpdateProfileResult_descriptor = bVar13;
        internal_static_benshikj_UpdateProfileResult_fieldAccessorTable = new k0.f(bVar13, new String[0]);
        r.b bVar14 = (r.b) getDescriptor().l().get(12);
        internal_static_benshikj_SetUserPhotoRequest_descriptor = bVar14;
        internal_static_benshikj_SetUserPhotoRequest_fieldAccessorTable = new k0.f(bVar14, new String[]{"Photo"});
        r.b bVar15 = (r.b) getDescriptor().l().get(13);
        internal_static_benshikj_GetUserPhotoRequest_descriptor = bVar15;
        internal_static_benshikj_GetUserPhotoRequest_fieldAccessorTable = new k0.f(bVar15, new String[]{"SyncAt"});
        r.b bVar16 = (r.b) getDescriptor().l().get(14);
        internal_static_benshikj_GetUserPhotoResult_descriptor = bVar16;
        internal_static_benshikj_GetUserPhotoResult_fieldAccessorTable = new k0.f(bVar16, new String[]{"Photo"});
        r.b bVar17 = (r.b) getDescriptor().l().get(15);
        internal_static_benshikj_LogoutResult_descriptor = bVar17;
        internal_static_benshikj_LogoutResult_fieldAccessorTable = new k0.f(bVar17, new String[]{"Code"});
        r.b bVar18 = (r.b) getDescriptor().l().get(16);
        internal_static_benshikj_LogoutRequest_descriptor = bVar18;
        internal_static_benshikj_LogoutRequest_fieldAccessorTable = new k0.f(bVar18, new String[]{"AccessToken", "RefreshToken"});
        r.b bVar19 = (r.b) getDescriptor().l().get(17);
        internal_static_benshikj_FreshAccessTokenRequest_descriptor = bVar19;
        internal_static_benshikj_FreshAccessTokenRequest_fieldAccessorTable = new k0.f(bVar19, new String[]{"AccessToken", "RefreshToken"});
        r.b bVar20 = (r.b) getDescriptor().l().get(18);
        internal_static_benshikj_FreshAccessTokenResult_descriptor = bVar20;
        internal_static_benshikj_FreshAccessTokenResult_fieldAccessorTable = new k0.f(bVar20, new String[]{"AccessToken", "AccessTokenExpires", "RefreshToken", "RefreshTokenExpires", "Code"});
        r.b bVar21 = (r.b) getDescriptor().l().get(19);
        internal_static_benshikj_GetUserIDsRequest_descriptor = bVar21;
        internal_static_benshikj_GetUserIDsRequest_fieldAccessorTable = new k0.f(bVar21, new String[]{"Offset", "Limit"});
        r.b bVar22 = (r.b) getDescriptor().l().get(20);
        internal_static_benshikj_GetUserIDsResult_descriptor = bVar22;
        internal_static_benshikj_GetUserIDsResult_fieldAccessorTable = new k0.f(bVar22, new String[]{"UserIDs"});
        r.b bVar23 = (r.b) getDescriptor().l().get(21);
        internal_static_benshikj_DeleteUserRequest_descriptor = bVar23;
        internal_static_benshikj_DeleteUserRequest_fieldAccessorTable = new k0.f(bVar23, new String[]{"UserIDs"});
        r.b bVar24 = (r.b) getDescriptor().l().get(22);
        internal_static_benshikj_DeleteUserResult_descriptor = bVar24;
        internal_static_benshikj_DeleteUserResult_fieldAccessorTable = new k0.f(bVar24, new String[0]);
        r.b bVar25 = (r.b) getDescriptor().l().get(23);
        internal_static_benshikj_GetStatusRequest_descriptor = bVar25;
        internal_static_benshikj_GetStatusRequest_fieldAccessorTable = new k0.f(bVar25, new String[0]);
        r.b bVar26 = (r.b) getDescriptor().l().get(24);
        internal_static_benshikj_GetStatusResult_descriptor = bVar26;
        internal_static_benshikj_GetStatusResult_fieldAccessorTable = new k0.f(bVar26, new String[]{"UserCount"});
        r.b bVar27 = (r.b) getDescriptor().l().get(25);
        internal_static_benshikj_DoActionForUsersRequest_descriptor = bVar27;
        internal_static_benshikj_DoActionForUsersRequest_fieldAccessorTable = new k0.f(bVar27, new String[]{"Actions", "UserIDs"});
        r.b bVar28 = (r.b) getDescriptor().l().get(26);
        internal_static_benshikj_DoActionForUsersResult_descriptor = bVar28;
        internal_static_benshikj_DoActionForUsersResult_fieldAccessorTable = new k0.f(bVar28, new String[0]);
        r.b bVar29 = (r.b) getDescriptor().l().get(27);
        internal_static_benshikj_UserInfo_descriptor = bVar29;
        internal_static_benshikj_UserInfo_fieldAccessorTable = new k0.f(bVar29, new String[]{"Uid", "Username", "Nickname"});
        r.b bVar30 = (r.b) getDescriptor().l().get(28);
        internal_static_benshikj_GetUserInfosRequest_descriptor = bVar30;
        internal_static_benshikj_GetUserInfosRequest_fieldAccessorTable = new k0.f(bVar30, new String[]{"QueryText", "Offset", "Limit"});
        r.b bVar31 = (r.b) getDescriptor().l().get(29);
        internal_static_benshikj_GetUserInfosResult_descriptor = bVar31;
        internal_static_benshikj_GetUserInfosResult_fieldAccessorTable = new k0.f(bVar31, new String[]{"Users"});
        r.b bVar32 = (r.b) getDescriptor().l().get(30);
        internal_static_benshikj_GetPushMessageRequest_descriptor = bVar32;
        internal_static_benshikj_GetPushMessageRequest_fieldAccessorTable = new k0.f(bVar32, new String[]{"MessageID", "Limit"});
        r.b bVar33 = (r.b) getDescriptor().l().get(31);
        internal_static_benshikj_PushMessage_descriptor = bVar33;
        internal_static_benshikj_PushMessage_fieldAccessorTable = new k0.f(bVar33, new String[]{"MessageID", "Title", "Message"});
        r.b bVar34 = (r.b) getDescriptor().l().get(32);
        internal_static_benshikj_GetPushMessageResult_descriptor = bVar34;
        internal_static_benshikj_GetPushMessageResult_fieldAccessorTable = new k0.f(bVar34, new String[]{"Messages"});
    }

    private Um() {
    }

    public static r.h getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(com.google.protobuf.y yVar) {
    }

    public static void registerAllExtensions(com.google.protobuf.w wVar) {
        registerAllExtensions((com.google.protobuf.y) wVar);
    }
}
