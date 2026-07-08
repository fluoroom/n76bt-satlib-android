package d5;

import android.location.Location;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f10599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f10600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f10602d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f10603e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Integer f10604f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10605g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f10606h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f10607i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f10608j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f10609k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f10610l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f10611m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f10612n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f10613o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f10614p;

    c() {
    }

    public Location a() {
        if (this.f10602d == Double.MAX_VALUE || this.f10603e == Double.MAX_VALUE) {
            return null;
        }
        Location location = new Location("");
        location.setLatitude(this.f10602d);
        location.setLongitude(this.f10603e);
        return location;
    }

    public String b() {
        if (TextUtils.isEmpty(this.f10599a) && TextUtils.isEmpty(this.f10600b)) {
            if (TextUtils.isEmpty(this.f10601c)) {
                return null;
            }
            return "(" + this.f10601c + ")";
        }
        if (TextUtils.isEmpty(this.f10601c)) {
            if (TextUtils.isEmpty(this.f10600b)) {
                return this.f10599a;
            }
            return this.f10599a + " > " + this.f10600b;
        }
        return this.f10599a + " > " + this.f10600b + " (" + this.f10601c + ")";
    }

    public String c() {
        if (this.f10606h == 0.0f) {
            if (this.f10605g == 0) {
                return null;
            }
            return this.f10605g + "°";
        }
        if (this.f10605g == 0) {
            return d();
        }
        return d() + " | " + this.f10605g + "°";
    }

    public String d() {
        return o5.h.m(this.f10606h);
    }

    public boolean e() {
        return (this.f10602d == Double.MAX_VALUE || this.f10603e == Double.MAX_VALUE) ? false : true;
    }
}
