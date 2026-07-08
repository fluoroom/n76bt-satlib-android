package v3;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.appcompat.app.c;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends p implements DialogInterface.OnClickListener {
    private a F0;
    private NumberPicker G0;

    public interface a {
        void a(a0 a0Var, int i10, int i11);
    }

    private void k4(Bundle bundle, View view) {
        NumberPicker numberPicker = (NumberPicker) view.findViewById(k3.f.f19206z);
        numberPicker.setMaxValue(bundle.getInt("max"));
        numberPicker.setMinValue(bundle.getInt("min"));
        numberPicker.setValue(bundle.getInt("def"));
        numberPicker.setDisplayedValues(bundle.getStringArray("DISPLAYED_VALUES"));
        this.G0 = numberPicker;
    }

    public static a0 l4(String str, CharSequence charSequence, CharSequence charSequence2, int i10, int i11, int i12, String[] strArr) {
        a0 a0Var = new a0();
        Bundle bundle = new Bundle(4);
        bundle.putString("title", str);
        bundle.putCharSequence("message", charSequence);
        bundle.putCharSequence("text_right", charSequence2);
        bundle.putInt("def", i10);
        bundle.putInt("min", i11);
        bundle.putInt("max", i12);
        bundle.putStringArray("DISPLAYED_VALUES", strArr);
        a0Var.E3(bundle);
        return a0Var;
    }

    @Override // androidx.fragment.app.n
    public Dialog Z3(Bundle bundle) {
        return m4(bundle, e1());
    }

    public Dialog m4(Bundle bundle, Context context) {
        Bundle bundleI1 = i1();
        c.a aVar = new c.a(context);
        View viewInflate = ((LayoutInflater) aVar.b().getSystemService("layout_inflater")).inflate(k3.g.f19215i, (ViewGroup) null);
        aVar.B(viewInflate);
        TextView textView = (TextView) viewInflate.findViewById(k3.f.f19205y);
        TextView textView2 = (TextView) viewInflate.findViewById(k3.f.O);
        CharSequence charSequence = bundleI1.getCharSequence("message");
        String string = bundleI1.getString("title");
        k4(bundleI1, viewInflate);
        textView2.setText(bundleI1.getCharSequence("text_right"));
        if (textView == null) {
            aVar.k(charSequence);
        } else if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setText(charSequence);
            if (charSequence.length() > 20) {
                textView.setGravity(8388611);
            }
        }
        if (!TextUtils.isEmpty(string)) {
            aVar.z(string);
        }
        aVar.m(R.string.cancel, null).t(R.string.ok, this);
        return aVar.a();
    }

    public void n4(a aVar) {
        this.F0 = aVar;
    }

    @Override // v3.p, android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        this.G0.clearFocus();
        int value = this.G0.getValue();
        a aVar = this.F0;
        if (aVar != null) {
            aVar.a(this, i10, value);
        } else {
            j4(k3.f.T, i10, value, null);
        }
    }
}
