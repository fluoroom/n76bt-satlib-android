package com.dw.ht.activitys;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanResult;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.activitys.NewDeviceActivity;
import com.dw.ht.fragments.DeviceFragment;
import java.util.HashMap;
import java.util.Set;
import kotlin.Metadata;
import m4.f;
import rd.h;
import rd.m;
import s4.f1;
import v3.j;
import v4.l1;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b*\u0001\u0014\u0018\u0000 !2\u00020\u0001:\u0001\"B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R.\u0010 \u001a\u0004\u0018\u00010\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/dw/ht/activitys/NewDeviceActivity;", "Landroidx/appcompat/app/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "onResume", "onPause", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lm4/f;", "M", "Lm4/f;", "binding", "com/dw/ht/activitys/NewDeviceActivity$b", "N", "Lcom/dw/ht/activitys/NewDeviceActivity$b;", "checkLost", "Landroid/bluetooth/BluetoothDevice;", "value", "O", "Landroid/bluetooth/BluetoothDevice;", "t1", "()Landroid/bluetooth/BluetoothDevice;", "x1", "(Landroid/bluetooth/BluetoothDevice;)V", "device", "P", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class NewDeviceActivity extends androidx.appcompat.app.d {

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static String Q = "NewDeviceActivity";
    private static final HashMap R = new HashMap();
    private static BluetoothDevice S;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private f binding;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final b checkLost = new b();

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private BluetoothDevice device;

    /* JADX INFO: renamed from: com.dw.ht.activitys.NewDeviceActivity$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(h hVar) {
            this();
        }

        public final HashMap a() {
            return NewDeviceActivity.R;
        }

        public final BluetoothDevice b() {
            return NewDeviceActivity.S;
        }

        public final String c() {
            return NewDeviceActivity.Q;
        }

        public final void d(BluetoothDevice bluetoothDevice) {
            m.e(bluetoothDevice, "device");
            String address = bluetoothDevice.getAddress();
            BluetoothDevice bluetoothDeviceB = b();
            if (m.a(address, bluetoothDeviceB != null ? bluetoothDeviceB.getAddress() : null)) {
                return;
            }
            String strC = c();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("onNewDevice ");
            BluetoothDevice bluetoothDeviceB2 = b();
            sb2.append(bluetoothDeviceB2 != null ? bluetoothDeviceB2.getAddress() : null);
            sb2.append("=>");
            sb2.append(bluetoothDevice.getAddress());
            s3.b.b(strC, sb2.toString());
            Long l10 = (Long) a().get(bluetoothDevice.getAddress());
            if (l10 == null || SystemClock.elapsedRealtime() >= l10.longValue()) {
                Set setP = Cfg.p(true);
                m.d(setP, "getBondedDev(...)");
                if (setP.contains(bluetoothDevice.getAddress())) {
                    a().put(bluetoothDevice.getAddress(), Long.valueOf(SystemClock.elapsedRealtime() + 30000));
                    return;
                }
                Intent intent = new Intent(Main.f5555g, (Class<?>) NewDeviceActivity.class);
                intent.putExtra("device", bluetoothDevice);
                j.e(Main.f5555g, intent);
            }
        }

        public final void e(BluetoothDevice bluetoothDevice) {
            if (m.a(bluetoothDevice, NewDeviceActivity.S)) {
                return;
            }
            String strC = c();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("showingDevice ");
            BluetoothDevice bluetoothDevice2 = NewDeviceActivity.S;
            sb2.append(bluetoothDevice2 != null ? bluetoothDevice2.getAddress() : null);
            sb2.append("=>");
            sb2.append(bluetoothDevice != null ? bluetoothDevice.getAddress() : null);
            s3.b.b(strC, sb2.toString());
            NewDeviceActivity.S = bluetoothDevice;
        }

        private Companion() {
        }
    }

    public static final class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f fVar = NewDeviceActivity.this.binding;
            if (fVar == null) {
                return;
            }
            fVar.f21114c.postDelayed(this, 1000L);
            HashMap map = u.w().f30158r;
            BluetoothDevice device = NewDeviceActivity.this.getDevice();
            ScanResult scanResult = (ScanResult) map.get(device != null ? device.getAddress() : null);
            if (scanResult == null || SystemClock.elapsedRealtimeNanos() - scanResult.getTimestampNanos() > 10000000000L) {
                NewDeviceActivity.this.finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u1(NewDeviceActivity newDeviceActivity, View view) {
        HashMap map = R;
        BluetoothDevice bluetoothDevice = newDeviceActivity.device;
        map.put(bluetoothDevice != null ? bluetoothDevice.getAddress() : null, Long.valueOf(SystemClock.elapsedRealtime() + 30000));
        newDeviceActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v1(NewDeviceActivity newDeviceActivity, View view) {
        HashMap map = R;
        BluetoothDevice bluetoothDevice = newDeviceActivity.device;
        map.put(bluetoothDevice != null ? bluetoothDevice.getAddress() : null, Long.valueOf(SystemClock.elapsedRealtime() + 60000));
        BluetoothDevice bluetoothDevice2 = newDeviceActivity.device;
        if (bluetoothDevice2 != null) {
            m.b(bluetoothDevice2);
            DeviceFragment.j5(newDeviceActivity, null, f1.class, l1.W(bluetoothDevice2.getAddress()));
        }
        newDeviceActivity.finish();
    }

    public static final void w1(BluetoothDevice bluetoothDevice) {
        INSTANCE.d(bluetoothDevice);
    }

    @Override // androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        s3.b.b(Q, "onCreate");
        super.onCreate(savedInstanceState);
        f fVarC = f.c(getLayoutInflater());
        m.d(fVarC, "inflate(...)");
        setContentView(fVarC.b());
        this.binding = fVarC;
        fVarC.f21113b.setOnClickListener(new View.OnClickListener() { // from class: j4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDeviceActivity.u1(this.f18419a, view);
            }
        });
        fVarC.f21114c.setOnClickListener(new View.OnClickListener() { // from class: j4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NewDeviceActivity.v1(this.f18420a, view);
            }
        });
        x1((BluetoothDevice) b0.d.a(getIntent(), "device", BluetoothDevice.class));
        fVarC.f21114c.postDelayed(this.checkLost, 1000L);
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.binding = null;
    }

    @Override // d.q, android.app.Activity
    protected void onNewIntent(Intent intent) {
        m.e(intent, "intent");
        super.onNewIntent(intent);
        x1((BluetoothDevice) b0.d.a(intent, "device", BluetoothDevice.class));
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onPause() {
        super.onPause();
        s3.b.b(Q, "onPause");
        INSTANCE.e(null);
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onResume() {
        super.onResume();
        s3.b.b(Q, "onResume");
        INSTANCE.e(this.device);
    }

    /* JADX INFO: renamed from: t1, reason: from getter */
    public final BluetoothDevice getDevice() {
        return this.device;
    }

    public final void x1(BluetoothDevice bluetoothDevice) {
        TextView textView;
        INSTANCE.e(bluetoothDevice);
        if (bluetoothDevice == null) {
            finish();
            return;
        }
        if (m.a(this.device, bluetoothDevice)) {
            return;
        }
        this.device = bluetoothDevice;
        f fVar = this.binding;
        if (fVar == null || (textView = fVar.f21115d) == null) {
            return;
        }
        textView.setText(getString(R.string.whetherToBindNewDevice, m3.a.c(bluetoothDevice)));
    }
}
