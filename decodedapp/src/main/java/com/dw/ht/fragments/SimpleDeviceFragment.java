package com.dw.ht.fragments;

import android.bluetooth.BluetoothAdapter;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.PopupMenu;
import androidx.cardview.widget.CardView;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.fragments.SimpleDeviceFragment;
import com.dw.widget.ActionButton;
import ed.q;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import m4.n1;
import org.greenrobot.eventbus.ThreadMode;
import rd.m;
import s4.h1;
import v4.c0;
import v4.k0;
import v4.l1;
import v4.m0;
import v4.n0;
import v4.o;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J!\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0018\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ'\u0010!\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0004H\u0016¢\u0006\u0004\b#\u0010\u0003J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0007¢\u0006\u0004\b&\u0010'R\u0018\u0010+\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010/\u001a\u0004\u0018\u00010,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u00103\u001a\u0002008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, d2 = {"Lcom/dw/ht/fragments/SimpleDeviceFragment;", "Lcom/dw/ht/fragments/DeviceFragment;", "<init>", "()V", "Ldd/d0;", "x5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lv4/n0;", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "link", "o0", "(Lv4/n0;)V", "W0", "Lv4/k0;", "oldStatus", "newStatus", "j0", "(Lv4/n0;Lv4/k0;Lv4/k0;)V", "M2", "Lv4/u$c;", "event", "onMessageEvent", "(Lv4/u$c;)V", "Lm4/n1;", "P0", "Lm4/n1;", "binding", "Lcom/dw/ht/fragments/DeviceStatusFragment;", "Q0", "Lcom/dw/ht/fragments/DeviceStatusFragment;", "deviceStatusFragment", "", "R0", "Z", "smallScreen", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimpleDeviceFragment extends DeviceFragment {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private n1 binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private DeviceStatusFragment deviceStatusFragment;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private boolean smallScreen;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6190a;

        static {
            int[] iArr = new int[u.c.values().length];
            try {
                iArr[u.c.CurrentLinkChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6190a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s5(SimpleDeviceFragment simpleDeviceFragment, View view) {
        l1 l1VarY4 = simpleDeviceFragment.Y4();
        if (l1VarY4 == null) {
            return;
        }
        if (l1VarY4.n() || l1VarY4.i()) {
            l1VarY4.h(true);
        } else {
            l1VarY4.v(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t5(SimpleDeviceFragment simpleDeviceFragment, View view) {
        l1 l1VarY4 = simpleDeviceFragment.Y4();
        if (l1VarY4 == null) {
            return;
        }
        l1VarY4.i1(!l1VarY4.p0());
        simpleDeviceFragment.x5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u5(SimpleDeviceFragment simpleDeviceFragment, View view) {
        simpleDeviceFragment.k5(h1.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v5(final SimpleDeviceFragment simpleDeviceFragment, View view) {
        final l1 l1VarY4 = simpleDeviceFragment.Y4();
        if (l1VarY4 == null) {
            return;
        }
        final u uVarW = u.w();
        m.d(uVarW, "getInstance(...)");
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        popupMenu.getMenuInflater().inflate(R.menu.simple_device, popupMenu.getMenu());
        final ArrayList arrayList = new ArrayList(16);
        Collection<l1> collectionA = uVarW.A();
        m.d(collectionA, "getLinks(...)");
        for (l1 l1Var : collectionA) {
            if (l1Var instanceof c0) {
                arrayList.add(l1Var);
            }
        }
        boolean z10 = true;
        if (arrayList.size() > 1) {
            SubMenu subMenuAddSubMenu = popupMenu.getMenu().addSubMenu(0, R.id._switch, 0, R.string._switch);
            int i10 = 0;
            for (Object obj : arrayList) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    q.u();
                }
                subMenuAddSubMenu.add(0, i10, 0, ((c0) obj).getName());
                i10 = i11;
            }
        }
        MenuItem menuItemFindItem = popupMenu.getMenu().findItem(R.id.disconnect);
        if (!l1VarY4.n() && !l1VarY4.i()) {
            z10 = false;
        }
        menuItemFindItem.setVisible(z10);
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: s4.g7
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return SimpleDeviceFragment.w5(l1VarY4, uVarW, simpleDeviceFragment, arrayList, menuItem);
            }
        });
        popupMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w5(l1 l1Var, u uVar, SimpleDeviceFragment simpleDeviceFragment, ArrayList arrayList, MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.disconnect) {
            l1Var.h(true);
        } else if (itemId == R.id.del) {
            uVar.c(l1Var);
            if (l1Var instanceof o) {
                o oVar = (o) l1Var;
                Cfg.m0(m0.j(oVar.q()));
                BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
                if (defaultAdapter != null) {
                    m3.a.e(defaultAdapter.getRemoteDevice(m0.j(oVar.q())));
                }
            }
        } else if (itemId == R.id.settings) {
            com.dw.ht.o.f6637b.a().j().e(simpleDeviceFragment.x3(), l1Var.q());
        } else if (itemId >= 0 && itemId < arrayList.size()) {
            uVar.G((l1) arrayList.get(menuItem.getItemId()));
            l1 l1VarR = uVar.r();
            if (l1VarR != null) {
                l1VarR.v(true);
            }
        }
        return true;
    }

    private final void x5() {
        n1 n1Var = this.binding;
        if (n1Var == null) {
            return;
        }
        c0 c0VarW4 = W4();
        if (c0VarW4 == null) {
            n1Var.f21379d.setText(R.string.walkie_talkie);
            n1Var.f21377b.setVisibility(8);
            n1Var.f21381f.setVisibility(8);
            n1Var.f21382g.setVisibility(8);
            n1Var.f21378c.setVisibility(8);
            n1Var.f21380e.setVisibility(0);
            return;
        }
        n1Var.f21379d.setText(c0VarW4.getName());
        n1Var.f21377b.setVisibility(this.smallScreen ? 8 : 0);
        n1Var.f21381f.setVisibility(0);
        n1Var.f21382g.setVisibility(0);
        n1Var.f21378c.setVisibility(0);
        n1Var.f21380e.setVisibility(8);
        n1Var.f21378c.setSelected(c0VarW4.Y().f29921j);
        if (c0VarW4.i() || c0VarW4.n()) {
            n1Var.f21377b.setImageResource(R.drawable.ic_ht_black_24dp);
            n1Var.f21377b.setContentDescription(H1().getString(R.string.connected));
        } else {
            n1Var.f21377b.setImageResource(R.drawable.ic_ht_offline);
            n1Var.f21377b.setContentDescription(H1().getString(R.string.alert_attempt_connection_title));
        }
        if (c0VarW4.p0()) {
            n1Var.f21381f.setImageResource(R.drawable.ic_volume_up_24dp);
            n1Var.f21377b.setContentDescription(H1().getString(R.string.monitor));
        } else {
            n1Var.f21381f.setImageResource(R.drawable.ic_volume_off_24dp);
            n1Var.f21377b.setContentDescription(H1().getString(R.string.mute));
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        h5(u.w().q());
        x5();
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        m.e(view, "view");
        super.Q2(view, savedInstanceState);
        n1 n1Var = this.binding;
        if (n1Var == null) {
            return;
        }
        androidx.fragment.app.o oVarI0 = j1().i0(R.id.dev_status_fragment);
        m.c(oVarI0, "null cannot be cast to non-null type com.dw.ht.fragments.DeviceStatusFragment");
        DeviceStatusFragment deviceStatusFragment = (DeviceStatusFragment) oVarI0;
        this.deviceStatusFragment = deviceStatusFragment;
        if (deviceStatusFragment != null) {
            deviceStatusFragment.G5(false);
        }
        n1Var.f21377b.setOnClickListener(new View.OnClickListener() { // from class: s4.c7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SimpleDeviceFragment.s5(this.f26396a, view2);
            }
        });
        n1Var.f21381f.setOnClickListener(new View.OnClickListener() { // from class: s4.d7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SimpleDeviceFragment.t5(this.f26406a, view2);
            }
        });
        n1Var.f21378c.setOnClickListener(new View.OnClickListener() { // from class: s4.e7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SimpleDeviceFragment.u5(this.f26416a, view2);
            }
        });
        n1Var.f21382g.setOnClickListener(new View.OnClickListener() { // from class: s4.f7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SimpleDeviceFragment.v5(this.f26429a, view2);
            }
        });
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void W0(n0 link) {
        m.e(link, "link");
        super.W0(link);
        x5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(n0 oldLink, n0 newLink) {
        super.d5(oldLink, newLink);
        DeviceStatusFragment deviceStatusFragment = this.deviceStatusFragment;
        if (deviceStatusFragment != null) {
            deviceStatusFragment.h5(Y4());
        }
        x5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void j0(n0 link, k0 oldStatus, k0 newStatus) {
        ActionButton actionButton;
        m.e(link, "link");
        m.e(oldStatus, "oldStatus");
        m.e(newStatus, "newStatus");
        n1 n1Var = this.binding;
        if (n1Var == null || (actionButton = n1Var.f21378c) == null) {
            return;
        }
        actionButton.setSelected(newStatus.f29921j);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void o0(n0 link) {
        m.e(link, "link");
        super.o0(link);
        x5();
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(u.c event) {
        m.e(event, "event");
        if (a.f6190a[event.ordinal()] == 1) {
            h5(u.w().q());
            x5();
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.e(inflater, "inflater");
        this.binding = n1.c(inflater, container, false);
        this.smallScreen = x3().getResources().getBoolean(R.bool.small_screen);
        n1 n1Var = this.binding;
        m.b(n1Var);
        CardView cardViewB = n1Var.b();
        m.d(cardViewB, "getRoot(...)");
        return cardViewB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
