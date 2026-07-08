package com.facebook.stetho.common;

import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public class Util {
    public static void awaitUninterruptibly(CountDownLatch countDownLatch) {
        while (true) {
            try {
                countDownLatch.await();
                return;
            } catch (InterruptedException unused) {
            }
        }
    }

    public static void close(Closeable closeable, boolean z10) throws IOException {
        if (closeable != null) {
            if (!z10) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (IOException e10) {
                LogUtil.e(e10, "Hiding IOException because another is pending");
            }
        }
    }

    public static void copy(InputStream inputStream, OutputStream outputStream, byte[] bArr) throws IOException {
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                return;
            } else {
                outputStream.write(bArr, 0, i10);
            }
        }
    }

    public static <T> T getUninterruptibly(Future<T> future, long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        long millis = timeUnit.toMillis(j10);
        while (true) {
            try {
                return future.get(millis, TimeUnit.MILLISECONDS);
            } catch (InterruptedException unused) {
                millis -= System.currentTimeMillis() - System.currentTimeMillis();
            }
        }
    }

    public static void joinUninterruptibly(Thread thread) {
        while (true) {
            try {
                thread.join();
                return;
            } catch (InterruptedException unused) {
            }
        }
    }

    public static String readAsUTF8(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        copy(inputStream, byteArrayOutputStream, new byte[WXMediaMessage.DESCRIPTION_LENGTH_LIMIT]);
        return byteArrayOutputStream.toString(Utf8Charset.NAME);
    }

    public static void sleepUninterruptibly(long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        do {
            try {
                Thread.sleep(j10);
                return;
            } catch (InterruptedException unused) {
                j10 -= System.currentTimeMillis() - jCurrentTimeMillis;
            }
        } while (j10 > 0);
    }

    public static void throwIf(boolean z10) {
        if (z10) {
            throw new IllegalStateException();
        }
    }

    public static void throwIfNot(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    public static void throwIfNotNull(Object obj) {
        if (obj != null) {
            throw new IllegalStateException();
        }
    }

    public static <T> T throwIfNull(T t10) {
        t10.getClass();
        return t10;
    }

    public static void throwIfNot(boolean z10, String str, Object... objArr) {
        if (!z10) {
            throw new IllegalStateException(String.format(str, objArr));
        }
    }

    public static <T1, T2> void throwIfNull(T1 t12, T2 t22) {
        throwIfNull(t12);
        throwIfNull(t22);
    }

    public static <T1, T2, T3> void throwIfNull(T1 t12, T2 t22, T3 t32) {
        throwIfNull(t12);
        throwIfNull(t22);
        throwIfNull(t32);
    }

    public static <T> T getUninterruptibly(Future<T> future) throws ExecutionException {
        while (true) {
            try {
                return future.get();
            } catch (InterruptedException unused) {
            }
        }
    }
}
