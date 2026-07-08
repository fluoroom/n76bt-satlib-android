package n0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f22361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f22362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22363c;

    public a(int i10, x xVar, int i11) {
        this.f22361a = i10;
        this.f22362b = xVar;
        this.f22363c = i11;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f22361a);
        this.f22362b.i0(this.f22363c, bundle);
    }
}
