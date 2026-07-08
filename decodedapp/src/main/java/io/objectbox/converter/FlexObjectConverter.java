package io.objectbox.converter;

import bc.a;
import bc.c;
import bc.d;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class FlexObjectConverter implements PropertyConverter<Object, byte[]> {
    private static final AtomicReference<d> cachedBuilder = new AtomicReference<>();

    private void addMap(d dVar, String str, Map<Object, Object> map) {
        int iZ = dVar.z();
        for (Map.Entry<Object, Object> entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (key == null) {
                throw new IllegalArgumentException("Map keys must not be null");
            }
            checkMapKeyType(key);
            String string = key.toString();
            if (value == null) {
                dVar.w(string);
            } else if (value instanceof Map) {
                addMap(dVar, string, (Map) value);
            } else if (value instanceof List) {
                addVector(dVar, string, (List) value);
            } else if (value instanceof String) {
                dVar.y(string, (String) value);
            } else if (value instanceof Boolean) {
                dVar.k(string, ((Boolean) value).booleanValue());
            } else if (value instanceof Byte) {
                dVar.s(string, ((Byte) value).intValue());
            } else if (value instanceof Short) {
                dVar.s(string, ((Short) value).intValue());
            } else if (value instanceof Integer) {
                dVar.s(string, ((Integer) value).intValue());
            } else if (value instanceof Long) {
                dVar.t(string, ((Long) value).longValue());
            } else if (value instanceof Float) {
                dVar.p(string, ((Float) value).floatValue());
            } else if (value instanceof Double) {
                dVar.o(string, ((Double) value).doubleValue());
            } else {
                if (!(value instanceof byte[])) {
                    throw new IllegalArgumentException("Map values of this type are not supported: " + value.getClass().getSimpleName());
                }
                dVar.i(string, (byte[]) value);
            }
        }
        dVar.f(str, iZ);
    }

    private void addValue(d dVar, Object obj) {
        if (obj instanceof Map) {
            addMap(dVar, null, (Map) obj);
            return;
        }
        if (obj instanceof List) {
            addVector(dVar, null, (List) obj);
            return;
        }
        if (obj instanceof String) {
            dVar.x((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            dVar.l(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Byte) {
            dVar.q(((Byte) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            dVar.q(((Short) obj).intValue());
            return;
        }
        if (obj instanceof Integer) {
            dVar.q(((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            dVar.r(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Float) {
            dVar.n(((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            dVar.m(((Double) obj).doubleValue());
        } else {
            if (obj instanceof byte[]) {
                dVar.j((byte[]) obj);
                return;
            }
            throw new IllegalArgumentException("Values of this type are not supported: " + obj.getClass().getSimpleName());
        }
    }

    private void addVector(d dVar, String str, List<Object> list) {
        int iA = dVar.A();
        for (Object obj : list) {
            if (obj == null) {
                dVar.v();
            } else if (obj instanceof Map) {
                addMap(dVar, null, (Map) obj);
            } else if (obj instanceof List) {
                addVector(dVar, null, (List) obj);
            } else if (obj instanceof String) {
                dVar.x((String) obj);
            } else if (obj instanceof Boolean) {
                dVar.l(((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                dVar.q(((Byte) obj).intValue());
            } else if (obj instanceof Short) {
                dVar.q(((Short) obj).intValue());
            } else if (obj instanceof Integer) {
                dVar.q(((Integer) obj).intValue());
            } else if (obj instanceof Long) {
                dVar.r(((Long) obj).longValue());
            } else if (obj instanceof Float) {
                dVar.n(((Float) obj).floatValue());
            } else if (obj instanceof Double) {
                dVar.m(((Double) obj).doubleValue());
            } else {
                if (!(obj instanceof byte[])) {
                    throw new IllegalArgumentException("List values of this type are not supported: " + obj.getClass().getSimpleName());
                }
                dVar.j((byte[]) obj);
            }
        }
        dVar.g(str, iA, false, false);
    }

    private List<Object> buildList(c.k kVar) {
        int iB = kVar.b();
        ArrayList arrayList = new ArrayList(iB);
        Boolean boolValueOf = null;
        for (int i10 = 0; i10 < iB; i10++) {
            c.g gVarD = kVar.d(i10);
            if (gVarD.s()) {
                arrayList.add(null);
            } else if (gVarD.r()) {
                arrayList.add(buildMap(gVarD.h()));
            } else if (gVarD.u()) {
                arrayList.add(buildList(gVarD.k()));
            } else if (gVarD.t()) {
                arrayList.add(gVarD.i());
            } else if (gVarD.n()) {
                arrayList.add(Boolean.valueOf(gVarD.c()));
            } else if (gVarD.p()) {
                if (boolValueOf == null) {
                    boolValueOf = Boolean.valueOf(shouldRestoreAsLong(gVarD));
                }
                if (boolValueOf.booleanValue()) {
                    arrayList.add(Long.valueOf(gVarD.g()));
                } else {
                    arrayList.add(Integer.valueOf(gVarD.e()));
                }
            } else if (gVarD.o()) {
                arrayList.add(Double.valueOf(gVarD.d()));
            } else {
                if (!gVarD.m()) {
                    throw new IllegalArgumentException("List values of this type are not supported: " + gVarD.getClass().getSimpleName());
                }
                arrayList.add(gVarD.b().d());
            }
        }
        return arrayList;
    }

    private Map<Object, Object> buildMap(c.e eVar) {
        int iB = eVar.b();
        c.d dVarF = eVar.f();
        c.k kVarG = eVar.g();
        HashMap map = new HashMap((int) ((((double) iB) / 0.75d) + 1.0d));
        for (int i10 = 0; i10 < iB; i10++) {
            Object objConvertToKey = convertToKey(dVarF.a(i10).toString());
            c.g gVarD = kVarG.d(i10);
            if (gVarD.s()) {
                map.put(objConvertToKey, null);
            } else if (gVarD.r()) {
                map.put(objConvertToKey, buildMap(gVarD.h()));
            } else if (gVarD.u()) {
                map.put(objConvertToKey, buildList(gVarD.k()));
            } else if (gVarD.t()) {
                map.put(objConvertToKey, gVarD.i());
            } else if (gVarD.n()) {
                map.put(objConvertToKey, Boolean.valueOf(gVarD.c()));
            } else if (gVarD.p()) {
                if (shouldRestoreAsLong(gVarD)) {
                    map.put(objConvertToKey, Long.valueOf(gVarD.g()));
                } else {
                    map.put(objConvertToKey, Integer.valueOf(gVarD.e()));
                }
            } else if (gVarD.o()) {
                map.put(objConvertToKey, Double.valueOf(gVarD.d()));
            } else {
                if (!gVarD.m()) {
                    throw new IllegalArgumentException("Map values of this type are not supported: " + gVarD.getClass().getSimpleName());
                }
                map.put(objConvertToKey, gVarD.b().d());
            }
        }
        return map;
    }

    protected void checkMapKeyType(Object obj) {
        if (!(obj instanceof String)) {
            throw new IllegalArgumentException("Map keys must be String");
        }
    }

    Object convertToKey(String str) {
        return str;
    }

    protected boolean shouldRestoreAsLong(c.g gVar) {
        try {
            Field declaredField = gVar.getClass().getDeclaredField("parentWidth");
            declaredField.setAccessible(true);
            return ((Integer) declaredField.get(gVar)).intValue() == 8;
        } catch (Exception e10) {
            throw new RuntimeException("FlexMapConverter could not determine FlexBuffers integer bit width.", e10);
        }
    }

    @Override // io.objectbox.converter.PropertyConverter
    public byte[] convertToDatabaseValue(Object obj) {
        if (obj == null) {
            return null;
        }
        AtomicReference<d> atomicReference = cachedBuilder;
        d andSet = atomicReference.getAndSet(null);
        if (andSet == null) {
            andSet = new d(new a(WXMediaMessage.TITLE_LENGTH_LIMIT), 3);
        }
        addValue(andSet, obj);
        ByteBuffer byteBufferH = andSet.h();
        byte[] bArr = new byte[byteBufferH.limit()];
        byteBufferH.get(bArr);
        if (byteBufferH.limit() <= 262144) {
            andSet.c();
            atomicReference.getAndSet(andSet);
        }
        return bArr;
    }

    @Override // io.objectbox.converter.PropertyConverter
    public Object convertToEntityProperty(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        c.g gVarG = c.g(new a(bArr, bArr.length));
        if (gVarG.s()) {
            return null;
        }
        if (gVarG.r()) {
            return buildMap(gVarG.h());
        }
        if (gVarG.u()) {
            return buildList(gVarG.k());
        }
        if (gVarG.t()) {
            return gVarG.i();
        }
        if (gVarG.n()) {
            return Boolean.valueOf(gVarG.c());
        }
        if (gVarG.p()) {
            return shouldRestoreAsLong(gVarG) ? Long.valueOf(gVarG.g()) : Integer.valueOf(gVarG.e());
        }
        if (gVarG.o()) {
            return Double.valueOf(gVarG.d());
        }
        if (gVarG.m()) {
            return gVarG.b().d();
        }
        throw new IllegalArgumentException("FlexBuffers type is not supported: " + gVarG.l());
    }
}
