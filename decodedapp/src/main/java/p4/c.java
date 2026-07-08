package p4;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f23907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f23908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BluetoothDevice f23909c;

    public c(long j10, int i10) {
        this.f23908b = i10;
        this.f23907a = j10;
        this.f23909c = null;
    }

    public c(BluetoothDevice bluetoothDevice, int i10) {
        this.f23908b = i10;
        this.f23907a = 0L;
        this.f23909c = bluetoothDevice;
    }
}
