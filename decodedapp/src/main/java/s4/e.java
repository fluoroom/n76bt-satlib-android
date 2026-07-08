package s4;

import android.database.Cursor;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.loader.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.provider.a;
import d5.d;

/* JADX INFO: loaded from: classes.dex */
public class e extends v3.f0 implements a.InterfaceC0037a, c6.i {
    private f I0;
    private int J0;
    private RecyclerView K0;
    private n3.b L0;
    private LinearLayoutManager M0;
    private int N0 = 1;
    private c6.i O0;

    private g4.f F4() {
        if (a6.w.b(getQueryText())) {
            return new g4.f();
        }
        String str = "%" + getQueryText() + "%";
        g4.f fVar = new g4.f("_from LIKE ? OR _to LIKE ? OR repeaters LIKE ? OR text LIKE ?", new String[]{str, str, str, str});
        if (Cfg.c0()) {
            fVar.h(new g4.f("starred==1"));
        }
        return fVar;
    }

    public static e G4() {
        return new e();
    }

    private void K4(int i10) {
        if (this.N0 == i10) {
            return;
        }
        this.N0 = i10;
        if (i10 == 0) {
            this.L0.T("_from");
        } else if (i10 == 1) {
            this.L0.T("date DESC");
        }
        Cfg.K().edit().putInt("view.aprs.sort", i10).apply();
        this.L0.X();
    }

    @Override // v3.f0
    protected void D4(String str) {
        super.D4(str);
        if (this.L0 == null) {
            return;
        }
        g4.f fVarF4 = F4();
        this.L0.R(fVarF4.n());
        this.L0.S(fVarF4.k());
        this.L0.X();
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.clean /* 2131296555 */:
                k1().getContentResolver().delete(a.b.f6666a, null, null);
                return true;
            case R.id.sort_by_call_sign /* 2131297416 */:
                K4(0);
                return true;
            case R.id.sort_by_time /* 2131297417 */:
                K4(1);
                return true;
            default:
                return super.F2(menuItem);
        }
    }

    @Override // c6.i
    /* JADX INFO: renamed from: H4, reason: merged with bridge method [inline-methods] */
    public boolean V0(d5.d dVar, int i10) {
        c6.i iVar = this.O0;
        if (iVar != null) {
            return iVar.V0(dVar, i10);
        }
        return false;
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    /* JADX INFO: renamed from: I4, reason: merged with bridge method [inline-methods] */
    public void K(g1.c cVar, Cursor cursor) {
        int count = cursor.getCount();
        this.M0.f2();
        this.I0.H(cursor);
        this.J0 = count;
    }

    @Override // androidx.fragment.app.o
    public void J2(Menu menu) {
        super.J2(menu);
        int i10 = this.N0;
        if (i10 == 0) {
            menu.findItem(R.id.sort_by_call_sign).setChecked(true);
        } else {
            if (i10 != 1) {
                return;
            }
            menu.findItem(R.id.sort_by_time).setChecked(true);
        }
    }

    public void J4(c6.i iVar) {
        this.O0 = iVar;
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public g1.c S(int i10, Bundle bundle) {
        g4.f fVarF4 = F4();
        n3.b bVar = new n3.b(k1(), a.b.f6666a, d.c.f10625a, fVarF4.n(), fVarF4.k(), "date DESC");
        bVar.Y(5000);
        return bVar;
    }

    @Override // androidx.fragment.app.o, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        this.L0 = (n3.b) x1().c(0, null, this);
        K4(Cfg.K().getInt("view.aprs.sort", 1));
        G3(true);
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public void t0(g1.c cVar) {
        this.I0.H(null);
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater menuInflater) {
        super.u2(menu, menuInflater);
        menuInflater.inflate(R.menu.aprs_list, menu);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_aprs_list, viewGroup, false);
        this.K0 = (RecyclerView) viewInflate.findViewById(R.id.list);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(viewInflate.getContext());
        this.M0 = linearLayoutManager;
        this.K0.setLayoutManager(linearLayoutManager);
        this.K0.l(new c6.m(k1(), 0));
        f fVar = new f(this);
        this.I0 = fVar;
        this.K0.setAdapter(fVar);
        g4(this.K0);
        return viewInflate;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        this.I0.H(null);
        super.y2();
    }
}
