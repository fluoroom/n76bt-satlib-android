package h4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.dw.widget.ActionButton;
import k3.f;
import k3.g;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f15125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f15126b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionButton f15127c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f15128d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ActionButton f15129e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final TextView f15130f;

    private c(View view, AppCompatImageView appCompatImageView, ActionButton actionButton, TextView textView, ActionButton actionButton2, TextView textView2) {
        this.f15125a = view;
        this.f15126b = appCompatImageView;
        this.f15127c = actionButton;
        this.f15128d = textView;
        this.f15129e = actionButton2;
        this.f15130f = textView2;
    }

    public static c a(View view) {
        int i10 = f.f19183c;
        AppCompatImageView appCompatImageView = (AppCompatImageView) r1.a.a(view, i10);
        if (appCompatImageView != null) {
            i10 = f.f19184d;
            ActionButton actionButton = (ActionButton) r1.a.a(view, i10);
            if (actionButton != null) {
                i10 = f.f19192l;
                TextView textView = (TextView) r1.a.a(view, i10);
                if (textView != null) {
                    i10 = f.f19202v;
                    ActionButton actionButton2 = (ActionButton) r1.a.a(view, i10);
                    if (actionButton2 != null) {
                        i10 = f.Q;
                        TextView textView2 = (TextView) r1.a.a(view, i10);
                        if (textView2 != null) {
                            return new c(view, appCompatImageView, actionButton, textView, actionButton2, textView2);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static c b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(g.f19219m, viewGroup);
        return a(viewGroup);
    }
}
