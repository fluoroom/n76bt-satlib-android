package com.dw.ht.fragments;

import a6.q;
import a6.w;
import android.content.ContentResolver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Toast;
import androidx.appcompat.app.c;
import androidx.appcompat.view.b;
import androidx.loader.app.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.android.widget.CSFrameLayout;
import com.dw.ht.Cfg;
import com.dw.ht.activitys.MessageListActivity;
import com.dw.ht.activitys.PictureSendActivity;
import com.dw.ht.fragments.TalkListFragment;
import com.dw.ht.fragments.TalkRecyclerViewAdapter;
import com.dw.ht.o;
import com.dw.ht.provider.a;
import com.dw.ht.q;
import com.dw.sbc.SbcDecoder;
import com.dw.util.concurrent.a;
import com.dw.widget.LinearLayoutEx;
import com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import d5.g;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import s4.m;
import u4.d0;
import v3.e0;
import v4.c0;
import v4.i0;
import v4.l1;
import v4.m1;
import v4.n0;
import v4.n1;
import xdsopl.robot36.ImageView;

/* JADX INFO: loaded from: classes.dex */
public class TalkListFragment extends DeviceFragment implements a.InterfaceC0037a, c6.i, a.InterfaceC0105a, c6.j {
    private TalkRecyclerViewAdapter P0;
    private d Q0;
    private RecyclerView R0;
    private e S0;
    private LinearLayoutManager T0;
    private c6.i V0;
    private String W0;
    private u3.h X0;
    private View Y0;
    private ImageView Z0;

    /* JADX INFO: renamed from: a1 */
    private boolean f6193a1;

    /* JADX INFO: renamed from: c1 */
    private View f6195c1;

    /* JADX INFO: renamed from: d1 */
    private long[] f6196d1;
    private boolean U0 = true;

    /* JADX INFO: renamed from: b1 */
    private g.b f6194b1 = new g.b();

    class a extends RecyclerView.u {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void a(RecyclerView recyclerView, int i10) {
            super.a(recyclerView, i10);
            if (i10 == 0) {
                int iF2 = TalkListFragment.this.T0.f2();
                int iE = TalkListFragment.this.T0.e();
                TalkListFragment.this.U0 = iE - 1 == iF2;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.u
        public void b(RecyclerView recyclerView, int i10, int i11) {
            super.b(recyclerView, i10, i11);
        }
    }

    private static class b extends u3.h implements FastScrollRecyclerView.d {

        /* JADX INFO: renamed from: g */
        private final int f6198g;

        public b(RecyclerView.h hVar, int i10) {
            super(hVar);
            this.f6198g = i10;
        }

        @Override // com.simplecityapps.recyclerview_fastscroll.views.FastScrollRecyclerView.d
        public String a(int i10) {
            if (I(i10) || H(i10)) {
                return "";
            }
            Object obj = this.f28026f;
            return obj instanceof FastScrollRecyclerView.d ? ((FastScrollRecyclerView.d) obj).a(i10 - F()) : "";
        }
    }

    private class c implements b.a {
        private c() {
        }

        @Override // androidx.appcompat.view.b.a
        public void a(androidx.appcompat.view.b bVar) {
        }

