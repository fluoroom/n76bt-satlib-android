package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.android.widget.TowLineTextView;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21334a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionButton f21335b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TowLineTextView f21336c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionButton f21337d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActionButton f21338e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ActionButton f21339f;

    private m0(ConstraintLayout constraintLayout, ActionButton actionButton, TowLineTextView towLineTextView, ActionButton actionButton2, ActionButton actionButton3, ActionButton actionButton4) {
        this.f21334a = constraintLayout;
        this.f21335b = actionButton;
        this.f21336c = towLineTextView;
        this.f21337d = actionButton2;
        this.f21338e = actionButton3;
        this.f21339f = actionButton4;
    }

    public static m0 a(View view) {
        int i10 = R.id.monitor;
        ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.monitor);
        if (actionButton != null) {
            i10 = R.id.name;
            TowLineTextView towLineTextView = (TowLineTextView) r1.a.a(view, R.id.name);
            if (towLineTextView != null) {
                i10 = R.id.new_message;
                ActionButton actionButton2 = (ActionButton) r1.a.a(view, R.id.new_message);
                if (actionButton2 != null) {
                    i10 = R.id.settings;
                    ActionButton actionButton3 = (ActionButton) r1.a.a(view, R.id.settings);
                    if (actionButton3 != null) {
                        i10 = R.id.type;
                        ActionButton actionButton4 = (ActionButton) r1.a.a(view, R.id.type);
                        if (actionButton4 != null) {
                            return new m0((ConstraintLayout) view, actionButton, towLineTextView, actionButton2, actionButton3, actionButton4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static m0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_ii_control_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21334a;
    }
}
