package s4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.m;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.satellite.b;
import kotlin.Metadata;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\u0003J\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0003J\u0019\u0010\u001e\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR \u0010#\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R \u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010\"R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Ls4/e6;", "Lv3/f0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lv3/e0;", "getSearchable", "()Lv3/e0;", "", "newText", "D4", "(Ljava/lang/String;)V", "O2", "P2", "Lcom/dw/ht/satellite/b$a;", "event", "onMessageEvent", "(Lcom/dw/ht/satellite/b$a;)V", "Lf/c;", "I0", "Lf/c;", "mExportLauncher", "J0", "mImportLauncher", "Ls4/j6;", "K0", "Ls4/j6;", "mAdapter", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e6 extends v3.f0 {

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private f.c mExportLauncher;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private f.c mImportLauncher;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private j6 mAdapter;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f26414a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[b.a.f6708e.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f26414a = iArr;
        }
    }

    public static final class b implements m0.u {
        b() {
        }

        @Override // m0.u
        public void E0(Menu menu, MenuInflater menuInflater) {
            MenuItem menuItemFindItem;
            rd.m.e(menu, "menu");
            rd.m.e(menuInflater, "menuInflater");
            menuInflater.inflate(R.menu.optioins_satellite_list, menu);
            if (e6.this.mExportLauncher == null && (menuItemFindItem = menu.findItem(R.id.import_export)) != null) {
                menuItemFindItem.setVisible(false);
            }
            MenuItem menuItemFindItem2 = menu.findItem(R.id.min_elevation_angle);
            int satelliteMinElevationAngle = Cfg.O().getSatelliteMinElevationAngle();
            SubMenu subMenu = menuItemFindItem2.getSubMenu();
            if (subMenu != null) {
                for (int i10 = -6; i10 < 81; i10++) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i10);
                    sb2.append((char) 176);
                    boolean z10 = true;
                    MenuItem menuItemAdd = subMenu.add(1, i10, 0, sb2.toString());
                    menuItemAdd.setCheckable(true);
                    if (i10 != satelliteMinElevationAngle) {
                        z10 = false;
                    }
                    menuItemAdd.setChecked(z10);
                }
            }
        }

        @Override // m0.u
        public void K0(Menu menu) {
            rd.m.e(menu, "menu");
            m0.t.b(this, menu);
            MenuItem menuItemFindItem = menu.findItem(R.id.min_elevation_angle);
            int satelliteMinElevationAngle = Cfg.O().getSatelliteMinElevationAngle();
            SubMenu subMenu = menuItemFindItem.getSubMenu();
            if (subMenu != null) {
                int size = subMenu.size();
                for (int i10 = 0; i10 < size; i10++) {
                    subMenu.getItem(i10).setChecked(subMenu.getItem(i10).getItemId() == satelliteMinElevationAngle);
                }
            }
        }

        @Override // m0.u
        public boolean v(MenuItem menuItem) {
            rd.m.e(menuItem, "menuItem");
            int itemId = menuItem.getItemId();
            if (-90 <= itemId && itemId < 90) {
                Cfg.O().setSatelliteMinElevationAngle(menuItem.getItemId());
                return true;
            }
            switch (menuItem.getItemId()) {
                case R.id._import /* 2131296280 */:
                    f.c cVar = e6.this.mImportLauncher;
                    if (cVar != null) {
                        cVar.a("text/*");
                    }
                    break;
                case R.id.add /* 2131296369 */:
                    FragmentShowActivity.h2(e6.this.x3(), null, a6.class);
                    break;
                case R.id.export /* 2131296740 */:
                    f.c cVar2 = e6.this.mExportLauncher;
                    if (cVar2 != null) {
                        cVar2.a("");
                    }
                    break;
                case R.id.search /* 2131297322 */:
                    e6.this.Q();
                    break;
            }
            return true;
        }

        @Override // m0.u
        public /* synthetic */ void z0(Menu menu) {
            m0.t.a(this, menu);
        }
    }

    @Override // v3.f0
    protected void D4(String newText) {
        rd.m.e(newText, "newText");
        super.D4(newText);
        j6 j6Var = this.mAdapter;
        if (j6Var != null) {
            j6Var.G(com.dw.ht.satellite.b.f6691a.w(newText));
        }
    }

    @Override // androidx.fragment.app.o
    public void O2() {
        super.O2();
        mi.c.e().q(this);
        j6 j6Var = this.mAdapter;
        if (j6Var != null) {
            com.dw.ht.satellite.b bVar = com.dw.ht.satellite.b.f6691a;
            String queryText = getQueryText();
            rd.m.d(queryText, "getQueryText(...)");
            j6Var.G(bVar.w(queryText));
        }
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
        androidx.fragment.app.p pVarV3 = v3();
        rd.m.d(pVarV3, "requireActivity(...)");
        pVarV3.addMenuProvider(new b(), U1(), m.b.f2655e);
    }

    @mi.m(threadMode = ThreadMode.MAIN)
    public final void onMessageEvent(b.a event) {
        j6 j6Var;
        if ((event == null ? -1 : a.f26414a[event.ordinal()]) != 1 || (j6Var = this.mAdapter) == null) {
            return;
        }
        com.dw.ht.satellite.b bVar = com.dw.ht.satellite.b.f6691a;
        String queryText = getQueryText();
        rd.m.d(queryText, "getQueryText(...)");
        j6Var.G(bVar.w(queryText));
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        y4(R.string.amateur_radio_satellite);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.h1 h1VarC = m4.h1.c(inflater, container, false);
        rd.m.d(h1VarC, "inflate(...)");
        h1VarC.f21202b.setLayoutManager(new LinearLayoutManager(x3()));
        j6 j6Var = new j6();
        this.mAdapter = j6Var;
        h1VarC.f21202b.setAdapter(j6Var);
        h1VarC.f21202b.l(new c6.m(x3(), 0));
        g4(h1VarC.f21202b);
        LinearLayout linearLayoutB = h1VarC.b();
        rd.m.d(linearLayoutB, "getRoot(...)");
        return linearLayoutB;
    }

    @Override // v3.f0, v3.e0
    public v3.e0 getSearchable() {
        return this;
    }
}
