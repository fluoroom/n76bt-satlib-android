package om.sstvencoder;

import android.app.AlertDialog;
import android.content.ContentResolver;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import android.view.MenuItem;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c extends androidx.appcompat.app.d {
    protected f M;
    private g N;
    protected CropView O;
    protected b P;

    private boolean A1(Uri uri, boolean z10) {
        boolean z11;
        ContentResolver contentResolver = getContentResolver();
        if (uri != null) {
            z11 = true;
            try {
                InputStream inputStreamOpenInputStream = contentResolver.openInputStream(uri);
                if (inputStreamOpenInputStream != null) {
                    this.O.setBitmap(inputStreamOpenInputStream);
                }
            } catch (Exception e10) {
                if (Build.VERSION.SDK_INT >= 23 && y1(e10) && B1()) {
                    G1(1);
                } else {
                    M1(e10, z10);
                }
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (z11) {
            this.O.w(s1(contentResolver, uri));
            this.M.l(uri);
        } else {
            J1();
        }
        return z11;
    }

    private boolean B1() {
        return Build.VERSION.SDK_INT >= 23 && b0.b.a(this, "android.permission.READ_EXTERNAL_STORAGE") != 0;
    }

    private boolean C1() {
        int i10 = Build.VERSION.SDK_INT;
        return i10 >= 23 && i10 <= 29 && b0.b.a(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0;
    }

    private void D1(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        } else {
            L1(getString(xh.e.f32184d), str, "");
        }
    }

    private boolean E1(int[] iArr) {
        return iArr.length > 0 && iArr[0] == 0;
    }

    private void G1(int i10) {
        a0.b.q(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, i10);
    }

    private void H1(int i10) {
        a0.b.q(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, i10);
    }

    private void I1() {
        if (h.k()) {
            this.P.m(this.O.getBitmap(), new ai.d(getContentResolver(), h.c()));
        }
    }

    private void J1() {
        try {
            this.O.setBitmap(getResources().openRawResource(xh.d.f32180a));
        } catch (Exception unused) {
            this.O.y();
        }
        this.M.l(null);
    }

    private void K1(String str) {
        if (this.P.o(str)) {
            yh.b bVarJ = this.P.j();
            this.O.setModeSize(bVarJ.a());
            setTitle(bVarJ.b());
            this.M.m(str);
        }
    }

    private void M1(Exception exc, boolean z10) {
        String string;
        if (z10) {
            string = getString(xh.e.f32191k) + ": \n" + exc.getMessage();
        } else {
            string = getString(xh.e.f32193m);
        }
        Toast.makeText(this, string, 1).show();
    }

    private void O1(String str, String str2) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(str);
        builder.setMessage(str2);
        builder.setNeutralButton(xh.e.f32185e, (DialogInterface.OnClickListener) null);
        builder.show();
    }

    private void S1(Intent intent, int i10) {
        if (intent.resolveActivity(getPackageManager()) == null) {
            Toast.makeText(this, xh.e.f32183c, 1).show();
            return;
        }
        try {
            startActivityForResult(intent, i10);
        } catch (Exception unused) {
            Toast.makeText(this, xh.e.f32184d, 1).show();
        }
    }

    private void m1(Uri uri) {
        Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
        intent.setData(uri);
        sendBroadcast(intent);
    }

    private void o1() {
        S1(new Intent("android.intent.action.PICK", MediaStore.Images.Media.EXTERNAL_CONTENT_URI), 11);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0017 A[EXC_TOP_SPLITTER, PHI: r0 r1
      0x0017: PHI (r0v2 int) = (r0v0 int), (r0v4 int) binds: [B:11:0x0021, B:4:0x0015] A[DONT_GENERATE, DONT_INLINE]
      0x0017: PHI (r1v3 java.io.InputStream) = (r1v2 java.io.InputStream), (r1v4 java.io.InputStream) binds: [B:11:0x0021, B:4:0x0015] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int q1(android.content.ContentResolver r4, android.net.Uri r5) {
        /*
            r3 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r1 = r4.openInputStream(r5)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            w0.a r4 = new w0.a     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            java.lang.String r2 = "Orientation"
            int r4 = r4.g(r2, r0)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            int r0 = om.sstvencoder.h.a(r4)     // Catch: java.lang.Throwable -> L1b java.lang.Exception -> L1d
            if (r1 == 0) goto L24
        L17:
            r1.close()     // Catch: java.lang.Exception -> L24
            goto L24
        L1b:
            r4 = move-exception
            goto L25
        L1d:
            r4 = move-exception
            r3.N1(r5, r4)     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L24
            goto L17
        L24:
            return r0
        L25:
            if (r1 == 0) goto L2a
            r1.close()     // Catch: java.lang.Exception -> L2a
        L2a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: om.sstvencoder.c.q1(android.content.ContentResolver, android.net.Uri):int");
    }

    private Uri r1(Intent intent) {
        if (!x1(intent.getType()) || !w1(intent.getAction())) {
            return null;
        }
        Uri data = intent.hasExtra("android.intent.extra.STREAM") ? (Uri) intent.getParcelableExtra("android.intent.extra.STREAM") : intent.getData();
        if (data == null) {
            String string = getString(xh.e.f32192l);
            L1(getString(xh.e.f32191k), string, string + "\n\n" + intent);
        }
        return data;
    }

    private e t1() {
        return new e((ProgressBar) findViewById(xh.a.f32172w), (TextView) findViewById(xh.a.f32174y));
    }

    private e u1() {
        return new e((ProgressBar) findViewById(xh.a.f32173x), (TextView) findViewById(xh.a.f32175z));
    }

    private String v1() {
        try {
            return getPackageManager().getPackageInfo(getApplicationInfo().packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private boolean w1(String str) {
        return "android.intent.action.SEND".equals(str);
    }

    private boolean x1(String str) {
        return str != null && str.startsWith("image/");
    }

    private boolean y1(Exception exc) {
        return (exc.getCause() instanceof ErrnoException) && ((ErrnoException) exc.getCause()).errno == OsConstants.EACCES;
    }

    private void z1(Intent intent) {
        Uri uriR1 = r1(intent);
        A1(uriR1, uriR1 != null);
    }

    protected abstract void F1();

    protected abstract void L1(String str, String str2, String str3);

    protected abstract void N1(Uri uri, Exception exc);

    public void P1(bi.c cVar) {
        Intent intent = new Intent(this, (Class<?>) EditTextActivity.class);
        intent.putExtra("EDIT_TEXT_EXTRA", cVar);
        S1(intent, 101);
    }

    protected void Q1() {
        this.P.p();
    }

    protected abstract void R1();

    public void n1(ai.d dVar) {
        dVar.e();
    }

    @Override // androidx.fragment.app.p, d.q, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        if (i10 == 11) {
            if (i11 != -1 || intent == null) {
                return;
            }
            A1(intent.getData(), true);
            return;
        }
        if (i10 != 12) {
            if (i10 != 101) {
                super.onActivityResult(i10, i11, intent);
                return;
            } else {
                this.O.n((i11 != -1 || intent == null) ? null : (bi.c) intent.getSerializableExtra("EDIT_TEXT_EXTRA"));
                return;
            }
        }
        if (i11 == -1) {
            Uri uriB = this.M.b();
            if (A1(uriB, true)) {
                m1(uriB);
            }
        }
    }

    @Override // androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        setContentView(xh.b.f32177b);
        this.O = (CropView) findViewById(xh.a.f32162m);
        this.P = new b(new d(this), t1(), u1());
        f fVar = new f(this);
        this.M = fVar;
        fVar.e();
        g gVar = new g();
        this.N = gVar;
        gVar.a(this.O.getLabels(), this.M.d());
        K1(this.M.c());
        z1(getIntent());
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.P.h();
    }

    @Override // d.q, android.app.Activity
    protected void onNewIntent(Intent intent) {
        z1(intent);
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Intent intent;
        int itemId = menuItem.getItemId();
        if (itemId == xh.a.f32153d) {
            o1();
        } else if (itemId == xh.a.f32160k) {
            R1();
        } else if (itemId == xh.a.f32158i) {
            if (C1()) {
                H1(2);
            } else {
                I1();
            }
        } else if (itemId == xh.a.f32154e) {
            F1();
        } else if (itemId == xh.a.f32159j) {
            Q1();
        } else if (itemId == xh.a.f32157h) {
            this.O.w(90);
        } else if (itemId == xh.a.f32156g) {
            this.O.t();
        } else if (itemId == xh.a.f32155f) {
            D1("https://sites.google.com/view/olgamiller/sstvencoder/privacypolicy/");
        } else if (itemId == xh.a.f32150a) {
            O1(getString(xh.e.f32181a), getString(xh.e.f32182b, v1()));
        } else if (itemId != xh.a.f32152c && itemId != xh.a.f32161l && (intent = menuItem.getIntent()) != null) {
            String stringExtra = intent.getStringExtra("ClassName");
            if (!TextUtils.isEmpty(stringExtra)) {
                K1(stringExtra);
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.p, android.app.Activity
    protected void onPause() throws Throwable {
        super.onPause();
        this.M.k();
        this.N.b(this.O.getLabels(), this.M.d());
    }

    @Override // androidx.fragment.app.p, d.q, android.app.Activity, a0.b.e
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 == 3 && E1(iArr)) {
                    p1();
                }
            } else if (E1(iArr)) {
                I1();
            }
        } else if (E1(iArr)) {
            A1(this.M.b(), false);
        } else {
            J1();
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    protected abstract void p1();

    public int s1(ContentResolver contentResolver, Uri uri) {
        ContentResolver contentResolver2;
        Uri uri2;
        try {
            contentResolver2 = contentResolver;
            uri2 = uri;
        } catch (Exception unused) {
            contentResolver2 = contentResolver;
            uri2 = uri;
        }
        try {
            Cursor cursorQuery = contentResolver2.query(uri2, new String[]{"orientation"}, null, null, null);
            int i10 = cursorQuery.moveToFirst() ? cursorQuery.getInt(0) : 0;
            cursorQuery.close();
            return i10;
        } catch (Exception unused2) {
            return q1(contentResolver2, uri2);
        }
    }
}
