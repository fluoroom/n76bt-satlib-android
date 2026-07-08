package r3;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import java.nio.charset.Charset;
import java.security.InvalidParameterException;

/* JADX INFO: loaded from: classes.dex */
public class a extends c {
    public static final Parcelable.Creator<a> CREATOR = new C0349a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f25412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Charset f25413b;

    /* JADX INFO: renamed from: r3.a$a, reason: collision with other inner class name */
    class C0349a implements Parcelable.Creator {
        C0349a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public static String b(String str, String str2, int i10) {
        Charset charsetForName = Charset.forName(str2);
        while (str.getBytes(charsetForName).length > i10) {
            int length = str.length();
            int i11 = length > i10 ? i10 : length - 1;
            if (i11 < 1) {
                return "";
            }
            str = str.substring(0, i11);
        }
        return str;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        while (editable.toString().getBytes(this.f25413b).length > this.f25412a) {
            int length = editable.length();
            int i10 = this.f25412a;
            if (length <= i10) {
                i10 = length - 1;
            }
            editable.delete(i10, editable.length());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f25412a);
        parcel.writeString(this.f25413b.name());
    }

    public a(int i10) {
        if (i10 <= 0) {
            throw new InvalidParameterException();
        }
        this.f25412a = i10;
        this.f25413b = Charset.forName("utf-8");
    }

    private a(Parcel parcel) {
        this.f25412a = parcel.readInt();
        this.f25413b = Charset.forName(parcel.readString());
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
