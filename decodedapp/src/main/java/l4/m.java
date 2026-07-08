package l4;

import android.content.res.Resources;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;

/* JADX INFO: loaded from: classes.dex */
public class m extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f20400d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Cursor f20401e;

    public interface a {
        void q(b bVar);
    }

    public class b extends RecyclerView.f0 implements View.OnClickListener {
        private final TextView D;
        private final TextView E;
        private final TextView F;
        private final TextView G;
        private final TextView H;
        private final TextView I;
        private final TextView J;
        private d5.a K;

        public b(View view) {
            super(view);
            view.setOnClickListener(this);
            this.D = (TextView) view.findViewById(R.id.title);
            this.E = (TextView) view.findViewById(R.id.tx_freq);
            this.F = (TextView) view.findViewById(R.id.rx_freq);
            this.G = (TextView) view.findViewById(R.id.rx_sub_audio);
            this.J = (TextView) view.findViewById(R.id.tx_sub_audio);
            this.H = (TextView) view.findViewById(R.id.tx_power);
            this.I = (TextView) view.findViewById(R.id.bandwidth);
        }

        public void O(d5.a aVar) {
            this.K = aVar;
            this.D.setText(aVar.y());
            Resources resources = this.F.getResources();
            this.E.setText(resources.getString(R.string.tx_freq) + ":" + aVar.A(Cfg.P()));
            this.F.setText(resources.getString(R.string.rx_freq) + ":" + aVar.w(Cfg.P()));
            this.G.setText(aVar.x());
            this.J.setText(aVar.C());
            TextView textView = this.H;
            if (textView != null) {
                textView.setText(aVar.B());
            }
            TextView textView2 = this.I;
            if (textView2 != null) {
                textView2.setText(aVar.t());
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (m.this.f20400d != null) {
                m.this.f20400d.q(this);
            }
        }
    }

    public m(a aVar) {
        B(true);
        this.f20400d = aVar;
    }

    public d5.a E(int i10) {
        this.f20401e.moveToPosition(i10);
        return new d5.a(this.f20401e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void s(b bVar, int i10) {
        bVar.O(E(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b u(ViewGroup viewGroup, int i10) {
        return new b(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_channel_list_item, viewGroup, false));
    }

    public void H(Cursor cursor) {
        this.f20401e = cursor;
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        Cursor cursor = this.f20401e;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i10) {
        this.f20401e.moveToPosition(i10);
        return this.f20401e.getLong(0);
    }
}