        @Override // androidx.appcompat.view.b.a
        public boolean b(androidx.appcompat.view.b bVar, Menu menu) {
            return true;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean c(androidx.appcompat.view.b bVar, Menu menu) {
            menu.clear();
            Context contextK1 = TalkListFragment.this.k1();
            if (contextK1 == null || TalkListFragment.this.P0.P() == 0) {
                return false;
            }
            bVar.setTitle(String.valueOf(TalkListFragment.this.P0.P()));
            if (TalkListFragment.this.P0.P() > 1) {
                bVar.getMenuInflater().inflate(R.menu.talk_list_mult_select, menu);
                menu.findItem(R.id.save).setVisible(TalkListFragment.this.P0.R() > 0);
                return true;
            }
            long j10 = TalkListFragment.this.P0.Q()[0];
            d5.g gVarJ = d5.g.j(contextK1.getContentResolver(), j10);
            if (gVarJ == null) {
                return false;
            }
            bVar.getMenuInflater().inflate(R.menu.session_c, menu);
            File fileN = Cfg.n(j10);
            if (gVarJ.f10634r != 0 && fileN != null && fileN.isFile()) {
                z = true;
            }
            menu.setGroupVisible(R.id.audio, z);
            menu.setGroupVisible(R.id.picture, Cfg.T(j10));
            menu.findItem(R.id.copy).setVisible(!w.b(gVarJ.f10610l));
            menu.findItem(R.id.send_message).setVisible(!w.b(gVarJ.f10599a));
            return true;
        }

        @Override // androidx.appcompat.view.b.a
        public boolean d(androidx.appcompat.view.b bVar, MenuItem menuItem) {
            long[] jArrQ;
            Context contextK1 = TalkListFragment.this.k1();
            if (contextK1 == null || (jArrQ = TalkListFragment.this.P0.Q()) == null || jArrQ.length < 1) {
                return false;
            }
            switch (menuItem.getItemId()) {
                case R.id.analyze /* 2131296402 */:
                    Bundle bundle = new Bundle();
                    bundle.putLong("SESSION_ID", jArrQ[0]);
                    FragmentShowActivity.i2(TalkListFragment.this.k1(), TalkListFragment.this.N1(R.string.analyze), m.class, bundle);
                    break;
                case R.id.copy /* 2131296590 */:
                    a6.e.a(contextK1, d5.g.j(contextK1.getContentResolver(), jArrQ[0]).f10610l, null, null);
                    Toast.makeText(contextK1, contextK1.getString(R.string.toast_text_copied), 0).show();
                    break;
                case R.id.del /* 2131296620 */:
                    TalkListFragment.this.new g(contextK1, jArrQ).doInBackground(new Void[0]);
                    break;
                case R.id.dtmf_decode /* 2131296685 */:
                    d5.g gVarJ = d5.g.j(contextK1.getContentResolver(), jArrQ[0]);
                    if (gVarJ != null) {
                        new l5.b(contextK1).execute(gVarJ);
                    }
                    break;
                case R.id.forward /* 2131296772 */:
                    File fileX = Cfg.x(jArrQ[0]);
                    if (fileX != null) {
                        o5.f.e(contextK1, fileX);
                    }
                    break;
                case R.id.morse_decode /* 2131297026 */:
                    d5.g gVarJ2 = d5.g.j(contextK1.getContentResolver(), jArrQ[0]);
                    if (gVarJ2 != null) {
                        new l5.f(contextK1).execute(gVarJ2);
                    }
                    break;
                case R.id.save /* 2131297304 */:
                    TalkListFragment.this.z5(jArrQ);
                    break;
                case R.id.select_all /* 2131297343 */:
                    TalkListFragment.this.P0.X();
                    bVar.invalidate();
                    return true;
                case R.id.send_message /* 2131297357 */:
                    o5.f.d(contextK1, d5.g.j(contextK1.getContentResolver(), jArrQ[0]));
                    break;
                case R.id.share /* 2131297371 */:
                    File fileX2 = Cfg.x(jArrQ[0]);
                    if (fileX2 != null) {
                        o5.i.d(contextK1, fileX2);
                    }
                    break;
                default:
                    return false;
            }
            TalkListFragment.this.F4();
            return true;
        }

        /* synthetic */ c(TalkListFragment talkListFragment, a aVar) {
            this();
        }
    }

    public static class d extends m5.d {
        private int A;
        private x3.a B;

        /* JADX INFO: renamed from: x */
        private final long f6200x;

        /* JADX INFO: renamed from: y */
        private final int f6201y;

        /* JADX INFO: renamed from: z */
        private final ContentResolver f6202z;

