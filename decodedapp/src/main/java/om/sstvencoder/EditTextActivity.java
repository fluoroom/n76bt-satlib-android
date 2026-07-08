package om.sstvencoder;

import android.R;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import androidx.fragment.app.n;
import java.util.List;
import om.sstvencoder.a;

/* JADX INFO: loaded from: classes3.dex */
public class EditTextActivity extends androidx.appcompat.app.d implements AdapterView.OnItemSelectedListener, a.InterfaceC0325a {
    private bi.c M;
    private c N;
    private List O;
    private CheckBox P;
    private CheckBox Q;
    private CheckBox R;
    private int S;

    class a implements TextWatcher {
        a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
            EditTextActivity.this.M.v(charSequence.toString());
        }
    }

    class b implements View.OnTouchListener {

        /* JADX INFO: renamed from: a */
        private boolean f23731a;

        b() {
        }

        private boolean a(View view, MotionEvent motionEvent) {
            return ((float) (view.getRight() - EditTextActivity.this.S)) < motionEvent.getX();
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                        if (action == 3) {
                            this.f23731a = false;
                        }
                    } else if (!a(view, motionEvent)) {
                        this.f23731a = false;
                    }
                } else {
                    if (a(view, motionEvent) && this.f23731a) {
                        ((EditText) view).setText("");
                        return true;
                    }
                    this.f23731a = false;
                }
            } else if (a(view, motionEvent)) {
                this.f23731a = true;
                return true;
            }
            return false;
        }
    }

    private enum c {
        None,
        Text,
        Outline
    }

    private void o1() {
        Intent intent = new Intent();
        intent.putExtra("EDIT_TEXT_EXTRA", this.M);
        setResult(-1, intent);
        finish();
    }

    private void p1(boolean z10) {
        findViewById(xh.a.D).setEnabled(z10);
        findViewById(xh.a.f32169t).setEnabled(z10);
        findViewById(xh.a.C).setEnabled(z10);
        int i10 = xh.a.f32168s;
        findViewById(i10).setEnabled(z10);
        findViewById(i10).setBackgroundColor(z10 ? this.M.h() : -12303292);
    }

    private void q1(String str) {
        Spinner spinner = (Spinner) findViewById(xh.a.f32165p);
        spinner.setOnItemSelectedListener(this);
        this.O = h.i();
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(this, R.layout.simple_spinner_dropdown_item, this.O));
        spinner.setSelection(this.O.indexOf(str));
    }

    private void r1(float f10) {
        Spinner spinner = (Spinner) findViewById(xh.a.f32169t);
        spinner.setOnItemSelectedListener(this);
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(this, R.layout.simple_spinner_dropdown_item, new String[]{getString(xh.e.f32197q), getString(xh.e.f32195o), getString(xh.e.f32196p)}));
        spinner.setSelection(u1(f10));
    }

    private void s1() {
        EditText editText = (EditText) findViewById(xh.a.f32170u);
        Drawable drawableD = b0.b.d(this, R.drawable.ic_menu_close_clear_cancel);
        editText.setText(this.M.j());
        editText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, drawableD, (Drawable) null);
        this.S = drawableD.getIntrinsicWidth() * 2;
        editText.addTextChangedListener(new a());
        editText.setOnTouchListener(new b());
    }

    private void t1(float f10) {
        Spinner spinner = (Spinner) findViewById(xh.a.f32171v);
        spinner.setOnItemSelectedListener(this);
        spinner.setAdapter((SpinnerAdapter) new ArrayAdapter(this, R.layout.simple_spinner_dropdown_item, new String[]{getString(xh.e.f32190j), getString(xh.e.f32189i), getString(xh.e.f32188h), getString(xh.e.f32187g)}));
        spinner.setSelection(y1(f10));
    }

    private int u1(float f10) {
        int i10 = (int) (((f10 * 2.0f) / 0.05f) - 1.0f);
        if (i10 >= 0 && i10 <= 2) {
            return i10;
        }
        this.M.t(0.05f);
        return 1;
    }

    private float v1(int i10) {
        return (i10 + 1.0f) * 0.025f;
    }

    private float w1(int i10) {
        return i10 + 1.0f;
    }

    private void x1(int i10, int i11) {
        om.sstvencoder.a aVar = new om.sstvencoder.a();
        aVar.j4(i10);
        aVar.i4(i11);
        aVar.h4(this);
        aVar.g4(N0(), om.sstvencoder.a.class.getName());
    }

    private int y1(float f10) {
        int i10 = (int) (f10 - 1.0f);
        if (i10 >= 0 && i10 <= 3) {
            return i10;
        }
        this.M.w(2.0f);
        return 1;
    }

    public void onBoldClick(View view) {
        this.M.n(this.Q.isChecked());
    }

    public void onColorClick(View view) {
        x1(xh.e.f32186f, this.M.e());
        this.N = c.Text;
    }

    @Override // androidx.fragment.app.p, d.q, a0.g, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(xh.b.f32176a);
        this.N = c.None;
        this.Q = (CheckBox) findViewById(xh.a.f32163n);
        this.P = (CheckBox) findViewById(xh.a.f32166q);
        this.R = (CheckBox) findViewById(xh.a.f32167r);
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(xh.c.f32179a, menu);
        return true;
    }

    public void onItalicClick(View view) {
        this.M.q(this.P.isChecked());
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i10, long j10) {
        int id2 = adapterView.getId();
        if (id2 == xh.a.f32171v) {
            this.M.w(w1(i10));
        } else if (id2 == xh.a.f32169t) {
            this.M.t(v1(i10));
        } else if (id2 == xh.a.f32165p) {
            this.M.o((String) this.O.get(i10));
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != xh.a.f32151b) {
            return super.onOptionsItemSelected(menuItem);
        }
        o1();
        return true;
    }

    public void onOutlineClick(View view) {
        if (view.getId() == xh.a.B) {
            this.R.setChecked(!r2.isChecked());
        }
        boolean zIsChecked = this.R.isChecked();
        this.M.r(zIsChecked);
        p1(zIsChecked);
    }

    public void onOutlineColorClick(View view) {
        if (this.R.isChecked()) {
            x1(xh.e.f32194n, this.M.h());
            this.N = c.Outline;
        }
    }

    @Override // androidx.appcompat.app.d, androidx.fragment.app.p, android.app.Activity
    protected void onStart() {
        super.onStart();
        this.M = ((bi.c) getIntent().getSerializableExtra("EDIT_TEXT_EXTRA")).c();
        s1();
        t1(this.M.k());
        this.Q.setChecked(this.M.b());
        this.P.setChecked(this.M.f());
        q1(this.M.d());
        this.R.setChecked(this.M.g());
        r1(this.M.i());
        findViewById(xh.a.f32164o).setBackgroundColor(this.M.e());
        findViewById(xh.a.f32168s).setBackgroundColor(this.M.h());
        p1(this.R.isChecked());
    }

    @Override // om.sstvencoder.a.InterfaceC0325a
    public void r(n nVar) {
        this.N = c.None;
    }

    @Override // om.sstvencoder.a.InterfaceC0325a
    public void u(n nVar, int i10) {
        int iOrdinal = this.N.ordinal();
        if (iOrdinal == 1) {
            this.M.p(i10);
            findViewById(xh.a.f32164o).setBackgroundColor(i10);
        } else if (iOrdinal == 2) {
            this.M.s(i10);
            findViewById(xh.a.f32168s).setBackgroundColor(i10);
        }
        this.N = c.None;
    }
}
