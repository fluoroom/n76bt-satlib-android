package com.dw.ht.channels;

import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;
import androidx.fragment.app.p;
import androidx.loader.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.ht.channels.ChannelEditorFragment;
import com.dw.ht.channels.b;
import com.dw.ht.channels.c;
import d5.a;
import d5.e;
import dd.d0;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import l4.l;
import m4.b1;
import o5.i;
import org.simpleframework.xml.strategy.Name;
import rd.m;
import v3.m0;
import v4.c0;
import v4.l1;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u0005:\u0001gB\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u0007J\u000f\u0010\u000e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000e\u0010\u0007J\u0019\u0010\u0011\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J1\u0010\u0018\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001b\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001c\u0010\fJ\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b*\u0010+J-\u0010/\u001a\u0004\u0018\u00010(2\u0006\u0010 \u001a\u00020,2\b\u0010.\u001a\u0004\u0018\u00010-2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\nH\u0016¢\u0006\u0004\b1\u0010\u0007J'\u00105\u001a\b\u0012\u0004\u0012\u00020\u0003042\u0006\u00102\u001a\u00020\u00142\b\u00103\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b5\u00106J'\u00109\u001a\u00020\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u0003042\b\u00108\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b9\u0010:J\u001d\u0010;\u001a\u00020\n2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000304H\u0016¢\u0006\u0004\b;\u0010<J#\u0010@\u001a\u00020\n2\n\u0010$\u001a\u00060=R\u00020>2\u0006\u0010?\u001a\u00020\u0014H\u0016¢\u0006\u0004\b@\u0010AJ)\u0010E\u001a\u00020\n2\u0006\u0010B\u001a\u00020\u00142\u0006\u0010C\u001a\u00020\u00142\b\u00108\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020%H\u0014¢\u0006\u0004\bG\u0010HJ\u0017\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020\bH\u0016¢\u0006\u0004\bJ\u0010\fR\u0018\u0010N\u001a\u0004\u0018\u00010K8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010MR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020P0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0018\u0010V\u001a\u0004\u0018\u00010>8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010UR\u0018\u0010Z\u001a\u0004\u0018\u00010W8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010^\u001a\u0004\u0018\u00010[8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010e\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006h"}, d2 = {"Lcom/dw/ht/channels/a;", "Lv3/m0;", "Landroidx/loader/app/a$a;", "Lcom/dw/ht/channels/b$a;", "Lcom/dw/ht/channels/c$a;", "Landroid/text/TextWatcher;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Ldd/d0;", "K4", "(Landroid/os/Bundle;)V", "V4", "O4", "Landroid/text/Editable;", "s", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "r2", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "u2", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", "item", "", "F2", "(Landroid/view/MenuItem;)Z", "Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "container", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", Name.MARK, "args", "Lg1/c;", "S", "(ILandroid/os/Bundle;)Lg1/c;", "loader", "data", "N4", "(Lg1/c;Lcom/dw/ht/channels/b$a;)V", "t0", "(Lg1/c;)V", "Lcom/dw/ht/channels/c$b;", "Lcom/dw/ht/channels/c;", "viewId", "g0", "(Lcom/dw/ht/channels/c$b;I)V", "requestCode", "resultCode", "Landroid/content/Intent;", "m2", "(IILandroid/content/Intent;)V", "c4", "()Z", "outState", "N2", "Lm4/b1;", "F0", "Lm4/b1;", "binding", "Lf/c;", "", "G0", "Lf/c;", "exportLauncher", "H0", "Lcom/dw/ht/channels/c;", "mAdapter", "Landroidx/recyclerview/widget/RecyclerView;", "I0", "Landroidx/recyclerview/widget/RecyclerView;", "mList", "Ld5/e;", "J0", "Ld5/e;", "mRegion", "Lcom/dw/ht/channels/b;", "K0", "Lcom/dw/ht/channels/b;", "mLoader", "L0", "Z", "changed", "M0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a extends m0 implements a.InterfaceC0037a, c.a, TextWatcher {
    private static final int N0 = 1;
    private static final int O0 = 2;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private b1 binding;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private final f.c exportLauncher;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private c mAdapter;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private RecyclerView mList;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private e mRegion;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private b mLoader;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private boolean changed;

    public a() {
        f.c cVarR3 = r3(new g.b("text/csv"), new f.b() { // from class: l4.p
            @Override // f.b
            public final void a(Object obj) {
                com.dw.ht.channels.a.J4(this.f20404a, (Uri) obj);
            }
        });
        m.d(cVarR3, "registerForActivityResult(...)");
        this.exportLauncher = cVarR3;
    }

    /* JADX WARN: Finally extract failed */
    public static final void J4(a aVar, Uri uri) {
        d5.a[] aVarArrM;
        if (uri == null) {
            return;
        }
        Context contextX3 = aVar.x3();
        m.d(contextX3, "requireContext(...)");
        ContentResolver contentResolver = contextX3.getContentResolver();
        try {
            OutputStream outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
            if (outputStreamOpenOutputStream != null) {
                try {
                    f4.c cVar = new f4.c(outputStreamOpenOutputStream);
                    cVar.g(a.b.c(aVar.x3()));
                    e eVar = aVar.mRegion;
                    if (eVar != null && (aVarArrM = eVar.m(false)) != null) {
                        for (d5.a aVar2 : aVarArrM) {
                            if (aVar2 == null || aVar2.E()) {
                                cVar.g(new String[]{""});
                            } else {
                                cVar.g(aVar2.u(contextX3));
                            }
                        }
                    }
                    String[] strArr = {"_display_name"};
                    String string = uri.toString();
                    m.d(string, "toString(...)");
                    if (Build.VERSION.SDK_INT >= 26) {
                        Cursor cursorQuery = contentResolver.query(uri, strArr, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.moveToNext()) {
                                    string = cursorQuery.getString(0);
                                    m.d(string, "getString(...)");
                                }
                            } catch (Throwable th2) {
                                try {
                                    throw th2;
                                } catch (Throwable th3) {
                                    od.a.a(cursorQuery, th2);
                                    throw th3;
                                }
                            }
                        }
                        d0 d0Var = d0.f10897a;
                        od.a.a(cursorQuery, null);
                    }
                    Toast.makeText(contextX3, contextX3.getString(R.string.toast_saveSuccessfully, string), 1).show();
                    d0 d0Var2 = d0.f10897a;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        od.a.a(outputStreamOpenOutputStream, th4);
                        throw th5;
                    }
                }
            }
            od.a.a(outputStreamOpenOutputStream, null);
        } catch (Exception e10) {
            Toast.makeText(contextX3, e10.getLocalizedMessage(), 1).show();
        }
    }

    private final void K4(Bundle savedInstanceState) throws Throwable {
        e eVar;
        Throwable th2;
        if (savedInstanceState != null) {
            e eVar2 = (e) savedInstanceState.getParcelable("region");
            this.mRegion = eVar2;
            if (eVar2 != null) {
                z4((eVar2 == null || eVar2.b() != 0) ? N1(R.string.editRegion) : N1(R.string.newRegion));
                return;
            }
        }
        try {
            Bundle bundleI1 = i1();
            if (bundleI1 == null) {
                if (this.mRegion != null) {
                    z4(N1(R.string.editRegion));
                    return;
                } else {
                    this.mRegion = new e();
                    z4(N1(R.string.newRegion));
                    return;
                }
            }
            eVar = (e) bundleI1.getParcelable("region");
            if (eVar != null) {
                if (this.mRegion != null) {
                    z4(N1(R.string.editRegion));
                    return;
                } else {
                    this.mRegion = eVar;
                    z4(N1(R.string.newRegion));
                    return;
                }
            }
            try {
                long j10 = bundleI1.getLong("_id", -1L);
                if (j10 == -1) {
                    if (this.mRegion != null) {
                        z4(N1(R.string.editRegion));
                        return;
                    } else {
                        this.mRegion = new e();
                        z4(N1(R.string.newRegion));
                        return;
                    }
                }
                e eVarP = e.p(j10);
                this.mRegion = eVarP;
                if (eVarP != null) {
                    z4(N1(R.string.editRegion));
                    return;
                } else {
                    this.mRegion = new e();
                    z4(N1(R.string.newRegion));
                    return;
                }
            } catch (Throwable th3) {
                th2 = th3;
            }
        } catch (Throwable th4) {
            eVar = null;
            th2 = th4;
        }
        if (this.mRegion == null) {
            if (eVar == null) {
                eVar = new e();
            }
            this.mRegion = eVar;
            z4(N1(R.string.newRegion));
        } else {
            z4(N1(R.string.editRegion));
        }
        throw th2;
    }

    public static final void L4(a aVar, DialogInterface dialogInterface, int i10) {
        m.e(dialogInterface, "<unused var>");
        aVar.O4();
    }

    public static final void M4(a aVar, DialogInterface dialogInterface, int i10) {
        m.e(dialogInterface, "<unused var>");
        p pVarE1 = aVar.e1();
        if (pVarE1 != null) {
            pVarE1.finish();
        }
    }

    private final void O4() {
        b1 b1Var = this.binding;
        if (b1Var == null) {
            return;
        }
        e eVar = this.mRegion;
        m.b(eVar);
        String string = b1Var.f21003c.getText().toString();
        int length = string.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            boolean z11 = m.f(string.charAt(!z10 ? i10 : length), 32) <= 0;
            if (z10) {
                if (!z11) {
                    break;
                } else {
                    length--;
                }
            } else if (z11) {
                i10++;
            } else {
                z10 = true;
            }
        }
        eVar.f10626e = string.subSequence(i10, length + 1).toString();
        e eVar2 = this.mRegion;
        m.b(eVar2);
        eVar2.u();
        final l1 l1VarU = u.u();
        if (!(l1VarU instanceof c0)) {
            W3();
            return;
        }
        c0 c0Var = (c0) l1VarU;
        int i11 = c0Var.Q.i();
        Context contextK1 = k1();
        if (contextK1 == null) {
            return;
        }
        if (i11 <= 1) {
            new AlertDialog.Builder(contextK1).setMessage(N1(R.string.sync_to_device)).setCancelable(false).setPositiveButton(R.string.yes, new DialogInterface.OnClickListener() { // from class: l4.t
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    com.dw.ht.channels.a.S4(this.f20409a, dialogInterface, i12);
                }
            }).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: l4.u
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    com.dw.ht.channels.a.T4(this.f20410a, dialogInterface, i12);
                }
            }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l4.v
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    com.dw.ht.channels.a.U4(this.f20411a, dialogInterface);
                }
            }).show();
            return;
        }
        String[] strArr = new String[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            strArr[i12] = c0Var.Z1(i12);
        }
        new AlertDialog.Builder(contextK1).setTitle(N1(R.string.sync_to_device)).setSingleChoiceItems(strArr, -1, new DialogInterface.OnClickListener() { // from class: l4.q
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                com.dw.ht.channels.a.P4(l1VarU, this, dialogInterface, i13);
            }
        }).setCancelable(false).setNegativeButton(R.string.no, new DialogInterface.OnClickListener() { // from class: l4.r
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i13) {
                com.dw.ht.channels.a.Q4(this.f20407a, dialogInterface, i13);
            }
        }).setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l4.s
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                com.dw.ht.channels.a.R4(this.f20408a, dialogInterface);
            }
        }).show();
    }

    public static final void P4(l1 l1Var, a aVar, DialogInterface dialogInterface, int i10) {
        dialogInterface.dismiss();
        e eVar = aVar.mRegion;
        m.b(eVar);
        ((c0) l1Var).j1(eVar.b(), i10);
    }

    public static final void Q4(a aVar, DialogInterface dialogInterface, int i10) {
        aVar.W3();
    }

    public static final void R4(a aVar, DialogInterface dialogInterface) {
        aVar.W3();
    }

    public static final void S4(a aVar, DialogInterface dialogInterface, int i10) {
        Collection collectionA = u.w().A();
        m.d(collectionA, "getLinks(...)");
        ArrayList<l1> arrayList = new ArrayList();
        for (Object obj : collectionA) {
            if (((l1) obj).n()) {
                arrayList.add(obj);
            }
        }
        for (l1 l1Var : arrayList) {
            e eVar = aVar.mRegion;
            m.b(eVar);
            l1Var.j1(eVar.b(), -1);
        }
        aVar.W3();
    }

    public static final void T4(a aVar, DialogInterface dialogInterface, int i10) {
        aVar.W3();
    }

    public static final void U4(a aVar, DialogInterface dialogInterface) {
        aVar.W3();
    }

    private final void V4() {
        Context contextX3 = x3();
        e eVar = this.mRegion;
        m.b(eVar);
        i.c(contextX3, eVar);
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem item) {
        String str;
        m.e(item, "item");
        int itemId = item.getItemId();
        if (itemId != R.id.export) {
            if (itemId == R.id.save) {
                O4();
                return true;
            }
            if (itemId != R.id.share) {
                return super.F2(item);
            }
            V4();
            return true;
        }
        f.c cVar = this.exportLauncher;
        e eVar = this.mRegion;
        if (eVar == null || (str = eVar.f10626e) == null) {
            str = "";
        }
        cVar.a(str);
        return true;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void N2(Bundle outState) {
        m.e(outState, "outState");
        outState.putParcelable("region", this.mRegion);
        super.N2(outState);
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    /* JADX INFO: renamed from: N4 */
    public void K(g1.c loader, b.a data) {
        m.e(loader, "loader");
        if (data == null) {
            c cVar = this.mAdapter;
            if (cVar != null) {
                cVar.H(null);
                return;
            }
            return;
        }
        c cVar2 = this.mAdapter;
        if (cVar2 != null) {
            cVar2.H(data.f5642a);
        }
        a4();
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        m.e(view, "view");
        super.Q2(view, savedInstanceState);
        g1.c cVarC = x1().c(0, null, this);
        m.c(cVarC, "null cannot be cast to non-null type com.dw.ht.channels.RegionEditorLoader");
        b bVar = (b) cVarC;
        this.mLoader = bVar;
        this.mRegion = bVar != null ? bVar.P() : null;
        c cVar = new c(this);
        this.mAdapter = cVar;
        b1 b1Var = this.binding;
        if (b1Var == null) {
            return;
        }
        b1Var.f21002b.setAdapter(cVar);
        EditText editText = b1Var.f21003c;
        e eVar = this.mRegion;
        editText.setText(eVar != null ? eVar.f10626e : null);
        b1Var.f21003c.addTextChangedListener(this);
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public g1.c S(int i10, Bundle args) {
        b bVar = new b(x3());
        bVar.R(this.mRegion);
        return bVar;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s10) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s10, int start, int count, int after) {
    }

    @Override // v3.v
    protected boolean c4() {
        if (!this.changed) {
            return false;
        }
        new AlertDialog.Builder(x3()).setMessage(N1(R.string.saveChangesQ)).setNeutralButton(N1(android.R.string.cancel), (DialogInterface.OnClickListener) null).setPositiveButton(R.string.save, new DialogInterface.OnClickListener() { // from class: l4.n
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                com.dw.ht.channels.a.L4(this.f20402a, dialogInterface, i10);
            }
        }).setNegativeButton(N1(R.string.discard), new DialogInterface.OnClickListener() { // from class: l4.o
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                com.dw.ht.channels.a.M4(this.f20403a, dialogInterface, i10);
            }
        }).show();
        return true;
    }

    @Override // com.dw.ht.channels.c.a
    public void g0(c.b item, int viewId) {
        m.e(item, "item");
        if (viewId == R.id.clean) {
            e eVar = this.mRegion;
            if (eVar != null) {
                eVar.j(item.k());
            }
            b bVar = this.mLoader;
            if (bVar != null) {
                bVar.p();
            }
            this.changed = true;
            return;
        }
        if (viewId == R.id.link) {
            startActivityForResult(l.K4(k1(), item.k()), N0);
            return;
        }
        ChannelEditorFragment.Companion companion = ChannelEditorFragment.INSTANCE;
        Context contextX3 = x3();
        m.d(contextX3, "requireContext(...)");
        startActivityForResult(companion.c(contextX3, item.F, null, Integer.valueOf(item.k())), O0);
        this.changed = true;
    }

    @Override // androidx.fragment.app.o
    public void m2(int requestCode, int resultCode, Intent data) {
        Uri data2;
        if (resultCode != -1 || (requestCode != O0 && requestCode != N0)) {
            super.m2(requestCode, resultCode, data);
            return;
        }
        if (data == null || (data2 = data.getData()) == null) {
            return;
        }
        long id2 = ContentUris.parseId(data2);
        e eVar = this.mRegion;
        if (eVar != null) {
            eVar.v(data.getIntExtra("android.intent.extra.INDEX", 0), id2);
        }
        b bVar = this.mLoader;
        if (bVar != null) {
            bVar.p();
        }
        this.changed = true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s10, int start, int before, int count) {
        this.changed = true;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) throws Throwable {
        super.r2(savedInstanceState);
        G3(true);
        K4(savedInstanceState);
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public void t0(g1.c loader) {
        m.e(loader, "loader");
        c cVar = this.mAdapter;
        if (cVar != null) {
            cVar.H(null);
        }
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater inflater) {
        m.e(menu, "menu");
        m.e(inflater, "inflater");
        super.u2(menu, inflater);
        inflater.inflate(R.menu.o_region_editor, menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.share);
        m.b(this.mRegion);
        menuItemFindItem.setVisible(!r3.o());
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        m.e(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.fragment_region_editor, container, false);
        this.binding = b1.a(viewInflate);
        View viewFindViewById = viewInflate.findViewById(R.id.list);
        m.c(viewFindViewById, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        this.mList = (RecyclerView) viewFindViewById;
        Context context = viewInflate.getContext();
        RecyclerView recyclerView = this.mList;
        m.b(recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
        RecyclerView recyclerView2 = this.mList;
        m.b(recyclerView2);
        recyclerView2.l(new c6.m(k1(), 0));
        g4(this.mList);
        return viewInflate;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
