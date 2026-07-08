package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import m0.o0;

/* JADX INFO: loaded from: classes.dex */
public class c extends m {

    /* JADX INFO: renamed from: s */
    private static TimeInterpolator f3104s;

    /* JADX INFO: renamed from: h */
    private ArrayList f3105h = new ArrayList();

    /* JADX INFO: renamed from: i */
    private ArrayList f3106i = new ArrayList();

    /* JADX INFO: renamed from: j */
    private ArrayList f3107j = new ArrayList();

    /* JADX INFO: renamed from: k */
    private ArrayList f3108k = new ArrayList();

    /* JADX INFO: renamed from: l */
    ArrayList f3109l = new ArrayList();

    /* JADX INFO: renamed from: m */
    ArrayList f3110m = new ArrayList();

    /* JADX INFO: renamed from: n */
    ArrayList f3111n = new ArrayList();

    /* JADX INFO: renamed from: o */
    ArrayList f3112o = new ArrayList();

    /* JADX INFO: renamed from: p */
    ArrayList f3113p = new ArrayList();

    /* JADX INFO: renamed from: q */
    ArrayList f3114q = new ArrayList();

    /* JADX INFO: renamed from: r */
    ArrayList f3115r = new ArrayList();

    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayList f3116a;

        a(ArrayList arrayList) {
            this.f3116a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f3116a) {
                c.this.S(jVar.f3150a, jVar.f3151b, jVar.f3152c, jVar.f3153d, jVar.f3154e);
            }
            this.f3116a.clear();
            c.this.f3110m.remove(this.f3116a);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayList f3118a;

