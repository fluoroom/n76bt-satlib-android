package s4;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.method.DigitsKeyListener;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.SpinnerAdapter;
import android.widget.Toast;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.IGateService;
import com.dw.ht.fragments.DeviceFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.simpleframework.xml.strategy.Name;
import w5.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\t\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u001d\u0010\f\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0017\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J1\u0010\u001a\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J\u0019\u0010\u001d\u001a\u00020\u00072\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0019\u0010!\u001a\u00020\u00072\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J-\u0010'\u001a\u0004\u0018\u00010\u001b2\u0006\u0010$\u001a\u00020#2\b\u0010&\u001a\u0004\u0018\u00010%2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010\u0006J!\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b+\u0010,J7\u00100\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\n2\b\u0010*\u001a\u0004\u0018\u00010\u001b2\u0006\u0010-\u001a\u00020\u00132\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J#\u00105\u001a\u00020\u00072\b\u00103\u001a\u0004\u0018\u0001022\b\u00104\u001a\u0004\u0018\u000102H\u0014¢\u0006\u0004\b5\u00106R\u0018\u0010:\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010F\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010ER*\u0010O\u001a\u00020G2\u0006\u0010H\u001a\u00020G8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR(\u0010T\u001a\u0004\u0018\u00010C2\b\u0010H\u001a\u0004\u0018\u00010C8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006U"}, d2 = {"Ls4/i5;", "Lcom/dw/ht/fragments/DeviceFragment;", "Landroid/view/View$OnClickListener;", "Landroid/text/TextWatcher;", "Landroid/widget/AdapterView$OnItemSelectedListener;", "<init>", "()V", "Ldd/d0;", "n5", "o5", "Landroid/widget/AdapterView;", "parent", "onNothingSelected", "(Landroid/widget/AdapterView;)V", "Landroid/text/Editable;", "s", "afterTextChanged", "(Landroid/text/Editable;)V", "", "", "start", "count", "after", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/view/View;", "v", "onClick", "(Landroid/view/View;)V", "Landroid/os/Bundle;", "savedInstanceState", "r2", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "v2", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "y2", "view", "Q2", "(Landroid/view/View;Landroid/os/Bundle;)V", "position", "", Name.MARK, "onItemSelected", "(Landroid/widget/AdapterView;Landroid/view/View;IJ)V", "Lv4/n0;", "oldLink", "newLink", "d5", "(Lv4/n0;Lv4/n0;)V", "Lm4/a;", "P0", "Lm4/a;", "binding", "", "Q0", "Ljava/util/List;", "addrList", "Lv4/m1;", "R0", "Lv4/m1;", "mode", "", "S0", "Ljava/lang/String;", "_receiver", "", "value", "T0", "Z", "getHideSendBy", "()Z", "p5", "(Z)V", "hideSendBy", "getReceiver", "()Ljava/lang/String;", "q5", "(Ljava/lang/String;)V", "receiver", "app_prodGoogleGmapRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i5 extends DeviceFragment implements View.OnClickListener, TextWatcher, AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private m4.a binding;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private List addrList;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private v4.m1 mode = v4.m1.APRS;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private String _receiver;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private boolean hideSendBy;

    private final void n5() {
        m4.a aVar = this.binding;
        if (aVar == null) {
            return;
        }
        String string = rg.q.W0(aVar.f20961c.getText().toString()).toString();
        if (TextUtils.isEmpty(string)) {
            aVar.f20961c.requestFocus();
            return;
        }
        if ((this.mode == v4.m1.BSS ? w5.d.p(rg.q.W0(string).toString()) : w5.a.x(rg.q.W0(string).toString())) < 0) {
            aVar.f20962d.setError(N1(R.string.errMessageTooLong));
            aVar.f20961c.requestFocus();
            return;
        }
        v4.l1 l1VarY4 = Y4();
        if (l1VarY4 != null) {
            l1VarY4.v(true);
            l1VarY4.T0(aVar.f20960b.getText().toString(), string, this.mode, v4.s.f30104d);
            o5();
            return;
        }
        if (this.mode == v4.m1.APRS) {
            w5.a aVarA = new a.C0414a().d(string).f(Cfg.j()).h(Cfg.s()).e(aVar.f20960b.getText().toString()).a();
            IGateService.Companion companion = IGateService.INSTANCE;
            rd.m.b(aVarA);
            if (companion.d(aVarA)) {
                o5();
                return;
            }
        }
        Toast.makeText(k1(), "您还没有绑定任何设备", 0).show();
    }

    private final void o5() {
        m4.a aVar;
        Context contextK1 = k1();
        if (contextK1 == null || (aVar = this.binding) == null) {
            return;
        }
        Object systemService = contextK1.getSystemService("input_method");
        rd.m.c(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(aVar.f20961c.getWindowToken(), 2);
        aVar.f20961c.getText().clear();
        Toast.makeText(contextK1, "消息已发送", 0).show();
    }

    @Override // v3.v, androidx.fragment.app.i0, androidx.fragment.app.o
    public void Q2(View view, Bundle savedInstanceState) {
        int iIndexOf;
        rd.m.e(view, "view");
        super.Q2(view, savedInstanceState);
        m4.a aVar = this.binding;
        if (aVar == null) {
            return;
        }
        aVar.f20960b.setText(this._receiver);
        if (this.mode == v4.m1.BSS) {
            aVar.f20960b.addTextChangedListener(new r3.a(126));
        } else {
            aVar.f20960b.setKeyListener(DigitsKeyListener.getInstance("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-"));
        }
        aVar.f20963e.setOnClickListener(this);
        aVar.f20961c.addTextChangedListener(this);
        Editable text = aVar.f20960b.getText();
        rd.m.d(text, "getText(...)");
        if (text.length() > 0) {
            aVar.f20961c.requestFocus();
        }
        aVar.f20965g.setVisibility(8);
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : Cfg.p(true)) {
            String strW = Cfg.w(defaultAdapter.getRemoteDevice(str));
            rd.m.d(strW, "getDevName(...)");
            arrayList.add(strW);
            arrayList2.add(Long.valueOf(v4.l1.W(str)));
        }
        this.addrList = arrayList2;
        c6.a aVar2 = new c6.a(k1(), android.R.layout.simple_spinner_item, android.R.id.text1, arrayList);
        aVar2.l(R.layout.support_simple_spinner_dropdown_item);
        aVar.f20964f.setAdapter((SpinnerAdapter) aVar2);
        v4.l1 l1VarY4 = Y4();
        Long lValueOf = l1VarY4 != null ? Long.valueOf(l1VarY4.q()) : null;
        if (lValueOf != null && (iIndexOf = arrayList2.indexOf(lValueOf)) >= 0) {
            aVar.f20964f.setSelection(iIndexOf);
        }
        if (!this.hideSendBy) {
            aVar.f20965g.setVisibility(0);
        }
        aVar.f20964f.setOnItemSelectedListener(this);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable s10) {
        m4.a aVar = this.binding;
        if (aVar == null) {
            return;
        }
        int iP = this.mode == v4.m1.BSS ? w5.d.p(rg.q.W0(String.valueOf(s10)).toString()) : w5.a.x(rg.q.W0(String.valueOf(s10)).toString());
        if (iP < 0) {
            aVar.f20962d.setError(N1(R.string.errMessageTooLong));
            aVar.f20963e.setEnabled(false);
        } else if (iP == 67) {
            aVar.f20962d.setError(null);
            aVar.f20963e.setEnabled(false);
        } else {
            aVar.f20962d.setError(null);
            aVar.f20963e.setEnabled(true);
        }
    }

    @Override // com.dw.ht.fragments.DeviceFragment
    protected void d5(v4.n0 oldLink, v4.n0 newLink) {
        m4.a aVar;
        super.d5(oldLink, newLink);
        if (!a2() || (aVar = this.binding) == null || newLink == null) {
            return;
        }
        long jQ = newLink.q();
        List list = this.addrList;
        Integer numValueOf = list != null ? Integer.valueOf(list.indexOf(Long.valueOf(jQ))) : null;
        if (numValueOf == null || numValueOf.intValue() < 0) {
            return;
        }
        aVar.f20964f.setSelection(numValueOf.intValue());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v10) {
        Integer numValueOf = v10 != null ? Integer.valueOf(v10.getId()) : null;
        if (numValueOf != null && numValueOf.intValue() == R.id.send) {
            n5();
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView parent, View view, int position, long id2) {
        List list = this.addrList;
        if (list == null) {
            return;
        }
        e5(((Number) list.get(position)).longValue());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView parent) {
        e5(0L);
    }

    public final void p5(boolean z10) {
        this.hideSendBy = z10;
        m4.a aVar = this.binding;
        if (aVar == null) {
            return;
        }
        if (z10) {
            aVar.f20965g.setVisibility(8);
        } else {
            aVar.f20965g.setVisibility(0);
        }
    }

    public final void q5(String str) {
        EditText editText;
        this._receiver = str;
        m4.a aVar = this.binding;
        if (aVar == null || (editText = aVar.f20960b) == null) {
            return;
        }
        editText.setText(str);
    }

    @Override // com.dw.ht.fragments.DeviceFragment, v3.f0, v3.v, androidx.fragment.app.o
    public void r2(Bundle savedInstanceState) {
        super.r2(savedInstanceState);
        Bundle bundleI1 = i1();
        if (bundleI1 == null) {
            return;
        }
        q5((String) bundleI1.get("TO"));
        String str = (String) bundleI1.get("DEV_ADDR");
        if (str != null) {
            e5(v4.l1.W(str));
            p5(true);
        }
        Integer num = (Integer) bundleI1.get("MODE");
        if (num != null) {
            v4.m1 m1VarD = v4.m1.d(num.intValue());
            rd.m.d(m1VarD, "valueOf(...)");
            this.mode = m1VarD;
        }
    }

    @Override // androidx.fragment.app.o
    public View v2(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rd.m.e(inflater, "inflater");
        m4.a aVarC = m4.a.c(inflater, container, false);
        this.binding = aVarC;
        rd.m.b(aVarC);
        return aVarC.b();
    }

    @Override // androidx.fragment.app.i0, androidx.fragment.app.o
    public void y2() {
        super.y2();
        this.binding = null;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence s10, int start, int count, int after) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence s10, int start, int before, int count) {
    }
}
