package q8;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class t extends w7.a {
    public static final Parcelable.Creator<t> CREATOR = new b0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f24465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f24466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f24467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f24468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final s f24469e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private float f24470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f24471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f24472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f24473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private s f24474e;

        public a(t tVar) {
            this.f24470a = tVar.e();
            Pair pairF = tVar.f();
            this.f24471b = ((Integer) pairF.first).intValue();
            this.f24472c = ((Integer) pairF.second).intValue();
            this.f24473d = tVar.c();
            this.f24474e = tVar.b();
        }

        public t a() {
            return new t(this.f24470a, this.f24471b, this.f24472c, this.f24473d, this.f24474e);
        }

        public final a b(boolean z10) {
            this.f24473d = z10;
            return this;
        }

        public final a c(float f10) {
            this.f24470a = f10;
            return this;
        }
    }

    t(float f10, int i10, int i11, boolean z10, s sVar) {
        this.f24465a = f10;
        this.f24466b = i10;
        this.f24467c = i11;
        this.f24468d = z10;
        this.f24469e = sVar;
    }

    public s b() {
        return this.f24469e;
    }

    public boolean c() {
        return this.f24468d;
    }

    public final float e() {
        return this.f24465a;
    }

    public final Pair f() {
        return new Pair(Integer.valueOf(this.f24466b), Integer.valueOf(this.f24467c));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = w7.c.a(parcel);
        w7.c.h(parcel, 2, this.f24465a);
        w7.c.k(parcel, 3, this.f24466b);
        w7.c.k(parcel, 4, this.f24467c);
        w7.c.c(parcel, 5, c());
        w7.c.p(parcel, 6, b(), i10, false);
        w7.c.b(parcel, iA);
    }
}
