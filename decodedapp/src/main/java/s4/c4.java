package s4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.mdc.Packet;
import java.util.ArrayList;
import s4.b4;

/* JADX INFO: loaded from: classes.dex */
public class c4 extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArrayList f26391d = new ArrayList();

    public class a extends RecyclerView.f0 implements View.OnClickListener {
        public final View D;
        public final TextView E;
        public final TextView F;
        public final TextView G;
        public Packet H;

        public a(View view) {
            super(view);
            this.D = view;
            this.E = (TextView) view.findViewById(R.id.text1);
            this.F = (TextView) view.findViewById(R.id.text2);
            this.G = (TextView) view.findViewById(R.id.text3);
            view.setOnClickListener(this);
        }

        public void O(Packet packet) {
            this.H = packet;
            this.E.setText(packet.toString());
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            c4.D(c4.this);
        }
    }

    public c4(b4.b bVar) {
        B(true);
    }

    static /* synthetic */ b4.b D(c4 c4Var) {
        c4Var.getClass();
        return null;
    }

    public void E(Packet packet) {
        this.f26391d.add(packet);
        m(this.f26391d.size() - 1);
    }

    public Packet F(int i10) {
        return (Packet) this.f26391d.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void s(a aVar, int i10) {
        aVar.O(F(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public a u(ViewGroup viewGroup, int i10) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_mdc_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.f26391d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i10) {
        return i10;
    }
}
