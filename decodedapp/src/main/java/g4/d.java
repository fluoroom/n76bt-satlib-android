package g4;

import android.database.Cursor;
import android.database.DatabaseUtils;

/* JADX INFO: loaded from: classes.dex */
public abstract class d extends DatabaseUtils {
    public static long[] a(Cursor cursor, int i10) {
        if (cursor == null) {
            return d4.c.f10566f;
        }
        long[] jArr = new long[cursor.getCount()];
        cursor.moveToPosition(-1);
        int i11 = 0;
        while (cursor.moveToNext()) {
            jArr[i11] = cursor.getLong(i10);
            i11++;
        }
        return jArr;
    }

    public static long[] b(Cursor cursor, int i10) {
        try {
            return a(cursor, i10);
        } finally {
            if (cursor != null) {
                cursor.close();
            }
        }
    }
}
