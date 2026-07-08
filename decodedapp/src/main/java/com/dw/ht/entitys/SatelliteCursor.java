package com.dw.ht.entitys;

import com.dw.ht.entitys.h;
import d5.a;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;

/* JADX INFO: loaded from: classes.dex */
public final class SatelliteCursor extends Cursor<Satellite> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ModulationConverter f5703s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ModulationConverter f5704t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final h.a f5697u = h.f5813c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f5698v = h.f5816f.f17384c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f5699w = h.f5817g.f17384c;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f5700x = h.f5818h.f17384c;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f5701y = h.f5819r.f17384c;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f5702z = h.f5820s.f17384c;
    private static final int A = h.f5821t.f17384c;
    private static final int B = h.f5822u.f17384c;
    private static final int C = h.f5823v.f17384c;
    private static final int D = h.f5824w.f17384c;
    private static final int E = h.f5825x.f17384c;
    private static final int F = h.f5826y.f17384c;
    private static final int G = h.f5827z.f17384c;
    private static final int H = h.A.f17384c;
    private static final int I = h.B.f17384c;
    private static final int J = h.C.f17384c;

    static final class a implements cc.b {
        a() {
        }

        @Override // cc.b
        public Cursor a(Transaction transaction, long j10, BoxStore boxStore) {
            return new SatelliteCursor(transaction, j10, boxStore);
        }
    }

    public SatelliteCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, h.f5814d, boxStore);
        this.f5703s = new ModulationConverter();
        this.f5704t = new ModulationConverter();
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public long n(Satellite satellite) {
        return f5697u.a(satellite);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public long w(Satellite satellite) {
        String name = satellite.getName();
        int i10 = name != null ? f5698v : 0;
        String tleLine1 = satellite.getTleLine1();
        int i11 = tleLine1 != null ? f5700x : 0;
        String tleLine2 = satellite.getTleLine2();
        int i12 = tleLine2 != null ? f5701y : 0;
        String rfConfigName = satellite.getRfConfigName();
        Cursor.collect400000(this.f17335b, 0L, 1, i10, name, i11, tleLine1, i12, tleLine2, rfConfigName != null ? B : 0, rfConfigName);
        a.d txModulation = satellite.getTxModulation();
        int i13 = txModulation != null ? E : 0;
        a.d rxModulation = satellite.getRxModulation();
        int i14 = rxModulation != null ? F : 0;
        Cursor.collect313311(this.f17335b, 0L, 0, 0, null, 0, null, 0, null, 0, null, J, satellite.getUpdatedAt(), f5699w, satellite.getNoradCatID(), C, satellite.getTxFreq(), D, satellite.getRxFreq(), i13, i13 != 0 ? this.f5703s.convertToDatabaseValue(txModulation).intValue() : 0, i14, i14 != 0 ? this.f5704t.convertToDatabaseValue(rxModulation).intValue() : 0, 0, 0.0f, 0, 0.0d);
        long jCollect313311 = Cursor.collect313311(this.f17335b, satellite.getId(), 2, 0, null, 0, null, 0, null, 0, null, G, satellite.getTxSubAudio(), H, satellite.getRxSubAudio(), I, satellite.getBandwidth(), f5702z, satellite.getStarred() ? 1 : 0, A, satellite.getShowTrack() ? 1 : 0, 0, 0, 0, 0.0f, 0, 0.0d);
        satellite.x(jCollect313311);
        return jCollect313311;
    }
}
