package ik;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import fk.f;
import fk.g;

/* JADX INFO: loaded from: classes3.dex */
public class d extends a {
    private final AppCompatTextView G;
    private final AppCompatCheckBox H;
    private final AppCompatTextView I;
    private final AppCompatImageView J;

    public d(View view) {
        super(view);
        this.G = (AppCompatTextView) view.findViewById(g.f13313e);
        this.H = (AppCompatCheckBox) view.findViewById(g.f13310b);
        this.I = (AppCompatTextView) view.findViewById(g.f13314f);
        this.J = (AppCompatImageView) view.findViewById(g.f13323o);
    }

    @Override // ik.a
    int P() {
        return -1;
    }

    public void R(jk.a aVar) {
        Q(aVar);
        this.G.setText("..");
        this.H.setVisibility(8);
        AppCompatTextView appCompatTextView = this.I;
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(8);
        }
        this.J.setImageResource(f.f13308c);
    }
}
