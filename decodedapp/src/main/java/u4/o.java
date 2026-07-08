package u4;

import androidx.lifecycle.s0;
import androidx.lifecycle.t0;
import com.benshikj.ht.rpc.IHTGrpc;
import com.benshikj.ht.rpc.Im;
import com.benshikj.ii.II;
import java.util.ArrayList;
import java.util.List;
import qb.x1;
import tg.p0;

/* JADX INFO: loaded from: classes.dex */
public final class o extends s0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f28107b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final dd.j f28108c = dd.k.b(new qd.a() { // from class: u4.l
        @Override // qd.a
        public final Object a() {
            return o.t(this.f28104a);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final dd.j f28109d = dd.k.b(new qd.a() { // from class: u4.m
        @Override // qd.a
        public final Object a() {
            return o.j(this.f28106a);
        }
    });

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final dd.j f28110e = dd.k.b(new qd.a() { // from class: u4.n
        @Override // qd.a
        public final Object a() {
            return o.k();
        }
    });

    static final class a extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28111e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ IHTGrpc.IHTBlockingStub f28113g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(IHTGrpc.IHTBlockingStub iHTBlockingStub, hd.e eVar) {
            super(2, eVar);
            this.f28113g = iHTBlockingStub;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return o.this.new a(this.f28113g, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            id.b.e();
            if (this.f28111e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            try {
                o.this.m().l(this.f28113g.getChannel(Im.GetChannelRequest.newBuilder().setChannelID(o.this.n()).build()).getChannel());
            } catch (x1 e10) {
                e10.printStackTrace();
            }
            return dd.d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((a) g(d0Var, eVar)).o(dd.d0.f10897a);
        }
    }

    static final class b extends jd.m implements qd.p {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f28114e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ IHTGrpc.IHTBlockingStub f28115f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ o f28116g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(IHTGrpc.IHTBlockingStub iHTBlockingStub, o oVar, hd.e eVar) {
            super(2, eVar);
            this.f28115f = iHTBlockingStub;
            this.f28116g = oVar;
        }

        @Override // jd.a
        public final hd.e g(Object obj, hd.e eVar) {
            return new b(this.f28115f, this.f28116g, eVar);
        }

        @Override // jd.a
        public final Object o(Object obj) {
            id.b.e();
            if (this.f28114e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dd.s.b(obj);
            try {
                Im.GetServerLocationsResult serverLocations = this.f28115f.getServerLocations(Im.GetServerLocationsRequest.newBuilder().build());
                ArrayList arrayList = new ArrayList(serverLocations.getLocationsCount());
                List<Im.ServerLocation> locationsList = serverLocations.getLocationsList();
                if (locationsList != null) {
                    for (Im.ServerLocation serverLocation : locationsList) {
                        rd.m.b(serverLocation);
                        arrayList.add(new l0(serverLocation));
                    }
                }
                this.f28116g.q().l(arrayList);
            } catch (x1 e10) {
                this.f28116g.o().l(e10);
                e10.printStackTrace();
            }
            return dd.d0.f10897a;
        }

        @Override // qd.p
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object s(tg.d0 d0Var, hd.e eVar) {
            return ((b) g(d0Var, eVar)).o(dd.d0.f10897a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.b0 j(o oVar) {
        androidx.lifecycle.b0 b0Var = new androidx.lifecycle.b0();
        oVar.r();
        return b0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.b0 k() {
        return new androidx.lifecycle.b0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.lifecycle.b0 m() {
        return (androidx.lifecycle.b0) this.f28109d.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.lifecycle.b0 q() {
        return (androidx.lifecycle.b0) this.f28108c.getValue();
    }

    private final void r() {
        II iiA;
        II.RPC rpc;
        IHTGrpc.IHTBlockingStub iHTBlockingStub;
        if (this.f28107b == 0 || (iiA = com.dw.ht.ii.a.a()) == null || (rpc = iiA.RPC) == null || (iHTBlockingStub = rpc.getIHTBlockingStub()) == null) {
            return;
        }
        tg.g.b(t0.a(this), p0.b(), null, new a(iHTBlockingStub, null), 2, null);
    }

    private final void s() {
        II.RPC rpc;
        IHTGrpc.IHTBlockingStub iHTBlockingStub;
        II iiA = com.dw.ht.ii.a.a();
        if (iiA == null || (rpc = iiA.RPC) == null || (iHTBlockingStub = rpc.getIHTBlockingStub()) == null) {
            return;
        }
        tg.g.b(t0.a(this), p0.b(), null, new b(iHTBlockingStub, this, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.lifecycle.b0 t(o oVar) {
        androidx.lifecycle.b0 b0Var = new androidx.lifecycle.b0();
        oVar.s();
        return b0Var;
    }

    public final androidx.lifecycle.z l() {
        return m();
    }

    public final long n() {
        return this.f28107b;
    }

    public final androidx.lifecycle.b0 o() {
        return (androidx.lifecycle.b0) this.f28110e.getValue();
    }

    public final androidx.lifecycle.z p() {
        return q();
    }

    public final void u(long j10) {
        this.f28107b = j10;
    }
}
