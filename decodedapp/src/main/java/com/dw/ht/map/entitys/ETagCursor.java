package com.dw.ht.map.entitys;

import com.dw.ht.map.entitys.SatelliteOfflineMapItem;
import com.dw.ht.map.entitys.a;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;

/* JADX INFO: loaded from: classes.dex */
public final class ETagCursor extends Cursor<ETag> {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final a.C0094a f6541t = com.dw.ht.map.entitys.a.f6568c;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f6542u = com.dw.ht.map.entitys.a.f6571f.f17384c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f6543v = com.dw.ht.map.entitys.a.f6572g.f17384c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f6544w = com.dw.ht.map.entitys.a.f6573h.f17384c;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f6545x = com.dw.ht.map.entitys.a.f6574r.f17384c;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f6546y = com.dw.ht.map.entitys.a.f6575s.f17384c;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final SatelliteOfflineMapItem.MapLayerConverter f6547s;

    static final class a implements cc.b {
        a() {
        }

        @Override // cc.b
        public Cursor a(Transaction transaction, long j10, BoxStore boxStore) {
            return new ETagCursor(transaction, j10, boxStore);
        }
    }

    public ETagCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, com.dw.ht.map.entitys.a.f6569d, boxStore);
        this.f6547s = new SatelliteOfflineMapItem.MapLayerConverter();
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public long n(ETag eTag) {
        return f6541t.a(eTag);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public long w(ETag eTag) {
        String tag = eTag.getTag();
        int i10 = tag != null ? f6546y : 0;
        int i11 = eTag.getMapLayer() != null ? f6542u : 0;
        long jCollect313311 = Cursor.collect313311(this.f17335b, eTag.getId(), 3, i10, tag, 0, null, 0, null, 0, null, i11, i11 != 0 ? this.f6547s.convertToDatabaseValue(r2).intValue() : 0L, f6543v, eTag.getX(), f6544w, eTag.getY(), f6545x, eTag.getZ(), 0, 0, 0, 0, 0, 0.0f, 0, 0.0d);
        eTag.j(jCollect313311);
        return jCollect313311;
    }
}
