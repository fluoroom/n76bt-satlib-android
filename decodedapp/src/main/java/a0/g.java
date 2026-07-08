package a0;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.h0;
import androidx.lifecycle.m;
import m0.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends Activity implements androidx.lifecycle.t, m.a {

    /* JADX INFO: renamed from: a */
    private final androidx.collection.i f26a = new androidx.collection.i(0, 1, null);

    /* JADX INFO: renamed from: b */
    private final androidx.lifecycle.v f27b = new androidx.lifecycle.v(this);

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x003a, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0043, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x004a, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x004c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x004d, code lost:
    
        return false;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean S(java.lang.String[] r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L5e
            int r1 = r4.length
            if (r1 != 0) goto L7
            goto L5e
        L7:
            r4 = r4[r0]
            int r1 = r4.hashCode()
            r2 = 1
            switch(r1) {
                case -645125871: goto L4e;
                case 100470631: goto L3d;
                case 472614934: goto L34;
                case 1159329357: goto L23;
                case 1455016274: goto L12;
                default: goto L11;
            }
        L11:
            goto L5e
        L12:
            java.lang.String r1 = "--autofill"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L1b
            goto L5e
        L1b:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r4 < r1) goto L22
            return r2
        L22:
            return r0
        L23:
            java.lang.String r1 = "--contentcapture"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L2c
            goto L5e
        L2c:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r4 < r1) goto L33
            return r2
        L33:
            return r0
        L34:
            java.lang.String r1 = "--list-dumpables"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L46
            goto L5e
        L3d:
            java.lang.String r1 = "--dump-dumpable"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L46
            goto L5e
        L46:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r4 < r1) goto L4d
            return r2
        L4d:
            return r0
        L4e:
            java.lang.String r1 = "--translation"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L57
            goto L5e
        L57:
            int r4 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r4 < r1) goto L5e
            return r2
        L5e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a0.g.S(java.lang.String[]):boolean");
    }

    protected final boolean R(String[] strArr) {
        return !S(strArr);
    }

    @Override // androidx.lifecycle.t
    public androidx.lifecycle.m S0() {
        return this.f27b;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        rd.m.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        rd.m.d(decorView, "getDecorView(...)");
        if (m0.m.d(decorView, keyEvent)) {
            return true;
        }
        return m0.m.e(this, decorView, this, keyEvent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        rd.m.e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        rd.m.d(decorView, "getDecorView(...)");
        if (m0.m.d(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        h0.INSTANCE.c(this);
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        rd.m.e(bundle, "outState");
        this.f27b.n(m.b.f2653c);
        super.onSaveInstanceState(bundle);
    }

    @Override // m0.m.a
    public boolean w(KeyEvent keyEvent) {
        rd.m.e(keyEvent, "event");
        return super.dispatchKeyEvent(keyEvent);
    }
}
