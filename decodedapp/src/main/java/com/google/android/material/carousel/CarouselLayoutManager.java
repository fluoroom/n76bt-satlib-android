package com.google.android.material.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.carousel.e;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import u8.l;

/* JADX INFO: loaded from: classes3.dex */
public class CarouselLayoutManager extends RecyclerView.q implements z8.a, RecyclerView.a0.b {
    private int A;
    private Map B;
    private com.google.android.material.carousel.b C;
    private final View.OnLayoutChangeListener D;
    private int E;
    private int F;
    private int G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f7599s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    int f7600t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f7601u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f7602v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final c f7603w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private com.google.android.material.carousel.c f7604x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private f f7605y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private e f7606z;

    class a extends androidx.recyclerview.widget.g {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.a0
        public PointF a(int i10) {
            return CarouselLayoutManager.this.c(i10);
        }

        @Override // androidx.recyclerview.widget.g
        public int t(View view, int i10) {
            if (CarouselLayoutManager.this.f7605y == null || !CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.h2(carouselLayoutManager.l0(view));
        }

        @Override // androidx.recyclerview.widget.g
        public int u(View view, int i10) {
            if (CarouselLayoutManager.this.f7605y == null || CarouselLayoutManager.this.f()) {
                return 0;
            }
            CarouselLayoutManager carouselLayoutManager = CarouselLayoutManager.this;
            return carouselLayoutManager.h2(carouselLayoutManager.l0(view));
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f7608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final float f7609b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f7610c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d f7611d;

        b(View view, float f10, float f11, d dVar) {
            this.f7608a = view;
            this.f7609b = f10;
            this.f7610c = f11;
            this.f7611d = dVar;
        }
    }

    private static class c extends RecyclerView.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Paint f7612a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f7613b;

        c() {
            Paint paint = new Paint();
            this.f7612a = paint;
            this.f7613b = DesugarCollections.unmodifiableList(new ArrayList());
            paint.setStrokeWidth(5.0f);
            paint.setColor(-65281);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void i(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            super.i(canvas, recyclerView, b0Var);
            this.f7612a.setStrokeWidth(recyclerView.getResources().getDimension(u8.d.f28631z));
            for (e.c cVar : this.f7613b) {
                this.f7612a.setColor(d0.a.c(-65281, -16776961, cVar.f7649c));
                if (((CarouselLayoutManager) recyclerView.getLayoutManager()).f()) {
                    canvas.drawLine(cVar.f7648b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).B2(), cVar.f7648b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).x2(), this.f7612a);
                } else {
                    canvas.drawLine(((CarouselLayoutManager) recyclerView.getLayoutManager()).y2(), cVar.f7648b, ((CarouselLayoutManager) recyclerView.getLayoutManager()).z2(), cVar.f7648b, this.f7612a);
                }
            }
        }

        void j(List list) {
            this.f7613b = DesugarCollections.unmodifiableList(list);
        }
    }

    private static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final e.c f7614a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final e.c f7615b;

