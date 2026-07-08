package v3;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ArrayList f29616a = a6.o.a();

    public void a() {
        if (this.f29616a.size() <= 0) {
            this.f29616a.clear();
        } else {
            android.support.v4.media.session.b.a(this.f29616a.get(0));
            throw null;
        }
    }

    public void b(int i10) {
        if (i10 == 0) {
            d();
        } else {
            c();
        }
    }

    protected void c() {
        if (this.f29616a.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f29616a.get(0));
        throw null;
    }

    public void d() {
        if (this.f29616a.size() <= 0) {
            return;
        }
        android.support.v4.media.session.b.a(this.f29616a.get(0));
        throw null;
    }
}
