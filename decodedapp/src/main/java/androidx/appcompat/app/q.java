package androidx.appcompat.app;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.b;
import m0.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends d.v implements e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private h f940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final m.a f941e;

    public q(Context context, int i10) {
        super(context, i(context, i10));
        this.f941e = new m.a() { // from class: androidx.appcompat.app.p
            @Override // m0.m.a
            public final boolean w(KeyEvent keyEvent) {
                return this.f939a.j(keyEvent);
            }
        };
        h hVarH = h();
        hVarH.R(i(context, i10));
        hVarH.A(null);
    }

    private static int i(Context context, int i10) {
        if (i10 != 0) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.a.U, typedValue, true);
        return typedValue.resourceId;
    }

    @Override // d.v, android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        h().d(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        h().B();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return m0.m.e(this.f941e, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // androidx.appcompat.app.e
    public void e(androidx.appcompat.view.b bVar) {
    }

    @Override // android.app.Dialog
    public View findViewById(int i10) {
        return h().l(i10);
    }

    @Override // androidx.appcompat.app.e
    public void g(androidx.appcompat.view.b bVar) {
    }

    public h h() {
        if (this.f940d == null) {
            this.f940d = h.k(this, this);
        }
        return this.f940d;
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        h().x();
    }

    boolean j(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public boolean k(int i10) {
        return h().J(i10);
    }

    @Override // d.v, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        h().w();
        super.onCreate(bundle);
        h().A(bundle);
    }

    @Override // d.v, android.app.Dialog
    protected void onStop() {
        super.onStop();
        h().G();
    }

    @Override // androidx.appcompat.app.e
    public androidx.appcompat.view.b s(b.a aVar) {
        return null;
    }

    @Override // d.v, android.app.Dialog
    public void setContentView(int i10) {
        c();
        h().M(i10);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        h().S(charSequence);
    }

    @Override // d.v, android.app.Dialog
    public void setContentView(View view) {
        c();
        h().N(view);
    }

    @Override // android.app.Dialog
    public void setTitle(int i10) {
        super.setTitle(i10);
        h().S(getContext().getString(i10));
    }

    @Override // d.v, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c();
        h().O(view, layoutParams);
    }
}
