package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import v7.q;
import w7.c;

/* JADX INFO: loaded from: classes.dex */
public final class Scope extends w7.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f7189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f7190b;

    Scope(int i10, String str) {
        q.g(str, "scopeUri must not be null or empty");
        this.f7189a = i10;
        this.f7190b = str;
    }

    public String b() {
        return this.f7190b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Scope) {
            return this.f7190b.equals(((Scope) obj).f7190b);
        }
        return false;
    }

    public int hashCode() {
        return this.f7190b.hashCode();
    }

    public String toString() {
        return this.f7190b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f7189a;
        int iA = c.a(parcel);
        c.k(parcel, 1, i11);
        c.r(parcel, 2, b(), false);
        c.b(parcel, iA);
    }

    public Scope(String str) {
        this(1, str);
    }
}
