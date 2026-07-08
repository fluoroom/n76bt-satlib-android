package ik;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import fk.f;
import fk.g;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class b extends a {
    private final AppCompatTextView G;
    private final AppCompatImageView H;

    public b(View view) {
        super(view);
        this.G = (AppCompatTextView) this.f2964a.findViewById(g.f13314f);
        this.H = (AppCompatImageView) this.f2964a.findViewById(g.f13323o);
    }

    @Override // ik.a
    public void O(File file, boolean z10, boolean z11, jk.a aVar) {
        super.O(file, z10, z11, aVar);
        AppCompatTextView appCompatTextView = this.G;
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(8);
        }
        this.H.setImageResource(f.f13307b);
    }
}
