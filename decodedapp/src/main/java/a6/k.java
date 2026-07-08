package a6;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.Display;
import android.view.WindowManager;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static k f335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Matrix.ScaleToFit[] f336d = {Matrix.ScaleToFit.FILL, Matrix.ScaleToFit.START, Matrix.ScaleToFit.CENTER, Matrix.ScaleToFit.END};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f337a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f338b;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f339a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f339a = iArr;
            try {
                iArr[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f339a[ImageView.ScaleType.FIT_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f339a[ImageView.ScaleType.FIT_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f339a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f339a[ImageView.ScaleType.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f339a[ImageView.ScaleType.CENTER_CROP.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f339a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public k(Resources resources) {
        this.f338b = resources.getDisplayMetrics().density;
        this.f337a = resources.getDimension(k3.d.f19174h);
    }

    public static int b(Context context, float f10) {
        return (int) Math.ceil(c(context).a(f10));
    }

    public static k c(Context context) {
        if (f335c == null) {
            f335c = new k(context.getResources());
        }
        return f335c;
    }

    public static int d(Context context) {
        return e(context).y;
    }

    public static Point e(Context context) {
        WindowManager windowManager = context instanceof Activity ? ((Activity) context).getWindowManager() : (WindowManager) context.getSystemService("window");
        Point point = new Point();
        Display defaultDisplay = windowManager.getDefaultDisplay();
        if (defaultDisplay == null) {
            return point;
        }
        defaultDisplay.getRealSize(point);
        return point;
    }

    public static int g(Context context, float f10) {
        return (int) Math.ceil(c(context).f(f10));
    }

    public static Matrix.ScaleToFit h(ImageView.ScaleType scaleType) {
        return f336d[scaleType.ordinal() - 1];
    }

    public static Bitmap i(Bitmap bitmap, int i10, int i11) {
        return k(bitmap, i10, i11, ImageView.ScaleType.FIT_XY);
    }

    public static Bitmap j(Bitmap bitmap, int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        float f10;
        float f11;
        Paint paint;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i14 = 0;
        boolean z10 = i12 > 0 || i13 > 0;
        if (width == i10 && height == i11 && !z10) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f12 = 0.0f;
        switch (a.f339a[scaleType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                matrix.setRectToRect(new RectF(0.0f, 0.0f, width, height), new RectF(0.0f, 0.0f, i10, i11), h(scaleType));
                break;
            case 5:
                matrix.setTranslate((int) (((i10 - width) * 0.5f) + 0.5f), (int) (((i11 - height) * 0.5f) + 0.5f));
                break;
            case 6:
                if (width * i11 > i10 * height) {
                    f10 = i11 / height;
                    f12 = (i10 - (width * f10)) * 0.5f;
                    f11 = 0.0f;
                } else {
                    f10 = i10 / width;
                    f11 = (i11 - (height * f10)) * 0.5f;
                }
                matrix.setScale(f10, f10);
                matrix.postTranslate((int) (f12 + 0.5f), (int) (f11 + 0.5f));
                break;
            case 7:
                float fMin = (width > i10 || height > i11) ? Math.min(i10 / width, i11 / height) : 1.0f;
                matrix.setScale(fMin, fMin);
                matrix.postTranslate((int) (((i10 - (width * fMin)) * 0.5f) + 0.5f), (int) (((i11 - (height * fMin)) * 0.5f) + 0.5f));
                break;
            default:
                throw new IllegalArgumentException("Don't support " + scaleType);
        }
        Paint paint2 = new Paint(3);
        Canvas canvas = new Canvas();
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i10, i11, Bitmap.Config.ARGB_8888);
        canvas.setBitmap(bitmapCreateBitmap);
        if (z10) {
            paint2.setColor(-1);
            Paint paint3 = new Paint();
            paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            int iSaveLayer = canvas.saveLayer(null, paint2, 31);
            canvas.drawRoundRect(0.0f, 0.0f, i10, i11, i12, i13, paint2);
            paint = paint2;
            canvas.saveLayer(null, paint3, 31);
            i14 = iSaveLayer;
        } else {
            paint = paint2;
        }
        canvas.drawBitmap(bitmap, matrix, paint);
        if (z10) {
            canvas.restoreToCount(i14);
        }
        try {
            canvas.setBitmap(null);
        } catch (Exception unused) {
        }
        return bitmapCreateBitmap;
    }

    public static Bitmap k(Bitmap bitmap, int i10, int i11, ImageView.ScaleType scaleType) {
        return j(bitmap, i10, i11, 0, 0, scaleType);
    }

    public static Matrix l(int i10, int i11, int i12, int i13, ImageView.ScaleType scaleType) {
        float f10;
        float f11;
        if (i10 == i12 && i11 == i13) {
            return null;
        }
        Matrix matrix = new Matrix();
        float f12 = 0.0f;
        switch (a.f339a[scaleType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                matrix.setRectToRect(new RectF(0.0f, 0.0f, i10, i11), new RectF(0.0f, 0.0f, i12, i13), h(scaleType));
                return matrix;
            case 5:
                matrix.setTranslate((int) (((i12 - i10) * 0.5f) + 0.5f), (int) (((i13 - i11) * 0.5f) + 0.5f));
                return matrix;
            case 6:
                if (i10 * i13 > i12 * i11) {
                    f11 = i13 / i11;
                    f12 = (i12 - (i10 * f11)) * 0.5f;
                    f10 = 0.0f;
                } else {
                    float f13 = i12 / i10;
                    f10 = (i13 - (i11 * f13)) * 0.5f;
                    f11 = f13;
                }
                matrix.setScale(f11, f11);
                matrix.postTranslate((int) (f12 + 0.5f), (int) (f10 + 0.5f));
                return matrix;
            case 7:
                float fMin = (i10 > i12 || i11 > i13) ? Math.min(i12 / i10, i13 / i11) : 1.0f;
                matrix.setScale(fMin, fMin);
                matrix.postTranslate((int) (((i12 - (i10 * fMin)) * 0.5f) + 0.5f), (int) (((i13 - (i11 * fMin)) * 0.5f) + 0.5f));
                return matrix;
            default:
                throw new IllegalArgumentException("Don't support " + scaleType);
        }
    }

    public float a(float f10) {
        return f10 * this.f338b;
    }

    public float f(float f10) {
        return f10 * this.f337a;
    }
}
