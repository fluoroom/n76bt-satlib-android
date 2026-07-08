package d;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.m;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public final class a0 implements androidx.lifecycle.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f10405b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final dd.j f10406c = dd.k.b(new qd.a() { // from class: d.z
        @Override // qd.a
        public final Object a() {
            return a0.d();
        }
    });

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Activity f10407a;

    public static abstract class a {
        public /* synthetic */ a(rd.h hVar) {
            this();
        }

        public abstract boolean a(InputMethodManager inputMethodManager);

        public abstract Object b(InputMethodManager inputMethodManager);

        public abstract View c(InputMethodManager inputMethodManager);

        private a() {
        }
    }

    public static final class b {
        public /* synthetic */ b(rd.h hVar) {
            this();
        }

        public final a a() {
            return (a) a0.f10406c.getValue();
        }

        private b() {
        }
    }

    public static final class c extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f10408a = new c();

        private c() {
            super(null);
        }

        @Override // d.a0.a
        public boolean a(InputMethodManager inputMethodManager) {
            rd.m.e(inputMethodManager, "<this>");
            return false;
        }

        @Override // d.a0.a
        public Object b(InputMethodManager inputMethodManager) {
            rd.m.e(inputMethodManager, "<this>");
            return null;
        }

        @Override // d.a0.a
        public View c(InputMethodManager inputMethodManager) {
            rd.m.e(inputMethodManager, "<this>");
            return null;
        }
    }

    public static final class d extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Field f10409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Field f10410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Field f10411c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Field field, Field field2, Field field3) {
            super(null);
            rd.m.e(field, "hField");
            rd.m.e(field2, "servedViewField");
            rd.m.e(field3, "nextServedViewField");
            this.f10409a = field;
            this.f10410b = field2;
            this.f10411c = field3;
        }

        @Override // d.a0.a
        public boolean a(InputMethodManager inputMethodManager) {
            rd.m.e(inputMethodManager, "<this>");
            try {
                this.f10411c.set(inputMethodManager, null);
                return true;
            } catch (IllegalAccessException unused) {
                return false;
            }
        }

        @Override // d.a0.a
        public Object b(InputMethodManager inputMethodManager) {
            rd.m.e(inputMethodManager, "<this>");
            try {
                return this.f10409a.get(inputMethodManager);
            } catch (IllegalAccessException unused) {
                return null;
            }
        }

        @Override // d.a0.a
        public View c(InputMethodManager inputMethodManager) {
            rd.m.e(inputMethodManager, "<this>");
            try {
                return (View) this.f10410b.get(inputMethodManager);
            } catch (ClassCastException | IllegalAccessException unused) {
                return null;
            }
        }
    }

    public a0(Activity activity) {
        rd.m.e(activity, "activity");
        this.f10407a = activity;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a d() {
        try {
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            declaredField3.setAccessible(true);
            rd.m.b(declaredField3);
            rd.m.b(declaredField);
            rd.m.b(declaredField2);
            return new d(declaredField3, declaredField, declaredField2);
        } catch (NoSuchFieldException unused) {
            return c.f10408a;
        }
    }

    @Override // androidx.lifecycle.q
    public void k(androidx.lifecycle.t tVar, m.a aVar) {
        rd.m.e(tVar, "source");
        rd.m.e(aVar, "event");
        if (aVar != m.a.ON_DESTROY) {
            return;
        }
        Object systemService = this.f10407a.getSystemService("input_method");
        rd.m.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        a aVarA = f10405b.a();
        Object objB = aVarA.b(inputMethodManager);
        if (objB == null) {
            return;
        }
        synchronized (objB) {
            View viewC = aVarA.c(inputMethodManager);
            if (viewC == null) {
                return;
            }
            if (viewC.isAttachedToWindow()) {
                return;
            }
            boolean zA = aVarA.a(inputMethodManager);
            if (zA) {
                inputMethodManager.isActive();
            }
        }
    }
}
