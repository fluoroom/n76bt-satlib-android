package f4;

import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;

/* JADX INFO: loaded from: classes.dex */
public class d extends f4.a {

    public static class a {
        public String a(Cursor cursor, int i10) {
            if (cursor.isNull(i10)) {
                return null;
            }
            try {
                return cursor.getString(i10);
            } catch (SQLiteException unused) {
                return "BLOB";
            }
        }
    }

    public String g(Cursor cursor, int[] iArr, String[] strArr, a aVar) {
        StringBuilder sb2 = new StringBuilder();
        int length = iArr.length;
        String[] strArr2 = new String[length];
        if (strArr != null) {
            sb2.append(e(strArr, strArr.length));
        }
        cursor.moveToPosition(-1);
        if (aVar == null) {
            aVar = new a();
        }
        while (cursor.moveToNext()) {
            for (int i10 = 0; i10 < length; i10++) {
                strArr2[i10] = aVar.a(cursor, iArr[i10]);
            }
            sb2.append(e(strArr2, length));
        }
        return sb2.toString();
    }

    public String h(Cursor cursor, String[] strArr) {
        int columnCount = cursor.getColumnCount();
        int[] iArr = new int[columnCount];
        for (int i10 = 0; i10 < columnCount; i10++) {
            iArr[i10] = i10;
        }
        return g(cursor, iArr, strArr, null);
    }

    public void i(OutputStream outputStream, Cursor cursor) throws IOException {
        l(outputStream, cursor, null);
    }

    public void j(OutputStream outputStream, Cursor cursor, int[] iArr, String[] strArr) throws IOException {
        k(outputStream, cursor, iArr, strArr, null);
    }

    public void k(OutputStream outputStream, Cursor cursor, int[] iArr, String[] strArr, a aVar) throws IOException {
        PrintStream printStream = new PrintStream(outputStream, false, "utf-8");
        if (iArr == null) {
            int columnCount = cursor.getColumnCount();
            iArr = new int[columnCount];
            for (int i10 = 0; i10 < columnCount; i10++) {
                iArr[i10] = i10;
            }
        }
        int length = iArr.length;
        String[] strArr2 = new String[length];
        if (strArr != null) {
            printStream.append((CharSequence) e(strArr, strArr.length));
        }
        cursor.moveToPosition(-1);
        if (aVar == null) {
            aVar = new a();
        }
        while (cursor.moveToNext()) {
            for (int i11 = 0; i11 < length; i11++) {
                strArr2[i11] = aVar.a(cursor, iArr[i11]);
            }
            printStream.append((CharSequence) e(strArr2, length));
        }
        printStream.close();
        if (printStream.checkError()) {
            throw new IOException();
        }
    }

    public void l(OutputStream outputStream, Cursor cursor, String[] strArr) throws IOException {
        int columnCount = cursor.getColumnCount();
        int[] iArr = new int[columnCount];
        for (int i10 = 0; i10 < columnCount; i10++) {
            iArr[i10] = i10;
        }
        j(outputStream, cursor, iArr, strArr);
    }

    public void m(Cursor cursor, String str) throws IOException {
        n(cursor, cursor.getColumnNames(), str);
    }

    public void n(Cursor cursor, String[] strArr, String str) throws IOException {
        int columnCount = cursor.getColumnCount();
        int[] iArr = new int[columnCount];
        for (int i10 = 0; i10 < columnCount; i10++) {
            iArr[i10] = i10;
        }
        o(str, cursor, iArr, strArr);
    }

    public void o(String str, Cursor cursor, int[] iArr, String[] strArr) throws IOException {
        p(str, cursor, iArr, strArr, null);
    }

    public void p(String str, Cursor cursor, int[] iArr, String[] strArr, a aVar) throws IOException {
        File file = new File(str);
        file.getParentFile().mkdirs();
        k(new FileOutputStream(file), cursor, iArr, strArr, aVar);
    }
}
