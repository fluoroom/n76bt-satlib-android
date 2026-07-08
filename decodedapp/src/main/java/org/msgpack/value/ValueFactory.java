package org.msgpack.value;

import j$.time.Instant;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.msgpack.value.impl.ImmutableArrayValueImpl;
import org.msgpack.value.impl.ImmutableBigIntegerValueImpl;
import org.msgpack.value.impl.ImmutableBinaryValueImpl;
import org.msgpack.value.impl.ImmutableBooleanValueImpl;
import org.msgpack.value.impl.ImmutableDoubleValueImpl;
import org.msgpack.value.impl.ImmutableExtensionValueImpl;
import org.msgpack.value.impl.ImmutableLongValueImpl;
import org.msgpack.value.impl.ImmutableMapValueImpl;
import org.msgpack.value.impl.ImmutableNilValueImpl;
import org.msgpack.value.impl.ImmutableStringValueImpl;
import org.msgpack.value.impl.ImmutableTimestampValueImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class ValueFactory {

    public static class MapBuilder {
        private final Map<Value, Value> map = new LinkedHashMap();

        public MapValue build() {
            return ValueFactory.newMap(this.map);
        }

        public MapBuilder put(Map.Entry<? extends Value, ? extends Value> entry) {
            put(entry.getKey(), entry.getValue());
            return this;
        }

        public MapBuilder putAll(Iterable<? extends Map.Entry<? extends Value, ? extends Value>> iterable) {
            for (Map.Entry<? extends Value, ? extends Value> entry : iterable) {
                put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public MapBuilder put(Value value, Value value2) {
            this.map.put(value, value2);
            return this;
        }

        public MapBuilder putAll(Map<? extends Value, ? extends Value> map) {
            Iterator<Map.Entry<? extends Value, ? extends Value>> it = map.entrySet().iterator();
            while (it.hasNext()) {
                put(it.next());
            }
            return this;
        }
    }

    private ValueFactory() {
    }

    public static ImmutableArrayValue emptyArray() {
        return ImmutableArrayValueImpl.empty();
    }

    public static ImmutableMapValue emptyMap() {
        return ImmutableMapValueImpl.empty();
    }

    public static ImmutableArrayValue newArray(List<? extends Value> list) {
        return list.isEmpty() ? ImmutableArrayValueImpl.empty() : new ImmutableArrayValueImpl((Value[]) list.toArray(new Value[list.size()]));
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr) {
        return newBinary(bArr, false);
    }

    public static ImmutableBooleanValue newBoolean(boolean z10) {
        return z10 ? ImmutableBooleanValueImpl.TRUE : ImmutableBooleanValueImpl.FALSE;
    }

    public static ImmutableExtensionValue newExtension(byte b10, byte[] bArr) {
        return new ImmutableExtensionValueImpl(b10, bArr);
    }

    public static ImmutableFloatValue newFloat(float f10) {
        return new ImmutableDoubleValueImpl(f10);
    }

    public static ImmutableIntegerValue newInteger(byte b10) {
        return new ImmutableLongValueImpl(b10);
    }

    public static <K extends Value, V extends Value> ImmutableMapValue newMap(Map<K, V> map) {
        Value[] valueArr = new Value[map.size() * 2];
        int i10 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            valueArr[i10] = entry.getKey();
            valueArr[i10 + 1] = entry.getValue();
            i10 += 2;
        }
        return new ImmutableMapValueImpl(valueArr);
    }

    public static MapBuilder newMapBuilder() {
        return new MapBuilder();
    }

    public static Map.Entry<Value, Value> newMapEntry(Value value, Value value2) {
        return new AbstractMap.SimpleEntry(value, value2);
    }

    public static ImmutableNilValue newNil() {
        return ImmutableNilValueImpl.get();
    }

    public static ImmutableStringValue newString(String str) {
        return new ImmutableStringValueImpl(str);
    }

    public static ImmutableTimestampValue newTimestamp(Instant instant) {
        return new ImmutableTimestampValueImpl(instant);
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr, boolean z10) {
        return z10 ? new ImmutableBinaryValueImpl(bArr) : new ImmutableBinaryValueImpl(Arrays.copyOf(bArr, bArr.length));
    }

    public static ImmutableFloatValue newFloat(double d10) {
        return new ImmutableDoubleValueImpl(d10);
    }

    public static ImmutableIntegerValue newInteger(short s10) {
        return new ImmutableLongValueImpl(s10);
    }

    public static ImmutableStringValue newString(byte[] bArr) {
        return new ImmutableStringValueImpl(bArr);
    }

    public static ImmutableTimestampValue newTimestamp(long j10) {
        return newTimestamp(Instant.ofEpochMilli(j10));
    }

    public static ImmutableIntegerValue newInteger(int i10) {
        return new ImmutableLongValueImpl(i10);
    }

    public static ImmutableStringValue newString(byte[] bArr, boolean z10) {
        if (z10) {
            return new ImmutableStringValueImpl(bArr);
        }
        return new ImmutableStringValueImpl(Arrays.copyOf(bArr, bArr.length));
    }

    public static ImmutableTimestampValue newTimestamp(long j10, int i10) {
        return newTimestamp(Instant.ofEpochSecond(j10, i10));
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr, int i10, int i11) {
        return newBinary(bArr, i10, i11, false);
    }

    public static ImmutableIntegerValue newInteger(long j10) {
        return new ImmutableLongValueImpl(j10);
    }

    public static ImmutableArrayValue newArray(Value... valueArr) {
        if (valueArr.length == 0) {
            return ImmutableArrayValueImpl.empty();
        }
        return new ImmutableArrayValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static ImmutableBinaryValue newBinary(byte[] bArr, int i10, int i11, boolean z10) {
        if (z10 && i10 == 0 && i11 == bArr.length) {
            return new ImmutableBinaryValueImpl(bArr);
        }
        return new ImmutableBinaryValueImpl(Arrays.copyOfRange(bArr, i10, i11));
    }

    public static ImmutableIntegerValue newInteger(BigInteger bigInteger) {
        return new ImmutableBigIntegerValueImpl(bigInteger);
    }

    public static ImmutableStringValue newString(byte[] bArr, int i10, int i11) {
        return newString(bArr, i10, i11, false);
    }

    public static ImmutableMapValue newMap(Value... valueArr) {
        if (valueArr.length == 0) {
            return ImmutableMapValueImpl.empty();
        }
        return new ImmutableMapValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static ImmutableStringValue newString(byte[] bArr, int i10, int i11, boolean z10) {
        if (z10 && i10 == 0 && i11 == bArr.length) {
            return new ImmutableStringValueImpl(bArr);
        }
        return new ImmutableStringValueImpl(Arrays.copyOfRange(bArr, i10, i11));
    }

    public static ImmutableArrayValue newArray(Value[] valueArr, boolean z10) {
        if (valueArr.length == 0) {
            return ImmutableArrayValueImpl.empty();
        }
        if (z10) {
            return new ImmutableArrayValueImpl(valueArr);
        }
        return new ImmutableArrayValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    public static ImmutableMapValue newMap(Value[] valueArr, boolean z10) {
        if (valueArr.length == 0) {
            return ImmutableMapValueImpl.empty();
        }
        if (z10) {
            return new ImmutableMapValueImpl(valueArr);
        }
        return new ImmutableMapValueImpl((Value[]) Arrays.copyOf(valueArr, valueArr.length));
    }

    @SafeVarargs
    public static MapValue newMap(Map.Entry<? extends Value, ? extends Value>... entryArr) {
        Value[] valueArr = new Value[entryArr.length * 2];
        for (int i10 = 0; i10 < entryArr.length; i10++) {
            int i11 = i10 * 2;
            valueArr[i11] = entryArr[i10].getKey();
            valueArr[i11 + 1] = entryArr[i10].getValue();
        }
        return newMap(valueArr, true);
    }
}
