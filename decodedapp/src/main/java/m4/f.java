package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f21113b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Button f21114c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f21115d;

    private f(ConstraintLayout constraintLayout, Button button, Button button2, TextView textView) {
        this.f21112a = constraintLayout;
        this.f21113b = button;
        this.f21114c = button2;
        this.f21115d = textView;
    }

    public static f a(View view) {
        int i10 = R.id.button_cancel;
        Button button = (Button) r1.a.a(view, R.id.button_cancel);
        if (button != null) {
            i10 = R.id.button_ok;
            Button button2 = (Button) r1.a.a(view, R.id.button_ok);
            if (button2 != null) {
                i10 = R.id.textView;
                TextView textView = (TextView) r1.a.a(view, R.id.textView);
                if (textView != null) {
                    return new f((ConstraintLayout) view, button, button2, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static f c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static f d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.activity_new_device, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21112a;
    }
}
