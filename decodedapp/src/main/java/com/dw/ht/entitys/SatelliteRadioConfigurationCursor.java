package com.dw.ht.entitys;

import com.dw.ht.entitys.g;
import d5.a;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;

/* JADX INFO: loaded from: classes.dex */
public final class SatelliteRadioConfigurationCursor extends Cursor<SatelliteRadioConfiguration> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ModulationConverter f5712s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final ModulationConverter f5713t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final g.a f5706u = g.f5796c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f5707v = g.f5799f.f17384c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f5708w = g.f5800g.f17384c;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f5709x = g.f5801h.f17384c;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f5710y = g.f5802r.f17384c;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f5711z = g.f5803s.f17384c;
    private static final int A = g.f5804t.f17384c;
    private static final int B = g.f5805u.f17384c;
    private static final int C = g.f5806v.f17384c;
    private static final int D = g.f5807w.f17384c;
    private static final int E = g.f5808x.f17384c;

    static final class a implements cc.b {
        a() {
        }

        @Override // cc.b
        public Cursor a(Transaction transaction, long j10, BoxStore boxStore) {
            return new SatelliteRadioConfigurationCursor(transaction, j10, boxStore);
        }
    }

    public SatelliteRadioConfigurationCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, g.f5797d, boxStore);
        this.f5712s = new ModulationConverter();
        this.f5713t = new ModulationConverter();
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public long n(SatelliteRadioConfiguration satelliteRadioConfiguration) {
        return f5706u.a(satelliteRadioConfiguration);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public long w(SatelliteRadioConfiguration satelliteRadioConfiguration) {
        String name = satelliteRadioConfiguration.getName();
        int i10 = name != null ? f5707v : 0;
        a.d downlinkMod = satelliteRadioConfiguration.getDownlinkMod();
        int i11 = downlinkMod != null ? B : 0;
        Cursor.collect313311(this.f17335b, 0L, 1, i10, name, 0, null, 0, null, 0, null, f5708w, satelliteRadioConfiguration.getNoradCatID(), f5709x, satelliteRadioConfiguration.getDownlinkFreq(), f5710y, satelliteRadioConfiguration.getUplinkFreq(), f5711z, satelliteRadioConfiguration.getDownlinkSubAudio(), A, satelliteRadioConfiguration.getUplinkSubAudio(), i11, i11 != 0 ? this.f5712s.convertToDatabaseValue(downlinkMod).intValue() : 0, 0, 0.0f, 0, 0.0d);
        int i12 = satelliteRadioConfiguration.getUplinkMod() != null ? C : 0;
        long j10 = this.f17335b;
        long id2 = satelliteRadioConfiguration.getId();
        long jIntValue = i12 != 0 ? this.f5713t.convertToDatabaseValue(r1).intValue() : 0L;
        int i13 = D;
        long bandwidth = satelliteRadioConfiguration.getBandwidth();
        long j11 = 0;
        long j12 = jIntValue;
        int i14 = E;
        if (satelliteRadioConfiguration.getIsCreatedByUser()) {
            j11 = 1;
        }
        long jCollect004000 = Cursor.collect004000(j10, id2, 2, i12, j12, i13, bandwidth, i14, j11, 0, 0L);
        satelliteRadioConfiguration.o(jCollect004000);
        return jCollect004000;
    }
}
