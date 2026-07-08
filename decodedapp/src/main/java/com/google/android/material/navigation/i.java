package com.google.android.material.navigation;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.s;

/* JADX INFO: loaded from: classes3.dex */
public class i implements n {

    /* JADX INFO: renamed from: a */
    private h f8122a;

    /* JADX INFO: renamed from: b */
    private boolean f8123b = false;

    /* JADX INFO: renamed from: c */
    private int f8124c;

    static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0121a();

        /* JADX INFO: renamed from: a */
        int f8125a;

        /* JADX INFO: renamed from: b */
        com.google.android.material.internal.g f8126b;

        /* JADX INFO: renamed from: com.google.android.material.navigation.i$a$a */
        class C0121a implements Parcelable.Creator {
            C0121a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        a() {
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f8125a);
            parcel.writeParcelable(this.f8126b, 0);
        }

        a(Parcel parcel) {
            this.f8125a = parcel.readInt();
            this.f8126b = (com.google.android.material.internal.g) parcel.readParcelable(getClass().getClassLoader());
        }
    }

    public void a(int i10) {
        this.f8124c = i10;
    }

    public void b(h hVar) {
        this.f8122a = hVar;
    }

    public void c(boolean z10) {
        this.f8123b = z10;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean collapseItemActionView(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean expandItemActionView(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean flagActionItems() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f8124c;
    }

    @Override // androidx.appcompat.view.menu.n
    public void initForMenu(Context context, androidx.appcompat.view.menu.h hVar) {
        this.f8122a.initialize(hVar);
    }

    @Override // androidx.appcompat.view.menu.n
    public void onCloseMenu(androidx.appcompat.view.menu.h hVar, boolean z10) {
    }

    @Override // androidx.appcompat.view.menu.n
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof a) {
            a aVar = (a) parcelable;
            this.f8122a.o(aVar.f8125a);
            this.f8122a.m(w8.d.c(this.f8122a.getContext(), aVar.f8126b));
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable onSaveInstanceState() {
        a aVar = new a();
        aVar.f8125a = this.f8122a.getSelectedItemId();
        aVar.f8126b = w8.d.d(this.f8122a.getBadgeDrawables());
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean onSubMenuSelected(s sVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public void updateMenuView(boolean z10) {
        if (this.f8123b) {
            return;
        }
        if (z10) {
            this.f8122a.c();
        } else {
            this.f8122a.p();
        }
    }
}
