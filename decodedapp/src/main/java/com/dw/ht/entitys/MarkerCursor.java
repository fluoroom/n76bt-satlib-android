package com.dw.ht.entitys;

import com.dw.ht.entitys.e;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;

/* JADX INFO: loaded from: classes.dex */
public final class MarkerCursor extends Cursor<Marker> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final e.a f5683s = e.f5769c;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f5684t = e.f5772f.f17384c;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f5685u = e.f5773g.f17384c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f5686v = e.f5774h.f17384c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f5687w = e.f5775r.f17384c;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f5688x = e.f5776s.f17384c;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f5689y = e.f5777t.f17384c;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f5690z = e.f5778u.f17384c;
    private static final int A = e.f5779v.f17384c;
    private static final int B = e.f5780w.f17384c;
    private static final int C = e.f5781x.f17384c;

    static final class a implements cc.b {
        a() {
        }

        @Override // cc.b
        public Cursor a(Transaction transaction, long j10, BoxStore boxStore) {
            return new MarkerCursor(transaction, j10, boxStore);
        }
    }

    public MarkerCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, e.f5770d, boxStore);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public long n(Marker marker) {
        return f5683s.a(marker);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public long w(Marker marker) {
        String title = marker.getTitle();
        int i10 = title != null ? A : 0;
        String text = marker.getText();
        int i11 = text != null ? B : 0;
        String picture = marker.getPicture();
        int i12 = picture != null ? C : 0;
        Float accuracy = marker.getAccuracy();
        int i13 = accuracy != null ? f5687w : 0;
        Cursor.collect313311(this.f17335b, 0L, 1, i10, title, i11, text, i12, picture, 0, null, f5690z, marker.getDate(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, i13, i13 != 0 ? accuracy.floatValue() : 0.0f, f5684t, marker.getLatitude());
        Float speed = marker.getSpeed();
        int i14 = speed != null ? f5688x : 0;
        Float course = marker.getCourse();
        int i15 = course != null ? f5689y : 0;
        Double altitude = marker.getAltitude();
        int i16 = altitude != null ? f5686v : 0;
        long jCollect002033 = Cursor.collect002033(this.f17335b, marker.getId(), 2, 0, 0L, 0, 0L, i14, i14 != 0 ? speed.floatValue() : 0.0f, i15, i15 != 0 ? course.floatValue() : 0.0f, 0, 0.0f, f5685u, marker.getLongitude(), i16, i16 != 0 ? altitude.doubleValue() : 0.0d, 0, 0.0d);
        marker.s(jCollect002033);
        return jCollect002033;
    }
}
