package g4;

import android.database.Cursor;
import java.util.AbstractList;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AbstractList {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Cursor f13508a;

    public b(Cursor cursor) {
        this.f13508a = cursor;
    }

    protected abstract Object b(Cursor cursor);

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i10) {
        if (i10 < 0 || i10 >= size()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        if (this.f13508a.moveToPosition(i10)) {
            return b(this.f13508a);
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        Cursor cursor = this.f13508a;
        if (cursor == null) {
            return 0;
        }
        return cursor.getCount();
    }
}
