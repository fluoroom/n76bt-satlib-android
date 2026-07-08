package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EditText f21325b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EditText f21326c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EditText f21327d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConstraintLayout f21328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Guideline f21329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Button f21330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f21331h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f21332i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Spinner f21333j;

    private m(ConstraintLayout constraintLayout, EditText editText, EditText editText2, EditText editText3, ConstraintLayout constraintLayout2, Guideline guideline, Button button, TextView textView, TextView textView2, Spinner spinner) {
        this.f21324a = constraintLayout;
        this.f21325b = editText;
        this.f21326c = editText2;
        this.f21327d = editText3;
        this.f21328e = constraintLayout2;
        this.f21329f = guideline;
        this.f21330g = button;
        this.f21331h = textView;
        this.f21332i = textView2;
        this.f21333j = spinner;
    }

    public static m a(View view) {
        int i10 = R.id.dev_id;
        EditText editText = (EditText) r1.a.a(view, R.id.dev_id);
        if (editText != null) {
            i10 = R.id.dev_msg;
            EditText editText2 = (EditText) r1.a.a(view, R.id.dev_msg);
            if (editText2 != null) {
                i10 = R.id.dev_name;
                EditText editText3 = (EditText) r1.a.a(view, R.id.dev_name);
                if (editText3 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i10 = R.id.guideline2;
                    Guideline guideline = (Guideline) r1.a.a(view, R.id.guideline2);
                    if (guideline != null) {
                        i10 = R.id.save_dev_id;
                        Button button = (Button) r1.a.a(view, R.id.save_dev_id);
                        if (button != null) {
                            i10 = R.id.textView10;
                            TextView textView = (TextView) r1.a.a(view, R.id.textView10);
                            if (textView != null) {
                                i10 = R.id.textView8;
                                TextView textView2 = (TextView) r1.a.a(view, R.id.textView8);
                                if (textView2 != null) {
                                    i10 = R.id.v_id;
                                    Spinner spinner = (Spinner) r1.a.a(view, R.id.v_id);
                                    if (spinner != null) {
                                        return new m(constraintLayout, editText, editText2, editText3, constraintLayout, guideline, button, textView, textView2, spinner);
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

    public static m c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.factory_dev_id, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21324a;
    }
}
