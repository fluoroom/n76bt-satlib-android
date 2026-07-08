package c5;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.widget.ActionButton;
import z4.h;

/* JADX INFO: loaded from: classes.dex */
public class r0 extends c6.b {
    private final c6.i A;

    public class a extends RecyclerView.f0 implements View.OnClickListener {
        private final TextView D;
        private final TextView E;
        private final ActionButton F;
        private h.c G;

        public a(View view) {
            super(view);
            view.findViewById(R.id.content).setOnClickListener(this);
            this.D = (TextView) view.findViewById(R.id.title);
            this.E = (TextView) view.findViewById(R.id.summary);
            ActionButton actionButton = (ActionButton) view.findViewById(R.id.visibility);
            this.F = actionButton;
            view.findViewById(R.id.del_btn).setOnClickListener(this);
            view.findViewById(R.id.share).setOnClickListener(this);
            view.findViewById(R.id.edit).setOnClickListener(this);
            actionButton.setOnClickListener(this);
        }

        public void O(h.c cVar) {
            this.G = cVar;
            if (cVar.f32927c) {
                this.D.setText(cVar.e() + "-解析错误");
            } else {
                this.D.setText(cVar.e());
            }
            this.E.setText(cVar.f32926b);
            if (TextUtils.isEmpty(cVar.f32926b)) {
                this.E.setVisibility(8);
            } else {
                this.E.setVisibility(0);
            }
            if (cVar.f()) {
                this.F.setImageResource(R.drawable.ic_visibility_off_24dp);
                this.F.setContentDescription(r0.this.H().getString(R.string.hidden));
            } else {
                this.F.setImageResource(R.drawable.ic_visibility_24dp);
                this.F.setContentDescription(r0.this.H().getString(R.string.displayed));
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (r0.this.A != null) {
                r0.this.A.V0(this.G, view.getId());
            }
        }
    }

    public r0(Context context, c6.i iVar) {
        super(context, 0);
        B(true);
        this.A = iVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void s(a aVar, int i10) {
        aVar.O((h.c) J(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public a u(ViewGroup viewGroup, int i10) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_track_list_item, viewGroup, false));
    }
}
