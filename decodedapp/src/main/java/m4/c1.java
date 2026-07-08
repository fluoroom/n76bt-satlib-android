package m4;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinearLayout f21034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionButton f21035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f21036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ActionButton f21038f;

    private c1(LinearLayout linearLayout, LinearLayout linearLayout2, ActionButton actionButton, TextView textView, TextView textView2, ActionButton actionButton2) {
        this.f21033a = linearLayout;
        this.f21034b = linearLayout2;
        this.f21035c = actionButton;
        this.f21036d = textView;
        this.f21037e = textView2;
        this.f21038f = actionButton2;
    }

    public static c1 a(View view) {
        int i10 = R.id.content;
        LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.content);
        if (linearLayout != null) {
            i10 = R.id.del_btn;
            ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.del_btn);
            if (actionButton != null) {
                i10 = R.id.summary;
                TextView textView = (TextView) r1.a.a(view, R.id.summary);
                if (textView != null) {
                    i10 = R.id.title;
                    TextView textView2 = (TextView) r1.a.a(view, R.id.title);
                    if (textView2 != null) {
                        i10 = R.id.upload;
                        ActionButton actionButton2 = (ActionButton) r1.a.a(view, R.id.upload);
                        if (actionButton2 != null) {
                            return new c1((LinearLayout) view, linearLayout, actionButton, textView, textView2, actionButton2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public LinearLayout b() {
        return this.f21033a;
    }
}
