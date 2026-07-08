package u4;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.entitys.IIChannel;
import com.dw.ht.fragments.DeviceManagerFragment;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;
import u4.d0;
import v4.l1;
import v4.n1;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 A2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001BB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0006J!\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\t2\b\u0010!\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\tH\u0016¢\u0006\u0004\b(\u0010\u0006J\u000f\u0010)\u001a\u00020\tH\u0016¢\u0006\u0004\b)\u0010\u0006J\u0017\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u00020.H\u0007¢\u0006\u0004\b,\u0010/J\u0017\u0010,\u001a\u00020\t2\u0006\u0010+\u001a\u000200H\u0007¢\u0006\u0004\b,\u00101R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R$\u0010=\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\u0016\u0010@\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006C"}, d2 = {"Lu4/v;", "Lu4/w;", "Landroid/view/View$OnClickListener;", "Lc6/i;", "Lcom/dw/ht/entitys/IIChannel;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "", "F2", "(Landroid/view/MenuItem;)Z", "v", "onClick", "(Landroid/view/View;)V", "", "action", "L4", "(Lcom/dw/ht/entitys/IIChannel;I)Z", "O2", "P2", "Lu4/d0$a;", "event", "onMessageEvent", "(Lu4/d0$a;)V", "Lv4/u$e;", "(Lv4/u$e;)V", "Lv4/l1$g;", "(Lv4/l1$g;)V", "Lm4/l0;", "I0", "Lm4/l0;", "binding", "Lu4/e0;", "J0", "Lu4/e0;", "getAdapter", "()Lu4/e0;", "setAdapter", "(Lu4/e0;)V", "adapter", "K0", "Z", "selectMode", "L0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends w implements View.OnClickListener, c6.i {

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private m4.l0 binding;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private e0 adapter;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private boolean selectMode;

    /* JADX INFO: renamed from: u4.v$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(rd.h hVar) {
            this();
        }

        public final long a(Intent intent) {
            if (intent != null) {
                return intent.getLongExtra("channel_id", -1L);
            }
            return -1L;
        }

        public final Intent b(Context context) {
            rd.m.e(context, "context");
            Bundle bundle = new Bundle();
            bundle.putBoolean("select_mode", true);
            Intent intentE2 = FragmentShowActivity.e2(context, "", v.class, bundle);
            rd.m.d(intentE2, "getShowFragmentIntent(...)");
            return intentE2;
        }

        private Companion() {
        }
    }

    public static final long J4(Intent intent) {
        return INSTANCE.a(intent);
    }

    public static final Intent K4(Context context) {
        return INSTANCE.b(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M4(m4.l0 l0Var, final v vVar) {
        l0Var.f21311f.postDelayed(new Runnable() { // from class: u4.u
            @Override // java.lang.Runnable
            public final void run() {
                v.N4(this.f28144a);
            }
        }, 10000L);
        d0.n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N4(v vVar) {
        SwipeRefreshLayout swipeRefreshLayout;
        m4.l0 l0Var = vVar.binding;
        if (l0Var == null || (swipeRefreshLayout = l0Var.f21311f) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        rd.m.e(item, "item");
        if (item.getItemId() == R.id.add_iich) {
            FragmentShowActivity.h2(x3(), null, r.class);
        }
        return super.F2(item);
    }

    @Override // c6.i
    /* JADX INFO: renamed from: L4, reason: merged with bridge method [inline-methods] */
    public boolean V0(IIChannel item, int action) {
        rd.m.e(item, "item");
        if (action == R.id.edit) {
            Bundle bundle = new Bundle();
            bundle.putLong("channel_id", item.getChannelId());
            FragmentShowActivity.i2(x3(), null, k.class, bundle);
        } else if (action == R.id.quit) {
            d0.f28046a.m(item.getChannelId());
        } else {
            if (this.selectMode) {
                Intent intent = new Intent();
                intent.putExtra("channel_id", item.getChannelId());
                androidx.fragment.app.p pVarE1 = e1();
                if (pVarE1 != null) {
                    pVarE1.setResult(-1, intent);
                }
                androidx.fragment.app.p pVarE12 = e1();
                if (pVarE12 != null) {
                    pVarE12.finish();
                }
                return true;
            }
            mi.c.e().m(new p4.a(item.getChannelId() + 28147497671065500L));
        }
        return true;
    }

    @Override // androidx.fragment.app.o
    public void O2() {
        super.O2();
        e0 e0Var = this.adapter;
        if (e0Var != null) {
            e0Var.G(d0.f28046a.l());
        }
        mi.c.e().q(this);
    }

    @Override // androidx.fragment.app.o
    public void P2() {
        super.P2();
        mi.c.e().t(this);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        final m4.l0 l0Var = this.binding;
        if (l0Var == null) {
            return;
        }
        this.adapter = new e0(this);
        RecyclerView recyclerView = l0Var.f21308c;
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.l(new c6.m(recyclerView.getContext(), 0));
        l0Var.f21308c.setAdapter(this.adapter);
        l0Var.f21307b.setOnClickListener(this);
        l0Var.f21310e.setOnClickListener(this);
        e0 e0Var = this.adapter;
        if (e0Var != null) {
            e0Var.G(d0.f28046a.l());
        }
        l0Var.f21311f.setOnRefreshListener(new SwipeRefreshLayout.j() { // from class: u4.t
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.j
            public final void a() {
                v.M4(l0Var, this);
            }
        });
        if (this.selectMode) {
            z4(N1(R.string.pickChannel));
            l0Var.f21309d.setVisibility(8);
            G3(true);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        Integer numValueOf = v10 != null ? Integer.valueOf(v10.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.add) {
            FragmentShowActivity.h2(x3(), null, r.class);
        } else if (numValueOf != null && numValueOf.intValue() == R.id.deviceManager) {
            FragmentShowActivity.h2(x3(), null, DeviceManagerFragment.class);
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(d0.a event) {
        SwipeRefreshLayout swipeRefreshLayout;
        rd.m.e(event, "event");
        e0 e0Var = this.adapter;
        if (e0Var != null) {
            e0Var.G(d0.f28046a.l());
        }
        m4.l0 l0Var = this.binding;
        if (l0Var == null || (swipeRefreshLayout = l0Var.f21311f) == null) {
            return;
        }
        swipeRefreshLayout.setRefreshing(false);
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        Bundle bundleI1 = i1();
        this.selectMode = bundleI1 != null ? bundleI1.getBoolean("select_mode") : false;
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        rd.m.e(menu, "menu");
        rd.m.e(inflater, "inflater");
        super.u2(menu, inflater);
        MenuItem menuItemAdd = menu.add(0, R.id.add_iich, 0, R.string.join);
        if (menuItemAdd != null) {
            menuItemAdd.setShowAsAction(2);
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.l0 l0VarC = m4.l0.c(inflater, container, false);
        this.binding = l0VarC;
        rd.m.b(l0VarC);
        return l0VarC.b();
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(u.e event) {
        e0 e0Var;
        rd.m.e(event, "event");
        if (!(event.f30169a instanceof n1) || (e0Var = this.adapter) == null) {
            return;
        }
        e0Var.k();
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(l1.g event) {
        e0 e0Var;
        rd.m.e(event, "event");
        if (!(event.f29979a instanceof n1) || (e0Var = this.adapter) == null) {
            return;
        }
        e0Var.k();
    }
}
