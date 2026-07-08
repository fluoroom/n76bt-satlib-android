package e5;

import android.content.Context;
import com.benshikj.ht.rpc.Dm;
import com.dw.ht.Main;
import com.dw.ht.fragments.DeviceFragment;
import com.google.protobuf.l;
import io.grpc.stub.j;
import java.util.Arrays;
import java.util.Locale;
import v4.a0;
import v4.v;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f11436h = "a";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final f f11437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f11438b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private e f11439c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private byte[] f11440d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f11441e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f11442f = d.None;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private g f11443g = g.IDLE;

    static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f11446a;

        static {
            int[] iArr = new int[v.values().length];
            f11446a = iArr;
            try {
                iArr[v.GET_DEV_ID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11446a[v.GET_REG_TIMES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11446a[v.SET_REG_TIMES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public interface e {
        void I(a aVar, g gVar);

        void T(a aVar, d dVar, CharSequence charSequence);

        void x(a aVar, d dVar, CharSequence charSequence);
    }

    public interface f {
        boolean a(v vVar, byte... bArr);

        boolean c(int i10, int i11, byte... bArr);

        a0 d();

        void e(Dm.DeviceID deviceID);

        boolean t(int i10);

        void y();
    }

    public enum g {
        IDLE,
        GET_DEV_ID,
        GET_REG_TIMES,
        GET_REG_TIMES_FROM_SERVER,
        GET_REG_TIMES_FROM_SERVER_CB,
        SET_REG_TIMES,
        UPDATE_SERVER_REG_TIMES,
        UPDATE_SERVER_REG_TIMES_CB,
        SUCCESS
    }

    public a(Context context, f fVar) {
        this.f11437a = fVar;
        this.f11438b = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(int i10) {
        o(g.UPDATE_SERVER_REG_TIMES_CB);
        if (i10 == this.f11441e) {
            k();
        } else if (i10 == Integer.MAX_VALUE) {
            h(d.DeviceIDInvalid, "设备ID不可用请重新分配");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i10) {
        o(g.GET_REG_TIMES_FROM_SERVER_CB);
        int i11 = this.f11441e;
        if (i10 <= i11) {
            int i12 = i11 + 1;
            o(g.SET_REG_TIMES);
            this.f11437a.a(v.SET_REG_TIMES, (byte) (i12 >>> 8), (byte) i12);
        } else if (i10 == Integer.MAX_VALUE) {
            h(d.DeviceIDInvalid, "设备ID无效");
        } else {
            h(d.DeviceIDAlreadyUsed, "此设备ID已经被注册过");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(d dVar, CharSequence charSequence) {
        e eVar = this.f11439c;
        if (eVar != null) {
            eVar.T(this, dVar, charSequence);
        }
        this.f11442f = dVar;
        g(dVar, charSequence);
    }

    private void o(g gVar) {
        if (gVar == this.f11443g) {
            return;
        }
        this.f11443g = gVar;
        e eVar = this.f11439c;
        if (eVar != null) {
            eVar.I(this, gVar);
        }
        s3.b.b(f11436h, gVar.name());
    }

    private void r(int i10) {
        o(g.UPDATE_SERVER_REG_TIMES);
        this.f11441e = i10;
        f5.d.f12792a.a().setRegTimes(Dm.SetDeviceRegTimesRequest.newBuilder().setDevId(l.g(this.f11440d)).setRegTimes(i10).setClientName(Main.f5555g.getPackageName()).setProductId(this.f11437a.d().h()).setVendorId(this.f11437a.d().o()).setUserId(com.dw.ht.user.b.f6853a.i()).build(), new C0155a());
    }

    public String e() {
        byte[] bArr = this.f11440d;
        if (bArr == null || bArr.length == 0) {
            return "-";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : this.f11440d) {
            sb2.append(String.format(Locale.ENGLISH, "%02X", Byte.valueOf(b10)));
        }
        return sb2.toString();
    }

    public g f() {
        return this.f11443g;
    }

    protected void g(d dVar, CharSequence charSequence) {
        s3.b.b(f11436h, dVar + ":" + ((Object) charSequence));
    }

    protected void h(d dVar, CharSequence charSequence) {
        e eVar = this.f11439c;
        if (eVar != null) {
            eVar.x(this, dVar, charSequence);
        }
        s3.b.b(f11436h, dVar + ":" + ((Object) charSequence));
    }

    public void i(g3.d dVar) {
        if (dVar.m() != 2) {
            return;
        }
        v vVarD = v.d(dVar.e());
        if (!DeviceFragment.a5(dVar)) {
            int i10 = c.f11446a[vVarD.ordinal()];
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                this.f11437a.c(10, 1811, new byte[0]);
                this.f11437a.t(18319);
                h(d.DeviceNoResponse, "设备没有响应命令:" + vVarD.name());
                return;
            }
            return;
        }
        int i11 = c.f11446a[vVarD.ordinal()];
        if (i11 == 1) {
            byte[] bArrI = dVar.i();
            if (bArrI.length < 16) {
                h(d.DeviceNoID, "设备没有有效的设备ID");
                return;
            }
            this.f11440d = Arrays.copyOfRange(bArrI, 1, bArrI.length);
            o(g.GET_REG_TIMES);
            this.f11437a.a(v.GET_REG_TIMES, new byte[0]);
            return;
        }
        if (i11 == 2) {
            this.f11441e = dVar.k(1);
            q();
        } else {
            if (i11 != 3) {
                return;
            }
            if (dVar.i().length == 1) {
                r(this.f11441e + 1);
            } else {
                r(dVar.k(1));
            }
        }
    }

    protected void k() {
        o(g.SUCCESS);
    }

    public void n(e eVar) {
        this.f11439c = eVar;
    }

    public void p() {
        o(g.GET_DEV_ID);
        this.f11437a.a(v.GET_DEV_ID, new byte[0]);
    }

    public void q() {
        if (this.f11440d == null) {
            return;
        }
        o(g.GET_REG_TIMES_FROM_SERVER);
        f5.d.f12792a.a().getRegTimes(Dm.GetDeviceRegTimesRequest.newBuilder().setDevId(l.g(this.f11440d)).setProductId(this.f11437a.d().h()).setReqDevID(true).build(), new b());
    }

    public enum d {
        None,
        Unknown,
        DeviceConnection,
        Server,
        DeviceNoResponse(-1),
        DeviceNoID(-2),
        DeviceIDInvalid(-3),
        DeviceIDAlreadyUsed(-4);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11456a;

        d(int i10) {
            this.f11456a = i10;
        }

        d() {
            this.f11456a = ordinal();
        }
    }

    /* JADX INFO: renamed from: e5.a$a, reason: collision with other inner class name */
    class C0155a implements j {
        C0155a() {
        }

        @Override // io.grpc.stub.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Dm.DeviceRegTimes deviceRegTimes) {
            a.this.j(deviceRegTimes.getRegTimes());
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
            a.this.g(d.Server, th2.getLocalizedMessage());
            th2.printStackTrace();
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
        }
    }

    class b implements j {
        b() {
        }

        @Override // io.grpc.stub.j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onNext(Dm.DeviceRegTimes deviceRegTimes) {
            a.this.f11437a.e(deviceRegTimes.hasID() ? deviceRegTimes.getID() : null);
            a.this.l(deviceRegTimes.getRegTimes());
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
            a.this.m(d.Server, th2.getLocalizedMessage());
            th2.printStackTrace();
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
        }
    }
}