        public d(ContentResolver contentResolver, long j10, int i10) {
            super("");
            this.A = 32000;
            this.f6200x = j10;
            this.f6201y = i10;
            this.f6202z = contentResolver;
        }

        private void B(AudioTrack audioTrack) {
            int iP;
            int iC;
            short[] sArrB;
            o.b bVar = this.f21728v;
            short[] sArr = new short[2880];
            int i10 = 0;
            while (!isCancelled() && (iP = this.B.P(sArr, 0, 2880)) > 0) {
                if (bVar != null) {
                    o.b.a aVarB = bVar.b(sArr, 0, iP);
                    iP = aVarB.a();
                    iC = aVarB.c();
                    sArrB = aVarB.b();
                } else {
                    iC = i10;
                    sArrB = sArr;
                }
                audioTrack.write(sArrB, iC, iP);
                i10 = iC;
            }
            audioTrack.write(new short[6400], 0, 6400);
            try {
                Thread.sleep(200L);
            } catch (InterruptedException unused) {
            }
        }

        @Override // m5.d, com.dw.util.concurrent.a
        protected boolean onInit() {
            File fileN = Cfg.n(this.f6200x);
            if (fileN != null && fileN.isFile()) {
                try {
                    x3.a aVar = new x3.a(fileN);
                    this.B = aVar;
                    this.A = aVar.j();
                } catch (IOException unused) {
                    return false;
                }
            }
            return super.onInit();
        }

        @Override // m5.d, com.dw.util.concurrent.a
        protected void onStop() {
            a6.m.b(this.B);
            super.onStop();
        }

        @Override // m5.d
        protected boolean u(AudioTrack audioTrack) {
            ii.a aVarA;
            i0 i0VarB = i0.F.b();
            if (i0VarB != null && i0VarB.F().l() && i0VarB.n()) {
                y1.a aVarF = i0VarB.F();
                if (this.B != null && aVarF.m()) {
                    o5.d.b();
                    do {
                        try {
                            try {
                                aVarA = this.B.a();
                                if (aVarA == null) {
                                    break;
                                }
                            } catch (IOException e10) {
                                e10.printStackTrace();
                            }
                        } finally {
                            o5.d.c();
                            aVarF.h0();
                        }
                    } while (aVarF.I(aVarA.a()));
                    return false;
                }
            }
            try {
                audioTrack.play();
            } catch (IllegalStateException e11) {
                e11.printStackTrace();
            }
            if (this.B != null) {
                o5.d.b();
                try {
                    try {
                        B(audioTrack);
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                    return false;
                } finally {
                }
            }
            byte[] bArrL = d5.g.l(this.f6202z, this.f6200x);
            if (bArrL == null || isCancelled()) {
                return false;
            }
            o5.d.b();
            try {
                SbcDecoder sbcDecoder = new SbcDecoder(false);
                try {
                    byte[] bArr = new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT];
                    int iB = sbcDecoder.b(bArrL, 0, bArrL.length, bArr);
                    int iD = 0;
                    while (iB > 0) {
                        audioTrack.write(bArr, 0, iB);
                        iD += sbcDecoder.d();
                        if (iD >= bArrL.length) {
                            break;
                        }
                        iB = sbcDecoder.b(bArrL, iD, bArrL.length - iD, bArr);
                    }
                    sbcDecoder.e();
                    audioTrack.write(new short[6400], 0, 6400);
                    return false;
                } catch (Throwable th2) {
                    sbcDecoder.e();
                    throw th2;
                }
            } finally {
            }
        }

        @Override // m5.d
        protected int y() {
            return this.A;
        }
    }

    public static class e extends g1.b {

        /* JADX INFO: renamed from: w */
        g4.f f6203w;

        public e(Context context, g4.f fVar) {
            super(context, a.d.f6668a, g.c.f10650a, fVar.n(), fVar.k(), "date");
        }

