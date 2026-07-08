package com.dw.ht.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.appcompat.widget.PopupMenu;
import androidx.cardview.widget.CardView;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.entitys.IIChannel;
import com.dw.ht.fragments.SimpleIIFragment;
import com.dw.ht.o;
import kotlin.Metadata;
import m4.o1;
import org.greenrobot.eventbus.ThreadMode;
import rd.m;
import s4.r3;
import u4.d0;
import u4.k;
import u4.v;
import v4.l1;
import v4.n0;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J!\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0019\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\u0003J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020$H\u0007¢\u0006\u0004\b\"\u0010%J)\u0010+\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,R\u0018\u00100\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/dw/ht/fragments/SimpleIIFragment;", "Lcom/dw/ht/fragments/DeviceFragment;", "<init>", "()V", "Ldd/d0;", "z5", "A5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lv4/n0;", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "link", "o0", "(Lv4/n0;)V", "W0", "M2", "Lv4/u$c;", "event", "onMessageEvent", "(Lv4/u$c;)V", "Lcom/dw/ht/Cfg$a;", "(Lcom/dw/ht/Cfg$a;)V", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "m2", "(IILandroid/content/Intent;)V", "Lm4/o1;", "P0", "Lm4/o1;", "binding", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SimpleIIFragment extends DeviceFragment {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private o1 binding;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f6192b;

        static {
            int[] iArr = new int[u.c.values().length];
            try {
                iArr[u.c.CurrentLinkChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f6191a = iArr;
            int[] iArr2 = new int[Cfg.a.values().length];
            try {
                iArr2[Cfg.a.SimpleUIBindChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            f6192b = iArr2;
        }
    }

    private final void A5() {
        o1 o1Var = this.binding;
        if (o1Var == null) {
            return;
        }
        l1 l1VarY4 = Y4();
        int i10 = 0;
        if (l1VarY4 == null) {
            o1Var.f21395f.setVisibility(0);
            o1Var.f21393d.setVisibility(8);
            o1Var.f21391b.setVisibility(8);
            o1Var.f21396g.setVisibility(8);
            o1Var.f21397h.setVisibility(8);
            return;
        }
        o1Var.f21395f.setVisibility(8);
        o1Var.f21393d.setVisibility(0);
        o1Var.f21391b.setVisibility(0);
        o1Var.f21396g.setVisibility(0);
        o1Var.f21397h.setVisibility(0);
        d0.k(l1VarY4.q() - 28147497671065500L);
        o1Var.f21392c.setText(l1VarY4.getName());
        o1Var.f21398i.setText(l1VarY4.f0());
        if (l1VarY4.i()) {
            o1Var.f21391b.setImageResource(R.drawable.ic_internet_intercom);
        } else {
            o1Var.f21391b.setImageResource(R.drawable.ic_cloud_off_black_24dp);
        }
        if (l1VarY4.p0()) {
            o1Var.f21396g.setImageResource(R.drawable.ic_volume_up_24dp);
        } else {
            o1Var.f21396g.setImageResource(R.drawable.ic_volume_off_24dp);
        }
        ImageView imageView = o1Var.f21394e;
        if (!Cfg.O().getSimpleUIBind() && !m.a(l1VarY4, u.w().r())) {
            i10 = 4;
        }
        imageView.setVisibility(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t5(SimpleIIFragment simpleIIFragment, View view) {
        simpleIIFragment.z5();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u5(SimpleIIFragment simpleIIFragment, View view) {
        l1 l1VarY4 = simpleIIFragment.Y4();
        if (l1VarY4 != null) {
            u.w().G(l1VarY4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v5(SimpleIIFragment simpleIIFragment, View view) {
        l1 l1VarY4 = simpleIIFragment.Y4();
        if (l1VarY4 == null) {
            simpleIIFragment.z5();
        } else if (l1VarY4.n() || l1VarY4.i()) {
            l1VarY4.h(true);
        } else {
            l1VarY4.v(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w5(SimpleIIFragment simpleIIFragment, View view) {
        l1 l1VarY4 = simpleIIFragment.Y4();
        if (l1VarY4 == null) {
            simpleIIFragment.z5();
        } else {
            l1VarY4.i1(!l1VarY4.p0());
            simpleIIFragment.A5();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x5(final SimpleIIFragment simpleIIFragment, View view) {
        l1 l1VarY4 = simpleIIFragment.Y4();
        if (l1VarY4 == null) {
            return;
        }
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        popupMenu.getMenuInflater().inflate(R.menu.simple_ii, popupMenu.getMenu());
        final IIChannel iIChannelK = d0.k(l1VarY4.q() - 28147497671065500L);
        if (iIChannelK == null) {
            popupMenu.getMenu().setGroupVisible(R.id.ch, false);
        } else if (iIChannelK.l() == com.dw.ht.user.b.f6853a.i()) {
            popupMenu.getMenu().findItem(R.id.quit).setVisible(false);
        } else {
            popupMenu.getMenu().findItem(R.id.edit).setVisible(false);
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: s4.m7
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return SimpleIIFragment.y5(iIChannelK, simpleIIFragment, menuItem);
            }
        });
        popupMenu.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean y5(IIChannel iIChannel, SimpleIIFragment simpleIIFragment, MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id._switch /* 2131296284 */:
                simpleIIFragment.z5();
                break;
            case R.id.edit /* 2131296696 */:
                Bundle bundle = new Bundle();
                m.b(iIChannel);
                bundle.putLong("channel_id", iIChannel.getChannelId());
                FragmentShowActivity.i2(simpleIIFragment.x3(), null, k.class, bundle);
                break;
            case R.id.members /* 2131296991 */:
                simpleIIFragment.k5(r3.class);
                break;
            case R.id.quit /* 2131297235 */:
                d0 d0Var = d0.f28046a;
                m.b(iIChannel);
                d0Var.m(iIChannel.getChannelId());
                break;
            case R.id.share /* 2131297371 */:
                Context contextX3 = simpleIIFragment.x3();
                m.b(iIChannel);
                o5.f.f(contextX3, iIChannel);
                break;
        }
        return true;
    }

    private final void z5() {
        if (com.dw.ht.user.b.f6853a.i() == 0) {
            Toast.makeText(k1(), N1(R.string.pleaseLoginFirst), 1).show();
            o.f6637b.a().j().l(x3());
        } else {
            v.Companion companion = v.INSTANCE;
            Context contextX3 = x3();
            m.d(contextX3, "requireContext(...)");
            startActivityForResult(companion.b(contextX3), 1);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        h5(u.w().t());
        A5();
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        m.e(view, "view");
        super.Q2(view, savedInstanceState);
        o1 o1Var = this.binding;
        if (o1Var == null) {
            return;
        }
        o1Var.f21395f.setOnClickListener(new View.OnClickListener() { // from class: s4.h7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SimpleIIFragment.t5(this.f26514a, view2);
            }
        });
        o1Var.f21393d.setOnClickListener(new View.OnClickListener() { // from class: s4.i7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SimpleIIFragment.u5(this.f26527a, view2);
            }
        });
        o1Var.f21391b.setOnClickListener(new View.OnClickListener() { // from class: s4.j7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SimpleIIFragment.v5(this.f26546a, view2);
            }
        });
        o1Var.f21396g.setOnClickListener(new View.OnClickListener() { // from class: s4.k7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SimpleIIFragment.w5(this.f26556a, view2);
            }
        });
        o1Var.f21397h.setOnClickListener(new View.OnClickListener() { // from class: s4.l7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SimpleIIFragment.x5(this.f26568a, view2);
            }
        });
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void W0(n0 link) {
        m.e(link, "link");
        super.W0(link);
        A5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(n0 oldLink, n0 newLink) {
        super.d5(oldLink, newLink);
        A5();
    }

    @Override // androidx.fragment.app.o
    public void m2(int requestCode, int resultCode, Intent data) {
        if (resultCode == -1) {
            if (requestCode == 1) {
                long jA = v.INSTANCE.a(data);
                if (jA < 0) {
                    return;
                }
                u uVarW = u.w();
                m.d(uVarW, "getInstance(...)");
                uVarW.G(uVarW.B(jA));
                l1 l1VarR = uVarW.r();
                if (l1VarR != null) {
                    l1VarR.v(true);
                    return;
                }
                return;
            }
            if (requestCode == 2) {
                return;
            }
        }
        super.m2(requestCode, resultCode, data);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void o0(n0 link) {
        m.e(link, "link");
        super.o0(link);
        A5();
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(u.c event) {
        m.e(event, "event");
        if (a.f6191a[event.ordinal()] == 1) {
            h5(u.w().t());
            A5();
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.e(inflater, "inflater");
        o1 o1VarC = o1.c(inflater, container, false);
        this.binding = o1VarC;
        m.b(o1VarC);
        CardView cardViewB = o1VarC.b();
        m.d(cardViewB, "getRoot(...)");
        return cardViewB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(Cfg.a event) {
        m.e(event, "event");
        if (a.f6192b[event.ordinal()] == 1) {
            A5();
        }
    }
}
