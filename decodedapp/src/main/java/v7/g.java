package v7;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;
import v7.k;

/* JADX INFO: loaded from: classes.dex */
public class g extends w7.a {
    public static final Parcelable.Creator<g> CREATOR = new i1();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final Scope[] f30389x = new Scope[0];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final s7.c[] f30390y = new s7.c[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f30391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f30392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f30393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f30394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    IBinder f30395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Scope[] f30396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Bundle f30397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Account f30398h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    s7.c[] f30399r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    s7.c[] f30400s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final boolean f30401t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final int f30402u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    boolean f30403v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final String f30404w;

    g(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, s7.c[] cVarArr, s7.c[] cVarArr2, boolean z10, int i13, boolean z11, String str2) {
        scopeArr = scopeArr == null ? f30389x : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        cVarArr = cVarArr == null ? f30390y : cVarArr;
        cVarArr2 = cVarArr2 == null ? f30390y : cVarArr2;
        this.f30391a = i10;
        this.f30392b = i11;
        this.f30393c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f30394d = "com.google.android.gms";
        } else {
            this.f30394d = str;
        }
        if (i10 < 2) {
            this.f30398h = iBinder != null ? a.x(k.a.q(iBinder)) : null;
        } else {
            this.f30395e = iBinder;
            this.f30398h = account;
        }
        this.f30396f = scopeArr;
        this.f30397g = bundle;
        this.f30399r = cVarArr;
        this.f30400s = cVarArr2;
        this.f30401t = z10;
        this.f30402u = i13;
        this.f30403v = z11;
        this.f30404w = str2;
    }

    public String b() {
        return this.f30404w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        i1.a(this, parcel, i10);
    }
}
