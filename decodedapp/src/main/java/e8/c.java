package e8;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class c extends f {
    public static final Parcelable.Creator<c> CREATOR = new t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f11665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f11666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte[] f11667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f11668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f11669e;

    c(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.f11665a = (byte[]) v7.q.i(bArr);
        this.f11666b = (byte[]) v7.q.i(bArr2);
        this.f11667c = (byte[]) v7.q.i(bArr3);
        this.f11668d = (byte[]) v7.q.i(bArr4);
        this.f11669e = bArr5;
    }

    public byte[] b() {
        return this.f11667c;
    }

    public byte[] c() {
        return this.f11666b;
    }

    public byte[] e() {
        return this.f11665a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Arrays.equals(this.f11665a, cVar.f11665a) && Arrays.equals(this.f11666b, cVar.f11666b) && Arrays.equals(this.f11667c, cVar.f11667c) && Arrays.equals(this.f11668d, cVar.f11668d) && Arrays.equals(this.f11669e, cVar.f11669e);
    }

    public byte[] f() {
        return this.f11668d;
    }

    public byte[] g() {
        return this.f11669e;
    }

    public int hashCode() {
        return v7.o.b(Integer.valueOf(Arrays.hashCode(this.f11665a)), Integer.valueOf(Arrays.hashCode(this.f11666b)), Integer.valueOf(Arrays.hashCode(this.f11667c)), Integer.valueOf(Arrays.hashCode(this.f11668d)), Integer.valueOf(Arrays.hashCode(this.f11669e)));
    }

    public String toString() {
        j8.f fVarA = j8.g.a(this);
        j8.n nVarC = j8.n.c();
        byte[] bArr = this.f11665a;
        fVarA.b("keyHandle", nVarC.d(bArr, 0, bArr.length));
        j8.n nVarC2 = j8.n.c();
        byte[] bArr2 = this.f11666b;
        fVarA.b("clientDataJSON", nVarC2.d(bArr2, 0, bArr2.length));
        j8.n nVarC3 = j8.n.c();
        byte[] bArr3 = this.f11667c;
        fVarA.b("authenticatorData", nVarC3.d(bArr3, 0, bArr3.length));
        j8.n nVarC4 = j8.n.c();
        byte[] bArr4 = this.f11668d;
        fVarA.b("signature", nVarC4.d(bArr4, 0, bArr4.length));
        byte[] bArr5 = this.f11669e;
        if (bArr5 != null) {
            fVarA.b("userHandle", j8.n.c().d(bArr5, 0, bArr5.length));
        }
        return fVarA.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.f(parcel, 2, e(), false);
        w7.c.f(parcel, 3, c(), false);
        w7.c.f(parcel, 4, b(), false);
        w7.c.f(parcel, 5, f(), false);
        w7.c.f(parcel, 6, g(), false);
        w7.c.b(parcel, iA);
    }
}
