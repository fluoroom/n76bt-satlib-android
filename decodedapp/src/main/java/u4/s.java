package u4;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.benshikj.ht.rpc.Im;
import java.util.ArrayList;
import java.util.List;
import m4.o0;

/* JADX INFO: loaded from: classes.dex */
public final class s extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c6.i f28140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f28141e;

    public final class a extends RecyclerView.f0 implements View.OnClickListener {
        private final o0 D;
        private final TextView E;
        final /* synthetic */ s F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s sVar, o0 o0Var) {
            super(o0Var.b());
            rd.m.e(o0Var, "binding");
            this.F = sVar;
            this.D = o0Var;
            TextView textView = o0Var.f21389c;
            rd.m.d(textView, "name");
            this.E = textView;
            o0Var.b().setOnClickListener(this);
            o0Var.f21388b.setOnClickListener(this);
        }

        public final o0 O() {
            return this.D;
        }

        public final TextView P() {
            return this.E;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rd.m.e(view, "v");
            c6.i iVarD = this.F.D();
            Object tag = this.D.b().getTag();
            rd.m.c(tag, "null cannot be cast to non-null type com.benshikj.ht.rpc.Im.IIChannel");
            iVarD.V0((Im.IIChannel) tag, view.getId());
        }
    }

    public s(c6.i iVar) {
        rd.m.e(iVar, "onItemClickListener");
        this.f28140d = iVar;
        this.f28141e = new ArrayList();
    }

    public final c6.i D() {
        return this.f28140d;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void s(a aVar, int i10) {
        rd.m.e(aVar, "holder");
        Im.IIChannel iIChannel = (Im.IIChannel) this.f28141e.get(i10);
        if (iIChannel.getUserCount() == 0) {
            aVar.P().setText(iIChannel.getName());
        } else {
            aVar.P().setText(iIChannel.getName() + " (" + iIChannel.getUserCount() + ')');
        }
        aVar.O().b().setTag(iIChannel);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public a u(ViewGroup viewGroup, int i10) {
        rd.m.e(viewGroup, "parent");
        o0 o0VarA = o0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_iichannel, viewGroup, false));
        rd.m.d(o0VarA, "bind(...)");
        return new a(this, o0VarA);
    }

    public final void G(List list) {
        rd.m.e(list, "value");
        this.f28141e = list;
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        return this.f28141e.size();
    }
}
