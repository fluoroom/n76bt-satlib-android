package ik;

import a3.f;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import fk.g;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public class c extends a {
    private final Context G;
    private final AppCompatTextView H;
    private final AppCompatImageView I;

    public c(View view) {
        super(view);
        this.G = view.getContext();
        this.H = (AppCompatTextView) view.findViewById(g.f13314f);
        this.I = (AppCompatImageView) view.findViewById(g.f13323o);
    }

    @Override // ik.a
    public void O(File file, boolean z10, boolean z11, jk.a aVar) {
        super.O(file, z10, z11, aVar);
        AppCompatTextView appCompatTextView = this.H;
        if (appCompatTextView != null) {
            appCompatTextView.setVisibility(0);
            this.H.setText(lk.b.e(this.G, file.length()));
        }
        com.bumptech.glide.c.t(this.G).t(file).a((f) new f().i(fk.f.f13306a)).w0(this.I);
    }
}
