package com.dw.ht.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.view.CSViewPager;
import androidx.fragment.app.p;
import androidx.fragment.app.w;
import androidx.viewpager.widget.ViewPager;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.BTActivity;
import com.dw.ht.Cfg;
import com.dw.ht.activitys.ContactDetailsActivity;
import com.dw.ht.fragments.SessionFragment;
import com.dw.ht.fragments.j;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import k5.w0;
import kotlin.Metadata;
import m4.j1;
import org.greenrobot.eventbus.ThreadMode;
import q4.z;
import rd.m;
import s4.a4;
import s4.b1;
import s4.e6;
import s4.y0;
import u4.d0;
import v3.e0;
import v3.f0;
import v4.k0;
import v4.l1;
import v4.n0;
import v4.n1;
import v4.q;
import w5.d;
import y0.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 \u0082\u00012\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005:\u0002\u0083\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\rJ#\u0010\u001d\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ)\u0010$\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010\"H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\b2\u0006\u0010 \u001a\u00020&2\u0006\u0010\u000f\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u0011\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b+\u0010,J\u0017\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\b2\u0006\u0010 \u001a\u00020&H\u0016¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\bH\u0016¢\u0006\u0004\b4\u0010\u0007J\u0017\u00106\u001a\u00020\b2\u0006\u00105\u001a\u00020\u001aH\u0016¢\u0006\u0004\b6\u00107J\u0017\u00108\u001a\u00020\b2\u0006\u00105\u001a\u00020\u001aH\u0016¢\u0006\u0004\b8\u00107J\u0017\u00109\u001a\u00020\b2\u0006\u00105\u001a\u00020\u001aH\u0016¢\u0006\u0004\b9\u00107J'\u0010=\u001a\u00020\b2\u0006\u00105\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020:H\u0016¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\bH\u0016¢\u0006\u0004\b?\u0010\u0007J\u0017\u0010B\u001a\u00020\b2\u0006\u0010A\u001a\u00020@H\u0014¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020/H\u0014¢\u0006\u0004\bD\u0010EJ\u001f\u0010I\u001a\u00020/2\u0006\u0010F\u001a\u00020\u00032\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u0015\u0010M\u001a\u00020\b2\u0006\u0010L\u001a\u00020K¢\u0006\u0004\bM\u0010NJ\u000f\u0010O\u001a\u00020\bH\u0016¢\u0006\u0004\bO\u0010\u0007J\u000f\u0010P\u001a\u00020\bH\u0016¢\u0006\u0004\bP\u0010\u0007J\u0017\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020QH\u0007¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\b2\u0006\u0010!\u001a\u00020\u0012H\u0016¢\u0006\u0004\bU\u0010VJ\u0017\u0010S\u001a\u00020\b2\u0006\u0010R\u001a\u00020WH\u0007¢\u0006\u0004\bS\u0010XJ'\u0010]\u001a\u00020\b2\u0006\u0010Y\u001a\u00020G2\u0006\u0010[\u001a\u00020Z2\u0006\u0010\\\u001a\u00020GH\u0016¢\u0006\u0004\b]\u0010^J\u0017\u0010_\u001a\u00020\b2\u0006\u0010Y\u001a\u00020GH\u0016¢\u0006\u0004\b_\u0010`J\u0017\u0010b\u001a\u00020\b2\u0006\u0010a\u001a\u00020GH\u0016¢\u0006\u0004\bb\u0010`J\u0019\u0010S\u001a\u00020\b2\b\u0010R\u001a\u0004\u0018\u00010cH\u0017¢\u0006\u0004\bS\u0010dR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010k\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010jR0\u0010q\u001a\u001e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020m0lj\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020m`n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010pR$\u0010v\u001a\u00020G2\u0006\u0010r\u001a\u00020G8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bs\u0010t\"\u0004\bu\u0010`R\u0013\u0010y\u001a\u0004\u0018\u00010m8F¢\u0006\u0006\u001a\u0004\bw\u0010xR\u0013\u0010}\u001a\u0004\u0018\u00010z8F¢\u0006\u0006\u001a\u0004\b{\u0010|R\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0084\u0001"}, d2 = {"Lcom/dw/ht/fragments/SessionFragment;", "Lcom/dw/ht/fragments/DeviceFragment;", "Lc6/i;", "Ld5/g;", "Landroid/view/View$OnClickListener;", "Landroidx/viewpager/widget/ViewPager$j;", "<init>", "()V", "Ldd/d0;", "z5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "N2", "Lv4/n0;", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "Landroid/view/ContextMenu;", "menu", "v", "Landroid/view/ContextMenu$ContextMenuInfo;", "menuInfo", "onCreateContextMenu", "(Landroid/view/ContextMenu;Landroid/view/View;Landroid/view/ContextMenu$ContextMenuInfo;)V", "Landroid/view/Menu;", "Landroid/view/MenuInflater;", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Lv3/e0;", "getSearchable", "()Lv3/e0;", "Landroid/view/MenuItem;", "item", "", "F2", "(Landroid/view/MenuItem;)Z", "J2", "(Landroid/view/Menu;)V", "M2", "link", "o0", "(Lv4/n0;)V", "W0", "i0", "Lv4/k0;", "oldStatus", "newStatus", "j0", "(Lv4/n0;Lv4/k0;Lv4/k0;)V", "y2", "", "newText", "D4", "(Ljava/lang/String;)V", "c4", "()Z", "session", "", "action", "w5", "(Ld5/g;I)Z", "Lcom/google/android/gms/maps/model/LatLngBounds;", "bounds", "q5", "(Lcom/google/android/gms/maps/model/LatLngBounds;)V", "O2", "P2", "Lu4/d0$a;", "event", "onMessageEvent", "(Lu4/d0$a;)V", "onClick", "(Landroid/view/View;)V", "Lcom/dw/ht/fragments/j$h;", "(Lcom/dw/ht/fragments/j$h;)V", "position", "", "positionOffset", "positionOffsetPixels", "e", "(IFI)V", "n0", "(I)V", "state", "l0", "Lv4/l1$e;", "(Lv4/l1$e;)V", "Lm4/j1;", "P0", "Lm4/j1;", "binding", "Q0", "Lcom/google/android/gms/maps/model/LatLngBounds;", "mFocusLatLngBounds", "Ljava/util/HashMap;", "Lv3/f0;", "Lkotlin/collections/HashMap;", "R0", "Ljava/util/HashMap;", "fragments", "value", "u5", "()I", "y5", "currentPosition", "t5", "()Lv3/f0;", "currentFragment", "Lcom/dw/ht/fragments/j;", "v5", "()Lcom/dw/ht/fragments/j;", "mapFragment", "Lcom/dw/ht/fragments/BottomActionFragment;", "s5", "()Lcom/dw/ht/fragments/BottomActionFragment;", "bottomActionFragment", "S0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class SessionFragment extends DeviceFragment implements c6.i, View.OnClickListener, ViewPager.j {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private j1 binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private LatLngBounds mFocusLatLngBounds;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private final HashMap fragments = new HashMap();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6188a;

        static {
            int[] iArr = new int[l1.e.values().length];
            try {
                iArr[l1.e.BATTERY_VOLTAGE_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[l1.e.DELAY_CHANGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6188a = iArr;
        }
    }

    public static final class c extends o {
        c(w wVar) {
            super(wVar);
        }

        @Override // androidx.viewpager.widget.a
        public int c() {
            return 3;
        }

        @Override // y0.o, androidx.viewpager.widget.a
        public Object g(ViewGroup viewGroup, int i10) {
            m.e(viewGroup, "container");
            Object objG = super.g(viewGroup, i10);
            m.d(objG, "instantiateItem(...)");
            SessionFragment.this.fragments.put(Integer.valueOf(i10), (f0) objG);
            if (objG instanceof y0) {
                ((y0) objG).s5(SessionFragment.this);
            }
            return objG;
        }

        @Override // y0.o
        public androidx.fragment.app.o p(int i10) {
            if (i10 == 0) {
                TalkListFragment talkListFragmentA5 = TalkListFragment.A5(SessionFragment.this.V4());
                m.d(talkListFragmentA5, "newInstance(...)");
                return talkListFragmentA5;
            }
            if (i10 != 1) {
                j jVarX5 = j.x5(false);
                m.d(jVarX5, "newInstance(...)");
                return jVarX5;
            }
            y0 y0Var = new y0();
            l1 l1VarY4 = SessionFragment.this.Y4();
            y0Var.e5(l1VarY4 != null ? l1VarY4.q() : 0L);
            return y0Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r5(SessionFragment sessionFragment, LatLngBounds latLngBounds) {
        j jVarV5;
        j1 j1Var = sessionFragment.binding;
        if ((j1Var != null ? j1Var.f21255e : null) == null || !sessionFragment.a2() || (jVarV5 = sessionFragment.v5()) == null) {
            return;
        }
        jVarV5.G(latLngBounds, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x5(SessionFragment sessionFragment, MenuItem menuItem) {
        m.e(menuItem, "it");
        int itemId = menuItem.getItemId();
        sessionFragment.y5(itemId != R.id.contacts ? itemId != R.id.map ? 0 : 2 : 1);
        return true;
    }

    private final void z5() {
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        x4(l1VarY4.f0());
    }

    @Override // v3.f0
    protected void D4(String newText) {
        m.e(newText, "newText");
        if (!a6.w.b(newText)) {
            f0 f0VarT5 = t5();
            if (f0VarT5 != null) {
                f0VarT5.h(newText);
                return;
            }
            return;
        }
        Collection collectionValues = this.fragments.values();
        m.d(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).h("");
        }
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        m.e(item, "item");
        int itemId = item.getItemId();
        l1 l1VarY4 = Y4();
        switch (itemId) {
            case R.id.connect_audio /* 2131296572 */:
                if (l1VarY4 != null) {
                    l1VarY4.L(true);
                }
                break;
            case R.id.create_a_team /* 2131296597 */:
                k5(b1.class);
                return true;
            case R.id.disconnect_audio /* 2131296658 */:
                if (l1VarY4 != null) {
                    l1VarY4.O(true);
                }
                break;
            case R.id.join_a_team /* 2131296896 */:
                k5(a4.class);
                return true;
            case R.id.nearby_people /* 2131297082 */:
                if (l1VarY4 != null) {
                    q qVarT = l1VarY4.T();
                    m.d(qVarT, "getBssConfig(...)");
                    l1VarY4.O0(new d.c().i(qVarT.w()).k(qVarT.E()).f().c());
                }
                break;
            case R.id.satelliteManager /* 2131297299 */:
                FragmentShowActivity.h2(x3(), null, e6.class);
                break;
            case R.id.search /* 2131297322 */:
                e0 searchable = getSearchable();
                if (searchable != null) {
                    searchable.Q();
                }
                break;
            case R.id.settings /* 2131297370 */:
                Context contextK1 = k1();
                m.b(contextK1);
                FragmentShowActivity.h2(contextK1, N1(R.string.settings), w0.class);
                break;
            case R.id.signal_gen /* 2131297388 */:
                k5(z.class);
                break;
            case R.id.start_monitor /* 2131297448 */:
                if (l1VarY4 != null) {
                    l1VarY4.i1(true);
                }
                if (l1VarY4 != null) {
                    l1VarY4.L(true);
                }
                break;
            case R.id.stop_monitor /* 2131297457 */:
                if (l1VarY4 != null) {
                    l1VarY4.i1(false);
                }
                break;
            default:
                return super.F2(item);
        }
        a4();
        return true;
    }

    @Override // androidx.fragment.app.o
    public void J2(Menu menu) {
        CSViewPager cSViewPager;
        m.e(menu, "menu");
        l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            boolean z10 = l1VarY4.R() == n0.c.Connecting || l1VarY4.i();
            boolean z11 = l1VarY4.p0() && z10;
            menu.findItem(R.id.start_monitor).setVisible(!z11);
            menu.findItem(R.id.stop_monitor).setVisible(z11);
            menu.findItem(R.id.disconnect_audio).setVisible(z10);
            menu.findItem(R.id.connect_audio).setVisible(!z10);
        } else {
            menu.findItem(R.id.disconnect_audio).setVisible(false);
            menu.findItem(R.id.connect_audio).setVisible(false);
        }
        menu.findItem(R.id.save_audio).setChecked(Cfg.h0());
        MenuItem menuItemFindItem = menu.findItem(R.id.search);
        j1 j1Var = this.binding;
        menuItemFindItem.setVisible(!((j1Var == null || (cSViewPager = j1Var.f21255e) == null || cSViewPager.getCurrentItem() != 1) ? false : true));
        Integer[] numArr = {Integer.valueOf(R.id.team), Integer.valueOf(R.id.nearby_people)};
        if (l1VarY4 instanceof n1) {
            for (int i10 = 0; i10 < 2; i10++) {
                MenuItem menuItemFindItem2 = menu.findItem(numArr[i10].intValue());
                if (menuItemFindItem2 != null) {
                    menuItemFindItem2.setVisible(false);
                }
            }
        } else {
            for (int i11 = 0; i11 < 2; i11++) {
                MenuItem menuItemFindItem3 = menu.findItem(numArr[i11].intValue());
                if (menuItemFindItem3 != null) {
                    menuItemFindItem3.setVisible(true);
                }
            }
        }
        if (l1VarY4 instanceof v4.g) {
            menu.setGroupVisible(R.id.dev, false);
        }
        super.J2(menu);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        a4();
        super.M2();
        LatLngBounds latLngBounds = this.mFocusLatLngBounds;
        if (latLngBounds != null) {
            m.b(latLngBounds);
            q5(latLngBounds);
            this.mFocusLatLngBounds = null;
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void N2(Bundle outState) {
        m.e(outState, "outState");
        super.N2(outState);
    }

    @Override // androidx.fragment.app.o
    public void O2() {
        super.O2();
        mi.c.e().q(this);
    }

    @Override // androidx.fragment.app.o
    public void P2() {
        super.P2();
        mi.c.e().t(this);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        m.e(view, "view");
        super.Q2(view, savedInstanceState);
        j1 j1Var = this.binding;
        if (j1Var == null) {
            return;
        }
        j1Var.f21254d.setOnClickListener(this);
        j1Var.f21257g.setOnClickListener(this);
        BottomActionFragment bottomActionFragmentS5 = s5();
        if (bottomActionFragmentS5 != null) {
            bottomActionFragmentS5.h5(Y4());
        }
        l1 l1VarY4 = Y4();
        m.b(l1VarY4);
        o0(l1VarY4);
        j1Var.f21252b.setOnNavigationItemSelectedListener(new BottomNavigationView.c() { // from class: s4.l6
            @Override // com.google.android.material.navigation.l.c
            public final boolean a(MenuItem menuItem) {
                return SessionFragment.x5(this.f26567a, menuItem);
            }
        });
        j1Var.f21255e.d(this);
        j1Var.f21255e.setAdapter(new c(j1()));
        if (savedInstanceState == null) {
            y5(2);
        }
        p pVarE1 = e1();
        if (pVarE1 instanceof BTActivity) {
            ((BTActivity) pVarE1).N2();
            j1Var.f21252b.setVisibility(8);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void W0(n0 link) {
        m.e(link, "link");
        super.W0(link);
        z5();
    }

    @Override // v3.f0, v3.v
    protected boolean c4() {
        if (m0()) {
            p0();
            return true;
        }
        if (u5() == 2) {
            return super.c4();
        }
        y5(2);
        return true;
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(n0 oldLink, n0 newLink) {
        super.d5(oldLink, newLink);
        Collection<f0> collectionValues = this.fragments.values();
        m.d(collectionValues, "<get-values>(...)");
        for (f0 f0Var : collectionValues) {
            if (f0Var instanceof DeviceFragment) {
                ((DeviceFragment) f0Var).h5(Y4());
            }
        }
        BottomActionFragment bottomActionFragmentS5 = s5();
        if (bottomActionFragmentS5 != null) {
            bottomActionFragmentS5.h5(Y4());
        }
        z4(newLink != null ? newLink.getName() : null);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void e(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override // v3.f0, v3.e0
    public e0 getSearchable() {
        f0 f0VarT5 = t5();
        if (f0VarT5 != null) {
            return f0VarT5.getSearchable();
        }
        return null;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void i0(n0 link) {
        m.e(link, "link");
        super.i0(link);
        z5();
        z4(link.getName());
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void j0(n0 link, k0 oldStatus, k0 newStatus) {
        m.e(link, "link");
        m.e(oldStatus, "oldStatus");
        m.e(newStatus, "newStatus");
        z5();
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void l0(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void n0(int position) {
        j1 j1Var = this.binding;
        if (j1Var == null) {
            return;
        }
        j1Var.f21252b.setSelectedItemId(position != 1 ? position != 2 ? R.id.message : R.id.map : R.id.contacts);
        j1Var.f21256f.setVisibility(position == 2 ? 0 : 8);
        j1Var.f21255e.setDisableSlideSwitchingPagers(position == 2);
        a4();
        Collection collectionValues = this.fragments.values();
        m.d(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).p0();
        }
        p pVarE1 = e1();
        if (!(pVarE1 instanceof BTActivity)) {
            j1Var.f21252b.setVisibility(position != 2 ? 0 : 8);
        } else {
            j1Var.f21252b.setVisibility(8);
            ((BTActivity) pVarE1).N2();
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void o0(n0 link) {
        m.e(link, "link");
        super.o0(link);
        if (a2()) {
            z5();
            a4();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        m.e(v10, "v");
        int id2 = v10.getId();
        if (id2 == R.id.view_contacts) {
            y5(1);
        } else {
            if (id2 != R.id.view_talk_list) {
                return;
            }
            y5(0);
        }
    }

    @Override // androidx.fragment.app.o, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu menu, View v10, ContextMenu.ContextMenuInfo menuInfo) {
        m.e(menu, "menu");
        m.e(v10, "v");
        super.onCreateContextMenu(menu, v10, menuInfo);
    }

    @mi.m(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(d0.a event) {
        m.e(event, "event");
        l1 l1VarY4 = Y4();
        z4(l1VarY4 != null ? l1VarY4.getName() : null);
    }

    public final void q5(final LatLngBounds bounds) {
        CSViewPager cSViewPager;
        m.e(bounds, "bounds");
        if (this.binding == null) {
            this.mFocusLatLngBounds = bounds;
            return;
        }
        y5(2);
        j1 j1Var = this.binding;
        if (j1Var == null || (cSViewPager = j1Var.f21255e) == null) {
            return;
        }
        cSViewPager.post(new Runnable() { // from class: s4.k6
            @Override // java.lang.Runnable
            public final void run() {
                SessionFragment.r5(this.f26554a, bounds);
            }
        });
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        if (Y4() == null) {
            return;
        }
        G3(true);
    }

    public final BottomActionFragment s5() {
        if (a2()) {
            androidx.fragment.app.o oVarI0 = j1().i0(R.id.bottom_bar);
            if (oVarI0 instanceof BottomActionFragment) {
                return (BottomActionFragment) oVarI0;
            }
        }
        return null;
    }

    public final f0 t5() {
        return (f0) this.fragments.get(Integer.valueOf(u5()));
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        m.e(menu, "menu");
        m.e(inflater, "inflater");
        super.u2(menu, inflater);
        inflater.inflate(R.menu.session_om, menu);
        menu.findItem(R.id.signal_gen).setVisible(false);
        MenuItem menuItemFindItem = menu.findItem(R.id.satelliteManager);
        if (menuItemFindItem != null) {
            menuItemFindItem.setVisible(com.dw.ht.satellite.b.f6691a.J());
        }
    }

    public final int u5() {
        j1 j1Var = this.binding;
        if (j1Var == null) {
            return 0;
        }
        return j1Var.f21255e.getCurrentItem();
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.e(inflater, "inflater");
        j1 j1VarC = j1.c(inflater, container, false);
        this.binding = j1VarC;
        m.b(j1VarC);
        return j1VarC.b();
    }

    public final j v5() {
        Object obj = this.fragments.get(2);
        if (obj instanceof j) {
            return (j) obj;
        }
        return null;
    }

    @Override // c6.i
    /* JADX INFO: renamed from: w5, reason: merged with bridge method [inline-methods] */
    public boolean V0(d5.g session, int action) {
        m.e(session, "session");
        if (action != R.id.loc) {
            if (!a6.w.b(session.f10599a)) {
                Intent intent = new Intent(k1(), (Class<?>) ContactDetailsActivity.class);
                intent.putExtra("com.dw.ht.intent.extras.FROM", session.f10599a);
                O3(intent);
                return true;
            }
            if (0 == session.f10613o) {
                return false;
            }
            Intent intent2 = new Intent(k1(), (Class<?>) ContactDetailsActivity.class);
            intent2.putExtra("com.dw.ht.intent.extras.UID", session.f10613o);
            O3(intent2);
            return true;
        }
        if (session.e()) {
            y5(2);
            j jVarV5 = v5();
            if (jVarV5 != null) {
                jVarV5.f5(session);
            }
            return true;
        }
        d5.d dVarL = d5.d.l(session.f10599a);
        if (dVarL == null) {
            dVarL = d5.d.m(session.f10613o);
        }
        if (dVarL == null) {
            Toast.makeText(k1(), R.string.noLocationInformation, 0).show();
            return false;
        }
        y5(2);
        j jVarV52 = v5();
        if (jVarV52 != null) {
            jVarV52.f5(dVarL);
        }
        return true;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        if (e1() instanceof j4.a) {
            p pVarE1 = e1();
            m.c(pVarE1, "null cannot be cast to non-null type com.dw.ht.activitys.CActivity");
            ((j4.a) pVarE1).X1();
        }
        this.binding = null;
    }

    public final void y5(int i10) {
        CSViewPager cSViewPager;
        j1 j1Var = this.binding;
        if (j1Var == null || (cSViewPager = j1Var.f21255e) == null) {
            return;
        }
        cSViewPager.N(i10, false);
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(j.h event) {
        j jVarV5;
        m.e(event, "event");
        j1 j1Var = this.binding;
        if (j1Var == null) {
            return;
        }
        if (j1Var.f21255e.getCurrentItem() != 2 || ((jVarV5 = v5()) != null && jVarV5.m0())) {
            j1Var.f21256f.setVisibility(8);
        } else {
            j1Var.f21256f.setVisibility(0);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(l1.e event) {
        int i10 = event == null ? -1 : b.f6188a[event.ordinal()];
        if (i10 == 1 || i10 == 2) {
            z5();
        }
    }
}