        public void V(g4.f fVar) {
            if (q.d(this.f6203w, fVar)) {
                return;
            }
            this.f6203w = fVar;
            R(fVar.n());
            S(fVar.k());
            p();
        }
    }

    public static class f extends g4.c {

        /* JADX INFO: renamed from: e */
        private final boolean f6204e;

        public f(Context context, g1.b bVar, boolean z10) {
            super(context, bVar);
            this.f6204e = z10;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a */
        public Void doInBackground(Void... voidArr) {
            File fileI;
            for (long j10 : g4.d.b(this.f13509a.query(this.f13510b, new String[]{"_id"}, this.f13511c, this.f13512d, null), 0)) {
                File fileN = Cfg.n(j10);
                if (fileN != null && fileN.isFile()) {
                    fileN.delete();
                }
                if (this.f6204e && (fileI = Cfg.I(j10)) != null && fileI.isFile()) {
                    fileI.delete();
                }
            }
            return super.doInBackground(new Void[0]);
        }
    }

    public class g extends AsyncTask {

        /* JADX INFO: renamed from: a */
        private final boolean f6205a = true;

        /* JADX INFO: renamed from: b */
        protected final ContentResolver f6206b;

        /* JADX INFO: renamed from: c */
        protected final long[] f6207c;

        public g(Context context, long[] jArr) {
            this.f6206b = context.getContentResolver();
            this.f6207c = jArr;
        }

        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: a */
        public Void doInBackground(Void... voidArr) {
            d5.g.h(this.f6206b, this.f6207c);
            for (long j10 : this.f6207c) {
                File fileN = Cfg.n(j10);
                if (fileN != null && fileN.isFile()) {
                    fileN.delete();
                }
                File fileI = Cfg.I(j10);
                if (fileI != null && fileI.isFile()) {
                    fileI.delete();
                }
            }
            return null;
        }
    }

    public static TalkListFragment A5(long j10) {
        TalkListFragment talkListFragment = new TalkListFragment();
        talkListFragment.E3(DeviceFragment.b5(j10));
        return talkListFragment;
    }

    public static TalkListFragment B5(long j10, String str, long j11) {
        TalkListFragment talkListFragment = new TalkListFragment();
        Bundle bundleB5 = DeviceFragment.b5(j10);
        bundleB5.putString("com.dw.ht.intent.extras.FROM", str);
        bundleB5.putLong("com.dw.ht.intent.extras.UID", j11);
        talkListFragment.E3(bundleB5);
        return talkListFragment;
    }

    private kc.b F5(final long[] jArr, final Uri uri) {
        final Context contextK1 = k1();
        if (contextK1 == null || jArr.length == 0) {
            return null;
        }
        return hc.g.c(Boolean.TRUE).e(zc.a.b()).d(new mc.d() { // from class: s4.u7
            @Override // mc.d
            public final Object apply(Object obj) {
                return TalkListFragment.n5(contextK1, jArr, uri, (Boolean) obj);
            }
        }).e(jc.a.a()).i(new mc.c() { // from class: s4.v7
            @Override // mc.c
            public final void accept(Object obj) {
                TalkListFragment.q5((String) obj);
            }
        }, new mc.c() { // from class: s4.w7
            @Override // mc.c
            public final void accept(Object obj) {
                TalkListFragment.p5(this.f26828a, (Throwable) obj);
            }
        });
    }

    private void H5(boolean z10) {
        if (z10 == this.f6193a1) {
            return;
        }
        this.f6193a1 = z10;
        if (!z10) {
            this.X0.J(this.Y0);
            return;
        }
        this.X0.D(0, this.Y0);
        if (this.U0) {
            this.R0.v1(this.X0.f() - 1);
        }
    }

    private void I5(int i10, d5.g gVar) {
        d dVar = this.Q0;
        if (dVar != null) {
            dVar.t();
            if (((Long) this.Q0.getTag()).longValue() == gVar.f10611m) {
                this.Q0 = null;
                return;
            }
        }
        this.P0.Z(i10, gVar.f10611m);
        d dVar2 = new d(k1().getContentResolver(), gVar.f10611m, i10);
        this.Q0 = dVar2;
        dVar2.setTag(Long.valueOf(gVar.f10611m));
        this.Q0.addOnStopListener(this);
        this.Q0.start();
    }

