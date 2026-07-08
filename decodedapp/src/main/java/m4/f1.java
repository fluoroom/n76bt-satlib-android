package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionButton f21138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f21140d;

    private f1(ConstraintLayout constraintLayout, ActionButton actionButton, TextView textView, TextView textView2) {
        this.f21137a = constraintLayout;
        this.f21138b = actionButton;
        this.f21139c = textView;
        this.f21140d = textView2;
    }

    public static f1 a(View view) {
        int i10 = R.id.delete;
        ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.delete);
        if (actionButton != null) {
            i10 = R.id.text;
            TextView textView = (TextView) r1.a.a(view, R.id.text);
            if (textView != null) {
                i10 = R.id.title;
                TextView textView2 = (TextView) r1.a.a(view, R.id.title);
                if (textView2 != null) {
                    return new f1((ConstraintLayout) view, actionButton, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static f1 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_satellite_editor_preset_rf_config, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21137a;
    }
}
