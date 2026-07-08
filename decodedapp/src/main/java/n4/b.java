package n4;

import a6.o;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import v4.i0;
import v4.l1;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f22428d = "b";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static b f22429e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f22430a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashMap f22431b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private l1 f22432c;

    public enum a {
        OnDeviceListChanged
    }

    private b(Context context) {
        this.f22430a = context.getApplicationContext();
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null) {
            Iterator it = Cfg.q(true).iterator();
            while (it.hasNext()) {
                a(defaultAdapter.getRemoteDevice((String) it.next()));
            }
            Iterator it2 = Cfg.o(0, "dev.bound.hm.ble").iterator();
            while (it2.hasNext()) {
                BluetoothDevice remoteDevice = defaultAdapter.getRemoteDevice((String) it2.next());
                i0.P(remoteDevice, remoteDevice).B();
            }
        }
    }

    public static b c() {
        if (f22429e == null) {
            synchronized (b.class) {
                try {
                    if (f22429e == null) {
                        f22429e = new b(Main.f5555g);
                    }
                } finally {
                }
            }
        }
        return f22429e;
    }

    public static void d() {
        mi.c.e().q(c());
    }

    public void a(BluetoothDevice bluetoothDevice) {
        i iVar = (i) this.f22431b.get(Long.valueOf(l1.W(bluetoothDevice.getAddress())));
        if (iVar != null) {
            iVar.a();
        }
        Cfg.e(bluetoothDevice.getAddress());
        i iVar2 = new i(this.f22430a, bluetoothDevice);
        iVar2.y();
        this.f22431b.put(Long.valueOf(iVar2.f22426a), iVar2);
        mi.c.e().m(a.OnDeviceListChanged);
    }

    public ArrayList b() {
        ArrayList arrayListB = o.b((n4.a[]) this.f22431b.values().toArray(new i[0]));
        arrayListB.addAll(i0.H());
        return arrayListB;
    }

    public void e(n4.a aVar) {
        if (aVar instanceof c) {
            i0.b0((c) aVar);
            mi.c.e().m(a.OnDeviceListChanged);
            return;
        }
        n4.a aVar2 = (n4.a) this.f22431b.remove(Long.valueOf(aVar.f22426a));
        aVar.a();
        if (aVar2 != aVar && aVar2 != null) {
            aVar2.a();
        }
        BluetoothDevice bluetoothDeviceC = aVar.c();
        if (bluetoothDeviceC != null) {
            m3.a.e(bluetoothDeviceC);
        }
        mi.c.e().m(a.OnDeviceListChanged);
    }

    public void f(l1 l1Var) {
        l1 l1Var2 = this.f22432c;
        if (l1Var2 != null && l1Var != l1Var2) {
            l1Var2.p1();
        }
        this.f22432c = l1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r0.q0() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
    
        if (1 == r4.f23908b) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0096, code lost:
    
        r4 = r3.f22432c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0098, code lost:
    
        if (r4 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x009a, code lost:
    
        r4.p1();
        r3.f22432c = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a0, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:?, code lost:
    
        return;
     */
    @mi.m(threadMode = org.greenrobot.eventbus.ThreadMode.POSTING)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onMessageEvent(p4.c r4) {
        /*
            r3 = this;
            java.lang.String r0 = n4.b.f22428d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "ptt event:"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            s3.b.b(r0, r1)
            int r0 = r4.f23908b
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L20
            if (r0 == r1) goto L20
            goto La0
        L20:
            android.bluetooth.BluetoothDevice r0 = r4.f23909c
            if (r0 != 0) goto L3e
            com.dw.ht.Cfg$Settings r0 = com.dw.ht.Cfg.O()
            boolean r0 = r0.getPttLock()
            if (r0 == 0) goto L3e
            int r0 = r4.f23908b
            if (r1 != r0) goto L33
            goto La0
        L33:
            v4.l1 r0 = r3.f22432c
            if (r0 == 0) goto L42
            boolean r0 = r0.q0()
            if (r0 != 0) goto L96
            goto L42
        L3e:
            int r0 = r4.f23908b
            if (r2 != r0) goto L96
        L42:
            com.dw.ht.o r0 = com.dw.ht.o.d()
            com.dw.ht.m0 r0 = r0.h()
            com.dw.ht.o r1 = com.dw.ht.o.d()
            android.content.Context r1 = r1.e()
            r0.h(r1)
            v4.u r0 = v4.u.w()
            v4.l1 r0 = r0.r()
            if (r0 != 0) goto L60
            goto La0
        L60:
            android.bluetooth.BluetoothDevice r4 = r4.f23909c     // Catch: java.lang.IllegalStateException -> L7c
            p3.b$a r4 = r0.o1(r4)     // Catch: java.lang.IllegalStateException -> L7c
            if (r4 == 0) goto L7e
            r3.f22432c = r0     // Catch: java.lang.IllegalStateException -> L7c
            android.content.Context r4 = r3.f22430a     // Catch: java.lang.IllegalStateException -> L7c
            java.lang.String r0 = "vibrator"
            java.lang.Object r4 = r4.getSystemService(r0)     // Catch: java.lang.IllegalStateException -> L7c
            android.os.Vibrator r4 = (android.os.Vibrator) r4     // Catch: java.lang.IllegalStateException -> L7c
            if (r4 == 0) goto La0
            r0 = 25
            r4.vibrate(r0)     // Catch: java.lang.IllegalStateException -> L7c
            return
        L7c:
            r4 = move-exception
            goto L88
        L7e:
            boolean r4 = r0.i()     // Catch: java.lang.IllegalStateException -> L7c
            if (r4 != 0) goto La0
            r0.L(r2)     // Catch: java.lang.IllegalStateException -> L7c
            return
        L88:
            com.dw.ht.Main r0 = com.dw.ht.Main.f5555g
            java.lang.String r4 = r4.getLocalizedMessage()
            android.widget.Toast r4 = android.widget.Toast.makeText(r0, r4, r2)
            r4.show()
            return
        L96:
            v4.l1 r4 = r3.f22432c
            if (r4 == 0) goto La0
            r4.p1()
            r4 = 0
            r3.f22432c = r4
        La0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n4.b.onMessageEvent(p4.c):void");
    }
}
