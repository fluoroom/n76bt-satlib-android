package c8;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.LinkedList;
import v7.b0;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f4474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Bundle f4475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList f4476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final e f4477d = new f(this);

    public static void o(FrameLayout frameLayout) {
        s7.d dVarL = s7.d.l();
        Context context = frameLayout.getContext();
        int iF = dVarL.f(context);
        String strC = b0.c(context, iF);
        String strB = b0.b(context, iF);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strC);
        linearLayout.addView(textView);
        Intent intentA = dVarL.a(context, iF, null);
        if (intentA != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strB);
            linearLayout.addView(button);
            button.setOnClickListener(new j(context, intentA));
        }
    }

    static /* bridge */ /* synthetic */ c p(a aVar) {
        return aVar.f4474a;
    }

    private final void t(int i10) {
        while (!this.f4476c.isEmpty() && ((m) this.f4476c.getLast()).b() >= i10) {
            this.f4476c.removeLast();
        }
    }

    private final void u(Bundle bundle, m mVar) {
        c cVar = this.f4474a;
        if (cVar != null) {
            mVar.a(cVar);
            return;
        }
        if (this.f4476c == null) {
            this.f4476c = new LinkedList();
        }
        this.f4476c.add(mVar);
        if (bundle != null) {
            Bundle bundle2 = this.f4475b;
            if (bundle2 == null) {
                this.f4475b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f4477d);
    }

    protected abstract void a(e eVar);

    public c b() {
        return this.f4474a;
    }

    protected void c(FrameLayout frameLayout) {
        o(frameLayout);
    }

    public void d(Bundle bundle) {
        u(bundle, new h(this, bundle));
    }

    public View e(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        u(bundle, new i(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.f4474a == null) {
            c(frameLayout);
        }
        return frameLayout;
    }

    public void f() {
        c cVar = this.f4474a;
        if (cVar != null) {
            cVar.f();
        } else {
            t(1);
        }
    }

    public void g() {
        c cVar = this.f4474a;
        if (cVar != null) {
            cVar.v();
        } else {
            t(2);
        }
    }

    public void h(Activity activity, Bundle bundle, Bundle bundle2) {
        u(bundle2, new g(this, activity, bundle, bundle2));
    }

    public void i() {
        c cVar = this.f4474a;
        if (cVar != null) {
            cVar.onLowMemory();
        }
    }

    public void j() {
        c cVar = this.f4474a;
        if (cVar != null) {
            cVar.n();
        } else {
            t(5);
        }
    }

    public void k() {
        u(null, new l(this));
    }

    public void l(Bundle bundle) {
        c cVar = this.f4474a;
        if (cVar != null) {
            cVar.o(bundle);
            return;
        }
        Bundle bundle2 = this.f4475b;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    public void m() {
        u(null, new k(this));
    }

    public void n() {
        c cVar = this.f4474a;
        if (cVar != null) {
            cVar.g();
        } else {
            t(4);
        }
    }
}
