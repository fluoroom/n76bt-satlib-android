package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f21384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CardView f21385c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FloatingActionButton f21386d;

    private o(ConstraintLayout constraintLayout, TextView textView, CardView cardView, FloatingActionButton floatingActionButton) {
        this.f21383a = constraintLayout;
        this.f21384b = textView;
        this.f21385c = cardView;
        this.f21386d = floatingActionButton;
    }

    public static o a(View view) {
        int i10 = R.id.name;
        TextView textView = (TextView) r1.a.a(view, R.id.name);
        if (textView != null) {
            i10 = R.id.name_card;
            CardView cardView = (CardView) r1.a.a(view, R.id.name_card);
            if (cardView != null) {
                i10 = R.id.pttButton;
                FloatingActionButton floatingActionButton = (FloatingActionButton) r1.a.a(view, R.id.pttButton);
                if (floatingActionButton != null) {
                    return new o((ConstraintLayout) view, textView, cardView, floatingActionButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static o c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static o d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.float_ptt, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21383a;
    }
}
