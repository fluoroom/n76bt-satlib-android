package v3;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.appcompat.app.c;

/* JADX INFO: loaded from: classes.dex */
public class m0 extends v implements n0 {
    private CharSequence A0;
    private int B0;
    private Integer C0;
    private Drawable D0;
    private boolean E0 = false;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private CharSequence f29585z0;

    public static /* synthetic */ void m4(m0 m0Var, DialogInterface dialogInterface, int i10) {
        m0Var.getClass();
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + m0Var.k1().getPackageName()));
        j.f(m0Var, intent);
    }

    private void o4() {
        int i10 = k3.f.V;
        int i11 = this.B0;
        Integer num = this.C0;
        if (h4(i10, i11, num == null ? 0 : num.intValue(), this.f29585z0)) {
            return;
        }
        v4(this.f29585z0, this.B0);
    }

    private void w4() {
        if (n4()) {
            return;
        }
        for (String str : t4()) {
            if (!N3(str)) {
                if (this.E0) {
                    return;
                }
                this.E0 = true;
                CharSequence title = getTitle();
                if (TextUtils.isEmpty(title)) {
                    title = e1().getTitle();
                }
                new c.a(k1()).k(r4(str, title)).m(k3.j.f19235c, new DialogInterface.OnClickListener() { // from class: v3.j0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        this.f29573a.W3();
                    }
                }).t(k3.j.f19240h, new DialogInterface.OnClickListener() { // from class: v3.k0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i10) {
                        m0.m4(this.f29583a, dialogInterface, i10);
                    }
                }).d(false).r(new DialogInterface.OnDismissListener() { // from class: v3.l0
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        this.f29584a.E0 = false;
                    }
                }).C();
                return;
            }
        }
        u3(t4(), 1);
    }

    public boolean D0() {
        return false;
    }

    @Override // v3.n0
    public Drawable L() {
        return this.D0;
    }

    @Override // androidx.fragment.app.o
    public void L2(int i10, String[] strArr, int[] iArr) {
        super.L2(i10, strArr, iArr);
        if (1 != i10) {
            return;
        }
        int length = iArr.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                break;
            }
            if (iArr[i11] != 0) {
                W3();
                break;
            }
            i11++;
        }
        if (n4()) {
            u4();
        }
    }

    @Override // v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        w4();
    }

    @Override // v3.n0
    public boolean R0() {
        return false;
    }

    @Override // v3.n0
    public final CharSequence getSubtitle() {
        return this.A0;
    }

    @Override // v3.n0
    public final CharSequence getTitle() {
        return this.f29585z0;
    }

    protected boolean n4() {
        String[] strArrT4;
        if (Build.VERSION.SDK_INT < 23 || (strArrT4 = t4()) == null) {
            return true;
        }
        int length = strArrT4.length;
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (b0.b.a(k1(), strArrT4[i10]) != 0) {
                z10 = true;
                break;
            }
            i10++;
        }
        return !z10;
    }

    protected CharSequence p4(String str) {
        PackageManager packageManager = e1().getPackageManager();
        try {
            return packageManager.getPermissionInfo(str, 0).loadLabel(packageManager);
        } catch (PackageManager.NameNotFoundException e10) {
            e10.printStackTrace();
            return str;
        }
    }

    protected CharSequence q4(String str) {
        return z5.a.b(k1(), O1(k3.j.f19238f, p4(str)));
    }

    protected CharSequence r4(String str, CharSequence charSequence) {
        CharSequence charSequenceQ4 = q4(str);
        if (TextUtils.isEmpty(charSequence)) {
            return charSequenceQ4;
        }
        return ((Object) charSequence) + " " + ((Object) charSequenceQ4);
    }

    public final Integer s4() {
        return this.C0;
    }

    protected String[] t4() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void x4(CharSequence charSequence) {
        if (TextUtils.equals(this.A0, charSequence)) {
            return;
        }
        this.A0 = charSequence;
        o4();
    }

    protected void y4(int i10) {
        z4(R1(i10));
    }

    protected void z4(CharSequence charSequence) {
        if (TextUtils.equals(this.f29585z0, charSequence)) {
            return;
        }
        this.f29585z0 = charSequence;
        o4();
    }

    protected void u4() {
    }

    protected void v4(CharSequence charSequence, int i10) {
    }
}
