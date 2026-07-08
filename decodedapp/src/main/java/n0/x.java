package n0;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import n0.a0;

/* JADX INFO: loaded from: classes.dex */
public class x {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static int f22364d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AccessibilityNodeInfo f22365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f22366b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22367c = -1;

    public static class a {
        public static final a A;
        public static final a B;
        public static final a C;
        public static final a D;
        public static final a E;
        public static final a F;
        public static final a G;
        public static final a H;
        public static final a I;
        public static final a J;
        public static final a K;
        public static final a L;
        public static final a M;
        public static final a N;
        public static final a O;
        public static final a P;
        public static final a Q;
        public static final a R;
        public static final a S;
        public static final a T;
        public static final a U;
        public static final a V;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final a f22368e = new a(1, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f22369f = new a(2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f22370g = new a(4, null);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f22371h = new a(8, null);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final a f22372i = new a(16, null);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final a f22373j = new a(32, null);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final a f22374k = new a(64, null);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final a f22375l = new a(128, null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final a f22376m = new a(256, (CharSequence) null, a0.b.class);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final a f22377n = new a(WXMediaMessage.TITLE_LENGTH_LIMIT, (CharSequence) null, a0.b.class);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final a f22378o = new a(WXMediaMessage.DESCRIPTION_LENGTH_LIMIT, (CharSequence) null, a0.c.class);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final a f22379p = new a(2048, (CharSequence) null, a0.c.class);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final a f22380q = new a(4096, null);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final a f22381r = new a(8192, null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final a f22382s = new a(16384, null);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final a f22383t = new a(32768, null);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final a f22384u = new a(WXMediaMessage.THUMB_LENGTH_LIMIT, null);

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public static final a f22385v = new a(WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT, (CharSequence) null, a0.g.class);

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public static final a f22386w = new a(262144, null);

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final a f22387x = new a(524288, null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public static final a f22388y = new a(1048576, null);

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public static final a f22389z = new a(2097152, (CharSequence) null, a0.h.class);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f22390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f22391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Class f22392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected final a0 f22393d;

        static {
            int i10 = Build.VERSION.SDK_INT;
            A = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null, R.id.accessibilityActionShowOnScreen, null, null, null);
            B = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null, R.id.accessibilityActionScrollToPosition, null, null, a0.e.class);
            C = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null, R.id.accessibilityActionScrollUp, null, null, null);
            D = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null, R.id.accessibilityActionScrollLeft, null, null, null);
            E = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null, R.id.accessibilityActionScrollDown, null, null, null);
            F = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null, R.id.accessibilityActionScrollRight, null, null, null);
            G = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
            H = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
            I = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
            J = new a(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
            K = new a(i10 >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null, R.id.accessibilityActionContextClick, null, null, null);
            L = new a(i10 >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null, R.id.accessibilityActionSetProgress, null, null, a0.f.class);
            M = new a(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, a0.d.class);
            N = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
            O = new a(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
            P = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
            Q = new a(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
            R = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
            S = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
            T = new a(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
            U = new a(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
            V = new a(i10 >= 34 ? d.a() : null, R.id.accessibilityActionScrollInDirection, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        public a a(CharSequence charSequence, a0 a0Var) {
            return new a(null, this.f22391b, charSequence, a0Var, this.f22392c);
        }

        public int b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f22390a).getId();
        }

        public CharSequence c() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.f22390a).getLabel();
        }

        public boolean d(View view, Bundle bundle) {
            if (this.f22393d == null) {
                return false;
            }
            Class cls = this.f22392c;
            if (cls != null) {
                try {
                    android.support.v4.media.session.b.a(cls.getDeclaredConstructor(null).newInstance(null));
                    throw null;
                } catch (Exception e10) {
                    Class cls2 = this.f22392c;
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e10);
                }
            }
            return this.f22393d.a(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f22390a;
            return obj2 == null ? aVar.f22390a == null : obj2.equals(aVar.f22390a);
        }

        public int hashCode() {
            Object obj = this.f22390a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccessibilityActionCompat: ");
            String strJ = x.j(this.f22391b);
            if (strJ.equals("ACTION_UNKNOWN") && c() != null) {
                strJ = c().toString();
            }
            sb2.append(strJ);
            return sb2.toString();
        }

        public a(int i10, CharSequence charSequence, a0 a0Var) {
            this(null, i10, charSequence, a0Var, null);
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, a0 a0Var, Class cls) {
            this.f22391b = i10;
            this.f22393d = a0Var;
            if (obj == null) {
                this.f22390a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f22390a = obj;
            }
            this.f22392c = cls;
        }
    }

    private static class b {
        public static CharSequence a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getStateDescription();
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, CharSequence charSequence) {
            accessibilityNodeInfo.setStateDescription(charSequence);
        }
    }

