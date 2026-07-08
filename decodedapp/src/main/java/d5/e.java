package d5;

import a6.x;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.benshikj.ht.R;
import com.dw.ht.Cfg;
import com.dw.ht.Main;
import com.dw.ht.provider.a;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* JADX INFO: loaded from: classes.dex */
public class e extends g4.e implements Parcelable {
    public static final Parcelable.Creator<e> CREATOR = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f10626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f10627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long[] f10628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private d5.a[] f10629h;

    class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final String[] f10630a = {"_id", "channels", "title", "note"};
    }

    protected e(Parcel parcel) {
        super(parcel);
        this.f10626e = parcel.readString();
        this.f10627f = parcel.readString();
        this.f10628g = parcel.createLongArray();
        this.f10629h = (d5.a[]) parcel.createTypedArray(d5.a.CREATOR);
    }

    public static e p(long j10) {
        Cursor cursorQuery = Main.f5556h.query(ContentUris.appendId(a.c.f6667a.buildUpon(), j10).build(), b.f10630a, null, null, null);
        if (cursorQuery == null) {
            return null;
        }
        try {
            if (!cursorQuery.moveToNext()) {
                cursorQuery.close();
                return null;
            }
            e eVar = new e(cursorQuery);
            cursorQuery.close();
            return eVar;
        } catch (Throwable th2) {
            cursorQuery.close();
            throw th2;
        }
    }

    public static ArrayList r() {
        Cursor cursorQuery = Main.f5556h.query(a.c.f6667a, b.f10630a, null, null, "title");
        if (cursorQuery == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList(cursorQuery.getCount());
            while (cursorQuery.moveToNext()) {
                arrayList.add(new e(cursorQuery));
            }
            return arrayList;
        } finally {
            cursorQuery.close();
        }
    }

    public static e t(String str) {
        JSONObject jSONObject;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONTokener jSONTokener = new JSONTokener(str);
            while (true) {
                Object objNextValue = jSONTokener.nextValue();
                if (objNextValue == null) {
                    jSONObject = null;
                    break;
                }
                if (objNextValue instanceof JSONObject) {
                    jSONObject = (JSONObject) objNextValue;
                    break;
                }
            }
            if (jSONObject == null) {
                return null;
            }
            Object objOpt = jSONObject.opt("chs");
            if (!(objOpt instanceof JSONArray)) {
                return null;
            }
            JSONArray jSONArray = (JSONArray) objOpt;
            e eVar = new e();
            eVar.f10629h = new d5.a[jSONArray.length()];
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                Object objOpt2 = jSONArray.opt(i10);
                if (objOpt2 instanceof JSONObject) {
                    eVar.f10629h[i10] = d5.a.J((JSONObject) objOpt2);
                }
            }
            eVar.f10626e = jSONObject.optString("n");
            return eVar;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // g4.e, android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void j(int i10) {
        this.f10628g[i10] = 0;
        d5.a[] aVarArr = this.f10629h;
        if (aVarArr != null) {
            aVarArr[i10] = d5.a.n();
        }
    }

    public void k(ContentResolver contentResolver) {
        contentResolver.delete(ContentUris.withAppendedId(a.c.f6667a, this.f13515c), null, null);
        f();
    }

    public d5.a[] m(boolean z10) {
        if (this.f10629h == null) {
            this.f10629h = d5.a.H(this.f10628g);
        } else if (z10) {
            d5.a[] aVarArrH = d5.a.H(this.f10628g);
            for (int i10 = 0; i10 < aVarArrH.length && i10 < this.f10629h.length; i10++) {
                d5.a aVar = aVarArrH[i10];
                if (aVar != null && !aVar.E()) {
                    this.f10629h[i10] = aVarArrH[i10];
                }
            }
        }
        return this.f10629h;
    }

    public String n(Context context) {
        return TextUtils.isEmpty(this.f10626e) ? context.getString(R.string.region_name, Long.valueOf(b())) : this.f10626e;
    }

    public boolean o() {
        d5.a[] aVarArr = this.f10629h;
        if (aVarArr != null) {
            for (d5.a aVar : aVarArr) {
                if (aVar != null && !aVar.E()) {
                    return false;
                }
            }
        }
        for (long j10 : this.f10628g) {
            if (j10 != 0) {
                return false;
            }
        }
        return true;
    }

    public void u() {
        ContentValues contentValues = new ContentValues();
        if (this.f10629h != null) {
            int i10 = 0;
            while (true) {
                d5.a[] aVarArr = this.f10629h;
                if (i10 >= aVarArr.length) {
                    break;
                }
                d5.a aVar = aVarArr[i10];
                if (aVar != null && !aVar.E()) {
                    if (aVar.b() != 0) {
                        this.f10628g[i10] = aVar.b();
                    } else {
                        d5.a aVarP = d5.a.p(aVar);
                        if (aVarP != null) {
                            aVar.i(aVarP.b());
                        }
                        aVar.L();
                        this.f10628g[i10] = aVar.b();
                    }
                }
                i10++;
            }
        }
        contentValues.put("channels", x.c(",", this.f10628g));
        String str = this.f10626e;
        if (str == null) {
            str = "";
        }
        contentValues.put("title", str);
        String str2 = this.f10627f;
        contentValues.put("note", str2 != null ? str2 : "");
        long j10 = this.f13515c;
        if (j10 != 0) {
            Main.f5556h.update(ContentUris.withAppendedId(a.c.f6667a, j10), contentValues, null, null);
        } else {
            this.f13515c = ContentUris.parseId(Main.f5556h.insert(a.c.f6667a, contentValues));
        }
        g();
    }

    public boolean v(int i10, long j10) {
        if (i10 < 0) {
            return false;
        }
        long[] jArr = this.f10628g;
        if (i10 >= jArr.length || jArr[i10] == j10) {
            return false;
        }
        jArr[i10] = j10;
        h();
        return true;
    }

    public JSONObject w() {
        JSONArray jSONArray = new JSONArray();
        d5.a[] aVarArrM = m(false);
        for (int i10 = 0; i10 < aVarArrM.length; i10++) {
            d5.a aVar = aVarArrM[i10];
            if (aVar == null || aVar.E()) {
                jSONArray.put((Object) null);
            } else {
                jSONArray.put(aVarArrM[i10].N());
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(this.f10626e)) {
                jSONObject.put("n", this.f10626e);
            }
            jSONObject.put("chs", jSONArray);
            return jSONObject;
        } catch (JSONException e10) {
            e10.printStackTrace();
            return jSONObject;
        }
    }

    @Override // g4.e, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f10626e);
        parcel.writeString(this.f10627f);
        parcel.writeLongArray(this.f10628g);
        parcel.writeTypedArray(this.f10629h, i10);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Cursor cursor) {
        super(cursor.getLong(0));
        this.f10626e = cursor.getString(2);
        this.f10627f = cursor.getString(3);
        String string = cursor.getString(1);
        if (string != null) {
            String[] strArrSplit = string.replaceAll("(,0)*$", "").split(",");
            this.f10628g = new long[Math.max(strArrSplit.length, Cfg.M())];
            for (int i10 = 0; i10 < strArrSplit.length; i10++) {
                try {
                    this.f10628g[i10] = Long.parseLong(strArrSplit[i10]);
                } catch (NumberFormatException unused) {
                }
            }
            return;
        }
        this.f10628g = new long[Cfg.M()];
    }

    public e() {
        this.f10628g = new long[Cfg.M()];
    }

    public e(d5.a[] aVarArr) {
        this.f10628g = new long[Math.max(aVarArr.length, Cfg.M())];
        this.f10629h = aVarArr;
    }
}
