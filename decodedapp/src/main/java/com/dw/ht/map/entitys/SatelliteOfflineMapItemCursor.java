package com.dw.ht.map.entitys;

import com.dw.ht.map.entitys.SatelliteOfflineMapItem;
import com.dw.ht.map.entitys.b;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;
import z4.j;

/* JADX INFO: loaded from: classes.dex */
public final class SatelliteOfflineMapItemCursor extends Cursor<SatelliteOfflineMapItem> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final SatelliteOfflineMapItem.StatusConverter f6564s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final SatelliteOfflineMapItem.MapLayerConverter f6565t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final b.a f6558u = b.f6580c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f6559v = b.f6583f.f17384c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f6560w = b.f6584g.f17384c;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f6561x = b.f6585h.f17384c;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f6562y = b.f6586r.f17384c;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f6563z = b.f6587s.f17384c;
    private static final int A = b.f6588t.f17384c;
    private static final int B = b.f6589u.f17384c;
    private static final int C = b.f6590v.f17384c;
    private static final int D = b.f6591w.f17384c;
    private static final int E = b.f6592x.f17384c;
    private static final int F = b.f6593y.f17384c;

    static final class a implements cc.b {
        a() {
        }

        @Override // cc.b
        public Cursor a(Transaction transaction, long j10, BoxStore boxStore) {
            return new SatelliteOfflineMapItemCursor(transaction, j10, boxStore);
        }
    }

    public SatelliteOfflineMapItemCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, b.f6581d, boxStore);
        this.f6564s = new SatelliteOfflineMapItem.StatusConverter();
        this.f6565t = new SatelliteOfflineMapItem.MapLayerConverter();
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public long n(SatelliteOfflineMapItem satelliteOfflineMapItem) {
        return f6558u.a(satelliteOfflineMapItem);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public long w(SatelliteOfflineMapItem satelliteOfflineMapItem) {
        String title = satelliteOfflineMapItem.getTitle();
        int i10 = title != null ? f6559v : 0;
        int i11 = satelliteOfflineMapItem.getStatus() != null ? f6561x : 0;
        j jVarF = satelliteOfflineMapItem.f();
        int i12 = jVarF != null ? F : 0;
        long j10 = this.f17335b;
        int i13 = f6562y;
        long latest_update = satelliteOfflineMapItem.getLatest_update();
        int i14 = f6560w;
        long zoom = satelliteOfflineMapItem.getZoom();
        long jIntValue = i11 != 0 ? this.f6564s.convertToDatabaseValue(r2).intValue() : 0L;
        int iIntValue = i12 != 0 ? this.f6565t.convertToDatabaseValue(jVarF).intValue() : 0;
        Cursor.collect313311(j10, 0L, 1, i10, title, 0, null, 0, null, 0, null, i13, latest_update, i14, zoom, i11, jIntValue, i12, iIntValue, D, satelliteOfflineMapItem.getJustDownloadInWifi() ? 1 : 0, E, satelliteOfflineMapItem.get_terrainMode() ? 1 : 0, 0, 0.0f, f6563z, satelliteOfflineMapItem.getSouthwest_latitude());
        long jCollect002033 = Cursor.collect002033(this.f17335b, satelliteOfflineMapItem.getId(), 2, 0, 0L, 0, 0L, 0, 0.0f, 0, 0.0f, 0, 0.0f, A, satelliteOfflineMapItem.getSouthwest_longitude(), B, satelliteOfflineMapItem.getNortheast_latitude(), C, satelliteOfflineMapItem.getNortheast_longitude());
        satelliteOfflineMapItem.p(jCollect002033);
        return jCollect002033;
    }
}
