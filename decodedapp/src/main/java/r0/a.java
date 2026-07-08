package r0;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.appcompat.widget.ActivityChooserView;
import androidx.appcompat.widget.RtlSpacingHelper;
import androidx.collection.j;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.util.ArrayList;
import java.util.List;
import m0.o0;
import n0.x;
import n0.y;
import n0.z;
import r0.b;

/* JADX INFO: loaded from: classes.dex */
public abstract class a extends m0.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Rect f25267n = new Rect(ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED, RtlSpacingHelper.UNDEFINED, RtlSpacingHelper.UNDEFINED);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final b.a f25268o = new C0346a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final b.InterfaceC0347b f25269p = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AccessibilityManager f25274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final View f25275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private c f25276j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f25270d = new Rect();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Rect f25271e = new Rect();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Rect f25272f = new Rect();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f25273g = new int[2];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f25277k = RtlSpacingHelper.UNDEFINED;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f25278l = RtlSpacingHelper.UNDEFINED;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f25279m = RtlSpacingHelper.UNDEFINED;

    /* JADX INFO: renamed from: r0.a$a, reason: collision with other inner class name */
    class C0346a implements b.a {
        C0346a() {
        }

        @Override // r0.b.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(x xVar, Rect rect) {
            xVar.m(rect);
        }
    }

    class b implements b.InterfaceC0347b {
        b() {
        }

        @Override // r0.b.InterfaceC0347b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public x a(j jVar, int i10) {
            return (x) jVar.m(i10);
        }

        @Override // r0.b.InterfaceC0347b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int b(j jVar) {
            return jVar.k();
        }
    }

    private class c extends y {
        c() {
        }

        @Override // n0.y
        public x b(int i10) {
            return x.h0(a.this.H(i10));
        }

        @Override // n0.y
        public x d(int i10) {
            int i11 = i10 == 2 ? a.this.f25277k : a.this.f25278l;
            if (i11 == Integer.MIN_VALUE) {
                return null;
            }
            return b(i11);
        }

        @Override // n0.y
        public boolean f(int i10, int i11, Bundle bundle) {
            return a.this.P(i10, i11, bundle);
        }
    }

    public a(View view) {
        if (view == null) {
            throw new IllegalArgumentException("View may not be null");
        }
        this.f25275i = view;
        this.f25274h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        view.setFocusable(true);
        if (o0.A(view) == 0) {
            o0.u0(view, 1);
        }
    }

    private static Rect D(View view, int i10, Rect rect) {
        int width = view.getWidth();
        int height = view.getHeight();
        if (i10 == 17) {
            rect.set(width, 0, width, height);
            return rect;
        }
        if (i10 == 33) {
            rect.set(0, height, width, height);
            return rect;
        }
        if (i10 == 66) {
            rect.set(-1, 0, -1, height);
            return rect;
        }
        if (i10 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        rect.set(0, -1, width, -1);
        return rect;
    }

    private boolean E(Rect rect) {
        if (rect == null || rect.isEmpty() || this.f25275i.getWindowVisibility() != 0) {
            return false;
        }
        Object parent = this.f25275i.getParent();
        while (parent instanceof View) {
            View view = (View) parent;
            if (view.getAlpha() <= 0.0f || view.getVisibility() != 0) {
                return false;
            }
            parent = view.getParent();
        }
        return parent != null;
    }

    private static int F(int i10) {
        if (i10 == 19) {
            return 33;
        }
        if (i10 != 21) {
            return i10 != 22 ? 130 : 66;
        }
        return 17;
    }

    private boolean G(int i10, Rect rect) {
        x xVar;
        j jVarY = y();
        int i11 = this.f25278l;
        int i12 = RtlSpacingHelper.UNDEFINED;
        x xVar2 = i11 == Integer.MIN_VALUE ? null : (x) jVarY.f(i11);
        if (i10 == 1 || i10 == 2) {
            xVar = (x) r0.b.d(jVarY, f25269p, f25268o, xVar2, i10, o0.C(this.f25275i) == 1, false);
        } else {
            if (i10 != 17 && i10 != 33 && i10 != 66 && i10 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect2 = new Rect();
            int i13 = this.f25278l;
            if (i13 != Integer.MIN_VALUE) {
                z(i13, rect2);
            } else if (rect != null) {
                rect2.set(rect);
            } else {
                D(this.f25275i, i10, rect2);
            }
            xVar = (x) r0.b.c(jVarY, f25269p, f25268o, xVar2, rect2, i10);
        }
        if (xVar != null) {
            i12 = jVarY.i(jVarY.h(xVar));
        }
        return T(i12);
    }

    private boolean Q(int i10, int i11, Bundle bundle) {
        return i11 != 1 ? i11 != 2 ? i11 != 64 ? i11 != 128 ? J(i10, i11, bundle) : n(i10) : S(i10) : o(i10) : T(i10);
    }

    private boolean R(int i10, Bundle bundle) {
        return o0.b0(this.f25275i, i10, bundle);
    }

    private boolean S(int i10) {
        int i11;
        if (!this.f25274h.isEnabled() || !this.f25274h.isTouchExplorationEnabled() || (i11 = this.f25277k) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            n(i11);
        }
        this.f25277k = i10;
        this.f25275i.invalidate();
        U(i10, 32768);
        return true;
    }

    private void V(int i10) {
        int i11 = this.f25279m;
        if (i11 == i10) {
            return;
        }
        this.f25279m = i10;
        U(i10, 128);
        U(i11, 256);
    }

    private boolean n(int i10) {
        if (this.f25277k != i10) {
            return false;
        }
        this.f25277k = RtlSpacingHelper.UNDEFINED;
        this.f25275i.invalidate();
        U(i10, WXMediaMessage.THUMB_LENGTH_LIMIT);
        return true;
    }

    private boolean p() {
        int i10 = this.f25278l;
        return i10 != Integer.MIN_VALUE && J(i10, 16, null);
    }

    private AccessibilityEvent q(int i10, int i11) {
        return i10 != -1 ? r(i10, i11) : s(i11);
    }

    private AccessibilityEvent r(int i10, int i11) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i11);
        x xVarH = H(i10);
        accessibilityEventObtain.getText().add(xVarH.G());
        accessibilityEventObtain.setContentDescription(xVarH.v());
        accessibilityEventObtain.setScrollable(xVarH.a0());
        accessibilityEventObtain.setPassword(xVarH.Z());
        accessibilityEventObtain.setEnabled(xVarH.S());
        accessibilityEventObtain.setChecked(xVarH.P());
        L(i10, accessibilityEventObtain);
        if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        accessibilityEventObtain.setClassName(xVarH.s());
        z.c(accessibilityEventObtain, this.f25275i, i10);
        accessibilityEventObtain.setPackageName(this.f25275i.getContext().getPackageName());
        return accessibilityEventObtain;
    }

    private AccessibilityEvent s(int i10) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(i10);
        this.f25275i.onInitializeAccessibilityEvent(accessibilityEventObtain);
        return accessibilityEventObtain;
    }

    private x t(int i10) {
        x xVarF0 = x.f0();
        xVarF0.z0(true);
        xVarF0.B0(true);
        xVarF0.t0("android.view.View");
        Rect rect = f25267n;
        xVarF0.o0(rect);
        xVarF0.p0(rect);
        xVarF0.K0(this.f25275i);
        N(i10, xVarF0);
        if (xVarF0.G() == null && xVarF0.v() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        xVarF0.m(this.f25271e);
        if (this.f25271e.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int iK = xVarF0.k();
        if ((iK & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((iK & 128) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        xVarF0.I0(this.f25275i.getContext().getPackageName());
        xVarF0.S0(this.f25275i, i10);
        if (this.f25277k == i10) {
            xVarF0.m0(true);
            xVarF0.a(128);
        } else {
            xVarF0.m0(false);
            xVarF0.a(64);
        }
        boolean z10 = this.f25278l == i10;
        if (z10) {
            xVarF0.a(2);
        } else if (xVarF0.U()) {
            xVarF0.a(1);
        }
        xVarF0.C0(z10);
        this.f25275i.getLocationOnScreen(this.f25273g);
        xVarF0.n(this.f25270d);
        if (this.f25270d.equals(rect)) {
            xVarF0.m(this.f25270d);
            if (xVarF0.f22366b != -1) {
                x xVarF02 = x.f0();
                for (int i11 = xVarF0.f22366b; i11 != -1; i11 = xVarF02.f22366b) {
                    xVarF02.L0(this.f25275i, -1);
                    xVarF02.o0(f25267n);
                    N(i11, xVarF02);
                    xVarF02.m(this.f25271e);
                    Rect rect2 = this.f25270d;
                    Rect rect3 = this.f25271e;
                    rect2.offset(rect3.left, rect3.top);
                }
                xVarF02.j0();
            }
            this.f25270d.offset(this.f25273g[0] - this.f25275i.getScrollX(), this.f25273g[1] - this.f25275i.getScrollY());
        }
        if (this.f25275i.getLocalVisibleRect(this.f25272f)) {
            this.f25272f.offset(this.f25273g[0] - this.f25275i.getScrollX(), this.f25273g[1] - this.f25275i.getScrollY());
            if (this.f25270d.intersect(this.f25272f)) {
                xVarF0.p0(this.f25270d);
                if (E(this.f25270d)) {
                    xVarF0.W0(true);
                }
            }
        }
        return xVarF0;
    }

    private x u() {
        x xVarG0 = x.g0(this.f25275i);
        o0.Z(this.f25275i, xVarG0);
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        if (xVarG0.r() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            xVarG0.d(this.f25275i, ((Integer) arrayList.get(i10)).intValue());
        }
        return xVarG0;
    }

    private j y() {
        ArrayList arrayList = new ArrayList();
        C(arrayList);
        j jVar = new j();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            jVar.j(((Integer) arrayList.get(i10)).intValue(), t(((Integer) arrayList.get(i10)).intValue()));
        }
        return jVar;
    }

    private void z(int i10, Rect rect) {
        H(i10).m(rect);
    }

    public final int A() {
        return this.f25278l;
    }

    protected abstract int B(float f10, float f11);

    protected abstract void C(List list);

    x H(int i10) {
        return i10 == -1 ? u() : t(i10);
    }

    public final void I(boolean z10, int i10, Rect rect) {
        int i11 = this.f25278l;
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (z10) {
            G(i10, rect);
        }
    }

    protected abstract boolean J(int i10, int i11, Bundle bundle);

    protected abstract void M(x xVar);

    protected abstract void N(int i10, x xVar);

    protected abstract void O(int i10, boolean z10);

    boolean P(int i10, int i11, Bundle bundle) {
        return i10 != -1 ? Q(i10, i11, bundle) : R(i11, bundle);
    }

    public final boolean T(int i10) {
        int i11;
        if ((!this.f25275i.isFocused() && !this.f25275i.requestFocus()) || (i11 = this.f25278l) == i10) {
            return false;
        }
        if (i11 != Integer.MIN_VALUE) {
            o(i11);
        }
        if (i10 == Integer.MIN_VALUE) {
            return false;
        }
        this.f25278l = i10;
        O(i10, true);
        U(i10, 8);
        return true;
    }

    public final boolean U(int i10, int i11) {
        ViewParent parent;
        if (i10 == Integer.MIN_VALUE || !this.f25274h.isEnabled() || (parent = this.f25275i.getParent()) == null) {
            return false;
        }
        return parent.requestSendAccessibilityEvent(this.f25275i, q(i10, i11));
    }

    @Override // m0.a
    public y b(View view) {
        if (this.f25276j == null) {
            this.f25276j = new c();
        }
        return this.f25276j;
    }

    @Override // m0.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        K(accessibilityEvent);
    }

    @Override // m0.a
    public void g(View view, x xVar) {
        super.g(view, xVar);
        M(xVar);
    }

    public final boolean o(int i10) {
        if (this.f25278l != i10) {
            return false;
        }
        this.f25278l = RtlSpacingHelper.UNDEFINED;
        O(i10, false);
        U(i10, 8);
        return true;
    }

    public final boolean v(MotionEvent motionEvent) {
        if (this.f25274h.isEnabled() && this.f25274h.isTouchExplorationEnabled()) {
            int action = motionEvent.getAction();
            if (action != 7 && action != 9) {
                if (action != 10 || this.f25279m == Integer.MIN_VALUE) {
                    return false;
                }
                V(RtlSpacingHelper.UNDEFINED);
                return true;
            }
            int iB = B(motionEvent.getX(), motionEvent.getY());
            V(iB);
            if (iB != Integer.MIN_VALUE) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean w(android.view.KeyEvent r7) {
        /*
            r6 = this;
            int r0 = r7.getAction()
            r1 = 0
            r2 = 1
            if (r0 == r2) goto L5d
            int r0 = r7.getKeyCode()
            r3 = 61
            r4 = 0
            if (r0 == r3) goto L46
            r3 = 66
            if (r0 == r3) goto L36
            switch(r0) {
                case 19: goto L19;
                case 20: goto L19;
                case 21: goto L19;
                case 22: goto L19;
                case 23: goto L36;
                default: goto L18;
            }
        L18:
            goto L5d
        L19:
            boolean r3 = r7.hasNoModifiers()
            if (r3 == 0) goto L5d
            int r0 = F(r0)
            int r7 = r7.getRepeatCount()
            int r7 = r7 + r2
            r3 = 0
        L29:
            if (r1 >= r7) goto L35
            boolean r5 = r6.G(r0, r4)
            if (r5 == 0) goto L35
            int r1 = r1 + 1
            r3 = 1
            goto L29
        L35:
            return r3
        L36:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L5d
            int r7 = r7.getRepeatCount()
            if (r7 != 0) goto L5d
            r6.p()
            return r2
        L46:
            boolean r0 = r7.hasNoModifiers()
            if (r0 == 0) goto L52
            r7 = 2
            boolean r7 = r6.G(r7, r4)
            return r7
        L52:
            boolean r7 = r7.hasModifiers(r2)
            if (r7 == 0) goto L5d
            boolean r7 = r6.G(r2, r4)
            return r7
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.a.w(android.view.KeyEvent):boolean");
    }

    public final int x() {
        return this.f25277k;
    }

    protected void K(AccessibilityEvent accessibilityEvent) {
    }

    protected void L(int i10, AccessibilityEvent accessibilityEvent) {
    }
}
