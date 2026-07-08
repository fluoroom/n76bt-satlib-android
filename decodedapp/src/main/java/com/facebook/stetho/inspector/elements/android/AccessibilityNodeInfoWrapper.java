package com.facebook.stetho.inspector.elements.android;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.EditText;
import com.facebook.stetho.common.android.AccessibilityUtil;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import m0.o0;
import n0.x;

/* JADX INFO: loaded from: classes.dex */
public final class AccessibilityNodeInfoWrapper {
    public static x createNodeInfoFromView(View view) {
        x xVarF0 = x.f0();
        o0.Z(view, xVarF0);
        return xVarF0;
    }

    public static String getActions(View view) {
        x xVarCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            StringBuilder sb2 = new StringBuilder();
            for (x.a aVar : xVarCreateNodeInfoFromView.i()) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                int iB = aVar.b();
                if (iB == 1) {
                    sb2.append("focus");
                } else if (iB != 2) {
                    switch (iB) {
                        case 4:
                            sb2.append("select");
                            break;
                        case 8:
                            sb2.append("clear-selection");
                            break;
                        case 16:
                            sb2.append("click");
                            break;
                        case 32:
                            sb2.append("long-click");
                            break;
                        case 64:
                            sb2.append("accessibility-focus");
                            break;
                        case 128:
                            sb2.append("clear-accessibility-focus");
                            break;
                        case 256:
                            sb2.append("next-at-movement-granularity");
                            break;
                        case WXMediaMessage.TITLE_LENGTH_LIMIT /* 512 */:
                            sb2.append("previous-at-movement-granularity");
                            break;
                        case WXMediaMessage.DESCRIPTION_LENGTH_LIMIT /* 1024 */:
                            sb2.append("next-html-element");
                            break;
                        case 2048:
                            sb2.append("previous-html-element");
                            break;
                        case 4096:
                            sb2.append("scroll-forward");
                            break;
                        case 8192:
                            sb2.append("scroll-backward");
                            break;
                        case 16384:
                            sb2.append("copy");
                            break;
                        case 32768:
                            sb2.append("paste");
                            break;
                        case WXMediaMessage.THUMB_LENGTH_LIMIT /* 65536 */:
                            sb2.append("cut");
                            break;
                        case WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT /* 131072 */:
                            sb2.append("set-selection");
                            break;
                        default:
                            CharSequence charSequenceC = aVar.c();
                            if (charSequenceC != null) {
                                sb2.append(charSequenceC);
                            } else {
                                sb2.append("unknown");
                            }
                            break;
                    }
                } else {
                    sb2.append("clear-focus");
                }
            }
            String string = sb2.length() > 0 ? sb2.toString() : null;
            xVarCreateNodeInfoFromView.j0();
            return string;
        } catch (Throwable th2) {
            xVarCreateNodeInfoFromView.j0();
            throw th2;
        }
    }

    public static CharSequence getDescription(View view) {
        x xVarCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            CharSequence charSequenceV = xVarCreateNodeInfoFromView.v();
            CharSequence charSequenceG = xVarCreateNodeInfoFromView.G();
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceG);
            boolean z10 = view instanceof EditText;
            if (!TextUtils.isEmpty(charSequenceV) && (!z10 || zIsEmpty)) {
                xVarCreateNodeInfoFromView.j0();
                return charSequenceV;
            }
            if (!zIsEmpty) {
                xVarCreateNodeInfoFromView.j0();
                return charSequenceG;
            }
            if (!(view instanceof ViewGroup)) {
                xVarCreateNodeInfoFromView.j0();
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                x xVarF0 = x.f0();
                o0.Z(childAt, xVarF0);
                CharSequence description = (!AccessibilityUtil.isSpeakingNode(xVarF0, childAt) || AccessibilityUtil.isAccessibilityFocusable(xVarF0, childAt)) ? null : getDescription(childAt);
                if (!TextUtils.isEmpty(description)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(description);
                }
                xVarF0.j0();
            }
            String string = sb2.length() > 0 ? sb2.toString() : null;
            xVarCreateNodeInfoFromView.j0();
            return string;
        } catch (Throwable th2) {
            xVarCreateNodeInfoFromView.j0();
            throw th2;
        }
    }

    public static String getFocusableReasons(View view) {
        x xVarCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            boolean zHasText = AccessibilityUtil.hasText(xVarCreateNodeInfoFromView);
            boolean zO = xVarCreateNodeInfoFromView.O();
            boolean zHasNonActionableSpeakingDescendants = AccessibilityUtil.hasNonActionableSpeakingDescendants(xVarCreateNodeInfoFromView, view);
            if (AccessibilityUtil.isActionableForAccessibility(xVarCreateNodeInfoFromView)) {
                if (xVarCreateNodeInfoFromView.r() <= 0) {
                    return "View is actionable and has no children.";
                }
                if (zHasText) {
                    return "View is actionable and has a description.";
                }
                if (zO) {
                    return "View is actionable and checkable.";
                }
                if (zHasNonActionableSpeakingDescendants) {
                    return "View is actionable and has non-actionable descendants with descriptions.";
                }
            }
            if (AccessibilityUtil.isTopLevelScrollItem(xVarCreateNodeInfoFromView, view)) {
                if (zHasText) {
                    return "View is a direct child of a scrollable container and has a description.";
                }
                if (zO) {
                    return "View is a direct child of a scrollable container and is checkable.";
                }
                if (zHasNonActionableSpeakingDescendants) {
                    return "View is a direct child of a scrollable container and has non-actionable descendants with descriptions.";
                }
            }
            if (zHasText) {
                return "View has a description and is not actionable, but has no actionable ancestor.";
            }
            xVarCreateNodeInfoFromView.j0();
            return null;
        } finally {
            xVarCreateNodeInfoFromView.j0();
        }
    }

    public static boolean getIgnored(View view) {
        int iA = o0.A(view);
        if (iA == 2 || iA == 4) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (o0.A((View) parent) == 4) {
                return true;
            }
        }
        x xVarCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            if (!xVarCreateNodeInfoFromView.e0()) {
                return true;
            }
            if (!AccessibilityUtil.isAccessibilityFocusable(xVarCreateNodeInfoFromView, view)) {
                return AccessibilityUtil.hasFocusableAncestor(xVarCreateNodeInfoFromView, view) || !AccessibilityUtil.hasText(xVarCreateNodeInfoFromView);
            }
            if (xVarCreateNodeInfoFromView.r() <= 0) {
                return false;
            }
            return !AccessibilityUtil.isSpeakingNode(xVarCreateNodeInfoFromView, view);
        } finally {
            xVarCreateNodeInfoFromView.j0();
        }
    }

    public static String getIgnoredReasons(View view) {
        int iA = o0.A(view);
        if (iA == 2) {
            return "View has importantForAccessibility set to 'NO'.";
        }
        if (iA == 4) {
            return "View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
        }
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            if (o0.A((View) parent) == 4) {
                return "An ancestor View has importantForAccessibility set to 'NO_HIDE_DESCENDANTS'.";
            }
        }
        x xVarCreateNodeInfoFromView = createNodeInfoFromView(view);
        try {
            return !xVarCreateNodeInfoFromView.e0() ? "View is not visible." : AccessibilityUtil.isAccessibilityFocusable(xVarCreateNodeInfoFromView, view) ? "View is actionable, but has no description." : AccessibilityUtil.hasText(xVarCreateNodeInfoFromView) ? "View is not actionable, and an ancestor View has co-opted its description." : "View is not actionable and has no description.";
        } finally {
            xVarCreateNodeInfoFromView.j0();
        }
    }

    public static boolean getIsAccessibilityFocused(View view) {
        x xVarCreateNodeInfoFromView = createNodeInfoFromView(view);
        boolean zN = xVarCreateNodeInfoFromView.N();
        xVarCreateNodeInfoFromView.j0();
        return zN;
    }
}
