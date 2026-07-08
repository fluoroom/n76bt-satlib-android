package com.dw.ht.fragments;

import a6.y;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.ClipboardManager;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.PopupMenu;
import androidx.fragment.app.o;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnTouch;
import c6.k;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.IGateService;
import com.dw.ht.Main;
import com.dw.ht.activitys.PictureSendActivity;
import com.dw.ht.fragments.BottomActionFragment;
import com.dw.ht.q;
import com.dw.ht.widget.DTMFKeyboard;
import com.dw.util.concurrent.a;
import com.dw.widget.ActionButton;
import m0.o0;
import mi.m;
import org.greenrobot.eventbus.ThreadMode;
import p3.b;
import v4.a0;
import v4.c0;
import v4.l1;
import v4.m1;
import v4.n0;
import v4.r;
import v4.s;
import w4.c;
import w5.a;
import w5.c;

/* JADX INFO: loaded from: classes.dex */
public class BottomActionFragment extends DeviceFragment implements View.OnClickListener, TextWatcher, a.InterfaceC0105a, DTMFKeyboard.a, View.OnTouchListener {

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    private static final int[] f6131a1;
    View Q0;
    private boolean S0;
    private m5.f T0;
    private p5.c V0;
    private boolean W0;
    private boolean X0;
    private boolean Y0;
    private BluetoothDevice Z0;

    @BindView
    View mBigTxButton;

    @BindView
    DTMFKeyboard mDTMFKeyboard;

    @BindView
    View mMorseCodeBar;

    @BindView
    TextView mMorseCodeOutputView;

    @BindView
    ActionButton mMorseCodePlayButton;

    @BindView
    ActionButton mPlaceButton;

    @BindView
    ActionButton mSendButton;

    @BindView
    View mSmallTxButton;

    @BindView
    EditText mTextInput;

    @BindView
    ActionButton mTypeButton;
    private boolean P0 = false;
    private int R0 = -1;
    private m1 U0 = m1.AUTO;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomActionFragment.this.mMorseCodePlayButton.setImageResource(R.drawable.ic_volume_up_24dp);
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f6133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f6134b;

