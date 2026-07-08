package r4;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.BTActivity;
import com.dw.ht.Cfg;
import com.dw.ht.activitys.SplashActivity;
import java.util.Arrays;
import m0.u0;
import qa.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements va.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f25439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f25440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Context f25441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f25442d;

    public interface a {
        void a(a.C0335a c0335a);

        void b(a.C0335a c0335a);
    }

    public h(Context context, String str) {
        rd.m.e(context, "context");
        rd.m.e(str, "tag");
        this.f25439a = str;
        this.f25441c = new androidx.appcompat.view.d(context.getApplicationContext(), R.style.AppTheme_Main);
    }

    public static /* synthetic */ void t(h hVar, a aVar, int i10, Object obj) throws Exception {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showFloat");
        }
        if ((i10 & 1) != 0) {
            aVar = null;
        }
        hVar.s(aVar);
    }

    @Override // va.d
    public void a(View view, MotionEvent motionEvent) {
        rd.m.e(view, "view");
        rd.m.e(motionEvent, "event");
        ya.b bVar = ya.b.f32457a;
        Context context = view.getContext();
        rd.m.d(context, "getContext(...)");
        Rect rectE = ya.b.e(bVar, context, null, 2, null);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        s3.b.b("FloatWindows", this.f25439a + " drag location:" + new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]) + " ScreenBounds:" + rectE);
    }

    @Override // va.d
    public void b(View view, MotionEvent motionEvent) {
        rd.m.e(view, "view");
        rd.m.e(motionEvent, "event");
    }

    @Override // va.d
    public void c(View view) {
        rd.m.e(view, "view");
        ya.b bVar = ya.b.f32457a;
        Context context = view.getContext();
        rd.m.d(context, "getContext(...)");
        Rect rectE = ya.b.e(bVar, context, null, 2, null);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        s3.b.b("FloatWindows", this.f25439a + " dragEnd location:" + new Rect(iArr[0], iArr[1], view.getWidth() + iArr[0], view.getHeight() + iArr[1]) + " ScreenBounds:" + rectE);
        SharedPreferences sharedPreferencesK = Cfg.K();
        rd.m.d(sharedPreferencesK, "getPref(...)");
        SharedPreferences.Editor editorEdit = sharedPreferencesK.edit();
        String strI = i();
        editorEdit.putInt(strI + ".x", iArr[0]);
        editorEdit.putInt(strI + ".y", iArr[1]);
        editorEdit.apply();
    }

    @Override // va.d
    public void d(View view) {
        rd.m.e(view, "view");
        s3.b.b("FloatWindows", this.f25439a + " hide");
        if (this.f25440b) {
            o();
        }
    }

    @Override // va.d
    public void dismiss() {
        s3.b.b("FloatWindows", this.f25439a + " dismiss");
        if (this.f25440b) {
            o();
        }
        n();
        m();
    }

    @Override // va.d
    public void e(boolean z10, String str, View view) {
        s3.b.b("FloatWindows", "createdResult:" + z10 + ' ' + str);
    }

    @Override // va.d
    public void f(View view) {
        rd.m.e(view, "view");
        s3.b.b("FloatWindows", this.f25439a + " show:" + view.getWidth() + '*' + view.getHeight() + '\n' + view + '\n' + u0.a((ViewGroup) view));
        if (this.f25440b) {
            return;
        }
        p();
    }

    public final Context g() {
        return this.f25441c;
    }

    public Class[] h() {
        return new Class[]{BTActivity.class, FragmentShowActivity.class, SplashActivity.class};
    }

    public final String i() {
        String str = "FW." + this.f25439a;
        if (!ya.b.f32457a.l(this.f25441c)) {
            return str;
        }
        return str + ".l";
    }

    public final View j() {
        View view = this.f25442d;
        if (view != null) {
            return view;
        }
        Object systemService = this.f25441c.getSystemService("layout_inflater");
        rd.m.c(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        View viewL = l((LayoutInflater) systemService, null, null);
        q(viewL, null);
        p();
        this.f25442d = viewL;
        return viewL;
    }

    public final boolean k() {
        return this.f25440b;
    }

    public abstract View l(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    public void n() {
        this.f25442d = null;
    }

    public void o() {
        this.f25440b = false;
    }

    public void p() {
        this.f25440b = true;
    }

    public void q(View view, Bundle bundle) {
        rd.m.e(view, "view");
    }

    public final void s(a aVar) throws Exception {
        a.C0335a c0335aL = qa.a.f24495a.h(this.f25441c).l(this.f25439a);
        View viewJ = j();
        rd.m.b(viewJ);
        a.C0335a c0335aD = a.C0335a.j(c0335aL, viewJ, null, 2, null).h(81, 0, 0).f(null).k(ua.a.f29001c).d(this);
        if (aVar != null) {
            aVar.a(c0335aD);
        }
        Class[] clsArrH = h();
        if (clsArrH != null) {
            c0335aD.g((Class[]) Arrays.copyOf(clsArrH, clsArrH.length));
        }
        String strI = i();
        int i10 = Cfg.K().getInt(strI + ".x", -1);
        int i11 = Cfg.K().getInt(strI + ".y", -1) - ya.b.f32457a.h(this.f25441c);
        if (i10 >= 0 && i11 >= 0) {
            c0335aD.h(51, i10, i11);
        } else if (aVar != null) {
            aVar.b(c0335aD);
        }
        c0335aD.n();
    }

    public void m() {
    }
}
