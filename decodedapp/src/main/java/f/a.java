package f;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class a implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f12732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f12733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f12731c = new b(null);
    public static final Parcelable.Creator<a> CREATOR = new C0175a();

    /* JADX INFO: renamed from: f.a$a, reason: collision with other inner class name */
    public static final class C0175a implements Parcelable.Creator {
        C0175a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            m.e(parcel, "parcel");
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final String a(int i10) {
            return i10 != -1 ? i10 != 0 ? String.valueOf(i10) : "RESULT_CANCELED" : "RESULT_OK";
        }

        private b() {
        }
    }

    public a(int i10, Intent intent) {
        this.f12732a = i10;
        this.f12733b = intent;
    }

    public final Intent b() {
        return this.f12733b;
    }

    public final int c() {
        return this.f12732a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f12731c.a(this.f12732a) + ", data=" + this.f12733b + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        m.e(parcel, "dest");
        parcel.writeInt(this.f12732a);
        parcel.writeInt(this.f12733b == null ? 0 : 1);
        Intent intent = this.f12733b;
        if (intent != null) {
            intent.writeToParcel(parcel, i10);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        m.e(parcel, "parcel");
    }
}
