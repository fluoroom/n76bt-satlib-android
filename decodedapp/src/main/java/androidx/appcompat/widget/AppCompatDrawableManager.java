package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import androidx.appcompat.widget.ResourceManagerInternal;

/* JADX INFO: loaded from: classes.dex */
public final class AppCompatDrawableManager {
    private static final boolean DEBUG = false;
    private static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
    private static AppCompatDrawableManager INSTANCE = null;
    private static final String TAG = "AppCompatDrawableManag";
    private ResourceManagerInternal mResourceManager;

    /* JADX INFO: renamed from: androidx.appcompat.widget.AppCompatDrawableManager$1 */
    class AnonymousClass1 implements ResourceManagerInternal.ResourceManagerHooks {
        private final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = {h.e.R, h.e.P, h.e.f14814a};
        private final int[] TINT_COLOR_CONTROL_NORMAL = {h.e.f14828o, h.e.B, h.e.f14833t, h.e.f14829p, h.e.f14830q, h.e.f14832s, h.e.f14831r};
        private final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = {h.e.O, h.e.Q, h.e.f14824k, h.e.K, h.e.L, h.e.M, h.e.N};
        private final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = {h.e.f14836w, h.e.f14822i, h.e.f14835v};
        private final int[] TINT_COLOR_CONTROL_STATE_LIST = {h.e.J, h.e.S};
        private final int[] TINT_CHECKABLE_BUTTON_LIST = {h.e.f14816c, h.e.f14820g, h.e.f14817d, h.e.f14821h};

        AnonymousClass1() {
        }

        private boolean arrayContains(int[] iArr, int i10) {
            for (int i11 : iArr) {
                if (i11 == i10) {
                    return true;
                }
            }
            return false;
        }

        private ColorStateList createBorderlessButtonColorStateList(Context context) {
            return createButtonColorStateList(context, 0);
        }

        private ColorStateList createButtonColorStateList(Context context, int i10) {
            int themeAttrColor = ThemeUtils.getThemeAttrColor(context, h.a.J);
            return new ColorStateList(new int[][]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{ThemeUtils.getDisabledThemeAttrColor(context, h.a.H), d0.a.g(themeAttrColor, i10), d0.a.g(themeAttrColor, i10), i10});
        }

