package v8;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;

/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f30504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f30505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TimeInterpolator f30506c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f30507d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f30508e;

    public g(long j10, long j11) {
        this.f30506c = null;
        this.f30507d = 0;
        this.f30508e = 1;
        this.f30504a = j10;
        this.f30505b = j11;
    }

    static g b(ValueAnimator valueAnimator) {
        g gVar = new g(valueAnimator.getStartDelay(), valueAnimator.getDuration(), valueAnimator.getInterpolator());
        gVar.f30507d = valueAnimator.getRepeatCount();
        gVar.f30508e = valueAnimator.getRepeatMode();
        return gVar;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(f());
            valueAnimator.setRepeatMode(g());
        }
    }

    public long c() {
        return this.f30504a;
    }

    public long d() {
        return this.f30505b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f30506c;
        return timeInterpolator != null ? timeInterpolator : a.f30493b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (c() == gVar.c() && d() == gVar.d() && f() == gVar.f() && g() == gVar.g()) {
            return e().getClass().equals(gVar.e().getClass());
        }
        return false;
    }

    public int f() {
        return this.f30507d;
    }

    public int g() {
        return this.f30508e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + f()) * 31) + g();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + f() + " repeatMode: " + g() + "}\n";
    }

    public g(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f30507d = 0;
        this.f30508e = 1;
        this.f30504a = j10;
        this.f30505b = j11;
        this.f30506c = timeInterpolator;
    }
}
