package n4;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import v4.i0;
import v4.m0;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BluetoothDevice f22435c;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22436a;

        static {
            int[] iArr = new int[n0.c.values().length];
            try {
                iArr[n0.c.Connecting.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[n0.c.ConnectionFailed.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f22436a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, BluetoothDevice bluetoothDevice) {
        super(m0.i(bluetoothDevice.getAddress()));
        rd.m.e(context, "context");
        rd.m.e(bluetoothDevice, "bdDevice");
        this.f22435c = bluetoothDevice;
    }

    @Override // n4.a
    public String b() {
        String address = this.f22435c.getAddress();
        rd.m.d(address, "getAddress(...)");
        return address;
    }

    @Override // n4.a
    public BluetoothDevice c() {
        return this.f22435c;
    }

    @Override // n4.a
    public String d() {
        String strW = Cfg.w(this.f22435c);
        rd.m.d(strW, "getDevName(...)");
        if (strW.length() > 0) {
            return strW;
        }
        String strC = m3.a.c(this.f22435c);
        rd.m.d(strC, "getNameOrAddress(...)");
        return strC;
    }

    @Override // n4.a
    public String e() {
        n0.c cVarA = i0.F.a(this);
        if (cVarA == null) {
            cVarA = n0.c.Idle;
        }
        int i10 = a.f22436a[cVarA.ordinal()];
        if (i10 == 1) {
            String string = Main.f5555g.getString(R.string.connecting);
            rd.m.d(string, "getString(...)");
            return string;
        }
        if (i10 == 2) {
            String string2 = Main.f5555g.getString(R.string.connection_failed);
            rd.m.d(string2, "getString(...)");
            return string2;
        }
        if (cVarA.d()) {
            String string3 = Main.f5555g.getString(R.string.connected);
            rd.m.d(string3, "getString(...)");
            return string3;
        }
        String address = this.f22435c.getAddress();
        rd.m.d(address, "getAddress(...)");
        return address;
    }

    @Override // n4.a
    public int f() {
        return R.drawable.ic_headset_mic_black_24dp;
    }

    @Override // n4.a
    public int g() {
        return h() ? R.drawable.ic_mic_black_24dp : R.drawable.baseline_mic_off_24;
    }

    @Override // n4.a
    public boolean h() {
        n0.c cVarA = i0.F.a(this);
        return (cVarA != null && cVarA.d()) || super.h();
    }

    public final i0 j() {
        i0.a aVar = i0.F;
        BluetoothDevice bluetoothDevice = this.f22435c;
        return aVar.f(bluetoothDevice, bluetoothDevice);
    }

    @Override // n4.a
    public void a() {
    }
}
