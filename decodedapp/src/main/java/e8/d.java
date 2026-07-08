package e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class d extends f {
    public static final Parcelable.Creator<d> CREATOR = new u();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f11670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f11671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f11672c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String[] f11673d;

    d(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.f11670a = (byte[]) v7.q.i(bArr);
        this.f11671b = (byte[]) v7.q.i(bArr2);
        this.f11672c = (byte[]) v7.q.i(bArr3);
        this.f11673d = (String[]) v7.q.i(strArr);
    }

    public byte[] b() {
        return this.f11672c;
    }

    public byte[] c() {
        return this.f11671b;
    }

    public byte[] e() {
        return this.f11670a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Arrays.equals(this.f11670a, dVar.f11670a) && Arrays.equals(this.f11671b, dVar.f11671b) && Arrays.equals(this.f11672c, dVar.f11672c);
    }

    public String[] f() {
        return this.f11673d;
    }

    public int hashCode() {
        return v7.o.b(Integer.valueOf(Arrays.hashCode(this.f11670a)), Integer.valueOf(Arrays.hashCode(this.f11671b)), Integer.valueOf(Arrays.hashCode(this.f11672c)));
    }

    public String toString() {
        j8.f fVarA = j8.g.a(this);
        j8.n nVarC = j8.n.c();
        byte[] bArr = this.f11670a;
        fVarA.b("keyHandle", nVarC.d(bArr, 0, bArr.length));
        j8.n nVarC2 = j8.n.c();
        byte[] bArr2 = this.f11671b;
        fVarA.b("clientDataJSON", nVarC2.d(bArr2, 0, bArr2.length));
        j8.n nVarC3 = j8.n.c();
        byte[] bArr3 = this.f11672c;
        fVarA.b("attestationObject", nVarC3.d(bArr3, 0, bArr3.length));
        fVarA.b("transports", Arrays.toString(this.f11673d));
        return fVarA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.f(parcel, 2, e(), false);
        w7.c.f(parcel, 3, c(), false);
        w7.c.f(parcel, 4, b(), false);
        w7.c.s(parcel, 5, f(), false);
        w7.c.b(parcel, iA);
    }
}
