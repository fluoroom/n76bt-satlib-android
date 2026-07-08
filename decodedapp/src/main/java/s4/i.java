package s4;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ScrollView;
import android.widget.Toast;
import androidx.appcompat.app.c;
import com.benshikj.ht.R;
import com.dw.android.app.FragmentShowActivity;
import com.dw.ht.Cfg;
import com.dw.ht.IGateService;
import com.facebook.stetho.websocket.CloseCodes;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\u0005J\u000f\u0010\n\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u0005J\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0017\u0010\u0005J!\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001d\u0010\u0005J\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J;\u0010)\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\b\u0010(\u001a\u0004\u0018\u00010'H\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0004\b.\u0010/J)\u00104\u001a\u00020\u00062\u0006\u00100\u001a\u00020#2\u0006\u00101\u001a\u00020#2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u0002068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Ls4/i;", "Lv3/m0;", "Landroid/view/View$OnClickListener;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "<init>", "()V", "Ldd/d0;", "I4", "J4", "K4", "H4", "", "D4", "()Z", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "w2", "H2", "M2", "v", "onClick", "(Landroid/view/View;)V", "Landroidx/fragment/app/o;", "sender", "", "what", "arg1", "arg2", "", "obj", "f4", "(Landroidx/fragment/app/o;IIILjava/lang/Object;)Z", "Landroid/widget/CompoundButton;", "buttonView", "isChecked", "onCheckedChanged", "(Landroid/widget/CompoundButton;Z)V", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "m2", "(IILandroid/content/Intent;)V", "Lm4/s;", "F0", "Lm4/s;", "_binding", "E4", "()Lm4/s;", "binding", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i extends v3.m0 implements View.OnClickListener, CompoundButton.OnCheckedChangeListener {

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private m4.s _binding;

    public static final class a implements TextWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ m4.s f26516a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i f26517b;

        a(m4.s sVar, i iVar) {
            this.f26516a = sVar;
            this.f26517b = iVar;
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            rd.m.e(editable, "s");
            if (rg.q.P(editable.toString(), "\n", false, 2, null)) {
                String strF = rg.q.F(editable.toString(), "\n", "", false, 4, null);
                this.f26516a.f21523o.setText(strF);
                this.f26516a.f21523o.setSelection(strF.length());
            }
            this.f26517b.I4();
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            rd.m.e(charSequence, "s");
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            rd.m.e(charSequence, "s");
        }
    }

    private final boolean D4() {
        if (!TextUtils.isEmpty(E4().f21510b.getText().toString())) {
            return true;
        }
        E4().f21510b.requestFocus();
        Toast.makeText(k1(), R.string.pleaseProvideCallSign, 0).show();
        return false;
    }

    private final m4.s E4() {
        m4.s sVar = this._binding;
        rd.m.b(sVar);
        return sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F4(final i iVar, m4.s sVar, View view) {
        int size;
        String[] stringArray = iVar.x3().getResources().getStringArray(R.array.locationSource);
        List listQ = ed.q.q(Arrays.copyOf(stringArray, stringArray.length));
        Location aprsLocation = Cfg.O().getAprsLocation();
        if (aprsLocation != null) {
            listQ.add(o5.h.p(aprsLocation, 2));
        }
        int aprsLocationSource = Cfg.O().getAprsLocationSource();
        if (aprsLocationSource != 0) {
            size = -1;
            if (aprsLocationSource == 1 && Cfg.O().getAprsLocation() != null) {
                size = listQ.size() - 1;
            }
        } else {
            size = 0;
        }
        new c.a(iVar.x3()).z(sVar.f21517i.getTitle()).x((CharSequence[]) listQ.toArray(new String[0]), size, new DialogInterface.OnClickListener() { // from class: s4.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i10) {
                i.G4(this.f26479a, dialogInterface, i10);
            }
        }).C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G4(i iVar, DialogInterface dialogInterface, int i10) {
        rd.m.e(dialogInterface, "dialog");
        if (i10 == 0) {
            Cfg.O().setAprsLocationSource(0);
        } else if (i10 != 1) {
            Cfg.O().setAprsLocationSource(1);
        } else {
            Context contextK1 = iVar.k1();
            Context contextK12 = iVar.k1();
            iVar.startActivityForResult(com.dw.ht.fragments.j.k5(contextK1, contextK12 != null ? contextK12.getString(android.R.string.ok) : null), 1);
        }
        dialogInterface.dismiss();
        iVar.K4();
    }

    private final void H4() {
        m4.s sVar = this._binding;
        if (sVar == null) {
            return;
        }
        Cfg.q0(sVar.f21510b.getText().toString());
        Cfg.z0(sVar.f21520l.getText().toString());
        Cfg.L0(sVar.f21528t.isChecked());
        Cfg.M0(((long) sVar.f21516h.getNumber()) * 60000);
        Cfg.J0(sVar.f21521m.isChecked());
        Cfg.K0(sVar.f21522n.isChecked());
        Cfg.B0(sVar.f21527s.getValue());
        Cfg.C0(sVar.f21525q.isChecked());
        Cfg.x0(sVar.f21519k.isChecked());
        Cfg.A0(sVar.f21526r.isChecked());
        if (Cfg.O().getImperialUnits()) {
            Cfg.w0((int) (((double) sVar.f21511c.getNumber()) * o5.h.f23196a.h()));
        } else {
            Cfg.w0(sVar.f21511c.getNumber());
        }
        Cfg.o0(rg.q.F(sVar.f21523o.getText().toString(), "\n", "", false, 4, null));
        Cfg.y0(sVar.f21512d.isChecked());
        com.dw.ht.user.b bVar = com.dw.ht.user.b.f6853a;
        v4.q qVarG = bVar.b().g();
        String strR = Cfg.r();
        rd.m.d(strR, "getCallSign(...)");
        qVarG.I(strR);
        qVarG.Z(Cfg.N());
        String strL = Cfg.l();
        rd.m.d(strL, "getAprsSymbol(...)");
        qVarG.G(strL);
        boolean z10 = false;
        if (qVarG.A() && Cfg.W(false)) {
            z10 = true;
        }
        qVarG.W(z10);
        bVar.n(qVarG);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void I4() {
        String strJoin;
        String strD;
        v4.n nVar;
        m4.s sVar = this._binding;
        if (sVar == null) {
            return;
        }
        LinkedList linkedList = new LinkedList();
        String string = sVar.f21523o.getText().toString();
        if (!TextUtils.isEmpty(string)) {
            linkedList.add(string);
        }
        v4.l1 l1VarO = v4.u.w().o();
        v4.o oVar = l1VarO instanceof v4.o ? (v4.o) l1VarO : null;
        if (sVar.f21521m.isChecked()) {
            v4.r rVarO1 = oVar != null ? oVar.O1() : null;
            if (rVarO1 != null) {
                linkedList.add(rVarO1.n() + "MHz");
            } else {
                linkedList.add("438.500MHz");
            }
        }
        if (sVar.f21522n.isChecked()) {
            if (oVar == null || (nVar = oVar.Q) == null || (strD = nVar.d()) == null) {
                strD = "10.0V";
            }
            linkedList.add(strD);
        }
        Charset charsetForName = Charset.forName("utf-8");
        boolean z10 = false;
        while (true) {
            strJoin = TextUtils.join(" ", linkedList);
            rd.m.d(strJoin, "join(...)");
            rd.m.b(charsetForName);
            byte[] bytes = strJoin.getBytes(charsetForName);
            rd.m.d(bytes, "getBytes(...)");
            int i10 = 43;
            if (bytes.length <= 43) {
                break;
            }
            int length = strJoin.length();
            if (length <= 43) {
                i10 = length - 1;
            }
            string = string.substring(0, string.length() - (strJoin.length() - i10));
            rd.m.d(string, "substring(...)");
            linkedList.remove(0);
            linkedList.add(0, string);
            z10 = true;
        }
        if (z10) {
            strJoin = strJoin + '\n' + N1(R.string.note_aprs_message_is_cut_off);
        }
        sVar.f21524p.setText(strJoin);
    }

    private final void J4() {
        int iN = Cfg.N();
        if (iN <= 0) {
            E4().f21529u.setText(R.string.notSet);
        } else {
            E4().f21529u.setText(String.valueOf(iN));
        }
    }

    private final void K4() {
        m4.s sVar = this._binding;
        if (sVar == null) {
            return;
        }
        sVar.f21510b.setText(Cfg.r());
        sVar.f21520l.setText(Cfg.A());
        J4();
        sVar.f21528t.setChecked(Cfg.g0());
        Cfg.Settings settingsO = Cfg.O();
        Location aprsLocation = settingsO.getAprsLocation();
        int aprsLocationSource = settingsO.getAprsLocationSource();
        if (aprsLocationSource == 0) {
            sVar.f21517i.setSummary(R.string.system);
        } else if (aprsLocationSource != 1 || aprsLocation == null) {
            sVar.f21517i.setSummary("");
        } else {
            sVar.f21517i.setSummary(o5.h.p(aprsLocation, 2));
        }
        sVar.f21516h.setNumber((int) ((Cfg.J() / ((long) 60)) / ((long) CloseCodes.NORMAL_CLOSURE)));
        sVar.f21514f.setImageBitmap(o5.a.b().c(Cfg.l()));
        sVar.f21523o.setText(Cfg.k());
        sVar.f21521m.setChecked(Cfg.e0());
        sVar.f21522n.setChecked(Cfg.f0());
        sVar.f21512d.setChecked(Cfg.Z());
        sVar.f21525q.setChecked(Cfg.b0());
        sVar.f21519k.setChecked(Cfg.Y());
        sVar.f21526r.setChecked(Cfg.a0());
        if (Cfg.O().getImperialUnits()) {
            sVar.f21511c.setNumber((int) (((double) Cfg.z()) * o5.h.f23196a.g()));
            sVar.f21511c.setRightText("mi");
        } else {
            sVar.f21511c.setNumber(Cfg.z());
            sVar.f21511c.setRightText("km");
        }
        sVar.f21527s.setValue(Cfg.B());
        I4();
    }

    @Override // v3.v, androidx.fragment.app.o
    public void H2() {
        super.H2();
        H4();
    }

    @Override // v3.m0, v3.v, androidx.fragment.app.o
    public void M2() {
        super.M2();
        K4();
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        final m4.s sVarE4 = E4();
        sVarE4.f21517i.setOnClickListener(new View.OnClickListener() { // from class: s4.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                i.F4(this.f26450a, sVarE4, view2);
            }
        });
        K4();
    }

    @Override // v3.v
    protected boolean f4(androidx.fragment.app.o sender, int what, int arg1, int arg2, Object obj) {
        if (sender == null || !a6.q.d(sender.P1(), "ssid")) {
            return super.f4(sender, what, arg1, arg2, obj);
        }
        if (arg1 != -1) {
            return true;
        }
        Cfg.N0(arg2);
        J4();
        return true;
    }

    @Override // androidx.fragment.app.o
    public void m2(int requestCode, int resultCode, Intent data) {
        if (requestCode != 1) {
            super.m2(requestCode, resultCode, data);
            return;
        }
        if (resultCode != -1 || data == null) {
            return;
        }
        double doubleExtra = data.getDoubleExtra("longitude", Double.MAX_VALUE);
        double doubleExtra2 = data.getDoubleExtra("latitude", Double.MAX_VALUE);
        if (doubleExtra == Double.MAX_VALUE || doubleExtra2 == Double.MAX_VALUE) {
            return;
        }
        Location location = new Location("");
        location.setLongitude(doubleExtra);
        location.setLatitude(doubleExtra2);
        location.setTime(System.currentTimeMillis());
        Cfg.Settings settingsO = Cfg.O();
        settingsO.setAprsLocationSource(1);
        settingsO.setAprsLocation(location);
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        rd.m.e(buttonView, "buttonView");
        I4();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        rd.m.e(v10, "v");
        switch (v10.getId()) {
            case R.id.get_passcode /* 2131296794 */:
                v3.j.e(k1(), new Intent("android.intent.action.VIEW", Uri.parse("http://go.benshikj.com/aprs.get_passcode")));
                break;
            case R.id.icon_frame /* 2131296847 */:
                FragmentShowActivity.h2(x3(), null, d.class);
                break;
            case R.id.ssid /* 2131297438 */:
                String[] strArr = new String[16];
                for (int i10 = 0; i10 < 16; i10++) {
                    strArr[i10] = String.valueOf(i10);
                }
                strArr[0] = N1(R.string.notSet);
                v3.a0.l4(N1(R.string.setSSID), null, null, Cfg.N(), 0, 15, strArr).g4(j1(), "ssid");
                break;
            case R.id.verification_passcode /* 2131297643 */:
                if (D4()) {
                    if (rd.m.a(u5.a.p(E4().f21510b.getText().toString()), E4().f21520l.getText().toString())) {
                        Toast.makeText(k1(), R.string.thePasswordIsCorrect, 0).show();
                    } else {
                        Toast.makeText(k1(), R.string.incorrectPassword, 0).show();
                        E4().f21520l.requestFocus();
                    }
                    break;
                }
                break;
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        this._binding = m4.s.c(inflater, container, false);
        ScrollView scrollViewB = E4().b();
        rd.m.d(scrollViewB, "getRoot(...)");
        m4.s sVarE4 = E4();
        sVarE4.f21529u.setOnClickListener(this);
        sVarE4.f21513e.setOnClickListener(this);
        sVarE4.f21530v.setOnClickListener(this);
        sVarE4.f21515g.setOnClickListener(this);
        sVarE4.f21521m.setOnCheckedChangeListener(this);
        sVarE4.f21522n.setOnCheckedChangeListener(this);
        sVarE4.f21523o.addTextChangedListener(new r3.a(43));
        sVarE4.f21523o.addTextChangedListener(new a(sVarE4, this));
        y4(R.string.aprs_settings);
        return scrollViewB;
    }

    @Override // v3.v, androidx.fragment.app.o
    public void w2() {
        super.w2();
        IGateService.Companion companion = IGateService.INSTANCE;
        Context contextX3 = x3();
        rd.m.d(contextX3, "requireContext(...)");
        companion.c(contextX3);
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this._binding = null;
    }
}
