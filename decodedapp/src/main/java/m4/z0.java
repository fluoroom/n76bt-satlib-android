package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckBox f21712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21713c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f21714d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21715e;

    private z0(ConstraintLayout constraintLayout, CheckBox checkBox, TextView textView, TextView textView2, TextView textView3) {
        this.f21711a = constraintLayout;
        this.f21712b = checkBox;
        this.f21713c = textView;
        this.f21714d = textView2;
        this.f21715e = textView3;
    }

    public static z0 a(View view) {
        int i10 = R.id.enable;
        CheckBox checkBox = (CheckBox) r1.a.a(view, R.id.enable);
        if (checkBox != null) {
            i10 = R.id.pressed;
            TextView textView = (TextView) r1.a.a(view, R.id.pressed);
            if (textView != null) {
                i10 = R.id.summary;
                TextView textView2 = (TextView) r1.a.a(view, R.id.summary);
                if (textView2 != null) {
                    i10 = R.id.title;
                    TextView textView3 = (TextView) r1.a.a(view, R.id.title);
                    if (textView3 != null) {
                        return new z0((ConstraintLayout) view, checkBox, textView, textView2, textView3);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static z0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_ptt_action, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21711a;
    }
}
