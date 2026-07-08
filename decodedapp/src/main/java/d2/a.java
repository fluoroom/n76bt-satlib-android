package d2;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import c2.a;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class a implements a.c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f10542l = "a";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final UUID f10543m = UUID.fromString("0000ff12-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final UUID f10544n = UUID.fromString("0000ff14-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final UUID f10545o = UUID.fromString("0000ff15-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final UUID f10546p = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final BluetoothDevice f10548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BluetoothGatt f10549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BluetoothGattService f10550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private BluetoothGattCharacteristic f10551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private BluetoothGattCharacteristic f10552f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f10554h;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10553g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10555i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10556j = 23;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final BluetoothGattCallback f10557k = new C0144a();

    /* JADX INFO: renamed from: d2.a$a, reason: collision with other inner class name */
    class C0144a extends BluetoothGattCallback {
        C0144a() {
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            byte[] value = bluetoothGattCharacteristic.getValue();
            if (a.this.f10555i) {
                Log.v(a.f10542l, "BLE_READ: " + f2.a.a(value));
            }
            if (a.this.f10554h != null) {
                a.this.f10554h.X(value);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicWrite(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            if (i10 != 0 || a.this.f10554h == null) {
                return;
            }
            a.this.f10554h.y(null);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i10, int i11) {
            Log.d(a.f10542l, "onConnectionStateChange: newState = " + i11);
            if (i11 == 2) {
                a.this.f10549c.discoverServices();
            } else if (i11 == 0) {
                a.this.f10553g = false;
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onDescriptorWrite(BluetoothGatt bluetoothGatt, BluetoothGattDescriptor bluetoothGattDescriptor, int i10) {
            if (i10 == 0) {
                a.this.f10549c.requestMtu(517);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i10, int i11) {
            Log.d(a.f10542l, "onMtuChanged: mtu = " + i10);
            a.this.f10556j = i10;
            a.this.f10553g = true;
            if (a.this.f10554h != null) {
                a.this.f10554h.s();
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i10) {
            if (i10 == 0) {
                a.this.j();
            } else {
                a.this.i();
            }
        }
    }

    public a(Context context, BluetoothDevice bluetoothDevice) {
        this.f10547a = context;
        this.f10548b = bluetoothDevice;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        BluetoothGattDescriptor descriptor;
        BluetoothGattService service = this.f10549c.getService(f10543m);
        this.f10550d = service;
        if (service == null) {
            return;
        }
        this.f10551e = service.getCharacteristic(f10544n);
        BluetoothGattCharacteristic characteristic = this.f10550d.getCharacteristic(f10545o);
        this.f10552f = characteristic;
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f10551e;
        if (bluetoothGattCharacteristic == null || characteristic == null || !this.f10549c.setCharacteristicNotification(bluetoothGattCharacteristic, true) || (descriptor = this.f10551e.getDescriptor(f10546p)) == null) {
            return;
        }
        descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
        this.f10549c.writeDescriptor(descriptor);
    }

    @Override // c2.a.c
    public void a(byte[] bArr) {
        m(bArr);
    }

    public void i() {
        BluetoothGatt bluetoothGatt = this.f10549c;
        if (bluetoothGatt != null) {
            bluetoothGatt.close();
            this.f10549c = null;
        }
        this.f10550d = null;
        this.f10551e = null;
        this.f10552f = null;
    }

    public boolean k() {
        return this.f10553g;
    }

    public void l() {
        if (Build.VERSION.SDK_INT >= 23) {
            this.f10549c = this.f10548b.connectGatt(this.f10547a, true, this.f10557k, 2);
        } else {
            this.f10549c = this.f10548b.connectGatt(this.f10547a, true, this.f10557k);
        }
    }

    public void m(byte[] bArr) {
        this.f10552f.setValue(bArr);
        this.f10552f.setWriteType(1);
        this.f10549c.writeCharacteristic(this.f10552f);
        if (this.f10555i) {
            Log.v(f10542l, "BLE_WRITE: " + f2.a.a(bArr));
        }
    }

    public void n(b bVar) {
        this.f10554h = bVar;
    }
}
