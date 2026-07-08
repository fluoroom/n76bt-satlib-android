package t7;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.GoogleApiActivity;
import java.util.Collections;
import t7.a;
import u7.d1;
import u7.h0;
import u7.j;
import u7.m0;
import u7.t;
import u7.z;
import v7.e;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a */
    private final Context f27586a;

    /* JADX INFO: renamed from: b */
    private final String f27587b;

    /* JADX INFO: renamed from: c */
    private final t7.a f27588c;

    /* JADX INFO: renamed from: d */
    private final a.d f27589d;

    /* JADX INFO: renamed from: e */
    private final u7.b f27590e;

    /* JADX INFO: renamed from: f */
    private final Looper f27591f;

    /* JADX INFO: renamed from: g */
    private final int f27592g;

    /* JADX INFO: renamed from: h */
    private final g f27593h;

    /* JADX INFO: renamed from: i */
    private final u7.r f27594i;

    /* JADX INFO: renamed from: j */
    protected final u7.e f27595j;

    public static class a {

        /* JADX INFO: renamed from: c */
        public static final a f27596c = new C0386a().a();

        /* JADX INFO: renamed from: a */
        public final u7.r f27597a;

        /* JADX INFO: renamed from: b */
        public final Looper f27598b;

        /* JADX INFO: renamed from: t7.f$a$a */
        public static class C0386a {

            /* JADX INFO: renamed from: a */
            private u7.r f27599a;

            /* JADX INFO: renamed from: b */
            private Looper f27600b;

            public a a() {
                if (this.f27599a == null) {
                    this.f27599a = new u7.a();
                }
                if (this.f27600b == null) {
                    this.f27600b = Looper.getMainLooper();
                }
                return new a(this.f27599a, this.f27600b);
            }

            public C0386a b(u7.r rVar) {
                v7.q.j(rVar, "StatusExceptionMapper must not be null.");
                this.f27599a = rVar;
                return this;
            }
        }

        private a(u7.r rVar, Account account, Looper looper) {
            this.f27597a = rVar;
            this.f27598b = looper;
        }

        /* synthetic */ a(u7.r rVar, Account account, Looper looper, n nVar) {
            this(rVar, null, looper);
        }
    }

    public f(Activity activity, t7.a aVar, a.d dVar, a aVar2) {
        this(activity, activity, aVar, dVar, aVar2);
    }

    private final com.google.android.gms.common.api.internal.a u(int i10, com.google.android.gms.common.api.internal.a aVar) {
        aVar.i();
        this.f27595j.C(this, i10, aVar);
        return aVar;
    }

    private final t8.g v(int i10, t tVar) {
        t8.h hVar = new t8.h();
        this.f27595j.D(this, i10, tVar, hVar, this.f27594i);
        return hVar.a();
    }

    public g f() {
        return this.f27593h;
    }

    protected e.a g() {
        e.a aVar = new e.a();
        aVar.d(null);
        aVar.c(Collections.EMPTY_SET);
        aVar.e(this.f27586a.getClass().getName());
        aVar.b(this.f27586a.getPackageName());
        return aVar;
    }

    public t8.g h(t tVar) {
        return v(2, tVar);
    }

    public t8.g i(t tVar) {
        return v(0, tVar);
    }

    public t8.g j(u7.o oVar) {
        v7.q.i(oVar);
        v7.q.j(oVar.f28474a.b(), "Listener has already been released.");
        v7.q.j(oVar.f28475b.a(), "Listener has already been released.");
        return this.f27595j.w(this, oVar.f28474a, oVar.f28475b, oVar.f28476c);
    }

    public t8.g k(j.a aVar, int i10) {
        v7.q.j(aVar, "Listener key cannot be null.");
        return this.f27595j.x(this, aVar, i10);
    }

    public com.google.android.gms.common.api.internal.a l(com.google.android.gms.common.api.internal.a aVar) {
        u(1, aVar);
        return aVar;
    }

    protected String m(Context context) {
        return null;
    }

    public final u7.b n() {
        return this.f27590e;
    }

    public Context o() {
        return this.f27586a;
    }

    protected String p() {
        return this.f27587b;
    }

    public Looper q() {
        return this.f27591f;
    }

    public final int r() {
        return this.f27592g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final a.f s(Looper looper, h0 h0Var) {
        v7.e eVarA = g().a();
        a.f fVarA = ((a.AbstractC0384a) v7.q.i(this.f27588c.a())).a(this.f27586a, looper, eVarA, this.f27589d, h0Var, h0Var);
        String strP = p();
        if (strP != null && (fVarA instanceof v7.c)) {
            ((v7.c) fVarA).O(strP);
        }
        if (strP == null || !(fVarA instanceof u7.l)) {
            return fVarA;
        }
        android.support.v4.media.session.b.a(fVarA);
        throw null;
    }

    public final d1 t(Context context, Handler handler) {
        return new d1(context, handler, g().a());
    }

    private f(Context context, Activity activity, t7.a aVar, a.d dVar, a aVar2) {
        v7.q.j(context, "Null context is not permitted.");
        v7.q.j(aVar, "Api must not be null.");
        v7.q.j(aVar2, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context context2 = (Context) v7.q.j(context.getApplicationContext(), "The provided context did not have an application context.");
        this.f27586a = context2;
        String attributionTag = Build.VERSION.SDK_INT >= 30 ? context.getAttributionTag() : m(context);
        this.f27587b = attributionTag;
        this.f27588c = aVar;
        this.f27589d = dVar;
        this.f27591f = aVar2.f27598b;
        u7.b bVarA = u7.b.a(aVar, dVar, attributionTag);
        this.f27590e = bVarA;
        this.f27593h = new m0(this);
        u7.e eVarU = u7.e.u(context2);
        this.f27595j = eVarU;
        this.f27592g = eVarU.l();
        this.f27594i = aVar2.f27597a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            z.u(activity, eVarU, bVarA);
        }
        eVarU.H(this);
    }

    public f(Context context, t7.a aVar, a.d dVar, a aVar2) {
        this(context, null, aVar, dVar, aVar2);
    }
}
