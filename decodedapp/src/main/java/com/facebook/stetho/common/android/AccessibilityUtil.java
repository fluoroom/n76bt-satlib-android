package com.facebook.stetho.common.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.HorizontalScrollView;
import android.widget.ScrollView;
import android.widget.Spinner;
import java.util.List;
import m0.o0;
import n0.x;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityUtil {
    private AccessibilityUtil() {
    }

    public static boolean hasFocusableAncestor(x xVar, View view) {
        if (xVar == null || view == null) {
            return false;
        }
        Object objH = o0.H(view);
        if (!(objH instanceof View)) {
            return false;
        }
        x xVarF0 = x.f0();
        try {
            o0.Z((View) objH, xVarF0);
            if (xVarF0 == null) {
                return false;
            }
            if (isAccessibilityFocusable(xVarF0, (View) objH)) {
                return true;
            }
            return hasFocusableAncestor(xVarF0, (View) objH);
        } finally {
            xVarF0.j0();
        }
    }

    public static boolean hasNonActionableSpeakingDescendants(x xVar, View view) {
        if (xVar != null && view != null && (view instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt != null) {
                    x xVarF0 = x.f0();
                    try {
                        o0.Z(childAt, xVarF0);
                        if (!isAccessibilityFocusable(xVarF0, childAt) && isSpeakingNode(xVarF0, childAt)) {
                            xVarF0.j0();
                            return true;
                        }
                    } finally {
                        xVarF0.j0();
                    }
                }
            }
        }
        return false;
    }

    public static boolean hasText(x xVar) {
        if (xVar == null) {
            return false;
        }
        return (TextUtils.isEmpty(xVar.G()) && TextUtils.isEmpty(xVar.v())) ? false : true;
    }

    public static boolean isAccessibilityFocusable(x xVar, View view) {
        if (xVar == null || view == null || !xVar.e0()) {
            return false;
        }
        if (isActionableForAccessibility(xVar)) {
            return true;
        }
        return isTopLevelScrollItem(xVar, view) && isSpeakingNode(xVar, view);
    }

    public static boolean isActionableForAccessibility(x xVar) {
        if (xVar == null) {
            return false;
        }
        if (!xVar.Q() && !xVar.Y() && !xVar.U()) {
            List listI = xVar.i();
            if (!listI.contains(16) && !listI.contains(32) && !listI.contains(1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSpeakingNode(x xVar, View view) {
        int iA;
        if (xVar == null || view == null || !xVar.e0() || (iA = o0.A(view)) == 4 || (iA == 2 && xVar.r() <= 0)) {
            return false;
        }
        return xVar.O() || hasText(xVar) || hasNonActionableSpeakingDescendants(xVar, view);
    }

    public static boolean isTopLevelScrollItem(x xVar, View view) {
        View view2;
        if (xVar == null || view == null || (view2 = (View) o0.H(view)) == null) {
            return false;
        }
        if (xVar.a0()) {
            return true;
        }
        List listI = xVar.i();
        if (!listI.contains(4096) && !listI.contains(8192)) {
            if (view2 instanceof Spinner) {
                return false;
            }
            if (!(view2 instanceof AdapterView) && !(view2 instanceof ScrollView) && !(view2 instanceof HorizontalScrollView)) {
                return false;
            }
        }
        return true;
    }
}