        d(e.c cVar, e.c cVar2) {
            l0.g.a(cVar.f7647a <= cVar2.f7647a);
            this.f7614a = cVar;
            this.f7615b = cVar2;
        }
    }

    public CarouselLayoutManager() {
        this(new g());
    }

    private int A2() {
        return this.C.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int B2() {
        return this.C.h();
    }

    private int C2() {
        if (R()) {
            return 0;
        }
        return w2() == 1 ? h0() : j0();
    }

    private int D2(int i10, e eVar) {
        return G2() ? (int) (((o2() - eVar.i().f7647a) - (i10 * eVar.g())) - (eVar.g() / 2.0f)) : (int) (((i10 * eVar.g()) - eVar.b().f7647a) + (eVar.g() / 2.0f));
    }

    private int E2(int i10, e eVar) {
        int i11 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        for (e.c cVar : eVar.f()) {
            float fG = (i10 * eVar.g()) + (eVar.g() / 2.0f);
            int iO2 = (G2() ? (int) ((o2() - cVar.f7647a) - fG) : (int) (fG - cVar.f7647a)) - this.f7599s;
            if (Math.abs(i11) > Math.abs(iO2)) {
                i11 = iO2;
            }
        }
        return i11;
    }

    private static d F2(List list, float f10, boolean z10) {
        float f11 = Float.MAX_VALUE;
        float f12 = Float.MAX_VALUE;
        float f13 = Float.MAX_VALUE;
        float f14 = -3.4028235E38f;
        int i10 = -1;
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        for (int i14 = 0; i14 < list.size(); i14++) {
            e.c cVar = (e.c) list.get(i14);
            float f15 = z10 ? cVar.f7648b : cVar.f7647a;
            float fAbs = Math.abs(f15 - f10);
            if (f15 <= f10 && fAbs <= f11) {
                i10 = i14;
                f11 = fAbs;
            }
            if (f15 > f10 && fAbs <= f12) {
                i12 = i14;
                f12 = fAbs;
            }
            if (f15 <= f13) {
                i11 = i14;
                f13 = f15;
            }
            if (f15 > f14) {
                i13 = i14;
                f14 = f15;
            }
        }
        if (i10 == -1) {
            i10 = i11;
        }
        if (i12 == -1) {
            i12 = i13;
        }
        return new d((e.c) list.get(i10), (e.c) list.get(i12));
    }

    private boolean H2(float f10, d dVar) {
        float fA2 = a2(f10, u2(f10, dVar) / 2.0f);
        return G2() ? fA2 < 0.0f : fA2 > ((float) o2());
    }

    private boolean I2(float f10, d dVar) {
        float fZ1 = Z1(f10, u2(f10, dVar) / 2.0f);
        return G2() ? fZ1 > ((float) o2()) : fZ1 < 0.0f;
    }

    private void J2() {
        if (this.f7602v && Log.isLoggable("CarouselLayoutManager", 3)) {
            Log.d("CarouselLayoutManager", "internal representation of views on the screen");
            for (int i10 = 0; i10 < O(); i10++) {
                View viewN = N(i10);
                Log.d("CarouselLayoutManager", "item position " + l0(viewN) + ", center:" + p2(viewN) + ", child index:" + i10);
            }
            Log.d("CarouselLayoutManager", "==============");
        }
    }

    private b K2(RecyclerView.w wVar, float f10, int i10) {
        View viewO = wVar.o(i10);
        F0(viewO, 0, 0);
        float fZ1 = Z1(f10, this.f7606z.g() / 2.0f);
        d dVarF2 = F2(this.f7606z.h(), fZ1, false);
        return new b(viewO, fZ1, e2(fZ1, dVarF2), dVarF2);
    }

    private float L2(View view, float f10, float f11, Rect rect) {
        float fZ1 = Z1(f10, f11);
        d dVarF2 = F2(this.f7606z.h(), fZ1, false);
        float fE2 = e2(fZ1, dVarF2);
        super.U(view, rect);
        V2(view, fZ1, dVarF2);
        this.C.j(view, rect, f11, fE2);
        return fE2;
    }

    private void M2(RecyclerView.w wVar) {
        View viewO = wVar.o(0);
        F0(viewO, 0, 0);
        e eVarG = this.f7604x.g(this, viewO);
        if (G2()) {
            eVarG = e.p(eVarG, o2());
        }
        this.f7605y = f.f(this, eVarG, q2(), t2(), C2(), this.f7604x.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N2() {
        this.f7605y = null;
        y1();
    }

    private void O2(RecyclerView.w wVar) {
        while (O() > 0) {
            View viewN = N(0);
            float fP2 = p2(viewN);
            if (!I2(fP2, F2(this.f7606z.h(), fP2, true))) {
                break;
            } else {
                r1(viewN, wVar);
            }
        }
        while (O() - 1 >= 0) {
            View viewN2 = N(O() - 1);
            float fP22 = p2(viewN2);
            if (!H2(fP22, F2(this.f7606z.h(), fP22, true))) {
                return;
            } else {
                r1(viewN2, wVar);
            }
        }
    }

    private int P2(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (O() == 0 || i10 == 0) {
            return 0;
        }
        if (this.f7605y == null) {
            M2(wVar);
        }
        if (e() <= r2(this.f7605y).n()) {
            return 0;
        }
        int iI2 = i2(i10, this.f7599s, this.f7600t, this.f7601u);
        this.f7599s += iI2;
        W2(this.f7605y);
        float fG = this.f7606z.g() / 2.0f;
        float fF2 = f2(l0(N(0)));
        Rect rect = new Rect();
        float f10 = G2() ? this.f7606z.i().f7648b : this.f7606z.b().f7648b;
        float f11 = Float.MAX_VALUE;
        for (int i11 = 0; i11 < O(); i11++) {
            View viewN = N(i11);
            float fAbs = Math.abs(f10 - L2(viewN, fF2, fG, rect));
            if (viewN != null && fAbs < f11) {
                this.F = l0(viewN);
                f11 = fAbs;
            }
            fF2 = Z1(fF2, this.f7606z.g());
        }
        l2(wVar, b0Var);
        return iI2;
    }

    private void Q2(RecyclerView recyclerView, int i10) {
        if (f()) {
            recyclerView.scrollBy(i10, 0);
        } else {
            recyclerView.scrollBy(0, i10);
        }
    }

    public static /* synthetic */ void S1(final CarouselLayoutManager carouselLayoutManager, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        carouselLayoutManager.getClass();
        if (i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) {
            return;
        }
        view.post(new Runnable() { // from class: z8.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f33023a.N2();
            }
        });
    }

    private void S2(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f28951w0);
            R2(typedArrayObtainStyledAttributes.getInt(l.f28960x0, 0));
            U2(typedArrayObtainStyledAttributes.getInt(k1.c.f18925b, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    private void V2(View view, float f10, d dVar) {
    }

    private void W2(f fVar) {
        int i10 = this.f7601u;
        int i11 = this.f7600t;
        if (i10 <= i11) {
            this.f7606z = r2(fVar);
        } else {
            this.f7606z = fVar.j(this.f7599s, i11, i10);
        }
        this.f7603w.j(this.f7606z.h());
    }

    private void X2() {
        int iE = e();
        int i10 = this.E;
        if (iE == i10 || this.f7605y == null) {
            return;
        }
        if (this.f7604x.h(this, i10)) {
            N2();
        }
        this.E = iE;
    }

    private void Y1(View view, int i10, b bVar) {
        float fG = this.f7606z.g() / 2.0f;
        j(view, i10);
        F0(view, 0, 0);
        float f10 = bVar.f7610c;
        this.C.i(view, (int) (f10 - fG), (int) (f10 + fG));
        V2(view, bVar.f7609b, bVar.f7611d);
    }

    private void Y2() {
        if (!this.f7602v || O() < 1) {
            return;
        }
        int i10 = 0;
        while (i10 < O() - 1) {
            int iL0 = l0(N(i10));
            int i11 = i10 + 1;
            int iL02 = l0(N(i11));
            if (iL0 > iL02) {
                J2();
                throw new IllegalStateException("Detected invalid child order. Child at index [" + i10 + "] had adapter position [" + iL0 + "] and child at index [" + i11 + "] had adapter position [" + iL02 + "].");
            }
            i10 = i11;
        }
    }

    private float Z1(float f10, float f11) {
        return G2() ? f10 - f11 : f10 + f11;
    }

    private float a2(float f10, float f11) {
        return G2() ? f10 + f11 : f10 - f11;
    }

    private void b2(RecyclerView.w wVar, int i10, int i11) {
        if (i10 < 0 || i10 >= e()) {
            return;
        }
        b bVarK2 = K2(wVar, f2(i10), i10);
        Y1(bVarK2.f7608a, i11, bVarK2);
    }

    private void c2(RecyclerView.w wVar, RecyclerView.b0 b0Var, int i10) {
        float fF2 = f2(i10);
        while (i10 < b0Var.b()) {
            float fZ1 = Z1(fF2, this.f7606z.g() / 2.0f);
            d dVarF2 = F2(this.f7606z.h(), fZ1, false);
            float fE2 = e2(fZ1, dVarF2);
            if (H2(fE2, dVarF2)) {
                return;
            }
            fF2 = Z1(fF2, this.f7606z.g());
            if (!I2(fE2, dVarF2)) {
                View viewO = wVar.o(i10);
                Y1(viewO, -1, new b(viewO, fZ1, fE2, dVarF2));
            }
            i10++;
        }
    }

    private void d2(RecyclerView.w wVar, int i10) {
        float fF2 = f2(i10);
        while (i10 >= 0) {
            float fZ1 = Z1(fF2, this.f7606z.g() / 2.0f);
            d dVarF2 = F2(this.f7606z.h(), fZ1, false);
            float fE2 = e2(fZ1, dVarF2);
            if (I2(fE2, dVarF2)) {
                return;
            }
            fF2 = a2(fF2, this.f7606z.g());
            if (!H2(fE2, dVarF2)) {
                View viewO = wVar.o(i10);
                Y1(viewO, 0, new b(viewO, fZ1, fE2, dVarF2));
            }
            i10--;
        }
    }

    private float e2(float f10, d dVar) {
        e.c cVar = dVar.f7614a;
        float f11 = cVar.f7648b;
        e.c cVar2 = dVar.f7615b;
        float fB = v8.a.b(f11, cVar2.f7648b, cVar.f7647a, cVar2.f7647a, f10);
        if (dVar.f7615b != this.f7606z.d() && dVar.f7614a != this.f7606z.k()) {
            return fB;
        }
        e.c cVar3 = dVar.f7615b;
        return fB + ((f10 - cVar3.f7647a) * (1.0f - cVar3.f7649c));
    }

    private float f2(int i10) {
        return Z1(A2() - this.f7599s, this.f7606z.g() * i10);
    }

    private int g2(RecyclerView.b0 b0Var, f fVar) {
        boolean zG2 = G2();
        e eVarL = zG2 ? fVar.l() : fVar.h();
        e.c cVarB = zG2 ? eVarL.b() : eVarL.i();
        int iB = (int) (((((b0Var.b() - 1) * eVarL.g()) * (zG2 ? -1.0f : 1.0f)) - (cVarB.f7647a - A2())) + (((zG2 ? -1 : 1) * cVarB.f7650d) / 2.0f));
        return zG2 ? Math.min(0, iB) : Math.max(0, iB);
    }

    private static int i2(int i10, int i11, int i12, int i13) {
        int i14 = i11 + i10;
        return i14 < i12 ? i12 - i11 : i14 > i13 ? i13 - i11 : i10;
    }

    private int j2(f fVar) {
        boolean zG2 = G2();
        e eVarH = zG2 ? fVar.h() : fVar.l();
        return (int) (A2() - a2((zG2 ? eVarH.i() : eVarH.b()).f7647a, eVarH.g() / 2.0f));
    }

    private int k2(int i10) {
        int iW2 = w2();
        if (i10 == 1) {
            return -1;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 17) {
            return iW2 == 0 ? G2() ? 1 : -1 : RtlSpacingHelper.UNDEFINED;
        }
        if (i10 == 33) {
            if (iW2 == 1) {
                return -1;
            }
            return RtlSpacingHelper.UNDEFINED;
        }
        if (i10 == 66) {
            return iW2 == 0 ? G2() ? -1 : 1 : RtlSpacingHelper.UNDEFINED;
        }
        if (i10 == 130) {
            if (iW2 == 1) {
                return 1;
            }
            return RtlSpacingHelper.UNDEFINED;
        }
        Log.d("CarouselLayoutManager", "Unknown focus request:" + i10);
        return RtlSpacingHelper.UNDEFINED;
    }

    private void l2(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        O2(wVar);
        if (O() == 0) {
            d2(wVar, this.A - 1);
            c2(wVar, b0Var, this.A);
        } else {
            int iL0 = l0(N(0));
            int iL02 = l0(N(O() - 1));
            d2(wVar, iL0 - 1);
            c2(wVar, b0Var, iL02 + 1);
        }
        Y2();
    }

    private View m2() {
        return N(G2() ? 0 : O() - 1);
    }

    private View n2() {
        return N(G2() ? O() - 1 : 0);
    }

    private int o2() {
        return f() ? a() : b();
    }

    private float p2(View view) {
        super.U(view, new Rect());
        return f() ? r0.centerX() : r0.centerY();
    }

    private int q2() {
        int i10;
        int i11;
        if (O() <= 0) {
            return 0;
        }
        RecyclerView.r rVar = (RecyclerView.r) N(0).getLayoutParams();
        if (this.C.f7624a == 0) {
            i10 = ((ViewGroup.MarginLayoutParams) rVar).leftMargin;
            i11 = ((ViewGroup.MarginLayoutParams) rVar).rightMargin;
        } else {
            i10 = ((ViewGroup.MarginLayoutParams) rVar).topMargin;
            i11 = ((ViewGroup.MarginLayoutParams) rVar).bottomMargin;
        }
        return i10 + i11;
    }

    private e r2(f fVar) {
        return G2() ? fVar.h() : fVar.l();
    }

    private e s2(int i10) {
        e eVar;
        Map map = this.B;
        return (map == null || (eVar = (e) map.get(Integer.valueOf(h0.a.b(i10, 0, Math.max(0, e() + (-1)))))) == null) ? this.f7605y.g() : eVar;
    }

    private int t2() {
        if (R()) {
            return 0;
        }
        return w2() == 1 ? k0() : i0();
    }

    private float u2(float f10, d dVar) {
        e.c cVar = dVar.f7614a;
        float f11 = cVar.f7650d;
        e.c cVar2 = dVar.f7615b;
        return v8.a.b(f11, cVar2.f7650d, cVar.f7648b, cVar2.f7648b, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int x2() {
        return this.C.d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int y2() {
        return this.C.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int z2() {
        return this.C.f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int A(RecyclerView.b0 b0Var) {
        return this.f7601u - this.f7600t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int B1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (p()) {
            return P2(i10, wVar, b0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void C1(int i10) {
        this.F = i10;
        if (this.f7605y == null) {
            return;
        }
        this.f7599s = D2(i10, s2(i10));
        this.A = h0.a.b(i10, 0, Math.max(0, e() - 1));
        W2(this.f7605y);
        y1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int D1(int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (q()) {
            return P2(i10, wVar, b0Var);
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void F0(View view, int i10, int i11) {
        throw new IllegalStateException("All children of a RecyclerView using CarouselLayoutManager must use MaskableFrameLayout as their root ViewGroup.");
    }

    boolean G2() {
        return f() && d0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public RecyclerView.r I() {
        return new RecyclerView.r(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void L0(RecyclerView recyclerView) {
        super.L0(recyclerView);
        this.f7604x.f(recyclerView.getContext());
        N2();
        recyclerView.addOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N0(RecyclerView recyclerView, RecyclerView.w wVar) {
        super.N0(recyclerView, wVar);
        recyclerView.removeOnLayoutChangeListener(this.D);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void N1(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        O1(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public View O0(View view, int i10, RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        int iK2;
        if (O() == 0 || (iK2 = k2(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        if (iK2 == -1) {
            if (l0(view) == 0) {
                return null;
            }
            b2(wVar, l0(N(0)) - 1, 0);
            return n2();
        }
        if (l0(view) == e() - 1) {
            return null;
        }
        b2(wVar, l0(N(O() - 1)) + 1, -1);
        return m2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void P0(AccessibilityEvent accessibilityEvent) {
        super.P0(accessibilityEvent);
        if (O() > 0) {
            accessibilityEvent.setFromIndex(l0(N(0)));
            accessibilityEvent.setToIndex(l0(N(O() - 1)));
        }
    }

    public void R2(int i10) {
        this.G = i10;
        N2();
    }

    public void T2(com.google.android.material.carousel.c cVar) {
        this.f7604x = cVar;
        N2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void U(View view, Rect rect) {
        super.U(view, rect);
        float fCenterY = rect.centerY();
        if (f()) {
            fCenterY = rect.centerX();
        }
        float fU2 = u2(fCenterY, F2(this.f7606z.h(), fCenterY, true));
        float fWidth = f() ? (rect.width() - fU2) / 2.0f : 0.0f;
        float fHeight = f() ? 0.0f : (rect.height() - fU2) / 2.0f;
        rect.set((int) (rect.left + fWidth), (int) (rect.top + fHeight), (int) (rect.right - fWidth), (int) (rect.bottom - fHeight));
    }

    public void U2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        l(null);
        com.google.android.material.carousel.b bVar = this.C;
        if (bVar == null || i10 != bVar.f7624a) {
            this.C = com.google.android.material.carousel.b.b(this, i10);
            N2();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void W0(RecyclerView recyclerView, int i10, int i11) {
        super.W0(recyclerView, i10, i11);
        X2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void X0(RecyclerView recyclerView) {
        super.X0(recyclerView);
        X2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void Z0(RecyclerView recyclerView, int i10, int i11) {
        super.Z0(recyclerView, i10, i11);
        X2();
    }

    @Override // z8.a
    public int a() {
        return s0();
    }

    @Override // z8.a
    public int b() {
        return b0();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.a0.b
    public PointF c(int i10) {
        if (this.f7605y == null) {
            return null;
        }
        int iV2 = v2(i10, s2(i10));
        return f() ? new PointF(iV2, 0.0f) : new PointF(0.0f, iV2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void c1(RecyclerView.w wVar, RecyclerView.b0 b0Var) {
        if (b0Var.b() <= 0 || o2() <= 0.0f) {
            p1(wVar);
            this.A = 0;
            return;
        }
        boolean zG2 = G2();
        f fVar = this.f7605y;
        boolean z10 = fVar == null;
        if (z10 || fVar.g().a() != o2()) {
            M2(wVar);
        }
        int iJ2 = j2(this.f7605y);
        int iG2 = g2(b0Var, this.f7605y);
        this.f7600t = zG2 ? iG2 : iJ2;
        if (zG2) {
            iG2 = iJ2;
        }
        this.f7601u = iG2;
        if (z10) {
            this.f7599s = iJ2;
            this.B = this.f7605y.i(e(), this.f7600t, this.f7601u, G2());
            int i10 = this.F;
            if (i10 != -1) {
                this.f7599s = D2(i10, s2(i10));
            }
        }
        int i11 = this.f7599s;
        this.f7599s = i11 + i2(0, i11, this.f7600t, this.f7601u);
        this.A = h0.a.b(this.A, 0, b0Var.b());
        W2(this.f7605y);
        B(wVar);
        l2(wVar, b0Var);
        this.E = e();
    }

    @Override // z8.a
    public int d() {
        return this.G;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public void d1(RecyclerView.b0 b0Var) {
        super.d1(b0Var);
        if (O() == 0) {
            this.A = 0;
        } else {
            this.A = l0(N(0));
        }
        Y2();
    }

    @Override // z8.a
    public boolean f() {
        return this.C.f7624a == 0;
    }

    int h2(int i10) {
        return (int) (this.f7599s - D2(i10, s2(i10)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean p() {
        return f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean q() {
        return !f();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int v(RecyclerView.b0 b0Var) {
        if (O() == 0 || this.f7605y == null || e() <= 1) {
            return 0;
        }
        return (int) (s0() * (this.f7605y.g().g() / x(b0Var)));
    }

    int v2(int i10, e eVar) {
        return D2(i10, eVar) - this.f7599s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int w(RecyclerView.b0 b0Var) {
        return this.f7599s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean w0() {
        return true;
    }

    public int w2() {
        return this.C.f7624a;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int x(RecyclerView.b0 b0Var) {
        return this.f7601u - this.f7600t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public boolean x1(RecyclerView recyclerView, View view, Rect rect, boolean z10, boolean z11) {
        int iE2;
        if (this.f7605y == null || (iE2 = E2(l0(view), s2(l0(view)))) == 0) {
            return false;
        }
        Q2(recyclerView, E2(l0(view), this.f7605y.j(this.f7599s + i2(iE2, this.f7599s, this.f7600t, this.f7601u), this.f7600t, this.f7601u)));
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int y(RecyclerView.b0 b0Var) {
        if (O() == 0 || this.f7605y == null || e() <= 1) {
            return 0;
        }
        return (int) (b0() * (this.f7605y.g().g() / A(b0Var)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.q
    public int z(RecyclerView.b0 b0Var) {
        return this.f7599s;
    }

    public CarouselLayoutManager(com.google.android.material.carousel.c cVar) {
        this(cVar, 0);
    }

    public CarouselLayoutManager(com.google.android.material.carousel.c cVar, int i10) {
        this.f7602v = false;
        this.f7603w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: z8.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.S1(this.f33022a, view, i11, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.F = -1;
        this.G = 0;
        T2(cVar);
        U2(i10);
    }

    public CarouselLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f7602v = false;
        this.f7603w = new c();
        this.A = 0;
        this.D = new View.OnLayoutChangeListener() { // from class: z8.b
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i112, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                CarouselLayoutManager.S1(this.f33022a, view, i112, i12, i13, i14, i15, i16, i17, i18);
            }
        };
        this.F = -1;
        this.G = 0;
        T2(new g());
        S2(context, attributeSet);
    }
}
