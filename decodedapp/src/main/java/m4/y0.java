package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f21702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppCompatImageView f21703c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f21704d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View f21705e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f21706f;

    private y0(ConstraintLayout constraintLayout, TextView textView, AppCompatImageView appCompatImageView, TextView textView2, View view, TextView textView3) {
        this.f21701a = constraintLayout;
        this.f21702b = textView;
        this.f21703c = appCompatImageView;
        this.f21704d = textView2;
        this.f21705e = view;
        this.f21706f = textView3;
    }

    public static y0 a(View view) {
        int i10 = R.id.action;
        TextView textView = (TextView) r1.a.a(view, R.id.action);
        if (textView != null) {
            i10 = R.id.actionButton;
            AppCompatImageView appCompatImageView = (AppCompatImageView) r1.a.a(view, R.id.actionButton);
            if (appCompatImageView != null) {
                i10 = R.id.button_time;
                TextView textView2 = (TextView) r1.a.a(view, R.id.button_time);
                if (textView2 != null) {
                    i10 = R.id.div1;
                    View viewA = r1.a.a(view, R.id.div1);
                    if (viewA != null) {
                        i10 = R.id.px;
                        TextView textView3 = (TextView) r1.a.a(view, R.id.px);
                        if (textView3 != null) {
                            return new y0((ConstraintLayout) view, textView, appCompatImageView, textView2, viewA, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static y0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_programmable_button_item, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21701a;
    }
}
