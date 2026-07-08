package qa;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import dd.d0;
import dd.q;
import java.util.Set;
import rd.h;
import rd.m;
import sa.e;
import va.d;
import va.g;
import wa.c;
import ya.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f24495a = new b(null);

    /* JADX INFO: renamed from: qa.a$a, reason: collision with other inner class name */
    public static final class C0335a implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f24496a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ta.a f24497b;

        public C0335a(Context context) {
            m.e(context, "context");
            this.f24496a = context;
            ta.a aVar = new ta.a(null, null, null, false, 0, false, 0.0f, false, false, false, false, false, false, 0, null, null, false, false, 0, null, null, 0, 0, 0, 0, null, null, null, null, null, null, false, false, 0, -1, 3, null);
            this.f24497b = aVar;
            aVar.T(ViewConfiguration.get(context).getScaledTouchSlop());
        }

        private final void b(String str) throws Exception {
            d dVarC = this.f24497b.c();
            if (dVarC != null) {
                dVarC.e(false, str, null);
            }
            this.f24497b.h();
            ya.g.f32466a.f(str);
            int iHashCode = str.hashCode();
            if (iHashCode != 324317221) {
                if (iHashCode != 832581388) {
                    if (iHashCode != 952571600 || !str.equals("Uninitialized exception. You need to initialize in the application.")) {
                        return;
                    }
                } else if (!str.equals("No layout exception. You need to set up the layout file.")) {
                    return;
                }
            } else if (!str.equals("Context exception. Activity float need to pass in a activity context.")) {
                return;
            }
            throw new Exception(str);
        }

        private final void c() {
            e.f27124a.b(this.f24496a, this.f24497b);
        }

        private final void e() throws Exception {
            Context context = this.f24496a;
            Activity activityI = context instanceof Activity ? (Activity) context : null;
            if (activityI == null) {
                activityI = f.f32462a.i();
            }
            if (activityI != null) {
                c.j(activityI, this);
            } else {
                b("Context exception. Request Permission need to pass in a activity context.");
            }
        }

        public static /* synthetic */ C0335a j(C0335a c0335a, View view, va.f fVar, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                fVar = null;
            }
            return c0335a.i(view, fVar);
        }

        @Override // va.g
        public void a(boolean z10) throws Exception {
            if (z10) {
                c();
            } else {
                b("No permission exception. You need to turn on overlay permissions.");
            }
        }

        public final C0335a d(d dVar) {
            m.e(dVar, "callbacks");
            this.f24497b.H(dVar);
            return this;
        }

        public final C0335a f(va.c cVar) {
            this.f24497b.K(cVar);
            return this;
        }

        public final C0335a g(Class... clsArr) {
            m.e(clsArr, "clazz");
            for (Class cls : clsArr) {
                Set setF = this.f24497b.f();
                String name = cls.getName();
                m.d(name, "getName(...)");
                setF.add(name);
                if ((this.f24496a instanceof Activity) && m.a(cls.getName(), ((Activity) this.f24496a).getComponentName().getClassName())) {
                    this.f24497b.J(true);
                }
            }
            return this;
        }

        public final C0335a h(int i10, int i11, int i12) {
            this.f24497b.M(i10);
            this.f24497b.Q(new q(Integer.valueOf(i11), Integer.valueOf(i12)));
            return this;
        }

        public final C0335a i(View view, va.f fVar) {
            m.e(view, "layoutView");
            this.f24497b.O(view);
            this.f24497b.N(fVar);
            return this;
        }

        public final C0335a k(ua.a aVar) {
            m.e(aVar, "showPattern");
            this.f24497b.S(aVar);
            return this;
        }

        public final C0335a l(String str) {
            this.f24497b.L(str);
            return this;
        }

        public final C0335a m(int i10) {
            if (i10 < 0) {
                throw new IllegalArgumentException("Touch slop cannot be negative");
            }
            this.f24497b.T(i10);
            return this;
        }

        public final void n() throws Exception {
            if (!m.a(Thread.currentThread(), Looper.getMainLooper().getThread())) {
                throw new RuntimeException("只能在主线程调用");
            }
            if (this.f24497b.p() == null && this.f24497b.q() == null) {
                b("No layout exception. You need to set up the layout file.");
                return;
            }
            if (this.f24497b.x() == ua.a.f28999a) {
                c();
            } else if (c.a(this.f24496a)) {
                c();
            } else {
                e();
            }
        }
    }

    public static final class b {
        public /* synthetic */ b(h hVar) {
            this();
        }

        public static /* synthetic */ d0 b(b bVar, String str, boolean z10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = null;
            }
            if ((i10 & 2) != 0) {
                z10 = false;
            }
            return bVar.a(str, z10);
        }

        private final ta.a d(String str) {
            sa.d dVarD = e.f27124a.d(str);
            if (dVarD != null) {
                return dVarD.q();
            }
            return null;
        }

        public static /* synthetic */ d0 g(b bVar, String str, int i10, int i11, int i12, int i13, int i14, Object obj) {
            int i15;
            int i16;
            int i17;
            int i18;
            b bVar2;
            String str2;
            if ((i14 & 1) != 0) {
                str = null;
            }
            if ((i14 & 2) != 0) {
                i10 = -1;
            }
            if ((i14 & 4) != 0) {
                i11 = -1;
            }
            if ((i14 & 8) != 0) {
                i12 = -1;
            }
            if ((i14 & 16) != 0) {
                i15 = -1;
                i18 = i11;
                i16 = i12;
                str2 = str;
                i17 = i10;
                bVar2 = bVar;
            } else {
                i15 = i13;
                i16 = i12;
                i17 = i10;
                i18 = i11;
                bVar2 = bVar;
                str2 = str;
            }
            return bVar2.f(str2, i17, i18, i16, i15);
        }

        public final d0 a(String str, boolean z10) {
            return e.f27124a.c(str, z10);
        }

        public final Rect c(String str) {
            WindowManager.LayoutParams layoutParamsS;
            sa.d dVarD = e.f27124a.d(str);
            if (dVarD == null || (layoutParamsS = dVarD.s()) == null) {
                return null;
            }
            int i10 = layoutParamsS.x;
            int i11 = layoutParamsS.y;
            return new Rect(i10, i11, layoutParamsS.width + i10, layoutParamsS.height + i11);
        }

        public final View e(String str) {
            ta.a aVarD = d(str);
            if (aVarD != null) {
                return aVarD.q();
            }
            return null;
        }

        public final d0 f(String str, int i10, int i11, int i12, int i13) {
            sa.d dVarD = e.f27124a.d(str);
            if (dVarD == null) {
                return null;
            }
            dVarD.H(i10, i11, i12, i13);
            return d0.f10897a;
        }

        public final C0335a h(Context context) {
            m.e(context, "context");
            return new C0335a(context);
        }

        private b() {
        }
    }
}
