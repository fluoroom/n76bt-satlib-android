package m0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import n0.x;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: c */
    private static final View.AccessibilityDelegate f20726c = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: a */
    private final View.AccessibilityDelegate f20727a;

    /* JADX INFO: renamed from: b */
    private final View.AccessibilityDelegate f20728b;

    /* JADX INFO: renamed from: m0.a$a */
    static final class C0280a extends View.AccessibilityDelegate {

        /* JADX INFO: renamed from: a */
        final a f20729a;

        C0280a(a aVar) {
            this.f20729a = aVar;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f20729a.a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            n0.y yVarB = this.f20729a.b(view);
            if (yVarB != null) {
                return (AccessibilityNodeProvider) yVarB.e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f20729a.f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            n0.x xVarY0 = n0.x.Y0(accessibilityNodeInfo);
            xVarY0.N0(o0.U(view));
            xVarY0.E0(o0.R(view));
            xVarY0.J0(o0.q(view));
            xVarY0.T0(o0.J(view));
            this.f20729a.g(view, xVarY0);
            xVarY0.f(accessibilityNodeInfo.getText(), view);
            List listC = a.c(view);
            for (int i10 = 0; i10 < listC.size(); i10++) {
                xVarY0.b((x.a) listC.get(i10));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f20729a.h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f20729a.i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            return this.f20729a.j(view, i10, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i10) {
            this.f20729a.l(view, i10);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f20729a.m(view, accessibilityEvent);
        }
    }

    public a() {
        this(f20726c);
    }

    static List c(View view) {
        List list = (List) view.getTag(z.b.H);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    private boolean e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] clickableSpanArrT = n0.x.t(view.createAccessibilityNodeInfo().getText());
            for (int i10 = 0; clickableSpanArrT != null && i10 < clickableSpanArrT.length; i10++) {
                if (clickableSpan.equals(clickableSpanArrT[i10])) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean k(int i10, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(z.b.I);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i10)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!e(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f20727a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public n0.y b(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.f20727a.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new n0.y(accessibilityNodeProvider);
        }
        return null;
    }

    View.AccessibilityDelegate d() {
        return this.f20728b;
    }

    public void f(View view, AccessibilityEvent accessibilityEvent) {
        this.f20727a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void g(View view, n0.x xVar) {
        this.f20727a.onInitializeAccessibilityNodeInfo(view, xVar.X0());
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f20727a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f20727a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean j(View view, int i10, Bundle bundle) {
        List listC = c(view);
        boolean zPerformAccessibilityAction = false;
        int i11 = 0;
        while (true) {
            if (i11 >= listC.size()) {
                break;
            }
            x.a aVar = (x.a) listC.get(i11);
            if (aVar.b() == i10) {
                zPerformAccessibilityAction = aVar.d(view, bundle);
                break;
            }
            i11++;
        }
        if (!zPerformAccessibilityAction) {
            zPerformAccessibilityAction = this.f20727a.performAccessibilityAction(view, i10, bundle);
        }
        return (zPerformAccessibilityAction || i10 != z.b.f32782a || bundle == null) ? zPerformAccessibilityAction : k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    public void l(View view, int i10) {
        this.f20727a.sendAccessibilityEvent(view, i10);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.f20727a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f20727a = accessibilityDelegate;
        this.f20728b = new C0280a(this);
    }
}
