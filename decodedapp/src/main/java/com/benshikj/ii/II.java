package com.benshikj.ii;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.benshikj.ht.rpc.IHTGrpc;
import com.benshikj.ht.rpc.IMGrpc;
import com.benshikj.ht.rpc.Im;
import com.benshikj.ht.rpc.UserGrpc;
import com.benshikj.ii.II;
import com.benshikj.ii.IIException;
import com.dw.grpc.Error;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import qb.b;
import qb.q;
import qb.v0;
import qb.w0;
import qb.z0;

/* JADX INFO: loaded from: classes.dex */
public class II {

    /* JADX INFO: renamed from: a */
    private boolean f4998a;
    public final Configuration config;

    /* JADX INFO: renamed from: e */
    private long f5002e;

    /* JADX INFO: renamed from: d */
    private boolean f5001d = true;

    /* JADX INFO: renamed from: b */
    private final Handler f4999b = new Handler(Looper.getMainLooper());
    public final RPC RPC = new RPC();
    public final LinkManager linkManager = new LinkManager();
    public final ChannelManager channelManager = new ChannelManager();

    /* JADX INFO: renamed from: c */
    private final b f5000c = new b();

    public class ChannelManager {

        /* JADX INFO: renamed from: a */
        private ConcurrentHashMap f5003a;

        /* JADX INFO: renamed from: b */
        private boolean f5004b;

        /* JADX INFO: renamed from: c */
        private final Object f5005c;

        /* JADX INFO: renamed from: d */
        boolean f5006d;

        class a extends c {
            a() {
                super(II.this);
            }

            public static /* synthetic */ void a(a aVar) {
                if (ChannelManager.this.f5004b) {
                    return;
                }
                ChannelManager.this.reload();
            }

            @Override // com.benshikj.ii.II.c, io.grpc.stub.j
            /* JADX INFO: renamed from: b */
            public void onNext(Im.GetUserChannelsResult getUserChannelsResult) {
                IILink iILinkFind;
                if (Configuration.inAndroid && Configuration.DEBUG) {
                    Log.d("ChannelManager", String.format("加载%d信道从服务器，%d信道在缓存", Integer.valueOf(getUserChannelsResult.getChannelsCount()), Integer.valueOf(ChannelManager.this.f5003a.size())));
                }
                ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                for (Im.UserChannel userChannel : getUserChannelsResult.getChannelsList()) {
                    concurrentHashMap.put(Long.valueOf(userChannel.getChannelId()), userChannel);
                }
                ConcurrentHashMap concurrentHashMap2 = ChannelManager.this.f5003a;
                ChannelManager.this.f5003a = concurrentHashMap;
                ChannelManager.this.f5004b = true;
                synchronized (ChannelManager.this.f5005c) {
                    ChannelManager channelManager = ChannelManager.this;
                    channelManager.f5006d = false;
                    channelManager.f5005c.notifyAll();
                }
                if (II.this.f4998a) {
                    return;
                }
                for (Im.UserChannel userChannel2 : getUserChannelsResult.getChannelsList()) {
                    Im.UserChannel userChannel3 = (Im.UserChannel) concurrentHashMap2.get(Long.valueOf(userChannel2.getChannelId()));
                    if (userChannel3 == null) {
                        IILink link = II.this.linkManager.getLink(userChannel2.getChannelId());
                        if (link != null && link.getAutoConnect()) {
                            link.connect();
                        }
                    } else if (!userChannel2.equals(userChannel3) && (iILinkFind = II.this.linkManager.find(userChannel3.getChannelId())) != null && iILinkFind.getConnected()) {
                        iILinkFind.disconnect();
                        iILinkFind.connect();
                    }
                }
                for (Im.UserChannel userChannel4 : concurrentHashMap2.values()) {
                    if (concurrentHashMap.get(Long.valueOf(userChannel4.getChannelId())) == null) {
                        LinkManager linkManager = II.this.linkManager;
                        linkManager.d(linkManager.getLink(userChannel4.getChannelId()));
                    }
                }
                if (II.this.f4998a) {
                    return;
                }
                II ii2 = II.this;
                ii2.config.callback.onChannelChanged(ii2);
                if (Configuration.inAndroid && Configuration.DEBUG) {
                    Log.d("ChannelManager", "从网络加载行道完成");
                }
            }

