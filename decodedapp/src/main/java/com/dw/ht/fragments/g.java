package com.dw.ht.fragments;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.location.Location;
import android.text.TextUtils;
import android.text.format.DateUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.ht.fragments.g;
import d5.l;
import java.util.List;
import s3.c;
import v4.l1;
import v4.u;

/* JADX INFO: loaded from: classes.dex */
public class g extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c6.i f6251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f6252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public l1 f6253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f6254g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f6255h = 0;

    public class a extends RecyclerView.f0 implements View.OnClickListener, View.OnLongClickListener, View.OnCreateContextMenuListener, PopupMenu.OnMenuItemClickListener {
        public final View D;
        public TextView E;
        private final Context F;
        private ImageView G;
        private final TextView H;
        private final TextView I;
        private final ImageView J;
        private final View K;
        public d5.g L;
        private d5.g M;
        boolean N;
        private final Runnable O;
        private c.d P;
        private l.a Q;

        /* JADX INFO: renamed from: com.dw.ht.fragments.g$a$a, reason: collision with other inner class name */
        class RunnableC0089a implements Runnable {
            RunnableC0089a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                a.this.H.removeCallbacks(this);
                a aVar = a.this;
                d5.g gVar = aVar.L;
                if (gVar == null) {
                    return;
                }
                if (gVar.f10612n == 0) {
                    aVar.H.setVisibility(8);
                    return;
                }
                aVar.H.setVisibility(0);
                a.this.H.setText(DateUtils.getRelativeTimeSpanString(gVar.f10612n, System.currentTimeMillis(), 1000L));
                long jCurrentTimeMillis = (System.currentTimeMillis() - gVar.f10612n) / 1000;
                if (jCurrentTimeMillis < 60) {
                    a.this.H.postDelayed(this, 1000L);
                } else if (jCurrentTimeMillis < 3600) {
                    a.this.H.postDelayed(this, 30000L);
                } else {
                    a.this.H.postDelayed(this, 1800000L);
                }
            }
        }

        class b implements l.a {
            b() {
            }

            @Override // d5.l.a
            public void a(long j10, String str) {
                if (j10 != a.this.L.f10633q) {
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    str = a.this.L.f10599a;
                } else if (!TextUtils.isEmpty(a.this.L.f10599a) && a.this.L.f10599a.compareToIgnoreCase(str) != 0) {
                    str = a.this.L.f10599a + "(" + str + ")";
                }
                a.this.E.setText(str);
            }
        }

        public a(View view) {
            super(view);
            this.N = true;
            this.O = new RunnableC0089a();
            this.P = new c.d() { // from class: s4.z0
                @Override // s3.c.d
                public final void a(Object obj) {
                    g.a.O(this.f26866a, (Bitmap) obj);
                }
            };
            this.Q = new b();
            this.F = view.getContext();
            this.D = view;
            this.G = (ImageView) view.findViewById(R.id.icon);
            this.E = (TextView) view.findViewById(R.id.title);
            this.H = (TextView) view.findViewById(R.id.time);
            View viewFindViewById = view.findViewById(R.id.loc);
            this.K = viewFindViewById;
            this.I = (TextView) view.findViewById(R.id.location_info);
            this.J = (ImageView) view.findViewById(R.id.bearing);
            viewFindViewById.setOnClickListener(this);
            view.setOnClickListener(this);
        }

        public static /* synthetic */ void O(a aVar, Bitmap bitmap) {
            aVar.getClass();
            l lVarG = l.g();
            if (bitmap != null) {
                aVar.G.setImageBitmap(bitmap);
            }
            String strF = lVarG.f(aVar.L.f10613o);
            if (TextUtils.isEmpty(strF)) {
                strF = aVar.L.f10599a;
            } else if (!TextUtils.isEmpty(aVar.L.f10599a) && aVar.L.f10599a.compareToIgnoreCase(strF) != 0) {
                strF = aVar.L.f10599a + "(" + strF + ")";
            }
            aVar.E.setText(strF);
        }

        private void R(d5.g gVar) {
            u.e(this.F, gVar.f10599a, g.this.f6253f);
        }

        private void S(d5.g gVar) {
            u.g(this.F, gVar.f10599a, g.this.f6253f);
        }

        public void Q(d5.g gVar) {
            this.L = gVar;
            l lVarG = l.g();
            Bitmap bitmapC = o5.a.b().c(this.L.f10607i);
            if (bitmapC != null) {
                this.G.setImageBitmap(bitmapC);
            } else {
                this.G.setImageResource(R.drawable.ic_account_circle_24dp);
            }
            long j10 = gVar.f10613o;
            if (j10 != 0) {
                lVarG.i(j10, this.P, this.Q);
            } else {
                this.E.setText(gVar.f10599a);
            }
            this.O.run();
            if (this.N != g.this.f6254g) {
                boolean z10 = g.this.f6254g;
                this.N = z10;
                this.K.setVisibility(z10 ? 0 : 8);
            }
            T(o5.g.C(this.F));
        }

        public void T(Location location) {
            d5.g gVar = this.L;
            if (gVar == null) {
                return;
            }
            Location locationA = gVar.a();
            if (location == null || locationA == null) {
                this.I.setVisibility(8);
                this.J.setVisibility(8);
                return;
            }
            this.I.setVisibility(0);
            this.J.setVisibility(0);
            this.I.setText(o5.h.e(location.distanceTo(locationA)));
            float fBearingTo = location.bearingTo(locationA);
            this.J.setContentDescription(this.F.getString(R.string.bearing_f, Float.valueOf(fBearingTo)));
            float rotation = ((fBearingTo - g.this.f6255h) - this.J.getRotation()) % 360.0f;
            if (rotation > 180.0f) {
                rotation -= 360.0f;
            } else if (rotation < -180.0f) {
                rotation += 360.0f;
            }
            float rotation2 = this.J.getRotation() + rotation;
            ImageView imageView = this.J;
            ObjectAnimator duration = ObjectAnimator.ofFloat(imageView, "rotation", imageView.getRotation(), rotation2).setDuration(100L);
            duration.setAutoCancel(true);
            duration.start();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (this.L.f10613o != 0) {
                l.g().l(this.L.f10613o, this.P);
            }
            if (g.this.f6251d == null || !g.this.f6251d.V0(this, view.getId())) {
                int id2 = view.getId();
                if (id2 == R.id.call) {
                    R(this.L);
                } else {
                    if (id2 != R.id.check) {
                        return;
                    }
                    S(this.L);
                }
            }
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            new MenuInflater(view.getContext()).inflate(R.menu.contacts_context, contextMenu);
            com.dw.android.widget.a aVar = new com.dw.android.widget.a(view);
            d5.g gVar = this.M;
            if (gVar != null) {
                aVar.j(gVar.f10599a);
            }
            aVar.g(contextMenu);
            aVar.i(this);
            aVar.k();
            contextMenu.clear();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            this.M = this.L;
            PopupMenu popupMenu = new PopupMenu(view.getContext(), view);
            popupMenu.getMenuInflater().inflate(R.menu.contacts_context, popupMenu.getMenu());
            popupMenu.setOnMenuItemClickListener(this);
            popupMenu.show();
            return true;
        }

        @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.M == null || g.this.f6253f == null) {
                return false;
            }
            int itemId = menuItem.getItemId();
            if (itemId == R.id.call) {
                R(this.M);
                return true;
            }
            if (itemId != R.id.check) {
                return false;
            }
            S(this.M);
            return true;
        }
    }

    public g(c6.i iVar) {
        B(true);
        this.f6251d = iVar;
    }

    public d5.g G(int i10) {
        return (d5.g) this.f6252e.get(i10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void s(a aVar, int i10) {
        aVar.Q(G(i10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public a u(ViewGroup viewGroup, int i10) {
        return new a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.fragment_contact_list_item, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void z(a aVar) {
        super.z(aVar);
    }

    public void K(int i10) {
        this.f6255h = i10;
    }

    public void L(List list) {
        this.f6252e = list;
        k();
    }

    public void M(boolean z10) {
        if (this.f6254g == z10) {
            return;
        }
        this.f6254g = z10;
        k();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        List list = this.f6252e;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i10) {
        return ((d5.g) this.f6252e.get(i10)).f10611m;
    }
}
