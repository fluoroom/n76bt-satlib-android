package s4;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.android.widget.DWSwitch;
import com.dw.ht.Cfg;
import com.dw.ht.fragments.DeviceFragment;
import com.facebook.stetho.server.http.HttpStatus;
import com.facebook.stetho.websocket.CloseCodes;
import g3.a;
import java.util.HashMap;
import java.util.Locale;
import v4.n0;

/* JADX INFO: loaded from: classes.dex */
public class h1 extends DeviceFragment implements CompoundButton.OnCheckedChangeListener {
    private View P0;
    private DWSwitch Q0;
    private RecyclerView R0;
    private BluetoothAdapter S0;
    private String V0;
    private long W0;
    private String Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private e f26481a1;
    private HashMap U0 = new HashMap();
    private final Runnable X0 = new a();
    private final Runnable Y0 = new Runnable() { // from class: s4.g1
        @Override // java.lang.Runnable
        public final void run() {
            h1.n5(this.f26453a);
        }
    };
    private final c T0 = new c(this, null);

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h1.this.Y4() == null || !h1.this.a2()) {
                return;
            }
            h1.this.Y4().a(v4.v.GET_IN_SCAN, new byte[0]);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f26483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f26484b;

        static {
            int[] iArr = new int[v4.v.values().length];
            f26484b = iArr;
            try {
                iArr[v4.v.EVENT_NOTIFICATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26484b[v4.v.GET_IN_SCAN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26484b[v4.v.GET_TRUSTED_DEVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[v4.x.values().length];
            f26483a = iArr2;
            try {
                iArr2[v4.x.NEW_INQUIRY_DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private class c extends BroadcastReceiver {
        private c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice;
            String action = intent.getAction();
            int iHashCode = action.hashCode();
            if (iHashCode == -1780914469) {
                action.equals("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
                return;
            }
            if (iHashCode == 1167529923 && action.equals("android.bluetooth.device.action.FOUND") && (bluetoothDevice = (BluetoothDevice) intent.getExtras().getParcelable("android.bluetooth.device.extra.DEVICE")) != null) {
                h1.this.U0.put(bluetoothDevice.getAddress(), bluetoothDevice);
                BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
                if (bluetoothClass != null) {
                    int deviceClass = bluetoothClass.getDeviceClass();
                    if (deviceClass == 1028 || deviceClass == 1032 || deviceClass == 1056) {
                        v4.l1 l1VarY4 = h1.this.Y4();
                        if (((l1VarY4 instanceof v4.o) && ((v4.o) l1VarY4).a3().getAddress().equals(bluetoothDevice.getAddress())) || h1.this.f26481a1 == null) {
                            return;
                        }
                        h1.this.f26481a1.Q(h1.this.new g(bluetoothDevice));
                    }
                }
            }
        }

        /* synthetic */ c(h1 h1Var, a aVar) {
            this();
        }
    }

    private class d extends g {
        /* synthetic */ d(h1 h1Var, byte[] bArr, a aVar) {
            this(bArr);
        }

        @Override // s4.h1.g
        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof d)) {
                return super.equals(obj);
            }
            d dVar = (d) obj;
            return this.f26491e == dVar.f26491e && this.f26492f == dVar.f26492f && this.f26493g == dVar.f26493g && this.f26495i == dVar.f26495i && this.f26494h == dVar.f26494h && this.f26496j == dVar.f26496j && a6.q.d(this.f26488b, dVar.f26488b) && a6.q.d(this.f26490d, dVar.f26490d);
        }

        private d(byte[] bArr) {
            super();
            a6.v vVar = new a6.v(bArr);
            vVar.l(8);
            this.f26496j = vVar.i(8);
            this.f26491e = vVar.c();
            this.f26492f = vVar.c();
            this.f26493g = vVar.c();
            this.f26495i = vVar.c();
            this.f26494h = vVar.c();
            vVar.l(24);
            byte[] bArr2 = {vVar.d(), vVar.d(), vVar.d(), vVar.d(), vVar.d(), vVar.d()};
            this.f26487a = bArr2;
            Locale locale = Locale.ENGLISH;
            this.f26490d = String.format(locale, "%02X:%02X:%02X:%02X:%02X:%02X", Byte.valueOf(bArr2[0]), Byte.valueOf(this.f26487a[1]), Byte.valueOf(this.f26487a[2]), Byte.valueOf(this.f26487a[3]), Byte.valueOf(this.f26487a[4]), Byte.valueOf(this.f26487a[5]));
            int iB = vVar.b() / 8;
            if (iB + 17 > bArr.length || bArr[bArr.length - 17] != 0) {
                if (iB < bArr.length) {
                    this.f26488b = new String(bArr, iB, bArr.length - iB);
                }
            } else {
                if (iB < bArr.length - 17) {
                    this.f26488b = new String(bArr, iB, (bArr.length - iB) - 17);
                }
                this.f26489c = String.format(locale, "%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", Byte.valueOf(bArr[bArr.length - 2]), Byte.valueOf(bArr[bArr.length - 1]), Byte.valueOf(bArr[bArr.length - 4]), Byte.valueOf(bArr[bArr.length - 3]), Byte.valueOf(bArr[bArr.length - 6]), Byte.valueOf(bArr[bArr.length - 5]), Byte.valueOf(bArr[bArr.length - 8]), Byte.valueOf(bArr[bArr.length - 7]), Byte.valueOf(bArr[bArr.length - 10]), Byte.valueOf(bArr[bArr.length - 9]), Byte.valueOf(bArr[bArr.length - 12]), Byte.valueOf(bArr[bArr.length - 11]), Byte.valueOf(bArr[bArr.length - 14]), Byte.valueOf(bArr[bArr.length - 13]), Byte.valueOf(bArr[bArr.length - 16]), Byte.valueOf(bArr[bArr.length - 15]));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e extends c6.b {
        private HashMap A;

        public e(Context context) {
            super(context, 0);
            this.A = new HashMap();
            B(true);
        }

        @Override // c6.b
        public void M(int i10) {
            super.M(i10);
            if (i10 >= f() || !T(i10)) {
                return;
            }
            l(i10);
        }

        public void Q(g gVar) {
            int deviceClass;
            BluetoothDevice bluetoothDeviceW5 = h1.this.w5(gVar.f26490d);
            if (bluetoothDeviceW5 != null) {
                String strB = m3.a.b(bluetoothDeviceW5);
                if (gVar.f26488b == null || (strB != null && strB.length() > gVar.f26488b.length())) {
                    gVar.f26488b = strB;
                }
                BluetoothClass bluetoothClass = bluetoothDeviceW5.getBluetoothClass();
                if (bluetoothClass != null && ((deviceClass = bluetoothClass.getDeviceClass()) == 1028 || deviceClass == 1032 || deviceClass == 1056)) {
                    gVar.f26491e = true;
                }
            }
            String str = gVar.f26488b;
            if (str != null) {
                this.A.put(gVar.f26490d, str);
            } else {
                gVar.f26488b = (String) this.A.get(gVar.f26490d);
            }
            int i10 = 0;
            while (true) {
                if (i10 >= f()) {
                    break;
                }
                g gVar2 = (g) J(i10);
                if (!a6.q.d(gVar2.f26490d, gVar.f26490d)) {
                    i10++;
                } else {
                    if (a6.q.d(gVar, gVar2)) {
                        return;
                    }
                    if (gVar2.getClass() == gVar.getClass()) {
                        N(i10, gVar);
                        return;
                    } else if (gVar.c()) {
                        return;
                    } else {
                        M(i10);
                    }
                }
            }
            if (gVar.c()) {
                L(gVar, S() + 1);
            } else {
                super.D(gVar);
            }
        }

        public void R() {
            int iF = f();
            while (true) {
                iF--;
                if (iF < 0) {
                    return;
                }
                if (((g) J(iF)).c()) {
                    M(iF);
                }
            }
        }

        public int S() {
            int i10 = 0;
            while (i10 < f() && ((g) J(i10)).c()) {
                i10++;
            }
            return i10 - 1;
        }

        boolean T(int i10) {
            return i10 == 0 || ((g) J(i10 + (-1))).c() != ((g) J(i10)).c();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public void s(f fVar, int i10) {
            g gVar = (g) J(i10);
            fVar.Q(gVar, T(i10) ? gVar.c() ? h1.this.N1(R.string.availableDevices) : h1.this.N1(R.string.pairedDevice) : null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public f u(ViewGroup viewGroup, int i10) {
            return h1.this.new f(this.f4395r.inflate(R.layout.trusted_device_item, viewGroup, false));
        }

        @Override // c6.b, androidx.recyclerview.widget.RecyclerView.h
        public long g(int i10) {
            return ((g) J(i10)).b();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f extends RecyclerView.f0 implements View.OnClickListener {
        private final TextView D;
        private final TextView E;
        private final View F;
        private final ImageView G;
        private final TextView H;
        private g I;

        public f(View view) {
            super(view);
            this.H = (TextView) view.findViewById(R.id.header);
            this.G = (ImageView) view.findViewById(R.id.type);
            this.D = (TextView) view.findViewById(R.id.name);
            this.E = (TextView) view.findViewById(R.id.address);
            View viewFindViewById = view.findViewById(R.id.del_btn);
            this.F = viewFindViewById;
            viewFindViewById.setOnClickListener(this);
            view.findViewById(R.id.content).setOnClickListener(this);
        }

        public void Q(g gVar, String str) {
            if (str == null) {
                this.H.setVisibility(8);
            } else {
                this.H.setText(str);
                this.H.setVisibility(0);
            }
            this.D.setText(gVar.f26488b);
            if (a6.q.d(gVar.f26490d, h1.this.Z0)) {
                this.E.setText(R.string.thisDevice);
            } else {
                this.E.setText(gVar.f26490d);
            }
            this.G.setVisibility(0);
            if (gVar.c() && a6.q.d(h1.this.V0, gVar.f26490d) && h1.this.W0 + 20000000000L > System.nanoTime()) {
                this.E.setText(R.string.pairing);
            }
            if (gVar.f26491e) {
                this.G.setImageResource(R.drawable.ic_headset_mic_black_24dp);
                if (gVar.f26493g) {
                    this.E.setText(R.string.connected);
                } else if (gVar.f26494h) {
                    this.E.setText(R.string.connecting);
                }
            } else if (gVar.f26495i) {
                this.G.setImageResource(R.drawable.ic_ptt_24dp);
                if (gVar.f26488b == null) {
                    this.D.setText(R.string.wirelessPTT);
                }
            } else if (gVar.c()) {
                this.G.setVisibility(4);
            } else {
                this.G.setImageResource(R.drawable.ic_smartphone_black_24dp);
            }
            if (gVar.c()) {
                this.F.setVisibility(8);
            } else {
                this.F.setVisibility(0);
            }
            this.I = gVar;
            if (gVar.f26489c != null) {
                this.E.setText(((Object) this.E.getText()) + "\n" + gVar.f26489c);
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (h1.this.Y4() == null) {
                return;
            }
            if (view.getId() == R.id.del_btn) {
                h1.this.Y4().a(v4.v.DEL_TRUSTED_DEVICE, this.I.f26487a);
                h1.this.f26481a1.M(k());
                return;
            }
            g gVar = this.I;
            if (gVar.f26493g) {
                return;
            }
            if (gVar.f26491e || gVar.c()) {
                h1.this.Y4().a(v4.v.SET_REMOTE_DEVICE_ADDR, this.I.f26487a);
                if (this.I.c()) {
                    this.E.setText(R.string.pairing);
                    h1.this.V0 = this.I.f26490d;
                    h1.this.W0 = System.nanoTime();
                    h1.this.f26481a1.k();
                    view.postDelayed(new Runnable() { // from class: s4.i1
                        @Override // java.lang.Runnable
                        public final void run() {
                            h1.this.f26481a1.k();
                        }
                    }, 21000L);
                } else {
                    this.E.setText(R.string.connecting);
                }
                view.postDelayed(new Runnable() { // from class: s4.j1
                    @Override // java.lang.Runnable
                    public final void run() {
                        h1.this.f26481a1.k();
                    }
                }, 3000L);
            }
        }
    }

    private class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public byte[] f26487a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f26488b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f26489c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f26490d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f26491e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f26492f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f26493g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f26494h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f26495i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f26496j;

        /* synthetic */ g(h1 h1Var, byte[] bArr, a aVar) {
            this(bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b() {
            return v4.l1.W(this.f26490d);
        }

        public boolean c() {
            return getClass() == g.class;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                g gVar = (g) obj;
                if (this.f26491e == gVar.f26491e && this.f26492f == gVar.f26492f && this.f26493g == gVar.f26493g && this.f26495i == gVar.f26495i && this.f26494h == gVar.f26494h && this.f26496j == gVar.f26496j && a6.q.d(this.f26488b, gVar.f26488b) && a6.q.d(this.f26490d, gVar.f26490d)) {
                    return true;
                }
            }
            return false;
        }

        public String toString() {
            return this.f26488b + "(" + this.f26490d + ")";
        }

        private g(byte[] bArr) {
            a6.v vVar = new a6.v(bArr);
            vVar.l(8);
            byte[] bArr2 = {vVar.d(), vVar.d(), vVar.d(), vVar.d(), vVar.d(), vVar.d()};
            this.f26487a = bArr2;
            this.f26490d = String.format(Locale.ENGLISH, "%02X:%02X:%02X:%02X:%02X:%02X", Byte.valueOf(bArr2[0]), Byte.valueOf(this.f26487a[1]), Byte.valueOf(this.f26487a[2]), Byte.valueOf(this.f26487a[3]), Byte.valueOf(this.f26487a[4]), Byte.valueOf(this.f26487a[5]));
            int iB = vVar.b() / 8;
            if (iB < bArr.length) {
                this.f26488b = new String(bArr, iB, bArr.length - iB);
            }
        }

        protected g() {
        }

        public g(BluetoothDevice bluetoothDevice) {
            String address = bluetoothDevice.getAddress();
            this.f26490d = address;
            String[] strArrSplit = address.split(":");
            this.f26487a = new byte[6];
            int i10 = 0;
            while (true) {
                byte[] bArr = this.f26487a;
                if (i10 < bArr.length) {
                    bArr[i10] = (byte) Integer.parseInt(strArrSplit[i10], 16);
                    i10++;
                } else {
                    this.f26488b = m3.a.b(bluetoothDevice);
                    return;
                }
            }
        }
    }

    public h1() {
        i5(3);
    }

    public static /* synthetic */ void n5(h1 h1Var) {
        if (h1Var.Y4() == null || !h1Var.a2()) {
            return;
        }
        h1Var.Y4().a(v4.v.GET_TRUSTED_DEVICE, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BluetoothDevice w5(String str) {
        BluetoothDevice bluetoothDevice = (BluetoothDevice) this.U0.get(str);
        if (bluetoothDevice != null) {
            return bluetoothDevice;
        }
        BluetoothAdapter bluetoothAdapter = this.S0;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.getRemoteDevice(str);
        }
        return null;
    }

    private void x5(Runnable runnable, int i10) {
        this.Q0.removeCallbacks(runnable);
        this.Q0.postDelayed(runnable, i10);
    }

    private void y5(Runnable runnable) {
        this.Q0.removeCallbacks(runnable);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(v4.n0 n0Var, g3.d dVar) {
        BluetoothAdapter bluetoothAdapter;
        super.M(n0Var, dVar);
        if (dVar.m() != 2) {
            return;
        }
        int[] iArr = b.f26484b;
        a aVar = null;
        if (iArr[v4.v.d(dVar.e()).ordinal()] == 1 && b.f26483a[v4.x.d(dVar.d(0)).ordinal()] == 1) {
            byte[] bArrI = dVar.i();
            if (bArrI.length >= 7) {
                g gVar = new g(this, bArrI, aVar);
                if (Cfg.f5476a) {
                    s3.b.b("DeviceConnectionManagerFragment", "设备扫描到设备:" + gVar.toString());
                }
                this.f26481a1.Q(gVar);
            }
        }
        if (dVar.n()) {
            int i10 = iArr[v4.v.d(dVar.e()).ordinal()];
            if (i10 == 2) {
                if (this.Q0.isChecked() != (dVar.c() != 0)) {
                    x5(this.Y0, CloseCodes.NORMAL_CLOSURE);
                    this.Q0.setChecked(dVar.c() != 0);
                }
                if (this.Q0.isChecked() && (bluetoothAdapter = this.S0) != null && !bluetoothAdapter.isDiscovering()) {
                    this.S0.startDiscovery();
                }
                x5(this.X0, 2000);
                return;
            }
            if (i10 != 3) {
                return;
            }
            if (dVar.l() == a.b.INVALID_PARAMETER) {
                x5(this.Y0, 3000);
                return;
            }
            y5(this.Y0);
            byte[] bArrI2 = dVar.i();
            if (bArrI2.length >= 9) {
                d dVar2 = new d(this, bArrI2, aVar);
                this.f26481a1.Q(dVar2);
                n0Var.a(v4.v.GET_TRUSTED_DEVICE, (byte) (dVar2.f26496j + 1));
            }
            x5(this.Y0, 30000);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        x5(this.X0, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
        x5(this.Y0, CloseCodes.NORMAL_CLOSURE);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void W0(v4.n0 n0Var) {
        if (n0Var.l() == n0.c.Connected) {
            x5(this.X0, HttpStatus.HTTP_INTERNAL_SERVER_ERROR);
            x5(this.Y0, CloseCodes.NORMAL_CLOSURE);
        }
        super.W0(n0Var);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        if (Y4() == null) {
            return;
        }
        if (!z10) {
            Y4().a(v4.v.SET_IN_SCAN, 0);
            BluetoothAdapter bluetoothAdapter = this.S0;
            if (bluetoothAdapter != null) {
                bluetoothAdapter.cancelDiscovery();
                return;
            }
            return;
        }
        this.V0 = null;
        this.f26481a1.R();
        Y4().a(v4.v.SET_IN_SCAN, 1);
        BluetoothAdapter bluetoothAdapter2 = this.S0;
        if (bluetoothAdapter2 != null) {
            bluetoothAdapter2.startDiscovery();
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        this.S0 = defaultAdapter;
        if (defaultAdapter == null) {
            return;
        }
        this.Z0 = m3.a.a();
        IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.FOUND");
        intentFilter.addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        x3().registerReceiver(this.T0, intentFilter);
        y4(R.string.connectionManagement);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (Y4() == null) {
            return layoutInflater.inflate(R.layout.empty, viewGroup, false);
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_device_connection_manager, viewGroup, false);
        this.P0 = viewInflate;
        DWSwitch dWSwitch = (DWSwitch) viewInflate.findViewById(R.id.scan);
        this.Q0 = dWSwitch;
        dWSwitch.setOnUserChangeCheckedListener(this);
        this.f26481a1 = new e(k1());
        RecyclerView recyclerView = (RecyclerView) this.P0.findViewById(R.id.list);
        this.R0 = recyclerView;
        recyclerView.setItemAnimator(null);
        this.R0.setAdapter(this.f26481a1);
        this.R0.l(new c6.m(k1(), 0));
        return this.P0;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void w2() {
        if (this.T0 != null) {
            x3().unregisterReceiver(this.T0);
        }
        super.w2();
    }
}