            @Override // com.benshikj.ii.II.c, io.grpc.stub.j
            public void onCompleted() {
                ChannelManager.this.f5006d = false;
                super.onCompleted();
                if (Configuration.inAndroid && Configuration.DEBUG) {
                    Log.d("ChannelManager", "onError");
                }
            }

            @Override // com.benshikj.ii.II.c, io.grpc.stub.j
            public void onError(Throwable th2) {
                ChannelManager.this.f5006d = false;
                super.onError(th2);
                if (Configuration.inAndroid && Configuration.DEBUG) {
                    Log.d("ChannelManager", "onError");
                }
                if (ChannelManager.this.f5004b) {
                    return;
                }
                Long l10 = 10000L;
                Error.Info exception = GRPC.parseException(th2);
                if (exception != null && exception.getCode() != Error.Code.Unauthenticated) {
                    l10 = null;
                }
                if (l10 != null) {
                    II.this.f4999b.postDelayed(new Runnable() { // from class: com.benshikj.ii.c
                        @Override // java.lang.Runnable
                        public final void run() {
                            II.ChannelManager.a.a(this.f5076a);
                        }
                    }, l10.longValue());
                }
            }
        }

        class b extends c {

            /* JADX INFO: renamed from: c */
            final /* synthetic */ long f5009c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j10) {
                super(II.this);
                this.f5009c = j10;
            }

            @Override // com.benshikj.ii.II.c, io.grpc.stub.j
            /* JADX INFO: renamed from: a */
            public void onNext(Im.QuitChannelResult quitChannelResult) {
                ChannelManager.this.g(this.f5009c);
            }
        }

        class c extends c {

            /* JADX INFO: renamed from: c */
            final /* synthetic */ long f5011c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(Observer observer, long j10) {
                super(observer);
                this.f5011c = j10;
            }

            @Override // com.benshikj.ii.II.c, io.grpc.stub.j
            public void onCompleted() {
                ChannelManager.this.g(this.f5011c);
                super.onCompleted();
            }
        }

        class d extends c {

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Im.UserChannel f5013c;

            /* JADX INFO: renamed from: d */
            final /* synthetic */ int f5014d;

            /* JADX INFO: renamed from: e */
            final /* synthetic */ long f5015e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(Observer observer, Im.UserChannel userChannel, int i10, long j10) {
                super(observer);
                this.f5013c = userChannel;
                this.f5014d = i10;
                this.f5015e = j10;
            }

            @Override // com.benshikj.ii.II.c, io.grpc.stub.j
            public void onCompleted() {
                ChannelManager.this.f5003a.put(Long.valueOf(this.f5015e), Im.UserChannel.newBuilder(this.f5013c).setAuth(Im.ChannelMemberAuth.newBuilder(this.f5013c.getAuth()).setMiniSpeakLevel(this.f5014d).build()).build());
                super.onCompleted();
            }
        }

        class e extends c {

            /* JADX INFO: renamed from: c */
            final /* synthetic */ Im.SaveChannelRequest f5017c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(Observer observer, Im.SaveChannelRequest saveChannelRequest) {
                super(observer);
                this.f5017c = saveChannelRequest;
            }

            @Override // com.benshikj.ii.II.c, io.grpc.stub.j
            public void onCompleted() {
                Im.ChannelFields channel = this.f5017c.getChannel();
                Im.RfChannelFields rf2 = channel.getRf();
                Im.UserChannel userChannel = ChannelManager.this.get(channel.getChannelID());
                if (channel.getChannelID() == 0 || userChannel == null) {
                    ChannelManager.this.reload();
                } else {
                    ChannelManager.this.f5003a.put(Long.valueOf(channel.getChannelID()), Im.UserChannel.newBuilder(userChannel).setChannelId(channel.getChannelID()).setName(channel.getName()).setAuth(Im.ChannelMemberAuth.newBuilder(userChannel.getAuth()).setMiniSpeakLevel(channel.getMiniSpeakLevel())).setRf(Im.RfChannelFields.newBuilder(userChannel.getRf()).setBandwidth(rf2.getBandwidth()).setRxFreq(rf2.getRxFreq()).setTxFreq(rf2.getTxFreq()).setRxSubAudio(rf2.getRxSubAudio()).setTxSubAudio(rf2.getTxSubAudio())).build());
                }
                super.onCompleted();
            }
        }

