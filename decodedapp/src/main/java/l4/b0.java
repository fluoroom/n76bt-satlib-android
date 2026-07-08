package l4;

import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import java.util.ArrayList;
import java.util.Collection;
import l4.b0;
import m4.c1;
import v4.l1;

/* JADX INFO: loaded from: classes.dex */
public final class b0 extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f20378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Cursor f20379e;

    public interface a {
        void k0(b bVar);
    }

    public b0(a aVar) {
        B(true);
        this.f20378d = aVar;
    }

    public final d5.e E(int i10) {
        Cursor cursor = this.f20379e;
        rd.m.b(cursor);
        cursor.moveToPosition(i10);
        return new d5.e(this.f20379e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void s(b bVar, int i10) {
        rd.m.e(bVar, "holder");
        bVar.V(E(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public b u(ViewGroup viewGroup, int i10) {
        rd.m.e(viewGroup, "parent");
        c1 c1VarA = c1.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_region_list_item, viewGroup, false));
        rd.m.d(c1VarA, "bind(...)");
        return new b(this, c1VarA);
    }

    public final void H(Cursor cursor) {
        this.f20379e = cursor;
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        Cursor cursor = this.f20379e;
        if (cursor == null) {
            return 0;
        }
        rd.m.b(cursor);
        return cursor.getCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i10) {
        Cursor cursor = this.f20379e;
        rd.m.b(cursor);
        cursor.moveToPosition(i10);
        Cursor cursor2 = this.f20379e;
        rd.m.b(cursor2);
        return cursor2.getLong(0);
    }

    public final class b extends RecyclerView.f0 implements View.OnClickListener {
        private final c1 D;
        private final TextView E;
        private final TextView F;
        private d5.e G;
        final /* synthetic */ b0 H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(b0 b0Var, c1 c1Var) {
            super(c1Var.b());
            rd.m.e(c1Var, "binding");
            this.H = b0Var;
            this.D = c1Var;
            c1Var.f21034b.setOnClickListener(this);
            TextView textView = c1Var.f21037e;
            rd.m.d(textView, "title");
            this.E = textView;
            TextView textView2 = c1Var.f21036d;
            rd.m.d(textView2, "summary");
            this.F = textView2;
            c1Var.f21035c.setOnClickListener(this);
            c1Var.f21038f.setOnClickListener(new View.OnClickListener() { // from class: l4.c0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    b0.b.U(this.f20381a, view);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void U(b bVar, View view) {
            bVar.W();
        }

        private final void W() {
            Context context = this.D.b().getContext();
            final l1 l1VarU = v4.u.u();
            if (!(l1VarU instanceof v4.c0)) {
                Toast.makeText(context, context.getString(R.string.pleaseConnectDeviceFirst), 1).show();
                return;
            }
            v4.c0 c0Var = (v4.c0) l1VarU;
            int i10 = c0Var.Q.i();
            if (i10 <= 1) {
                new c.a(context).k(context.getString(R.string.sync_to_device)).t(R.string.yes, new DialogInterface.OnClickListener() { // from class: l4.g0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        b0.b.Z(this.f20390a, dialogInterface, i11);
                    }
                }).m(R.string.no, new DialogInterface.OnClickListener() { // from class: l4.h0
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        b0.b.a0(dialogInterface, i11);
                    }
                }).C();
                return;
            }
            String[] strArr = new String[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                strArr[i11] = c0Var.Z1(i11);
            }
            new c.a(context).y(R.string.upload_to_device).x(strArr, -1, new DialogInterface.OnClickListener() { // from class: l4.e0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    b0.b.X(l1VarU, this, dialogInterface, i12);
                }
            }).m(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: l4.f0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i12) {
                    b0.b.Y(dialogInterface, i12);
                }
            }).C();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void X(l1 l1Var, b bVar, DialogInterface dialogInterface, int i10) {
            dialogInterface.dismiss();
            d5.e eVar = bVar.G;
            rd.m.b(eVar);
            ((v4.c0) l1Var).j1(eVar.b(), i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Z(b bVar, DialogInterface dialogInterface, int i10) {
            Collection collectionA = v4.u.w().A();
            rd.m.d(collectionA, "getLinks(...)");
            ArrayList<l1> arrayList = new ArrayList();
            for (Object obj : collectionA) {
                if (((l1) obj).n()) {
                    arrayList.add(obj);
                }
            }
            for (l1 l1Var : arrayList) {
                d5.e eVar = bVar.G;
                rd.m.b(eVar);
                l1Var.j1(eVar.b(), -1);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b0(d5.e eVar, Context context, DialogInterface dialogInterface, int i10) {
            eVar.k(context.getContentResolver());
        }

        public final void V(d5.e eVar) {
            TextView textView;
            int i10;
            rd.m.e(eVar, "region");
            this.G = eVar;
            TextView textView2 = this.E;
            textView2.setText(eVar.n(textView2.getContext()));
            this.F.setText(eVar.f10627f);
            if (TextUtils.isEmpty(eVar.f10627f)) {
                textView = this.F;
                i10 = 8;
            } else {
                textView = this.F;
                i10 = 0;
            }
            textView.setVisibility(i10);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rd.m.e(view, "v");
            if (view.getId() != R.id.del_btn) {
                a aVar = this.H.f20378d;
                if (aVar != null) {
                    aVar.k0(this);
                    return;
                }
                return;
            }
            final d5.e eVar = this.G;
            final Context context = this.E.getContext();
            c.a aVar2 = new c.a(context);
            rd.m.b(eVar);
            aVar2.z(context.getString(R.string.prompt_delRegion, eVar.n(context))).t(R.string.delete, new DialogInterface.OnClickListener() { // from class: l4.d0
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    b0.b.b0(eVar, context, dialogInterface, i10);
                }
            }).m(android.R.string.cancel, null).C();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Y(DialogInterface dialogInterface, int i10) {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a0(DialogInterface dialogInterface, int i10) {
        }
    }
}
