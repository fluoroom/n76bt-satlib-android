package v7;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: loaded from: classes.dex */
public final class i1 implements Parcelable.Creator {
    static void a(g gVar, Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, gVar.f30391a);
        w7.c.k(parcel, 2, gVar.f30392b);
        w7.c.k(parcel, 3, gVar.f30393c);
        w7.c.r(parcel, 4, gVar.f30394d, false);
        w7.c.j(parcel, 5, gVar.f30395e, false);
        w7.c.u(parcel, 6, gVar.f30396f, i10, false);
        w7.c.d(parcel, 7, gVar.f30397g, false);
        w7.c.p(parcel, 8, gVar.f30398h, i10, false);
        w7.c.u(parcel, 10, gVar.f30399r, i10, false);
        w7.c.u(parcel, 11, gVar.f30400s, i10, false);
        w7.c.c(parcel, 12, gVar.f30401t);
        w7.c.k(parcel, 13, gVar.f30402u);
        w7.c.c(parcel, 14, gVar.f30403v);
        w7.c.r(parcel, 15, gVar.b(), false);
        w7.c.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iZ = w7.b.z(parcel);
        Scope[] scopeArr = g.f30389x;
        Bundle bundle = new Bundle();
        s7.c[] cVarArr = g.f30390y;
        s7.c[] cVarArr2 = cVarArr;
        String strE = null;
        IBinder iBinderR = null;
        Account account = null;
        String strE2 = null;
        int iS = 0;
        int iS2 = 0;
        int iS3 = 0;
        boolean zL = false;
        int iS4 = 0;
        boolean zL2 = false;
        while (parcel.dataPosition() < iZ) {
            int iQ = w7.b.q(parcel);
            switch (w7.b.k(iQ)) {
                case 1:
                    iS = w7.b.s(parcel, iQ);
                    break;
                case 2:
                    iS2 = w7.b.s(parcel, iQ);
                    break;
                case 3:
                    iS3 = w7.b.s(parcel, iQ);
                    break;
                case 4:
                    strE = w7.b.e(parcel, iQ);
                    break;
                case 5:
                    iBinderR = w7.b.r(parcel, iQ);
                    break;
                case 6:
                    scopeArr = (Scope[]) w7.b.h(parcel, iQ, Scope.CREATOR);
                    break;
                case 7:
                    bundle = w7.b.a(parcel, iQ);
                    break;
                case 8:
                    account = (Account) w7.b.d(parcel, iQ, Account.CREATOR);
                    break;
                case 9:
                default:
                    w7.b.y(parcel, iQ);
                    break;
                case 10:
                    cVarArr = (s7.c[]) w7.b.h(parcel, iQ, s7.c.CREATOR);
                    break;
                case 11:
                    cVarArr2 = (s7.c[]) w7.b.h(parcel, iQ, s7.c.CREATOR);
                    break;
                case 12:
                    zL = w7.b.l(parcel, iQ);
                    break;
                case 13:
                    iS4 = w7.b.s(parcel, iQ);
                    break;
                case 14:
                    zL2 = w7.b.l(parcel, iQ);
                    break;
                case 15:
                    strE2 = w7.b.e(parcel, iQ);
                    break;
            }
        }
        w7.b.j(parcel, iZ);
        return new g(iS, iS2, iS3, strE, iBinderR, scopeArr, bundle, account, cVarArr, cVarArr2, zL, iS4, zL2, strE2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new g[i10];
    }
}
