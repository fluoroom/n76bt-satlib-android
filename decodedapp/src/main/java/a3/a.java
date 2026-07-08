package a3;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import i2.l;
import java.util.Map;
import k2.j;
import r2.k;
import r2.m;
import r2.u;
import r2.w;

/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Cloneable {
    private boolean C;
    private Resources.Theme D;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean I;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f205a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Drawable f209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable f211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f212h;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f217v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private Drawable f219x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f220y;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f206b = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f207c = j.f19029e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.h f208d = com.bumptech.glide.h.NORMAL;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f213r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f214s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f215t = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private i2.f f216u = d3.a.c();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f218w = true;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private i2.h f221z = new i2.h();
    private Map A = new e3.b();
    private Class B = Object.class;
    private boolean H = true;

    private boolean K(int i10) {
        return L(this.f205a, i10);
    }

    private static boolean L(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    private a V(m mVar, l lVar) {
        return Z(mVar, lVar, false);
    }

    private a Z(m mVar, l lVar, boolean z10) {
        a aVarJ0 = z10 ? j0(mVar, lVar) : W(mVar, lVar);
        aVarJ0.H = true;
        return aVarJ0;
    }

    public final float A() {
        return this.f206b;
    }

    public final Resources.Theme B() {
        return this.D;
    }

    public final Map C() {
        return this.A;
    }

    public final boolean D() {
        return this.I;
    }

    public final boolean E() {
        return this.F;
    }

    protected final boolean F() {
        return this.E;
    }

    public final boolean G(a aVar) {
        return Float.compare(aVar.f206b, this.f206b) == 0 && this.f210f == aVar.f210f && e3.l.d(this.f209e, aVar.f209e) && this.f212h == aVar.f212h && e3.l.d(this.f211g, aVar.f211g) && this.f220y == aVar.f220y && e3.l.d(this.f219x, aVar.f219x) && this.f213r == aVar.f213r && this.f214s == aVar.f214s && this.f215t == aVar.f215t && this.f217v == aVar.f217v && this.f218w == aVar.f218w && this.F == aVar.F && this.G == aVar.G && this.f207c.equals(aVar.f207c) && this.f208d == aVar.f208d && this.f221z.equals(aVar.f221z) && this.A.equals(aVar.A) && this.B.equals(aVar.B) && e3.l.d(this.f216u, aVar.f216u) && e3.l.d(this.D, aVar.D);
    }

    public final boolean H() {
        return this.f213r;
    }

    public final boolean I() {
        return K(8);
    }

    boolean J() {
        return this.H;
    }

    public final boolean M() {
        return this.f218w;
    }

    public final boolean N() {
        return this.f217v;
    }

    public final boolean O() {
        return K(2048);
    }

    public final boolean P() {
        return e3.l.t(this.f215t, this.f214s);
    }

    public a Q() {
        this.C = true;
        return a0();
    }

    public a R() {
        return W(m.f25384e, new r2.j());
    }

    public a T() {
        return V(m.f25383d, new k());
    }

    public a U() {
        return V(m.f25382c, new w());
    }

    final a W(m mVar, l lVar) {
        if (this.E) {
            return clone().W(mVar, lVar);
        }
        h(mVar);
        return h0(lVar, false);
    }

    public a X(int i10, int i11) {
        if (this.E) {
            return clone().X(i10, i11);
        }
        this.f215t = i10;
        this.f214s = i11;
        this.f205a |= WXMediaMessage.TITLE_LENGTH_LIMIT;
        return b0();
    }

    public a Y(com.bumptech.glide.h hVar) {
        if (this.E) {
            return clone().Y(hVar);
        }
        this.f208d = (com.bumptech.glide.h) e3.k.e(hVar);
        this.f205a |= 8;
        return b0();
    }

    public a a(a aVar) {
        if (this.E) {
            return clone().a(aVar);
        }
        if (L(aVar.f205a, 2)) {
            this.f206b = aVar.f206b;
        }
        if (L(aVar.f205a, 262144)) {
            this.F = aVar.F;
        }
        if (L(aVar.f205a, 1048576)) {
            this.I = aVar.I;
        }
        if (L(aVar.f205a, 4)) {
            this.f207c = aVar.f207c;
        }
        if (L(aVar.f205a, 8)) {
            this.f208d = aVar.f208d;
        }
        if (L(aVar.f205a, 16)) {
            this.f209e = aVar.f209e;
            this.f210f = 0;
            this.f205a &= -33;
        }
        if (L(aVar.f205a, 32)) {
            this.f210f = aVar.f210f;
            this.f209e = null;
            this.f205a &= -17;
        }
        if (L(aVar.f205a, 64)) {
            this.f211g = aVar.f211g;
            this.f212h = 0;
            this.f205a &= -129;
        }
        if (L(aVar.f205a, 128)) {
            this.f212h = aVar.f212h;
            this.f211g = null;
            this.f205a &= -65;
        }
        if (L(aVar.f205a, 256)) {
            this.f213r = aVar.f213r;
        }
        if (L(aVar.f205a, WXMediaMessage.TITLE_LENGTH_LIMIT)) {
            this.f215t = aVar.f215t;
            this.f214s = aVar.f214s;
        }
        if (L(aVar.f205a, WXMediaMessage.DESCRIPTION_LENGTH_LIMIT)) {
            this.f216u = aVar.f216u;
        }
        if (L(aVar.f205a, 4096)) {
            this.B = aVar.B;
        }
        if (L(aVar.f205a, 8192)) {
            this.f219x = aVar.f219x;
            this.f220y = 0;
            this.f205a &= -16385;
        }
        if (L(aVar.f205a, 16384)) {
            this.f220y = aVar.f220y;
            this.f219x = null;
            this.f205a &= -8193;
        }
        if (L(aVar.f205a, 32768)) {
            this.D = aVar.D;
        }
        if (L(aVar.f205a, WXMediaMessage.THUMB_LENGTH_LIMIT)) {
            this.f218w = aVar.f218w;
        }
        if (L(aVar.f205a, WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT)) {
            this.f217v = aVar.f217v;
        }
        if (L(aVar.f205a, 2048)) {
            this.A.putAll(aVar.A);
            this.H = aVar.H;
        }
        if (L(aVar.f205a, 524288)) {
            this.G = aVar.G;
        }
        if (!this.f218w) {
            this.A.clear();
            int i10 = this.f205a;
            this.f217v = false;
            this.f205a = i10 & (-133121);
            this.H = true;
        }
        this.f205a |= aVar.f205a;
        this.f221z.d(aVar.f221z);
        return b0();
    }

    public a b() {
        if (this.C && !this.E) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.E = true;
        return Q();
    }

    protected final a b0() {
        if (this.C) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return a0();
    }

    public a c0(i2.g gVar, Object obj) {
        if (this.E) {
            return clone().c0(gVar, obj);
        }
        e3.k.e(gVar);
        e3.k.e(obj);
        this.f221z.e(gVar, obj);
        return b0();
    }

    @Override // 
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public a clone() {
        try {
            a aVar = (a) super.clone();
            i2.h hVar = new i2.h();
            aVar.f221z = hVar;
            hVar.d(this.f221z);
            e3.b bVar = new e3.b();
            aVar.A = bVar;
            bVar.putAll(this.A);
            aVar.C = false;
            aVar.E = false;
            return aVar;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public a d0(i2.f fVar) {
        if (this.E) {
            return clone().d0(fVar);
        }
        this.f216u = (i2.f) e3.k.e(fVar);
        this.f205a |= WXMediaMessage.DESCRIPTION_LENGTH_LIMIT;
        return b0();
    }

    public a e0(float f10) {
        if (this.E) {
            return clone().e0(f10);
        }
        if (f10 < 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f206b = f10;
        this.f205a |= 2;
        return b0();
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            return G((a) obj);
        }
        return false;
    }

    public a f(Class cls) {
        if (this.E) {
            return clone().f(cls);
        }
        this.B = (Class) e3.k.e(cls);
        this.f205a |= 4096;
        return b0();
    }

    public a f0(boolean z10) {
        if (this.E) {
            return clone().f0(true);
        }
        this.f213r = !z10;
        this.f205a |= 256;
        return b0();
    }

    public a g(j jVar) {
        if (this.E) {
            return clone().g(jVar);
        }
        this.f207c = (j) e3.k.e(jVar);
        this.f205a |= 4;
        return b0();
    }

    public a g0(l lVar) {
        return h0(lVar, true);
    }

    public a h(m mVar) {
        return c0(m.f25387h, (m) e3.k.e(mVar));
    }

    a h0(l lVar, boolean z10) {
        if (this.E) {
            return clone().h0(lVar, z10);
        }
        u uVar = new u(lVar, z10);
        i0(Bitmap.class, lVar, z10);
        i0(Drawable.class, uVar, z10);
        i0(BitmapDrawable.class, uVar.c(), z10);
        i0(v2.c.class, new v2.f(lVar), z10);
        return b0();
    }

    public int hashCode() {
        return e3.l.o(this.D, e3.l.o(this.f216u, e3.l.o(this.B, e3.l.o(this.A, e3.l.o(this.f221z, e3.l.o(this.f208d, e3.l.o(this.f207c, e3.l.p(this.G, e3.l.p(this.F, e3.l.p(this.f218w, e3.l.p(this.f217v, e3.l.n(this.f215t, e3.l.n(this.f214s, e3.l.p(this.f213r, e3.l.o(this.f219x, e3.l.n(this.f220y, e3.l.o(this.f211g, e3.l.n(this.f212h, e3.l.o(this.f209e, e3.l.n(this.f210f, e3.l.l(this.f206b)))))))))))))))))))));
    }

    public a i(int i10) {
        if (this.E) {
            return clone().i(i10);
        }
        this.f210f = i10;
        int i11 = this.f205a | 32;
        this.f209e = null;
        this.f205a = i11 & (-17);
        return b0();
    }

    a i0(Class cls, l lVar, boolean z10) {
        if (this.E) {
            return clone().i0(cls, lVar, z10);
        }
        e3.k.e(cls);
        e3.k.e(lVar);
        this.A.put(cls, lVar);
        int i10 = this.f205a;
        this.f218w = true;
        this.f205a = 67584 | i10;
        this.H = false;
        if (z10) {
            this.f205a = i10 | 198656;
            this.f217v = true;
        }
        return b0();
    }

    public final j j() {
        return this.f207c;
    }

    final a j0(m mVar, l lVar) {
        if (this.E) {
            return clone().j0(mVar, lVar);
        }
        h(mVar);
        return g0(lVar);
    }

    public final int k() {
        return this.f210f;
    }

    public a k0(boolean z10) {
        if (this.E) {
            return clone().k0(z10);
        }
        this.I = z10;
        this.f205a |= 1048576;
        return b0();
    }

    public final Drawable m() {
        return this.f209e;
    }

    public final Drawable n() {
        return this.f219x;
    }

    public final int o() {
        return this.f220y;
    }

    public final boolean p() {
        return this.G;
    }

    public final i2.h r() {
        return this.f221z;
    }

    public final int t() {
        return this.f214s;
    }

    public final int u() {
        return this.f215t;
    }

    public final Drawable v() {
        return this.f211g;
    }

    public final int w() {
        return this.f212h;
    }

    public final com.bumptech.glide.h x() {
        return this.f208d;
    }

    public final Class y() {
        return this.B;
    }

    public final i2.f z() {
        return this.f216u;
    }

    private a a0() {
        return this;
    }
}