    private void J5(e eVar) {
        if (eVar != null) {
            eVar.V(y5());
        }
    }

    public static /* synthetic */ String n5(Context context, long[] jArr, Uri uri, Boolean bool) throws Throwable {
        x3.b bVar;
        Throwable th2;
        OutputStream outputStreamOpenOutputStream;
        ContentResolver contentResolver = context.getContentResolver();
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j10 : jArr) {
            File fileN = Cfg.n(j10);
            if (fileN != null && fileN.isFile()) {
                arrayList.add(fileN);
            }
        }
        if (arrayList.isEmpty()) {
            return "";
        }
        try {
            outputStreamOpenOutputStream = contentResolver.openOutputStream(uri);
            try {
                bVar = new x3.b(outputStreamOpenOutputStream, 1, Cfg.f5494j);
            } catch (Throwable th3) {
                bVar = null;
                th2 = th3;
            }
        } catch (Throwable th4) {
            bVar = null;
            th2 = th4;
            outputStreamOpenOutputStream = null;
        }
        try {
            bVar.c();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ii.b bVar2 = new ii.b(new hi.d(new FileInputStream((File) it.next())));
                while (true) {
                    try {
                        ii.a aVarC = bVar2.c();
                        if (aVarC != null) {
                            aVarC.e(-1L);
                            bVar.a(aVarC);
                        }
                    } finally {
                    }
                }
                bVar2.close();
            }
            a6.m.b(bVar);
            a6.m.b(outputStreamOpenOutputStream);
            return "";
        } catch (Throwable th5) {
            th2 = th5;
            a6.m.b(bVar);
            a6.m.b(outputStreamOpenOutputStream);
            throw th2;
        }
    }

    public static /* synthetic */ void o5(TalkListFragment talkListFragment, View view, int i10, int i11, int i12, int i13) {
        if (talkListFragment.U0) {
            talkListFragment.R0.v1(talkListFragment.T0.e() - 1);
        }
    }

    public static /* synthetic */ void p5(TalkListFragment talkListFragment, Throwable th2) {
        talkListFragment.getClass();
        th2.printStackTrace();
        Toast.makeText(talkListFragment.k1(), th2.getLocalizedMessage(), 0).show();
    }

    public static /* synthetic */ void q5(String str) {
    }

    public static /* synthetic */ void r5(TalkListFragment talkListFragment, DialogInterface dialogInterface, int i10) {
        talkListFragment.getClass();
        new f(talkListFragment.k1(), talkListFragment.S0, ((CheckBox) ((androidx.appcompat.app.c) dialogInterface).findViewById(R.id.delete_pic)).isChecked()).execute(new Void[0]);
    }

    public static /* synthetic */ void s5(TalkListFragment talkListFragment, com.dw.util.concurrent.a aVar) {
        talkListFragment.getClass();
        talkListFragment.P0.a0(((Long) aVar.getTag()).longValue());
        d dVar = (d) aVar;
        if (aVar == talkListFragment.Q0) {
            talkListFragment.Q0 = null;
            int i10 = dVar.f6201y + 1;
            if (talkListFragment.P0.f() > i10) {
                d5.g gVarN = talkListFragment.P0.N(i10);
                if (gVarN.f10636t || gVarN.f10614p != 1 || gVarN.f10634r == 0 || talkListFragment.P0.S(gVarN.f10611m)) {
                    return;
                }
                talkListFragment.I5(i10, gVarN);
                if (talkListFragment.T0.f2() == dVar.f6201y) {
                    talkListFragment.R0.v1(i10);
                }
            }
        }
    }

