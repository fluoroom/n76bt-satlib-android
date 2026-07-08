package m4;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f21388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21389c;

    private o0(LinearLayout linearLayout, Button button, TextView textView) {
        this.f21387a = linearLayout;
        this.f21388b = button;
        this.f21389c = textView;
    }

    public static o0 a(View view) {
        int i10 = R.id.join;
        Button button = (Button) r1.a.a(view, R.id.join);
        if (button != null) {
            i10 = R.id.name;
            TextView textView = (TextView) r1.a.a(view, R.id.name);
            if (textView != null) {
                return new o0((LinearLayout) view, button, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public LinearLayout b() {
        return this.f21387a;
    }
}
