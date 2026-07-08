package com.dw.ht.entitys;

import com.dw.ht.entitys.b;
import io.objectbox.BoxStore;
import io.objectbox.Cursor;
import io.objectbox.Transaction;

/* JADX INFO: loaded from: classes.dex */
public final class FactorySettingsCursor extends Cursor<FactorySettings> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final b.a f5661s = b.f5729c;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f5662t = b.f5732f.f17384c;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f5663u = b.f5733g.f17384c;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f5664v = b.f5734h.f17384c;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f5665w = b.f5735r.f17384c;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f5666x = b.f5736s.f17384c;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f5667y = b.f5737t.f17384c;

    static final class a implements cc.b {
        a() {
        }

        @Override // cc.b
        public Cursor a(Transaction transaction, long j10, BoxStore boxStore) {
            return new FactorySettingsCursor(transaction, j10, boxStore);
        }
    }

    public FactorySettingsCursor(Transaction transaction, long j10, BoxStore boxStore) {
        super(transaction, j10, b.f5730d, boxStore);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public long n(FactorySettings factorySettings) {
        return f5661s.a(factorySettings);
    }

    @Override // io.objectbox.Cursor
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public long w(FactorySettings factorySettings) {
        String name = factorySettings.getName();
        int i10 = name != null ? f5662t : 0;
        byte[] settings = factorySettings.getSettings();
        int i11 = settings != null ? f5664v : 0;
        byte[] iba = factorySettings.getIba();
        int i12 = iba != null ? f5665w : 0;
        byte[] vco = factorySettings.getVco();
        Cursor.collect430000(this.f17335b, 0L, 1, i10, name, 0, null, 0, null, 0, null, i11, settings, i12, iba, vco != null ? f5666x : 0, vco);
        byte[] settings2 = factorySettings.getSettings2();
        long jCollect313311 = Cursor.collect313311(this.f17335b, factorySettings.getId(), 2, 0, null, 0, null, 0, null, settings2 != null ? f5667y : 0, settings2, f5663u, factorySettings.getFreqRangeCount(), 0, 0L, 0, 0L, 0, 0, 0, 0, 0, 0, 0, 0.0f, 0, 0.0d);
        factorySettings.setId(jCollect313311);
        return jCollect313311;
    }
}
