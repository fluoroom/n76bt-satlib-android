package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.a;
import android.support.v4.media.b;
import android.support.v4.media.session.MediaSessionCompat;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharSequence f697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CharSequence f698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Bitmap f699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Uri f700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Bundle f701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Uri f702h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Object f703r;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.b(android.support.v4.media.a.a(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i10) {
            return new MediaDescriptionCompat[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f704a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private CharSequence f705b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private CharSequence f706c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharSequence f707d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Bitmap f708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Uri f709f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Bundle f710g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Uri f711h;

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f704a, this.f705b, this.f706c, this.f707d, this.f708e, this.f709f, this.f710g, this.f711h);
        }

        public b b(CharSequence charSequence) {
            this.f707d = charSequence;
            return this;
        }

        public b c(Bundle bundle) {
            this.f710g = bundle;
            return this;
        }

        public b d(Bitmap bitmap) {
            this.f708e = bitmap;
            return this;
        }

        public b e(Uri uri) {
            this.f709f = uri;
            return this;
        }

        public b f(String str) {
            this.f704a = str;
            return this;
        }

        public b g(Uri uri) {
            this.f711h = uri;
            return this;
        }

        public b h(CharSequence charSequence) {
            this.f706c = charSequence;
            return this;
        }

        public b i(CharSequence charSequence) {
            this.f705b = charSequence;
            return this;
        }
    }

    MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f695a = str;
        this.f696b = charSequence;
        this.f697c = charSequence2;
        this.f698d = charSequence3;
        this.f699e = bitmap;
        this.f700f = uri;
        this.f701g = bundle;
        this.f702h = uri2;
    }

    public static MediaDescriptionCompat b(Object obj) {
        Uri uri;
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        int i10 = Build.VERSION.SDK_INT;
        b bVar = new b();
        bVar.f(android.support.v4.media.a.f(obj));
        bVar.i(android.support.v4.media.a.h(obj));
        bVar.h(android.support.v4.media.a.g(obj));
        bVar.b(android.support.v4.media.a.b(obj));
        bVar.d(android.support.v4.media.a.d(obj));
        bVar.e(android.support.v4.media.a.e(obj));
        Bundle bundleC = android.support.v4.media.a.c(obj);
        if (bundleC != null) {
            MediaSessionCompat.a(bundleC);
            uri = (Uri) bundleC.getParcelable("android.support.v4.media.description.MEDIA_URI");
        } else {
            uri = null;
        }
        if (uri == null) {
            bundle = bundleC;
        } else if (!bundleC.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") || bundleC.size() != 2) {
            bundleC.remove("android.support.v4.media.description.MEDIA_URI");
            bundleC.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
            bundle = bundleC;
        }
        bVar.c(bundle);
        if (uri != null) {
            bVar.g(uri);
        } else if (i10 >= 23) {
            bVar.g(android.support.v4.media.b.a(obj));
        }
        MediaDescriptionCompat mediaDescriptionCompatA = bVar.a();
        mediaDescriptionCompatA.f703r = obj;
        return mediaDescriptionCompatA;
    }

    public Object c() {
        Object obj = this.f703r;
        if (obj != null) {
            return obj;
        }
        int i10 = Build.VERSION.SDK_INT;
        Object objB = a.C0014a.b();
        a.C0014a.g(objB, this.f695a);
        a.C0014a.i(objB, this.f696b);
        a.C0014a.h(objB, this.f697c);
        a.C0014a.c(objB, this.f698d);
        a.C0014a.e(objB, this.f699e);
        a.C0014a.f(objB, this.f700f);
        Bundle bundle = this.f701g;
        if (i10 < 23 && this.f702h != null) {
            if (bundle == null) {
                bundle = new Bundle();
                bundle.putBoolean("android.support.v4.media.description.NULL_BUNDLE_FLAG", true);
            }
            bundle.putParcelable("android.support.v4.media.description.MEDIA_URI", this.f702h);
        }
        a.C0014a.d(objB, bundle);
        if (i10 >= 23) {
            b.a.a(objB, this.f702h);
        }
        Object objA = a.C0014a.a(objB);
        this.f703r = objA;
        return objA;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.f696b) + ", " + ((Object) this.f697c) + ", " + ((Object) this.f698d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        android.support.v4.media.a.i(c(), parcel, i10);
    }
}
