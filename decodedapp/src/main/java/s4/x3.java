package s4;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.activitys.ContactDetailsActivity;
import com.dw.widget.ActionButton;
import d5.l;
import java.util.ArrayList;
import java.util.Iterator;
import s3.c;
import s4.r3;
import s4.x3;

/* JADX INFO: loaded from: classes.dex */
public final class x3 extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c6.i f26837d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f26838e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private r3.a f26839f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f26840g;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private v4.n1 f26842r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f26844t;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f26841h = a6.o.a();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f26843s = true;

    public x3(c6.i iVar, long j10) {
        this.f26837d = iVar;
        this.f26838e = j10;
        B(true);
    }

    public final g5.b G(int i10) {
        r3.a aVar = this.f26839f;
        rd.m.b(aVar);
        return aVar.get(i10);
    }

    public final long H() {
        return this.f26838e;
    }

    public final boolean I() {
        return this.f26843s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void s(a aVar, int i10) {
        rd.m.e(aVar, "holder");
        g5.b bVarG = G(i10);
        aVar.R(bVarG);
        if (i10 != 0 && G(i10 - 1).b() == bVarG.b()) {
            aVar.W(0);
        } else if (bVarG.b()) {
            aVar.W(R.string.online);
        } else {
            aVar.W(R.string.iiOffline);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public a u(ViewGroup viewGroup, int i10) {
        rd.m.e(viewGroup, "parent");
        m4.r0 r0VarA = m4.r0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_iicontact_list_item, viewGroup, false));
        rd.m.d(r0VarA, "bind(...)");
        a aVar = new a(this, r0VarA);
        this.f26841h.add(aVar);
        return aVar;
    }

    public final void L(long j10) {
        int iK;
        r3.a aVar = this.f26839f;
        if (aVar == null || (iK = aVar.K(j10)) < 0) {
            return;
        }
        q(iK);
    }

    public final void M(r3.a aVar) {
        this.f26839f = aVar;
        long jI = com.dw.ht.user.b.f6853a.i();
        g5.b bVar = null;
        Object obj = null;
        if (aVar != null) {
            Iterator<E> it = aVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((g5.b) next).c() == jI) {
                    obj = next;
                    break;
                }
            }
            bVar = (g5.b) obj;
        }
        boolean z10 = false;
        boolean z11 = jI == this.f26838e;
        this.f26840g = z11;
        if (z11 || (bVar != null && bVar.d())) {
            z10 = true;
        }
        this.f26844t = z10;
        k();
    }

    public final void N(v4.n1 n1Var) {
        if (n1Var == null) {
            return;
        }
        this.f26842r = n1Var;
        this.f26840g = n1Var.z1();
    }

    public final void O(long j10) {
        this.f26838e = j10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        r3.a aVar = this.f26839f;
        if (aVar == null) {
            return 0;
        }
        rd.m.b(aVar);
        return aVar.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i10) {
        r3.a aVar = this.f26839f;
        rd.m.b(aVar);
        return aVar.get(i10).c();
    }

    public final class a extends RecyclerView.f0 implements View.OnClickListener {
        private final m4.r0 D;
        private TextView E;
        private TextView F;
        private TextView G;
        private final ImageView H;
        private final ActionButton I;
        private final ActionButton J;
        private final View K;
        public g5.b L;
        private boolean M;
        private final c.d N;
        private final C0368a O;
        final /* synthetic */ x3 P;

        /* JADX INFO: renamed from: s4.x3$a$a, reason: collision with other inner class name */
        public static final class C0368a implements l.a {
            C0368a() {
            }

            @Override // d5.l.a
            public void a(long j10, String str) {
                if (j10 != a.this.T().c()) {
                    return;
                }
                a.this.E.setText(str);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(x3 x3Var, m4.r0 r0Var) {
            super(r0Var.b());
            rd.m.e(r0Var, "view");
            this.P = x3Var;
            this.D = r0Var;
            TextView textView = r0Var.f21505h;
            rd.m.d(textView, "title");
            this.E = textView;
            TextView textView2 = r0Var.f21504g;
            rd.m.d(textView2, "summary");
            this.F = textView2;
            TextView textView3 = r0Var.f21500c;
            rd.m.d(textView3, "header");
            this.G = textView3;
            ImageView imageView = r0Var.f21501d;
            rd.m.d(imageView, "icon");
            this.H = imageView;
            ActionButton actionButton = r0Var.f21503f;
            rd.m.d(actionButton, "settings");
            this.I = actionButton;
            ActionButton actionButton2 = r0Var.f21499b;
            rd.m.d(actionButton2, "ban");
            this.J = actionButton2;
            ActionButton actionButton3 = r0Var.f21502e;
            rd.m.d(actionButton3, "loc");
            this.K = actionButton3;
            this.M = true;
            this.N = new c.d() { // from class: s4.v3
                @Override // s3.c.d
                public final void a(Object obj) {
                    x3.a.S(this.f26810a, (Bitmap) obj);
                }
            };
            this.O = new C0368a();
            r0Var.f21502e.setOnClickListener(this);
            r0Var.f21499b.setOnClickListener(this);
            r0Var.f21503f.setOnClickListener(this);
            r0Var.b().setOnClickListener(this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void S(a aVar, Bitmap bitmap) {
            if (bitmap != null) {
                aVar.H.setImageBitmap(bitmap);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean V(a aVar, g5.b bVar, x3 x3Var, MenuItem menuItem) {
            aVar.X(bVar);
            c6.i iVar = x3Var.f26837d;
            return iVar != null && iVar.V0(aVar, menuItem.getItemId());
        }

        public final void R(g5.b bVar) {
            rd.m.e(bVar, "item");
            X(bVar);
            d5.l lVarG = d5.l.g();
            this.H.setImageResource(R.drawable.ic_account_circle_24dp);
            lVarG.i(bVar.c(), this.N, this.O);
            if (this.M != this.P.I()) {
                boolean zI = this.P.I();
                this.M = zI;
                this.K.setVisibility(zI ? 0 : 8);
            }
            if (bVar.e()) {
                this.J.setVisibility(0);
            } else {
                this.J.setVisibility(8);
            }
            if (bVar.c() == this.P.H()) {
                Z(R.string.iiChannelOwner);
            } else if (bVar.d()) {
                Z(R.string.iiChannelManager);
            } else {
                Y(null);
            }
            long jI = com.dw.ht.user.b.f6853a.i();
            if (!this.P.f26844t || bVar.c() == jI || bVar.c() == this.P.H()) {
                this.I.setVisibility(8);
            } else {
                this.I.setVisibility(0);
            }
            a0();
        }

        public final g5.b T() {
            g5.b bVar = this.L;
            if (bVar != null) {
                return bVar;
            }
            rd.m.o("mItem");
            return null;
        }

        public final String U() {
            return this.E.getText().toString();
        }

        public final void W(int i10) {
            if (i10 == 0) {
                this.G.setVisibility(8);
            } else {
                this.G.setText(i10);
                this.G.setVisibility(0);
            }
        }

        public final void X(g5.b bVar) {
            rd.m.e(bVar, "<set-?>");
            this.L = bVar;
        }

        public final void Y(String str) {
            this.F.setText(str);
            if (a6.w.b(str)) {
                this.F.setVisibility(8);
            } else {
                this.F.setVisibility(0);
            }
        }

        public final void Z(int i10) {
            this.F.setText(i10);
            this.F.setVisibility(0);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            rd.m.e(view, "v");
            long jC = T().c();
            Context context = view.getContext();
            if (jC != 0) {
                d5.l.g().l(jC, this.N);
            }
            int id2 = view.getId();
            if (id2 != R.id.ban) {
                if (id2 == R.id.settings) {
                    PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
                    popupMenu.getMenuInflater().inflate(R.menu.iimember, popupMenu.getMenu());
                    final g5.b bVarT = T();
                    if (this.P.f26840g) {
                        popupMenu.getMenu().findItem(R.id.set_as_admin).setVisible(!bVarT.d());
                        popupMenu.getMenu().findItem(R.id.cancel_admin_right).setVisible(bVarT.d());
                    } else {
                        popupMenu.getMenu().setGroupVisible(R.id.own, false);
                    }
                    popupMenu.getMenu().findItem(R.id.set_ban).setVisible(!bVarT.e());
                    popupMenu.getMenu().findItem(R.id.clr_ban).setVisible(bVarT.e());
                    final x3 x3Var = this.P;
                    popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: s4.w3
                        @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return x3.a.V(this.f26822a, bVarT, x3Var, menuItem);
                        }
                    });
                    popupMenu.show();
                    return;
                }
            } else if (!this.P.f26844t) {
                return;
            }
            c6.i iVar = this.P.f26837d;
            if (iVar == null || !iVar.V0(this, view.getId())) {
                if (view.getId() == R.id.loc) {
                    d5.d dVarM = d5.d.m(jC);
                    if (dVarM == null) {
                        Toast.makeText(context, R.string.noLocationInformation, 0).show();
                        return;
                    } else {
                        FragmentShowActivity.i2(context, dVarM.f10599a, z4.m.e(), new c5.a().j(dVarM.f10611m).b());
                        return;
                    }
                }
                if (0 != T().c()) {
                    Intent intent = new Intent(this.D.b().getContext(), (Class<?>) ContactDetailsActivity.class);
                    intent.putExtra("com.dw.ht.intent.extras.UID", T().c());
                    v3.j.e(this.D.b().getContext(), intent);
                }
            }
        }

        public final void a0() {
        }
    }
}
