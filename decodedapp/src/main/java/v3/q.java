package v3;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.c;
import v3.k;

/* JADX INFO: loaded from: classes.dex */
public class q extends k implements TextWatcher {
    private EditText G0;
    private String H0;
    private Button I0;
    private b J0;

    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ InputMethodManager f29591a;

        a(InputMethodManager inputMethodManager) {
            this.f29591a = inputMethodManager;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f29591a.showSoftInput(q.this.G0, 0);
        }
    }

    public static class b extends k.b {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: r */
        public String f29593r;

        /* JADX INFO: renamed from: s */
        public String f29594s;

        /* JADX INFO: renamed from: t */
        public int f29595t;

        /* JADX INFO: renamed from: u */
        public int f29596u;

        /* JADX INFO: renamed from: v */
        public r3.c f29597v;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        /* synthetic */ b(Parcel parcel, r rVar) {
            this(parcel);
        }

        @Override // v3.k.b, android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // v3.k.b, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f29593r);
            parcel.writeString(this.f29594s);
            parcel.writeInt(this.f29595t);
            parcel.writeInt(this.f29596u);
            parcel.writeParcelable(this.f29597v, 0);
        }

        private b(Parcel parcel) {
            super(parcel);
            this.f29593r = parcel.readString();
            this.f29594s = parcel.readString();
            this.f29595t = parcel.readInt();
            this.f29596u = parcel.readInt();
            this.f29597v = (r3.c) parcel.readParcelable(r3.c.class.getClassLoader());
        }

        public b(Context context, CharSequence charSequence, String str, String str2, String str3, int i10) {
            this.f29577c = charSequence;
            this.f29578d = str;
            this.f29579e = context.getString(R.string.ok);
            this.f29580f = context.getString(R.string.cancel);
            this.f29575a = true;
            this.f29594s = str2;
            this.f29593r = str3;
            this.f29595t = i10;
        }
    }

    public static q o4(Context context, CharSequence charSequence, String str, String str2, String str3) {
        return p4(context, charSequence, str, str2, str3, 0);
    }

    public static q p4(Context context, CharSequence charSequence, String str, String str2, String str3, int i10) {
        return q4(new b(context, charSequence, str, str2, str3, i10));
    }

    public static q q4(b bVar) {
        q qVar = new q();
        Bundle bundle = new Bundle();
        bundle.putParcelable("parameter", bVar);
        qVar.E3(bundle);
        return qVar;
    }

    private void s4() {
        Button button = this.I0;
        if (button == null) {
            return;
        }
        button.setEnabled(n4(this.G0.getText()));
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.o
    public void O2() {
        super.O2();
        Dialog dialogX3 = X3();
        if (dialogX3 instanceof androidx.appcompat.app.c) {
            this.I0 = ((androidx.appcompat.app.c) dialogX3).l(-1);
            s4();
            EditText editText = this.G0;
            if (editText != null) {
                if (editText.getEditableText().length() > 0) {
                    EditText editText2 = this.G0;
                    editText2.setSelection(editText2.getEditableText().length());
                }
                InputMethodManager inputMethodManager = (InputMethodManager) k1().getSystemService("input_method");
                if (inputMethodManager != null) {
                    this.G0.postDelayed(new a(inputMethodManager), 200L);
                }
            }
        }
    }

    @Override // v3.k
    protected c.a k4(k.b bVar, Bundle bundle) {
        c.a aVarK4 = super.k4(bVar, bundle);
        b bVar2 = (b) bVar;
        this.J0 = bVar2;
        View viewInflate = ((LayoutInflater) aVarK4.b().getSystemService("layout_inflater")).inflate(k3.g.f19213g, (ViewGroup) null);
        aVarK4.B(viewInflate);
        EditText editText = (EditText) viewInflate.findViewById(k3.f.f19193m);
        String str = bVar2.f29593r;
        if (str != null) {
            editText.setHint(str);
        }
        String str2 = bVar2.f29594s;
        if (str2 != null) {
            editText.setText(str2);
        }
        editText.addTextChangedListener(this);
        int i10 = bVar2.f29596u;
        if (i10 != 0) {
            editText.setInputType(i10);
        }
        r3.c cVar = bVar2.f29597v;
        if (cVar != null) {
            editText.addTextChangedListener(cVar);
        }
        this.G0 = editText;
        r4(editText);
        this.H0 = bVar2.f29594s;
        return aVarK4;
    }

    public Editable m4() {
        EditText editText = this.G0;
        if (editText == null) {
            return null;
        }
        return editText.getText();
    }

    protected boolean n4(CharSequence charSequence) {
        return this.J0 == null || charSequence.length() >= this.J0.f29595t;
    }

    @Override // v3.p, android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i10) {
        j4(k3.f.T, i10, 0, m4().toString());
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        s4();
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    protected void r4(EditText editText) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
