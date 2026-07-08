package e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class i extends w7.a {
    public static final Parcelable.Creator<i> CREATOR = new l();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f11699a;

    i(List list) {
        this.f11699a = list;
    }

    public List b() {
        return this.f11699a;
    }

    public boolean equals(Object obj) {
        List list;
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        List list2 = this.f11699a;
        if (list2 == null && iVar.f11699a == null) {
            return true;
        }
        return list2 != null && (list = iVar.f11699a) != null && list2.containsAll(list) && iVar.f11699a.containsAll(this.f11699a);
    }

    public int hashCode() {
        return v7.o.b(new HashSet(this.f11699a));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.v(parcel, 1, b(), false);
        w7.c.b(parcel, iA);
    }
}
