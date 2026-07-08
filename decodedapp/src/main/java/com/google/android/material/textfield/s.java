package com.google.android.material.textfield;

import android.content.Context;
import android.text.Editable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import com.google.android.material.internal.CheckableImageButton;

/* JADX INFO: loaded from: classes3.dex */
abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final TextInputLayout f8440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final r f8441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Context f8442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final CheckableImageButton f8443d;

    s(r rVar) {
        this.f8440a = rVar.f8416a;
        this.f8441b = rVar;
        this.f8442c = rVar.getContext();
        this.f8443d = rVar.r();
    }

    void a(Editable editable) {
    }

    void b(CharSequence charSequence, int i10, int i11, int i12) {
    }

    int c() {
        return 0;
    }

    int d() {
        return 0;
    }

    View.OnFocusChangeListener e() {
        return null;
    }

    View.OnClickListener f() {
        return null;
    }

    View.OnFocusChangeListener g() {
        return null;
    }

    AccessibilityManager.TouchExplorationStateChangeListener h() {
        return null;
    }

    boolean i(int i10) {
        return true;
    }

    boolean j() {
        return false;
    }

    boolean k() {
        return false;
    }

    boolean l() {
        return false;
    }

    boolean m() {
        return false;
    }

    void n(EditText editText) {
    }

    void p(View view, AccessibilityEvent accessibilityEvent) {
    }

    void q(boolean z10) {
    }

    final void r() {
        this.f8441b.L(false);
    }

    void s() {
    }

    boolean t() {
        return false;
    }

    void u() {
    }

    void o(View view, n0.x xVar) {
    }
}
