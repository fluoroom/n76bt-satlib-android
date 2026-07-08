package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.m;

/* JADX INFO: loaded from: classes.dex */
final class a0 implements Parcelable {
    public static final Parcelable.Creator<a0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f2144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f2145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final boolean f2146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final boolean f2147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f2148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f2149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final String f2150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final boolean f2151h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final boolean f2152r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final boolean f2153s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final boolean f2154t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final int f2155u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final String f2156v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final int f2157w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    final boolean f2158x;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a0 createFromParcel(Parcel parcel) {
            return new a0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a0[] newArray(int i10) {
            return new a0[i10];
        }
    }

    a0(o oVar) {
        this.f2144a = oVar.getClass().getName();
        this.f2145b = oVar.f2384f;
        this.f2146c = oVar.f2402y;
        this.f2147d = oVar.A;
        this.f2148e = oVar.I;
        this.f2149f = oVar.J;
        this.f2150g = oVar.K;
        this.f2151h = oVar.N;
        this.f2152r = oVar.f2399v;
        this.f2153s = oVar.M;
        this.f2154t = oVar.L;
        this.f2155u = oVar.f2381d0.ordinal();
        this.f2156v = oVar.f2395r;
        this.f2157w = oVar.f2396s;
        this.f2158x = oVar.V;
    }

    o b(s sVar, ClassLoader classLoader) {
        o oVarA = sVar.a(classLoader, this.f2144a);
        oVarA.f2384f = this.f2145b;
        oVarA.f2402y = this.f2146c;
        oVarA.A = this.f2147d;
        oVarA.B = true;
        oVarA.I = this.f2148e;
        oVarA.J = this.f2149f;
        oVarA.K = this.f2150g;
        oVarA.N = this.f2151h;
        oVarA.f2399v = this.f2152r;
        oVarA.M = this.f2153s;
        oVarA.L = this.f2154t;
        oVarA.f2381d0 = m.b.values()[this.f2155u];
        oVarA.f2395r = this.f2156v;
        oVarA.f2396s = this.f2157w;
        oVarA.V = this.f2158x;
        return oVarA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f2144a);
        sb2.append(" (");
        sb2.append(this.f2145b);
        sb2.append(")}:");
        if (this.f2146c) {
            sb2.append(" fromLayout");
        }
        if (this.f2147d) {
            sb2.append(" dynamicContainer");
        }
        if (this.f2149f != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f2149f));
        }
        String str = this.f2150g;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f2150g);
        }
        if (this.f2151h) {
            sb2.append(" retainInstance");
        }
        if (this.f2152r) {
            sb2.append(" removing");
        }
        if (this.f2153s) {
            sb2.append(" detached");
        }
        if (this.f2154t) {
            sb2.append(" hidden");
        }
        if (this.f2156v != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f2156v);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f2157w);
        }
        if (this.f2158x) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f2144a);
        parcel.writeString(this.f2145b);
        parcel.writeInt(this.f2146c ? 1 : 0);
        parcel.writeInt(this.f2147d ? 1 : 0);
        parcel.writeInt(this.f2148e);
        parcel.writeInt(this.f2149f);
        parcel.writeString(this.f2150g);
        parcel.writeInt(this.f2151h ? 1 : 0);
        parcel.writeInt(this.f2152r ? 1 : 0);
        parcel.writeInt(this.f2153s ? 1 : 0);
        parcel.writeInt(this.f2154t ? 1 : 0);
        parcel.writeInt(this.f2155u);
        parcel.writeString(this.f2156v);
        parcel.writeInt(this.f2157w);
        parcel.writeInt(this.f2158x ? 1 : 0);
    }

    a0(Parcel parcel) {
        this.f2144a = parcel.readString();
        this.f2145b = parcel.readString();
        this.f2146c = parcel.readInt() != 0;
        this.f2147d = parcel.readInt() != 0;
        this.f2148e = parcel.readInt();
        this.f2149f = parcel.readInt();
        this.f2150g = parcel.readString();
        this.f2151h = parcel.readInt() != 0;
        this.f2152r = parcel.readInt() != 0;
        this.f2153s = parcel.readInt() != 0;
        this.f2154t = parcel.readInt() != 0;
        this.f2155u = parcel.readInt();
        this.f2156v = parcel.readString();
        this.f2157w = parcel.readInt();
        this.f2158x = parcel.readInt() != 0;
    }
}
