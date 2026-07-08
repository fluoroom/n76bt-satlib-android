package f;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class h implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final IntentSender f12757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Intent f12758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f12759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f12760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f12756e = new c(null);
    public static final Parcelable.Creator<h> CREATOR = new b();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final IntentSender f12761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Intent f12762b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f12763c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f12764d;

        public a(IntentSender intentSender) {
            m.e(intentSender, "intentSender");
            this.f12761a = intentSender;
        }

        public final h a() {
            return new h(this.f12761a, this.f12762b, this.f12763c, this.f12764d);
        }

        public final a b(Intent intent) {
            this.f12762b = intent;
            return this;
        }

        public final a c(int i10, int i11) {
            this.f12764d = i10;
            this.f12763c = i11;
            return this;
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public h createFromParcel(Parcel parcel) {
            m.e(parcel, "inParcel");
            return new h(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public h[] newArray(int i10) {
            return new h[i10];
        }
    }

    public static final class c {
        public /* synthetic */ c(rd.h hVar) {
            this();
        }

        private c() {
        }
    }

    public h(IntentSender intentSender, Intent intent, int i10, int i11) {
        m.e(intentSender, "intentSender");
        this.f12757a = intentSender;
        this.f12758b = intent;
        this.f12759c = i10;
        this.f12760d = i11;
    }

    public final Intent b() {
        return this.f12758b;
    }

    public final int c() {
        return this.f12759c;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f12760d;
    }

    public final IntentSender f() {
        return this.f12757a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        m.e(parcel, "dest");
        parcel.writeParcelable(this.f12757a, i10);
        parcel.writeParcelable(this.f12758b, i10);
        parcel.writeInt(this.f12759c);
        parcel.writeInt(this.f12760d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public h(Parcel parcel) {
        m.e(parcel, "parcel");
        Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        m.b(parcelable);
        this((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
    }
}
