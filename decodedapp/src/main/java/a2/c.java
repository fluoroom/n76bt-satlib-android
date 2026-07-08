package a2;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessagePack;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ImmutableStringValue;
import org.msgpack.value.ValueFactory;
import rd.m;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f165a = new c();

    private c() {
    }

    public final byte[] a(Object obj) throws IllegalAccessException, IOException {
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

    public final byte[] b(Object obj) throws IllegalAccessException, IOException {
        String str;
        m.e(obj, "obj");
        Field[] fields = obj.getClass().getFields();
        MessageBufferPacker messageBufferPackerNewDefaultBufferPacker = MessagePack.newDefaultBufferPacker();
        ValueFactory.MapBuilder mapBuilderNewMapBuilder = ValueFactory.newMapBuilder();
        m.b(fields);
        for (Field field : fields) {
            if (!Modifier.isFinal(field.getModifiers()) && !Modifier.isStatic(field.getModifiers())) {
                Class<?> type = field.getType();
                ImmutableStringValue immutableStringValueNewString = ValueFactory.newString(field.getName());
                if (m.a(type, Long.TYPE)) {
                    long j10 = field.getLong(obj);
                    if (j10 != 0) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newInteger(j10));
                    }
                } else if (m.a(type, Integer.TYPE)) {
                    int i10 = field.getInt(obj);
                    if (i10 != 0) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newInteger(i10));
                    }
                } else if (m.a(type, Short.TYPE)) {
                    short s10 = field.getShort(obj);
                    if (s10 != 0) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newInteger(s10));
                    }
                } else if (m.a(type, Character.TYPE)) {
                    char c10 = field.getChar(obj);
                    if (c10 != 0) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newInteger((short) c10));
                    }
                } else if (m.a(type, Byte.TYPE)) {
                    byte b10 = field.getByte(obj);
                    if (b10 != 0) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newInteger(b10));
                    }
                } else if (m.a(type, Boolean.TYPE)) {
                    boolean z10 = field.getBoolean(obj);
                    if (z10) {
                        mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newBoolean(z10));
                    }
                } else if (m.a(type, String.class) && (str = (String) field.get(obj)) != null) {
                    mapBuilderNewMapBuilder.put(immutableStringValueNewString, ValueFactory.newString(str));
                }
            }
        }
        messageBufferPackerNewDefaultBufferPacker.packValue(mapBuilderNewMapBuilder.build());
        byte[] byteArray = messageBufferPackerNewDefaultBufferPacker.toByteArray();
        m.d(byteArray, "toByteArray(...)");
        return byteArray;
    }

    public final Object c(byte[] bArr, int i10, int i11, Class cls) throws IllegalAccessException, InstantiationException, IOException, InvocationTargetException {
        m.e(bArr, "contents");
        m.e(cls, "type");
        MessageUnpacker messageUnpackerNewDefaultUnpacker = MessagePack.newDefaultUnpacker(bArr, i10, i11);
        Object objNewInstance = cls.getConstructor(null).newInstance(null);
        int iUnpackMapHeader = messageUnpackerNewDefaultUnpacker.unpackMapHeader();
        while (true) {
            int i12 = iUnpackMapHeader - 1;
            if (iUnpackMapHeader <= 0) {
                return objNewInstance;
            }
            try {
                Field field = cls.getField(messageUnpackerNewDefaultUnpacker.unpackString());
                if (field == null || Modifier.isFinal(field.getModifiers()) || Modifier.isStatic(field.getModifiers())) {
                    messageUnpackerNewDefaultUnpacker.unpackValue();
                } else {
                    Class<?> type = field.getType();
                    if (m.a(type, Long.TYPE) || m.a(type, Long.class)) {
                        field.setLong(objNewInstance, messageUnpackerNewDefaultUnpacker.unpackLong());
                    } else if (m.a(type, Integer.TYPE) || m.a(type, Integer.class)) {
                        field.setInt(objNewInstance, messageUnpackerNewDefaultUnpacker.unpackInt());
                    } else if (m.a(type, Short.TYPE) || m.a(type, Short.class)) {
                        field.setShort(objNewInstance, messageUnpackerNewDefaultUnpacker.unpackShort());
                    } else if (m.a(type, Character.TYPE) || m.a(type, Character.class)) {
                        field.setChar(objNewInstance, (char) messageUnpackerNewDefaultUnpacker.unpackShort());
                    } else if (m.a(type, Byte.TYPE) || m.a(type, Byte.class)) {
                        field.setByte(objNewInstance, messageUnpackerNewDefaultUnpacker.unpackByte());
                    } else if (m.a(type, Boolean.TYPE) || m.a(type, Boolean.class)) {
                        field.setBoolean(objNewInstance, messageUnpackerNewDefaultUnpacker.unpackBoolean());
                    } else if (m.a(type, Float.TYPE) || m.a(type, Float.class)) {
                        field.set(objNewInstance, Float.valueOf(messageUnpackerNewDefaultUnpacker.unpackFloat()));
                    } else if (m.a(type, Double.TYPE) || m.a(type, Double.class)) {
                        field.set(objNewInstance, Double.valueOf(messageUnpackerNewDefaultUnpacker.unpackDouble()));
                    } else {
                        if (!m.a(type, String.class)) {
                            messageUnpackerNewDefaultUnpacker.unpackValue();
                            throw new RuntimeException("Unsupported type:" + field.getType().getName());
                        }
                        field.set(objNewInstance, messageUnpackerNewDefaultUnpacker.unpackString());
                    }
                }
            } catch (NoSuchFieldException unused) {
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            iUnpackMapHeader = i12;
        }
    }
}
