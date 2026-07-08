package com.benshikj.ii;

import a6.w;
import androidx.appcompat.widget.ActivityChooserView;
import com.auth0.android.jwt.JWT;
import com.benshikj.ht.rpc.Im;
import qb.v0;
import qb.z0;

/* JADX INFO: loaded from: classes.dex */
public class Configuration {
    public static boolean DEBUG = false;
    public static boolean inAndroid = true;
    public final int SAMPLE_RATE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final v0 f4980a;
    public final String authority;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f4981b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final String f4982c;
    public final CallBack callback;
    public final String[] certificates;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final String f4983d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f4984e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f4985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f4986g;
    public final int heartbeatInterval;
    public final boolean trustSystemCertificate;
    public final String url;
    public final long userID;

    public static class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f4987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private v0 f4988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f4989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f4990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f4991e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private String f4992f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private String f4993g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f4994h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private CallBack f4995i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f4996j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private String[] f4997k;

        public Configuration build() throws IllegalArgumentException {
            return new Configuration(this);
        }

        public Builder setAccessToken(String str, long j10) {
            this.f4992f = str;
            this.f4994h = j10;
            return this;
        }

        public Builder setBearer(String str) {
            this.f4990d = str;
            Long lAsLong = Configuration.inAndroid ? new JWT(str).e("uid").asLong() : u1.a.a(str).a("uid").asLong();
            if (lAsLong == null) {
                throw new IllegalArgumentException("必须包含 uid 字段");
            }
            this.f4991e = lAsLong.longValue();
            return this;
        }

        public Builder setCallBack(CallBack callBack) {
            this.f4995i = callBack;
            return this;
        }

        public Builder setCertificates(boolean z10, String... strArr) {
            this.f4996j = z10;
            this.f4997k = strArr;
            return this;
        }

        public Builder setChannel(v0 v0Var) {
            this.f4988b = v0Var;
            return this;
        }

        public Builder setOverrideAuthority(String str) {
            this.f4989c = str;
            return this;
        }

        public Builder setUrl(String str) {
            this.f4987a = str;
            return this;
        }

        public Builder setUserAgent(String str, String str2) {
            this.f4993g = str + "/" + str2;
            return this;
        }
    }

    static class a implements CallBack {
        a() {
        }

        @Override // com.benshikj.ii.CallBack
        public /* synthetic */ void applyRequestMetadata(z0 z0Var) {
            com.benshikj.ii.a.a(this, z0Var);
        }

        @Override // com.benshikj.ii.CallBack
        public /* synthetic */ AudioPlayer createAudioPlayer() {
            return com.benshikj.ii.a.b(this);
        }

        @Override // com.benshikj.ii.CallBack
        public /* synthetic */ IILink createLink(II ii2, long j10) {
            return com.benshikj.ii.a.c(this, ii2, j10);
        }

        @Override // com.benshikj.ii.CallBack
        public /* synthetic */ boolean isCanPlay() {
            return com.benshikj.ii.a.d(this);
        }

        @Override // com.benshikj.ii.CallBack
        public /* synthetic */ void onChannelChanged(II ii2) {
            com.benshikj.ii.a.e(this, ii2);
        }

        @Override // com.benshikj.ii.CallBack
        public /* synthetic */ void onChannelConnectionParmLoaded(long j10, Im.GetChannelConnectionParmResult getChannelConnectionParmResult) {
            com.benshikj.ii.a.f(this, j10, getChannelConnectionParmResult);
        }

        @Override // com.benshikj.ii.CallBack
        public /* synthetic */ void onChannelMembersChanged(IILink iILink) {
            com.benshikj.ii.a.g(this, iILink);
        }

        @Override // com.benshikj.ii.CallBack
        public /* synthetic */ void onCurrentLinkChanged(II ii2, IILink iILink) {
            com.benshikj.ii.a.h(this, ii2, iILink);
        }

        @Override // com.benshikj.ii.CallBack
        public /* synthetic */ void onError(Throwable th2) {
            com.benshikj.ii.a.i(this, th2);
        }

        @Override // com.benshikj.ii.CallBack
        public /* synthetic */ void onLinkCreated(II ii2, IILink iILink) {
            com.benshikj.ii.a.j(this, ii2, iILink);
        }

        @Override // com.benshikj.ii.CallBack
        public /* synthetic */ void onLinkStatusChanged(IILink iILink) {
            com.benshikj.ii.a.k(this, iILink);
        }

        @Override // com.benshikj.ii.CallBack
        public void onMessageReceived(Im.ReceiveMessageResult receiveMessageResult) {
        }

        @Override // com.benshikj.ii.CallBack
        public /* synthetic */ void onOnlineUserChanged(IILink iILink) {
            com.benshikj.ii.a.l(this, iILink);
        }

        @Override // com.benshikj.ii.CallBack
        public /* synthetic */ void onReceiveStatusChanged(ReceiveStatus receiveStatus) {
            com.benshikj.ii.a.m(this, receiveStatus);
        }
    }

    private Configuration(Builder builder) {
        this.heartbeatInterval = 25000;
        this.f4984e = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        this.SAMPLE_RATE = 48000;
        this.f4985f = 960;
        this.f4986g = 32000;
        if (w.b(builder.f4987a) && builder.f4988b == null) {
            throw new IllegalArgumentException("需要配置 url 或 channel");
        }
        if (builder.f4994h == 0 && builder.f4991e == 0) {
            throw new IllegalArgumentException("未设置用户ID");
        }
        if (builder.f4994h != 0 && builder.f4991e != 0 && builder.f4994h != builder.f4991e) {
            throw new IllegalArgumentException("使用 bearer 时设置 userID 是无效的");
        }
        if (w.b(builder.f4990d) && w.b(builder.f4992f)) {
            throw new IllegalArgumentException("需要配置 bearer 或 accessToken");
        }
        this.url = builder.f4987a;
        this.f4980a = builder.f4988b;
        this.authority = builder.f4989c;
        this.f4981b = builder.f4990d;
        this.f4982c = builder.f4992f;
        this.f4983d = builder.f4993g;
        if (builder.f4991e != 0) {
            this.userID = builder.f4991e;
        } else {
            this.userID = builder.f4994h;
        }
        if (builder.f4995i != null) {
            this.callback = builder.f4995i;
        } else {
            this.callback = new a();
        }
        this.trustSystemCertificate = builder.f4996j;
        this.certificates = builder.f4997k;
    }
}
