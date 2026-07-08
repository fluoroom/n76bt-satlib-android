package v4;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import com.dw.ht.Cfg;
import g3.c;
import java.util.UUID;
import org.msgpack.core.MessagePack;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public class o extends c0 {
    public static final UUID N0 = UUID.fromString("000088A1-0000-1000-8000-00805f9b34fb");
    public static final UUID O0 = UUID.fromString("39144315-32fa-40db-85ed-fbfeba2d86e6");
    final BluetoothAdapter J0;
    private final BluetoothDevice K0;
    private final Object L0;
    private BluetoothSocket M0;

    public o(String str) {
        super(l1.W(str));
        this.L0 = new Object();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.J0 = defaultAdapter;
        if (defaultAdapter == null) {
            throw new RuntimeException("设备不支持蓝牙");
        }
        this.K0 = defaultAdapter.getRemoteDevice(str);
        this.f29944b.O(this.f29758i0);
    }

    public static int Z2(byte[] bArr) {
        byte b10;
        int i10;
        int i11;
        if (bArr == null) {
            return 0;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < bArr.length && (b10 = bArr[i12]) > 0 && (i11 = (i10 = i12 + 1) + b10) <= bArr.length) {
            int i14 = bArr[i10] & MessagePack.Code.EXT_TIMESTAMP;
            if (i14 == 2 || i14 == 3) {
                for (int i15 = i12 + 2; i15 < i11; i15 += 2) {
                    int i16 = (bArr[i15] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i15 + 1] & MessagePack.Code.EXT_TIMESTAMP) << 8);
                    if (i16 == 16640 || i16 == 16896 || i16 == 34977 || i16 == 65504) {
                        i13 = i16;
                    }
                }
            } else if (i14 == 255 && b10 >= 5 && ((bArr[i12 + 2] & MessagePack.Code.EXT_TIMESTAMP) | ((bArr[i12 + 3] & MessagePack.Code.EXT_TIMESTAMP) << 8)) == 13 && bArr[i12 + 4] > 0 && (bArr[i12 + 5] & 1) == 0) {
                s3.b.b("Link", "BLE: Scan Response :SK Not in bond state");
                return 0;
            }
            i12 = i11;
        }
        return i13;
    }

    @Override // v4.c0
    protected t G1() {
        return new m(this, this.M0);
    }

    @Override // v4.c0, v4.l1
    public void L(boolean z10) {
        if (z10) {
            u.w().h();
        }
        super.L(z10);
    }

    public BluetoothDevice a3() {
        return this.K0;
    }

    public boolean b3() {
        if (i()) {
            if (this.f29958y == n0.c.Sending) {
                return true;
            }
            t tVar = this.Z;
            if (tVar != null && tVar.v()) {
                return true;
            }
        }
        return false;
    }

    @Override // v4.l1, v4.n0
    public void destroy() {
        super.destroy();
        this.f29750a0.cancel();
    }

    @Override // v4.l1, v4.n0
    public String getName() {
        return Cfg.w(a3());
    }

    @Override // v4.l1, v4.n0
    public void v(boolean z10) {
        if (z10) {
            u.w().h();
        }
        K();
        this.Y = true;
        if (this.f29944b.F()) {
            this.f29944b.O(this.f29758i0);
            return;
        }
        n0.c cVar = this.f29959z;
        n0.c cVar2 = n0.c.Connecting;
        if (cVar == cVar2) {
            return;
        }
        if (!E1(z10)) {
            e1(n0.c.ConnectionFailed);
            return;
        }
        e1(cVar2);
        this.f29944b.t(this.K0, c.e.BT_SPP);
        this.f29944b.O(this.f29758i0);
    }
}
