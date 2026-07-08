package sa;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f27131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ta.a f27132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Rect f27133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f27134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f27135e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f27136f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f27137g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f27138h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f27139i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private float f27140j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f27141k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f27142l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f27143m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f27144n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f27145o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f27146p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f27147q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final int[] f27148r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f27149s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f27150t;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27151a;

        static {
            int[] iArr = new int[ua.b.values().length];
            try {
                iArr[ua.b.f29006b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ua.b.f29007c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ua.b.f29008d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ua.b.f29009e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ua.b.f29010f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ua.b.f29011g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ua.b.f29012h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ua.b.f29013r.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ua.b.f29014s.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ua.b.f29015t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ua.b.f29016u.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ua.b.f29017v.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ua.b.f29018w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ua.b.f29019x.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            f27151a = iArr;
        }
    }

    public static final class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f27153b;

        b(View view) {
            this.f27153b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m.e(animator, "animation");
            g.this.c(this.f27153b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.e(animator, "animation");
            g.this.c(this.f27153b);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            m.e(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.e(animator, "animation");
            g.this.d().G(true);
        }
    }

    public g(Context context, ta.a aVar) {
        m.e(context, "context");
        m.e(aVar, "config");
        this.f27131a = context;
        this.f27132b = aVar;
        this.f27133c = new Rect();
        this.f27148r = new int[2];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(View view) {
        this.f27132b.G(false);
        va.d dVarC = this.f27132b.c();
        if (dVarC != null) {
            dVarC.c(view);
        }
        this.f27132b.h();
    }

    private final void e(View view, WindowManager.LayoutParams layoutParams) {
        Rect rectE = ya.b.e(ya.b.f32457a, this.f27131a, null, 2, null);
        this.f27134d = rectE.height();
        this.f27135e = rectE.width();
        Log.d("FW", this.f27135e + " x " + this.f27134d);
        view.getLocationOnScreen(this.f27148r);
        this.f27149s = this.f27148r[1] > layoutParams.y ? i(view) : 0;
        this.f27150t = (this.f27134d - view.getHeight()) - this.f27149s;
        this.f27136f = Math.max(0, this.f27132b.r());
        this.f27138h = Math.min(this.f27135e, this.f27132b.w()) - view.getWidth();
        ua.a aVarX = this.f27132b.x();
        ua.a aVar = ua.a.f28999a;
        this.f27137g = aVarX == aVar ? this.f27132b.m() ? this.f27132b.z() : this.f27132b.z() + i(view) : this.f27132b.m() ? this.f27132b.z() - i(view) : this.f27132b.z();
        this.f27139i = this.f27132b.x() == aVar ? this.f27132b.m() ? Math.min(this.f27150t, this.f27132b.b() - view.getHeight()) : Math.min(this.f27150t, (this.f27132b.b() + i(view)) - view.getHeight()) : this.f27132b.m() ? Math.min(this.f27150t, (this.f27132b.b() - i(view)) - view.getHeight()) : Math.min(this.f27150t, this.f27132b.b() - view.getHeight());
    }

    private final void f(WindowManager.LayoutParams layoutParams) {
        int i10 = layoutParams.x;
        int i11 = i10 - this.f27136f;
        this.f27142l = i11;
        int i12 = this.f27138h - i10;
        this.f27143m = i12;
        int i13 = layoutParams.y;
        this.f27144n = i13 - this.f27137g;
        this.f27145o = this.f27139i - i13;
        this.f27146p = Math.min(i11, i12);
        this.f27147q = Math.min(this.f27144n, this.f27145o);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void g(final android.view.View r8, final android.view.WindowManager.LayoutParams r9, final android.view.WindowManager r10) {
        /*
            r7 = this;
            r7.f(r9)
            ta.a r0 = r7.f27132b
            ua.b r0 = r0.y()
            int[] r1 = sa.g.a.f27151a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 0
            r2 = 1
            switch(r0) {
                case 8: goto L5a;
                case 9: goto L55;
                case 10: goto L52;
                case 11: goto L4f;
                case 12: goto L43;
                case 13: goto L37;
                case 14: goto L17;
                default: goto L16;
            }
        L16:
            return
        L17:
            int r0 = r7.f27146p
            int r3 = r7.f27147q
            if (r0 >= r3) goto L2a
            int r0 = r7.f27142l
            int r1 = r7.f27143m
            if (r0 >= r1) goto L26
            int r0 = r7.f27136f
            goto L5c
        L26:
            int r0 = r9.x
        L28:
            int r0 = r0 + r1
            goto L5c
        L2a:
            int r0 = r7.f27144n
            int r2 = r7.f27145o
            if (r0 >= r2) goto L34
            int r0 = r7.f27137g
        L32:
            r2 = 0
            goto L5c
        L34:
            int r0 = r7.f27139i
            goto L32
        L37:
            int r0 = r7.f27144n
            int r2 = r7.f27145o
            if (r0 >= r2) goto L40
            int r0 = r7.f27137g
            goto L32
        L40:
            int r0 = r7.f27139i
            goto L32
        L43:
            int r0 = r7.f27142l
            int r1 = r7.f27143m
            if (r0 >= r1) goto L4c
            int r0 = r7.f27136f
            goto L5c
        L4c:
            int r0 = r9.x
            goto L28
        L4f:
            int r0 = r7.f27139i
            goto L32
        L52:
            int r0 = r7.f27137g
            goto L32
        L55:
            int r0 = r9.x
            int r1 = r7.f27143m
            goto L28
        L5a:
            int r0 = r7.f27136f
        L5c:
            if (r2 == 0) goto L61
            int r1 = r9.x
            goto L63
        L61:
            int r1 = r9.y
        L63:
            int[] r0 = new int[]{r1, r0}
            android.animation.ValueAnimator r6 = android.animation.ValueAnimator.ofInt(r0)
            sa.f r1 = new sa.f
            r5 = r8
            r3 = r9
            r4 = r10
            r1.<init>()
            r6.addUpdateListener(r1)
            sa.g$b r8 = new sa.g$b
            r8.<init>(r5)
            r6.addListener(r8)
            r6.start()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.g.g(android.view.View, android.view.WindowManager$LayoutParams, android.view.WindowManager):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(boolean z10, WindowManager.LayoutParams layoutParams, WindowManager windowManager, View view, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        m.e(valueAnimator2, "it");
        try {
            if (z10) {
                Object animatedValue = valueAnimator2.getAnimatedValue();
                m.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.x = ((Integer) animatedValue).intValue();
            } else {
                Object animatedValue2 = valueAnimator2.getAnimatedValue();
                m.c(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
                layoutParams.y = ((Integer) animatedValue2).intValue();
            }
            windowManager.updateViewLayout(view, layoutParams);
        } catch (Exception unused) {
            valueAnimator.cancel();
        }
    }

    private final int i(View view) {
        return ya.b.f32457a.o(view);
    }

    public final ta.a d() {
        return this.f27132b;
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x00ea A[PHI: r4
      0x00ea: PHI (r4v41 int) = (r4v18 int), (r4v19 int) binds: [B:47:0x00e8, B:57:0x0101] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.view.View r9, android.view.MotionEvent r10, android.view.WindowManager r11, android.view.WindowManager.LayoutParams r12) {
        /*
            Method dump skipped, instruction units count: 588
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sa.g.j(android.view.View, android.view.MotionEvent, android.view.WindowManager, android.view.WindowManager$LayoutParams):void");
    }

    public final void k(View view, WindowManager.LayoutParams layoutParams, WindowManager windowManager) {
        m.e(view, "view");
        m.e(layoutParams, "params");
        m.e(windowManager, "windowManager");
        e(view, layoutParams);
        g(view, layoutParams, windowManager);
    }
}
