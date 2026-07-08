package y1;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import g3.c;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class f implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g3.c f32335a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g3.c f32336b;

    public f(g3.c cVar) {
        m.e(cVar, "base");
        this.f32335a = cVar;
        this.f32336b = cVar;
    }

    @Override // y1.k
    public void a() {
        this.f32335a.x();
    }

    @Override // y1.k
    public boolean b() {
        return this.f32335a.F();
    }

    @Override // y1.k
    public void c(int i10, int i11, byte[] bArr) {
        m.e(bArr, "param");
        this.f32335a.K(i10, i11, bArr);
    }

    @Override // y1.k
    public void d(Handler handler) {
        this.f32335a.O(handler);
    }

    @Override // y1.k
    public void e(BluetoothDevice bluetoothDevice, c.e eVar) {
        m.e(bluetoothDevice, "device");
        m.e(eVar, "transport");
        this.f32335a.t(bluetoothDevice, eVar);
    }

    @Override // y1.k
    public g3.c f() {
        return this.f32336b;
    }
}
