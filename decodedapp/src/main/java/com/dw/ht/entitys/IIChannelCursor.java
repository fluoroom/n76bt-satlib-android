package com.dw.ht.entitys;

import com.dw.ht.entitys.c;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;

/* JADX INFO: loaded from: classes.dex */
public final class IIChannelCursor extends Cursor<IIChannel> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final c.a f5669s = c.f5742c;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f5670t = c.f5745f.f17384c;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f5671u = c.f5746g.f17384c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f5672v = c.f5747h.f17384c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f5673w = c.f5748r.f17384c;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f5674x = c.f5749s.f17384c;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f5675y = c.f5750t.f17384c;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f5676z = c.f5751u.f17384c;
    private static final int A = c.f5752v.f17384c;
    private static final int B = c.f5753w.f17384c;
    private static final int C = c.f5754x.f17384c;
    private static final int D = c.f5755y.f17384c;
    private static final int E = c.f5756z.f17384c;
    private static final int F = c.A.f17384c;
    private static final int G = c.B.f17384c;

    static final class a implements cc.b {
        a() {
        }

        @Override // cc.b
        public Cursor a(Transaction transaction, long j10, BoxStore boxStore) {
            return new IIChannelCursor(transaction, j10, boxStore);
        }
    }

    public IIChannelCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, c.f5743d, boxStore);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public long n(IIChannel iIChannel) {
        return f5669s.a(iIChannel);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public long w(IIChannel iIChannel) {
        String strK = iIChannel.k();
        Cursor.collect313311(this.f17335b, 0L, 1, strK != null ? f5673w : 0, strK, 0, null, 0, null, 0, null, f5670t, iIChannel.getUserId(), f5671u, iIChannel.l(), f5672v, iIChannel.getChannelId(), B, iIChannel.getTxFreq(), C, iIChannel.getRxFreq(), D, iIChannel.getTxSubAudio(), 0, 0.0f, 0, 0.0d);
        Cursor.collect004000(this.f17335b, 0L, 0, E, iIChannel.getRxSubAudio(), F, iIChannel.getBandwidth(), f5674x, iIChannel.getMonitor() ? 1L : 0L, f5675y, iIChannel.getAutoConnect() ? 1L : 0L);
        long jCollect004000 = Cursor.collect004000(this.f17335b, iIChannel.getId(), 2, f5676z, iIChannel.getBan() ? 1L : 0L, A, iIChannel.getIsAdmin() ? 1L : 0L, G, iIChannel.getHaveNewMessage() ? 1L : 0L, 0, 0L);
        iIChannel.v(jCollect004000);
        return jCollect004000;
    }
}
