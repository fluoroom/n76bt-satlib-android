package com.auth0.android.jwt;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.gson.g;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class JWT implements Parcelable {
    public static final Parcelable.Creator<JWT> CREATOR = new a();

    /* JADX INFO: renamed from: a */
    private final String f4924a;

    /* JADX INFO: renamed from: b */
    private Map f4925b;

    /* JADX INFO: renamed from: c */
    private f f4926c;

    /* JADX INFO: renamed from: d */
    private String f4927d;

    /* JADX INFO: renamed from: com.auth0.android.jwt.JWT$2 */
    class AnonymousClass2 extends TypeToken<Map<String, String>> {
        AnonymousClass2() {
        }
    }

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a */
        public JWT createFromParcel(Parcel parcel) {
            return new JWT(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b */
        public JWT[] newArray(int i10) {
            return new JWT[i10];
        }
    }

    public JWT(String str) {
        c(str);
        this.f4924a = str;
    }

    private String b(String str) {
        try {
            return new String(Base64.decode(str, 11), Charset.defaultCharset());
        } catch (IllegalArgumentException e10) {
            throw new d("Received bytes didn't correspond to a valid Base64 encoded string.", e10);
        }
    }

    private void c(String str) {
        String[] strArrH = h(str);
        this.f4925b = (Map) g(b(strArrH[0]), new TypeToken<Map<String, String>>() { // from class: com.auth0.android.jwt.JWT.2
            AnonymousClass2() {
            }
        }.d());
        this.f4926c = (f) g(b(strArrH[1]), f.class);
        this.f4927d = strArrH[2];
    }

    static com.google.gson.f f() {
        return new g().d(f.class, new e()).b();
    }

    private Object g(String str, Type type) {
        try {
            return f().k(str, type);
        } catch (Exception e10) {
            throw new d("The token's payload had an invalid JSON format.", e10);
        }
    }

    private String[] h(String str) {
        String[] strArrSplit = str.split("\\.");
        if (strArrSplit.length == 2 && str.endsWith(".")) {
            strArrSplit = new String[]{strArrSplit[0], strArrSplit[1], ""};
        }
        if (strArrSplit.length == 3) {
            return strArrSplit;
        }
        throw new d(String.format("The token was expected to have 3 parts, but got %s.", Integer.valueOf(strArrSplit.length)));
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public b e(String str) {
        return this.f4926c.a(str);
    }

    public String toString() {
        return this.f4924a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4924a);
    }
}
