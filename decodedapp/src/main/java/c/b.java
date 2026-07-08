package c;

import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import c.a;

/* JADX INFO: loaded from: classes.dex */
public class b implements Parcelable {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f4212a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Handler f4213b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    c.a f4214c;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* JADX INFO: renamed from: c.b$b, reason: collision with other inner class name */
    class BinderC0063b extends a.AbstractBinderC0061a {
        BinderC0063b() {
        }

        @Override // c.a
        public void r1(int i10, Bundle bundle) {
            b bVar = b.this;
            Handler handler = bVar.f4213b;
            if (handler != null) {
                handler.post(bVar.new c(i10, bundle));
            } else {
                bVar.b(i10, bundle);
            }
        }
    }

    class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f4216a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Bundle f4217b;

        c(int i10, Bundle bundle) {
            this.f4216a = i10;
            this.f4217b = bundle;
        }

        @Override // java.lang.Runnable
        public void run() {
            b.this.b(this.f4216a, this.f4217b);
        }
    }

    b(Parcel parcel) {
        this.f4214c = a.AbstractBinderC0061a.j(parcel.readStrongBinder());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        synchronized (this) {
            try {
                if (this.f4214c == null) {
                    this.f4214c = new BinderC0063b();
                }
                parcel.writeStrongBinder(this.f4214c.asBinder());
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    protected void b(int i10, Bundle bundle) {
    }
}
