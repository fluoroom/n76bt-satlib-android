package com.dw.ht.entitys;

import com.dw.ht.entitys.d;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;

/* JADX INFO: loaded from: classes.dex */
public final class LinkSettingsCursor extends Cursor<LinkSettings> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final d.a f5678s = d.f5759c;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f5679t = d.f5762f.f17384c;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f5680u = d.f5763g.f17384c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f5681v = d.f5764h.f17384c;

    static final class a implements cc.b {
        a() {
        }

        @Override // cc.b
        public Cursor a(Transaction transaction, long j10, BoxStore boxStore) {
            return new LinkSettingsCursor(transaction, j10, boxStore);
        }
    }

    public LinkSettingsCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, d.f5760d, boxStore);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public long n(LinkSettings linkSettings) {
        return f5678s.a(linkSettings);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public long w(LinkSettings linkSettings) {
        long j10;
        long j11;
        Boolean syncSignalingSettings = linkSettings.getSyncSignalingSettings();
        int i10 = syncSignalingSettings != null ? f5680u : 0;
        long j12 = this.f17335b;
        long id2 = linkSettings.getId();
        int i11 = f5679t;
        long linkId = linkSettings.getLinkId();
        long j13 = 1;
        if (i10 == 0 || !syncSignalingSettings.booleanValue()) {
            j10 = 1;
            j13 = 0;
            j11 = 0;
        } else {
            j10 = 1;
            j11 = 0;
        }
        long jCollect004000 = Cursor.collect004000(j12, id2, 3, i11, linkId, i10, j13, f5681v, linkSettings.getMonitor() ? j10 : j11, 0, 0L);
        linkSettings.e(jCollect004000);
        return jCollect004000;
    }
}
