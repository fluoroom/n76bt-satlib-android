package com.dw.ht.entitys;

import com.dw.ht.entitys.f;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;

/* JADX INFO: loaded from: classes.dex */
public final class RegionBindCursor extends Cursor<RegionBind> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final f.a f5692s = f.f5786c;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f5693t = f.f5789f.f17384c;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f5694u = f.f5790g.f17384c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f5695v = f.f5791h.f17384c;

    static final class a implements cc.b {
        a() {
        }

        @Override // cc.b
        public Cursor a(Transaction transaction, long j10, BoxStore boxStore) {
            return new RegionBindCursor(transaction, j10, boxStore);
        }
    }

    public RegionBindCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, f.f5787d, boxStore);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public long n(RegionBind regionBind) {
        return f5692s.a(regionBind);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public long w(RegionBind regionBind) {
        long jCollect004000 = Cursor.collect004000(this.f17335b, regionBind.getId(), 3, f5693t, regionBind.getDevID(), f5695v, regionBind.getRegionID(), f5694u, regionBind.getDevRegion(), 0, 0L);
        regionBind.e(jCollect004000);
        return jCollect004000;
    }
}
