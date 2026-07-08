package com.dw.ht.activitys;

import a6.r;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import d5.g;
import v4.l;
import v4.l1;
import v4.u;
import v4.v;
import w4.e;

/* JADX INFO: loaded from: classes.dex */
public class PictureSendActivity extends om.sstvencoder.c {
    private long Q;
    private a R;
    private Handler S;
    private Uri T;

    private class a extends l implements ai.a {
        private final int H;
        private final b6.d I;
        private final Bitmap J;
        private short[] K;
        private int L;
        private boolean M;
        private boolean N;
        private final double O;

        public a(l1 l1Var, Bitmap bitmap) {
            super(l1Var, "Picture Sender");
            this.H = 32000;
            this.I = new b6.d(32000);
            this.K = new short[3200];
            this.O = 16383.0d;
            this.J = bitmap;
            this.f29928e.v(false);
        }

        @Override // v4.l
        protected boolean G() {
            return Cfg.f5476a && Cfg.h0();
        }

        @Override // ai.a
        public double j() {
            return 32000.0d;
        }

        @Override // ai.a
        public void k(boolean z10) {
            this.M = true;
            this.I.o(this.K, 0, this.L);
            this.L = 0;
            if (z10) {
                cancel();
            }
        }

        @Override // ai.a
        public void l(int i10) {
        }

        @Override // v4.l, com.dw.util.concurrent.a
        protected void onCancel() {
            if (PictureSendActivity.this.R == this) {
                PictureSendActivity.this.R = null;
                PictureSendActivity.this.invalidateOptionsMenu();
            }
            super.onCancel();
        }

        @Override // v4.l, com.dw.util.concurrent.a
        protected boolean onInit() {
            ((om.sstvencoder.c) PictureSendActivity.this).P.l(this.J, this);
            return super.onInit();
        }

        @Override // v4.l, com.dw.util.concurrent.a
        protected void onStop() {
            if (PictureSendActivity.this.R == this) {
                PictureSendActivity.this.R = null;
                Handler handler = PictureSendActivity.this.S;
                final PictureSendActivity pictureSendActivity = PictureSendActivity.this;
                handler.post(new Runnable() { // from class: j4.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        pictureSendActivity.invalidateOptionsMenu();
                    }
                });
            }
            super.onStop();
        }

        @Override // ai.a
        public void p(double d10) {
            short[] sArr = this.K;
            int i10 = this.L;
            int i11 = i10 + 1;
            this.L = i11;
            sArr[i10] = (short) (d10 * 16383.0d);
            if (i11 < sArr.length) {
                return;
            }
            if (isCancelled()) {
                this.L = 0;
                return;
            }
            if (this.I.b() < this.K.length * 2) {
                s3.b.b("Picture Sender", "等待缓存");
                while (!this.I.h(this.K.length * 2, 2000L) && !isCancelled()) {
                    try {
                        s3.b.b("Picture Sender", "等待缓存");
                    } catch (InterruptedException e10) {
                        s3.b.c("Picture Sender", "write 中断", e10);
                    }
                }
            }
            b6.d dVar = this.I;
            short[] sArr2 = this.K;
            dVar.o(sArr2, 0, sArr2.length);
            this.L = 0;
        }

