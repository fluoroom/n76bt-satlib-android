package c6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f4461a = null;

    public static void a(View view) {
        view.destroyDrawingCache();
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                a(viewGroup.getChildAt(i10));
            }
        }
    }

    public static Bitmap b(View view) {
        return c(view, false);
    }

    public static Bitmap c(View view, boolean z10) {
        if (view.getParent() == null) {
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        }
        int width = view.getWidth();
        int height = view.getHeight();
        if (z10) {
            width = Math.max(width, height);
            height = width;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_4444);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        if (z10) {
            canvas.translate((width - view.getWidth()) / 2.0f, (height - view.getHeight()) / 2.0f);
        }
        view.draw(canvas);
        try {
            canvas.setBitmap(null);
        } catch (Exception unused) {
        }
        return bitmapCreateBitmap;
    }

    public static int d() {
        return View.generateViewId();
    }

    public static boolean e(ListView listView) {
        if (listView == null) {
            return false;
        }
        int count = listView.getCount();
        return count <= listView.getLastVisiblePosition() + 1 || count < listView.getSelectedItemPosition();
    }

    public static boolean f(View view, float f10) {
        view.setAlpha(f10);
        return true;
    }

    public static boolean g(View view) {
        CharSequence contentDescription = view.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            return false;
        }
        return h(view, contentDescription);
    }

    public static boolean h(View view, CharSequence charSequence) {
        int[] iArr = new int[2];
        Rect rect = new Rect();
        view.getLocationOnScreen(iArr);
        view.getWindowVisibleDisplayFrame(rect);
        Context context = view.getContext();
        int width = view.getWidth();
        int height = view.getHeight();
        int i10 = iArr[0] + (width / 2);
        int i11 = iArr[1] + (height / 2);
        Toast toastMakeText = Toast.makeText(context, charSequence, 0);
        int i12 = i11 - (height * 2);
        int i13 = rect.top;
        if (i12 > i13) {
            toastMakeText.setGravity(85, rect.right - i10, context.getResources().getDisplayMetrics().heightPixels - iArr[1]);
        } else {
            toastMakeText.setGravity(53, rect.right - i10, (iArr[1] + height) - i13);
        }
        toastMakeText.show();
        return true;
    }
}
