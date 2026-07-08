package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.d0;
import androidx.lifecycle.m;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
final class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int[] f2159a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final ArrayList f2160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f2161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int[] f2162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f2163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final String f2164f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final int f2165g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final int f2166h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    final CharSequence f2167r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final int f2168s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final CharSequence f2169t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    final ArrayList f2170u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    final ArrayList f2171v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    final boolean f2172w;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    b(androidx.fragment.app.a aVar) {
        int size = aVar.f2192c.size();
        this.f2159a = new int[size * 6];
        if (!aVar.f2198i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2160b = new ArrayList(size);
        this.f2161c = new int[size];
        this.f2162d = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            d0.a aVar2 = (d0.a) aVar.f2192c.get(i11);
            int i12 = i10 + 1;
            this.f2159a[i10] = aVar2.f2209a;
            ArrayList arrayList = this.f2160b;
            o oVar = aVar2.f2210b;
            arrayList.add(oVar != null ? oVar.f2384f : null);
            int[] iArr = this.f2159a;
            iArr[i12] = aVar2.f2211c ? 1 : 0;
            iArr[i10 + 2] = aVar2.f2212d;
            iArr[i10 + 3] = aVar2.f2213e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar2.f2214f;
            i10 += 6;
            iArr[i13] = aVar2.f2215g;
            this.f2161c[i11] = aVar2.f2216h.ordinal();
            this.f2162d[i11] = aVar2.f2217i.ordinal();
        }
        this.f2163e = aVar.f2197h;
        this.f2164f = aVar.f2200k;
        this.f2165g = aVar.f2142v;
        this.f2166h = aVar.f2201l;
        this.f2167r = aVar.f2202m;
        this.f2168s = aVar.f2203n;
        this.f2169t = aVar.f2204o;
        this.f2170u = aVar.f2205p;
        this.f2171v = aVar.f2206q;
        this.f2172w = aVar.f2207r;
    }

    private void b(androidx.fragment.app.a aVar) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f2159a.length) {
                aVar.f2197h = this.f2163e;
                aVar.f2200k = this.f2164f;
                aVar.f2198i = true;
                aVar.f2201l = this.f2166h;
                aVar.f2202m = this.f2167r;
                aVar.f2203n = this.f2168s;
                aVar.f2204o = this.f2169t;
                aVar.f2205p = this.f2170u;
                aVar.f2206q = this.f2171v;
                aVar.f2207r = this.f2172w;
                return;
            }
            d0.a aVar2 = new d0.a();
            int i12 = i10 + 1;
            aVar2.f2209a = this.f2159a[i10];
            if (w.J0(2)) {
                Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i11 + " base fragment #" + this.f2159a[i12]);
            }
            aVar2.f2216h = m.b.values()[this.f2161c[i11]];
            aVar2.f2217i = m.b.values()[this.f2162d[i11]];
            int[] iArr = this.f2159a;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar2.f2211c = z10;
            int i14 = iArr[i13];
            aVar2.f2212d = i14;
            int i15 = iArr[i10 + 3];
            aVar2.f2213e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar2.f2214f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar2.f2215g = i18;
            aVar.f2193d = i14;
            aVar.f2194e = i15;
            aVar.f2195f = i17;
            aVar.f2196g = i18;
            aVar.f(aVar2);
            i11++;
        }
    }

    public androidx.fragment.app.a c(w wVar) {
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(wVar);
        b(aVar);
        aVar.f2142v = this.f2165g;
        for (int i10 = 0; i10 < this.f2160b.size(); i10++) {
            String str = (String) this.f2160b.get(i10);
            if (str != null) {
                ((d0.a) aVar.f2192c.get(i10)).f2210b = wVar.g0(str);
            }
        }
        aVar.u(1);
        return aVar;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f2159a);
        parcel.writeStringList(this.f2160b);
        parcel.writeIntArray(this.f2161c);
        parcel.writeIntArray(this.f2162d);
        parcel.writeInt(this.f2163e);
        parcel.writeString(this.f2164f);
        parcel.writeInt(this.f2165g);
        parcel.writeInt(this.f2166h);
        TextUtils.writeToParcel(this.f2167r, parcel, 0);
        parcel.writeInt(this.f2168s);
        TextUtils.writeToParcel(this.f2169t, parcel, 0);
        parcel.writeStringList(this.f2170u);
        parcel.writeStringList(this.f2171v);
        parcel.writeInt(this.f2172w ? 1 : 0);
    }

    b(Parcel parcel) {
        this.f2159a = parcel.createIntArray();
        this.f2160b = parcel.createStringArrayList();
        this.f2161c = parcel.createIntArray();
        this.f2162d = parcel.createIntArray();
        this.f2163e = parcel.readInt();
        this.f2164f = parcel.readString();
        this.f2165g = parcel.readInt();
        this.f2166h = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2167r = (CharSequence) creator.createFromParcel(parcel);
        this.f2168s = parcel.readInt();
        this.f2169t = (CharSequence) creator.createFromParcel(parcel);
        this.f2170u = parcel.createStringArrayList();
        this.f2171v = parcel.createStringArrayList();
        this.f2172w = parcel.readInt() != 0;
    }
}
