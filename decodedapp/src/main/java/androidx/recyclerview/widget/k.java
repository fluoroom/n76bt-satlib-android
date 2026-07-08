package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;
import m0.o0;
import n0.x;
import n0.y;

/* JADX INFO: loaded from: classes.dex */
public class k extends m0.a {

    /* JADX INFO: renamed from: d */
    final RecyclerView f3216d;

    /* JADX INFO: renamed from: e */
    private final a f3217e;

    public static class a extends m0.a {

        /* JADX INFO: renamed from: d */
        final k f3218d;

        /* JADX INFO: renamed from: e */
        private Map f3219e = new WeakHashMap();

        public a(k kVar) {
            this.f3218d = kVar;
        }

        @Override // m0.a
        public boolean a(View view, AccessibilityEvent accessibilityEvent) {
            m0.a aVar = (m0.a) this.f3219e.get(view);
            return aVar != null ? aVar.a(view, accessibilityEvent) : super.a(view, accessibilityEvent);
        }

        @Override // m0.a
        public y b(View view) {
            m0.a aVar = (m0.a) this.f3219e.get(view);
            return aVar != null ? aVar.b(view) : super.b(view);
        }

        @Override // m0.a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            m0.a aVar = (m0.a) this.f3219e.get(view);
            if (aVar != null) {
                aVar.f(view, accessibilityEvent);
            } else {
                super.f(view, accessibilityEvent);
            }
        }

        @Override // m0.a
        public void g(View view, x xVar) {
            if (this.f3218d.o() || this.f3218d.f3216d.getLayoutManager() == null) {
                super.g(view, xVar);
                return;
            }
            this.f3218d.f3216d.getLayoutManager().T0(view, xVar);
            m0.a aVar = (m0.a) this.f3219e.get(view);
            if (aVar != null) {
                aVar.g(view, xVar);
            } else {
                super.g(view, xVar);
            }
        }

        @Override // m0.a
        public void h(View view, AccessibilityEvent accessibilityEvent) {
            m0.a aVar = (m0.a) this.f3219e.get(view);
            if (aVar != null) {
                aVar.h(view, accessibilityEvent);
            } else {
                super.h(view, accessibilityEvent);
            }
        }

        @Override // m0.a
        public boolean i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            m0.a aVar = (m0.a) this.f3219e.get(viewGroup);
            return aVar != null ? aVar.i(viewGroup, view, accessibilityEvent) : super.i(viewGroup, view, accessibilityEvent);
        }

        @Override // m0.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (this.f3218d.o() || this.f3218d.f3216d.getLayoutManager() == null) {
                return super.j(view, i10, bundle);
            }
            m0.a aVar = (m0.a) this.f3219e.get(view);
            if (aVar != null) {
                if (aVar.j(view, i10, bundle)) {
                    return true;
                }
            } else if (super.j(view, i10, bundle)) {
                return true;
            }
            return this.f3218d.f3216d.getLayoutManager().n1(view, i10, bundle);
        }

        @Override // m0.a
        public void l(View view, int i10) {
            m0.a aVar = (m0.a) this.f3219e.get(view);
            if (aVar != null) {
                aVar.l(view, i10);
            } else {
                super.l(view, i10);
            }
        }

        @Override // m0.a
        public void m(View view, AccessibilityEvent accessibilityEvent) {
            m0.a aVar = (m0.a) this.f3219e.get(view);
            if (aVar != null) {
                aVar.m(view, accessibilityEvent);
            } else {
                super.m(view, accessibilityEvent);
            }
        }

        m0.a n(View view) {
            return (m0.a) this.f3219e.remove(view);
        }

        void o(View view) {
            m0.a aVarN = o0.n(view);
            if (aVarN == null || aVarN == this) {
                return;
            }
            this.f3219e.put(view, aVarN);
        }
    }

    public k(RecyclerView recyclerView) {
        this.f3216d = recyclerView;
        m0.a aVarN = n();
        if (aVarN == null || !(aVarN instanceof a)) {
            this.f3217e = new a(this);
        } else {
            this.f3217e = (a) aVarN;
        }
    }

    @Override // m0.a
    public void f(View view, AccessibilityEvent accessibilityEvent) {
        super.f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().P0(accessibilityEvent);
        }
    }

    @Override // m0.a
    public void g(View view, x xVar) {
        super.g(view, xVar);
        if (o() || this.f3216d.getLayoutManager() == null) {
            return;
        }
        this.f3216d.getLayoutManager().S0(xVar);
    }

    @Override // m0.a
    public boolean j(View view, int i10, Bundle bundle) {
        if (super.j(view, i10, bundle)) {
            return true;
        }
        if (o() || this.f3216d.getLayoutManager() == null) {
            return false;
        }
        return this.f3216d.getLayoutManager().l1(i10, bundle);
    }

    public m0.a n() {
        return this.f3217e;
    }

    boolean o() {
        return this.f3216d.x0();
    }
}
