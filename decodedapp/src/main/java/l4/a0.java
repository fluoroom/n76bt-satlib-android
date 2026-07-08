package l4;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.loader.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.provider.a;
import d5.a;
import d5.e;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import l4.b0;
import v3.m0;
import v4.l1;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends m0 implements a.InterfaceC0037a, b0.a {
    private b0 F0;
    private final f.c G0 = r3(new g.c(), new f.b() { // from class: l4.w
        @Override // f.b
        public final void a(Object obj) {
            a0.A4(this.f20412a, (Uri) obj);
        }
    });

    public static /* synthetic */ void A4(final a0 a0Var, Uri uri) {
        if (uri == null) {
            a0Var.getClass();
            return;
        }
        final Context contextX3 = a0Var.x3();
        try {
            InputStream inputStreamOpenInputStream = contextX3.getContentResolver().openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return;
            }
            hc.g.c(inputStreamOpenInputStream).e(zc.a.b()).d(new mc.d() { // from class: l4.x
                @Override // mc.d
                public final Object apply(Object obj) {
                    return a0.B4((InputStream) obj);
                }
            }).e(jc.a.a()).i(new mc.c() { // from class: l4.y
                @Override // mc.c
                public final void accept(Object obj) {
                    a0.D4(this.f20413a, contextX3, (ArrayList) obj);
                }
            }, new mc.c() { // from class: l4.z
                @Override // mc.c
                public final void accept(Object obj) {
                    a0.C4(contextX3, (Throwable) obj);
                }
            });
        } catch (Exception e10) {
            Toast.makeText(contextX3, e10.getLocalizedMessage(), 1).show();
        }
    }

    public static /* synthetic */ ArrayList B4(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        try {
            f4.b bVar = new f4.b(inputStream);
            int[] iArrB = a.b.b(bVar.g());
            while (true) {
                String[] strArrG = bVar.g();
                if (strArrG == null) {
                    break;
                }
                ContentValues contentValues = new ContentValues(a.e.f10595a.length);
                for (int i10 = 0; i10 < iArrB.length; i10++) {
                    int i11 = iArrB[i10];
                    if (i11 >= 0 && strArrG.length > i11) {
                        String str = strArrG[i11];
                        if (i11 == 5) {
                            contentValues.put(a.e.f10595a[i10], Integer.valueOf(a.b.e(str)));
                        } else {
                            contentValues.put(a.e.f10595a[i10], str);
                        }
                    }
                }
                if (contentValues.get("bandwidth") == null) {
                    contentValues.put("bandwidth", (Integer) 25000);
                }
                arrayList.add(new d5.a(contentValues));
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return arrayList;
        } catch (Throwable th2) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }

    public static /* synthetic */ void C4(Context context, Throwable th2) {
        Toast.makeText(context, th2.getLocalizedMessage(), 1).show();
        th2.printStackTrace();
    }

    public static /* synthetic */ void D4(a0 a0Var, Context context, ArrayList arrayList) {
        if (a0Var.b2()) {
            return;
        }
        if (arrayList.isEmpty()) {
            Toast.makeText(context, R.string.importFailed, 1).show();
            return;
        }
        d5.e eVar = new d5.e((d5.a[]) arrayList.toArray(new d5.a[0]));
        Bundle bundle = new Bundle();
        bundle.putParcelable("region", eVar);
        FragmentShowActivity.i2(context, null, com.dw.ht.channels.a.class, bundle);
    }

    public static void E4(Context context, v4.c0 c0Var) {
        int iG = c0Var.Q.G();
        d5.a[] aVarArr = new d5.a[iG];
        for (int i10 = 0; i10 < iG; i10++) {
            aVarArr[i10] = c0Var.V(i10);
        }
        d5.e eVar = new d5.e(aVarArr);
        Bundle bundle = new Bundle();
        bundle.putParcelable("region", eVar);
        FragmentShowActivity.i2(context, null, com.dw.ht.channels.a.class, bundle);
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.add /* 2131296369 */:
                FragmentShowActivity.h2(x3(), null, com.dw.ht.channels.a.class);
                return true;
            case R.id.importDeviceChannels /* 2131296868 */:
                l1 l1VarO = v4.u.w().o();
                if (!(l1VarO instanceof v4.c0)) {
                    return true;
                }
                E4(x3(), (v4.c0) l1VarO);
                return true;
            case R.id.importFromFile /* 2131296869 */:
                this.G0.a("text/*");
                return true;
            default:
                return super.F2(menuItem);
        }
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    /* JADX INFO: renamed from: F4 */
    public void K(g1.c cVar, Cursor cursor) {
        this.F0.H(cursor);
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public g1.c S(int i10, Bundle bundle) {
        return new g1.b(x3(), a.c.f6667a, e.b.f10630a, null, null, "title,_id");
    }

    @Override // l4.b0.a
    public void k0(b0.b bVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("_id", bVar.m());
        FragmentShowActivity.i2(x3(), null, com.dw.ht.channels.a.class, bundle);
    }

    @Override // androidx.fragment.app.o, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        G3(true);
        y4(R.string.regionManager);
        x1().c(0, null, this);
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public void t0(g1.c cVar) {
        this.F0.H(null);
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater menuInflater) {
        super.u2(menu, menuInflater);
        menuInflater.inflate(R.menu.o_region_list, menu);
        menu.findItem(R.id.importDeviceChannels).setVisible(v4.u.w().o() instanceof v4.c0);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_channel_list, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewInflate.getContext()));
        b0 b0Var = new b0(this);
        this.F0 = b0Var;
        recyclerView.setAdapter(b0Var);
        recyclerView.l(new c6.m(x3(), 0));
        g4(recyclerView);
        return viewInflate;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        this.F0.H(null);
        super.y2();
    }
}
