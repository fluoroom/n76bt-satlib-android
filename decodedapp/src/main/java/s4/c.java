package s4;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.CSViewPager;
import androidx.viewpager.widget.ViewPager;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.activitys.MessageListActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 P2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001QB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u0016H\u0016¢\u0006\u0004\b \u0010\u001eJ\u001f\u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u0016H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\t2\u0006\u0010'\u001a\u00020&2\u0006\u0010\r\u001a\u00020(H\u0016¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u00020\t2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\tH\u0016¢\u0006\u0004\b-\u0010\u0006J\u0017\u0010/\u001a\u00020#2\u0006\u0010!\u001a\u00020.H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\t2\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\tH\u0014¢\u0006\u0004\b5\u0010\u0006J\u000f\u00106\u001a\u00020\tH\u0014¢\u0006\u0004\b6\u0010\u0006J\u000f\u00107\u001a\u00020\tH\u0016¢\u0006\u0004\b7\u0010\u0006R$\u0010?\u001a\u0004\u0018\u0001088\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R$\u0010G\u001a\u0004\u0018\u00010@8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u0004\bE\u0010FR$\u0010O\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010N¨\u0006R"}, d2 = {"Ls4/c;", "Lv3/f0;", "Landroidx/viewpager/widget/ViewPager$j;", "Lc6/i;", "Ld5/d;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "position", "", "positionOffset", "positionOffsetPixels", "e", "(IFI)V", "n0", "(I)V", "state", "l0", "item", "action", "", "I4", "(Ld5/d;I)Z", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "J2", "(Landroid/view/Menu;)V", "M2", "Landroid/view/MenuItem;", "F2", "(Landroid/view/MenuItem;)Z", "", "newText", "D4", "(Ljava/lang/String;)V", "E4", "C4", "y2", "Ls4/e;", "I0", "Ls4/e;", "H4", "()Ls4/e;", "L4", "(Ls4/e;)V", "mAprsListFragment", "Lcom/dw/ht/fragments/j;", "J0", "Lcom/dw/ht/fragments/j;", "getMMapFragment", "()Lcom/dw/ht/fragments/j;", "M4", "(Lcom/dw/ht/fragments/j;)V", "mMapFragment", "Lm4/q;", "K0", "Lm4/q;", "getBinding", "()Lm4/q;", "setBinding", "(Lm4/q;)V", "binding", "L0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c extends v3.f0 implements ViewPager.j, c6.i {

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private e mAprsListFragment;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private com.dw.ht.fragments.j mMapFragment;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private m4.q binding;

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
            if (i10 == 0) {
                c.this.L4((e) objG);
                e mAprsListFragment = c.this.getMAprsListFragment();
                if (mAprsListFragment != null) {
                    mAprsListFragment.J4(c.this);
                }
            } else if (i10 == 1) {
                c.this.M4((com.dw.ht.fragments.j) objG);
                return objG;
            }
            return objG;
        }

        @Override // y0.o
        public androidx.fragment.app.o p(int i10) {
            if (i10 == 0) {
                e eVarG4 = e.G4();
                rd.m.d(eVarG4, "newInstance(...)");
                return eVarG4;
            }
            com.dw.ht.fragments.j jVarX5 = com.dw.ht.fragments.j.x5(false);
            rd.m.d(jVarX5, "newInstance(...)");
            return jVarX5;
        }
    }

    public static final void J4(View view, CompoundButton compoundButton, boolean z10) {
        rd.m.e(compoundButton, "buttonView");
        Cfg.y0(z10);
        if (Cfg.W(false) || !z10) {
            return;
        }
        compoundButton.setChecked(false);
        FragmentShowActivity.h2(((SwitchCompat) view).getContext(), null, i.class);
    }

    public static final boolean K4(c cVar, MenuItem menuItem) {
        CSViewPager cSViewPager;
        m4.q qVar;
        CSViewPager cSViewPager2;
        rd.m.e(menuItem, "it");
        int itemId = menuItem.getItemId();
        if (itemId == R.id.map) {
            m4.q qVar2 = cVar.binding;
            if (qVar2 != null && (cSViewPager = qVar2.f21449c) != null) {
                cSViewPager.N(1, true);
            }
        } else if (itemId == R.id.message && (qVar = cVar.binding) != null && (cSViewPager2 = qVar.f21449c) != null) {
            cSViewPager2.N(0, true);
        }
        return true;
    }

    @Override // v3.f0
    protected void C4() {
        BottomNavigationView bottomNavigationView;
        super.C4();
        m4.q qVar = this.binding;
        if (qVar == null || (bottomNavigationView = qVar.f21448b) == null) {
            return;
        }
        bottomNavigationView.setVisibility(0);
    }

    @Override // v3.f0
    protected void D4(String newText) {
        e eVar;
        CSViewPager cSViewPager;
        rd.m.e(newText, "newText");
        if (a6.w.b(newText)) {
            e eVar2 = this.mAprsListFragment;
            if (eVar2 != null) {
                eVar2.h(newText);
                return;
            }
            return;
        }
        m4.q qVar = this.binding;
        Integer numValueOf = (qVar == null || (cSViewPager = qVar.f21449c) == null) ? null : Integer.valueOf(cSViewPager.getCurrentItem());
        if (numValueOf == null || numValueOf.intValue() != 0 || (eVar = this.mAprsListFragment) == null) {
            return;
        }
        eVar.h(newText);
    }

    @Override // v3.f0
    protected void E4() {
        BottomNavigationView bottomNavigationView;
        CSViewPager cSViewPager;
        m4.q qVar = this.binding;
        if (qVar != null && (cSViewPager = qVar.f21449c) != null) {
            cSViewPager.N(0, false);
        }
        m4.q qVar2 = this.binding;
        if (qVar2 != null && (bottomNavigationView = qVar2.f21448b) != null) {
            bottomNavigationView.setVisibility(8);
        }
        super.E4();
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        rd.m.e(item, "item");
        int itemId = item.getItemId();
        if (itemId == R.id.aprs_settings) {
            FragmentShowActivity.h2(x3(), null, i.class);
            return true;
        }
        if (itemId == R.id.search) {
            Q();
        }
        return super.F2(item);
    }

    /* JADX INFO: renamed from: H4, reason: from getter */
    public final e getMAprsListFragment() {
        return this.mAprsListFragment;
    }

    @Override // c6.i
    /* JADX INFO: renamed from: I4 */
    public boolean V0(d5.d item, int action) {
        CSViewPager cSViewPager;
        rd.m.e(item, "item");
        if (action == R.id.send_message) {
            MessageListActivity.Companion companion = MessageListActivity.INSTANCE;
            Context contextX3 = x3();
            rd.m.d(contextX3, "requireContext(...)");
            companion.a(contextX3, item.f10599a, item.f10609k == 0 ? v4.m1.APRS : v4.m1.BSS, 0L);
            return true;
        }
        if (!item.e()) {
            return true;
        }
        p0();
        m4.q qVar = this.binding;
        if (qVar != null && (cSViewPager = qVar.f21449c) != null) {
            cSViewPager.N(1, true);
        }
        com.dw.ht.fragments.j jVar = this.mMapFragment;
        if (jVar != null) {
            jVar.f5(item);
        }
        return true;
    }

    @Override // androidx.fragment.app.o
    public void J2(Menu menu) {
        View actionView;
        rd.m.e(menu, "menu");
        super.J2(menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.aprs_switch);
        final View viewFindViewById = (menuItemFindItem == null || (actionView = menuItemFindItem.getActionView()) == null) ? null : actionView.findViewById(R.id._switch);
        if (viewFindViewById instanceof SwitchCompat) {
            SwitchCompat switchCompat = (SwitchCompat) viewFindViewById;
            boolean z10 = false;
            if (Cfg.W(false) && Cfg.Z()) {
                z10 = true;
            }
            switchCompat.setChecked(z10);
            switchCompat.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: s4.b
                @Override // android.widget.CompoundButton.OnCheckedChangeListener
                public final void onCheckedChanged(CompoundButton compoundButton, boolean z11) {
                    c.J4(viewFindViewById, compoundButton, z11);
                }
            });
        }
    }

    public final void L4(e eVar) {
        this.mAprsListFragment = eVar;
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        a4();
        super.M2();
    }

    public final void M4(com.dw.ht.fragments.j jVar) {
        this.mMapFragment = jVar;
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        CSViewPager cSViewPager;
        CSViewPager cSViewPager2;
        CSViewPager cSViewPager3;
        BottomNavigationView bottomNavigationView;
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        m4.q qVar = this.binding;
        if (qVar != null && (bottomNavigationView = qVar.f21448b) != null) {
            bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.c() { // from class: s4.a
                @Override // com.google.android.material.navigation.l.c
                public final boolean a(MenuItem menuItem) {
                    return c.K4(this.f26355a, menuItem);
                }
            });
        }
        m4.q qVar2 = this.binding;
        if (qVar2 != null && (cSViewPager3 = qVar2.f21449c) != null) {
            cSViewPager3.setEnabled(false);
        }
        m4.q qVar3 = this.binding;
        if (qVar3 != null && (cSViewPager2 = qVar3.f21449c) != null) {
            cSViewPager2.d(this);
        }
        m4.q qVar4 = this.binding;
        if (qVar4 == null || (cSViewPager = qVar4.f21449c) == null) {
            return;
        }
        cSViewPager.setAdapter(new b(j1()));
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void n0(int position) {
        BottomNavigationView bottomNavigationView;
        CSViewPager cSViewPager;
        if (e1() instanceof j4.a) {
            if (position == 1) {
                androidx.fragment.app.p pVarE1 = e1();
                rd.m.c(pVarE1, "null cannot be cast to non-null type com.dw.ht.activitys.CActivity");
                ((j4.a) pVarE1).O1();
            } else {
                androidx.fragment.app.p pVarE12 = e1();
                rd.m.c(pVarE12, "null cannot be cast to non-null type com.dw.ht.activitys.CActivity");
                ((j4.a) pVarE12).X1();
            }
        }
        m4.q qVar = this.binding;
        if (qVar != null && (cSViewPager = qVar.f21449c) != null) {
            cSViewPager.setDisableSlideSwitchingPagers(position == 1);
        }
        m4.q qVar2 = this.binding;
        if (qVar2 == null || (bottomNavigationView = qVar2.f21448b) == null) {
            return;
        }
        bottomNavigationView.setSelectedItemId(position == 1 ? R.id.map : R.id.message);
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        G3(true);
        z4(N1(R.string.aprs));
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        rd.m.e(menu, "menu");
        rd.m.e(inflater, "inflater");
        super.u2(menu, inflater);
        inflater.inflate(R.menu.aprs, menu);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.q qVarC = m4.q.c(inflater, container, false);
        this.binding = qVarC;
        rd.m.b(qVarC);
        ConstraintLayout constraintLayoutB = qVarC.b();
        rd.m.d(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
        if (e1() instanceof j4.a) {
            androidx.fragment.app.p pVarE1 = e1();
            rd.m.c(pVarE1, "null cannot be cast to non-null type com.dw.ht.activitys.CActivity");
            ((j4.a) pVarE1).X1();
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void l0(int state) {
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public void e(int position, float positionOffset, int positionOffsetPixels) {
    }
}
