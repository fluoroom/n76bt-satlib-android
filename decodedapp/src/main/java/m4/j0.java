package m4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import com.benshikj.ht.R;

/* JADX INFO: loaded from: classes.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConstraintLayout f21245a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FragmentContainerView f21246b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextView f21247c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FragmentContainerView f21248d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final TextView f21249e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f21250f;

    private j0(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView, TextView textView, FragmentContainerView fragmentContainerView2, TextView textView2, TextView textView3) {
        this.f21245a = constraintLayout;
        this.f21246b = fragmentContainerView;
        this.f21247c = textView;
        this.f21248d = fragmentContainerView2;
        this.f21249e = textView2;
        this.f21250f = textView3;
    }

    public static j0 a(View view) {
        int i10 = R.id.dev_id;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) r1.a.a(view, R.id.dev_id);
        if (fragmentContainerView != null) {
            i10 = R.id.id_info;
            TextView textView = (TextView) r1.a.a(view, R.id.id_info);
            if (textView != null) {
                i10 = R.id.id_writer;
                FragmentContainerView fragmentContainerView2 = (FragmentContainerView) r1.a.a(view, R.id.id_writer);
                if (fragmentContainerView2 != null) {
                    i10 = R.id.message;
                    TextView textView2 = (TextView) r1.a.a(view, R.id.message);
                    if (textView2 != null) {
                        i10 = R.id.status;
                        TextView textView3 = (TextView) r1.a.a(view, R.id.status);
                        if (textView3 != null) {
                            return new j0((ConstraintLayout) view, fragmentContainerView, textView, fragmentContainerView2, textView2, textView3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static j0 c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z10) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_h_m_settings, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    public ConstraintLayout b() {
        return this.f21245a;
    }
}
