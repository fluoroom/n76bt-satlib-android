package ru.bartwell.exfilepicker.ui.activity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import fk.e;
import fk.g;
import fk.h;
import fk.i;
import fk.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kk.a;
import kk.b;
import kk.c;
import lk.a;

/* JADX INFO: loaded from: classes3.dex */
public class ExFilePickerActivity extends androidx.appcompat.app.d implements jk.a, a.InterfaceC0270a, b.a, c.a {
    private boolean M;
    private String[] N;
    private String[] O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private fk.a S = fk.a.ALL;
    private fk.b T = fk.b.NAME_ASC;
    private File U;
    private RecyclerView V;
    private View W;
    private hk.a X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private boolean f26201a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    private String f26202b0;

    class a implements a.InterfaceC0278a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f26203a;

        a(List list) {
            this.f26203a = list;
        }

        @Override // lk.a.InterfaceC0278a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(File file) {
            return file.isDirectory() || this.f26203a.contains(lk.b.c(file.getName()));
        }
    }

    class b implements a.InterfaceC0278a {
        b() {
        }

        @Override // lk.a.InterfaceC0278a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(File file) {
            return file.isDirectory();
        }
    }

    class c implements a.InterfaceC0278a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f26206a;

        c(List list) {
            this.f26206a = list;
        }

        @Override // lk.a.InterfaceC0278a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(File file) {
            return !file.isDirectory() && this.f26206a.contains(lk.b.c(file.getName()));
        }
    }

    class d implements a.InterfaceC0278a {
        d() {
        }

        @Override // lk.a.InterfaceC0278a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean a(File file) {
            return file.isHidden();
        }
    }

    private int m1() {
        return (int) (getResources().getDisplayMetrics().widthPixels / getResources().getDimension(e.f13305a));
    }

    private void n1(File file, String str) {
        o1(file, new ArrayList(Collections.singletonList(str)));
    }

    private void o1(File file, List list) {
        String absolutePath = file.getAbsolutePath();
        if (!absolutePath.endsWith("/")) {
            absolutePath = absolutePath + "/";
        }
        gk.a aVar = new gk.a(absolutePath, list);
        Intent intent = new Intent();
        intent.putExtra("RESULT", aVar);
        setResult(-1, intent);
        finish();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.io.File p1(android.content.Intent r3) {
        /*
            r2 = this;
            java.lang.String r0 = "START_DIRECTORY"
            java.lang.String r3 = r3.getStringExtra(r0)
            if (r3 == 0) goto L24
            int r0 = r3.length()
            if (r0 <= 0) goto L24
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
            boolean r3 = r0.exists()
            if (r3 == 0) goto L24
            boolean r3 = r0.isFile()
            if (r3 == 0) goto L25
            java.io.File r0 = r0.getParentFile()
            goto L25
        L24:
            r0 = 0
        L25:
            if (r0 != 0) goto L3d
            java.util.List r3 = lk.b.b(r2)
            int r1 = r3.size()
            if (r1 <= 0) goto L3d
            java.io.File r0 = new java.io.File
            r1 = 0
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            r0.<init>(r3)
        L3d:
            if (r0 != 0) goto L57
            java.io.File r3 = new java.io.File
            java.lang.String r0 = "/"
            r3.<init>(r0)
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L56
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()
        L56:
            return r3
        L57:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.bartwell.exfilepicker.ui.activity.ExFilePickerActivity.p1(android.content.Intent):java.io.File");
    }

    private void q1() {
        Intent intent = getIntent();
        this.M = intent.getBooleanExtra("CAN_CHOOSE_ONLY_ONE_ITEM", false);
        this.N = intent.getStringArrayExtra("SHOW_ONLY_EXTENSIONS");
        this.O = intent.getStringArrayExtra("EXCEPT_EXTENSIONS");
        this.P = intent.getBooleanExtra("IS_NEW_FOLDER_BUTTON_DISABLED", false);
        this.Q = intent.getBooleanExtra("IS_SORT_BUTTON_DISABLED", false);
        this.R = intent.getBooleanExtra("IS_QUIT_BUTTON_ENABLED", false);
        this.S = (fk.a) intent.getSerializableExtra("CHOICE_TYPE");
        this.T = (fk.b) intent.getSerializableExtra("SORTING_TYPE");
        this.U = p1(intent);
        this.Z = intent.getBooleanExtra("USE_FIRST_ITEM_AS_UP_ENABLED", false);
        this.f26201a0 = intent.getBooleanExtra("HIDE_HIDDEN_FILES", false);
        this.f26202b0 = intent.getStringExtra("TITLE");
    }

    private boolean r1(File file) {
        if (file == null) {
            return false;
        }
        Iterator it = lk.b.b(this).iterator();
        while (it.hasNext()) {
            if (file.getAbsolutePath().equals((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean s1(File file) {
        return file != null && "/".equals(file.getAbsolutePath());
    }

    private void t1(File file) {
        w1(file);
        this.X.U((s1(file) || r1(file) || !this.Z) ? false : true);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null || fileArrListFiles.length == 0) {
            if (!this.Z) {
                this.W.setVisibility(0);
                this.V.setVisibility(8);
                return;
            } else {
                this.V.setVisibility(0);
                this.W.setVisibility(8);
                this.X.R(new ArrayList(), this.T);
                return;
            }
        }
        this.V.setVisibility(0);
        this.W.setVisibility(8);
        ArrayList arrayList = new ArrayList();
        String[] strArr = this.N;
        lk.a.b(fileArrListFiles, arrayList, (strArr == null || strArr.length <= 0 || this.S == fk.a.DIRECTORIES) ? this.S == fk.a.DIRECTORIES ? new b() : null : new a(Arrays.asList(strArr)));
        String[] strArr2 = this.O;
        if (strArr2 != null && strArr2.length > 0 && this.S != fk.a.DIRECTORIES) {
            lk.a.c(arrayList, new c(Arrays.asList(strArr2)));
        }
        if (this.f26201a0) {
            lk.a.c(arrayList, new d());
        }
        this.X.R(arrayList, this.T);
    }

    private void u1() {
        File parentFile = this.U.getParentFile();
        this.U = parentFile;
        t1(parentFile);
    }

    private void v1(boolean z10) {
        if (this.Y == z10) {
            return;
        }
        this.Y = z10;
        this.X.U((z10 || !this.Z || s1(this.U)) ? false : true);
        this.X.S(z10);
        invalidateOptionsMenu();
    }

    private void w1(File file) {
        String str = this.f26202b0;
        String string = s1(file) ? "/" : file.getAbsolutePath().equals(Environment.getExternalStorageDirectory().getAbsolutePath()) ? getString(j.f13337h) : file.getName();
        if (TextUtils.isEmpty(str)) {
            str = string;
            string = null;
        }
        androidx.appcompat.app.a aVarY0 = Y0();
        if (aVarY0 != null) {
            aVarY0.y(str);
            aVarY0.w(string);
        }
    }

    private void x1() {
        RecyclerView recyclerView = (RecyclerView) findViewById(g.f13319k);
        this.V = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        hk.a aVar = new hk.a();
        this.X = aVar;
        aVar.T(this);
        this.X.O(this.S == fk.a.FILES);
        this.X.U(this.Z);
        this.V.setAdapter(this.X);
        this.W = findViewById(g.f13312d);
        androidx.appcompat.app.a aVarY0 = Y0();
        if (aVarY0 != null) {
            aVarY0.o(true);
            aVarY0.r(lk.b.a(this, fk.d.f13302a));
        }
    }

    private void y1() {
        kk.a aVar = new kk.a(this);
        aVar.a(this);
        aVar.b();
    }

    private void z1() {
        if (this.X.I()) {
            this.V.setLayoutManager(new LinearLayoutManager(this));
            this.X.P(false);
        } else {
            this.V.setLayoutManager(new GridLayoutManager(this, m1()));
            this.X.P(true);
        }
        invalidateOptionsMenu();
    }

    @Override // jk.a
    public void K(int i10) {
        if (this.Y) {
            if (this.M) {
                this.X.D();
            }
            this.X.Q(i10, !r0.J(i10));
            return;
        }
        if (i10 == -1) {
            u1();
            return;
        }
        File fileE = this.X.E(i10);
        if (!fileE.isDirectory()) {
            n1(this.U, fileE.getName());
            return;
        }
        File file = new File(this.U, fileE.getName());
        this.U = file;
        t1(file);
    }

    @Override // jk.a
    public void P(int i10) {
        if (this.M || this.Y || i10 == -1) {
            return;
        }
        if (this.S == fk.a.FILES && this.X.E(i10).isDirectory()) {
            return;
        }
        this.X.Q(i10, true);
        v1(true);
    }

    @Override // androidx.appcompat.app.d, a0.g, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() != 4) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 1) {
            if (this.Y) {
                v1(false);
            } else if (s1(this.U) || r1(this.U)) {
                finish();
            } else {
                u1();
            }
        } else if (keyEvent.getAction() == 0 && (keyEvent.getFlags() & 128) == 128) {
            finish();
        }
        return true;
    }

    @Override // kk.b.a
    public void k(fk.b bVar) {
        this.T = bVar;
        this.X.V(bVar);
    }

    @Override // kk.c.a
    public void n(String str) {
        File file = new File(str);
        this.U = file;
        t1(file);
    }

    @Override // androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(h.f13324a);
        q1();
        x1();
        if (bundle != null && bundle.containsKey("DIRECTORY_STATE")) {
            this.U = new File(bundle.getString("DIRECTORY_STATE"));
        }
        if (b0.b.a(this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            t1(this.U);
        } else {
            a0.b.q(this, new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 1);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        androidx.appcompat.app.a aVarY0 = Y0();
        if (aVarY0 != null) {
            aVarY0.o(this.Y || this.R);
        }
        if (this.Y) {
            getMenuInflater().inflate(i.f13328a, menu);
        } else {
            getMenuInflater().inflate(i.f13329b, menu);
            MenuItem menuItemFindItem = menu.findItem(g.f13309a);
            if (this.X.I()) {
                menuItemFindItem.setIcon(lk.b.a(this, fk.d.f13304c));
                menuItemFindItem.setTitle(j.f13331b);
            } else {
                menuItemFindItem.setIcon(lk.b.a(this, fk.d.f13303b));
                menuItemFindItem.setTitle(j.f13330a);
            }
            menu.findItem(g.f13317i).setVisible(!this.P);
        }
        menu.findItem(g.f13321m).setVisible(!this.Q);
        menu.findItem(g.f13318j).setVisible(this.S == fk.a.DIRECTORIES || this.Y);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            if (this.Y) {
                v1(false);
                return true;
            }
            finish();
            return true;
        }
        if (itemId == g.f13318j) {
            if (this.Y) {
                o1(this.U, this.X.F());
                return true;
            }
            if (this.S != fk.a.DIRECTORIES) {
                return true;
            }
            if (s1(this.U)) {
                n1(this.U, "/");
                return true;
            }
            n1(this.U.getParentFile(), this.U.getName());
            return true;
        }
        if (itemId == g.f13321m) {
            kk.b bVar = new kk.b(this);
            bVar.a(this);
            bVar.b();
            return true;
        }
        if (itemId == g.f13322n) {
            kk.c cVar = new kk.c(this);
            cVar.a(this);
            cVar.b();
            return true;
        }
        if (itemId == g.f13317i) {
            if (b0.b.a(this, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
                y1();
                return true;
            }
            a0.b.q(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 2);
            return true;
        }
        if (itemId == g.f13320l) {
            this.X.N();
            return true;
        }
        if (itemId == g.f13311c) {
            this.X.D();
            return true;
        }
        if (itemId == g.f13315g) {
            this.X.H();
            return true;
        }
        if (itemId != g.f13309a) {
            return super.onOptionsItemSelected(menuItem);
        }
        z1();
        return true;
    }

    @Override // androidx.fragment.app.p, d.q, android.app.Activity, a0.b.e
    public void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        if (i10 == 1) {
            t1(this.U);
        } else if (i10 == 2) {
            y1();
        }
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // d.q, a0.g, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("DIRECTORY_STATE", this.U.getAbsolutePath());
    }

    @Override // kk.a.InterfaceC0270a
    public void p(String str) {
        if (str.length() > 0) {
            File file = new File(this.U, str);
            if (file.exists()) {
                Toast.makeText(this, j.f13334e, 0).show();
            } else if (!file.mkdir()) {
                Toast.makeText(this, j.f13336g, 0).show();
            } else {
                t1(this.U);
                Toast.makeText(this, j.f13335f, 0).show();
            }
        }
    }
}
