package v4;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import d5.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class d0 implements Parcelable {
    public static final Parcelable.Creator<d0> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f29836a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a.d f29837b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ArrayList f29838c;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 createFromParcel(Parcel parcel) {
            return new d0(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d0[] newArray(int i10) {
            return new d0[i10];
        }
    }

    public d0(a.d dVar) {
        this.f29836a = a6.o.a();
        this.f29838c = a6.o.a();
        this.f29837b = dVar;
    }

    private void i(HashSet hashSet) {
        a.d dVar = this.f29837b;
        if (dVar != null) {
            hashSet.add(dVar);
        }
        Iterator it = this.f29838c.iterator();
        while (it.hasNext()) {
            ((d0) it.next()).i(hashSet);
        }
    }

    private boolean n(a.d dVar) {
        a.d dVar2 = this.f29837b;
        return dVar == dVar2 || dVar == null || dVar2 == null;
    }

    public static String o(CharSequence charSequence, Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(((d0) it.next()).p(charSequence));
        while (it.hasNext()) {
            sb2.append('\n');
            sb2.append(((d0) it.next()).p(charSequence));
        }
        return sb2.toString();
    }

    public d0 b(int i10, int i11) {
        this.f29836a.add(new b(i10, i11));
        return this;
    }

    public d0 c(d0 d0Var) {
        this.f29838c.add(d0Var);
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public d0 e(d0 d0Var) {
        return d0Var.l() ? this : c(d0Var);
    }

    public d0 f(a.d dVar) {
        d0 d0Var;
        if (dVar == null) {
            return this;
        }
        if (n(dVar)) {
            d0Var = new d0(this.f29837b);
            for (b bVar : this.f29836a) {
                d0Var.b(bVar.f29839a, bVar.f29840b);
            }
        } else {
            d0Var = new d0();
        }
        Iterator it = this.f29838c.iterator();
        while (it.hasNext()) {
            d0Var.e(((d0) it.next()).f(dVar));
        }
        return d0Var;
    }

    public int g(a.d dVar) {
        Iterator it = this.f29838c.iterator();
        int iMax = RtlSpacingHelper.UNDEFINED;
        while (it.hasNext()) {
            iMax = Math.max(iMax, ((d0) it.next()).g(dVar));
        }
        if (!n(dVar)) {
            return iMax;
        }
        Iterator it2 = this.f29836a.iterator();
        while (it2.hasNext()) {
            iMax = Math.max(iMax, ((b) it2.next()).f29840b);
        }
        return iMax;
    }

    public int h(a.d dVar) {
        Iterator it = this.f29838c.iterator();
        int iMin = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        while (it.hasNext()) {
            iMin = Math.min(iMin, ((d0) it.next()).h(dVar));
        }
        if (!n(dVar)) {
            return iMin;
        }
        Iterator it2 = this.f29836a.iterator();
        while (it2.hasNext()) {
            iMin = Math.min(iMin, ((b) it2.next()).f29839a);
        }
        return iMin;
    }

    public a.d[] j() {
        HashSet hashSet = new HashSet();
        i(hashSet);
        return (a.d[]) hashSet.toArray(new a.d[0]);
    }

    public int k(int i10, int i11, a.d dVar) {
        a.d dVar2 = this.f29837b;
        int iB = 0;
        if (dVar == dVar2 || dVar == null || dVar2 == null) {
            Iterator it = this.f29836a.iterator();
            while (it.hasNext()) {
                iB |= ((b) it.next()).b(i10, i11);
            }
        }
        Iterator it2 = this.f29838c.iterator();
        while (it2.hasNext()) {
            iB |= ((d0) it2.next()).k(i10, i11, dVar);
        }
        return iB;
    }

    public boolean l() {
        Iterator it = this.f29836a.iterator();
        while (it.hasNext()) {
            if (!((b) it.next()).c()) {
                return false;
            }
        }
        Iterator it2 = this.f29838c.iterator();
        while (it2.hasNext()) {
            if (!((d0) it2.next()).l()) {
                return false;
            }
        }
        return true;
    }

    public boolean m(int i10, a.d dVar) {
        a.d dVar2 = this.f29837b;
        if (dVar == dVar2 || dVar == null || dVar2 == null) {
            Iterator it = this.f29836a.iterator();
            while (it.hasNext()) {
                if (((b) it.next()).e(i10)) {
                    return true;
                }
            }
        }
        Iterator it2 = this.f29838c.iterator();
        while (it2.hasNext()) {
            if (((d0) it2.next()).m(i10, dVar)) {
                return true;
            }
        }
        return false;
    }

    public String p(CharSequence charSequence) {
        String strO = o(charSequence, this.f29838c);
        if (this.f29836a.size() == 0) {
            return strO;
        }
        ArrayList arrayListA = a6.o.a();
        if (this.f29837b == null || charSequence.toString().indexOf(10) >= 0) {
            if (this.f29837b != null) {
                arrayListA.add(this.f29837b + " ");
            }
            arrayListA.add(TextUtils.join(charSequence, this.f29836a));
        } else {
            arrayListA.add(this.f29837b + " " + TextUtils.join(charSequence, this.f29836a));
        }
        if (!strO.isEmpty()) {
            arrayListA.add(strO);
        }
        return TextUtils.join(charSequence, arrayListA);
    }

    public String toString() {
        return p("\n");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeTypedList(this.f29836a);
        parcel.writeTypedList(this.f29838c);
        parcel.writeSerializable(this.f29837b);
    }

    private static class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f29839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29840b;

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

        b(int i10, int i11) {
            this.f29839a = i10;
            this.f29840b = i11;
        }

        public int b(int i10, int i11) {
            return a6.p.e(this.f29839a, this.f29840b, i10, i11);
        }

        public boolean c() {
            return this.f29839a >= this.f29840b;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        boolean e(int i10) {
            return this.f29839a <= i10 && i10 <= this.f29840b;
        }

        public String toString() {
            return String.format(Locale.getDefault(), "%.0fMHz~%.0fMHz", Float.valueOf(this.f29839a / 1000000.0f), Float.valueOf(this.f29840b / 1000000.0f));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f29839a);
            parcel.writeInt(this.f29840b);
        }

        protected b(Parcel parcel) {
            this.f29839a = parcel.readInt();
            this.f29840b = parcel.readInt();
        }
    }

    public d0() {
        this((a.d) null);
    }

    protected d0(Parcel parcel) {
        this.f29836a = parcel.createTypedArrayList(b.CREATOR);
        this.f29838c = parcel.createTypedArrayList(CREATOR);
        this.f29837b = (a.d) parcel.readSerializable();
    }
}
