package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.e;
import androidx.fragment.app.m0;
import androidx.fragment.app.q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import m0.t0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends m0 {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a extends m0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f2218d;

        /* JADX INFO: renamed from: androidx.fragment.app.e$a$a, reason: collision with other inner class name */
        public static final class AnimationAnimationListenerC0031a implements Animation.AnimationListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ m0.d f2219a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ViewGroup f2220b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View f2221c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a f2222d;

            AnimationAnimationListenerC0031a(m0.d dVar, ViewGroup viewGroup, View view, a aVar) {
                this.f2219a = dVar;
                this.f2220b = viewGroup;
                this.f2221c = view;
                this.f2222d = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void b(ViewGroup viewGroup, View view, a aVar) {
                rd.m.e(viewGroup, "$container");
                rd.m.e(aVar, "this$0");
                viewGroup.endViewTransition(view);
                aVar.h().a().e(aVar);
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationEnd(Animation animation) {
                rd.m.e(animation, "animation");
                final ViewGroup viewGroup = this.f2220b;
                final View view = this.f2221c;
                final a aVar = this.f2222d;
                viewGroup.post(new Runnable() { // from class: androidx.fragment.app.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.a.AnimationAnimationListenerC0031a.b(viewGroup, view, aVar);
                    }
                });
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f2219a + " has ended.");
                }
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationRepeat(Animation animation) {
                rd.m.e(animation, "animation");
            }

            @Override // android.view.animation.Animation.AnimationListener
            public void onAnimationStart(Animation animation) {
                rd.m.e(animation, "animation");
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Animation from operation " + this.f2219a + " has reached onAnimationStart.");
                }
            }
        }

        public a(b bVar) {
            rd.m.e(bVar, "animationInfo");
            this.f2218d = bVar;
        }

        @Override // androidx.fragment.app.m0.b
        public void c(ViewGroup viewGroup) {
            rd.m.e(viewGroup, "container");
            m0.d dVarA = this.f2218d.a();
            View view = dVarA.h().T;
            view.clearAnimation();
            viewGroup.endViewTransition(view);
            this.f2218d.a().e(this);
            if (w.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + dVarA + " has been cancelled.");
            }
        }

        @Override // androidx.fragment.app.m0.b
        public void d(ViewGroup viewGroup) {
            rd.m.e(viewGroup, "container");
            if (this.f2218d.b()) {
                this.f2218d.a().e(this);
                return;
            }
            Context context = viewGroup.getContext();
            m0.d dVarA = this.f2218d.a();
            View view = dVarA.h().T;
            b bVar = this.f2218d;
            rd.m.d(context, "context");
            q.a aVarC = bVar.c(context);
            if (aVarC == null) {
                throw new IllegalStateException("Required value was null.");
            }
            Animation animation = aVarC.f2441a;
            if (animation == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (dVarA.g() != m0.d.b.REMOVED) {
                view.startAnimation(animation);
                this.f2218d.a().e(this);
                return;
            }
            viewGroup.startViewTransition(view);
            q.b bVar2 = new q.b(animation, viewGroup, view);
            bVar2.setAnimationListener(new AnimationAnimationListenerC0031a(dVarA, viewGroup, view, this));
            view.startAnimation(bVar2);
            if (w.J0(2)) {
                Log.v("FragmentManager", "Animation from operation " + dVarA + " has started.");
            }
        }

        public final b h() {
            return this.f2218d;
        }
    }

    private static final class b extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f2223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f2224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private q.a f2225d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m0.d dVar, boolean z10) {
            super(dVar);
            rd.m.e(dVar, "operation");
            this.f2223b = z10;
        }

        public final q.a c(Context context) {
            rd.m.e(context, "context");
            if (this.f2224c) {
                return this.f2225d;
            }
            q.a aVarB = q.b(context, a().h(), a().g() == m0.d.b.VISIBLE, this.f2223b);
            this.f2225d = aVarB;
            this.f2224c = true;
            return aVarB;
        }
    }

    private static final class c extends m0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final b f2226d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private AnimatorSet f2227e;

        public static final class a extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewGroup f2228a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ View f2229b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ boolean f2230c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ m0.d f2231d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f2232e;

            a(ViewGroup viewGroup, View view, boolean z10, m0.d dVar, c cVar) {
                this.f2228a = viewGroup;
                this.f2229b = view;
                this.f2230c = z10;
                this.f2231d = dVar;
                this.f2232e = cVar;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                rd.m.e(animator, "anim");
                this.f2228a.endViewTransition(this.f2229b);
                if (this.f2230c || this.f2231d.g() == m0.d.b.GONE) {
                    m0.d.b bVarG = this.f2231d.g();
                    View view = this.f2229b;
                    rd.m.d(view, "viewToAnimate");
                    bVarG.d(view, this.f2228a);
                }
                this.f2232e.h().a().e(this.f2232e);
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Animator from operation " + this.f2231d + " has ended.");
                }
            }
        }

        public c(b bVar) {
            rd.m.e(bVar, "animatorInfo");
            this.f2226d = bVar;
        }

        @Override // androidx.fragment.app.m0.b
        public boolean b() {
            return true;
        }

        @Override // androidx.fragment.app.m0.b
        public void c(ViewGroup viewGroup) {
            rd.m.e(viewGroup, "container");
            AnimatorSet animatorSet = this.f2227e;
            if (animatorSet == null) {
                this.f2226d.a().e(this);
                return;
            }
            m0.d dVarA = this.f2226d.a();
            if (!dVarA.m()) {
                animatorSet.end();
            } else if (Build.VERSION.SDK_INT >= 26) {
                C0032e.f2234a.a(animatorSet);
            }
            if (w.J0(2)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Animator from operation ");
                sb2.append(dVarA);
                sb2.append(" has been canceled");
                sb2.append(dVarA.m() ? " with seeking." : ".");
                sb2.append(' ');
                Log.v("FragmentManager", sb2.toString());
            }
        }

        @Override // androidx.fragment.app.m0.b
        public void d(ViewGroup viewGroup) {
            rd.m.e(viewGroup, "container");
            m0.d dVarA = this.f2226d.a();
            AnimatorSet animatorSet = this.f2227e;
            if (animatorSet == null) {
                this.f2226d.a().e(this);
                return;
            }
            animatorSet.start();
            if (w.J0(2)) {
                Log.v("FragmentManager", "Animator from operation " + dVarA + " has started.");
            }
        }

        @Override // androidx.fragment.app.m0.b
        public void e(d.c cVar, ViewGroup viewGroup) {
            rd.m.e(cVar, "backEvent");
            rd.m.e(viewGroup, "container");
            m0.d dVarA = this.f2226d.a();
            AnimatorSet animatorSet = this.f2227e;
            if (animatorSet == null) {
                this.f2226d.a().e(this);
                return;
            }
            if (Build.VERSION.SDK_INT < 34 || !dVarA.h().f2400w) {
                return;
            }
            if (w.J0(2)) {
                Log.v("FragmentManager", "Adding BackProgressCallbacks for Animators to operation " + dVarA);
            }
            long jA = d.f2233a.a(animatorSet);
            long jA2 = (long) (cVar.a() * jA);
            if (jA2 == 0) {
                jA2 = 1;
            }
            if (jA2 == jA) {
                jA2 = jA - 1;
            }
            if (w.J0(2)) {
                Log.v("FragmentManager", "Setting currentPlayTime to " + jA2 + " for Animator " + animatorSet + " on operation " + dVarA);
            }
            C0032e.f2234a.b(animatorSet, jA2);
        }

        @Override // androidx.fragment.app.m0.b
        public void f(ViewGroup viewGroup) {
            c cVar;
            rd.m.e(viewGroup, "container");
            if (this.f2226d.b()) {
                return;
            }
            Context context = viewGroup.getContext();
            b bVar = this.f2226d;
            rd.m.d(context, "context");
            q.a aVarC = bVar.c(context);
            this.f2227e = aVarC != null ? aVarC.f2442b : null;
            m0.d dVarA = this.f2226d.a();
            o oVarH = dVarA.h();
            boolean z10 = dVarA.g() == m0.d.b.GONE;
            View view = oVarH.T;
            viewGroup.startViewTransition(view);
            AnimatorSet animatorSet = this.f2227e;
            if (animatorSet != null) {
                cVar = this;
                animatorSet.addListener(new a(viewGroup, view, z10, dVarA, cVar));
            } else {
                cVar = this;
            }
            AnimatorSet animatorSet2 = cVar.f2227e;
            if (animatorSet2 != null) {
                animatorSet2.setTarget(view);
            }
        }

        public final b h() {
            return this.f2226d;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f2233a = new d();

        private d() {
        }

        public final long a(AnimatorSet animatorSet) {
            rd.m.e(animatorSet, "animatorSet");
            return animatorSet.getTotalDuration();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.e$e, reason: collision with other inner class name */
    public static final class C0032e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0032e f2234a = new C0032e();

        private C0032e() {
        }

        public final void a(AnimatorSet animatorSet) {
            rd.m.e(animatorSet, "animatorSet");
            animatorSet.reverse();
        }

        public final void b(AnimatorSet animatorSet, long j10) {
            rd.m.e(animatorSet, "animatorSet");
            animatorSet.setCurrentPlayTime(j10);
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final m0.d f2235a;

        public f(m0.d dVar) {
            rd.m.e(dVar, "operation");
            this.f2235a = dVar;
        }

        public final m0.d a() {
            return this.f2235a;
        }

        public final boolean b() {
            View view = this.f2235a.h().T;
            m0.d.b bVarA = view != null ? m0.d.b.f2346a.a(view) : null;
            m0.d.b bVarG = this.f2235a.g();
            if (bVarA == bVarG) {
                return true;
            }
            m0.d.b bVar = m0.d.b.VISIBLE;
            return (bVarA == bVar || bVarG == bVar) ? false : true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class g extends m0.b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final List f2236d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final m0.d f2237e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final m0.d f2238f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final g0 f2239g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final Object f2240h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ArrayList f2241i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final ArrayList f2242j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final androidx.collection.a f2243k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final ArrayList f2244l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final ArrayList f2245m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final androidx.collection.a f2246n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private final androidx.collection.a f2247o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private final boolean f2248p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private final i0.d f2249q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Object f2250r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f2251s;

        static final class a extends rd.o implements qd.a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ViewGroup f2253c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f2254d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(ViewGroup viewGroup, Object obj) {
                super(0);
                this.f2253c = viewGroup;
                this.f2254d = obj;
            }

            @Override // qd.a
            public /* bridge */ /* synthetic */ Object a() {
                b();
                return dd.d0.f10897a;
            }

            public final void b() {
                g.this.v().e(this.f2253c, this.f2254d);
            }
        }

        static final class b extends rd.o implements qd.a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ViewGroup f2256c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f2257d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ rd.b0 f2258e;

            static final class a extends rd.o implements qd.a {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ g f2259b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Object f2260c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ViewGroup f2261d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                a(g gVar, Object obj, ViewGroup viewGroup) {
                    super(0);
                    this.f2259b = gVar;
                    this.f2260c = obj;
                    this.f2261d = viewGroup;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void g(g gVar, ViewGroup viewGroup) {
                    rd.m.e(gVar, "this$0");
                    rd.m.e(viewGroup, "$container");
                    Iterator it = gVar.w().iterator();
                    while (it.hasNext()) {
                        m0.d dVarA = ((h) it.next()).a();
                        View viewT1 = dVarA.h().T1();
                        if (viewT1 != null) {
                            dVarA.g().d(viewT1, viewGroup);
                        }
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void i(g gVar) {
                    rd.m.e(gVar, "this$0");
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "Transition for all operations has completed");
                    }
                    Iterator it = gVar.w().iterator();
                    while (it.hasNext()) {
                        ((h) it.next()).a().e(gVar);
                    }
                }

                @Override // qd.a
                public /* bridge */ /* synthetic */ Object a() {
                    e();
                    return dd.d0.f10897a;
                }

                public final void e() {
                    List listW = this.f2259b.w();
                    if (!d.h0.a(listW) || !listW.isEmpty()) {
                        Iterator it = listW.iterator();
                        while (it.hasNext()) {
                            if (!((h) it.next()).a().m()) {
                                if (w.J0(2)) {
                                    Log.v("FragmentManager", "Completing animating immediately");
                                }
                                i0.d dVar = new i0.d();
                                g0 g0VarV = this.f2259b.v();
                                o oVarH = ((h) this.f2259b.w().get(0)).a().h();
                                Object obj = this.f2260c;
                                final g gVar = this.f2259b;
                                g0VarV.w(oVarH, obj, dVar, new Runnable() { // from class: androidx.fragment.app.m
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        e.g.b.a.i(gVar);
                                    }
                                });
                                dVar.a();
                                return;
                            }
                        }
                    }
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "Animating to start");
                    }
                    g0 g0VarV2 = this.f2259b.v();
                    Object objS = this.f2259b.s();
                    rd.m.b(objS);
                    final g gVar2 = this.f2259b;
                    final ViewGroup viewGroup = this.f2261d;
                    g0VarV2.d(objS, new Runnable() { // from class: androidx.fragment.app.l
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.g.b.a.g(gVar2, viewGroup);
                        }
                    });
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(ViewGroup viewGroup, Object obj, rd.b0 b0Var) {
                super(0);
                this.f2256c = viewGroup;
                this.f2257d = obj;
                this.f2258e = b0Var;
            }

            @Override // qd.a
            public /* bridge */ /* synthetic */ Object a() {
                b();
                return dd.d0.f10897a;
            }

            public final void b() {
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                }
                g gVar = g.this;
                gVar.C(gVar.v().j(this.f2256c, this.f2257d));
                if (g.this.s() == null) {
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "TransitionSeekController was not created.");
                    }
                    g.this.D(true);
                    return;
                }
                this.f2258e.f25935a = new a(g.this, this.f2257d, this.f2256c);
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Started executing operations from " + g.this.t() + " to " + g.this.u());
                }
            }
        }

        public g(List list, m0.d dVar, m0.d dVar2, g0 g0Var, Object obj, ArrayList arrayList, ArrayList arrayList2, androidx.collection.a aVar, ArrayList arrayList3, ArrayList arrayList4, androidx.collection.a aVar2, androidx.collection.a aVar3, boolean z10) {
            rd.m.e(list, "transitionInfos");
            rd.m.e(g0Var, "transitionImpl");
            rd.m.e(arrayList, "sharedElementFirstOutViews");
            rd.m.e(arrayList2, "sharedElementLastInViews");
            rd.m.e(aVar, "sharedElementNameMapping");
            rd.m.e(arrayList3, "enteringNames");
            rd.m.e(arrayList4, "exitingNames");
            rd.m.e(aVar2, "firstOutViews");
            rd.m.e(aVar3, "lastInViews");
            this.f2236d = list;
            this.f2237e = dVar;
            this.f2238f = dVar2;
            this.f2239g = g0Var;
            this.f2240h = obj;
            this.f2241i = arrayList;
            this.f2242j = arrayList2;
            this.f2243k = aVar;
            this.f2244l = arrayList3;
            this.f2245m = arrayList4;
            this.f2246n = aVar2;
            this.f2247o = aVar3;
            this.f2248p = z10;
            this.f2249q = new i0.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(m0.d dVar, g gVar) {
            rd.m.e(dVar, "$operation");
            rd.m.e(gVar, "this$0");
            if (w.J0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.e(gVar);
        }

        private final void B(ArrayList arrayList, ViewGroup viewGroup, qd.a aVar) {
            e0.d(arrayList, 4);
            ArrayList arrayListQ = this.f2239g.q(this.f2242j);
            if (w.J0(2)) {
                Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                for (Object obj : this.f2241i) {
                    rd.m.d(obj, "sharedElementFirstOutViews");
                    View view = (View) obj;
                    Log.v("FragmentManager", "View: " + view + " Name: " + m0.o0.K(view));
                }
                Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                for (Object obj2 : this.f2242j) {
                    rd.m.d(obj2, "sharedElementLastInViews");
                    View view2 = (View) obj2;
                    Log.v("FragmentManager", "View: " + view2 + " Name: " + m0.o0.K(view2));
                }
            }
            aVar.a();
            this.f2239g.y(viewGroup, this.f2241i, this.f2242j, arrayListQ, this.f2243k);
            e0.d(arrayList, 0);
            this.f2239g.A(this.f2240h, this.f2241i, this.f2242j);
        }

        private final void n(ArrayList arrayList, View view) {
            if (!(view instanceof ViewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            if (t0.d(viewGroup)) {
                if (arrayList.contains(view)) {
                    return;
                }
                arrayList.add(view);
                return;
            }
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    rd.m.d(childAt, "child");
                    n(arrayList, childAt);
                }
            }
        }

        private final dd.q o(ViewGroup viewGroup, m0.d dVar, final m0.d dVar2) {
            final m0.d dVar3 = dVar;
            View view = new View(viewGroup.getContext());
            final Rect rect = new Rect();
            Iterator it = this.f2236d.iterator();
            View view2 = null;
            boolean z10 = false;
            while (it.hasNext()) {
                if (((h) it.next()).g() && dVar2 != null && dVar3 != null && !this.f2243k.isEmpty() && this.f2240h != null) {
                    e0.a(dVar3.h(), dVar2.h(), this.f2248p, this.f2246n, true);
                    m0.e0.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.i
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.g.p(dVar3, dVar2, this);
                        }
                    });
                    this.f2241i.addAll(this.f2246n.values());
                    if (!this.f2245m.isEmpty()) {
                        Object obj = this.f2245m.get(0);
                        rd.m.d(obj, "exitingNames[0]");
                        view2 = (View) this.f2246n.get((String) obj);
                        this.f2239g.v(this.f2240h, view2);
                    }
                    this.f2242j.addAll(this.f2247o.values());
                    if (!this.f2244l.isEmpty()) {
                        Object obj2 = this.f2244l.get(0);
                        rd.m.d(obj2, "enteringNames[0]");
                        final View view3 = (View) this.f2247o.get((String) obj2);
                        if (view3 != null) {
                            final g0 g0Var = this.f2239g;
                            m0.e0.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    e.g.q(g0Var, view3, rect);
                                }
                            });
                            z10 = true;
                        }
                    }
                    this.f2239g.z(this.f2240h, view, this.f2241i);
                    g0 g0Var2 = this.f2239g;
                    Object obj3 = this.f2240h;
                    g0Var2.s(obj3, null, null, null, null, obj3, this.f2242j);
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = this.f2236d.iterator();
            Object objP = null;
            Object objP2 = null;
            while (it2.hasNext()) {
                h hVar = (h) it2.next();
                m0.d dVarA = hVar.a();
                boolean z11 = z10;
                Object objH = this.f2239g.h(hVar.f());
                if (objH != null) {
                    final ArrayList arrayList2 = new ArrayList();
                    Iterator it3 = it2;
                    View view4 = dVarA.h().T;
                    rd.m.d(view4, "operation.fragment.mView");
                    n(arrayList2, view4);
                    if (this.f2240h != null && (dVarA == dVar2 || dVarA == dVar3)) {
                        if (dVarA == dVar2) {
                            arrayList2.removeAll(ed.q.M0(this.f2241i));
                        } else {
                            arrayList2.removeAll(ed.q.M0(this.f2242j));
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        this.f2239g.a(objH, view);
                    } else {
                        this.f2239g.b(objH, arrayList2);
                        this.f2239g.s(objH, objH, arrayList2, null, null, null, null);
                        if (dVarA.g() == m0.d.b.GONE) {
                            dVarA.q(false);
                            ArrayList arrayList3 = new ArrayList(arrayList2);
                            arrayList3.remove(dVarA.h().T);
                            this.f2239g.r(objH, dVarA.h().T, arrayList3);
                            m0.e0.a(viewGroup, new Runnable() { // from class: androidx.fragment.app.k
                                @Override // java.lang.Runnable
                                public final void run() {
                                    e.g.r(arrayList2);
                                }
                            });
                        }
                    }
                    if (dVarA.g() == m0.d.b.VISIBLE) {
                        arrayList.addAll(arrayList2);
                        if (z11) {
                            this.f2239g.u(objH, rect);
                        }
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "Entering Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> EnteringViews <<<<<");
                            for (Object obj4 : arrayList2) {
                                rd.m.d(obj4, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) obj4));
                            }
                        }
                    } else {
                        this.f2239g.v(objH, view2);
                        if (w.J0(2)) {
                            Log.v("FragmentManager", "Exiting Transition: " + objH);
                            Log.v("FragmentManager", ">>>>> ExitingViews <<<<<");
                            for (Object obj5 : arrayList2) {
                                rd.m.d(obj5, "transitioningViews");
                                Log.v("FragmentManager", "View: " + ((View) obj5));
                            }
                        }
                    }
                    if (hVar.h()) {
                        objP = this.f2239g.p(objP, objH, null);
                    } else {
                        objP2 = this.f2239g.p(objP2, objH, null);
                    }
                    dVar3 = dVar;
                    z10 = z11;
                    it2 = it3;
                } else {
                    dVar3 = dVar;
                    z10 = z11;
                }
            }
            Object objO = this.f2239g.o(objP, objP2, this.f2240h);
            if (w.J0(2)) {
                Log.v("FragmentManager", "Final merged transition: " + objO + " for container " + viewGroup);
            }
            return new dd.q(arrayList, objO);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void p(m0.d dVar, m0.d dVar2, g gVar) {
            rd.m.e(gVar, "this$0");
            e0.a(dVar.h(), dVar2.h(), gVar.f2248p, gVar.f2247o, false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void q(g0 g0Var, View view, Rect rect) {
            rd.m.e(g0Var, "$impl");
            rd.m.e(rect, "$lastInEpicenterRect");
            g0Var.k(view, rect);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void r(ArrayList arrayList) {
            rd.m.e(arrayList, "$transitioningViews");
            e0.d(arrayList, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void y(m0.d dVar, g gVar) {
            rd.m.e(dVar, "$operation");
            rd.m.e(gVar, "this$0");
            if (w.J0(2)) {
                Log.v("FragmentManager", "Transition for operation " + dVar + " has completed");
            }
            dVar.e(gVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void z(rd.b0 b0Var) {
            rd.m.e(b0Var, "$seekCancelLambda");
            qd.a aVar = (qd.a) b0Var.f25935a;
            if (aVar != null) {
                aVar.a();
            }
        }

        public final void C(Object obj) {
            this.f2250r = obj;
        }

        public final void D(boolean z10) {
            this.f2251s = z10;
        }

        @Override // androidx.fragment.app.m0.b
        public boolean b() {
            if (!this.f2239g.m()) {
                return false;
            }
            List<h> list = this.f2236d;
            if (!d.h0.a(list) || !list.isEmpty()) {
                for (h hVar : list) {
                    if (Build.VERSION.SDK_INT < 34 || hVar.f() == null || !this.f2239g.n(hVar.f())) {
                        return false;
                    }
                }
            }
            Object obj = this.f2240h;
            return obj == null || this.f2239g.n(obj);
        }

        @Override // androidx.fragment.app.m0.b
        public void c(ViewGroup viewGroup) {
            rd.m.e(viewGroup, "container");
            this.f2249q.a();
        }

        @Override // androidx.fragment.app.m0.b
        public void d(ViewGroup viewGroup) {
            rd.m.e(viewGroup, "container");
            if (!viewGroup.isLaidOut() || this.f2251s) {
                for (h hVar : this.f2236d) {
                    m0.d dVarA = hVar.a();
                    if (w.J0(2)) {
                        if (this.f2251s) {
                            Log.v("FragmentManager", "SpecialEffectsController: TransitionSeekController was not created. Completing operation " + dVarA);
                        } else {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Completing operation " + dVarA);
                        }
                    }
                    hVar.a().e(this);
                }
                this.f2251s = false;
                return;
            }
            Object obj = this.f2250r;
            if (obj != null) {
                g0 g0Var = this.f2239g;
                rd.m.b(obj);
                g0Var.c(obj);
                if (w.J0(2)) {
                    Log.v("FragmentManager", "Ending execution of operations from " + this.f2237e + " to " + this.f2238f);
                    return;
                }
                return;
            }
            dd.q qVarO = o(viewGroup, this.f2238f, this.f2237e);
            ArrayList arrayList = (ArrayList) qVarO.a();
            Object objB = qVarO.b();
            List list = this.f2236d;
            ArrayList<m0.d> arrayList2 = new ArrayList(ed.q.v(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(((h) it.next()).a());
            }
            for (final m0.d dVar : arrayList2) {
                this.f2239g.w(dVar.h(), objB, this.f2249q, new Runnable() { // from class: androidx.fragment.app.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        e.g.y(dVar, this);
                    }
                });
            }
            B(arrayList, viewGroup, new a(viewGroup, objB));
            if (w.J0(2)) {
                Log.v("FragmentManager", "Completed executing operations from " + this.f2237e + " to " + this.f2238f);
            }
        }

        @Override // androidx.fragment.app.m0.b
        public void e(d.c cVar, ViewGroup viewGroup) {
            rd.m.e(cVar, "backEvent");
            rd.m.e(viewGroup, "container");
            Object obj = this.f2250r;
            if (obj != null) {
                this.f2239g.t(obj, cVar.a());
            }
        }

        @Override // androidx.fragment.app.m0.b
        public void f(ViewGroup viewGroup) {
            rd.m.e(viewGroup, "container");
            if (!viewGroup.isLaidOut()) {
                Iterator it = this.f2236d.iterator();
                while (it.hasNext()) {
                    m0.d dVarA = ((h) it.next()).a();
                    if (w.J0(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Container " + viewGroup + " has not been laid out. Skipping onStart for operation " + dVarA);
                    }
                }
                return;
            }
            if (x() && this.f2240h != null && !b()) {
                Log.i("FragmentManager", "Ignoring shared elements transition " + this.f2240h + " between " + this.f2237e + " and " + this.f2238f + " as neither fragment has set a Transition. In order to run a SharedElementTransition, you must also set either an enter or exit transition on a fragment involved in the transaction. The sharedElementTransition will run after the back gesture has been committed.");
            }
            if (b() && x()) {
                final rd.b0 b0Var = new rd.b0();
                dd.q qVarO = o(viewGroup, this.f2238f, this.f2237e);
                ArrayList arrayList = (ArrayList) qVarO.a();
                Object objB = qVarO.b();
                List list = this.f2236d;
                ArrayList<m0.d> arrayList2 = new ArrayList(ed.q.v(list, 10));
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((h) it2.next()).a());
                }
                for (final m0.d dVar : arrayList2) {
                    this.f2239g.x(dVar.h(), objB, this.f2249q, new Runnable() { // from class: androidx.fragment.app.f
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.g.z(b0Var);
                        }
                    }, new Runnable() { // from class: androidx.fragment.app.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            e.g.A(dVar, this);
                        }
                    });
                }
                B(arrayList, viewGroup, new b(viewGroup, objB, b0Var));
            }
        }

        public final Object s() {
            return this.f2250r;
        }

        public final m0.d t() {
            return this.f2237e;
        }

        public final m0.d u() {
            return this.f2238f;
        }

        public final g0 v() {
            return this.f2239g;
        }

        public final List w() {
            return this.f2236d;
        }

        public final boolean x() {
            List list = this.f2236d;
            if (d.h0.a(list) && list.isEmpty()) {
                return true;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((h) it.next()).a().h().f2400w) {
                    return false;
                }
            }
            return true;
        }
    }

    private static final class h extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f2262b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f2263c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f2264d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(m0.d dVar, boolean z10, boolean z11) {
            Object objI1;
            super(dVar);
            rd.m.e(dVar, "operation");
            m0.d.b bVarG = dVar.g();
            m0.d.b bVar = m0.d.b.VISIBLE;
            if (bVarG == bVar) {
                o oVarH = dVar.h();
                objI1 = z10 ? oVarH.G1() : oVarH.m1();
            } else {
                o oVarH2 = dVar.h();
                objI1 = z10 ? oVarH2.I1() : oVarH2.p1();
            }
            this.f2262b = objI1;
            this.f2263c = dVar.g() == bVar ? z10 ? dVar.h().g1() : dVar.h().f1() : true;
            this.f2264d = z11 ? z10 ? dVar.h().K1() : dVar.h().J1() : null;
        }

        private final g0 d(Object obj) {
            if (obj == null) {
                return null;
            }
            g0 g0Var = e0.f2267b;
            if (g0Var != null && g0Var.g(obj)) {
                return g0Var;
            }
            g0 g0Var2 = e0.f2268c;
            if (g0Var2 != null && g0Var2.g(obj)) {
                return g0Var2;
            }
            throw new IllegalArgumentException("Transition " + obj + " for fragment " + a().h() + " is not a valid framework Transition or AndroidX Transition");
        }

        public final g0 c() {
            g0 g0VarD = d(this.f2262b);
            g0 g0VarD2 = d(this.f2264d);
            if (g0VarD == null || g0VarD2 == null || g0VarD == g0VarD2) {
                return g0VarD == null ? g0VarD2 : g0VarD;
            }
            throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + a().h() + " returned Transition " + this.f2262b + " which uses a different Transition  type than its shared element transition " + this.f2264d).toString());
        }

        public final Object e() {
            return this.f2264d;
        }

        public final Object f() {
            return this.f2262b;
        }

        public final boolean g() {
            return this.f2264d != null;
        }

        public final boolean h() {
            return this.f2263c;
        }
    }

    static final class i extends rd.o implements qd.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Collection f2265b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(Collection collection) {
            super(1);
            this.f2265b = collection;
        }

        @Override // qd.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean l(Map.Entry entry) {
            rd.m.e(entry, "entry");
            return Boolean.valueOf(ed.q.T(this.f2265b, m0.o0.K((View) entry.getValue())));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ViewGroup viewGroup) {
        super(viewGroup);
        rd.m.e(viewGroup, "container");
    }

    private final void F(List list) {
        ArrayList<b> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ed.q.A(arrayList2, ((b) it.next()).a().f());
        }
        boolean zIsEmpty = arrayList2.isEmpty();
        Iterator it2 = list.iterator();
        boolean z10 = false;
        while (it2.hasNext()) {
            b bVar = (b) it2.next();
            Context context = t().getContext();
            m0.d dVarA = bVar.a();
            rd.m.d(context, "context");
            q.a aVarC = bVar.c(context);
            if (aVarC != null) {
                if (aVarC.f2442b == null) {
                    arrayList.add(bVar);
                } else {
                    o oVarH = dVarA.h();
                    if (dVarA.f().isEmpty()) {
                        if (dVarA.g() == m0.d.b.GONE) {
                            dVarA.q(false);
                        }
                        dVarA.b(new c(bVar));
                        z10 = true;
                    } else if (w.J0(2)) {
                        Log.v("FragmentManager", "Ignoring Animator set on " + oVarH + " as this Fragment was involved in a Transition.");
                    }
                }
            }
        }
        for (b bVar2 : arrayList) {
            m0.d dVarA2 = bVar2.a();
            o oVarH2 = dVarA2.h();
            if (zIsEmpty) {
                if (!z10) {
                    dVarA2.b(new a(bVar2));
                } else if (w.J0(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + oVarH2 + " as Animations cannot run alongside Animators.");
                }
            } else if (w.J0(2)) {
                Log.v("FragmentManager", "Ignoring Animation set on " + oVarH2 + " as Animations cannot run alongside Transitions.");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(e eVar, m0.d dVar) {
        rd.m.e(eVar, "this$0");
        rd.m.e(dVar, "$operation");
        eVar.c(dVar);
    }

    private final void H(List list, boolean z10, m0.d dVar, m0.d dVar2) {
        Object objB;
        Iterator it;
        ArrayList arrayList;
        dd.q qVarA;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!((h) obj).b()) {
                arrayList2.add(obj);
            }
        }
        ArrayList<h> arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            if (((h) obj2).c() != null) {
                arrayList3.add(obj2);
            }
        }
        g0 g0Var = null;
        for (h hVar : arrayList3) {
            g0 g0VarC = hVar.c();
            if (g0Var != null && g0VarC != g0Var) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + hVar.a().h() + " returned Transition " + hVar.f() + " which uses a different Transition type than other Fragments.").toString());
            }
            g0Var = g0VarC;
        }
        if (g0Var == null) {
            return;
        }
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        androidx.collection.a aVar = new androidx.collection.a();
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        androidx.collection.a aVar2 = new androidx.collection.a();
        androidx.collection.a aVar3 = new androidx.collection.a();
        ArrayList arrayListM1 = arrayList6;
        Iterator it2 = arrayList3.iterator();
        ArrayList arrayListL1 = arrayList7;
        loop3: while (true) {
            objB = null;
            while (it2.hasNext()) {
                h hVar2 = (h) it2.next();
                if (hVar2.g() && dVar != null && dVar2 != null) {
                    objB = g0Var.B(g0Var.h(hVar2.e()));
                    arrayListL1 = dVar2.h().L1();
                    rd.m.d(arrayListL1, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList arrayListL12 = dVar.h().L1();
                    rd.m.d(arrayListL12, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList arrayListM12 = dVar.h().M1();
                    rd.m.d(arrayListM12, "firstOut.fragment.sharedElementTargetNames");
                    int size = arrayListM12.size();
                    it = it2;
                    int i10 = 0;
                    while (i10 < size) {
                        ArrayList arrayList8 = arrayList3;
                        int iIndexOf = arrayListL1.indexOf(arrayListM12.get(i10));
                        int i11 = size;
                        if (iIndexOf != -1) {
                            arrayListL1.set(iIndexOf, arrayListL12.get(i10));
                        }
                        i10++;
                        arrayList3 = arrayList8;
                        size = i11;
                    }
                    arrayList = arrayList3;
                    arrayListM1 = dVar2.h().M1();
                    rd.m.d(arrayListM1, "lastIn.fragment.sharedElementTargetNames");
                    if (z10) {
                        dVar.h().n1();
                        dVar2.h().q1();
                        qVarA = dd.w.a(null, null);
                    } else {
                        dVar.h().q1();
                        dVar2.h().n1();
                        qVarA = dd.w.a(null, null);
                    }
                    android.support.v4.media.session.b.a(qVarA.a());
                    android.support.v4.media.session.b.a(qVarA.b());
                    int i12 = 0;
                    for (int size2 = arrayListL1.size(); i12 < size2; size2 = size2) {
                        Object obj3 = arrayListL1.get(i12);
                        rd.m.d(obj3, "exitingNames[i]");
                        Object obj4 = arrayListM1.get(i12);
                        rd.m.d(obj4, "enteringNames[i]");
                        aVar.put((String) obj3, (String) obj4);
                        i12++;
                    }
                    if (w.J0(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        for (Iterator it3 = arrayListM1.iterator(); it3.hasNext(); it3 = it3) {
                            Log.v("FragmentManager", "Name: " + ((String) it3.next()));
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for (Iterator it4 = arrayListL1.iterator(); it4.hasNext(); it4 = it4) {
                            Log.v("FragmentManager", "Name: " + ((String) it4.next()));
                        }
                    }
                    View view = dVar.h().T;
                    rd.m.d(view, "firstOut.fragment.mView");
                    I(aVar2, view);
                    aVar2.n(arrayListL1);
                    aVar.n(aVar2.keySet());
                    View view2 = dVar2.h().T;
                    rd.m.d(view2, "lastIn.fragment.mView");
                    I(aVar3, view2);
                    aVar3.n(arrayListM1);
                    aVar3.n(aVar.values());
                    e0.c(aVar, aVar3);
                    Collection collectionKeySet = aVar.keySet();
                    rd.m.d(collectionKeySet, "sharedElementNameMapping.keys");
                    J(aVar2, collectionKeySet);
                    Collection collectionValues = aVar.values();
                    rd.m.d(collectionValues, "sharedElementNameMapping.values");
                    J(aVar3, collectionValues);
                    if (aVar.isEmpty()) {
                        break;
                    }
                } else {
                    it = it2;
                    arrayList = arrayList3;
                }
                it2 = it;
                arrayList3 = arrayList;
            }
            Log.i("FragmentManager", "Ignoring shared elements transition " + objB + " between " + dVar + " and " + dVar2 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
            arrayList4.clear();
            arrayList5.clear();
            it2 = it;
            arrayList3 = arrayList;
        }
        ArrayList arrayList9 = arrayList3;
        if (objB == null) {
            if (arrayList9.isEmpty()) {
                return;
            }
            Iterator it5 = arrayList9.iterator();
            while (it5.hasNext()) {
                if (((h) it5.next()).f() == null) {
                }
            }
            return;
        }
        g gVar = new g(arrayList9, dVar, dVar2, g0Var, objB, arrayList4, arrayList5, aVar, arrayListM1, arrayListL1, aVar2, aVar3, z10);
        Iterator it6 = arrayList9.iterator();
        while (it6.hasNext()) {
            ((h) it6.next()).a().b(gVar);
        }
    }

    private final void I(Map map, View view) {
        String strK = m0.o0.K(view);
        if (strK != null) {
            map.put(strK, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt.getVisibility() == 0) {
                    rd.m.d(childAt, "child");
                    I(map, childAt);
                }
            }
        }
    }

    private final void J(androidx.collection.a aVar, Collection collection) {
        Set setEntrySet = aVar.entrySet();
        rd.m.d(setEntrySet, "entries");
        ed.q.G(setEntrySet, new i(collection));
    }

    private final void K(List list) {
        o oVarH = ((m0.d) ed.q.k0(list)).h();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            m0.d dVar = (m0.d) it.next();
            dVar.h().W.f2422c = oVarH.W.f2422c;
            dVar.h().W.f2423d = oVarH.W.f2423d;
            dVar.h().W.f2424e = oVarH.W.f2424e;
            dVar.h().W.f2425f = oVarH.W.f2425f;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c4  */
    @Override // androidx.fragment.app.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void d(java.util.List r11, boolean r12) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.e.d(java.util.List, boolean):void");
    }
}