        @Override // v4.l
        protected int read(short[] sArr, int i10, int i11) {
            if (this.M && this.I.c() == 0) {
                return -1;
            }
            if (this.I.c() == 0) {
                s3.b.b("Picture Sender", "等待数据");
            }
            try {
                this.I.i(1, 2000L);
            } catch (InterruptedException e10) {
                s3.b.c("Picture Sender", "read 中断", e10);
            }
            if (!this.N && this.f29928e.Y().f29913b) {
                this.N = true;
                this.f29928e.b(v.SET_TX_TIME_LIMIT, new e(300));
            }
            return this.I.l(sArr, i10, i11);
        }
    }

    private Uri Y1() {
        if (this.T == null) {
            this.T = r.f(this);
        }
        return this.T;
    }

    private static Intent Z1(Uri uri) {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE", (Uri) null);
        r.c(intent, uri);
        return intent;
    }

    @Override // om.sstvencoder.c
    protected void F1() throws Throwable {
        if (this.R != null) {
            return;
        }
        Bitmap bitmap = this.O.getBitmap();
        u uVarW = u.w();
        long j10 = this.Q;
        l1 l1VarY = j10 != 0 ? uVarW.y(j10) : uVarW.r();
        if (l1VarY == null) {
            Toast.makeText(this, "There are currently no active connections.", 1).show();
            finish();
            return;
        }
        l1VarY.L(true);
        a aVar = new a(l1VarY, bitmap);
        this.R = aVar;
        l1VarY.m1(aVar);
        invalidateOptionsMenu();
        g.t(this.Q, 0, 3, bitmap);
    }

    @Override // om.sstvencoder.c
    protected void L1(String str, String str2, String str3) {
        Toast.makeText(this, str + "\n" + str2, 1).show();
    }

    @Override // om.sstvencoder.c
    protected void N1(Uri uri, Exception exc) {
        if (exc != null) {
            exc.printStackTrace();
        }
    }

    @Override // om.sstvencoder.c
    protected void Q1() {
        a aVar = this.R;
        if (aVar != null) {
            aVar.cancel();
        }
        super.Q1();
    }

    @Override // om.sstvencoder.c
    protected void R1() {
        p1();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void X1(android.view.Menu r8) {
        /*
            r7 = this;
            r0 = 2131296351(0x7f09005f, float:1.8210616E38)
            android.view.MenuItem r8 = r8.findItem(r0)
            android.view.SubMenu r8 = r8.getSubMenu()
            om.sstvencoder.b r0 = r7.P
            yh.b[] r0 = r0.k()
            int r1 = r0.length
            r2 = 0
        L13:
            if (r2 >= r1) goto L5c
            r3 = r0[r2]
            boolean r4 = com.dw.ht.Cfg.f5482d
            if (r4 == 0) goto L33
            java.lang.String r4 = r3.b()
            r4.getClass()
            java.lang.String r5 = "PD 120"
            boolean r5 = r4.equals(r5)
            if (r5 != 0) goto L40
            java.lang.String r5 = "Robot 36"
            boolean r4 = r4.equals(r5)
            if (r4 != 0) goto L40
            goto L59
        L33:
            java.lang.String r4 = r3.b()
            java.lang.String r5 = "Martin 2"
            boolean r4 = j$.util.Objects.equals(r4, r5)
            if (r4 == 0) goto L40
            goto L59
        L40:
            java.lang.String r4 = r3.b()
            android.view.MenuItem r4 = r8.add(r4)
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            java.lang.String r6 = "ClassName"
            java.lang.String r3 = r3.c()
            r5.putExtra(r6, r3)
            r4.setIntent(r5)
        L59:
            int r2 = r2 + 1
            goto L13
        L5c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dw.ht.activitys.PictureSendActivity.X1(android.view.Menu):void");
    }

    @Override // om.sstvencoder.c, androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        this.S = new Handler();
        super.onCreate(bundle);
        this.Q = getIntent().getLongExtra("com.dw.ht.intent.extras.DEV_ID", 0L);
        androidx.appcompat.app.a aVarY0 = Y0();
        if (aVarY0 != null) {
            aVarY0.o(true);
        }
        if (bundle != null) {
            this.T = (Uri) bundle.getParcelable("TEMP_PHOTO_URI");
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_sstv_encoder, menu);
        X1(menu);
        if (this.R == null) {
            menu.findItem(R.id.action_stop).setVisible(false);
            menu.findItem(R.id.action_play).setVisible(true);
        } else {
            menu.findItem(R.id.action_stop).setVisible(true);
            menu.findItem(R.id.action_play).setVisible(false);
        }
        return true;
    }

    @Override // om.sstvencoder.c, androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        try {
            ContentResolver contentResolver = getContentResolver();
            Uri uri = this.T;
            if (uri != null) {
                contentResolver.delete(uri, null, null);
            }
        } catch (IllegalArgumentException e10) {
            e10.printStackTrace();
        }
    }

    @Override // om.sstvencoder.c, android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    @Override // d.q, a0.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TEMP_PHOTO_URI", this.T);
    }

    @Override // om.sstvencoder.c
    protected void p1() {
        try {
            Uri uriY1 = Y1();
            Intent intentZ1 = Z1(uriY1);
            this.M.l(uriY1);
            startActivityForResult(intentZ1, 12);
        } catch (ActivityNotFoundException unused) {
            Toast.makeText(this, R.string.photoPickerNotFoundText, 1).show();
        }
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence charSequence) {
        androidx.appcompat.app.a aVarY0 = Y0();
        if (aVarY0 == null) {
            super.setTitle(charSequence);
        } else {
            aVarY0.w(charSequence);
            aVarY0.x(R.string.sendPicture);
        }
    }
}
