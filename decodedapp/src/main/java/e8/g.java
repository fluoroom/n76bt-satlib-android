package e8;

import android.os.Parcel;
import android.os.Parcelable;
import e8.g;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public enum g implements Parcelable {
    NOT_SUPPORTED_ERR(9),
    INVALID_STATE_ERR(11),
    SECURITY_ERR(18),
    NETWORK_ERR(19),
    ABORT_ERR(20),
    TIMEOUT_ERR(23),
    ENCODING_ERR(27),
    UNKNOWN_ERR(28),
    CONSTRAINT_ERR(29),
    DATA_ERR(30),
    NOT_ALLOWED_ERR(35),
    ATTESTATION_NOT_PRIVATE_ERR(36);

    public static final Parcelable.Creator<g> CREATOR = new Parcelable.Creator() { // from class: e8.w
        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
            try {
                return g.f(parcel.readInt());
            } catch (g.a e10) {
                throw new IllegalArgumentException(e10);
            }
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Object[] newArray(int i10) {
            return new g[i10];
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f11690a;

    public static class a extends Exception {
        public a(int i10) {
            super(String.format(Locale.US, "Error code %d is not supported", Integer.valueOf(i10)));
        }
    }

    g(int i10) {
        this.f11690a = i10;
    }

    public static g f(int i10) throws a {
        for (g gVar : values()) {
            if (i10 == gVar.f11690a) {
                return gVar;
            }
        }
        throw new a(i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f11690a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f11690a);
    }
}
