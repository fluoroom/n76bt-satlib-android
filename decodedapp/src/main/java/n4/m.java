package n4;

import android.app.Application;
import android.content.Intent;
import android.hardware.usb.UsbDevice;
import android.hardware.usb.UsbManager;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import v4.g2;
import v4.l1;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f22489a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Application f22490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f22491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static UsbManager f22492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static UsbDevice f22493e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22494a = new a("Attached", 0);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f22495b = new a("Detached", 1);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ a[] f22496c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ kd.a f22497d;

        static {
            a[] aVarArrA = a();
            f22496c = aVarArrA;
            f22497d = kd.b.a(aVarArrA);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] a() {
            return new a[]{f22494a, f22495b};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f22496c.clone();
        }
    }

    private m() {
    }

    private final UsbDevice a() {
        UsbManager usbManager = f22492d;
        if (usbManager == null) {
            rd.m.o("manager");
            usbManager = null;
        }
        HashMap<String, UsbDevice> deviceList = usbManager.getDeviceList();
        for (String str : deviceList.keySet()) {
            UsbDevice usbDevice = deviceList.get(str);
            if (usbDevice != null && e(usbDevice)) {
                s3.b.b("USBHTDevice", str + usbDevice);
                return usbDevice;
            }
        }
        s3.b.b("USBHTDevice", "has no Device");
        return null;
    }

    public static final void c(Application application) {
        rd.m.e(application, "app");
        f22490b = application;
        Object systemService = application.getSystemService("usb");
        rd.m.c(systemService, "null cannot be cast to non-null type android.hardware.usb.UsbManager");
        f22492d = (UsbManager) systemService;
        UsbDevice usbDeviceA = f22489a.a();
        f22493e = usbDeviceA;
        h(usbDeviceA != null);
        if (f22493e != null) {
            l1 l1VarY = u.w().y(281474976710910L);
            rd.m.b(l1VarY);
            l1VarY.v(false);
            l1VarY.L(false);
        }
    }

    public static final boolean d() {
        return f22491c;
    }

    private final boolean e(UsbDevice usbDevice) {
        return (usbDevice.getVendorId() == 2578 && usbDevice.getProductId() == 47617) || f(usbDevice);
    }

    public static final void g(Intent intent) throws IOException {
        rd.m.e(intent, "intent");
        UsbDevice usbDevice = (UsbDevice) intent.getParcelableExtra("device");
        if (usbDevice != null && f22489a.e(usbDevice)) {
            s3.b.b("USBHTDevice", "action:" + intent.getAction() + ";dev:" + usbDevice);
            String action = intent.getAction();
            if (action != null) {
                int iHashCode = action.hashCode();
                if (iHashCode == -2114103349) {
                    if (action.equals("android.hardware.usb.action.USB_DEVICE_ATTACHED")) {
                        f22493e = usbDevice;
                        h(true);
                        l1 l1VarY = u.w().y(281474976710910L);
                        rd.m.b(l1VarY);
                        l1VarY.v(false);
                        l1VarY.L(false);
                        u.w().G(l1VarY);
                        return;
                    }
                    return;
                }
                if (iHashCode == -1608292967 && action.equals("android.hardware.usb.action.USB_DEVICE_DETACHED")) {
                    if (rd.m.a(usbDevice, f22493e)) {
                        f22493e = null;
                        h(false);
                    }
                    Collection<l1> collectionA = u.w().A();
                    rd.m.d(collectionA, "getLinks(...)");
                    for (l1 l1Var : collectionA) {
                        if (l1Var instanceof g2) {
                            ((g2) l1Var).h(false);
                        }
                    }
                }
            }
        }
    }

    public static final void h(boolean z10) {
        if (z10 == f22491c) {
            return;
        }
        f22491c = z10;
        if (z10) {
            mi.c.e().m(a.f22494a);
        } else {
            mi.c.e().m(a.f22495b);
        }
    }

    public final UsbDevice b(long j10) {
        return f22493e;
    }

    public final boolean f(UsbDevice usbDevice) {
        rd.m.e(usbDevice, "dev");
        return usbDevice.getVendorId() == 1155 && usbDevice.getProductId() == 22359;
    }
}
