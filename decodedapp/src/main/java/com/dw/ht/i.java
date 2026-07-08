package com.dw.ht;

import android.bluetooth.BluetoothA2dp;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f6303b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f6305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static long f6306e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f6308g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f6302a = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b f6304c = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Object f6307f = new Object();

    public static final class a implements BluetoothProfile.ServiceListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ BluetoothAdapter f6309a;

        a(BluetoothAdapter bluetoothAdapter) {
            this.f6309a = bluetoothAdapter;
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceConnected(int i10, BluetoothProfile bluetoothProfile) {
            BluetoothA2dp bluetoothA2dp = bluetoothProfile instanceof BluetoothA2dp ? (BluetoothA2dp) bluetoothProfile : null;
            if (bluetoothA2dp == null) {
                return;
            }
            Iterator<BluetoothDevice> it = this.f6309a.getBondedDevices().iterator();
            while (it.hasNext()) {
                if (bluetoothA2dp.isA2dpPlaying(it.next())) {
                    i.f6302a.f(true);
                    return;
                }
            }
        }

        @Override // android.bluetooth.BluetoothProfile.ServiceListener
        public void onServiceDisconnected(int i10) {
        }
    }

    public static final class b extends BroadcastReceiver {
        b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            rd.m.e(context, "context");
            rd.m.e(intent, "intent");
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -855499628) {
                    if (action.equals("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED")) {
                        i.f6302a.f(intent.getIntExtra("android.bluetooth.profile.extra.STATE", 11) == 10);
                        return;
                    }
                    return;
                }
                if (iHashCode == 1244161670 && action.equals("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED")) {
                    BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                    i iVar = i.f6302a;
                    if (defaultAdapter != null && 2 == defaultAdapter.getProfileConnectionState(1)) {
                        z = true;
                    }
                    iVar.e(z);
                }
            }
        }
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e(boolean z10) {
        if (z10 == f6305d) {
            return;
        }
        f6305d = z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f(boolean z10) {
        if (z10 == f6308g) {
            return;
        }
        f6308g = z10;
        if (z10) {
            Object obj = f6307f;
            synchronized (obj) {
                obj.notifyAll();
                dd.d0 d0Var = dd.d0.f10897a;
            }
            f6306e = SystemClock.elapsedRealtime();
        }
    }

    public final boolean c() {
        return f6305d;
    }

    public final synchronized void d(Context context) {
        rd.m.e(context, "context");
        if (f6303b) {
            return;
        }
        boolean z10 = true;
        f6303b = true;
        Context applicationContext = context.getApplicationContext();
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.a2dp.profile.action.CONNECTION_STATE_CHANGED");
        intentFilter.addAction("android.bluetooth.a2dp.profile.action.PLAYING_STATE_CHANGED");
        b0.b.j(applicationContext, f6304c, intentFilter, 2);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return;
        }
        if (defaultAdapter.isEnabled()) {
            if (m3.a.d()) {
                if (2 != defaultAdapter.getProfileConnectionState(1)) {
                    z10 = false;
                }
                e(z10);
                defaultAdapter.getProfileProxy(applicationContext, new a(defaultAdapter), 2);
            }
        }
    }

    public final boolean g(long j10) {
        if (f6308g) {
            return true;
        }
        Object obj = f6307f;
        synchronized (obj) {
            if (f6308g) {
                return true;
            }
            obj.wait(j10);
            dd.d0 d0Var = dd.d0.f10897a;
            return f6308g;
        }
    }
}
