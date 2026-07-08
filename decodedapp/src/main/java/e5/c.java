package e5;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import org.msgpack.value.ImmutableStringValue;
import org.msgpack.value.ValueFactory;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final byte[] a(Object obj) throws IllegalAccessException, IOException {
        Double d10;
        m.e(obj, "obj");
        Field[] fields = obj.getClass().getFields();
        MessageBufferPacker messageBufferPackerNewDefaultBufferPacker = MessagePack.newDefaultBufferPacker();
        ValueFactory.MapBuilder mapBuilderNewMapBuilder = ValueFactory.newMapBuilder();
        m.b(fields);
        for (Field field : fields) {
            if (!Modifier.isFinal(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                Class<?> type = field.getType();
                ImmutableStringValue immutableStringValueNewString = ValueFactory.newString(field.getName());
                if (m.a(type, Long.class) || m.a(type, Long.TYPE)) {
                    long j10 = field.getLong(obj);
                    if (j10 != 0) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newInteger(j10));
                    }
                } else if (m.a(type, Integer.class) || m.a(type, Integer.TYPE)) {
                    int i10 = field.getInt(obj);
                    if (i10 != 0) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newInteger(i10));
                    }
                } else if (m.a(type, Short.class) || m.a(type, Short.TYPE)) {
                    short s10 = field.getShort(obj);
                    if (s10 != 0) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newInteger(s10));
                    }
                } else if (m.a(type, Character.class) || m.a(type, Character.TYPE)) {
                    char c10 = field.getChar(obj);
                    if (c10 != 0) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newInteger((short) c10));
                    }
                } else if (m.a(type, Byte.class) || m.a(type, Byte.TYPE)) {
                    byte b10 = field.getByte(obj);
                    if (b10 != 0) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newInteger(b10));
                    }
                } else if (m.a(type, Boolean.class) || m.a(type, Boolean.TYPE)) {
                    boolean z10 = field.getBoolean(obj);
                    if (z10) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newBoolean(z10));
                    }
                } else if (m.a(type, String.class)) {
                    String str = (String) field.get(obj);
                    if (str != null) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newString(str));
                    }
                } else if (m.a(type, Float.class) || m.a(type, Float.TYPE)) {
                    Float f10 = (Float) field.get(obj);
                    if (f10 != null) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newFloat(f10.floatValue()));
                    }
                } else if ((m.a(type, Double.class) || m.a(type, Double.TYPE)) && (d10 = (Double) field.get(obj)) != null) {
                    mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newFloat(d10.doubleValue()));
                }
            }
        }
        messageBufferPackerNewDefaultBufferPacker.packValue(mapBuilderNewMapBuilder.build());
        byte[] byteArray = messageBufferPackerNewDefaultBufferPacker.toByteArray();
        m.d(byteArray, "toByteArray(...)");
        return byteArray;
    }
}
