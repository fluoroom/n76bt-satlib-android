package sa;

import android.R;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.IBinder;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import com.facebook.stetho.websocket.CloseCodes;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import dd.d0;
import dd.q;
import ed.k0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import rd.m;
import za.b;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a */
    private final Context f27109a;

    /* JADX INFO: renamed from: b */
    private ta.a f27110b;

    /* JADX INFO: renamed from: c */
    private WindowManager f27111c;

    /* JADX INFO: renamed from: d */
    private WindowManager.LayoutParams f27112d;

    /* JADX INFO: renamed from: e */
    private za.b f27113e;

    /* JADX INFO: renamed from: f */
    private g f27114f;

    /* JADX INFO: renamed from: g */
    private Animator f27115g;

    /* JADX INFO: renamed from: h */
    private int f27116h;

    /* JADX INFO: renamed from: i */
    private int f27117i;

    public static final class a implements va.e {
        a() {
        }

        @Override // va.e
        public void a(MotionEvent motionEvent) {
            m.e(motionEvent, "event");
            g gVar = d.this.f27114f;
            if (gVar == null) {
                m.o("touchUtils");
                gVar = null;
            }
            za.b bVarR = d.this.r();
            m.b(bVarR);
            WindowManager windowManagerU = d.this.u();
            m.b(windowManagerU);
            WindowManager.LayoutParams layoutParamsS = d.this.s();
            m.b(layoutParamsS);
            gVar.j(bVarR, motionEvent, windowManagerU, layoutParamsS);
        }
    }

    public static final class b implements b.a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f27120b;

        b(View view) {
            this.f27120b = view;
        }

        @Override // za.b.a
        public void a() {
            d dVar = d.this;
            dVar.C(dVar.r());
            d dVar2 = d.this;
            za.b bVarR = dVar2.r();
            dVar2.f27116h = bVarR != null ? bVarR.getMeasuredWidth() : -1;
            d dVar3 = d.this;
            za.b bVarR2 = dVar3.r();
            dVar3.f27117i = bVarR2 != null ? bVarR2.getMeasuredHeight() : -1;
            ta.a aVarQ = d.this.q();
            d dVar4 = d.this;
            View view = this.f27120b;
            if (aVarQ.e() || ((aVarQ.x() == ua.a.f29001c && ya.f.f32462a.j()) || (aVarQ.x() == ua.a.f29000b && !ya.f.f32462a.j()))) {
                d.E(dVar4, 8, false, 2, null);
                dVar4.v();
                view.setVisibility(0);
            } else {
                m.b(view);
                dVar4.o(view);
            }
            aVarQ.O(view);
            aVarQ.n();
            va.d dVarC = aVarQ.c();
            if (dVarC != null) {
                dVarC.e(true, null, view);
            }
            aVarQ.h();
        }
    }

    public static final class c implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f27122b;

        c(View view) {
            this.f27122b = view;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m.e(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.e(animator, "animation");
            d.this.q().G(false);
            if (!d.this.q().m()) {
                WindowManager.LayoutParams layoutParamsS = d.this.s();
                m.b(layoutParamsS);
                layoutParamsS.flags = 40;
                if (d.this.q().F()) {
                    WindowManager.LayoutParams layoutParamsS2 = d.this.s();
                    m.b(layoutParamsS2);
                    WindowManager.LayoutParams layoutParamsS3 = d.this.s();
                    m.b(layoutParamsS3);
                    layoutParamsS2.flags = layoutParamsS3.flags | 16;
                }
            }
            d.this.v();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            m.e(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.e(animator, "animation");
            this.f27122b.setVisibility(0);
            d.this.q().G(true);
        }
    }

    /* JADX INFO: renamed from: sa.d$d */
    public static final class C0375d implements Animator.AnimatorListener {
        C0375d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m.e(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m.e(animator, "animation");
            d.y(d.this, false, 1, null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            m.e(animator, "animation");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            m.e(animator, "animation");
        }
    }

    public d(Context context, ta.a aVar) {
        m.e(context, "context");
        m.e(aVar, "config");
        this.f27109a = context;
        this.f27110b = aVar;
        this.f27116h = -1;
        this.f27117i = -1;
    }

    private final void A() {
        ViewTreeObserver viewTreeObserver;
        final za.b bVar = this.f27113e;
        if (bVar == null || (viewTreeObserver = bVar.getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: sa.c
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                d.B(this.f27107a, bVar);
            }
        });
    }

    public static final void B(d dVar, za.b bVar) {
        if (dVar.f27111c == null || dVar.f27112d == null) {
            return;
        }
        int i10 = dVar.f27116h;
        boolean z10 = false;
        boolean z11 = i10 == -1 || dVar.f27117i == -1;
        if (i10 == bVar.getMeasuredWidth() && dVar.f27117i == bVar.getMeasuredHeight()) {
            z10 = true;
        }
        if (z11 || z10) {
            return;
        }
        if ((dVar.f27110b.o() & 8388611) != 8388611) {
            if ((dVar.f27110b.o() & 8388613) == 8388613) {
                int measuredWidth = bVar.getMeasuredWidth() - dVar.f27116h;
                WindowManager.LayoutParams layoutParams = dVar.f27112d;
                m.b(layoutParams);
                layoutParams.x -= measuredWidth;
            } else if ((dVar.f27110b.o() & 1) == 1 || (dVar.f27110b.o() & 17) == 17) {
                int measuredWidth2 = (dVar.f27116h / 2) - (bVar.getMeasuredWidth() / 2);
                WindowManager.LayoutParams layoutParams2 = dVar.f27112d;
                m.b(layoutParams2);
                layoutParams2.x += measuredWidth2;
            }
        }
        if ((dVar.f27110b.o() & 48) != 48) {
            if ((dVar.f27110b.o() & 80) == 80) {
                int measuredHeight = bVar.getMeasuredHeight() - dVar.f27117i;
                WindowManager.LayoutParams layoutParams3 = dVar.f27112d;
                m.b(layoutParams3);
                layoutParams3.y -= measuredHeight;
            } else if ((dVar.f27110b.o() & 16) == 16 || (dVar.f27110b.o() & 17) == 17) {
                int measuredHeight2 = (dVar.f27117i / 2) - (bVar.getMeasuredHeight() / 2);
                WindowManager.LayoutParams layoutParams4 = dVar.f27112d;
                m.b(layoutParams4);
                layoutParams4.y += measuredHeight2;
            }
        }
        dVar.f27116h = bVar.getMeasuredWidth();
        dVar.f27117i = bVar.getMeasuredHeight();
        WindowManager windowManager = dVar.f27111c;
        m.b(windowManager);
        windowManager.updateViewLayout(dVar.f27113e, dVar.f27112d);
    }

    public final void C(View view) {
        if (this.f27111c == null || this.f27112d == null || !m.a(this.f27110b.t(), new q(0, 0)) || view == null) {
            return;
        }
        ya.b bVar = ya.b.f32457a;
        Rect rectD = bVar.d(this.f27109a, this.f27111c);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i10 = iArr[1];
        WindowManager.LayoutParams layoutParams = this.f27112d;
        m.b(layoutParams);
        int iO = i10 > layoutParams.y ? bVar.o(view) : 0;
        switch (this.f27110b.j()) {
            case 1:
            case 49:
                WindowManager.LayoutParams layoutParams2 = this.f27112d;
                m.b(layoutParams2);
                layoutParams2.x = (rectD.right - view.getWidth()) >> 1;
                break;
            case 5:
            case 53:
            case 8388613:
            case 8388661:
                WindowManager.LayoutParams layoutParams3 = this.f27112d;
                m.b(layoutParams3);
                layoutParams3.x = rectD.right - view.getWidth();
                break;
            case 16:
            case 19:
            case 8388627:
                WindowManager.LayoutParams layoutParams4 = this.f27112d;
                m.b(layoutParams4);
                layoutParams4.y = (rectD.bottom - view.getHeight()) >> 1;
                break;
            case 17:
                WindowManager.LayoutParams layoutParams5 = this.f27112d;
                m.b(layoutParams5);
                layoutParams5.x = (rectD.right - view.getWidth()) >> 1;
                WindowManager.LayoutParams layoutParams6 = this.f27112d;
                m.b(layoutParams6);
                layoutParams6.y = (rectD.bottom - view.getHeight()) >> 1;
                break;
            case 21:
            case 8388629:
                WindowManager.LayoutParams layoutParams7 = this.f27112d;
                m.b(layoutParams7);
                layoutParams7.x = rectD.right - view.getWidth();
                WindowManager.LayoutParams layoutParams8 = this.f27112d;
                m.b(layoutParams8);
                layoutParams8.y = (rectD.bottom - view.getHeight()) >> 1;
                break;
            case 80:
            case 83:
            case 8388691:
                WindowManager.LayoutParams layoutParams9 = this.f27112d;
                m.b(layoutParams9);
                layoutParams9.y = rectD.bottom - view.getHeight();
                break;
            case 81:
                WindowManager.LayoutParams layoutParams10 = this.f27112d;
                m.b(layoutParams10);
                layoutParams10.x = (rectD.right - view.getWidth()) >> 1;
                WindowManager.LayoutParams layoutParams11 = this.f27112d;
                m.b(layoutParams11);
                layoutParams11.y = rectD.bottom - view.getHeight();
                break;
            case 85:
            case 8388693:
                WindowManager.LayoutParams layoutParams12 = this.f27112d;
                m.b(layoutParams12);
                layoutParams12.x = rectD.right - view.getWidth();
                WindowManager.LayoutParams layoutParams13 = this.f27112d;
                m.b(layoutParams13);
                layoutParams13.y = rectD.bottom - view.getHeight();
                break;
        }
        WindowManager.LayoutParams layoutParams14 = this.f27112d;
        m.b(layoutParams14);
        layoutParams14.x += ((Number) this.f27110b.v().c()).intValue();
        WindowManager.LayoutParams layoutParams15 = this.f27112d;
        m.b(layoutParams15);
        layoutParams15.y += ((Number) this.f27110b.v().d()).intValue();
        if (this.f27110b.m()) {
            if (this.f27110b.x() != ua.a.f28999a) {
                WindowManager.LayoutParams layoutParams16 = this.f27112d;
                m.b(layoutParams16);
                layoutParams16.y -= iO;
            }
        } else if (this.f27110b.x() == ua.a.f28999a) {
            WindowManager.LayoutParams layoutParams17 = this.f27112d;
            m.b(layoutParams17);
            layoutParams17.y += iO;
        }
        WindowManager windowManager = this.f27111c;
        m.b(windowManager);
        windowManager.updateViewLayout(view, this.f27112d);
    }

    public static /* synthetic */ void E(d dVar, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = true;
        }
        dVar.D(i10, z10);
    }

    private final void G(View view) {
        if (view != null) {
            if (!(view instanceof ViewGroup)) {
                k(view);
                return;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = viewGroup.getChildAt(i10);
                if (childAt instanceof ViewGroup) {
                    G(childAt);
                } else {
                    m.b(childAt);
                    k(childAt);
                }
            }
        }
    }

    public static /* synthetic */ void I(d dVar, int i10, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 4) != 0) {
            i12 = -1;
        }
        if ((i14 & 8) != 0) {
            i13 = -1;
        }
        dVar.H(i10, i11, i12, i13);
    }

    public static final void J(d dVar, za.b bVar) {
        g gVar = dVar.f27114f;
        if (gVar == null) {
            m.o("touchUtils");
            gVar = null;
        }
        WindowManager.LayoutParams layoutParams = dVar.f27112d;
        m.b(layoutParams);
        WindowManager windowManager = dVar.f27111c;
        m.b(windowManager);
        gVar.k(bVar, layoutParams, windowManager);
    }

    private final void j() {
        if (this.f27111c == null || this.f27112d == null) {
            return;
        }
        za.b bVar = new za.b(this.f27109a, this.f27110b, null, 0, 12, null);
        this.f27113e = bVar;
        bVar.setTag(this.f27110b.i());
        View viewQ = this.f27110b.q();
        if (viewQ != null) {
            za.b bVar2 = this.f27113e;
            if (bVar2 != null) {
                bVar2.addView(viewQ);
            }
        } else {
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f27109a);
            Integer numP = this.f27110b.p();
            m.b(numP);
            viewQ = layoutInflaterFrom.inflate(numP.intValue(), (ViewGroup) this.f27113e, true);
        }
        viewQ.setVisibility(4);
        ConcurrentHashMap concurrentHashMapF = e.f27124a.f();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : k0.t(concurrentHashMapF).entrySet()) {
            if (((d) entry.getValue()).f27110b.s() > this.f27110b.s()) {
                ((d) entry.getValue()).z();
                arrayList.add(entry.getValue());
            }
        }
        WindowManager windowManager = this.f27111c;
        m.b(windowManager);
        windowManager.addView(this.f27113e, this.f27112d);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((d) it.next()).F();
        }
        za.b bVar3 = this.f27113e;
        if (bVar3 != null) {
            bVar3.setTouchListener(new a());
        }
        za.b bVar4 = this.f27113e;
        if (bVar4 != null) {
            bVar4.setLayoutListener(new b(viewQ));
        }
        A();
    }

    private final void k(View view) {
        if (view instanceof EditText) {
            ya.e.f32461a.d((EditText) view, this.f27110b.i());
        }
    }

    public static final void m(d dVar) {
        dVar.n();
    }

    private final boolean n() {
        try {
            this.f27114f = new g(this.f27109a, this.f27110b);
            w();
            j();
            this.f27110b.R(true);
            return true;
        } catch (Exception e10) {
            va.d dVarC = this.f27110b.c();
            if (dVarC != null) {
                dVarC.e(false, String.valueOf(e10), null);
            }
            this.f27110b.h();
            return false;
        }
    }

    public final void o(View view) {
        if (this.f27111c == null || this.f27112d == null) {
            return;
        }
        if (!this.f27110b.E()) {
            view.setVisibility(0);
            WindowManager.LayoutParams layoutParams = this.f27112d;
            m.b(layoutParams);
            layoutParams.flags = 40;
            if (this.f27110b.F()) {
                WindowManager.LayoutParams layoutParams2 = this.f27112d;
                m.b(layoutParams2);
                WindowManager.LayoutParams layoutParams3 = this.f27112d;
                m.b(layoutParams3);
                layoutParams2.flags = layoutParams3.flags | 16;
            }
            if (this.f27110b.m()) {
                WindowManager.LayoutParams layoutParams4 = this.f27112d;
                m.b(layoutParams4);
                WindowManager.LayoutParams layoutParams5 = this.f27112d;
                m.b(layoutParams5);
                layoutParams4.flags = layoutParams5.flags | WXMediaMessage.TITLE_LENGTH_LIMIT;
            }
            v();
            za.b bVar = this.f27113e;
            if (bVar != null) {
                bVar.requestLayout();
            }
            WindowManager.LayoutParams layoutParams6 = this.f27112d;
            m.b(layoutParams6);
            int i10 = layoutParams6.x;
            WindowManager.LayoutParams layoutParams7 = this.f27112d;
            m.b(layoutParams7);
            I(this, i10, layoutParams7.y, 0, 0, 12, null);
            return;
        }
        if (this.f27113e == null || this.f27110b.C()) {
            return;
        }
        za.b bVar2 = this.f27113e;
        m.b(bVar2);
        WindowManager.LayoutParams layoutParams8 = this.f27112d;
        m.b(layoutParams8);
        WindowManager windowManager = this.f27111c;
        m.b(windowManager);
        Animator animatorA = new ra.a(bVar2, layoutParams8, windowManager, this.f27110b).a();
        if (animatorA != null) {
            WindowManager.LayoutParams layoutParams9 = this.f27112d;
            m.b(layoutParams9);
            layoutParams9.flags = 552;
            if (this.f27110b.F()) {
                WindowManager.LayoutParams layoutParams10 = this.f27112d;
                m.b(layoutParams10);
                WindowManager.LayoutParams layoutParams11 = this.f27112d;
                m.b(layoutParams11);
                layoutParams10.flags = layoutParams11.flags | 16;
            }
            animatorA.addListener(new c(view));
            animatorA.start();
        } else {
            animatorA = null;
        }
        this.f27115g = animatorA;
        if (animatorA == null) {
            view.setVisibility(0);
        }
    }

    private final IBinder t() {
        Window window;
        View decorView;
        Context context = this.f27109a;
        Activity activityI = context instanceof Activity ? (Activity) context : ya.f.f32462a.i();
        if (activityI == null || (window = activityI.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getWindowToken();
    }

    public final void v() {
        za.b bVar;
        if (!this.f27110b.k() || (bVar = this.f27113e) == null) {
            return;
        }
        G(bVar);
    }

    private final void w() {
        Object systemService = this.f27109a.getSystemService("window");
        m.c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f27111c = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        if (this.f27110b.x() == ua.a.f28999a) {
            layoutParams.type = CloseCodes.NORMAL_CLOSURE;
            layoutParams.token = t();
        } else {
            layoutParams.type = Build.VERSION.SDK_INT >= 26 ? 2038 : 2002;
        }
        layoutParams.format = 1;
        layoutParams.gravity = 8388659;
        layoutParams.flags = 40;
        if (this.f27110b.F()) {
            layoutParams.flags |= 16;
        }
        if (this.f27110b.m()) {
            layoutParams.flags |= WXMediaMessage.TITLE_LENGTH_LIMIT;
        }
        layoutParams.width = this.f27110b.B() ? -1 : -2;
        layoutParams.height = this.f27110b.l() ? -1 : -2;
        if (this.f27110b.m() && this.f27110b.l()) {
            layoutParams.height = ya.b.f32457a.f(this.f27109a);
        }
        layoutParams.alpha = this.f27110b.a();
        if (!m.a(this.f27110b.t(), new q(0, 0))) {
            layoutParams.x = ((Number) this.f27110b.t().c()).intValue();
            layoutParams.y = ((Number) this.f27110b.t().d()).intValue();
        }
        this.f27112d = layoutParams;
    }

    public static /* synthetic */ void y(d dVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        dVar.x(z10);
    }

    public final void D(int i10, boolean z10) {
        za.b bVar = this.f27113e;
        if (bVar != null) {
            m.b(bVar);
            if (bVar.getChildCount() < 1) {
                return;
            }
            this.f27110b.P(z10);
            za.b bVar2 = this.f27113e;
            m.b(bVar2);
            bVar2.setVisibility(i10);
            za.b bVar3 = this.f27113e;
            m.b(bVar3);
            View childAt = bVar3.getChildAt(0);
            if (i10 == 0) {
                this.f27110b.R(true);
                va.d dVarC = this.f27110b.c();
                if (dVarC != null) {
                    m.b(childAt);
                    dVarC.f(childAt);
                }
                this.f27110b.h();
                return;
            }
            this.f27110b.R(false);
            va.d dVarC2 = this.f27110b.c();
            if (dVarC2 != null) {
                m.b(childAt);
                dVarC2.d(childAt);
            }
            this.f27110b.h();
        }
    }

    public final d0 F() {
        try {
            WindowManager windowManager = this.f27111c;
            if (windowManager == null) {
                return null;
            }
            windowManager.addView(this.f27113e, this.f27112d);
            return d0.f10897a;
        } catch (Exception e10) {
            ya.g.f32466a.b("浮窗关闭出现异常：" + e10);
            return d0.f10897a;
        }
    }

    public final void H(int i10, int i11, int i12, int i13) {
        WindowManager.LayoutParams layoutParams;
        final za.b bVar = this.f27113e;
        if (bVar == null || this.f27111c == null || (layoutParams = this.f27112d) == null) {
            return;
        }
        if (i10 == -1 && i11 == -1 && i12 == -1 && i13 == -1) {
            bVar.postDelayed(new Runnable() { // from class: sa.b
                @Override // java.lang.Runnable
                public final void run() {
                    d.J(this.f27105a, bVar);
                }
            }, 200L);
            return;
        }
        if (i10 != -1) {
            m.b(layoutParams);
            layoutParams.x = i10;
        }
        if (i11 != -1) {
            WindowManager.LayoutParams layoutParams2 = this.f27112d;
            m.b(layoutParams2);
            layoutParams2.y = i11;
        }
        if (i12 != -1) {
            WindowManager.LayoutParams layoutParams3 = this.f27112d;
            m.b(layoutParams3);
            layoutParams3.width = i12;
        }
        if (i13 != -1) {
            WindowManager.LayoutParams layoutParams4 = this.f27112d;
            m.b(layoutParams4);
            layoutParams4.height = i13;
        }
        WindowManager windowManager = this.f27111c;
        m.b(windowManager);
        windowManager.updateViewLayout(bVar, this.f27112d);
    }

    public final boolean l() {
        View viewFindViewById;
        if (t() != null) {
            return n();
        }
        Context context = this.f27109a;
        Activity activityI = context instanceof Activity ? (Activity) context : ya.f.f32462a.i();
        if (activityI == null || (viewFindViewById = activityI.findViewById(R.id.content)) == null) {
            return false;
        }
        return viewFindViewById.post(new Runnable() { // from class: sa.a
            @Override // java.lang.Runnable
            public final void run() {
                d.m(this.f27104a);
            }
        });
    }

    public final void p() {
        if (this.f27111c == null || this.f27112d == null) {
            return;
        }
        if (!this.f27110b.E()) {
            y(this, false, 1, null);
            return;
        }
        if (this.f27113e != null) {
            if (this.f27110b.C() && this.f27115g == null) {
                return;
            }
            Animator animator = this.f27115g;
            if (animator != null) {
                animator.cancel();
            }
            za.b bVar = this.f27113e;
            m.b(bVar);
            WindowManager.LayoutParams layoutParams = this.f27112d;
            m.b(layoutParams);
            WindowManager windowManager = this.f27111c;
            m.b(windowManager);
            Animator animatorB = new ra.a(bVar, layoutParams, windowManager, this.f27110b).b();
            if (animatorB == null) {
                y(this, false, 1, null);
                return;
            }
            if (this.f27110b.C()) {
                return;
            }
            this.f27110b.G(true);
            WindowManager.LayoutParams layoutParams2 = this.f27112d;
            m.b(layoutParams2);
            layoutParams2.flags = 552;
            animatorB.addListener(new C0375d());
            animatorB.start();
        }
    }

    public final ta.a q() {
        return this.f27110b;
    }

    public final za.b r() {
        return this.f27113e;
    }

    public final WindowManager.LayoutParams s() {
        return this.f27112d;
    }

    public final WindowManager u() {
        return this.f27111c;
    }

    public final void x(boolean z10) {
        try {
            this.f27110b.G(false);
            e.f27124a.g(this.f27110b.i());
            WindowManager windowManager = this.f27111c;
            if (windowManager != null) {
                if (z10) {
                    windowManager.removeViewImmediate(this.f27113e);
                } else {
                    windowManager.removeView(this.f27113e);
                }
            }
        } catch (Exception e10) {
            ya.g.f32466a.b("浮窗关闭出现异常：" + e10);
        }
    }

    public final d0 z() {
        try {
            this.f27110b.G(false);
            WindowManager windowManager = this.f27111c;
            if (windowManager == null) {
                return null;
            }
            windowManager.removeView(this.f27113e);
            return d0.f10897a;
        } catch (Exception e10) {
            ya.g.f32466a.b("浮窗关闭出现异常：" + e10);
            return d0.f10897a;
        }
    }
}
