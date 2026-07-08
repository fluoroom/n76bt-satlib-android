package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;

/* JADX INFO: loaded from: classes.dex */
class b extends a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseIntArray f3574d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Parcel f3575e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f3576f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f3577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f3578h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f3579i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f3580j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f3581k;

    b(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new androidx.collection.a(), new androidx.collection.a(), new androidx.collection.a());
    }

    @Override // androidx.versionedparcelable.a
    public void A(byte[] bArr) {
        if (bArr == null) {
            this.f3575e.writeInt(-1);
        } else {
            this.f3575e.writeInt(bArr.length);
            this.f3575e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected void C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f3575e, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void E(int i10) {
        this.f3575e.writeInt(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void G(Parcelable parcelable) {
        this.f3575e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.a
    public void I(String str) {
        this.f3575e.writeString(str);
    }

    @Override // androidx.versionedparcelable.a
    public void a() {
        int i10 = this.f3579i;
        if (i10 >= 0) {
            int i11 = this.f3574d.get(i10);
            int iDataPosition = this.f3575e.dataPosition();
            this.f3575e.setDataPosition(i11);
            this.f3575e.writeInt(iDataPosition - i11);
            this.f3575e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.a
    protected a b() {
        Parcel parcel = this.f3575e;
        int iDataPosition = parcel.dataPosition();
        int i10 = this.f3580j;
        if (i10 == this.f3576f) {
            i10 = this.f3577g;
        }
        return new b(parcel, iDataPosition, i10, this.f3578h + "  ", this.f3571a, this.f3572b, this.f3573c);
    }

    @Override // androidx.versionedparcelable.a
    public boolean g() {
        return this.f3575e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.a
    public byte[] i() {
        int i10 = this.f3575e.readInt();
        if (i10 < 0) {
            return null;
        }
        byte[] bArr = new byte[i10];
        this.f3575e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.a
    protected CharSequence k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f3575e);
    }

    @Override // androidx.versionedparcelable.a
    public boolean m(int i10) {
        while (this.f3580j < this.f3577g) {
            int i11 = this.f3581k;
            if (i11 == i10) {
                return true;
            }
            if (String.valueOf(i11).compareTo(String.valueOf(i10)) > 0) {
                return false;
            }
            this.f3575e.setDataPosition(this.f3580j);
            int i12 = this.f3575e.readInt();
            this.f3581k = this.f3575e.readInt();
            this.f3580j += i12;
        }
        return this.f3581k == i10;
    }

    @Override // androidx.versionedparcelable.a
    public int o() {
        return this.f3575e.readInt();
    }

    @Override // androidx.versionedparcelable.a
    public Parcelable q() {
        return this.f3575e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.a
    public String s() {
        return this.f3575e.readString();
    }

    @Override // androidx.versionedparcelable.a
    public void w(int i10) {
        a();
        this.f3579i = i10;
        this.f3574d.put(i10, this.f3575e.dataPosition());
        E(0);
        E(i10);
    }

    @Override // androidx.versionedparcelable.a
    public void y(boolean z10) {
        this.f3575e.writeInt(z10 ? 1 : 0);
    }

    private b(Parcel parcel, int i10, int i11, String str, androidx.collection.a aVar, androidx.collection.a aVar2, androidx.collection.a aVar3) {
        super(aVar, aVar2, aVar3);
        this.f3574d = new SparseIntArray();
        this.f3579i = -1;
        this.f3581k = -1;
        this.f3575e = parcel;
        this.f3576f = i10;
        this.f3577g = i11;
        this.f3580j = i10;
        this.f3578h = str;
    }
}
