package y1;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.appcompat.widget.ActivityChooserView;
import g3.a;
import g3.c;
import java.util.Iterator;
import java.util.LinkedList;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BluetoothDevice f32314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g3.c f32315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mi.c f32316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private LinkedList f32317d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f32318e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f32319f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private BluetoothGatt f32320g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f32321h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f32322i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Handler f32323j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private BluetoothGattCharacteristic f32324k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f32325l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f32326m;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final g3.d f32327a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final d f32328b;

        public a(g3.d dVar, d dVar2) {
            m.e(dVar, "packet");
            m.e(dVar2, "link");
            this.f32327a = dVar;
            this.f32328b = dVar2;
        }
    }

    public static final class b extends BluetoothGattCallback {
        b() {
        }

        public final void a(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            m.e(bluetoothGattCharacteristic, "characteristic");
            m.e(bArr, "value");
            if (m.a(bluetoothGattCharacteristic.getUuid(), e.f32333d)) {
                g gVar = new g(bArr, true);
                if (e.e()) {
                    if (gVar.l() == a.b.SUCCESS) {
                        Log.i("GaiaBleLink", "rx:" + gVar);
                    } else {
                        Log.w("GaiaBleLink", "rx:" + gVar);
                    }
                }
                if (!d.this.o(gVar)) {
                    d.this.n().m(new a(gVar, d.this));
                }
                d.q(d.this, null, 1, null);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
            m.e(bluetoothGatt, "gatt");
            m.e(bluetoothGattCharacteristic, "characteristic");
            m.e(bArr, "value");
            a(bluetoothGattCharacteristic, bArr);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i10, int i11) {
            m.e(bluetoothGatt, "gatt");
            super.onConnectionStateChange(bluetoothGatt, i10, i11);
            Log.i("GaiaBleLink", "onConnectionStateChange:" + i11);
            if (i11 == 0) {
                d.this.f32321h = true;
                d.this.s(false);
            } else {
                if (i11 != 2) {
                    d.this.s(false);
                    return;
                }
                Log.i("GaiaBleLink", "start service discovery:" + bluetoothGatt.discoverServices());
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onMtuChanged(BluetoothGatt bluetoothGatt, int i10, int i11) {
            super.onMtuChanged(bluetoothGatt, i10, i11);
            Log.i("GaiaBleLink", "onMtuChanged:" + i10 + ", status:" + i11);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i10) {
            m.e(bluetoothGatt, "gatt");
            Log.d("GaiaBleLink", "onServicesDiscovered received: " + i10);
            if (i10 != 0) {
                return;
            }
            BluetoothGattService service = bluetoothGatt.getService(e.f32331b);
            if (service != null) {
                BluetoothGattCharacteristic characteristic = service.getCharacteristic(e.f32333d);
                BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(e.f32332c);
                if (characteristic != null && characteristic2 != null) {
                    Log.d("GaiaBleLink", "setCharacteristicNotification:" + bluetoothGatt.setCharacteristicNotification(characteristic, true));
                    BluetoothGattDescriptor descriptor = characteristic.getDescriptor(e.f32334e);
                    byte[] bArr = (characteristic.getProperties() & 16) != 0 ? BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE : BluetoothGattDescriptor.ENABLE_INDICATION_VALUE;
                    if (Build.VERSION.SDK_INT >= 33) {
                        bluetoothGatt.writeDescriptor(descriptor, bArr);
                    } else {
                        descriptor.setValue(bArr);
                        bluetoothGatt.writeDescriptor(descriptor);
                    }
                    d.this.f32324k = characteristic2;
                    d.this.s(true);
                }
            }
            if (e.e()) {
                StringBuilder sb2 = new StringBuilder();
                for (BluetoothGattService bluetoothGattService : bluetoothGatt.getServices()) {
                    sb2.append("Service:" + bluetoothGattService.getUuid());
                    sb2.append('\n');
                    for (BluetoothGattCharacteristic bluetoothGattCharacteristic : bluetoothGattService.getCharacteristics()) {
                        sb2.append("    Characteristic:" + bluetoothGattCharacteristic.getUuid());
                        sb2.append('\n');
                        Iterator<BluetoothGattDescriptor> it = bluetoothGattCharacteristic.getDescriptors().iterator();
                        while (it.hasNext()) {
                            sb2.append("        Descriptor:" + it.next().getUuid());
                            sb2.append('\n');
                        }
                    }
                }
                Log.d("GaiaBleLink", sb2.toString());
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            m.e(bluetoothGatt, "gatt");
            m.e(bluetoothGattCharacteristic, "characteristic");
            byte[] value = bluetoothGattCharacteristic.getValue();
            m.d(value, "getValue(...)");
            a(bluetoothGattCharacteristic, value);
        }
    }

    public d(Context context, BluetoothDevice bluetoothDevice) {
        m.e(context, "context");
        m.e(bluetoothDevice, "bluetoothDevice");
        this.f32314a = bluetoothDevice;
        mi.c cVarA = mi.c.b().a();
        m.d(cVarA, "build(...)");
        this.f32316c = cVarA;
        this.f32317d = new LinkedList();
        this.f32318e = new Handler(Looper.getMainLooper());
        this.f32319f = context.getApplicationContext();
        this.f32325l = new b();
        this.f32326m = new Runnable() { // from class: y1.c
            @Override // java.lang.Runnable
            public final void run() {
                d.r(this.f32313a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(d dVar, Handler handler) {
        if (dVar.f32322i) {
            handler.obtainMessage(c.EnumC0195c.CONNECTED.ordinal(), dVar.f32314a.getAddress()).sendToTarget();
        }
    }

    public static /* synthetic */ void q(d dVar, byte[] bArr, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: send");
        }
        if ((i10 & 1) != 0) {
            bArr = null;
        }
        dVar.p(bArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(d dVar) {
        q(dVar, null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(boolean z10) {
        Message messageObtainMessage;
        if (this.f32322i == z10) {
            return;
        }
        this.f32322i = z10;
        if (z10) {
            final Handler handler = this.f32323j;
            if (handler != null) {
                handler.postDelayed(new Runnable() { // from class: y1.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        d.i(this.f32311a, handler);
                    }
                }, 200L);
                return;
            }
            return;
        }
        this.f32317d.clear();
        this.f32324k = null;
        Handler handler2 = this.f32323j;
        if (handler2 == null || (messageObtainMessage = handler2.obtainMessage(c.EnumC0195c.DISCONNECTED.ordinal())) == null) {
            return;
        }
        messageObtainMessage.sendToTarget();
    }

    @Override // y1.k
    public void a() {
        Log.d("GaiaBleLink", "disconnect:" + this.f32314a.getAddress(), new Exception());
        BluetoothGatt bluetoothGatt = this.f32320g;
        if (bluetoothGatt != null) {
            bluetoothGatt.close();
        }
        this.f32320g = null;
        s(false);
        this.f32321h = false;
    }

    @Override // y1.k
    public final boolean b() {
        return this.f32322i;
    }

    @Override // y1.k
    public void c(int i10, int i11, byte... bArr) {
        m.e(bArr, "param");
        if (this.f32324k == null) {
            return;
        }
        byte[] bArr2 = new byte[bArr.length + 4];
        bArr2[0] = (byte) (i10 >> 8);
        bArr2[1] = (byte) i10;
        bArr2[2] = (byte) (i11 >> 8);
        bArr2[3] = (byte) i11;
        ed.j.k(bArr, bArr2, 4, 0, 0, 12, null);
        p(bArr2);
    }

    @Override // y1.k
    public void d(Handler handler) {
        this.f32323j = handler;
    }

    @Override // y1.k
    public void e(BluetoothDevice bluetoothDevice, c.e eVar) {
        m.e(bluetoothDevice, "device");
        m.e(eVar, "btSpp");
        m();
    }

    @Override // y1.k
    public g3.c f() {
        return this.f32315b;
    }

    public final void m() {
        if (this.f32321h) {
            a();
        }
        if (this.f32320g != null) {
            return;
        }
        Log.d("GaiaBleLink", "connect:" + this.f32314a.getAddress());
        this.f32320g = Build.VERSION.SDK_INT >= 23 ? this.f32314a.connectGatt(this.f32319f, true, this.f32325l, 2) : this.f32314a.connectGatt(this.f32319f, true, this.f32325l);
    }

    public final mi.c n() {
        return this.f32316c;
    }

    public boolean o(g3.d dVar) {
        m.e(dVar, "packet");
        Handler handler = this.f32323j;
        if (handler == null) {
            return false;
        }
        handler.obtainMessage(c.EnumC0195c.PACKET.ordinal(), dVar).sendToTarget();
        return true;
    }

    public final synchronized void p(byte[] bArr) {
        int iWriteCharacteristic;
        try {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.f32324k;
            if (bluetoothGattCharacteristic == null) {
                return;
            }
            BluetoothGatt bluetoothGatt = this.f32320g;
            if (bluetoothGatt == null) {
                return;
            }
            if (bArr != null) {
                this.f32317d.add(bArr);
            }
            if (this.f32317d.size() == 0) {
                return;
            }
            byte[] bArr2 = (byte[]) this.f32317d.peek();
            if (bArr2 == null) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                iWriteCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic, bArr2, bluetoothGattCharacteristic.getWriteType());
            } else {
                bluetoothGattCharacteristic.setValue(bArr2);
                iWriteCharacteristic = bluetoothGatt.writeCharacteristic(bluetoothGattCharacteristic) ? 0 : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            if (iWriteCharacteristic == 0) {
                this.f32317d.poll();
                if (e.e()) {
                    Log.i("GaiaBleLink", "tx:" + new g(bArr2, true) + "\t待发送:" + this.f32317d.size());
                }
            } else {
                e.e();
            }
            if (this.f32317d.size() != 0) {
                this.f32318e.removeCallbacks(this.f32326m);
                this.f32318e.postDelayed(this.f32326m, 10L);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
