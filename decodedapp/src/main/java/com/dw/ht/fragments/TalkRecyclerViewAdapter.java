package com.dw.ht.fragments;

import a6.u;
import android.content.Context;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
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
import android.widget.Toast;
import androidx.appcompat.widget.PopupMenu;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindDrawable;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnLongClick;
import butterknife.Unbinder;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.fragments.TalkRecyclerViewAdapter;
import com.dw.widget.ActionButton;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import z4.m;

/* JADX INFO: loaded from: classes.dex */
public class TalkRecyclerViewAdapter extends RecyclerView.h implements FastScrollRecyclerView.d {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static u f6209x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static int f6210y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final SimpleDateFormat f6211z = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c6.i f6213e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f6214f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c6.j f6215g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Cursor f6216h;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Handler f6219t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private boolean f6220u;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final o5.a f6212d = o5.a.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f6217r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f6218s = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final HashSet f6221v = new HashSet();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Runnable f6222w = new Runnable() { // from class: s4.a8
        @Override // java.lang.Runnable
        public final void run() {
            TalkRecyclerViewAdapter.D(this.f26365a);
        }
    };

    public class ViewHolder extends RecyclerView.f0 implements View.OnClickListener, View.OnLongClickListener, View.OnCreateContextMenuListener, PopupMenu.OnMenuItemClickListener {
        final View D;
        d5.g E;
        private d5.g F;
        private final Context G;
        private final boolean H;
        private long I;
        private d5.a J;
        private File K;

        @BindView
        ActionButton mActionView;

        @BindView
        ImageView mBearing;

        @BindView
        TextView mContentView;

        @BindView
        View mDiv1;

        @BindView
        View mDiv2;

        @BindView
        TextView mDurationView;

        @BindView
        ImageView mIconView;

        @BindView
        ImageView mImageView;

        @BindDrawable
        Drawable mLocDrawable;

        @BindView
        TextView mLocationInfo;

        @BindView
        TextView mNameView;

        @BindView
        View mNewView;

        @BindDrawable
        Drawable mPIL;

        @BindDrawable
        Drawable mPIL3;

        @BindDrawable
        Drawable mPIR;

        @BindDrawable
        Drawable mPIR3;

        @BindDrawable
        Drawable mSaveDrawable;

        @BindView
        TextView mTimeView;

        public ViewHolder(View view, boolean z10) {
            TextView textView;
            super(view);
            this.H = z10;
            this.G = view.getContext();
            this.D = view;
            ButterKnife.a(this, view);
            if (Cfg.u() <= 0 && z10 && (textView = this.mLocationInfo) != null) {
                textView.setVisibility(8);
                this.mBearing.setVisibility(8);
                this.mLocationInfo = null;
            }
            if (!Cfg.f5482d || Cfg.f5486f) {
                view.setOnLongClickListener(this);
                view.setOnCreateContextMenuListener(this);
            }
            int intrinsicWidth = this.mPIL.getIntrinsicWidth();
            int intrinsicHeight = this.mPIL.getIntrinsicHeight();
            this.mPIL.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.mPIR.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.mPIL3.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            this.mPIR3.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
        }

        public static /* synthetic */ void O(ViewHolder viewHolder) {
            if (viewHolder.I == viewHolder.E.f10611m) {
                viewHolder.mNewView.setVisibility(4);
                TalkRecyclerViewAdapter.this.U(viewHolder.E.f10611m);
            }
        }

        private void Q() {
            new l5.b(this.G).execute(this.F);
        }

        private void R() {
            new l5.f(this.G).execute(this.F);
        }

