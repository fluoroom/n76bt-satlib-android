package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import j$.util.Objects;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Parcelable {
    public static final Parcelable.Creator<a> CREATOR = new C0115a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f7719a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final m f7720b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final c f7721c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private m f7722d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f7723e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f7724f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f7725g;

    /* JADX INFO: renamed from: com.google.android.material.datepicker.a$a, reason: collision with other inner class name */
    class C0115a implements Parcelable.Creator {
        C0115a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a((m) parcel.readParcelable(m.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), (c) parcel.readParcelable(c.class.getClassLoader()), (m) parcel.readParcelable(m.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final long f7726f = u.a(m.f(1900, 0).f7807f);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final long f7727g = u.a(m.f(2100, 11).f7807f);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f7728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f7729b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Long f7730c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f7731d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private c f7732e;

        b(a aVar) {
            this.f7728a = f7726f;
            this.f7729b = f7727g;
            this.f7732e = f.b(Long.MIN_VALUE);
            this.f7728a = aVar.f7719a.f7807f;
            this.f7729b = aVar.f7720b.f7807f;
            this.f7730c = Long.valueOf(aVar.f7722d.f7807f);
            this.f7731d = aVar.f7723e;
            this.f7732e = aVar.f7721c;
        }

        public a a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.f7732e);
            m mVarG = m.g(this.f7728a);
            m mVarG2 = m.g(this.f7729b);
            c cVar = (c) bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY");
            Long l10 = this.f7730c;
            return new a(mVarG, mVarG2, cVar, l10 == null ? null : m.g(l10.longValue()), this.f7731d, null);
        }

        public b b(long j10) {
            this.f7730c = Long.valueOf(j10);
            return this;
        }
    }

    public interface c extends Parcelable {
        boolean a(long j10);
    }

    /* synthetic */ a(m mVar, m mVar2, c cVar, m mVar3, int i10, C0115a c0115a) {
        this(mVar, mVar2, cVar, mVar3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7719a.equals(aVar.f7719a) && this.f7720b.equals(aVar.f7720b) && l0.b.a(this.f7722d, aVar.f7722d) && this.f7723e == aVar.f7723e && this.f7721c.equals(aVar.f7721c);
    }

    public c h() {
        return this.f7721c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7719a, this.f7720b, this.f7722d, Integer.valueOf(this.f7723e), this.f7721c});
    }

    m i() {
        return this.f7720b;
    }

    int j() {
        return this.f7723e;
    }

    int k() {
        return this.f7725g;
    }

    m l() {
        return this.f7722d;
    }

    m m() {
        return this.f7719a;
    }

    int n() {
        return this.f7724f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f7719a, 0);
        parcel.writeParcelable(this.f7720b, 0);
        parcel.writeParcelable(this.f7722d, 0);
        parcel.writeParcelable(this.f7721c, 0);
        parcel.writeInt(this.f7723e);
    }

    private a(m mVar, m mVar2, c cVar, m mVar3, int i10) {
        Objects.requireNonNull(mVar, "start cannot be null");
        Objects.requireNonNull(mVar2, "end cannot be null");
        Objects.requireNonNull(cVar, "validator cannot be null");
        this.f7719a = mVar;
        this.f7720b = mVar2;
        this.f7722d = mVar3;
        this.f7723e = i10;
        this.f7721c = cVar;
        if (mVar3 != null && mVar.compareTo(mVar3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (mVar3 != null && mVar3.compareTo(mVar2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > u.k().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f7725g = mVar.q(mVar2) + 1;
        this.f7724f = (mVar2.f7804c - mVar.f7804c) + 1;
    }
}
