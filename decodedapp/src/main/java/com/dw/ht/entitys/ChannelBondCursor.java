package com.dw.ht.entitys;

import com.dw.ht.entitys.a;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;

/* JADX INFO: loaded from: classes.dex */
public final class ChannelBondCursor extends Cursor<ChannelBond> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final a.C0087a f5653s = com.dw.ht.entitys.a.f5716c;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f5654t = com.dw.ht.entitys.a.f5719f.f17384c;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f5655u = com.dw.ht.entitys.a.f5720g.f17384c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f5656v = com.dw.ht.entitys.a.f5721h.f17384c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f5657w = com.dw.ht.entitys.a.f5722r.f17384c;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f5658x = com.dw.ht.entitys.a.f5723s.f17384c;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f5659y = com.dw.ht.entitys.a.f5724t.f17384c;

    static final class a implements cc.b {
        a() {
        }

        @Override // cc.b
        public Cursor a(Transaction transaction, long j10, BoxStore boxStore) {
            return new ChannelBondCursor(transaction, j10, boxStore);
        }
    }

    public ChannelBondCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, com.dw.ht.entitys.a.f5717d, boxStore);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public long n(ChannelBond channelBond) {
        return f5653s.a(channelBond);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public long w(ChannelBond channelBond) {
        long jCollect313311 = Cursor.collect313311(this.f17335b, channelBond.getId(), 3, 0, null, 0, null, 0, null, 0, null, f5654t, channelBond.getNetworkChannelId(), f5655u, channelBond.getDevId(), f5656v, channelBond.getDevChannel(), f5659y, channelBond.getDevRegion(), f5657w, channelBond.getRouting() ? 1 : 0, f5658x, channelBond.getSyncRfConfig() ? 1 : 0, 0, 0.0f, 0, 0.0d);
        channelBond.h(jCollect313311);
        return jCollect313311;
    }
}
