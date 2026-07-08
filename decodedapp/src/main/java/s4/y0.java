package s4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.CSViewPager;
import androidx.viewpager.widget.ViewPager;
import com.dw.ht.entitys.ChannelBond;
import com.dw.ht.entitys.IIChannel;
import com.dw.ht.fragments.ContactsListFragment;
import com.dw.ht.fragments.DeviceFragment;
import com.google.android.material.tabs.TabLayout;
import java.util.HashMap;
import kotlin.Metadata;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J!\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\u00020\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u00152\b\u0010\u001a\u001a\u0004\u0018\u00010\u0015H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\"\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u001dH\u0016¢\u0006\u0004\b'\u0010%J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u00052\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.R0\u00103\u001a\u001e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u00010/j\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u0001`08\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R*\u0010<\u001a\n\u0012\u0004\u0012\u000205\u0018\u0001048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u0018\u0010@\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER$\u0010M\u001a\u00020G2\u0006\u0010H\u001a\u00020G8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bI\u0010J\"\u0004\bK\u0010LR$\u0010P\u001a\u00020G2\u0006\u0010H\u001a\u00020G8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bN\u0010J\"\u0004\bO\u0010L¨\u0006Q"}, d2 = {"Ls4/y0;", "Lcom/dw/ht/fragments/DeviceFragment;", "Landroidx/viewpager/widget/ViewPager$j;", "<init>", "()V", "Ldd/d0;", "v5", "u5", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lv4/n0;", "link", "i0", "(Lv4/n0;)V", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "", "position", "", "positionOffset", "positionOffsetPixels", "e", "(IFI)V", "n0", "(I)V", "state", "l0", "Lv3/e0;", "getSearchable", "()Lv3/e0;", "", "newText", "D4", "(Ljava/lang/String;)V", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "P0", "Ljava/util/HashMap;", "fragments", "Lc6/i;", "Ld5/g;", "Q0", "Lc6/i;", "q5", "()Lc6/i;", "s5", "(Lc6/i;)V", "onItemClickListener", "Landroid/view/MenuItem;", "R0", "Landroid/view/MenuItem;", "iiMenu", "S0", "devMenu", "Lm4/a0;", "T0", "Lm4/a0;", "binding", "", "value", "U0", "J", "r5", "(J)V", "networkChannelId", "V0", "t5", "rfDeviceId", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y0 extends DeviceFragment implements ViewPager.j {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private final HashMap fragments = new HashMap();

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private c6.i onItemClickListener;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private MenuItem iiMenu;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private MenuItem devMenu;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private m4.a0 binding;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private long networkChannelId;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private long rfDeviceId;

    public static final class b extends y0.o {
        b(androidx.fragment.app.w wVar) {
            super(wVar);
        }

        @Override // androidx.viewpager.widget.a
        public int c() {
            return 2;
        }

        @Override // y0.o, androidx.viewpager.widget.a
        public Object g(ViewGroup viewGroup, int i10) {
            rd.m.e(viewGroup, "container");
            Object objG = super.g(viewGroup, i10);
            rd.m.d(objG, "instantiateItem(...)");
            y0.this.fragments.put(Integer.valueOf(i10), (DeviceFragment) objG);
            if (objG instanceof ContactsListFragment) {
                ((ContactsListFragment) objG).u5(y0.this.getOnItemClickListener());
                return objG;
            }
            if (objG instanceof r3) {
                ((r3) objG).G5(y0.this.getOnItemClickListener());
            }
            return objG;
        }

        @Override // y0.o
        public androidx.fragment.app.o p(int i10) {
            if (i10 == 0) {
                ContactsListFragment contactsListFragment = new ContactsListFragment();
                contactsListFragment.u5(y0.this.getOnItemClickListener());
                contactsListFragment.e5(y0.this.rfDeviceId);
                return contactsListFragment;
            }
            r3 r3Var = new r3();
            r3Var.G5(y0.this.getOnItemClickListener());
            r3Var.f5(y0.this.networkChannelId);
            return r3Var;
        }
    }

    private final void r5(long j10) {
        if (this.networkChannelId == j10) {
            return;
        }
        this.networkChannelId = j10;
        MenuItem menuItem = this.iiMenu;
        if (menuItem != null) {
            IIChannel iIChannelK = u4.d0.k(j10);
            menuItem.setTitle(iIChannelK != null ? iIChannelK.k() : null);
        }
        v5();
    }

    private final void t5(long j10) {
        if (this.rfDeviceId == j10) {
            return;
        }
        this.rfDeviceId = j10;
        MenuItem menuItem = this.devMenu;
        if (menuItem != null) {
            v4.l1 l1VarL = v4.u.w().l(this.rfDeviceId);
            menuItem.setTitle(l1VarL != null ? l1VarL.getName() : null);
        }
        v5();
    }

    private final void u5() {
        v4.c0 c0Var;
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        long jQ = l1VarY4.q();
        long networkChannelId = 0;
        if (l1VarY4 instanceof v4.c0) {
            v4.c0 c0Var2 = (v4.c0) l1VarY4;
            ChannelBond channelBondK1 = c0Var2.K1(c0Var2.c2().c());
            if (channelBondK1 != null) {
                networkChannelId = channelBondK1.getNetworkChannelId();
            }
        } else if (l1VarY4 instanceof v4.n1) {
            v4.n1 n1Var = (v4.n1) l1VarY4;
            long j10 = n1Var.T;
            u.d dVarX1 = n1Var.x1(true);
            networkChannelId = j10;
            jQ = (dVarX1 == null || (c0Var = dVarX1.f30167a) == null) ? 0L : c0Var.q();
        }
        r5(networkChannelId);
        t5(jQ);
    }

    private final void v5() {
        m4.a0 a0Var = this.binding;
        if (a0Var == null) {
            return;
        }
        int i10 = (this.networkChannelId == 0 ? 0 : 1) + (this.rfDeviceId == 0 ? 0 : 1);
        if (i10 == 1) {
            a0Var.f20968c.setVisibility(8);
            a0Var.f20967b.setVisibility(8);
            a0Var.f20969d.setCurrentItem(this.networkChannelId == 0 ? 0 : 1);
        } else {
            a0Var.f20968c.setVisibility(0);
            a0Var.f20967b.setVisibility(0);
        }
        a0Var.f20969d.setDisableSlideSwitchingPagers(i10 < 2);
        DeviceFragment deviceFragment = (DeviceFragment) this.fragments.get(0);
        if (deviceFragment != null) {
            deviceFragment.e5(this.rfDeviceId);
        }
        DeviceFragment deviceFragment2 = (DeviceFragment) this.fragments.get(1);
        if (deviceFragment2 != null) {
            deviceFragment2.f5(this.networkChannelId);
        }
    }

    @Override // v3.f0
    protected void D4(String newText) {
        DeviceFragment deviceFragment;
        rd.m.e(newText, "newText");
        m4.a0 a0Var = this.binding;
        if (a0Var == null || (deviceFragment = (DeviceFragment) this.fragments.get(Integer.valueOf(a0Var.f20969d.getCurrentItem()))) == null) {
            return;
        }
        deviceFragment.h(newText);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        m4.a0 a0Var = this.binding;
        if (a0Var == null) {
            return;
        }
        a0Var.f20967b.h(new a(a0Var));
        TabLayout.g gVarB = a0Var.f20967b.B(a0Var.f20969d.getCurrentItem());
        if (gVarB != null) {
            gVarB.l();
        }
        a0Var.f20969d.setEnabled(false);
        a0Var.f20969d.d(this);
        a0Var.f20969d.setAdapter(new b(j1()));
        v5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(v4.n0 oldLink, v4.n0 newLink) {
        super.d5(oldLink, newLink);
        u5();
    }

    @Override // v3.f0, v3.e0
    public v3.e0 getSearchable() {
        DeviceFragment deviceFragment;
        m4.a0 a0Var = this.binding;
        if (a0Var == null || (deviceFragment = (DeviceFragment) this.fragments.get(Integer.valueOf(a0Var.f20969d.getCurrentItem()))) == null) {
            return null;
        }
        return deviceFragment.getSearchable();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void i0(v4.n0 link) {
        rd.m.e(link, "link");
        super.i0(link);
        u5();
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void n0(int position) {
        TabLayout.g gVarB;
        m4.a0 a0Var = this.binding;
        if (a0Var == null || (gVarB = a0Var.f20967b.B(a0Var.f20969d.getCurrentItem())) == null) {
            return;
        }
        gVarB.l();
    }

    /* JADX INFO: renamed from: q5, reason: from getter */
    public final c6.i getOnItemClickListener() {
        return this.onItemClickListener;
    }

    public final void s5(c6.i iVar) {
        this.onItemClickListener = iVar;
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.a0 a0VarC = m4.a0.c(inflater, container, false);
        this.binding = a0VarC;
        rd.m.b(a0VarC);
        ConstraintLayout constraintLayoutB = a0VarC.b();
        rd.m.d(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    public static final class a implements TabLayout.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m4.a0 f26854a;

        a(m4.a0 a0Var) {
            this.f26854a = a0Var;
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void a0(TabLayout.g gVar) {
            CSViewPager cSViewPager = this.f26854a.f20969d;
            rd.m.b(gVar);
            cSViewPager.setCurrentItem(gVar.g());
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void N0(TabLayout.g gVar) {
        }

        @Override // com.google.android.material.tabs.TabLayout.c
        public void t(TabLayout.g gVar) {
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void l0(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void e(int position, float positionOffset, int positionOffsetPixels) {
    }
}
