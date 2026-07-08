package v4;

import android.location.Location;
import android.os.SystemClock;
import android.text.TextUtils;
import com.dw.ht.Main;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.Locale;
import v4.a0;
import v4.a2;
import w5.a;

/* JADX INFO: loaded from: classes.dex */
abstract class z1 extends l1 {
    private long Q;
    private final a0 R;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f30295a;

        static {
            int[] iArr = new int[v.values().length];
            f30295a = iArr;
            try {
                iArr[v.SET_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
        }
    }

    public z1(long j10) {
        super(j10);
        this.Q = -10000000L;
        this.R = new a0(null);
    }

    private String t1(q qVar) {
        int i10;
        String strU = qVar.u();
        LinkedList linkedList = new LinkedList();
        if (!TextUtils.isEmpty(strU)) {
            linkedList.add(strU);
        }
        if (qVar.z() && (i10 = this.R.f29641h) > 0) {
            linkedList.add(String.format(Locale.ENGLISH, "%.1fV", Float.valueOf(i10 / 1000.0f)));
        }
        Charset charsetForName = Charset.forName("utf-8");
        while (true) {
            String strJoin = TextUtils.join(" ", linkedList);
            int i11 = 43;
            if (strJoin.getBytes(charsetForName).length <= 43) {
                return strJoin;
            }
            int length = strJoin.length();
            if (length <= 43) {
                i11 = length - 1;
            }
            strU = strU.substring(0, strU.length() - (strJoin.length() - i11));
            linkedList.remove(0);
            linkedList.add(0, strU);
        }
    }

    private void u1() {
        Location locationC;
        w5.h hVarA;
        q qVarT = T();
        int iT = qVarT.t();
        if (iT == 0 || SystemClock.elapsedRealtime() - this.Q < iT || (locationC = o5.g.C(Main.f5555g)) == null) {
            return;
        }
        if (v1()) {
            Location locationB = o5.g.B(Main.f5555g);
            if (locationB == null) {
                return;
            } else {
                hVarA = new a.C0414a().c(locationB.getLatitude(), locationB.getLongitude(), qVarT.i().toCharArray()).d(t1(qVarT)).h(qVarT.l()).g(Q()).a();
            }
        } else {
            w5.d dVar = new w5.d();
            dVar.f31252c = qVarT.w();
            dVar.f31257h = Double.valueOf(locationC.getLongitude());
            dVar.f31256g = Double.valueOf(locationC.getLatitude());
            dVar.f31255f = qVarT.u();
            dVar.f31258r = qVarT.y();
            dVar.B = true;
            if (qVarT.s()) {
                dVar.f31260t = qVarT.E();
            }
            if (qVarT.z()) {
                dVar.f31259s = d().f29641h;
            }
            hVarA = dVar;
        }
        Q0(hVarA, 100000, false, null);
        d5.d.p(hVarA, 2, 0);
        this.Q = SystemClock.elapsedRealtime();
    }

    @Override // v4.l1, v4.n0, e5.a.f
    public boolean a(v vVar, byte... bArr) {
        super.a(vVar, bArr);
        if (a.f30295a[vVar.ordinal()] == 1 && T().j()) {
            u1();
        }
        return true;
    }

    @Override // v4.l1, v4.n0, e5.a.f
    public a0 d() {
        this.R.f29641h = com.dw.ht.k0.f6351c;
        return this.R;
    }

    @Override // v4.l1
    public boolean h1(a2.a aVar) {
        return false;
    }

    protected boolean v1() {
        return T().A();
    }

    @Override // v4.l1
    public void g1(a0.e eVar) {
    }
}
