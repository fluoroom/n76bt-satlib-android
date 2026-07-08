package n4;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCallback;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.Toast;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import java.util.Iterator;
import java.util.UUID;
import n4.i;
import v4.l1;

/* JADX INFO: loaded from: classes.dex */
public final class i extends n4.a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final a f22445q = new a(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final boolean f22446r = Cfg.f5476a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final UUID f22447s = UUID.fromString("0000ffe0-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final UUID f22448t = UUID.fromString("0000ffe1-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final UUID f22449u = UUID.fromString("00002921-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static String f22450v = "00002902-0000-1000-8000-00805f9b34fb";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final BluetoothDevice f22451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p4.c f22452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final p4.c f22453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final p4.c f22454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final p4.c f22455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Handler f22456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Context f22457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private BluetoothGatt f22458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f22459k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f22460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Runnable f22461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final b f22462n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f22463o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Runnable f22464p;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public final String a() {
            return i.f22450v;
        }

        private a() {
        }
    }

    public static final class b extends BluetoothGattCallback {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, i iVar) {
            bluetoothGatt.readCharacteristic(bluetoothGattCharacteristic);
            iVar.G(4000);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(i iVar) {
            Toast.makeText(iVar.f22457i, iVar.d() + ' ' + iVar.f22457i.getString(R.string.connected), 0).show();
        }

        public final void c(final BluetoothGatt bluetoothGatt, final BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            rd.m.e(bluetoothGatt, "gatt");
            rd.m.e(bluetoothGattCharacteristic, "characteristic");
            i.this.f22460l = true;
            Integer intValue = bluetoothGattCharacteristic.getIntValue(17, 0);
            s3.b.b("PTTDevice", "received v:" + intValue);
            i.this.F((intValue == null || intValue.intValue() == 0) ? false : true);
            if (i.this.B()) {
                Handler handler = i.this.f22456h;
                final i iVar = i.this;
                handler.postDelayed(new Runnable() { // from class: n4.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.d(bluetoothGatt, bluetoothGattCharacteristic, iVar);
                    }
                }, 500L);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicChanged(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
            rd.m.e(bluetoothGatt, "gatt");
            rd.m.e(bluetoothGattCharacteristic, "characteristic");
            s3.b.b("PTTDevice", "onCharacteristicChanged");
            c(bluetoothGatt, bluetoothGattCharacteristic);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onCharacteristicRead(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, int i10) {
            rd.m.e(bluetoothGatt, "gatt");
            rd.m.e(bluetoothGattCharacteristic, "characteristic");
            s3.b.b("PTTDevice", "onCharacteristicRead");
            if (i10 == 0) {
                c(bluetoothGatt, bluetoothGattCharacteristic);
            }
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onConnectionStateChange(BluetoothGatt bluetoothGatt, int i10, int i11) {
            rd.m.e(bluetoothGatt, "gatt");
            super.onConnectionStateChange(bluetoothGatt, i10, i11);
            s3.b.h("PTTDevice", "onConnectionStateChange:" + i11);
            i.this.f22460l = true;
            if (i11 == 0) {
                i.this.D();
                return;
            }
            if (i11 != 2) {
                i.this.i(false);
                return;
            }
            s3.b.h("PTTDevice", "start service discovery:" + bluetoothGatt.discoverServices());
            i.this.G(8000);
        }

        @Override // android.bluetooth.BluetoothGattCallback
        public void onServicesDiscovered(BluetoothGatt bluetoothGatt, int i10) {
            BluetoothGattCharacteristic characteristic;
            rd.m.e(bluetoothGatt, "gatt");
            super.onServicesDiscovered(bluetoothGatt, i10);
            i.this.f22460l = true;
            if (i10 != 0) {
                s3.b.n("PTTDevice", "onServicesDiscovered received: " + i10);
                return;
            }
            Handler handler = i.this.f22456h;
            final i iVar = i.this;
            handler.post(new Runnable() { // from class: n4.k
                @Override // java.lang.Runnable
                public final void run() {
                    i.b.e(iVar);
                }
            });
            BluetoothGattService service = bluetoothGatt.getService(i.f22447s);
            if (service != null && (characteristic = service.getCharacteristic(i.f22448t)) != null) {
                s3.b.b("PTTDevice", "setCharacteristicNotification:" + bluetoothGatt.setCharacteristicNotification(characteristic, true));
                BluetoothGattDescriptor descriptor = characteristic.getDescriptor(UUID.fromString(i.f22445q.a()));
                descriptor.setValue(BluetoothGattDescriptor.ENABLE_NOTIFICATION_VALUE);
                bluetoothGatt.writeDescriptor(descriptor);
                i.this.G(4000);
                i.this.i(true);
            }
            if (i.f22446r) {
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
                s3.b.b("PTTDevice", sb2.toString());
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, BluetoothDevice bluetoothDevice) {
        super(l1.W(bluetoothDevice.getAddress()));
        rd.m.e(context, "context");
        rd.m.e(bluetoothDevice, "bdDevice");
        this.f22451c = bluetoothDevice;
        this.f22452d = new p4.c(this.f22426a, 1);
        this.f22453e = new p4.c(this.f22426a, 2);
        this.f22454f = new p4.c(this.f22426a, 3);
        this.f22455g = new p4.c(this.f22426a, 4);
        this.f22456h = new Handler(Looper.getMainLooper());
        this.f22457i = context.getApplicationContext();
        this.f22461m = new Runnable() { // from class: n4.f
            @Override // java.lang.Runnable
            public final void run() {
                i.z(this.f22441a);
            }
        };
        this.f22462n = new b();
        this.f22464p = new Runnable() { // from class: n4.g
            @Override // java.lang.Runnable
            public final void run() {
                i.C(this.f22442a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(i iVar) {
        if (iVar.h()) {
            return;
        }
        iVar.y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void D() {
        try {
            if (this.f22463o) {
                return;
            }
            BluetoothGatt bluetoothGatt = this.f22458j;
            if (bluetoothGatt != null) {
                bluetoothGatt.close();
            }
            i(false);
            this.f22458j = this.f22451c.connectGatt(this.f22457i, true, this.f22462n);
            this.f22456h.removeCallbacks(this.f22464p);
            this.f22456h.postDelayed(this.f22464p, 30000L);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(boolean z10, i iVar) {
        if (z10) {
            mi.c.e().m(iVar.f22454f);
        } else {
            mi.c.e().m(iVar.f22455g);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(final boolean z10) {
        if (z10 == this.f22459k) {
            return;
        }
        this.f22459k = z10;
        this.f22456h.post(new Runnable() { // from class: n4.h
            @Override // java.lang.Runnable
            public final void run() {
                i.n(z10, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(int i10) {
        s3.b.b("PTTDevice", "startDisconnectedCheck");
        this.f22460l = false;
        this.f22456h.removeCallbacks(this.f22461m);
        this.f22456h.postDelayed(this.f22461m, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(boolean z10, i iVar) {
        if (z10) {
            mi.c.e().m(iVar.f22452d);
        } else {
            mi.c.e().m(iVar.f22453e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(i iVar) {
        if (iVar.f22460l) {
            return;
        }
        s3.b.b("PTTDevice", "等待超时");
        iVar.D();
    }

    public final BluetoothDevice A() {
        return this.f22451c;
    }

    public final boolean B() {
        return this.f22459k;
    }

    @Override // n4.a
    public synchronized void a() {
        i(false);
        this.f22463o = true;
        BluetoothGatt bluetoothGatt = this.f22458j;
        if (bluetoothGatt != null) {
            bluetoothGatt.close();
        }
    }

    @Override // n4.a
    public String b() {
        String address = this.f22451c.getAddress();
        rd.m.d(address, "getAddress(...)");
        return address;
    }

    @Override // n4.a
    public BluetoothDevice c() {
        return this.f22451c;
    }

    @Override // n4.a
    public String d() {
        String strW = Cfg.w(this.f22451c);
        rd.m.d(strW, "getDevName(...)");
        if (strW.length() > 0) {
            return strW;
        }
        String strC = m3.a.c(this.f22451c);
        rd.m.d(strC, "getNameOrAddress(...)");
        return strC;
    }

    @Override // n4.a
    public String e() {
        if (this.f22459k) {
            String string = Main.f5555g.getString(R.string.pressed);
            rd.m.d(string, "getString(...)");
            return string;
        }
        if (h()) {
            String string2 = Main.f5555g.getString(R.string.connected);
            rd.m.d(string2, "getString(...)");
            return string2;
        }
        String address = this.f22451c.getAddress();
        rd.m.d(address, "getAddress(...)");
        return address;
    }

    @Override // n4.a
    public int f() {
        return R.drawable.ic_ptt_24dp;
    }

    @Override // n4.a
    public int g() {
        return h() ? R.drawable.ic_ptt_24dp : R.drawable.baseline_motion_photos_ptt_off_24;
    }

    @Override // n4.a
    protected void i(final boolean z10) {
        if (!z10) {
            F(false);
        }
        if (z10 == h()) {
            return;
        }
        super.i(z10);
        this.f22456h.post(new Runnable() { // from class: n4.e
            @Override // java.lang.Runnable
            public final void run() {
                i.E(z10, this);
            }
        });
    }

    public final void y() {
        if (h()) {
            return;
        }
        D();
    }
}
