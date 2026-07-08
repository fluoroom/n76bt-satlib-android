package l4;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
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
import com.dw.ht.channels.ChannelEditorFragment;
import com.dw.ht.provider.a;
import d5.a;
import f4.d;
import g4.f;
import j$.util.Objects;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import l4.m;

/* JADX INFO: loaded from: classes.dex */
public class l extends v3.f0 implements a.InterfaceC0037a, m.a {
    private f.c I0 = r3(new g.b("text/csv"), new f.b() { // from class: l4.g
        @Override // f.b
        public final void a(Object obj) {
            l.I4(this.f20389a, (Uri) obj);
        }
    });
    private f.c J0 = r3(new g.c(), new f.b() { // from class: l4.h
        @Override // f.b
        public final void a(Object obj) {
            l.F4(this.f20391a, (Uri) obj);
        }
    });
    private m K0;
    private boolean L0;
    private g1.b M0;

    class a extends d.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f20396a;

        a(Context context) {
            this.f20396a = context;
        }

        @Override // f4.d.a
        public String a(Cursor cursor, int i10) {
            if (i10 != 5) {
                return super.a(cursor, i10);
            }
            return a.b.f(this.f20396a, cursor.getInt(i10));
        }
    }

    public static class b extends g.a {
        @Override // g.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public Intent a(Context context, Integer num) {
            return l.K4(context, num.intValue());
        }

        @Override // g.a
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public c c(int i10, Intent intent) {
            Uri data;
            if (intent == null || i10 != -1 || (data = intent.getData()) == null) {
                return null;
            }
            return new c(intent.getIntExtra("android.intent.extra.INDEX", 0), data);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f20399b;

        public c(int i10, Uri uri) {
            this.f20398a = i10;
            Objects.requireNonNull(uri, "uri must not be null");
            this.f20399b = uri;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f20398a == cVar.f20398a && this.f20399b.equals(cVar.f20399b);
        }

        public int hashCode() {
            return Objects.hash(Integer.valueOf(this.f20398a), this.f20399b);
        }

        public String toString() {
            return "Result{index=" + this.f20398a + ", uri=" + this.f20399b + '}';
        }
    }

    public static /* synthetic */ void F4(final l lVar, Uri uri) {
        if (uri == null) {
            lVar.getClass();
            return;
        }
        final Context contextX3 = lVar.x3();
        final ContentResolver contentResolver = contextX3.getContentResolver();
        try {
            InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
            if (inputStreamOpenInputStream == null) {
                return;
            }
            hc.g.c(inputStreamOpenInputStream).e(zc.a.b()).d(new mc.d() { // from class: l4.i
                @Override // mc.d
                public final Object apply(Object obj) {
                    return l.G4(contentResolver, (InputStream) obj);
                }
            }).e(jc.a.a()).i(new mc.c() { // from class: l4.j
                @Override // mc.c
                public final void accept(Object obj) {
                    l.H4(this.f20393a, contextX3, (Boolean) obj);
                }
            }, new mc.c() { // from class: l4.k
                @Override // mc.c
                public final void accept(Object obj) {
                    l.J4(contextX3, (Throwable) obj);
                }
            });
        } catch (Exception e10) {
            Toast.makeText(contextX3, e10.getLocalizedMessage(), 1).show();
        }
    }

    public static /* synthetic */ Boolean G4(ContentResolver contentResolver, InputStream inputStream) throws IOException {
        try {
            f4.b bVar = new f4.b(inputStream);
            int[] iArrB = a.b.b(bVar.g());
            ArrayList arrayList = new ArrayList(100);
            while (true) {
                String[] strArrG = bVar.g();
                boolean z10 = false;
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
                d5.a aVar = new d5.a(contentValues);
                if (!aVar.E()) {
                    d5.a aVarP = d5.a.p(aVar);
                    if (aVarP != null) {
                        boolean z11 = true;
                        if (!Objects.equals(aVar.f10571e, aVarP.f10571e)) {
                            aVarP.f10571e = aVar.f10571e;
                            z10 = true;
                        }
                        if (!Objects.equals(aVar.f10572f, aVarP.f10572f)) {
                            aVarP.f10572f = aVar.f10572f;
                            z10 = true;
                        }
                        if (!Integer.valueOf(aVar.A).equals(Integer.valueOf(aVarP.A))) {
                            aVarP.A = aVar.A;
                            z10 = true;
                        }
                        if (Boolean.valueOf(aVar.f10577t).equals(Boolean.valueOf(aVarP.f10577t))) {
                            z11 = z10;
                        } else {
                            aVarP.f10577t = aVar.f10577t;
                        }
                        if (z11) {
                            aVarP.L();
                        }
                    } else {
                        arrayList.add(contentValues);
                        if (arrayList.size() >= 100) {
                            contentResolver.bulkInsert(a.C0096a.f6663a, (ContentValues[]) arrayList.toArray(new ContentValues[0]));
                            arrayList.clear();
                        }
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                contentResolver.bulkInsert(a.C0096a.f6663a, (ContentValues[]) arrayList.toArray(new ContentValues[0]));
                arrayList.clear();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            return Boolean.TRUE;
        } catch (Throwable th2) {
            if (inputStream != null) {
                inputStream.close();
            }
            throw th2;
        }
    }

    public static /* synthetic */ void H4(l lVar, Context context, Boolean bool) {
        if (lVar.b2()) {
            return;
        }
        if (bool.booleanValue()) {
            Toast.makeText(context, R.string.importSuccessful, 1).show();
        } else {
            Toast.makeText(context, R.string.importFailed, 1).show();
        }
    }

    public static /* synthetic */ void I4(l lVar, Uri uri) {
        if (uri == null) {
            lVar.getClass();
            return;
        }
        Context contextX3 = lVar.x3();
        ContentResolver contentResolver = contextX3.getContentResolver();
        try {
            Cursor cursorQuery = contentResolver.query(a.C0096a.f6663a, a.b.f10584a, null, null, "title,rx_freq,_id");
            try {
                OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
                if (cursorQuery == null || outputStreamOpenOutputStream == null) {
                    if (outputStreamOpenOutputStream != null) {
                        outputStreamOpenOutputStream.close();
                    }
                    if (cursorQuery == null) {
                        return;
                    }
                } else {
                    try {
                        new f4.d().k(outputStreamOpenOutputStream, cursorQuery, null, a.b.c(contextX3), lVar.new a(contextX3));
                        String[] strArr = {"_display_name"};
                        String string = uri.toString();
                        if (Build.VERSION.SDK_INT >= 26) {
                            Cursor cursorQuery2 = contentResolver.query(uri, strArr, null, null);
                            if (cursorQuery2 != null) {
                                try {
                                    if (cursorQuery2.moveToNext()) {
                                        string = cursorQuery2.getString(0);
                                    }
                                } finally {
                                }
                            }
                            if (cursorQuery2 != null) {
                                cursorQuery2.close();
                            }
                        }
                        Toast.makeText(contextX3, contextX3.getString(R.string.toast_saveSuccessfully, string), 1).show();
                        outputStreamOpenOutputStream.close();
                    } finally {
                    }
                }
                cursorQuery.close();
            } finally {
            }
        } catch (Exception e10) {
            Toast.makeText(contextX3, e10.getLocalizedMessage(), 1).show();
        }
    }

    public static /* synthetic */ void J4(Context context, Throwable th2) {
        Toast.makeText(context, th2.getLocalizedMessage(), 1).show();
        th2.printStackTrace();
    }

    public static Intent K4(Context context, int i10) {
        Intent intentD2 = FragmentShowActivity.d2(context, null, l.class);
        intentD2.setAction("android.intent.action.PICK");
        intentD2.putExtra("android.intent.extra.INDEX", i10);
        return intentD2;
    }

    @Override // v3.f0
    protected void D4(String str) {
        super.D4(str);
        if (this.M0 == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.M0.R(null);
            this.M0.S(null);
        } else {
            g4.f fVarG = new f.b().k(str.replace(".", "")).l(new String[]{"title", "tx_freq", "rx_freq"}).g();
            this.M0.R(fVarG.n());
            this.M0.S(fVarG.k());
        }
        this.M0.p();
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id._import /* 2131296280 */:
                this.J0.a("text/*");
                return true;
            case R.id.add /* 2131296369 */:
                ChannelEditorFragment.R4(x3());
                return true;
            case R.id.export /* 2131296740 */:
                this.I0.a("");
                return true;
            case R.id.search /* 2131297322 */:
                Q();
                return true;
            default:
                return super.F2(menuItem);
        }
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    /* JADX INFO: renamed from: L4, reason: merged with bridge method [inline-methods] */
    public void K(g1.c cVar, Cursor cursor) {
        this.K0.H(cursor);
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public g1.c S(int i10, Bundle bundle) {
        return new g1.b(x3(), a.C0096a.f6663a, a.e.f10595a, null, null, "title,rx_freq,_id");
    }

    @Override // l4.m.a
    public void q(m.b bVar) {
        androidx.fragment.app.p pVarV3 = v3();
        Intent intent = pVarV3.getIntent();
        if (!this.L0) {
            ChannelEditorFragment.K4(pVarV3, bVar.m());
            return;
        }
        Intent intent2 = new Intent((String) null, ContentUris.withAppendedId(a.C0096a.f6663a, bVar.m()));
        intent2.putExtra("android.intent.extra.INDEX", intent.getIntExtra("android.intent.extra.INDEX", 0));
        pVarV3.setResult(-1, intent2);
        pVarV3.finish();
    }

    @Override // v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        G3(true);
        if ("android.intent.action.PICK".equals(v3().getIntent().getAction())) {
            z4(R1(R.string.pickChannel));
            this.L0 = true;
        } else {
            y4(R.string.channelManager);
        }
        this.M0 = (g1.b) x1().c(0, null, this);
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public void t0(g1.c cVar) {
        this.K0.H(null);
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater menuInflater) {
        MenuItem menuItemFindItem;
        super.u2(menu, menuInflater);
        menuInflater.inflate(R.menu.optioins_channel_list, menu);
        if (this.I0 != null || (menuItemFindItem = menu.findItem(R.id.import_export)) == null) {
            return;
        }
        menuItemFindItem.setVisible(false);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_channel_list, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) viewInflate.findViewById(R.id.list);
        recyclerView.setLayoutManager(new LinearLayoutManager(viewInflate.getContext()));
        m mVar = new m(this);
        this.K0 = mVar;
        recyclerView.setAdapter(mVar);
        recyclerView.l(new c6.m(x3(), 0));
        g4(recyclerView);
        return viewInflate;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        this.K0.H(null);
        super.y2();
    }

    @Override // v3.f0, v3.e0
    public v3.e0 getSearchable() {
        return this;
    }
}
