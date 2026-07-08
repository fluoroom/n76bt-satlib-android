package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f20996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f20997b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ProgressBar f20998c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f20999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21000e;

    private b0(ConstraintLayout constraintLayout, TextView textView, ProgressBar progressBar, Button button, TextView textView2) {
        this.f20996a = constraintLayout;
        this.f20997b = textView;
        this.f20998c = progressBar;
        this.f20999d = button;
        this.f21000e = textView2;
    }

    public static b0 a(View view) {
        int i10 = R.id.header;
        TextView textView = (TextView) r1.a.a(view, R.id.header);
        if (textView != null) {
            i10 = R.id.progressBar;
            ProgressBar progressBar = (ProgressBar) r1.a.a(view, R.id.progressBar);
            if (progressBar != null) {
                i10 = R.id.restart;
                Button button = (Button) r1.a.a(view, R.id.restart);
                if (button != null) {
                    i10 = R.id.status_text;
                    TextView textView2 = (TextView) r1.a.a(view, R.id.status_text);
                    if (textView2 != null) {
                        return new b0((ConstraintLayout) view, textView, progressBar, button, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static b0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_create_team, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f20996a;
    }
}
