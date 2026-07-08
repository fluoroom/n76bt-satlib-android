package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.android.widget.TintTextView;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f21078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f21079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f21080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AutoCompleteTextView f21081d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextInputLayout f21082e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConstraintLayout f21083f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Button f21084g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f21085h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TintTextView f21086i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ScrollView f21087j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ProgressBar f21088k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final TextView f21089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final EditText f21090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final TextInputLayout f21091n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final TintTextView f21092o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Button f21093p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TextView f21094q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final TintTextView f21095r;

    private e(FrameLayout frameLayout, View view, View view2, AutoCompleteTextView autoCompleteTextView, TextInputLayout textInputLayout, ConstraintLayout constraintLayout, Button button, TextView textView, TintTextView tintTextView, ScrollView scrollView, ProgressBar progressBar, TextView textView2, EditText editText, TextInputLayout textInputLayout2, TintTextView tintTextView2, Button button2, TextView textView3, TintTextView tintTextView3) {
        this.f21078a = frameLayout;
        this.f21079b = view;
        this.f21080c = view2;
        this.f21081d = autoCompleteTextView;
        this.f21082e = textInputLayout;
        this.f21083f = constraintLayout;
        this.f21084g = button;
        this.f21085h = textView;
        this.f21086i = tintTextView;
        this.f21087j = scrollView;
        this.f21088k = progressBar;
        this.f21089l = textView2;
        this.f21090m = editText;
        this.f21091n = textInputLayout2;
        this.f21092o = tintTextView2;
        this.f21093p = button2;
        this.f21094q = textView3;
        this.f21095r = tintTextView3;
    }

    public static e a(View view) {
        int i10 = R.id.div1;
        View viewA = r1.a.a(view, R.id.div1);
        if (viewA != null) {
            i10 = R.id.div2;
            View viewA2 = r1.a.a(view, R.id.div2);
            if (viewA2 != null) {
                i10 = R.id.email;
                AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) r1.a.a(view, R.id.email);
                if (autoCompleteTextView != null) {
                    i10 = R.id.emailLayout;
                    TextInputLayout textInputLayout = (TextInputLayout) r1.a.a(view, R.id.emailLayout);
                    if (textInputLayout != null) {
                        i10 = R.id.email_login_form;
                        ConstraintLayout constraintLayout = (ConstraintLayout) r1.a.a(view, R.id.email_login_form);
                        if (constraintLayout != null) {
                            i10 = R.id.email_sign_in_button;
                            Button button = (Button) r1.a.a(view, R.id.email_sign_in_button);
                            if (button != null) {
                                i10 = R.id.forgot_password;
                                TextView textView = (TextView) r1.a.a(view, R.id.forgot_password);
                                if (textView != null) {
                                    i10 = R.id.google_login;
                                    TintTextView tintTextView = (TintTextView) r1.a.a(view, R.id.google_login);
                                    if (tintTextView != null) {
                                        i10 = R.id.login_form;
                                        ScrollView scrollView = (ScrollView) r1.a.a(view, R.id.login_form);
                                        if (scrollView != null) {
                                            i10 = R.id.login_progress;
                                            ProgressBar progressBar = (ProgressBar) r1.a.a(view, R.id.login_progress);
                                            if (progressBar != null) {
                                                i10 = R.id.other;
                                                TextView textView2 = (TextView) r1.a.a(view, R.id.other);
                                                if (textView2 != null) {
                                                    i10 = R.id.password;
                                                    EditText editText = (EditText) r1.a.a(view, R.id.password);
                                                    if (editText != null) {
                                                        i10 = R.id.passwordLayout;
                                                        TextInputLayout textInputLayout2 = (TextInputLayout) r1.a.a(view, R.id.passwordLayout);
                                                        if (textInputLayout2 != null) {
                                                            i10 = R.id.qq_login;
                                                            TintTextView tintTextView2 = (TintTextView) r1.a.a(view, R.id.qq_login);
                                                            if (tintTextView2 != null) {
                                                                i10 = R.id.register_button;
                                                                Button button2 = (Button) r1.a.a(view, R.id.register_button);
                                                                if (button2 != null) {
                                                                    i10 = R.id.resend;
                                                                    TextView textView3 = (TextView) r1.a.a(view, R.id.resend);
                                                                    if (textView3 != null) {
                                                                        i10 = R.id.wx_login;
                                                                        TintTextView tintTextView3 = (TintTextView) r1.a.a(view, R.id.wx_login);
                                                                        if (tintTextView3 != null) {
                                                                            return new e((FrameLayout) view, viewA, viewA2, autoCompleteTextView, textInputLayout, constraintLayout, button, textView, tintTextView, scrollView, progressBar, textView2, editText, textInputLayout2, tintTextView2, button2, textView3, tintTextView3);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static e c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static e d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_login, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public FrameLayout b() {
        return this.f21078a;
    }
}
