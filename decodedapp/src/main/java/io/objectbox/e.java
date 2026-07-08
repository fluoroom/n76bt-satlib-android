package io.objectbox;

import io.objectbox.exception.DbException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yb.b f17382a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f17383b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17384c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class f17385d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f17386e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17387f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f17388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f17389h;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Class f17390r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Class f17391s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f17392t;

    public e(yb.b bVar, int i10, int i11, Class cls, String str) {
        this(bVar, i10, i11, cls, str, false, str, null, null);
    }

    public int a() {
        int i10 = this.f17384c;
        if (i10 > 0) {
            return i10;
        }
        throw new IllegalStateException("Illegal property ID " + this.f17384c + " for " + this);
    }

    boolean b() {
        return this.f17392t;
    }

    void c(int i10) {
        int i11 = this.f17384c;
        if (i11 <= 0) {
            throw new IllegalStateException("Illegal property ID " + this.f17384c + " for " + this);
        }
        if (i11 == i10) {
            this.f17392t = true;
            return;
        }
        throw new DbException(this + " does not match ID in DB: " + i10);
    }

    public String toString() {
        return "Property \"" + this.f17386e + "\" (ID: " + this.f17384c + ")";
    }

    public e(yb.b bVar, int i10, int i11, Class cls, String str, boolean z10, String str2) {
        this(bVar, i10, i11, cls, str, z10, str2, null, null);
    }

    public e(yb.b bVar, int i10, int i11, Class cls, String str, boolean z10, String str2, Class cls2, Class cls3) {
        this(bVar, i10, i11, cls, str, z10, false, str2, cls2, cls3);
    }

    public e(yb.b bVar, int i10, int i11, Class cls, String str, boolean z10, boolean z11, String str2, Class cls2, Class cls3) {
        this.f17382a = bVar;
        this.f17383b = i10;
        this.f17384c = i11;
        this.f17385d = cls;
        this.f17386e = str;
        this.f17387f = z10;
        this.f17388g = z11;
        this.f17389h = str2;
        this.f17390r = cls2;
        this.f17391s = cls3;
    }
}
