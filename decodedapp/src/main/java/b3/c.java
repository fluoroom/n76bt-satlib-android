package b3;

import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.RtlSpacingHelper;
import e3.l;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a3.c f3663c;

    public c() {
        this(RtlSpacingHelper.UNDEFINED, RtlSpacingHelper.UNDEFINED);
    }

    @Override // b3.h
    public final void c(a3.c cVar) {
        this.f3663c = cVar;
    }

    @Override // b3.h
    public final void d(g gVar) {
        gVar.f(this.f3661a, this.f3662b);
    }

    @Override // b3.h
    public final a3.c j() {
        return this.f3663c;
    }

    public c(int i10, int i11) {
        if (l.t(i10, i11)) {
            this.f3661a = i10;
            this.f3662b = i11;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i10 + " and height: " + i11);
    }

    @Override // x2.l
    public void b() {
    }

    @Override // x2.l
    public void f() {
    }

    @Override // x2.l
    public void g() {
    }

    @Override // b3.h
    public void e(Drawable drawable) {
    }

    @Override // b3.h
    public void h(Drawable drawable) {
    }

    @Override // b3.h
    public final void i(g gVar) {
    }
}
