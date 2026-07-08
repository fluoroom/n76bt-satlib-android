package m0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContentInfo;
import android.view.Display;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import m0.a;
import m0.d1;
import m0.i1;
import n0.x;

/* JADX INFO: loaded from: classes.dex */
public abstract class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static WeakHashMap f20860a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f20861b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f20862c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static ThreadLocal f20863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[] f20864e = {z.b.f32783b, z.b.f32784c, z.b.f32795n, z.b.f32806y, z.b.B, z.b.C, z.b.D, z.b.E, z.b.F, z.b.G, z.b.f32785d, z.b.f32786e, z.b.f32787f, z.b.f32788g, z.b.f32789h, z.b.f32790i, z.b.f32791j, z.b.f32792k, z.b.f32793l, z.b.f32794m, z.b.f32796o, z.b.f32797p, z.b.f32798q, z.b.f32799r, z.b.f32800s, z.b.f32801t, z.b.f32802u, z.b.f32803v, z.b.f32804w, z.b.f32805x, z.b.f32807z, z.b.A};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d0 f20865f = new d0() { // from class: m0.n0
        @Override // m0.d0
        public final d onReceiveContent(d dVar) {
            return o0.a(dVar);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final e f20866g = new e();

    class a extends f {
        a(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m0.o0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.c(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m0.o0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.f(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m0.o0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    class b extends f {
        b(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m0.o0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.a(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m0.o0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m0.o0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class c extends f {
        c(int i10, Class cls, int i11, int i12) {
            super(i10, cls, i11, i12);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m0.o0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return n.b(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m0.o0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            n.d(view, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m0.o0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    class d extends f {
        d(int i10, Class cls, int i11) {
            super(i10, cls, i11);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m0.o0.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(l.b(view));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m0.o0.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            l.d(view, bool.booleanValue());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // m0.o0.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f20868a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Class f20869b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f20870c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f20871d;

        f(int i10, Class cls, int i11) {
            this(i10, cls, 0, i11);
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.f20870c;
        }

        boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        abstract Object c(View view);

        abstract void d(View view, Object obj);

        Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f20868a);
            if (this.f20869b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                o0.m(view);
                view.setTag(this.f20868a, obj);
                o0.V(view, this.f20871d);
            }
        }

        abstract boolean g(Object obj, Object obj2);

        f(int i10, Class cls, int i11, int i12) {
            this.f20868a = i10;
            this.f20869b = cls;
            this.f20871d = i11;
            this.f20870c = i12;
        }
    }

    static class g {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return t0.f20895b ? t0.b(view, windowInsets) : view.dispatchApplyWindowInsets(windowInsets);
        }

        static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        static void c(View view) {
            view.requestApplyInsets();
        }
    }

    private static class h {

        class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            i1 f20872a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f20873b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b0 f20874c;

            a(View view, b0 b0Var) {
                this.f20873b = view;
                this.f20874c = b0Var;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                i1 i1VarX = i1.x(windowInsets, view);
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 30) {
                    h.a(windowInsets, this.f20873b);
                    if (i1VarX.equals(this.f20872a)) {
                        return this.f20874c.a(view, i1VarX).v();
                    }
                }
                this.f20872a = i1VarX;
                i1 i1VarA = this.f20874c.a(view, i1VarX);
                if (i10 >= 30) {
                    return i1VarA.v();
                }
                o0.j0(view);
                return i1VarA.v();
            }
        }

        static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(z.b.T);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        static i1 b(View view, i1 i1Var, Rect rect) {
            WindowInsets windowInsetsV = i1Var.v();
            if (windowInsetsV != null) {
                return i1.x(view.computeSystemWindowInsets(windowInsetsV, rect), view);
            }
            rect.setEmpty();
            return i1Var;
        }

        static ColorStateList c(View view) {
            return view.getBackgroundTintList();
        }

        static PorterDuff.Mode d(View view) {
            return view.getBackgroundTintMode();
        }

        static float e(View view) {
            return view.getElevation();
        }

        public static i1 f(View view) {
            return i1.a.a(view);
        }

        static String g(View view) {
            return view.getTransitionName();
        }

        static float h(View view) {
            return view.getTranslationZ();
        }

        static float i(View view) {
            return view.getZ();
        }

        static boolean j(View view) {
            return view.isNestedScrollingEnabled();
        }

        static void k(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        static void l(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        static void m(View view, float f10) {
            view.setElevation(f10);
        }

        static void n(View view, b0 b0Var) {
            a aVar = b0Var != null ? new a(view, b0Var) : null;
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(z.b.M, aVar);
            }
            if (view.getTag(z.b.L) != null) {
                return;
            }
            if (aVar != null) {
                view.setOnApplyWindowInsetsListener(aVar);
            } else {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(z.b.T));
            }
        }

        static void o(View view, String str) {
            view.setTransitionName(str);
        }

        static void p(View view, float f10) {
            view.setTranslationZ(f10);
        }

        static void q(View view, float f10) {
            view.setZ(f10);
        }

        static void r(View view) {
            view.stopNestedScroll();
        }
    }

    private static class i {
        public static i1 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            i1 i1VarW = i1.w(rootWindowInsets);
            i1VarW.s(i1VarW);
            i1VarW.d(view.getRootView());
            return i1VarW;
        }

        static void b(View view, int i10, int i11) {
            view.setScrollIndicators(i10, i11);
        }
    }

    static class j {
        static void a(View view, PointerIcon pointerIcon) {
            view.setPointerIcon(pointerIcon);
        }
    }

    static class k {
        static int a(View view) {
            return view.getImportantForAutofill();
        }

        static void b(View view, int i10) {
            view.setImportantForAutofill(i10);
        }
    }

    static class l {
        static CharSequence a(View view) {
            return view.getAccessibilityPaneTitle();
        }

        static boolean b(View view) {
            return view.isAccessibilityHeading();
        }

        static boolean c(View view) {
            return view.isScreenReaderFocusable();
        }

        static void d(View view, boolean z10) {
            view.setAccessibilityHeading(z10);
        }

        static void e(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        static void f(View view, boolean z10) {
            view.setScreenReaderFocusable(z10);
        }
    }

    private static class m {
        static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        static void b(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    private static class n {
        static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static m1 c(View view) {
            WindowInsetsController windowInsetsController = view.getWindowInsetsController();
            if (windowInsetsController != null) {
                return m1.d(windowInsetsController);
            }
            return null;
        }

        static void d(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    private static final class o {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static m0.d b(View view, m0.d dVar) {
            ContentInfo contentInfoF = dVar.f();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoF);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoF ? dVar : m0.d.g(contentInfoPerformReceiveContent);
        }
    }

    static class p {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final ArrayList f20875d = new ArrayList();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakHashMap f20876a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private SparseArray f20877b = null;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference f20878c = null;

        p() {
        }

        static p a(View view) {
            int i10 = z.b.R;
            p pVar = (p) view.getTag(i10);
            if (pVar != null) {
                return pVar;
            }
            p pVar2 = new p();
            view.setTag(i10, pVar2);
            return pVar2;
        }

        private View c(View view, KeyEvent keyEvent) {
            WeakHashMap weakHashMap = this.f20876a;
            if (weakHashMap != null && weakHashMap.containsKey(view)) {
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                        View viewC = c(viewGroup.getChildAt(childCount), keyEvent);
                        if (viewC != null) {
                            return viewC;
                        }
                    }
                }
                if (e(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        private SparseArray d() {
            if (this.f20877b == null) {
                this.f20877b = new SparseArray();
            }
            return this.f20877b;
        }

        private boolean e(View view, KeyEvent keyEvent) {
            int size;
            ArrayList arrayList = (ArrayList) view.getTag(z.b.S);
            if (arrayList == null || arrayList.size() - 1 < 0) {
                return false;
            }
            android.support.v4.media.session.b.a(arrayList.get(size));
            throw null;
        }

        private void g() {
            WeakHashMap weakHashMap = this.f20876a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = f20875d;
            if (arrayList.isEmpty()) {
                return;
            }
            synchronized (arrayList) {
                try {
                    if (this.f20876a == null) {
                        this.f20876a = new WeakHashMap();
                    }
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        ArrayList arrayList2 = f20875d;
                        View view = (View) ((WeakReference) arrayList2.get(size)).get();
                        if (view == null) {
                            arrayList2.remove(size);
                        } else {
                            this.f20876a.put(view, Boolean.TRUE);
                            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                this.f20876a.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        boolean b(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                g();
            }
            View viewC = c(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (viewC != null && !KeyEvent.isModifierKey(keyCode)) {
                    d().put(keyCode, new WeakReference(viewC));
                }
            }
            return viewC != null;
        }

        boolean f(KeyEvent keyEvent) {
            WeakReference weakReference;
            int iIndexOfKey;
            WeakReference weakReference2 = this.f20878c;
            if (weakReference2 != null && weakReference2.get() == keyEvent) {
                return false;
            }
            this.f20878c = new WeakReference(keyEvent);
            SparseArray sparseArrayD = d();
            if (keyEvent.getAction() != 1 || (iIndexOfKey = sparseArrayD.indexOfKey(keyEvent.getKeyCode())) < 0) {
                weakReference = null;
            } else {
                weakReference = (WeakReference) sparseArrayD.valueAt(iIndexOfKey);
                sparseArrayD.removeAt(iIndexOfKey);
            }
            if (weakReference == null) {
                weakReference = (WeakReference) sparseArrayD.get(keyEvent.getKeyCode());
            }
            if (weakReference == null) {
                return false;
            }
            View view = (View) weakReference.get();
            if (view != null && view.isAttachedToWindow()) {
                e(view, keyEvent);
            }
            return true;
        }
    }

    public static int A(View view) {
        return view.getImportantForAccessibility();
    }

    public static void A0(View view, boolean z10) {
        m0().f(view, Boolean.valueOf(z10));
    }

    public static int B(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return k.a(view);
        }
        return 0;
    }

    public static void B0(View view, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 23) {
            i.b(view, i10, i11);
        }
    }

    public static int C(View view) {
        return view.getLayoutDirection();
    }

    public static void C0(View view, CharSequence charSequence) {
        H0().f(view, charSequence);
    }

    public static int D(View view) {
        return view.getMeasuredState();
    }

    public static void D0(View view, String str) {
        h.o(view, str);
    }

    public static int E(View view) {
        return view.getMinimumHeight();
    }

    public static void E0(View view, float f10) {
        h.p(view, f10);
    }

    public static int F(View view) {
        return view.getMinimumWidth();
    }

    public static void F0(View view, d1.b bVar) {
        d1.d(view, bVar);
    }

    public static String[] G(View view) {
        return Build.VERSION.SDK_INT >= 31 ? o.a(view) : (String[]) view.getTag(z.b.O);
    }

    public static void G0(View view, float f10) {
        h.q(view, f10);
    }

    public static ViewParent H(View view) {
        return view.getParentForAccessibility();
    }

    private static f H0() {
        return new c(z.b.Q, CharSequence.class, 64, 30);
    }

    public static i1 I(View view) {
        return Build.VERSION.SDK_INT >= 23 ? i.a(view) : h.f(view);
    }

    public static void I0(View view) {
        h.r(view);
    }

    public static CharSequence J(View view) {
        return (CharSequence) H0().e(view);
    }

    private static void J0(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    public static String K(View view) {
        return h.g(view);
    }

    public static float L(View view) {
        return h.h(view);
    }

    public static m1 M(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return n.c(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return c1.a(window, view);
                }
                return null;
            }
        }
        return null;
    }

    public static int N(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static float O(View view) {
        return h.i(view);
    }

    public static boolean P(View view) {
        return o(view) != null;
    }

    public static boolean Q(View view) {
        return view.hasTransientState();
    }

    public static boolean R(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean S(View view) {
        return view.isLaidOut();
    }

    public static boolean T(View view) {
        return h.j(view);
    }

    public static boolean U(View view) {
        Boolean bool = (Boolean) m0().e(view);
        return bool != null && bool.booleanValue();
    }

    static void V(View view, int i10) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z10 = q(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z10) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z10 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i10);
                if (z10) {
                    accessibilityEventObtain.getText().add(q(view));
                    v0(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i10);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(q(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i10);
                } catch (AbstractMethodError e10) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e10);
                }
            }
        }
    }

    public static void W(View view, int i10) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i10);
            return;
        }
        Rect rectX = x();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectX.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !rectX.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z10 = false;
        }
        g(view, i10);
        if (z10 && rectX.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectX);
        }
    }

    public static void X(View view, int i10) {
        boolean z10;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i10);
            return;
        }
        Rect rectX = x();
        Object parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rectX.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z10 = !rectX.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z10 = false;
        }
        h(view, i10);
        if (z10 && rectX.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rectX);
        }
    }

    public static i1 Y(View view, i1 i1Var) {
        WindowInsets windowInsetsV = i1Var.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsV);
            if (!windowInsetsB.equals(windowInsetsV)) {
                return i1.x(windowInsetsB, view);
            }
        }
        return i1Var;
    }

    public static void Z(View view, n0.x xVar) {
        view.onInitializeAccessibilityNodeInfo(xVar.X0());
    }

    public static /* synthetic */ m0.d a(m0.d dVar) {
        return dVar;
    }

    private static f a0() {
        return new b(z.b.K, CharSequence.class, 8, 28);
    }

    private static f b() {
        return new d(z.b.J, Boolean.class, 28);
    }

    public static boolean b0(View view, int i10, Bundle bundle) {
        return view.performAccessibilityAction(i10, bundle);
    }

    public static int c(View view, CharSequence charSequence, n0.a0 a0Var) {
        int iS = s(view, charSequence);
        if (iS != -1) {
            d(view, new x.a(iS, charSequence, a0Var));
        }
        return iS;
    }

    public static m0.d c0(View view, m0.d dVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + dVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return o.b(view, dVar);
        }
        c0 c0Var = (c0) view.getTag(z.b.N);
        if (c0Var == null) {
            return y(view).onReceiveContent(dVar);
        }
        m0.d dVarA = c0Var.a(view, dVar);
        if (dVarA == null) {
            return null;
        }
        return y(view).onReceiveContent(dVarA);
    }

    private static void d(View view, x.a aVar) {
        m(view);
        h0(aVar.b(), view);
        r(view).add(aVar);
        V(view, 0);
    }

    public static void d0(View view) {
        view.postInvalidateOnAnimation();
    }

    public static y0 e(View view) {
        if (f20860a == null) {
            f20860a = new WeakHashMap();
        }
        y0 y0Var = (y0) f20860a.get(view);
        if (y0Var != null) {
            return y0Var;
        }
        y0 y0Var2 = new y0(view);
        f20860a.put(view, y0Var2);
        return y0Var2;
    }

    public static void e0(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static int f(int i10, int i11) {
        return View.combineMeasuredStates(i10, i11);
    }

    public static void f0(View view, Runnable runnable, long j10) {
        view.postOnAnimationDelayed(runnable, j10);
    }

    private static void g(View view, int i10) {
        view.offsetLeftAndRight(i10);
        if (view.getVisibility() == 0) {
            J0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                J0((View) parent);
            }
        }
    }

    public static void g0(View view, int i10) {
        h0(i10, view);
        V(view, 0);
    }

    private static void h(View view, int i10) {
        view.offsetTopAndBottom(i10);
        if (view.getVisibility() == 0) {
            J0(view);
            Object parent = view.getParent();
            if (parent instanceof View) {
                J0((View) parent);
            }
        }
    }

    private static void h0(int i10, View view) {
        List listR = r(view);
        for (int i11 = 0; i11 < listR.size(); i11++) {
            if (((x.a) listR.get(i11)).b() == i10) {
                listR.remove(i11);
                return;
            }
        }
    }

    public static i1 i(View view, i1 i1Var, Rect rect) {
        return h.b(view, i1Var, rect);
    }

    public static void i0(View view, x.a aVar, CharSequence charSequence, n0.a0 a0Var) {
        if (a0Var == null && charSequence == null) {
            g0(view, aVar.b());
        } else {
            d(view, aVar.a(charSequence, a0Var));
        }
    }

    public static i1 j(View view, i1 i1Var) {
        int i10 = Build.VERSION.SDK_INT;
        WindowInsets windowInsetsV = i1Var.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsA = i10 >= 30 ? n.a(view, windowInsetsV) : g.a(view, windowInsetsV);
            if (!windowInsetsA.equals(windowInsetsV)) {
                return i1.x(windowInsetsA, view);
            }
        }
        return i1Var;
    }

    public static void j0(View view) {
        g.c(view);
    }

    static boolean k(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).b(view, keyEvent);
    }

    public static int k0(int i10, int i11, int i12) {
        return View.resolveSizeAndState(i10, i11, i12);
    }

    static boolean l(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return p.a(view).f(keyEvent);
    }

    public static void l0(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10, int i11) {
        if (Build.VERSION.SDK_INT >= 29) {
            m.b(view, context, iArr, attributeSet, typedArray, i10, i11);
        }
    }

    static void m(View view) {
        m0.a aVarN = n(view);
        if (aVarN == null) {
            aVarN = new m0.a();
        }
        n0(view, aVarN);
    }

    private static f m0() {
        return new a(z.b.P, Boolean.class, 28);
    }

    public static m0.a n(View view) {
        View.AccessibilityDelegate accessibilityDelegateO = o(view);
        if (accessibilityDelegateO == null) {
            return null;
        }
        return accessibilityDelegateO instanceof a.C0280a ? ((a.C0280a) accessibilityDelegateO).f20729a : new m0.a(accessibilityDelegateO);
    }

    public static void n0(View view, m0.a aVar) {
        if (aVar == null && (o(view) instanceof a.C0280a)) {
            aVar = new m0.a();
        }
        v0(view);
        view.setAccessibilityDelegate(aVar == null ? null : aVar.d());
    }

    private static View.AccessibilityDelegate o(View view) {
        return Build.VERSION.SDK_INT >= 29 ? m.a(view) : p(view);
    }

    public static void o0(View view, boolean z10) {
        b().f(view, Boolean.valueOf(z10));
    }

    private static View.AccessibilityDelegate p(View view) {
        if (f20862c) {
            return null;
        }
        if (f20861b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f20861b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f20862c = true;
                return null;
            }
        }
        try {
            Object obj = f20861b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f20862c = true;
            return null;
        }
    }

    public static void p0(View view, CharSequence charSequence) {
        a0().f(view, charSequence);
        if (charSequence != null) {
            f20866g.a(view);
        } else {
            f20866g.d(view);
        }
    }

    public static CharSequence q(View view) {
        return (CharSequence) a0().e(view);
    }

    public static void q0(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    private static List r(View view) {
        int i10 = z.b.H;
        ArrayList arrayList = (ArrayList) view.getTag(i10);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(i10, arrayList2);
        return arrayList2;
    }

    public static void r0(View view, ColorStateList colorStateList) {
        int i10 = Build.VERSION.SDK_INT;
        h.k(view, colorStateList);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (h.c(view) == null && h.d(view) == null) ? false : true;
            if (background == null || !z10) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    private static int s(View view, CharSequence charSequence) {
        List listR = r(view);
        for (int i10 = 0; i10 < listR.size(); i10++) {
            if (TextUtils.equals(charSequence, ((x.a) listR.get(i10)).c())) {
                return ((x.a) listR.get(i10)).b();
            }
        }
        int i11 = 0;
        int i12 = -1;
        while (true) {
            int[] iArr = f20864e;
            if (i11 >= iArr.length || i12 != -1) {
                break;
            }
            int i13 = iArr[i11];
            boolean z10 = true;
            for (int i14 = 0; i14 < listR.size(); i14++) {
                z10 &= ((x.a) listR.get(i14)).b() != i13;
            }
            if (z10) {
                i12 = i13;
            }
            i11++;
        }
        return i12;
    }

    public static void s0(View view, PorterDuff.Mode mode) {
        int i10 = Build.VERSION.SDK_INT;
        h.l(view, mode);
        if (i10 == 21) {
            Drawable background = view.getBackground();
            boolean z10 = (h.c(view) == null && h.d(view) == null) ? false : true;
            if (background == null || !z10) {
                return;
            }
            if (background.isStateful()) {
                background.setState(view.getDrawableState());
            }
            view.setBackground(background);
        }
    }

    public static ColorStateList t(View view) {
        return h.c(view);
    }

    public static void t0(View view, float f10) {
        h.m(view, f10);
    }

    public static PorterDuff.Mode u(View view) {
        return h.d(view);
    }

    public static void u0(View view, int i10) {
        view.setImportantForAccessibility(i10);
    }

    public static Display v(View view) {
        return view.getDisplay();
    }

    private static void v0(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static float w(View view) {
        return h.e(view);
    }

    public static void w0(View view, int i10) {
        if (Build.VERSION.SDK_INT >= 26) {
            k.b(view, i10);
        }
    }

    private static Rect x() {
        if (f20863d == null) {
            f20863d = new ThreadLocal();
        }
        Rect rect = (Rect) f20863d.get();
        if (rect == null) {
            rect = new Rect();
            f20863d.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static void x0(View view, int i10, Paint paint) {
        view.setLayerType(i10, paint);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static d0 y(View view) {
        return view instanceof d0 ? (d0) view : f20865f;
    }

    public static void y0(View view, b0 b0Var) {
        h.n(view, b0Var);
    }

    public static boolean z(View view) {
        return view.getFitsSystemWindows();
    }

    public static void z0(View view, f0 f0Var) {
        if (Build.VERSION.SDK_INT >= 24) {
            j.a(view, m0.a(f0Var != null ? f0Var.a() : null));
        }
    }

    static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final WeakHashMap f20867a = new WeakHashMap();

        e() {
        }

        private void b(Map.Entry entry) {
            View view = (View) entry.getKey();
            boolean zBooleanValue = ((Boolean) entry.getValue()).booleanValue();
            boolean z10 = view.isShown() && view.getWindowVisibility() == 0;
            if (zBooleanValue != z10) {
                o0.V(view, z10 ? 16 : 32);
                entry.setValue(Boolean.valueOf(z10));
            }
        }

        private void c(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        private void e(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        void a(View view) {
            this.f20867a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                c(view);
            }
        }

        void d(View view) {
            this.f20867a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            e(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (Build.VERSION.SDK_INT < 28) {
                Iterator it = this.f20867a.entrySet().iterator();
                while (it.hasNext()) {
                    b((Map.Entry) it.next());
                }
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            c(view);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }
}
