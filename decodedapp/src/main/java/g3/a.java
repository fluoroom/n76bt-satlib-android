package g3;

import h3.a;
import java.util.Locale;
import org.msgpack.core.MessagePack;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: g3.a$a, reason: collision with other inner class name */
    public enum EnumC0194a {
        START,
        RSSI_LOW_THRESHOLD,
        RSSI_HIGH_THRESHOLD,
        BATTERY_LOW_THRESHOLD,
        BATTERY_HIGH_THRESHOLD,
        DEVICE_STATE_CHANGED,
        PIO_CHANGED,
        DEBUG_MESSAGE,
        BATTERY_CHARGED,
        CHARGER_CONNECTION,
        CAPSENSE_UPDATE,
        USER_ACTION,
        SPEECH_RECOGNITION,
        AV_COMMAND,
        REMOTE_BATTERY_LEVEL,
        KEY,
        DFU_STATE,
        UART_RECEIVED_DATA,
        VMU_PACKET;

        private static final EnumC0194a[] C = values();

        public static EnumC0194a d(int i10) {
            if (i10 < 0) {
                return null;
            }
            EnumC0194a[] enumC0194aArr = C;
            if (i10 >= enumC0194aArr.length) {
                return null;
            }
            return enumC0194aArr[i10];
        }
    }

    public enum b {
        SUCCESS,
        NOT_SUPPORTED,
        NOT_AUTHENTICATED,
        INSUFFICIENT_RESOURCES,
        AUTHENTICATING,
        INVALID_PARAMETER,
        INCORRECT_STATE,
        IN_PROGRESS;


        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final b[] f13448r = values();

        public static b d(int i10) {
            if (i10 < 0) {
                return null;
            }
            b[] bVarArr = f13448r;
            if (i10 >= bVarArr.length) {
                return null;
            }
            return bVarArr[i10];
        }
    }

    public static byte[] a(int i10, int i11) {
        return b(i10, i11, null);
    }

    public static byte[] b(int i10, int i11, byte[] bArr) {
        return c(i10, i11, bArr, (byte) 0);
    }

    public static byte[] c(int i10, int i11, byte[] bArr, byte b10) {
        return e(i10, i11, bArr, bArr == null ? 0 : bArr.length, b10);
    }

    public static byte[] d(int i10, int i11, byte[] bArr, int i12) {
        return e(i10, i11, bArr, i12, (byte) 0);
    }

    public static byte[] e(int i10, int i11, byte[] bArr, int i12, byte b10) throws h3.a {
        int i13;
        if (i12 > 254) {
            throw new h3.a(a.EnumC0211a.ILLEGAL_ARGUMENTS_PAYLOAD_LENGTH_TOO_LONG);
        }
        int i14 = 0;
        int i15 = (b10 & 1) != 0 ? 1 : 0;
        int i16 = i12 + 8 + i15;
        byte[] bArr2 = new byte[i16];
        bArr2[0] = -1;
        bArr2[1] = 1;
        bArr2[2] = b10;
        bArr2[3] = (byte) i12;
        bArr2[4] = (byte) (i10 >> 8);
        bArr2[5] = (byte) i10;
        bArr2[6] = (byte) (i11 >> 8);
        bArr2[7] = (byte) i11;
        for (int i17 = 0; i17 < i12; i17++) {
            bArr2[i17 + 8] = bArr[i17];
        }
        if (i15 != 0) {
            byte b11 = 0;
            while (true) {
                i13 = i16 - 1;
                if (i14 >= i13) {
                    break;
                }
                b11 = (byte) (b11 ^ bArr2[i14]);
                i14++;
            }
            bArr2[i13] = b11;
        }
        return bArr2;
    }

    public static String f(byte b10) {
        return String.format(Locale.ENGLISH, "%02X", Integer.valueOf(b10 & MessagePack.Code.EXT_TIMESTAMP));
    }

    public static String g(int i10) {
        return String.format(Locale.ENGLISH, "%04X", Integer.valueOf(i10 & 65535));
    }
}
