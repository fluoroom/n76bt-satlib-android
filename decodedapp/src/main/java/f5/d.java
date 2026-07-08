package f5;

import android.os.Handler;
import com.benshikj.ht.rpc.APPGrpc;
import com.benshikj.ht.rpc.DeviceManagementGrpc;
import com.benshikj.ht.rpc.Um;
import com.benshikj.ht.rpc.UserGrpc;
import com.benshikj.ii.SSLUtils;
import com.dw.grpc.Error;
import com.dw.ht.Cfg;
import com.facebook.stetho.websocket.CloseCodes;
import dd.d0;
import f5.d;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import nk.a;
import qb.q;
import qb.v0;
import qd.l;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: d */
    private static kc.b f12795d;

    /* JADX INFO: renamed from: f */
    private static v0 f12797f;

    /* JADX INFO: renamed from: g */
    private static DeviceManagementGrpc.DeviceManagementStub f12798g;

    /* JADX INFO: renamed from: h */
    private static APPGrpc.APPStub f12799h;

    /* JADX INFO: renamed from: i */
    private static a.d f12800i;

    /* JADX INFO: renamed from: j */
    private static UserGrpc.UserBlockingStub f12801j;

    /* JADX INFO: renamed from: a */
    public static final d f12792a = new d();

    /* JADX INFO: renamed from: b */
    private static final int f12793b = 180;

    /* JADX INFO: renamed from: c */
    private static final Handler f12794c = new Handler();

    /* JADX INFO: renamed from: e */
    private static final b f12796e = new b();

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ v0 f12802a;

        a(v0 v0Var) {
            this.f12802a = v0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            q qVarI = this.f12802a.i(false);
            d5.g.s("iiChannel state:" + qVarI);
            s3.b.b("RPC", "iiChannel state:" + qVarI);
            this.f12802a.j(qVarI, this);
        }
    }

    public static final class b implements Runnable {

        /* JADX INFO: renamed from: a */
        private final Um.GetPushMessageRequest f12803a = Um.GetPushMessageRequest.newBuilder().setLimit(0).build();

        b() {
        }

        public static final Um.GetPushMessageResult g(b bVar, Um.GetPushMessageRequest getPushMessageRequest) {
            m.e(getPushMessageRequest, "it");
            return d.f12792a.h().getPushMessage(bVar.f12803a);
        }

        public static final Um.GetPushMessageResult h(l lVar, Object obj) {
            m.e(obj, "p0");
            return (Um.GetPushMessageResult) lVar.l(obj);
        }

        public static final d0 i(b bVar, Um.GetPushMessageResult getPushMessageResult) {
            s3.b.b("RPC", "PushMessage:" + getPushMessageResult);
            d dVar = d.f12792a;
            dVar.e().postDelayed(bVar, (long) (((double) dVar.c()) * (((double) 1) + (Math.random() * 0.2d)) * ((double) CloseCodes.NORMAL_CLOSURE)));
            return d0.f10897a;
        }

        public static final void j(l lVar, Object obj) {
            lVar.l(obj);
        }

        public static final d0 k(b bVar, Throwable th2) {
            if (th2 instanceof TimeoutException) {
                d5.g.s("服务器超时");
                d.f12792a.k();
                return d0.f10897a;
            }
            s3.b.c("RPC", "GetPushMessage", th2);
            d dVar = d.f12792a;
            dVar.e().postDelayed(bVar, (long) (((double) dVar.c()) * (((double) 1) + (Math.random() * 0.2d)) * ((double) CloseCodes.NORMAL_CLOSURE)));
            return d0.f10897a;
        }

        public static final void l(l lVar, Object obj) {
            lVar.l(obj);
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.f12792a;
            kc.b bVarD = dVar.d();
            if (bVarD == null || bVarD.d()) {
                hc.g gVarE = hc.g.c(this.f12803a).e(zc.a.b());
                final l lVar = new l() { // from class: f5.e
                    @Override // qd.l
                    public final Object l(Object obj) {
                        return d.b.g(this.f12804a, (Um.GetPushMessageRequest) obj);
                    }
                };
                hc.g gVarM = gVarE.d(new mc.d() { // from class: f5.f
                    @Override // mc.d
                    public final Object apply(Object obj) {
                        return d.b.h(lVar, obj);
                    }
                }).m(60L, TimeUnit.SECONDS);
                final l lVar2 = new l() { // from class: f5.g
                    @Override // qd.l
                    public final Object l(Object obj) {
                        return d.b.i(this.f12806a, (Um.GetPushMessageResult) obj);
                    }
                };
                mc.c cVar = new mc.c() { // from class: f5.h
                    @Override // mc.c
                    public final void accept(Object obj) {
                        d.b.j(lVar2, obj);
                    }
                };
                final l lVar3 = new l() { // from class: f5.i
                    @Override // qd.l
                    public final Object l(Object obj) {
                        return d.b.k(this.f12808a, (Throwable) obj);
                    }
                };
                dVar.l(gVarM.i(cVar, new mc.c() { // from class: f5.j
                    @Override // mc.c
                    public final void accept(Object obj) {
                        d.b.l(lVar3, obj);
                    }
                }));
            }
        }
    }

    private d() {
    }

    private final String g() {
        String rPCServerUrl = Cfg.O().getRPCServerUrl();
        m.d(rPCServerUrl, "getRPCServerUrl(...)");
        return rPCServerUrl;
    }

    public static final Error.Info j(Throwable th2) {
        List<com.google.protobuf.f> listZ;
        m.e(th2, "t");
        pa.a aVarB = vb.b.b(th2);
        if (aVarB == null || (listZ = aVarB.z()) == null) {
            return null;
        }
        for (com.google.protobuf.f fVar : listZ) {
            try {
                if (fVar.w(Error.Info.class)) {
                    return (Error.Info) fVar.D(Error.Info.class);
                }
                continue;
            } catch (Throwable th3) {
                th3.printStackTrace();
            }
        }
        return null;
    }

    public final DeviceManagementGrpc.DeviceManagementStub a() {
        DeviceManagementGrpc.DeviceManagementStub deviceManagementStub;
        DeviceManagementGrpc.DeviceManagementStub deviceManagementStub2 = f12798g;
        if (deviceManagementStub2 != null) {
            return deviceManagementStub2;
        }
        synchronized (this) {
            try {
                io.grpc.stub.d dVarWithCallCredentials = f12798g;
                if (dVarWithCallCredentials == null) {
                    dVarWithCallCredentials = DeviceManagementGrpc.newStub(f12792a.b()).withCallCredentials(c.f12788a);
                    f12798g = (DeviceManagementGrpc.DeviceManagementStub) dVarWithCallCredentials;
                }
                m.b(dVarWithCallCredentials);
                deviceManagementStub = (DeviceManagementGrpc.DeviceManagementStub) dVarWithCallCredentials;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return deviceManagementStub;
    }

    public final v0 b() {
        v0 v0Var = f12797f;
        if (v0Var != null) {
            return v0Var;
        }
        synchronized (this) {
            try {
                v0 v0Var2 = f12797f;
                if (v0Var2 != null) {
                    return v0Var2;
                }
                rb.g gVarN = rb.g.j(f12792a.g()).n(SSLUtils.INSTANCE.getISRGRootX1SSLSocketFactory());
                if (Cfg.O().testUseLocalServer) {
                    gVarN.d("rpc.benshikj.com");
                }
                v0 v0VarA = gVarN.a();
                v0VarA.j(v0VarA.i(false), new a(v0VarA));
                f12797f = v0VarA;
                f12794c.post(f12796e);
                m.d(v0VarA, "synchronized(...)");
                return v0VarA;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final int c() {
        return f12793b;
    }

    public final kc.b d() {
        return f12795d;
    }

    public final Handler e() {
        return f12794c;
    }

    public final a.d f() {
        a.d dVarB;
        a.d dVar = f12800i;
        if (dVar != null) {
            return dVar;
        }
        synchronized (this) {
            try {
                dVarB = f12800i;
                if (dVarB == null) {
                    dVarB = nk.a.b(f12792a.b());
                    f12800i = dVarB;
                }
                m.b(dVarB);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return dVarB;
    }

    public final UserGrpc.UserBlockingStub h() {
        UserGrpc.UserBlockingStub userBlockingStub;
        UserGrpc.UserBlockingStub userBlockingStub2 = f12801j;
        if (userBlockingStub2 != null) {
            return userBlockingStub2;
        }
        synchronized (this) {
            try {
                io.grpc.stub.d dVarWithCallCredentials = f12801j;
                if (dVarWithCallCredentials == null) {
                    dVarWithCallCredentials = UserGrpc.newBlockingStub(f12792a.b()).withCallCredentials(c.f12788a);
                    f12801j = (UserGrpc.UserBlockingStub) dVarWithCallCredentials;
                }
                m.b(dVarWithCallCredentials);
                userBlockingStub = (UserGrpc.UserBlockingStub) dVarWithCallCredentials;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return userBlockingStub;
    }

    public final void i(boolean z10) {
        if (!z10 || com.dw.ht.ii.a.a() == null) {
            return;
        }
        b().k();
    }

    public final void k() {
        d5.g.s("重启GRPC");
        kc.b bVar = f12795d;
        if (bVar != null) {
            bVar.dispose();
        }
        v0 v0Var = f12797f;
        f12797f = null;
        f12801j = null;
        f12799h = null;
        f12798g = null;
        f12800i = null;
        com.dw.ht.ii.a.e();
        if (v0Var != null) {
            v0Var.l();
        }
    }

    public final void l(kc.b bVar) {
        f12795d = bVar;
    }
}
