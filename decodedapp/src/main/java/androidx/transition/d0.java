package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e0 f3359a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Property f3360b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Property f3361c;

    class a extends Property {
        a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(d0.b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            d0.e(view, f10.floatValue());
        }
    }

    class b extends Property {
        b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 29) {
            f3359a = new i0();
        } else if (i10 >= 23) {
            f3359a = new h0();
        } else if (i10 >= 22) {
            f3359a = new g0();
        } else {
            f3359a = new f0();
        }
        f3360b = new a(Float.class, "translationAlpha");
        f3361c = new b(Rect.class, "clipBounds");
    }

    static void a(View view) {
        f3359a.a(view);
    }

    static float b(View view) {
        return f3359a.c(view);
    }

    static void c(View view) {
        f3359a.d(view);
    }

    static void d(View view, int i10, int i11, int i12, int i13) {
        f3359a.e(view, i10, i11, i12, i13);
    }

    static void e(View view, float f10) {
        f3359a.f(view, f10);
    }

    static void f(View view, int i10) {
        f3359a.g(view, i10);
    }

    static void g(View view, Matrix matrix) {
        f3359a.h(view, matrix);
    }

    static void h(View view, Matrix matrix) {
        f3359a.i(view, matrix);
    }
}
