package com.bumptech.glide;

import android.content.Context;
import android.widget.ImageView;
import j$.util.Objects;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class l extends a3.a implements Cloneable {
    protected static final a3.f X = (a3.f) ((a3.f) ((a3.f) new a3.f().g(k2.j.f19027c)).Y(h.LOW)).f0(true);
    private final Context J;
    private final m K;
    private final Class L;
    private final c M;
    private final e N;
    private n O;
    private Object P;
    private List Q;
    private l R;
    private l S;
    private Float T;
    private boolean U = true;
    private boolean V;
    private boolean W;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f5155a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f5156b;

        static {
            int[] iArr = new int[h.values().length];
            f5156b = iArr;
            try {
                iArr[h.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5156b[h.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5156b[h.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5156b[h.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f5155a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5155a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5155a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f5155a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f5155a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f5155a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f5155a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f5155a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    protected l(c cVar, m mVar, Class cls, Context context) {
        this.M = cVar;
        this.K = mVar;
        this.L = cls;
        this.J = context;
        this.O = mVar.s(cls);
        this.N = cVar.i();
        s0(mVar.q());
        a(mVar.r());
    }

    private l A0(Object obj) {
        if (F()) {
            return clone().A0(obj);
        }
        this.P = obj;
        this.V = true;
        return (l) b0();
    }

    private a3.c B0(Object obj, b3.h hVar, a3.e eVar, a3.a aVar, a3.d dVar, n nVar, h hVar2, int i10, int i11, Executor executor) {
        Context context = this.J;
        e eVar2 = this.N;
        return a3.h.z(context, eVar2, obj, this.P, this.L, aVar, i10, i11, hVar2, hVar, eVar, this.Q, dVar, eVar2.f(), nVar.b(), executor);
    }

    private a3.c n0(b3.h hVar, a3.e eVar, a3.a aVar, Executor executor) {
        return o0(new Object(), hVar, eVar, null, this.O, aVar.x(), aVar.u(), aVar.t(), aVar, executor);
    }

    private a3.c o0(Object obj, b3.h hVar, a3.e eVar, a3.d dVar, n nVar, h hVar2, int i10, int i11, a3.a aVar, Executor executor) {
        a3.b bVar;
        a3.d dVar2;
        Object obj2;
        b3.h hVar3;
        a3.e eVar2;
        n nVar2;
        h hVar4;
        int i12;
        int i13;
        a3.a aVar2;
        Executor executor2;
        l lVar;
        if (this.S != null) {
            bVar = new a3.b(obj, dVar);
            dVar2 = bVar;
            lVar = this;
            obj2 = obj;
            hVar3 = hVar;
            eVar2 = eVar;
            nVar2 = nVar;
            hVar4 = hVar2;
            i12 = i10;
            i13 = i11;
            aVar2 = aVar;
            executor2 = executor;
        } else {
            bVar = null;
            dVar2 = dVar;
            obj2 = obj;
            hVar3 = hVar;
            eVar2 = eVar;
            nVar2 = nVar;
            hVar4 = hVar2;
            i12 = i10;
            i13 = i11;
            aVar2 = aVar;
            executor2 = executor;
            lVar = this;
        }
        a3.c cVarP0 = lVar.p0(obj2, hVar3, eVar2, dVar2, nVar2, hVar4, i12, i13, aVar2, executor2);
        if (bVar == null) {
            return cVarP0;
        }
        int iU = this.S.u();
        int iT = this.S.t();
        if (e3.l.t(i10, i11) && !this.S.P()) {
            iU = aVar.u();
            iT = aVar.t();
        }
        l lVar2 = this.S;
        a3.b bVar2 = bVar;
        bVar2.p(cVarP0, lVar2.o0(obj, hVar, eVar, bVar2, lVar2.O, lVar2.x(), iU, iT, this.S, executor));
        return bVar2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private a3.c p0(Object obj, b3.h hVar, a3.e eVar, a3.d dVar, n nVar, h hVar2, int i10, int i11, a3.a aVar, Executor executor) {
        l lVar = this.R;
        if (lVar == null) {
            if (this.T == null) {
                return B0(obj, hVar, eVar, aVar, dVar, nVar, hVar2, i10, i11, executor);
            }
            a3.i iVar = new a3.i(obj, dVar);
            iVar.o(B0(obj, hVar, eVar, aVar, iVar, nVar, hVar2, i10, i11, executor), B0(obj, hVar, eVar, aVar.clone().e0(this.T.floatValue()), iVar, nVar, r0(hVar2), i10, i11, executor));
            return iVar;
        }
        if (this.W) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        n nVar2 = lVar.U ? nVar : lVar.O;
        h hVarX = lVar.I() ? this.R.x() : r0(hVar2);
        int iU = this.R.u();
        int iT = this.R.t();
        if (e3.l.t(i10, i11) && !this.R.P()) {
            iU = aVar.u();
            iT = aVar.t();
        }
        a3.i iVar2 = new a3.i(obj, dVar);
        a3.c cVarB0 = B0(obj, hVar, eVar, aVar, iVar2, nVar, hVar2, i10, i11, executor);
        this.W = true;
        l lVar2 = this.R;
        a3.c cVarO0 = lVar2.o0(obj, hVar, eVar, iVar2, nVar2, hVarX, iU, iT, lVar2, executor);
        this.W = false;
        iVar2.o(cVarB0, cVarO0);
        return iVar2;
    }

    private h r0(h hVar) {
        int i10 = a.f5156b[hVar.ordinal()];
        if (i10 == 1) {
            return h.NORMAL;
        }
        if (i10 == 2) {
            return h.HIGH;
        }
        if (i10 == 3 || i10 == 4) {
            return h.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + x());
    }

    private void s0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            android.support.v4.media.session.b.a(it.next());
            l0(null);
        }
    }

    private b3.h u0(b3.h hVar, a3.e eVar, a3.a aVar, Executor executor) {
        e3.k.e(hVar);
        if (!this.V) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        a3.c cVarN0 = n0(hVar, eVar, aVar, executor);
        a3.c cVarJ = hVar.j();
        if (cVarN0.e(cVarJ) && !x0(aVar, cVarJ)) {
            if (!((a3.c) e3.k.e(cVarJ)).isRunning()) {
                cVarJ.i();
            }
            return hVar;
        }
        this.K.o(hVar);
        hVar.c(cVarN0);
        this.K.z(hVar, cVarN0);
        return hVar;
    }

    private boolean x0(a3.a aVar, a3.c cVar) {
        return !aVar.H() && cVar.k();
    }

    @Override // a3.a
    public boolean equals(Object obj) {
        if (obj instanceof l) {
            l lVar = (l) obj;
            if (super.equals(lVar) && Objects.equals(this.L, lVar.L) && this.O.equals(lVar.O) && Objects.equals(this.P, lVar.P) && Objects.equals(this.Q, lVar.Q) && Objects.equals(this.R, lVar.R) && Objects.equals(this.S, lVar.S) && Objects.equals(this.T, lVar.T) && this.U == lVar.U && this.V == lVar.V) {
                return true;
            }
        }
        return false;
    }

    @Override // a3.a
    public int hashCode() {
        return e3.l.p(this.V, e3.l.p(this.U, e3.l.o(this.T, e3.l.o(this.S, e3.l.o(this.R, e3.l.o(this.Q, e3.l.o(this.P, e3.l.o(this.O, e3.l.o(this.L, super.hashCode())))))))));
    }

    public l l0(a3.e eVar) {
        if (F()) {
            return clone().l0(eVar);
        }
        if (eVar != null) {
            if (this.Q == null) {
                this.Q = new ArrayList();
            }
            this.Q.add(eVar);
        }
        return (l) b0();
    }

    @Override // a3.a
    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public l a(a3.a aVar) {
        e3.k.e(aVar);
        return (l) super.a(aVar);
    }

    @Override // a3.a
    /* JADX INFO: renamed from: q0, reason: merged with bridge method [inline-methods] */
    public l clone() {
        l lVar = (l) super.clone();
        lVar.O = lVar.O.clone();
        if (lVar.Q != null) {
            lVar.Q = new ArrayList(lVar.Q);
        }
        l lVar2 = lVar.R;
        if (lVar2 != null) {
            lVar.R = lVar2.clone();
        }
        l lVar3 = lVar.S;
        if (lVar3 != null) {
            lVar.S = lVar3.clone();
        }
        return lVar;
    }

    public b3.h t0(b3.h hVar) {
        return v0(hVar, null, e3.e.b());
    }

    public b3.h v0(b3.h hVar, a3.e eVar, Executor executor) {
        return u0(hVar, eVar, this, executor);
    }

    public b3.i w0(ImageView imageView) {
        a3.a aVarR;
        e3.l.a();
        e3.k.e(imageView);
        if (!O() && M() && imageView.getScaleType() != null) {
            switch (a.f5155a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarR = clone().R();
                    break;
                case 2:
                    aVarR = clone().T();
                    break;
                case 3:
                case 4:
                case 5:
                    aVarR = clone().U();
                    break;
                case 6:
                    aVarR = clone().T();
                    break;
                default:
                    aVarR = this;
                    break;
            }
        } else {
            aVarR = this;
        }
        return (b3.i) u0(this.N.a(imageView, this.L), null, aVarR, e3.e.b());
    }

    public l y0(File file) {
        return A0(file);
    }

    public l z0(Object obj) {
        return A0(obj);
    }
}