        /* synthetic */ ChannelManager(II ii2, j jVar) {
            this();
        }

        public void delete(long j10, Observer observer) {
            II.this.RPC.getIHTStub().deleteChannel(Im.DeleteChannelRequest.newBuilder().setChannelID(j10).build(), new c(observer, j10));
        }

        void f() {
            synchronized (this.f5005c) {
                this.f5005c.notifyAll();
            }
        }

        void g(long j10) {
            if (((Im.UserChannel) this.f5003a.remove(Long.valueOf(j10))) == null) {
                return;
            }
            LinkManager linkManager = II.this.linkManager;
            linkManager.d(linkManager.find(j10));
            II ii2 = II.this;
            ii2.config.callback.onChannelChanged(ii2);
        }

        public Im.UserChannel get(long j10) {
            return (Im.UserChannel) this.f5003a.get(Long.valueOf(j10));
        }

        public ArrayList<Im.UserChannel> getAll() {
            return getAll(false);
        }

        public void quit(long j10) {
            II.this.RPC.getIHTStub().quitChannel(Im.QuitChannelRequest.newBuilder().setChannelID(j10).build(), new b(j10));
        }

        public void reload() {
            if (II.this.f4998a || this.f5006d) {
                return;
            }
            synchronized (this.f5005c) {
                try {
                    if (this.f5006d) {
                        return;
                    }
                    this.f5006d = true;
                    if (Configuration.inAndroid && Configuration.DEBUG) {
                        Log.d("ChannelManager", "start load");
                    }
                    II.this.RPC.getIHTStub().getUserChannels(Im.GetUserChannelsRequest.newBuilder().setLimit(10000).setOffset(0).build(), new a());
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void saveChannel(Im.SaveChannelRequest saveChannelRequest, Observer observer) {
            II.this.RPC.getIHTStub().saveChannel(saveChannelRequest, new e(observer, saveChannelRequest));
        }

        public void setSpeakLevel(long j10, int i10, Observer observer) {
            Im.UserChannel userChannel = get(j10);
            if (userChannel == null) {
                if (observer != null) {
                    observer.onError(new RuntimeException("通过信道ID没有找到对应信道，可能信道还没有加载完成或用户不属于此信道"));
                }
            } else if (userChannel.getOwnUserId() != II.this.config.userID) {
                if (observer != null) {
                    observer.onError(new RuntimeException("只有台长可以修改发言级别"));
                }
            } else if (userChannel.getAuth().getMiniSpeakLevel() != i10) {
                II.this.RPC.getIHTStub().setChannelSpeakLevel(Im.SetChannelSpeakLevelRequest.newBuilder().setChannelId((int) j10).setMiniSpeakLevel(i10).build(), new d(observer, userChannel, i10, j10));
            } else if (observer != null) {
                observer.onCompleted();
            }
        }

        private ChannelManager() {
            this.f5005c = new Object();
            this.f5006d = false;
            this.f5003a = new ConcurrentHashMap();
            reload();
        }

        public ArrayList<Im.UserChannel> getAll(boolean z10) {
            if (z10 && !this.f5004b) {
                synchronized (this.f5005c) {
                    try {
                        this.f5005c.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
            return new ArrayList<>(this.f5003a.values());
        }
    }

    public class LinkManager {

        /* JADX INFO: renamed from: a */
        private final ConcurrentHashMap f5019a;

        /* JADX INFO: renamed from: b */
        private final Object f5020b;

        /* JADX INFO: renamed from: c */
        private IILink f5021c;

        /* synthetic */ LinkManager(II ii2, j jVar) {
            this();
        }

        public void c() {
            Iterator<IILink> it = getAllLinks().iterator();
            while (it.hasNext()) {
                d(it.next());
            }
        }

        public void e(boolean z10) {
            Iterator<IILink> it = getAllLinks().iterator();
            while (it.hasNext()) {
                it.next().i(z10);
            }
        }

        void d(IILink iILink) {
            if (iILink == null) {
                return;
            }
            this.f5019a.remove(Long.valueOf(iILink.channelID));
            iILink.destroy();
            if (this.f5021c == iILink) {
                this.f5021c = null;
            }
        }

        public IILink find(long j10) {
            return (IILink) this.f5019a.get(Long.valueOf(j10));
        }

        public Collection<IILink> getAllLinks() {
            return this.f5019a.values();
        }

        public IILink getCurrent() {
            IILink iILink = this.f5021c;
            if (iILink != null) {
                return iILink;
            }
            for (IILink iILink2 : getAllLinks()) {
                if (iILink2.getConnected()) {
                    return iILink2;
                }
            }
            return null;
        }

        public IILink getLink(long j10) {
            if (II.this.f4998a) {
                return null;
            }
            IILink iILink = (IILink) this.f5019a.get(Long.valueOf(j10));
            if (iILink != null) {
                return iILink;
            }
            synchronized (this.f5020b) {
                try {
                    IILink iILink2 = (IILink) this.f5019a.get(Long.valueOf(j10));
                    if (iILink2 != null) {
                        return iILink2;
                    }
                    II ii2 = II.this;
                    IILink iILinkCreateLink = ii2.config.callback.createLink(ii2, j10);
                    if (iILinkCreateLink == null) {
                        return null;
                    }
                    this.f5019a.put(Long.valueOf(j10), iILinkCreateLink);
                    II ii3 = II.this;
                    ii3.config.callback.onLinkCreated(ii3, iILinkCreateLink);
                    return iILinkCreateLink;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void setCurrent(IILink iILink) {
            if (iILink == this.f5021c) {
                return;
            }
            this.f5021c = iILink;
            II ii2 = II.this;
            ii2.config.callback.onCurrentLinkChanged(ii2, iILink);
        }

        private LinkManager() {
            this.f5019a = new ConcurrentHashMap();
            this.f5020b = new Object();
        }
    }

    public class RPC {

        /* JADX INFO: renamed from: a */
        private boolean f5023a;

        /* JADX INFO: renamed from: b */
        private v0 f5024b;

        /* JADX INFO: renamed from: c */
        String f5025c;

        /* JADX INFO: renamed from: d */
        private v0 f5026d;

        /* JADX INFO: renamed from: e */
        private IMGrpc.IMStub f5027e;

        /* JADX INFO: renamed from: f */
        private IHTGrpc.IHTBlockingStub f5028f;

        /* JADX INFO: renamed from: g */
        private IHTGrpc.IHTStub f5029g;

        /* JADX INFO: renamed from: h */
        private UserGrpc.UserStub f5030h;

        /* JADX INFO: renamed from: i */
        private UserGrpc.UserBlockingStub f5031i;

        /* JADX INFO: renamed from: j */
        private final qb.b f5032j;

        class a implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ v0 f5034a;

            a(v0 v0Var) {
                this.f5034a = v0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                q qVarI = this.f5034a.i(false);
                if (Configuration.inAndroid && Configuration.DEBUG) {
                    Log.d("RPC", "iiChannel state:" + qVarI);
                }
                this.f5034a.j(qVarI, this);
            }
        }

        class b implements Runnable {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ v0 f5036a;

            b(v0 v0Var) {
                this.f5036a = v0Var;
            }

            @Override // java.lang.Runnable
            public void run() {
                q qVarI = this.f5036a.i(false);
                if (Configuration.inAndroid && Configuration.DEBUG) {
                    Log.d("RPC", "imChannel state:" + qVarI);
                }
                this.f5036a.j(qVarI, this);
            }
        }

        class c extends qb.b {

            /* JADX INFO: renamed from: a */
            private final z0.h f5038a;

            /* JADX INFO: renamed from: b */
            private final z0.h f5039b;

            /* JADX INFO: renamed from: c */
            private final z0.h f5040c;

            /* JADX INFO: renamed from: d */
            private final z0.h f5041d;

            c() {
                z0.d dVar = z0.f24834e;
                this.f5038a = z0.h.e("hl", dVar);
                this.f5039b = z0.h.e("access_token", dVar);
                this.f5040c = z0.h.e("user_agent", dVar);
                this.f5041d = z0.h.e("bearer", dVar);
            }

            public static /* synthetic */ void b(c cVar, b.a aVar) {
                cVar.getClass();
                Locale locale = Locale.getDefault();
                String str = locale.getLanguage() + "-" + locale.getCountry();
                z0 z0Var = new z0();
                z0Var.o(cVar.f5038a, str);
                String str2 = II.this.config.f4981b;
                if (str2 != null) {
                    z0Var.o(cVar.f5041d, str2);
                }
                String str3 = II.this.config.f4982c;
                if (str3 != null) {
                    z0Var.o(cVar.f5039b, str3);
                }
                String str4 = II.this.config.f4983d;
                if (str4 != null) {
                    z0Var.o(cVar.f5040c, str4);
                }
                II.this.config.callback.applyRequestMetadata(z0Var);
                aVar.a(z0Var);
            }

            @Override // qb.b
            public void a(b.AbstractC0337b abstractC0337b, Executor executor, final b.a aVar) {
                executor.execute(new Runnable() { // from class: com.benshikj.ii.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        II.RPC.c.b(this.f5082a, aVar);
                    }
                });
            }
        }

        /* synthetic */ RPC(II ii2, j jVar) {
            this();
        }

        private void b() {
            if (this.f5023a) {
                throw new IllegalStateException("对象已经销毁");
            }
        }

        public void c() {
            this.f5023a = true;
            v0 v0Var = this.f5026d;
            if (v0Var != null) {
                v0Var.l();
            }
            v0 v0Var2 = this.f5024b;
            if (v0Var2 != null && v0Var2 != II.this.config.f4980a) {
                v0Var2.l();
            }
            this.f5026d = null;
            this.f5024b = null;
        }

        private synchronized v0 d() {
            w0 w0VarB;
            try {
                v0 v0Var = this.f5024b;
                if (v0Var != null) {
                    return v0Var;
                }
                if (Configuration.inAndroid && Configuration.DEBUG) {
                    Log.d("RPC", "iiUrl:" + II.this.config.url);
                }
                Configuration configuration = II.this.config;
                if (configuration.certificates != null) {
                    rb.g gVarJ = rb.g.j(configuration.url);
                    Configuration configuration2 = II.this.config;
                    w0VarB = gVarJ.n(SSLUtils.createSSLSocketFactory(configuration2.certificates, configuration2.trustSystemCertificate));
                } else {
                    w0VarB = w0.b(configuration.url);
                }
                if (a6.q.f(II.this.config.authority, "null")) {
                    w0VarB.e();
                } else {
                    String str = II.this.config.authority;
                    if (str != null && !str.isEmpty()) {
                        if (Configuration.inAndroid) {
                            Log.d("RPC", "overrideAuthority:" + II.this.config.authority);
                        }
                        w0VarB.d(II.this.config.authority);
                    }
                }
                Objects.requireNonNull(II.this.config);
                w0VarB.c(2147483647L, TimeUnit.SECONDS);
                v0 v0VarA = w0VarB.a();
                v0VarA.j(v0VarA.i(false), new a(v0VarA));
                this.f5024b = v0VarA;
                return v0VarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        void e(boolean z10) {
            if (z10) {
                v0 v0Var = this.f5024b;
                if (v0Var != null) {
                    v0Var.k();
                }
                v0 v0Var2 = this.f5026d;
                if (v0Var2 != null) {
                    v0Var2.k();
                }
            }
        }

        synchronized void f(String str) {
            if (a6.q.f(this.f5025c, str)) {
                return;
            }
            this.f5025c = str;
            v0 v0Var = this.f5026d;
            if (v0Var != null) {
                v0Var.l();
                this.f5026d = null;
                this.f5027e = null;
            }
        }

        public synchronized IHTGrpc.IHTBlockingStub getIHTBlockingStub() {
            b();
            IHTGrpc.IHTBlockingStub iHTBlockingStub = this.f5028f;
            if (iHTBlockingStub != null) {
                return iHTBlockingStub;
            }
            IHTGrpc.IHTBlockingStub iHTBlockingStub2 = (IHTGrpc.IHTBlockingStub) IHTGrpc.newBlockingStub(d()).withCallCredentials(this.f5032j);
            this.f5028f = iHTBlockingStub2;
            return iHTBlockingStub2;
        }

        public synchronized IHTGrpc.IHTStub getIHTStub() {
            b();
            IHTGrpc.IHTStub iHTStub = this.f5029g;
            if (iHTStub != null) {
                return iHTStub;
            }
            IHTGrpc.IHTStub iHTStub2 = (IHTGrpc.IHTStub) IHTGrpc.newStub(d()).withCallCredentials(this.f5032j);
            this.f5029g = iHTStub2;
            return iHTStub2;
        }

        public synchronized v0 getIMChannel() {
            w0 w0VarB;
            b();
            v0 v0Var = this.f5026d;
            if (v0Var != null) {
                return v0Var;
            }
            if (a6.q.f(this.f5025c, II.this.config.url)) {
                return d();
            }
            if (this.f5025c == null) {
                return null;
            }
            if (Configuration.inAndroid && Configuration.DEBUG) {
                Log.d("RPC", "imChannel:" + this.f5025c);
            }
            if (II.this.config.certificates != null) {
                rb.g gVarJ = rb.g.j(this.f5025c);
                Configuration configuration = II.this.config;
                w0VarB = gVarJ.n(SSLUtils.createSSLSocketFactory(configuration.certificates, configuration.trustSystemCertificate));
            } else {
                w0VarB = w0.b(this.f5025c);
            }
            if (a6.q.f(II.this.config.authority, "null")) {
                w0VarB.e();
            } else {
                String str = II.this.config.authority;
                if (str != null && !str.isEmpty()) {
                    if (Configuration.inAndroid) {
                        Log.d("RPC", "overrideAuthority:" + II.this.config.authority);
                    }
                    w0VarB.d(II.this.config.authority);
                }
            }
            Objects.requireNonNull(II.this.config);
            w0VarB.c(2147483647L, TimeUnit.SECONDS);
            v0 v0VarA = w0VarB.a();
            v0VarA.j(v0VarA.i(false), new b(v0VarA));
            this.f5026d = v0VarA;
            return v0VarA;
        }

        public synchronized IMGrpc.IMStub getIMStub() {
            b();
            IMGrpc.IMStub iMStub = this.f5027e;
            if (iMStub != null) {
                return iMStub;
            }
            v0 iMChannel = getIMChannel();
            if (iMChannel == null) {
                return null;
            }
            IMGrpc.IMStub iMStub2 = (IMGrpc.IMStub) IMGrpc.newStub(iMChannel).withCallCredentials(this.f5032j);
            this.f5027e = iMStub2;
            return iMStub2;
        }

        public synchronized UserGrpc.UserBlockingStub getUserBlockingStub() {
            b();
            UserGrpc.UserBlockingStub userBlockingStub = this.f5031i;
            if (userBlockingStub != null) {
                return userBlockingStub;
            }
            UserGrpc.UserBlockingStub userBlockingStub2 = (UserGrpc.UserBlockingStub) UserGrpc.newBlockingStub(d()).withCallCredentials(this.f5032j);
            this.f5031i = userBlockingStub2;
            return userBlockingStub2;
        }

        public synchronized UserGrpc.UserStub getUserStub() {
            b();
            UserGrpc.UserStub userStub = this.f5030h;
            if (userStub != null) {
                return userStub;
            }
            UserGrpc.UserStub userStub2 = (UserGrpc.UserStub) UserGrpc.newStub(d()).withCallCredentials(this.f5032j);
            this.f5030h = userStub2;
            return userStub2;
        }

        private RPC() {
            this.f5032j = new c();
            this.f5024b = II.this.config.f4980a;
        }
    }

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f5043a;

        static {
            int[] iArr = new int[Im.Message.Type.values().length];
            f5043a = iArr;
            try {
                iArr[Im.Message.Type.Text.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    class b {

        /* JADX INFO: renamed from: a */
        private kc.b f5044a;

        /* JADX INFO: renamed from: c */
        private io.grpc.stub.j f5046c;

        /* JADX INFO: renamed from: b */
        private final Runnable f5045b = new Runnable() { // from class: com.benshikj.ii.h
            @Override // java.lang.Runnable
            public final void run() {
                this.f5081a.h();
            }
        };

        /* JADX INFO: renamed from: d */
        private c f5047d = new a();

        /* JADX INFO: renamed from: e */
        private c f5048e = new C0076b();

        class a extends c {
            a() {
                super(II.this);
            }

            @Override // com.benshikj.ii.II.c, io.grpc.stub.j
            /* JADX INFO: renamed from: a */
            public void onNext(Im.SendMessageResult sendMessageResult) {
                if (Configuration.DEBUG) {
                    Log.d("IMService", "send message " + sendMessageResult);
                }
            }

            @Override // com.benshikj.ii.II.c, io.grpc.stub.j
            public void onCompleted() {
                super.onCompleted();
                if (Configuration.DEBUG) {
                    Log.d("IMService", "send message observer onCompleted");
                }
            }
        }

        /* JADX INFO: renamed from: com.benshikj.ii.II$b$b */
        class C0076b extends c {
            C0076b() {
                super(II.this);
            }

            @Override // com.benshikj.ii.II.c, io.grpc.stub.j
            /* JADX INFO: renamed from: a */
            public void onNext(Im.ReceiveMessageResult receiveMessageResult) {
                b.this.k(receiveMessageResult);
            }

            @Override // com.benshikj.ii.II.c, io.grpc.stub.j
            public void onCompleted() {
                super.onCompleted();
                if (Configuration.DEBUG) {
                    Log.d("IMService", "message observer onCompleted");
                }
                b.this.m(null);
            }

            @Override // com.benshikj.ii.II.c, io.grpc.stub.j
            public void onError(Throwable th2) {
                super.onError(th2);
                if (Configuration.DEBUG) {
                    Log.e("IMService", "message observer err:" + th2.getLocalizedMessage());
                }
                b.this.i(3000L);
                b.this.m(null);
            }
        }

        class c implements mc.d {
            c() {
            }

            @Override // mc.d
            /* JADX INFO: renamed from: a */
            public Object apply(IMGrpc.IMStub iMStub) {
                b bVar = b.this;
                bVar.m(iMStub.receiveMessage(bVar.f5048e));
                return null;
            }
        }

        b() {
            Log.i("IMService", "onCreate");
            h();
        }

        public static /* synthetic */ IMGrpc.IMStub a(b bVar, String str) {
            bVar.getClass();
            if (Configuration.DEBUG) {
                Log.d("IMService", "im uri:" + str);
            }
            II.this.RPC.f(str);
            return II.this.RPC.getIMStub();
        }

        public static /* synthetic */ void c(b bVar, Throwable th2) {
            bVar.f5044a = null;
            Log.d("IMService", "link err", th2);
            bVar.i(3000L);
        }

        public static /* synthetic */ String d(b bVar, b bVar2) {
            bVar.getClass();
            if (Configuration.DEBUG) {
                Log.d("IMService", "get im uri");
            }
            return II.this.RPC.getIHTBlockingStub().getImUrl(Im.GetImUrlRequest.getDefaultInstance()).getUrl();
        }

        public void m(io.grpc.stub.j jVar) {
            io.grpc.stub.j jVar2 = this.f5046c;
            if (jVar2 == jVar) {
                return;
            }
            if (jVar2 != null) {
                jVar2.onCompleted();
            }
            this.f5046c = jVar;
            if (jVar != null) {
                Log.d("IMService", "linked");
            } else {
                Log.d("IMService", "unlinked");
            }
        }

        void g() {
            Log.i("IMService", "onDestroy");
            m(null);
        }

        void h() {
            i(0L);
        }

        void i(long j10) {
            II.this.f4999b.removeCallbacks(this.f5045b);
            if (II.this.f4998a) {
                return;
            }
            if (j10 > 0 || Thread.currentThread() != Looper.getMainLooper().getThread()) {
                II.this.f4999b.postDelayed(this.f5045b, j10);
                return;
            }
            v0 iMChannel = II.this.RPC.getIMChannel();
            if (j()) {
                return;
            }
            if (this.f5044a == null || (iMChannel != null && iMChannel.i(false) == q.TRANSIENT_FAILURE)) {
                kc.b bVar = this.f5044a;
                if (bVar != null) {
                    bVar.dispose();
                }
                this.f5044a = hc.g.c(this).e(zc.a.b()).d(new mc.d() { // from class: com.benshikj.ii.d
                    @Override // mc.d
                    public final Object apply(Object obj) {
                        return II.b.d(this.f5077a, (II.b) obj);
                    }
                }).e(jc.a.a()).d(new mc.d() { // from class: com.benshikj.ii.e
                    @Override // mc.d
                    public final Object apply(Object obj) {
                        return II.b.a(this.f5078a, (String) obj);
                    }
                }).d(new c()).l(jc.a.a()).i(new mc.c() { // from class: com.benshikj.ii.f
                    @Override // mc.c
                    public final void accept(Object obj) {
                        this.f5079a.f5044a = null;
                    }
                }, new mc.c() { // from class: com.benshikj.ii.g
                    @Override // mc.c
                    public final void accept(Object obj) {
                        II.b.c(this.f5080a, (Throwable) obj);
                    }
                });
            }
        }

        boolean j() {
            return this.f5046c != null;
        }

        void k(Im.ReceiveMessageResult receiveMessageResult) {
            if (Configuration.DEBUG) {
                Log.d("IMService", "rx msg: " + receiveMessageResult);
            }
            if (receiveMessageResult.getData().hasUserStatus()) {
                IILink iILinkFind = II.this.linkManager.find(receiveMessageResult.getTarget());
                if (iILinkFind == null) {
                    return;
                }
                Im.UserStatus userStatus = receiveMessageResult.getData().getUserStatus();
                if (userStatus.getOnline()) {
                    iILinkFind.k(userStatus.getUserID());
                } else {
                    iILinkFind.j(userStatus.getUserID());
                }
            }
            if (II.this.config.userID == receiveMessageResult.getSource() && receiveMessageResult.getSourceType() == Im.IdentifyType.UserID) {
                return;
            }
            if (a.f5043a[receiveMessageResult.getData().getType().ordinal()] == 1 && Configuration.DEBUG) {
                Log.d("IMService", "rx text: " + receiveMessageResult.getData().getRaw().toString());
            }
            II.this.config.callback.onMessageReceived(receiveMessageResult);
        }

        public boolean l(Im.SendMessageRequest sendMessageRequest) {
            IMGrpc.IMStub iMStub = II.this.RPC.getIMStub();
            if (iMStub == null) {
                return false;
            }
            iMStub.sendMessage(sendMessageRequest, this.f5047d);
            if (!Configuration.DEBUG) {
                return true;
            }
            Log.d("IMService", "send:" + sendMessageRequest);
            return true;
        }
    }

    public II(Configuration configuration) {
        this.config = configuration;
    }

    synchronized void c() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.f5002e > 60000) {
            this.f5002e = jElapsedRealtime;
            if (this.f5001d) {
                this.config.callback.onError(new IIException(IIException.Error.RPCCoreError, "GRPC核心错误通常需要重新创建 II 对象来恢复"));
            }
        }
    }

    public void destroy() {
        this.f4998a = true;
        this.linkManager.c();
        this.RPC.c();
        this.f5000c.g();
        this.channelManager.f();
    }

    public boolean isDestroyed() {
        return this.f4998a;
    }

    public boolean isLinked() {
        return this.f5000c.j();
    }

    public void onNetworkStatusChanged(boolean z10) {
        this.RPC.e(z10);
        this.linkManager.e(z10);
    }

    public boolean send(Im.SendMessageRequest sendMessageRequest) {
        return this.f5000c.l(sendMessageRequest);
    }

    public void sendHeartbeat() {
        Iterator<IILink> it = this.linkManager.getAllLinks().iterator();
        while (it.hasNext()) {
            it.next().sendHeartbeat();
        }
        this.f5000c.h();
    }

    private class c implements io.grpc.stub.j {

        /* JADX INFO: renamed from: a */
        final Observer f5053a;

        c(Observer observer) {
            this.f5053a = observer;
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
            Observer observer = this.f5053a;
            if (observer != null) {
                observer.onCompleted();
            }
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
            Observer observer = this.f5053a;
            if (observer != null) {
                observer.onError(th2);
            } else {
                II.this.config.callback.onError(th2);
            }
        }

        @Override // io.grpc.stub.j
        public void onNext(Object obj) {
        }

        c(II ii2) {
            this(null);
        }
    }
}
