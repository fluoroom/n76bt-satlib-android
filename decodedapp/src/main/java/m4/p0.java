package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.Spinner;
import androidx.appcompat.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScrollView f21425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionButton f21426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Spinner f21427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionButton f21428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActionButton f21429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EditText f21430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final EditText f21431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConstraintLayout f21432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FrameLayout f21433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Spinner f21434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final LinearLayout f21435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Spinner f21436l;

    private p0(ScrollView scrollView, ActionButton actionButton, Spinner spinner, ActionButton actionButton2, ActionButton actionButton3, EditText editText, EditText editText2, ConstraintLayout constraintLayout, FrameLayout frameLayout, Spinner spinner2, LinearLayout linearLayout, Spinner spinner3) {
        this.f21425a = scrollView;
        this.f21426b = actionButton;
        this.f21427c = spinner;
        this.f21428d = actionButton2;
        this.f21429e = actionButton3;
        this.f21430f = editText;
        this.f21431g = editText2;
        this.f21432h = constraintLayout;
        this.f21433i = frameLayout;
        this.f21434j = spinner2;
        this.f21435k = linearLayout;
        this.f21436l = spinner3;
    }

    public static p0 a(View view) {
        int i10 = R.id.add_rf_ch;
        ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.add_rf_ch);
        if (actionButton != null) {
            i10 = R.id.bandwidth;
            Spinner spinner = (Spinner) r1.a.a(view, R.id.bandwidth);
            if (spinner != null) {
                i10 = R.id.del_rf_ch;
                ActionButton actionButton2 = (ActionButton) r1.a.a(view, R.id.del_rf_ch);
                if (actionButton2 != null) {
                    i10 = R.id.link;
                    ActionButton actionButton3 = (ActionButton) r1.a.a(view, R.id.link);
                    if (actionButton3 != null) {
                        i10 = R.id.name;
                        EditText editText = (EditText) r1.a.a(view, R.id.name);
                        if (editText != null) {
                            i10 = R.id.passcode;
                            EditText editText2 = (EditText) r1.a.a(view, R.id.passcode);
                            if (editText2 != null) {
                                i10 = R.id.rf_cfg_title;
                                ConstraintLayout constraintLayout = (ConstraintLayout) r1.a.a(view, R.id.rf_cfg_title);
                                if (constraintLayout != null) {
                                    i10 = R.id.rf_ch_c;
                                    FrameLayout frameLayout = (FrameLayout) r1.a.a(view, R.id.rf_ch_c);
                                    if (frameLayout != null) {
                                        i10 = R.id.serverLocation;
                                        Spinner spinner2 = (Spinner) r1.a.a(view, R.id.serverLocation);
                                        if (spinner2 != null) {
                                            i10 = R.id.server_location_c;
                                            LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.server_location_c);
                                            if (linearLayout != null) {
                                                i10 = R.id.speak_level;
                                                Spinner spinner3 = (Spinner) r1.a.a(view, R.id.speak_level);
                                                if (spinner3 != null) {
                                                    return new p0((ScrollView) view, actionButton, spinner, actionButton2, actionButton3, editText, editText2, constraintLayout, frameLayout, spinner2, linearLayout, spinner3);
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

    public static p0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_iichannel_editor, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ScrollView b() {
        return this.f21425a;
    }
}
