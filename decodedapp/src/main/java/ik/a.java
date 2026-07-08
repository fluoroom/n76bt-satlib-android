package ik;

import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import fk.g;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a extends RecyclerView.f0 implements View.OnClickListener, View.OnLongClickListener {
    private final AppCompatTextView D;
    private final AppCompatCheckBox E;
    private jk.a F;

    a(View view) {
        super(view);
        view.setOnClickListener(this);
        view.setOnLongClickListener(this);
        this.D = (AppCompatTextView) view.findViewById(g.f13313e);
        this.E = (AppCompatCheckBox) view.findViewById(g.f13310b);
    }

    public void O(File file, boolean z10, boolean z11, jk.a aVar) {
        Q(aVar);
        this.D.setText(file.getName());
        this.E.setVisibility(z10 ? 0 : 8);
        this.E.setChecked(z11);
    }

    int P() {
        return k();
    }

    void Q(jk.a aVar) {
        this.F = aVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        jk.a aVar = this.F;
        if (aVar != null) {
            aVar.K(P());
        }
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        jk.a aVar = this.F;
        if (aVar == null) {
            return true;
        }
        aVar.P(P());
        return true;
    }
}
