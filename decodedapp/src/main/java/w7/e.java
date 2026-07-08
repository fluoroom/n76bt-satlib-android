package w7;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import v7.q;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static d a(byte[] bArr, Parcelable.Creator creator) {
        q.i(creator);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(bArr, 0, bArr.length);
        parcelObtain.setDataPosition(0);
        d dVar = (d) creator.createFromParcel(parcelObtain);
        parcelObtain.recycle();
        return dVar;
    }

    public static d b(Intent intent, String str, Parcelable.Creator creator) {
        byte[] byteArrayExtra = intent.getByteArrayExtra(str);
        if (byteArrayExtra == null) {
            return null;
        }
        return a(byteArrayExtra, creator);
    }
}
