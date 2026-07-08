package androidx.browser.browseractions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.tencent.mm.opensdk.modelmsg.WXVideoFileObject;
import o.a;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public class BrowserActionsFallbackMenuView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f1329b;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1328a = getResources().getDimensionPixelOffset(a.f23045b);
        this.f1329b = getResources().getDimensionPixelOffset(a.f23044a);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(Math.min(getResources().getDisplayMetrics().widthPixels - (this.f1328a * 2), this.f1329b), WXVideoFileObject.FILE_SIZE_LIMIT), i11);
    }
}
