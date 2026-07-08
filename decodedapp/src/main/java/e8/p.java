package e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class p extends w7.a {
    public static final Parcelable.Creator<p> CREATOR = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f11703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f11704b;

    public p(byte[] bArr, byte[] bArr2) {
        this.f11703a = bArr;
        this.f11704b = bArr2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return Arrays.equals(this.f11703a, pVar.f11703a) && Arrays.equals(this.f11704b, pVar.f11704b);
    }

    public final int hashCode() {
        return v7.o.b(this.f11703a, this.f11704b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.f(parcel, 1, this.f11703a, false);
        w7.c.f(parcel, 2, this.f11704b, false);
        w7.c.b(parcel, iA);
    }
}
