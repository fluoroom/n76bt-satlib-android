package v3;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.dw.android.widget.ListItemView;
import com.dw.widget.ActionButton;
import kotlin.Metadata;
import v3.x;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001:\u0002./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0011\u001a\u00060\u0010R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\b2\n\u0010\u0013\u001a\u00060\u0010R\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0003J-\u0010\u001e\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ!\u0010!\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010\u0003R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020$8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Lv3/x;", "Lv3/m0;", "<init>", "()V", "Landroid/view/View;", "actionView", "", "position", "Ldd/d0;", "E4", "(Landroid/view/View;I)V", "H4", "(I)V", "Landroid/view/ViewGroup;", "parent", "viewType", "Lv3/x$b;", "G4", "(Landroid/view/ViewGroup;I)Lv3/x$b;", "holder", "F4", "(Lv3/x$b;I)V", "C4", "(I)I", "D4", "Landroid/view/LayoutInflater;", "inflater", "container", "Landroid/os/Bundle;", "savedInstanceState", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "y2", "Lh4/a;", "F0", "Lh4/a;", "_binding", "A4", "()Lh4/a;", "binding", "B4", "()I", "itemCount", "a", "b", "android_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class x extends m0 {

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private h4.a _binding;

    public final class a extends RecyclerView.h {
        public a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
        public void s(b bVar, int i10) {
            rd.m.e(bVar, "holder");
            x.this.F4(bVar, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public b u(ViewGroup viewGroup, int i10) {
            rd.m.e(viewGroup, "parent");
            return x.this.G4(viewGroup, i10);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int f() {
            return x.this.B4();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h(int i10) {
            return x.this.C4(i10);
        }
    }

    public final class b extends RecyclerView.f0 implements View.OnClickListener {
        final /* synthetic */ x D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(final x xVar, View view) {
            ActionButton actionButton;
            super(view);
            rd.m.e(view, "itemView");
            this.D = xVar;
            view.setOnClickListener(this);
            ListItemView listItemViewQ = Q();
            if (listItemViewQ == null || (actionButton = listItemViewQ.getActionButton()) == null) {
                return;
            }
            actionButton.setOnClickListener(new View.OnClickListener() { // from class: v3.y
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    x.b.P(xVar, this, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void P(x xVar, b bVar, View view) {
            rd.m.b(view);
            xVar.E4(view, bVar.k());
        }

        public final ListItemView Q() {
            return (ListItemView) this.f2964a;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rd.m.e(view, "v");
            this.D.H4(k());
        }
    }

    private final h4.a A4() {
        h4.a aVar = this._binding;
        rd.m.b(aVar);
        return aVar;
    }

    public abstract int B4();

    public int C4(int position) {
        return 0;
    }

    public final void D4() {
        RecyclerView recyclerView;
        RecyclerView.h adapter;
        h4.a aVar = this._binding;
        if (aVar == null || (recyclerView = aVar.f15116b) == null || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        adapter.k();
    }

    public void E4(View actionView, int position) {
        rd.m.e(actionView, "actionView");
    }

    public void F4(b holder, int position) {
        rd.m.e(holder, "holder");
    }

    public b G4(ViewGroup parent, int viewType) {
        rd.m.e(parent, "parent");
        Context context = parent.getContext();
        rd.m.d(context, "getContext(...)");
        ListItemView listItemView = new ListItemView(context, (ListItemView.b) null, 2, (rd.h) null);
        listItemView.setLayoutParams(new RecyclerView.r(-1, -2));
        return new b(this, listItemView);
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        A4().f15116b.setLayoutManager(new LinearLayoutManager(k1()));
        A4().f15116b.l(new c6.m(k1(), 0));
        A4().f15116b.setAdapter(new a());
        A4().f15117c.setEnabled(false);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        this._binding = h4.a.c(inflater, container, false);
        return A4().b();
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        this._binding = null;
        super.y2();
    }

    public void H4(int position) {
    }
}
