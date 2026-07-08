package org.msgpack.core.buffer;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.AccessController;
import java.security.PrivilegedAction;
import sun.misc.Unsafe;
import sun.nio.ch.DirectBuffer;

/* JADX INFO: loaded from: classes3.dex */
class DirectBufferAccess {
    static Constructor<?> byteBufferConstructor;
    static DirectBufferConstructorType directBufferConstructorType;
    static Class<?> directByteBufferClass;
    static Method mClean;
    static Method mCleaner;
    static Method mInvokeCleaner;
    static Method memoryBlockWrapFromJni;

    /* JADX INFO: renamed from: org.msgpack.core.buffer.DirectBufferAccess$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType;

        static {
            int[] iArr = new int[DirectBufferConstructorType.values().length];
            $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType = iArr;
            try {
                iArr[DirectBufferConstructorType.ARGS_LONG_LONG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[DirectBufferConstructorType.ARGS_LONG_INT_REF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[DirectBufferConstructorType.ARGS_LONG_INT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[DirectBufferConstructorType.ARGS_INT_INT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[DirectBufferConstructorType.ARGS_MB_INT_INT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    enum DirectBufferConstructorType {
        ARGS_LONG_LONG,
        ARGS_LONG_INT_REF,
        ARGS_LONG_INT,
        ARGS_INT_INT,
        ARGS_MB_INT_INT
    }

    static {
        Method declaredMethod;
        Constructor<?> declaredConstructor;
        DirectBufferConstructorType directBufferConstructorType2;
        Constructor<?> declaredConstructor2;
        Class<?> cls = Integer.TYPE;
        Class<?> cls2 = Long.TYPE;
        try {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(1);
            Class<?> cls3 = byteBufferAllocateDirect.getClass();
            directByteBufferClass = cls3;
            try {
                declaredConstructor = cls3.getDeclaredConstructor(cls2, cls2);
                directBufferConstructorType2 = DirectBufferConstructorType.ARGS_LONG_LONG;
                declaredMethod = null;
            } catch (NoSuchMethodException unused) {
                try {
                    try {
                        try {
                            declaredConstructor2 = directByteBufferClass.getDeclaredConstructor(cls2, cls, Object.class);
                            directBufferConstructorType2 = DirectBufferConstructorType.ARGS_LONG_INT_REF;
                        } catch (NoSuchMethodException unused2) {
                            declaredConstructor2 = directByteBufferClass.getDeclaredConstructor(cls2, cls);
                            directBufferConstructorType2 = DirectBufferConstructorType.ARGS_LONG_INT;
                        }
                    } catch (NoSuchMethodException unused3) {
                        Class<?> cls4 = Class.forName("java.nio.MemoryBlock");
                        declaredMethod = cls4.getDeclaredMethod("wrapFromJni", cls, cls2);
                        declaredMethod.setAccessible(true);
                        declaredConstructor = directByteBufferClass.getDeclaredConstructor(cls4, cls, cls);
                        directBufferConstructorType2 = DirectBufferConstructorType.ARGS_MB_INT_INT;
                    }
                } catch (NoSuchMethodException unused4) {
                    declaredConstructor2 = directByteBufferClass.getDeclaredConstructor(cls, cls);
                    directBufferConstructorType2 = DirectBufferConstructorType.ARGS_INT_INT;
                }
                declaredMethod = null;
                declaredConstructor = declaredConstructor2;
            }
            byteBufferConstructor = declaredConstructor;
            directBufferConstructorType = directBufferConstructorType2;
            memoryBlockWrapFromJni = declaredMethod;
            if (declaredConstructor == null) {
                throw new RuntimeException("Constructor of DirectByteBuffer is not found");
            }
            try {
                declaredConstructor.setAccessible(true);
            } catch (RuntimeException e10) {
                if (!"java.lang.reflect.InaccessibleObjectException".equals(e10.getClass().getName())) {
                    throw e10;
                }
                byteBufferConstructor = null;
            }
            if (MessageBuffer.javaVersion <= 8) {
                setupCleanerJava6(byteBufferAllocateDirect);
            } else {
                setupCleanerJava9(byteBufferAllocateDirect);
            }
        } catch (Exception e11) {
            throw new RuntimeException(e11);
        }
    }

    private DirectBufferAccess() {
    }

    static void clean(Object obj) {
        try {
            if (MessageBuffer.javaVersion <= 8) {
                mClean.invoke(mCleaner.invoke(obj, null), null);
            } else {
                mInvokeCleaner.invoke(MessageBuffer.unsafe, obj);
            }
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    static long getAddress(Buffer buffer) {
        return ((DirectBuffer) buffer).address();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getCleanMethod(ByteBuffer byteBuffer, Method method) {
        try {
            Method declaredMethod = method.getReturnType().getDeclaredMethod("clean", null);
            Object objInvoke = method.invoke(byteBuffer, null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(objInvoke, null);
            return declaredMethod;
        } catch (IllegalAccessException e10) {
            return e10;
        } catch (NoSuchMethodException e11) {
            return e11;
        } catch (InvocationTargetException e12) {
            return e12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getCleanerMethod(ByteBuffer byteBuffer) {
        try {
            Method declaredMethod = byteBuffer.getClass().getDeclaredMethod("cleaner", null);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(byteBuffer, null);
            return declaredMethod;
        } catch (IllegalAccessException e10) {
            return e10;
        } catch (NoSuchMethodException e11) {
            return e11;
        } catch (InvocationTargetException e12) {
            return e12;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object getInvokeCleanerMethod(ByteBuffer byteBuffer) {
        try {
            Unsafe unsafe = MessageBuffer.unsafe;
            Method declaredMethod = unsafe.getClass().getDeclaredMethod("invokeCleaner", ByteBuffer.class);
            declaredMethod.invoke(unsafe, byteBuffer);
            return declaredMethod;
        } catch (IllegalAccessException e10) {
            return e10;
        } catch (NoSuchMethodException e11) {
            return e11;
        } catch (InvocationTargetException e12) {
            return e12;
        }
    }

    static boolean isDirectByteBufferInstance(Object obj) {
        return directByteBufferClass.isInstance(obj);
    }

    static ByteBuffer newByteBuffer(long j10, int i10, int i11, ByteBuffer byteBuffer) {
        if (byteBufferConstructor == null) {
            throw new IllegalStateException("Can't create a new DirectByteBuffer. In JDK17+, two JVM options needs to be set: --add-opens=java.base/java.nio=ALL-UNNAMED and --add-opens=java.base/sun.nio.ch=ALL-UNNAMED");
        }
        try {
            int i12 = AnonymousClass4.$SwitchMap$org$msgpack$core$buffer$DirectBufferAccess$DirectBufferConstructorType[directBufferConstructorType.ordinal()];
            if (i12 == 1) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Long.valueOf(j10 + ((long) i10)), Long.valueOf(i11));
            }
            if (i12 == 2) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Long.valueOf(j10 + ((long) i10)), Integer.valueOf(i11), byteBuffer);
            }
            if (i12 == 3) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Long.valueOf(j10 + ((long) i10)), Integer.valueOf(i11));
            }
            if (i12 == 4) {
                return (ByteBuffer) byteBufferConstructor.newInstance(Integer.valueOf(((int) j10) + i10), Integer.valueOf(i11));
            }
            if (i12 == 5) {
                return (ByteBuffer) byteBufferConstructor.newInstance(memoryBlockWrapFromJni.invoke(null, Long.valueOf(j10 + ((long) i10)), Integer.valueOf(i11)), Integer.valueOf(i11), 0);
            }
            throw new IllegalStateException("Unexpected value");
        } catch (Throwable th2) {
            throw new RuntimeException(th2);
        }
    }

    private static void setupCleanerJava6(final ByteBuffer byteBuffer) {
        Object objDoPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.msgpack.core.buffer.DirectBufferAccess.1
            @Override // java.security.PrivilegedAction
            public Object run() {
                return DirectBufferAccess.getCleanerMethod(byteBuffer);
            }
        });
        if (objDoPrivileged instanceof Throwable) {
            throw new RuntimeException((Throwable) objDoPrivileged);
        }
        mCleaner = (Method) objDoPrivileged;
        Object objDoPrivileged2 = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.msgpack.core.buffer.DirectBufferAccess.2
            @Override // java.security.PrivilegedAction
            public Object run() {
                return DirectBufferAccess.getCleanMethod(byteBuffer, DirectBufferAccess.mCleaner);
            }
        });
        if (objDoPrivileged2 instanceof Throwable) {
            throw new RuntimeException((Throwable) objDoPrivileged2);
        }
        mClean = (Method) objDoPrivileged2;
    }

    private static void setupCleanerJava9(final ByteBuffer byteBuffer) {
        Object objDoPrivileged = AccessController.doPrivileged(new PrivilegedAction<Object>() { // from class: org.msgpack.core.buffer.DirectBufferAccess.3
            @Override // java.security.PrivilegedAction
            public Object run() {
                return DirectBufferAccess.getInvokeCleanerMethod(byteBuffer);
            }
        });
        if (objDoPrivileged instanceof Throwable) {
            throw new RuntimeException((Throwable) objDoPrivileged);
        }
        mInvokeCleaner = (Method) objDoPrivileged;
    }
}
