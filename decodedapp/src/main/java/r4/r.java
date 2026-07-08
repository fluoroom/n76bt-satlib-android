package r4;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import androidx.appcompat.widget.MenuPopupWindow;
import androidx.appcompat.widget.PopupMenu;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dw.ht.Cfg;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.greenrobot.eventbus.ThreadMode;
import qa.a;
import r4.h;
import r4.r;
import rd.b0;
import v4.c0;
import v4.l1;
import v4.n1;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
public final class r extends h {

    /* JADX INFO: renamed from: h */
    public static final a f25452h = new a(null);

    /* JADX INFO: renamed from: e */
    private final p4.c f25453e;

    /* JADX INFO: renamed from: f */
    private final p4.c f25454f;

    /* JADX INFO: renamed from: g */
    private m4.o f25455g;

    public static final class a {

        /* JADX INFO: renamed from: r4.r$a$a */
        public static final class C0351a implements h.a {

            /* JADX INFO: renamed from: a */
            final /* synthetic */ Context f25456a;

            C0351a(Context context) {
                this.f25456a = context;
            }

            @Override // r4.h.a
            public void a(a.C0335a c0335a) {
                rd.m.e(c0335a, "builder");
                c0335a.m(ViewConfiguration.get(this.f25456a).getScaledTouchSlop() * 4);
            }

            @Override // r4.h.a
            public void b(a.C0335a c0335a) {
                rd.m.e(c0335a, "builder");
                c0335a.h(81, 0, 0);
            }
        }

        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public static final void c(Context context) {
            r.f25452h.b(context);
        }

        private final void d(Context context) throws Exception {
            if (qa.a.f24495a.e("PTTFloatWindows") != null) {
                return;
            }
            new r(context, "PTTFloatWindows").s(new C0351a(context));
        }

        public final void b(final Context context) {
            rd.m.e(context, "context");
            if (!rd.m.a(Looper.myLooper(), Looper.getMainLooper())) {
                a6.i.a(new Runnable() { // from class: r4.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.a.c(context);
                    }
                });
            } else if (Cfg.O().isShowFloatPTT()) {
                d(context);
            } else {
                a.b.b(qa.a.f24495a, "PTTFloatWindows", false, 2, null);
            }
        }