    private static class c {
        public static String a(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getUniqueId();
        }

        public static boolean b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isTextSelectable();
        }
    }

    private static class d {
        public static AccessibilityNodeInfo.AccessibilityAction a() {
            return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
        }

        public static void b(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect) {
            accessibilityNodeInfo.getBoundsInWindow(rect);
        }

        public static CharSequence c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getContainerTitle();
        }

        public static boolean d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isAccessibilityDataSensitive();
        }
    }

    private static class e {
        /* JADX INFO: Access modifiers changed from: private */
        public static int b(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getChecked();
        }

        public static int c(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getExpandedState();
        }

        public static CharSequence d(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.getSupplementalDescription();
        }

        public static boolean e(AccessibilityNodeInfo accessibilityNodeInfo) {
            return accessibilityNodeInfo.isFieldRequired();
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f22394a;

        f(Object obj) {
            this.f22394a = obj;
        }

        public static f a(int i10, int i11, boolean z10, int i12) {
            return new f(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12));
        }
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f22395a;

        g(Object obj) {
            this.f22395a = obj;
        }

        public static g a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            return new g(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11));
        }
    }

    private x(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f22365a = accessibilityNodeInfo;
    }

    private SparseArray B(View view) {
        SparseArray sparseArrayD = D(view);
        if (sparseArrayD != null) {
            return sparseArrayD;
        }
        SparseArray sparseArray = new SparseArray();
        view.setTag(z.b.I, sparseArray);
        return sparseArray;
    }

    private SparseArray D(View view) {
        return (SparseArray) view.getTag(z.b.I);
    }

    private boolean K() {
        return !h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    private int L(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i10)).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f22364d;
        f22364d = i11 + 1;
        return i11;
    }

    public static x Y0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new x(accessibilityNodeInfo);
    }

    private void e(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    public static x f0() {
        return Y0(AccessibilityNodeInfo.obtain());
    }

    private void g() {
        this.f22365a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f22365a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f22365a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f22365a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    public static x g0(View view) {
        return Y0(AccessibilityNodeInfo.obtain(view));
    }

    private List h(String str) {
        ArrayList<Integer> integerArrayList = this.f22365a.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        this.f22365a.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public static x h0(x xVar) {
        return Y0(AccessibilityNodeInfo.obtain(xVar.f22365a));
    }

    static String j(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case WXMediaMessage.TITLE_LENGTH_LIMIT /* 512 */:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case WXMediaMessage.DESCRIPTION_LENGTH_LIMIT /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case WXMediaMessage.THUMB_LENGTH_LIMIT /* 65536 */:
                return "ACTION_CUT";
            case WXMediaMessage.MINI_PROGRAM__THUMB_LENGHT /* 131072 */:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionScrollInDirection:
                return "ACTION_SCROLL_IN_DIRECTION";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                switch (i10) {
                                    case R.id.accessibilityActionImeEnter:
                                        return "ACTION_IME_ENTER";
                                    case R.id.accessibilityActionDragStart:
                                        return "ACTION_DRAG_START";
                                    case R.id.accessibilityActionDragDrop:
                                        return "ACTION_DRAG_DROP";
                                    case R.id.accessibilityActionDragCancel:
                                        return "ACTION_DRAG_CANCEL";
                                    default:
                                        return "ACTION_UNKNOWN";
                                }
                        }
                }
        }
    }

    private boolean l(int i10) {
        Bundle bundleZ = z();
        return bundleZ != null && (bundleZ.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) == i10;
    }

    private void l0(View view) {
        SparseArray sparseArrayD = D(view);
        if (sparseArrayD != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < sparseArrayD.size(); i10++) {
                if (((WeakReference) sparseArrayD.valueAt(i10)).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                sparseArrayD.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    private void n0(int i10, boolean z10) {
        Bundle bundleZ = z();
        if (bundleZ != null) {
            int i11 = bundleZ.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i10);
            if (!z10) {
                i10 = 0;
            }
            bundleZ.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    private String q() {
        int iP = p();
        return iP == 1 ? "TRUE" : iP == 2 ? "PARTIAL" : "FALSE";
    }

    public static ClickableSpan[] t(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    static String y(int i10) {
        return i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? "UNKNOWN" : "FULL" : "PARTIAL" : "COLLAPSED" : "UNDEFINED";
    }

    public int A() {
        return this.f22365a.getMaxTextLength();
    }

    public void A0(CharSequence charSequence) {
        this.f22365a.setError(charSequence);
    }

    public void B0(boolean z10) {
        this.f22365a.setFocusable(z10);
    }

    public CharSequence C() {
        return this.f22365a.getPackageName();
    }

    public void C0(boolean z10) {
        this.f22365a.setFocused(z10);
    }

    public void D0(boolean z10) {
        n0(67108864, z10);
    }

    public CharSequence E() {
        return Build.VERSION.SDK_INT >= 30 ? b.a(this.f22365a) : this.f22365a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
    }

    public void E0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f22365a.setHeading(z10);
        } else {
            n0(2, z10);
        }
    }

    public CharSequence F() {
        return Build.VERSION.SDK_INT >= 36 ? e.d(this.f22365a) : this.f22365a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.SUPPLEMENTAL_DESCRIPTION_KEY");
    }

    public void F0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f22365a.setHintText(charSequence);
        } else {
            this.f22365a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public CharSequence G() {
        if (!K()) {
            return this.f22365a.getText();
        }
        List listH = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List listH2 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List listH3 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List listH4 = h("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.f22365a.getText(), 0, this.f22365a.getText().length()));
        for (int i10 = 0; i10 < listH.size(); i10++) {
            spannableString.setSpan(new n0.a(((Integer) listH4.get(i10)).intValue(), this, z().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) listH.get(i10)).intValue(), ((Integer) listH2.get(i10)).intValue(), ((Integer) listH3.get(i10)).intValue());
        }
        return spannableString;
    }

    public void G0(View view) {
        this.f22365a.setLabelFor(view);
    }

    public CharSequence H() {
        return Build.VERSION.SDK_INT >= 28 ? this.f22365a.getTooltipText() : this.f22365a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
    }

    public void H0(int i10) {
        this.f22365a.setMaxTextLength(i10);
    }

    public String I() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this.f22365a) : this.f22365a.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
    }

    public void I0(CharSequence charSequence) {
        this.f22365a.setPackageName(charSequence);
    }

    public String J() {
        return this.f22365a.getViewIdResourceName();
    }

    public void J0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f22365a.setPaneTitle(charSequence);
        } else {
            this.f22365a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void K0(View view) {
        this.f22366b = -1;
        this.f22365a.setParent(view);
    }

    public void L0(View view, int i10) {
        this.f22366b = i10;
        this.f22365a.setParent(view, i10);
    }

    public boolean M() {
        return Build.VERSION.SDK_INT >= 34 ? d.d(this.f22365a) : l(64);
    }

    public void M0(CharSequence charSequence) {
        this.f22365a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", charSequence);
    }

    public boolean N() {
        return this.f22365a.isAccessibilityFocused();
    }

    public void N0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f22365a.setScreenReaderFocusable(z10);
        } else {
            n0(1, z10);
        }
    }

    public boolean O() {
        return this.f22365a.isCheckable();
    }

    public void O0(boolean z10) {
        this.f22365a.setScrollable(z10);
    }

    public boolean P() {
        return this.f22365a.isChecked();
    }

    public void P0(boolean z10) {
        this.f22365a.setSelected(z10);
    }

    public boolean Q() {
        return this.f22365a.isClickable();
    }

    public void Q0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f22365a.setShowingHintText(z10);
        } else {
            n0(4, z10);
        }
    }

    public boolean R() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.f22365a.isContextClickable();
        }
        return false;
    }

    public void R0(View view) {
        this.f22367c = -1;
        this.f22365a.setSource(view);
    }

    public boolean S() {
        return this.f22365a.isEnabled();
    }

    public void S0(View view, int i10) {
        this.f22367c = i10;
        this.f22365a.setSource(view, i10);
    }

    public boolean T() {
        return Build.VERSION.SDK_INT >= 36 ? e.e(this.f22365a) : this.f22365a.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY");
    }

    public void T0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 30) {
            b.b(this.f22365a, charSequence);
        } else {
            this.f22365a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    public boolean U() {
        return this.f22365a.isFocusable();
    }

    public void U0(CharSequence charSequence) {
        this.f22365a.setText(charSequence);
    }

    public boolean V() {
        return this.f22365a.isFocused();
    }

    public void V0(View view) {
        if (Build.VERSION.SDK_INT >= 22) {
            this.f22365a.setTraversalAfter(view);
        }
    }

    public boolean W() {
        return l(67108864);
    }

    public void W0(boolean z10) {
        this.f22365a.setVisibleToUser(z10);
    }

    public boolean X() {
        if (Build.VERSION.SDK_INT >= 24) {
            return this.f22365a.isImportantForAccessibility();
        }
        return true;
    }

    public AccessibilityNodeInfo X0() {
        return this.f22365a;
    }

    public boolean Y() {
        return this.f22365a.isLongClickable();
    }

    public boolean Z() {
        return this.f22365a.isPassword();
    }

    public void a(int i10) {
        this.f22365a.addAction(i10);
    }

    public boolean a0() {
        return this.f22365a.isScrollable();
    }

    public void b(a aVar) {
        this.f22365a.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f22390a);
    }

    public boolean b0() {
        return this.f22365a.isSelected();
    }

    public void c(View view) {
        this.f22365a.addChild(view);
    }

    public boolean c0() {
        return Build.VERSION.SDK_INT >= 26 ? this.f22365a.isShowingHintText() : l(4);
    }

    public void d(View view, int i10) {
        this.f22365a.addChild(view, i10);
    }

    public boolean d0() {
        return Build.VERSION.SDK_INT >= 33 ? c.b(this.f22365a) : l(8388608);
    }

    public boolean e0() {
        return this.f22365a.isVisibleToUser();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f22365a;
        if (accessibilityNodeInfo == null) {
            if (xVar.f22365a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(xVar.f22365a)) {
            return false;
        }
        return this.f22367c == xVar.f22367c && this.f22366b == xVar.f22366b;
    }

    public void f(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            g();
            l0(view);
            ClickableSpan[] clickableSpanArrT = t(charSequence);
            if (clickableSpanArrT == null || clickableSpanArrT.length <= 0) {
                return;
            }
            z().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", z.b.f32782a);
            SparseArray sparseArrayB = B(view);
            for (int i10 = 0; i10 < clickableSpanArrT.length; i10++) {
                int iL = L(clickableSpanArrT[i10], sparseArrayB);
                sparseArrayB.put(iL, new WeakReference(clickableSpanArrT[i10]));
                e(clickableSpanArrT[i10], (Spanned) charSequence, iL);
            }
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f22365a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public List i() {
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.f22365a.getActionList();
        ArrayList arrayList = new ArrayList();
        int size = actionList.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(new a(actionList.get(i10)));
        }
        return arrayList;
    }

    public boolean i0(int i10, Bundle bundle) {
        return this.f22365a.performAction(i10, bundle);
    }

    public int k() {
        return this.f22365a.getActions();
    }

    public boolean k0(a aVar) {
        return this.f22365a.removeAction((AccessibilityNodeInfo.AccessibilityAction) aVar.f22390a);
    }

    public void m(Rect rect) {
        this.f22365a.getBoundsInParent(rect);
    }

    public void m0(boolean z10) {
        this.f22365a.setAccessibilityFocused(z10);
    }

    public void n(Rect rect) {
        this.f22365a.getBoundsInScreen(rect);
    }

    public void o(Rect rect) {
        if (Build.VERSION.SDK_INT >= 34) {
            d.b(this.f22365a, rect);
            return;
        }
        Rect rect2 = (Rect) this.f22365a.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
        if (rect2 != null) {
            rect.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    public void o0(Rect rect) {
        this.f22365a.setBoundsInParent(rect);
    }

    public int p() {
        return Build.VERSION.SDK_INT >= 36 ? e.b(this.f22365a) : this.f22365a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.CHECKED_KEY", this.f22365a.isChecked() ? 1 : 0);
    }

    public void p0(Rect rect) {
        this.f22365a.setBoundsInScreen(rect);
    }

    public void q0(boolean z10) {
        this.f22365a.setCanOpenPopup(z10);
    }

    public int r() {
        return this.f22365a.getChildCount();
    }

    public void r0(boolean z10) {
        this.f22365a.setCheckable(z10);
    }

    public CharSequence s() {
        return this.f22365a.getClassName();
    }

    public void s0(boolean z10) {
        this.f22365a.setChecked(z10);
    }

    public void t0(CharSequence charSequence) {
        this.f22365a.setClassName(charSequence);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m(rect);
        sb2.append("; boundsInParent: " + rect);
        n(rect);
        sb2.append("; boundsInScreen: " + rect);
        o(rect);
        sb2.append("; boundsInWindow: " + rect);
        sb2.append("; packageName: ");
        sb2.append(C());
        sb2.append("; className: ");
        sb2.append(s());
        sb2.append("; text: ");
        sb2.append(G());
        sb2.append("; error: ");
        sb2.append(w());
        sb2.append("; maxTextLength: ");
        sb2.append(A());
        sb2.append("; stateDescription: ");
        sb2.append(E());
        sb2.append("; contentDescription: ");
        sb2.append(v());
        sb2.append("; supplementalDescription: ");
        sb2.append(F());
        sb2.append("; tooltipText: ");
        sb2.append(H());
        sb2.append("; viewIdResName: ");
        sb2.append(J());
        sb2.append("; uniqueId: ");
        sb2.append(I());
        sb2.append("; checkable: ");
        sb2.append(O());
        sb2.append("; checked: ");
        sb2.append(q());
        sb2.append("; fieldRequired: ");
        sb2.append(T());
        sb2.append("; focusable: ");
        sb2.append(U());
        sb2.append("; focused: ");
        sb2.append(V());
        sb2.append("; selected: ");
        sb2.append(b0());
        sb2.append("; clickable: ");
        sb2.append(Q());
        sb2.append("; longClickable: ");
        sb2.append(Y());
        sb2.append("; contextClickable: ");
        sb2.append(R());
        sb2.append("; expandedState: ");
        sb2.append(y(x()));
        sb2.append("; enabled: ");
        sb2.append(S());
        sb2.append("; password: ");
        sb2.append(Z());
        sb2.append("; scrollable: " + a0());
        sb2.append("; containerTitle: ");
        sb2.append(u());
        sb2.append("; granularScrollingSupported: ");
        sb2.append(W());
        sb2.append("; importantForAccessibility: ");
        sb2.append(X());
        sb2.append("; visible: ");
        sb2.append(e0());
        sb2.append("; isTextSelectable: ");
        sb2.append(d0());
        sb2.append("; accessibilityDataSensitive: ");
        sb2.append(M());
        sb2.append("; [");
        List listI = i();
        for (int i10 = 0; i10 < listI.size(); i10++) {
            a aVar = (a) listI.get(i10);
            String strJ = j(aVar.b());
            if (strJ.equals("ACTION_UNKNOWN") && aVar.c() != null) {
                strJ = aVar.c().toString();
            }
            sb2.append(strJ);
            if (i10 != listI.size() - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    public CharSequence u() {
        return Build.VERSION.SDK_INT >= 34 ? d.c(this.f22365a) : this.f22365a.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
    }

    public void u0(boolean z10) {
        this.f22365a.setClickable(z10);
    }

    public CharSequence v() {
        return this.f22365a.getContentDescription();
    }

    public void v0(Object obj) {
        this.f22365a.setCollectionInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionInfo) ((f) obj).f22394a);
    }

    public CharSequence w() {
        return this.f22365a.getError();
    }

    public void w0(Object obj) {
        this.f22365a.setCollectionItemInfo(obj == null ? null : (AccessibilityNodeInfo.CollectionItemInfo) ((g) obj).f22395a);
    }

    public int x() {
        return Build.VERSION.SDK_INT >= 36 ? e.c(this.f22365a) : this.f22365a.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.EXPANDED_STATE_KEY", 0);
    }

    public void x0(CharSequence charSequence) {
        this.f22365a.setContentDescription(charSequence);
    }

    public void y0(boolean z10) {
        this.f22365a.setDismissable(z10);
    }

    public Bundle z() {
        return this.f22365a.getExtras();
    }

    public void z0(boolean z10) {
        this.f22365a.setEnabled(z10);
    }

    public void j0() {
    }
}
