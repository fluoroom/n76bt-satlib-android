package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21531a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f21532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ListView f21533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ProgressBar f21534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Button f21535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f21536f;

    private s0(ConstraintLayout constraintLayout, TextView textView, ListView listView, ProgressBar progressBar, Button button, TextView textView2) {
        this.f21531a = constraintLayout;
        this.f21532b = textView;
        this.f21533c = listView;
        this.f21534d = progressBar;
        this.f21535e = button;
        this.f21536f = textView2;
    }

    public static s0 a(View view) {
        int i10 = R.id.header;
        TextView textView = (TextView) r1.a.a(view, R.id.header);
        if (textView != null) {
            i10 = R.id.list;
            ListView listView = (ListView) r1.a.a(view, R.id.list);
            if (listView != null) {
                i10 = R.id.progressBar;
                ProgressBar progressBar = (ProgressBar) r1.a.a(view, R.id.progressBar);
                if (progressBar != null) {
                    i10 = R.id.restart;
                    Button button = (Button) r1.a.a(view, R.id.restart);
                    if (button != null) {
                        i10 = R.id.status_text;
                        TextView textView2 = (TextView) r1.a.a(view, R.id.status_text);
                        if (textView2 != null) {
                            return new s0((ConstraintLayout) view, textView, listView, progressBar, button, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static s0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_jion_team, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21531a;
    }
}