        private a() {
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25457a;

        static {
            int[] iArr = new int[u.c.values().length];
            try {
                iArr[u.c.CurrentLinkChanged.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f25457a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context, String str) {
        super(context, str);
        rd.m.e(context, "context");
        rd.m.e(str, "tag");
        this.f25453e = new p4.c(0L, 1);
        this.f25454f = new p4.c(0L, 2);
    }

    public static final boolean C(r rVar, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            mi.c.e().m(rVar.f25453e);
            return false;
        }
        if (action != 1 && action != 3) {
            return false;
        }
        mi.c.e().m(rVar.f25454f);
        return false;
    }

    public static final void D(final m4.o oVar, View view) {
        Object objH;
        MenuPopupWindow menuPopupWindow;
        PopupWindow popupWindow;
        final u uVarW = u.w();
        rd.m.d(uVarW, "getInstance(...)");
        final b0 b0Var = new b0();
        Collection collectionA = uVarW.A();
        rd.m.d(collectionA, "getLinks(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionA) {
            if (!(((l1) obj) instanceof v4.g)) {
                arrayList.add(obj);
            }
        }
        b0Var.f25935a = arrayList;
        if (arrayList.size() < 2) {
            return;
        }
        final Rect rectC = Build.VERSION.SDK_INT <= 28 ? qa.a.f24495a.c("PTTFloatWindows") : null;
        PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
        final Collator collator = Collator.getInstance(Locale.getDefault());
        List listB0 = ed.q.B0((Iterable) b0Var.f25935a, gd.a.b(new qd.l() { // from class: r4.k
            @Override // qd.l
            public final Object l(Object obj2) {
                return r.E((l1) obj2);
            }
        }, new qd.l() { // from class: r4.l
            @Override // qd.l
            public final Object l(Object obj2) {
                return r.F((l1) obj2);
            }
        }, new qd.l() { // from class: r4.m
            @Override // qd.l
            public final Object l(Object obj2) {
                return r.G(collator, (l1) obj2);
            }
        }));
        b0Var.f25935a = listB0;
        Iterator it = listB0.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            popupMenu.getMenu().add(0, i10, 0, ((l1) it.next()).getName());
            i10++;
        }
        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: r4.n
            @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return r.H(b0Var, uVarW, menuItem);
            }
        });
        if (rectC != null) {
            popupMenu.setOnDismissListener(new PopupMenu.OnDismissListener() { // from class: r4.o
                @Override // androidx.appcompat.widget.PopupMenu.OnDismissListener
                public final void onDismiss(PopupMenu popupMenu2) {
                    r.I(oVar, rectC, popupMenu2);
                }
            });
        }
        popupMenu.show();
        if (rectC != null) {
            try {
                androidx.appcompat.view.menu.m mVar = (androidx.appcompat.view.menu.m) bj.b.l(popupMenu).h("mPopup");
                if (mVar == null || (objH = bj.b.l(mVar).h("mPopup")) == null || (menuPopupWindow = (MenuPopupWindow) bj.b.l(objH).h("mPopup")) == null || (popupWindow = (PopupWindow) bj.b.l(menuPopupWindow).h("mPopup")) == null) {
                    return;
                }
                int iB = a6.k.b(view.getContext(), 40.0f);
                ya.b bVar = ya.b.f32457a;
                Context context = view.getContext();
                rd.m.d(context, "getContext(...)");
                Rect rectE = ya.b.e(bVar, context, null, 2, null);
                int iWidth = rectE.width() - ((popupWindow.getWidth() + rectC.left) + (iB / 3));
                int iHeight = rectE.height();
                int height = popupWindow.getHeight() + rectC.top + view.getHeight();
                Context context2 = view.getContext();
                rd.m.d(context2, "getContext(...)");
                int iB2 = iHeight - ((height + bVar.b(context2)) + iB);
                if (iWidth < 0 || iB2 < 0) {
                    a.b.g(qa.a.f24495a, "PTTFloatWindows", iWidth < 0 ? Math.max(0, rectC.left + iWidth) : -1, iB2 < 0 ? Math.max(0, rectC.top + iB2) : -1, 0, 0, 24, null);
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append(iWidth);
                sb2.append(',');
                sb2.append(iB2);
                sb2.append(' ');
                sb2.append(view.getHeight());
                sb2.append(" ScreenBounds=");
                sb2.append(rectE);
                sb2.append(" popupWindow.height=");
                sb2.append(popupWindow.getHeight());
                sb2.append(",popupWindow.width=");
                sb2.append(popupWindow.getWidth());
                sb2.append(",NavigationBarHeight=");
                Context context3 = view.getContext();
                rd.m.d(context3, "getContext(...)");
                sb2.append(bVar.b(context3));
                s3.b.b("PTTFloatWindows", sb2.toString());
            } catch (Exception e10) {
                e10.printStackTrace();
                a.b.g(qa.a.f24495a, "PTTFloatWindows", 0, 0, 0, 0, 24, null);
            }
        }
    }

    public static final Comparable E(l1 l1Var) {
        return Integer.valueOf(!(l1Var instanceof c0) ? 1 : 0);
    }

    public static final Comparable F(l1 l1Var) {
        return Integer.valueOf(!(l1Var instanceof n1) ? 1 : 0);
    }

    public static final Comparable G(Collator collator, l1 l1Var) {
        return collator.getCollationKey(l1Var.getName());
    }

    public static final boolean H(b0 b0Var, u uVar, MenuItem menuItem) {
        l1 l1Var = (l1) ((List) b0Var.f25935a).get(menuItem.getItemId());
        if (l1Var.isDestroyed()) {
            return true;
        }
        uVar.G(l1Var);
        return true;
    }

    public static final void I(m4.o oVar, final Rect rect, PopupMenu popupMenu) {
        oVar.b().postDelayed(new Runnable() { // from class: r4.p
            @Override // java.lang.Runnable
            public final void run() {
                r.J(rect);
            }
        }, 400L);
    }

    public static final void J(Rect rect) {
        a.b.g(qa.a.f24495a, "PTTFloatWindows", rect.left, rect.top, 0, 0, 24, null);
    }

    public static final void K(Context context) {
        f25452h.b(context);
    }

    private final void L() {
        m4.o oVar = this.f25455g;
        if (oVar == null) {
            return;
        }
        l1 l1VarR = u.w().r();
        if (l1VarR == null) {
            oVar.f21385c.setVisibility(8);
        } else {
            oVar.f21385c.setVisibility(0);
            oVar.f21384b.setText(l1VarR.getName());
        }
    }

    @Override // r4.h
    public View l(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        rd.m.e(layoutInflater, "inflater");
        final m4.o oVarC = m4.o.c(layoutInflater);
        rd.m.d(oVarC, "inflate(...)");
        oVarC.f21386d.setOnTouchListener(new View.OnTouchListener() { // from class: r4.i
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return r.C(this.f25443a, view, motionEvent);
            }
        });
        oVarC.f21385c.setOnClickListener(new View.OnClickListener() { // from class: r4.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                r.D(oVarC, view);
            }
        });
        this.f25455g = oVarC;
        ConstraintLayout constraintLayoutB = oVarC.b();
        rd.m.d(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // r4.h
    public void o() {
        super.o();
        mi.c.e().t(this);
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(u.c cVar) {
        rd.m.e(cVar, "event");
        if (b.f25457a[cVar.ordinal()] == 1) {
            L();
        }
    }

    @Override // r4.h
    public void p() {
        super.p();
        mi.c.e().q(this);
        L();
    }
}
