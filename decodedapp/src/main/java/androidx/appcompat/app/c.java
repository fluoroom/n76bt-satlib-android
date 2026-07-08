package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;

/* JADX INFO: loaded from: classes.dex */
public class c extends q implements DialogInterface {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final AlertController f842f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AlertController.f f843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f844b;

        public a(Context context) {
            this(context, c.n(context, 0));
        }

        public a A(int i10) {
            AlertController.f fVar = this.f843a;
            fVar.f812z = null;
            fVar.f811y = i10;
            fVar.E = false;
            return this;
        }

        public a B(View view) {
            AlertController.f fVar = this.f843a;
            fVar.f812z = view;
            fVar.f811y = 0;
            fVar.E = false;
            return this;
        }

        public c C() {
            c cVarA = a();
            cVarA.show();
            return cVarA;
        }

        public c a() {
            c cVar = new c(this.f843a.f787a, this.f844b);
            this.f843a.a(cVar.f842f);
            cVar.setCancelable(this.f843a.f804r);
            if (this.f843a.f804r) {
                cVar.setCanceledOnTouchOutside(true);
            }
            cVar.setOnCancelListener(this.f843a.f805s);
            cVar.setOnDismissListener(this.f843a.f806t);
            DialogInterface.OnKeyListener onKeyListener = this.f843a.f807u;
            if (onKeyListener != null) {
                cVar.setOnKeyListener(onKeyListener);
            }
            return cVar;
        }

        public Context b() {
            return this.f843a.f787a;
        }

        public a c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f843a;
            fVar.f809w = listAdapter;
            fVar.f810x = onClickListener;
            return this;
        }

        public a d(boolean z10) {
            this.f843a.f804r = z10;
            return this;
        }

        public a e(View view) {
            this.f843a.f793g = view;
            return this;
        }

        public a f(int i10) {
            this.f843a.f789c = i10;
            return this;
        }

        public a g(Drawable drawable) {
            this.f843a.f790d = drawable;
            return this;
        }

        public a h(int i10) {
            TypedValue typedValue = new TypedValue();
            this.f843a.f787a.getTheme().resolveAttribute(i10, typedValue, true);
            this.f843a.f789c = typedValue.resourceId;
            return this;
        }

        public a i(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f843a;
            fVar.f808v = charSequenceArr;
            fVar.f810x = onClickListener;
            return this;
        }

        public a j(int i10) {
            AlertController.f fVar = this.f843a;
            fVar.f794h = fVar.f787a.getText(i10);
            return this;
        }

        public a k(CharSequence charSequence) {
            this.f843a.f794h = charSequence;
            return this;
        }

        public a l(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
            AlertController.f fVar = this.f843a;
            fVar.f808v = charSequenceArr;
            fVar.J = onMultiChoiceClickListener;
            fVar.F = zArr;
            fVar.G = true;
            return this;
        }

        public a m(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f843a;
            fVar.f798l = fVar.f787a.getText(i10);
            this.f843a.f800n = onClickListener;
            return this;
        }

        public a n(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f843a;
            fVar.f798l = charSequence;
            fVar.f800n = onClickListener;
            return this;
        }

        public a o(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f843a;
            fVar.f801o = fVar.f787a.getText(i10);
            this.f843a.f803q = onClickListener;
            return this;
        }

        public a p(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f843a;
            fVar.f801o = charSequence;
            fVar.f803q = onClickListener;
            return this;
        }

        public a q(DialogInterface.OnCancelListener onCancelListener) {
            this.f843a.f805s = onCancelListener;
            return this;
        }

        public a r(DialogInterface.OnDismissListener onDismissListener) {
            this.f843a.f806t = onDismissListener;
            return this;
        }

        public a s(DialogInterface.OnKeyListener onKeyListener) {
            this.f843a.f807u = onKeyListener;
            return this;
        }

        public a t(int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f843a;
            fVar.f795i = fVar.f787a.getText(i10);
            this.f843a.f797k = onClickListener;
            return this;
        }

        public a u(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f843a;
            fVar.f795i = charSequence;
            fVar.f797k = onClickListener;
            return this;
        }

        public a v(int i10, int i11, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f843a;
            fVar.f808v = fVar.f787a.getResources().getTextArray(i10);
            AlertController.f fVar2 = this.f843a;
            fVar2.f810x = onClickListener;
            fVar2.I = i11;
            fVar2.H = true;
            return this;
        }

        public a w(ListAdapter listAdapter, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f843a;
            fVar.f809w = listAdapter;
            fVar.f810x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a x(CharSequence[] charSequenceArr, int i10, DialogInterface.OnClickListener onClickListener) {
            AlertController.f fVar = this.f843a;
            fVar.f808v = charSequenceArr;
            fVar.f810x = onClickListener;
            fVar.I = i10;
            fVar.H = true;
            return this;
        }

        public a y(int i10) {
            AlertController.f fVar = this.f843a;
            fVar.f792f = fVar.f787a.getText(i10);
            return this;
        }

        public a z(CharSequence charSequence) {
            this.f843a.f792f = charSequence;
            return this;
        }

        public a(Context context, int i10) {
            this.f843a = new AlertController.f(new ContextThemeWrapper(context, c.n(context, i10)));
            this.f844b = i10;
        }
    }

    protected c(Context context, int i10) {
        super(context, n(context, i10));
        this.f842f = new AlertController(getContext(), this, getWindow());
    }

    static int n(Context context, int i10) {
        if (((i10 >>> 24) & 255) >= 1) {
            return i10;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(h.a.f14768p, typedValue, true);
        return typedValue.resourceId;
    }

    public Button l(int i10) {
        return this.f842f.c(i10);
    }

    public ListView m() {
        return this.f842f.e();
    }

    public void o(CharSequence charSequence) {
        this.f842f.p(charSequence);
    }

    @Override // androidx.appcompat.app.q, d.v, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f842f.f();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        if (this.f842f.h(i10, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (this.f842f.i(i10, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i10, keyEvent);
    }

    @Override // androidx.appcompat.app.q, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f842f.r(charSequence);
    }
}