        b(ArrayList arrayList) {
            this.f3118a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3118a.iterator();
            while (it.hasNext()) {
                c.this.R((i) it.next());
            }
            this.f3118a.clear();
            c.this.f3111n.remove(this.f3118a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.c$c */
    class RunnableC0043c implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ ArrayList f3120a;

        RunnableC0043c(ArrayList arrayList) {
            this.f3120a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f3120a.iterator();
            while (it.hasNext()) {
                c.this.Q((RecyclerView.f0) it.next());
            }
            this.f3120a.clear();
            c.this.f3109l.remove(this.f3120a);
        }
    }

    class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RecyclerView.f0 f3122a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3123b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f3124c;

        d(RecyclerView.f0 f0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3122a = f0Var;
            this.f3123b = viewPropertyAnimator;
            this.f3124c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3123b.setListener(null);
            this.f3124c.setAlpha(1.0f);
            c.this.G(this.f3122a);
            c.this.f3114q.remove(this.f3122a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.H(this.f3122a);
        }
    }

    class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RecyclerView.f0 f3126a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f3127b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f3128c;

        e(RecyclerView.f0 f0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3126a = f0Var;
            this.f3127b = view;
            this.f3128c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f3127b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3128c.setListener(null);
            c.this.A(this.f3126a);
            c.this.f3112o.remove(this.f3126a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.B(this.f3126a);
        }
    }

    class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ RecyclerView.f0 f3130a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f3131b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f3132c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f3133d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f3134e;

        f(RecyclerView.f0 f0Var, int i10, View view, int i11, ViewPropertyAnimator viewPropertyAnimator) {
            this.f3130a = f0Var;
            this.f3131b = i10;
            this.f3132c = view;
            this.f3133d = i11;
            this.f3134e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f3131b != 0) {
                this.f3132c.setTranslationX(0.0f);
            }
            if (this.f3133d != 0) {
                this.f3132c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3134e.setListener(null);
            c.this.E(this.f3130a);
            c.this.f3113p.remove(this.f3130a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.F(this.f3130a);
        }
    }

    class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ i f3136a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3137b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f3138c;

        g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3136a = iVar;
            this.f3137b = viewPropertyAnimator;
            this.f3138c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3137b.setListener(null);
            this.f3138c.setAlpha(1.0f);
            this.f3138c.setTranslationX(0.0f);
            this.f3138c.setTranslationY(0.0f);
            c.this.C(this.f3136a.f3144a, true);
            c.this.f3115r.remove(this.f3136a.f3144a);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f3136a.f3144a, true);
        }
    }

    class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ i f3140a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f3141b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ View f3142c;

        h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f3140a = iVar;
            this.f3141b = viewPropertyAnimator;
            this.f3142c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f3141b.setListener(null);
            this.f3142c.setAlpha(1.0f);
            this.f3142c.setTranslationX(0.0f);
            this.f3142c.setTranslationY(0.0f);
            c.this.C(this.f3140a.f3145b, false);
            c.this.f3115r.remove(this.f3140a.f3145b);
            c.this.V();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.D(this.f3140a.f3145b, false);
        }
    }

    private static class j {

        /* JADX INFO: renamed from: a */
        public RecyclerView.f0 f3150a;

        /* JADX INFO: renamed from: b */
        public int f3151b;

        /* JADX INFO: renamed from: c */
        public int f3152c;

        /* JADX INFO: renamed from: d */
        public int f3153d;

        /* JADX INFO: renamed from: e */
        public int f3154e;

        j(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
            this.f3150a = f0Var;
            this.f3151b = i10;
            this.f3152c = i11;
            this.f3153d = i12;
            this.f3154e = i13;
        }
    }

    private void T(RecyclerView.f0 f0Var) {
        View view = f0Var.f2964a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3114q.add(f0Var);
        viewPropertyAnimatorAnimate.setDuration(o()).alpha(0.0f).setListener(new d(f0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    private void W(List list, RecyclerView.f0 f0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = (i) list.get(size);
            if (Y(iVar, f0Var) && iVar.f3144a == null && iVar.f3145b == null) {
                list.remove(iVar);
            }
        }
    }

    private void X(i iVar) {
        RecyclerView.f0 f0Var = iVar.f3144a;
        if (f0Var != null) {
            Y(iVar, f0Var);
        }
        RecyclerView.f0 f0Var2 = iVar.f3145b;
        if (f0Var2 != null) {
            Y(iVar, f0Var2);
        }
    }

    private boolean Y(i iVar, RecyclerView.f0 f0Var) {
        boolean z10 = false;
        if (iVar.f3145b == f0Var) {
            iVar.f3145b = null;
        } else {
            if (iVar.f3144a != f0Var) {
                return false;
            }
            iVar.f3144a = null;
            z10 = true;
        }
        f0Var.f2964a.setAlpha(1.0f);
        f0Var.f2964a.setTranslationX(0.0f);
        f0Var.f2964a.setTranslationY(0.0f);
        C(f0Var, z10);
        return true;
    }

    private void Z(RecyclerView.f0 f0Var) {
        if (f3104s == null) {
            f3104s = new ValueAnimator().getInterpolator();
        }
        f0Var.f2964a.animate().setInterpolator(f3104s);
        j(f0Var);
    }

    void Q(RecyclerView.f0 f0Var) {
        View view = f0Var.f2964a;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3112o.add(f0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(l()).setListener(new e(f0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    void R(i iVar) {
        RecyclerView.f0 f0Var = iVar.f3144a;
        View view = f0Var == null ? null : f0Var.f2964a;
        RecyclerView.f0 f0Var2 = iVar.f3145b;
        View view2 = f0Var2 != null ? f0Var2.f2964a : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(m());
            this.f3115r.add(iVar.f3144a);
            duration.translationX(iVar.f3148e - iVar.f3146c);
            duration.translationY(iVar.f3149f - iVar.f3147d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f3115r.add(iVar.f3145b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(m()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    void S(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        View view = f0Var.f2964a;
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        if (i14 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i15 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f3113p.add(f0Var);
        viewPropertyAnimatorAnimate.setDuration(n()).setListener(new f(f0Var, i14, view, i15, viewPropertyAnimatorAnimate)).start();
    }

    void U(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ((RecyclerView.f0) list.get(size)).f2964a.animate().cancel();
        }
    }

    void V() {
        if (p()) {
            return;
        }
        i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean g(RecyclerView.f0 f0Var, List list) {
        return !list.isEmpty() || super.g(f0Var, list);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void j(RecyclerView.f0 f0Var) {
        View view = f0Var.f2964a;
        view.animate().cancel();
        int size = this.f3107j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((j) this.f3107j.get(size)).f3150a == f0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                E(f0Var);
                this.f3107j.remove(size);
            }
        }
        W(this.f3108k, f0Var);
        if (this.f3105h.remove(f0Var)) {
            view.setAlpha(1.0f);
            G(f0Var);
        }
        if (this.f3106i.remove(f0Var)) {
            view.setAlpha(1.0f);
            A(f0Var);
        }
        for (int size2 = this.f3111n.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList = (ArrayList) this.f3111n.get(size2);
            W(arrayList, f0Var);
            if (arrayList.isEmpty()) {
                this.f3111n.remove(size2);
            }
        }
        for (int size3 = this.f3110m.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList2 = (ArrayList) this.f3110m.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((j) arrayList2.get(size4)).f3150a == f0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    E(f0Var);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.f3110m.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.f3109l.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList3 = (ArrayList) this.f3109l.get(size5);
            if (arrayList3.remove(f0Var)) {
                view.setAlpha(1.0f);
                A(f0Var);
                if (arrayList3.isEmpty()) {
                    this.f3109l.remove(size5);
                }
            }
        }
        this.f3114q.remove(f0Var);
        this.f3112o.remove(f0Var);
        this.f3115r.remove(f0Var);
        this.f3113p.remove(f0Var);
        V();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void k() {
        int size = this.f3107j.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = (j) this.f3107j.get(size);
            View view = jVar.f3150a.f2964a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            E(jVar.f3150a);
            this.f3107j.remove(size);
        }
        for (int size2 = this.f3105h.size() - 1; size2 >= 0; size2--) {
            G((RecyclerView.f0) this.f3105h.get(size2));
            this.f3105h.remove(size2);
        }
        int size3 = this.f3106i.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.f0 f0Var = (RecyclerView.f0) this.f3106i.get(size3);
            f0Var.f2964a.setAlpha(1.0f);
            A(f0Var);
            this.f3106i.remove(size3);
        }
        for (int size4 = this.f3108k.size() - 1; size4 >= 0; size4--) {
            X((i) this.f3108k.get(size4));
        }
        this.f3108k.clear();
        if (p()) {
            for (int size5 = this.f3110m.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList = (ArrayList) this.f3110m.get(size5);
                for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = (j) arrayList.get(size6);
                    View view2 = jVar2.f3150a.f2964a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    E(jVar2.f3150a);
                    arrayList.remove(size6);
                    if (arrayList.isEmpty()) {
                        this.f3110m.remove(arrayList);
                    }
                }
            }
            for (int size7 = this.f3109l.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList2 = (ArrayList) this.f3109l.get(size7);
                for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.f0 f0Var2 = (RecyclerView.f0) arrayList2.get(size8);
                    f0Var2.f2964a.setAlpha(1.0f);
                    A(f0Var2);
                    arrayList2.remove(size8);
                    if (arrayList2.isEmpty()) {
                        this.f3109l.remove(arrayList2);
                    }
                }
            }
            for (int size9 = this.f3111n.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList3 = (ArrayList) this.f3111n.get(size9);
                for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                    X((i) arrayList3.get(size10));
                    if (arrayList3.isEmpty()) {
                        this.f3111n.remove(arrayList3);
                    }
                }
            }
            U(this.f3114q);
            U(this.f3113p);
            U(this.f3112o);
            U(this.f3115r);
            i();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public boolean p() {
        return (this.f3106i.isEmpty() && this.f3108k.isEmpty() && this.f3107j.isEmpty() && this.f3105h.isEmpty() && this.f3113p.isEmpty() && this.f3114q.isEmpty() && this.f3112o.isEmpty() && this.f3115r.isEmpty() && this.f3110m.isEmpty() && this.f3109l.isEmpty() && this.f3111n.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.n
    public void u() {
        boolean zIsEmpty = this.f3105h.isEmpty();
        boolean zIsEmpty2 = this.f3107j.isEmpty();
        boolean zIsEmpty3 = this.f3108k.isEmpty();
        boolean zIsEmpty4 = this.f3106i.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator it = this.f3105h.iterator();
        while (it.hasNext()) {
            T((RecyclerView.f0) it.next());
        }
        this.f3105h.clear();
        if (!zIsEmpty2) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.f3107j);
            this.f3110m.add(arrayList);
            this.f3107j.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                o0.f0(((j) arrayList.get(0)).f3150a.f2964a, aVar, o());
            }
        }
        if (!zIsEmpty3) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(this.f3108k);
            this.f3111n.add(arrayList2);
            this.f3108k.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                o0.f0(((i) arrayList2.get(0)).f3144a.f2964a, bVar, o());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(this.f3106i);
        this.f3109l.add(arrayList3);
        this.f3106i.clear();
        RunnableC0043c runnableC0043c = new RunnableC0043c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC0043c.run();
        } else {
            o0.f0(((RecyclerView.f0) arrayList3.get(0)).f2964a, runnableC0043c, (!zIsEmpty ? o() : 0L) + Math.max(!zIsEmpty2 ? n() : 0L, zIsEmpty3 ? 0L : m()));
        }
    }

    @Override // androidx.recyclerview.widget.m
    public boolean w(RecyclerView.f0 f0Var) {
        Z(f0Var);
        f0Var.f2964a.setAlpha(0.0f);
        this.f3106i.add(f0Var);
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean x(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
        if (f0Var == f0Var2) {
            return y(f0Var, i10, i11, i12, i13);
        }
        float translationX = f0Var.f2964a.getTranslationX();
        float translationY = f0Var.f2964a.getTranslationY();
        float alpha = f0Var.f2964a.getAlpha();
        Z(f0Var);
        int i14 = (int) ((i12 - i10) - translationX);
        int i15 = (int) ((i13 - i11) - translationY);
        f0Var.f2964a.setTranslationX(translationX);
        f0Var.f2964a.setTranslationY(translationY);
        f0Var.f2964a.setAlpha(alpha);
        if (f0Var2 != null) {
            Z(f0Var2);
            f0Var2.f2964a.setTranslationX(-i14);
            f0Var2.f2964a.setTranslationY(-i15);
            f0Var2.f2964a.setAlpha(0.0f);
        }
        this.f3108k.add(new i(f0Var, f0Var2, i10, i11, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean y(RecyclerView.f0 f0Var, int i10, int i11, int i12, int i13) {
        View view = f0Var.f2964a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) f0Var.f2964a.getTranslationY());
        Z(f0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            E(f0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        this.f3107j.add(new j(f0Var, translationX, translationY, i12, i13));
        return true;
    }

    @Override // androidx.recyclerview.widget.m
    public boolean z(RecyclerView.f0 f0Var) {
        Z(f0Var);
        this.f3105h.add(f0Var);
        return true;
    }

    private static class i {

        /* JADX INFO: renamed from: a */
        public RecyclerView.f0 f3144a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.f0 f3145b;

        /* JADX INFO: renamed from: c */
        public int f3146c;

        /* JADX INFO: renamed from: d */
        public int f3147d;

        /* JADX INFO: renamed from: e */
        public int f3148e;

        /* JADX INFO: renamed from: f */
        public int f3149f;

        private i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2) {
            this.f3144a = f0Var;
            this.f3145b = f0Var2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f3144a + ", newHolder=" + this.f3145b + ", fromX=" + this.f3146c + ", fromY=" + this.f3147d + ", toX=" + this.f3148e + ", toY=" + this.f3149f + '}';
        }

        i(RecyclerView.f0 f0Var, RecyclerView.f0 f0Var2, int i10, int i11, int i12, int i13) {
            this(f0Var, f0Var2);
            this.f3146c = i10;
            this.f3147d = i11;
            this.f3148e = i12;
            this.f3149f = i13;
        }
    }
}