    private g4.f y5() {
        this.f6194b1.f10643c.clear();
        this.f6194b1.f10642b = 0L;
        l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            this.f6194b1.f10642b = l1VarY4.q();
            if (l1VarY4 instanceof c0) {
                Iterator it = ((c0) l1VarY4).Y1().iterator();
                while (it.hasNext()) {
                    this.f6194b1.f10643c.add(Long.valueOf(((Long) it.next()).longValue() + 28147497671065500L));
                }
            }
        }
        this.f6194b1.f10644d = getQueryText();
        g.b bVar = this.f6194b1;
        bVar.f10648h = true;
        return bVar.a();
    }

    public void z5(long[] jArr) {
        d5.g gVarJ;
        this.f6196d1 = jArr;
        if (jArr.length >= 1 && (gVarJ = d5.g.j(k1().getContentResolver(), jArr[0])) != null) {
            String str = gVarJ.f10599a;
            String strG = a6.m.g(gVarJ.f10612n);
            if (!w.b(str)) {
                strG = str + "-" + strG;
            }
            Intent intent = new Intent("android.intent.action.CREATE_DOCUMENT");
            intent.setType("audio/ogg");
            intent.putExtra("android.intent.extra.TITLE", strG + ".opus");
            intent.addFlags(2);
            startActivityForResult(intent, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x004e  */
    @Override // c6.i
    /* JADX INFO: renamed from: C5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean V0(com.dw.ht.fragments.TalkRecyclerViewAdapter.a r8, int r9) {
        /*
            Method dump skipped, instruction units count: 272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dw.ht.fragments.TalkListFragment.V0(com.dw.ht.fragments.TalkRecyclerViewAdapter$a, int):boolean");
    }

    @Override // v3.f0
    protected void D4(String str) {
        super.D4(str);
        J5(this.S0);
    }

    @Override // c6.j
    /* JADX INFO: renamed from: D5 */
    public boolean g(TalkRecyclerViewAdapter.a aVar, int i10) {
        if (Cfg.f5482d && !Cfg.f5486f) {
            return true;
        }
        if (H4()) {
            return V0(aVar, i10);
        }
        if (((androidx.appcompat.app.d) e1()) == null) {
            return false;
        }
        TalkRecyclerViewAdapter talkRecyclerViewAdapter = this.P0;
        d5.g gVar = aVar.f6243b;
        talkRecyclerViewAdapter.c0(gVar.f10611m, gVar.f10634r);
        L4(new c(this, null));
        return true;
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    /* JADX INFO: renamed from: E5 */
    public void K(g1.c cVar, Cursor cursor) {
        l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            TalkRecyclerViewAdapter talkRecyclerViewAdapter = this.P0;
            if (l1VarY4.q() != 281474976710657L) {
                Cfg.u();
            }
            talkRecyclerViewAdapter.Y(false);
        }
        this.P0.b0(cursor);
        if (this.U0 && cursor != null) {
            this.R0.v1(this.X0.f() - 1);
        }
        if (cursor == null || cursor.getCount() == 0) {
            this.f6195c1.setVisibility(0);
        } else {
            this.f6195c1.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.o
    public boolean F2(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == R.id.clear_history) {
            if (this.S0 == null) {
                return true;
            }
            new c.a(k1()).A(R.layout.delete_history_dialog_view).t(R.string.yes, new DialogInterface.OnClickListener() { // from class: s4.z7
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i10) {
                    TalkListFragment.r5(this.f26873a, dialogInterface, i10);
                }
            }).m(android.R.string.cancel, null).C();
            return true;
        }
        if (itemId != R.id.save_audio) {
            switch (itemId) {
                case R.id.send_loc /* 2131297356 */:
                    mi.c.e().m(q.a.f6671a.d());
                    break;
                case R.id.send_message /* 2131297357 */:
                    MessageListActivity.INSTANCE.a(k1(), null, m1.BSS, 0L);
                    break;
                case R.id.send_pic /* 2131297358 */:
                    Intent intent = new Intent(k1(), (Class<?>) PictureSendActivity.class);
                    intent.putExtra("com.dw.ht.intent.extras.DEV_ID", V4());
                    O3(intent);
                    break;
            }
        } else {
            if (Cfg.f5504o == null) {
                Toast.makeText(k1(), "保存语音记录需要先插入外部储存卡", 1).show();
                return true;
            }
            Cfg.Settings settingsO = Cfg.O();
            if (settingsO.getAudioStorageDays() == 0) {
                settingsO.setAudioStorageDays(-1);
            } else {
                settingsO.setAudioStorageDays(0);
            }
        }
        return super.F2(menuItem);
    }

    public void G5(boolean z10) {
        g.b bVar = this.f6194b1;
        if (z10 == bVar.f10645e) {
            return;
        }
        bVar.f10645e = z10;
        J5(this.S0);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        d dVar = this.Q0;
        if (dVar != null) {
            dVar.cancel();
        }
        this.Q0 = null;
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null || l1VarY4.u() == null) {
            return;
        }
        l1VarY4.u().o(null);
    }

    @Override // v3.c
    protected void I4(androidx.appcompat.view.b bVar) {
        TalkRecyclerViewAdapter talkRecyclerViewAdapter;
        super.I4(bVar);
        if (H4() || (talkRecyclerViewAdapter = this.P0) == null) {
            return;
        }
        talkRecyclerViewAdapter.M();
    }

    @Override // androidx.fragment.app.o
    public void J2(Menu menu) {
        super.J2(menu);
        MenuItem menuItemFindItem = menu.findItem(R.id.save_audio);
        if (menuItemFindItem != null) {
            menuItemFindItem.setChecked(Cfg.h0());
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null || l1VarY4.u() == null) {
            H5(false);
        } else {
            l1VarY4.u().o(this.Z0);
            H5(l1VarY4.u().l());
        }
        if (l1VarY4 instanceof n1) {
            d0.f28046a.j(((n1) l1VarY4).T);
        }
        super.M2();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void N2(Bundle bundle) {
        bundle.putLongArray("mNeedSaveSessionIds", this.f6196d1);
        bundle.putString("mSaveToDir", this.W0);
        super.N2(bundle);
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public g1.c S(int i10, Bundle bundle) {
        return new e(x3(), y5());
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(n0 n0Var, n0 n0Var2) {
        super.d5(n0Var, n0Var2);
        if (n0Var != null && n0Var.u() != null) {
            n0Var.u().o(null);
        }
        if (n0Var2 != null && n0Var2.u() != null) {
            n0Var2.u().o(this.Z0);
        }
        this.U0 = true;
        J5(this.S0);
        if (n0Var2 instanceof n1) {
            d0.f28046a.j(((n1) n0Var2).T);
        }
    }

    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o oVar, int i10, int i11, int i12, Object obj) {
        File fileN;
        if (oVar != null) {
            long[] jArr = this.f6196d1;
            if ("save_audio_file_name".equals(oVar.P1()) && jArr != null && jArr.length > 0 && !w.b(this.W0)) {
                if (i10 == R.id.what_dialog_onclick && i11 == -1 && (fileN = Cfg.n(jArr[0])) != null && fileN.isFile()) {
                    String strM = a6.m.m((String) obj, "_");
                    F5(jArr, Uri.fromFile(new File(this.W0, strM + ".opus")));
                }
                return true;
            }
        }
        return super.f4(oVar, i10, i11, i12, obj);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void h0(n0 n0Var) {
        xdsopl.robot36.a aVarU = n0Var.u();
        if (aVarU != null && h2()) {
            aVarU.o(this.Z0);
        }
        H5(aVarU != null && aVarU.l());
        super.h0(n0Var);
    }

    @Override // com.dw.util.concurrent.a.InterfaceC0105a
    public void i(final com.dw.util.concurrent.a aVar) {
        if (aVar instanceof d) {
            this.R0.postDelayed(new Runnable() { // from class: s4.x7
                @Override // java.lang.Runnable
                public final void run() {
                    TalkListFragment.s5(this.f26850a, aVar);
                }
            }, 500L);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void i0(n0 n0Var) {
        super.i0(n0Var);
        J5(this.S0);
    }

    @Override // androidx.fragment.app.o
    public void m2(int i10, int i11, Intent intent) {
        long[] jArr;
        Uri data;
        if (i10 != 1) {
            super.m2(i10, i11, intent);
            return;
        }
        if (i11 != -1 || k1() == null || (jArr = this.f6196d1) == null || jArr.length == 0 || (data = intent.getData()) == null) {
            return;
        }
        F5(jArr, data);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle bundle) {
        super.r2(bundle);
        if (bundle != null) {
            this.f6196d1 = bundle.getLongArray("mNeedSaveSessionIds");
            this.W0 = bundle.getString("mSaveToDir");
        }
        G3(true);
        Bundle bundleI1 = i1();
        if (bundleI1 != null) {
            g.b bVar = this.f6194b1;
            bVar.f10645e = bundleI1.getBoolean("ARG_MESSAGE_MODE", bVar.f10645e);
            g.b bVar2 = this.f6194b1;
            bVar2.f10641a = bundleI1.getString("com.dw.ht.intent.extras.FROM", bVar2.f10641a);
            this.f6194b1.f10647g = bundleI1.getLong("com.dw.ht.intent.extras.UID", 0L);
            g.b bVar3 = this.f6194b1;
            bVar3.f10646f = true;
            bVar3.f10649i = bundleI1.getBoolean("com.dw.ht.intent.extras.PICTURE_MODE");
        }
        e eVar = (e) x1().c(0, null, this);
        this.S0 = eVar;
        J5(eVar);
    }

    @Override // androidx.loader.app.a.InterfaceC0037a
    public void t0(g1.c cVar) {
        this.P0.b0(null);
    }

    @Override // androidx.fragment.app.o
    public void u2(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.talk_list, menu);
        super.u2(menu, menuInflater);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.fragment_talk_list, viewGroup, false);
        if (viewInflate instanceof CSFrameLayout) {
            ((CSFrameLayout) viewInflate).setOnSizeChangingListener(new LinearLayoutEx.d() { // from class: s4.y7
                @Override // com.dw.widget.LinearLayoutEx.d
                public final void a(View view, int i10, int i11, int i12, int i13) {
                    TalkListFragment.o5(this.f26863a, view, i10, i11, i12, i13);
                }
            });
        }
        this.R0 = (RecyclerView) viewInflate.findViewById(R.id.list);
        this.f6195c1 = viewInflate.findViewById(R.id.empty);
        Context context = viewInflate.getContext();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
        this.T0 = linearLayoutManager;
        this.R0.setLayoutManager(linearLayoutManager);
        TalkRecyclerViewAdapter talkRecyclerViewAdapter = new TalkRecyclerViewAdapter(context, this, this);
        this.P0 = talkRecyclerViewAdapter;
        this.X0 = new b(talkRecyclerViewAdapter, context.getResources().getDimensionPixelSize(R.dimen.recommended_touch_area_size));
        View viewInflate2 = layoutInflater.inflate(R.layout.fragment_talk_list_pic_rxing, (ViewGroup) this.R0, false);
        this.Y0 = viewInflate2;
        this.Z0 = (ImageView) viewInflate2.findViewById(R.id.content);
        this.R0.setAdapter(this.X0);
        g4(this.R0);
        l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            o0(l1VarY4);
        }
        this.R0.o(new a());
        this.f6193a1 = false;
        if (this.P0.P() > 0) {
            L4(new c(this, null));
        }
        return viewInflate;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        this.P0.b0(null);
        super.y2();
    }

    @Override // v3.f0, v3.e0
    public e0 getSearchable() {
        return this;
    }
}
