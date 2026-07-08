package com.dw.ht.fragments;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c6.m;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.fragments.h;
import java.util.Set;
import s4.f0;
import s4.f1;
import v4.l1;
import v4.o;

/* JADX INFO: loaded from: classes.dex */
public class DeviceScanFragment extends f0 {
    private BluetoothAdapter H0;
    private boolean I0;
    private Handler J0;
    private h L0;
    private TextView N0;
    private ProgressBar O0;
    private e K0 = new a();
    private BluetoothAdapter.LeScanCallback M0 = new b();
    private final Runnable P0 = new c();
    private final Runnable Q0 = new d();

    class a implements e {
        a() {
        }

        @Override // com.dw.ht.fragments.DeviceScanFragment.e
        public void a(h.a aVar) {
            if (aVar.f6261b == 65504) {
                n4.b.c().a(aVar.f6260a);
                DeviceScanFragment.this.e1().finish();
            } else {
                DeviceFragment.j5(DeviceScanFragment.this.k1(), null, f1.class, l1.W(aVar.f6260a.getAddress()));
                DeviceScanFragment.this.e1().finish();
            }
        }
    }

    class b implements BluetoothAdapter.LeScanCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set f6164a;

        class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BluetoothDevice f6166a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f6167b;

            a(BluetoothDevice bluetoothDevice, int i10) {
                this.f6166a = bluetoothDevice;
                this.f6167b = i10;
            }

            @Override // java.lang.Runnable
            public void run() {
                DeviceScanFragment.this.L0.E(new h.a(this.f6166a, this.f6167b));
            }
        }

        b() {
        }

        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
            if (Cfg.f5476a) {
                s3.b.b("DeviceScanFragment", bluetoothDevice.toString());
            }
            int iZ2 = o.Z2(bArr);
            if (iZ2 != 34977) {
                return;
            }
            if (this.f6164a == null) {
                this.f6164a = Cfg.p(true);
            }
            if (this.f6164a.contains(bluetoothDevice.getAddress())) {
                return;
            }
            DeviceScanFragment.this.J0.post(new a(bluetoothDevice, iZ2));
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (DeviceScanFragment.this.I0) {
                DeviceScanFragment.this.H0.stopLeScan(DeviceScanFragment.this.M0);
                if (DeviceScanFragment.this.H0.startLeScan(null, DeviceScanFragment.this.M0)) {
                    DeviceScanFragment.this.J0.postDelayed(this, 5000L);
                } else {
                    DeviceScanFragment.this.P4(false);
                }
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            DeviceScanFragment.this.P4(false);
        }
    }

    public interface e {
        void a(h.a aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void P4(boolean z10) {
        if (this.H0 == null || this.I0 == z10) {
            return;
        }
        this.J0.removeCallbacks(this.Q0);
        this.J0.removeCallbacks(this.P0);
        if (z10) {
            this.L0.F();
            this.J0.postDelayed(this.Q0, 60000L);
            if (this.H0.startLeScan(null, this.M0)) {
                this.I0 = true;
                Q4(N1(R.string.scanning));
                this.J0.postDelayed(this.P0, 5000L);
            } else {
                this.I0 = false;
                if (this.H0.isEnabled()) {
                    Q4(N1(R.string.unknownError));
                } else {
                    Q4(N1(R.string.bluetooth_is_off));
                }
            }
            this.O0.setVisibility(0);
        } else {
            this.I0 = false;
            this.H0.stopLeScan(this.M0);
            Q4("");
            this.O0.setVisibility(4);
        }
        a4();
    }

    @Override // s4.f0
    /* JADX INFO: renamed from: C4 */
    public boolean getRequireBleScan() {
        return true;
    }

    @Override // s4.f0
    /* JADX INFO: renamed from: D4 */
    public boolean getRequireBluetooth() {
        return true;
    }

    @Override // s4.f0
    protected void E4() {
        P4(true);
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.scan) {
            P4(true);
            return true;
        }
        if (itemId != R.id.stop) {
            return super.F2(menuItem);
        }
        P4(false);
        return true;
    }

    @Override // androidx.fragment.app.o
    public void J2(Menu menu) {
        super.J2(menu);
        menu.findItem(R.id.scan).setVisible(!this.I0);
        menu.findItem(R.id.stop).setVisible(this.I0);
    }

    public void Q4(String str) {
        this.N0.setText(str);
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        this.J0 = new Handler();
        y4(R.string.bindNewDevice);
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater menuInflater) {
        super.u2(menu, menuInflater);
        menuInflater.inflate(R.menu.device_manager, menu);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        G3(true);
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_list, viewGroup, false);
        this.N0 = (TextView) viewInflate.findViewById(R.id.status);
        this.O0 = (ProgressBar) viewInflate.findViewById(R.id.progressBar);
        this.H0 = BluetoothAdapter.getDefaultAdapter();
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewInflate.getContext()));
        recyclerView.l(new m(k1(), 0));
        h hVar = new h(null, this.K0);
        this.L0 = hVar;
        recyclerView.setAdapter(hVar);
        P4(true);
        return viewInflate;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void w2() {
        super.w2();
        P4(false);
    }
}
