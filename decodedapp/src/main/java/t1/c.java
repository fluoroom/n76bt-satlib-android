package t1;

import android.util.TypedValue;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final TypedValue f27453a = new TypedValue();

    public static Object a(View view, int i10, String str, Class cls) {
        try {
            return cls.cast(view);
        } catch (ClassCastException e10) {
            throw new IllegalStateException("View '" + e(view, i10) + "' with ID " + i10 + " for " + str + " was of the wrong type. See cause for more info.", e10);
        }
    }

    public static Object b(View view, int i10, String str, Class cls) {
        return a(view.findViewById(i10), i10, str, cls);
    }

    public static View c(View view, int i10, String str) {
        View viewFindViewById = view.findViewById(i10);
        if (viewFindViewById != null) {
            return viewFindViewById;
        }
        throw new IllegalStateException("Required view '" + e(view, i10) + "' with ID " + i10 + " for " + str + " was not found. If this view is optional add '@Nullable' (fields) or '@Optional' (methods) annotation.");
    }

    public static Object d(View view, int i10, String str, Class cls) {
        return a(c(view, i10, str), i10, str, cls);
    }

    private static String e(View view, int i10) {
        return view.isInEditMode() ? "<unavailable while editing>" : view.getContext().getResources().getResourceEntryName(i10);
    }
}
