package m3;

import a6.s;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.os.Build;
import bj.b;
import com.dw.ht.Main;
import v3.b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static String a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return null;
        }
        try {
            return (String) b.l(b.l(defaultAdapter).h("mService")).b("getAddress").g();
        } catch (Exception e10) {
            e10.printStackTrace();
            try {
                return defaultAdapter.getAddress();
            } catch (Exception e11) {
                e11.printStackTrace();
                return null;
            }
        }
    }

    public static String b(BluetoothDevice bluetoothDevice) {
        try {
            return bluetoothDevice.getName();
        } catch (SecurityException unused) {
            return null;
        }
    }

    public static String c(BluetoothDevice bluetoothDevice) {
        String address;
        try {
            address = bluetoothDevice.getName();
        } catch (SecurityException unused) {
            address = bluetoothDevice.getAddress();
        }
        return address == null ? "" : address;
    }

    public static boolean d() {
        if (Build.VERSION.SDK_INT < 31) {
            return true;
        }
        return b0.a(Main.f5555g, "android.permission.BLUETOOTH_CONNECT");
    }

    public static boolean e(BluetoothDevice bluetoothDevice) {
        try {
            Object objA = s.a(bluetoothDevice, "removeBond");
            if (objA instanceof Boolean) {
                return ((Boolean) objA).booleanValue();
            }
            return false;
        } catch (Exception e10) {
            s3.b.d("BluetoothUtils", e10.getMessage());
            return false;
        }
    }

    public static boolean f(BluetoothDevice bluetoothDevice, String str) {
        try {
        } catch (Exception e10) {
            s3.b.d("BluetoothUtils", e10.getMessage());
        }
        if (Build.VERSION.SDK_INT >= 31) {
            if (!d()) {
                return false;
            }
            bluetoothDevice.setAlias(str);
            return true;
        }
        Object objB = s.b(bluetoothDevice, "setAlias", str, String.class);
        if (objB instanceof Boolean) {
            return ((Boolean) objB).booleanValue();
        }
        return false;
    }
}
