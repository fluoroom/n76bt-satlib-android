package androidx.preference;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import i1.c;

/* JADX INFO: loaded from: classes.dex */
public class DropDownPreference extends ListPreference {
    private final Context X;
    private final ArrayAdapter Y;
    private Spinner Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    private final AdapterView.OnItemSelectedListener f2755a0;

    class a implements AdapterView.OnItemSelectedListener {
        a() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
            if (i10 >= 0) {
                String string = DropDownPreference.this.O()[i10].toString();
                if (string.equals(DropDownPreference.this.P()) || !DropDownPreference.this.a(string)) {
                    return;
                }
                DropDownPreference.this.R(string);
            }
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    public DropDownPreference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, c.f15667c);
    }

    private void T() {
        this.Y.clear();
        if (M() != null) {
            for (CharSequence charSequence : M()) {
                this.Y.add(charSequence.toString());
            }
        }
    }

    protected ArrayAdapter S() {
        return new ArrayAdapter(this.X, R.layout.simple_spinner_dropdown_item);
    }

    @Override // androidx.preference.Preference
    protected void w() {
        super.w();
        ArrayAdapter arrayAdapter = this.Y;
        if (arrayAdapter != null) {
            arrayAdapter.notifyDataSetChanged();
        }
    }

    @Override // androidx.preference.DialogPreference, androidx.preference.Preference
    protected void y() {
        this.Z.performClick();
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public DropDownPreference(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f2755a0 = new a();
        this.X = context;
        this.Y = S();
        T();
    }
}
