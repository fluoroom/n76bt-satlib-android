package u3;

import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.ViewUtils;
import java.lang.reflect.InvocationTargetException;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes.dex */
public abstract class v extends c6.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static int f28037b = -16711936;

    public static boolean i(ViewGroup viewGroup) {
        return viewGroup.getClipToPadding();
    }

    public static Point j(View view, View view2) {
        Point point = new Point();
        point.x += view.getLeft();
        point.y += view.getTop();
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof View) && view != view2) {
            view = parent;
            point.x += view.getLeft();
            point.y += view.getTop();
            parent = view.getParent();
        }
        if (view == view2) {
            return point;
        }
        throw new InvalidParameterException("view not in parent");
    }

    public static boolean k(View view) {
        for (ViewParent parent = view.getParent(); parent != null && (parent instanceof ViewGroup); parent = parent.getParent()) {
            if (((ViewGroup) parent).shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    public static boolean l(View view) {
        return ViewUtils.isLayoutRtl(view);
    }

    public static void m(ViewGroup viewGroup) {
        try {
            a6.s.a(viewGroup, "resolvePadding");
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
        }
    }
}