        private ColorStateList createColoredButtonColorStateList(Context context) {
            return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, h.a.G));
        }

        private ColorStateList createDefaultButtonColorStateList(Context context) {
            return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, h.a.H));
        }

        private ColorStateList createSwitchThumbColorStateList(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            int i10 = h.a.N;
            ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, i10);
            if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
                iArr[0] = ThemeUtils.DISABLED_STATE_SET;
                iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, i10);
                iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                iArr2[1] = ThemeUtils.getThemeAttrColor(context, h.a.I);
                iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                iArr2[2] = ThemeUtils.getThemeAttrColor(context, i10);
            } else {
                int[] iArr3 = ThemeUtils.DISABLED_STATE_SET;
                iArr[0] = iArr3;
                iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
                iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                iArr2[1] = ThemeUtils.getThemeAttrColor(context, h.a.I);
                iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                iArr2[2] = themeAttrColorStateList.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        private LayerDrawable getRatingBarLayerDrawable(ResourceManagerInternal resourceManagerInternal, Context context, int i10) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
            Drawable drawable = resourceManagerInternal.getDrawable(context, h.e.F);
            Drawable drawable2 = resourceManagerInternal.getDrawable(context, h.e.G);
            if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawable;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawable2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawable2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        private void setPorterDuffColorFilter(Drawable drawable, int i10, PorterDuff.Mode mode) {
            Drawable drawableMutate = drawable.mutate();
            if (mode == null) {
                mode = AppCompatDrawableManager.DEFAULT_MODE;
            }
            drawableMutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i10, mode));
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal, Context context, int i10) {
            if (i10 == h.e.f14823j) {
                return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, h.e.f14822i), resourceManagerInternal.getDrawable(context, h.e.f14824k)});
            }
            if (i10 == h.e.f14838y) {
                return getRatingBarLayerDrawable(resourceManagerInternal, context, h.d.f14807i);
            }
            if (i10 == h.e.f14837x) {
                return getRatingBarLayerDrawable(resourceManagerInternal, context, h.d.f14808j);
            }
            if (i10 == h.e.f14839z) {
                return getRatingBarLayerDrawable(resourceManagerInternal, context, h.d.f14809k);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public ColorStateList getTintListForDrawableRes(Context context, int i10) {
            if (i10 == h.e.f14826m) {
                return i.a.a(context, h.c.f14795e);
            }
            if (i10 == h.e.I) {
                return i.a.a(context, h.c.f14798h);
            }
            if (i10 == h.e.H) {
                return createSwitchThumbColorStateList(context);
            }
            if (i10 == h.e.f14819f) {
                return createDefaultButtonColorStateList(context);
            }
            if (i10 == h.e.f14815b) {
                return createBorderlessButtonColorStateList(context);
            }
            if (i10 == h.e.f14818e) {
                return createColoredButtonColorStateList(context);
            }
            if (i10 == h.e.D || i10 == h.e.E) {
                return i.a.a(context, h.c.f14797g);
            }
            if (arrayContains(this.TINT_COLOR_CONTROL_NORMAL, i10)) {
                return ThemeUtils.getThemeAttrColorStateList(context, h.a.K);
            }
            if (arrayContains(this.TINT_COLOR_CONTROL_STATE_LIST, i10)) {
                return i.a.a(context, h.c.f14794d);
            }
            if (arrayContains(this.TINT_CHECKABLE_BUTTON_LIST, i10)) {
                return i.a.a(context, h.c.f14793c);
            }
            if (i10 == h.e.A) {
                return i.a.a(context, h.c.f14796f);
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public PorterDuff.Mode getTintModeForDrawableRes(int i10) {
            if (i10 == h.e.H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        public boolean tintDrawable(Context context, int i10, Drawable drawable) {
            if (i10 == h.e.C) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                int i11 = h.a.K;
                setPorterDuffColorFilter(drawableFindDrawableByLayerId, ThemeUtils.getThemeAttrColor(context, i11), AppCompatDrawableManager.DEFAULT_MODE);
                setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, i11), AppCompatDrawableManager.DEFAULT_MODE);
                setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(R.id.progress), ThemeUtils.getThemeAttrColor(context, h.a.I), AppCompatDrawableManager.DEFAULT_MODE);
                return true;
            }
            if (i10 != h.e.f14838y && i10 != h.e.f14837x && i10 != h.e.f14839z) {
                return false;
            }
            LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(R.id.background), ThemeUtils.getDisabledThemeAttrColor(context, h.a.K), AppCompatDrawableManager.DEFAULT_MODE);
            Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
            int i12 = h.a.I;
            setPorterDuffColorFilter(drawableFindDrawableByLayerId2, ThemeUtils.getThemeAttrColor(context, i12), AppCompatDrawableManager.DEFAULT_MODE);
            setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(R.id.progress), ThemeUtils.getThemeAttrColor(context, i12), AppCompatDrawableManager.DEFAULT_MODE);
            return true;
        }

        /* JADX WARN: Removed duplicated region for block: B:49:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x0067 A[RETURN] */
        @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public boolean tintDrawableUsingColorFilter(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.AppCompatDrawableManager.access$000()
                int[] r1 = r6.COLORFILTER_TINT_COLOR_CONTROL_NORMAL
                boolean r1 = r6.arrayContains(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = h.a.K
            L11:
                r1 = r0
            L12:
                r0 = -1
                r5 = 1
                goto L50
            L15:
                int[] r1 = r6.COLORFILTER_COLOR_CONTROL_ACTIVATED
                boolean r1 = r6.arrayContains(r1, r8)
                if (r1 == 0) goto L20
                int r8 = h.a.I
                goto L11
            L20:
                int[] r1 = r6.COLORFILTER_COLOR_BACKGROUND_MULTIPLY
                boolean r1 = r6.arrayContains(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r8 = 16842801(0x1010031, float:2.3693695E-38)
                goto L12
            L32:
                int r1 = h.e.f14834u
                if (r8 != r1) goto L47
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r1 = r0
                r5 = 1
                r0 = r8
                r8 = 16842800(0x1010030, float:2.3693693E-38)
                goto L50
            L47:
                int r1 = h.e.f14825l
                if (r8 != r1) goto L4c
                goto L2d
            L4c:
                r1 = r0
                r8 = 0
                r0 = -1
                r5 = 0
            L50:
                if (r5 == 0) goto L67
                android.graphics.drawable.Drawable r9 = r9.mutate()
                int r7 = androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L66
                r9.setAlpha(r0)
            L66:
                return r2
            L67:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }
    }

    public static synchronized AppCompatDrawableManager get() {
        try {
            if (INSTANCE == null) {
                preload();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return INSTANCE;
    }

    public static synchronized PorterDuffColorFilter getPorterDuffColorFilter(int i10, PorterDuff.Mode mode) {
        return ResourceManagerInternal.getPorterDuffColorFilter(i10, mode);
    }

    public static synchronized void preload() {
        if (INSTANCE == null) {
            AppCompatDrawableManager appCompatDrawableManager = new AppCompatDrawableManager();
            INSTANCE = appCompatDrawableManager;
            appCompatDrawableManager.mResourceManager = ResourceManagerInternal.get();
            INSTANCE.mResourceManager.setHooks(new ResourceManagerInternal.ResourceManagerHooks() { // from class: androidx.appcompat.widget.AppCompatDrawableManager.1
                private final int[] COLORFILTER_TINT_COLOR_CONTROL_NORMAL = {h.e.R, h.e.P, h.e.f14814a};
                private final int[] TINT_COLOR_CONTROL_NORMAL = {h.e.f14828o, h.e.B, h.e.f14833t, h.e.f14829p, h.e.f14830q, h.e.f14832s, h.e.f14831r};
                private final int[] COLORFILTER_COLOR_CONTROL_ACTIVATED = {h.e.O, h.e.Q, h.e.f14824k, h.e.K, h.e.L, h.e.M, h.e.N};
                private final int[] COLORFILTER_COLOR_BACKGROUND_MULTIPLY = {h.e.f14836w, h.e.f14822i, h.e.f14835v};
                private final int[] TINT_COLOR_CONTROL_STATE_LIST = {h.e.J, h.e.S};
                private final int[] TINT_CHECKABLE_BUTTON_LIST = {h.e.f14816c, h.e.f14820g, h.e.f14817d, h.e.f14821h};

                AnonymousClass1() {
                }

                private boolean arrayContains(int[] iArr, int i10) {
                    for (int i11 : iArr) {
                        if (i11 == i10) {
                            return true;
                        }
                    }
                    return false;
                }

                private ColorStateList createBorderlessButtonColorStateList(Context context) {
                    return createButtonColorStateList(context, 0);
                }

                private ColorStateList createButtonColorStateList(Context context, int i10) {
                    int themeAttrColor = ThemeUtils.getThemeAttrColor(context, h.a.J);
                    return new ColorStateList(new int[][]{ThemeUtils.DISABLED_STATE_SET, ThemeUtils.PRESSED_STATE_SET, ThemeUtils.FOCUSED_STATE_SET, ThemeUtils.EMPTY_STATE_SET}, new int[]{ThemeUtils.getDisabledThemeAttrColor(context, h.a.H), d0.a.g(themeAttrColor, i10), d0.a.g(themeAttrColor, i10), i10});
                }

                private ColorStateList createColoredButtonColorStateList(Context context) {
                    return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, h.a.G));
                }

                private ColorStateList createDefaultButtonColorStateList(Context context) {
                    return createButtonColorStateList(context, ThemeUtils.getThemeAttrColor(context, h.a.H));
                }

                private ColorStateList createSwitchThumbColorStateList(Context context) {
                    int[][] iArr = new int[3][];
                    int[] iArr2 = new int[3];
                    int i10 = h.a.N;
                    ColorStateList themeAttrColorStateList = ThemeUtils.getThemeAttrColorStateList(context, i10);
                    if (themeAttrColorStateList == null || !themeAttrColorStateList.isStateful()) {
                        iArr[0] = ThemeUtils.DISABLED_STATE_SET;
                        iArr2[0] = ThemeUtils.getDisabledThemeAttrColor(context, i10);
                        iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                        iArr2[1] = ThemeUtils.getThemeAttrColor(context, h.a.I);
                        iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                        iArr2[2] = ThemeUtils.getThemeAttrColor(context, i10);
                    } else {
                        int[] iArr3 = ThemeUtils.DISABLED_STATE_SET;
                        iArr[0] = iArr3;
                        iArr2[0] = themeAttrColorStateList.getColorForState(iArr3, 0);
                        iArr[1] = ThemeUtils.CHECKED_STATE_SET;
                        iArr2[1] = ThemeUtils.getThemeAttrColor(context, h.a.I);
                        iArr[2] = ThemeUtils.EMPTY_STATE_SET;
                        iArr2[2] = themeAttrColorStateList.getDefaultColor();
                    }
                    return new ColorStateList(iArr, iArr2);
                }

                private LayerDrawable getRatingBarLayerDrawable(ResourceManagerInternal resourceManagerInternal, Context context, int i10) {
                    BitmapDrawable bitmapDrawable;
                    BitmapDrawable bitmapDrawable2;
                    BitmapDrawable bitmapDrawable3;
                    int dimensionPixelSize = context.getResources().getDimensionPixelSize(i10);
                    Drawable drawable = resourceManagerInternal.getDrawable(context, h.e.F);
                    Drawable drawable2 = resourceManagerInternal.getDrawable(context, h.e.G);
                    if ((drawable instanceof BitmapDrawable) && drawable.getIntrinsicWidth() == dimensionPixelSize && drawable.getIntrinsicHeight() == dimensionPixelSize) {
                        bitmapDrawable = (BitmapDrawable) drawable;
                        bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
                    } else {
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                        Canvas canvas = new Canvas(bitmapCreateBitmap);
                        drawable.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        drawable.draw(canvas);
                        bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                        bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
                    }
                    bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
                    if ((drawable2 instanceof BitmapDrawable) && drawable2.getIntrinsicWidth() == dimensionPixelSize && drawable2.getIntrinsicHeight() == dimensionPixelSize) {
                        bitmapDrawable3 = (BitmapDrawable) drawable2;
                    } else {
                        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                        Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                        drawable2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                        drawable2.draw(canvas2);
                        bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
                    }
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
                    layerDrawable.setId(0, R.id.background);
                    layerDrawable.setId(1, R.id.secondaryProgress);
                    layerDrawable.setId(2, R.id.progress);
                    return layerDrawable;
                }

                private void setPorterDuffColorFilter(Drawable drawable, int i10, PorterDuff.Mode mode) {
                    Drawable drawableMutate = drawable.mutate();
                    if (mode == null) {
                        mode = AppCompatDrawableManager.DEFAULT_MODE;
                    }
                    drawableMutate.setColorFilter(AppCompatDrawableManager.getPorterDuffColorFilter(i10, mode));
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public Drawable createDrawableFor(ResourceManagerInternal resourceManagerInternal, Context context, int i10) {
                    if (i10 == h.e.f14823j) {
                        return new LayerDrawable(new Drawable[]{resourceManagerInternal.getDrawable(context, h.e.f14822i), resourceManagerInternal.getDrawable(context, h.e.f14824k)});
                    }
                    if (i10 == h.e.f14838y) {
                        return getRatingBarLayerDrawable(resourceManagerInternal, context, h.d.f14807i);
                    }
                    if (i10 == h.e.f14837x) {
                        return getRatingBarLayerDrawable(resourceManagerInternal, context, h.d.f14808j);
                    }
                    if (i10 == h.e.f14839z) {
                        return getRatingBarLayerDrawable(resourceManagerInternal, context, h.d.f14809k);
                    }
                    return null;
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public ColorStateList getTintListForDrawableRes(Context context, int i10) {
                    if (i10 == h.e.f14826m) {
                        return i.a.a(context, h.c.f14795e);
                    }
                    if (i10 == h.e.I) {
                        return i.a.a(context, h.c.f14798h);
                    }
                    if (i10 == h.e.H) {
                        return createSwitchThumbColorStateList(context);
                    }
                    if (i10 == h.e.f14819f) {
                        return createDefaultButtonColorStateList(context);
                    }
                    if (i10 == h.e.f14815b) {
                        return createBorderlessButtonColorStateList(context);
                    }
                    if (i10 == h.e.f14818e) {
                        return createColoredButtonColorStateList(context);
                    }
                    if (i10 == h.e.D || i10 == h.e.E) {
                        return i.a.a(context, h.c.f14797g);
                    }
                    if (arrayContains(this.TINT_COLOR_CONTROL_NORMAL, i10)) {
                        return ThemeUtils.getThemeAttrColorStateList(context, h.a.K);
                    }
                    if (arrayContains(this.TINT_COLOR_CONTROL_STATE_LIST, i10)) {
                        return i.a.a(context, h.c.f14794d);
                    }
                    if (arrayContains(this.TINT_CHECKABLE_BUTTON_LIST, i10)) {
                        return i.a.a(context, h.c.f14793c);
                    }
                    if (i10 == h.e.A) {
                        return i.a.a(context, h.c.f14796f);
                    }
                    return null;
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public PorterDuff.Mode getTintModeForDrawableRes(int i10) {
                    if (i10 == h.e.H) {
                        return PorterDuff.Mode.MULTIPLY;
                    }
                    return null;
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public boolean tintDrawable(Context context, int i10, Drawable drawable) {
                    if (i10 == h.e.C) {
                        LayerDrawable layerDrawable = (LayerDrawable) drawable;
                        Drawable drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.background);
                        int i11 = h.a.K;
                        setPorterDuffColorFilter(drawableFindDrawableByLayerId, ThemeUtils.getThemeAttrColor(context, i11), AppCompatDrawableManager.DEFAULT_MODE);
                        setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(R.id.secondaryProgress), ThemeUtils.getThemeAttrColor(context, i11), AppCompatDrawableManager.DEFAULT_MODE);
                        setPorterDuffColorFilter(layerDrawable.findDrawableByLayerId(R.id.progress), ThemeUtils.getThemeAttrColor(context, h.a.I), AppCompatDrawableManager.DEFAULT_MODE);
                        return true;
                    }
                    if (i10 != h.e.f14838y && i10 != h.e.f14837x && i10 != h.e.f14839z) {
                        return false;
                    }
                    LayerDrawable layerDrawable2 = (LayerDrawable) drawable;
                    setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(R.id.background), ThemeUtils.getDisabledThemeAttrColor(context, h.a.K), AppCompatDrawableManager.DEFAULT_MODE);
                    Drawable drawableFindDrawableByLayerId2 = layerDrawable2.findDrawableByLayerId(R.id.secondaryProgress);
                    int i12 = h.a.I;
                    setPorterDuffColorFilter(drawableFindDrawableByLayerId2, ThemeUtils.getThemeAttrColor(context, i12), AppCompatDrawableManager.DEFAULT_MODE);
                    setPorterDuffColorFilter(layerDrawable2.findDrawableByLayerId(R.id.progress), ThemeUtils.getThemeAttrColor(context, i12), AppCompatDrawableManager.DEFAULT_MODE);
                    return true;
                }

                @Override // androidx.appcompat.widget.ResourceManagerInternal.ResourceManagerHooks
                public boolean tintDrawableUsingColorFilter(Context v10, int v11, Drawable v12) {
                    /*
                        this = this;
                        android.graphics.PorterDuff$Mode r0 = androidx.appcompat.widget.AppCompatDrawableManager.access$000()
                        int[] r1 = r6.COLORFILTER_TINT_COLOR_CONTROL_NORMAL
                        boolean r1 = r6.arrayContains(r1, r8)
                        r2 = 1
                        r3 = 0
                        r4 = -1
                        if (r1 == 0) goto L15
                        int r8 = h.a.K
                    L11:
                        r1 = r0
                    L12:
                        r0 = -1
                        r5 = 1
                        goto L50
                    L15:
                        int[] r1 = r6.COLORFILTER_COLOR_CONTROL_ACTIVATED
                        boolean r1 = r6.arrayContains(r1, r8)
                        if (r1 == 0) goto L20
                        int r8 = h.a.I
                        goto L11
                    L20:
                        int[] r1 = r6.COLORFILTER_COLOR_BACKGROUND_MULTIPLY
                        boolean r1 = r6.arrayContains(r1, r8)
                        r5 = 16842801(0x1010031, float:2.3693695E-38)
                        if (r1 == 0) goto L32
                        android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
                    L2d:
                        r1 = r0
                        r8 = 16842801(0x1010031, float:2.3693695E-38)
                        goto L12
                    L32:
                        int r1 = h.e.f14834u
                        if (r8 != r1) goto L47
                        r8 = 1109603123(0x42233333, float:40.8)
                        int r8 = java.lang.Math.round(r8)
                        r1 = 16842800(0x1010030, float:2.3693693E-38)
                        r1 = r0
                        r5 = 1
                        r0 = r8
                        r8 = 16842800(0x1010030, float:2.3693693E-38)
                        goto L50
                    L47:
                        int r1 = h.e.f14825l
                        if (r8 != r1) goto L4c
                        goto L2d
                    L4c:
                        r1 = r0
                        r8 = 0
                        r0 = -1
                        r5 = 0
                    L50:
                        if (r5 == 0) goto L67
                        android.graphics.drawable.Drawable r9 = r9.mutate()
                        int r7 = androidx.appcompat.widget.ThemeUtils.getThemeAttrColor(r7, r8)
                        android.graphics.PorterDuffColorFilter r7 = androidx.appcompat.widget.AppCompatDrawableManager.getPorterDuffColorFilter(r7, r1)
                        r9.setColorFilter(r7)
                        if (r0 == r4) goto L66
                        r9.setAlpha(r0)
                    L66:
                        return r2
                    L67:
                        return r3
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatDrawableManager.AnonymousClass1.tintDrawableUsingColorFilter(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
                }
            });
        }
    }

    static void tintDrawable(Drawable drawable, TintInfo tintInfo, int[] iArr) {
        ResourceManagerInternal.tintDrawable(drawable, tintInfo, iArr);
    }

    public synchronized Drawable getDrawable(Context context, int i10) {
        return this.mResourceManager.getDrawable(context, i10);
    }

    synchronized ColorStateList getTintList(Context context, int i10) {
        return this.mResourceManager.getTintList(context, i10);
    }

    public synchronized void onConfigurationChanged(Context context) {
        this.mResourceManager.onConfigurationChanged(context);
    }

    synchronized Drawable onDrawableLoadedFromResources(Context context, VectorEnabledTintResources vectorEnabledTintResources, int i10) {
        return this.mResourceManager.onDrawableLoadedFromResources(context, vectorEnabledTintResources, i10);
    }

    boolean tintDrawableUsingColorFilter(Context context, int i10, Drawable drawable) {
        return this.mResourceManager.tintDrawableUsingColorFilter(context, i10, drawable);
    }

    synchronized Drawable getDrawable(Context context, int i10, boolean z10) {
        return this.mResourceManager.getDrawable(context, i10, z10);
    }
}
