package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f21040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f21041c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Button f21042d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21043e;

    private d(ConstraintLayout constraintLayout, Button button, ConstraintLayout constraintLayout2, Button button2, TextView textView) {
        this.f21039a = constraintLayout;
        this.f21040b = button;
        this.f21041c = constraintLayout2;
        this.f21042d = button2;
        this.f21043e = textView;
    }

    public static d a(View view) {
        int i10 = R.id.button_ok;
        Button button = (Button) r1.a.a(view, R.id.button_ok);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i10 = R.id.ignore;
            Button button2 = (Button) r1.a.a(view, R.id.ignore);
            if (button2 != null) {
                i10 = R.id.message;
                TextView textView = (TextView) r1.a.a(view, R.id.message);
                if (textView != null) {
                    return new d(constraintLayout, button, constraintLayout, button2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static d c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static d d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_incoming, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21039a;
    }
}
