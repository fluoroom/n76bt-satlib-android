package b3;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import c3.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends i implements b.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Animatable f3664h;

    public e(ImageView imageView) {
        super(imageView);
    }

    private void p(Object obj) {
        if (!(obj instanceof Animatable)) {
            this.f3664h = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f3664h = animatable;
        animatable.start();
    }

    private void s(Object obj) {
        r(obj);
        p(obj);
    }

    @Override // b3.h
    public void a(Object obj, c3.b bVar) {
        if (bVar == null || !bVar.a(obj, this)) {
            s(obj);
        } else {
            p(obj);
        }
    }

    @Override // x2.l
    public void b() {
        Animatable animatable = this.f3664h;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // b3.a, b3.h
    public void e(Drawable drawable) {
        super.e(drawable);
        s(null);
        q(drawable);
    }

    @Override // x2.l
    public void g() {
        Animatable animatable = this.f3664h;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // b3.i, b3.a, b3.h
    public void h(Drawable drawable) {
        super.h(drawable);
        s(null);
        q(drawable);
    }

    @Override // b3.i, b3.a, b3.h
    public void k(Drawable drawable) {
        super.k(drawable);
        Animatable animatable = this.f3664h;
        if (animatable != null) {
            animatable.stop();
        }
        s(null);
        q(drawable);
    }

    public void q(Drawable drawable) {
        ((ImageView) this.f3667a).setImageDrawable(drawable);
    }

    protected abstract void r(Object obj);
}
