package m4;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageView f21600b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21601c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ActionButton f21602d;

    private u1(LinearLayout linearLayout, ImageView imageView, TextView textView, ActionButton actionButton) {
        this.f21599a = linearLayout;
        this.f21600b = imageView;
        this.f21601c = textView;
        this.f21602d = actionButton;
    }

    public static u1 a(View view) {
        int i10 = R.id.account_icon;
        ImageView imageView = (ImageView) r1.a.a(view, R.id.account_icon);
        if (imageView != null) {
            i10 = R.id.dev_name;
            TextView textView = (TextView) r1.a.a(view, R.id.dev_name);
            if (textView != null) {
                i10 = R.id.more_dev;
                ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.more_dev);
                if (actionButton != null) {
                    return new u1((LinearLayout) view, imageView, textView, actionButton);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }
}
