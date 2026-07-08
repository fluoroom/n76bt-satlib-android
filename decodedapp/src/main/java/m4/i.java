package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CheckBox f21204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21205c;

    private i(ConstraintLayout constraintLayout, CheckBox checkBox, TextView textView) {
        this.f21203a = constraintLayout;
        this.f21204b = checkBox;
        this.f21205c = textView;
    }

    public static i a(View view) {
        int i10 = R.id.sure;
        CheckBox checkBox = (CheckBox) r1.a.a(view, R.id.sure);
        if (checkBox != null) {
            i10 = R.id.text1;
            TextView textView = (TextView) r1.a.a(view, R.id.text1);
            if (textView != null) {
                return new i((ConstraintLayout) view, checkBox, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static i c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static i d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.delete_account, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21203a;
    }
}
