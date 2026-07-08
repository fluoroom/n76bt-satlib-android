package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import t7.d;
import t7.k;
import v7.o;
import w7.c;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends w7.a implements k, ReflectedParcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f7199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PendingIntent f7201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final s7.a f7202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Status f7191e = new Status(-1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Status f7192f = new Status(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Status f7193g = new Status(14);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Status f7194h = new Status(8);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final Status f7195r = new Status(15);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final Status f7196s = new Status(16);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final Status f7198u = new Status(17);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Status f7197t = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new b();

    Status(int i10, String str, PendingIntent pendingIntent, s7.a aVar) {
        this.f7199a = i10;
        this.f7200b = str;
        this.f7201c = pendingIntent;
        this.f7202d = aVar;
    }

    public s7.a b() {
        return this.f7202d;
    }

    public int c() {
        return this.f7199a;
    }

    public String e() {
        return this.f7200b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f7199a == status.f7199a && o.a(this.f7200b, status.f7200b) && o.a(this.f7201c, status.f7201c) && o.a(this.f7202d, status.f7202d);
    }

    public boolean f() {
        return this.f7201c != null;
    }

    public boolean g() {
        return this.f7199a <= 0;
    }

    @Override // t7.k
    public Status getStatus() {
        return this;
    }

    public final String h() {
        String str = this.f7200b;
        return str != null ? str : d.a(this.f7199a);
    }

    public int hashCode() {
        return o.b(Integer.valueOf(this.f7199a), this.f7200b, this.f7201c, this.f7202d);
    }

    public String toString() {
        o.a aVarC = o.c(this);
        aVarC.a("statusCode", h());
        aVarC.a("resolution", this.f7201c);
        return aVarC.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int iA = c.a(parcel);
        c.k(parcel, 1, c());
        c.r(parcel, 2, e(), false);
        c.p(parcel, 3, this.f7201c, i10, false);
        c.p(parcel, 4, b(), i10, false);
        c.b(parcel, iA);
    }

    public Status(int i10) {
        this(i10, (String) null);
    }

    public Status(s7.a aVar, String str) {
        this(aVar, str, 17);
    }

    public Status(int i10, String str) {
        this(i10, str, (PendingIntent) null);
    }

    public Status(s7.a aVar, String str, int i10) {
        this(i10, str, aVar.e(), aVar);
    }

    public Status(int i10, String str, PendingIntent pendingIntent) {
        this(i10, str, pendingIntent, null);
    }
}
