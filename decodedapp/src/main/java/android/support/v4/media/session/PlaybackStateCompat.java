package android.support.v4.media.session;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f734d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final long f735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final int f736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final CharSequence f737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final long f738h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    List f739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final long f740s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Bundle f741t;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final CharSequence f743b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f744c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Bundle f745d;

        static class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i10) {
                return new CustomAction[i10];
            }
        }

        CustomAction(Parcel parcel) {
            this.f742a = parcel.readString();
            this.f743b = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f744c = parcel.readInt();
            this.f745d = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f743b) + ", mIcon=" + this.f744c + ", mExtras=" + this.f745d;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeString(this.f742a);
            TextUtils.writeToParcel(this.f743b, parcel, i10);
            parcel.writeInt(this.f744c);
            parcel.writeBundle(this.f745d);
        }
    }

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i10) {
            return new PlaybackStateCompat[i10];
        }
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f731a = parcel.readInt();
        this.f732b = parcel.readLong();
        this.f734d = parcel.readFloat();
        this.f738h = parcel.readLong();
        this.f733c = parcel.readLong();
        this.f735e = parcel.readLong();
        this.f737g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f739r = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f740s = parcel.readLong();
        this.f741t = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f736f = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f731a + ", position=" + this.f732b + ", buffered position=" + this.f733c + ", speed=" + this.f734d + ", updated=" + this.f738h + ", actions=" + this.f735e + ", error code=" + this.f736f + ", error message=" + this.f737g + ", custom actions=" + this.f739r + ", active item id=" + this.f740s + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f731a);
        parcel.writeLong(this.f732b);
        parcel.writeFloat(this.f734d);
        parcel.writeLong(this.f738h);
        parcel.writeLong(this.f733c);
        parcel.writeLong(this.f735e);
        TextUtils.writeToParcel(this.f737g, parcel, i10);
        parcel.writeTypedList(this.f739r);
        parcel.writeLong(this.f740s);
        parcel.writeBundle(this.f741t);
        parcel.writeInt(this.f736f);
    }
}
