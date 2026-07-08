package com.dw.ht.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.core.view.CSViewPager;
import androidx.fragment.app.p;
import androidx.fragment.app.w;
import androidx.viewpager.widget.ViewPager;
import com.benshikj.ht.R;
import com.dw.ht.BTActivity;
import com.dw.ht.activitys.ContactDetailsActivity;
import com.dw.ht.fragments.j;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import m4.u0;
import org.greenrobot.eventbus.ThreadMode;
import rd.m;
import s4.y0;
import u4.d0;
import v3.e0;
import v3.f0;
import v4.k0;
import v4.l1;
import v4.n0;
import y0.o;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0016\u0018\u0000 ]2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005:\u0001^B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0007J\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0015\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001b\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0018H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b#\u0010\"J'\u0010'\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u0018H\u0016¢\u0006\u0004\b)\u0010\"J\u000f\u0010*\u001a\u00020\bH\u0016¢\u0006\u0004\b*\u0010\u0007J\u0017\u0010-\u001a\u00020\b2\u0006\u0010,\u001a\u00020+H\u0014¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0014¢\u0006\u0004\b0\u00101J\u001f\u00105\u001a\u00020/2\u0006\u00102\u001a\u00020\u00032\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00109\u001a\u00020\b2\u0006\u00108\u001a\u000207H\u0007¢\u0006\u0004\b9\u0010:J'\u0010?\u001a\u00020\b2\u0006\u0010;\u001a\u0002032\u0006\u0010=\u001a\u00020<2\u0006\u0010>\u001a\u000203H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\b2\u0006\u0010;\u001a\u000203H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001a\u00020\b2\u0006\u0010C\u001a\u000203H\u0016¢\u0006\u0004\bD\u0010BJ\u0019\u00109\u001a\u00020\b2\b\u00108\u001a\u0004\u0018\u00010EH\u0017¢\u0006\u0004\b9\u0010FJ\u0017\u0010I\u001a\u00020\b2\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR0\u0010T\u001a\u001e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020P0Oj\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020P`Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR$\u0010Y\u001a\u0002032\u0006\u0010U\u001a\u0002038F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bV\u0010W\"\u0004\bX\u0010BR\u0013\u0010\\\u001a\u0004\u0018\u00010P8F¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006_"}, d2 = {"Lcom/dw/ht/fragments/MMFragment;", "Lcom/dw/ht/fragments/DeviceFragment;", "Lc6/i;", "Ld5/g;", "Landroidx/viewpager/widget/ViewPager$j;", "Lv4/n0$b;", "<init>", "()V", "Ldd/d0;", "s5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lv4/n0;", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "Lv3/e0;", "getSearchable", "()Lv3/e0;", "link", "o0", "(Lv4/n0;)V", "W0", "Lv4/k0;", "oldStatus", "newStatus", "j0", "(Lv4/n0;Lv4/k0;Lv4/k0;)V", "i0", "y2", "", "newText", "D4", "(Ljava/lang/String;)V", "", "c4", "()Z", "session", "", "action", "q5", "(Ld5/g;I)Z", "Lu4/d0$a;", "event", "onMessageEvent", "(Lu4/d0$a;)V", "position", "", "positionOffset", "positionOffsetPixels", "e", "(IFI)V", "n0", "(I)V", "state", "l0", "Lv4/l1$e;", "(Lv4/l1$e;)V", "Ly4/b;", "status", "r", "(Ly4/b;)V", "Lm4/u0;", "P0", "Lm4/u0;", "binding", "Ljava/util/HashMap;", "Lv3/f0;", "Lkotlin/collections/HashMap;", "Q0", "Ljava/util/HashMap;", "fragments", "value", "p5", "()I", "r5", "currentPosition", "o5", "()Lv3/f0;", "currentFragment", "R0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class MMFragment extends DeviceFragment implements c6.i, ViewPager.j, n0.b {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private u0 binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private final HashMap fragments = new HashMap();

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f6177a;

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
            f6177a = iArr;
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
            MMFragment.this.fragments.put(Integer.valueOf(i10), (f0) objG);
            if (objG instanceof y0) {
                ((y0) objG).s5(MMFragment.this);
            }
            return objG;
        }

        @Override // y0.o
        public androidx.fragment.app.o p(int i10) {
            f0 f0VarA5;
            if (i10 == 0) {
                f0VarA5 = TalkListFragment.A5(MMFragment.this.V4());
            } else if (i10 != 1) {
                f0VarA5 = new f0();
            } else {
                y0 y0Var = new y0();
                l1 l1VarY4 = MMFragment.this.Y4();
                y0Var.e5(l1VarY4 != null ? l1VarY4.q() : 0L);
                f0VarA5 = y0Var;
            }
            m.b(f0VarA5);
            return f0VarA5;
        }
    }

    private final void s5() {
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
            f0 f0VarO5 = o5();
            if (f0VarO5 != null) {
                f0VarO5.h(newText);
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

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        m.e(view, "view");
        super.Q2(view, savedInstanceState);
        u0 u0Var = this.binding;
        if (u0Var == null) {
            return;
        }
        if (Y4() != null) {
            l1 l1VarY4 = Y4();
            m.b(l1VarY4);
            o0(l1VarY4);
        } else {
            z4(N1(R.string.app_name));
        }
        u0Var.f21598b.d(this);
        u0Var.f21598b.setAdapter(new c(j1()));
        if (savedInstanceState == null) {
            r5(0);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void W0(n0 link) {
        m.e(link, "link");
        super.W0(link);
        s5();
    }

    @Override // v3.f0, v3.v
    protected boolean c4() {
        if (!m0()) {
            return super.c4();
        }
        p0();
        return true;
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(n0 oldLink, n0 newLink) {
        super.d5(oldLink, newLink);
        if (oldLink != null) {
            oldLink.g(this);
        }
        if (newLink != null) {
            newLink.x(this);
        }
        Collection<f0> collectionValues = this.fragments.values();
        m.d(collectionValues, "<get-values>(...)");
        for (f0 f0Var : collectionValues) {
            if (f0Var instanceof DeviceFragment) {
                ((DeviceFragment) f0Var).h5(Y4());
            }
        }
        l1 l1VarY4 = Y4();
        z4(l1VarY4 != null ? l1VarY4.getName() : null);
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void e(int position, float positionOffset, int positionOffsetPixels) {
    }

    @Override // v3.f0, v3.e0
    public e0 getSearchable() {
        f0 f0VarO5 = o5();
        if (f0VarO5 != null) {
            return f0VarO5.getSearchable();
        }
        return null;
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void i0(n0 link) {
        m.e(link, "link");
        super.i0(link);
        s5();
        z4(link.getName());
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void j0(n0 link, k0 oldStatus, k0 newStatus) {
        m.e(link, "link");
        m.e(oldStatus, "oldStatus");
        m.e(newStatus, "newStatus");
        s5();
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void l0(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void n0(int position) {
        a4();
        Collection collectionValues = this.fragments.values();
        m.d(collectionValues, "<get-values>(...)");
        Iterator it = collectionValues.iterator();
        while (it.hasNext()) {
            ((f0) it.next()).p0();
        }
        p pVarE1 = e1();
        if (pVarE1 instanceof BTActivity) {
            ((BTActivity) pVarE1).N2();
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void o0(n0 link) {
        m.e(link, "link");
        super.o0(link);
        if (a2()) {
            s5();
            a4();
        }
    }

    public final f0 o5() {
        return (f0) this.fragments.get(Integer.valueOf(p5()));
    }

    @mi.m(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(d0.a event) {
        m.e(event, "event");
        l1 l1VarY4 = Y4();
        z4(l1VarY4 != null ? l1VarY4.getName() : null);
    }

    public final int p5() {
        u0 u0Var = this.binding;
        if (u0Var == null) {
            return 0;
        }
        return u0Var.f21598b.getCurrentItem();
    }

    @Override // c6.i
    /* JADX INFO: renamed from: q5 */
    public boolean V0(d5.g session, int action) {
        m.e(session, "session");
        if (action == R.id.loc) {
            if (session.e()) {
                mi.c.e().m(new j.f(session));
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
            mi.c.e().m(new j.f(dVarL));
            return true;
        }
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

    @Override // v4.n0.b
    public void r(y4.b status) {
        m.e(status, "status");
        s5();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        if (Y4() == null) {
            return;
        }
        G3(true);
    }

    public final void r5(int i10) {
        CSViewPager cSViewPager;
        u0 u0Var = this.binding;
        if (u0Var == null || (cSViewPager = u0Var.f21598b) == null) {
            return;
        }
        cSViewPager.N(i10, false);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.e(inflater, "inflater");
        u0 u0VarC = u0.c(inflater, container, false);
        this.binding = u0VarC;
        m.b(u0VarC);
        return u0VarC.b();
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

    @Override // com.dw.ht.fragments.DeviceFragment
    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public void onMessageEvent(l1.e event) {
        super.onMessageEvent(event);
        int i10 = event == null ? -1 : b.f6177a[event.ordinal()];
        if (i10 == 1 || i10 == 2) {
            s5();
        }
    }
}
