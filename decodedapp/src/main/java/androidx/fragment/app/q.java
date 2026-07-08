package androidx.fragment.app;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes.dex */
abstract class q {
    private static int a(o oVar, boolean z10, boolean z11) {
        return z11 ? z10 ? oVar.D1() : oVar.E1() : z10 ? oVar.l1() : oVar.o1();
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x006f A[Catch: RuntimeException -> 0x0075, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0075, blocks: (B:32:0x0069, B:34:0x006f), top: B:45:0x0069 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static androidx.fragment.app.q.a b(android.content.Context r4, androidx.fragment.app.o r5, boolean r6, boolean r7) {
        /*
            int r0 = r5.z1()
            int r7 = a(r5, r6, r7)
            r1 = 0
            r5.D3(r1, r1, r1, r1)
            android.view.ViewGroup r1 = r5.S
            r2 = 0
            if (r1 == 0) goto L1e
            int r3 = x0.b.f31539c
            java.lang.Object r1 = r1.getTag(r3)
            if (r1 == 0) goto L1e
            android.view.ViewGroup r1 = r5.S
            r1.setTag(r3, r2)
        L1e:
            android.view.ViewGroup r1 = r5.S
            if (r1 == 0) goto L29
            android.animation.LayoutTransition r1 = r1.getLayoutTransition()
            if (r1 == 0) goto L29
            return r2
        L29:
            android.view.animation.Animation r1 = r5.s2(r0, r6, r7)
            if (r1 == 0) goto L35
            androidx.fragment.app.q$a r4 = new androidx.fragment.app.q$a
            r4.<init>(r1)
            return r4
        L35:
            android.animation.Animator r5 = r5.t2(r0, r6, r7)
            if (r5 == 0) goto L41
            androidx.fragment.app.q$a r4 = new androidx.fragment.app.q$a
            r4.<init>(r5)
            return r4
        L41:
            if (r7 != 0) goto L49
            if (r0 == 0) goto L49
            int r7 = d(r4, r0, r6)
        L49:
            if (r7 == 0) goto L85
            android.content.res.Resources r5 = r4.getResources()
            java.lang.String r5 = r5.getResourceTypeName(r7)
            java.lang.String r6 = "anim"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto L69
            android.view.animation.Animation r6 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            if (r6 == 0) goto L85
            androidx.fragment.app.q$a r0 = new androidx.fragment.app.q$a     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            r0.<init>(r6)     // Catch: android.content.res.Resources.NotFoundException -> L67 java.lang.RuntimeException -> L69
            return r0
        L67:
            r4 = move-exception
            throw r4
        L69:
            android.animation.Animator r6 = android.animation.AnimatorInflater.loadAnimator(r4, r7)     // Catch: java.lang.RuntimeException -> L75
            if (r6 == 0) goto L85
            androidx.fragment.app.q$a r0 = new androidx.fragment.app.q$a     // Catch: java.lang.RuntimeException -> L75
            r0.<init>(r6)     // Catch: java.lang.RuntimeException -> L75
            return r0
        L75:
            r6 = move-exception
            if (r5 != 0) goto L84
            android.view.animation.Animation r4 = android.view.animation.AnimationUtils.loadAnimation(r4, r7)
            if (r4 == 0) goto L85
            androidx.fragment.app.q$a r5 = new androidx.fragment.app.q$a
            r5.<init>(r4)
            return r5
        L84:
            throw r6
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.q.b(android.content.Context, androidx.fragment.app.o, boolean, boolean):androidx.fragment.app.q$a");
    }

    private static int c(Context context, int i10) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i10});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    private static int d(Context context, int i10, boolean z10) {
        if (i10 == 4097) {
            return z10 ? x0.a.f31535e : x0.a.f31536f;
        }
        if (i10 == 8194) {
            return z10 ? x0.a.f31531a : x0.a.f31532b;
        }
        if (i10 == 8197) {
            return z10 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i10 == 4099) {
            return z10 ? x0.a.f31533c : x0.a.f31534d;
        }
        if (i10 != 4100) {
            return -1;
        }
        return z10 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f2441a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AnimatorSet f2442b;

        a(Animation animation) {
            this.f2441a = animation;
            this.f2442b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        a(Animator animator) {
            this.f2441a = null;
            AnimatorSet animatorSet = new AnimatorSet();
            this.f2442b = animatorSet;
            animatorSet.play(animator);
            if (animator == null) {
                throw new IllegalStateException("Animator cannot be null");
            }
        }
    }

    static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ViewGroup f2443a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final View f2444b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2445c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f2446d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f2447e;

        b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f2447e = true;
            this.f2443a = viewGroup;
            this.f2444b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation) {
            this.f2447e = true;
            if (this.f2445c) {
                return !this.f2446d;
            }
            if (!super.getTransformation(j10, transformation)) {
                this.f2445c = true;
                m0.e0.a(this.f2443a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2445c || !this.f2447e) {
                this.f2443a.endViewTransition(this.f2444b);
                this.f2446d = true;
            } else {
                this.f2447e = false;
                this.f2443a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j10, Transformation transformation, float f10) {
            this.f2447e = true;
            if (this.f2445c) {
                return !this.f2446d;
            }
            if (!super.getTransformation(j10, transformation, f10)) {
                this.f2445c = true;
                m0.e0.a(this.f2443a, this);
            }
            return true;
        }
    }
}
