package com.dw.ht.activitys;

import android.bluetooth.BluetoothAdapter;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Window;
import com.dw.ht.Cfg;
import com.dw.ht.activitys.a;
import io.grpc.stub.j;
import java.security.InvalidParameterException;
import v4.c0;
import v4.i0;
import v4.l1;
import v4.m2;
import v4.n0;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends v3.b implements a.InterfaceC0085a {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    static final boolean f5623o0 = Cfg.f5476a;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private BroadcastReceiver f5624i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    g3.c f5625j0;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    BluetoothAdapter f5626k0;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    protected c0 f5627l0;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    protected m2 f5628m0;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private i0 f5629n0;

    class a implements j {
        a() {
        }

        @Override // io.grpc.stub.j
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onNext(final m2 m2Var) {
            Window window = d.this.getWindow();
            if (window == null) {
                return;
            }
            window.getDecorView().post(new Runnable() { // from class: com.dw.ht.activitys.c
                @Override // java.lang.Runnable
                public final void run() {
                    d.this.c2(m2Var);
                }
            });
        }

        @Override // io.grpc.stub.j
        public void onCompleted() {
        }

        @Override // io.grpc.stub.j
        public void onError(Throwable th2) {
        }
    }

    private void P0() {
        this.f5626k0 = BluetoothAdapter.getDefaultAdapter();
        this.f5624i0 = new com.dw.ht.activitys.a(this);
    }

    private void Y1() {
        BluetoothAdapter bluetoothAdapter = this.f5626k0;
        if (bluetoothAdapter == null || !bluetoothAdapter.isEnabled()) {
            startActivityForResult(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"), 1);
        } else {
            j();
        }
    }

    @Override // com.dw.ht.activitys.a.InterfaceC0085a
    public void O() {
        Y1();
    }

    protected abstract Handler Z1();

    public n0 a2() {
        c0 c0Var = this.f5627l0;
        return c0Var != null ? c0Var : this.f5629n0;
    }

    public void b2(boolean z10, int i10) {
        n0 n0VarA2 = a2();
        if (n0VarA2 == null) {
            return;
        }
        c2(null);
        n0VarA2.d().x(this, z10, i10, com.dw.ht.user.b.f6853a.i(), new a());
    }

    public void c2(m2 m2Var) {
        this.f5628m0 = m2Var;
    }

    @Override // com.dw.ht.activitys.a.InterfaceC0085a
    public void j() {
    }

    @Override // v3.b, androidx.fragment.app.p, d.q, android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 != 1) {
            super.onActivityResult(i10, i11, intent);
        } else if (i11 == -1) {
            j();
        }
    }

    @Override // v3.b, androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        P0();
    }

    @Override // v3.b, v3.i, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        c0 c0Var = this.f5627l0;
        if (c0Var != null) {
            c0Var.H2(null);
        }
        i0 i0Var = this.f5629n0;
        if (i0Var != null) {
            i0Var.d0(null);
        }
    }

    @Override // v3.b, androidx.fragment.app.p, android.app.Activity
    protected void onPause() {
        super.onPause();
        unregisterReceiver(this.f5624i0);
    }

    @Override // v3.b, v3.i, androidx.fragment.app.p, android.app.Activity
    protected void onResume() {
        super.onResume();
        registerReceiver(this.f5624i0, new IntentFilter("android.bluetooth.adapter.action.STATE_CHANGED"));
        Intent intent = getIntent();
        String stringExtra = intent.getStringExtra("EXTRA_BLUETOOTH_DEVICE_ADDRESS");
        if (TextUtils.isEmpty(stringExtra)) {
            throw new InvalidParameterException("必须提供蓝牙地址");
        }
        if (intent.getBooleanExtra("EXTRA_IS_HM", false)) {
            i0 i0VarN = i0.N(l1.W(stringExtra));
            this.f5629n0 = i0VarN;
            g3.c cVarM = i0VarN.M();
            this.f5625j0 = cVarM;
            if (cVarM == null) {
                finish();
                return;
            }
            this.f5629n0.d0(Z1());
        } else {
            c0 c0Var = (c0) u.w().y(l1.W(stringExtra));
            this.f5627l0 = c0Var;
            this.f5625j0 = c0Var.U1();
            this.f5627l0.H2(Z1());
        }
        if (this.f5628m0 == null) {
            b2(false, 0);
        }
    }
}
