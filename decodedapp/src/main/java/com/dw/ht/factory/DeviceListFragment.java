package com.dw.ht.factory;

import a6.q;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.factory.DeviceListFragment;
import com.dw.ht.fragments.DeviceFragment;
import java.util.HashSet;
import java.util.Set;
import kotlin.Metadata;
import m4.n;
import n4.m;
import org.greenrobot.eventbus.ThreadMode;
import org.simpleframework.xml.strategy.Name;
import rd.m;
import s4.f0;
import v4.a0;
import v4.c0;
import v4.i0;
import v4.k0;
import v4.l1;
import v4.m0;
import v4.n0;
import v4.o;
import v4.o0;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0003YZ[B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0011\u001a\u00020\u00072\n\u0010\u0010\u001a\u00060\u000fR\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001b\u0010\u0004J+\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0007H\u0016¢\u0006\u0004\b#\u0010\u0004J\u000f\u0010$\u001a\u00020\u0007H\u0016¢\u0006\u0004\b$\u0010\u0004J\u000f\u0010%\u001a\u00020\u0007H\u0016¢\u0006\u0004\b%\u0010\u0004J\u0017\u0010&\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b&\u0010\u000eJ\u0017\u0010'\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b'\u0010\u000eJ\u0017\u0010*\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J\u0019\u0010*\u001a\u00020\u00072\b\u0010)\u001a\u0004\u0018\u00010,H\u0007¢\u0006\u0004\b*\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00105\u001a\u0002028\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b3\u00104R\u001c\u0010:\u001a\b\u0012\u0004\u0012\u000207068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010=\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001c\u0010A\u001a\b\u0018\u00010>R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010E\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0018\u0010I\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010Q\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010T\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010SR\u0016\u0010X\u001a\u0004\u0018\u00010U8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006\\"}, d2 = {"Lcom/dw/ht/factory/DeviceListFragment;", "Ls4/f0;", "Lv4/n0$d;", "<init>", "()V", "", "enable", "Ldd/d0;", "Y4", "(Z)V", "b5", "Lv4/n0;", "link", "X4", "(Lv4/n0;)V", "Lcom/dw/ht/factory/DeviceListFragment$b;", "device", "a5", "(Lcom/dw/ht/factory/DeviceListFragment$b;)V", "", Name.MARK, "Z4", "(J)V", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "w2", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "M2", "H2", "o0", "W0", "Ln4/m$a;", "event", "onMessageEvent", "(Ln4/m$a;)V", "Lv4/n0$a;", "(Lv4/n0$a;)V", "Lm4/n;", "H0", "Lm4/n;", "binding", "Landroid/content/SharedPreferences;", "I0", "Landroid/content/SharedPreferences;", "mPref", "", "", "J0", "Ljava/util/Set;", "mBindList", "K0", "Z", "mScanning", "Lcom/dw/ht/factory/DeviceListFragment$a;", "L0", "Lcom/dw/ht/factory/DeviceListFragment$a;", "mAdapter", "Landroid/bluetooth/BluetoothAdapter$LeScanCallback;", "M0", "Landroid/bluetooth/BluetoothAdapter$LeScanCallback;", "mLeScanCallback", "Lv4/u;", "N0", "Lv4/u;", "mConnectionManager", "Lv4/c0;", "O0", "Lv4/c0;", "mLink", "Lv4/i0;", "P0", "Lv4/i0;", "mHMLink", "Q0", "J", "mLinkId", "Landroid/bluetooth/BluetoothAdapter;", "T4", "()Landroid/bluetooth/BluetoothAdapter;", "mBluetoothAdapter", "c", "a", "b", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceListFragment extends f0 implements n0.d {

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private n binding;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private SharedPreferences mPref;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private boolean mScanning;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private a mAdapter;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private u mConnectionManager;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private c0 mLink;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private i0 mHMLink;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private long mLinkId;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private Set mBindList = new HashSet();

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private final BluetoothAdapter.LeScanCallback mLeScanCallback = new BluetoothAdapter.LeScanCallback() { // from class: q4.j
        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public final void onLeScan(BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
            DeviceListFragment.U4(this.f24305a, bluetoothDevice, i10, bArr);
        }
    };

    private final class a extends c6.b {
        public a(Context context) {
            super(context, 0);
        }

        @Override // c6.b
        public void M(int i10) {
            super.M(i10);
            if (i10 >= f() || !T(i10)) {
                return;
            }
            l(i10);
        }

        public void Q(b bVar) {
            m.e(bVar, "device");
            c0 c0Var = DeviceListFragment.this.mLink;
            if (c0Var != null && m.a(m0.j(c0Var.q()), bVar.a().getAddress())) {
                n0.c cVarL = c0Var.l();
                m.d(cVarL, "getControlLinkStatus(...)");
                bVar.e(cVarL);
            }
            i0 i0Var = DeviceListFragment.this.mHMLink;
            if (i0Var != null && m.a(m0.j(i0Var.q()), bVar.a().getAddress())) {
                bVar.e(i0Var.l());
            }
            int iF = f();
            int i10 = 0;
            while (true) {
                if (i10 >= iF) {
                    break;
                }
                b bVar2 = (b) J(i10);
                m.b(bVar2);
                if (!q.d(bVar2.a(), bVar.a())) {
                    i10++;
                } else {
                    if (q.d(bVar2, bVar)) {
                        return;
                    }
                    if (bVar2.d() == bVar.d()) {
                        N(i10, bVar);
                        return;
                    } else if (bVar.d()) {
                        return;
                    } else {
                        M(i10);
                    }
                }
            }
            if (bVar.d()) {
                L(bVar, S() + 1);
            } else {
                super.D(bVar);
            }
        }

        public final void R() {
            int iF = f();
            while (true) {
                iF--;
                if (iF < 0) {
                    return;
                }
                b bVar = (b) J(iF);
                m.b(bVar);
                if (bVar.d()) {
                    M(iF);
                }
            }
        }

        public final int S() {
            int i10 = 0;
            while (i10 < f() && ((b) J(i10)).d()) {
                i10++;
            }
            return i10 - 1;
        }

        public final boolean T(int i10) {
            return i10 == 0 || ((b) J(i10 + (-1))).d() != ((b) J(i10)).d();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
        public void s(c cVar, int i10) {
            m.e(cVar, "holder");
            b bVar = (b) J(i10);
            String strN1 = T(i10) ? bVar.d() ? DeviceListFragment.this.N1(R.string.availableDevices) : DeviceListFragment.this.N1(R.string.pairedDevice) : null;
            m.b(bVar);
            cVar.O(bVar, strN1);
        }

        public final void V(n0 n0Var) {
            boolean zF;
            m.e(n0Var, "link");
            String strJ = m0.j(n0Var.q());
            m.d(strJ, "toAddress(...)");
            int iF = f();
            for (int i10 = 0; i10 < iF; i10++) {
                b bVar = (b) J(i10);
                n0.c cVarL = n0Var.l();
                m.b(bVar);
                if (m.a(bVar.a().getAddress(), strJ)) {
                    m.b(cVarL);
                    zF = bVar.f(cVarL);
                } else {
                    zF = bVar.f(n0.c.Idle);
                }
                if (zF) {
                    l(i10);
                }
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
        public c u(ViewGroup viewGroup, int i10) {
            m.e(viewGroup, "parent");
            DeviceListFragment deviceListFragment = DeviceListFragment.this;
            View viewInflate = this.f4395r.inflate(R.layout.factory_device_manager_item, viewGroup, false);
            m.d(viewInflate, "inflate(...)");
            return new c(deviceListFragment, viewInflate);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final BluetoothDevice f5837a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f5838b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private n0.c f5839c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ DeviceListFragment f5840d;

        public b(DeviceListFragment deviceListFragment, BluetoothDevice bluetoothDevice, int i10) {
            m.e(bluetoothDevice, "device");
            this.f5840d = deviceListFragment;
            this.f5837a = bluetoothDevice;
            this.f5838b = i10;
            this.f5839c = n0.c.Idle;
        }

        public final BluetoothDevice a() {
            return this.f5837a;
        }

        public final n0.c b() {
            return this.f5839c;
        }

        public final int c() {
            return this.f5838b;
        }

        public final boolean d() {
            return !this.f5840d.mBindList.contains(this.f5837a.getAddress());
        }

        public final void e(n0.c cVar) {
            m.e(cVar, "<set-?>");
            this.f5839c = cVar;
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof b)) {
                return super.equals(obj);
            }
            b bVar = (b) obj;
            return m.a(bVar.f5837a, this.f5837a) && bVar.f5839c == this.f5839c;
        }

        public final boolean f(n0.c cVar) {
            m.e(cVar, "s");
            if (cVar == this.f5839c) {
                return false;
            }
            this.f5839c = cVar;
            return true;
        }

        public int hashCode() {
            return (((((this.f5837a.hashCode() * 31) + this.f5838b) * 31) + this.f5839c.hashCode()) * 31) + o4.b.a(d());
        }

        public String toString() {
            String string = this.f5837a.toString();
            m.d(string, "toString(...)");
            return string;
        }
    }

    private final class c extends RecyclerView.f0 implements View.OnClickListener {
        private final TextView D;
        private final TextView E;
        private final View F;
        private final TextView G;
        private b H;
        final /* synthetic */ DeviceListFragment I;

        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f5841a;

            static {
                int[] iArr = new int[n0.c.values().length];
                try {
                    iArr[n0.c.Interrupted.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[n0.c.ConnectionFailed.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[n0.c.Connected.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[n0.c.Connecting.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f5841a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(DeviceListFragment deviceListFragment, View view) {
            super(view);
            m.e(view, "view");
            this.I = deviceListFragment;
            View viewFindViewById = view.findViewById(R.id.header);
            m.d(viewFindViewById, "findViewById(...)");
            this.G = (TextView) viewFindViewById;
            View viewFindViewById2 = view.findViewById(R.id.name);
            m.d(viewFindViewById2, "findViewById(...)");
            this.D = (TextView) viewFindViewById2;
            View viewFindViewById3 = view.findViewById(R.id.address);
            m.d(viewFindViewById3, "findViewById(...)");
            this.E = (TextView) viewFindViewById3;
            View viewFindViewById4 = view.findViewById(R.id.del_btn);
            m.d(viewFindViewById4, "findViewById(...)");
            this.F = viewFindViewById4;
            viewFindViewById4.setOnClickListener(this);
            view.findViewById(R.id.content).setOnClickListener(this);
        }

        public final void O(b bVar, String str) {
            m.e(bVar, "d");
            if (str == null) {
                this.G.setVisibility(8);
            } else {
                this.G.setText(str);
                this.G.setVisibility(0);
            }
            this.D.setText(m3.a.b(bVar.a()));
            int i10 = a.f5841a[bVar.b().ordinal()];
            if (i10 == 1 || i10 == 2) {
                this.E.setText(R.string.connection_failed);
            } else if (i10 == 3) {
                this.E.setText(R.string.connected);
            } else if (i10 != 4) {
                this.E.setText(bVar.a().getAddress());
            } else {
                this.E.setText(R.string.connecting);
            }
            if (bVar.d()) {
                this.F.setVisibility(8);
            } else {
                this.F.setVisibility(0);
            }
            this.H = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            m.e(view, "v");
            b bVar = this.H;
            if (bVar == null) {
                return;
            }
            String address = bVar.a().getAddress();
            if (view.getId() != R.id.del_btn) {
                this.I.a5(bVar);
                return;
            }
            int iK = k();
            if (iK < 0) {
                return;
            }
            a aVar = this.I.mAdapter;
            if (aVar != null) {
                aVar.M(iK);
            }
            m3.a.e(bVar.a());
            this.I.mBindList.remove(address);
            u uVar = this.I.mConnectionManager;
            o oVarK = uVar != null ? uVar.k(bVar.a().getAddress()) : null;
            if (oVarK != null) {
                if (oVarK == this.I.mLink) {
                    this.I.mLink = null;
                }
                u uVar2 = this.I.mConnectionManager;
                if (uVar2 != null) {
                    uVar2.c(oVarK);
                }
            }
        }
    }

    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5842a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5843b;

        static {
            int[] iArr = new int[n0.c.values().length];
            try {
                iArr[n0.c.Connected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f5842a = iArr;
            int[] iArr2 = new int[n0.a.values().length];
            try {
                iArr2[n0.a.CONTROL_LINK_STATUS_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f5843b = iArr2;
        }
    }

    public DeviceListFragment() {
        I4(true);
        H4(true);
    }

    private final BluetoothAdapter T4() {
        return BluetoothAdapter.getDefaultAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U4(final DeviceListFragment deviceListFragment, BluetoothDevice bluetoothDevice, int i10, byte[] bArr) {
        LinearLayout linearLayoutB;
        int iZ2 = o.Z2(bArr);
        if (iZ2 == 16640 || iZ2 == 16896 || iZ2 == 34977) {
            if (Cfg.f5476a) {
                s3.b.b("DeviceListFragment", bluetoothDevice.toString());
            }
            m.b(bluetoothDevice);
            final b bVar = new b(deviceListFragment, bluetoothDevice, iZ2);
            n nVar = deviceListFragment.binding;
            if (nVar == null || (linearLayoutB = nVar.b()) == null) {
                return;
            }
            linearLayoutB.post(new Runnable() { // from class: com.dw.ht.factory.a
                @Override // java.lang.Runnable
                public final void run() {
                    DeviceListFragment.V4(this.f6083a, bVar);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void V4(DeviceListFragment deviceListFragment, b bVar) {
        a aVar = deviceListFragment.mAdapter;
        if (aVar != null) {
            aVar.Q(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void W4(DeviceListFragment deviceListFragment, View view) {
        deviceListFragment.Z4(281474976710910L);
    }

    private final void X4(n0 link) {
        n0.c cVarL = link.l();
        if ((cVarL == null ? -1 : d.f5842a[cVarL.ordinal()]) == 1) {
            if (link instanceof i0) {
                Bundle bundle = new Bundle();
                bundle.putParcelable("dev", ((i0) link).J());
                FragmentShowActivity.i2(x3(), null, q4.o.class, bundle);
                return;
            }
            if (link instanceof o) {
                Set set = this.mBindList;
                String address = ((o) link).a3().getAddress();
                m.d(address, "getAddress(...)");
                set.add(address);
            }
            Context contextK1 = k1();
            if (contextK1 != null && link.q() == this.mLinkId) {
                if (m.a("com.benshikj.ht.distribute", x3().getPackageName())) {
                    DeviceFragment.j5(contextK1, null, DevIdFragment.class, link.q());
                } else {
                    m.c(link, "null cannot be cast to non-null type com.dw.ht.link.DeviceLink");
                    c0 c0Var = (c0) link;
                    if (c0Var.Q.g() == a0.f.AP2) {
                        DeviceFragment.j5(contextK1, null, SettingsV1Fragment.class, c0Var.q());
                    } else {
                        DeviceFragment.j5(contextK1, null, SettingsFragment.class, c0Var.q());
                    }
                }
                this.mLinkId = 0L;
            }
        }
        a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.V(link);
        }
    }

    private final void Y4(boolean enable) {
        n nVar = this.binding;
        if (nVar == null || this.mScanning == enable) {
            return;
        }
        if (!enable) {
            this.mScanning = false;
            BluetoothAdapter bluetoothAdapterT4 = T4();
            if (bluetoothAdapterT4 != null) {
                bluetoothAdapterT4.stopLeScan(this.mLeScanCallback);
            }
            nVar.f21369d.setVisibility(4);
            a4();
            return;
        }
        a aVar = this.mAdapter;
        if (aVar != null) {
            aVar.R();
        }
        try {
            BluetoothAdapter bluetoothAdapterT42 = T4();
            if (bluetoothAdapterT42 != null) {
                bluetoothAdapterT42.startLeScan(null, this.mLeScanCallback);
            }
            this.mScanning = true;
            nVar.f21369d.setVisibility(0);
        } catch (SecurityException e10) {
            e10.printStackTrace();
        }
        a4();
    }

    private final void Z4(long id2) {
        this.mLinkId = id2;
        c0 c0Var = this.mLink;
        if (c0Var != null) {
            m.b(c0Var);
            if (c0Var.q() == this.mLinkId) {
                c0Var.y();
                c0Var.v(false);
                W0(c0Var);
                return;
            } else {
                c0Var.r(this);
                u uVar = this.mConnectionManager;
                m.b(uVar);
                uVar.c(this.mLink);
            }
        }
        u uVar2 = this.mConnectionManager;
        c0 c0Var2 = (c0) (uVar2 != null ? uVar2.y(this.mLinkId) : null);
        this.mLink = c0Var2;
        if (c0Var2 != null) {
            c0Var2.k(this);
            c0Var2.y();
            c0Var2.v(false);
            W0(c0Var2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void a5(b device) {
        int iC = device.c();
        if (iC != 16640 && iC != 16896) {
            Z4(l1.W(device.a().getAddress()));
            return;
        }
        i0 i0Var = this.mHMLink;
        if (i0Var != null) {
            m.b(i0Var);
            if (m.a(i0Var.J(), device.a())) {
                i0Var.y();
                X4(i0Var);
                return;
            }
            i0Var.z().t(this);
        }
        i0 i0VarF = device.c() == 16896 ? i0.F.f(device.a(), device.a()) : i0.a.g(i0.F, device.a(), null, 2, null);
        this.mHMLink = i0VarF;
        if (i0VarF != null) {
            i0VarF.z().q(this);
            i0VarF.y();
            i0VarF.F().k();
            X4(i0VarF);
        }
    }

    private final void b5() {
        Set<BluetoothDevice> bondedDevices;
        if (a2()) {
            a aVar = this.mAdapter;
            if (aVar != null) {
                aVar.G();
            }
            Set set = this.mBindList;
            HashSet hashSet = new HashSet();
            try {
                BluetoothAdapter bluetoothAdapterT4 = T4();
                if (bluetoothAdapterT4 != null && (bondedDevices = bluetoothAdapterT4.getBondedDevices()) != null) {
                    for (BluetoothDevice bluetoothDevice : bondedDevices) {
                        String address = bluetoothDevice.getAddress();
                        if (set.contains(address)) {
                            m.b(address);
                            hashSet.add(address);
                            a aVar2 = this.mAdapter;
                            if (aVar2 != null) {
                                m.b(bluetoothDevice);
                                aVar2.Q(new b(this, bluetoothDevice, 34977));
                            }
                        }
                    }
                }
            } catch (SecurityException e10) {
                e10.printStackTrace();
            }
            this.mBindList = hashSet;
        }
    }

    @Override // v3.v, androidx.fragment.app.o
    public void H2() {
        mi.c cVarZ;
        super.H2();
        Y4(false);
        c0 c0Var = this.mLink;
        if (c0Var != null) {
            c0Var.r(this);
        }
        i0 i0Var = this.mHMLink;
        if (i0Var != null && (cVarZ = i0Var.z()) != null) {
            cVarZ.t(this);
        }
        mi.c.e().t(this);
    }

    @Override // v4.n0.d
    public /* synthetic */ void M(n0 n0Var, g3.d dVar) {
        o0.d(this, n0Var, dVar);
    }

    @Override // s4.f0, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        mi.c cVarZ;
        super.M2();
        n nVar = this.binding;
        m.b(nVar);
        nVar.f21370e.setVisibility(n4.m.d() ? 0 : 8);
        c0 c0Var = this.mLink;
        if (c0Var != null && c0Var.isDestroyed()) {
            this.mLink = null;
        }
        i0 i0Var = this.mHMLink;
        if ((i0Var != null ? i0Var.G() : null) != null) {
            i0 i0Var2 = this.mHMLink;
            if (i0Var2 != null) {
                i0Var2.A();
            }
            this.mHMLink = null;
        }
        Y4(true);
        b5();
        c0 c0Var2 = this.mLink;
        if (c0Var2 != null) {
            c0Var2.k(this);
            W0(c0Var2);
            if (c0Var2.q() == this.mLinkId) {
                c0Var2.v(false);
            }
        }
        i0 i0Var3 = this.mHMLink;
        if (i0Var3 != null && (cVarZ = i0Var3.z()) != null) {
            cVarZ.q(this);
        }
        mi.c.e().q(this);
    }

    @Override // v4.n0.d
    public void W0(n0 link) {
        m.e(link, "link");
        X4(link);
    }

    @Override // v4.n0.d
    public /* synthetic */ void h0(n0 n0Var) {
        o0.e(this, n0Var);
    }

    @Override // v4.n0.d
    public /* synthetic */ void i0(n0 n0Var) {
        o0.f(this, n0Var);
    }

    @Override // v4.n0.d
    public /* synthetic */ void j0(n0 n0Var, k0 k0Var, k0 k0Var2) {
        o0.b(this, n0Var, k0Var, k0Var2);
    }

    @Override // v4.n0.d
    public void o0(n0 link) {
        m.e(link, "link");
    }

    @mi.m(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(m.a event) {
        rd.m.e(event, "event");
        n nVar = this.binding;
        if (nVar == null) {
            return;
        }
        rd.m.b(nVar);
        nVar.f21370e.setVisibility(n4.m.d() ? 0 : 8);
        if (event == m.a.f22494a) {
            Z4(281474976710910L);
        }
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        this.mConnectionManager = u.w();
        new IntentFilter("android.bluetooth.device.action.FOUND").addAction("android.bluetooth.adapter.action.DISCOVERY_FINISHED");
        SharedPreferences sharedPreferences = x3().getSharedPreferences("factory", 0);
        rd.m.d(sharedPreferences, "getSharedPreferences(...)");
        this.mPref = sharedPreferences;
        if (sharedPreferences == null) {
            rd.m.o("mPref");
            sharedPreferences = null;
        }
        Set<String> stringSet = sharedPreferences.getStringSet("bind_list", this.mBindList);
        rd.m.b(stringSet);
        this.mBindList = stringSet;
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        this.binding = n.c(inflater, container, false);
        this.mAdapter = new a(k1());
        n nVar = this.binding;
        rd.m.b(nVar);
        RecyclerView recyclerView = nVar.f21367b;
        rd.m.d(recyclerView, "list");
        recyclerView.setItemAnimator(null);
        recyclerView.setAdapter(this.mAdapter);
        recyclerView.l(new c6.m(x3(), 0));
        z4(N1(R.string.deviceList));
        n nVar2 = this.binding;
        rd.m.b(nVar2);
        nVar2.f21370e.setOnClickListener(new View.OnClickListener() { // from class: q4.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceListFragment.W4(this.f24306a, view);
            }
        });
        n nVar3 = this.binding;
        rd.m.b(nVar3);
        LinearLayout linearLayoutB = nVar3.b();
        rd.m.d(linearLayoutB, "getRoot(...)");
        return linearLayoutB;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void w2() {
        super.w2();
        Y4(false);
        SharedPreferences sharedPreferences = this.mPref;
        if (sharedPreferences == null) {
            rd.m.o("mPref");
            sharedPreferences = null;
        }
        sharedPreferences.edit().putStringSet("bind_list", this.mBindList).apply();
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    @mi.m(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(n0.a event) {
        i0 i0Var = this.mHMLink;
        if (i0Var == null) {
            return;
        }
        if ((event == null ? -1 : d.f5843b[event.ordinal()]) == 1) {
            X4(i0Var);
        }
    }
}
