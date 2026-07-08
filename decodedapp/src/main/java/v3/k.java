package v3;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.c;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public class k extends p implements DialogInterface.OnClickListener, DialogInterface.OnMultiChoiceClickListener {
    protected HashSet F0;

    class a implements CompoundButton.OnCheckedChangeListener {
        a() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
            Integer num = (Integer) compoundButton.getTag();
            if (z10) {
                k kVar = k.this;
                if (kVar.F0 == null) {
                    kVar.F0 = new HashSet();
                }
                k.this.F0.add(num);
                return;
            }
            HashSet hashSet = k.this.F0;
            if (hashSet != null) {
                hashSet.remove(num);
            }
        }
    }

    @Override // androidx.fragment.app.n
    public Dialog Z3(Bundle bundle) {
        return k4((b) i1().getParcelable("parameter"), bundle).a();
    }

    protected c.a k4(b bVar, Bundle bundle) {
        c.a aVar = new c.a(e1());
        int i10 = bVar.f29576b;
        if (i10 != 0) {
            a6.e.b(aVar, i10);
        }
        CharSequence charSequence = bVar.f29577c;
        if (charSequence != null) {
            aVar.z(charSequence);
        }
        String str = bVar.f29578d;
        if (str != null && bVar.f29582h != null) {
            Context contextB = aVar.b();
            View viewInflate = ((LayoutInflater) contextB.getSystemService("layout_inflater")).inflate(k3.g.f19214h, (ViewGroup) null);
            ((TextView) viewInflate.findViewById(k3.f.f19205y)).setText(bVar.f29578d);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(k3.f.f19191k);
            CharSequence[] charSequenceArr = bVar.f29582h;
            androidx.fragment.app.p pVarE1 = e1();
            a aVar2 = new a();
            for (int i11 = 0; i11 < charSequenceArr.length; i11++) {
                CheckBox checkBox = (CheckBox) pVarE1.onCreateView("CheckBox", contextB, null);
                if (checkBox == null) {
                    checkBox = new CheckBox(contextB);
                }
                checkBox.setText(charSequenceArr[i11]);
                checkBox.setTag(Integer.valueOf(i11));
                checkBox.setOnCheckedChangeListener(aVar2);
                linearLayout.addView(checkBox);
            }
            aVar.B(viewInflate);
        } else if (str != null) {
            aVar.k(str);
        } else {
            CharSequence[] charSequenceArr2 = bVar.f29582h;
            if (charSequenceArr2 != null) {
                aVar.l(charSequenceArr2, null, this);
            }
        }
        String str2 = bVar.f29579e;
        if (str2 != null) {
            aVar.u(str2, this);
        }
        String str3 = bVar.f29580f;
        if (str3 != null) {
            aVar.n(str3, this);
        }
        String str4 = bVar.f29581g;
        if (str4 != null) {
            aVar.p(str4, this);
        }
        aVar.d(bVar.f29575a);
        return aVar;
    }

    public static class b implements Parcelable {
        public static final Parcelable.Creator<b> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f29575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f29576b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public CharSequence f29577c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f29578d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f29579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f29580f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f29581g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public CharSequence[] f29582h;

        class a implements Parcelable.Creator {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public b createFromParcel(Parcel parcel) {
                return new b(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public b[] newArray(int i10) {
                return new b[i10];
            }
        }

        protected b(Parcel parcel) {
            this.f29576b = 0;
            if (parcel.readInt() == 1) {
                this.f29575a = true;
            }
            this.f29576b = parcel.readInt();
            this.f29577c = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f29578d = parcel.readString();
            this.f29579e = parcel.readString();
            this.f29580f = parcel.readString();
            this.f29581g = parcel.readString();
            this.f29582h = (CharSequence[]) parcel.readArray(null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            if (this.f29575a) {
                parcel.writeInt(1);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeInt(this.f29576b);
            TextUtils.writeToParcel(this.f29577c, parcel, 0);
            parcel.writeString(this.f29578d);
            parcel.writeString(this.f29579e);
            parcel.writeString(this.f29580f);
            parcel.writeString(this.f29581g);
            parcel.writeArray(this.f29582h);
        }

        public b() {
            this.f29576b = 0;
        }
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public void onClick(DialogInterface dialogInterface, int i10, boolean z10) {
    }
}