        private void T(d5.g gVar) {
            o5.f.d(this.G, gVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:90:0x02a9  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void P(d5.g r15) {
            /*
                Method dump skipped, instruction units count: 824
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.dw.ht.fragments.TalkRecyclerViewAdapter.ViewHolder.P(d5.g):void");
        }

        void S() {
            Location locationA;
            d5.a aVar = this.J;
            if (aVar != null) {
                o5.f.a(this.G, aVar);
                return;
            }
            if (this.E.e() && (locationA = this.E.a()) != null) {
                Context context = this.G;
                String str = this.E.f10599a;
                Class clsE = m.e();
                c5.a aVar2 = new c5.a();
                d5.g gVar = this.E;
                FragmentShowActivity.i2(context, str, clsE, aVar2.i(locationA, gVar.f10599a, gVar.f10607i).s(this.E.f10613o).b());
            }
        }

        public void U(boolean z10) {
            if (z10) {
                View view = this.mDiv1;
                if (view != null) {
                    view.setVisibility(0);
                }
                View view2 = this.mDiv2;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                this.mTimeView.setVisibility(0);
                this.mTimeView.setText(TalkRecyclerViewAdapter.this.f6220u ? TalkRecyclerViewAdapter.f6211z.format(new Date(this.E.f10612n)) : DateUtils.getRelativeDateTimeString(this.G, this.E.f10612n, 86400000L, 172800000L, 524289));
                return;
            }
            this.mTimeView.setVisibility(8);
            View view3 = this.mDiv1;
            if (view3 != null) {
                view3.setVisibility(8);
            }
            View view4 = this.mDiv2;
            if (view4 != null) {
                view4.setVisibility(8);
            }
        }

        @Override // android.view.View.OnClickListener
        @OnClick
        public void onClick(View view) {
            TalkRecyclerViewAdapter.this.U(this.E.f10611m);
            if (TalkRecyclerViewAdapter.this.f6213e.V0(new a(k(), this.E), view.getId())) {
                return;
            }
            int id2 = view.getId();
            if (id2 == R.id.action) {
                S();
            } else {
                if (id2 != R.id.icon) {
                    return;
                }
                T(this.E);
            }
        }

        @Override // android.view.View.OnCreateContextMenuListener
        public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
            if (this.F == null) {
                d5.g gVar = this.E;
                if (gVar == null) {
                    return;
                } else {
                    this.F = gVar;
                }
            }
            new MenuInflater(view.getContext()).inflate(R.menu.session_c, contextMenu);
            if (TextUtils.isEmpty(this.F.f10610l)) {
                contextMenu.findItem(R.id.copy).setVisible(false);
            }
            d5.g gVar2 = this.F;
            if (gVar2.f10634r == 0 || !Cfg.S(gVar2.f10611m)) {
                contextMenu.setGroupVisible(R.id.audio, false);
            }
            contextMenu.setGroupVisible(R.id.picture, this.K != null);
            contextMenu.findItem(R.id.send_message).setVisible(!TextUtils.isEmpty(this.F.f10599a));
            com.dw.android.widget.a aVar = new com.dw.android.widget.a(view);
            aVar.j(view.getContext().getString(R.string.more));
            aVar.g(contextMenu);
            aVar.i(this);
            aVar.k();
            contextMenu.clear();
        }

        @Override // android.view.View.OnLongClickListener
        @OnLongClick
        public boolean onLongClick(View view) {
            if (Cfg.f5482d && !Cfg.f5486f) {
                return true;
            }
            if (TalkRecyclerViewAdapter.this.f6215g != null && TalkRecyclerViewAdapter.this.f6215g.g(new a(k(), this.E), 0)) {
                return true;
            }
            this.F = this.E;
            view.showContextMenu();
            return true;
        }

        @OnLongClick
        public boolean onLongIconClick(View view) {
            if (Cfg.f5482d) {
                return true;
            }
            if (view.getId() != R.id.icon) {
                return false;
            }
            T(this.E);
            return true;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (this.F == null) {
                return false;
            }
            switch (menuItem.getItemId()) {
                case R.id.analyze /* 2131296402 */:
                    Bundle bundle = new Bundle();
                    bundle.putLong("SESSION_ID", this.F.f10611m);
                    Context context = this.G;
                    FragmentShowActivity.i2(context, context.getString(R.string.analyze), s4.m.class, bundle);
                    return true;
                case R.id.copy /* 2131296590 */:
                    a6.e.a(this.G, this.F.f10610l, null, null);
                    Toast.makeText(this.G, this.G.getString(R.string.toast_text_copied), 0).show();
                    return true;
                case R.id.del /* 2131296620 */:
                    this.F.g(this.G.getContentResolver());
                    return true;
                case R.id.dtmf_decode /* 2131296685 */:
                    Q();
                    return true;
                case R.id.forward /* 2131296772 */:
                    o5.f.e(this.G, this.K);
                    return false;
                case R.id.morse_decode /* 2131297026 */:
                    R();
                    return true;
                case R.id.save /* 2131297304 */:
                    TalkRecyclerViewAdapter.this.f6213e.V0(new a(k(), this.F), R.id.save);
                    return true;
                case R.id.send_message /* 2131297357 */:
                    T(this.F);
                    return true;
                case R.id.share /* 2131297371 */:
                    o5.i.d(this.G, this.K);
                    return true;
                default:
                    return false;
            }
        }
    }

    public class ViewHolder_ViewBinding implements Unbinder {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private ViewHolder f6223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private View f6224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private View f6225d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private View f6226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private View f6227f;

        class a extends t1.b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ViewHolder f6228d;

            a(ViewHolder viewHolder) {
                this.f6228d = viewHolder;
            }

