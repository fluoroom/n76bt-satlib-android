package n5;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.user.InfoFragment;
import k5.w0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Ln5/o0;", "Lv3/m0;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroidx/fragment/app/o;", "childFragment", "Ldd/d0;", "p2", "(Landroidx/fragment/app/o;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "", "F2", "(Landroid/view/MenuItem;)Z", "F0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 extends v3.m0 {
    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        rd.m.e(item, "item");
        if (item.getItemId() == R.id.settings) {
            Context contextK1 = k1();
            rd.m.b(contextK1);
            FragmentShowActivity.h2(contextK1, N1(R.string.settings), w0.class);
        }
        return super.F2(item);
    }

    @Override // androidx.fragment.app.o
    public void p2(androidx.fragment.app.o childFragment) {
        rd.m.e(childFragment, "childFragment");
        super.p2(childFragment);
        Bundle bundleI1 = i1();
        if (bundleI1 != null && bundleI1.getBoolean("EXTRAS_LOGIN") && (childFragment instanceof InfoFragment)) {
            Bundle bundleI12 = i1();
            if (bundleI12 != null) {
                bundleI12.remove("EXTRAS_LOGIN");
            }
            ((InfoFragment) childFragment).A5();
        }
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        rd.m.e(menu, "menu");
        rd.m.e(inflater, "inflater");
        if (!Cfg.f5482d) {
            inflater.inflate(R.menu.settings, menu);
        }
        super.u2(menu, inflater);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        z4(N1(R.string.user_settings));
        G3(true);
        return inflater.inflate(R.layout.fragment_user_settings, container, false);
    }
}
