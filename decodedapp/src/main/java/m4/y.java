package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.benshikj.ht.R;
import com.dw.android.widget.NumberPreferenceView;
import com.dw.ht.map.ui.MaskView;

/* JADX INFO: loaded from: classes.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Button f21696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final NumberPreferenceView f21697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FrameLayout f21698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MaskView f21700f;

    private y(ConstraintLayout constraintLayout, Button button, NumberPreferenceView numberPreferenceView, FrameLayout frameLayout, TextView textView, MaskView maskView) {
        this.f21695a = constraintLayout;
        this.f21696b = button;
        this.f21697c = numberPreferenceView;
        this.f21698d = frameLayout;
        this.f21699e = textView;
        this.f21700f = maskView;
    }

    public static y a(View view) {
        int i10 = R.id.download;
        Button button = (Button) r1.a.a(view, R.id.download);
        if (button != null) {
            i10 = R.id.level;
            NumberPreferenceView numberPreferenceView = (NumberPreferenceView) r1.a.a(view, R.id.level);
            if (numberPreferenceView != null) {
                i10 = R.id.mapView;
                FrameLayout frameLayout = (FrameLayout) r1.a.a(view, R.id.mapView);
                if (frameLayout != null) {
                    i10 = R.id.map_zoom;
                    TextView textView = (TextView) r1.a.a(view, R.id.map_zoom);
                    if (textView != null) {
                        i10 = R.id.mask;
                        MaskView maskView = (MaskView) r1.a.a(view, R.id.mask);
                        if (maskView != null) {
                            return new y((ConstraintLayout) view, button, numberPreferenceView, frameLayout, textView, maskView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static y c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_cmap_region_selection, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21695a;
    }
}