        static {
            int[] iArr = new int[q.a.values().length];
            f6134b = iArr;
            try {
                iArr[q.a.f6671a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            int[] iArr2 = new int[n0.c.values().length];
            f6133a = iArr2;
            try {
                iArr2[n0.c.Sending.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    static {
        int[] iArr = new int[4];
        f6131a1 = iArr;
        if (Cfg.f5482d) {
            iArr[0] = R.drawable.ic_add_24dp;
            iArr[1] = R.drawable.ic_add_24dp;
            iArr[2] = R.drawable.ic_add_24dp;
            iArr[3] = R.drawable.ic_add_24dp;
            return;
        }
        iArr[0] = R.drawable.ic_voice_24dp;
        iArr[1] = R.drawable.ic_morse_code;
        iArr[2] = R.drawable.ic_keyboard_24dp;
        iArr[3] = R.drawable.ic_dialpad_24dp;
    }

    private void A5() {
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        this.W0 = false;
        l1VarY4.p1();
        t5();
    }

    private void B5() {
        ActionButton actionButton = this.mSendButton;
        if (actionButton == null) {
            return;
        }
        if (this.R0 == 0) {
            actionButton.setVisibility(8);
            this.mPlaceButton.setVisibility(0);
            return;
        }
        n0.c cVarR = n0.c.Idle;
        if (Y4() != null) {
            cVarR = Y4().R();
        }
        if (b.f6133a[cVarR.ordinal()] == 1) {
            this.mSendButton.setImageResource(R.drawable.ic_stop_24dp);
            this.mSendButton.setVisibility(0);
            this.mPlaceButton.setVisibility(8);
            return;
        }
        this.mSendButton.setImageResource(R.drawable.ic_send_24dp);
        boolean zIsEmpty = TextUtils.isEmpty(this.mTextInput.getText().toString().trim());
        this.mSendButton.setEnabled(!zIsEmpty);
        this.mMorseCodePlayButton.setEnabled(!zIsEmpty);
        if (this.X0) {
            this.mPlaceButton.setVisibility(8);
            this.mSendButton.setVisibility(0);
        } else if (!zIsEmpty || this.R0 == 3) {
            this.mSendButton.setVisibility(0);
            this.mPlaceButton.setVisibility(8);
        } else {
            this.mSendButton.setVisibility(8);
            this.mPlaceButton.setVisibility(0);
        }
    }

    private void C5() {
        if (this.mMorseCodeOutputView != null && this.R0 == 1) {
            if (Y4() == null || Y4().R() != n0.c.Sending) {
                String strTrim = this.mTextInput.getText().toString().trim();
                if (!strTrim.isEmpty()) {
                    if (Cfg.O().morseCodeAddCT) {
                        strTrim = "\u0001" + strTrim;
                    }
                    if (Cfg.O().morseCodeAddSK) {
                        strTrim = strTrim + "\u0004";
                    }
                }
                this.mMorseCodeOutputView.setText(a4.a.b(strTrim));
            }
        }
    }

    private void D5() {
        l1 l1VarY4;
        if (this.V0 == null || (l1VarY4 = Y4()) == null || !a2()) {
            return;
        }
        this.V0.d(l1VarY4.R(), l1VarY4.S());
    }

    public static /* synthetic */ boolean o5(BottomActionFragment bottomActionFragment, c0 c0Var, MenuItem menuItem) {
        bottomActionFragment.getClass();
        switch (menuItem.getItemId()) {
            case R.id.audio /* 2131296424 */:
                bottomActionFragment.x5(0);
                return true;
            case R.id.dtmf /* 2131296684 */:
                bottomActionFragment.x5(3);
                return true;
            case R.id.morse_code /* 2131297018 */:
                bottomActionFragment.x5(1);
                return true;
            case R.id.picture /* 2131297178 */:
                Intent intent = new Intent(bottomActionFragment.k1(), (Class<?>) PictureSendActivity.class);
                intent.putExtra("com.dw.ht.intent.extras.DEV_ID", bottomActionFragment.V4());
                bottomActionFragment.O3(intent);
                return true;
            case R.id.t_call /* 2131297470 */:
                if (c0Var != null) {
                    c0Var.P(c.a.f31098b.b());
                }
                return true;
            case R.id.text /* 2131297509 */:
                bottomActionFragment.x5(2);
                return true;
            default:
                return false;
        }
    }

    private int p5(String str) {
        String strSubstring;
        String strSubstring2;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        int iIndexOf = str.indexOf(":");
        if (iIndexOf > 0) {
            strSubstring = str.substring(0, iIndexOf);
            strSubstring2 = str.substring(iIndexOf + 1, str.length());
        } else {
            strSubstring = "";
            strSubstring2 = str;
        }
        m1 m1Var = this.U0;
        if (m1Var == m1.AUTO) {
            m1Var = (Cfg.V() && c.a.o(strSubstring)) ? m1.APRS : m1.BSS;
        }
        if (m1Var != m1.APRS) {
            int iP = w5.d.p(strSubstring);
            return iP < 0 ? iP : w5.d.p(strSubstring2);
        }
        if (c.a.o(strSubstring)) {
            str = strSubstring2;
        }
        return w5.a.x(str);
    }

    private void q5() {
        InputMethodManager inputMethodManager = (InputMethodManager) k1().getSystemService("input_method");
        if (inputMethodManager == null || !inputMethodManager.isActive(this.mTextInput)) {
            return;
        }
        inputMethodManager.hideSoftInputFromWindow(this.mTextInput.getWindowToken(), 0);
    }

    private boolean r5() {
        if (Cfg.f5482d) {
            return false;
        }
        return Y4() == null || Y4().w0();
    }

    private void s5(b.a aVar) {
        this.Q0.setKeepScreenOn(true);
        this.V0.a(aVar);
        Vibrator vibrator = (Vibrator) k1().getSystemService("vibrator");
        if (vibrator != null) {
            vibrator.vibrate(25L);
        }
        n4.b.c().f(Y4());
    }

    private void t5() {
        this.Y0 = false;
        p5.c cVar = this.V0;
        if (cVar != null) {
            cVar.a(null);
            this.V0.dismiss();
        }
        View view = this.Q0;
        if (view != null) {
            view.setKeepScreenOn(false);
        }
    }

    private boolean u5(l1 l1Var, String str) {
        String strSubstring;
        String strSubstring2;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int iIndexOf = str.indexOf(":");
        String str2 = "";
        if (iIndexOf > 0) {
            strSubstring2 = str.substring(0, iIndexOf);
            strSubstring = str.substring(iIndexOf + 1, str.length());
        } else {
            strSubstring = str;
            strSubstring2 = "";
        }
        m1 m1Var = this.U0;
        if (m1Var == m1.AUTO) {
            m1Var = (Cfg.V() && c.a.o(strSubstring2)) ? m1.APRS : m1.BSS;
        }
        if (m1Var == m1.APRS) {
            if (c.a.o(strSubstring2)) {
                str = strSubstring;
                str2 = strSubstring2;
            }
            if (w5.a.x(str) < 0) {
                Toast.makeText(k1(), R.string.errMessageTooLong, 1).show();
                return false;
            }
            if (l1Var == null) {
                w5.a aVarA = new a.C0414a().d(str).f(Cfg.j()).h(Cfg.s()).e(str2).a();
                if (!IGateService.INSTANCE.d(aVarA)) {
                    return false;
                }
                d5.g.q(281474976710656L, 0L, 0, 2, aVarA);
                w5(str2);
                return true;
            }
            s sVar = s.f30103c;
            if (!l1Var.u0(true, sVar)) {
                return false;
            }
            l1Var.v(true);
            l1Var.N0(str2, str, sVar);
            strSubstring2 = str2;
        } else {
            if (l1Var == null || !l1Var.u0(true, null)) {
                return false;
            }
            l1Var.v(true);
            if (!l1Var.T0(strSubstring2, strSubstring, m1Var, null)) {
                Toast.makeText(k1(), R.string.errMessageTooLong, 1).show();
                return false;
            }
        }
        w5(strSubstring2);
        return true;
    }

    private void w5(String str) {
        if (TextUtils.isEmpty(str)) {
            this.mTextInput.setText((CharSequence) null);
            return;
        }
        this.mTextInput.setText(z5.a.e(str + ":", y.b(k1(), R.attr.colorPrimary).intValue()));
        EditText editText = this.mTextInput;
        editText.setSelection(editText.getText().length());
    }

    private void y5() {
        InputMethodManager inputMethodManager = (InputMethodManager) k1().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput(this.mTextInput, 0);
        }
    }

    private void z5(BluetoothDevice bluetoothDevice) {
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        if (this.V0 == null) {
            this.V0 = new p5.c(k1());
            D5();
        }
        this.V0.e(this.mSendButton);
        try {
            c0 c0VarW4 = W4();
            if (c0VarW4 != null && c0VarW4.v0()) {
                r rVarD2 = c0VarW4.d2(-1);
                if (rVarD2 != null && !rVarD2.w()) {
                    this.V0.b(R.string.err_ch_tx_inhibit);
                    return;
                }
                if (rVarD2 != null && rVarD2.C && c0VarW4.Y().f29914c && c0VarW4.Y().f29919h == c0VarW4.f2(false)) {
                    this.V0.b(R.string.err_ch_busy);
                    return;
                } else if (!c0VarW4.Y().f29912a) {
                    this.V0.b(R.string.shutdown);
                    return;
                }
            }
            b.a aVarO1 = l1VarY4.o1(bluetoothDevice);
            if (aVarO1 != null) {
                this.W0 = false;
                s5(aVarO1);
            } else {
                if (l1VarY4.i()) {
                    return;
                }
                this.W0 = true;
                this.Z0 = bluetoothDevice;
                l1VarY4.L(true);
            }
        } catch (IllegalStateException e10) {
            this.V0.c(e10.getLocalizedMessage());
        }
    }

    @Override // com.dw.ht.widget.DTMFKeyboard.a
    public void C(DTMFKeyboard dTMFKeyboard, int i10) {
        switch (i10) {
            case R.id.backspace /* 2131296444 */:
                String string = this.mTextInput.getText().toString();
                if (string.length() > 0) {
                    this.mTextInput.setText(string.substring(0, string.length() - 1));
                }
                break;
            case R.id.copy /* 2131296590 */:
                if (!TextUtils.isEmpty(this.mTextInput.getText())) {
                    a6.e.a(k1(), this.mTextInput.getText(), null, null);
                    Toast.makeText(k1(), k1().getString(R.string.toast_text_copied), 0).show();
                    break;
                }
                break;
            case R.id.dtmf_send /* 2131296687 */:
                send();
                break;
            case R.id.paste /* 2131297167 */:
                CharSequence text = ((ClipboardManager) k1().getSystemService("clipboard")).getText();
                if (!TextUtils.isEmpty(text)) {
                    StringBuilder sb2 = new StringBuilder();
                    int length = text.length();
                    for (int i11 = 0; i11 < length; i11++) {
                        char cCharAt = text.charAt(i11);
                        if (Character.isDigit(cCharAt) || cCharAt == '*' || cCharAt == '#') {
                            sb2.append(cCharAt);
                        }
                    }
                    this.mTextInput.setText(sb2.toString());
                    break;
                }
                break;
        }
    }

    @Override // com.dw.ht.widget.DTMFKeyboard.a
    public void F(DTMFKeyboard dTMFKeyboard, char c10) {
        this.mTextInput.setText(((Object) this.mTextInput.getText()) + String.valueOf(c10));
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        if (this.Y0) {
            A5();
        } else {
            t5();
        }
    }

    @Override // com.dw.ht.widget.DTMFKeyboard.a
    public void M0(DTMFKeyboard dTMFKeyboard, char c10) {
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void N2(Bundle bundle) {
        bundle.putInt("mType", this.R0);
        super.N2(bundle);
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void R4(n0 n0Var, n0 n0Var2) {
        super.R4(n0Var, n0Var2);
        if (this.Y0) {
            A5();
        } else {
            t5();
        }
    }

    @Override // com.dw.ht.widget.DTMFKeyboard.a
    public void Z(DTMFKeyboard dTMFKeyboard, int i10) {
        if (i10 != R.id.backspace) {
            return;
        }
        this.mTextInput.setText((CharSequence) null);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        while (true) {
            int iP5 = p5(editable.toString());
            if (iP5 >= 0) {
                return;
            }
            int i10 = -iP5;
            editable.delete(editable.length() - (i10 > 3 ? i10 / 3 : 1), editable.length());
        }
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        if (i11 == 1 && i12 == 0 && i10 == charSequence.length() - 1 && charSequence.charAt(i10) == ':' && c.a.o(charSequence.toString().substring(0, i10))) {
            this.mTextInput.post(new Runnable() { // from class: s4.b0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f26368a.mTextInput.getText().clear();
                }
            });
        }
    }

    @Override // v3.f0, v3.v
    protected boolean c4() {
        if (this.R0 != 3) {
            return super.c4();
        }
        x5(0);
        return true;
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(n0 n0Var, n0 n0Var2) {
        super.d5(n0Var, n0Var2);
        D5();
        if (this.R0 != 0 || r5()) {
            return;
        }
        x5(2);
    }

    @Override // v3.v
    protected boolean f4(o oVar, int i10, int i11, int i12, Object obj) {
        switch (i10) {
            case R.id.send_aprs_message /* 2131297350 */:
            case R.id.send_bss_message /* 2131297351 */:
                x5(2);
                this.U0 = i10 == R.id.send_aprs_message ? m1.APRS : m1.BSS;
                this.mTextInput.requestFocus();
                w5(obj.toString());
                y5();
                return true;
            default:
                return super.f4(oVar, i10, i11, i12, obj);
        }
    }

    @Override // com.dw.util.concurrent.a.InterfaceC0105a
    public void i(com.dw.util.concurrent.a aVar) {
        this.mMorseCodePlayButton.post(new a());
        this.T0 = null;
    }

    @Override // androidx.fragment.app.o
    public void m2(int i10, int i11, Intent intent) {
        l1 l1VarY4;
        if (i10 != 1) {
            super.m2(i10, i11, intent);
            return;
        }
        if (i11 == -1 && (l1VarY4 = Y4()) != null) {
            s sVar = s.f30104d;
            if (l1VarY4.u0(true, sVar)) {
                double doubleExtra = intent.getDoubleExtra("longitude", Double.MAX_VALUE);
                double doubleExtra2 = intent.getDoubleExtra("latitude", Double.MAX_VALUE);
                if (doubleExtra == Double.MAX_VALUE || doubleExtra2 == Double.MAX_VALUE) {
                    return;
                }
                Location location = new Location("");
                location.setLongitude(doubleExtra);
                location.setLatitude(doubleExtra2);
                location.setTime(System.currentTimeMillis());
                T4();
                l1VarY4.M0(location, sVar);
            }
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v4.n0.d
    public void o0(n0 n0Var) {
        super.o0(n0Var);
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            return;
        }
        if (l1VarY4.i()) {
            if (this.S0) {
                send();
            } else if (this.W0) {
                this.W0 = false;
                try {
                    b.a aVarO1 = l1VarY4.o1(this.Z0);
                    if (aVarO1 != null) {
                        s5(aVarO1);
                    }
                } catch (IllegalStateException e10) {
                    Toast.makeText(Main.f5555g, e10.getLocalizedMessage(), 1).show();
                }
            }
        }
        B5();
        D5();
        C5();
    }

    @Override // android.view.View.OnClickListener
    @OnClick
    public void onClick(View view) {
        int id2 = view.getId();
        if (id2 != R.id.morse_code_play) {
            if (id2 != R.id.type) {
                return;
            }
            final c0 c0VarW4 = W4();
            this.S0 = false;
            k kVar = new k(view.getContext(), view);
            kVar.e(new PopupMenu.OnMenuItemClickListener() { // from class: s4.c0
                @Override // androidx.appcompat.widget.PopupMenu.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return BottomActionFragment.o5(this.f26385a, c0VarW4, menuItem);
                }
            });
            kVar.c(R.menu.send_mode);
            if (c0VarW4 != null && c0VarW4.Q.P()) {
                kVar.a().findItem(R.id.picture).setVisible(false);
            }
            if (!r5()) {
                kVar.a().findItem(R.id.audio).setVisible(false);
            }
            if (c0VarW4 == null || !c0VarW4.Q.t(a0.d.DO_PROG_FUNC)) {
                kVar.a().findItem(R.id.t_call).setVisible(false);
            }
            kVar.f();
            return;
        }
        m5.f fVar = this.T0;
        if (fVar != null) {
            fVar.cancel();
            return;
        }
        String strTrim = this.mTextInput.getText().toString().trim();
        if (strTrim.isEmpty()) {
            return;
        }
        if (Cfg.O().morseCodeAddCT) {
            strTrim = "\u0001" + strTrim;
        }
        if (Cfg.O().morseCodeAddSK) {
            strTrim = strTrim + "\u0004";
        }
        m5.f fVar2 = new m5.f(strTrim);
        this.T0 = fVar2;
        fVar2.start();
        this.T0.addOnStopListener(this);
        this.mMorseCodePlayButton.setImageResource(R.drawable.ic_stop_24dp);
    }

    @m(priority = 1, threadMode = ThreadMode.POSTING)
    public void onMessageEvent(p4.c cVar) {
        if (cVar.f23909c == null && Cfg.O().getPttLock()) {
            if (cVar.f23908b == 1) {
                l1 l1VarY4 = Y4();
                if (l1VarY4 == null || !l1VarY4.q0()) {
                    z5(cVar.f23909c);
                } else {
                    n4.b.c().f(null);
                    A5();
                }
                mi.c.e().c(cVar);
                return;
            }
            return;
        }
        int i10 = cVar.f23908b;
        if (i10 == 1) {
            z5(cVar.f23909c);
            mi.c.e().c(cVar);
        } else {
            if (i10 != 2) {
                return;
            }
            n4.b.c().f(null);
            A5();
            mi.c.e().c(cVar);
        }
    }

    @OnClick
    void onPlaceButtonClick() {
        startActivityForResult(j.j5(k1()), 1);
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        C5();
        B5();
    }

    @Override // android.view.View.OnTouchListener
    @OnTouch
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (Y4() == null) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            z5(null);
            o0.t0(this.mBigTxButton, a6.k.b(view.getContext(), 12.0f));
            this.Y0 = true;
        } else if (action == 1 || action == 3) {
            A5();
            o0.t0(this.mBigTxButton, a6.k.b(view.getContext(), 6.0f));
            this.Y0 = false;
        }
        return true;
    }

    @OnClick
    void send() {
        l1 l1VarY4 = Y4();
        if (l1VarY4 == null) {
            if (this.R0 == 2) {
                String strTrim = this.mTextInput.getText().toString().trim();
                if (!TextUtils.isEmpty(strTrim) && u5(null, strTrim)) {
                    this.mTextInput.setText((CharSequence) null);
                    return;
                }
                return;
            }
            return;
        }
        if (l1VarY4.R() == n0.c.Sending) {
            l1VarY4.p1();
            return;
        }
        this.S0 = false;
        String strTrim2 = this.mTextInput.getText().toString().trim();
        if (TextUtils.isEmpty(strTrim2)) {
            return;
        }
        int i10 = this.R0;
        if (i10 != 1) {
            if (i10 != 3) {
                u5(l1VarY4, strTrim2);
                return;
            } else {
                if (!l1VarY4.i()) {
                    l1VarY4.L(true);
                    this.S0 = true;
                    return;
                }
                l1VarY4.U0(strTrim2);
            }
        } else {
            if (!l1VarY4.i()) {
                l1VarY4.L(true);
                this.S0 = true;
                return;
            }
            l1VarY4.Y0(strTrim2);
        }
        this.mTextInput.setText((CharSequence) null);
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate = layoutInflater.inflate(R.layout.bottom_action_bar, viewGroup, false);
        ButterKnife.a(this, viewInflate);
        this.Q0 = this.mSmallTxButton;
        this.mDTMFKeyboard.setOnButtonClickListener(this);
        this.mSendButton.setVisibility(8);
        this.mTextInput.addTextChangedListener(this);
        this.mMorseCodeOutputView.setMovementMethod(new ScrollingMovementMethod());
        if (bundle != null) {
            x5(bundle.getInt("mType"));
            return viewInflate;
        }
        x5(0);
        return viewInflate;
    }

    public void v5(boolean z10) {
        if (z10 == this.X0) {
            return;
        }
        this.X0 = z10;
        if (z10) {
            this.mTypeButton.setVisibility(8);
            x5(2);
            B5();
        }
    }

    public void x5(int i10) {
        int i11 = i10 % 4;
        if (!r5() && i11 == 0) {
            i11 = 2;
        }
        if (this.R0 == i11) {
            return;
        }
        this.R0 = i11;
        this.mTextInput.setVisibility(8);
        this.Q0.setVisibility(8);
        this.mMorseCodeBar.setVisibility(8);
        this.mDTMFKeyboard.setVisibility(8);
        this.U0 = m1.AUTO;
        if (i11 != 0) {
            if (i11 == 1) {
                this.mMorseCodeBar.setVisibility(0);
                C5();
            } else if (i11 == 3) {
                this.mTextInput.setInputType(0);
                this.mTextInput.setText((CharSequence) null);
                this.mTextInput.setVisibility(0);
                this.mDTMFKeyboard.setVisibility(0);
                q5();
            }
            this.mTextInput.setVisibility(0);
            this.mTextInput.setInputType(131073);
            this.mTextInput.requestFocus();
        } else {
            this.Q0.setVisibility(0);
            q5();
        }
        this.mTypeButton.setImageResource(f6131a1[i11]);
        B5();
    }

    @m(threadMode = ThreadMode.POSTING)
    public void onMessageEvent(q qVar) {
        if (b.f6134b[qVar.a().ordinal()] != 1) {
            return;
        }
        onPlaceButtonClick();
    }
}
