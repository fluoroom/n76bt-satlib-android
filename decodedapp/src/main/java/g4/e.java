package g4;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f13513a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f13514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected long f13515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13516d;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public e() {
        this.f13513a = 1;
        this.f13514b = 2;
        this.f13516d = 1 | this.f13516d;
    }

    public long b() {
        return this.f13515c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    protected void f() {
        this.f13516d &= -4;
    }

    protected void g() {
        this.f13516d &= -2;
    }

    protected void h() {
        this.f13516d |= 1;
    }

    public void i(long j10) {
        this.f13515c = j10;
        this.f13516d &= -2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f13515c);
        parcel.writeInt(this.f13516d);
    }

    public e(long j10) {
        this.f13513a = 1;
        this.f13514b = 2;
        this.f13515c = j10;
    }

    protected e(Parcel parcel) {
        this.f13513a = 1;
        this.f13514b = 2;
        this.f13515c = parcel.readLong();
        this.f13516d = parcel.readInt();
    }
}
