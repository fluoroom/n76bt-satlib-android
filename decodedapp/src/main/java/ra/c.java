package ra;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowManager;
import dd.v;
import rd.m;

/* JADX INFO: loaded from: classes3.dex */
public class c implements va.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f25662a;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f25663a;

        static {
            int[] iArr = new int[ua.b.values().length];
            try {
                iArr[ua.b.f29006b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ua.b.f29013r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ua.b.f29007c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ua.b.f29014s.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ua.b.f29008d.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ua.b.f29015t.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ua.b.f29009e.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ua.b.f29016u.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ua.b.f29005a.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ua.b.f29010f.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ua.b.f29017v.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ua.b.f29011g.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ua.b.f29018w.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            f25663a = iArr;
        }
    }

    public c(long j10) {
        this.f25662a = j10;
    }

    private final Animator d(final View view, final WindowManager.LayoutParams layoutParams, final WindowManager windowManager, ua.b bVar, boolean z10) {
        final v vVarG = g(view, layoutParams, windowManager, bVar);
        final ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(((Number) (z10 ? vVarG.e() : vVarG.d())).intValue(), ((Number) (z10 ? vVarG.d() : vVarG.e())).intValue());
        valueAnimatorOfInt.setDuration(this.f25662a);
        valueAnimatorOfInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: ra.b
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                c.e(vVarG, layoutParams, windowManager, view, valueAnimatorOfInt, valueAnimator);
            }
        });
        m.d(valueAnimatorOfInt, "apply(...)");
        return valueAnimatorOfInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(v vVar, WindowManager.LayoutParams layoutParams, WindowManager windowManager, View view, ValueAnimator valueAnimator, ValueAnimator valueAnimator2) {
        m.e(valueAnimator2, "it");
        try {
            Object animatedValue = valueAnimator2.getAnimatedValue();
            m.c(animatedValue, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) animatedValue).intValue();
            if (((Boolean) vVar.f()).booleanValue()) {
                layoutParams.x = iIntValue;
            } else {
                layoutParams.y = iIntValue;
            }
            windowManager.updateViewLayout(view, layoutParams);
        } catch (Exception unused) {
            valueAnimator.cancel();
        }
    }

    private final int f(View view, WindowManager.LayoutParams layoutParams) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        if (iArr[1] == layoutParams.y) {
            return ya.b.f32457a.o(view);
        }
        return 0;
    }

    private final v g(View view, WindowManager.LayoutParams layoutParams, WindowManager windowManager, ua.b bVar) {
        int i10;
        int right;
        int i11;
        int i12;
        int i13;
        int iF;
        int bottom;
        Rect rect = new Rect();
        windowManager.getDefaultDisplay().getRectSize(rect);
        int i14 = layoutParams.x;
        int right2 = rect.right - (view.getRight() + i14);
        int i15 = layoutParams.y;
        int bottom2 = rect.bottom - (view.getBottom() + i15);
        int iMin = Math.min(i14, right2);
        int iMin2 = Math.min(i15, bottom2);
        boolean z10 = false;
        switch (a.f25663a[bVar.ordinal()]) {
            case 1:
            case 2:
                i10 = layoutParams.x;
                right = view.getRight();
                i11 = -right;
                z10 = true;
                break;
            case 3:
            case 4:
                i10 = layoutParams.x;
                i11 = rect.right;
                z10 = true;
                break;
            case 5:
            case 6:
                i10 = layoutParams.y;
                i11 = -view.getBottom();
                break;
            case 7:
            case 8:
                i12 = layoutParams.y;
                i13 = rect.bottom;
                iF = f(view, layoutParams);
                i11 = iF + i13;
                i10 = i12;
                break;
            case 9:
            case 10:
            case 11:
                i10 = layoutParams.x;
                if (i14 >= right2) {
                    i11 = rect.right;
                    z10 = true;
                } else {
                    right = view.getRight();
                    i11 = -right;
                    z10 = true;
                }
                break;
            case 12:
            case 13:
                i12 = layoutParams.y;
                if (i15 >= bottom2) {
                    i13 = rect.bottom;
                    iF = f(view, layoutParams);
                    i11 = iF + i13;
                    i10 = i12;
                } else {
                    bottom = view.getBottom();
                    i11 = -bottom;
                    i10 = i12;
                }
                break;
            default:
                if (iMin > iMin2) {
                    i12 = layoutParams.y;
                    if (i15 >= bottom2) {
                        i13 = rect.bottom;
                        iF = f(view, layoutParams);
                        i11 = iF + i13;
                        i10 = i12;
                    } else {
                        bottom = view.getBottom();
                        i11 = -bottom;
                        i10 = i12;
                    }
                } else {
                    i10 = layoutParams.x;
                    if (i14 >= right2) {
                        i11 = rect.right;
                        z10 = true;
                    } else {
                        right = view.getRight();
                        i11 = -right;
                        z10 = true;
                    }
                }
                break;
        }
        return new v(Integer.valueOf(i11), Integer.valueOf(i10), Boolean.valueOf(z10));
    }

    @Override // va.c
    public Animator a(View view, WindowManager.LayoutParams layoutParams, WindowManager windowManager, ua.b bVar) {
        m.e(view, "view");
        m.e(layoutParams, "params");
        m.e(windowManager, "windowManager");
        m.e(bVar, "sidePattern");
        return d(view, layoutParams, windowManager, bVar, true);
    }

    @Override // va.c
    public Animator b(View view, WindowManager.LayoutParams layoutParams, WindowManager windowManager, ua.b bVar) {
        m.e(view, "view");
        m.e(layoutParams, "params");
        m.e(windowManager, "windowManager");
        m.e(bVar, "sidePattern");
        return d(view, layoutParams, windowManager, bVar, false);
    }
}
