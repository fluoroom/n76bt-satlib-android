package t0;

import android.util.AndroidRuntimeException;
import android.view.View;
import java.util.ArrayList;
import m0.o0;
import t0.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements b.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    float f27421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f27422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f27423c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f27424d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final t0.f f27425e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f27426f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f27427g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    float f27428h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f27429i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f27430j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final ArrayList f27431k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ArrayList f27432l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private t0.b f27433m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final s f27408n = new g("translationX");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final s f27409o = new h("translationY");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final s f27410p = new i("translationZ");

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final s f27411q = new j("scaleX");

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f27412r = new k("scaleY");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f27413s = new l("rotation");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f27414t = new m("rotationX");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f27415u = new n("rotationY");

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final s f27416v = new o("x");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final s f27417w = new a("y");

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final s f27418x = new b("z");

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final s f27419y = new c("alpha");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final s f27420z = new d("scrollX");
    public static final s A = new C0382e("scrollY");

    class a extends s {
        a(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getY();
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setY(f10);
        }
    }

    class b extends s {
        b(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return o0.O(view);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            o0.G0(view, f10);
        }
    }

    class c extends s {
        c(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getAlpha();
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setAlpha(f10);
        }
    }

    class d extends s {
        d(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollX();
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollX((int) f10);
        }
    }

    /* JADX INFO: renamed from: t0.e$e, reason: collision with other inner class name */
    class C0382e extends s {
        C0382e(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScrollY();
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScrollY((int) f10);
        }
    }

    class f extends t0.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0.g f27434b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, t0.g gVar) {
            super(str);
            this.f27434b = gVar;
        }

        @Override // t0.f
        public float a(Object obj) {
            return this.f27434b.a();
        }

        @Override // t0.f
        public void b(Object obj, float f10) {
            this.f27434b.b(f10);
        }
    }

    class g extends s {
        g(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationX();
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationX(f10);
        }
    }

    class h extends s {
        h(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getTranslationY();
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setTranslationY(f10);
        }
    }

    class i extends s {
        i(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return o0.L(view);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            o0.E0(view, f10);
        }
    }

    class j extends s {
        j(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleX();
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleX(f10);
        }
    }

    class k extends s {
        k(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getScaleY();
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setScaleY(f10);
        }
    }

    class l extends s {
        l(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotation();
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotation(f10);
        }
    }

    class m extends s {
        m(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationX();
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationX(f10);
        }
    }

    class n extends s {
        n(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getRotationY();
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setRotationY(f10);
        }
    }

    class o extends s {
        o(String str) {
            super(str, null);
        }

        @Override // t0.f
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public float a(View view) {
            return view.getX();
        }

        @Override // t0.f
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(View view, float f10) {
            view.setX(f10);
        }
    }

    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f27436a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f27437b;

        p() {
        }
    }

    public interface q {
        void a(e eVar, boolean z10, float f10, float f11);
    }

    public interface r {
        void b(e eVar, float f10, float f11);
    }

    public static abstract class s extends t0.f {
        /* synthetic */ s(String str, g gVar) {
            this(str);
        }

        private s(String str) {
            super(str);
        }
    }

    e(t0.g gVar) {
        this.f27421a = 0.0f;
        this.f27422b = Float.MAX_VALUE;
        this.f27423c = false;
        this.f27426f = false;
        this.f27427g = Float.MAX_VALUE;
        this.f27428h = -Float.MAX_VALUE;
        this.f27429i = 0L;
        this.f27431k = new ArrayList();
        this.f27432l = new ArrayList();
        this.f27424d = null;
        this.f27425e = new f("FloatValueHolder", gVar);
        this.f27430j = 1.0f;
    }

    private void d(boolean z10) {
        this.f27426f = false;
        e().k(this);
        this.f27429i = 0L;
        this.f27423c = false;
        for (int i10 = 0; i10 < this.f27431k.size(); i10++) {
            if (this.f27431k.get(i10) != null) {
                ((q) this.f27431k.get(i10)).a(this, z10, this.f27422b, this.f27421a);
            }
        }
        i(this.f27431k);
    }

    private float f() {
        return this.f27425e.a(this.f27424d);
    }

    private static void i(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    private void r() {
        if (this.f27426f) {
            return;
        }
        this.f27426f = true;
        if (!this.f27423c) {
            this.f27422b = f();
        }
        float f10 = this.f27422b;
        if (f10 > this.f27427g || f10 < this.f27428h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        e().d(this, 0L);
    }

    @Override // t0.b.c
    public boolean a(long j10) {
        long j11 = this.f27429i;
        if (j11 == 0) {
            this.f27429i = j10;
            m(this.f27422b);
            return false;
        }
        long j12 = j10 - j11;
        this.f27429i = j10;
        float fG = e().g();
        boolean zS = s(fG == 0.0f ? 2147483647L : (long) (j12 / fG));
        float fMin = Math.min(this.f27422b, this.f27427g);
        this.f27422b = fMin;
        float fMax = Math.max(fMin, this.f27428h);
        this.f27422b = fMax;
        m(fMax);
        if (zS) {
            d(false);
        }
        return zS;
    }

    public e b(q qVar) {
        if (!this.f27431k.contains(qVar)) {
            this.f27431k.add(qVar);
        }
        return this;
    }

    public e c(r rVar) {
        if (h()) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!this.f27432l.contains(rVar)) {
            this.f27432l.add(rVar);
        }
        return this;
    }

    public t0.b e() {
        t0.b bVar = this.f27433m;
        return bVar != null ? bVar : t0.b.h();
    }

    float g() {
        return this.f27430j * 0.75f;
    }

    public boolean h() {
        return this.f27426f;
    }

    public e j(float f10) {
        this.f27427g = f10;
        return this;
    }

    public e k(float f10) {
        this.f27428h = f10;
        return this;
    }

    public e l(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Minimum visible change must be positive.");
        }
        this.f27430j = f10;
        p(f10 * 0.75f);
        return this;
    }

    void m(float f10) {
        this.f27425e.b(this.f27424d, f10);
        for (int i10 = 0; i10 < this.f27432l.size(); i10++) {
            if (this.f27432l.get(i10) != null) {
                ((r) this.f27432l.get(i10)).b(this, this.f27422b, this.f27421a);
            }
        }
        i(this.f27432l);
    }

    public e n(float f10) {
        this.f27422b = f10;
        this.f27423c = true;
        return this;
    }

    public e o(float f10) {
        this.f27421a = f10;
        return this;
    }

    abstract void p(float f10);

    public void q() {
        if (!e().j()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f27426f) {
            return;
        }
        r();
    }

    abstract boolean s(long j10);

    e(Object obj, t0.f fVar) {
        this.f27421a = 0.0f;
        this.f27422b = Float.MAX_VALUE;
        this.f27423c = false;
        this.f27426f = false;
        this.f27427g = Float.MAX_VALUE;
        this.f27428h = -Float.MAX_VALUE;
        this.f27429i = 0L;
        this.f27431k = new ArrayList();
        this.f27432l = new ArrayList();
        this.f27424d = obj;
        this.f27425e = fVar;
        if (fVar != f27413s && fVar != f27414t && fVar != f27415u) {
            if (fVar == f27419y) {
                this.f27430j = 0.00390625f;
                return;
            } else if (fVar != f27411q && fVar != f27412r) {
                this.f27430j = 1.0f;
                return;
            } else {
                this.f27430j = 0.002f;
                return;
            }
        }
        this.f27430j = 0.1f;
    }
}
