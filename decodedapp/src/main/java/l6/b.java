package l6;

import e6.g;
import e6.n;
import e6.p;
import o6.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends f6.a {

    /* JADX INFO: renamed from: t */
    protected final i6.f f20432t;

    /* JADX INFO: renamed from: u */
    protected int[] f20433u;

    /* JADX INFO: renamed from: v */
    protected int f20434v;

    /* JADX INFO: renamed from: w */
    protected p f20435w;

    /* JADX INFO: renamed from: x */
    protected boolean f20436x;

    /* JADX INFO: renamed from: y */
    protected boolean f20437y;

    /* JADX INFO: renamed from: z */
    protected static final int[] f20431z = i6.c.e();
    protected static final i A = e6.g.f11505c;

    public b(i6.f fVar, int i10, n nVar) {
        super(i10, nVar);
        this.f20433u = f20431z;
        this.f20435w = o6.e.f23231h;
        this.f20432t = fVar;
        if (g.b.ESCAPE_NON_ASCII.e(i10)) {
            this.f20434v = 127;
        }
        this.f20437y = g.b.WRITE_HEX_UPPER_CASE.e(i10);
        this.f20436x = !g.b.QUOTE_FIELD_NAMES.e(i10);
    }

    @Override // e6.g
    public e6.g S(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f20434v = i10;
        return this;
    }

    @Override // e6.g
    public e6.g W(p pVar) {
        this.f20435w = pVar;
        return this;
    }

    @Override // f6.a
    protected void m1(int i10, int i11) {
        super.m1(i10, i11);
        this.f20436x = !g.b.QUOTE_FIELD_NAMES.e(i10);
        this.f20437y = g.b.WRITE_HEX_UPPER_CASE.e(i10);
    }

    protected void o1(String str) throws e6.f {
        a(String.format("Can not %s, expecting field name (context: %s)", str, this.f12814h.l()));
    }

    protected void p1(String str, int i10) throws e6.f {
        if (i10 == 0) {
            if (this.f12814h.h()) {
                this.f11507a.a(this);
                return;
            } else {
                if (this.f12814h.i()) {
                    this.f11507a.j(this);
                    return;
                }
                return;
            }
        }
        if (i10 == 1) {
            this.f11507a.i(this);
            return;
        }
        if (i10 == 2) {
            this.f11507a.g(this);
            return;
        }
        if (i10 == 3) {
            this.f11507a.b(this);
        } else if (i10 != 5) {
            c();
        } else {
            o1(str);
        }
    }

    @Override // f6.a, e6.g
    public e6.g r(g.b bVar) {
        super.r(bVar);
        if (bVar == g.b.QUOTE_FIELD_NAMES) {
            this.f20436x = true;
            return this;
        }
        if (bVar == g.b.WRITE_HEX_UPPER_CASE) {
            this.f20437y = false;
        }
        return this;
    }
}