            @Override // t1.b
            public void b(View view) {
                this.f6228d.onClick(view);
            }
        }

        class b implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewHolder f6230a;

            b(ViewHolder viewHolder) {
                this.f6230a = viewHolder;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return this.f6230a.onLongIconClick(view);
            }
        }

        class c extends t1.b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ViewHolder f6232d;

            c(ViewHolder viewHolder) {
                this.f6232d = viewHolder;
            }

            @Override // t1.b
            public void b(View view) {
                this.f6232d.onClick(view);
            }
        }

        class d implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewHolder f6234a;

            d(ViewHolder viewHolder) {
                this.f6234a = viewHolder;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return this.f6234a.onLongClick(view);
            }
        }

        class e extends t1.b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ViewHolder f6236d;

            e(ViewHolder viewHolder) {
                this.f6236d = viewHolder;
            }

            @Override // t1.b
            public void b(View view) {
                this.f6236d.onClick(view);
            }
        }

        class f extends t1.b {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ViewHolder f6238d;

            f(ViewHolder viewHolder) {
                this.f6238d = viewHolder;
            }

            @Override // t1.b
            public void b(View view) {
                this.f6238d.onClick(view);
            }
        }

        class g implements View.OnLongClickListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ViewHolder f6240a;

            g(ViewHolder viewHolder) {
                this.f6240a = viewHolder;
            }

            @Override // android.view.View.OnLongClickListener
            public boolean onLongClick(View view) {
                return this.f6240a.onLongClick(view);
            }
        }

        public ViewHolder_ViewBinding(ViewHolder viewHolder, View view) {
            this.f6223b = viewHolder;
            View viewC = t1.c.c(view, R.id.icon, "field 'mIconView', method 'onClick', and method 'onLongIconClick'");
            viewHolder.mIconView = (ImageView) t1.c.a(viewC, R.id.icon, "field 'mIconView'", ImageView.class);
            this.f6224c = viewC;
            viewC.setOnClickListener(new a(viewHolder));
            viewC.setOnLongClickListener(new b(viewHolder));
            viewHolder.mDurationView = (TextView) t1.c.d(view, R.id.duration, "field 'mDurationView'", TextView.class);
            View viewC2 = t1.c.c(view, R.id.content, "field 'mContentView', method 'onClick', and method 'onLongClick'");
            viewHolder.mContentView = (TextView) t1.c.a(viewC2, R.id.content, "field 'mContentView'", TextView.class);
            this.f6225d = viewC2;
            viewC2.setOnClickListener(new c(viewHolder));
            viewC2.setOnLongClickListener(new d(viewHolder));
            viewHolder.mImageView = (ImageView) t1.c.d(view, R.id.image, "field 'mImageView'", ImageView.class);
            viewHolder.mTimeView = (TextView) t1.c.d(view, R.id.time, "field 'mTimeView'", TextView.class);
            viewHolder.mNameView = (TextView) t1.c.d(view, R.id.name, "field 'mNameView'", TextView.class);
            viewHolder.mNewView = t1.c.c(view, R.id._new, "field 'mNewView'");
            viewHolder.mDiv1 = view.findViewById(R.id.div1);
            viewHolder.mDiv2 = view.findViewById(R.id.div2);
            viewHolder.mLocationInfo = (TextView) t1.c.b(view, R.id.location_info, "field 'mLocationInfo'", TextView.class);
            viewHolder.mBearing = (ImageView) t1.c.b(view, R.id.bearing, "field 'mBearing'", ImageView.class);
            View viewC3 = t1.c.c(view, R.id.action, "field 'mActionView' and method 'onClick'");
            viewHolder.mActionView = (ActionButton) t1.c.a(viewC3, R.id.action, "field 'mActionView'", ActionButton.class);
            this.f6226e = viewC3;
            viewC3.setOnClickListener(new e(viewHolder));
            View viewC4 = t1.c.c(view, R.id.content_bar, "method 'onClick' and method 'onLongClick'");
            this.f6227f = viewC4;
            viewC4.setOnClickListener(new f(viewHolder));
            viewC4.setOnLongClickListener(new g(viewHolder));
            Context context = view.getContext();
            viewHolder.mPIL = b0.b.d(context, R.drawable.ic_play_indicator_l);
            viewHolder.mPIR = b0.b.d(context, R.drawable.ic_play_indicator_r);
            viewHolder.mPIL3 = b0.b.d(context, R.drawable.ic_volume_up_24dp);
            viewHolder.mPIR3 = b0.b.d(context, R.drawable.ic_play_i_r3);
            viewHolder.mLocDrawable = b0.b.d(context, R.drawable.ic_place_24dp);
            viewHolder.mSaveDrawable = b0.b.d(context, R.drawable.ic_save_24dp);
        }
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f6242a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        d5.g f6243b;

        public a(int i10, d5.g gVar) {
            this.f6242a = i10;
            this.f6243b = gVar;
        }
    }

    public TalkRecyclerViewAdapter(Context context, c6.i iVar, c6.j jVar) {
        this.f6214f = context;
        B(true);
        this.f6219t = new Handler();
        this.f6213e = iVar;
        this.f6215g = jVar;
    }

    public static /* synthetic */ void D(TalkRecyclerViewAdapter talkRecyclerViewAdapter) {
        if (talkRecyclerViewAdapter.f6221v.size() == 0) {
            return;
        }
        d5.g.n(d4.a.e((Long[]) talkRecyclerViewAdapter.f6221v.toArray(new Long[0])));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean T(long j10) {
        u uVar = f6209x;
        if (uVar == null) {
            return false;
        }
        return uVar.d(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void U(long j10) {
        this.f6221v.add(Long.valueOf(j10));
        this.f6219t.removeCallbacks(this.f6222w);
        this.f6219t.postDelayed(this.f6222w, 3000L);
    }

    public void M() {
        f6209x = null;
        f6210y = 0;
        k();
    }

    public d5.g N(int i10) {
        Cursor cursor = this.f6216h;
        if (cursor != null && cursor.moveToPosition(i10)) {
            return new d5.g(this.f6216h);
        }
        throw new IllegalStateException("can not get item at:" + i10);
    }

    public long O(int i10) {
        Cursor cursor = this.f6216h;
        if (cursor == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f6216h.getLong(1);
    }

    public int P() {
        u uVar = f6209x;
        if (uVar == null) {
            return 0;
        }
        return uVar.h();
    }

    public long[] Q() {
        u uVar = f6209x;
        if (uVar == null) {
            return null;
        }
        return uVar.f();
    }

    public int R() {
        return f6210y;
    }

    public boolean S(long j10) {
        return this.f6221v.contains(Long.valueOf(j10));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
    public void s(ViewHolder viewHolder, int i10) {
        d5.g gVarN = N(i10);
        viewHolder.P(gVarN);
        boolean z10 = this.f6220u;
        if (!z10 && i10 > 0) {
            long jO = O(i10 - 1);
            long j10 = gVarN.f10612n;
            if (j10 - jO > 300000 || j10 / 900000 != jO / 900000) {
                z10 = true;
            }
        }
        viewHolder.U(z10);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public ViewHolder u(ViewGroup viewGroup, int i10) {
        return new ViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(i10 == 0 ? R.layout.fragment_session_l : R.layout.fragment_session_r, viewGroup, false), i10 != 0);
    }

    public void X() {
        if (f6209x == null) {
            f6209x = new u(f());
        }
        for (int i10 = 0; i10 < f(); i10++) {
            d5.g gVarN = N(i10);
            if (!T(gVarN.f10611m)) {
                f6209x.g(gVarN.f10611m);
                f6210y += gVarN.f10634r;
            }
        }
        k();
    }

    public void Y(boolean z10) {
        this.f6220u = z10;
    }

    public void Z(int i10, long j10) {
        if (this.f6217r == j10) {
            return;
        }
        this.f6217r = j10;
        int i11 = this.f6218s;
        if (i11 >= 0) {
            l(i11);
        }
        this.f6218s = i10;
        if (i10 >= 0) {
            l(i10);
        }
        U(j10);
    }

    @Override // com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView.d
    public String a(int i10) {
        return DateUtils.getRelativeDateTimeString(this.f6214f, O(i10), 86400000L, 172800000L, 524289).toString();
    }

    public void a0(long j10) {
        if (j10 != this.f6217r) {
            return;
        }
        Z(-1, -1L);
    }

    public void b0(Cursor cursor) {
        this.f6216h = cursor;
        k();
    }

    public boolean c0(long j10, int i10) {
        if (f6209x == null) {
            f6209x = new u();
        }
        boolean zI = f6209x.i(j10);
        if (zI) {
            f6210y += i10;
        } else {
            f6210y -= i10;
        }
        k();
        return zI;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int f() {
        Cursor cursor = this.f6216h;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long g(int i10) {
        Cursor cursor = this.f6216h;
        if (cursor == null || !cursor.moveToPosition(i10)) {
            return 0L;
        }
        return this.f6216h.getLong(0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int h(int i10) {
        Cursor cursor = this.f6216h;
        return (cursor == null || !cursor.moveToPosition(i10) || this.f6216h.getInt(4) == 1) ? 0 : 1;
    }
}
