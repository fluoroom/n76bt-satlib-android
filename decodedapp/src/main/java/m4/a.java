package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f20959a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f20960b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f20961c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextInputLayout f20962d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActionButton f20963e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Spinner f20964f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final LinearLayout f20965g;

    private a(LinearLayout linearLayout, EditText editText, EditText editText2, TextInputLayout textInputLayout, ActionButton actionButton, Spinner spinner, LinearLayout linearLayout2) {
        this.f20959a = linearLayout;
        this.f20960b = editText;
        this.f20961c = editText2;
        this.f20962d = textInputLayout;
        this.f20963e = actionButton;
        this.f20964f = spinner;
        this.f20965g = linearLayout2;
    }

    public static a a(View view) {
        int i10 = R.id.call_sign;
        EditText editText = (EditText) r1.a.a(view, R.id.call_sign);
        if (editText != null) {
            i10 = R.id.message;
            EditText editText2 = (EditText) r1.a.a(view, R.id.message);
            if (editText2 != null) {
                i10 = R.id.message_layout;
                TextInputLayout textInputLayout = (TextInputLayout) r1.a.a(view, R.id.message_layout);
                if (textInputLayout != null) {
                    i10 = R.id.send;
                    ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.send);
                    if (actionButton != null) {
                        i10 = R.id.send_by;
                        Spinner spinner = (Spinner) r1.a.a(view, R.id.send_by);
                        if (spinner != null) {
                            i10 = R.id.send_by_layout;
                            LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.send_by_layout);
                            if (linearLayout != null) {
                                return new a((LinearLayout) view, editText, editText2, textInputLayout, actionButton, spinner, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_aprs_message, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public LinearLayout b() {
        return this.f20959a;
    }
}
