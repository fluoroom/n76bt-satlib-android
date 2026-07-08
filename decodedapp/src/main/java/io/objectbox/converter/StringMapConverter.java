package io.objectbox.converter;

import bc.a;
import bc.c;
import bc.d;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class StringMapConverter implements PropertyConverter<Map<String, String>, byte[]> {
    private static final AtomicReference<d> cachedBuilder = new AtomicReference<>();

    @Override // io.objectbox.converter.PropertyConverter
    public byte[] convertToDatabaseValue(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        d andSet = cachedBuilder.getAndSet(null);
        if (andSet == null) {
            andSet = new d(new a(WXMediaMessage.TITLE_LENGTH_LIMIT), 3);
        }
        int iZ = andSet.z();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() == null || entry.getValue() == null) {
                throw new IllegalArgumentException("Map keys or values must not be null");
            }
            andSet.y(entry.getKey(), entry.getValue());
        }
        andSet.f(null, iZ);
        ByteBuffer byteBufferH = andSet.h();
        byte[] bArr = new byte[byteBufferH.limit()];
        byteBufferH.get(bArr);
        if (byteBufferH.limit() <= 262144) {
            andSet.c();
            cachedBuilder.getAndSet(andSet);
        }
        return bArr;
    }

    @Override // io.objectbox.converter.PropertyConverter
    public Map<String, String> convertToEntityProperty(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        c.e eVarH = c.g(new a(bArr, bArr.length)).h();
        int iB = eVarH.b();
        c.d dVarF = eVarH.f();
        c.k kVarG = eVarH.g();
        HashMap map = new HashMap((int) ((((double) iB) / 0.75d) + 1.0d));
        for (int i10 = 0; i10 < iB; i10++) {
            map.put(dVarF.a(i10).toString(), kVarG.d(i10).i());
        }
        return map;
    }
}
