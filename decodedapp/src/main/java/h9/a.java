package h9;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TimeInterpolator f15178a = new PathInterpolator(0.1f, 0.1f, 0.0f, 1.0f);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final View f15179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final int f15180c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final int f15181d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final int f15182e;

    public a(View view) {
        this.f15179b = view;
        Context context = view.getContext();
        this.f15180c = d.f(context, u8.b.f28570z, 300);
        this.f15181d = d.f(context, u8.b.C, 150);
        this.f15182e = d.f(context, u8.b.B, 100);
    }
}
