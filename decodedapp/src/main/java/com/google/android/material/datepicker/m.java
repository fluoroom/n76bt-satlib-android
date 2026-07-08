package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: loaded from: classes3.dex */
final class m implements Comparable, Parcelable {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Calendar f7802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f7803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f7804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f7805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f7806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final long f7807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f7808g;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return m.f(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    private m(Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarC = u.c(calendar);
        this.f7802a = calendarC;
        this.f7803b = calendarC.get(2);
        this.f7804c = calendarC.get(1);
        this.f7805d = calendarC.getMaximum(7);
        this.f7806e = calendarC.getActualMaximum(5);
        this.f7807f = calendarC.getTimeInMillis();
    }

    static m f(int i10, int i11) {
        Calendar calendarK = u.k();
        calendarK.set(1, i10);
        calendarK.set(2, i11);
        return new m(calendarK);
    }

    static m g(long j10) {
        Calendar calendarK = u.k();
        calendarK.setTimeInMillis(j10);
        return new m(calendarK);
    }

    static m h() {
        return new m(u.i());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public int compareTo(m mVar) {
        return this.f7802a.compareTo(mVar.f7802a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.f7803b == mVar.f7803b && this.f7804c == mVar.f7804c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f7803b), Integer.valueOf(this.f7804c)});
    }

    int i(int i10) {
        int i11 = this.f7802a.get(7);
        if (i10 <= 0) {
            i10 = this.f7802a.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f7805d : i12;
    }

    long j(int i10) {
        Calendar calendarC = u.c(this.f7802a);
        calendarC.set(5, i10);
        return calendarC.getTimeInMillis();
    }

    int k(long j10) {
        Calendar calendarC = u.c(this.f7802a);
        calendarC.setTimeInMillis(j10);
        return calendarC.get(5);
    }

    String l() {
        if (this.f7808g == null) {
            this.f7808g = e.f(this.f7802a.getTimeInMillis());
        }
        return this.f7808g;
    }

    long m() {
        return this.f7802a.getTimeInMillis();
    }

    m n(int i10) {
        Calendar calendarC = u.c(this.f7802a);
        calendarC.add(2, i10);
        return new m(calendarC);
    }

    int q(m mVar) {
        if (this.f7802a instanceof GregorianCalendar) {
            return ((mVar.f7804c - this.f7804c) * 12) + (mVar.f7803b - this.f7803b);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f7804c);
        parcel.writeInt(this.f7803b);
    }
}
