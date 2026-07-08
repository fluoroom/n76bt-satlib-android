package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import v8.c;
import v8.f;
import v8.g;
import v8.h;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f8553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final RectF f8554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final RectF f8555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f8556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f8557g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f8558h;

    class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f8559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f8560b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f8561c;

        a(boolean z10, View view, View view2) {
            this.f8559a = z10;
            this.f8560b = view;
            this.f8561c = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f8559a) {
                return;
            }
            this.f8560b.setVisibility(4);
            this.f8561c.setAlpha(1.0f);
            this.f8561c.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f8559a) {
                this.f8560b.setVisibility(0);
                this.f8561c.setAlpha(0.0f);
                this.f8561c.setVisibility(4);
            }
        }
    }

    protected static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public f f8563a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h f8564b;

        protected b() {
        }
    }

    public FabTransformationBehavior() {
        this.f8553c = new Rect();
        this.f8554d = new RectF();
        this.f8555e = new RectF();
        this.f8556f = new int[2];
    }

    private ViewGroup K(View view) {
        View viewFindViewById = view.findViewById(u8.f.B);
        return viewFindViewById != null ? a0(viewFindViewById) : a0(view);
    }

    private void L(View view, b bVar, g gVar, g gVar2, float f10, float f11, float f12, float f13, RectF rectF) {
        float fQ = Q(bVar, gVar, f10, f12);
        float fQ2 = Q(bVar, gVar2, f11, f13);
        Rect rect = this.f8553c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f8554d;
        rectF2.set(rect);
        RectF rectF3 = this.f8555e;
        R(view, rectF3);
        rectF3.offset(fQ, fQ2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    private void M(View view, RectF rectF) {
        R(view, rectF);
        rectF.offset(this.f8557g, this.f8558h);
    }

    private Pair N(float f10, float f11, boolean z10, b bVar) {
        g gVarE;
        g gVarE2;
        if (f10 == 0.0f || f11 == 0.0f) {
            gVarE = bVar.f8563a.e("translationXLinear");
            gVarE2 = bVar.f8563a.e("translationYLinear");
        } else if ((!z10 || f11 >= 0.0f) && (z10 || f11 <= 0.0f)) {
            gVarE = bVar.f8563a.e("translationXCurveDownwards");
            gVarE2 = bVar.f8563a.e("translationYCurveDownwards");
        } else {
            gVarE = bVar.f8563a.e("translationXCurveUpwards");
            gVarE2 = bVar.f8563a.e("translationYCurveUpwards");
        }
        return new Pair(gVarE, gVarE2);
    }

    private float O(View view, View view2, h hVar) {
        float fCenterX;
        float fCenterX2;
        float f10;
        RectF rectF = this.f8554d;
        RectF rectF2 = this.f8555e;
        M(view, rectF);
        R(view2, rectF2);
        int i10 = hVar.f30509a & 7;
        if (i10 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i10 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i10 != 5) {
                f10 = 0.0f;
                return f10 + hVar.f30510b;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f10 = fCenterX - fCenterX2;
        return f10 + hVar.f30510b;
    }

    private float P(View view, View view2, h hVar) {
        float fCenterY;
        float fCenterY2;
        float f10;
        RectF rectF = this.f8554d;
        RectF rectF2 = this.f8555e;
        M(view, rectF);
        R(view2, rectF2);
        int i10 = hVar.f30509a & 112;
        if (i10 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i10 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i10 != 80) {
                f10 = 0.0f;
                return f10 + hVar.f30511c;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f10 = fCenterY - fCenterY2;
        return f10 + hVar.f30511c;
    }

    private float Q(b bVar, g gVar, float f10, float f11) {
        long jC = gVar.c();
        long jD = gVar.d();
        g gVarE = bVar.f8563a.e("expansion");
        return v8.a.a(f10, f11, gVar.e().getInterpolation((((gVarE.c() + gVarE.d()) + 17) - jC) / jD));
    }

    private void R(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f8556f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    private void S(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
        ViewGroup viewGroupK;
        ObjectAnimator objectAnimatorOfFloat;
        if ((view2 instanceof ViewGroup) && (viewGroupK = K(view2)) != null) {
            if (z10) {
                if (!z11) {
                    c.f30497a.set(viewGroupK, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, (Property<ViewGroup, Float>) c.f30497a, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupK, (Property<ViewGroup, Float>) c.f30497a, 0.0f);
            }
            bVar.f8563a.e("contentFade").a(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    private void T(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
    }

    private void U(View view, View view2, boolean z10, b bVar, List list) {
        float fO = O(view, view2, bVar.f8564b);
        float fP = P(view, view2, bVar.f8564b);
        Pair pairN = N(fO, fP, z10, bVar);
        g gVar = (g) pairN.first;
        g gVar2 = (g) pairN.second;
        Property property = View.TRANSLATION_X;
        if (!z10) {
            fO = this.f8557g;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fO);
        Property property2 = View.TRANSLATION_Y;
        if (!z10) {
            fP = this.f8558h;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fP);
        gVar.a(objectAnimatorOfFloat);
        gVar2.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private void V(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float elevation = view2.getElevation() - view.getElevation();
        if (z10) {
            if (!z11) {
                view2.setTranslationZ(-elevation);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -elevation);
        }
        bVar.f8563a.e("elevation").a(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    private void W(View view, View view2, boolean z10, boolean z11, b bVar, float f10, float f11, List list, List list2) {
    }

    private void X(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2) {
    }

    private void Y(View view, View view2, boolean z10, boolean z11, b bVar, List list, List list2, RectF rectF) {
        g gVar;
        g gVar2;
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fO = O(view, view2, bVar.f8564b);
        float fP = P(view, view2, bVar.f8564b);
        Pair pairN = N(fO, fP, z10, bVar);
        g gVar3 = (g) pairN.first;
        g gVar4 = (g) pairN.second;
        if (z10) {
            if (!z11) {
                view2.setTranslationX(-fO);
                view2.setTranslationY(-fP);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            gVar = gVar4;
            gVar2 = gVar3;
            L(view2, bVar, gVar2, gVar, -fO, -fP, 0.0f, 0.0f, rectF);
        } else {
            gVar = gVar4;
            gVar2 = gVar3;
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fO);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fP);
        }
        gVar2.a(objectAnimatorOfFloat);
        gVar.a(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private ViewGroup a0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    protected AnimatorSet J(View view, View view2, boolean z10, boolean z11) {
        b bVarZ = Z(view2.getContext(), z10);
        if (z10) {
            this.f8557g = view.getTranslationX();
            this.f8558h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        V(view, view2, z10, z11, bVarZ, arrayList, arrayList2);
        RectF rectF = this.f8554d;
        Y(view, view2, z10, z11, bVarZ, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        U(view, view2, z10, bVarZ, arrayList);
        X(view, view2, z10, z11, bVarZ, arrayList, arrayList2);
        W(view, view2, z10, z11, bVarZ, fWidth, fHeight, arrayList, arrayList2);
        T(view, view2, z10, z11, bVarZ, arrayList, arrayList2);
        S(view, view2, z10, z11, bVarZ, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        v8.b.a(animatorSet, arrayList);
        animatorSet.addListener(new a(z10, view2, view));
        int size = arrayList2.size();
        for (int i10 = 0; i10 < size; i10++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i10));
        }
        return animatorSet;
    }

    protected abstract b Z(Context context, boolean z10);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void g(CoordinatorLayout.f fVar) {
        if (fVar.f1879h == 0) {
            fVar.f1879h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8553c = new Rect();
        this.f8554d = new RectF();
        this.f8555e = new RectF();
        this.f8556f = new int[2];
    }
}
