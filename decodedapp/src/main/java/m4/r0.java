package m4;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinearLayout f21498a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ActionButton f21499b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21500c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ImageView f21501d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActionButton f21502e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ActionButton f21503f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f21504g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextView f21505h;

    private r0(LinearLayout linearLayout, ActionButton actionButton, TextView textView, ImageView imageView, ActionButton actionButton2, ActionButton actionButton3, TextView textView2, TextView textView3) {
        this.f21498a = linearLayout;
        this.f21499b = actionButton;
        this.f21500c = textView;
        this.f21501d = imageView;
        this.f21502e = actionButton2;
        this.f21503f = actionButton3;
        this.f21504g = textView2;
        this.f21505h = textView3;
    }

    public static r0 a(View view) {
        int i10 = R.id.ban;
        ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.ban);
        if (actionButton != null) {
            i10 = R.id.header;
            TextView textView = (TextView) r1.a.a(view, R.id.header);
            if (textView != null) {
                i10 = R.id.icon;
                ImageView imageView = (ImageView) r1.a.a(view, R.id.icon);
                if (imageView != null) {
                    i10 = R.id.loc;
                    ActionButton actionButton2 = (ActionButton) r1.a.a(view, R.id.loc);
                    if (actionButton2 != null) {
                        i10 = R.id.settings;
                        ActionButton actionButton3 = (ActionButton) r1.a.a(view, R.id.settings);
                        if (actionButton3 != null) {
                            i10 = R.id.summary;
                            TextView textView2 = (TextView) r1.a.a(view, R.id.summary);
                            if (textView2 != null) {
                                i10 = R.id.title;
                                TextView textView3 = (TextView) r1.a.a(view, R.id.title);
                                if (textView3 != null) {
                                    return new r0((LinearLayout) view, actionButton, textView, imageView, actionButton2, actionButton3, textView2, textView3);
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public LinearLayout b() {
        return this.f21498a;
    }
}
