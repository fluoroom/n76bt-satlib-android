package h4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.dw.widget.ActionButton;
import k3.f;
import k3.g;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final View f15118a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppCompatImageView f15119b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ActionButton f15120c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TextView f15121d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Space f15122e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ActionButton f15123f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TextView f15124g;

    private b(View view, AppCompatImageView appCompatImageView, ActionButton actionButton, TextView textView, Space space, ActionButton actionButton2, TextView textView2) {
        this.f15118a = view;
        this.f15119b = appCompatImageView;
        this.f15120c = actionButton;
        this.f15121d = textView;
        this.f15122e = space;
        this.f15123f = actionButton2;
        this.f15124g = textView2;
    }

    public static b a(View view) {
        int i10 = f.f19183c;
        AppCompatImageView appCompatImageView = (AppCompatImageView) r1.a.a(view, i10);
        if (appCompatImageView != null) {
            i10 = f.f19184d;
            ActionButton actionButton = (ActionButton) r1.a.a(view, i10);
            if (actionButton != null) {
                i10 = f.f19192l;
                TextView textView = (TextView) r1.a.a(view, i10);
                if (textView != null) {
                    i10 = f.f19195o;
                    Space space = (Space) r1.a.a(view, i10);
                    if (space != null) {
                        i10 = f.f19202v;
                        ActionButton actionButton2 = (ActionButton) r1.a.a(view, i10);
                        if (actionButton2 != null) {
                            i10 = f.Q;
                            TextView textView2 = (TextView) r1.a.a(view, i10);
                            if (textView2 != null) {
                                return new b(view, appCompatImageView, actionButton, textView, space, actionButton2, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public static b b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(g.f19218l, viewGroup);
        return a(viewGroup);
    }
}
