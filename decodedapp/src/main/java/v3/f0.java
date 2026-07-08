package v3;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;

/* JADX INFO: loaded from: classes.dex */
public class f0 extends m0 implements e0 {
    private boolean F0;
    private String G0 = "";
    private boolean H0;

    /* JADX WARN: Multi-variable type inference failed */
    private void A4() {
        androidx.fragment.app.p pVarE1 = e1();
        if (pVarE1 instanceof d0) {
            ((d0) pVarE1).v(this);
        } else if (pVarE1 != 0) {
            pVarE1.onSearchRequested();
        }
    }

    protected AdapterView B4() {
        return null;
    }

    protected void C4() {
        h("");
    }

    @Override // v3.v, androidx.fragment.app.o
    public void M3(boolean z10) {
        super.M3(z10);
        if (this.F0 && a2() && b4()) {
            A4();
        }
    }

    @Override // v3.v, androidx.fragment.app.o
    public void N2(Bundle bundle) {
        super.N2(bundle);
        if (this.F0) {
            bundle.putBoolean("SearchableFragmentKEY_IN_SEARCH", true);
            bundle.putString("SearchableFragmentKEY_QUERY_TEXT", this.G0);
        }
    }

    @Override // v3.e0
    public void Q() {
        if (this.F0) {
            return;
        }
        this.F0 = true;
        if (this.H0) {
            A4();
            E4();
        }
    }

    @Override // v3.e0
    public boolean T0() {
        Adapter adapter;
        AdapterView adapterViewB4 = B4();
        if (adapterViewB4 != null && (adapter = adapterViewB4.getAdapter()) != null) {
            int headerViewsCount = adapterViewB4 instanceof ListView ? ((ListView) adapterViewB4).getHeaderViewsCount() : 0;
            if (adapterViewB4.getChildCount() > headerViewsCount && adapter.getCount() != 0) {
                View childAt = adapterViewB4.getChildAt(headerViewsCount);
                if (childAt.performClick()) {
                    return true;
                }
                return adapterViewB4.performItemClick(childAt, headerViewsCount, 0L);
            }
        }
        return false;
    }

    @Override // v3.v
    protected boolean c4() {
        if (!m0()) {
            return super.c4();
        }
        p0();
        return true;
    }

    @Override // v3.e0
    public void f0() {
        for (androidx.fragment.app.o oVarA1 = A1(); oVarA1 instanceof e0; oVarA1 = oVarA1.A1()) {
            e0 e0Var = (e0) oVarA1;
            if (e0Var.s0()) {
                e0Var.f0();
                return;
            }
        }
    }

    @Override // v3.e0
    public String getQueryText() {
        return this.G0;
    }

    public e0 getSearchable() {
        return null;
    }

    public void h(String str) {
        if (a6.q.d(this.G0, str)) {
            return;
        }
        this.G0 = str;
        D4(str);
    }

    @Override // androidx.fragment.app.o
    public void l2(Bundle bundle) {
        super.l2(bundle);
        this.H0 = true;
        if (this.F0) {
            if (b4()) {
                A4();
            }
            E4();
            D4(this.G0);
        }
    }

    @Override // v3.e0
    public boolean m0() {
        return this.F0;
    }

    @Override // v3.e0
    public void p0() {
        if (this.F0) {
            this.F0 = false;
            C4();
            d.k0 k0VarE1 = e1();
            if (k0VarE1 instanceof d0) {
                ((d0) k0VarE1).G(this);
            }
        }
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        if (bundle != null) {
            this.F0 = bundle.getBoolean("SearchableFragmentKEY_IN_SEARCH", this.F0);
            String string = bundle.getString("SearchableFragmentKEY_QUERY_TEXT");
            if (string == null) {
                this.G0 = "";
            } else {
                this.G0 = string;
            }
        }
    }

    @Override // v3.e0
    public boolean s0() {
        for (androidx.fragment.app.o oVarA1 = A1(); oVarA1 instanceof e0; oVarA1 = oVarA1.A1()) {
            if (((e0) oVarA1).s0()) {
                return true;
            }
        }
        return false;
    }

    protected void E4() {
    }

    protected void D4(String str) {
    }
}
