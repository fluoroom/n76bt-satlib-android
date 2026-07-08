package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.gridlayout.widget.GridLayout;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;
import info.hoang8f.android.segmented.SegmentedGroup;

/* JADX INFO: loaded from: classes.dex */
public final class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RadioButton f21627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionButton f21628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final RadioButton f21629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final RadioButton f21630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final GridLayout f21631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f21632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SegmentedGroup f21633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f21634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Button f21635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ConstraintLayout f21636k;

    private v0(ConstraintLayout constraintLayout, RadioButton radioButton, ActionButton actionButton, RadioButton radioButton2, RadioButton radioButton3, GridLayout gridLayout, TextView textView, SegmentedGroup segmentedGroup, TextView textView2, Button button, ConstraintLayout constraintLayout2) {
        this.f21626a = constraintLayout;
        this.f21627b = radioButton;
        this.f21628c = actionButton;
        this.f21629d = radioButton2;
        this.f21630e = radioButton3;
        this.f21631f = gridLayout;
        this.f21632g = textView;
        this.f21633h = segmentedGroup;
        this.f21634i = textView2;
        this.f21635j = button;
        this.f21636k = constraintLayout2;
    }

    public static v0 a(View view) {
        int i10 = R.id.am;
        RadioButton radioButton = (RadioButton) r1.a.a(view, R.id.am);
        if (radioButton != null) {
            i10 = R.id.backspace;
            ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.backspace);
            if (actionButton != null) {
                i10 = R.id.dmr;
                RadioButton radioButton2 = (RadioButton) r1.a.a(view, R.id.dmr);
                if (radioButton2 != null) {
                    i10 = R.id.fm;
                    RadioButton radioButton3 = (RadioButton) r1.a.a(view, R.id.fm);
                    if (radioButton3 != null) {
                        i10 = R.id.keyboard;
                        GridLayout gridLayout = (GridLayout) r1.a.a(view, R.id.keyboard);
                        if (gridLayout != null) {
                            i10 = R.id.message;
                            TextView textView = (TextView) r1.a.a(view, R.id.message);
                            if (textView != null) {
                                i10 = R.id.modulation;
                                SegmentedGroup segmentedGroup = (SegmentedGroup) r1.a.a(view, R.id.modulation);
                                if (segmentedGroup != null) {
                                    i10 = R.id.number;
                                    TextView textView2 = (TextView) r1.a.a(view, R.id.number);
                                    if (textView2 != null) {
                                        i10 = R.id.f4945ok;
                                        Button button = (Button) r1.a.a(view, R.id.f4945ok);
                                        if (button != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                            return new v0(constraintLayout, radioButton, actionButton, radioButton2, radioButton3, gridLayout, textView, segmentedGroup, textView2, button, constraintLayout);
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

    public static v0 c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static v0 d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_number_input, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21626a;
    }
}
