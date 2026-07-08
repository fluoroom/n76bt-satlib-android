package com.dw.ht.factory;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.dw.ht.factory.DeviceIDWriterFragment;
import com.dw.ht.fragments.DeviceFragment;
import e5.a;
import g3.a;
import g3.d;
import java.io.File;
import java.util.Arrays;
import kotlin.Metadata;
import m4.d0;
import org.greenrobot.eventbus.ThreadMode;
import q4.i;
import q4.m;
import q4.q;
import v4.n0;
import v4.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 H2\u00020\u0001:\u0001IB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u0003J\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0016\u0010-\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u00101\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00103\u001a\u00020.8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b2\u00100R\u0018\u00106\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R(\u0010=\u001a\u0004\u0018\u0001072\b\u00108\u001a\u0004\u0018\u0001078\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b9\u0010:\"\u0004\b;\u0010<R$\u0010C\u001a\u00020>2\u0006\u00108\u001a\u00020>8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b?\u0010@\"\u0004\bA\u0010BR\u001a\u0010G\u001a\b\u0012\u0004\u0012\u00020E0D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010F¨\u0006J"}, d2 = {"Lcom/dw/ht/factory/DeviceIDWriterFragment;", "Lcom/dw/ht/fragments/DeviceFragment;", "<init>", "()V", "Ldd/d0;", "E5", "", "D5", "()Z", "writeUID", "B5", "(Z)V", "u5", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "H2", "y2", "Lv4/n0;", "link", "W0", "(Lv4/n0;)V", "Lg3/d;", "packet", "M", "(Lv4/n0;Lg3/d;)V", "Lq4/m;", "event", "onMessageEvent", "(Lq4/m;)V", "Lm4/d0;", "P0", "Lm4/d0;", "binding", "Landroid/content/SharedPreferences;", "Q0", "Landroid/content/SharedPreferences;", "pref", "Ljava/io/File;", "R0", "Ljava/io/File;", "didDir", "S0", "didFile", "T0", "Ljava/lang/Boolean;", "writeUIDOnConnected", "Lq4/q;", "value", "U0", "Lq4/q;", "A5", "(Lq4/q;)V", "idFile", "", "V0", "I", "z5", "(I)V", "didIndex", "Lf/c;", "", "Lf/c;", "getContent", "X0", "a", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DeviceIDWriterFragment extends DeviceFragment {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private d0 binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private SharedPreferences pref;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private File didDir;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private File didFile;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private Boolean writeUIDOnConnected;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private q idFile;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private int didIndex = -1;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    private final f.c getContent;

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f5834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f5835c;

        static {
            int[] iArr = new int[a.b.values().length];
            try {
                iArr[a.b.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.b.INCORRECT_STATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f5833a = iArr;
            int[] iArr2 = new int[v.values().length];
            try {
                iArr2[v.SET_DID.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[v.SET_DEV_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f5834b = iArr2;
            int[] iArr3 = new int[m.values().length];
            try {
                iArr3[m.f24307a.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            f5835c = iArr3;
        }
    }

    public static final class c implements TextWatcher {
        public c() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            int i10;
            DeviceIDWriterFragment deviceIDWriterFragment = DeviceIDWriterFragment.this;
            try {
                i10 = Integer.parseInt(String.valueOf(editable));
            } catch (NumberFormatException unused) {
                i10 = 0;
            }
            deviceIDWriterFragment.z5(i10);
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    public DeviceIDWriterFragment() {
        f.c cVarR3 = r3(new g.c(), new f.b() { // from class: q4.d
            @Override // f.b
            public final void a(Object obj) throws Throwable {
                DeviceIDWriterFragment.t5(this.f24299a, (Uri) obj);
            }
        });
        rd.m.d(cVarR3, "registerForActivityResult(...)");
        this.getContent = cVarR3;
    }

    private final void A5(q qVar) {
        this.idFile = qVar;
        d0 d0Var = this.binding;
        if (d0Var != null) {
            d0Var.f21045b.setText(qVar != null ? String.valueOf(qVar.b()) : null);
        }
    }

    private final void B5(boolean writeUID) {
        n0 n0VarX4 = X4();
        if (n0VarX4 == null) {
            Toast.makeText(x3(), "未指定链接", 0).show();
            return;
        }
        if (this.idFile == null) {
            Toast.makeText(x3(), "请先载入UID文件", 0).show();
            return;
        }
        if (!n0VarX4.n()) {
            this.writeUIDOnConnected = Boolean.valueOf(writeUID);
            n0VarX4.v(true);
        } else if (!D5() && writeUID) {
            E5();
        }
    }

    static /* synthetic */ void C5(DeviceIDWriterFragment deviceIDWriterFragment, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        deviceIDWriterFragment.B5(z10);
    }

    private final boolean D5() {
        n0 n0VarX4;
        q qVar = this.idFile;
        if (qVar == null) {
            return true;
        }
        int i10 = this.didIndex;
        if (i10 >= 0 && i10 < qVar.b()) {
            byte[] bArrC = qVar.c(this.didIndex);
            return (bArrC == null || (n0VarX4 = X4()) == null || !n0VarX4.a(v.SET_DID, Arrays.copyOf(bArrC, bArrC.length))) ? false : true;
        }
        d0 d0Var = this.binding;
        if (d0Var != null) {
            d0Var.f21046c.requestFocus();
        }
        Toast.makeText(x3(), "请设置有效的索引", 0).show();
        return true;
    }

    private final void E5() {
        q qVar = this.idFile;
        if (qVar == null) {
            return;
        }
        int i10 = this.didIndex;
        if (i10 < 0 || i10 >= qVar.b()) {
            d0 d0Var = this.binding;
            if (d0Var != null) {
                d0Var.f21046c.requestFocus();
            }
            Toast.makeText(x3(), "请设置有效的索引", 0).show();
            return;
        }
        byte[] bArrE = qVar.e(this.didIndex);
        if (bArrE == null) {
            Toast.makeText(x3(), "读取UID失败", 0).show();
            return;
        }
        n0 n0VarX4 = X4();
        if (n0VarX4 != null) {
            n0VarX4.a(v.SET_DEV_ID, Arrays.copyOf(bArrE, bArrE.length));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void t5(com.dw.ht.factory.DeviceIDWriterFragment r8, android.net.Uri r9) throws java.lang.Throwable {
        /*
            if (r9 != 0) goto L3
            return
        L3:
            android.content.Context r0 = r8.x3()
            android.content.ContentResolver r1 = r0.getContentResolver()
            java.io.File r0 = r8.didFile
            java.lang.String r2 = "didFile"
            r7 = 0
            if (r0 != 0) goto L16
            rd.m.o(r2)
            r0 = r7
        L16:
            r0.delete()
            java.io.File r0 = r8.didFile
            if (r0 != 0) goto L21
            rd.m.o(r2)
            r0 = r7
        L21:
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            a6.m.e(r1, r9, r0)
            java.lang.String r0 = "_display_name"
            java.lang.String[] r3 = new java.lang.String[]{r0}
            r5 = 0
            r6 = 0
            r4 = 0
            r2 = r9
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)
            if (r9 == 0) goto L4d
            boolean r0 = r9.moveToNext()     // Catch: java.lang.Throwable -> L4a
            r1 = 1
            if (r0 != r1) goto L4d
            r0 = 0
            java.lang.String r0 = r9.getString(r0)     // Catch: java.lang.Throwable -> L4a
            java.lang.String r1 = "getString(...)"
            rd.m.d(r0, r1)     // Catch: java.lang.Throwable -> L4a
            goto L4f
        L4a:
            r0 = move-exception
            r8 = r0
            goto L87
        L4d:
            java.lang.String r0 = ""
        L4f:
            dd.d0 r1 = dd.d0.f10897a     // Catch: java.lang.Throwable -> L4a
            od.a.a(r9, r7)
            int r9 = r0.length()
            if (r9 != 0) goto L62
            java.lang.String r9 = r2.getPath()
            java.lang.String r0 = java.lang.String.valueOf(r9)
        L62:
            android.content.SharedPreferences r9 = r8.pref
            if (r9 != 0) goto L6c
            java.lang.String r9 = "pref"
            rd.m.o(r9)
            goto L6d
        L6c:
            r7 = r9
        L6d:
            android.content.SharedPreferences$Editor r9 = r7.edit()
            java.lang.String r1 = "did.name"
            android.content.SharedPreferences$Editor r9 = r9.putString(r1, r0)
            r9.apply()
            m4.d0 r9 = r8.binding
            if (r9 == 0) goto L83
            android.widget.TextView r9 = r9.f21050g
            r9.setText(r0)
        L83:
            r8.u5()
            return
        L87:
            throw r8     // Catch: java.lang.Throwable -> L88
        L88:
            r0 = move-exception
            od.a.a(r9, r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dw.ht.factory.DeviceIDWriterFragment.t5(com.dw.ht.factory.DeviceIDWriterFragment, android.net.Uri):void");
    }

    private final void u5() {
        File file = this.didFile;
        q qVar = null;
        if (file == null) {
            rd.m.o("didFile");
            file = null;
        }
        if (!file.isFile()) {
            A5(null);
            return;
        }
        try {
            File file2 = this.didFile;
            if (file2 == null) {
                rd.m.o("didFile");
                file2 = null;
            }
            String path = file2.getPath();
            rd.m.d(path, "getPath(...)");
            qVar = new q(path);
        } catch (Exception e10) {
            Toast.makeText(x3(), e10.getLocalizedMessage(), 1).show();
        }
        A5(qVar);
        i.f24304a = qVar;
        s3.b.b("DeviceIDWriterFragment", "loadDID:" + qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v5(DeviceIDWriterFragment deviceIDWriterFragment, View view) {
        deviceIDWriterFragment.getContent.a("application/octet-stream");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w5(DeviceIDWriterFragment deviceIDWriterFragment, View view) {
        int i10 = deviceIDWriterFragment.didIndex;
        q qVar = deviceIDWriterFragment.idFile;
        if (i10 >= (qVar != null ? qVar.b() : 0)) {
            deviceIDWriterFragment.z5(0);
        } else {
            deviceIDWriterFragment.z5(deviceIDWriterFragment.didIndex + 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x5(DeviceIDWriterFragment deviceIDWriterFragment, View view) {
        int i10 = deviceIDWriterFragment.didIndex;
        if (i10 <= 0) {
            deviceIDWriterFragment.z5(0);
        } else {
            deviceIDWriterFragment.z5(i10 - 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y5(DeviceIDWriterFragment deviceIDWriterFragment, View view) {
        C5(deviceIDWriterFragment, false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void z5(int i10) {
        if (this.didIndex == i10) {
            return;
        }
        this.didIndex = i10;
        d0 d0Var = this.binding;
        if (d0Var != null) {
            String strValueOf = String.valueOf(i10);
            if (rd.m.a(d0Var.f21046c.getText().toString(), strValueOf)) {
                return;
            }
            d0Var.f21046c.setText(String.valueOf(i10));
            d0Var.f21046c.setSelection(strValueOf.length(), strValueOf.length());
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        SharedPreferences sharedPreferences = this.pref;
        if (sharedPreferences == null) {
            rd.m.o("pref");
            sharedPreferences = null;
        }
        sharedPreferences.edit().putInt("did.index", this.didIndex).apply();
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void M(n0 link, d packet) {
        rd.m.e(link, "link");
        rd.m.e(packet, "packet");
        super.M(link, packet);
        if (packet.m() == 2 && packet.n()) {
            int i10 = b.f5834b[v.d(packet.e()).ordinal()];
            if (i10 == 1) {
                a.b bVarL = packet.l();
                if ((bVarL != null ? b.f5833a[bVarL.ordinal()] : -1) == 1) {
                    E5();
                    return;
                }
                Toast.makeText(k1(), "设备DID写入失败(" + packet.l() + ')', 0).show();
                return;
            }
            if (i10 != 2) {
                return;
            }
            a.b bVarL2 = packet.l();
            int i11 = bVarL2 != null ? b.f5833a[bVarL2.ordinal()] : -1;
            if (i11 == 1) {
                z5(this.didIndex + 1);
                Toast.makeText(k1(), "设备ID写入成功", 0).show();
                if (link instanceof a.f) {
                    ((a.f) link).y();
                    return;
                }
                return;
            }
            if (i11 == 2) {
                Toast.makeText(k1(), "设备已经包含设备ID不能重复写入", 0).show();
                return;
            }
            Toast.makeText(k1(), "设备ID写入失败(" + packet.l() + ')', 0).show();
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void W0(n0 link) {
        rd.m.e(link, "link");
        super.W0(link);
        if (link.n()) {
            Boolean bool = this.writeUIDOnConnected;
            this.writeUIDOnConnected = null;
            if (bool != null) {
                B5(bool.booleanValue());
            }
        }
    }

    @mi.m(threadMode = ThreadMode.MAIN_ORDERED)
    public final void onMessageEvent(m event) {
        rd.m.e(event, "event");
        if (b.f5835c[event.ordinal()] == 1) {
            B5(false);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(contextX3);
        rd.m.d(defaultSharedPreferences, "getDefaultSharedPreferences(...)");
        this.pref = defaultSharedPreferences;
        File file = new File(contextX3.getFilesDir(), "did");
        this.didDir = file;
        file.mkdirs();
        File file2 = this.didDir;
        if (file2 == null) {
            rd.m.o("didDir");
            file2 = null;
        }
        this.didFile = new File(file2, "did.bin");
        if (i.f24304a == null) {
            u5();
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        d0 d0VarC = d0.c(inflater, container, false);
        rd.m.d(d0VarC, "inflate(...)");
        this.binding = d0VarC;
        A5(i.f24304a);
        SharedPreferences sharedPreferences = this.pref;
        SharedPreferences sharedPreferences2 = null;
        if (sharedPreferences == null) {
            rd.m.o("pref");
            sharedPreferences = null;
        }
        z5(sharedPreferences.getInt("did.index", 0));
        TextView textView = d0VarC.f21050g;
        SharedPreferences sharedPreferences3 = this.pref;
        if (sharedPreferences3 == null) {
            rd.m.o("pref");
        } else {
            sharedPreferences2 = sharedPreferences3;
        }
        textView.setText(sharedPreferences2.getString("did.name", ""));
        EditText editText = d0VarC.f21046c;
        rd.m.d(editText, "uidIndex");
        editText.addTextChangedListener(new c());
        d0VarC.f21049f.setOnClickListener(new View.OnClickListener() { // from class: q4.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceIDWriterFragment.v5(this.f24300a, view);
            }
        });
        d0VarC.f21047d.setOnClickListener(new View.OnClickListener() { // from class: q4.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceIDWriterFragment.w5(this.f24301a, view);
            }
        });
        d0VarC.f21048e.setOnClickListener(new View.OnClickListener() { // from class: q4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceIDWriterFragment.x5(this.f24302a, view);
            }
        });
        d0VarC.f21051h.setOnClickListener(new View.OnClickListener() { // from class: q4.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                DeviceIDWriterFragment.y5(this.f24303a, view);
            }
        });
        ConstraintLayout constraintLayoutB = d0VarC.b();
        rd.m.d(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }
}
