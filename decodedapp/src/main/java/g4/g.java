package g4;

import android.database.AbstractCursor;
import android.database.ContentObserver;
import android.database.DataSetObserver;

/* JADX INFO: loaded from: classes.dex */
public class g extends AbstractCursor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String[] f13530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f13531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f13532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f13533d;

    public g(String[] strArr, int i10) {
        this(strArr, i10, null);
    }

    @Override // android.database.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        super.close();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void deactivate() {
        super.deactivate();
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public byte[] getBlob(int i10) {
        return null;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public String[] getColumnNames() {
        return this.f13530a;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getCount() {
        return this.f13531b;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public double getDouble(int i10) {
        return this.f13533d;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public float getFloat(int i10) {
        return this.f13533d;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getInt(int i10) {
        return (int) this.f13533d;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public long getLong(int i10) {
        return this.f13533d;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public short getShort(int i10) {
        return (short) this.f13533d;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public String getString(int i10) {
        return this.f13532c;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public int getType(int i10) {
        return 0;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean isNull(int i10) {
        return this.f13532c == null;
    }

    @Override // android.database.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int i10, int i11) {
        return i11 > -2 && i11 < this.f13531b;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public boolean requery() {
        return true;
    }

    public g(String[] strArr, int i10, String str) {
        long j10;
        this.f13530a = strArr;
        this.f13531b = i10;
        this.f13532c = str;
        try {
            j10 = Long.parseLong(str);
        } catch (Exception unused) {
            j10 = 0;
        }
        this.f13533d = j10;
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void registerContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void registerDataSetObserver(DataSetObserver dataSetObserver) {
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void unregisterContentObserver(ContentObserver contentObserver) {
    }

    @Override // android.database.AbstractCursor, android.database.Cursor
    public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
    }
}
