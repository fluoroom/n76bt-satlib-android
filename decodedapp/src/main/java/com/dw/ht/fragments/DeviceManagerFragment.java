package com.dw.ht.fragments;

import a6.q;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.ht.fragments.DeviceManagerFragment;
import kotlin.Metadata;
import m4.e0;
import org.greenrobot.eventbus.ThreadMode;
import rd.m;
import s4.f0;
import s4.y1;
import v4.i0;
import v4.l1;
import v4.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¹\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001]\u0018\u0000 e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001fB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u0005J!\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0005J\u0017\u0010&\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0014¢\u0006\u0004\b*\u0010\u0005J\u000f\u0010+\u001a\u00020\bH\u0016¢\u0006\u0004\b+\u0010\u0005J\u000f\u0010,\u001a\u00020\bH\u0016¢\u0006\u0004\b,\u0010\u0005J\u0017\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b/\u00100J\u0017\u0010/\u001a\u00020\b2\u0006\u0010.\u001a\u000201H\u0007¢\u0006\u0004\b/\u00102J\u001f\u00105\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00032\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010>\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0017\u0010D\u001a\u00020?8\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010J\u001a\u00020E8\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u0016\u0010Q\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0018\u0010T\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010X\u001a\u00020U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\\\u001a\u00020Y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u0014\u0010`\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010d\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006g"}, d2 = {"Lcom/dw/ht/fragments/DeviceManagerFragment;", "Ls4/f0;", "Lc6/i;", "Landroid/bluetooth/BluetoothDevice;", "<init>", "()V", "", "enable", "Ldd/d0;", "X4", "(Z)V", "", "m", "Y4", "(Ljava/lang/String;)V", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "w2", "Landroid/view/MenuItem;", "item", "F2", "(Landroid/view/MenuItem;)Z", "J2", "(Landroid/view/Menu;)V", "E4", "O2", "P2", "Lp4/c;", "event", "onMessageEvent", "(Lp4/c;)V", "Lv4/i0$b;", "(Lv4/i0$b;)V", "", "action", "W4", "(Landroid/bluetooth/BluetoothDevice;I)Z", "", "H0", "J", "SCAN_PERIOD", "Lm4/e0;", "I0", "Lm4/e0;", "binding", "Landroid/os/Handler;", "J0", "Landroid/os/Handler;", "S4", "()Landroid/os/Handler;", "mHandler", "Ls4/y1;", "K0", "Ls4/y1;", "R4", "()Ls4/y1;", "adapter", "Landroid/bluetooth/BluetoothAdapter;", "L0", "Landroid/bluetooth/BluetoothAdapter;", "mBluetoothAdapter", "M0", "Z", "mScanning", "N0", "Landroid/bluetooth/BluetoothDevice;", "inBondDevice", "Landroid/content/BroadcastReceiver;", "O0", "Landroid/content/BroadcastReceiver;", "mBondStateChangedReceiver", "Landroid/bluetooth/BluetoothAdapter$LeScanCallback;", "P0", "Landroid/bluetooth/BluetoothAdapter$LeScanCallback;", "mLeScanCallback", "com/dw/ht/fragments/DeviceManagerFragment$c", "Q0", "Lcom/dw/ht/fragments/DeviceManagerFragment$c;", "mScan", "Ljava/lang/Runnable;", "R0", "Ljava/lang/Runnable;", "mStopScan", "S0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceManagerFragment extends f0 implements c6.i {

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private e0 binding;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private BluetoothAdapter mBluetoothAdapter;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private boolean mScanning;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private BluetoothDevice inBondDevice;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private final BroadcastReceiver mBondStateChangedReceiver;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private final BluetoothAdapter.LeScanCallback mLeScanCallback;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private final c mScan;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private final Runnable mStopScan;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private final long SCAN_PERIOD = 60000;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private final Handler mHandler = new Handler();

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private final y1 adapter = new y1(this);

    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            m.e(context, "context");
            m.e(intent, "intent");
            if (DeviceManagerFragment.this.inBondDevice == null || (bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE")) == null) {
                return;
            }
            BluetoothDevice bluetoothDevice2 = DeviceManagerFragment.this.inBondDevice;
            if (q.d(bluetoothDevice2 != null ? bluetoothDevice2.getAddress() : null, bluetoothDevice.getAddress())) {
                int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PREVIOUS_BOND_STATE", 0);
                int intExtra2 = intent.getIntExtra("android.bluetooth.device.extra.BOND_STATE", 0);
                s3.b.b("DeviceManager", "state:" + intExtra + "->" + intExtra2);
                if (intExtra2 == 12) {
                    DeviceManagerFragment.this.X4(false);
                    n4.b.c().a(bluetoothDevice);
                    DeviceManagerFragment.this.getAdapter().L(l1.W(bluetoothDevice.getAddress()));
                }
            }
        }
    }

    public static final class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DeviceManagerFragment.this.mScanning) {
                BluetoothAdapter bluetoothAdapter = DeviceManagerFragment.this.mBluetoothAdapter;
                if (bluetoothAdapter != null && !bluetoothAdapter.isEnabled()) {
                    DeviceManagerFragment.this.X4(false);
                    return;
                }
                BluetoothAdapter bluetoothAdapter2 = DeviceManagerFragment.this.mBluetoothAdapter;
                if (bluetoothAdapter2 != null) {
                    bluetoothAdapter2.stopLeScan(DeviceManagerFragment.this.mLeScanCallback);
                }
                BluetoothAdapter bluetoothAdapter3 = DeviceManagerFragment.this.mBluetoothAdapter;
                if (bluetoothAdapter3 == null || bluetoothAdapter3.startLeScan(null, DeviceManagerFragment.this.mLeScanCallback)) {
                    DeviceManagerFragment.this.getMHandler().postDelayed(this, 5000L);
                } else {
                    DeviceManagerFragment.this.X4(false);
                }
            }
        }
    }

    public DeviceManagerFragment() {
        I4(true);
        H4(true);
        this.mBondStateChangedReceiver = new b();
        this.mLeScanCallback = new BluetoothAdapter.LeScanCallback() { // from class: s4.v1
            @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
            public final void onLeScan(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
                DeviceManagerFragment.T4(this.f26808a, bluetoothDevice, i10, bArr);
            }
        };
        this.mScan = new c();
        this.mStopScan = new Runnable() { // from class: s4.w1
            @Override // java.lang.Runnable
            public final void run() {
                DeviceManagerFragment.V4(this.f26820a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T4(final DeviceManagerFragment deviceManagerFragment, final BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
        final int iZ2 = o.Z2(bArr);
        final Context contextK1 = deviceManagerFragment.k1();
        if (contextK1 == null) {
            return;
        }
        deviceManagerFragment.mHandler.post(new Runnable() { // from class: s4.x1
            @Override // java.lang.Runnable
            public final void run() {
                DeviceManagerFragment.U4(iZ2, deviceManagerFragment, contextK1, bluetoothDevice);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U4(int i10, DeviceManagerFragment deviceManagerFragment, Context context, BluetoothDevice bluetoothDevice) {
        if (i10 == 16896) {
            y1 y1Var = deviceManagerFragment.adapter;
            m.b(bluetoothDevice);
            y1Var.E(new n4.c(context, bluetoothDevice));
        } else {
            if (i10 != 65504) {
                return;
            }
            y1 y1Var2 = deviceManagerFragment.adapter;
            m.b(bluetoothDevice);
            y1Var2.E(new n4.i(context, bluetoothDevice));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V4(DeviceManagerFragment deviceManagerFragment) {
        deviceManagerFragment.X4(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X4(boolean enable) {
        ProgressBar progressBar;
        ProgressBar progressBar2;
        BluetoothAdapter bluetoothAdapter = this.mBluetoothAdapter;
        if (bluetoothAdapter == null) {
            return;
        }
        boolean z10 = this.binding != null && enable;
        if (this.mScanning == z10) {
            return;
        }
        this.mHandler.removeCallbacks(this.mStopScan);
        this.mHandler.removeCallbacks(this.mScan);
        if (z10 && bluetoothAdapter.isEnabled()) {
            this.mHandler.postDelayed(this.mStopScan, this.SCAN_PERIOD);
            if (bluetoothAdapter.startLeScan(null, this.mLeScanCallback)) {
                this.mScanning = true;
                String strN1 = N1(R.string.scanning);
                m.d(strN1, "getString(...)");
                Y4(strN1);
                this.mHandler.postDelayed(this.mScan, 5000L);
            } else {
                this.mScanning = false;
                String strN12 = N1(R.string.unknownError);
                m.d(strN12, "getString(...)");
                Y4(strN12);
            }
            e0 e0Var = this.binding;
            if (e0Var != null && (progressBar2 = e0Var.f21098c) != null) {
                progressBar2.setVisibility(0);
            }
        } else {
            this.mScanning = false;
            if (bluetoothAdapter.isEnabled()) {
                bluetoothAdapter.stopLeScan(this.mLeScanCallback);
            }
            if (bluetoothAdapter.isEnabled() || !z10) {
                Y4("");
            } else {
                String strN13 = N1(R.string.bluetooth_is_off);
                m.d(strN13, "getString(...)");
                Y4(strN13);
            }
            e0 e0Var2 = this.binding;
            if (e0Var2 != null && (progressBar = e0Var2.f21098c) != null) {
                progressBar.setVisibility(4);
            }
        }
        a4();
    }

    private final void Y4(String m10) {
        TextView textView;
        e0 e0Var = this.binding;
        if (e0Var == null || (textView = e0Var.f21099d) == null) {
            return;
        }
        textView.setText(m10);
    }

    @Override // s4.f0
    protected void E4() {
        X4(true);
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        m.e(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.scan) {
            X4(true);
            return true;
        }
        if (itemId != R.id.stop) {
            return super.F2(item);
        }
        X4(false);
        return true;
    }

    @Override // androidx.fragment.app.o
    public void J2(Menu menu) {
        m.e(menu, "menu");
        super.J2(menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.scan);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(!this.mScanning);
        }
        MenuItem menuItemFindItem2 = menu.findItem(R.id.stop);
        if (menuItemFindItem2 != null) {
            menuItemFindItem2.setVisible(this.mScanning);
        }
    }

    @Override // androidx.fragment.app.o
    public void O2() {
        super.O2();
        this.adapter.K();
        mi.c.e().q(this);
    }

    @Override // androidx.fragment.app.o
    public void P2() {
        super.P2();
        mi.c.e().t(this);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        m.e(view, "view");
        super.Q2(view, savedInstanceState);
        e0 e0Var = this.binding;
        if (e0Var == null) {
            return;
        }
        RecyclerView recyclerView = e0Var.f21097b;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.l(new c6.m(recyclerView.getContext(), 0));
        e0Var.f21097b.setAdapter(this.adapter);
        X4(true);
    }

    /* JADX INFO: renamed from: R4, reason: from getter */
    public final y1 getAdapter() {
        return this.adapter;
    }

    /* JADX INFO: renamed from: S4, reason: from getter */
    public final Handler getMHandler() {
        return this.mHandler;
    }

    @Override // c6.i
    /* JADX INFO: renamed from: W4, reason: merged with bridge method [inline-methods] */
    public boolean V0(BluetoothDevice item, int action) {
        m.e(item, "item");
        X4(false);
        long jW = l1.W(item.getAddress());
        if (item.getBondState() == 12) {
            n4.b.c().a(item);
            this.adapter.L(jW);
            return true;
        }
        if (item.createBond()) {
            this.inBondDevice = item;
            this.adapter.M(Long.valueOf(jW));
            s3.b.b("DeviceManager", "createBond OK");
        } else {
            s3.b.b("DeviceManager", "createBond ERR");
        }
        return true;
    }

    @mi.m(priority = 1, threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(p4.c event) {
        m.e(event, "event");
        this.adapter.k();
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        G3(true);
        this.mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        b0.b.j(x3(), this.mBondStateChangedReceiver, new IntentFilter("android.bluetooth.device.action.BOND_STATE_CHANGED"), 2);
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        m.e(menu, "menu");
        m.e(inflater, "inflater");
        super.u2(menu, inflater);
        inflater.inflate(R.menu.device_manager, menu);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.e(inflater, "inflater");
        y4(R.string.deviceList);
        e0 e0VarC = e0.c(inflater, container, false);
        this.binding = e0VarC;
        m.b(e0VarC);
        LinearLayout linearLayoutB = e0VarC.b();
        m.d(linearLayoutB, "getRoot(...)");
        return linearLayoutB;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void w2() {
        super.w2();
        x3().unregisterReceiver(this.mBondStateChangedReceiver);
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        X4(false);
        this.binding = null;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(i0.b event) {
        m.e(event, "event");
        s3.b.b("DeviceManager", "HMLink.Event:" + event.name());
        if (event == i0.b.f29899a) {
            this.adapter.k();
        }
    }
}
