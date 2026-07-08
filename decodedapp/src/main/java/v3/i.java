package v3;

import android.R;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Spanned;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.appcompat.app.c;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class i extends androidx.appcompat.app.d implements s, t {

    /* JADX INFO: renamed from: a0 */
    public static final a f29562a0 = new a(null);
    private final String M = "ActivityEx";
    private Bundle N;
    private ArrayList O;
    private ProgressDialog P;
    private WeakHashMap Q;
    private boolean R;
    private BottomSheetBehavior S;
    private boolean T;
    private boolean U;
    private int V;
    private long W;
    private boolean X;
    private CharSequence Y;
    private NestedScrollView Z;

    public static final class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends BottomSheetBehavior.f {
        b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void b(View view, float f10) {
            rd.m.e(view, "bottomSheet");
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.f
        public void c(View view, int i10) {
            rd.m.e(view, "bottomSheet");
            switch (i10) {
                case 1:
                    s3.b.b(i.this.M, "BottomSheet:STATE_DRAGGING");
                    break;
                case 2:
                    s3.b.b(i.this.M, "BottomSheet:STATE_SETTLING");
                    break;
                case 3:
                    s3.b.b(i.this.M, "BottomSheet:STATE_EXPANDED");
                    break;
                case 4:
                    s3.b.b(i.this.M, "BottomSheet:STATE_COLLAPSED");
                    break;
                case 5:
                    s3.b.b(i.this.M, "BottomSheet:STATE_HIDDEN");
                    break;
                case 6:
                    s3.b.b(i.this.M, "BottomSheet:STATE_HALF_EXPANDED");
                    break;
                default:
                    s3.b.b(i.this.M, "BottomSheet:" + i10);
                    break;
            }
            i.this.B1(i10);
        }
    }

    public static final void D1(i iVar, DialogInterface dialogInterface, int i10) {
        if (iVar.X) {
            iVar.finish();
        }
    }

    public static final void E1(i iVar, DialogInterface dialogInterface, int i10) {
        j.e(iVar, new Intent("android.settings.APPLICATION_DETAILS_SETTINGS", Uri.parse("package:" + iVar.getPackageName())));
    }

    public static final void F1(i iVar, DialogInterface dialogInterface) {
        iVar.U = false;
    }

    public static /* synthetic */ boolean H1(i iVar, String[] strArr, int i10, CharSequence charSequence, boolean z10, CharSequence charSequence2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestPermissions");
        }
        boolean z11 = (i11 & 8) != 0 ? true : z10;
        if ((i11 & 16) != 0) {
            charSequence2 = null;
        }
        return iVar.G1(strArr, i10, charSequence, z11, charSequence2);
    }

    public static final void I1(i iVar, DialogInterface dialogInterface) {
        iVar.U = false;
    }

    public static final void J1(i iVar, String[] strArr, int i10, CharSequence charSequence, boolean z10, DialogInterface dialogInterface, int i11) {
        iVar.U = false;
        H1(iVar, strArr, i10, charSequence, z10, null, 16, null);
    }

    protected String A1() {
        return null;
    }

    protected void B1(int i10) {
        for (androidx.fragment.app.o oVar : N0().v0()) {
            if (oVar instanceof v) {
                ((v) oVar).d4(i10);
            }
        }
    }

    public final boolean G1(final String[] strArr, final int i10, final CharSequence charSequence, final boolean z10, CharSequence charSequence2) {
        if (Build.VERSION.SDK_INT < 23 || strArr == null || s1(strArr)) {
            return true;
        }
        if (this.U) {
            return false;
        }
        if (charSequence2 != null && charSequence2.length() > 0) {
            new c.a(this).k(charSequence2).r(new DialogInterface.OnDismissListener() { // from class: v3.g
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    i.I1(this.f29554a, dialogInterface);
                }
            }).t(R.string.ok, new DialogInterface.OnClickListener() { // from class: v3.h
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i11) {
                    i.J1(this.f29556a, strArr, i10, charSequence, z10, dialogInterface, i11);
                }
            }).C();
            this.U = true;
            return false;
        }
        this.V = i10;
        this.X = z10;
        this.Y = charSequence;
        requestPermissions(strArr, i10);
        this.W = SystemClock.elapsedRealtime();
        return false;
    }

    public final boolean K1(int i10) {
        t1();
        BottomSheetBehavior bottomSheetBehavior = this.S;
        if (bottomSheetBehavior == null) {
            return false;
        }
        rd.m.b(bottomSheetBehavior);
        bottomSheetBehavior.S0(i10);
        return true;
    }

    public boolean N(androidx.fragment.app.o oVar, int i10, int i11, int i12, Object obj) {
        WeakHashMap weakHashMap = this.Q;
        if (weakHashMap == null) {
            return false;
        }
        rd.m.b(weakHashMap);
        if (weakHashMap.size() <= 0) {
            return false;
        }
        WeakHashMap weakHashMap2 = this.Q;
        rd.m.b(weakHashMap2);
        Set setEntrySet = weakHashMap2.entrySet();
        rd.m.d(setEntrySet, "<get-entries>(...)");
        Iterator it = setEntrySet.iterator();
        while (it.hasNext()) {
            androidx.fragment.app.o oVar2 = oVar;
            int i13 = i10;
            int i14 = i11;
            int i15 = i12;
            Object obj2 = obj;
            if (((s) ((Map.Entry) it.next()).getKey()).N(oVar2, i13, i14, i15, obj2)) {
                return true;
            }
            oVar = oVar2;
            i10 = i13;
            i11 = i14;
            i12 = i15;
            obj = obj2;
        }
        return false;
    }

    @Override // androidx.appcompat.app.d, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    protected void attachBaseContext(Context context) {
        rd.m.e(context, "newBase");
        super.attachBaseContext(context);
        n.b(getResources());
    }

    @Override // v3.t
    public void c(s sVar) {
        rd.m.e(sVar, "listener");
        WeakHashMap weakHashMap = this.Q;
        if (weakHashMap == null) {
            return;
        }
        rd.m.b(weakHashMap);
        weakHashMap.remove(sVar);
    }

    @Override // android.app.Activity
    public boolean isDestroyed() {
        return this.R;
    }

    @Override // d.q, android.app.Activity
    public void onBackPressed() {
        if (N(null, k3.f.U, 0, 0, null)) {
            return;
        }
        try {
            super.onBackPressed();
        } catch (IllegalStateException e10) {
            if (a6.f.f328a) {
                throw e10;
            }
            finish();
            Log.e(this.M, "java.lang.IllegalStateException in onBackPressed", e10);
        }
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i10) {
        return onCreateDialog(i10, this.N);
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        if (a6.f.f328a) {
            Log.i(this.M, "onDestroy@" + this);
        }
        this.R = true;
        ProgressDialog progressDialog = this.P;
        if (progressDialog != null) {
            try {
                rd.m.b(progressDialog);
                if (progressDialog.isShowing()) {
                    ProgressDialog progressDialog2 = this.P;
                    rd.m.b(progressDialog2);
                    progressDialog2.dismiss();
                }
            } catch (Exception unused) {
            }
        }
        ArrayList arrayList = this.O;
        if (arrayList != null) {
            rd.m.b(arrayList);
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                try {
                    ArrayList arrayList2 = this.O;
                    rd.m.b(arrayList2);
                    Object obj = arrayList2.get(i10);
                    rd.m.d(obj, "get(...)");
                    Dialog dialog = (Dialog) obj;
                    if (dialog.isShowing()) {
                        dialog.dismiss();
                    }
                } catch (Exception unused2) {
                }
            }
        }
        super.onDestroy();
    }

    @Override // android.app.Activity
    protected void onPrepareDialog(int i10, Dialog dialog, Bundle bundle) {
        rd.m.e(dialog, "dialog");
    }

    @Override // androidx.fragment.app.p, d.q, android.app.Activity, a0.b.e
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        rd.m.e(strArr, "permissions");
        rd.m.e(iArr, "grantResults");
        super.onRequestPermissionsResult(i10, strArr, iArr);
        int i11 = 0;
        if (i10 == this.V) {
            if (this.U) {
                return;
            }
            if (SystemClock.elapsedRealtime() - this.W < 2000) {
                for (String str : strArr) {
                    if (!b0.a(this, str)) {
                        this.U = true;
                        new c.a(this).k(x1(str, this.Y)).m(this.X ? k3.j.f19235c : R.string.cancel, new DialogInterface.OnClickListener() { // from class: v3.d
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i12) {
                                i.D1(this.f29551a, dialogInterface, i12);
                            }
                        }).t(k3.j.f19240h, new DialogInterface.OnClickListener() { // from class: v3.e
                            @Override // android.content.DialogInterface.OnClickListener
                            public final void onClick(DialogInterface dialogInterface, int i12) {
                                i.E1(this.f29552a, dialogInterface, i12);
                            }
                        }).d(false).r(new DialogInterface.OnDismissListener() { // from class: v3.f
                            @Override // android.content.DialogInterface.OnDismissListener
                            public final void onDismiss(DialogInterface dialogInterface) {
                                i.F1(this.f29553a, dialogInterface);
                            }
                        }).C();
                        return;
                    }
                }
            }
        }
        if (1 != i10) {
            return;
        }
        int length = iArr.length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (iArr[i11] != 0) {
                finish();
                break;
            }
            i11++;
        }
        if (s1(z1())) {
            C1();
        }
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onResume() {
        super.onResume();
        G1(z1(), 1, getTitle(), true, A1());
        t1();
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.T = true;
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onStop() {
        super.onStop();
        this.T = false;
    }

    public final boolean s1(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        return b0.a(this, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public final void t1() {
        NestedScrollView nestedScrollView = (NestedScrollView) findViewById(k3.f.f19190j);
        if (nestedScrollView == null) {
            this.S = null;
            this.Z = null;
        } else {
            if (nestedScrollView == this.Z) {
                return;
            }
            this.Z = nestedScrollView;
            BottomSheetBehavior bottomSheetBehaviorM0 = BottomSheetBehavior.m0(nestedScrollView);
            this.S = bottomSheetBehaviorM0;
            rd.m.b(bottomSheetBehaviorM0);
            bottomSheetBehaviorM0.S0(5);
            BottomSheetBehavior bottomSheetBehavior = this.S;
            rd.m.b(bottomSheetBehavior);
            bottomSheetBehavior.Y(new b());
        }
    }

    public String toString() {
        return super.toString() + " (" + ((Object) getTitle()) + ")";
    }

    public final androidx.fragment.app.o u1(Class cls, boolean z10) {
        rd.m.e(cls, "fragmentClass");
        t1();
        if (this.S == null) {
            return null;
        }
        androidx.fragment.app.w wVarN0 = N0();
        rd.m.d(wVarN0, "getSupportFragmentManager(...)");
        int i10 = k3.f.f19190j;
        androidx.fragment.app.o oVarI0 = wVarN0.i0(i10);
        if (oVarI0 != null) {
            if (rd.m.a(oVarI0.getClass(), cls)) {
                return oVarI0;
            }
            if (z10) {
                wVarN0.o().o(oVarI0).h();
            }
        }
        if (!z10) {
            return null;
        }
        androidx.fragment.app.o oVarY1 = androidx.fragment.app.o.Y1(this, cls.getName());
        wVarN0.o().b(i10, oVarY1).h();
        return oVarY1;
    }

    public final CharSequence v1(String str) {
        rd.m.e(str, "permission");
        PackageManager packageManager = getPackageManager();
        try {
            CharSequence charSequenceLoadLabel = packageManager.getPermissionInfo(str, 0).loadLabel(packageManager);
            rd.m.b(charSequenceLoadLabel);
            return charSequenceLoadLabel;
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return str;
        }
    }

    protected final CharSequence w1(String str) {
        rd.m.e(str, "permission");
        String string = getString(k3.j.f19238f, v1(str));
        rd.m.d(string, "getString(...)");
        Spanned spannedB = z5.a.b(this, string);
        rd.m.d(spannedB, "fromHtml(...)");
        return spannedB;
    }

    @Override // v3.t
    public void x(s sVar) {
        rd.m.e(sVar, "listener");
        if (this.Q == null) {
            this.Q = new WeakHashMap();
        }
        WeakHashMap weakHashMap = this.Q;
        rd.m.b(weakHashMap);
        weakHashMap.put(sVar, null);
    }

    protected final CharSequence x1(String str, CharSequence charSequence) {
        rd.m.e(str, "permission");
        CharSequence charSequenceW1 = w1(str);
        if (TextUtils.isEmpty(charSequence)) {
            return charSequenceW1;
        }
        return ((Object) charSequence) + " " + ((Object) charSequenceW1);
    }

    public final boolean y1() {
        return this.T;
    }

    protected String[] z1() {
        return null;
    }

    @Override // android.app.Activity
    protected Dialog onCreateDialog(int i10, Bundle bundle) {
        return null;
    }

    @Override // android.app.Activity
    protected void onPrepareDialog(int i10, Dialog dialog) {
        rd.m.e(dialog, "dialog");
        onPrepareDialog(i10, dialog, this.N);
    }

    protected void C1() {
    }
}
