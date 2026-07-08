package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;

/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FrameLayout f21647a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.widget.FrameLayout f21648b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionButton f21649c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LinearLayout f21650d;

    private w(FrameLayout frameLayout, androidx.appcompat.widget.FrameLayout frameLayout2, ActionButton actionButton, LinearLayout linearLayout) {
        this.f21647a = frameLayout;
        this.f21648b = frameLayout2;
        this.f21649c = actionButton;
        this.f21650d = linearLayout;
    }

    public static w a(View view) {
        int i10 = R.id._map;
        androidx.appcompat.widget.FrameLayout frameLayout = (androidx.appcompat.widget.FrameLayout) r1.a.a(view, R.id._map);
        if (frameLayout != null) {
            i10 = R.id.map_layer;
            ActionButton actionButton = (ActionButton) r1.a.a(view, R.id.map_layer);
            if (actionButton != null) {
                i10 = R.id.map_tools;
                LinearLayout linearLayout = (LinearLayout) r1.a.a(view, R.id.map_tools);
                if (linearLayout != null) {
                    return new w((FrameLayout) view, frameLayout, actionButton, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static w c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_c_track, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public FrameLayout b() {
        return this.f21647a;
    }
}
