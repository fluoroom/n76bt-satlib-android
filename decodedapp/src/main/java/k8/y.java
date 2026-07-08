package k8;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class y extends w7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f19529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f19530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f19531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f19533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final y f19534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final o f19528g = new o(null);
    public static final Parcelable.Creator<y> CREATOR = new r0();

    static {
        Process.myUid();
        Process.myPid();
    }

    public y(int i10, String str, String str2, String str3, List list, y yVar) {
        rd.m.e(str, "packageName");
        if (yVar != null && yVar.b()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.f19529a = i10;
        this.f19530b = str;
        this.f19531c = str2;
        this.f19532d = str3 == null ? yVar != null ? yVar.f19532d : null : str3;
        if (list == null) {
            list = yVar != null ? yVar.f19533e : null;
            if (list == null) {
                list = o0.i();
                rd.m.d(list, "of(...)");
            }
        }
        rd.m.e(list, "<this>");
        o0 o0VarJ = o0.j(list);
        rd.m.d(o0VarJ, "copyOf(...)");
        this.f19533e = o0VarJ;
        this.f19534f = yVar;
    }

    public final boolean b() {
        return this.f19534f != null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof y) {
            y yVar = (y) obj;
            if (this.f19529a == yVar.f19529a && rd.m.a(this.f19530b, yVar.f19530b) && rd.m.a(this.f19531c, yVar.f19531c) && rd.m.a(this.f19532d, yVar.f19532d) && rd.m.a(this.f19534f, yVar.f19534f) && rd.m.a(this.f19533e, yVar.f19533e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f19529a), this.f19530b, this.f19531c, this.f19532d, this.f19534f});
    }

    public final String toString() {
        int length = this.f19530b.length() + 18;
        String str = this.f19531c;
        StringBuilder sb2 = new StringBuilder(length + (str != null ? str.length() : 0));
        sb2.append(this.f19529a);
        sb2.append("/");
        sb2.append(this.f19530b);
        String str2 = this.f19531c;
        if (str2 != null) {
            sb2.append("[");
            if (rg.q.J(str2, this.f19530b, false, 2, null)) {
                sb2.append((CharSequence) str2, this.f19530b.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append("]");
        }
        if (this.f19532d != null) {
            sb2.append("/");
            String str3 = this.f19532d;
            sb2.append(Integer.toHexString(str3 != null ? str3.hashCode() : 0));
        }
        String string = sb2.toString();
        rd.m.d(string, "toString(...)");
        return string;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        rd.m.e(parcel, "dest");
        int i11 = this.f19529a;
        int iA = w7.c.a(parcel);
        w7.c.k(parcel, 1, i11);
        w7.c.r(parcel, 3, this.f19530b, false);
        w7.c.r(parcel, 4, this.f19531c, false);
        w7.c.r(parcel, 6, this.f19532d, false);
        w7.c.p(parcel, 7, this.f19534f, i10, false);
        w7.c.v(parcel, 8, this.f19533e, false);
        w7.c.b(parcel, iA);
    }
}
