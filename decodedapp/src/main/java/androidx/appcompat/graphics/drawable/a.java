package androidx.appcompat.graphics.drawable;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.graphics.drawable.b;
import androidx.appcompat.graphics.drawable.e;
import androidx.appcompat.widget.ResourceManagerInternal;
import androidx.collection.j;
import androidx.vectordrawable.graphics.drawable.h;
import c0.n;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.appcompat.graphics.drawable.e implements e0.b {
    private int A;
    private boolean B;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c f1022x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private g f1023y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f1024z;

    private static class b extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Animatable f1025a;

        b(Animatable animatable) {
            super();
            this.f1025a = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f1025a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f1025a.stop();
        }
    }

    static class c extends e.a {
        androidx.collection.f K;
        j L;

        c(c cVar, a aVar, Resources resources) {
            super(cVar, aVar, resources);
            if (cVar != null) {
                this.K = cVar.K;
                this.L = cVar.L;
            } else {
                this.K = new androidx.collection.f();
                this.L = new j();
            }
        }

        private static long D(int i10, int i11) {
            return ((long) i11) | (((long) i10) << 32);
        }

        int B(int[] iArr, Drawable drawable, int i10) {
            int iZ = super.z(iArr, drawable);
            this.L.j(iZ, Integer.valueOf(i10));
            return iZ;
        }

        int C(int i10, int i11, Drawable drawable, boolean z10) {
            int iA = super.a(drawable);
            long jD = D(i10, i11);
            long j10 = z10 ? 8589934592L : 0L;
            long j11 = iA;
            this.K.a(jD, Long.valueOf(j11 | j10));
            if (z10) {
                this.K.a(D(i11, i10), Long.valueOf(4294967296L | j11 | j10));
            }
            return iA;
        }

        int E(int i10) {
            if (i10 < 0) {
                return 0;
            }
            return ((Integer) this.L.g(i10, 0)).intValue();
        }

        int F(int[] iArr) {
            int iA = super.A(iArr);
            return iA >= 0 ? iA : super.A(StateSet.WILD_CARD);
        }

        int G(int i10, int i11) {
            return (int) ((Long) this.K.g(D(i10, i11), -1L)).longValue();
        }

        boolean H(int i10, int i11) {
            return (((Long) this.K.g(D(i10, i11), -1L)).longValue() & 4294967296L) != 0;
        }

        boolean I(int i10, int i11) {
            return (((Long) this.K.g(D(i10, i11), -1L)).longValue() & 8589934592L) != 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new a(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.e.a, androidx.appcompat.graphics.drawable.b.d
        void r() {
            this.K = this.K.clone();
            this.L = this.L.clone();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new a(this, resources);
        }
    }

    private static class d extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final androidx.vectordrawable.graphics.drawable.c f1026a;

        d(androidx.vectordrawable.graphics.drawable.c cVar) {
            super();
            this.f1026a = cVar;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f1026a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f1026a.stop();
        }
    }

    private static class e extends g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ObjectAnimator f1027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f1028b;

        e(AnimationDrawable animationDrawable, boolean z10, boolean z11) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i10 = z10 ? numberOfFrames - 1 : 0;
            int i11 = z10 ? 0 : numberOfFrames - 1;
            f fVar = new f(animationDrawable, z10);
            ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i10, i11);
            objectAnimatorOfInt.setAutoCancel(true);
            objectAnimatorOfInt.setDuration(fVar.a());
            objectAnimatorOfInt.setInterpolator(fVar);
            this.f1028b = z11;
            this.f1027a = objectAnimatorOfInt;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public boolean a() {
            return this.f1028b;
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void b() {
            this.f1027a.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void c() {
            this.f1027a.start();
        }

        @Override // androidx.appcompat.graphics.drawable.a.g
        public void d() {
            this.f1027a.cancel();
        }
    }

    private static class f implements TimeInterpolator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int[] f1029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f1030b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f1031c;

        f(AnimationDrawable animationDrawable, boolean z10) {
            b(animationDrawable, z10);
        }

        int a() {
            return this.f1031c;
        }

        int b(AnimationDrawable animationDrawable, boolean z10) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f1030b = numberOfFrames;
            int[] iArr = this.f1029a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f1029a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f1029a;
            int i10 = 0;
            for (int i11 = 0; i11 < numberOfFrames; i11++) {
                int duration = animationDrawable.getDuration(z10 ? (numberOfFrames - i11) - 1 : i11);
                iArr2[i11] = duration;
                i10 += duration;
            }
            this.f1031c = i10;
            return i10;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            int i10 = (int) ((f10 * this.f1031c) + 0.5f);
            int i11 = this.f1030b;
            int[] iArr = this.f1029a;
            int i12 = 0;
            while (i12 < i11) {
                int i13 = iArr[i12];
                if (i10 < i13) {
                    break;
                }
                i10 -= i13;
                i12++;
            }
            return (i12 / i11) + (i12 < i11 ? i10 / this.f1031c : 0.0f);
        }
    }

    private static abstract class g {
        private g() {
        }

        public boolean a() {
            return false;
        }

        public void b() {
        }

        public abstract void c();

        public abstract void d();
    }

    public a() {
        this(null, null);
    }

    public static a l(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            a aVar = new a();
            aVar.m(context, resources, xmlPullParser, attributeSet, theme);
            return aVar;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    private void n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals("item")) {
                    p(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals("transition")) {
                    q(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private void o() {
        onStateChange(getState());
    }

    private int p(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, j.c.f18316h);
        int resourceId = typedArrayS.getResourceId(j.c.f18317i, 0);
        int resourceId2 = typedArrayS.getResourceId(j.c.f18318j, -1);
        Drawable drawable = resourceId2 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId2) : null;
        typedArrayS.recycle();
        int[] iArrJ = j(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawable = xmlPullParser.getName().equals("vector") ? h.c(resources, xmlPullParser, attributeSet, theme) : j.a.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawable != null) {
            return this.f1022x.B(iArrJ, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    private int q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, j.c.f18319k);
        int resourceId = typedArrayS.getResourceId(j.c.f18322n, -1);
        int resourceId2 = typedArrayS.getResourceId(j.c.f18321m, -1);
        int resourceId3 = typedArrayS.getResourceId(j.c.f18320l, -1);
        Drawable drawable = resourceId3 > 0 ? ResourceManagerInternal.get().getDrawable(context, resourceId3) : null;
        boolean z10 = typedArrayS.getBoolean(j.c.f18323o, false);
        typedArrayS.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
            drawable = xmlPullParser.getName().equals("animated-vector") ? androidx.vectordrawable.graphics.drawable.c.b(context, resources, xmlPullParser, attributeSet, theme) : j.a.a(resources, xmlPullParser, attributeSet, theme);
        }
        if (drawable == null) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
        }
        if (resourceId != -1 && resourceId2 != -1) {
            return this.f1022x.C(resourceId, resourceId2, drawable, z10);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
    }

    private boolean r(int i10) {
        int iC;
        int iG;
        g bVar;
        g gVar = this.f1023y;
        if (gVar == null) {
            iC = c();
        } else {
            if (i10 == this.f1024z) {
                return true;
            }
            if (i10 == this.A && gVar.a()) {
                gVar.b();
                this.f1024z = this.A;
                this.A = i10;
                return true;
            }
            iC = this.f1024z;
            gVar.d();
        }
        this.f1023y = null;
        this.A = -1;
        this.f1024z = -1;
        c cVar = this.f1022x;
        int iE = cVar.E(iC);
        int iE2 = cVar.E(i10);
        if (iE2 == 0 || iE == 0 || (iG = cVar.G(iE, iE2)) < 0) {
            return false;
        }
        boolean zI = cVar.I(iE, iE2);
        g(iG);
        Object current = getCurrent();
        if (current instanceof AnimationDrawable) {
            bVar = new e((AnimationDrawable) current, cVar.H(iE, iE2), zI);
        } else {
            if (!(current instanceof androidx.vectordrawable.graphics.drawable.c)) {
                if (current instanceof Animatable) {
                    bVar = new b((Animatable) current);
                }
                return false;
            }
            bVar = new d((androidx.vectordrawable.graphics.drawable.c) current);
        }
        bVar.c();
        this.f1023y = bVar;
        this.A = iC;
        this.f1024z = i10;
        return true;
    }

    private void s(TypedArray typedArray) {
        c cVar = this.f1022x;
        cVar.f1049d |= j.a.b(typedArray);
        cVar.x(typedArray.getBoolean(j.c.f18312d, cVar.f1054i));
        cVar.t(typedArray.getBoolean(j.c.f18313e, cVar.f1057l));
        cVar.u(typedArray.getInt(j.c.f18314f, cVar.A));
        cVar.v(typedArray.getInt(j.c.f18315g, cVar.B));
        setDither(typedArray.getBoolean(j.c.f18310b, cVar.f1069x));
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b
    void h(b.d dVar) {
        super.h(dVar);
        if (dVar instanceof c) {
            this.f1022x = (c) dVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        g gVar = this.f1023y;
        if (gVar != null) {
            gVar.d();
            this.f1023y = null;
            g(this.f1024z);
            this.f1024z = -1;
            this.A = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.b
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public c b() {
        return new c(this.f1022x, this, null);
    }

    public void m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        TypedArray typedArrayS = n.s(resources, theme, attributeSet, j.c.f18309a);
        setVisible(typedArrayS.getBoolean(j.c.f18311c, true), true);
        s(typedArrayS);
        i(resources);
        typedArrayS.recycle();
        n(context, resources, xmlPullParser, attributeSet, theme);
        o();
    }

    @Override // androidx.appcompat.graphics.drawable.e, androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.B && super.mutate() == this) {
            this.f1022x.r();
            this.B = true;
        }
        return this;
    }

    @Override // androidx.appcompat.graphics.drawable.e, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iF = this.f1022x.F(iArr);
        boolean z10 = iF != c() && (r(iF) || g(iF));
        Drawable current = getCurrent();
        return current != null ? current.setState(iArr) | z10 : z10;
    }

    @Override // androidx.appcompat.graphics.drawable.b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z10, boolean z11) {
        boolean visible = super.setVisible(z10, z11);
        g gVar = this.f1023y;
        if (gVar != null && (visible || z11)) {
            if (z10) {
                gVar.c();
                return visible;
            }
            jumpToCurrentState();
        }
        return visible;
    }

    a(c cVar, Resources resources) {
        super(null);
        this.f1024z = -1;
        this.A = -1;
        h(new c(cVar, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}
